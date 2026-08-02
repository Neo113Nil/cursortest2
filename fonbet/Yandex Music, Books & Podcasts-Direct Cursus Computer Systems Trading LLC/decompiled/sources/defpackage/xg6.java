package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class xg6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg6 b;
    public final /* synthetic */ xh6 c;

    public /* synthetic */ xg6(zg6 zg6Var, xh6 xh6Var, int i) {
        this.a = i;
        this.b = zg6Var;
        this.c = xh6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                zg6 zg6Var = this.b;
                g0l g0lVar = zg6Var.c;
                sh6 sh6Var = (sh6) this.c;
                oq oqVar = sh6Var.a;
                String str = oqVar.a;
                mqs mqsVar = sh6Var.b;
                kcr jcrVar = mqsVar != null ? new jcr(mqsVar) : hcr.a;
                kxi kxiVar = zg6Var.d;
                rmb rmbVar = zg6Var.e;
                oqVar.getClass();
                g0l.g(g0lVar, str, jcrVar, kxiVar, rmbVar.b(c3x.w(lxe.B(oqVar), 0, 0)), "mobile-home-album-default", null, null, null, null, null, 2016);
                break;
            case 1:
                zg6 zg6Var2 = this.b;
                g0l g0lVar2 = zg6Var2.c;
                uh6 uh6Var = (uh6) this.c;
                cvl cvlVar = uh6Var.a;
                g0l.m(g0lVar2, cvlVar.g().d(), new jcr(uh6Var.b), zg6Var2.d, zg6Var2.e.b(t7g.n(cvlVar)), "mobile-home-playlist-default", null, null, null, null, 2016);
                break;
            case 2:
                zg6 zg6Var3 = this.b;
                g0l g0lVar3 = zg6Var3.c;
                vh6 vh6Var = (vh6) this.c;
                String str2 = vh6Var.a.a;
                mqs mqsVar2 = vh6Var.b;
                jcr jcrVar2 = new jcr(mqsVar2);
                kxi kxiVar2 = zg6Var3.d;
                rmb rmbVar2 = zg6Var3.e;
                mqsVar2.getClass();
                g0l.g(g0lVar3, str2, jcrVar2, kxiVar2, rmbVar2.b(szf.M(mqsVar2, 0, 0)), "mobile-home-album-default", null, null, null, null, null, 2016);
                break;
            default:
                zg6 zg6Var4 = this.b;
                g0l g0lVar4 = zg6Var4.c;
                mqs mqsVar3 = ((wh6) this.c).a;
                jcr jcrVar3 = new jcr(mqsVar3);
                List c = t75.c(mqsVar3);
                kxi kxiVar3 = zg6Var4.d;
                rmb rmbVar3 = zg6Var4.e;
                mqsVar3.getClass();
                g0l.o(g0lVar4, jcrVar3, c, kxiVar3, rmbVar3.b(szf.M(mqsVar3, 0, 0)), "mobile-home-track-default", new m3q(new cd5(t75.c(mqsVar3.a)), ryt.a), 1984);
                break;
        }
        return Unit.a;
    }
}
