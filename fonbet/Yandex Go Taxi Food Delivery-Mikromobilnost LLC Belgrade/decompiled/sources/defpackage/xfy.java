package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.data.e;
import com.yandex.messaging.internal.net.a;

/* loaded from: classes15.dex */
public final /* synthetic */ class xfy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ no6 b;

    public /* synthetic */ xfy(no6 no6Var, int i) {
        this.a = i;
        this.b = no6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        no6 no6Var = this.b;
        switch (i) {
            case 0:
                z83.g(null, ((Handler) no6Var.x).getLooper(), Looper.myLooper());
                vwc vwcVar = (vwc) no6Var.y;
                if (vwcVar != null) {
                    vwcVar.cancel();
                    no6Var.y = null;
                    break;
                }
                break;
            default:
                z83.g(null, ((Handler) no6Var.x).getLooper(), Looper.myLooper());
                z83.f((vwc) no6Var.y, null);
                xqi0 xqi0Var = (xqi0) no6Var.b;
                z83.g(null, xqi0Var.b.getLooper(), Looper.myLooper());
                cxq0 cxq0Var = xqi0Var.h;
                p8g p8gVar = (p8g) cxq0Var.c;
                z8g z8gVar = p8gVar.b;
                Looper looper = (Looper) z8gVar.d.get();
                xf7 xf7Var = (xf7) p8gVar.g0.get();
                a aVar = (a) p8gVar.n0.get();
                c370 c370Var = (c370) p8gVar.i0.get();
                x22 x22Var = (x22) z8gVar.y.get();
                rz10 rz10Var = z8gVar.a.k;
                q5z.i(rz10Var);
                xwc xwcVar = new xwc(looper, new bwu(xf7Var, aVar, c370Var, x22Var, rz10Var), (qf4) p8gVar.p0.get(), (x22) z8gVar.y.get());
                z8g z8gVar2 = (z8g) cxq0Var.b;
                q6v q6vVar = (q6v) z8gVar2.W.get();
                x22 x22Var2 = (x22) z8gVar2.y.get();
                String str = p8gVar.a;
                String str2 = (String) p8gVar.h0.get();
                Moshi moshi = (Moshi) z8gVar2.N.get();
                jwa0 jwa0Var = (jwa0) p8gVar.S0.get();
                v1r0 v1r0Var = (v1r0) p8gVar.l.get();
                e eVar = (e) z8gVar2.f0.get();
                lqo lqoVar = z8gVar2.a.d;
                q5z.i(lqoVar);
                ouu ouuVar = new ouu(q6vVar, x22Var2, str, str2, moshi, jwa0Var, v1r0Var, eVar, lqoVar, p8gVar.i());
                Context context = z8gVar2.a.a;
                q5z.i(context);
                no6Var.y = xwcVar.a(new ghz(new hdu(xwcVar, ouuVar, new bbj(context)), no6Var));
                break;
        }
    }
}
