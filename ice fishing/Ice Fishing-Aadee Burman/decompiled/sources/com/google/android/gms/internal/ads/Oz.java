package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class Oz implements UA {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Oz f26697b = new Oz(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Oz f26698c = new Oz(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Oz f26699d = new Oz(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Oz f26700e = new Oz(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Oz f26701f = new Oz(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Oz f26702g = new Oz(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26703a;

    public /* synthetic */ Oz(int i) {
        this.f26703a = i;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final Object apply(Object obj) {
        switch (this.f26703a) {
            case 0:
                return null;
            case 1:
                return Uz.a(5);
            case 2:
                C3138eQ c3138eQ = (C3138eQ) obj;
                int i = DP.f24401R;
                String str = c3138eQ.f29932a;
                int length = String.valueOf(str).length();
                String str2 = c3138eQ.f29933b;
                return D.y.s(new StringBuilder(length + 2 + String.valueOf(str2).length()), str, ": ", str2);
            case 3:
                Q0 q02 = (Q0) obj;
                q02.getClass();
                return q02.getClass().getSimpleName();
            case 4:
                return RB.n(AbstractC2968bG.w(((InterfaceC3622nQ) obj).p().f26820b, f26702g));
            default:
                PQ pq = PQ.f26818d;
                return Integer.valueOf(((A8) obj).f23637c);
        }
    }
}
