package androidx.media3.extractor.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.text.SimpleSubtitleDecoder$1;
import androidx.media3.extractor.text.cea.CeaDecoder;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Cea608Decoder extends CeaDecoder {
    public int captionMode;
    public int captionRowCount;
    public List cues;
    public boolean isCaptionValid;
    public boolean isInCaptionService;
    public long lastCueUpdateUs;
    public List lastCues;
    public final int packetLength;
    public byte repeatableControlCc1;
    public byte repeatableControlCc2;
    public boolean repeatableControlSet;
    public final int selectedChannel;
    public final int selectedField;
    public static final int[] ROW_INDICES = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] COLUMN_INDICES = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] STYLE_COLORS = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] BASIC_CHARACTER_SET = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 93, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC0170g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 9632};
    public static final int[] SPECIAL_CHARACTER_SET = {EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 8482, EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, 9834, 224, 32, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE};
    public static final int[] SPECIAL_ES_FR_CHARACTER_SET = {EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, 211, EnumC0170g.SDK_ASSET_ICON_QUESTION_VALUE, EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 8216, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, 42, 39, 8212, EnumC0170g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 8480, 8226, 8220, 8221, 192, EnumC0170g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE, 200, EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE, 239, EnumC0170g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, EnumC0170g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE};
    public static final int[] SPECIAL_PT_DE_CHARACTER_SET = {EnumC0170g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC0170g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 125, 92, 94, 95, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC0170g.SDK_ASSET_ICON_PIN_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 165, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 9474, EnumC0170g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 9484, 9488, 9492, 9496};
    public static final boolean[] ODD_PARITY_BYTE_TABLE = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final ParsableByteArray ccData = new ParsableByteArray();
    public final ArrayList cueBuilders = new ArrayList();
    public CueBuilder currentCueBuilder = new CueBuilder(0, 4);
    public int currentChannel = 0;
    public final long validDataChannelTimeoutUs = 16000000;

    public final class CueBuilder {
        public int captionMode;
        public int captionRowCount;
        public final StringBuilder captionStringBuilder;
        public final ArrayList cueStyles;
        public int indent;
        public final ArrayList rolledUpCaptions;
        public int row;
        public int tabOffset;

        public final class CueStyle {
            public int start;
            public final int style;
            public final boolean underline;

            public CueStyle(int i, boolean z, int i2) {
                this.style = i;
                this.underline = z;
                this.start = i2;
            }
        }

        public CueBuilder(int i, int i2) {
            ArrayList arrayList = new ArrayList();
            this.cueStyles = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.rolledUpCaptions = arrayList2;
            StringBuilder sb = new StringBuilder();
            this.captionStringBuilder = sb;
            this.captionMode = i;
            arrayList.clear();
            arrayList2.clear();
            sb.setLength(0);
            this.row = 15;
            this.indent = 0;
            this.tabOffset = 0;
            this.captionRowCount = i2;
        }

        public final void append(char c) {
            StringBuilder sb = this.captionStringBuilder;
            if (sb.length() < 32) {
                sb.append(c);
            }
        }

        public final void backspace() {
            StringBuilder sb = this.captionStringBuilder;
            int length = sb.length();
            if (length > 0) {
                sb.delete(length - 1, length);
                ArrayList arrayList = this.cueStyles;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    CueStyle cueStyle = (CueStyle) arrayList.get(size);
                    int i = cueStyle.start;
                    if (i != length) {
                        return;
                    }
                    cueStyle.start = i - 1;
                }
            }
        }

        public final Cue build(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.rolledUpCaptions;
                if (i2 >= arrayList.size()) {
                    break;
                }
                spannableStringBuilder.append((CharSequence) arrayList.get(i2));
                spannableStringBuilder.append('\n');
                i2++;
            }
            spannableStringBuilder.append((CharSequence) buildCurrentLine());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.indent + this.tabOffset;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            int i5 = i;
            if (i5 == Integer.MIN_VALUE) {
                i5 = (this.captionMode != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.captionMode != 2 || i4 <= 0) ? 0 : 2 : 1;
            }
            if (i5 != 1) {
                if (i5 == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.row;
            if (i6 > 7) {
                i6 -= 17;
            } else if (this.captionMode == 1) {
                i6 -= this.captionRowCount - 1;
            }
            return new Cue(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i6, 1, PKIFailureInfo.systemUnavail, f, i5, PKIFailureInfo.systemUnavail, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, PKIFailureInfo.systemUnavail, RecyclerView.DECELERATION_RATE, 0);
        }

        public final SpannableString buildCurrentLine() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (true) {
                ArrayList arrayList = this.cueStyles;
                if (i5 >= arrayList.size()) {
                    break;
                }
                CueStyle cueStyle = (CueStyle) arrayList.get(i5);
                boolean z2 = cueStyle.underline;
                int i7 = cueStyle.style;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = Cea608Decoder.STYLE_COLORS[i7];
                    }
                    z = z3;
                }
                int i8 = cueStyle.start;
                i5++;
                if (i8 != (i5 < arrayList.size() ? ((CueStyle) arrayList.get(i5)).start : length)) {
                    if (i != -1 && !z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        if (i3 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                        }
                        i3 = i4;
                        i6 = i8;
                    }
                }
            }
            if (i != -1 && i != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (i2 != -1 && i2 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
            }
            if (i6 != length && i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final boolean isEmpty() {
            return this.cueStyles.isEmpty() && this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0;
        }
    }

    public Cea608Decoder(String str, int i) {
        this.packetLength = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.selectedChannel = 0;
            this.selectedField = 0;
        } else if (i == 2) {
            this.selectedChannel = 1;
            this.selectedField = 0;
        } else if (i == 3) {
            this.selectedChannel = 0;
            this.selectedField = 1;
        } else if (i != 4) {
            Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.selectedChannel = 0;
            this.selectedField = 0;
        } else {
            this.selectedChannel = 1;
            this.selectedField = 1;
        }
        setCaptionMode(0);
        resetCueBuilders();
        this.isInCaptionService = true;
        this.lastCueUpdateUs = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public final Toolbar.AnonymousClass1 createSubtitle() {
        List list = this.cues;
        this.lastCues = list;
        list.getClass();
        return new Toolbar.AnonymousClass1(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void decode(CeaDecoder.CeaInputBuffer ceaInputBuffer) {
        boolean z;
        ByteBuffer byteBuffer = ceaInputBuffer.data;
        byteBuffer.getClass();
        byte[] array2 = byteBuffer.array();
        int limit = byteBuffer.limit();
        ParsableByteArray parsableByteArray = this.ccData;
        parsableByteArray.reset(limit, array2);
        boolean z2 = false;
        while (true) {
            int bytesLeft = parsableByteArray.bytesLeft();
            int i = this.packetLength;
            if (bytesLeft < i) {
                if (z2) {
                    int i2 = this.captionMode;
                    if (i2 == 1 || i2 == 3) {
                        this.cues = getDisplayCues();
                        this.lastCueUpdateUs = this.playbackPositionUs;
                        return;
                    }
                    return;
                }
                return;
            }
            int readUnsignedByte = i == 2 ? -4 : parsableByteArray.readUnsignedByte();
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
            if ((readUnsignedByte & 2) == 0 && (readUnsignedByte & 1) == this.selectedField) {
                byte b = (byte) (readUnsignedByte2 & 127);
                byte b2 = (byte) (readUnsignedByte3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z3 = this.isCaptionValid;
                    if ((readUnsignedByte & 4) == 4) {
                        boolean[] zArr = ODD_PARITY_BYTE_TABLE;
                        if (zArr[readUnsignedByte2] && zArr[readUnsignedByte3]) {
                            z = true;
                            this.isCaptionValid = z;
                            if (z || (b & 240) != 16) {
                                this.repeatableControlSet = false;
                            } else if (this.repeatableControlSet && this.repeatableControlCc1 == b && this.repeatableControlCc2 == b2) {
                                this.repeatableControlSet = false;
                            } else {
                                this.repeatableControlSet = true;
                                this.repeatableControlCc1 = b;
                                this.repeatableControlCc2 = b2;
                            }
                            if (!z) {
                                if (1 <= b && b <= 15) {
                                    this.isInCaptionService = false;
                                } else if ((b & 246) == 20) {
                                    if (b2 != 32 && b2 != 47) {
                                        switch (b2) {
                                            default:
                                                switch (b2) {
                                                    case 42:
                                                    case 43:
                                                        this.isInCaptionService = false;
                                                        break;
                                                }
                                            case 37:
                                            case 38:
                                            case 39:
                                                this.isInCaptionService = true;
                                                break;
                                        }
                                    }
                                    this.isInCaptionService = true;
                                }
                                if (this.isInCaptionService) {
                                    int i3 = b & 224;
                                    if (i3 == 0) {
                                        this.currentChannel = (b >> 3) & 1;
                                    }
                                    if (this.currentChannel == this.selectedChannel) {
                                        if (i3 == 0) {
                                            int i4 = b & 247;
                                            if (i4 == 17 && (b2 & 240) == 48) {
                                                this.currentCueBuilder.append((char) SPECIAL_CHARACTER_SET[b2 & 15]);
                                            } else {
                                                int i5 = b & 246;
                                                if (i5 == 18 && (b2 & 224) == 32) {
                                                    this.currentCueBuilder.backspace();
                                                    this.currentCueBuilder.append((char) ((b & 1) == 0 ? SPECIAL_ES_FR_CHARACTER_SET[b2 & 31] : SPECIAL_PT_DE_CHARACTER_SET[b2 & 31]));
                                                } else if (i4 == 17 && (b2 & 240) == 32) {
                                                    this.currentCueBuilder.append(' ');
                                                    boolean z4 = (b2 & 1) == 1;
                                                    CueBuilder cueBuilder = this.currentCueBuilder;
                                                    cueBuilder.cueStyles.add(new CueBuilder.CueStyle((b2 >> 1) & 7, z4, cueBuilder.captionStringBuilder.length()));
                                                } else if ((b & 240) == 16 && (b2 & 192) == 64) {
                                                    int i6 = ROW_INDICES[b & 7];
                                                    if ((b2 & PnmConstants.PNM_SEPARATOR) != 0) {
                                                        i6++;
                                                    }
                                                    CueBuilder cueBuilder2 = this.currentCueBuilder;
                                                    if (i6 != cueBuilder2.row) {
                                                        if (this.captionMode != 1 && !cueBuilder2.isEmpty()) {
                                                            CueBuilder cueBuilder3 = new CueBuilder(this.captionMode, this.captionRowCount);
                                                            this.currentCueBuilder = cueBuilder3;
                                                            this.cueBuilders.add(cueBuilder3);
                                                        }
                                                        this.currentCueBuilder.row = i6;
                                                    }
                                                    boolean z5 = (b2 & 16) == 16;
                                                    boolean z6 = (b2 & 1) == 1;
                                                    int i7 = (b2 >> 1) & 7;
                                                    CueBuilder cueBuilder4 = this.currentCueBuilder;
                                                    cueBuilder4.cueStyles.add(new CueBuilder.CueStyle(z5 ? 8 : i7, z6, cueBuilder4.captionStringBuilder.length()));
                                                    if (z5) {
                                                        this.currentCueBuilder.indent = COLUMN_INDICES[i7];
                                                    }
                                                } else if (i4 == 23 && b2 >= 33 && b2 <= 35) {
                                                    this.currentCueBuilder.tabOffset = b2 - 32;
                                                } else if (i5 == 20 && (b2 & 240) == 32) {
                                                    if (b2 == 32) {
                                                        setCaptionMode(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                setCaptionMode(1);
                                                                this.captionRowCount = 2;
                                                                this.currentCueBuilder.captionRowCount = 2;
                                                                break;
                                                            case 38:
                                                                setCaptionMode(1);
                                                                this.captionRowCount = 3;
                                                                this.currentCueBuilder.captionRowCount = 3;
                                                                break;
                                                            case 39:
                                                                setCaptionMode(1);
                                                                this.captionRowCount = 4;
                                                                this.currentCueBuilder.captionRowCount = 4;
                                                                break;
                                                            default:
                                                                int i8 = this.captionMode;
                                                                if (i8 != 0) {
                                                                    if (b2 == 33) {
                                                                        this.currentCueBuilder.backspace();
                                                                        break;
                                                                    } else {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.cues = Collections.EMPTY_LIST;
                                                                                if (i8 == 1 || i8 == 3) {
                                                                                    resetCueBuilders();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (i8 == 1 && !this.currentCueBuilder.isEmpty()) {
                                                                                    CueBuilder cueBuilder5 = this.currentCueBuilder;
                                                                                    ArrayList arrayList = cueBuilder5.rolledUpCaptions;
                                                                                    arrayList.add(cueBuilder5.buildCurrentLine());
                                                                                    cueBuilder5.captionStringBuilder.setLength(0);
                                                                                    cueBuilder5.cueStyles.clear();
                                                                                    int min = Math.min(cueBuilder5.captionRowCount, cueBuilder5.row);
                                                                                    while (arrayList.size() >= min) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                resetCueBuilders();
                                                                                break;
                                                                            case 47:
                                                                                this.cues = getDisplayCues();
                                                                                resetCueBuilders();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        setCaptionMode(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            CueBuilder cueBuilder6 = this.currentCueBuilder;
                                            int[] iArr = BASIC_CHARACTER_SET;
                                            cueBuilder6.append((char) iArr[(b & Byte.MAX_VALUE) - 32]);
                                            if ((b2 & 224) != 0) {
                                                this.currentCueBuilder.append((char) iArr[(b2 & Byte.MAX_VALUE) - 32]);
                                            }
                                        }
                                        z2 = true;
                                    }
                                }
                            } else if (z3) {
                                resetCueBuilders();
                                z2 = true;
                            }
                        }
                    }
                    z = false;
                    this.isCaptionValid = z;
                    if (z) {
                    }
                    this.repeatableControlSet = false;
                    if (!z) {
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public final SimpleSubtitleDecoder$1 dequeueOutputBuffer() {
        SimpleSubtitleDecoder$1 simpleSubtitleDecoder$1;
        SimpleSubtitleDecoder$1 dequeueOutputBuffer = super.dequeueOutputBuffer();
        if (dequeueOutputBuffer != null) {
            return dequeueOutputBuffer;
        }
        long j = this.validDataChannelTimeoutUs;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.lastCueUpdateUs;
        if (j2 == -9223372036854775807L || this.playbackPositionUs - j2 < j || (simpleSubtitleDecoder$1 = (SimpleSubtitleDecoder$1) this.availableOutputBuffers.pollFirst()) == null) {
            return null;
        }
        this.cues = Collections.EMPTY_LIST;
        this.lastCueUpdateUs = -9223372036854775807L;
        Toolbar.AnonymousClass1 createSubtitle = createSubtitle();
        long j3 = this.playbackPositionUs;
        simpleSubtitleDecoder$1.timeUs = j3;
        simpleSubtitleDecoder$1.subtitle = createSubtitle;
        simpleSubtitleDecoder$1.subsampleOffsetUs = j3;
        return simpleSubtitleDecoder$1;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public final void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        setCaptionMode(0);
        this.captionRowCount = 4;
        this.currentCueBuilder.captionRowCount = 4;
        resetCueBuilders();
        this.isCaptionValid = false;
        this.repeatableControlSet = false;
        this.repeatableControlCc1 = (byte) 0;
        this.repeatableControlCc2 = (byte) 0;
        this.currentChannel = 0;
        this.isInCaptionService = true;
        this.lastCueUpdateUs = -9223372036854775807L;
    }

    public final ArrayList getDisplayCues() {
        ArrayList arrayList = this.cueBuilders;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            Cue build = ((CueBuilder) arrayList.get(i2)).build(PKIFailureInfo.systemUnavail);
            arrayList2.add(build);
            if (build != null) {
                i = Math.min(i, build.positionAnchor);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            Cue cue = (Cue) arrayList2.get(i3);
            if (cue != null) {
                if (cue.positionAnchor != i) {
                    cue = ((CueBuilder) arrayList.get(i3)).build(i);
                    cue.getClass();
                }
                arrayList3.add(cue);
            }
        }
        return arrayList3;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public final boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public final void release() {
    }

    public final void resetCueBuilders() {
        CueBuilder cueBuilder = this.currentCueBuilder;
        cueBuilder.captionMode = this.captionMode;
        cueBuilder.cueStyles.clear();
        cueBuilder.rolledUpCaptions.clear();
        cueBuilder.captionStringBuilder.setLength(0);
        cueBuilder.row = 15;
        cueBuilder.indent = 0;
        cueBuilder.tabOffset = 0;
        ArrayList arrayList = this.cueBuilders;
        arrayList.clear();
        arrayList.add(this.currentCueBuilder);
    }

    public final void setCaptionMode(int i) {
        int i2 = this.captionMode;
        if (i2 == i) {
            return;
        }
        this.captionMode = i;
        if (i != 3) {
            resetCueBuilders();
            if (i2 == 3 || i == 1 || i == 0) {
                this.cues = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.cueBuilders;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((CueBuilder) arrayList.get(i3)).captionMode = i;
            i3++;
        }
    }
}
