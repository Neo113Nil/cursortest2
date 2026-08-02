package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class qke implements pke {
    public final String a;
    public final jyr b;
    public final jyr c;
    public final jyr d = btf.b(new v1e(5, this));

    public qke(String str, jyr jyrVar, jyr jyrVar2) {
        this.a = str + StringUtil.SPACE + UUID.randomUUID();
        this.b = jyrVar;
        this.c = jyrVar2;
    }

    @Override // defpackage.pke
    public final void b() {
        p7b a = dke.a(this);
        if (a.e) {
            return;
        }
        a.e = true;
        rar rarVar = a.c;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        a.c = ox6.B(zsd.M0(a.d, new l1(continuation, a, 20)), a.a, o7b.b);
    }

    @Override // defpackage.pke
    public final void c(kle kleVar) {
        kleVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        xdr xdrVar = (xdr) ((bqi) this.d.getValue());
        xdrVar.getClass();
        xdrVar.m(null, kleVar);
        xdr xdrVar2 = dke.a(this).d;
        Boolean bool = Boolean.TRUE;
        xdrVar2.getClass();
        xdrVar2.m(null, bool);
    }

    @Override // defpackage.pke
    public final vdr d(mm6 mm6Var) {
        mm6Var.getClass();
        tke tkeVar = (tke) this.b.getValue();
        jyr jyrVar = this.d;
        lke lkeVar = (lke) tkeVar.a(mm6Var, (kle) ((xdr) ((bqi) jyrVar.getValue())).getValue()).a.getValue();
        Continuation continuation = null;
        yc4 M0 = zsd.M0((bqi) jyrVar.getValue(), new gv6(continuation, this, mm6Var, 7));
        xqn xqnVar = new xqn();
        xqnVar.a = lkeVar;
        return lg3.u0(zsd.M0(M0, new l1(continuation, xqnVar, 29)), mm6Var, lkeVar);
    }

    @Override // defpackage.pke
    public final void onDestroy() {
        p7b p7bVar = (p7b) dke.b.remove(this.a);
        if (p7bVar == null || !p7bVar.e) {
            return;
        }
        p7bVar.e = false;
        rar rarVar = p7bVar.c;
        if (rarVar != null) {
            rarVar.g(null);
        }
        p7bVar.c = null;
    }

    @Override // defpackage.pke
    public final void onStop() {
        p7b a = dke.a(this);
        if (a.e) {
            a.e = false;
            rar rarVar = a.c;
            if (rarVar != null) {
                rarVar.g(null);
            }
            a.c = null;
        }
    }
}
