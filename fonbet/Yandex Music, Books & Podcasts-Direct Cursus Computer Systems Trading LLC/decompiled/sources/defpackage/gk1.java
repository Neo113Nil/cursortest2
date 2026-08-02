package defpackage;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes4.dex */
public final /* synthetic */ class gk1 implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gk1(int i, gfb gfbVar, String str, String str2, String str3) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = gfbVar;
        this.f = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                hk1 hk1Var = (hk1) this.c;
                List list = (List) this.d;
                mqs mqsVar = (mqs) this.e;
                kc kcVar = (kc) this.f;
                String t = weo.t();
                z5l z5lVar = new z5l();
                qe5 h = l3l.h(hk1Var.e, list, hk1Var.d.a(t));
                h.g = mqsVar;
                h.e = this.b;
                se5 b = h.b();
                if (z5lVar.c(hk1Var.e, mqsVar, false)) {
                    z5lVar.i(false);
                } else {
                    z5lVar.d(b, true, uyk.a);
                    kcVar.invoke(t);
                }
                break;
            case 1:
                String str = (String) this.c;
                String str2 = (String) this.d;
                gfb gfbVar = (gfb) this.e;
                String str3 = (String) this.f;
                break;
            case 2:
                gs4 gs4Var = (gs4) this.c;
                mqs mqsVar2 = (mqs) this.e;
                r3e r3eVar = (r3e) this.d;
                ny2 ny2Var = (ny2) this.f;
                String t2 = weo.t();
                e eVar = (e) ((jyr) gs4Var.d).getValue();
                h hVar = new h(Page.DOWNLOADS_MUSIC);
                eVar.getClass();
                c h2 = hVar.h();
                jyr jyrVar = (jyr) gs4Var.e;
                if (((z5l) jyrVar.getValue()).c(h2, mqsVar2, false)) {
                    ((z5l) jyrVar.getValue()).i(false);
                } else {
                    asq.t(z5l.g((z5l) jyrVar.getValue(), h2, ((kxi) gs4Var.c).a(t2), null, mqsVar2, this.b, 0, null, null, null, r3eVar, 23780), (Activity) gs4Var.a, new p1n(8));
                    ny2Var.invoke(t2);
                }
                break;
            case 3:
                qzl qzlVar = (qzl) this.c;
                List list2 = (List) this.d;
                rmb rmbVar = (rmb) this.e;
                thj thjVar = (thj) this.f;
                g0l g0lVar = qzlVar.j;
                cvl cvlVar = qzlVar.d;
                int i = this.b;
                if (i < 0) {
                    i = 0;
                }
                g0l.l(g0lVar, cvlVar, new icr(i), list2, qzlVar.c, rmbVar.b(thjVar), "mobile-playlist-playlist-default");
                break;
            default:
                ((i9u) this.c).K((List) this.d, this.b, (wmn) this.e, (u5l) this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gk1(hk1 hk1Var, List list, mqs mqsVar, int i, kc kcVar) {
        this.c = hk1Var;
        this.d = list;
        this.e = mqsVar;
        this.b = i;
        this.f = kcVar;
    }

    public /* synthetic */ gk1(gs4 gs4Var, mqs mqsVar, int i, r3e r3eVar, ny2 ny2Var) {
        this.c = gs4Var;
        this.e = mqsVar;
        this.b = i;
        this.d = r3eVar;
        this.f = ny2Var;
    }

    public /* synthetic */ gk1(qzl qzlVar, int i, List list, rmb rmbVar, thj thjVar) {
        this.c = qzlVar;
        this.b = i;
        this.d = list;
        this.e = rmbVar;
        this.f = thjVar;
    }

    public /* synthetic */ gk1(i9u i9uVar, List list, int i, wmn wmnVar, u5l u5lVar) {
        this.c = i9uVar;
        this.d = list;
        this.b = i;
        this.e = wmnVar;
        this.f = u5lVar;
    }
}
