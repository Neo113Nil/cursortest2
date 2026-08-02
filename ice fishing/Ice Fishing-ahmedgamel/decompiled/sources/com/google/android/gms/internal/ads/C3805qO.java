package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.qO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3805qO extends AbstractC3377iQ {

    /* renamed from: c, reason: collision with root package name */
    public final U7 f34020c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3805qO(C3858rO c3858rO, AbstractC3627n8 abstractC3627n8) {
        super(abstractC3627n8);
        Objects.requireNonNull(c3858rO);
        this.f34020c = new U7();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3377iQ, com.google.android.gms.internal.ads.AbstractC3627n8
    public final K7 d(int i, K7 k72, boolean z6) {
        AbstractC3627n8 abstractC3627n8 = this.f31816b;
        K7 d9 = abstractC3627n8.d(i, k72, z6);
        if (!abstractC3627n8.b(d9.f26619c, this.f34020c, 0L).b()) {
            d9.f26621e = true;
            return d9;
        }
        Integer num = k72.f26617a;
        Object obj = k72.f26618b;
        int i4 = k72.f26619c;
        long j6 = k72.f26620d;
        C3865re c3865re = C3865re.f34414b;
        d9.a(num, obj, i4, j6, true);
        return d9;
    }
}
