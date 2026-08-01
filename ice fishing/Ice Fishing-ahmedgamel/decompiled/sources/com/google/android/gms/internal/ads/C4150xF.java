package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4150xF extends E2.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f34967w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4150xF(byte[] bArr, int i) {
        super(bArr);
        this.f34967w = i;
    }

    @Override // E2.a
    public final AbstractC4096wF n(int i, byte[] bArr) {
        switch (this.f34967w) {
            case 0:
                return new C4042vF(bArr, i, 0);
            default:
                return new C4042vF(bArr, i, 1);
        }
    }
}
