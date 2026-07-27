package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4217yF extends D2.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f35334w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4217yF(byte[] bArr, int i) {
        super(bArr);
        this.f35334w = i;
    }

    @Override // D2.a
    public final c8.c n(int i, byte[] bArr) {
        switch (this.f35334w) {
            case 0:
                return new C4163xF(bArr, i, 0);
            default:
                return new C4163xF(bArr, i, 1);
        }
    }
}
