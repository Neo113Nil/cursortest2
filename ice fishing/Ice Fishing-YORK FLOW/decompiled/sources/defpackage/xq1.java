package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class xq1 extends defpackage.q70 {
    public static int CZa7MwI9IzLd(android.graphics.fonts.FontStyle fontStyle, android.graphics.fonts.FontStyle fontStyle2) {
        return (java.lang.Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static android.graphics.fonts.Font OVwOqzUGHcCU(android.graphics.fonts.FontFamily fontFamily) {
        android.graphics.fonts.FontStyle fontStyle = new android.graphics.fonts.FontStyle(400, 0);
        android.graphics.fonts.Font font = fontFamily.getFont(0);
        int CZa7MwI9IzLd = CZa7MwI9IzLd(fontStyle, font.getStyle());
        for (int i = 1; i < fontFamily.getSize(); i++) {
            android.graphics.fonts.Font font2 = fontFamily.getFont(i);
            int CZa7MwI9IzLd2 = CZa7MwI9IzLd(fontStyle, font2.getStyle());
            if (CZa7MwI9IzLd2 < CZa7MwI9IzLd) {
                font = font2;
                CZa7MwI9IzLd = CZa7MwI9IzLd2;
            }
        }
        return font;
    }

    @Override // defpackage.q70
    public final android.graphics.Typeface BHfvd2J71qpO(android.content.Context context, android.content.res.Resources resources, java.lang.String str) {
        try {
            android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(resources, com.ice.fishing.wolberta.R.font.grandstander).build();
            return new android.graphics.Typeface.CustomFallbackBuilder(new android.graphics.fonts.FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public android.graphics.fonts.Font Fu5WBEia9jBo(defpackage.y00 y00Var) {
        throw new java.lang.UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    public final android.graphics.fonts.FontFamily Jkfc0NcwyPL8(defpackage.y00[] y00VarArr, android.content.ContentResolver contentResolver) {
        android.graphics.fonts.Font font;
        java.lang.String str;
        android.os.ParcelFileDescriptor openFileDescriptor;
        android.graphics.fonts.FontFamily.Builder builder = null;
        for (defpackage.y00 y00Var : y00VarArr) {
            if (java.util.Objects.equals(y00Var.ZpBGe2uQfcn8.getScheme(), "systemfont")) {
                font = Fu5WBEia9jBo(y00Var);
            } else {
                try {
                    android.net.Uri uri = y00Var.ZpBGe2uQfcn8;
                    str = y00Var.WDYagTQQm9ns;
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
                        android.graphics.fonts.Font.Builder ttcIndex = new android.graphics.fonts.Font.Builder(openFileDescriptor).setWeight(y00Var.fWTAfUmVKrZq).setSlant(y00Var.JhCgjQRTAOCT ? 1 : 0).setTtcIndex(y00Var.giKS3J6vZuNy);
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

    @Override // defpackage.q70
    public final android.graphics.Typeface WmetiUbpKU9I(android.content.Context context, defpackage.y00[] y00VarArr) {
        try {
            android.graphics.fonts.FontFamily Jkfc0NcwyPL8 = Jkfc0NcwyPL8(y00VarArr, context.getContentResolver());
            if (Jkfc0NcwyPL8 == null) {
                return null;
            }
            return new android.graphics.Typeface.CustomFallbackBuilder(Jkfc0NcwyPL8).setStyle(OVwOqzUGHcCU(Jkfc0NcwyPL8).getStyle()).build();
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.q70
    public final android.graphics.Typeface XntWc4eZSQ8j(android.content.Context context, defpackage.m00 m00Var, android.content.res.Resources resources) {
        try {
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (defpackage.n00 n00Var : m00Var.ZpBGe2uQfcn8) {
                try {
                    android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(resources, n00Var.oh71FJcDz6S2).setWeight(n00Var.giKS3J6vZuNy).setSlant(n00Var.fWTAfUmVKrZq ? 1 : 0).setTtcIndex(n00Var.WDYagTQQm9ns).setFontVariationSettings(n00Var.JhCgjQRTAOCT).build();
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (java.io.IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily build2 = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(build2).setStyle(OVwOqzUGHcCU(build2).getStyle()).build();
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.q70
    public final android.graphics.Typeface s0TASMVLSWD5(android.content.Context context, java.util.List list) {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            android.graphics.fonts.FontFamily Jkfc0NcwyPL8 = Jkfc0NcwyPL8((defpackage.y00[]) list.get(0), contentResolver);
            if (Jkfc0NcwyPL8 == null) {
                return null;
            }
            android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(Jkfc0NcwyPL8);
            for (int i = 1; i < list.size(); i++) {
                android.graphics.fonts.FontFamily Jkfc0NcwyPL82 = Jkfc0NcwyPL8((defpackage.y00[]) list.get(i), contentResolver);
                if (Jkfc0NcwyPL82 != null) {
                    customFallbackBuilder.addCustomFallback(Jkfc0NcwyPL82);
                }
            }
            return customFallbackBuilder.setStyle(OVwOqzUGHcCU(Jkfc0NcwyPL8).getStyle()).build();
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
