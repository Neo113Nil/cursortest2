package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4120wQ extends AbstractC3832r8 {

    /* renamed from: b, reason: collision with root package name */
    public final C3235g2 f34997b;

    public C4120wQ(C3235g2 c3235g2) {
        this.f34997b = c3235g2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final Y7 b(int i, Y7 y72, long j9) {
        Object obj = Y7.f28792m;
        y72.a(this.f34997b, false, true, null, com.anythink.basead.exoplayer.b.f6539b);
        y72.i = true;
        return y72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final L7 d(int i, L7 l72, boolean z8) {
        Integer num = z8 ? 0 : null;
        Object obj = z8 ? C4066vQ.f34798e : null;
        C4071ve c4071ve = C4071ve.f34816b;
        l72.a(num, obj, 0, com.anythink.basead.exoplayer.b.f6539b, true);
        return l72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final int e(Object obj) {
        return obj == C4066vQ.f34798e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final Object f(int i) {
        return C4066vQ.f34798e;
    }
}
