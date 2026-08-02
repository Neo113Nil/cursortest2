package defpackage;

import android.content.Context;
import androidx.fragment.app.y;
import java.util.List;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes4.dex */
public final class lhe implements khe {
    public final qhe a;
    public final vx6 b;
    public final xdr c;

    public lhe(qhe qheVar, vx6 vx6Var) {
        this.a = qheVar;
        this.b = vx6Var;
        this.c = qheVar.i;
    }

    @Override // defpackage.khe
    public final void b(boolean z, lt ltVar, int i, String str) {
        ltVar.getClass();
        str.getClass();
        gs4 gs4Var = this.a.f;
        gs4Var.r().h(ox6.M(ltVar, i, str), z);
    }

    @Override // defpackage.khe
    public final void c(ehe eheVar) {
        eheVar.getClass();
        lwg D = g0g.D(eheVar.b, eheVar.c, eheVar.a.g);
        vx6 vx6Var = this.b;
        szf.R((y) vx6Var.c, new qvg(D), d.p((nrf) vx6Var.d));
    }

    @Override // defpackage.khe
    public final void d(ahe aheVar) {
        Object value;
        cht chtVar;
        aheVar.getClass();
        qhe qheVar = this.a;
        qheVar.f.q(aheVar.a);
        xdr xdrVar = qheVar.i;
        do {
            value = xdrVar.getValue();
            chtVar = (cht) value;
            if (chtVar instanceof pgt) {
                pgt pgtVar = (pgt) chtVar;
                String str = pgtVar.a;
                List list = pgtVar.b;
                list.getClass();
                chtVar = new pgt(str, list, aheVar);
            }
        } while (!xdrVar.k(value, chtVar));
    }

    @Override // defpackage.khe
    public final void e(ahe aheVar) {
        aheVar.getClass();
        String str = aheVar.a;
        String str2 = aheVar.b;
        String str3 = aheVar.c;
        if (str3 == null) {
            str3 = "";
        }
        lwg F = g0g.F(new u51(str, str2, new u9b(str3, null, null), null, null), false);
        vx6 vx6Var = this.b;
        szf.R((y) vx6Var.c, new qvg(F), d.p((nrf) vx6Var.d));
    }

    @Override // defpackage.khe
    public final void f(ehe eheVar, int i) {
        eheVar.getClass();
        gs4 gs4Var = this.a.f;
        lt ltVar = eheVar.b;
        d70 M = ox6.M(ltVar, i, "");
        gs4Var.getClass();
        gs4Var.r().e(M, null);
        vx6 vx6Var = this.b;
        Context context = (Context) vx6Var.b;
        context.startActivity(quj.V(context, ltVar, d.p((nrf) vx6Var.d)));
    }

    @Override // defpackage.khe
    public final xdr getState() {
        return this.c;
    }
}
