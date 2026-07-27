package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Qq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2751Qq {

    /* renamed from: c, reason: collision with root package name */
    public final XD f27108c;

    /* renamed from: f, reason: collision with root package name */
    public Yq f27111f;

    /* renamed from: h, reason: collision with root package name */
    public final String f27113h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final Xq f27114j;

    /* renamed from: k, reason: collision with root package name */
    public St f27115k;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f27106a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f27107b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f27109d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f27110e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public int f27112g = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27116l = false;

    public C2751Qq(Yt yt, Xq xq, XD xd) {
        int i = 0;
        this.i = ((Ut) yt.f28754b.f25043v).f28019r;
        this.f27114j = xq;
        this.f27108c = xd;
        this.f27113h = C2942ar.b(yt);
        C2570Gf c2570Gf = yt.f28754b;
        while (true) {
            List list = (List) c2570Gf.f25042u;
            if (i >= list.size()) {
                this.f27107b.addAll(list);
                return;
            } else {
                this.f27106a.put((St) list.get(i), Integer.valueOf(i));
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r2.f27647v0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r6.f27116l = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r6.f27109d.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return (com.google.android.gms.internal.ads.St) r1.remove(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized St a() {
        try {
            if (d()) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.f27107b;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    St st = (St) arrayList.get(i);
                    String str = st.f27643t0;
                    HashSet hashSet = this.f27110e;
                    if (!hashSet.contains(str)) {
                        break;
                    }
                    i++;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005f A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:5:0x0009, B:8:0x0010, B:10:0x0013, B:14:0x001a, B:16:0x0024, B:17:0x002c, B:19:0x0030, B:22:0x0037, B:24:0x003b, B:25:0x0042, B:26:0x0048, B:33:0x0057, B:36:0x005f, B:42:0x005b, B:47:0x0067, B:52:0x006a, B:7:0x000a, B:29:0x004a, B:31:0x0050), top: B:3:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(Yq yq, St st) {
        boolean z3;
        z3 = false;
        this.f27116l = false;
        this.f27109d.remove(st);
        synchronized (this) {
        }
        if (this.f27108c.isDone()) {
            yq.q();
            return;
        }
        Integer num = (Integer) this.f27106a.get(st);
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (intValue > this.f27112g) {
            this.f27114j.c(st);
            return;
        }
        if (this.f27111f != null) {
            this.f27114j.c(this.f27115k);
        }
        this.f27112g = intValue;
        this.f27111f = yq;
        this.f27115k = st;
        synchronized (this) {
            try {
                if (!e(true)) {
                    if (!f()) {
                        if (z3) {
                            g();
                            return;
                        }
                        return;
                    }
                }
                z3 = true;
                if (z3) {
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:5:0x0010, B:8:0x0017, B:10:0x001a, B:17:0x0029, B:20:0x0031, B:25:0x002d, B:30:0x0039, B:36:0x003e, B:13:0x001c, B:15:0x0022, B:7:0x0011), top: B:3:0x0002, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c(St st) {
        boolean z3;
        z3 = false;
        this.f27116l = false;
        this.f27109d.remove(st);
        this.f27110e.remove(st.f27643t0);
        synchronized (this) {
        }
        if (!this.f27108c.isDone()) {
            synchronized (this) {
                try {
                    if (!e(true)) {
                        if (!f()) {
                            if (!z3) {
                                g();
                            }
                        }
                    }
                    z3 = true;
                    if (!z3) {
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized boolean d() {
        if (this.f27116l) {
            return false;
        }
        ArrayList arrayList = this.f27107b;
        if (!arrayList.isEmpty() && ((St) arrayList.get(0)).f27647v0 && !this.f27109d.isEmpty()) {
            return false;
        }
        synchronized (this) {
            if (!this.f27108c.isDone()) {
                ArrayList arrayList2 = this.f27109d;
                if (arrayList2.size() < this.i && e(false)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final synchronized boolean e(boolean z3) {
        try {
            Iterator it = this.f27107b.iterator();
            while (it.hasNext()) {
                St st = (St) it.next();
                Integer num = (Integer) this.f27106a.get(st);
                int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z3 || !this.f27110e.contains(st.f27643t0)) {
                    int i = this.f27112g;
                    if (intValue < i) {
                        return true;
                    }
                    if (intValue > i) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean f() {
        try {
            Iterator it = this.f27109d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.f27106a.get((St) it.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.f27112g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        Xq xq = this.f27114j;
        St st = this.f27115k;
        synchronized (xq) {
            try {
                xq.f28581a.getClass();
                xq.f28588h = SystemClock.elapsedRealtime() - xq.i;
                if (st != null) {
                    xq.f28586f.a(st);
                }
                xq.f28587g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        Yq yq = this.f27111f;
        if (yq != null) {
            this.f27108c.d(yq);
        } else {
            this.f27108c.e(new Zq(3, this.f27113h));
        }
    }
}
