package defpackage;

import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final /* synthetic */ class qja0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ uv6 b;

    public /* synthetic */ qja0(uv6 uv6Var, int i) {
        this.a = i;
        this.b = uv6Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        uv6 uv6Var = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).c = (r0) uv6Var.I;
                agd agdVar = (agd) yfdVar;
                agdVar.e = new qja0(uv6Var, i2);
                fad.a.getClass();
                agdVar.g = fad.b;
                return zy11Var;
            default:
                oja0 oja0Var = (oja0) obj;
                if (jl40.l(oja0Var, nja0.a)) {
                    uv6Var.r(new dia0(i2));
                    return zy11Var;
                }
                if (jl40.l(oja0Var, mja0.a)) {
                    uv6Var.r(new qu(9));
                    return zy11Var;
                }
                w511.b();
                return null;
        }
    }
}
