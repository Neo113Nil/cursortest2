package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class Nz implements UA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pz f27355b;

    public /* synthetic */ Nz(Pz pz, int i) {
        this.f27354a = i;
        this.f27355b = pz;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final Object apply(Object obj) {
        byte[] bArr = (byte[]) obj;
        switch (this.f27354a) {
            case 0:
                Pz pz = this.f27355b;
                pz.getClass();
                pz.i(new M.h(2), bArr, false);
                break;
            default:
                Pz pz2 = this.f27355b;
                pz2.getClass();
                pz2.i(new M.h(2), bArr, true);
                break;
        }
        return null;
    }
}
