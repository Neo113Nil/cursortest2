package androidx.media3.extractor.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.tracing.Trace;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class SsaStyle {
    public final int alignment;
    public final boolean bold;
    public final int borderStyle;
    public final float fontSize;
    public final boolean italic;
    public final String name;
    public final Integer outlineColor;
    public final Integer primaryColor;
    public final boolean strikeout;
    public final boolean underline;

    public final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int borderStyleIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int outlineColorIndex;
        public final int primaryColorIndex;
        public final int strikeoutIndex;
        public final int underlineIndex;

        public Format(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.nameIndex = i;
            this.alignmentIndex = i2;
            this.primaryColorIndex = i3;
            this.outlineColorIndex = i4;
            this.fontSizeIndex = i5;
            this.boldIndex = i6;
            this.italicIndex = i7;
            this.underlineIndex = i8;
            this.strikeoutIndex = i9;
            this.borderStyleIndex = i10;
            this.length = i11;
        }
    }

    public final class Overrides {
        public static final Pattern ALIGNMENT_OVERRIDE_PATTERN;
        public static final Pattern BRACES_PATTERN = Pattern.compile("\\{([^}]*)\\}");
        public static final Pattern MOVE_PATTERN;
        public static final Pattern POSITION_PATTERN;

        static {
            String str = Util.DEVICE_DEBUG_INFO;
            Locale locale = Locale.US;
            POSITION_PATTERN = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            MOVE_PATTERN = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            ALIGNMENT_OVERRIDE_PATTERN = Pattern.compile("\\\\an(\\d+)");
        }

        public static PointF parsePosition(String str) {
            String group;
            String group2;
            Matcher matcher = POSITION_PATTERN.matcher(str);
            Matcher matcher2 = MOVE_PATTERN.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    Log.i("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            group.getClass();
            float parseFloat = Float.parseFloat(group.trim());
            group2.getClass();
            return new PointF(parseFloat, Float.parseFloat(group2.trim()));
        }
    }

    public SsaStyle(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.name = str;
        this.alignment = i;
        this.primaryColor = num;
        this.outlineColor = num2;
        this.fontSize = f;
        this.bold = z;
        this.italic = z2;
        this.underline = z3;
        this.strikeout = z4;
        this.borderStyle = i2;
    }

    public static int parseAlignment(String str) {
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        Fragment$5$$ExternalSyntheticOutline0.m("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean parseBooleanValue(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            Log.w("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static Integer parseColor(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            Trace.checkArgument(parseLong <= BodyPartID.bodyIdMax);
            return Integer.valueOf(Color.argb(CompositeException.WrappedPrintStream.checkedCast(((parseLong >> 24) & 255) ^ 255), CompositeException.WrappedPrintStream.checkedCast(parseLong & 255), CompositeException.WrappedPrintStream.checkedCast((parseLong >> 8) & 255), CompositeException.WrappedPrintStream.checkedCast((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            Log.w("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}
