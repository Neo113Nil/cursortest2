package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class qo {
    public static final defpackage.e11 ZpBGe2uQfcn8;

    static {
        ZpBGe2uQfcn8 = new defpackage.e11((30 & 1) == 0, defpackage.z91.WDYagTQQm9ns, true);
    }

    public static final void JhCgjQRTAOCT(defpackage.vl0 vl0Var, defpackage.nh nhVar, defpackage.e30 e30Var, int i) {
        int i2;
        e30Var.PS16moFv2oLu(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (e30Var.oh71FJcDz6S2(vl0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(nhVar) ? 32 : 16;
        }
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 19) != 18)) {
            defpackage.la0.WDYagTQQm9ns(vl0Var, defpackage.kk1.ZpBGe2uQfcn8, nhVar, e30Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.f4(vl0Var, nhVar, i, i3);
        }
    }

    public static final void ZpBGe2uQfcn8(defpackage.mk1 mk1Var, defpackage.ak1 ak1Var, defpackage.e30 e30Var, int i) {
        defpackage.e30 e30Var2;
        android.content.Context context;
        e30Var.PS16moFv2oLu(1904307118);
        int i2 = 4;
        int i3 = (e30Var.oh71FJcDz6S2(mk1Var) ? 4 : 2) | i | (e30Var.P05cfTpS5W5L(ak1Var) ? 32 : 16);
        if (e30Var.zJPqDeoF0Os1(i3 & 1, (i3 & 19) != 18)) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                e30Var.NkfcFfdaVTox(-1009482584);
                context = (android.content.Context) e30Var.GE9mJIPrb8gP(defpackage.j0.giKS3J6vZuNy);
                e30Var.XntWc4eZSQ8j(false);
            } else {
                e30Var.NkfcFfdaVTox(-1009433480);
                e30Var.XntWc4eZSQ8j(false);
                context = null;
            }
            boolean P05cfTpS5W5L = e30Var.P05cfTpS5W5L(ak1Var) | ((i3 & 14) == 4) | e30Var.P05cfTpS5W5L(context);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO9 = new defpackage.eSwlWMUpitz8(ak1Var, context, mk1Var, i2);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            e30Var2 = e30Var;
            defpackage.il.giKS3J6vZuNy(null, null, (defpackage.y10) GcLuU6pT9wO9, e30Var2, 0, 3);
        } else {
            e30Var2 = e30Var;
            e30Var2.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var2.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.yh0(i, 6, mk1Var, ak1Var);
        }
    }

    public static final void fWTAfUmVKrZq(defpackage.mk1 mk1Var, defpackage.bk1 bk1Var, defpackage.n10 n10Var, defpackage.e30 e30Var, int i) {
        int i2;
        e30Var.PS16moFv2oLu(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e30Var.oh71FJcDz6S2(mk1Var) : e30Var.P05cfTpS5W5L(mk1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e30Var.oh71FJcDz6S2(bk1Var) : e30Var.P05cfTpS5W5L(bk1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(n10Var) ? 256 : 128;
        }
        boolean z = false;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && e30Var.oh71FJcDz6S2(bk1Var));
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            defpackage.pa1 pa1Var = defpackage.cj.ZpBGe2uQfcn8;
            if (z2 || GcLuU6pT9wO9 == pa1Var) {
                GcLuU6pT9wO9 = new defpackage.xj0(new defpackage.k0(3, new defpackage.S0YpfprlOYIn(7, bk1Var, n10Var)));
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.xj0 xj0Var = (defpackage.xj0) GcLuU6pT9wO9;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && e30Var.P05cfTpS5W5L(mk1Var))) {
                z = true;
            }
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (z || GcLuU6pT9wO92 == pa1Var) {
                GcLuU6pT9wO92 = new defpackage.l3(8, mk1Var);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
            }
            defpackage.h3.ZpBGe2uQfcn8(xj0Var, (defpackage.n10) GcLuU6pT9wO92, ZpBGe2uQfcn8, defpackage.nn.OcTWLQzke1i2(1315155414, new defpackage.yh0(5, bk1Var, mk1Var), e30Var), e30Var, 3456, 0);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.n3(mk1Var, bk1Var, n10Var, i, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0517 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x053a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0618 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void giKS3J6vZuNy(final int i, long j, defpackage.e30 e30Var, final int i2) {
        android.util.TypedValue typedValue;
        int i3;
        boolean z;
        java.lang.Object obj;
        java.lang.Object w1Var;
        defpackage.yv0 faVar;
        boolean z2;
        java.lang.Object GcLuU6pT9wO9;
        java.lang.Object gaVar;
        android.content.res.TypedArray typedArray;
        boolean z3;
        long j2;
        int i4;
        int i5;
        android.content.res.XmlResourceParser xmlResourceParser;
        char c;
        int i6;
        android.content.res.TypedArray obtainStyledAttributes;
        int i7;
        android.content.res.TypedArray obtainStyledAttributes2;
        int i8;
        int i9;
        int i10;
        android.content.res.ColorStateList colorStateList;
        final long j3 = j;
        e30Var.PS16moFv2oLu(-1240244237);
        int i11 = (i2 & 6) == 0 ? i2 | (e30Var.JhCgjQRTAOCT(i) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i11 |= e30Var.WDYagTQQm9ns(j3) ? 32 : 16;
        }
        int i12 = i11;
        if (e30Var.zJPqDeoF0Os1(i12 & 1, (i12 & 19) != 18)) {
            defpackage.t21 t21Var = defpackage.j0.giKS3J6vZuNy;
            android.content.Context context = (android.content.Context) e30Var.GE9mJIPrb8gP(t21Var);
            boolean oh71FJcDz6S2 = e30Var.oh71FJcDz6S2(context) | ((i12 & 14) == 4);
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (oh71FJcDz6S2 || GcLuU6pT9wO92 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO92 = java.lang.Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
            }
            int intValue = ((java.lang.Number) GcLuU6pT9wO92).intValue();
            if (intValue == -1) {
                defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
                if (s0TASMVLSWD5 != null) {
                    final int i13 = 1;
                    s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.c20() { // from class: oo
                        @Override // defpackage.c20
                        public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj2, java.lang.Object obj3) {
                            int i14 = i13;
                            defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                            int i15 = i2;
                            long j4 = j3;
                            int i16 = i;
                            defpackage.e30 e30Var2 = (defpackage.e30) obj2;
                            ((java.lang.Integer) obj3).getClass();
                            switch (i14) {
                                case 0:
                                    defpackage.qo.giKS3J6vZuNy(i16, j4, e30Var2, defpackage.m90.IBvW5fLsPuHy(i15 | 1));
                                    break;
                                default:
                                    defpackage.qo.giKS3J6vZuNy(i16, j4, e30Var2, defpackage.m90.IBvW5fLsPuHy(i15 | 1));
                                    break;
                            }
                            return gs1Var;
                        }
                    };
                    return;
                }
                return;
            }
            android.content.Context context2 = (android.content.Context) e30Var.GE9mJIPrb8gP(t21Var);
            android.content.res.Resources resources = (android.content.res.Resources) e30Var.GE9mJIPrb8gP(defpackage.j0.fWTAfUmVKrZq);
            defpackage.c51 c51Var = (defpackage.c51) e30Var.GE9mJIPrb8gP(defpackage.j0.WDYagTQQm9ns);
            synchronized (c51Var) {
                typedValue = (android.util.TypedValue) c51Var.ZpBGe2uQfcn8.giKS3J6vZuNy(intValue);
                if (typedValue == null) {
                    typedValue = new android.util.TypedValue();
                    resources.getValue(intValue, typedValue, true);
                    defpackage.gn0 gn0Var = c51Var.ZpBGe2uQfcn8;
                    int JhCgjQRTAOCT = gn0Var.JhCgjQRTAOCT(intValue);
                    java.lang.Object[] objArr = gn0Var.fWTAfUmVKrZq;
                    java.lang.Object obj2 = objArr[JhCgjQRTAOCT];
                    gn0Var.giKS3J6vZuNy[JhCgjQRTAOCT] = intValue;
                    objArr[JhCgjQRTAOCT] = typedValue;
                }
            }
            java.lang.CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                int i14 = 4;
                if (charSequence instanceof java.lang.String ? ((java.lang.String) charSequence).endsWith(".xml") : defpackage.tg1.fhbmYuu9J3cT(charSequence, charSequence.length() - 4, ".xml", 0, 4, false)) {
                    e30Var.NkfcFfdaVTox(-1771798434);
                    android.content.res.Resources.Theme theme = context2.getTheme();
                    int i15 = typedValue.changingConfigurations;
                    defpackage.m60 m60Var = (defpackage.m60) e30Var.GE9mJIPrb8gP(defpackage.j0.JhCgjQRTAOCT);
                    defpackage.l60 l60Var = new defpackage.l60(theme, intValue);
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) m60Var.ZpBGe2uQfcn8.get(l60Var);
                    defpackage.k60 k60Var = weakReference != null ? (defpackage.k60) weakReference.get() : null;
                    if (k60Var == null) {
                        android.content.res.XmlResourceParser xml = resources.getXml(intValue);
                        int next = xml.next();
                        while (next != 2 && next != 1) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
                        }
                        if (!defpackage.ma0.QiMR8OkAhezm(xml.getName(), "vector")) {
                            defpackage.h7.w7APNrr0aGRc("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                            return;
                        }
                        android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xml);
                        defpackage.r4 r4Var = new defpackage.r4(xml);
                        int[] iArr = defpackage.la0.ZpBGe2uQfcn8;
                        android.content.res.TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
                        r4Var.fWTAfUmVKrZq(obtainAttributes.getChangingConfigurations());
                        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
                            typedArray = obtainAttributes;
                            z3 = typedArray.getBoolean(5, false);
                        } else {
                            typedArray = obtainAttributes;
                            z3 = false;
                        }
                        r4Var.fWTAfUmVKrZq(typedArray.getChangingConfigurations());
                        float giKS3J6vZuNy = r4Var.giKS3J6vZuNy(typedArray, "viewportWidth", 7, 0.0f);
                        float giKS3J6vZuNy2 = r4Var.giKS3J6vZuNy(typedArray, "viewportHeight", 8, 0.0f);
                        if (giKS3J6vZuNy <= 0.0f) {
                            throw new org.xmlpull.v1.XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                        }
                        if (giKS3J6vZuNy2 <= 0.0f) {
                            throw new org.xmlpull.v1.XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                        }
                        float dimension = typedArray.getDimension(3, 0.0f);
                        r4Var.fWTAfUmVKrZq(typedArray.getChangingConfigurations());
                        float dimension2 = typedArray.getDimension(2, 0.0f);
                        r4Var.fWTAfUmVKrZq(typedArray.getChangingConfigurations());
                        if (typedArray.hasValue(1)) {
                            android.util.TypedValue typedValue2 = new android.util.TypedValue();
                            typedArray.getValue(1, typedValue2);
                            if (typedValue2.type == 2) {
                                j2 = defpackage.pf.QiMR8OkAhezm;
                                i3 = i12;
                            } else {
                                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                                    android.util.TypedValue typedValue3 = new android.util.TypedValue();
                                    typedArray.getValue(1, typedValue3);
                                    int i16 = typedValue3.type;
                                    if (i16 == 2) {
                                        throw new java.lang.UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                                    }
                                    if (i16 < 28 || i16 > 31) {
                                        android.content.res.Resources resources2 = typedArray.getResources();
                                        i3 = i12;
                                        int resourceId = typedArray.getResourceId(1, 0);
                                        java.lang.ThreadLocal threadLocal = defpackage.bg.ZpBGe2uQfcn8;
                                        try {
                                            colorStateList = defpackage.bg.ZpBGe2uQfcn8(resources2, resources2.getXml(resourceId), theme);
                                        } catch (java.lang.Exception e) {
                                            android.util.Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                                        }
                                    } else {
                                        colorStateList = android.content.res.ColorStateList.valueOf(typedValue3.data);
                                        i3 = i12;
                                    }
                                    r4Var.fWTAfUmVKrZq(typedArray.getChangingConfigurations());
                                    j2 = colorStateList == null ? defpackage.ok0.JhCgjQRTAOCT(colorStateList.getDefaultColor()) : defpackage.pf.QiMR8OkAhezm;
                                } else {
                                    i3 = i12;
                                }
                                colorStateList = null;
                                r4Var.fWTAfUmVKrZq(typedArray.getChangingConfigurations());
                                if (colorStateList == null) {
                                }
                            }
                        } else {
                            i3 = i12;
                            j2 = defpackage.pf.QiMR8OkAhezm;
                        }
                        long j4 = j2;
                        int i17 = typedArray.getInt(6, -1);
                        r4Var.fWTAfUmVKrZq(typedArray.getChangingConfigurations());
                        if (i17 != -1) {
                            if (i17 == 3) {
                                i4 = 3;
                            } else if (i17 != 5) {
                                if (i17 != 9) {
                                    switch (i17) {
                                        case 14:
                                            i4 = 13;
                                            break;
                                        case 15:
                                            i4 = 14;
                                            break;
                                        case 16:
                                            i4 = 12;
                                            break;
                                    }
                                } else {
                                    i4 = 9;
                                }
                            }
                            float f = dimension / resources.getDisplayMetrics().density;
                            float f2 = dimension2 / resources.getDisplayMetrics().density;
                            typedArray.recycle();
                            defpackage.i60 i60Var = new defpackage.i60(null, f, f2, giKS3J6vZuNy, giKS3J6vZuNy2, j4, i4, z3, 1);
                            i5 = 0;
                            while (true) {
                                if (xml.getEventType() == 1) {
                                    z = (xml.getDepth() < 1 && xml.getEventType() == 3) ? true : true;
                                    java.util.List list = defpackage.av.WDYagTQQm9ns;
                                    org.xmlpull.v1.XmlPullParser xmlPullParser = r4Var.ZpBGe2uQfcn8;
                                    defpackage.ARgw6UjYb9W7 aRgw6UjYb9W7 = r4Var.fWTAfUmVKrZq;
                                    int i18 = i5;
                                    int eventType = xmlPullParser.getEventType();
                                    int i19 = i15;
                                    if (eventType != 2) {
                                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                            int i20 = i18 + 1;
                                            for (int i21 = 0; i21 < i20; i21++) {
                                                java.util.ArrayList arrayList = i60Var.e6mdH7fiFuta;
                                                if (i60Var.Ns0WNyEWdPsk) {
                                                    defpackage.e80.giKS3J6vZuNy("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                defpackage.h60 h60Var = (defpackage.h60) arrayList.remove(arrayList.size() - 1);
                                                ((defpackage.h60) arrayList.get(arrayList.size() - 1)).GE9mJIPrb8gP.add(new defpackage.at1(h60Var.ZpBGe2uQfcn8, h60Var.giKS3J6vZuNy, h60Var.fWTAfUmVKrZq, h60Var.JhCgjQRTAOCT, h60Var.WDYagTQQm9ns, h60Var.oh71FJcDz6S2, h60Var.QiMR8OkAhezm, h60Var.P05cfTpS5W5L, h60Var.e6mdH7fiFuta, h60Var.GE9mJIPrb8gP));
                                            }
                                            xmlResourceParser = xml;
                                            c = '\t';
                                            i18 = 0;
                                            xmlResourceParser.next();
                                            i5 = i18;
                                            i15 = i19;
                                            xml = xmlResourceParser;
                                        }
                                        xmlResourceParser = xml;
                                    } else {
                                        java.lang.String name = xmlPullParser.getName();
                                        if (name != null) {
                                            int hashCode = name.hashCode();
                                            xmlResourceParser = xml;
                                            if (hashCode != -1649314686) {
                                                if (hashCode != 3433509) {
                                                    if (hashCode == 98629247 && name.equals("group")) {
                                                        int[] iArr2 = defpackage.la0.giKS3J6vZuNy;
                                                        android.content.res.TypedArray obtainAttributes2 = theme == null ? resources.obtainAttributes(asAttributeSet, iArr2) : theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                                                        r4Var.fWTAfUmVKrZq(obtainAttributes2.getChangingConfigurations());
                                                        float giKS3J6vZuNy3 = r4Var.giKS3J6vZuNy(obtainAttributes2, "rotation", 5, 0.0f);
                                                        float f3 = obtainAttributes2.getFloat(1, 0.0f);
                                                        r4Var.fWTAfUmVKrZq(obtainAttributes2.getChangingConfigurations());
                                                        float f4 = obtainAttributes2.getFloat(2, 0.0f);
                                                        r4Var.fWTAfUmVKrZq(obtainAttributes2.getChangingConfigurations());
                                                        float giKS3J6vZuNy4 = r4Var.giKS3J6vZuNy(obtainAttributes2, "scaleX", 3, 1.0f);
                                                        float giKS3J6vZuNy5 = r4Var.giKS3J6vZuNy(obtainAttributes2, "scaleY", i14, 1.0f);
                                                        float giKS3J6vZuNy6 = r4Var.giKS3J6vZuNy(obtainAttributes2, "translateX", 6, 0.0f);
                                                        float giKS3J6vZuNy7 = r4Var.giKS3J6vZuNy(obtainAttributes2, "translateY", 7, 0.0f);
                                                        java.lang.String string = obtainAttributes2.getString(0);
                                                        r4Var.fWTAfUmVKrZq(obtainAttributes2.getChangingConfigurations());
                                                        java.lang.String str = string == null ? "" : string;
                                                        obtainAttributes2.recycle();
                                                        int i22 = defpackage.bt1.ZpBGe2uQfcn8;
                                                        if (i60Var.Ns0WNyEWdPsk) {
                                                            defpackage.e80.giKS3J6vZuNy("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                        }
                                                        i60Var.e6mdH7fiFuta.add(new defpackage.h60(str, giKS3J6vZuNy3, f3, f4, giKS3J6vZuNy4, giKS3J6vZuNy5, giKS3J6vZuNy6, giKS3J6vZuNy7, list, 512));
                                                    }
                                                } else if (name.equals("path")) {
                                                    int[] iArr3 = defpackage.la0.fWTAfUmVKrZq;
                                                    if (theme == null) {
                                                        obtainStyledAttributes2 = resources.obtainAttributes(asAttributeSet, iArr3);
                                                        i7 = 0;
                                                    } else {
                                                        i7 = 0;
                                                        obtainStyledAttributes2 = theme.obtainStyledAttributes(asAttributeSet, iArr3, 0, 0);
                                                    }
                                                    r4Var.fWTAfUmVKrZq(obtainStyledAttributes2.getChangingConfigurations());
                                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                                        defpackage.h7.w7APNrr0aGRc("No path data available");
                                                        return;
                                                    }
                                                    java.lang.String string2 = obtainStyledAttributes2.getString(i7);
                                                    r4Var.fWTAfUmVKrZq(obtainStyledAttributes2.getChangingConfigurations());
                                                    java.lang.String str2 = string2 == null ? "" : string2;
                                                    java.lang.String string3 = obtainStyledAttributes2.getString(2);
                                                    r4Var.fWTAfUmVKrZq(obtainStyledAttributes2.getChangingConfigurations());
                                                    if (string3 == null) {
                                                        int i23 = defpackage.bt1.ZpBGe2uQfcn8;
                                                    } else {
                                                        list = defpackage.ARgw6UjYb9W7.ZpBGe2uQfcn8(aRgw6UjYb9W7, string3);
                                                    }
                                                    java.util.List list2 = list;
                                                    defpackage.wg ZpBGe2uQfcn82 = r4Var.ZpBGe2uQfcn8(obtainStyledAttributes2, theme, "fillColor", 1);
                                                    float giKS3J6vZuNy8 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                                    int i24 = !defpackage.n70.w7APNrr0aGRc(r4Var.ZpBGe2uQfcn8, "strokeLineCap") ? -1 : obtainStyledAttributes2.getInt(8, -1);
                                                    r4Var.fWTAfUmVKrZq(obtainStyledAttributes2.getChangingConfigurations());
                                                    if (i24 != 0) {
                                                        if (i24 == 1) {
                                                            i8 = 1;
                                                        } else if (i24 == 2) {
                                                            i8 = 2;
                                                        }
                                                        i9 = defpackage.n70.w7APNrr0aGRc(r4Var.ZpBGe2uQfcn8, "strokeLineJoin") ? -1 : obtainStyledAttributes2.getInt(9, -1);
                                                        r4Var.fWTAfUmVKrZq(obtainStyledAttributes2.getChangingConfigurations());
                                                        if (i9 != 0) {
                                                            if (i9 == 1) {
                                                                i10 = 1;
                                                            } else if (i9 == 2) {
                                                                i10 = 2;
                                                            }
                                                            float giKS3J6vZuNy9 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                            defpackage.wg ZpBGe2uQfcn83 = r4Var.ZpBGe2uQfcn8(obtainStyledAttributes2, theme, "strokeColor", 3);
                                                            float giKS3J6vZuNy10 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                            float giKS3J6vZuNy11 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                            float giKS3J6vZuNy12 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                            float giKS3J6vZuNy13 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                            float giKS3J6vZuNy14 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                            int i25 = !defpackage.n70.w7APNrr0aGRc(r4Var.ZpBGe2uQfcn8, "fillType") ? 0 : obtainStyledAttributes2.getInt(13, 0);
                                                            r4Var.fWTAfUmVKrZq(obtainStyledAttributes2.getChangingConfigurations());
                                                            obtainStyledAttributes2.recycle();
                                                            android.graphics.Shader shader = (android.graphics.Shader) ZpBGe2uQfcn82.giKS3J6vZuNy;
                                                            int i26 = ZpBGe2uQfcn82.ZpBGe2uQfcn8;
                                                            defpackage.vb wbVar = (shader == null && i26 == 0) ? null : shader != null ? new defpackage.wb(shader) : new defpackage.lf1(defpackage.ok0.JhCgjQRTAOCT(i26));
                                                            android.graphics.Shader shader2 = (android.graphics.Shader) ZpBGe2uQfcn83.giKS3J6vZuNy;
                                                            int i27 = ZpBGe2uQfcn83.ZpBGe2uQfcn8;
                                                            defpackage.vb wbVar2 = (shader2 == null && i27 == 0) ? null : shader2 == null ? new defpackage.wb(shader2) : new defpackage.lf1(defpackage.ok0.JhCgjQRTAOCT(i27));
                                                            int i28 = i25 == 0 ? 0 : 1;
                                                            if (i60Var.Ns0WNyEWdPsk) {
                                                                defpackage.e80.giKS3J6vZuNy("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                            }
                                                            ((defpackage.h60) i60Var.e6mdH7fiFuta.get(r0.size() - 1)).GE9mJIPrb8gP.add(new defpackage.et1(str2, list2, i28, wbVar, giKS3J6vZuNy8, wbVar2, giKS3J6vZuNy10, giKS3J6vZuNy11, i8, i10, giKS3J6vZuNy9, giKS3J6vZuNy14, giKS3J6vZuNy12, giKS3J6vZuNy13));
                                                            i14 = 4;
                                                            c = '\t';
                                                            xmlResourceParser.next();
                                                            i5 = i18;
                                                            i15 = i19;
                                                            xml = xmlResourceParser;
                                                        }
                                                        i10 = 0;
                                                        float giKS3J6vZuNy92 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                        defpackage.wg ZpBGe2uQfcn832 = r4Var.ZpBGe2uQfcn8(obtainStyledAttributes2, theme, "strokeColor", 3);
                                                        float giKS3J6vZuNy102 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                        float giKS3J6vZuNy112 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                        float giKS3J6vZuNy122 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                        float giKS3J6vZuNy132 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                        float giKS3J6vZuNy142 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                        if (!defpackage.n70.w7APNrr0aGRc(r4Var.ZpBGe2uQfcn8, "fillType")) {
                                                        }
                                                        r4Var.fWTAfUmVKrZq(obtainStyledAttributes2.getChangingConfigurations());
                                                        obtainStyledAttributes2.recycle();
                                                        android.graphics.Shader shader3 = (android.graphics.Shader) ZpBGe2uQfcn82.giKS3J6vZuNy;
                                                        int i262 = ZpBGe2uQfcn82.ZpBGe2uQfcn8;
                                                        if (shader3 == null) {
                                                            android.graphics.Shader shader22 = (android.graphics.Shader) ZpBGe2uQfcn832.giKS3J6vZuNy;
                                                            int i272 = ZpBGe2uQfcn832.ZpBGe2uQfcn8;
                                                            if (shader22 == null) {
                                                                if (i25 == 0) {
                                                                }
                                                                if (i60Var.Ns0WNyEWdPsk) {
                                                                }
                                                                ((defpackage.h60) i60Var.e6mdH7fiFuta.get(r0.size() - 1)).GE9mJIPrb8gP.add(new defpackage.et1(str2, list2, i28, wbVar, giKS3J6vZuNy8, wbVar2, giKS3J6vZuNy102, giKS3J6vZuNy112, i8, i10, giKS3J6vZuNy92, giKS3J6vZuNy142, giKS3J6vZuNy122, giKS3J6vZuNy132));
                                                                i14 = 4;
                                                                c = '\t';
                                                                xmlResourceParser.next();
                                                                i5 = i18;
                                                                i15 = i19;
                                                                xml = xmlResourceParser;
                                                            }
                                                            if (i25 == 0) {
                                                            }
                                                            if (i60Var.Ns0WNyEWdPsk) {
                                                            }
                                                            ((defpackage.h60) i60Var.e6mdH7fiFuta.get(r0.size() - 1)).GE9mJIPrb8gP.add(new defpackage.et1(str2, list2, i28, wbVar, giKS3J6vZuNy8, wbVar2, giKS3J6vZuNy102, giKS3J6vZuNy112, i8, i10, giKS3J6vZuNy92, giKS3J6vZuNy142, giKS3J6vZuNy122, giKS3J6vZuNy132));
                                                            i14 = 4;
                                                            c = '\t';
                                                            xmlResourceParser.next();
                                                            i5 = i18;
                                                            i15 = i19;
                                                            xml = xmlResourceParser;
                                                        }
                                                        android.graphics.Shader shader222 = (android.graphics.Shader) ZpBGe2uQfcn832.giKS3J6vZuNy;
                                                        int i2722 = ZpBGe2uQfcn832.ZpBGe2uQfcn8;
                                                        if (shader222 == null) {
                                                        }
                                                        if (i25 == 0) {
                                                        }
                                                        if (i60Var.Ns0WNyEWdPsk) {
                                                        }
                                                        ((defpackage.h60) i60Var.e6mdH7fiFuta.get(r0.size() - 1)).GE9mJIPrb8gP.add(new defpackage.et1(str2, list2, i28, wbVar, giKS3J6vZuNy8, wbVar2, giKS3J6vZuNy102, giKS3J6vZuNy112, i8, i10, giKS3J6vZuNy92, giKS3J6vZuNy142, giKS3J6vZuNy122, giKS3J6vZuNy132));
                                                        i14 = 4;
                                                        c = '\t';
                                                        xmlResourceParser.next();
                                                        i5 = i18;
                                                        i15 = i19;
                                                        xml = xmlResourceParser;
                                                    }
                                                    i8 = 0;
                                                    if (defpackage.n70.w7APNrr0aGRc(r4Var.ZpBGe2uQfcn8, "strokeLineJoin")) {
                                                    }
                                                    r4Var.fWTAfUmVKrZq(obtainStyledAttributes2.getChangingConfigurations());
                                                    if (i9 != 0) {
                                                    }
                                                    i10 = 0;
                                                    float giKS3J6vZuNy922 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                    defpackage.wg ZpBGe2uQfcn8322 = r4Var.ZpBGe2uQfcn8(obtainStyledAttributes2, theme, "strokeColor", 3);
                                                    float giKS3J6vZuNy1022 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                    float giKS3J6vZuNy1122 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                    float giKS3J6vZuNy1222 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                    float giKS3J6vZuNy1322 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                    float giKS3J6vZuNy1422 = r4Var.giKS3J6vZuNy(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                    if (!defpackage.n70.w7APNrr0aGRc(r4Var.ZpBGe2uQfcn8, "fillType")) {
                                                    }
                                                    r4Var.fWTAfUmVKrZq(obtainStyledAttributes2.getChangingConfigurations());
                                                    obtainStyledAttributes2.recycle();
                                                    android.graphics.Shader shader32 = (android.graphics.Shader) ZpBGe2uQfcn82.giKS3J6vZuNy;
                                                    int i2622 = ZpBGe2uQfcn82.ZpBGe2uQfcn8;
                                                    if (shader32 == null) {
                                                    }
                                                    android.graphics.Shader shader2222 = (android.graphics.Shader) ZpBGe2uQfcn8322.giKS3J6vZuNy;
                                                    int i27222 = ZpBGe2uQfcn8322.ZpBGe2uQfcn8;
                                                    if (shader2222 == null) {
                                                    }
                                                    if (i25 == 0) {
                                                    }
                                                    if (i60Var.Ns0WNyEWdPsk) {
                                                    }
                                                    ((defpackage.h60) i60Var.e6mdH7fiFuta.get(r0.size() - 1)).GE9mJIPrb8gP.add(new defpackage.et1(str2, list2, i28, wbVar, giKS3J6vZuNy8, wbVar2, giKS3J6vZuNy1022, giKS3J6vZuNy1122, i8, i10, giKS3J6vZuNy922, giKS3J6vZuNy1422, giKS3J6vZuNy1222, giKS3J6vZuNy1322));
                                                    i14 = 4;
                                                    c = '\t';
                                                    xmlResourceParser.next();
                                                    i5 = i18;
                                                    i15 = i19;
                                                    xml = xmlResourceParser;
                                                }
                                                i14 = 4;
                                                c = '\t';
                                                xmlResourceParser.next();
                                                i5 = i18;
                                                i15 = i19;
                                                xml = xmlResourceParser;
                                            } else {
                                                c = '\t';
                                                if (name.equals("clip-path")) {
                                                    int[] iArr4 = defpackage.la0.JhCgjQRTAOCT;
                                                    if (theme == null) {
                                                        obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr4);
                                                        i6 = 0;
                                                    } else {
                                                        i6 = 0;
                                                        obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr4, 0, 0);
                                                    }
                                                    r4Var.fWTAfUmVKrZq(obtainStyledAttributes.getChangingConfigurations());
                                                    java.lang.String string4 = obtainStyledAttributes.getString(i6);
                                                    r4Var.fWTAfUmVKrZq(obtainStyledAttributes.getChangingConfigurations());
                                                    java.lang.String str3 = string4 == null ? "" : string4;
                                                    java.lang.String string5 = obtainStyledAttributes.getString(1);
                                                    r4Var.fWTAfUmVKrZq(obtainStyledAttributes.getChangingConfigurations());
                                                    if (string5 == null) {
                                                        int i29 = defpackage.bt1.ZpBGe2uQfcn8;
                                                    } else {
                                                        list = defpackage.ARgw6UjYb9W7.ZpBGe2uQfcn8(aRgw6UjYb9W7, string5);
                                                    }
                                                    java.util.List list3 = list;
                                                    obtainStyledAttributes.recycle();
                                                    if (i60Var.Ns0WNyEWdPsk) {
                                                        defpackage.e80.giKS3J6vZuNy("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                    }
                                                    i60Var.e6mdH7fiFuta.add(new defpackage.h60(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list3, 512));
                                                    i18++;
                                                }
                                                xmlResourceParser.next();
                                                i5 = i18;
                                                i15 = i19;
                                                xml = xmlResourceParser;
                                            }
                                        }
                                        xmlResourceParser = xml;
                                    }
                                    c = '\t';
                                    xmlResourceParser.next();
                                    i5 = i18;
                                    i15 = i19;
                                    xml = xmlResourceParser;
                                }
                            }
                            defpackage.k60 k60Var2 = new defpackage.k60(i60Var.giKS3J6vZuNy(), i15 | r4Var.giKS3J6vZuNy);
                            m60Var.ZpBGe2uQfcn8.put(l60Var, new java.lang.ref.WeakReference(k60Var2));
                            k60Var = k60Var2;
                        }
                        i4 = 5;
                        float f5 = dimension / resources.getDisplayMetrics().density;
                        float f22 = dimension2 / resources.getDisplayMetrics().density;
                        typedArray.recycle();
                        defpackage.i60 i60Var2 = new defpackage.i60(null, f5, f22, giKS3J6vZuNy, giKS3J6vZuNy2, j4, i4, z3, 1);
                        i5 = 0;
                        while (true) {
                            if (xml.getEventType() == 1) {
                            }
                            xmlResourceParser.next();
                            i5 = i18;
                            i15 = i19;
                            xml = xmlResourceParser;
                        }
                        defpackage.k60 k60Var22 = new defpackage.k60(i60Var2.giKS3J6vZuNy(), i15 | r4Var.giKS3J6vZuNy);
                        m60Var.ZpBGe2uQfcn8.put(l60Var, new java.lang.ref.WeakReference(k60Var22));
                        k60Var = k60Var22;
                    } else {
                        i3 = i12;
                        z = true;
                    }
                    faVar = defpackage.n70.blKFvluuDQOf(k60Var.ZpBGe2uQfcn8, e30Var);
                    e30Var.XntWc4eZSQ8j(false);
                    obj = null;
                    z2 = (i3 & 112) != 32 ? z : false;
                    GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                    if (!z2 || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                        if (j != 16) {
                            j3 = j;
                            gaVar = obj;
                        } else {
                            j3 = j;
                            gaVar = new defpackage.ga(5, j3);
                        }
                        e30Var.EgL5gQQnyJKX(gaVar);
                        GcLuU6pT9wO9 = gaVar;
                    } else {
                        j3 = j;
                    }
                    defpackage.ab.ZpBGe2uQfcn8(defpackage.vx1.OcTWLQzke1i2(defpackage.ce1.oh71FJcDz6S2(defpackage.fl.WDYagTQQm9ns), faVar, (defpackage.ga) GcLuU6pT9wO9), e30Var, 0);
                }
            }
            i3 = i12;
            z = true;
            e30Var.NkfcFfdaVTox(-1771643000);
            boolean oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(context2.getTheme()) | e30Var.oh71FJcDz6S2(charSequence) | e30Var.JhCgjQRTAOCT(intValue);
            java.lang.Object GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
            if (oh71FJcDz6S22 || GcLuU6pT9wO93 == defpackage.cj.ZpBGe2uQfcn8) {
                obj = null;
                try {
                    android.graphics.drawable.Drawable drawable = resources.getDrawable(intValue, null);
                    drawable.getClass();
                    w1Var = new defpackage.w1(((android.graphics.drawable.BitmapDrawable) drawable).getBitmap());
                    e30Var.EgL5gQQnyJKX(w1Var);
                } catch (java.lang.Exception e2) {
                    throw new defpackage.vg("Error attempting to load resource: " + ((java.lang.Object) charSequence), e2);
                }
            } else {
                w1Var = GcLuU6pT9wO93;
                obj = null;
            }
            faVar = new defpackage.fa((defpackage.w1) w1Var);
            e30Var.XntWc4eZSQ8j(false);
            if ((i3 & 112) != 32) {
            }
            GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (z2) {
            }
            if (j != 16) {
            }
            e30Var.EgL5gQQnyJKX(gaVar);
            GcLuU6pT9wO9 = gaVar;
            defpackage.ab.ZpBGe2uQfcn8(defpackage.vx1.OcTWLQzke1i2(defpackage.ce1.oh71FJcDz6S2(defpackage.fl.WDYagTQQm9ns), faVar, (defpackage.ga) GcLuU6pT9wO9), e30Var, 0);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD52 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            final int i30 = 0;
            s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.c20() { // from class: oo
                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj22, java.lang.Object obj3) {
                    int i142 = i30;
                    defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                    int i152 = i2;
                    long j42 = j3;
                    int i162 = i;
                    defpackage.e30 e30Var2 = (defpackage.e30) obj22;
                    ((java.lang.Integer) obj3).getClass();
                    switch (i142) {
                        case 0:
                            defpackage.qo.giKS3J6vZuNy(i162, j42, e30Var2, defpackage.m90.IBvW5fLsPuHy(i152 | 1));
                            break;
                        default:
                            defpackage.qo.giKS3J6vZuNy(i162, j42, e30Var2, defpackage.m90.IBvW5fLsPuHy(i152 | 1));
                            break;
                    }
                    return gs1Var;
                }
            };
        }
    }
}
