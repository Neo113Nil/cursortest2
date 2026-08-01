package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class WO implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28352n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ S0.l f28353u;

    public /* synthetic */ WO(S0.l lVar, int i, long j6, long j9) {
        this.f28352n = 3;
        this.f28353u = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 22;
        byte b9 = 0;
        S0.l lVar = this.f28353u;
        int i6 = this.f28352n;
        lVar.getClass();
        switch (i6) {
            case 0:
                String str = AbstractC3159eu.f29993a;
                BO bo = ((HN) lVar.f2798v).f25264n.f26780K;
                bo.s(bo.x(), 1008, new C4267zO(i));
                break;
            case 1:
                String str2 = AbstractC3159eu.f29993a;
                BO bo2 = ((HN) lVar.f2798v).f25264n.f26780K;
                bo2.s(bo2.x(), 1032, new XJ(b9, 23));
                break;
            case 2:
                String str3 = AbstractC3159eu.f29993a;
                BO bo3 = ((HN) lVar.f2798v).f25264n.f26780K;
                bo3.s(bo3.x(), 1010, new C4267zO(24));
                break;
            case 3:
                String str4 = AbstractC3159eu.f29993a;
                BO bo4 = ((HN) lVar.f2798v).f25264n.f26780K;
                bo4.s(bo4.x(), 1011, new C4267zO(25));
                break;
            case 4:
                String str5 = AbstractC3159eu.f29993a;
                BO bo5 = ((HN) lVar.f2798v).f25264n.f26780K;
                bo5.s(bo5.x(), 1012, new C4267zO(26));
                break;
            case 5:
                String str6 = AbstractC3159eu.f29993a;
                BO bo6 = ((HN) lVar.f2798v).f25264n.f26780K;
                bo6.s(bo6.x(), 1014, new XJ(b9, 20));
                break;
            case 6:
                String str7 = AbstractC3159eu.f29993a;
                BO bo7 = ((HN) lVar.f2798v).f25264n.f26780K;
                bo7.s(bo7.x(), 1029, new XJ(b9, 21));
                break;
            case 7:
                String str8 = AbstractC3159eu.f29993a;
                BO bo8 = ((HN) lVar.f2798v).f25264n.f26780K;
                bo8.s(bo8.x(), 1031, new XJ(b9, i));
                break;
            default:
                String str9 = AbstractC3159eu.f29993a;
                BO bo9 = ((HN) lVar.f2798v).f25264n.f26780K;
                bo9.s(bo9.x(), 1007, new C4267zO(15));
                break;
        }
    }

    public /* synthetic */ WO(S0.l lVar, long j6) {
        this.f28352n = 2;
        this.f28353u = lVar;
    }

    public /* synthetic */ WO(S0.l lVar, Object obj, int i) {
        this.f28352n = i;
        this.f28353u = lVar;
    }

    public /* synthetic */ WO(S0.l lVar, String str, long j6, long j9) {
        this.f28352n = 0;
        this.f28353u = lVar;
    }
}
