package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.qO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3782qO extends AbstractC3192fQ {

    /* renamed from: c, reason: collision with root package name */
    public final U7 f33236c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3782qO(C3835rO c3835rO, AbstractC3604n8 abstractC3604n8) {
        super(abstractC3604n8);
        Objects.requireNonNull(c3835rO);
        this.f33236c = new U7();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3192fQ, com.google.android.gms.internal.ads.AbstractC3604n8
    public final K7 d(int i, K7 k72, boolean z3) {
        AbstractC3604n8 abstractC3604n8 = this.f30250b;
        K7 d2 = abstractC3604n8.d(i, k72, z3);
        if (!abstractC3604n8.b(d2.f25867c, this.f33236c, 0L).b()) {
            d2.f25869e = true;
            return d2;
        }
        Integer num = k72.f25865a;
        Object obj = k72.f25866b;
        int i6 = k72.f25867c;
        long j6 = k72.f25868d;
        C3842re c3842re = C3842re.f33641b;
        d2.a(num, obj, i6, j6, true);
        return d2;
    }
}
