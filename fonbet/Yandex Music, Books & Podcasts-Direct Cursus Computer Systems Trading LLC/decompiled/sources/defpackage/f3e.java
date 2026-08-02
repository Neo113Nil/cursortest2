package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class f3e {
    public int a;
    public float b;
    public final Object c;

    public f3e(ads adsVar) {
        this.c = adsVar;
        this.a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        ads adsVar = (ads) this.c;
        int i3 = 1;
        if (z) {
            int L = irf.L(adsVar.f, i, z);
            int lineStart = adsVar.f.getLineStart(L);
            int f = adsVar.f(L);
            if (i == lineStart || i == f) {
                z4 = true;
                int i4 = i * 4;
                if (z3) {
                    i3 = z4 ? 2 : 3;
                } else if (z4) {
                    i3 = 0;
                }
                i2 = i4 + i3;
                if (this.a != i2) {
                    return this.b;
                }
                float h = z3 ? adsVar.h(i, z) : adsVar.i(i, z);
                if (z2) {
                    this.a = i2;
                    this.b = h;
                }
                return h;
            }
        }
        z4 = false;
        int i42 = i * 4;
        if (z3) {
        }
        i2 = i42 + i3;
        if (this.a != i2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(float f, cg6 cg6Var) {
        dtn dtnVar;
        int i;
        f3e f3eVar;
        if (cg6Var instanceof dtn) {
            dtnVar = (dtn) cg6Var;
            int i2 = dtnVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dtnVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dtnVar.k;
                nm6 nm6Var = nm6.a;
                i = dtnVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    rp5 rp5Var = (rp5) this.c;
                    Float f2 = new Float(f);
                    dtnVar.j = this;
                    dtnVar.m = 1;
                    obj = rp5Var.invoke(f2, dtnVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    f3eVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f3eVar = dtnVar.j;
                    qgg.h0(obj);
                }
                f3eVar.b += ((Number) obj).floatValue();
                return Unit.a;
            }
        }
        dtnVar = new dtn(this, cg6Var);
        Object obj2 = dtnVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dtnVar.m;
        if (i != 0) {
        }
        f3eVar.b += ((Number) obj2).floatValue();
        return Unit.a;
    }

    public f3e(int i, rp5 rp5Var) {
        this.a = i;
        this.c = rp5Var;
    }
}
