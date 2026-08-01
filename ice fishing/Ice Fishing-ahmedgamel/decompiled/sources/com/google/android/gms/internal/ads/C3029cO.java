package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.cO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3029cO {

    /* renamed from: a, reason: collision with root package name */
    public final C3300hQ f29473a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f29474b;

    /* renamed from: c, reason: collision with root package name */
    public final IQ[] f29475c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29476d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29477e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29478f;

    /* renamed from: g, reason: collision with root package name */
    public C3083dO f29479g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29480h;
    public final boolean[] i;

    /* renamed from: j, reason: collision with root package name */
    public final RP[] f29481j;

    /* renamed from: k, reason: collision with root package name */
    public final C3649o f29482k;

    /* renamed from: l, reason: collision with root package name */
    public final E3.m f29483l;

    /* renamed from: m, reason: collision with root package name */
    public C3029cO f29484m;

    /* renamed from: n, reason: collision with root package name */
    public PQ f29485n;

    /* renamed from: o, reason: collision with root package name */
    public C3918t f29486o;

    /* renamed from: p, reason: collision with root package name */
    public long f29487p;

    public C3029cO(RP[] rpArr, long j6, C3649o c3649o, InterfaceC4026v interfaceC4026v, E3.m mVar, C3083dO c3083dO, C3918t c3918t) {
        this.f29481j = rpArr;
        this.f29487p = j6;
        this.f29482k = c3649o;
        this.f29483l = mVar;
        C3676oQ c3676oQ = c3083dO.f29760a;
        this.f29474b = c3676oQ.f32905a;
        this.f29479g = c3083dO;
        this.f29485n = PQ.f26818d;
        this.f29486o = c3918t;
        this.f29475c = new IQ[2];
        this.i = new boolean[2];
        mVar.getClass();
        int i = C3835rO.f33581k;
        Pair pair = (Pair) c3676oQ.f32905a;
        Object obj = pair.first;
        C3676oQ a9 = c3676oQ.a(pair.second);
        C3458kO c3458kO = (C3458kO) ((HashMap) mVar.f807y).get(obj);
        c3458kO.getClass();
        ((HashSet) mVar.f798B).add(c3458kO);
        C3404jO c3404jO = (C3404jO) ((HashMap) mVar.f797A).get(c3458kO);
        if (c3404jO != null) {
            c3404jO.f31242a.o(c3404jO.f31243b);
        }
        c3458kO.f31421c.add(a9);
        C3300hQ c9 = c3458kO.f31419a.c(a9, interfaceC4026v, c3083dO.f29761b);
        ((IdentityHashMap) mVar.f806x).put(c9, c3458kO);
        mVar.m();
        this.f29473a = c9;
    }

    public final long a() {
        return this.f29479g.f29761b + this.f29487p;
    }

    public final boolean b() {
        if (this.f29477e) {
            return !this.f29478f || this.f29473a.f() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean c() {
        if (this.f29477e) {
            return b() || d() - this.f29479g.f29761b >= com.anythink.basead.exoplayer.b.f6382b;
        }
        return false;
    }

    public final long d() {
        if (!this.f29477e) {
            return this.f29479g.f29761b;
        }
        long f3 = this.f29478f ? this.f29473a.f() : Long.MIN_VALUE;
        return f3 == Long.MIN_VALUE ? this.f29479g.f29764e : f3;
    }

    public final void e(AbstractC3604n8 abstractC3604n8) {
        this.f29477e = true;
        this.f29485n = this.f29473a.p();
        C3918t f3 = f(abstractC3604n8);
        C3083dO c3083dO = this.f29479g;
        long j6 = c3083dO.f29764e;
        long j9 = c3083dO.f29761b;
        if (j6 != com.anythink.basead.exoplayer.b.f6382b && j9 >= j6) {
            j9 = Math.max(0L, j6 - 1);
        }
        long g4 = g(f3, j9, false, new boolean[2]);
        long j10 = this.f29487p;
        C3083dO c3083dO2 = this.f29479g;
        this.f29487p = (c3083dO2.f29761b - g4) + j10;
        this.f29479g = c3083dO2.a(g4, c3083dO2.f29762c);
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0482  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:202:0x047e -> B:187:0x044c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3918t f(AbstractC3604n8 abstractC3604n8) {
        RP[] rpArr;
        C3327i c3327i;
        String str;
        C3327i c3327i2;
        String str2;
        int i;
        int i6;
        int i9;
        int i10;
        long j6;
        InterfaceC3757q[] interfaceC3757qArr;
        boolean z3;
        int[][][] iArr;
        int[] iArr2;
        int length;
        r rVar;
        long j9;
        RP[] rpArr2;
        C3084dP c3084dP;
        int i11;
        String str3;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Point point;
        Context context2;
        Point point2;
        Point point3;
        String[] split;
        boolean z6;
        Context context3;
        DP[] dpArr;
        int i12;
        int[] iArr3;
        int i13 = 2;
        int i14 = 1;
        PQ pq = this.f29485n;
        C3649o c3649o = this.f29482k;
        c3649o.getClass();
        int[] iArr4 = new int[3];
        A8[][] a8Arr = new A8[3][];
        int[][][] iArr5 = new int[3][][];
        for (int i15 = 0; i15 < 3; i15++) {
            int i16 = pq.f26819a;
            a8Arr[i15] = new A8[i16];
            iArr5[i15] = new int[i16][];
        }
        int[] iArr6 = new int[2];
        int i17 = 0;
        while (true) {
            rpArr = this.f29481j;
            if (i17 >= 2) {
                break;
            }
            rpArr[i17].getClass();
            iArr6[i17] = 8;
            i17++;
        }
        int i18 = 0;
        while (i18 < pq.f26819a) {
            A8 a9 = pq.a(i18);
            int i19 = i13;
            int i20 = i14;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                dpArr = a9.f23638d;
                i12 = a9.f23635a;
                if (i21 >= i13) {
                    break;
                }
                RP rp = rpArr[i21];
                int i23 = i21;
                int i24 = 0;
                int i25 = 0;
                while (i24 < i12) {
                    int i26 = i24;
                    i25 = Math.max(i25, rp.L(dpArr[i26]) & 7);
                    i24 = i26 + 1;
                }
                int i27 = iArr4[i23] == 0 ? i20 : 0;
                if (i25 > i22) {
                    i20 = i27;
                    i22 = i25;
                    i19 = i23;
                } else if (i25 == i22 && a9.f23637c == 5 && i20 == 0 && i27 != 0) {
                    i22 = i25;
                    i19 = i23;
                    i20 = i20;
                }
                i21 = i23 + 1;
                i13 = 2;
            }
            if (i19 == i13) {
                iArr3 = new int[i12];
            } else {
                RP rp2 = rpArr[i19];
                int[] iArr7 = new int[i12];
                for (int i28 = 0; i28 < i12; i28++) {
                    iArr7[i28] = rp2.L(dpArr[i28]);
                }
                iArr3 = iArr7;
            }
            int i29 = iArr4[i19];
            a8Arr[i19][i29] = a9;
            iArr5[i19][i29] = iArr3;
            iArr4[i19] = i29 + 1;
            i18++;
            i14 = i20;
            i13 = 2;
        }
        int i30 = i13;
        int i31 = i14;
        PQ[] pqArr = new PQ[i30];
        String[] strArr = new String[i30];
        int[] iArr8 = new int[i30];
        int i32 = 0;
        while (i32 < i30) {
            int i33 = iArr4[i32];
            pqArr[i32] = new PQ((A8[]) AbstractC3159eu.o(a8Arr[i32], i33));
            iArr5[i32] = (int[][]) AbstractC3159eu.o(iArr5[i32], i33);
            strArr[i32] = rpArr[i32].p();
            iArr8[i32] = rpArr[i32].f27272u;
            i32++;
            i30 = 2;
        }
        int i34 = i30;
        RP[] rpArr3 = rpArr;
        C3864s c3864s = new C3864s(iArr8, pqArr, iArr6, iArr5, new PQ((A8[]) AbstractC3159eu.o(a8Arr[i34], iArr4[i34])));
        synchronized (c3649o.f32825c) {
            c3649o.f32828f = Thread.currentThread();
            c3327i = c3649o.f32827e;
        }
        if (c3649o.i == null && (context3 = c3649o.f32826d) != null) {
            c3649o.i = Boolean.valueOf(AbstractC3159eu.j(context3));
        }
        if (c3327i.f30978A && Build.VERSION.SDK_INT >= 32 && c3649o.f32829g == null) {
            c3649o.f32829g = new M(c3649o.f32826d, new RunnableC3111e(0, c3649o), c3649o.i);
        }
        int i35 = 2;
        C3703p[] c3703pArr = new C3703p[2];
        C3649o.j(c3864s, c3327i);
        C3649o.k(c3864s, c3327i, c3703pArr);
        C3649o.l(c3864s, c3327i, c3703pArr);
        Pair a10 = C3649o.a(c3703pArr, i31);
        if (a10 == null) {
            int i36 = 0;
            while (true) {
                if (i36 >= i35) {
                    z6 = false;
                    break;
                }
                if (((int[]) c3864s.f33786u)[i36] == i35 && ((PQ[]) c3864s.f33788w)[i36].f26819a > 0) {
                    z6 = true;
                    break;
                }
                i36++;
                i35 = 2;
            }
            a10 = C3649o.b(1, c3864s, iArr5, new com.bumptech.glide.manager.o(c3649o, c3327i, z6, iArr6), C3004c.f29393u);
            if (a10 != null) {
                c3703pArr[((Integer) a10.second).intValue()] = (C3703p) a10.first;
            }
        }
        if (a10 == null) {
            str = null;
        } else {
            C3703p c3703p = (C3703p) a10.first;
            str = c3703p.f32985a.f23638d[c3703p.f32986b[0]].f24421d;
        }
        Pair a11 = C3649o.a(c3703pArr, 2);
        Pair a12 = C3649o.a(c3703pArr, 4);
        if (a11 == null && a12 == null) {
            c3327i.f25700q.getClass();
            if (!c3327i.f25691g || (context2 = c3649o.f32826d) == null) {
                point = null;
            } else {
                String str4 = AbstractC3159eu.f29993a;
                DisplayManager displayManager = (DisplayManager) context2.getSystemService("display");
                Display display = displayManager != null ? displayManager.getDisplay(0) : null;
                if (display == null) {
                    WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                    windowManager.getClass();
                    display = windowManager.getDefaultDisplay();
                }
                if (display.getDisplayId() == 0 && AbstractC3159eu.j(context2)) {
                    String n9 = Build.VERSION.SDK_INT < 28 ? AbstractC3159eu.n("sys.display-size") : AbstractC3159eu.n("vendor.display-size");
                    if (!TextUtils.isEmpty(n9)) {
                        try {
                            split = n9.trim().split("x", -1);
                        } catch (NumberFormatException unused) {
                        }
                        if (split.length == 2) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            if (parseInt > 0 && parseInt2 > 0) {
                                point3 = new Point(parseInt, parseInt2);
                                point = point3;
                            }
                        }
                        AbstractC2968bG.H("Util", "Invalid display size: ".concat(String.valueOf(n9)));
                    }
                    if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context2.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                        point2 = new Point(3840, 2160);
                        point3 = point2;
                        point = point3;
                    }
                }
                point2 = new Point();
                Display.Mode mode = display.getMode();
                point2.x = mode.getPhysicalWidth();
                point2.y = mode.getPhysicalHeight();
                point3 = point2;
                point = point3;
            }
            c3327i2 = c3327i;
            str2 = str;
            int i37 = 2;
            Pair b9 = C3649o.b(2, c3864s, iArr5, new C2570Gf(c3327i, str, iArr6, point, 1), C3004c.f29396x);
            Pair b10 = b9 == null ? C3649o.b(4, c3864s, iArr5, new C3694or(i37, c3327i2), C3004c.f29394v) : null;
            if (b10 != null) {
                c3703pArr[((Integer) b10.second).intValue()] = (C3703p) b10.first;
            } else if (b9 != null) {
                c3703pArr[((Integer) b9.second).intValue()] = (C3703p) b9.first;
            }
        } else {
            c3327i2 = c3327i;
            str2 = str;
        }
        if (C3649o.a(c3703pArr, 3) == null) {
            c3327i2.f25700q.getClass();
            if (!c3327i2.f25703t || (context = c3649o.f32826d) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                str3 = null;
            } else {
                String str5 = AbstractC3159eu.f29993a;
                str3 = locale.toLanguageTag();
            }
            Pair b11 = C3649o.b(3, c3864s, iArr5, new C3481ku(1, c3327i2, str2, str3), C3004c.f29395w);
            if (b11 != null) {
                c3703pArr[((Integer) b11.second).intValue()] = (C3703p) b11.first;
            }
        }
        c3327i2.f25700q.getClass();
        WB wb = new WB(4);
        for (int i38 = 0; i38 < 2; i38++) {
            C3703p c3703p2 = c3703pArr[i38];
            if (c3703p2 != null && !c3327i2.f30982E.get(i38)) {
                XB xb = c3327i2.f25705v;
                A8 a82 = c3703p2.f32985a;
                if (!xb.contains(Integer.valueOf(a82.f23637c))) {
                    wb.f(a82.f23636b);
                    int i39 = 0;
                    while (true) {
                        int[] iArr9 = c3703p2.f32986b;
                        if (i39 < iArr9.length) {
                            String str6 = a82.f23638d[iArr9[i39]].f24429m;
                            if (str6 != null) {
                                wb.f(str6);
                            }
                            i39++;
                        }
                    }
                }
            }
        }
        XB h9 = wb.h();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i40 = 0; i40 < 2; i40++) {
            if (((int[]) c3864s.f33786u)[i40] == 5) {
                PQ pq2 = ((PQ[]) c3864s.f33788w)[i40];
                for (int i41 = 0; i41 < pq2.f26819a; i41++) {
                    A8 a13 = pq2.a(i41);
                    arrayList.add(a13);
                    int[] iArr10 = (int[]) iArr5[i40][i41].clone();
                    for (int i42 = 0; i42 < iArr10.length; i42++) {
                        String str7 = a13.f23638d[i42].f24429m;
                        if (str7 != null && !h9.contains(str7)) {
                            iArr10[i42] = 128;
                        }
                    }
                    arrayList2.add(iArr10);
                }
            }
        }
        int i43 = 128;
        int size = arrayList.size();
        A8[] a8Arr2 = new A8[size];
        String str8 = AbstractC3159eu.f29993a;
        AbstractC2772Sd.H(arrayList.size() == size);
        arrayList.toArray(a8Arr2);
        PQ pq3 = new PQ(a8Arr2);
        int size2 = arrayList2.size();
        int[][] iArr11 = new int[size2][];
        AbstractC2772Sd.H(arrayList2.size() == size2);
        arrayList2.toArray(iArr11);
        int i44 = 0;
        while (true) {
            i = 2;
            if (i44 >= 2) {
                i6 = 1;
                i9 = 0;
                break;
            }
            if (((int[]) c3864s.f33786u)[i44] == 5) {
                C3703p h10 = C3649o.h(pq3, iArr11, c3327i2);
                c3703pArr[i44] = h10;
                if (h10 == null) {
                    i6 = 1;
                    i9 = 0;
                    break;
                }
                int indexOf = pq3.f26820b.indexOf(h10.f32985a);
                if (indexOf < 0) {
                    indexOf = -1;
                }
                i11 = i43;
                Arrays.fill(iArr11[indexOf], i11);
            } else {
                i11 = i43;
            }
            i44++;
            i43 = i11;
        }
        if (i9 >= i) {
            C3649o.j(c3864s, c3327i2);
            C3649o.k(c3864s, c3327i2, c3703pArr);
            C3649o.l(c3864s, c3327i2, c3703pArr);
            C3084dP c3084dP2 = c3649o.f32831j;
            c3649o.f32824b.getClass();
            ArrayList arrayList3 = new ArrayList();
            int i45 = 0;
            while (true) {
                i10 = 2;
                if (i45 >= 2) {
                    break;
                }
                C3703p c3703p3 = c3703pArr[i45];
                if (c3703p3 == null || c3703p3.f32986b.length <= 1) {
                    arrayList3.add(null);
                } else {
                    PB pb = RB.f27177u;
                    OB ob = new OB(4);
                    ob.a(new RQ(0L, 0L));
                    arrayList3.add(ob);
                }
                i45++;
            }
            long[][] jArr = new long[2][];
            int i46 = 0;
            while (true) {
                j6 = -1;
                if (i46 >= i10) {
                    break;
                }
                C3703p c3703p4 = c3703pArr[i46];
                if (c3703p4 == null) {
                    jArr[i46] = new long[0];
                } else {
                    int[] iArr12 = c3703p4.f32986b;
                    jArr[i46] = new long[iArr12.length];
                    for (int i47 = 0; i47 < iArr12.length; i47++) {
                        long j10 = c3703p4.f32985a.f23638d[iArr12[i47]].f24426j;
                        long[] jArr2 = jArr[i46];
                        if (j10 == -1) {
                            j10 = 0;
                        }
                        jArr2[i47] = j10;
                    }
                    Arrays.sort(jArr[i46]);
                }
                i46++;
                i10 = 2;
            }
            int[] iArr13 = new int[i10];
            long[] jArr3 = new long[i10];
            int i48 = 0;
            while (i48 < i10) {
                long[] jArr4 = jArr[i48];
                jArr3[i48] = jArr4.length == 0 ? 0L : jArr4[0];
                i48++;
                i10 = 2;
            }
            r.a(arrayList3, jArr3);
            C3340iC c3340iC = new C3340iC(new TreeMap(C3392jC.f31213u), new C3445kB());
            int i49 = 0;
            while (i49 < 2) {
                int length2 = jArr[i49].length;
                if (length2 <= 1) {
                    c3084dP = c3084dP2;
                    j9 = j6;
                    rpArr2 = rpArr3;
                } else {
                    double[] dArr = new double[length2];
                    j9 = j6;
                    int i50 = 0;
                    while (true) {
                        long[] jArr5 = jArr[i49];
                        double d2 = 0.0d;
                        if (i50 >= jArr5.length) {
                            break;
                        }
                        RP[] rpArr4 = rpArr3;
                        C3084dP c3084dP3 = c3084dP2;
                        long j11 = jArr5[i50];
                        if (j11 != j9) {
                            d2 = Math.log(j11);
                        }
                        dArr[i50] = d2;
                        i50++;
                        rpArr3 = rpArr4;
                        c3084dP2 = c3084dP3;
                    }
                    rpArr2 = rpArr3;
                    c3084dP = c3084dP2;
                    int i51 = length2 - 1;
                    double d9 = dArr[i51] - dArr[0];
                    int i52 = 0;
                    while (i52 < i51) {
                        double d10 = dArr[i52];
                        i52++;
                        Double valueOf = Double.valueOf(d9 == 0.0d ? 1.0d : (((d10 + dArr[i52]) * 0.5d) - dArr[0]) / d9);
                        double d11 = d9;
                        Integer valueOf2 = Integer.valueOf(i49);
                        Map map = c3340iC.f31011w;
                        long[][] jArr6 = jArr;
                        Collection collection = (Collection) map.get(valueOf);
                        if (collection == null) {
                            List list = (List) c3340iC.f31013y.mo15c();
                            if (!list.add(valueOf2)) {
                                throw new AssertionError("New Collection violated the Collection spec");
                            }
                            c3340iC.f31012x++;
                            map.put(valueOf, list);
                        } else if (collection.add(valueOf2)) {
                            c3340iC.f31012x++;
                        }
                        jArr = jArr6;
                        d9 = d11;
                    }
                }
                i49++;
                rpArr3 = rpArr2;
                j6 = j9;
                c3084dP2 = c3084dP;
                jArr = jArr;
            }
            RP[] rpArr5 = rpArr3;
            C3084dP c3084dP4 = c3084dP2;
            long[][] jArr7 = jArr;
            Collection collection2 = c3340iC.f23648u;
            if (collection2 == null) {
                collection2 = c3340iC.a();
                c3340iC.f23648u = collection2;
            }
            RB n10 = RB.n(collection2);
            for (int i53 = 0; i53 < n10.size(); i53++) {
                int intValue = ((Integer) n10.get(i53)).intValue();
                int i54 = iArr13[intValue] + 1;
                iArr13[intValue] = i54;
                jArr3[intValue] = jArr7[intValue][i54];
                r.a(arrayList3, jArr3);
            }
            int i55 = 0;
            for (int i56 = 2; i55 < i56; i56 = 2) {
                if (arrayList3.get(i55) != null) {
                    long j12 = jArr3[i55];
                    jArr3[i55] = j12 + j12;
                }
                i55++;
            }
            r.a(arrayList3, jArr3);
            MA.q(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i57 = 0;
            int i58 = 0;
            while (i57 < arrayList3.size()) {
                OB ob2 = (OB) arrayList3.get(i57);
                C3500lC f3 = ob2 == null ? C3500lC.f31745x : ob2.f();
                f3.getClass();
                int length3 = objArr.length;
                int i59 = i58 + 1;
                int d12 = MB.d(length3, i59);
                if (d12 > length3) {
                    objArr = Arrays.copyOf(objArr, d12);
                }
                objArr[i58] = f3;
                i57++;
                i58 = i59;
            }
            C3500lC p9 = RB.p(objArr, i58);
            int i60 = 2;
            InterfaceC3757q[] interfaceC3757qArr2 = new InterfaceC3757q[2];
            int i61 = 0;
            while (i61 < i60) {
                C3703p c3703p5 = c3703pArr[i61];
                if (c3703p5 != null && (length = (iArr2 = c3703p5.f32986b).length) != 0) {
                    if (length == 1) {
                        rVar = new r(c3703p5.f32985a, new int[]{iArr2[0]});
                    } else {
                        A8 a83 = c3703p5.f32985a;
                        RB rb = (RB) p9.get(i61);
                        c3084dP4.getClass();
                        r rVar2 = new r(a83, iArr2);
                        RB.n(rb);
                        rVar = rVar2;
                    }
                    interfaceC3757qArr2[i61] = rVar;
                }
                i61++;
                i60 = 2;
            }
            C3889sO[] c3889sOArr = new C3889sO[i60];
            int i62 = 0;
            while (i62 < i60) {
                c3889sOArr[i62] = (c3327i2.f30982E.get(i62) || c3327i2.f25705v.contains(Integer.valueOf(((int[]) c3864s.f33786u)[i62])) || (((int[]) c3864s.f33786u)[i62] != -2 && interfaceC3757qArr2[i62] == null)) ? null : C3889sO.f33971a;
                i62++;
                i60 = 2;
            }
            Pair create = Pair.create(c3889sOArr, interfaceC3757qArr2);
            InterfaceC3757q[] interfaceC3757qArr3 = (InterfaceC3757q[]) create.second;
            int length4 = interfaceC3757qArr3.length;
            List[] listArr = new List[length4];
            for (int i63 = 0; i63 < interfaceC3757qArr3.length; i63++) {
                InterfaceC3757q interfaceC3757q = interfaceC3757qArr3[i63];
                listArr[i63] = interfaceC3757q != null ? RB.j(interfaceC3757q) : C3500lC.f31745x;
            }
            OB ob3 = new OB(4);
            for (int i64 = 0; i64 < 2; i64++) {
                PQ[] pqArr2 = (PQ[]) c3864s.f33788w;
                PQ pq4 = pqArr2[i64];
                int i65 = 0;
                while (i65 < pq4.f26819a) {
                    A8 a14 = pq4.a(i65);
                    int i66 = pqArr2[i64].a(i65).f23635a;
                    int[] iArr14 = new int[i66];
                    int i67 = 0;
                    int i68 = 0;
                    while (true) {
                        iArr = (int[][][]) c3864s.f33789x;
                        if (i67 >= i66) {
                            break;
                        }
                        List[] listArr2 = listArr;
                        if ((iArr[i64][i65][i67] & 7) == 4) {
                            iArr14[i68] = i67;
                            i68++;
                        }
                        i67++;
                        listArr = listArr2;
                    }
                    List[] listArr3 = listArr;
                    int[] copyOf = Arrays.copyOf(iArr14, i68);
                    PQ[] pqArr3 = pqArr2;
                    PQ pq5 = pq4;
                    int i69 = 16;
                    String str9 = null;
                    int i70 = 0;
                    boolean z9 = false;
                    int i71 = 0;
                    while (i70 < copyOf.length) {
                        String str10 = pqArr3[i64].a(i65).f23638d[copyOf[i70]].f24431o;
                        int i72 = i71 + 1;
                        if (i71 == 0) {
                            str9 = str10;
                        } else {
                            z9 = (!Objects.equals(str9, str10)) | z9;
                        }
                        i69 = Math.min(i69, iArr[i64][i65][i70] & 24);
                        i70++;
                        i71 = i72;
                    }
                    if (z9) {
                        i69 = Math.min(i69, ((int[]) c3864s.f33787v)[i64]);
                    }
                    boolean z10 = i69 != 0;
                    int i73 = a14.f23635a;
                    int[] iArr15 = new int[i73];
                    boolean[] zArr = new boolean[i73];
                    int i74 = 0;
                    while (i74 < i73) {
                        iArr15[i74] = iArr[i64][i65][i74] & 7;
                        int i75 = 0;
                        boolean z11 = false;
                        while (i75 < length4) {
                            int i76 = length4;
                            List list2 = listArr3[i75];
                            int i77 = i73;
                            int i78 = i65;
                            int i79 = 0;
                            while (true) {
                                if (i79 >= list2.size()) {
                                    break;
                                }
                                InterfaceC3757q interfaceC3757q2 = (InterfaceC3757q) list2.get(i79);
                                List list3 = list2;
                                if (interfaceC3757q2.c().equals(a14) && interfaceC3757q2.j0(i74) != -1) {
                                    z11 = true;
                                    break;
                                }
                                i79++;
                                list2 = list3;
                            }
                            i75++;
                            length4 = i76;
                            i73 = i77;
                            i65 = i78;
                        }
                        zArr[i74] = z11;
                        i74++;
                        i65 = i65;
                    }
                    ob3.a(new C3140eb(a14, z10, iArr15, zArr));
                    i65++;
                    listArr = listArr3;
                    pqArr2 = pqArr3;
                    pq4 = pq5;
                    length4 = length4;
                }
            }
            int i80 = 0;
            while (true) {
                PQ pq6 = (PQ) c3864s.f33790y;
                if (i80 >= pq6.f26819a) {
                    break;
                }
                A8 a15 = pq6.a(i80);
                int i81 = a15.f23635a;
                int[] iArr16 = new int[i81];
                Arrays.fill(iArr16, 0);
                ob3.a(new C3140eb(a15, false, iArr16, new boolean[i81]));
                i80++;
            }
            C3918t c3918t = new C3918t((C3889sO[]) create.first, (InterfaceC3757q[]) create.second, new C4109wb(ob3.f()), c3864s);
            int i82 = 0;
            while (true) {
                int i83 = c3918t.f34177n;
                interfaceC3757qArr = (InterfaceC3757q[]) c3918t.f34179v;
                if (i82 >= i83) {
                    break;
                }
                if (c3918t.c(i82)) {
                    if (interfaceC3757qArr[i82] == null) {
                        rpArr5[i82].getClass();
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    AbstractC2772Sd.H(z3);
                } else {
                    AbstractC2772Sd.H(interfaceC3757qArr[i82] == null);
                }
                i82++;
            }
            for (InterfaceC3757q interfaceC3757q3 : interfaceC3757qArr) {
            }
            return c3918t;
        }
        int i84 = ((int[]) c3864s.f33786u)[i9];
        if (i84 != i && i84 != i6) {
            if (i84 != 3 && i84 != 4) {
                if (i84 != 5 && c3703pArr[i9] == null) {
                    c3703pArr[i9] = C3649o.h(((PQ[]) c3864s.f33788w)[i9], iArr5[i9], c3327i2);
                }
                i9++;
                i6 = 1;
                i = 2;
                if (i9 >= i) {
                }
            }
        }
        i9++;
        i6 = 1;
        i = 2;
        if (i9 >= i) {
        }
    }

    public final long g(C3918t c3918t, long j6, boolean z3, boolean[] zArr) {
        RP[] rpArr;
        int i = 0;
        while (true) {
            boolean z6 = true;
            if (i >= c3918t.f34177n) {
                break;
            }
            if (z3 || !c3918t.d(this.f29486o, i)) {
                z6 = false;
            }
            this.i[i] = z6;
            i++;
        }
        int i6 = 0;
        while (true) {
            rpArr = this.f29481j;
            if (i6 >= 2) {
                break;
            }
            rpArr[i6].getClass();
            i6++;
        }
        l();
        this.f29486o = c3918t;
        if (this.f29484m == null) {
            int i9 = 0;
            while (true) {
                C3918t c3918t2 = this.f29486o;
                if (i9 >= c3918t2.f34177n) {
                    break;
                }
                c3918t2.c(i9);
                InterfaceC3757q interfaceC3757q = ((InterfaceC3757q[]) this.f29486o.f34179v)[i9];
                i9++;
            }
        }
        C3300hQ c3300hQ = this.f29473a;
        InterfaceC3757q[] interfaceC3757qArr = (InterfaceC3757q[]) c3918t.f34179v;
        boolean[] zArr2 = this.i;
        IQ[] iqArr = this.f29475c;
        long h9 = c3300hQ.h(interfaceC3757qArr, zArr2, iqArr, zArr, j6);
        for (int i10 = 0; i10 < 2; i10++) {
            rpArr[i10].getClass();
        }
        this.f29478f = false;
        for (int i11 = 0; i11 < 2; i11++) {
            if (iqArr[i11] != null) {
                AbstractC2772Sd.H(c3918t.c(i11));
                rpArr[i11].getClass();
                this.f29478f = true;
            } else {
                AbstractC2772Sd.H(interfaceC3757qArr[i11] == null);
            }
        }
        return h9;
    }

    public final void h() {
        l();
        E3.m mVar = this.f29483l;
        C3300hQ c3300hQ = this.f29473a;
        try {
            IdentityHashMap identityHashMap = (IdentityHashMap) mVar.f806x;
            C3458kO c3458kO = (C3458kO) identityHashMap.remove(c3300hQ);
            c3458kO.getClass();
            c3458kO.f31419a.b(c3300hQ);
            c3458kO.f31421c.remove(c3300hQ.f30805n);
            if (!identityHashMap.isEmpty()) {
                mVar.m();
            }
            mVar.p(c3458kO);
        } catch (RuntimeException e9) {
            AbstractC2968bG.J("MediaPeriodHolder", "Period release failed.", e9);
        }
    }

    public final C3029cO i() {
        return this.f29484m;
    }

    public final PQ j() {
        return this.f29485n;
    }

    public final C3918t k() {
        return this.f29486o;
    }

    public final void l() {
        if (this.f29484m != null) {
            return;
        }
        int i = 0;
        while (true) {
            C3918t c3918t = this.f29486o;
            if (i >= c3918t.f34177n) {
                return;
            }
            c3918t.c(i);
            InterfaceC3757q interfaceC3757q = ((InterfaceC3757q[]) this.f29486o.f34179v)[i];
            i++;
        }
    }
}
