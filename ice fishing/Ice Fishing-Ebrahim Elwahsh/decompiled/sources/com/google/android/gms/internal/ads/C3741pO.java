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

/* renamed from: com.google.android.gms.internal.ads.pO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3741pO {

    /* renamed from: a, reason: collision with root package name */
    public final C4012uQ f33385a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f33386b;

    /* renamed from: c, reason: collision with root package name */
    public final VQ[] f33387c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33388d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33389e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33390f;

    /* renamed from: g, reason: collision with root package name */
    public C3795qO f33391g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33392h;
    public final boolean[] i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC3149eQ[] f33393j;

    /* renamed from: k, reason: collision with root package name */
    public final C3554m f33394k;

    /* renamed from: l, reason: collision with root package name */
    public final C3.m f33395l;

    /* renamed from: m, reason: collision with root package name */
    public C3741pO f33396m;

    /* renamed from: n, reason: collision with root package name */
    public C3041cR f33397n;

    /* renamed from: o, reason: collision with root package name */
    public C3877s f33398o;

    /* renamed from: p, reason: collision with root package name */
    public long f33399p;

    public C3741pO(AbstractC3149eQ[] abstractC3149eQArr, long j9, C3554m c3554m, InterfaceC3985u interfaceC3985u, C3.m mVar, C3795qO c3795qO, C3877s c3877s) {
        this.f33393j = abstractC3149eQArr;
        this.f33399p = j9;
        this.f33394k = c3554m;
        this.f33395l = mVar;
        BQ bq = c3795qO.f33713a;
        this.f33386b = bq.f24043a;
        this.f33391g = c3795qO;
        this.f33397n = C3041cR.f29709d;
        this.f33398o = c3877s;
        this.f33387c = new VQ[2];
        this.i = new boolean[2];
        mVar.getClass();
        int i = EO.f24710k;
        Pair pair = (Pair) bq.f24043a;
        Object obj = pair.first;
        BQ a9 = bq.a(pair.second);
        C4172xO c4172xO = (C4172xO) ((HashMap) mVar.f454y).get(obj);
        c4172xO.getClass();
        ((HashSet) mVar.f445B).add(c4172xO);
        C4118wO c4118wO = (C4118wO) ((HashMap) mVar.f444A).get(c4172xO);
        if (c4118wO != null) {
            c4118wO.f34978a.o(c4118wO.f34979b);
        }
        c4172xO.f35146c.add(a9);
        C4012uQ c4 = c4172xO.f35144a.c(a9, interfaceC3985u, c3795qO.f33714b);
        ((IdentityHashMap) mVar.f453x).put(c4, c4172xO);
        mVar.m();
        this.f33385a = c4;
    }

    public final long a() {
        return this.f33391g.f33714b + this.f33399p;
    }

    public final boolean b() {
        if (this.f33389e) {
            return !this.f33390f || this.f33385a.d() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean c() {
        if (this.f33389e) {
            return b() || d() - this.f33391g.f33714b >= com.anythink.basead.exoplayer.b.f6539b;
        }
        return false;
    }

    public final long d() {
        if (!this.f33389e) {
            return this.f33391g.f33714b;
        }
        long d2 = this.f33390f ? this.f33385a.d() : Long.MIN_VALUE;
        return d2 == Long.MIN_VALUE ? this.f33391g.f33717e : d2;
    }

    public final void e(AbstractC3832r8 abstractC3832r8) {
        this.f33389e = true;
        this.f33397n = this.f33385a.p();
        C3877s f6 = f(abstractC3832r8);
        C3795qO c3795qO = this.f33391g;
        long j9 = c3795qO.f33717e;
        long j10 = c3795qO.f33714b;
        if (j9 != com.anythink.basead.exoplayer.b.f6539b && j10 >= j9) {
            j10 = Math.max(0L, j9 - 1);
        }
        long g9 = g(f6, j10, false, new boolean[2]);
        long j11 = this.f33399p;
        C3795qO c3795qO2 = this.f33391g;
        this.f33399p = (c3795qO2.f33714b - g9) + j11;
        this.f33391g = c3795qO2.a(g9, c3795qO2.f33715c);
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0483  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:202:0x047f -> B:187:0x044d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3877s f(AbstractC3832r8 abstractC3832r8) {
        AbstractC3149eQ[] abstractC3149eQArr;
        C3286h c3286h;
        String str;
        C3286h c3286h2;
        String str2;
        int i;
        int i4;
        int i9;
        int i10;
        long j9;
        InterfaceC3716p[] interfaceC3716pArr;
        boolean z8;
        int[][][] iArr;
        int[] iArr2;
        int length;
        C3770q c3770q;
        long j10;
        AbstractC3149eQ[] abstractC3149eQArr2;
        C3796qP c3796qP;
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
        boolean z9;
        Context context3;
        TP[] tpArr;
        int i12;
        int[] iArr3;
        int i13 = 2;
        int i14 = 1;
        C3041cR c3041cR = this.f33397n;
        C3554m c3554m = this.f33394k;
        c3554m.getClass();
        int[] iArr4 = new int[3];
        B8[][] b8Arr = new B8[3][];
        int[][][] iArr5 = new int[3][][];
        for (int i15 = 0; i15 < 3; i15++) {
            int i16 = c3041cR.f29710a;
            b8Arr[i15] = new B8[i16];
            iArr5[i15] = new int[i16][];
        }
        int[] iArr6 = new int[2];
        int i17 = 0;
        while (true) {
            abstractC3149eQArr = this.f33393j;
            if (i17 >= 2) {
                break;
            }
            abstractC3149eQArr[i17].getClass();
            iArr6[i17] = 8;
            i17++;
        }
        int i18 = 0;
        while (i18 < c3041cR.f29710a) {
            B8 a9 = c3041cR.a(i18);
            int i19 = i13;
            int i20 = i14;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                tpArr = a9.f24000d;
                i12 = a9.f23997a;
                if (i21 >= i13) {
                    break;
                }
                AbstractC3149eQ abstractC3149eQ = abstractC3149eQArr[i21];
                int i23 = i21;
                int i24 = 0;
                int i25 = 0;
                while (i24 < i12) {
                    int i26 = i24;
                    i25 = Math.max(i25, abstractC3149eQ.K(tpArr[i26]) & 7);
                    i24 = i26 + 1;
                }
                int i27 = iArr4[i23] == 0 ? i20 : 0;
                if (i25 > i22) {
                    i20 = i27;
                    i22 = i25;
                    i19 = i23;
                } else if (i25 == i22 && a9.f23999c == 5 && i20 == 0 && i27 != 0) {
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
                AbstractC3149eQ abstractC3149eQ2 = abstractC3149eQArr[i19];
                int[] iArr7 = new int[i12];
                for (int i28 = 0; i28 < i12; i28++) {
                    iArr7[i28] = abstractC3149eQ2.K(tpArr[i28]);
                }
                iArr3 = iArr7;
            }
            int i29 = iArr4[i19];
            b8Arr[i19][i29] = a9;
            iArr5[i19][i29] = iArr3;
            iArr4[i19] = i29 + 1;
            i18++;
            i14 = i20;
            i13 = 2;
        }
        int i30 = i13;
        int i31 = i14;
        C3041cR[] c3041cRArr = new C3041cR[i30];
        String[] strArr = new String[i30];
        int[] iArr8 = new int[i30];
        int i32 = 0;
        while (i32 < i30) {
            int i33 = iArr4[i32];
            c3041cRArr[i32] = new C3041cR((B8[]) AbstractC3548lu.o(b8Arr[i32], i33));
            iArr5[i32] = (int[][]) AbstractC3548lu.o(iArr5[i32], i33);
            strArr[i32] = abstractC3149eQArr[i32].o();
            iArr8[i32] = abstractC3149eQArr[i32].f30422u;
            i32++;
            i30 = 2;
        }
        int i34 = i30;
        AbstractC3149eQ[] abstractC3149eQArr3 = abstractC3149eQArr;
        r rVar = new r(iArr8, c3041cRArr, iArr6, iArr5, new C3041cR((B8[]) AbstractC3548lu.o(b8Arr[i34], iArr4[i34])));
        synchronized (c3554m.f32632c) {
            c3554m.f32635f = Thread.currentThread();
            c3286h = c3554m.f32634e;
        }
        if (c3554m.i == null && (context3 = c3554m.f32633d) != null) {
            c3554m.i = Boolean.valueOf(AbstractC3548lu.j(context3));
        }
        if (c3286h.f31121A && Build.VERSION.SDK_INT >= 32 && c3554m.f32636g == null) {
            c3554m.f32636g = new L(c3554m.f32633d, new RunnableC3068d(0, c3554m), c3554m.i);
        }
        int i35 = 2;
        C3662o[] c3662oArr = new C3662o[2];
        C3554m.j(rVar, c3286h);
        C3554m.k(rVar, c3286h, c3662oArr);
        C3554m.l(rVar, c3286h, c3662oArr);
        Pair a10 = C3554m.a(c3662oArr, i31);
        if (a10 == null) {
            int i36 = 0;
            while (true) {
                if (i36 >= i35) {
                    z9 = false;
                    break;
                }
                if (((int[]) rVar.f33919u)[i36] == i35 && ((C3041cR[]) rVar.f33921w)[i36].f29710a > 0) {
                    z9 = true;
                    break;
                }
                i36++;
                i35 = 2;
            }
            a10 = C3554m.b(1, rVar, iArr5, new com.bumptech.glide.manager.n(c3554m, c3286h, z9, iArr6), C2959b.f29365K);
            if (a10 != null) {
                c3662oArr[((Integer) a10.second).intValue()] = (C3662o) a10.first;
            }
        }
        if (a10 == null) {
            str = null;
        } else {
            C3662o c3662o = (C3662o) a10.first;
            str = c3662o.f33071a.f24000d[c3662o.f33072b[0]].f27766d;
        }
        Pair a11 = C3554m.a(c3662oArr, 2);
        Pair a12 = C3554m.a(c3662oArr, 4);
        if (a11 == null && a12 == null) {
            c3286h.f26562q.getClass();
            if (!c3286h.f26553g || (context2 = c3554m.f32633d) == null) {
                point = null;
            } else {
                String str4 = AbstractC3548lu.f32613a;
                DisplayManager displayManager = (DisplayManager) context2.getSystemService("display");
                Display display = displayManager != null ? displayManager.getDisplay(0) : null;
                if (display == null) {
                    WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                    windowManager.getClass();
                    display = windowManager.getDefaultDisplay();
                }
                if (display.getDisplayId() == 0 && AbstractC3548lu.j(context2)) {
                    String n9 = Build.VERSION.SDK_INT < 28 ? AbstractC3548lu.n("sys.display-size") : AbstractC3548lu.n("vendor.display-size");
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
                        AbstractC3217fl.T("Util", "Invalid display size: ".concat(String.valueOf(n9)));
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
            c3286h2 = c3286h;
            str2 = str;
            Pair b9 = C3554m.b(2, rVar, iArr5, new C2518Df(c3286h, str, iArr6, point, 1), C2959b.f29368w);
            Pair b10 = b9 == null ? C3554m.b(4, rVar, iArr5, new Vx(1, c3286h2), C2959b.f29366u) : null;
            if (b10 != null) {
                c3662oArr[((Integer) b10.second).intValue()] = (C3662o) b10.first;
            } else if (b9 != null) {
                c3662oArr[((Integer) b9.second).intValue()] = (C3662o) b9.first;
            }
        } else {
            c3286h2 = c3286h;
            str2 = str;
        }
        if (C3554m.a(c3662oArr, 3) == null) {
            c3286h2.f26562q.getClass();
            if (!c3286h2.f26565t || (context = c3554m.f32633d) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                str3 = null;
            } else {
                String str5 = AbstractC3548lu.f32613a;
                str3 = locale.toLanguageTag();
            }
            Pair b11 = C3554m.b(3, rVar, iArr5, new C3602mu(c3286h2, str2, str3, 1), C2959b.f29367v);
            if (b11 != null) {
                c3662oArr[((Integer) b11.second).intValue()] = (C3662o) b11.first;
            }
        }
        c3286h2.f26562q.getClass();
        ZB zb = new ZB(4);
        for (int i37 = 0; i37 < 2; i37++) {
            C3662o c3662o2 = c3662oArr[i37];
            if (c3662o2 != null && !c3286h2.f31125E.get(i37)) {
                AbstractC2917aC abstractC2917aC = c3286h2.f26567v;
                B8 b82 = c3662o2.f33071a;
                if (!abstractC2917aC.contains(Integer.valueOf(b82.f23999c))) {
                    zb.f(b82.f23998b);
                    int i38 = 0;
                    while (true) {
                        int[] iArr9 = c3662o2.f33072b;
                        if (i38 < iArr9.length) {
                            String str6 = b82.f24000d[iArr9[i38]].f27774m;
                            if (str6 != null) {
                                zb.f(str6);
                            }
                            i38++;
                        }
                    }
                }
            }
        }
        AbstractC2917aC h9 = zb.h();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i39 = 0; i39 < 2; i39++) {
            if (((int[]) rVar.f33919u)[i39] == 5) {
                C3041cR c3041cR2 = ((C3041cR[]) rVar.f33921w)[i39];
                for (int i40 = 0; i40 < c3041cR2.f29710a; i40++) {
                    B8 a13 = c3041cR2.a(i40);
                    arrayList.add(a13);
                    int[] iArr10 = (int[]) iArr5[i39][i40].clone();
                    for (int i41 = 0; i41 < iArr10.length; i41++) {
                        String str7 = a13.f24000d[i41].f27774m;
                        if (str7 != null && !h9.contains(str7)) {
                            iArr10[i41] = 128;
                        }
                    }
                    arrayList2.add(iArr10);
                }
            }
        }
        int i42 = 128;
        int size = arrayList.size();
        B8[] b8Arr2 = new B8[size];
        String str8 = AbstractC3548lu.f32613a;
        PA.T(arrayList.size() == size);
        arrayList.toArray(b8Arr2);
        C3041cR c3041cR3 = new C3041cR(b8Arr2);
        int size2 = arrayList2.size();
        int[][] iArr11 = new int[size2][];
        PA.T(arrayList2.size() == size2);
        arrayList2.toArray(iArr11);
        int i43 = 0;
        while (true) {
            i = 2;
            if (i43 >= 2) {
                i4 = 1;
                i9 = 0;
                break;
            }
            if (((int[]) rVar.f33919u)[i43] == 5) {
                C3662o h10 = C3554m.h(c3041cR3, iArr11, c3286h2);
                c3662oArr[i43] = h10;
                if (h10 == null) {
                    i4 = 1;
                    i9 = 0;
                    break;
                }
                int indexOf = c3041cR3.f29711b.indexOf(h10.f33071a);
                if (indexOf < 0) {
                    indexOf = -1;
                }
                i11 = i42;
                Arrays.fill(iArr11[indexOf], i11);
            } else {
                i11 = i42;
            }
            i43++;
            i42 = i11;
        }
        if (i9 >= i) {
            C3554m.j(rVar, c3286h2);
            C3554m.k(rVar, c3286h2, c3662oArr);
            C3554m.l(rVar, c3286h2, c3662oArr);
            C3796qP c3796qP2 = c3554m.f32638j;
            c3554m.f32631b.getClass();
            ArrayList arrayList3 = new ArrayList();
            int i44 = 0;
            while (true) {
                i10 = 2;
                if (i44 >= 2) {
                    break;
                }
                C3662o c3662o3 = c3662oArr[i44];
                if (c3662o3 == null || c3662o3.f33072b.length <= 1) {
                    arrayList3.add(null);
                } else {
                    SB sb = UB.f27942u;
                    RB rb = new RB(4);
                    rb.a(new C3150eR(0L, 0L));
                    arrayList3.add(rb);
                }
                i44++;
            }
            long[][] jArr = new long[2][];
            int i45 = 0;
            while (true) {
                j9 = -1;
                if (i45 >= i10) {
                    break;
                }
                C3662o c3662o4 = c3662oArr[i45];
                if (c3662o4 == null) {
                    jArr[i45] = new long[0];
                } else {
                    int[] iArr12 = c3662o4.f33072b;
                    jArr[i45] = new long[iArr12.length];
                    for (int i46 = 0; i46 < iArr12.length; i46++) {
                        long j11 = c3662o4.f33071a.f24000d[iArr12[i46]].f27771j;
                        long[] jArr2 = jArr[i45];
                        if (j11 == -1) {
                            j11 = 0;
                        }
                        jArr2[i46] = j11;
                    }
                    Arrays.sort(jArr[i45]);
                }
                i45++;
                i10 = 2;
            }
            int[] iArr13 = new int[i10];
            long[] jArr3 = new long[i10];
            int i47 = 0;
            while (i47 < i10) {
                long[] jArr4 = jArr[i47];
                jArr3[i47] = jArr4.length == 0 ? 0L : jArr4[0];
                i47++;
                i10 = 2;
            }
            C3770q.b(arrayList3, jArr3);
            C3513lC c3513lC = new C3513lC(new TreeMap(C3567mC.f32672u), new C3620nB());
            int i48 = 0;
            while (i48 < 2) {
                int length2 = jArr[i48].length;
                if (length2 <= 1) {
                    c3796qP = c3796qP2;
                    j10 = j9;
                    abstractC3149eQArr2 = abstractC3149eQArr3;
                } else {
                    double[] dArr = new double[length2];
                    j10 = j9;
                    int i49 = 0;
                    while (true) {
                        long[] jArr5 = jArr[i48];
                        double d2 = 0.0d;
                        if (i49 >= jArr5.length) {
                            break;
                        }
                        AbstractC3149eQ[] abstractC3149eQArr4 = abstractC3149eQArr3;
                        C3796qP c3796qP3 = c3796qP2;
                        long j12 = jArr5[i49];
                        if (j12 != j10) {
                            d2 = Math.log(j12);
                        }
                        dArr[i49] = d2;
                        i49++;
                        abstractC3149eQArr3 = abstractC3149eQArr4;
                        c3796qP2 = c3796qP3;
                    }
                    abstractC3149eQArr2 = abstractC3149eQArr3;
                    c3796qP = c3796qP2;
                    int i50 = length2 - 1;
                    double d3 = dArr[i50] - dArr[0];
                    int i51 = 0;
                    while (i51 < i50) {
                        double d9 = dArr[i51];
                        i51++;
                        Double valueOf = Double.valueOf(d3 == 0.0d ? 1.0d : (((d9 + dArr[i51]) * 0.5d) - dArr[0]) / d3);
                        double d10 = d3;
                        Integer valueOf2 = Integer.valueOf(i48);
                        Map map = c3513lC.f32551w;
                        long[][] jArr6 = jArr;
                        Collection collection = (Collection) map.get(valueOf);
                        if (collection == null) {
                            List list = (List) c3513lC.f32553y.a();
                            if (!list.add(valueOf2)) {
                                throw new AssertionError("New Collection violated the Collection spec");
                            }
                            c3513lC.f32552x++;
                            map.put(valueOf, list);
                        } else if (collection.add(valueOf2)) {
                            c3513lC.f32552x++;
                        }
                        jArr = jArr6;
                        d3 = d10;
                    }
                }
                i48++;
                abstractC3149eQArr3 = abstractC3149eQArr2;
                j9 = j10;
                c3796qP2 = c3796qP;
                jArr = jArr;
            }
            AbstractC3149eQ[] abstractC3149eQArr5 = abstractC3149eQArr3;
            C3796qP c3796qP4 = c3796qP2;
            long[][] jArr7 = jArr;
            Collection collection2 = c3513lC.f24355u;
            if (collection2 == null) {
                collection2 = c3513lC.a();
                c3513lC.f24355u = collection2;
            }
            UB n10 = UB.n(collection2);
            for (int i52 = 0; i52 < n10.size(); i52++) {
                int intValue = ((Integer) n10.get(i52)).intValue();
                int i53 = iArr13[intValue] + 1;
                iArr13[intValue] = i53;
                jArr3[intValue] = jArr7[intValue][i53];
                C3770q.b(arrayList3, jArr3);
            }
            int i54 = 0;
            for (int i55 = 2; i54 < i55; i55 = 2) {
                if (arrayList3.get(i54) != null) {
                    long j13 = jArr3[i54];
                    jArr3[i54] = j13 + j13;
                }
                i54++;
            }
            C3770q.b(arrayList3, jArr3);
            AbstractC2720Pd.p(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i56 = 0;
            int i57 = 0;
            while (i56 < arrayList3.size()) {
                RB rb2 = (RB) arrayList3.get(i56);
                C3675oC f6 = rb2 == null ? C3675oC.f33115x : rb2.f();
                f6.getClass();
                int length3 = objArr.length;
                int i58 = i57 + 1;
                int d11 = PB.d(length3, i58);
                if (d11 > length3) {
                    objArr = Arrays.copyOf(objArr, d11);
                }
                objArr[i57] = f6;
                i56++;
                i57 = i58;
            }
            C3675oC p6 = UB.p(objArr, i57);
            int i59 = 2;
            InterfaceC3716p[] interfaceC3716pArr2 = new InterfaceC3716p[2];
            int i60 = 0;
            while (i60 < i59) {
                C3662o c3662o5 = c3662oArr[i60];
                if (c3662o5 != null && (length = (iArr2 = c3662o5.f33072b).length) != 0) {
                    if (length == 1) {
                        c3770q = new C3770q(c3662o5.f33071a, new int[]{iArr2[0]});
                    } else {
                        B8 b83 = c3662o5.f33071a;
                        UB ub = (UB) p6.get(i60);
                        c3796qP4.getClass();
                        C3770q c3770q2 = new C3770q(b83, iArr2);
                        UB.n(ub);
                        c3770q = c3770q2;
                    }
                    interfaceC3716pArr2[i60] = c3770q;
                }
                i60++;
                i59 = 2;
            }
            FO[] foArr = new FO[i59];
            int i61 = 0;
            while (i61 < i59) {
                foArr[i61] = (c3286h2.f31125E.get(i61) || c3286h2.f26567v.contains(Integer.valueOf(((int[]) rVar.f33919u)[i61])) || (((int[]) rVar.f33919u)[i61] != -2 && interfaceC3716pArr2[i61] == null)) ? null : FO.f24960a;
                i61++;
                i59 = 2;
            }
            Pair create = Pair.create(foArr, interfaceC3716pArr2);
            InterfaceC3716p[] interfaceC3716pArr3 = (InterfaceC3716p[]) create.second;
            int length4 = interfaceC3716pArr3.length;
            List[] listArr = new List[length4];
            for (int i62 = 0; i62 < interfaceC3716pArr3.length; i62++) {
                InterfaceC3716p interfaceC3716p = interfaceC3716pArr3[i62];
                listArr[i62] = interfaceC3716p != null ? UB.j(interfaceC3716p) : C3675oC.f33115x;
            }
            RB rb3 = new RB(4);
            for (int i63 = 0; i63 < 2; i63++) {
                C3041cR[] c3041cRArr2 = (C3041cR[]) rVar.f33921w;
                C3041cR c3041cR4 = c3041cRArr2[i63];
                int i64 = 0;
                while (i64 < c3041cR4.f29710a) {
                    B8 a14 = c3041cR4.a(i64);
                    int i65 = c3041cRArr2[i63].a(i64).f23997a;
                    int[] iArr14 = new int[i65];
                    int i66 = 0;
                    int i67 = 0;
                    while (true) {
                        iArr = (int[][][]) rVar.f33922x;
                        if (i66 >= i65) {
                            break;
                        }
                        List[] listArr2 = listArr;
                        if ((iArr[i63][i64][i66] & 7) == 4) {
                            iArr14[i67] = i66;
                            i67++;
                        }
                        i66++;
                        listArr = listArr2;
                    }
                    List[] listArr3 = listArr;
                    int[] copyOf = Arrays.copyOf(iArr14, i67);
                    C3041cR[] c3041cRArr3 = c3041cRArr2;
                    C3041cR c3041cR5 = c3041cR4;
                    int i68 = 16;
                    String str9 = null;
                    int i69 = 0;
                    boolean z10 = false;
                    int i70 = 0;
                    while (i69 < copyOf.length) {
                        String str10 = c3041cRArr3[i63].a(i64).f24000d[copyOf[i69]].f27776o;
                        int i71 = i70 + 1;
                        if (i70 == 0) {
                            str9 = str10;
                        } else {
                            z10 = (!Objects.equals(str9, str10)) | z10;
                        }
                        i68 = Math.min(i68, iArr[i63][i64][i69] & 24);
                        i69++;
                        i70 = i71;
                    }
                    if (z10) {
                        i68 = Math.min(i68, ((int[]) rVar.f33920v)[i63]);
                    }
                    boolean z11 = i68 != 0;
                    int i72 = a14.f23997a;
                    int[] iArr15 = new int[i72];
                    boolean[] zArr = new boolean[i72];
                    int i73 = 0;
                    while (i73 < i72) {
                        iArr15[i73] = iArr[i63][i64][i73] & 7;
                        int i74 = 0;
                        boolean z12 = false;
                        while (i74 < length4) {
                            int i75 = length4;
                            List list2 = listArr3[i74];
                            int i76 = i72;
                            int i77 = i64;
                            int i78 = 0;
                            while (true) {
                                if (i78 >= list2.size()) {
                                    break;
                                }
                                InterfaceC3716p interfaceC3716p2 = (InterfaceC3716p) list2.get(i78);
                                List list3 = list2;
                                if (interfaceC3716p2.a().equals(a14) && interfaceC3716p2.l0(i73) != -1) {
                                    z12 = true;
                                    break;
                                }
                                i78++;
                                list2 = list3;
                            }
                            i74++;
                            length4 = i75;
                            i72 = i76;
                            i64 = i77;
                        }
                        zArr[i73] = z12;
                        i73++;
                        i64 = i64;
                    }
                    rb3.a(new C3207fb(a14, z11, iArr15, zArr));
                    i64++;
                    listArr = listArr3;
                    c3041cRArr2 = c3041cRArr3;
                    c3041cR4 = c3041cR5;
                    length4 = length4;
                }
            }
            int i79 = 0;
            while (true) {
                C3041cR c3041cR6 = (C3041cR) rVar.f33923y;
                if (i79 >= c3041cR6.f29710a) {
                    break;
                }
                B8 a15 = c3041cR6.a(i79);
                int i80 = a15.f23997a;
                int[] iArr16 = new int[i80];
                Arrays.fill(iArr16, 0);
                rb3.a(new C3207fb(a15, false, iArr16, new boolean[i80]));
                i79++;
            }
            C3877s c3877s = new C3877s((FO[]) create.first, (InterfaceC3716p[]) create.second, new C4176xb(rb3.f()), rVar);
            int i81 = 0;
            while (true) {
                int i82 = c3877s.f34149n;
                interfaceC3716pArr = (InterfaceC3716p[]) c3877s.f34151v;
                if (i81 >= i82) {
                    break;
                }
                if (c3877s.b(i81)) {
                    if (interfaceC3716pArr[i81] == null) {
                        abstractC3149eQArr5[i81].getClass();
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    PA.T(z8);
                } else {
                    PA.T(interfaceC3716pArr[i81] == null);
                }
                i81++;
            }
            for (InterfaceC3716p interfaceC3716p3 : interfaceC3716pArr) {
            }
            return c3877s;
        }
        int i83 = ((int[]) rVar.f33919u)[i9];
        if (i83 != i && i83 != i4) {
            if (i83 != 3 && i83 != 4) {
                if (i83 != 5 && c3662oArr[i9] == null) {
                    c3662oArr[i9] = C3554m.h(((C3041cR[]) rVar.f33921w)[i9], iArr5[i9], c3286h2);
                }
                i9++;
                i4 = 1;
                i = 2;
                if (i9 >= i) {
                }
            }
        }
        i9++;
        i4 = 1;
        i = 2;
        if (i9 >= i) {
        }
    }

    public final long g(C3877s c3877s, long j9, boolean z8, boolean[] zArr) {
        AbstractC3149eQ[] abstractC3149eQArr;
        int i = 0;
        while (true) {
            boolean z9 = true;
            if (i >= c3877s.f34149n) {
                break;
            }
            if (z8 || !c3877s.d(this.f33398o, i)) {
                z9 = false;
            }
            this.i[i] = z9;
            i++;
        }
        int i4 = 0;
        while (true) {
            abstractC3149eQArr = this.f33393j;
            if (i4 >= 2) {
                break;
            }
            abstractC3149eQArr[i4].getClass();
            i4++;
        }
        l();
        this.f33398o = c3877s;
        if (this.f33396m == null) {
            int i9 = 0;
            while (true) {
                C3877s c3877s2 = this.f33398o;
                if (i9 >= c3877s2.f34149n) {
                    break;
                }
                c3877s2.b(i9);
                InterfaceC3716p interfaceC3716p = ((InterfaceC3716p[]) this.f33398o.f34151v)[i9];
                i9++;
            }
        }
        C4012uQ c4012uQ = this.f33385a;
        InterfaceC3716p[] interfaceC3716pArr = (InterfaceC3716p[]) c3877s.f34151v;
        boolean[] zArr2 = this.i;
        VQ[] vqArr = this.f33387c;
        long j10 = c4012uQ.j(interfaceC3716pArr, zArr2, vqArr, zArr, j9);
        for (int i10 = 0; i10 < 2; i10++) {
            abstractC3149eQArr[i10].getClass();
        }
        this.f33390f = false;
        for (int i11 = 0; i11 < 2; i11++) {
            if (vqArr[i11] != null) {
                PA.T(c3877s.b(i11));
                abstractC3149eQArr[i11].getClass();
                this.f33390f = true;
            } else {
                PA.T(interfaceC3716pArr[i11] == null);
            }
        }
        return j10;
    }

    public final void h() {
        l();
        C3.m mVar = this.f33395l;
        C4012uQ c4012uQ = this.f33385a;
        try {
            IdentityHashMap identityHashMap = (IdentityHashMap) mVar.f453x;
            C4172xO c4172xO = (C4172xO) identityHashMap.remove(c4012uQ);
            c4172xO.getClass();
            c4172xO.f35144a.b(c4012uQ);
            c4172xO.f35146c.remove(c4012uQ.f34592n);
            if (!identityHashMap.isEmpty()) {
                mVar.m();
            }
            mVar.p(c4172xO);
        } catch (RuntimeException e6) {
            AbstractC3217fl.X("MediaPeriodHolder", "Period release failed.", e6);
        }
    }

    public final C3741pO i() {
        return this.f33396m;
    }

    public final C3041cR j() {
        return this.f33397n;
    }

    public final C3877s k() {
        return this.f33398o;
    }

    public final void l() {
        if (this.f33396m != null) {
            return;
        }
        int i = 0;
        while (true) {
            C3877s c3877s = this.f33398o;
            if (i >= c3877s.f34149n) {
                return;
            }
            c3877s.b(i);
            InterfaceC3716p interfaceC3716p = ((InterfaceC3716p[]) this.f33398o.f34151v)[i];
            i++;
        }
    }
}
