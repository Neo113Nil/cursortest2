package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.chat.activation.a;
import com.yandex.messaging.internal.net.Error;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class v1b implements e1k, b9b, nl21 {
    public final /* synthetic */ int a = 3;
    public Object b;
    public Object c;
    public final /* synthetic */ Object w;

    public v1b(w1b w1bVar, u1b u1bVar, o1b o1bVar) {
        this.w = w1bVar;
        this.b = u1bVar;
        this.c = o1bVar;
        z83.g(null, u1bVar.y.a, Looper.myLooper());
        op3 op3Var = u1bVar.c;
        kgx kgxVar = u1b.z[0];
        z83.d(op3Var.a(), null);
        String str = u1bVar.x;
        if (str != null) {
            o1bVar.c(str);
        }
        u1bVar.b.b(o1bVar);
    }

    @Override // defpackage.nl21
    public void B(o0k o0kVar) {
        ((m421) this.b).j(String.format(((n421) this.w).b, o0kVar.a));
    }

    @Override // defpackage.b9b
    public void a(Error error) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.w;
        switch (i) {
            case 0:
                z83.g("SingleChatFetcher closed on wrong thread", ((w1b) obj).a, Looper.myLooper());
                u1b u1bVar = (u1b) this.b;
                o1b o1bVar = (o1b) this.c;
                w1b w1bVar = u1bVar.y;
                Looper looper = w1bVar.a;
                z83.g(null, looper, Looper.myLooper());
                zq60 zq60Var = u1bVar.b;
                zq60Var.d(o1bVar);
                if (zq60Var.isEmpty()) {
                    ChatRequest chatRequest = u1bVar.a;
                    z83.g(null, looper, Looper.myLooper());
                    w1bVar.o.remove(chatRequest);
                    op3 op3Var = u1bVar.c;
                    kgx kgxVar = u1b.z[0];
                    op3Var.b(null);
                    break;
                }
                break;
            case 1:
                this.b = null;
                ((Handler) ((wjm) obj).x).post(new ejp(3, this));
                break;
            case 2:
                z83.g(null, ((t2r) obj).c, Looper.myLooper());
                q2r q2rVar = (q2r) this.b;
                o2r o2rVar = (o2r) this.c;
                z83.g(null, q2rVar.z.c, Looper.myLooper());
                zq60 zq60Var2 = q2rVar.b;
                zq60Var2.d(o2rVar);
                if (zq60Var2.isEmpty()) {
                    q2rVar.a();
                    break;
                }
                break;
            case 3:
                z83.g(null, ((gta0) obj).a, Looper.myLooper());
                e1k e1kVar = (e1k) this.c;
                if (e1kVar != null) {
                    e1kVar.close();
                    this.c = null;
                    break;
                }
                break;
            default:
                ((zyj) this.c).close();
                break;
        }
    }

    @Override // defpackage.b9b
    public void k(j3b j3bVar, s020 s020Var) {
        z83.g(null, ((gta0) this.w).a, Looper.myLooper());
        psa0 psa0Var = (psa0) this.b;
        m8g m8gVar = (m8g) s020Var;
        z8g z8gVar = m8gVar.b;
        Looper looper = (Looper) z8gVar.d.get();
        o1b0 o1b0Var = m8gVar.a;
        p8g p8gVar = m8gVar.c;
        k020 k020Var = (k020) p8gVar.H.get();
        at2 at2Var = (at2) p8gVar.z.get();
        ax80 ax80Var = (ax80) p8gVar.F.get();
        d9g d9gVar = m8gVar.d;
        h3y a = i5m.a(d9gVar.z0);
        naz0 f = m8gVar.f();
        n5t0 e = d9gVar.e();
        oab oabVar = (oab) m8gVar.h.get();
        rj21 rj21Var = (rj21) p8gVar.a0.get();
        f7i0 f7i0Var = (f7i0) m8gVar.Y.get();
        h3y a2 = i5m.a(p8gVar.S0);
        x22 x22Var = (x22) z8gVar.y.get();
        doc docVar = (doc) z8gVar.l0.get();
        h3y a3 = i5m.a(p8gVar.I1);
        m mVar = new m();
        mVar.a = f;
        mVar.b = e;
        mVar.c = oabVar;
        mVar.d = rj21Var;
        mVar.e = f7i0Var;
        mVar.f = a2;
        mVar.g = x22Var;
        mVar.h = docVar;
        mVar.i = new fhc0(a3);
        HashMap hashMap = new HashMap();
        hashMap.put(23, 1);
        mVar.j = hashMap;
        bdu0 bdu0Var = (bdu0) d9gVar.K.get();
        vv10 vv10Var = new vv10((x22) z8gVar.y.get());
        oab oabVar2 = (oab) m8gVar.h.get();
        a aVar = new a(o1b0Var, (k020) p8gVar.H.get(), (kse) z8gVar.f.get(), i5m.a(d9gVar.l));
        apq0 apq0Var = (apq0) p8gVar.T.get();
        h3y a4 = i5m.a(d9gVar.U0);
        kse kseVar = (kse) z8gVar.f.get();
        g420 g420Var = z8gVar.a;
        Context context = g420Var.a;
        q5z.i(context);
        h3y a5 = i5m.a(d9gVar.l);
        h3y a6 = i5m.a(m8gVar.Z);
        fk51 fk51Var = (fk51) m8gVar.a0.get();
        ck51 ck51Var = new ck51((x22) z8gVar.y.get(), (ik51) p8gVar.K1.get(), (MessengerEnvironment) p8gVar.i.get());
        at10 at10Var = (at10) m8gVar.b0.get();
        lqo lqoVar = g420Var.d;
        q5z.i(lqoVar);
        i7b i7bVar = new i7b(looper, o1b0Var, k020Var, at2Var, ax80Var, a, mVar, bdu0Var, vv10Var, oabVar2, aVar, apq0Var, a4, kseVar, context, a5, a6, fk51Var, ck51Var, at10Var, lqoVar, i5m.a(p8gVar.J1), i5m.a(m8gVar.c0), new a201(25, i5m.a(p8gVar.L1), i5m.a(p8gVar.M1)));
        rsa0 rsa0Var = psa0Var.x;
        kse.a(rsa0Var.a);
        psa0Var.b = i7bVar;
        if (psa0Var.w) {
            rsa0Var.a(psa0Var, i7bVar);
        }
    }

    public v1b(n421 n421Var, m421 m421Var, String str) {
        this.w = n421Var;
        this.b = m421Var;
        this.c = n421Var.a.b(str, 0, this);
    }

    public v1b(gta0 gta0Var, ChatRequest chatRequest, psa0 psa0Var) {
        this.w = gta0Var;
        this.b = psa0Var;
        this.c = gta0Var.b.c(chatRequest, this);
    }

    public v1b(t2r t2rVar, q2r q2rVar, o2r o2rVar) {
        this.w = t2rVar;
        this.b = q2rVar;
        this.c = o2rVar;
        z83.g(null, q2rVar.z.c, Looper.myLooper());
        q2rVar.b.b(o2rVar);
    }

    public v1b(wjm wjmVar, gym gymVar) {
        this.w = wjmVar;
        this.b = gymVar;
        ((Handler) wjmVar.x).post(new p7h(13, this, wjmVar, y5e.q(((Context) wjmVar.b).getResources().getConfiguration())));
    }
}
