package defpackage;

import com.yandex.xplat.common.NetworkMethod;

/* loaded from: classes2.dex */
public final /* synthetic */ class rhj implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz50 b;

    public /* synthetic */ rhj(hz50 hz50Var) {
        this.a = 2;
        this.b = hz50Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        hz50 hz50Var = this.b;
        switch (i) {
            case 0:
                rs20 rs20Var = (rs20) obj;
                NetworkMethod method = hz50Var.method();
                String c = hz50Var.c();
                wj00 a = hz50Var.a();
                wj00 b = hz50Var.b();
                wj00 d = hz50Var.d();
                if (rs20Var != null) {
                    d.k("X-Oauth-Token", rs20Var.a);
                }
                return new tsp0(method, c, a, b, d, hz50Var.encoding());
            case 1:
                String str = (String) obj;
                NetworkMethod method2 = hz50Var.method();
                String c2 = hz50Var.c();
                wj00 a2 = hz50Var.a();
                wj00 b2 = hz50Var.b();
                wj00 d2 = hz50Var.d();
                if (str != null) {
                    d2.k("X-USER-UUID", str);
                }
                return new tsp0(method2, c2, a2, b2, d2, hz50Var.encoding());
            default:
                return hz50Var;
        }
    }

    public /* synthetic */ rhj(hz50 hz50Var, vv50 vv50Var, int i) {
        this.a = i;
        this.b = hz50Var;
    }
}
