package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Qq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2771Qq {

    /* renamed from: c, reason: collision with root package name */
    public final XD f27864c;

    /* renamed from: f, reason: collision with root package name */
    public Yq f27867f;

    /* renamed from: h, reason: collision with root package name */
    public final String f27869h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final Xq f27870j;

    /* renamed from: k, reason: collision with root package name */
    public St f27871k;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f27862a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f27863b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f27865d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f27866e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public int f27868g = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27872l = false;

    public C2771Qq(Yt yt, Xq xq, XD xd) {
        int i = 0;
        this.i = ((Ut) yt.f29533b.f25831v).f28816r;
        this.f27870j = xq;
        this.f27864c = xd;
        this.f27869h = C2965ar.b(yt);
        C2590Gf c2590Gf = yt.f29533b;
        while (true) {
            List list = (List) c2590Gf.f25830u;
            if (i >= list.size()) {
                this.f27863b.addAll(list);
                return;
            } else {
                this.f27862a.put((St) list.get(i), Integer.valueOf(i));
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r2.f28430v0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r6.f27872l = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r6.f27865d.add(r2);
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
                    ArrayList arrayList = this.f27863b;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    St st = (St) arrayList.get(i);
                    String str = st.f28426t0;
                    HashSet hashSet = this.f27866e;
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
        boolean z6;
        z6 = false;
        this.f27872l = false;
        this.f27865d.remove(st);
        synchronized (this) {
        }
        if (this.f27864c.isDone()) {
            yq.q();
            return;
        }
        Integer num = (Integer) this.f27862a.get(st);
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (intValue > this.f27868g) {
            this.f27870j.c(st);
            return;
        }
        if (this.f27867f != null) {
            this.f27870j.c(this.f27871k);
        }
        this.f27868g = intValue;
        this.f27867f = yq;
        this.f27871k = st;
        synchronized (this) {
            try {
                if (!e(true)) {
                    if (!f()) {
                        if (z6) {
                            g();
                            return;
                        }
                        return;
                    }
                }
                z6 = true;
                if (z6) {
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
        boolean z6;
        z6 = false;
        this.f27872l = false;
        this.f27865d.remove(st);
        this.f27866e.remove(st.f28426t0);
        synchronized (this) {
        }
        if (!this.f27864c.isDone()) {
            synchronized (this) {
                try {
                    if (!e(true)) {
                        if (!f()) {
                            if (!z6) {
                                g();
                            }
                        }
                    }
                    z6 = true;
                    if (!z6) {
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized boolean d() {
        if (this.f27872l) {
            return false;
        }
        ArrayList arrayList = this.f27863b;
        if (!arrayList.isEmpty() && ((St) arrayList.get(0)).f28430v0 && !this.f27865d.isEmpty()) {
            return false;
        }
        synchronized (this) {
            if (!this.f27864c.isDone()) {
                ArrayList arrayList2 = this.f27865d;
                if (arrayList2.size() < this.i && e(false)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final synchronized boolean e(boolean z6) {
        try {
            Iterator it = this.f27863b.iterator();
            while (it.hasNext()) {
                St st = (St) it.next();
                Integer num = (Integer) this.f27862a.get(st);
                int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z6 || !this.f27866e.contains(st.f28426t0)) {
                    int i = this.f27868g;
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
            Iterator it = this.f27865d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.f27862a.get((St) it.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.f27868g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        Xq xq = this.f27870j;
        St st = this.f27871k;
        synchronized (xq) {
            try {
                xq.f29362a.getClass();
                xq.f29369h = SystemClock.elapsedRealtime() - xq.i;
                if (st != null) {
                    xq.f29367f.a(st);
                }
                xq.f29368g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        Yq yq = this.f27867f;
        if (yq != null) {
            this.f27864c.d(yq);
        } else {
            this.f27864c.e(new Zq(3, this.f27869h));
        }
    }
}
