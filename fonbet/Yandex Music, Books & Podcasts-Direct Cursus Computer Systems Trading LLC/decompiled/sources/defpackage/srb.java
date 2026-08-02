package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.media3.session.i;
import com.yandex.passport.common.logger.d;
import com.yandex.passport.data.network.cb;
import com.yandex.passport.data.network.xa;
import com.yandex.passport.internal.interaction.a;
import com.yandex.passport.internal.network.mappers.b;
import com.yandex.passport.internal.ui.domik.e;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class srb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ srb(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x031c A[LOOP:1: B:68:0x0316->B:70:0x031c, LOOP_END] */
    /* JADX WARN: Type inference failed for: r3v25, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object t7oVar;
        Iterator it;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                boolean z = this.b;
                xrb xrbVar = (xrb) this.d;
                ndl ndlVar = (ndl) this.e;
                joh N = joh.N(context);
                if (N == null) {
                    vq1.n0("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    xrbVar.c1(N);
                }
                LogSessionId f0 = N.f0();
                synchronized (ndlVar) {
                    fc6 fc6Var = ndlVar.b;
                    fc6Var.getClass();
                    fc6Var.d(f0);
                }
                return;
            case 1:
                g06 g06Var = (g06) this.c;
                String str = (String) this.d;
                boolean z2 = this.b;
                byb bybVar = (byb) this.e;
                if (Intrinsics.d(str, ((byb) g06Var.d).j)) {
                    ayb Q = g06Var.Q(g06Var.Y(str), false);
                    if (Intrinsics.d(str, ((byb) g06Var.d).j)) {
                        byb bybVar2 = (byb) g06Var.d;
                        String str2 = Q.a;
                        Map map = Q.b;
                        Map map2 = Q.c;
                        vx6 vx6Var = Q.d;
                        if (z2) {
                            tyb tybVar = bybVar2.e;
                            tybVar.getClass();
                            str2.getClass();
                            HashMap hashMap = tybVar.d;
                            ReentrantLock reentrantLock = tybVar.e;
                            reentrantLock.lock();
                            try {
                                uyb uybVar = (uyb) hashMap.get(str2);
                                if (uybVar == null) {
                                    Object a = tybVar.b.a(str2);
                                    r7o r7oVar = z7o.b;
                                    if (a instanceof t7o) {
                                        a = null;
                                    }
                                    hashMap.put(str2, (uyb) a);
                                    uybVar = (uyb) a;
                                }
                                if (uybVar != null) {
                                    Integer num = uybVar.b;
                                    if (uybVar.a + 900000 <= tybVar.c.b()) {
                                        CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
                                    } else {
                                        Integer num2 = tybVar.a;
                                        if (num != null && num2.intValue() <= num.intValue()) {
                                            CopyOnWriteArrayList copyOnWriteArrayList2 = ssg.a;
                                            exb exbVar = exb.b;
                                            it = ((byb) g06Var.d).l.b0().iterator();
                                            while (it.hasNext()) {
                                                ((gxb) it.next()).c(exbVar);
                                            }
                                            bybVar.d.getClass();
                                            return;
                                        }
                                        CopyOnWriteArrayList copyOnWriteArrayList3 = ssg.a;
                                    }
                                }
                            } finally {
                                reentrantLock.unlock();
                            }
                        }
                        rj6 rj6Var = (rj6) x97.D(g.a, new g68(g06Var, continuation, 13));
                        if (rj6Var instanceof qj6) {
                            yxb yxbVar = (yxb) ((qj6) rj6Var).a;
                            LinkedHashMap i = uah.i(map2, yxbVar.a);
                            LinkedHashMap linkedHashMap = yxbVar.b;
                            ReentrantLock reentrantLock2 = (ReentrantLock) vx6Var.d;
                            fyb fybVar = (fyb) vx6Var.c;
                            reentrantLock2.lock();
                            try {
                                Map b = fybVar.b();
                                reentrantLock2.unlock();
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                Iterator it2 = bybVar2.l.b0().iterator();
                                while (it2.hasNext()) {
                                    gxb gxbVar = (gxb) it2.next();
                                    boolean z3 = gxbVar.a;
                                    String str3 = gxbVar.c;
                                    if (z3) {
                                        jxb jxbVar = (jxb) linkedHashMap.get(str3);
                                        if (jxbVar == null) {
                                            jxbVar = (jxb) b.get(str3);
                                        }
                                        if (jxbVar != null) {
                                            linkedHashMap2.put(str3, jxbVar);
                                        }
                                    }
                                }
                                reentrantLock2 = (ReentrantLock) vx6Var.d;
                                reentrantLock2.lock();
                                try {
                                    ((g06) vx6Var.b).b0(i);
                                    ReentrantLock reentrantLock3 = fybVar.d;
                                    reentrantLock3.lock();
                                    try {
                                        if (!Intrinsics.d(fybVar.e, linkedHashMap2)) {
                                            try {
                                                fybVar.a(fybVar.a).L(linkedHashMap2);
                                            } catch (IOException e) {
                                                ssg.a(7, null, "Failed to store experiments details to file.", e);
                                                linkedHashMap2 = null;
                                            }
                                            fybVar.e = linkedHashMap2;
                                        }
                                        reentrantLock2.unlock();
                                        g06Var.V(str2, i);
                                        tyb tybVar2 = bybVar2.e;
                                        tybVar2.getClass();
                                        str2.getClass();
                                        long b2 = tybVar2.c.b();
                                        HashMap hashMap2 = tybVar2.d;
                                        uyb uybVar2 = new uyb(b2, tybVar2.a);
                                        tybVar2.e.lock();
                                        try {
                                            vg0 vg0Var = tybVar2.b;
                                            try {
                                                r7o r7oVar2 = z7o.b;
                                                File filesDir = vg0Var.a.getFilesDir();
                                                filesDir.getClass();
                                                zac.f(new File(new File(new File(filesDir, "experiments2"), str2), "throttle.txt"), uybVar2.toString());
                                                t7oVar = Unit.a;
                                            } catch (Throwable th) {
                                                r7o r7oVar3 = z7o.b;
                                                t7oVar = new t7o(th);
                                            }
                                            if (!(t7oVar instanceof t7o)) {
                                                hashMap2.put(str2, uybVar2);
                                            }
                                            if (z7o.a(t7oVar) != null) {
                                                hashMap2.put(str2, null);
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    } finally {
                                        reentrantLock3.unlock();
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } else {
                            if (!(rj6Var instanceof pj6)) {
                                b6e.s();
                                return;
                            }
                            g06Var.V(str2, uah.i(map, map2));
                        }
                        exb exbVar2 = exb.b;
                        it = ((byb) g06Var.d).l.b0().iterator();
                        while (it.hasNext()) {
                        }
                        bybVar.d.getClass();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                i iVar = (i) this.c;
                boolean z4 = this.b;
                wrh wrhVar = (wrh) this.d;
                Runnable runnable = (Runnable) this.e;
                if (z4) {
                    iVar.b(wrhVar, new uvg(new alp(Bundle.EMPTY, "androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY")));
                }
                runnable.run();
                iVar.g.i.v(wrhVar);
                return;
            case 3:
                r0o r0oVar = (r0o) this.c;
                xrh xrhVar = (xrh) this.d;
                boolean z5 = this.b;
                wrh wrhVar2 = (wrh) this.e;
                i iVar2 = ((sth) r0oVar.d).h;
                lrl lrlVar = iVar2.t;
                vwh.f(lrlVar, xrhVar);
                int c = lrlVar.c();
                if (c == 1) {
                    if (lrlVar.V0(2)) {
                        lrlVar.q();
                    }
                } else if (c == 4 && lrlVar.V0(4)) {
                    lrlVar.C();
                }
                if (z5 && lrlVar.V0(1)) {
                    lrlVar.d();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i2 : new int[]{31, 2}) {
                    vq1.A(!false);
                    sparseBooleanArray.append(i2, true);
                }
                if (z5) {
                    vq1.A(!false);
                    sparseBooleanArray.append(1, true);
                }
                vq1.A(!false);
                iVar2.r(wrhVar2);
                return;
            case 4:
                jac jacVar = (jac) this.c;
                kq6 kq6Var = (kq6) this.d;
                uib uibVar = (uib) this.e;
                boolean z6 = this.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                ((tq6) jacVar.b).d(kq6Var, uibVar.a, z6);
                return;
            default:
                a aVar = (a) this.c;
                e eVar = (e) this.d;
                String str4 = (String) this.e;
                boolean z7 = this.b;
                try {
                    cb cbVar = (cb) aVar.f;
                    b bVar = (b) aVar.e;
                    com.yandex.passport.common.core.b f = eVar.f();
                    bVar.getClass();
                    xa xaVar = new xa(b.a(f), eVar.g(), str4, z7);
                    cbVar.getClass();
                    x97.D(g.a, new com.yandex.passport.internal.methods.performer.b(cbVar, xaVar, continuation, 29));
                    aVar.c.m(Boolean.FALSE);
                    ((ezc) aVar.g).invoke(eVar);
                    return;
                } catch (Throwable th3) {
                    aVar.c.m(Boolean.FALSE);
                    aVar.b.m(aVar.d.a(th3));
                    d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Verify sms error:", th3);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ srb(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public /* synthetic */ srb(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }
}
