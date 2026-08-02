package defpackage;

/* loaded from: classes.dex */
public final class gq7 implements rwo {
    public final /* synthetic */ hq7 a;

    public gq7(hq7 hq7Var) {
        this.a = hq7Var;
    }

    @Override // defpackage.rwo
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        hq7 hq7Var = this.a;
        float floatValue = ((Number) hq7Var.a.invoke(Float.valueOf(f))).floatValue();
        hq7Var.e.setValue(Boolean.valueOf(floatValue > 0.0f));
        hq7Var.f.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
