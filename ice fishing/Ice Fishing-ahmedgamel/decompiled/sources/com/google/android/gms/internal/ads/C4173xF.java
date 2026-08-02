package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4173xF extends B1.b {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f35748w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4173xF(byte[] bArr, int i) {
        super(bArr);
        this.f35748w = i;
    }

    @Override // B1.b
    public final AbstractC4119wF n(int i, byte[] bArr) {
        switch (this.f35748w) {
            case 0:
                return new C4065vF(bArr, i, 0);
            default:
                return new C4065vF(bArr, i, 1);
        }
    }
}
