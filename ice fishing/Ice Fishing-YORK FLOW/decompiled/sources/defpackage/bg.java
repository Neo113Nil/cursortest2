package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class bg {
    public static final java.lang.ThreadLocal ZpBGe2uQfcn8 = new java.lang.ThreadLocal();

    public static android.content.res.ColorStateList ZpBGe2uQfcn8(android.content.res.Resources resources, android.content.res.XmlResourceParser xmlResourceParser, android.content.res.Resources.Theme theme) {
        int next;
        android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return giKS3J6vZuNy(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0139  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.content.res.ColorStateList giKS3J6vZuNy(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
        int depth;
        int color;
        float f;
        int attributeCount;
        int i;
        char c;
        int alpha;
        int i2;
        int[] iArr;
        int i3;
        int w7APNrr0aGRc;
        float f2;
        int i4;
        float cbrt;
        int i5;
        android.util.TypedValue typedValue;
        ?? r0 = resources;
        android.util.AttributeSet attributeSet2 = attributeSet;
        android.content.res.Resources.Theme theme2 = theme;
        java.lang.String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = defpackage.x21.ZpBGe2uQfcn8;
                ?? obtainAttributes = theme2 == null ? r0.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i6, i6);
                int resourceId = obtainAttributes.getResourceId(i6, -1);
                if (resourceId != -1) {
                    java.lang.ThreadLocal threadLocal = ZpBGe2uQfcn8;
                    android.util.TypedValue typedValue2 = (android.util.TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new android.util.TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r0.getValue(resourceId, typedValue, z);
                    int i8 = typedValue.type;
                    if (i8 < 28 || i8 > 31) {
                        try {
                            color = ZpBGe2uQfcn8(r0, r0.getXml(resourceId), theme2).getDefaultColor();
                        } catch (java.lang.Exception unused) {
                            color = obtainAttributes.getColor(i6, -65281);
                        }
                        f = !obtainAttributes.hasValue(z) ? obtainAttributes.getFloat(z, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c2 = z;
                        float f3 = (android.os.Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i = i6;
                        int i9 = i;
                        while (i < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != com.ice.fishing.wolberta.R.attr.alpha && attributeNameResource != com.ice.fishing.wolberta.R.attr.lStar) {
                                int i10 = i9 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i9] = attributeNameResource;
                                i9 = i10;
                            }
                            i++;
                        }
                        int[] trimStateSet = android.util.StateSet.trimStateSet(iArr5, i9);
                        float f4 = 100.0f;
                        c = (f3 >= 0.0f || f3 > 100.0f) ? (char) 0 : c2;
                        if (f == 1.0f || c != 0) {
                            alpha = (int) ((android.graphics.Color.alpha(color) * f) + 0.5f);
                            if (alpha >= 0) {
                                i2 = 0;
                            } else {
                                i2 = 255;
                                if (alpha <= 255) {
                                    i2 = alpha;
                                }
                            }
                            if (c == 0) {
                                defpackage.xc ZpBGe2uQfcn82 = defpackage.xc.ZpBGe2uQfcn8(color);
                                float f5 = ZpBGe2uQfcn82.ZpBGe2uQfcn8;
                                float f6 = ZpBGe2uQfcn82.giKS3J6vZuNy;
                                defpackage.tu1 tu1Var = defpackage.tu1.Ns0WNyEWdPsk;
                                if (f6 < 1.0d || java.lang.Math.round(f3) <= 0.0d || java.lang.Math.round(f3) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i3 = depth2;
                                    w7APNrr0aGRc = defpackage.ma0.w7APNrr0aGRc(f3);
                                } else {
                                    float min = f5 < 0.0f ? 0.0f : java.lang.Math.min(360.0f, f5);
                                    float f7 = 0.0f;
                                    float f8 = f6;
                                    char c3 = c2;
                                    defpackage.xc xcVar = null;
                                    while (true) {
                                        if (java.lang.Math.abs(f7 - f6) >= 0.4f) {
                                            float f9 = 1000.0f;
                                            float f10 = f4;
                                            float f11 = 0.0f;
                                            float f12 = 1000.0f;
                                            defpackage.xc xcVar2 = null;
                                            while (true) {
                                                if (java.lang.Math.abs(f11 - f10) <= 0.01f) {
                                                    iArr = trimStateSet;
                                                    i3 = depth2;
                                                    f2 = f4;
                                                    break;
                                                }
                                                f2 = f4;
                                                float f13 = ((f10 - f11) / 2.0f) + f11;
                                                iArr = trimStateSet;
                                                int fWTAfUmVKrZq = defpackage.xc.giKS3J6vZuNy(f13, f8, min).fWTAfUmVKrZq(defpackage.tu1.Ns0WNyEWdPsk);
                                                float IJ0hOnjhPOri = defpackage.ma0.IJ0hOnjhPOri(android.graphics.Color.red(fWTAfUmVKrZq));
                                                float IJ0hOnjhPOri2 = defpackage.ma0.IJ0hOnjhPOri(android.graphics.Color.green(fWTAfUmVKrZq));
                                                float IJ0hOnjhPOri3 = defpackage.ma0.IJ0hOnjhPOri(android.graphics.Color.blue(fWTAfUmVKrZq));
                                                float[] fArr = defpackage.ma0.fNwYGHIYeJcR[c2];
                                                float f14 = ((IJ0hOnjhPOri3 * fArr[2]) + ((IJ0hOnjhPOri2 * fArr[c2]) + (IJ0hOnjhPOri * fArr[0]))) / f2;
                                                if (f14 <= 0.008856452f) {
                                                    cbrt = f14 * 903.2963f;
                                                    i4 = fWTAfUmVKrZq;
                                                } else {
                                                    i4 = fWTAfUmVKrZq;
                                                    cbrt = (((float) java.lang.Math.cbrt(f14)) * 116.0f) - 16.0f;
                                                }
                                                float abs = java.lang.Math.abs(f3 - cbrt);
                                                if (abs < 0.2f) {
                                                    defpackage.xc ZpBGe2uQfcn83 = defpackage.xc.ZpBGe2uQfcn8(i4);
                                                    defpackage.xc giKS3J6vZuNy = defpackage.xc.giKS3J6vZuNy(ZpBGe2uQfcn83.fWTAfUmVKrZq, ZpBGe2uQfcn83.giKS3J6vZuNy, min);
                                                    float f15 = ZpBGe2uQfcn83.JhCgjQRTAOCT - giKS3J6vZuNy.JhCgjQRTAOCT;
                                                    float f16 = ZpBGe2uQfcn83.WDYagTQQm9ns - giKS3J6vZuNy.WDYagTQQm9ns;
                                                    float f17 = ZpBGe2uQfcn83.oh71FJcDz6S2 - giKS3J6vZuNy.oh71FJcDz6S2;
                                                    i3 = depth2;
                                                    float pow = (float) (java.lang.Math.pow(java.lang.Math.sqrt((f17 * f17) + (f16 * f16) + (f15 * f15)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f12 = pow;
                                                        f9 = abs;
                                                        xcVar2 = ZpBGe2uQfcn83;
                                                    }
                                                } else {
                                                    i3 = depth2;
                                                }
                                                if (f9 == 0.0f && f12 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f3) {
                                                    f11 = f13;
                                                } else {
                                                    f10 = f13;
                                                }
                                                f4 = f2;
                                                trimStateSet = iArr;
                                                depth2 = i3;
                                            }
                                            defpackage.xc xcVar3 = xcVar2;
                                            if (c3 == 0) {
                                                if (xcVar3 == null) {
                                                    f6 = f8;
                                                } else {
                                                    xcVar = xcVar3;
                                                    f7 = f8;
                                                }
                                                f8 = ((f6 - f7) / 2.0f) + f7;
                                                f4 = f2;
                                                trimStateSet = iArr;
                                                depth2 = i3;
                                            } else {
                                                if (xcVar3 != null) {
                                                    w7APNrr0aGRc = xcVar3.fWTAfUmVKrZq(tu1Var);
                                                    break;
                                                }
                                                f8 = ((f6 - f7) / 2.0f) + f7;
                                                f4 = f2;
                                                trimStateSet = iArr;
                                                depth2 = i3;
                                                c3 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i3 = depth2;
                                            w7APNrr0aGRc = xcVar == null ? defpackage.ma0.w7APNrr0aGRc(f3) : xcVar.fWTAfUmVKrZq(tu1Var);
                                        }
                                    }
                                }
                                color = w7APNrr0aGRc;
                            } else {
                                iArr = trimStateSet;
                                i3 = depth2;
                            }
                            color = (16777215 & color) | (i2 << 24);
                        } else {
                            iArr = trimStateSet;
                            i3 = depth2;
                        }
                        i5 = i7 + 1;
                        if (i5 > iArr3.length) {
                            int[] iArr6 = new int[i7 <= 4 ? 8 : i7 * 2];
                            java.lang.System.arraycopy(iArr3, 0, iArr6, 0, i7);
                            iArr3 = iArr6;
                        }
                        iArr3[i7] = color;
                        if (i5 > iArr2.length) {
                            ?? r1 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(iArr2.getClass().getComponentType(), i7 > 4 ? i7 * 2 : 8);
                            java.lang.System.arraycopy(iArr2, 0, r1, 0, i7);
                            iArr2 = r1;
                        }
                        iArr2[i7] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i7 = i5;
                        z = c2;
                        depth2 = i3;
                        i6 = 0;
                        r0 = resources;
                    }
                }
                color = obtainAttributes.getColor(i6, -65281);
                if (!obtainAttributes.hasValue(z)) {
                }
                char c22 = z;
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i = i6;
                int i92 = i;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = android.util.StateSet.trimStateSet(iArr52, i92);
                float f42 = 100.0f;
                if (f3 >= 0.0f) {
                }
                if (f == 1.0f) {
                }
                alpha = (int) ((android.graphics.Color.alpha(color) * f) + 0.5f);
                if (alpha >= 0) {
                }
                if (c == 0) {
                }
                color = (16777215 & color) | (i2 << 24);
                i5 = i7 + 1;
                if (i5 > iArr3.length) {
                }
                iArr3[i7] = color;
                if (i5 > iArr2.length) {
                }
                iArr2[i7] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i7 = i5;
                z = c22;
                depth2 = i3;
                i6 = 0;
                r0 = resources;
            } else {
                r0 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z = z;
                depth2 = depth2;
                i6 = 0;
            }
        }
        int[] iArr7 = new int[i7];
        int[][] iArr8 = new int[i7][];
        java.lang.System.arraycopy(iArr3, 0, iArr7, 0, i7);
        java.lang.System.arraycopy(iArr2, 0, iArr8, 0, i7);
        return new android.content.res.ColorStateList(iArr8, iArr7);
    }
}
