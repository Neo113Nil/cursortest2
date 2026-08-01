package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class Nz implements UA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pz f26573b;

    public /* synthetic */ Nz(Pz pz, int i) {
        this.f26572a = i;
        this.f26573b = pz;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final Object apply(Object obj) {
        byte[] bArr = (byte[]) obj;
        switch (this.f26572a) {
            case 0:
                Pz pz = this.f26573b;
                pz.getClass();
                pz.i(new L3.h(2), bArr, false);
                break;
            default:
                Pz pz2 = this.f26573b;
                pz2.getClass();
                pz2.i(new L3.h(2), bArr, true);
                break;
        }
        return null;
    }
}
