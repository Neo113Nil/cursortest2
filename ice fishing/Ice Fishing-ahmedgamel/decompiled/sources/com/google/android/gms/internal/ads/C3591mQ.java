package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3591mQ extends AbstractC3627n8 {

    /* renamed from: b, reason: collision with root package name */
    public final C2977b2 f32748b;

    public C3591mQ(C2977b2 c2977b2) {
        this.f32748b = c2977b2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final U7 b(int i, U7 u72, long j6) {
        Object obj = U7.f28688m;
        u72.a(this.f32748b, false, true, null, com.anythink.basead.exoplayer.b.f7168b);
        u72.i = true;
        return u72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final K7 d(int i, K7 k72, boolean z6) {
        Integer num = z6 ? 0 : null;
        Object obj = z6 ? C3537lQ.f32544e : null;
        C3865re c3865re = C3865re.f34414b;
        k72.a(num, obj, 0, com.anythink.basead.exoplayer.b.f7168b, true);
        return k72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final int e(Object obj) {
        return obj == C3537lQ.f32544e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final Object f(int i) {
        return C3537lQ.f32544e;
    }
}
