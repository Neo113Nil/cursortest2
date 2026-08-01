package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4053vQ extends AbstractC2978bQ {

    /* renamed from: r, reason: collision with root package name */
    public static final C2954b2 f34697r;

    /* renamed from: k, reason: collision with root package name */
    public final XP[] f34698k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f34699l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC3604n8[] f34700m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f34701n;

    /* renamed from: o, reason: collision with root package name */
    public int f34702o = -1;

    /* renamed from: p, reason: collision with root package name */
    public long[][] f34703p;

    /* renamed from: q, reason: collision with root package name */
    public B1.z f34704q;

    static {
        PB pb = RB.f27177u;
        C3500lC c3500lC = C3500lC.f31745x;
        List list = Collections.EMPTY_LIST;
        C3812r1 c3812r1 = C3812r1.f33455a;
        f34697r = new C2954b2("MergingMediaSource", new C(), null, new C4135x0(), C3062d3.f29665C);
    }

    public C4053vQ(C3084dP c3084dP, XP... xpArr) {
        this.f34698k = xpArr;
        this.f34701n = new ArrayList(Arrays.asList(xpArr));
        this.f34699l = new ArrayList(xpArr.length);
        int i = 0;
        while (true) {
            int length = xpArr.length;
            if (i >= length) {
                this.f34700m = new AbstractC3604n8[length];
                this.f34703p = new long[0][];
                new HashMap();
                AbstractC2772Sd.i(new GB(0).isEmpty());
                return;
            }
            this.f34699l.add(new ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void a(C2954b2 c2954b2) {
        this.f34698k[0].a(c2954b2);
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void b(InterfaceC3622nQ interfaceC3622nQ) {
        C3945tQ c3945tQ = (C3945tQ) interfaceC3622nQ;
        int i = 0;
        while (true) {
            XP[] xpArr = this.f34698k;
            if (i >= xpArr.length) {
                return;
            }
            List list = (List) this.f34699l.get(i);
            boolean z3 = c3945tQ.f34295u[i];
            InterfaceC3622nQ[] interfaceC3622nQArr = c3945tQ.f34294n;
            InterfaceC3622nQ interfaceC3622nQ2 = z3 ? ((NQ) interfaceC3622nQArr[i]).f26490n : interfaceC3622nQArr[i];
            int i6 = 0;
            while (true) {
                if (i6 >= list.size()) {
                    break;
                }
                if (((C3999uQ) list.get(i6)).f34544b.equals(interfaceC3622nQ2)) {
                    list.remove(i6);
                    break;
                }
                i6++;
            }
            xpArr[i].b(c3945tQ.f34295u[i] ? ((NQ) interfaceC3622nQArr[i]).f26490n : interfaceC3622nQArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final InterfaceC3622nQ c(C3676oQ c3676oQ, InterfaceC4026v interfaceC4026v, long j6) {
        XP[] xpArr = this.f34698k;
        int length = xpArr.length;
        InterfaceC3622nQ[] interfaceC3622nQArr = new InterfaceC3622nQ[length];
        AbstractC3604n8[] abstractC3604n8Arr = this.f34700m;
        int e9 = abstractC3604n8Arr[0].e(c3676oQ.f32905a);
        for (int i = 0; i < length; i++) {
            C3676oQ a9 = c3676oQ.a(abstractC3604n8Arr[i].f(e9));
            interfaceC3622nQArr[i] = xpArr[i].c(a9, interfaceC4026v, j6 - this.f34703p[e9][i]);
            ((List) this.f34699l.get(i)).add(new C3999uQ(a9, interfaceC3622nQArr[i]));
        }
        return new C3945tQ(this.f34703p[e9], interfaceC3622nQArr);
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final C2954b2 f() {
        XP[] xpArr = this.f34698k;
        return xpArr.length > 0 ? xpArr[0].f() : f34697r;
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void h(B b9) {
        this.f29294j = AbstractC3159eu.p();
        int i = 0;
        while (true) {
            XP[] xpArr = this.f34698k;
            if (i >= xpArr.length) {
                return;
            }
            t(Integer.valueOf(i), xpArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2978bQ, com.google.android.gms.internal.ads.XP
    public final void j() {
        super.j();
        Arrays.fill(this.f34700m, (Object) null);
        this.f34702o = -1;
        this.f34704q = null;
        ArrayList arrayList = this.f34701n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f34698k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2978bQ, com.google.android.gms.internal.ads.XP
    public final void r() {
        B1.z zVar = this.f34704q;
        if (zVar != null) {
            throw zVar;
        }
        super.r();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2978bQ
    public final void s(Integer num, XP xp, AbstractC3604n8 abstractC3604n8) {
        int i;
        if (this.f34704q != null) {
            return;
        }
        if (this.f34702o == -1) {
            i = abstractC3604n8.c();
            this.f34702o = i;
        } else {
            int c9 = abstractC3604n8.c();
            int i6 = this.f34702o;
            if (c9 != i6) {
                this.f34704q = new B1.z();
                return;
            }
            i = i6;
        }
        int length = this.f34703p.length;
        AbstractC3604n8[] abstractC3604n8Arr = this.f34700m;
        if (length == 0) {
            this.f34703p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, abstractC3604n8Arr.length);
        }
        ArrayList arrayList = this.f34701n;
        arrayList.remove(xp);
        abstractC3604n8Arr[num.intValue()] = abstractC3604n8;
        if (arrayList.isEmpty()) {
            k(abstractC3604n8Arr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2978bQ
    public final /* synthetic */ C3676oQ v(Integer num, C3676oQ c3676oQ) {
        int intValue = num.intValue();
        ArrayList arrayList = this.f34699l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((C3999uQ) list.get(i)).f34543a.equals(c3676oQ)) {
                return ((C3999uQ) ((List) arrayList.get(0)).get(i)).f34543a;
            }
        }
        return null;
    }
}
