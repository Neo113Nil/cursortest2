package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Handler;
import android.view.animation.Animation;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class jtc implements pm5, u97, w2q, leg, r9i, adu, u0f, x7o, oo4 {
    public Object a;
    public Object b;

    public jtc(int i) {
        switch (i) {
            case 8:
                this.a = new om3();
                break;
            case 9:
                this.a = new LinkedHashSet();
                this.b = new LinkedHashSet();
                break;
            case 16:
                this.a = new AtomicInteger();
                this.b = new AtomicInteger();
                break;
            case 17:
                this.a = new Object();
                this.b = new LinkedHashMap();
                break;
            case 22:
                nej nejVar = new nej(1);
                Boolean bool = Boolean.TRUE;
                xdr xdrVar = nejVar.a;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                xdr xdrVar2 = nejVar.b;
                xdrVar2.getClass();
                xdrVar2.m(null, bool);
                xdr xdrVar3 = nejVar.c;
                xdrVar3.getClass();
                xdrVar3.m(null, bool);
                xdr xdrVar4 = nejVar.d;
                xdrVar4.getClass();
                xdrVar4.m(null, bool);
                Float valueOf = Float.valueOf(0.0f);
                xdr xdrVar5 = nejVar.e;
                xdrVar5.getClass();
                xdrVar5.m(null, valueOf);
                f1d.s(5.0f, nejVar.f, null);
                f1d.s(100.0f, nejVar.g, null);
                f1d.s(10.0f, nejVar.h, null);
                f1d.s(-2.0f, nejVar.i, null);
                xdr xdrVar6 = nejVar.j;
                xdrVar6.getClass();
                xdrVar6.m(null, valueOf);
                this.a = nejVar;
                this.b = new ia0();
                break;
            default:
                this.a = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
                byte[] bArr = new byte[128];
                this.b = bArr;
                int i2 = 0;
                for (int i3 = 0; i3 < 128; i3++) {
                    bArr[i3] = -1;
                }
                while (true) {
                    byte[] bArr2 = (byte[]) this.a;
                    if (i2 >= bArr2.length) {
                        bArr[65] = bArr[97];
                        bArr[66] = bArr[98];
                        bArr[67] = bArr[99];
                        bArr[68] = bArr[100];
                        bArr[69] = bArr[101];
                        bArr[70] = bArr[102];
                        break;
                    } else {
                        bArr[bArr2[i2]] = (byte) i2;
                        i2++;
                    }
                }
        }
    }

    public static void v(jtc jtcVar, String str) {
        jtcVar.getClass();
        str.getClass();
        ((Handler) jtcVar.b).post(new juc(jtcVar, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object A(String str, cg6 cg6Var) {
        acj acjVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof acj) {
            acjVar = (acj) cg6Var;
            int i2 = acjVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                acjVar.l = i2 - Integer.MIN_VALUE;
                Object obj = acjVar.j;
                nm6 nm6Var = nm6.a;
                i = acjVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ay ayVar = (ay) this.b;
                    acjVar.l = 1;
                    obj = ayVar.a(str, acjVar);
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
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return ((qx) ((qj6) rj6Var).a).a;
                }
                if (rj6Var instanceof pj6) {
                    return c5b.a;
                }
                b6e.s();
                return null;
            }
        }
        acjVar = new acj(this, cg6Var);
        Object obj2 = acjVar.j;
        nm6 nm6Var2 = nm6.a;
        i = acjVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    public void C(sjb sjbVar) {
        sjbVar.getClass();
        y().a(sjbVar);
    }

    public void D(kjm kjmVar, int i, boolean z) {
        kjmVar.getClass();
        String str = (String) this.b;
        if (str == null) {
            return;
        }
        sfm sfmVar = (sfm) this.a;
        String str2 = kjmVar.b;
        str2.getClass();
        nmb nmbVar = (nmb) sfmVar.b;
        kmb kmbVar = kmb.Tap;
        String G = ((fnb) sfmVar.a).G();
        wjb wjbVar = wjb.SearchScreen;
        qkb qkbVar = qkb.Carousel;
        sjb sjbVar = sjb.Ok;
        nmb.i(nmbVar, G, wjbVar, null, null, pkb.UpcomingAlbum, str2, i + 1, "search_best_results", "SEARCH_BEST_RESULTS", "search_request:".concat(str), "", "", z ? "like" : "unlike", 82313464);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.jvm.functions.Function0, uif] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object E(Continuation continuation) {
        ckn cknVar;
        int i;
        jtc jtcVar;
        if (continuation instanceof ckn) {
            cknVar = (ckn) continuation;
            int i2 = cknVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cknVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cknVar.k;
                nm6 nm6Var = nm6.a;
                i = cknVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    jtcVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jtcVar = cknVar.j;
                    qgg.h0(obj);
                }
                while (!((Boolean) ((uif) jtcVar.a).invoke()).booleanValue()) {
                    zi3 zi3Var = (zi3) jtcVar.b;
                    cknVar.j = jtcVar;
                    cknVar.m = 1;
                    if (zi3Var.l(cknVar) == nm6Var) {
                        return nm6Var;
                    }
                }
                return Unit.a;
            }
        }
        cknVar = new ckn(this, continuation);
        Object obj2 = cknVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cknVar.m;
        if (i != 0) {
        }
        while (!((Boolean) ((uif) jtcVar.a).invoke()).booleanValue()) {
        }
        return Unit.a;
    }

    @Override // defpackage.u97
    public void Q(aa7 aa7Var, om3 om3Var) {
        ByteBuffer allocate = ByteBuffer.allocate(om3Var.c);
        while (om3Var.c > 0) {
            byte d = om3Var.d();
            if (d == 10) {
                allocate.flip();
                ((om3) this.a).a(allocate);
                ((w5g) this.b).s(((om3) this.a).l(null));
                this.a = new om3();
                return;
            }
            allocate.put(d);
        }
        allocate.flip();
        ((om3) this.a).a(allocate);
    }

    public kfj a(e5d e5dVar, co6 co6Var) {
        String str = e5dVar.c;
        return new kfj(str, e5dVar.d, str, ((o8q) this.b).a.c(R.string.app_name_full), co6Var, 0L);
    }

    public kfj b(mqs mqsVar, co6 co6Var) {
        String j = mqsVar.j();
        o8q o8qVar = (o8q) this.b;
        return new kfj(j, zwf.a0(mqsVar, o8qVar, R.string.unknown_album).toString(), mqsVar.d.d, zwf.a0(mqsVar, o8qVar, R.string.unknown_album).toString(), co6Var, mqsVar.e);
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        throw null;
    }

    @Override // defpackage.oo4
    public void d(s2i s2iVar) {
        int i;
        int i2;
        if (((lao) this.a).d > 0) {
            l2i l2iVar = x7h.E;
            s2iVar.a(l2iVar);
            s2iVar.g(l2iVar, String.valueOf(((lao) this.a).d));
        }
        x7h x7hVar = (x7h) this.b;
        lao laoVar = (lao) this.a;
        l2i l2iVar2 = x7h.E;
        lr1 c = x7hVar.c(laoVar);
        if (c != null) {
            x7hVar.b.execute(c);
        }
        if (((x7h) this.b).o.f == ((lao) this.a)) {
            mao maoVar = ((x7h) this.b).m;
            if (maoVar != null) {
                AtomicInteger atomicInteger = maoVar.d;
                do {
                    i = atomicInteger.get();
                    i2 = maoVar.a;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, Math.min(maoVar.c + i, i2)));
            }
            ((x7h) this.b).c.execute(new e8h(13, this, s2iVar));
        }
    }

    public void e(y6p y6pVar, int i, q0p q0pVar) {
        wjb wjbVar;
        y6pVar.getClass();
        String str = (String) this.b;
        if (str == null) {
            return;
        }
        sfm sfmVar = (sfm) this.a;
        int ordinal = q0pVar.ordinal();
        if (ordinal == 0) {
            wjbVar = wjb.ConcertScreen;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            wjbVar = wjb.ConcertPurchaseScreen;
        }
        wjb wjbVar2 = wjbVar;
        nmb nmbVar = (nmb) sfmVar.b;
        String str2 = y6pVar.d;
        pkb S = ezf.S(y6pVar);
        int i2 = i + 1;
        String G = ((fnb) sfmVar.a).G();
        wjb wjbVar3 = wjb.SearchScreen;
        qkb qkbVar = qkb.Carousel;
        String concat = "search_request:".concat(str);
        String str3 = (String) ((LinkedHashMap) sfmVar.c).get(y6pVar.d);
        if (str3 == null) {
            str3 = "";
        }
        nmbVar.n(wjbVar3, wjbVar2, G, wjbVar3, (r60 & 16) != 0 ? ilb.Fullscreen : null, (r60 & 32) != 0 ? glb.Fullscreen : null, (r60 & 64) != 0 ? "" : null, (r60 & 128) != 0 ? pkb.NonApplicable : null, (r60 & 256) != 0 ? "" : null, S, str2, (r60 & 2048) != 0 ? 0 : 1, (r60 & 4096) != 0 ? 0 : i2, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : "top", (r60 & 16384) != 0 ? 0 : 1, (32768 & r60) != 0 ? false : true, "search_best_results", "SEARCH_BEST_RESULTS", 1, (524288 & r60) != 0 ? 1 : 0, (1048576 & r60) != 0 ? 0 : 1, (2097152 & r60) != 0 ? "" : concat, (4194304 & r60) != 0 ? "" : null, (8388608 & r60) != 0 ? "" : null, (16777216 & r60) != 0 ? 0 : 0, str3, "", "", (r60 & 268435456) != 0 ? "" : "");
    }

    @Override // defpackage.u0f
    public List e0() {
        boolean contains;
        ArrayList b = aoi.c().b((String) this.a);
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            z75.t(arrayList, ((oq) it.next()).F);
        }
        if (!((z66) this.b).h()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            mqs mqsVar = (mqs) next;
            if (mqsVar == null) {
                su4.s(2, null, "PermanentCachedTrackPredicate: track is null", null);
                contains = false;
            } else {
                l18 l18Var = l18.b;
                bdt I = hag.I(uaa.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                contains = ((lja) ((e6q) ((uaa) qdcVar.C(I))).e.getValue()).a.contains(mqsVar.a);
            }
            if (contains) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    @Override // defpackage.leg
    public axh f() {
        znk znkVar = new znk(10, new j4x[]{new j4x(0, (mi3[]) ((LinkedHashMap) this.a).values().toArray(new mi3[0])), new j4x(100, new mi3[]{new wj0()})});
        qxp qxpVar = new qxp();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j4x[] j4xVarArr = (j4x[]) znkVar.b;
        for (int i = 0; i < 2; i++) {
            j4x j4xVar = j4xVarArr[i];
            linkedHashMap.put(Integer.valueOf(j4xVar.b), (mi3[]) j4xVar.c);
        }
        qxpVar.a = linkedHashMap;
        return new axh(new li3(qxpVar, (ArrayList) this.b));
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        co6 co6Var = (co6) dag.p(faqVar, new h1b((n7q) this.a));
        if (faqVar instanceof naq) {
            return b(((naq) faqVar).e, co6Var);
        }
        if (faqVar instanceof saq) {
            x1u x1uVar = ((saq) faqVar).e;
            return new kfj(x1uVar.b, v5g.B(x1uVar).toString(), "", v5g.B(x1uVar).toString(), co6Var, x1uVar.f);
        }
        if (faqVar instanceof daq) {
            return a(((daq) faqVar).e, co6Var);
        }
        if (faqVar instanceof qaq) {
            return new kfj(((qaq) faqVar).c.d, "", "", "", co6Var, 0L);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return b(jzsVar.a, (co6) dag.p(jzsVar, new h1b((n7q) this.a)));
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        co6 co6Var = (co6) dag.p(m1qVar, new h1b((n7q) this.a));
        if (m1qVar instanceof c2q) {
            return b(((c2q) m1qVar).d, co6Var);
        }
        if (m1qVar instanceof j1q) {
            return a(((j1q) m1qVar).d, co6Var);
        }
        if (m1qVar instanceof e2q) {
            ckd ckdVar = ((e2q) m1qVar).c;
            return new kfj(ckdVar.d, ckdVar.e, "", "", co6Var, ckdVar.g);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        co6 co6Var = (co6) dag.p(i5uVar, new h1b((n7q) this.a));
        x1u x1uVar = i5uVar.a;
        return new kfj(x1uVar.b, v5g.B(x1uVar).toString(), "", v5g.B(x1uVar).toString(), co6Var, x1uVar.f);
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return a(k4dVar.a, (co6) dag.p(k4dVar, new h1b((n7q) this.a)));
    }

    @Override // defpackage.r9i
    public void l(String str) {
        str.getClass();
        qdq.A(new ssb(24, str, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(s5d s5dVar, cg6 cg6Var) {
        qgl qglVar;
        int i;
        ReentrantLock reentrantLock;
        try {
            if (cg6Var instanceof qgl) {
                qglVar = (qgl) cg6Var;
                int i2 = qglVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    qglVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = qglVar.k;
                    nm6 nm6Var = nm6.a;
                    i = qglVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        nej nejVar = (nej) this.a;
                        qglVar.j = s5dVar;
                        qglVar.m = 1;
                        if (s5dVar.f(nejVar, qglVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        s5dVar = qglVar.j;
                        qgg.h0(obj);
                    }
                    ia0 ia0Var = (ia0) this.b;
                    i6q j = s5dVar.j();
                    ia0Var.getClass();
                    j.getClass();
                    reentrantLock = (ReentrantLock) ia0Var.a;
                    reentrantLock.lock();
                    ia0Var.p(j);
                    ia0Var.b = j;
                    reentrantLock.unlock();
                    return Unit.a;
                }
            }
            ia0Var.p(j);
            ia0Var.b = j;
            reentrantLock.unlock();
            return Unit.a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
        qglVar = new qgl(this, cg6Var);
        Object obj2 = qglVar.k;
        nm6 nm6Var2 = nm6.a;
        i = qglVar.m;
        if (i != 0) {
        }
        ia0 ia0Var2 = (ia0) this.b;
        i6q j2 = s5dVar.j();
        ia0Var2.getClass();
        j2.getClass();
        reentrantLock = (ReentrantLock) ia0Var2.a;
        reentrantLock.lock();
    }

    @Override // defpackage.oo4
    public void n(sgr sgrVar, no4 no4Var, s2i s2iVar) {
        boolean z;
        tpr tprVar;
        x7h x7hVar;
        r0o r0oVar;
        Integer num = -1;
        synchronized (((x7h) this.b).i) {
            x7h x7hVar2 = (x7h) this.b;
            x7hVar2.o = x7hVar2.o.d((lao) this.a);
            ((x7h) this.b).n.b.add(String.valueOf(sgrVar.a));
        }
        if (((x7h) this.b).r.decrementAndGet() == Integer.MIN_VALUE) {
            ((x7h) this.b).c.execute(new kao(this, 0));
            return;
        }
        lao laoVar = (lao) this.a;
        if (laoVar.c) {
            x7h x7hVar3 = (x7h) this.b;
            lr1 c = x7hVar3.c(laoVar);
            if (c != null) {
                x7hVar3.b.execute(c);
            }
            if (((x7h) this.b).o.f == ((lao) this.a)) {
                ((x7h) this.b).j(sgrVar, no4Var, s2iVar);
                return;
            }
            return;
        }
        no4 no4Var2 = no4.d;
        if (no4Var == no4Var2 && ((x7h) this.b).q.incrementAndGet() > 1000) {
            x7h x7hVar4 = (x7h) this.b;
            lr1 c2 = x7hVar4.c((lao) this.a);
            if (c2 != null) {
                x7hVar4.b.execute(c2);
            }
            if (((x7h) this.b).o.f == ((lao) this.a)) {
                ((x7h) this.b).j(sgr.n.i("Too many transparent retries. Might be a bug in gRPC").h(sgrVar.b()), no4Var, s2iVar);
                return;
            }
            return;
        }
        if (((x7h) this.b).o.f == null) {
            if (no4Var == no4Var2 || (no4Var == no4.b && ((x7h) this.b).p.compareAndSet(false, true))) {
                lao d = ((x7h) this.b).d(((lao) this.a).d, true);
                if (d == null) {
                    return;
                }
                x7h x7hVar5 = (x7h) this.b;
                if (x7hVar5.h) {
                    synchronized (x7hVar5.i) {
                        x7h x7hVar6 = (x7h) this.b;
                        x7hVar6.o = x7hVar6.o.c((lao) this.a, d);
                    }
                }
                ((x7h) this.b).b.execute(new jao(this, d, 1));
                return;
            }
            no4 no4Var3 = no4.c;
            x7h x7hVar7 = (x7h) this.b;
            if (no4Var != no4Var3) {
                x7hVar7.p.set(true);
                x7h x7hVar8 = (x7h) this.b;
                if (x7hVar8.h) {
                    String str = (String) s2iVar.c(x7h.F);
                    if (str != null) {
                        try {
                            num = Integer.valueOf(str);
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        num = null;
                    }
                    x7h x7hVar9 = (x7h) this.b;
                    boolean contains = x7hVar9.g.c.contains(sgrVar.a);
                    boolean z2 = (x7hVar9.m == null || (!contains && (num == null || num.intValue() >= 0))) ? false : !x7hVar9.m.a();
                    if (contains && !z2 && !sgrVar.g() && num != null && num.intValue() > 0) {
                        num = 0;
                    }
                    boolean z3 = contains && !z2;
                    if (z3) {
                        x7h.b((x7h) this.b, num);
                    }
                    synchronized (((x7h) this.b).i) {
                        try {
                            x7h x7hVar10 = (x7h) this.b;
                            x7hVar10.o = x7hVar10.o.b((lao) this.a);
                            if (z3) {
                                x7h x7hVar11 = (x7h) this.b;
                                if (!x7hVar11.i(x7hVar11.o)) {
                                    if (!((x7h) this.b).o.d.isEmpty()) {
                                    }
                                }
                                return;
                            }
                        } finally {
                        }
                    }
                } else {
                    tbo tboVar = x7hVar8.f;
                    long j = 0;
                    if (tboVar == null) {
                        tprVar = new tpr(false, 0L);
                    } else {
                        boolean contains2 = tboVar.f.contains(sgrVar.a);
                        String str2 = (String) s2iVar.c(x7h.F);
                        if (str2 != null) {
                            try {
                                num = Integer.valueOf(str2);
                            } catch (NumberFormatException unused2) {
                            }
                        } else {
                            num = null;
                        }
                        boolean z4 = (x7hVar8.m == null || (!contains2 && (num == null || num.intValue() >= 0))) ? false : !x7hVar8.m.a();
                        if (x7hVar8.f.a > ((lao) this.a).d + 1 && !z4) {
                            if (num == null) {
                                if (contains2) {
                                    j = (long) (x7h.H.nextDouble() * x7hVar8.x);
                                    double d2 = x7hVar8.x;
                                    tbo tboVar2 = x7hVar8.f;
                                    x7hVar8.x = Math.min((long) (d2 * tboVar2.d), tboVar2.c);
                                    z = true;
                                }
                            } else if (num.intValue() >= 0) {
                                j = TimeUnit.MILLISECONDS.toNanos(num.intValue());
                                x7hVar8.x = x7hVar8.f.b;
                                z = true;
                            }
                            tprVar = new tpr(z, j);
                        }
                        z = false;
                        tprVar = new tpr(z, j);
                    }
                    if (tprVar.a) {
                        lao d3 = ((x7h) this.b).d(((lao) this.a).d + 1, false);
                        if (d3 == null) {
                            return;
                        }
                        synchronized (((x7h) this.b).i) {
                            x7hVar = (x7h) this.b;
                            r0oVar = new r0o(x7hVar.i);
                            x7hVar.v = r0oVar;
                        }
                        r0oVar.d(x7hVar.d.schedule(new jao(this, d3, 0), tprVar.b, TimeUnit.NANOSECONDS));
                        return;
                    }
                }
            } else if (x7hVar7.h) {
                x7hVar7.h();
            }
        }
        x7h x7hVar12 = (x7h) this.b;
        lr1 c3 = x7hVar12.c((lao) this.a);
        if (c3 != null) {
            x7hVar12.b.execute(c3);
        }
        if (((x7h) this.b).o.f == ((lao) this.a)) {
            ((x7h) this.b).j(sgrVar, no4Var, s2iVar);
        }
    }

    @Override // defpackage.mjr
    public void onReady() {
        x7h x7hVar = (x7h) this.b;
        if (x7hVar.p()) {
            x7hVar.c.execute(new kao(this, 1));
        }
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        List list = (List) obj;
        list.getClass();
        zpm zpmVar = (zpm) this.a;
        zpm zpmVar2 = new zpm(list, zpmVar.b, zpmVar.c);
        eqm eqmVar = (eqm) this.b;
        eqmVar.q.l(zpmVar2);
        eqmVar.K(zpmVar2);
    }

    @Override // defpackage.r9i
    public void p(t9i t9iVar) {
        t9iVar.getClass();
        if (t9iVar instanceof va4) {
            qdq.A(new hgk(this, t9iVar, 0));
            return;
        }
        if (t9iVar instanceof cb4) {
            qdq.A(new ssb(25, (mgk) this.b, t9iVar));
        } else if (t9iVar instanceof xa4) {
            qdq.A(new hgk(this, t9iVar, 1));
        }
    }

    @Override // defpackage.pm5
    public void r(Exception exc) {
        pm5 pm5Var = (pm5) this.a;
        if (pm5Var != null) {
            pm5Var.r(exc);
        }
        dj3 dj3Var = (dj3) this.b;
        if (dj3Var != null) {
            dj3Var.b = false;
            dj3Var.c();
            dj3Var.e = 0;
        }
    }

    @Override // defpackage.mjr
    public void t(ljr ljrVar) {
        iao iaoVar = ((x7h) this.b).o;
        o2g.U("Headers should be received prior to messages.", iaoVar.f != null);
        if (iaoVar.f == ((lao) this.a)) {
            ((x7h) this.b).c.execute(new e8h(14, this, ljrVar));
            return;
        }
        Logger logger = xqd.a;
        while (true) {
            InputStream next = ljrVar.next();
            if (next == null) {
                return;
            } else {
                xqd.b(next);
            }
        }
    }

    public byte[] u(int i, String str) {
        byte[] bArr = (byte[]) this.b;
        if (i >= 0) {
            int i2 = 1;
            if (1 <= str.length() - i) {
                if ((i & 1) != 0) {
                    kac.f("a hexadecimal encoding must have an even number of characters");
                    return null;
                }
                int i3 = i >>> 1;
                byte[] bArr2 = new byte[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = i2 + 1;
                    byte b = bArr[str.charAt(i2)];
                    i2 += 2;
                    int i6 = bArr[str.charAt(i5)] | (b << 4);
                    if (i6 < 0) {
                        kac.f("invalid characters encountered in Hex string");
                        return null;
                    }
                    bArr2[i4] = (byte) i6;
                }
                return bArr2;
            }
        }
        e7o.o("invalid offset and/or length specified");
        return null;
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        ((bfk) obj).getClass();
        ((eqm) this.b).K((zpm) this.a);
    }

    public qe3 y() {
        return (qe3) ((jyr) this.b).getValue();
    }

    public void z(String str, String str2) {
        ArrayList arrayList = ((ik0) this.b).a;
        if (str.isEmpty()) {
            xq0.x("name is empty");
            return;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                xq0.x(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                return;
            }
        }
        if (str2 == null) {
            xq0.x("value == null");
            return;
        }
        int length2 = str2.length();
        for (int i3 = 0; i3 < length2; i3++) {
            char charAt2 = str2.charAt(i3);
            if (charAt2 <= 31 || charAt2 >= 127) {
                xq0.x(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i3), str2));
                return;
            }
        }
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jtc(Function0 function0) {
        this.a = (uif) function0;
        this.b = men.g(-1, 6, null);
    }

    public /* synthetic */ jtc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public jtc(Animation animation) {
        this.a = animation;
        this.b = null;
    }

    public jtc(Animator animator) {
        this.a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }

    public jtc(mgk mgkVar, gek gekVar) {
        gekVar.getClass();
        this.b = mgkVar;
        this.a = gekVar;
    }

    public jtc(x7h x7hVar, lao laoVar) {
        this.b = x7hVar;
        this.a = laoVar;
    }
}
