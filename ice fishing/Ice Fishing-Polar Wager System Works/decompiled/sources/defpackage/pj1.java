package defpackage;

/* loaded from: classes.dex */
public abstract class pj1 {
    public static final defpackage.c80 IHQe1A4L2xu;
    public static android.graphics.Paint oh6vYeIP;

    static {
        defpackage.l80.AARZUJiTa("TypefaceCompat static init");
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 31) {
            IHQe1A4L2xu = new defpackage.vj1();
        } else if (i >= 29) {
            IHQe1A4L2xu = new defpackage.uj1();
        } else if (i >= 28) {
            IHQe1A4L2xu = new defpackage.tj1();
        } else if (i >= 26) {
            IHQe1A4L2xu = new defpackage.sj1();
        } else {
            java.lang.reflect.Method method = defpackage.rj1.adDC3e2L;
            if (method == null) {
                android.util.Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                IHQe1A4L2xu = new defpackage.rj1();
            } else {
                IHQe1A4L2xu = new defpackage.qj1();
            }
        }
        new defpackage.u50(1);
        oh6vYeIP = null;
        android.os.Trace.endSection();
    }

    public static android.graphics.fonts.Font IHQe1A4L2xu(android.graphics.Typeface typeface) {
        android.graphics.text.PositionedGlyphs shapeTextRun;
        int glyphCount;
        android.graphics.fonts.Font font;
        if (oh6vYeIP == null) {
            oh6vYeIP = new android.graphics.Paint();
        }
        oh6vYeIP.setTextSize(10.0f);
        oh6vYeIP.setTypeface(typeface);
        shapeTextRun = android.graphics.text.TextRunShaper.shapeTextRun((java.lang.CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, oh6vYeIP);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
