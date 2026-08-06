package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wg {
    public int ZpBGe2uQfcn8;
    public java.lang.Object giKS3J6vZuNy;

    public /* synthetic */ wg(int i, java.lang.Object obj) {
        this.giKS3J6vZuNy = obj;
        this.ZpBGe2uQfcn8 = i;
    }

    public static void JhCgjQRTAOCT(java.lang.String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = defpackage.ma0.fNwYGHIYeJcR(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        android.util.Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            android.database.sqlite.SQLiteDatabase.deleteDatabase(new java.io.File(str));
        } catch (java.lang.Exception e) {
            android.util.Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e2, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static defpackage.wg fWTAfUmVKrZq(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        int next;
        int i2;
        int i3;
        float f;
        float f2;
        java.lang.Object radialGradient;
        int i4;
        android.content.res.TypedArray obtainStyledAttributes;
        android.content.res.XmlResourceParser xml = resources.getXml(i);
        android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        java.lang.String name = xml.getName();
        name.getClass();
        java.lang.Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new defpackage.wg(defpackage.bg.giKS3J6vZuNy(resources, xml, asAttributeSet, theme).getDefaultColor(), obj);
            }
            throw new org.xmlpull.v1.XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        java.lang.String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new org.xmlpull.v1.XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = defpackage.x21.WDYagTQQm9ns;
        android.content.res.TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? obtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? obtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? obtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? obtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? obtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? obtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? obtainAttributes.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? obtainAttributes.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? obtainAttributes.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            i2 = 0;
            i3 = obtainAttributes.getColor(1, 0);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i6 = 1;
        int i7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? obtainAttributes.getInt(6, i2) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? obtainAttributes.getFloat(5, 0.0f) : 0.0f;
        obtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        java.util.ArrayList arrayList = new java.util.ArrayList(20);
        float f10 = f9;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f3;
            if (next2 == i6) {
                f2 = f4;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f4;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = defpackage.x21.oh71FJcDz6S2;
                if (theme == null) {
                    obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr2);
                    i4 = 0;
                } else {
                    i4 = 0;
                    obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                }
                boolean hasValue = obtainStyledAttributes.hasValue(i4);
                boolean hasValue2 = obtainStyledAttributes.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = obtainStyledAttributes.getColor(0, 0);
                float f11 = obtainStyledAttributes.getFloat(1, 0.0f);
                obtainStyledAttributes.recycle();
                arrayList2.add(java.lang.Integer.valueOf(color3));
                arrayList.add(java.lang.Float.valueOf(f11));
            }
            f3 = f;
            f4 = f2;
            i6 = 1;
        }
        defpackage.rc rcVar = arrayList2.size() > 0 ? new defpackage.rc(arrayList2, arrayList) : null;
        if (rcVar == null) {
            rcVar = z ? new defpackage.rc(color, color2, i3) : new defpackage.rc(color, i3);
        }
        if (i5 != 1) {
            if (i5 != 2) {
                radialGradient = new android.graphics.LinearGradient(f, f2, f5, f6, rcVar.ZpBGe2uQfcn8, rcVar.giKS3J6vZuNy, i7 != 1 ? i7 != 2 ? android.graphics.Shader.TileMode.CLAMP : android.graphics.Shader.TileMode.MIRROR : android.graphics.Shader.TileMode.REPEAT);
            } else {
                radialGradient = new android.graphics.SweepGradient(f7, f8, rcVar.ZpBGe2uQfcn8, rcVar.giKS3J6vZuNy);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new android.graphics.RadialGradient(f7, f8, f10, rcVar.ZpBGe2uQfcn8, rcVar.giKS3J6vZuNy, i7 != 1 ? i7 != 2 ? android.graphics.Shader.TileMode.CLAMP : android.graphics.Shader.TileMode.MIRROR : android.graphics.Shader.TileMode.REPEAT);
        }
        return new defpackage.wg(0, radialGradient);
    }

    public void WDYagTQQm9ns(defpackage.e10 e10Var, int i, int i2) {
        ((defpackage.f61) this.giKS3J6vZuNy).JhCgjQRTAOCT(new defpackage.xh1(e10Var), i, i2);
    }

    public void ZpBGe2uQfcn8(long j) {
        if (giKS3J6vZuNy(j)) {
            return;
        }
        int i = this.ZpBGe2uQfcn8;
        long[] jArr = (long[]) this.giKS3J6vZuNy;
        if (i >= jArr.length) {
            jArr = java.util.Arrays.copyOf(jArr, java.lang.Math.max(i + 1, jArr.length * 2));
            this.giKS3J6vZuNy = jArr;
        }
        jArr[i] = j;
        if (i >= this.ZpBGe2uQfcn8) {
            this.ZpBGe2uQfcn8 = i + 1;
        }
    }

    public boolean giKS3J6vZuNy(long j) {
        int i = this.ZpBGe2uQfcn8;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.giKS3J6vZuNy)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public void oh71FJcDz6S2(long j) {
        int i = this.ZpBGe2uQfcn8;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.giKS3J6vZuNy)[i2]) {
                int i3 = this.ZpBGe2uQfcn8 - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.giKS3J6vZuNy;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.ZpBGe2uQfcn8--;
                return;
            }
            i2++;
        }
    }

    public wg(defpackage.f61 f61Var, int i) {
        this.giKS3J6vZuNy = f61Var;
        this.ZpBGe2uQfcn8 = i;
    }
}
