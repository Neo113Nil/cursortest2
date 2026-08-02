package androidx.media3.extractor.text.cea;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.text.cea.CeaDecoder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.ng$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Cea708Decoder extends CeaDecoder {
    public final CueInfoBuilder[] cueInfoBuilders;
    public List cues;
    public CueInfoBuilder currentCueInfoBuilder;
    public VorbisBitArray currentDtvCcPacket;
    public int currentWindow;
    public List lastCues;
    public final int selectedServiceNumber;
    public final ParsableByteArray ccData = new ParsableByteArray();
    public final VorbisBitArray captionChannelPacketData = new VorbisBitArray();
    public int previousSequenceNumber = -1;

    public final class Cea708CueInfo {
        public static final ng$$ExternalSyntheticLambda0 LEAST_IMPORTANT_FIRST = new ng$$ExternalSyntheticLambda0(17);
        public final Cue cue;
        public final int priority;

        public Cea708CueInfo(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
            this.cue = new Cue(spannableStringBuilder, alignment, null, null, f, 0, i, f2, i2, PKIFailureInfo.systemUnavail, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z, z ? i3 : -16777216, PKIFailureInfo.systemUnavail, RecyclerView.DECELERATION_RATE, 0);
            this.priority = i4;
        }
    }

    public final class CueInfoBuilder {
        public static final int COLOR_SOLID_BLACK;
        public static final int COLOR_SOLID_WHITE = getArgbColorFromCeaColor(2, 2, 2, 0);
        public static final int[] PEN_STYLE_BACKGROUND;
        public static final int[] PEN_STYLE_EDGE_TYPE;
        public static final int[] PEN_STYLE_FONT_STYLE;
        public static final int[] WINDOW_STYLE_FILL;
        public static final int[] WINDOW_STYLE_JUSTIFICATION;
        public static final int[] WINDOW_STYLE_PRINT_DIRECTION;
        public static final int[] WINDOW_STYLE_SCROLL_DIRECTION;
        public static final boolean[] WINDOW_STYLE_WORD_WRAP;
        public int anchorId;
        public int backgroundColor;
        public int backgroundColorStartPosition;
        public boolean defined;
        public int foregroundColor;
        public int foregroundColorStartPosition;
        public int horizontalAnchor;
        public int italicsStartPosition;
        public int justification;
        public int penStyleId;
        public int priority;
        public boolean relativePositioning;
        public int row;
        public int rowCount;
        public int underlineStartPosition;
        public int verticalAnchor;
        public boolean visible;
        public int windowFillColor;
        public int windowStyleId;
        public final ArrayList rolledUpCaptions = new ArrayList();
        public final SpannableStringBuilder captionStringBuilder = new SpannableStringBuilder();

        static {
            int argbColorFromCeaColor = getArgbColorFromCeaColor(0, 0, 0, 0);
            COLOR_SOLID_BLACK = argbColorFromCeaColor;
            int argbColorFromCeaColor2 = getArgbColorFromCeaColor(0, 0, 0, 3);
            WINDOW_STYLE_JUSTIFICATION = new int[]{0, 0, 0, 0, 0, 2, 0};
            WINDOW_STYLE_PRINT_DIRECTION = new int[]{0, 0, 0, 0, 0, 0, 2};
            WINDOW_STYLE_SCROLL_DIRECTION = new int[]{3, 3, 3, 3, 3, 3, 1};
            WINDOW_STYLE_WORD_WRAP = new boolean[]{false, false, false, true, true, true, false};
            WINDOW_STYLE_FILL = new int[]{argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor};
            PEN_STYLE_FONT_STYLE = new int[]{0, 1, 2, 3, 4, 3, 4};
            PEN_STYLE_EDGE_TYPE = new int[]{0, 0, 0, 0, 0, 3, 3};
            PEN_STYLE_BACKGROUND = new int[]{argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor2};
        }

        public CueInfoBuilder() {
            reset();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getArgbColorFromCeaColor(int i, int i2, int i3, int i4) {
            int i5;
            Trace.checkElementIndex(i, 4);
            Trace.checkElementIndex(i2, 4);
            Trace.checkElementIndex(i3, 4);
            Trace.checkElementIndex(i4, 4);
            if (i4 != 0 && i4 != 1) {
                if (i4 == 2) {
                    i5 = 127;
                } else if (i4 == 3) {
                    i5 = 0;
                }
                return Color.argb(i5, i <= 1 ? 255 : 0, i2 <= 1 ? 255 : 0, i3 > 1 ? 255 : 0);
            }
            i5 = 255;
            return Color.argb(i5, i <= 1 ? 255 : 0, i2 <= 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        }

        public final void append(char c) {
            SpannableStringBuilder spannableStringBuilder = this.captionStringBuilder;
            if (c != '\n') {
                spannableStringBuilder.append(c);
                return;
            }
            SpannableString buildSpannableString = buildSpannableString();
            ArrayList arrayList = this.rolledUpCaptions;
            arrayList.add(buildSpannableString);
            spannableStringBuilder.clear();
            if (this.italicsStartPosition != -1) {
                this.italicsStartPosition = 0;
            }
            if (this.underlineStartPosition != -1) {
                this.underlineStartPosition = 0;
            }
            if (this.foregroundColorStartPosition != -1) {
                this.foregroundColorStartPosition = 0;
            }
            if (this.backgroundColorStartPosition != -1) {
                this.backgroundColorStartPosition = 0;
            }
            while (true) {
                if (arrayList.size() < this.rowCount && arrayList.size() < 15) {
                    this.row = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        }

        public final SpannableString buildSpannableString() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.italicsStartPosition != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.italicsStartPosition, length, 33);
                }
                if (this.underlineStartPosition != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.underlineStartPosition, length, 33);
                }
                if (this.foregroundColorStartPosition != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), this.foregroundColorStartPosition, length, 33);
                }
                if (this.backgroundColorStartPosition != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), this.backgroundColorStartPosition, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void reset() {
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.clear();
            this.italicsStartPosition = -1;
            this.underlineStartPosition = -1;
            this.foregroundColorStartPosition = -1;
            this.backgroundColorStartPosition = -1;
            this.row = 0;
            this.defined = false;
            this.visible = false;
            this.priority = 4;
            this.relativePositioning = false;
            this.verticalAnchor = 0;
            this.horizontalAnchor = 0;
            this.anchorId = 0;
            this.rowCount = 15;
            this.justification = 0;
            this.windowStyleId = 0;
            this.penStyleId = 0;
            int i = COLOR_SOLID_BLACK;
            this.windowFillColor = i;
            this.foregroundColor = COLOR_SOLID_WHITE;
            this.backgroundColor = i;
        }

        public final void setPenAttributes(boolean z, boolean z2) {
            int i = this.italicsStartPosition;
            SpannableStringBuilder spannableStringBuilder = this.captionStringBuilder;
            if (i != -1) {
                if (!z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.italicsStartPosition, spannableStringBuilder.length(), 33);
                    this.italicsStartPosition = -1;
                }
            } else if (z) {
                this.italicsStartPosition = spannableStringBuilder.length();
            }
            if (this.underlineStartPosition == -1) {
                if (z2) {
                    this.underlineStartPosition = spannableStringBuilder.length();
                }
            } else {
                if (z2) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.underlineStartPosition, spannableStringBuilder.length(), 33);
                this.underlineStartPosition = -1;
            }
        }

        public final void setPenColor(int i, int i2) {
            int i3 = this.foregroundColorStartPosition;
            SpannableStringBuilder spannableStringBuilder = this.captionStringBuilder;
            if (i3 != -1 && this.foregroundColor != i) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), this.foregroundColorStartPosition, spannableStringBuilder.length(), 33);
            }
            if (i != COLOR_SOLID_WHITE) {
                this.foregroundColorStartPosition = spannableStringBuilder.length();
                this.foregroundColor = i;
            }
            if (this.backgroundColorStartPosition != -1 && this.backgroundColor != i2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), this.backgroundColorStartPosition, spannableStringBuilder.length(), 33);
            }
            if (i2 != COLOR_SOLID_BLACK) {
                this.backgroundColorStartPosition = spannableStringBuilder.length();
                this.backgroundColor = i2;
            }
        }
    }

    public Cea708Decoder(int i, List list) {
        this.selectedServiceNumber = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = CodecSpecificDataUtil.NAL_START_CODE;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.cueInfoBuilders = new CueInfoBuilder[8];
        int i2 = 0;
        while (true) {
            CueInfoBuilder[] cueInfoBuilderArr = this.cueInfoBuilders;
            if (i2 >= 8) {
                this.currentCueInfoBuilder = cueInfoBuilderArr[0];
                return;
            } else {
                cueInfoBuilderArr[i2] = new CueInfoBuilder();
                i2++;
            }
        }
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public final Toolbar.AnonymousClass1 createSubtitle() {
        List list = this.cues;
        this.lastCues = list;
        list.getClass();
        return new Toolbar.AnonymousClass1(list);
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public final void decode(CeaDecoder.CeaInputBuffer ceaInputBuffer) {
        ByteBuffer byteBuffer = ceaInputBuffer.data;
        byteBuffer.getClass();
        byte[] array2 = byteBuffer.array();
        int limit = byteBuffer.limit();
        ParsableByteArray parsableByteArray = this.ccData;
        parsableByteArray.reset(limit, array2);
        while (parsableByteArray.bytesLeft() >= 3) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int i = readUnsignedByte & 3;
            boolean z = (readUnsignedByte & 4) == 4;
            byte readUnsignedByte2 = (byte) parsableByteArray.readUnsignedByte();
            byte readUnsignedByte3 = (byte) parsableByteArray.readUnsignedByte();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        finalizeCurrentPacket();
                        int i2 = (readUnsignedByte2 & 192) >> 6;
                        int i3 = this.previousSequenceNumber;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            resetCueBuilders$1();
                            Log.w("Cea708Decoder", "Sequence number discontinuity. previous=" + this.previousSequenceNumber + " current=" + i2);
                        }
                        this.previousSequenceNumber = i2;
                        int i4 = readUnsignedByte2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        VorbisBitArray vorbisBitArray = new VorbisBitArray(i2, i4);
                        this.currentDtvCcPacket = vorbisBitArray;
                        byte[] bArr = vorbisBitArray.data;
                        vorbisBitArray.bitOffset = 1;
                        bArr[0] = readUnsignedByte3;
                    } else {
                        Trace.checkArgument(i == 2);
                        VorbisBitArray vorbisBitArray2 = this.currentDtvCcPacket;
                        if (vorbisBitArray2 == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = vorbisBitArray2.data;
                            int i5 = vorbisBitArray2.bitOffset;
                            int i6 = i5 + 1;
                            vorbisBitArray2.bitOffset = i6;
                            bArr2[i5] = readUnsignedByte2;
                            vorbisBitArray2.bitOffset = i5 + 2;
                            bArr2[i6] = readUnsignedByte3;
                        }
                    }
                    VorbisBitArray vorbisBitArray3 = this.currentDtvCcPacket;
                    if (vorbisBitArray3.bitOffset == (vorbisBitArray3.byteOffset * 2) - 1) {
                        finalizeCurrentPacket();
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void finalizeCurrentPacket() {
        char c;
        int i;
        boolean z;
        VorbisBitArray vorbisBitArray = this.currentDtvCcPacket;
        if (vorbisBitArray == null) {
            return;
        }
        int i2 = 2;
        if (vorbisBitArray.bitOffset != (vorbisBitArray.byteOffset * 2) - 1) {
            Log.d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.currentDtvCcPacket.byteOffset * 2) - 1) + ", but current index is " + this.currentDtvCcPacket.bitOffset + " (sequence number " + this.currentDtvCcPacket.byteLimit + ");");
        }
        VorbisBitArray vorbisBitArray2 = this.currentDtvCcPacket;
        byte[] bArr = vorbisBitArray2.data;
        int i3 = vorbisBitArray2.bitOffset;
        VorbisBitArray vorbisBitArray3 = this.captionChannelPacketData;
        vorbisBitArray3.reset(i3, bArr);
        boolean z2 = false;
        while (true) {
            if (vorbisBitArray3.bitsLeft() > 0) {
                int i4 = 3;
                int readBits = vorbisBitArray3.readBits(3);
                int readBits2 = vorbisBitArray3.readBits(5);
                if (readBits == 7) {
                    vorbisBitArray3.skipBits(i2);
                    readBits = vorbisBitArray3.readBits(6);
                    if (readBits < 7) {
                        Fragment$5$$ExternalSyntheticOutline0.m(readBits, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (readBits2 == 0) {
                    if (readBits != 0) {
                        Log.w("Cea708Decoder", "serviceNumber is non-zero (" + readBits + ") when blockSize is 0");
                    }
                } else if (readBits != this.selectedServiceNumber) {
                    vorbisBitArray3.skipBytes(readBits2);
                } else {
                    int position = (readBits2 * 8) + vorbisBitArray3.getPosition();
                    while (vorbisBitArray3.getPosition() < position) {
                        int readBits3 = vorbisBitArray3.readBits(8);
                        if (readBits3 != 16) {
                            if (readBits3 <= 31) {
                                if (readBits3 != 0) {
                                    if (readBits3 == i4) {
                                        this.cues = getDisplayCues$1();
                                    } else if (readBits3 != 8) {
                                        switch (readBits3) {
                                            case 12:
                                                resetCueBuilders$1();
                                                break;
                                            case 13:
                                                this.currentCueInfoBuilder.append('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (readBits3 < 17 || readBits3 > 23) {
                                                    if (readBits3 < 24 || readBits3 > 31) {
                                                        Fragment$5$$ExternalSyntheticOutline0.m(readBits3, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        Log.w("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + readBits3);
                                                        vorbisBitArray3.skipBits(16);
                                                        break;
                                                    }
                                                } else {
                                                    Log.w("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + readBits3);
                                                    vorbisBitArray3.skipBits(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.currentCueInfoBuilder.captionStringBuilder;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i = i2;
                            } else if (readBits3 <= 127) {
                                CueInfoBuilder cueInfoBuilder = this.currentCueInfoBuilder;
                                if (readBits3 == 127) {
                                    cueInfoBuilder.append((char) 9835);
                                } else {
                                    cueInfoBuilder.append((char) (readBits3 & 255));
                                }
                                i = i2;
                                z2 = true;
                            } else {
                                if (readBits3 <= 159) {
                                    CueInfoBuilder[] cueInfoBuilderArr = this.cueInfoBuilders;
                                    switch (readBits3) {
                                        case 128:
                                        case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                                        case 131:
                                        case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                                            z = true;
                                            int i5 = readBits3 - 128;
                                            if (this.currentWindow != i5) {
                                                this.currentWindow = i5;
                                                this.currentCueInfoBuilder = cueInfoBuilderArr[i5];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z = true;
                                            for (int i6 = 1; i6 <= 8; i6++) {
                                                if (vorbisBitArray3.readBit()) {
                                                    CueInfoBuilder cueInfoBuilder2 = cueInfoBuilderArr[8 - i6];
                                                    cueInfoBuilder2.rolledUpCaptions.clear();
                                                    cueInfoBuilder2.captionStringBuilder.clear();
                                                    cueInfoBuilder2.italicsStartPosition = -1;
                                                    cueInfoBuilder2.underlineStartPosition = -1;
                                                    cueInfoBuilder2.foregroundColorStartPosition = -1;
                                                    cueInfoBuilder2.backgroundColorStartPosition = -1;
                                                    cueInfoBuilder2.row = 0;
                                                }
                                            }
                                            break;
                                        case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                                            for (int i7 = 1; i7 <= 8; i7++) {
                                                if (vorbisBitArray3.readBit()) {
                                                    cueInfoBuilderArr[8 - i7].visible = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (vorbisBitArray3.readBit()) {
                                                    cueInfoBuilderArr[8 - i8].visible = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (vorbisBitArray3.readBit()) {
                                                    cueInfoBuilderArr[8 - i9].visible = !r1.visible;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (vorbisBitArray3.readBit()) {
                                                    cueInfoBuilderArr[8 - i10].reset();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                                            vorbisBitArray3.skipBits(8);
                                            z = true;
                                            break;
                                        case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                                            z = true;
                                            break;
                                        case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                                            resetCueBuilders$1();
                                            z = true;
                                            break;
                                        case 144:
                                            int i11 = i2;
                                            if (!this.currentCueInfoBuilder.defined) {
                                                vorbisBitArray3.skipBits(16);
                                                z = true;
                                                i4 = 3;
                                                break;
                                            } else {
                                                vorbisBitArray3.readBits(4);
                                                vorbisBitArray3.readBits(i11);
                                                vorbisBitArray3.readBits(i11);
                                                boolean readBit = vorbisBitArray3.readBit();
                                                boolean readBit2 = vorbisBitArray3.readBit();
                                                i4 = 3;
                                                vorbisBitArray3.readBits(3);
                                                vorbisBitArray3.readBits(3);
                                                this.currentCueInfoBuilder.setPenAttributes(readBit, readBit2);
                                                z = true;
                                            }
                                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                                            if (this.currentCueInfoBuilder.defined) {
                                                int argbColorFromCeaColor = CueInfoBuilder.getArgbColorFromCeaColor(vorbisBitArray3.readBits(2), vorbisBitArray3.readBits(2), vorbisBitArray3.readBits(2), vorbisBitArray3.readBits(2));
                                                int argbColorFromCeaColor2 = CueInfoBuilder.getArgbColorFromCeaColor(vorbisBitArray3.readBits(2), vorbisBitArray3.readBits(2), vorbisBitArray3.readBits(2), vorbisBitArray3.readBits(2));
                                                vorbisBitArray3.skipBits(2);
                                                CueInfoBuilder.getArgbColorFromCeaColor(vorbisBitArray3.readBits(2), vorbisBitArray3.readBits(2), vorbisBitArray3.readBits(2), 0);
                                                this.currentCueInfoBuilder.setPenColor(argbColorFromCeaColor, argbColorFromCeaColor2);
                                            } else {
                                                vorbisBitArray3.skipBits(24);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                                            if (this.currentCueInfoBuilder.defined) {
                                                vorbisBitArray3.skipBits(4);
                                                int readBits4 = vorbisBitArray3.readBits(4);
                                                vorbisBitArray3.skipBits(2);
                                                vorbisBitArray3.readBits(6);
                                                CueInfoBuilder cueInfoBuilder3 = this.currentCueInfoBuilder;
                                                if (cueInfoBuilder3.row != readBits4) {
                                                    cueInfoBuilder3.append('\n');
                                                }
                                                cueInfoBuilder3.row = readBits4;
                                            } else {
                                                vorbisBitArray3.skipBits(16);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 147:
                                        case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                                        case 150:
                                        default:
                                            Fragment$5$$ExternalSyntheticOutline0.m(readBits3, "Invalid C1 command: ", "Cea708Decoder");
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.currentCueInfoBuilder.defined) {
                                                int argbColorFromCeaColor3 = CueInfoBuilder.getArgbColorFromCeaColor(vorbisBitArray3.readBits(2), vorbisBitArray3.readBits(2), vorbisBitArray3.readBits(2), vorbisBitArray3.readBits(2));
                                                vorbisBitArray3.readBits(2);
                                                CueInfoBuilder.getArgbColorFromCeaColor(vorbisBitArray3.readBits(2), vorbisBitArray3.readBits(2), vorbisBitArray3.readBits(2), 0);
                                                vorbisBitArray3.readBit();
                                                vorbisBitArray3.readBit();
                                                vorbisBitArray3.readBits(2);
                                                vorbisBitArray3.readBits(2);
                                                int readBits5 = vorbisBitArray3.readBits(2);
                                                vorbisBitArray3.skipBits(8);
                                                CueInfoBuilder cueInfoBuilder4 = this.currentCueInfoBuilder;
                                                cueInfoBuilder4.windowFillColor = argbColorFromCeaColor3;
                                                cueInfoBuilder4.justification = readBits5;
                                            } else {
                                                vorbisBitArray3.skipBits(32);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                                        case 153:
                                        case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                                            int i12 = readBits3 - 152;
                                            CueInfoBuilder cueInfoBuilder5 = cueInfoBuilderArr[i12];
                                            vorbisBitArray3.skipBits(i2);
                                            boolean readBit3 = vorbisBitArray3.readBit();
                                            vorbisBitArray3.skipBits(i2);
                                            int readBits6 = vorbisBitArray3.readBits(i4);
                                            boolean readBit4 = vorbisBitArray3.readBit();
                                            int readBits7 = vorbisBitArray3.readBits(7);
                                            int readBits8 = vorbisBitArray3.readBits(8);
                                            int readBits9 = vorbisBitArray3.readBits(4);
                                            int readBits10 = vorbisBitArray3.readBits(4);
                                            vorbisBitArray3.skipBits(i2);
                                            vorbisBitArray3.skipBits(6);
                                            vorbisBitArray3.skipBits(i2);
                                            int readBits11 = vorbisBitArray3.readBits(3);
                                            int readBits12 = vorbisBitArray3.readBits(3);
                                            ArrayList arrayList = cueInfoBuilder5.rolledUpCaptions;
                                            cueInfoBuilder5.defined = true;
                                            cueInfoBuilder5.visible = readBit3;
                                            cueInfoBuilder5.priority = readBits6;
                                            cueInfoBuilder5.relativePositioning = readBit4;
                                            cueInfoBuilder5.verticalAnchor = readBits7;
                                            cueInfoBuilder5.horizontalAnchor = readBits8;
                                            cueInfoBuilder5.anchorId = readBits9;
                                            int i13 = readBits10 + 1;
                                            if (cueInfoBuilder5.rowCount != i13) {
                                                cueInfoBuilder5.rowCount = i13;
                                                while (true) {
                                                    if (arrayList.size() >= cueInfoBuilder5.rowCount || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (readBits11 != 0 && cueInfoBuilder5.windowStyleId != readBits11) {
                                                cueInfoBuilder5.windowStyleId = readBits11;
                                                int i14 = readBits11 - 1;
                                                int i15 = CueInfoBuilder.WINDOW_STYLE_FILL[i14];
                                                boolean z3 = CueInfoBuilder.WINDOW_STYLE_WORD_WRAP[i14];
                                                int i16 = CueInfoBuilder.WINDOW_STYLE_PRINT_DIRECTION[i14];
                                                int i17 = CueInfoBuilder.WINDOW_STYLE_SCROLL_DIRECTION[i14];
                                                int i18 = CueInfoBuilder.WINDOW_STYLE_JUSTIFICATION[i14];
                                                cueInfoBuilder5.windowFillColor = i15;
                                                cueInfoBuilder5.justification = i18;
                                            }
                                            if (readBits12 != 0 && cueInfoBuilder5.penStyleId != readBits12) {
                                                cueInfoBuilder5.penStyleId = readBits12;
                                                int i19 = readBits12 - 1;
                                                int i20 = CueInfoBuilder.PEN_STYLE_EDGE_TYPE[i19];
                                                int i21 = CueInfoBuilder.PEN_STYLE_FONT_STYLE[i19];
                                                cueInfoBuilder5.setPenAttributes(false, false);
                                                cueInfoBuilder5.setPenColor(CueInfoBuilder.COLOR_SOLID_WHITE, CueInfoBuilder.PEN_STYLE_BACKGROUND[i19]);
                                            }
                                            if (this.currentWindow != i12) {
                                                this.currentWindow = i12;
                                                this.currentCueInfoBuilder = cueInfoBuilderArr[i12];
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                    }
                                } else {
                                    z = true;
                                    if (readBits3 <= 255) {
                                        this.currentCueInfoBuilder.append((char) (readBits3 & 255));
                                    } else {
                                        Fragment$5$$ExternalSyntheticOutline0.m(readBits3, "Invalid base command: ", "Cea708Decoder");
                                        i = 2;
                                        c = 7;
                                    }
                                }
                                z2 = z;
                                i = 2;
                                c = 7;
                            }
                            c = 7;
                        } else {
                            int readBits13 = vorbisBitArray3.readBits(8);
                            if (readBits13 <= 31) {
                                c = 7;
                                if (readBits13 > 7) {
                                    if (readBits13 <= 15) {
                                        vorbisBitArray3.skipBits(8);
                                    } else if (readBits13 <= 23) {
                                        vorbisBitArray3.skipBits(16);
                                    } else if (readBits13 <= 31) {
                                        vorbisBitArray3.skipBits(24);
                                    }
                                }
                            } else {
                                c = 7;
                                if (readBits13 <= 127) {
                                    if (readBits13 == 32) {
                                        this.currentCueInfoBuilder.append(' ');
                                    } else if (readBits13 == 33) {
                                        this.currentCueInfoBuilder.append((char) 160);
                                    } else if (readBits13 == 37) {
                                        this.currentCueInfoBuilder.append((char) 8230);
                                    } else if (readBits13 == 42) {
                                        this.currentCueInfoBuilder.append((char) 352);
                                    } else if (readBits13 == 44) {
                                        this.currentCueInfoBuilder.append((char) 338);
                                    } else if (readBits13 == 63) {
                                        this.currentCueInfoBuilder.append((char) 376);
                                    } else if (readBits13 == 57) {
                                        this.currentCueInfoBuilder.append((char) 8482);
                                    } else if (readBits13 == 58) {
                                        this.currentCueInfoBuilder.append((char) 353);
                                    } else if (readBits13 == 60) {
                                        this.currentCueInfoBuilder.append((char) 339);
                                    } else if (readBits13 != 61) {
                                        switch (readBits13) {
                                            case 48:
                                                this.currentCueInfoBuilder.append((char) 9608);
                                                break;
                                            case 49:
                                                this.currentCueInfoBuilder.append((char) 8216);
                                                break;
                                            case 50:
                                                this.currentCueInfoBuilder.append((char) 8217);
                                                break;
                                            case 51:
                                                this.currentCueInfoBuilder.append((char) 8220);
                                                break;
                                            case 52:
                                                this.currentCueInfoBuilder.append((char) 8221);
                                                break;
                                            case 53:
                                                this.currentCueInfoBuilder.append((char) 8226);
                                                break;
                                            default:
                                                switch (readBits13) {
                                                    case 118:
                                                        this.currentCueInfoBuilder.append((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.currentCueInfoBuilder.append((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.currentCueInfoBuilder.append((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.currentCueInfoBuilder.append((char) 8542);
                                                        break;
                                                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                                                        this.currentCueInfoBuilder.append((char) 9474);
                                                        break;
                                                    case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                                                        this.currentCueInfoBuilder.append((char) 9488);
                                                        break;
                                                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                                                        this.currentCueInfoBuilder.append((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.currentCueInfoBuilder.append((char) 9472);
                                                        break;
                                                    case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                                                        this.currentCueInfoBuilder.append((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.currentCueInfoBuilder.append((char) 9484);
                                                        break;
                                                    default:
                                                        Fragment$5$$ExternalSyntheticOutline0.m(readBits13, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.currentCueInfoBuilder.append((char) 8480);
                                    }
                                    i = 2;
                                    z2 = true;
                                } else if (readBits13 > 159) {
                                    i = 2;
                                    if (readBits13 <= 255) {
                                        if (readBits13 == 160) {
                                            this.currentCueInfoBuilder.append((char) 13252);
                                        } else {
                                            Fragment$5$$ExternalSyntheticOutline0.m(readBits13, "Invalid G3 character: ", "Cea708Decoder");
                                            this.currentCueInfoBuilder.append('_');
                                        }
                                        z2 = true;
                                    } else {
                                        Fragment$5$$ExternalSyntheticOutline0.m(readBits13, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (readBits13 <= 135) {
                                    vorbisBitArray3.skipBits(32);
                                } else if (readBits13 <= 143) {
                                    vorbisBitArray3.skipBits(40);
                                } else if (readBits13 <= 159) {
                                    i = 2;
                                    vorbisBitArray3.skipBits(2);
                                    vorbisBitArray3.skipBits(vorbisBitArray3.readBits(6) * 8);
                                }
                            }
                            i = 2;
                        }
                        i2 = i;
                    }
                }
            }
        }
        if (z2) {
            this.cues = getDisplayCues$1();
        }
        this.currentDtvCcPacket = null;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public final void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        this.currentWindow = 0;
        this.currentCueInfoBuilder = this.cueInfoBuilders[0];
        resetCueBuilders$1();
        this.currentDtvCcPacket = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List getDisplayCues$1() {
        Layout.Alignment alignment;
        boolean z;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            CueInfoBuilder[] cueInfoBuilderArr = this.cueInfoBuilders;
            CueInfoBuilder cueInfoBuilder = cueInfoBuilderArr[i];
            if (cueInfoBuilder.defined && (!cueInfoBuilder.rolledUpCaptions.isEmpty() || cueInfoBuilder.captionStringBuilder.length() != 0)) {
                CueInfoBuilder cueInfoBuilder2 = cueInfoBuilderArr[i];
                if (cueInfoBuilder2.visible) {
                    ArrayList arrayList2 = cueInfoBuilder2.rolledUpCaptions;
                    Cea708CueInfo cea708CueInfo = null;
                    if (cueInfoBuilder2.defined && (!arrayList2.isEmpty() || cueInfoBuilder2.captionStringBuilder.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) cueInfoBuilder2.buildSpannableString());
                        int i3 = cueInfoBuilder2.justification;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i3 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i3 != 3) {
                                a$$ExternalSyntheticBUOutline0.m(cueInfoBuilder2.justification, "Unexpected justification value: ");
                                return null;
                            }
                            Layout.Alignment alignment2 = alignment;
                            z = cueInfoBuilder2.relativePositioning;
                            int i4 = cueInfoBuilder2.horizontalAnchor;
                            int i5 = cueInfoBuilder2.verticalAnchor;
                            if (z) {
                                f = i4 / 209.0f;
                                f2 = i5 / 74.0f;
                            } else {
                                f = i4 / 99.0f;
                                f2 = i5 / 99.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i6 = cueInfoBuilder2.anchorId;
                            int i7 = i6 / 3;
                            int i8 = i7 != 0 ? 0 : i7 == 1 ? 1 : 2;
                            int i9 = i6 % 3;
                            int i10 = i9 != 0 ? 0 : i9 == 1 ? 1 : 2;
                            int i11 = cueInfoBuilder2.windowFillColor;
                            cea708CueInfo = new Cea708CueInfo(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 == CueInfoBuilder.COLOR_SOLID_BLACK, i11, cueInfoBuilder2.priority);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        z = cueInfoBuilder2.relativePositioning;
                        int i42 = cueInfoBuilder2.horizontalAnchor;
                        int i52 = cueInfoBuilder2.verticalAnchor;
                        if (z) {
                        }
                        float f32 = (f * 0.9f) + 0.05f;
                        float f42 = (f2 * 0.9f) + 0.05f;
                        int i62 = cueInfoBuilder2.anchorId;
                        int i72 = i62 / 3;
                        if (i72 != 0) {
                        }
                        int i92 = i62 % 3;
                        if (i92 != 0) {
                        }
                        int i112 = cueInfoBuilder2.windowFillColor;
                        cea708CueInfo = new Cea708CueInfo(spannableStringBuilder, alignment22, f42, i8, f32, i10, i112 == CueInfoBuilder.COLOR_SOLID_BLACK, i112, cueInfoBuilder2.priority);
                    }
                    if (cea708CueInfo != null) {
                        arrayList.add(cea708CueInfo);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, Cea708CueInfo.LEAST_IMPORTANT_FIRST);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((Cea708CueInfo) arrayList.get(i12)).cue);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public final boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    public final void resetCueBuilders$1() {
        for (int i = 0; i < 8; i++) {
            this.cueInfoBuilders[i].reset();
        }
    }
}
