package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4073vt implements UA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3481ku f34755b;

    public /* synthetic */ C4073vt(C3481ku c3481ku, int i) {
        this.f34754a = i;
        this.f34755b = c3481ku;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final /* synthetic */ Object apply(Object obj) {
        C3481ku c3481ku = this.f34755b;
        switch (this.f34754a) {
            case 0:
                int i = u2.z.f41319b;
                v2.i.d("", (C4231yp) obj);
                u2.z.k("Failed to get a cache key, reverting to legacy flow.");
                C4127wt c4127wt = new C4127wt(null, c3481ku.A());
                c3481ku.f31665w = c4127wt;
                return c4127wt;
            default:
                C2739Qe c2739Qe = (C2739Qe) obj;
                C4127wt c4127wt2 = new C4127wt(c2739Qe, new C4182xu(c2739Qe.f27037C));
                c3481ku.f31665w = c4127wt2;
                return c4127wt2;
        }
    }
}
