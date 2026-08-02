package defpackage;

import com.yandex.plus.core.strings.PlusSdkBrandType;

/* loaded from: classes9.dex */
public final /* synthetic */ class wbd0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2d0 b;

    public /* synthetic */ wbd0(c2d0 c2d0Var, int i) {
        this.a = i;
        this.b = c2d0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        PlusSdkBrandType plusSdkBrandType;
        int i = this.a;
        c2d0 c2d0Var = this.b;
        switch (i) {
            case 0:
                nad0 nad0Var = (nad0) obj;
                nad0Var.a = c2d0Var.k;
                nad0Var.j = c2d0Var.l;
                nad0Var.e = c2d0Var.a;
                nad0Var.d = new s59(c2d0Var);
                nad0Var.f = c2d0Var.g;
                nad0Var.m = new s400();
                nad0Var.c = "ANDROID";
                nad0Var.g = c2d0Var.q;
                nad0Var.k = c2d0Var.x;
                nad0Var.b = "go_mobile_app";
                int i2 = xbd0.a[c2d0Var.z.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    plusSdkBrandType = PlusSdkBrandType.YANDEX;
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    plusSdkBrandType = PlusSdkBrandType.YANGO;
                }
                nad0Var.i = plusSdkBrandType;
                nad0Var.l = c2d0Var.y;
                nad0Var.h = new ybd0(c2d0Var.n);
                return nad0Var;
            default:
                x3d0 x3d0Var = (x3d0) obj;
                ((e4d0) x3d0Var).f = c2d0Var.g;
                e4d0 e4d0Var = (e4d0) x3d0Var;
                e4d0Var.b = new o370(c2d0Var.m);
                e4d0Var.c = c2d0Var.q;
                e4d0Var.a = c2d0Var.r;
                e4d0Var.e = (n4u0) c2d0Var.n.b.getValue();
                kqd0 q = c2d0Var.t.q();
                if (q != null) {
                    e4d0Var.g = q;
                }
                yvi0 yvi0Var = (yvi0) c2d0Var.C.a;
                qda0 qda0Var = new qda0(10);
                yvi0Var.getClass();
                e4d0Var.d = new hzk(qda0Var, yvi0Var);
                return zy11.a;
        }
    }
}
