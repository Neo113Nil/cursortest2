package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3379j extends AbstractC3487l implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f31143A;

    /* renamed from: B, reason: collision with root package name */
    public final int f31144B;

    /* renamed from: C, reason: collision with root package name */
    public final int f31145C;

    /* renamed from: D, reason: collision with root package name */
    public final int f31146D;

    /* renamed from: E, reason: collision with root package name */
    public final int f31147E;

    /* renamed from: F, reason: collision with root package name */
    public final int f31148F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f31149G;

    /* renamed from: x, reason: collision with root package name */
    public final int f31150x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f31151y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f31152z;

    public C3379j(int i, A8 a82, int i6, C3327i c3327i, int i9, String str, String str2) {
        super(i, a82, i6);
        int i10;
        int i11 = 0;
        this.f31151y = RP.K(i9, false);
        int i12 = this.f31675w.f24422e;
        c3327i.getClass();
        this.f31152z = 1 == (i12 & 1);
        this.f31143A = (i12 & 2) != 0;
        C3500lC c3500lC = c3327i.f25701r;
        C3500lC j6 = str2 != null ? RB.j(str2) : c3500lC.isEmpty() ? RB.j("") : c3500lC;
        int i13 = 0;
        while (true) {
            if (i13 >= j6.f31747w) {
                i10 = 0;
                i13 = Integer.MAX_VALUE;
                break;
            } else {
                i10 = C3649o.f(this.f31675w, (String) j6.get(i13), false);
                if (i10 > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.f31144B = i13;
        this.f31145C = i10;
        int i14 = str2 != null ? 1088 : 0;
        int i15 = this.f31675w.f24423f;
        int bitCount = (i15 == 0 || i15 != i14) ? Integer.bitCount(i14 & i15) : Integer.MAX_VALUE;
        this.f31146D = bitCount;
        DP dp = this.f31675w;
        this.f31149G = (1088 & dp.f24423f) != 0;
        int g4 = C3649o.g(dp, c3327i.f25702s);
        this.f31147E = g4;
        int f3 = C3649o.f(this.f31675w, str, C3649o.e(str) == null);
        this.f31148F = f3;
        boolean z3 = i10 > 0 || (c3500lC.isEmpty() && bitCount > 0) || ((c3500lC.isEmpty() && g4 != Integer.MAX_VALUE) || this.f31152z || (this.f31143A && f3 > 0));
        if (RP.K(i9, c3327i.f30979B) && z3) {
            i11 = 1;
        }
        this.f31150x = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3487l
    public final int a() {
        return this.f31150x;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3487l
    public final /* bridge */ /* synthetic */ boolean b(AbstractC3487l abstractC3487l) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3379j c3379j) {
        KB d2 = KB.f25874a.d(this.f31151y, c3379j.f31151y);
        Integer valueOf = Integer.valueOf(this.f31144B);
        Integer valueOf2 = Integer.valueOf(c3379j.f31144B);
        C3392jC c3392jC = C3392jC.f31214v;
        KB a9 = d2.a(valueOf, valueOf2, c3392jC);
        int i = this.f31145C;
        KB b9 = a9.b(i, c3379j.f31145C);
        int i6 = this.f31146D;
        KB d9 = b9.b(i6, c3379j.f31146D).a(Integer.valueOf(this.f31147E), Integer.valueOf(c3379j.f31147E), c3392jC).d(this.f31152z, c3379j.f31152z);
        Boolean valueOf3 = Boolean.valueOf(this.f31143A);
        Boolean valueOf4 = Boolean.valueOf(c3379j.f31143A);
        if (i == 0) {
            c3392jC = C3392jC.f31213u;
        }
        KB b10 = d9.a(valueOf3, valueOf4, c3392jC).b(this.f31148F, c3379j.f31148F);
        if (i6 == 0) {
            b10 = b10.c(this.f31149G, c3379j.f31149G);
        }
        return b10.e();
    }
}
