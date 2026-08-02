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
public final class C3052cO {

    /* renamed from: a, reason: collision with root package name */
    public final C3483kQ f30256a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30257b;

    /* renamed from: c, reason: collision with root package name */
    public final LQ[] f30258c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30259d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30260e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30261f;

    /* renamed from: g, reason: collision with root package name */
    public C3106dO f30262g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30263h;
    public final boolean[] i;

    /* renamed from: j, reason: collision with root package name */
    public final SP[] f30264j;

    /* renamed from: k, reason: collision with root package name */
    public final C3672o f30265k;

    /* renamed from: l, reason: collision with root package name */
    public final G3.m f30266l;

    /* renamed from: m, reason: collision with root package name */
    public C3052cO f30267m;

    /* renamed from: n, reason: collision with root package name */
    public SQ f30268n;

    /* renamed from: o, reason: collision with root package name */
    public C3941t f30269o;

    /* renamed from: p, reason: collision with root package name */
    public long f30270p;

    public C3052cO(SP[] spArr, long j6, C3672o c3672o, InterfaceC4049v interfaceC4049v, G3.m mVar, C3106dO c3106dO, C3941t c3941t) {
        this.f30264j = spArr;
        this.f30270p = j6;
        this.f30265k = c3672o;
        this.f30266l = mVar;
        C3860rQ c3860rQ = c3106dO.f30532a;
        this.f30257b = c3860rQ.f34406a;
        this.f30262g = c3106dO;
        this.f30268n = SQ.f28273d;
        this.f30269o = c3941t;
        this.f30258c = new LQ[2];
        this.i = new boolean[2];
        mVar.getClass();
        int i = C3858rO.f34349k;
        Pair pair = (Pair) c3860rQ.f34406a;
        Object obj = pair.first;
        C3860rQ a9 = c3860rQ.a(pair.second);
        C3481kO c3481kO = (C3481kO) ((HashMap) mVar.f1149y).get(obj);
        c3481kO.getClass();
        ((HashSet) mVar.f1140B).add(c3481kO);
        C3427jO c3427jO = (C3427jO) ((HashMap) mVar.f1139A).get(c3481kO);
        if (c3427jO != null) {
            c3427jO.f32029a.o(c3427jO.f32030b);
        }
        c3481kO.f32200c.add(a9);
        C3483kQ c9 = c3481kO.f32198a.c(a9, interfaceC4049v, c3106dO.f30533b);
        ((IdentityHashMap) mVar.f1148x).put(c9, c3481kO);
        mVar.m();
        this.f30256a = c9;
    }

    public final long a() {
        return this.f30262g.f30533b + this.f30270p;
    }

    public final boolean b() {
        if (this.f30260e) {
            return !this.f30261f || this.f30256a.f() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean c() {
        if (this.f30260e) {
            return b() || d() - this.f30262g.f30533b >= com.anythink.basead.exoplayer.b.f7168b;
        }
        return false;
    }

    public final long d() {
        if (!this.f30260e) {
            return this.f30262g.f30533b;
        }
        long f2 = this.f30261f ? this.f30256a.f() : Long.MIN_VALUE;
        return f2 == Long.MIN_VALUE ? this.f30262g.f30536e : f2;
    }

    public final void e(AbstractC3627n8 abstractC3627n8) {
        this.f30260e = true;
        this.f30268n = this.f30256a.p();
        C3941t f2 = f(abstractC3627n8);
        C3106dO c3106dO = this.f30262g;
        long j6 = c3106dO.f30536e;
        long j9 = c3106dO.f30533b;
        if (j6 != com.anythink.basead.exoplayer.b.f7168b && j9 >= j6) {
            j9 = Math.max(0L, j6 - 1);
        }
        long g9 = g(f2, j9, false, new boolean[2]);
        long j10 = this.f30270p;
        C3106dO c3106dO2 = this.f30262g;
        this.f30270p = (c3106dO2.f30533b - g9) + j10;
        this.f30262g = c3106dO2.a(g9, c3106dO2.f30534c);
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0482  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:202:0x047e -> B:187:0x044c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3941t f(AbstractC3627n8 abstractC3627n8) {
        SP[] spArr;
        C3350i c3350i;
        String str;
        C3350i c3350i2;
        String str2;
        int i;
        int i4;
        int i6;
        int i9;
        long j6;
        InterfaceC3780q[] interfaceC3780qArr;
        boolean z6;
        int[][][] iArr;
        int[] iArr2;
        int length;
        r rVar;
        long j9;
        SP[] spArr2;
        C3107dP c3107dP;
        int i10;
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
        DP[] dpArr;
        int i11;
        int[] iArr3;
        int i12 = 2;
        int i13 = 1;
        SQ sq = this.f30268n;
        C3672o c3672o = this.f30265k;
        c3672o.getClass();
        int[] iArr4 = new int[3];
        A8[][] a8Arr = new A8[3][];
        int[][][] iArr5 = new int[3][][];
        for (int i14 = 0; i14 < 3; i14++) {
            int i15 = sq.f28274a;
            a8Arr[i14] = new A8[i15];
            iArr5[i14] = new int[i15][];
        }
        int[] iArr6 = new int[2];
        int i16 = 0;
        while (true) {
            spArr = this.f30264j;
            if (i16 >= 2) {
                break;
            }
            spArr[i16].getClass();
            iArr6[i16] = 8;
            i16++;
        }
        int i17 = 0;
        while (i17 < sq.f28274a) {
            A8 a9 = sq.a(i17);
            int i18 = i12;
            int i19 = i13;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                dpArr = a9.f24418d;
                i11 = a9.f24415a;
                if (i20 >= i12) {
                    break;
                }
                SP sp = spArr[i20];
                int i22 = i20;
                int i23 = 0;
                int i24 = 0;
                while (i23 < i11) {
                    int i25 = i23;
                    i24 = Math.max(i24, sp.L(dpArr[i25]) & 7);
                    i23 = i25 + 1;
                }
                int i26 = iArr4[i22] == 0 ? i19 : 0;
                if (i24 > i21) {
                    i19 = i26;
                    i21 = i24;
                    i18 = i22;
                } else if (i24 == i21 && a9.f24417c == 5 && i19 == 0 && i26 != 0) {
                    i21 = i24;
                    i18 = i22;
                    i19 = i19;
                }
                i20 = i22 + 1;
                i12 = 2;
            }
            if (i18 == i12) {
                iArr3 = new int[i11];
            } else {
                SP sp2 = spArr[i18];
                int[] iArr7 = new int[i11];
                for (int i27 = 0; i27 < i11; i27++) {
                    iArr7[i27] = sp2.L(dpArr[i27]);
                }
                iArr3 = iArr7;
            }
            int i28 = iArr4[i18];
            a8Arr[i18][i28] = a9;
            iArr5[i18][i28] = iArr3;
            iArr4[i18] = i28 + 1;
            i17++;
            i13 = i19;
            i12 = 2;
        }
        int i29 = i12;
        int i30 = i13;
        SQ[] sqArr = new SQ[i29];
        String[] strArr = new String[i29];
        int[] iArr8 = new int[i29];
        int i31 = 0;
        while (i31 < i29) {
            int i32 = iArr4[i31];
            sqArr[i31] = new SQ((A8[]) AbstractC3182eu.o(a8Arr[i31], i32));
            iArr5[i31] = (int[][]) AbstractC3182eu.o(iArr5[i31], i32);
            strArr[i31] = spArr[i31].p();
            iArr8[i31] = spArr[i31].f28261u;
            i31++;
            i29 = 2;
        }
        int i33 = i29;
        SP[] spArr3 = spArr;
        C3887s c3887s = new C3887s(iArr8, sqArr, iArr6, iArr5, new SQ((A8[]) AbstractC3182eu.o(a8Arr[i33], iArr4[i33])));
        synchronized (c3672o.f33612c) {
            c3672o.f33615f = Thread.currentThread();
            c3350i = c3672o.f33614e;
        }
        if (c3672o.i == null && (context3 = c3672o.f33613d) != null) {
            c3672o.i = Boolean.valueOf(AbstractC3182eu.j(context3));
        }
        if (c3350i.f31751A && Build.VERSION.SDK_INT >= 32 && c3672o.f33616g == null) {
            c3672o.f33616g = new M(c3672o.f33613d, new RunnableC3134e(0, c3672o), c3672o.i);
        }
        int i34 = 2;
        C3726p[] c3726pArr = new C3726p[2];
        C3672o.j(c3887s, c3350i);
        C3672o.k(c3887s, c3350i, c3726pArr);
        C3672o.l(c3887s, c3350i, c3726pArr);
        Pair a10 = C3672o.a(c3726pArr, i30);
        if (a10 == null) {
            int i35 = 0;
            while (true) {
                if (i35 >= i34) {
                    z9 = false;
                    break;
                }
                if (((int[]) c3887s.f34554u)[i35] == i34 && ((SQ[]) c3887s.f34556w)[i35].f28274a > 0) {
                    z9 = true;
                    break;
                }
                i35++;
                i34 = 2;
            }
            a10 = C3672o.b(1, c3887s, iArr5, new com.bumptech.glide.manager.n(c3672o, c3350i, z9, iArr6), C3027c.f30176u);
            if (a10 != null) {
                c3726pArr[((Integer) a10.second).intValue()] = (C3726p) a10.first;
            }
        }
        if (a10 == null) {
            str = null;
        } else {
            C3726p c3726p = (C3726p) a10.first;
            str = c3726p.f33775a.f24418d[c3726p.f33776b[0]].f25166d;
        }
        Pair a11 = C3672o.a(c3726pArr, 2);
        Pair a12 = C3672o.a(c3726pArr, 4);
        if (a11 == null && a12 == null) {
            c3350i.f26454q.getClass();
            if (!c3350i.f26445g || (context2 = c3672o.f33613d) == null) {
                point = null;
            } else {
                String str4 = AbstractC3182eu.f30782a;
                DisplayManager displayManager = (DisplayManager) context2.getSystemService("display");
                Display display = displayManager != null ? displayManager.getDisplay(0) : null;
                if (display == null) {
                    WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                    windowManager.getClass();
                    display = windowManager.getDefaultDisplay();
                }
                if (display.getDisplayId() == 0 && AbstractC3182eu.j(context2)) {
                    String n9 = Build.VERSION.SDK_INT < 28 ? AbstractC3182eu.n("sys.display-size") : AbstractC3182eu.n("vendor.display-size");
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
                        AbstractC2991bG.H("Util", "Invalid display size: ".concat(String.valueOf(n9)));
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
            c3350i2 = c3350i;
            str2 = str;
            int i36 = 2;
            Pair b9 = C3672o.b(2, c3887s, iArr5, new C2590Gf(c3350i, str, iArr6, point, 1), C3027c.f30179x);
            Pair b10 = b9 == null ? C3672o.b(4, c3887s, iArr5, new C3717or(i36, c3350i2), C3027c.f30177v) : null;
            if (b10 != null) {
                c3726pArr[((Integer) b10.second).intValue()] = (C3726p) b10.first;
            } else if (b9 != null) {
                c3726pArr[((Integer) b9.second).intValue()] = (C3726p) b9.first;
            }
        } else {
            c3350i2 = c3350i;
            str2 = str;
        }
        if (C3672o.a(c3726pArr, 3) == null) {
            c3350i2.f26454q.getClass();
            if (!c3350i2.f26457t || (context = c3672o.f33613d) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                str3 = null;
            } else {
                String str5 = AbstractC3182eu.f30782a;
                str3 = locale.toLanguageTag();
            }
            Pair b11 = C3672o.b(3, c3887s, iArr5, new C3504ku(1, c3350i2, str2, str3), C3027c.f30178w);
            if (b11 != null) {
                c3726pArr[((Integer) b11.second).intValue()] = (C3726p) b11.first;
            }
        }
        c3350i2.f26454q.getClass();
        WB wb = new WB(4);
        for (int i37 = 0; i37 < 2; i37++) {
            C3726p c3726p2 = c3726pArr[i37];
            if (c3726p2 != null && !c3350i2.f31755E.get(i37)) {
                XB xb = c3350i2.f26459v;
                A8 a82 = c3726p2.f33775a;
                if (!xb.contains(Integer.valueOf(a82.f24417c))) {
                    wb.f(a82.f24416b);
                    int i38 = 0;
                    while (true) {
                        int[] iArr9 = c3726p2.f33776b;
                        if (i38 < iArr9.length) {
                            String str6 = a82.f24418d[iArr9[i38]].f25174m;
                            if (str6 != null) {
                                wb.f(str6);
                            }
                            i38++;
                        }
                    }
                }
            }
        }
        XB h3 = wb.h();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i39 = 0; i39 < 2; i39++) {
            if (((int[]) c3887s.f34554u)[i39] == 5) {
                SQ sq2 = ((SQ[]) c3887s.f34556w)[i39];
                for (int i40 = 0; i40 < sq2.f28274a; i40++) {
                    A8 a13 = sq2.a(i40);
                    arrayList.add(a13);
                    int[] iArr10 = (int[]) iArr5[i39][i40].clone();
                    for (int i41 = 0; i41 < iArr10.length; i41++) {
                        String str7 = a13.f24418d[i41].f25174m;
                        if (str7 != null && !h3.contains(str7)) {
                            iArr10[i41] = 128;
                        }
                    }
                    arrayList2.add(iArr10);
                }
            }
        }
        int i42 = 128;
        int size = arrayList.size();
        A8[] a8Arr2 = new A8[size];
        String str8 = AbstractC3182eu.f30782a;
        AbstractC2792Sd.H(arrayList.size() == size);
        arrayList.toArray(a8Arr2);
        SQ sq3 = new SQ(a8Arr2);
        int size2 = arrayList2.size();
        int[][] iArr11 = new int[size2][];
        AbstractC2792Sd.H(arrayList2.size() == size2);
        arrayList2.toArray(iArr11);
        int i43 = 0;
        while (true) {
            i = 2;
            if (i43 >= 2) {
                i4 = 1;
                i6 = 0;
                break;
            }
            if (((int[]) c3887s.f34554u)[i43] == 5) {
                C3726p h9 = C3672o.h(sq3, iArr11, c3350i2);
                c3726pArr[i43] = h9;
                if (h9 == null) {
                    i4 = 1;
                    i6 = 0;
                    break;
                }
                int indexOf = sq3.f28275b.indexOf(h9.f33775a);
                if (indexOf < 0) {
                    indexOf = -1;
                }
                i10 = i42;
                Arrays.fill(iArr11[indexOf], i10);
            } else {
                i10 = i42;
            }
            i43++;
            i42 = i10;
        }
        if (i6 >= i) {
            C3672o.j(c3887s, c3350i2);
            C3672o.k(c3887s, c3350i2, c3726pArr);
            C3672o.l(c3887s, c3350i2, c3726pArr);
            C3107dP c3107dP2 = c3672o.f33618j;
            c3672o.f33611b.getClass();
            ArrayList arrayList3 = new ArrayList();
            int i44 = 0;
            while (true) {
                i9 = 2;
                if (i44 >= 2) {
                    break;
                }
                C3726p c3726p3 = c3726pArr[i44];
                if (c3726p3 == null || c3726p3.f33776b.length <= 1) {
                    arrayList3.add(null);
                } else {
                    PB pb = RB.f27933u;
                    OB ob = new OB(4);
                    ob.a(new UQ(0L, 0L));
                    arrayList3.add(ob);
                }
                i44++;
            }
            long[][] jArr = new long[2][];
            int i45 = 0;
            while (true) {
                j6 = -1;
                if (i45 >= i9) {
                    break;
                }
                C3726p c3726p4 = c3726pArr[i45];
                if (c3726p4 == null) {
                    jArr[i45] = new long[0];
                } else {
                    int[] iArr12 = c3726p4.f33776b;
                    jArr[i45] = new long[iArr12.length];
                    for (int i46 = 0; i46 < iArr12.length; i46++) {
                        long j10 = c3726p4.f33775a.f24418d[iArr12[i46]].f25171j;
                        long[] jArr2 = jArr[i45];
                        if (j10 == -1) {
                            j10 = 0;
                        }
                        jArr2[i46] = j10;
                    }
                    Arrays.sort(jArr[i45]);
                }
                i45++;
                i9 = 2;
            }
            int[] iArr13 = new int[i9];
            long[] jArr3 = new long[i9];
            int i47 = 0;
            while (i47 < i9) {
                long[] jArr4 = jArr[i47];
                jArr3[i47] = jArr4.length == 0 ? 0L : jArr4[0];
                i47++;
                i9 = 2;
            }
            r.a(arrayList3, jArr3);
            C3363iC c3363iC = new C3363iC(new TreeMap(C3415jC.f32000u), new C3468kB());
            int i48 = 0;
            while (i48 < 2) {
                int length2 = jArr[i48].length;
                if (length2 <= 1) {
                    c3107dP = c3107dP2;
                    j9 = j6;
                    spArr2 = spArr3;
                } else {
                    double[] dArr = new double[length2];
                    j9 = j6;
                    int i49 = 0;
                    while (true) {
                        long[] jArr5 = jArr[i48];
                        double d9 = 0.0d;
                        if (i49 >= jArr5.length) {
                            break;
                        }
                        SP[] spArr4 = spArr3;
                        C3107dP c3107dP3 = c3107dP2;
                        long j11 = jArr5[i49];
                        if (j11 != j9) {
                            d9 = Math.log(j11);
                        }
                        dArr[i49] = d9;
                        i49++;
                        spArr3 = spArr4;
                        c3107dP2 = c3107dP3;
                    }
                    spArr2 = spArr3;
                    c3107dP = c3107dP2;
                    int i50 = length2 - 1;
                    double d10 = dArr[i50] - dArr[0];
                    int i51 = 0;
                    while (i51 < i50) {
                        double d11 = dArr[i51];
                        i51++;
                        Double valueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i51]) * 0.5d) - dArr[0]) / d10);
                        double d12 = d10;
                        Integer valueOf2 = Integer.valueOf(i48);
                        Map map = c3363iC.f31784w;
                        long[][] jArr6 = jArr;
                        Collection collection = (Collection) map.get(valueOf);
                        if (collection == null) {
                            List list = (List) c3363iC.f31786y.mo14c();
                            if (!list.add(valueOf2)) {
                                throw new AssertionError("New Collection violated the Collection spec");
                            }
                            c3363iC.f31785x++;
                            map.put(valueOf, list);
                        } else if (collection.add(valueOf2)) {
                            c3363iC.f31785x++;
                        }
                        jArr = jArr6;
                        d10 = d12;
                    }
                }
                i48++;
                spArr3 = spArr2;
                j6 = j9;
                c3107dP2 = c3107dP;
                jArr = jArr;
            }
            SP[] spArr5 = spArr3;
            C3107dP c3107dP4 = c3107dP2;
            long[][] jArr7 = jArr;
            Collection collection2 = c3363iC.f24428u;
            if (collection2 == null) {
                collection2 = c3363iC.a();
                c3363iC.f24428u = collection2;
            }
            RB n10 = RB.n(collection2);
            for (int i52 = 0; i52 < n10.size(); i52++) {
                int intValue = ((Integer) n10.get(i52)).intValue();
                int i53 = iArr13[intValue] + 1;
                iArr13[intValue] = i53;
                jArr3[intValue] = jArr7[intValue][i53];
                r.a(arrayList3, jArr3);
            }
            int i54 = 0;
            for (int i55 = 2; i54 < i55; i55 = 2) {
                if (arrayList3.get(i54) != null) {
                    long j12 = jArr3[i54];
                    jArr3[i54] = j12 + j12;
                }
                i54++;
            }
            r.a(arrayList3, jArr3);
            MA.q(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i56 = 0;
            int i57 = 0;
            while (i56 < arrayList3.size()) {
                OB ob2 = (OB) arrayList3.get(i56);
                C3523lC f2 = ob2 == null ? C3523lC.f32525x : ob2.f();
                f2.getClass();
                int length3 = objArr.length;
                int i58 = i57 + 1;
                int d13 = MB.d(length3, i58);
                if (d13 > length3) {
                    objArr = Arrays.copyOf(objArr, d13);
                }
                objArr[i57] = f2;
                i56++;
                i57 = i58;
            }
            C3523lC p9 = RB.p(objArr, i57);
            int i59 = 2;
            InterfaceC3780q[] interfaceC3780qArr2 = new InterfaceC3780q[2];
            int i60 = 0;
            while (i60 < i59) {
                C3726p c3726p5 = c3726pArr[i60];
                if (c3726p5 != null && (length = (iArr2 = c3726p5.f33776b).length) != 0) {
                    if (length == 1) {
                        rVar = new r(c3726p5.f33775a, new int[]{iArr2[0]});
                    } else {
                        A8 a83 = c3726p5.f33775a;
                        RB rb = (RB) p9.get(i60);
                        c3107dP4.getClass();
                        r rVar2 = new r(a83, iArr2);
                        RB.n(rb);
                        rVar = rVar2;
                    }
                    interfaceC3780qArr2[i60] = rVar;
                }
                i60++;
                i59 = 2;
            }
            C3912sO[] c3912sOArr = new C3912sO[i59];
            int i61 = 0;
            while (i61 < i59) {
                c3912sOArr[i61] = (c3350i2.f31755E.get(i61) || c3350i2.f26459v.contains(Integer.valueOf(((int[]) c3887s.f34554u)[i61])) || (((int[]) c3887s.f34554u)[i61] != -2 && interfaceC3780qArr2[i61] == null)) ? null : C3912sO.f34739a;
                i61++;
                i59 = 2;
            }
            Pair create = Pair.create(c3912sOArr, interfaceC3780qArr2);
            InterfaceC3780q[] interfaceC3780qArr3 = (InterfaceC3780q[]) create.second;
            int length4 = interfaceC3780qArr3.length;
            List[] listArr = new List[length4];
            for (int i62 = 0; i62 < interfaceC3780qArr3.length; i62++) {
                InterfaceC3780q interfaceC3780q = interfaceC3780qArr3[i62];
                listArr[i62] = interfaceC3780q != null ? RB.j(interfaceC3780q) : C3523lC.f32525x;
            }
            OB ob3 = new OB(4);
            for (int i63 = 0; i63 < 2; i63++) {
                SQ[] sqArr2 = (SQ[]) c3887s.f34556w;
                SQ sq4 = sqArr2[i63];
                int i64 = 0;
                while (i64 < sq4.f28274a) {
                    A8 a14 = sq4.a(i64);
                    int i65 = sqArr2[i63].a(i64).f24415a;
                    int[] iArr14 = new int[i65];
                    int i66 = 0;
                    int i67 = 0;
                    while (true) {
                        iArr = (int[][][]) c3887s.f34557x;
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
                    SQ[] sqArr3 = sqArr2;
                    SQ sq5 = sq4;
                    int i68 = 16;
                    String str9 = null;
                    int i69 = 0;
                    boolean z10 = false;
                    int i70 = 0;
                    while (i69 < copyOf.length) {
                        String str10 = sqArr3[i63].a(i64).f24418d[copyOf[i69]].f25176o;
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
                        i68 = Math.min(i68, ((int[]) c3887s.f34555v)[i63]);
                    }
                    boolean z11 = i68 != 0;
                    int i72 = a14.f24415a;
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
                                InterfaceC3780q interfaceC3780q2 = (InterfaceC3780q) list2.get(i78);
                                List list3 = list2;
                                if (interfaceC3780q2.c().equals(a14) && interfaceC3780q2.j0(i73) != -1) {
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
                    ob3.a(new C3163eb(a14, z11, iArr15, zArr));
                    i64++;
                    listArr = listArr3;
                    sqArr2 = sqArr3;
                    sq4 = sq5;
                    length4 = length4;
                }
            }
            int i79 = 0;
            while (true) {
                SQ sq6 = (SQ) c3887s.f34558y;
                if (i79 >= sq6.f28274a) {
                    break;
                }
                A8 a15 = sq6.a(i79);
                int i80 = a15.f24415a;
                int[] iArr16 = new int[i80];
                Arrays.fill(iArr16, 0);
                ob3.a(new C3163eb(a15, false, iArr16, new boolean[i80]));
                i79++;
            }
            C3941t c3941t = new C3941t((C3912sO[]) create.first, (InterfaceC3780q[]) create.second, new C4132wb(ob3.f()), c3887s);
            int i81 = 0;
            while (true) {
                int i82 = c3941t.f34963n;
                interfaceC3780qArr = (InterfaceC3780q[]) c3941t.f34965v;
                if (i81 >= i82) {
                    break;
                }
                if (c3941t.c(i81)) {
                    if (interfaceC3780qArr[i81] == null) {
                        spArr5[i81].getClass();
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    AbstractC2792Sd.H(z6);
                } else {
                    AbstractC2792Sd.H(interfaceC3780qArr[i81] == null);
                }
                i81++;
            }
            for (InterfaceC3780q interfaceC3780q3 : interfaceC3780qArr) {
            }
            return c3941t;
        }
        int i83 = ((int[]) c3887s.f34554u)[i6];
        if (i83 != i && i83 != i4) {
            if (i83 != 3 && i83 != 4) {
                if (i83 != 5 && c3726pArr[i6] == null) {
                    c3726pArr[i6] = C3672o.h(((SQ[]) c3887s.f34556w)[i6], iArr5[i6], c3350i2);
                }
                i6++;
                i4 = 1;
                i = 2;
                if (i6 >= i) {
                }
            }
        }
        i6++;
        i4 = 1;
        i = 2;
        if (i6 >= i) {
        }
    }

    public final long g(C3941t c3941t, long j6, boolean z6, boolean[] zArr) {
        SP[] spArr;
        int i = 0;
        while (true) {
            boolean z9 = true;
            if (i >= c3941t.f34963n) {
                break;
            }
            if (z6 || !c3941t.d(this.f30269o, i)) {
                z9 = false;
            }
            this.i[i] = z9;
            i++;
        }
        int i4 = 0;
        while (true) {
            spArr = this.f30264j;
            if (i4 >= 2) {
                break;
            }
            spArr[i4].getClass();
            i4++;
        }
        l();
        this.f30269o = c3941t;
        if (this.f30267m == null) {
            int i6 = 0;
            while (true) {
                C3941t c3941t2 = this.f30269o;
                if (i6 >= c3941t2.f34963n) {
                    break;
                }
                c3941t2.c(i6);
                InterfaceC3780q interfaceC3780q = ((InterfaceC3780q[]) this.f30269o.f34965v)[i6];
                i6++;
            }
        }
        C3483kQ c3483kQ = this.f30256a;
        InterfaceC3780q[] interfaceC3780qArr = (InterfaceC3780q[]) c3941t.f34965v;
        boolean[] zArr2 = this.i;
        LQ[] lqArr = this.f30258c;
        long h3 = c3483kQ.h(interfaceC3780qArr, zArr2, lqArr, zArr, j6);
        for (int i9 = 0; i9 < 2; i9++) {
            spArr[i9].getClass();
        }
        this.f30261f = false;
        for (int i10 = 0; i10 < 2; i10++) {
            if (lqArr[i10] != null) {
                AbstractC2792Sd.H(c3941t.c(i10));
                spArr[i10].getClass();
                this.f30261f = true;
            } else {
                AbstractC2792Sd.H(interfaceC3780qArr[i10] == null);
            }
        }
        return h3;
    }

    public final void h() {
        l();
        G3.m mVar = this.f30266l;
        C3483kQ c3483kQ = this.f30256a;
        try {
            IdentityHashMap identityHashMap = (IdentityHashMap) mVar.f1148x;
            C3481kO c3481kO = (C3481kO) identityHashMap.remove(c3483kQ);
            c3481kO.getClass();
            c3481kO.f32198a.b(c3483kQ);
            c3481kO.f32200c.remove(c3483kQ.f32228n);
            if (!identityHashMap.isEmpty()) {
                mVar.m();
            }
            mVar.p(c3481kO);
        } catch (RuntimeException e9) {
            AbstractC2991bG.J("MediaPeriodHolder", "Period release failed.", e9);
        }
    }

    public final C3052cO i() {
        return this.f30267m;
    }

    public final SQ j() {
        return this.f30268n;
    }

    public final C3941t k() {
        return this.f30269o;
    }

    public final void l() {
        if (this.f30267m != null) {
            return;
        }
        int i = 0;
        while (true) {
            C3941t c3941t = this.f30269o;
            if (i >= c3941t.f34963n) {
                return;
            }
            c3941t.c(i);
            InterfaceC3780q interfaceC3780q = ((InterfaceC3780q[]) this.f30269o.f34965v)[i];
            i++;
        }
    }
}
