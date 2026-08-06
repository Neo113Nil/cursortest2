package defpackage;

/* loaded from: classes.dex */
public final class cn implements defpackage.l51 {
    public final /* synthetic */ defpackage.dn IHQe1A4L2xu;

    public cn(defpackage.dn dnVar) {
        this.IHQe1A4L2xu = dnVar;
    }

    @Override // defpackage.l51
    public final float IHQe1A4L2xu(float f) {
        if (java.lang.Float.isNaN(f)) {
            return 0.0f;
        }
        defpackage.dn dnVar = this.IHQe1A4L2xu;
        float floatValue = ((java.lang.Number) dnVar.IHQe1A4L2xu.AARZUJiTa(java.lang.Float.valueOf(f))).floatValue();
        dnVar.adDC3e2L.setValue(java.lang.Boolean.valueOf(floatValue > 0.0f));
        dnVar.xiZrDbcSW0.setValue(java.lang.Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
