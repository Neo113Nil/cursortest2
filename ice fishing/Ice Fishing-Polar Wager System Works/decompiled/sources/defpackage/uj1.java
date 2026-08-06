package defpackage;

/* loaded from: classes.dex */
public class uj1 extends defpackage.c80 {
    public static int hyxIchWRW(android.graphics.fonts.FontStyle fontStyle, android.graphics.fonts.FontStyle fontStyle2) {
        return (java.lang.Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.c80
    public final android.graphics.Typeface SyNS6RMn(android.content.Context context, defpackage.gz[] gzVarArr) {
        try {
            android.graphics.fonts.FontFamily XZx205DYe = XZx205DYe(gzVarArr, context.getContentResolver());
            if (XZx205DYe == null) {
                return null;
            }
            android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(XZx205DYe);
            android.graphics.fonts.FontStyle fontStyle = new android.graphics.fonts.FontStyle(400, 0);
            android.graphics.fonts.Font font = XZx205DYe.getFont(0);
            int hyxIchWRW = hyxIchWRW(fontStyle, font.getStyle());
            for (int i = 1; i < XZx205DYe.getSize(); i++) {
                android.graphics.fonts.Font font2 = XZx205DYe.getFont(i);
                int hyxIchWRW2 = hyxIchWRW(fontStyle, font2.getStyle());
                if (hyxIchWRW2 < hyxIchWRW) {
                    font = font2;
                    hyxIchWRW = hyxIchWRW2;
                }
            }
            return customFallbackBuilder.setStyle(font.getStyle()).build();
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final android.graphics.fonts.FontFamily XZx205DYe(defpackage.gz[] gzVarArr, android.content.ContentResolver contentResolver) {
        android.graphics.fonts.Font font;
        java.lang.String str;
        android.os.ParcelFileDescriptor openFileDescriptor;
        android.graphics.fonts.FontFamily.Builder builder = null;
        for (defpackage.gz gzVar : gzVarArr) {
            if (java.util.Objects.equals(gzVar.IHQe1A4L2xu.getScheme(), "systemfont")) {
                font = mAr5m2L7gYDP(gzVar);
            } else {
                try {
                    android.net.Uri uri = gzVar.IHQe1A4L2xu;
                    str = gzVar.adDC3e2L;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (java.io.IOException e) {
                    android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        android.graphics.fonts.Font.Builder ttcIndex = new android.graphics.fonts.Font.Builder(openFileDescriptor).setWeight(gzVar.r1MBDhnF).setSlant(gzVar.F7NU4MC0GW ? 1 : 0).setTtcIndex(gzVar.oh6vYeIP);
                        if (!android.text.TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (java.lang.Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new android.graphics.fonts.FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public android.graphics.fonts.Font mAr5m2L7gYDP(defpackage.gz gzVar) {
        throw new java.lang.UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
