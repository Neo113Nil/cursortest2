package defpackage;

import android.app.Activity;
import androidx.fragment.app.y;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes3.dex */
public final class t3e extends m18 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t3e(int i, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        int i = this.b;
        mqsVar.getClass();
        switch (i) {
            case 0:
                w3e w3eVar = (w3e) this.c;
                rmb.j(w3eVar.b, wjb.BottomsheetScreen, (thj) this.e, null, 12);
                gs4 gs4Var = w3eVar.c;
                rre.Z(mqsVar, zus.b, y5g.B0(mqsVar, cyt.a), new ve(muo.MY_DOWNLOADED, zqt.d), (Activity) gs4Var.a, (y) gs4Var.b, (kxi) gs4Var.c, new h(Page.DOWNLOADS_MUSIC), null, null, null, 1792);
                break;
            case 1:
                g6p g6pVar = (g6p) this.c;
                e4p e4pVar = ((f7p) this.d).c;
                ((Number) ((aqi) this.e).getValue()).intValue();
                g6pVar.W(mqsVar, e4pVar);
                break;
            case 2:
                g6p g6pVar2 = (g6p) this.c;
                e4p e4pVar2 = ((l7p) this.d).c;
                ((Number) ((aqi) this.e).getValue()).intValue();
                g6pVar2.T(mqsVar, e4pVar2);
                break;
            default:
                g6p g6pVar3 = (g6p) this.c;
                e4p e4pVar3 = ((v7p) this.d).c;
                ((Number) ((aqi) this.e).getValue()).intValue();
                g6pVar3.W(mqsVar, e4pVar3);
                break;
        }
    }

    @Override // defpackage.ag5
    public void c(mqs mqsVar) {
        switch (this.b) {
            case 1:
                mqsVar.getClass();
                ((g6p) this.c).k(mqsVar, ((f7p) this.d).c, ((Number) ((aqi) this.e).getValue()).intValue());
                break;
            case 2:
                mqsVar.getClass();
                ((g6p) this.c).j0(mqsVar, ((l7p) this.d).c, ((Number) ((aqi) this.e).getValue()).intValue());
                break;
            case 3:
                mqsVar.getClass();
                ((g6p) this.c).k(mqsVar, ((v7p) this.d).c, ((Number) ((aqi) this.e).getValue()).intValue());
                break;
            default:
                super.c(mqsVar);
                break;
        }
    }

    @Override // defpackage.ag5
    public final void d(mqs mqsVar) {
        switch (this.b) {
            case 0:
                thj thjVar = (thj) this.e;
                spd spdVar = (spd) this.d;
                mqsVar.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                boolean h = ((x35) ((byb) qdcVar.C(I)).c(ern.a(x35.class))).h();
                w3e w3eVar = (w3e) this.c;
                gs4 gs4Var = w3eVar.c;
                if (!h) {
                    int i = spdVar.c;
                    ny2 ny2Var = new ny2(29, w3eVar, thjVar);
                    a0g.G((Activity) gs4Var.a, mqsVar, new gk1(gs4Var, mqsVar, i, new r3e(w3eVar, null, 1), ny2Var));
                    break;
                } else {
                    a0g.G((Activity) gs4Var.a, mqsVar, new vd(28, w3eVar, spdVar, thjVar));
                    break;
                }
            case 1:
                mqsVar.getClass();
                g6p g6pVar = (g6p) this.c;
                f7p f7pVar = (f7p) this.d;
                g6pVar.x(mqsVar, f7pVar.c, ((Number) ((aqi) this.e).getValue()).intValue(), f7pVar);
                break;
            case 2:
                mqsVar.getClass();
                ((g6p) this.c).u0(mqsVar, ((l7p) this.d).c, ((Number) ((aqi) this.e).getValue()).intValue());
                break;
            default:
                mqsVar.getClass();
                ((g6p) this.c).x(mqsVar, ((v7p) this.d).c, ((Number) ((aqi) this.e).getValue()).intValue(), null);
                break;
        }
    }
}
