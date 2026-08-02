package androidx.media3.extractor.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.ssa.SsaStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import com.google.common.base.Ascii;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SsaParser implements SubtitleParser {
    public static final Pattern SSA_TIMECODE_PATTERN = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final SsaDialogueFormat dialogueFormatFromInitializationData;
    public final boolean haveInitializationData;
    public LinkedHashMap styles;
    public float screenWidth = -3.4028235E38f;
    public float screenHeight = -3.4028235E38f;
    public final ParsableByteArray parsableByteArray = new ParsableByteArray();

    public SsaParser(List list) {
        if (list == null || list.isEmpty()) {
            this.haveInitializationData = false;
            this.dialogueFormatFromInitializationData = null;
            return;
        }
        this.haveInitializationData = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        Trace.checkArgument(str.startsWith("Format:"));
        SsaDialogueFormat fromFormatLine = SsaDialogueFormat.fromFormatLine(str);
        fromFormatLine.getClass();
        this.dialogueFormatFromInitializationData = fromFormatLine;
        parseHeader(new ParsableByteArray((byte[]) list.get(1)), charset);
    }

    public static int addCuePlacerholderByTime(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long parseTimecodeUs(String str) {
        Matcher matcher = SSA_TIMECODE_PATTERN.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = Util.DEVICE_DEBUG_INFO;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    @Override // androidx.media3.extractor.text.SubtitleParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        Charset charset;
        ParsableByteArray parsableByteArray;
        SsaDialogueFormat ssaDialogueFormat;
        long j;
        int parseInt;
        long parseTimecodeUs;
        float f;
        float f2;
        int i3;
        float f3;
        int i4;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i5;
        int i6;
        int i7;
        float f4;
        float f5;
        float f6;
        boolean z;
        int i8;
        int i9;
        float f7;
        int i10;
        int i11;
        float f8;
        int i12;
        int i13;
        int i14;
        SsaParser ssaParser = this;
        long j2 = outputOptions.startTimeUs;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ParsableByteArray parsableByteArray2 = ssaParser.parsableByteArray;
        parsableByteArray2.reset(i + i2, bArr);
        parsableByteArray2.setPosition(i);
        Charset readUtfCharsetFromBom = parsableByteArray2.readUtfCharsetFromBom();
        if (readUtfCharsetFromBom == null) {
            readUtfCharsetFromBom = StandardCharsets.UTF_8;
        }
        boolean z2 = ssaParser.haveInitializationData;
        if (!z2) {
            ssaParser.parseHeader(parsableByteArray2, readUtfCharsetFromBom);
        }
        SsaDialogueFormat ssaDialogueFormat2 = z2 ? ssaParser.dialogueFormatFromInitializationData : null;
        while (true) {
            String readLine = parsableByteArray2.readLine(readUtfCharsetFromBom);
            if (readLine == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !outputOptions.outputAllCues) ? null : new ArrayList();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    List list = (List) arrayList.get(i15);
                    if (!list.isEmpty() || i15 == 0) {
                        if (i15 == arrayList.size() - 1) {
                            Path$$ExternalSyntheticBUOutline0.m();
                            return;
                        }
                        long longValue = ((Long) arrayList2.get(i15)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i15 + 1)).longValue();
                        CuesWithTiming cuesWithTiming = new CuesWithTiming(longValue, longValue2 - longValue, list);
                        if (j3 == -9223372036854775807L || longValue2 >= j3) {
                            consumer.accept(cuesWithTiming);
                        } else if (arrayList3 != null) {
                            arrayList3.add(cuesWithTiming);
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        consumer.accept((CuesWithTiming) it.next());
                    }
                    return;
                }
                return;
            }
            if (readLine.startsWith("Format:")) {
                ssaDialogueFormat2 = SsaDialogueFormat.fromFormatLine(readLine);
            } else {
                if (readLine.startsWith("Dialogue:")) {
                    if (ssaDialogueFormat2 == null) {
                        Log.w("SsaParser", "Skipping dialogue line before complete format: ".concat(readLine));
                    } else {
                        int i16 = ssaDialogueFormat2.length;
                        Trace.checkArgument(readLine.startsWith("Dialogue:"));
                        String substring = readLine.substring(9);
                        int i17 = ssaDialogueFormat2.layerIndex;
                        String[] split = substring.split(",", i16);
                        if (split.length != i16) {
                            Log.w("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(readLine));
                        } else {
                            if (i17 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i17].trim());
                                } catch (RuntimeException unused) {
                                    Log.w("SsaParser", "Fail to parse layer: " + split[i17]);
                                }
                                parseTimecodeUs = parseTimecodeUs(split[ssaDialogueFormat2.startTimeIndex]);
                                charset = readUtfCharsetFromBom;
                                if (parseTimecodeUs != -9223372036854775807L) {
                                    Log.w("SsaParser", "Skipping invalid timing: ".concat(readLine));
                                    j = j2;
                                    ssaDialogueFormat = ssaDialogueFormat2;
                                    parsableByteArray = parsableByteArray2;
                                    ssaParser = this;
                                    readUtfCharsetFromBom = charset;
                                    j2 = j;
                                    ssaDialogueFormat2 = ssaDialogueFormat;
                                    parsableByteArray2 = parsableByteArray;
                                } else {
                                    j = j2;
                                    long parseTimecodeUs2 = parseTimecodeUs(split[ssaDialogueFormat2.endTimeIndex]);
                                    if (parseTimecodeUs2 == -9223372036854775807L || parseTimecodeUs2 <= parseTimecodeUs) {
                                        ssaDialogueFormat = ssaDialogueFormat2;
                                        parsableByteArray = parsableByteArray2;
                                        Log.w("SsaParser", "Skipping invalid timing: ".concat(readLine));
                                    } else {
                                        LinkedHashMap linkedHashMap = ssaParser.styles;
                                        SsaStyle ssaStyle = (linkedHashMap == null || (i14 = ssaDialogueFormat2.styleIndex) == -1) ? null : (SsaStyle) linkedHashMap.get(split[i14].trim());
                                        String str = split[ssaDialogueFormat2.textIndex];
                                        Matcher matcher = SsaStyle.Overrides.BRACES_PATTERN.matcher(str);
                                        ssaDialogueFormat = ssaDialogueFormat2;
                                        PointF pointF = null;
                                        int i18 = -1;
                                        while (matcher.find()) {
                                            ParsableByteArray parsableByteArray3 = parsableByteArray2;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF parsePosition = SsaStyle.Overrides.parsePosition(group);
                                                if (parsePosition != null) {
                                                    pointF = parsePosition;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            try {
                                                Matcher matcher2 = SsaStyle.Overrides.ALIGNMENT_OVERRIDE_PATTERN.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i13 = SsaStyle.parseAlignment(group2);
                                                } else {
                                                    i13 = -1;
                                                }
                                                if (i13 != -1) {
                                                    i18 = i13;
                                                }
                                            } catch (RuntimeException unused3) {
                                            }
                                            parsableByteArray2 = parsableByteArray3;
                                        }
                                        parsableByteArray = parsableByteArray2;
                                        String replace = SsaStyle.Overrides.BRACES_PATTERN.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f9 = ssaParser.screenWidth;
                                        float f10 = ssaParser.screenHeight;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (ssaStyle != null) {
                                            boolean z3 = ssaStyle.italic;
                                            Integer num = ssaStyle.outlineColor;
                                            Integer num2 = ssaStyle.primaryColor;
                                            if (num2 != null) {
                                                z = z3;
                                                f = f9;
                                                f2 = f10;
                                                i8 = 33;
                                                i9 = 0;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                z = z3;
                                                f = f9;
                                                f2 = f10;
                                                i8 = 33;
                                                i9 = 0;
                                            }
                                            if (ssaStyle.borderStyle == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i9, spannableString.length(), i8);
                                            }
                                            float f11 = ssaStyle.fontSize;
                                            if (f11 == -3.4028235E38f || f2 == -3.4028235E38f) {
                                                f7 = -3.4028235E38f;
                                                i10 = Integer.MIN_VALUE;
                                            } else {
                                                f7 = f11 / f2;
                                                i10 = 1;
                                            }
                                            boolean z4 = ssaStyle.bold;
                                            if (z4 && z) {
                                                i11 = i10;
                                                f8 = f7;
                                                i12 = 33;
                                                i3 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i11 = i10;
                                                f8 = f7;
                                                i12 = 33;
                                                i3 = 0;
                                                if (z4) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (ssaStyle.underline) {
                                                spannableString.setSpan(new UnderlineSpan(), i3, spannableString.length(), i12);
                                            }
                                            if (ssaStyle.strikeout) {
                                                spannableString.setSpan(new StrikethroughSpan(), i3, spannableString.length(), i12);
                                            }
                                            i4 = i11;
                                            f3 = f8;
                                        } else {
                                            f = f9;
                                            f2 = f10;
                                            i3 = 0;
                                            f3 = -3.4028235E38f;
                                            i4 = Integer.MIN_VALUE;
                                        }
                                        if (i18 == -1) {
                                            i18 = ssaStyle != null ? ssaStyle.alignment : -1;
                                        }
                                        switch (i18) {
                                            case 0:
                                            default:
                                                Fragment$5$$ExternalSyntheticOutline0.m(i18, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                alignment2 = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                alignment2 = alignment;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                alignment2 = alignment;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                alignment2 = alignment;
                                                break;
                                        }
                                        int i19 = PKIFailureInfo.systemUnavail;
                                        switch (i18) {
                                            case 0:
                                            default:
                                                Fragment$5$$ExternalSyntheticOutline0.m(i18, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                i5 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i5 = i3;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i5 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i5 = 2;
                                                break;
                                        }
                                        switch (i18) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                Fragment$5$$ExternalSyntheticOutline0.m(i18, "Unknown alignment: ", "SsaParser");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i19 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i19 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i19 = i3;
                                                break;
                                        }
                                        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                            float f12 = 0.95f;
                                            if (i5 != 0) {
                                                i6 = 1;
                                                if (i5 != 1) {
                                                    i7 = 2;
                                                    f4 = i5 != 2 ? -3.4028235E38f : 0.95f;
                                                } else {
                                                    i7 = 2;
                                                    f4 = 0.5f;
                                                }
                                            } else {
                                                i6 = 1;
                                                i7 = 2;
                                                f4 = 0.05f;
                                            }
                                            if (i19 == 0) {
                                                f12 = 0.05f;
                                            } else if (i19 == i6) {
                                                f12 = 0.5f;
                                            } else if (i19 != i7) {
                                                f12 = -3.4028235E38f;
                                            }
                                            f5 = f12;
                                            f6 = f4;
                                        } else {
                                            f6 = pointF.x / f;
                                            f5 = pointF.y / f2;
                                        }
                                        Cue cue = new Cue(spannableString, alignment2, null, null, f5, i3, i19, f6, i5, i4, f3, -3.4028235E38f, -3.4028235E38f, false, -16777216, PKIFailureInfo.systemUnavail, RecyclerView.DECELERATION_RATE, parseInt);
                                        int addCuePlacerholderByTime = addCuePlacerholderByTime(parseTimecodeUs2, arrayList2, arrayList);
                                        for (int addCuePlacerholderByTime2 = addCuePlacerholderByTime(parseTimecodeUs, arrayList2, arrayList); addCuePlacerholderByTime2 < addCuePlacerholderByTime; addCuePlacerholderByTime2++) {
                                            ((List) arrayList.get(addCuePlacerholderByTime2)).add(cue);
                                        }
                                    }
                                    ssaParser = this;
                                    readUtfCharsetFromBom = charset;
                                    j2 = j;
                                    ssaDialogueFormat2 = ssaDialogueFormat;
                                    parsableByteArray2 = parsableByteArray;
                                }
                            }
                            parseInt = 0;
                            parseTimecodeUs = parseTimecodeUs(split[ssaDialogueFormat2.startTimeIndex]);
                            charset = readUtfCharsetFromBom;
                            if (parseTimecodeUs != -9223372036854775807L) {
                            }
                        }
                    }
                }
                charset = readUtfCharsetFromBom;
                j = j2;
                ssaDialogueFormat = ssaDialogueFormat2;
                parsableByteArray = parsableByteArray2;
                ssaParser = this;
                readUtfCharsetFromBom = charset;
                j2 = j;
                ssaDialogueFormat2 = ssaDialogueFormat;
                parsableByteArray2 = parsableByteArray;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void parseHeader(ParsableByteArray parsableByteArray, Charset charset) {
        int i;
        SsaStyle ssaStyle;
        while (true) {
            String readLine = parsableByteArray.readLine(charset);
            if (readLine == null) {
                return;
            }
            int i2 = 0;
            int i3 = 91;
            if ("[Script Info]".equalsIgnoreCase(readLine)) {
                while (true) {
                    String readLine2 = parsableByteArray.readLine(charset);
                    if (readLine2 == null) {
                        break;
                    }
                    if (parsableByteArray.bytesLeft() != 0) {
                        if ((parsableByteArray.peekCodePointAndSize(charset) != 0 ? CompositeException.WrappedPrintStream.checkedCast(r2 >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] split = readLine2.split(":");
                    if (split.length == 2) {
                        String lowerCase = Ascii.toLowerCase(split[0].trim());
                        lowerCase.getClass();
                        if (lowerCase.equals("playresx")) {
                            this.screenWidth = Float.parseFloat(split[1].trim());
                        } else if (lowerCase.equals("playresy")) {
                            try {
                                this.screenHeight = Float.parseFloat(split[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(readLine)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                SsaStyle.Format format2 = null;
                while (true) {
                    String readLine3 = parsableByteArray.readLine(charset);
                    if (readLine3 != null) {
                        if (parsableByteArray.bytesLeft() != 0) {
                            if ((parsableByteArray.peekCodePointAndSize(charset) != 0 ? CompositeException.WrappedPrintStream.checkedCast(r0 >>> 8) : 1114112) == i3) {
                            }
                        }
                        int i4 = -1;
                        if (readLine3.startsWith("Format:")) {
                            String[] split2 = TextUtils.split(readLine3.substring(7), ",");
                            int i5 = -1;
                            int i6 = -1;
                            int i7 = -1;
                            int i8 = -1;
                            int i9 = -1;
                            int i10 = -1;
                            int i11 = -1;
                            int i12 = -1;
                            int i13 = -1;
                            int i14 = -1;
                            for (int i15 = i2; i15 < split2.length; i15++) {
                                String lowerCase2 = Ascii.toLowerCase(split2[i15].trim());
                                lowerCase2.getClass();
                                switch (lowerCase2.hashCode()) {
                                    case -1178781136:
                                        if (lowerCase2.equals("italic")) {
                                            i = i2;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case -1026963764:
                                        if (lowerCase2.equals("underline")) {
                                            i = 1;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case -192095652:
                                        if (lowerCase2.equals("strikeout")) {
                                            i = 2;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case -70925746:
                                        if (lowerCase2.equals("primarycolour")) {
                                            i = 3;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 3029637:
                                        if (lowerCase2.equals("bold")) {
                                            i = 4;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 3373707:
                                        if (lowerCase2.equals("name")) {
                                            i = 5;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 366554320:
                                        if (lowerCase2.equals("fontsize")) {
                                            i = 6;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 767321349:
                                        if (lowerCase2.equals("borderstyle")) {
                                            i = 7;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 1767875043:
                                        if (lowerCase2.equals("alignment")) {
                                            i = 8;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    case 1988365454:
                                        if (lowerCase2.equals("outlinecolour")) {
                                            i = 9;
                                            break;
                                        }
                                        i = -1;
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                                switch (i) {
                                    case 0:
                                        i11 = i15;
                                        break;
                                    case 1:
                                        i12 = i15;
                                        break;
                                    case 2:
                                        i13 = i15;
                                        break;
                                    case 3:
                                        i7 = i15;
                                        break;
                                    case 4:
                                        i10 = i15;
                                        break;
                                    case 5:
                                        i5 = i15;
                                        break;
                                    case 6:
                                        i9 = i15;
                                        break;
                                    case 7:
                                        i14 = i15;
                                        break;
                                    case 8:
                                        i6 = i15;
                                        break;
                                    case 9:
                                        i8 = i15;
                                        break;
                                }
                            }
                            format2 = i5 != -1 ? new SsaStyle.Format(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, split2.length) : null;
                        } else {
                            if (readLine3.startsWith("Style:")) {
                                if (format2 == null) {
                                    Log.w("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(readLine3));
                                } else {
                                    Trace.checkArgument(readLine3.startsWith("Style:"));
                                    String[] split3 = TextUtils.split(readLine3.substring(6), ",");
                                    int length = split3.length;
                                    int i16 = format2.length;
                                    if (length != i16) {
                                        int length2 = split3.length;
                                        String str = Util.DEVICE_DEBUG_INFO;
                                        Locale locale = Locale.US;
                                        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i16, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                        m107m.append(readLine3);
                                        m107m.append("'");
                                        Log.w("SsaStyle", m107m.toString());
                                    } else {
                                        try {
                                            String trim = split3[format2.nameIndex].trim();
                                            int i17 = format2.alignmentIndex;
                                            int parseAlignment = i17 != -1 ? SsaStyle.parseAlignment(split3[i17].trim()) : -1;
                                            int i18 = format2.primaryColorIndex;
                                            Integer parseColor = i18 != -1 ? SsaStyle.parseColor(split3[i18].trim()) : null;
                                            int i19 = format2.outlineColorIndex;
                                            Integer parseColor2 = i19 != -1 ? SsaStyle.parseColor(split3[i19].trim()) : null;
                                            int i20 = format2.fontSizeIndex;
                                            float f = -3.4028235E38f;
                                            if (i20 != -1) {
                                                String trim2 = split3[i20].trim();
                                                try {
                                                    f = Float.parseFloat(trim2);
                                                } catch (NumberFormatException e) {
                                                    Log.w("SsaStyle", "Failed to parse font size: '" + trim2 + "'", e);
                                                }
                                            }
                                            float f2 = f;
                                            int i21 = format2.boldIndex;
                                            boolean z = i21 != -1 && SsaStyle.parseBooleanValue(split3[i21].trim());
                                            int i22 = format2.italicIndex;
                                            boolean z2 = i22 != -1 && SsaStyle.parseBooleanValue(split3[i22].trim());
                                            int i23 = format2.underlineIndex;
                                            boolean z3 = i23 != -1 && SsaStyle.parseBooleanValue(split3[i23].trim());
                                            int i24 = format2.strikeoutIndex;
                                            boolean z4 = i24 != -1 && SsaStyle.parseBooleanValue(split3[i24].trim());
                                            int i25 = format2.borderStyleIndex;
                                            if (i25 != -1) {
                                                String trim3 = split3[i25].trim();
                                                try {
                                                    int parseInt = Integer.parseInt(trim3.trim());
                                                    if (parseInt == 1 || parseInt == 3) {
                                                        i4 = parseInt;
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                                Log.w("SsaStyle", "Ignoring unknown BorderStyle: " + trim3);
                                            }
                                            ssaStyle = new SsaStyle(trim, parseAlignment, parseColor, parseColor2, f2, z, z2, z3, z4, i4);
                                        } catch (RuntimeException e2) {
                                            Log.w("SsaStyle", "Skipping malformed 'Style:' line: '" + readLine3 + "'", e2);
                                        }
                                        if (ssaStyle != null) {
                                            linkedHashMap.put(ssaStyle.name, ssaStyle);
                                        }
                                    }
                                    ssaStyle = null;
                                    if (ssaStyle != null) {
                                    }
                                }
                            }
                            i2 = 0;
                            i3 = 91;
                        }
                    }
                }
                this.styles = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(readLine)) {
                Log.i("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(readLine)) {
                return;
            }
        }
    }
}
