package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3811r0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33453n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ S0.e f33454u;

    public /* synthetic */ RunnableC3811r0(int i, long j6, S0.e eVar) {
        this.f33453n = 1;
        this.f33454u = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S0.e eVar = this.f33454u;
        int i = this.f33453n;
        eVar.getClass();
        switch (i) {
            case 0:
                String str = AbstractC3159eu.f29993a;
                BO bo = ((HN) eVar.f2782v).f25264n.f26780K;
                bo.s(bo.x(), 1016, new XJ((byte) 0, 26));
                break;
            case 1:
                String str2 = AbstractC3159eu.f29993a;
                BO bo2 = ((HN) eVar.f2782v).f25264n.f26780K;
                bo2.s(bo2.v((C3676oQ) bo2.f23898d.f27699x), 1021, new XJ((byte) 0, 29));
                break;
            case 2:
                String str3 = AbstractC3159eu.f29993a;
                BO bo3 = ((HN) eVar.f2782v).f25264n.f26780K;
                bo3.s(bo3.x(), 1019, new XJ((byte) 0, 27));
                break;
            case 3:
                String str4 = AbstractC3159eu.f29993a;
                BO bo4 = ((HN) eVar.f2782v).f25264n.f26780K;
                bo4.s(bo4.x(), 1030, new C4267zO(0));
                break;
            default:
                String str5 = AbstractC3159eu.f29993a;
                BO bo5 = ((HN) eVar.f2782v).f25264n.f26780K;
                bo5.s(bo5.x(), 1015, new XJ((byte) 0, 25));
                break;
        }
    }

    public /* synthetic */ RunnableC3811r0(S0.e eVar, Object obj, int i) {
        this.f33453n = i;
        this.f33454u = eVar;
    }

    public /* synthetic */ RunnableC3811r0(S0.e eVar, String str, long j6, long j9) {
        this.f33453n = 0;
        this.f33454u = eVar;
    }
}
