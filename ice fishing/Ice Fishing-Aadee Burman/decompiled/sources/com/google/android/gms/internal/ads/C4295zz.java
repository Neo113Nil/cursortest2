package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4295zz implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Cz f35483b;

    public /* synthetic */ C4295zz(Cz cz, int i) {
        this.f35482a = i;
        this.f35483b = cz;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final /* synthetic */ N3.a a(Object obj) {
        switch (this.f35482a) {
            case 0:
                Cz cz = this.f35483b;
                cz.getClass();
                if (((Boolean) obj).booleanValue()) {
                    return cz.b(0);
                }
                cz.f24283d.b(1003);
                return QC.c(Bz.f23996u);
            default:
                Iy iy = (Iy) obj;
                Cz cz2 = this.f35483b;
                cz2.getClass();
                int H8 = iy.H();
                Yz yz = cz2.f24282c;
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
