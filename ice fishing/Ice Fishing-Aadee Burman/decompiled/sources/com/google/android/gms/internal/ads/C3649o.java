package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3649o {

    /* renamed from: k, reason: collision with root package name */
    public static final HB f32822k = new HB();

    /* renamed from: a, reason: collision with root package name */
    public VN f32823a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4188y f32824b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f32825c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f32826d;

    /* renamed from: e, reason: collision with root package name */
    public C3327i f32827e;

    /* renamed from: f, reason: collision with root package name */
    public Thread f32828f;

    /* renamed from: g, reason: collision with root package name */
    public M f32829g;

    /* renamed from: h, reason: collision with root package name */
    public C2744Qj f32830h;
    public Boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final C3084dP f32831j;

    public C3649o(Context context) {
        C3084dP c3084dP = new C3084dP(10);
        C3327i c3327i = C3327i.f30977F;
        this.f32825c = new Object();
        this.f32826d = context != null ? context.getApplicationContext() : null;
        this.f32831j = c3084dP;
        if (c3327i != null) {
            this.f32827e = c3327i;
        } else {
            C3273h c3273h = new C3273h(c3327i);
            c3273h.a(c3327i);
            this.f32827e = new C3327i(c3273h);
        }
        this.f32830h = C2744Qj.f27058b;
        if (this.f32827e.f30978A && context == null) {
            AbstractC2968bG.y("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static Pair a(C3703p[] c3703pArr, int i) {
        for (int i6 = 0; i6 < 2; i6++) {
            C3703p c3703p = c3703pArr[i6];
            if (c3703p != null && c3703p.f32985a.f23637c == i) {
                return Pair.create(c3703p, Integer.valueOf(i6));
            }
        }
        return null;
    }

    public static final Pair b(int i, C3864s c3864s, int[][][] iArr, InterfaceC3433k interfaceC3433k, Comparator comparator) {
        RandomAccess randomAccess;
        C3864s c3864s2 = c3864s;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (i6 < 2) {
            if (i == ((int[]) c3864s2.f33786u)[i6]) {
                PQ pq = ((PQ[]) c3864s2.f33788w)[i6];
                for (int i9 = 0; i9 < pq.f26819a; i9++) {
                    A8 a9 = pq.a(i9);
                    C3500lC t6 = interfaceC3433k.t(i6, a9, iArr[i6][i9]);
                    int i10 = a9.f23635a;
                    boolean[] zArr = new boolean[i10];
                    int i11 = 0;
                    while (i11 < i10) {
                        int i12 = i11 + 1;
                        AbstractC3487l abstractC3487l = (AbstractC3487l) t6.get(i11);
                        int a10 = abstractC3487l.a();
                        if (!zArr[i11] && a10 != 0) {
                            if (a10 == 1) {
                                randomAccess = RB.j(abstractC3487l);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC3487l);
                                for (int i13 = i12; i13 < i10; i13++) {
                                    AbstractC3487l abstractC3487l2 = (AbstractC3487l) t6.get(i13);
                                    if (abstractC3487l2.a() == 2 && abstractC3487l.b(abstractC3487l2)) {
                                        arrayList2.add(abstractC3487l2);
                                        zArr[i13] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i11 = i12;
                    }
                }
            }
            i6++;
            c3864s2 = c3864s;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i14 = 0; i14 < list.size(); i14++) {
            iArr2[i14] = ((AbstractC3487l) list.get(i14)).f31674v;
        }
        AbstractC3487l abstractC3487l3 = (AbstractC3487l) list.get(0);
        return Pair.create(new C3703p(abstractC3487l3.f31673u, iArr2), Integer.valueOf(abstractC3487l3.f31672n));
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, com.anythink.basead.exoplayer.b.ar)) {
            return null;
        }
        return str;
    }

    public static int f(DP dp, String str, boolean z3) {
        if (!TextUtils.isEmpty(str) && str.equals(dp.f24421d)) {
            return 4;
        }
        String e9 = e(str);
        String e10 = e(dp.f24421d);
        if (e10 == null || e9 == null) {
            return (z3 && e10 == null) ? 1 : 0;
        }
        if (e10.startsWith(e9) || e9.startsWith(e10)) {
            return 3;
        }
        String str2 = AbstractC3159eu.f29993a;
        return e10.split("-", 2)[0].equals(e9.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(DP dp, C3500lC c3500lC) {
        int i = 0;
        while (i < c3500lC.f31747w) {
            int i6 = 0;
            while (true) {
                RB rb = dp.f24420c;
                if (i6 < rb.size()) {
                    if (((C3138eQ) rb.get(i6)).f29933b.equals(c3500lC.get(i))) {
                        return i;
                    }
                    i6++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static final C3703p h(PQ pq, int[][] iArr, C3327i c3327i) {
        c3327i.f25700q.getClass();
        int i = 0;
        A8 a82 = null;
        C3219g c3219g = null;
        for (int i6 = 0; i6 < pq.f26819a; i6++) {
            A8 a9 = pq.a(i6);
            int[] iArr2 = iArr[i6];
            for (int i9 = 0; i9 < a9.f23635a; i9++) {
                if (RP.K(iArr2[i9], c3327i.f30979B)) {
                    C3219g c3219g2 = new C3219g(a9.f23638d[i9], iArr2[i9]);
                    if (c3219g != null) {
                        if (KB.f25874a.d(c3219g2.f30483u, c3219g.f30483u).d(c3219g2.f30482n, c3219g.f30482n).e() <= 0) {
                        }
                    }
                    a82 = a9;
                    i = i9;
                    c3219g = c3219g2;
                }
            }
        }
        if (a82 == null) {
            return null;
        }
        return new C3703p(a82, new int[]{i});
    }

    public static void j(C3864s c3864s, C2616Ja c2616Ja) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 2; i++) {
            PQ pq = ((PQ[]) c3864s.f33788w)[i];
            for (int i6 = 0; i6 < pq.f26819a; i6++) {
                if (c2616Ja.f25704u.get(pq.a(i6)) != null) {
                    throw new ClassCastException();
                }
            }
        }
        PQ pq2 = (PQ) c3864s.f33790y;
        for (int i9 = 0; i9 < pq2.f26819a; i9++) {
            if (c2616Ja.f25704u.get(pq2.a(i9)) != null) {
                throw new ClassCastException();
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (hashMap.get(Integer.valueOf(((int[]) c3864s.f33786u)[i10])) != null) {
                throw new ClassCastException();
            }
        }
    }

    public static void k(C3864s c3864s, C3327i c3327i, C3703p[] c3703pArr) {
        for (int i = 0; i < 2; i++) {
            PQ pq = ((PQ[]) c3864s.f33788w)[i];
            Map map = (Map) c3327i.f30981D.get(i);
            if (map != null && map.containsKey(pq)) {
                Map map2 = (Map) c3327i.f30981D.get(i);
                if (map2 != null && map2.get(pq) != null) {
                    throw new ClassCastException();
                }
                c3703pArr[i] = null;
            }
        }
    }

    public static void l(C3864s c3864s, C3327i c3327i, C3703p[] c3703pArr) {
        int i;
        while (i < 2) {
            int i6 = ((int[]) c3864s.f33786u)[i];
            if (!c3327i.f30982E.get(i)) {
                i = c3327i.f25705v.contains(Integer.valueOf(i6)) ? 0 : i + 1;
            }
            c3703pArr[i] = null;
        }
    }

    public final void c() {
        M m4;
        K k9;
        Handler handler;
        synchronized (this.f32825c) {
            try {
                Thread thread = this.f32828f;
                if (thread != null) {
                    AbstractC2772Sd.I("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (m4 = this.f32829g) != null) {
            Spatializer spatializer = m4.f26203a;
            if (spatializer != null && (k9 = m4.f26206d) != null && (handler = m4.f26205c) != null) {
                spatializer.removeOnSpatializerStateChangedListener(k9);
                handler.removeCallbacksAndMessages(null);
            }
            this.f32829g = null;
        }
        this.f32823a = null;
        this.f32824b = null;
    }

    public final void d(C2744Qj c2744Qj) {
        if (this.f32830h.equals(c2744Qj)) {
            return;
        }
        this.f32830h = c2744Qj;
        i();
    }

    public final void i() {
        boolean z3;
        VN vn;
        M m4;
        synchronized (this.f32825c) {
            try {
                z3 = false;
                if (this.f32827e.f30978A && Build.VERSION.SDK_INT >= 32 && (m4 = this.f32829g) != null && m4.f26204b) {
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z3 || (vn = this.f32823a) == null) {
            return;
        }
        vn.f28189z.c(10);
    }
}
