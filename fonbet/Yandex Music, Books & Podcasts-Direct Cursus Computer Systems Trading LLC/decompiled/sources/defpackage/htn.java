package defpackage;

import com.yandex.music.shared.relay.common.proto.a;
import com.yandex.music.shared.relay.common.proto.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* loaded from: classes6.dex */
public final class htn {
    public final CoroutineContext a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;

    public htn() {
        g gVar = g.a;
        gVar.getClass();
        gVar.getClass();
        this.a = gVar;
        bdt I = hag.I(skr.class);
        l18 l18Var = l18.b;
        this.b = l18Var.b(I, true);
        this.c = l18Var.b(hag.I(oq7.class), true);
        this.d = l18Var.b(hag.I(k1l.class), true);
        this.e = l18Var.b(hag.I(g0l.class), true);
        this.f = l18Var.b(hag.I(frt.class), true);
        this.g = l18Var.b(hag.I(kbn.class), true);
        this.h = l18Var.b(hag.I(lwr.class), true);
        this.i = btf.b(new b6n(19, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        ftn ftnVar;
        int i;
        String str;
        if (continuation instanceof ftn) {
            ftnVar = (ftn) continuation;
            int i2 = ftnVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ftnVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ftnVar.j;
                nm6 nm6Var = nm6.a;
                i = ftnVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "Relay:Service", "checkAuthorization()", null);
                    pjc g = ((frt) this.f.getValue()).g();
                    ftnVar.l = 1;
                    obj = zsd.g0(g, ftnVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xxq xxqVar = (xxq) obj;
                boolean a = xxqVar.a();
                str = xxqVar.a;
                ssg.a(3, "Relay:Service", "checkAuthorization() - user.authorized=" + a + ", user.id=" + str, null);
                boolean a2 = xxqVar.a();
                u02 u02Var = (u02) a.d.createBuilder();
                u02Var.d();
                ((a) u02Var.b).b = a2;
                if (str != null) {
                    u02Var.d();
                    a aVar = (a) u02Var.b;
                    aVar.getClass();
                    aVar.a |= 1;
                    aVar.c = str;
                }
                return (a) u02Var.b();
            }
        }
        ftnVar = new ftn(this, continuation);
        Object obj2 = ftnVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ftnVar.l;
        if (i != 0) {
        }
        xxq xxqVar2 = (xxq) obj2;
        boolean a3 = xxqVar2.a();
        str = xxqVar2.a;
        ssg.a(3, "Relay:Service", "checkAuthorization() - user.authorized=" + a3 + ", user.id=" + str, null);
        boolean a22 = xxqVar2.a();
        u02 u02Var2 = (u02) a.d.createBuilder();
        u02Var2.d();
        ((a) u02Var2.b).b = a22;
        if (str != null) {
        }
        return (a) u02Var2.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(d dVar, Continuation continuation) {
        gtn gtnVar;
        int i;
        if (continuation instanceof gtn) {
            gtnVar = (gtn) continuation;
            int i2 = gtnVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gtnVar.l = i2 - Integer.MIN_VALUE;
                Object obj = gtnVar.j;
                nm6 nm6Var = nm6.a;
                i = gtnVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    mye myeVar = (mye) this.i.getValue();
                    gtnVar.l = 1;
                    if (myeVar.a(dVar, gtnVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                m4b f = m4b.f();
                f.getClass();
                return f;
            }
        }
        gtnVar = new gtn(this, continuation);
        Object obj2 = gtnVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gtnVar.l;
        if (i != 0) {
        }
        m4b f2 = m4b.f();
        f2.getClass();
        return f2;
    }
}
