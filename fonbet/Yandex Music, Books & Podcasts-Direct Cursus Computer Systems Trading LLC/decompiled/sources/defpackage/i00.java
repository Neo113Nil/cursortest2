package defpackage;

import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes3.dex */
public final class i00 extends m18 {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public i00(pui puiVar, cvl cvlVar, pgf pgfVar, int i, o70 o70Var) {
        this.b = 1;
        this.d = puiVar;
        this.e = cvlVar;
        this.f = pgfVar;
        this.c = i;
        this.g = o70Var;
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        switch (this.b) {
            case 0:
                mqsVar.getClass();
                rmb.j((rmb) this.g, wjb.BottomsheetScreen, (thj) this.f, null, 12);
                j00 j00Var = (j00) this.d;
                j00Var.g.a(new mz(mqsVar, j00Var.f.a, j00Var.b));
                break;
            case 1:
                mqsVar.getClass();
                pui puiVar = (pui) this.d;
                cvl cvlVar = (cvl) this.e;
                puiVar.getClass();
                cvlVar.getClass();
                mqsVar.getClass();
                puiVar.c(mqsVar);
                break;
            default:
                mqsVar.getClass();
                pui puiVar2 = (pui) this.f;
                oq oqVar = (oq) this.g;
                puiVar2.getClass();
                puiVar2.j.J(mqsVar, null, oqVar, null, zus.b);
                break;
        }
    }

    @Override // defpackage.ag5
    public final void d(mqs mqsVar) {
        String str;
        i00 i00Var = this;
        int i = i00Var.b;
        mqsVar.getClass();
        switch (i) {
            case 0:
                j00 j00Var = (j00) i00Var.d;
                dy dyVar = j00Var.d;
                h00 h00Var = new h00(j00Var, i00Var.c, (jab) i00Var.e, (thj) i00Var.f, 0);
                dyVar.getClass();
                a0g.G(dyVar.a, mqsVar, h00Var);
                break;
            case 1:
                String t = weo.t();
                pui puiVar = (pui) i00Var.d;
                cvl cvlVar = (cvl) i00Var.e;
                puiVar.getClass();
                cvlVar.getClass();
                t.getClass();
                jyr jyrVar = puiVar.e;
                e eVar = (e) jyrVar.getValue();
                PlaybackScope playbackScope = puiVar.b;
                eVar.getClass();
                if (puiVar.b().c(e.f(playbackScope, cvlVar), mqsVar, false)) {
                    puiVar.b().i(false);
                    str = t;
                } else {
                    z5l b = puiVar.b();
                    ((e) jyrVar.getValue()).getClass();
                    c f = e.f(playbackScope, cvlVar);
                    sfm sfmVar = new sfm(new hv0(new w90(puiVar, cvlVar, null, 9), null, 27));
                    a6l a = puiVar.c.a(t);
                    pe5 pe5Var = new pe5(new v80(f.a(), a.a, a.b), null);
                    r0q r0qVar = new r0q(0);
                    str = t;
                    asq.t(b.d(new se5(new ubn(), f, sfmVar, null, 0, null, mqsVar, -1, -1L, pe5Var, new tb(cvlVar), false, null, r0qVar), true, uyk.a), puiVar.a, new p1n(8));
                    i00Var = this;
                }
                String str2 = str;
                ((pgf) i00Var.f).a(str2, mqsVar.a, i00Var.c, (o70) i00Var.g);
                break;
            default:
                String t2 = weo.t();
                ((pgf) i00Var.d).a(t2, mqsVar.a, i00Var.c, (o70) i00Var.e);
                pui puiVar2 = (pui) i00Var.f;
                oq oqVar = (oq) i00Var.g;
                puiVar2.getClass();
                e eVar2 = (e) puiVar2.e.getValue();
                PlaybackScope playbackScope2 = puiVar2.b;
                eVar2.getClass();
                if (!puiVar2.b().c(playbackScope2.b(oqVar), mqsVar, false)) {
                    asq.t(puiVar2.b().d(puiVar2.a(oqVar, mqsVar, t2).b(), true, uyk.a), puiVar2.a, new p1n(8));
                    break;
                } else {
                    puiVar2.b().i(false);
                    break;
                }
        }
    }

    public /* synthetic */ i00(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }
}
