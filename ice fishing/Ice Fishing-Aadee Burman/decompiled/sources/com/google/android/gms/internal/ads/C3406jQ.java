package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3406jQ extends AbstractC3604n8 {

    /* renamed from: b, reason: collision with root package name */
    public final C2954b2 f31261b;

    public C3406jQ(C2954b2 c2954b2) {
        this.f31261b = c2954b2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final U7 b(int i, U7 u72, long j6) {
        Object obj = U7.f27891m;
        u72.a(this.f31261b, false, true, null, com.anythink.basead.exoplayer.b.f6382b);
        u72.i = true;
        return u72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final K7 d(int i, K7 k72, boolean z3) {
        Integer num = z3 ? 0 : null;
        Object obj = z3 ? C3354iQ.f31043e : null;
        C3842re c3842re = C3842re.f33641b;
        k72.a(num, obj, 0, com.anythink.basead.exoplayer.b.f6382b, true);
        return k72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final int e(Object obj) {
        return obj == C3354iQ.f31043e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final Object f(int i) {
        return C3354iQ.f31043e;
    }
}
