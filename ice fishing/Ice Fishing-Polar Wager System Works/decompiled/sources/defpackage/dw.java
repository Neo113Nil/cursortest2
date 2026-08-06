package defpackage;

/* loaded from: classes.dex */
public final class dw extends defpackage.eo0 {
    @Override // defpackage.eo0
    public final java.lang.Object F7NU4MC0GW(java.lang.String str) {
        return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
    }

    @Override // defpackage.eo0
    public final java.lang.Object IHQe1A4L2xu(android.os.Bundle bundle, java.lang.String str) {
        bundle.getClass();
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return java.lang.Float.valueOf(f);
        }
        defpackage.c80.abhbClRa(str);
        throw null;
    }

    @Override // defpackage.eo0
    public final void adDC3e2L(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        str.getClass();
        bundle.putFloat(str, floatValue);
    }

    @Override // defpackage.eo0
    public final java.lang.String oh6vYeIP() {
        return "float";
    }
}
