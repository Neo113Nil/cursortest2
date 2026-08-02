package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3402j extends AbstractC3510l implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f31930A;

    /* renamed from: B, reason: collision with root package name */
    public final int f31931B;

    /* renamed from: C, reason: collision with root package name */
    public final int f31932C;

    /* renamed from: D, reason: collision with root package name */
    public final int f31933D;

    /* renamed from: E, reason: collision with root package name */
    public final int f31934E;

    /* renamed from: F, reason: collision with root package name */
    public final int f31935F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f31936G;

    /* renamed from: x, reason: collision with root package name */
    public final int f31937x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f31938y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f31939z;

    public C3402j(int i, A8 a82, int i4, C3350i c3350i, int i6, String str, String str2) {
        super(i, a82, i4);
        int i9;
        int i10 = 0;
        this.f31938y = SP.K(i6, false);
        int i11 = this.f32455w.f25167e;
        c3350i.getClass();
        this.f31939z = 1 == (i11 & 1);
        this.f31930A = (i11 & 2) != 0;
        C3523lC c3523lC = c3350i.f26455r;
        C3523lC j6 = str2 != null ? RB.j(str2) : c3523lC.isEmpty() ? RB.j("") : c3523lC;
        int i12 = 0;
        while (true) {
            if (i12 >= j6.f32527w) {
                i9 = 0;
                i12 = Integer.MAX_VALUE;
                break;
            } else {
                i9 = C3672o.f(this.f32455w, (String) j6.get(i12), false);
                if (i9 > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.f31931B = i12;
        this.f31932C = i9;
        int i13 = str2 != null ? 1088 : 0;
        int i14 = this.f32455w.f25168f;
        int bitCount = (i14 == 0 || i14 != i13) ? Integer.bitCount(i13 & i14) : Integer.MAX_VALUE;
        this.f31933D = bitCount;
        DP dp = this.f32455w;
        this.f31936G = (1088 & dp.f25168f) != 0;
        int g9 = C3672o.g(dp, c3350i.f26456s);
        this.f31934E = g9;
        int f2 = C3672o.f(this.f32455w, str, C3672o.e(str) == null);
        this.f31935F = f2;
        boolean z6 = i9 > 0 || (c3523lC.isEmpty() && bitCount > 0) || ((c3523lC.isEmpty() && g9 != Integer.MAX_VALUE) || this.f31939z || (this.f31930A && f2 > 0));
        if (SP.K(i6, c3350i.f31752B) && z6) {
            i10 = 1;
        }
        this.f31937x = i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3510l
    public final int a() {
        return this.f31937x;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3510l
    public final /* bridge */ /* synthetic */ boolean b(AbstractC3510l abstractC3510l) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3402j c3402j) {
        KB d9 = KB.f26626a.d(this.f31938y, c3402j.f31938y);
        Integer valueOf = Integer.valueOf(this.f31931B);
        Integer valueOf2 = Integer.valueOf(c3402j.f31931B);
        C3415jC c3415jC = C3415jC.f32001v;
        KB a9 = d9.a(valueOf, valueOf2, c3415jC);
        int i = this.f31932C;
        KB b9 = a9.b(i, c3402j.f31932C);
        int i4 = this.f31933D;
        KB d10 = b9.b(i4, c3402j.f31933D).a(Integer.valueOf(this.f31934E), Integer.valueOf(c3402j.f31934E), c3415jC).d(this.f31939z, c3402j.f31939z);
        Boolean valueOf3 = Boolean.valueOf(this.f31930A);
        Boolean valueOf4 = Boolean.valueOf(c3402j.f31930A);
        if (i == 0) {
            c3415jC = C3415jC.f32000u;
        }
        KB b10 = d10.a(valueOf3, valueOf4, c3415jC).b(this.f31935F, c3402j.f31935F);
        if (i4 == 0) {
            b10 = b10.c(this.f31936G, c3402j.f31936G);
        }
        return b10.e();
    }
}
