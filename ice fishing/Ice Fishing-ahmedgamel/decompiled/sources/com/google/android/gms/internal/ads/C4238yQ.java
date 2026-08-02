package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.yQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4238yQ extends AbstractC3161eQ {

    /* renamed from: r, reason: collision with root package name */
    public static final C2977b2 f35944r;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC2947aQ[] f35945k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f35946l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC3627n8[] f35947m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f35948n;

    /* renamed from: o, reason: collision with root package name */
    public int f35949o = -1;

    /* renamed from: p, reason: collision with root package name */
    public long[][] f35950p;

    /* renamed from: q, reason: collision with root package name */
    public D1.y f35951q;

    static {
        PB pb = RB.f27933u;
        C3523lC c3523lC = C3523lC.f32525x;
        List list = Collections.EMPTY_LIST;
        C3835r1 c3835r1 = C3835r1.f34222a;
        f35944r = new C2977b2("MergingMediaSource", new C(), null, new C4158x0(), C3085d3.f30437C);
    }

    public C4238yQ(C3107dP c3107dP, AbstractC2947aQ... abstractC2947aQArr) {
        this.f35945k = abstractC2947aQArr;
        this.f35948n = new ArrayList(Arrays.asList(abstractC2947aQArr));
        this.f35946l = new ArrayList(abstractC2947aQArr.length);
        int i = 0;
        while (true) {
            int length = abstractC2947aQArr.length;
            if (i >= length) {
                this.f35947m = new AbstractC3627n8[length];
                this.f35950p = new long[0][];
                new HashMap();
                AbstractC2792Sd.i(new GB(0).isEmpty());
                return;
            }
            this.f35946l.add(new ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void a(C2977b2 c2977b2) {
        this.f35945k[0].a(c2977b2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void b(InterfaceC3807qQ interfaceC3807qQ) {
        C4130wQ c4130wQ = (C4130wQ) interfaceC3807qQ;
        int i = 0;
        while (true) {
            AbstractC2947aQ[] abstractC2947aQArr = this.f35945k;
            if (i >= abstractC2947aQArr.length) {
                return;
            }
            List list = (List) this.f35946l.get(i);
            boolean z6 = c4130wQ.f35609u[i];
            InterfaceC3807qQ[] interfaceC3807qQArr = c4130wQ.f35608n;
            InterfaceC3807qQ interfaceC3807qQ2 = z6 ? ((QQ) interfaceC3807qQArr[i]).f27814n : interfaceC3807qQArr[i];
            int i4 = 0;
            while (true) {
                if (i4 >= list.size()) {
                    break;
                }
                if (((C4184xQ) list.get(i4)).f35801b.equals(interfaceC3807qQ2)) {
                    list.remove(i4);
                    break;
                }
                i4++;
            }
            abstractC2947aQArr[i].b(c4130wQ.f35609u[i] ? ((QQ) interfaceC3807qQArr[i]).f27814n : interfaceC3807qQArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final InterfaceC3807qQ c(C3860rQ c3860rQ, InterfaceC4049v interfaceC4049v, long j6) {
        AbstractC2947aQ[] abstractC2947aQArr = this.f35945k;
        int length = abstractC2947aQArr.length;
        InterfaceC3807qQ[] interfaceC3807qQArr = new InterfaceC3807qQ[length];
        AbstractC3627n8[] abstractC3627n8Arr = this.f35947m;
        int e9 = abstractC3627n8Arr[0].e(c3860rQ.f34406a);
        for (int i = 0; i < length; i++) {
            C3860rQ a9 = c3860rQ.a(abstractC3627n8Arr[i].f(e9));
            interfaceC3807qQArr[i] = abstractC2947aQArr[i].c(a9, interfaceC4049v, j6 - this.f35950p[e9][i]);
            ((List) this.f35946l.get(i)).add(new C4184xQ(a9, interfaceC3807qQArr[i]));
        }
        return new C4130wQ(this.f35950p[e9], interfaceC3807qQArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final C2977b2 f() {
        AbstractC2947aQ[] abstractC2947aQArr = this.f35945k;
        return abstractC2947aQArr.length > 0 ? abstractC2947aQArr[0].f() : f35944r;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void h(B b9) {
        this.f30724j = AbstractC3182eu.p();
        int i = 0;
        while (true) {
            AbstractC2947aQ[] abstractC2947aQArr = this.f35945k;
            if (i >= abstractC2947aQArr.length) {
                return;
            }
            t(Integer.valueOf(i), abstractC2947aQArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3161eQ, com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void j() {
        super.j();
        Arrays.fill(this.f35947m, (Object) null);
        this.f35949o = -1;
        this.f35951q = null;
        ArrayList arrayList = this.f35948n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f35945k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3161eQ, com.google.android.gms.internal.ads.AbstractC2947aQ
    public final void r() {
        D1.y yVar = this.f35951q;
        if (yVar != null) {
            throw yVar;
        }
        super.r();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3161eQ
    public final void s(Integer num, AbstractC2947aQ abstractC2947aQ, AbstractC3627n8 abstractC3627n8) {
        int i;
        if (this.f35951q != null) {
            return;
        }
        if (this.f35949o == -1) {
            i = abstractC3627n8.c();
            this.f35949o = i;
        } else {
            int c9 = abstractC3627n8.c();
            int i4 = this.f35949o;
            if (c9 != i4) {
                this.f35951q = new D1.y();
                return;
            }
            i = i4;
        }
        int length = this.f35950p.length;
        AbstractC3627n8[] abstractC3627n8Arr = this.f35947m;
        if (length == 0) {
            this.f35950p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, abstractC3627n8Arr.length);
        }
        ArrayList arrayList = this.f35948n;
        arrayList.remove(abstractC2947aQ);
        abstractC3627n8Arr[num.intValue()] = abstractC3627n8;
        if (arrayList.isEmpty()) {
            k(abstractC3627n8Arr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3161eQ
    public final /* synthetic */ C3860rQ v(Integer num, C3860rQ c3860rQ) {
        int intValue = num.intValue();
        ArrayList arrayList = this.f35946l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((C4184xQ) list.get(i)).f35800a.equals(c3860rQ)) {
                return ((C4184xQ) ((List) arrayList.get(0)).get(i)).f35800a;
            }
        }
        return null;
    }
}
