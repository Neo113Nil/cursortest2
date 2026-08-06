package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class jb1 {
    public static final q70 GWasM1elztuh;
    public static Paint Yi7zF1RB1;

    static {
        l60.encWxUiV2("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            GWasM1elztuh = new pb1();
        } else if (i >= 29) {
            GWasM1elztuh = new ob1();
        } else if (i >= 28) {
            GWasM1elztuh = new nb1();
        } else if (i >= 26) {
            GWasM1elztuh = new mb1();
        } else {
            Method method = lb1.X1lG3V04pd;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                GWasM1elztuh = new lb1();
            } else {
                GWasM1elztuh = new kb1();
            }
        }
        new q10(1);
        Yi7zF1RB1 = null;
        Trace.endSection();
    }

    public static Font GWasM1elztuh(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (Yi7zF1RB1 == null) {
            Yi7zF1RB1 = new Paint();
        }
        Yi7zF1RB1.setTextSize(10.0f);
        Yi7zF1RB1.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, Yi7zF1RB1);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
