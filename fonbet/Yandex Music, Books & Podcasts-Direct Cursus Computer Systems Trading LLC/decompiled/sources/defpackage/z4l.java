package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class z4l {
    public final tf6 a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public volatile String g;
    public volatile boolean h;
    public final oi i;

    public z4l() {
        tf6 e = gld.e(a4g.n());
        this.a = e;
        bdt I = hag.I(qjr.class);
        l18 l18Var = l18.b;
        this.b = l18Var.b(I, true);
        this.c = l18Var.b(hag.I(z66.class), true);
        this.d = l18Var.b(hag.I(frt.class), true);
        this.e = l18Var.b(hag.I(r1l.class), true);
        this.f = l18Var.b(hag.I(oq7.class), true);
        this.i = bg3.i(e, dm6.b, -1, null, new y4l(this, null, 1), 12);
        d1j d1jVar = new d1j(23, this);
        if (lbr.a.get() == gcr.c) {
            d1jVar.invoke();
            return;
        }
        ReentrantLock reentrantLock = lbr.e;
        reentrantLock.lock();
        try {
            lbr.f.add(d1jVar);
            reentrantLock.unlock();
            lbr.b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01de, code lost:
    
        if (defpackage.x97.V(r0, r4, r2) == r3) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z4l z4lVar, s4l s4lVar, cg6 cg6Var) {
        x4l x4lVar;
        int i;
        pst pstVar;
        long j;
        rj6 rj6Var;
        Object[] objArr;
        if (cg6Var instanceof x4l) {
            x4lVar = (x4l) cg6Var;
            int i2 = x4lVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x4lVar.n = i2 - Integer.MIN_VALUE;
                Object obj = x4lVar.l;
                nm6 nm6Var = nm6.a;
                i = x4lVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!((z66) z4lVar.c.getValue()).g()) {
                        return Unit.a;
                    }
                    String str = z4lVar.g;
                    if (str == null) {
                        return Unit.a;
                    }
                    if (str.equals(drt.f.a)) {
                        return Unit.a;
                    }
                    if (!z4lVar.h) {
                        z4lVar.h = frc.a.e.get();
                    }
                    if (!z4lVar.h) {
                        return Unit.a;
                    }
                    Context context = (Context) l18.b.b(hag.I(Context.class), true).getValue();
                    context.getClass();
                    pst pstVar2 = new pst(context, str, "prefs");
                    long j2 = pstVar2.a.getLong("playback_sync_time", 0L);
                    if (j2 < 0) {
                        dfi.r(dfi.e(j2, "Illegal valued saved in lastTime=", ", change to 0"), "PlaybackSaveProgressReporter");
                        j2 = 0;
                    }
                    d5l d5lVar = ((r1l) z4lVar.e.getValue()).a;
                    ReentrantLock reentrantLock = d5lVar.i;
                    reentrantLock.lock();
                    try {
                        ConcurrentHashMap concurrentHashMap = d5lVar.d;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((l1l) entry.getValue()).d > j2) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        reentrantLock.unlock();
                        int ordinal = s4lVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                                if (linkedHashMap.isEmpty()) {
                                    return Unit.a;
                                }
                            } else if (ordinal != 4) {
                                b6e.s();
                                return null;
                            }
                        }
                        qjr qjrVar = (qjr) z4lVar.b.getValue();
                        x0l x0lVar = new x0l(new Date(j2), linkedHashMap.values());
                        x4lVar.j = pstVar2;
                        x4lVar.k = j2;
                        x4lVar.n = 1;
                        obj = qjrVar.a(x0lVar, x4lVar);
                        if (obj != nm6Var) {
                            pstVar = pstVar2;
                            j = j2;
                        }
                        return nm6Var;
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = x4lVar.k;
                pstVar = x4lVar.j;
                qgg.h0(obj);
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof nj6)) {
                    return Unit.a;
                }
                if (rj6Var instanceof pj6) {
                    return Unit.a;
                }
                if (!(rj6Var instanceof qj6)) {
                    b6e.s();
                    return null;
                }
                SharedPreferences.Editor edit = pstVar.edit();
                qj6 qj6Var = (qj6) rj6Var;
                edit.putLong("playback_sync_time", ((x0l) qj6Var.a).a.getTime());
                edit.apply();
                Iterator it = ((x0l) qj6Var.a).b.iterator();
                while (true) {
                    objArr = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    l1l l1lVar = (l1l) it.next();
                    r1l r1lVar = (r1l) z4lVar.e.getValue();
                    r1lVar.getClass();
                    l1lVar.getClass();
                    String str2 = l1lVar.a;
                    d5l d5lVar2 = r1lVar.a;
                    d5lVar2.getClass();
                    str2.getClass();
                    d5lVar2.f.await();
                    l1l l1lVar2 = (l1l) d5lVar2.d.get(str2);
                    Long valueOf = l1lVar2 != null ? Long.valueOf(l1lVar2.d) : null;
                    if ((valueOf != null ? valueOf.longValue() : 0L) <= l1lVar.d) {
                        r1lVar.a.a(l1lVar);
                    }
                }
                seg segVar = new seg((Object) qj6Var, (Object) z4lVar, (Continuation) (objArr == true ? 1 : 0), 16);
                bsd b = dm6.b();
                x4lVar.j = null;
                x4lVar.k = j;
                x4lVar.n = 2;
            }
        }
        x4lVar = new x4l(z4lVar, cg6Var);
        Object obj2 = x4lVar.l;
        nm6 nm6Var2 = nm6.a;
        i = x4lVar.n;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof nj6)) {
        }
    }

    public final void b(s4l s4lVar) {
        x97.y(this.a, null, null, new h1j(this, s4lVar, (Continuation) null, 29), 3);
    }
}
