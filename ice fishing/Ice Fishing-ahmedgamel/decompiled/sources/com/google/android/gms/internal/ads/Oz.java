package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class Oz implements UA {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Oz f27480b = new Oz(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Oz f27481c = new Oz(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Oz f27482d = new Oz(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Oz f27483e = new Oz(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Oz f27484f = new Oz(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Oz f27485g = new Oz(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27486a;

    public /* synthetic */ Oz(int i) {
        this.f27486a = i;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final Object apply(Object obj) {
        switch (this.f27486a) {
            case 0:
                return null;
            case 1:
                return Uz.a(5);
            case 2:
                C3323hQ c3323hQ = (C3323hQ) obj;
                int i = DP.f25146R;
                String str = c3323hQ.f31571a;
                int length = String.valueOf(str).length();
                String str2 = c3323hQ.f31572b;
                return D.x.p(new StringBuilder(length + 2 + String.valueOf(str2).length()), str, ": ", str2);
            case 3:
                Q0 q02 = (Q0) obj;
                q02.getClass();
                return q02.getClass().getSimpleName();
            case 4:
                return RB.n(AbstractC2991bG.w(((InterfaceC3807qQ) obj).p().f28275b, f27485g));
            default:
                SQ sq = SQ.f28273d;
                return Integer.valueOf(((A8) obj).f24417c);
        }
    }
}
