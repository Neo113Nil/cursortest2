package defpackage;

import androidx.fragment.app.y;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;

/* loaded from: classes4.dex */
public final class wm1 implements vm1 {
    public final wn1 a;
    public final bnd b;
    public final mm6 c;
    public final hjl d;
    public final by7 e;

    public wm1(wn1 wn1Var, bnd bndVar, qyf qyfVar, hjl hjlVar) {
        qyfVar.getClass();
        hjlVar.getClass();
        this.a = wn1Var;
        this.b = bndVar;
        this.c = qyfVar;
        this.d = hjlVar;
        this.e = sj2.q(wn1Var.k, hjlVar.c, new j3(21));
    }

    @Override // defpackage.vm1
    public final void a(u51 u51Var, qkl qklVar) {
        wjb wjbVar = wjb.ArtistScreen;
        if (qklVar != null) {
            thj thjVar = qklVar.b;
            gjl gjlVar = qklVar.a;
            int i = gjlVar.b;
            hjl.b(this.d, wjbVar, gjlVar.a, thjVar, i, 16);
        }
        hn5 hn5Var = ((qnq) this.b.b).b;
        int i2 = ArtistScreenActivity.w0;
        hn5Var.startActivity(l48.p(hn5Var, u51Var, null, null, 24));
    }

    @Override // defpackage.vm1
    public final void b(u51 u51Var, qkl qklVar) {
        wjb wjbVar = wjb.AboutArtistScreen;
        if (qklVar != null) {
            hjl hjlVar = this.d;
            thj thjVar = qklVar.b;
            gjl gjlVar = qklVar.a;
            hjl.b(hjlVar, wjbVar, gjlVar.a, thjVar, gjlVar.b, 16);
        }
        qnq qnqVar = (qnq) this.b.b;
        y yVar = qnqVar.a;
        hn5 hn5Var = qnqVar.b;
        oa1 oa1Var = new oa1(hn5Var, 0);
        jfu viewModelStore = hn5Var.getViewModelStore();
        l18 l18Var = l18.b;
        bdt I = hag.I(h1d.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ovn.R(yVar, u51Var, oa1Var, viewModelStore, (h1d) qdcVar.C(I));
    }

    @Override // defpackage.vm1
    public final void c(dn1 dn1Var, qkl qklVar) {
        sjb sjbVar;
        boolean z = dn1Var.a.f;
        if (z) {
            sjbVar = sjb.Unlike;
        } else {
            if (z) {
                b6e.s();
                return;
            }
            sjbVar = sjb.Like;
        }
        if (qklVar != null) {
            thj thjVar = qklVar.b;
            gjl gjlVar = qklVar.a;
            int i = gjlVar.b;
            this.d.a(sjbVar, thjVar, gjlVar.a, i);
        }
        x97.y(this.c, null, null, new l5(this, dn1Var, null, 28), 3);
    }

    @Override // defpackage.vm1
    public final void d(String str, qkl qklVar) {
        String str2;
        str.getClass();
        if (qklVar == null) {
            str2 = str;
        } else {
            thj thjVar = qklVar.b;
            gjl gjlVar = qklVar.a;
            int i = gjlVar.b;
            pkl pklVar = gjlVar.a;
            hjl hjlVar = this.d;
            hjlVar.getClass();
            pklVar.getClass();
            xmb xmbVar = hjlVar.d;
            nab nabVar = hjlVar.a;
            cvo d = pklVar.d();
            String str3 = (String) hjlVar.e.get(thjVar.b);
            if (str3 == null) {
                str3 = "";
            }
            str2 = str;
            xmbVar.h(str2, nabVar, null, d, i, str3, thjVar, null, "");
        }
        jyr jyrVar = y7a.a;
        y7a.a(((qnq) this.b.b).b, str2, false);
    }

    @Override // defpackage.vm1
    public final void e(boolean z, String str, qkl qklVar) {
        str.getClass();
        if (qklVar == null) {
            return;
        }
        thj thjVar = qklVar.b;
        gjl gjlVar = qklVar.a;
        this.d.e(z, str, thjVar, gjlVar.b, gjlVar.a, null);
    }

    @Override // defpackage.vm1
    public final vdr getState() {
        return this.e;
    }
}
