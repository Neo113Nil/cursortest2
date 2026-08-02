package defpackage;

/* loaded from: classes3.dex */
public final class lic implements jic {
    public final /* synthetic */ float a;
    public final /* synthetic */ jic b;

    public lic(float f, om7 om7Var) {
        this.a = f;
        this.b = om7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.jic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rwo rwoVar, float f, cg6 cg6Var) {
        kic kicVar;
        int i;
        if (cg6Var instanceof kic) {
            kicVar = (kic) cg6Var;
            int i2 = kicVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kicVar.l = i2 - Integer.MIN_VALUE;
                Object obj = kicVar.j;
                nm6 nm6Var = nm6.a;
                i = kicVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    float f2 = this.a;
                    float c = yhn.c(f, -f2, f2);
                    kicVar.l = 1;
                    obj = this.b.a(rwoVar, c, kicVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new Float(((Number) obj).floatValue());
            }
        }
        kicVar = new kic(this, cg6Var);
        Object obj2 = kicVar.j;
        nm6 nm6Var2 = nm6.a;
        i = kicVar.l;
        if (i != 0) {
        }
        return new Float(((Number) obj2).floatValue());
    }
}
