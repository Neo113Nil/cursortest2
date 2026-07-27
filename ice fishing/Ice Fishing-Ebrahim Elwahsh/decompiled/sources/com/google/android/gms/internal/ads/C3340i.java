package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3340i extends AbstractC3446k implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f31284A;

    /* renamed from: B, reason: collision with root package name */
    public final int f31285B;

    /* renamed from: C, reason: collision with root package name */
    public final int f31286C;

    /* renamed from: D, reason: collision with root package name */
    public final int f31287D;

    /* renamed from: E, reason: collision with root package name */
    public final int f31288E;

    /* renamed from: F, reason: collision with root package name */
    public final int f31289F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f31290G;

    /* renamed from: x, reason: collision with root package name */
    public final int f31291x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f31292y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f31293z;

    public C3340i(int i, B8 b82, int i4, C3286h c3286h, int i9, String str, String str2) {
        super(i, b82, i4);
        int i10;
        int i11 = 0;
        this.f31292y = AbstractC3149eQ.J(i9, false);
        int i12 = this.f32229w.f27767e;
        c3286h.getClass();
        this.f31293z = 1 == (i12 & 1);
        this.f31284A = (i12 & 2) != 0;
        C3675oC c3675oC = c3286h.f26563r;
        C3675oC j9 = str2 != null ? UB.j(str2) : c3675oC.isEmpty() ? UB.j("") : c3675oC;
        int i13 = 0;
        while (true) {
            if (i13 >= j9.f33117w) {
                i10 = 0;
                i13 = Integer.MAX_VALUE;
                break;
            } else {
                i10 = C3554m.f(this.f32229w, (String) j9.get(i13), false);
                if (i10 > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.f31285B = i13;
        this.f31286C = i10;
        int i14 = str2 != null ? 1088 : 0;
        int i15 = this.f32229w.f27768f;
        int bitCount = (i15 == 0 || i15 != i14) ? Integer.bitCount(i14 & i15) : Integer.MAX_VALUE;
        this.f31287D = bitCount;
        TP tp = this.f32229w;
        this.f31290G = (1088 & tp.f27768f) != 0;
        int g9 = C3554m.g(tp, c3286h.f26564s);
        this.f31288E = g9;
        int f6 = C3554m.f(this.f32229w, str, C3554m.e(str) == null);
        this.f31289F = f6;
        boolean z8 = i10 > 0 || (c3675oC.isEmpty() && bitCount > 0) || ((c3675oC.isEmpty() && g9 != Integer.MAX_VALUE) || this.f31293z || (this.f31284A && f6 > 0));
        if (AbstractC3149eQ.J(i9, c3286h.f31122B) && z8) {
            i11 = 1;
        }
        this.f31291x = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3446k
    public final int a() {
        return this.f31291x;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3446k
    public final /* bridge */ /* synthetic */ boolean b(AbstractC3446k abstractC3446k) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3340i c3340i) {
        NB d2 = NB.f26491a.d(this.f31292y, c3340i.f31292y);
        Integer valueOf = Integer.valueOf(this.f31285B);
        Integer valueOf2 = Integer.valueOf(c3340i.f31285B);
        C3567mC c3567mC = C3567mC.f32673v;
        NB a9 = d2.a(valueOf, valueOf2, c3567mC);
        int i = this.f31286C;
        NB b9 = a9.b(i, c3340i.f31286C);
        int i4 = this.f31287D;
        NB d3 = b9.b(i4, c3340i.f31287D).a(Integer.valueOf(this.f31288E), Integer.valueOf(c3340i.f31288E), c3567mC).d(this.f31293z, c3340i.f31293z);
        Boolean valueOf3 = Boolean.valueOf(this.f31284A);
        Boolean valueOf4 = Boolean.valueOf(c3340i.f31284A);
        if (i == 0) {
            c3567mC = C3567mC.f32672u;
        }
        NB b10 = d3.a(valueOf3, valueOf4, c3567mC).b(this.f31289F, c3340i.f31289F);
        if (i4 == 0) {
            b10 = b10.c(this.f31290G, c3340i.f31290G);
        }
        return b10.e();
    }
}
