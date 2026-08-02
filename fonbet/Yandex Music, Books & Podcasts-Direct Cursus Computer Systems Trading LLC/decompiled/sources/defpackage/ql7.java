package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ql7 implements zqa {
    public final List a;
    public final oqb b;
    public final pt0 c;
    public final ozw d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final cl6 i;
    public final xeg j;
    public final ndl k;
    public final qmh l;
    public final UUID m;
    public final Looper n;
    public final tt1 o;
    public int p;
    public int q;
    public HandlerThread r;
    public ol7 s;
    public vvc t;
    public yqa u;
    public byte[] v;
    public byte[] w;
    public lqb x;
    public nqb y;

    public ql7(UUID uuid, oqb oqbVar, pt0 pt0Var, ozw ozwVar, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap hashMap, qmh qmhVar, Looper looper, xeg xegVar, ndl ndlVar) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = pt0Var;
        this.d = ozwVar;
        this.b = oqbVar;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.h = hashMap;
        this.l = qmhVar;
        this.i = new cl6();
        this.j = xegVar;
        this.k = ndlVar;
        this.p = 2;
        this.n = looper;
        this.o = new tt1(this, looper, 2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:61|(2:62|63)|(6:65|66|67|68|(1:70)|72)|75|66|67|68|(0)|72) */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0092 A[Catch: NumberFormatException -> 0x0096, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0096, blocks: (B:68:0x008a, B:70:0x0092), top: B:67:0x008a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        long min;
        long j;
        String str;
        String str2;
        Set set;
        if (this.g) {
            return;
        }
        byte[] bArr = this.v;
        int i = dvt.a;
        int i2 = this.e;
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                if (this.w == null || g()) {
                    f(2, z, bArr);
                    return;
                }
                return;
            }
            if (i2 != 3) {
                return;
            }
            this.w.getClass();
            this.v.getClass();
            f(3, z, this.w);
            return;
        }
        if (this.w == null) {
            f(1, z, bArr);
            return;
        }
        if (this.p == 4 || g()) {
            if (un3.d.equals(this.m)) {
                h();
                byte[] bArr2 = this.v;
                Pair pair = null;
                Map b = bArr2 == null ? null : this.b.b(bArr2);
                if (b != null) {
                    long j2 = -9223372036854775807L;
                    try {
                        str2 = (String) b.get("LicenseDurationRemaining");
                    } catch (NumberFormatException unused) {
                    }
                    if (str2 != null) {
                        j = Long.parseLong(str2);
                        Long valueOf = Long.valueOf(j);
                        str = (String) b.get("PlaybackDurationRemaining");
                        if (str != null) {
                            j2 = Long.parseLong(str);
                        }
                        pair = new Pair(valueOf, Long.valueOf(j2));
                    }
                    j = -9223372036854775807L;
                    Long valueOf2 = Long.valueOf(j);
                    str = (String) b.get("PlaybackDurationRemaining");
                    if (str != null) {
                    }
                    pair = new Pair(valueOf2, Long.valueOf(j2));
                }
                pair.getClass();
                min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
            } else {
                min = Long.MAX_VALUE;
            }
            if (this.e == 0 && min <= 60) {
                vq1.H("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + min);
                f(2, z, bArr);
                return;
            }
            if (min <= 0) {
                c(2, new icf());
                return;
            }
            this.p = 4;
            cl6 cl6Var = this.i;
            synchronized (cl6Var.a) {
                set = cl6Var.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((cra) it.next()).c();
            }
        }
    }

    public final boolean b() {
        int i = this.p;
        return i == 3 || i == 4;
    }

    public final void c(int i, Throwable th) {
        int i2;
        Set set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            i2 = dvt.D(dvt.E(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else {
            if (dvt.a < 23 || !(th instanceof MediaDrmResetException)) {
                if (!(th instanceof NotProvisionedException) && !xp3.W(th)) {
                    if (th instanceof DeniedByServerException) {
                        i2 = 6007;
                    } else if (th instanceof kmt) {
                        i2 = 6001;
                    } else if (th instanceof rl7) {
                        i2 = 6003;
                    } else if (th instanceof icf) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        } else if (i != 3) {
                            e7o.e();
                            return;
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.u = new yqa(i2, th);
        vq1.L("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            cl6 cl6Var = this.i;
            synchronized (cl6Var.a) {
                set = cl6Var.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((cra) it.next()).e((Exception) th);
            }
        } else if (!(th instanceof Error)) {
            b6e.o("Unexpected Throwable subclass", th);
            return;
        } else if (!xp3.X(th) && !xp3.W(th)) {
            throw ((Error) th);
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    public final void d(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || xp3.W(th)) {
            this.c.C(this);
        } else {
            c(z ? 1 : 2, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        Set set;
        if (b()) {
            return true;
        }
        try {
            byte[] d = this.b.d();
            this.v = d;
            this.b.i(d, this.k);
            this.t = this.b.j(this.v);
            this.p = 3;
            cl6 cl6Var = this.i;
            synchronized (cl6Var.a) {
                set = cl6Var.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((cra) it.next()).d(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.C(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (xp3.W(e)) {
                c(1, e);
                return false;
            }
            this.c.C(this);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (xp3.W(e)) {
            }
        }
    }

    public final void f(int i, boolean z, byte[] bArr) {
        try {
            lqb m = this.b.m(bArr, this.a, i, this.h);
            this.x = m;
            ol7 ol7Var = this.s;
            int i2 = dvt.a;
            m.getClass();
            ol7Var.getClass();
            ol7Var.obtainMessage(2, new pl7(cfg.f.getAndIncrement(), z, SystemClock.elapsedRealtime(), m)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            d(e, true);
        }
    }

    public final boolean g() {
        try {
            this.b.e(this.v, this.w);
            return true;
        } catch (Exception | NoSuchMethodError e) {
            c(1, e);
            return false;
        }
    }

    @Override // defpackage.zqa
    public final int getState() {
        h();
        return this.p;
    }

    public final void h() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.n;
        if (currentThread != looper.getThread()) {
            vq1.o0("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // defpackage.zqa
    public final yqa s() {
        h();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // defpackage.zqa
    public final UUID t() {
        h();
        return this.m;
    }

    @Override // defpackage.zqa
    public final boolean u() {
        h();
        return this.f;
    }

    @Override // defpackage.zqa
    public final vvc v() {
        h();
        return this.t;
    }

    @Override // defpackage.zqa
    public final void x(cra craVar) {
        h();
        int i = this.q;
        if (i <= 0) {
            vq1.K("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = 0;
            tt1 tt1Var = this.o;
            int i3 = dvt.a;
            tt1Var.removeCallbacksAndMessages(null);
            ol7 ol7Var = this.s;
            synchronized (ol7Var) {
                ol7Var.removeCallbacksAndMessages(null);
                ol7Var.b = true;
            }
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.k(bArr);
                this.v = null;
            }
        }
        if (craVar != null) {
            cl6 cl6Var = this.i;
            synchronized (cl6Var.a) {
                try {
                    Integer num = (Integer) cl6Var.b.get(craVar);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(cl6Var.d);
                        arrayList.remove(craVar);
                        cl6Var.d = Collections.unmodifiableList(arrayList);
                        int intValue = num.intValue();
                        HashMap hashMap = cl6Var.b;
                        if (intValue == 1) {
                            hashMap.remove(craVar);
                            HashSet hashSet = new HashSet(cl6Var.c);
                            hashSet.remove(craVar);
                            cl6Var.c = Collections.unmodifiableSet(hashSet);
                        } else {
                            hashMap.put(craVar, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } finally {
                }
            }
            if (this.i.a(craVar) == 0) {
                craVar.f();
            }
        }
        ozw ozwVar = this.d;
        int i4 = this.q;
        tl7 tl7Var = (tl7) ozwVar.b;
        if (i4 == 1 && tl7Var.p > 0 && tl7Var.l != -9223372036854775807L) {
            tl7Var.o.add(this);
            Handler handler = tl7Var.u;
            handler.getClass();
            handler.postAtTime(new he0(28, this), this, SystemClock.uptimeMillis() + tl7Var.l);
        } else if (i4 == 0) {
            tl7Var.m.remove(this);
            if (tl7Var.r == this) {
                tl7Var.r = null;
            }
            if (tl7Var.s == this) {
                tl7Var.s = null;
            }
            pt0 pt0Var = tl7Var.i;
            HashSet hashSet2 = (HashSet) pt0Var.a;
            hashSet2.remove(this);
            if (((ql7) pt0Var.b) == this) {
                pt0Var.b = null;
                if (!hashSet2.isEmpty()) {
                    ql7 ql7Var = (ql7) hashSet2.iterator().next();
                    pt0Var.b = ql7Var;
                    nqb c = ql7Var.b.c();
                    ql7Var.y = c;
                    ol7 ol7Var2 = ql7Var.s;
                    int i5 = dvt.a;
                    c.getClass();
                    ol7Var2.getClass();
                    ol7Var2.obtainMessage(1, new pl7(cfg.f.getAndIncrement(), true, SystemClock.elapsedRealtime(), c)).sendToTarget();
                }
            }
            if (tl7Var.l != -9223372036854775807L) {
                Handler handler2 = tl7Var.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                tl7Var.o.remove(this);
            }
        }
        tl7Var.i();
    }

    @Override // defpackage.zqa
    public final void y(cra craVar) {
        h();
        if (this.q < 0) {
            vq1.K("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (craVar != null) {
            cl6 cl6Var = this.i;
            synchronized (cl6Var.a) {
                try {
                    ArrayList arrayList = new ArrayList(cl6Var.d);
                    arrayList.add(craVar);
                    cl6Var.d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) cl6Var.b.get(craVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(cl6Var.c);
                        hashSet.add(craVar);
                        cl6Var.c = Collections.unmodifiableSet(hashSet);
                    }
                    cl6Var.b.put(craVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            vq1.A(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new ol7(this, this.r.getLooper());
            if (e()) {
                a(true);
            }
        } else if (craVar != null && b() && this.i.a(craVar) == 1) {
            craVar.d(this.p);
        }
        tl7 tl7Var = (tl7) this.d.b;
        if (tl7Var.l != -9223372036854775807L) {
            tl7Var.o.remove(this);
            Handler handler = tl7Var.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // defpackage.zqa
    public final boolean z(String str) {
        h();
        byte[] bArr = this.v;
        vq1.B(bArr);
        return this.b.n(str, bArr);
    }
}
