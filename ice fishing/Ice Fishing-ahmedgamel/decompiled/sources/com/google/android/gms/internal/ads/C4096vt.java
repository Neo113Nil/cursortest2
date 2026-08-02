package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4096vt implements UA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3504ku f35524b;

    public /* synthetic */ C4096vt(C3504ku c3504ku, int i) {
        this.f35523a = i;
        this.f35524b = c3504ku;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final /* synthetic */ Object apply(Object obj) {
        C3504ku c3504ku = this.f35524b;
        switch (this.f35523a) {
            case 0:
                int i = w2.z.f41712b;
                x2.i.d("", (C4254yp) obj);
                w2.z.k("Failed to get a cache key, reverting to legacy flow.");
                C4150wt c4150wt = new C4150wt(null, c3504ku.y());
                c3504ku.f32447w = c4150wt;
                return c4150wt;
            default:
                C2759Qe c2759Qe = (C2759Qe) obj;
                C4150wt c4150wt2 = new C4150wt(c2759Qe, new C4205xu(c2759Qe.f27822C));
                c3504ku.f32447w = c4150wt2;
                return c4150wt2;
        }
    }
}
