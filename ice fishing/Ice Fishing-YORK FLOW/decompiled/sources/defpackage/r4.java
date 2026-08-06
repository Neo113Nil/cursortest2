package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class r4 {
    public final org.xmlpull.v1.XmlPullParser ZpBGe2uQfcn8;
    public final defpackage.ARgw6UjYb9W7 fWTAfUmVKrZq;
    public int giKS3J6vZuNy = 0;

    public r4(android.content.res.XmlResourceParser xmlResourceParser) {
        this.ZpBGe2uQfcn8 = xmlResourceParser;
        defpackage.ARgw6UjYb9W7 aRgw6UjYb9W7 = new defpackage.ARgw6UjYb9W7();
        aRgw6UjYb9W7.giKS3J6vZuNy = new float[64];
        this.fWTAfUmVKrZq = aRgw6UjYb9W7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r7 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.wg ZpBGe2uQfcn8(android.content.res.TypedArray typedArray, android.content.res.Resources.Theme theme, java.lang.String str, int i) {
        defpackage.wg wgVar;
        if (defpackage.n70.w7APNrr0aGRc(this.ZpBGe2uQfcn8, str)) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                try {
                    wgVar = defpackage.wg.fWTAfUmVKrZq(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (java.lang.Exception e) {
                    android.util.Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    wgVar = null;
                }
            } else {
                wgVar = new defpackage.wg(typedValue.data, (java.lang.Object) null);
            }
            fWTAfUmVKrZq(typedArray.getChangingConfigurations());
            return wgVar;
        }
        wgVar = new defpackage.wg(0, (java.lang.Object) null);
        fWTAfUmVKrZq(typedArray.getChangingConfigurations());
        return wgVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.r4)) {
            return false;
        }
        defpackage.r4 r4Var = (defpackage.r4) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, r4Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == r4Var.giKS3J6vZuNy;
    }

    public final void fWTAfUmVKrZq(int i) {
        this.giKS3J6vZuNy = i | this.giKS3J6vZuNy;
    }

    public final float giKS3J6vZuNy(android.content.res.TypedArray typedArray, java.lang.String str, int i, float f) {
        if (defpackage.n70.w7APNrr0aGRc(this.ZpBGe2uQfcn8, str)) {
            f = typedArray.getFloat(i, f);
        }
        fWTAfUmVKrZq(typedArray.getChangingConfigurations());
        return f;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.giKS3J6vZuNy) + (this.ZpBGe2uQfcn8.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", config=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.giKS3J6vZuNy, ')');
    }
}
