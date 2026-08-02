package defpackage;

import androidx.fragment.app.y;
import com.yandex.music.core.ui.compose.a;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class w65 implements knq {
    public final /* synthetic */ int a;
    public final tmb b;

    public w65(aoq aoqVar, tmb tmbVar) {
        this.a = 3;
        tmbVar.getClass();
        this.b = tmbVar;
    }

    @Override // defpackage.knq
    public final rrf a(rnq rnqVar, qnq qnqVar) {
        int i = 15;
        switch (this.a) {
            case 0:
                a75 a75Var = (a75) rnqVar;
                qnqVar.getClass();
                nrf a = a75Var.g.a();
                g73 g73Var = new g73(a.a, a.b, new wn5(new m32(24, a75Var, qnqVar), 768452027, true), new cma(16), 16);
                xdr xdrVar = a75Var.i;
                xdrVar.getClass();
                return new cyd(g73Var, xdrVar);
            case 1:
                h75 h75Var = (h75) rnqVar;
                qnqVar.getClass();
                nrf nrfVar = h75Var.d.a;
                ssg.a(3, "Collection:Skeleton:CollectionWaveBlock", hrg.r("createBlockUi: type=", nrfVar.b, " id=", nrfVar.a), null);
                g73 g73Var2 = new g73(nrfVar.a, nrfVar.b, new wn5(new sh1(23, new je1(qnqVar, 2), h75Var, qnqVar.d), -1203026429, true), new cma(16), 16);
                xdr xdrVar2 = h75Var.h;
                xdrVar2.getClass();
                return new cyd(g73Var2, xdrVar2);
            case 2:
                r88 r88Var = (r88) rnqVar;
                qnqVar.getClass();
                qne qneVar = new qne(new t36(qnqVar.b, 1), r88Var.e);
                n88 n88Var = r88Var.d;
                nrf nrfVar2 = n88Var.a;
                ssg.a(3, "Collection:Skeleton:DislikesBlock", hrg.r("createBlockUi: type=", nrfVar2.b, " id=", nrfVar2.a), null);
                dqj Q = rzf.Q(new g73(nrfVar2.a, nrfVar2.b, cxb.e, (cma) null, 24), n88Var.b, null, new aw5(19, qneVar, r88Var), null, a.b(vci.a, null, 0L, 0.0f, null, new le0(2, r88Var, r88.class, "onVisibilityChanged", "onVisibilityChanged(ZLjava/lang/String;)V", 0, 11), 15), 26);
                xdr xdrVar3 = r88Var.i;
                xdrVar3.getClass();
                return tyf.I(new cyd(Q, xdrVar3), new at5(15, r88Var), null, 14);
            case 3:
                i8a i8aVar = (i8a) rnqVar;
                qnqVar.getClass();
                z7a z7aVar = i8aVar.g;
                nrf nrfVar3 = z7aVar.a;
                String str = nrfVar3.a;
                String str2 = nrfVar3.b;
                i8aVar.e.getClass();
                dqj Q2 = rzf.Q(new g73(str, str2, new wn5(new kw5(i, i8aVar, new oa1(qnqVar.b, 2)), -1343519430, true), (cma) null, 24), z7aVar.d, null, null, null, null, 62);
                xdr xdrVar4 = i8aVar.d.c;
                xdrVar4.getClass();
                return new cyd(Q2, xdrVar4);
            case 4:
                g6c g6cVar = (g6c) rnqVar;
                qnqVar.getClass();
                nrf nrfVar4 = g6cVar.a.a;
                ssg.a(3, "Collection:Skeleton:FavoritePlaylistBlock", hrg.r("createBlockUi: type=", nrfVar4.b, " id=", nrfVar4.a), null);
                String str3 = nrfVar4.a;
                String str4 = nrfVar4.b;
                hn5 hn5Var = qnqVar.b;
                y yVar = qnqVar.a;
                kxi kxiVar = qnqVar.d;
                hn5Var.getClass();
                yVar.getClass();
                kxiVar.getClass();
                return new g73(str3, str4, new wn5(new v48(13, new rdk(hn5Var, yVar, kxiVar), g6cVar, kxiVar), 2133314109, true), (cma) null, 24);
            default:
                zdf zdfVar = (zdf) rnqVar;
                qnqVar.getClass();
                nrf nrfVar5 = zdfVar.a.a;
                ssg.a(3, "Skeleton:KidsFavouriteSectionBlock", hrg.r("createBlockUi: type=", nrfVar5.b, " id=", nrfVar5.a), null);
                hn5 hn5Var2 = qnqVar.b;
                hn5Var2.getClass();
                return rzf.Q(new g73(nrfVar5.a, nrfVar5.b, new wn5(new t1b(17, zdfVar, new t36(hn5Var2, 2)), 225714490, true), (cma) null, 24), hn5Var2.getString(R.string.your_favourites), null, null, null, null, 62);
        }
    }

    @Override // defpackage.knq
    public final rnq b(s63 s63Var) {
        switch (this.a) {
            case 0:
                return new a75(q5g.x(this.b, s63Var), s63Var, new lnq());
            case 1:
                f75 f75Var = (f75) s63Var.a;
                ssg.a(3, "Collection:Skeleton:CollectionWaveBlock", "createViewModel: block=" + f75Var.a, null);
                return new h75(f75Var, q5g.x(this.b, s63Var), new lnq());
            case 2:
                n88 n88Var = (n88) s63Var.a;
                ssg.a(3, "Collection:Skeleton:DislikesBlock", "createViewModel: block=" + n88Var.a, null);
                return new r88(n88Var, q5g.x(this.b, s63Var));
            case 3:
                return new i8a(s63Var, q5g.x(this.b, s63Var));
            case 4:
                q5c q5cVar = (q5c) s63Var.a;
                ssg.a(3, "Collection:Skeleton:FavoritePlaylistBlock", "createViewModel: block=" + q5cVar.a, null);
                return new g6c(q5cVar, q5g.x(this.b, s63Var));
            default:
                wdf wdfVar = (wdf) s63Var.a;
                ssg.a(3, "Skeleton:KidsFavouriteSectionBlock", "createViewModel: block=" + wdfVar.a, null);
                return new zdf(wdfVar, q5g.x(this.b, s63Var));
        }
    }

    public /* synthetic */ w65(Object obj, tmb tmbVar, int i) {
        this.a = i;
        this.b = tmbVar;
    }

    public /* synthetic */ w65(tmb tmbVar, int i) {
        this.a = i;
        this.b = tmbVar;
    }
}
