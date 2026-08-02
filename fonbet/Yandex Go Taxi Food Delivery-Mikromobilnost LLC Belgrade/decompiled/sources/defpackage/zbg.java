package defpackage;

import android.content.Context;
import com.yandex.messaging.domain.folders.g;
import com.yandex.messaging.domain.personal.a;
import com.yandex.messaging.domain.statuses.c;

/* loaded from: classes15.dex */
public final class zbg implements xvf0 {
    public final /* synthetic */ int a;
    public final vbb b;

    public /* synthetic */ zbg(vbb vbbVar, int i) {
        this.a = i;
        this.b = vbbVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        vbb vbbVar = this.b;
        switch (i) {
            case 0:
                p8g p8gVar = (p8g) vbbVar.b;
                return new c((kse) p8gVar.b.f.get(), (a) p8gVar.M0.get(), p8gVar.b(), p8gVar.f());
            case 1:
                l7t l7tVar = (l7t) ((p8g) vbbVar.b).V2.get();
                q5z.h(l7tVar);
                return l7tVar;
            case 2:
                g gVar = (g) ((p8g) vbbVar.b).U2.get();
                q5z.h(gVar);
                return gVar;
            case 3:
                n7t n7tVar = (n7t) ((p8g) vbbVar.b).T2.get();
                q5z.h(n7tVar);
                return n7tVar;
            case 4:
                o7t o7tVar = (o7t) ((p8g) vbbVar.b).Q2.get();
                q5z.h(o7tVar);
                return o7tVar;
            case 5:
                p7t p7tVar = (p7t) ((p8g) vbbVar.b).S2.get();
                q5z.h(p7tVar);
                return p7tVar;
            case 6:
                a aVar = (a) ((p8g) vbbVar.b).M0.get();
                q5z.h(aVar);
                return aVar;
            case 7:
                return ((p8g) vbbVar.b).c();
            case 8:
                return ((p8g) vbbVar.b).f();
            case 9:
                com.yandex.messaging.domain.inviteLink.a aVar2 = (com.yandex.messaging.domain.inviteLink.a) ((p8g) vbbVar.b).a3.get();
                q5z.h(aVar2);
                return aVar2;
            case 10:
                return ((p8g) vbbVar.b).g();
            case 11:
                fft fftVar = (fft) ((p8g) vbbVar.b).c2.get();
                q5z.h(fftVar);
                return fftVar;
            case 12:
                nft nftVar = (nft) ((p8g) vbbVar.b).z0.get();
                q5z.h(nftVar);
                return nftVar;
            case 13:
                return vbbVar.D();
            case 14:
                p8g p8gVar2 = (p8g) vbbVar.b;
                w5t w5tVar = (w5t) p8gVar2.L0.get();
                z8g z8gVar = (z8g) vbbVar.a;
                kse kseVar = (kse) z8gVar.f.get();
                at2 at2Var = (at2) p8gVar2.z.get();
                sb7 sb7Var = (sb7) p8gVar2.K.get();
                lqo lqoVar = z8gVar.a.d;
                q5z.i(lqoVar);
                return new com.yandex.messaging.domain.chatlist.c(w5tVar, kseVar, at2Var, sb7Var, lqoVar);
            case 15:
                return vbbVar.E();
            case 16:
                p8g p8gVar3 = (p8g) vbbVar.b;
                w5t w5tVar2 = (w5t) p8gVar3.L0.get();
                z8g z8gVar2 = (z8g) vbbVar.a;
                kse kseVar2 = (kse) z8gVar2.f.get();
                at2 at2Var2 = (at2) p8gVar3.z.get();
                sb7 sb7Var2 = (sb7) p8gVar3.K.get();
                lqo lqoVar2 = z8gVar2.a.d;
                q5z.i(lqoVar2);
                return new com.yandex.messaging.domain.threads.c(w5tVar2, kseVar2, at2Var2, sb7Var2, lqoVar2);
            case 17:
                q6v F = vbbVar.F();
                q5z.h(F);
                return F;
            case 18:
                xav xavVar = (xav) ((p8g) vbbVar.b).j0.get();
                q5z.h(xavVar);
                return xavVar;
            case 19:
                p220 G = vbbVar.G();
                q5z.h(G);
                return G;
            case 20:
                com.yandex.messaging.domain.chat.g gVar2 = (com.yandex.messaging.domain.chat.g) ((p8g) vbbVar.b).i2.get();
                q5z.h(gVar2);
                return gVar2;
            case 21:
                q220 H = vbbVar.H();
                q5z.h(H);
                return H;
            case 22:
                return ((z8g) vbbVar.a).c();
            case 23:
                g420 g420Var = ((p8g) vbbVar.b).b.a;
                Context context = g420Var.a;
                q5z.i(context);
                rz10 rz10Var = g420Var.k;
                q5z.i(rz10Var);
                return new zs20(context.getApplicationContext(), new at20(new d4(1, rz10Var), new n5(context, 0)));
            case 24:
                bj10 bj10Var = (bj10) ((p8g) vbbVar.b).Z2.get();
                q5z.h(bj10Var);
                return bj10Var;
            case 25:
                ks10 ks10Var = (ks10) ((p8g) vbbVar.b).f1.get();
                q5z.h(ks10Var);
                return ks10Var;
            case 26:
                return vbbVar.K();
            case 27:
                yz10 yz10Var = (yz10) ((p8g) vbbVar.b).S.get();
                q5z.h(yz10Var);
                return yz10Var;
            case 28:
                com.yandex.messaging.internal.avatar.a aVar3 = (com.yandex.messaging.internal.avatar.a) ((p8g) vbbVar.b).A2.get();
                q5z.h(aVar3);
                return aVar3;
            default:
                k020 L = vbbVar.L();
                q5z.h(L);
                return L;
        }
    }
}
