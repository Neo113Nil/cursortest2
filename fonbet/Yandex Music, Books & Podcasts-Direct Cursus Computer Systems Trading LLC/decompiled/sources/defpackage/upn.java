package defpackage;

import java.util.Map;

/* loaded from: classes5.dex */
public final class upn implements df {
    public static final upn b = new upn(0);
    public static final upn c = new upn(1);
    public static final upn d = new upn(2);
    public final /* synthetic */ int a;

    public /* synthetic */ upn(int i) {
        this.a = i;
    }

    @Override // defpackage.df
    public final void b(md mdVar, dn9 dn9Var) {
        q2a a;
        Map map;
        switch (this.a) {
            case 0:
                tpn tpnVar = (tpn) mdVar;
                ((g3a) dn9Var.f).f(new u2a(tpnVar.b, tpnVar.a));
                break;
            case 1:
                ((g3a) dn9Var.f).f(new v2a(false));
                break;
            default:
                knt kntVar = (knt) mdVar;
                g3a g3aVar = (g3a) dn9Var.f;
                zzt zztVar = (zzt) ((z2a) dn9Var.c).a.b(ern.a(zzt.class));
                String str = (zztVar == null || (map = zztVar.a) == null) ? null : (String) map.get("documentQueryPath");
                if (str == null) {
                    a = kntVar.a;
                } else {
                    f0q f0qVar = f0q.b;
                    f0q y = asq.y(t75.c(new zzt(dfi.n("documentQueryPath", str))));
                    q2a q2aVar = kntVar.a;
                    a = q2a.a(q2aVar, null, q2aVar.c.a(y), null, 59);
                }
                g3aVar.f(new x2a(a, r2a.c));
                break;
        }
    }
}
