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
public final class C3672o {

    /* renamed from: k, reason: collision with root package name */
    public static final HB f33609k = new HB();

    /* renamed from: a, reason: collision with root package name */
    public VN f33610a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4211y f33611b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f33612c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f33613d;

    /* renamed from: e, reason: collision with root package name */
    public C3350i f33614e;

    /* renamed from: f, reason: collision with root package name */
    public Thread f33615f;

    /* renamed from: g, reason: collision with root package name */
    public M f33616g;

    /* renamed from: h, reason: collision with root package name */
    public C2764Qj f33617h;
    public Boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final C3107dP f33618j;

    public C3672o(Context context) {
        C3107dP c3107dP = new C3107dP(10);
        C3350i c3350i = C3350i.f31750F;
        this.f33612c = new Object();
        this.f33613d = context != null ? context.getApplicationContext() : null;
        this.f33618j = c3107dP;
        if (c3350i != null) {
            this.f33614e = c3350i;
        } else {
            C3296h c3296h = new C3296h(c3350i);
            c3296h.a(c3350i);
            this.f33614e = new C3350i(c3296h);
        }
        this.f33617h = C2764Qj.f27843b;
        if (this.f33614e.f31751A && context == null) {
            AbstractC2991bG.y("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static Pair a(C3726p[] c3726pArr, int i) {
        for (int i4 = 0; i4 < 2; i4++) {
            C3726p c3726p = c3726pArr[i4];
            if (c3726p != null && c3726p.f33775a.f24417c == i) {
                return Pair.create(c3726p, Integer.valueOf(i4));
            }
        }
        return null;
    }

    public static final Pair b(int i, C3887s c3887s, int[][][] iArr, InterfaceC3456k interfaceC3456k, Comparator comparator) {
        RandomAccess randomAccess;
        C3887s c3887s2 = c3887s;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < 2) {
            if (i == ((int[]) c3887s2.f34554u)[i4]) {
                SQ sq = ((SQ[]) c3887s2.f34556w)[i4];
                for (int i6 = 0; i6 < sq.f28274a; i6++) {
                    A8 a9 = sq.a(i6);
                    C3523lC t6 = interfaceC3456k.t(i4, a9, iArr[i4][i6]);
                    int i9 = a9.f24415a;
                    boolean[] zArr = new boolean[i9];
                    int i10 = 0;
                    while (i10 < i9) {
                        int i11 = i10 + 1;
                        AbstractC3510l abstractC3510l = (AbstractC3510l) t6.get(i10);
                        int a10 = abstractC3510l.a();
                        if (!zArr[i10] && a10 != 0) {
                            if (a10 == 1) {
                                randomAccess = RB.j(abstractC3510l);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC3510l);
                                for (int i12 = i11; i12 < i9; i12++) {
                                    AbstractC3510l abstractC3510l2 = (AbstractC3510l) t6.get(i12);
                                    if (abstractC3510l2.a() == 2 && abstractC3510l.b(abstractC3510l2)) {
                                        arrayList2.add(abstractC3510l2);
                                        zArr[i12] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i10 = i11;
                    }
                }
            }
            i4++;
            c3887s2 = c3887s;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            iArr2[i13] = ((AbstractC3510l) list.get(i13)).f32454v;
        }
        AbstractC3510l abstractC3510l3 = (AbstractC3510l) list.get(0);
        return Pair.create(new C3726p(abstractC3510l3.f32453u, iArr2), Integer.valueOf(abstractC3510l3.f32452n));
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, com.anythink.basead.exoplayer.b.ar)) {
            return null;
        }
        return str;
    }

    public static int f(DP dp, String str, boolean z6) {
        if (!TextUtils.isEmpty(str) && str.equals(dp.f25166d)) {
            return 4;
        }
        String e9 = e(str);
        String e10 = e(dp.f25166d);
        if (e10 == null || e9 == null) {
            return (z6 && e10 == null) ? 1 : 0;
        }
        if (e10.startsWith(e9) || e9.startsWith(e10)) {
            return 3;
        }
        String str2 = AbstractC3182eu.f30782a;
        return e10.split("-", 2)[0].equals(e9.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(DP dp, C3523lC c3523lC) {
        int i = 0;
        while (i < c3523lC.f32527w) {
            int i4 = 0;
            while (true) {
                RB rb = dp.f25165c;
                if (i4 < rb.size()) {
                    if (((C3323hQ) rb.get(i4)).f31572b.equals(c3523lC.get(i))) {
                        return i;
                    }
                    i4++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static final C3726p h(SQ sq, int[][] iArr, C3350i c3350i) {
        c3350i.f26454q.getClass();
        int i = 0;
        A8 a82 = null;
        C3242g c3242g = null;
        for (int i4 = 0; i4 < sq.f28274a; i4++) {
            A8 a9 = sq.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i6 = 0; i6 < a9.f24415a; i6++) {
                if (SP.K(iArr2[i6], c3350i.f31752B)) {
                    C3242g c3242g2 = new C3242g(a9.f24418d[i6], iArr2[i6]);
                    if (c3242g != null) {
                        if (KB.f26626a.d(c3242g2.f31249u, c3242g.f31249u).d(c3242g2.f31248n, c3242g.f31248n).e() <= 0) {
                        }
                    }
                    a82 = a9;
                    i = i6;
                    c3242g = c3242g2;
                }
            }
        }
        if (a82 == null) {
            return null;
        }
        return new C3726p(a82, new int[]{i});
    }

    public static void j(C3887s c3887s, C2636Ja c2636Ja) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 2; i++) {
            SQ sq = ((SQ[]) c3887s.f34556w)[i];
            for (int i4 = 0; i4 < sq.f28274a; i4++) {
                if (c2636Ja.f26458u.get(sq.a(i4)) != null) {
                    throw new ClassCastException();
                }
            }
        }
        SQ sq2 = (SQ) c3887s.f34558y;
        for (int i6 = 0; i6 < sq2.f28274a; i6++) {
            if (c2636Ja.f26458u.get(sq2.a(i6)) != null) {
                throw new ClassCastException();
            }
        }
        for (int i9 = 0; i9 < 2; i9++) {
            if (hashMap.get(Integer.valueOf(((int[]) c3887s.f34554u)[i9])) != null) {
                throw new ClassCastException();
            }
        }
    }

    public static void k(C3887s c3887s, C3350i c3350i, C3726p[] c3726pArr) {
        for (int i = 0; i < 2; i++) {
            SQ sq = ((SQ[]) c3887s.f34556w)[i];
            Map map = (Map) c3350i.f31754D.get(i);
            if (map != null && map.containsKey(sq)) {
                Map map2 = (Map) c3350i.f31754D.get(i);
                if (map2 != null && map2.get(sq) != null) {
                    throw new ClassCastException();
                }
                c3726pArr[i] = null;
            }
        }
    }

    public static void l(C3887s c3887s, C3350i c3350i, C3726p[] c3726pArr) {
        int i;
        while (i < 2) {
            int i4 = ((int[]) c3887s.f34554u)[i];
            if (!c3350i.f31755E.get(i)) {
                i = c3350i.f26459v.contains(Integer.valueOf(i4)) ? 0 : i + 1;
            }
            c3726pArr[i] = null;
        }
    }

    public final void c() {
        M m9;
        K k9;
        Handler handler;
        synchronized (this.f33612c) {
            try {
                Thread thread = this.f33615f;
                if (thread != null) {
                    AbstractC2792Sd.I("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (m9 = this.f33616g) != null) {
            Spatializer spatializer = m9.f26994a;
            if (spatializer != null && (k9 = m9.f26997d) != null && (handler = m9.f26996c) != null) {
                spatializer.removeOnSpatializerStateChangedListener(k9);
                handler.removeCallbacksAndMessages(null);
            }
            this.f33616g = null;
        }
        this.f33610a = null;
        this.f33611b = null;
    }

    public final void d(C2764Qj c2764Qj) {
        if (this.f33617h.equals(c2764Qj)) {
            return;
        }
        this.f33617h = c2764Qj;
        i();
    }

    public final void i() {
        boolean z6;
        VN vn;
        M m9;
        synchronized (this.f33612c) {
            try {
                z6 = false;
                if (this.f33614e.f31751A && Build.VERSION.SDK_INT >= 32 && (m9 = this.f33616g) != null && m9.f26995b) {
                    z6 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z6 || (vn = this.f33610a) == null) {
            return;
        }
        vn.f28985z.c(10);
    }
}
