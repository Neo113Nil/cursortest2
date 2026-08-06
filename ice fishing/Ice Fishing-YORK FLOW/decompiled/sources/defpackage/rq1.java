package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class rq1 {
    public static final defpackage.q70 ZpBGe2uQfcn8;
    public static android.graphics.Paint fWTAfUmVKrZq;
    public static final defpackage.rj0 giKS3J6vZuNy;

    static {
        defpackage.v70.Ns0WNyEWdPsk("TypefaceCompat static init");
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 31) {
            ZpBGe2uQfcn8 = new defpackage.yq1();
        } else if (i >= 29) {
            ZpBGe2uQfcn8 = new defpackage.xq1();
        } else if (i >= 28) {
            ZpBGe2uQfcn8 = new defpackage.wq1();
        } else if (i >= 26) {
            ZpBGe2uQfcn8 = new defpackage.vq1();
        } else {
            java.lang.reflect.Method method = defpackage.tq1.fWTAfUmVKrZq;
            if (method == null) {
                android.util.Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                ZpBGe2uQfcn8 = new defpackage.tq1();
            } else {
                ZpBGe2uQfcn8 = new defpackage.sq1();
            }
        }
        giKS3J6vZuNy = new defpackage.rj0(16);
        fWTAfUmVKrZq = null;
        android.os.Trace.endSection();
    }

    public static android.graphics.fonts.Font JhCgjQRTAOCT(android.graphics.Typeface typeface) {
        android.graphics.text.PositionedGlyphs shapeTextRun;
        int glyphCount;
        android.graphics.fonts.Font font;
        if (fWTAfUmVKrZq == null) {
            fWTAfUmVKrZq = new android.graphics.Paint();
        }
        fWTAfUmVKrZq.setTextSize(10.0f);
        fWTAfUmVKrZq.setTypeface(typeface);
        shapeTextRun = android.graphics.text.TextRunShaper.shapeTextRun((java.lang.CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, fWTAfUmVKrZq);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }

    public static android.graphics.Typeface ZpBGe2uQfcn8(android.content.Context context, defpackage.l00 l00Var, android.content.res.Resources resources, java.lang.String str, int i, defpackage.vx1 vx1Var) {
        android.graphics.Typeface XntWc4eZSQ8j;
        android.graphics.Typeface build;
        android.graphics.fonts.Font.Builder fontVariationSettings;
        android.graphics.fonts.Font build2;
        android.graphics.fonts.FontFamily build3;
        boolean z = l00Var instanceof defpackage.o00;
        defpackage.rj0 rj0Var = giKS3J6vZuNy;
        if (z) {
            defpackage.o00 o00Var = (defpackage.o00) l00Var;
            java.lang.String str2 = o00Var.giKS3J6vZuNy;
            int i2 = 0;
            if (android.text.TextUtils.isEmpty(str2) || (build = fWTAfUmVKrZq(str2)) == null) {
                java.util.ArrayList arrayList = o00Var.ZpBGe2uQfcn8;
                if (arrayList.size() == 1) {
                    build = fWTAfUmVKrZq(((defpackage.e00) arrayList.get(0)).WDYagTQQm9ns);
                } else {
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayList.size()) {
                                android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= arrayList.size()) {
                                        break;
                                    }
                                    defpackage.e00 e00Var = (defpackage.e00) arrayList.get(i4);
                                    if (i4 == arrayList.size() - 1 && android.text.TextUtils.isEmpty(e00Var.oh71FJcDz6S2)) {
                                        customFallbackBuilder.setSystemFallback(e00Var.WDYagTQQm9ns);
                                        break;
                                    }
                                    java.lang.String str3 = e00Var.WDYagTQQm9ns;
                                    java.lang.String str4 = e00Var.oh71FJcDz6S2;
                                    android.graphics.fonts.Font JhCgjQRTAOCT = JhCgjQRTAOCT(fWTAfUmVKrZq(str3));
                                    if (JhCgjQRTAOCT == null) {
                                        android.util.Log.w("TypefaceCompat", "Unable identify the primary font for " + e00Var.WDYagTQQm9ns + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (android.text.TextUtils.isEmpty(str4)) {
                                        build3 = defpackage.u80.OcTWLQzke1i2(JhCgjQRTAOCT).build();
                                    } else {
                                        try {
                                            defpackage.u80.h3m55N1URyyK();
                                            defpackage.u80.blKFvluuDQOf();
                                            fontVariationSettings = defpackage.d0.WDYagTQQm9ns(JhCgjQRTAOCT).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = defpackage.u80.Ns0WNyEWdPsk(build2).build();
                                        } catch (java.io.IOException unused) {
                                            android.util.Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = defpackage.u80.QiMR8OkAhezm(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i4++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (fWTAfUmVKrZq(((defpackage.e00) arrayList.get(i3)).WDYagTQQm9ns) == null) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                rj0Var.JhCgjQRTAOCT(giKS3J6vZuNy(resources, str, i), build);
                return build;
            }
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            defpackage.l21 l21Var = new defpackage.l21(22);
            java.util.ArrayList arrayList2 = o00Var.ZpBGe2uQfcn8;
            defpackage.w41 w41Var = new defpackage.w41(handler);
            defpackage.n80 n80Var = new defpackage.n80(3, l21Var, w41Var);
            if (arrayList2.size() > 1) {
                defpackage.h7.w7APNrr0aGRc("Fallbacks with blocking fetches are not supported for performance reasons");
                return null;
            }
            defpackage.e00 e00Var2 = (defpackage.e00) arrayList2.get(0);
            defpackage.rj0 rj0Var2 = defpackage.k00.ZpBGe2uQfcn8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(1);
            java.lang.Object obj = new java.lang.Object[]{e00Var2}[0];
            java.util.Objects.requireNonNull(obj);
            arrayList3.add(obj);
            java.util.List unmodifiableList = java.util.Collections.unmodifiableList(arrayList3);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i5 = 0; i5 < unmodifiableList.size(); i5++) {
                sb.append(((defpackage.e00) unmodifiableList.get(i5)).QiMR8OkAhezm);
                sb.append("-0");
                if (i5 < unmodifiableList.size() - 1) {
                    sb.append(";");
                }
            }
            java.lang.String sb2 = sb.toString();
            XntWc4eZSQ8j = (android.graphics.Typeface) defpackage.k00.ZpBGe2uQfcn8.fWTAfUmVKrZq(sb2);
            if (XntWc4eZSQ8j != null) {
                w41Var.execute(new defpackage.vc(i2, l21Var, XntWc4eZSQ8j));
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList(1);
                java.lang.Object obj2 = new java.lang.Object[]{e00Var2}[0];
                java.util.Objects.requireNonNull(obj2);
                arrayList4.add(obj2);
                defpackage.j00 ZpBGe2uQfcn82 = defpackage.k00.ZpBGe2uQfcn8(sb2, context, java.util.Collections.unmodifiableList(arrayList4));
                n80Var.oCu53ZX2v4Ju(ZpBGe2uQfcn82);
                XntWc4eZSQ8j = ZpBGe2uQfcn82.ZpBGe2uQfcn8;
            }
        } else {
            XntWc4eZSQ8j = ZpBGe2uQfcn8.XntWc4eZSQ8j(context, (defpackage.m00) l00Var, resources);
        }
        if (XntWc4eZSQ8j != null) {
            rj0Var.JhCgjQRTAOCT(giKS3J6vZuNy(resources, str, i), XntWc4eZSQ8j);
        }
        return XntWc4eZSQ8j;
    }

    public static android.graphics.Typeface fWTAfUmVKrZq(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            android.graphics.Typeface create = android.graphics.Typeface.create(str, 0);
            android.graphics.Typeface create2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static java.lang.String giKS3J6vZuNy(android.content.res.Resources resources, java.lang.String str, int i) {
        return resources.getResourcePackageName(com.ice.fishing.wolberta.R.font.grandstander) + '-' + str + '-' + i + '-' + com.ice.fishing.wolberta.R.font.grandstander + "-0";
    }
}
