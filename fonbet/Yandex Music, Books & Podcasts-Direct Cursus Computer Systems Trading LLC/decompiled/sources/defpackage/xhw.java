package defpackage;

import android.content.Context;
import android.media.AudioManager;
import com.yandex.media.ynison.service.a;
import com.yandex.media.ynison.service.c;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.d;
import com.yandex.media.ynison.service.e0;
import com.yandex.media.ynison.service.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xhw implements dcw {
    public static final String w = "YnisonCore:".concat("Ynison");
    public final hgp b;
    public final vtm c;
    public final elw d;
    public final uiq e;
    public final kqn f;
    public final u13 g;
    public final rn5 h;
    public final jyr i;
    public final AtomicBoolean j;
    public final AtomicBoolean k;
    public final rjq l;
    public final um6 m;
    public final um6 n;
    public ghw o;
    public final ReentrantLock p;
    public final uiw q;
    public final z6n r;
    public final jyr s;
    public final jyr t;
    public final AtomicReference u;
    public String v;

    public xhw(final Context context, hgp hgpVar, vtm vtmVar, elw elwVar, uiq uiqVar, kqn kqnVar, u13 u13Var, rn5 rn5Var, jyr jyrVar) {
        vtmVar.getClass();
        this.b = hgpVar;
        this.c = vtmVar;
        this.d = elwVar;
        this.e = uiqVar;
        this.f = kqnVar;
        this.g = u13Var;
        this.h = rn5Var;
        this.i = jyrVar;
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        rjq rjqVar = new rjq(false);
        this.l = rjqVar;
        this.m = hld.s(rjqVar, dm6.b());
        this.n = hld.s(rjqVar, dm6.b);
        this.p = new ReentrantLock();
        this.q = new uiw();
        this.r = new z6n(18, hgpVar);
        final int i = 0;
        this.s = btf.b(new Function0() { // from class: qhw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        xhw xhwVar = this;
                        return new atw(context, xhwVar.b, xhwVar.f(), (ydw) xhwVar.h.d);
                    default:
                        xhw xhwVar2 = this;
                        return new cju(context, xhwVar2.f(), (nfw) xhwVar2.h.c);
                }
            }
        });
        final int i2 = 1;
        this.t = btf.b(new Function0() { // from class: qhw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        xhw xhwVar = this;
                        return new atw(context, xhwVar.b, xhwVar.f(), (ydw) xhwVar.h.d);
                    default:
                        xhw xhwVar2 = this;
                        return new cju(context, xhwVar2.f(), (nfw) xhwVar2.h.c);
                }
            }
        });
        this.u = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(xhw xhwVar, c0 c0Var, c0 c0Var2) {
        boolean z;
        e0 a;
        um6 um6Var = xhwVar.m;
        uiw uiwVar = xhwVar.q;
        ReentrantLock reentrantLock = uiwVar.a;
        reentrantLock.lock();
        try {
            e0 e0Var = uiwVar.f;
            if (e0Var == null) {
                return;
            }
            ReentrantLock reentrantLock2 = xhwVar.p;
            reentrantLock2.lock();
            try {
                ghw ghwVar = xhwVar.o;
                boolean z2 = false;
                if (ghwVar != null) {
                    if (ghwVar.l.get()) {
                        z = true;
                        reentrantLock2.unlock();
                        Continuation continuation = null;
                        if (z) {
                            e0 a2 = uiwVar.a();
                            if (a2 == null) {
                                return;
                            }
                            x97.y(um6Var, null, null, new l1p(a2, xhwVar, "ynison is down", continuation, 10), 3);
                            return;
                        }
                        boolean d = Intrinsics.d(c0Var2.p().j(), xhwVar.f());
                        if (!c0Var2.m() && (c0Var == null || c0Var.m())) {
                            z2 = true;
                        }
                        rse m = e0Var.m();
                        m.getClass();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : m) {
                            if (!((a) obj).l()) {
                                arrayList.add(obj);
                            }
                        }
                        if ((arrayList.size() == 1 || !e0Var.q()) && z2 && d && (a = uiwVar.a()) != null) {
                            x97.y(um6Var, null, null, new l1p(a, xhwVar, "request playing", continuation, 10), 3);
                            return;
                        }
                        return;
                    }
                }
                z = false;
                reentrantLock2.unlock();
                Continuation continuation2 = null;
                if (z) {
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(xhw xhwVar, ghw ghwVar, kot kotVar, Continuation continuation) {
        double d;
        boolean z;
        String str;
        Object obj;
        d m;
        z6n z6nVar = xhwVar.r;
        uiw uiwVar = xhwVar.q;
        ArrayList b = uiwVar.b();
        z6nVar.getClass();
        kotVar.getClass();
        String str2 = kotVar.a;
        d dVar = kotVar.b;
        Continuation continuation2 = null;
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((a) obj).k().m(), str2)) {
                    break;
                }
            }
            a aVar = (a) obj;
            if (aVar != null && (m = aVar.m()) != null) {
                d = m.j();
                z = Math.abs(d - dVar.j()) >= 0.001d;
                if (z) {
                    str = "Volume(" + d + " --> " + dVar.j() + ")";
                } else {
                    str = "same";
                }
                if (!z) {
                    dcw.a.getClass();
                    ssg.a(2, qbw.b, "Skip sending volume since it doesn't changed relatively last received state", null);
                    return Unit.a;
                }
                ReentrantLock reentrantLock = uiwVar.a;
                reentrantLock.lock();
                try {
                    uiwVar.b();
                    uiwVar.b.put(str2, dVar);
                    reentrantLock.unlock();
                    ghwVar.getClass();
                    Object c = ghwVar.c("updateVolume", new wzv(kotVar, str, continuation2, 10), continuation);
                    nm6 nm6Var = nm6.a;
                    if (c != nm6Var) {
                        c = Unit.a;
                    }
                    return c == nm6Var ? c : Unit.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
        d = -1.0d;
        if (Math.abs(d - dVar.j()) >= 0.001d) {
        }
        if (z) {
        }
        if (!z) {
        }
    }

    public static final boolean c(xhw xhwVar) {
        c k;
        e0 a = xhwVar.q.a();
        String str = null;
        a m = a != null ? uwf.m(a, uwf.p(a)) : null;
        if (m != null && (k = m.k()) != null) {
            str = k.m();
        }
        return !Intrinsics.d(str, xhwVar.f()) && m == null;
    }

    public static final void d(xhw xhwVar, e0 e0Var, u7g u7gVar) {
        rse m;
        Object obj;
        d m2;
        xhwVar.k.set(true);
        cju cjuVar = (cju) xhwVar.t.getValue();
        String str = cjuVar.b;
        gq4 b = gx1.b((AudioManager) cjuVar.g.getValue());
        if (((Number) b.g()).doubleValue() != ((Number) b.m()).doubleValue() && e0Var != null && (m = e0Var.m()) != null) {
            Iterator<E> it = m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.d(((a) obj).k().m(), str)) {
                        break;
                    }
                }
            }
            a aVar = (a) obj;
            if (aVar != null && (m2 = aVar.m()) != null) {
                if (Intrinsics.d(m2.i().j(), str) || bwt.a.contains(m2.i().j())) {
                    m2 = null;
                }
                if (m2 != null) {
                    Double U = wdg.U(m2.j(), gx1.a, b);
                    if (U != null) {
                        int doubleValue = (int) U.doubleValue();
                        rar rarVar = cjuVar.e;
                        if (rarVar != null) {
                            rarVar.g(null);
                        }
                        cjuVar.e = x97.y(cjuVar.d, null, null, new npt(cjuVar, doubleValue, b, (Continuation) null), 3);
                    } else {
                        nfw nfwVar = cjuVar.c;
                        d m3 = aVar.m();
                        m3.getClass();
                        osw oswVar = nfwVar.a;
                        oswVar.getClass();
                        vdw[] vdwVarArr = vdw.a;
                        Pair pair = new Pair("level", Double.valueOf(m3.j()));
                        Pair pair2 = new Pair("range", "[" + b.g() + ", " + b.m() + "]");
                        s0 i = m3.hasVersion() ? m3.i() : null;
                        oswVar.a("YNISON_ERROR_VOLUME_OTHER", uah.e(pair, pair2, new Pair("device", i != null ? i.j() : null)));
                    }
                }
            }
        }
        xhwVar.u.set(e0Var);
        ((ifw) xhwVar.h.h).a(u7gVar);
    }

    public final void e(String str) {
        ReentrantLock reentrantLock = this.p;
        reentrantLock.lock();
        try {
            if (Intrinsics.d(this.v, str)) {
                return;
            }
            this.v = str;
            reentrantLock.unlock();
            v3w.l("Request active device id change to ", str, 4, w, null);
            x97.y(this.n, null, null, new rhw(str, this, (Continuation) null), 3);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String f() {
        return ((dgw) this.h.e).b();
    }
}
