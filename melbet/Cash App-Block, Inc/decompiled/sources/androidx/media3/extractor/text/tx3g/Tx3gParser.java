package androidx.media3.extractor.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Tx3gParser implements SubtitleParser {
    public final int calculatedVideoTrackHeight;
    public final boolean customVerticalPlacement;
    public final int defaultColorRgba;
    public final int defaultFontFace;
    public final String defaultFontFamily;
    public final float defaultVerticalPlacement;
    public final ParsableByteArray parsableByteArray = new ParsableByteArray();

    public Tx3gParser(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.defaultFontFace = 0;
            this.defaultColorRgba = -1;
            this.defaultFontFamily = "sans-serif";
            this.customVerticalPlacement = false;
            this.defaultVerticalPlacement = 0.85f;
            this.calculatedVideoTrackHeight = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.defaultFontFace = bArr[24];
        this.defaultColorRgba = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.defaultFontFamily = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.calculatedVideoTrackHeight = i;
        boolean z = (bArr[0] & PnmConstants.PNM_SEPARATOR) != 0;
        this.customVerticalPlacement = z;
        if (z) {
            this.defaultVerticalPlacement = Util.constrainValue(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, RecyclerView.DECELERATION_RATE, 0.95f);
        } else {
            this.defaultVerticalPlacement = 0.85f;
        }
    }

    public static void attachColor(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void attachFontFace(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        String readString;
        int i3;
        int i4;
        ParsableByteArray parsableByteArray = this.parsableByteArray;
        parsableByteArray.reset(i + i2, bArr);
        parsableByteArray.setPosition(i);
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        Trace.checkArgument(parsableByteArray.bytesLeft() >= 2);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        if (readUnsignedShort == 0) {
            readString = "";
        } else {
            int i8 = parsableByteArray.position;
            Charset readUtfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
            int i9 = readUnsignedShort - (parsableByteArray.position - i8);
            if (readUtfCharsetFromBom == null) {
                readUtfCharsetFromBom = StandardCharsets.UTF_8;
            }
            readString = parsableByteArray.readString(i9, readUtfCharsetFromBom);
        }
        if (readString.isEmpty()) {
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            consumer.accept(new CuesWithTiming(-9223372036854775807L, -9223372036854775807L, RegularImmutableList.EMPTY));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(readString);
        attachFontFace(spannableStringBuilder, this.defaultFontFace, 0, 0, spannableStringBuilder.length(), 16711680);
        attachColor(spannableStringBuilder, this.defaultColorRgba, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.defaultFontFamily;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.defaultVerticalPlacement;
        while (parsableByteArray.bytesLeft() >= 8) {
            int i10 = parsableByteArray.position;
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1937013100) {
                Trace.checkArgument(parsableByteArray.bytesLeft() >= i7 ? i5 : i6);
                int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                int i11 = i6;
                while (i11 < readUnsignedShort2) {
                    Trace.checkArgument(parsableByteArray.bytesLeft() >= 12 ? i5 : i6);
                    int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                    int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                    parsableByteArray.skipBytes(i7);
                    int i12 = i11;
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    parsableByteArray.skipBytes(i5);
                    int readInt3 = parsableByteArray.readInt();
                    if (readUnsignedShort4 > spannableStringBuilder.length()) {
                        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(readUnsignedShort4, "Truncating styl end (", ") to cueText.length() (");
                        m2m.append(spannableStringBuilder.length());
                        m2m.append(").");
                        Log.w("Tx3gParser", m2m.toString());
                        readUnsignedShort4 = spannableStringBuilder.length();
                    }
                    if (readUnsignedShort3 >= readUnsignedShort4) {
                        Log.w("Tx3gParser", Recorder$$ExternalSyntheticOutline2.m(readUnsignedShort3, readUnsignedShort4, "Ignoring styl with start (", ") >= end (", ")."));
                        i4 = i12;
                    } else {
                        i4 = i12;
                        int i13 = readUnsignedShort4;
                        attachFontFace(spannableStringBuilder, readUnsignedByte, this.defaultFontFace, readUnsignedShort3, i13, 0);
                        attachColor(spannableStringBuilder, readInt3, this.defaultColorRgba, readUnsignedShort3, i13, 0);
                    }
                    i11 = i4 + 1;
                    i5 = 1;
                    i6 = 0;
                    i7 = 2;
                }
                i3 = i7;
            } else if (readInt2 == 1952608120 && this.customVerticalPlacement) {
                i3 = 2;
                Trace.checkArgument(parsableByteArray.bytesLeft() >= 2);
                f = Util.constrainValue(parsableByteArray.readUnsignedShort() / this.calculatedVideoTrackHeight, RecyclerView.DECELERATION_RATE, 0.95f);
            } else {
                i3 = 2;
            }
            parsableByteArray.setPosition(i10 + readInt);
            i7 = i3;
            i5 = 1;
            i6 = 0;
        }
        consumer.accept(new CuesWithTiming(-9223372036854775807L, -9223372036854775807L, ImmutableList.of((Object) new Cue(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, PKIFailureInfo.systemUnavail, RecyclerView.DECELERATION_RATE, 0))));
    }
}
