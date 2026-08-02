package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4318zz implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Cz f36252b;

    public /* synthetic */ C4318zz(Cz cz, int i) {
        this.f36251a = i;
        this.f36252b = cz;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final /* synthetic */ P3.a a(Object obj) {
        switch (this.f36251a) {
            case 0:
                Cz cz = this.f36252b;
                cz.getClass();
                if (((Boolean) obj).booleanValue()) {
                    return cz.b(0);
                }
                cz.f25028d.b(1003);
                return QC.c(Bz.f24759u);
            default:
                Iy iy = (Iy) obj;
                Cz cz2 = this.f36252b;
                cz2.getClass();
                int H8 = iy.H();
                Yz yz = cz2.f25027c;
                if (H8 == 2) {
                    return yz.a(iy.A(), iy.B().a());
                }
                if (iy.H() == 3) {
                    return yz.b(iy.A(), iy.C().a(), iy.B().a());
                }
                throw new AssertionError("Unreachable");
        }
    }
}
