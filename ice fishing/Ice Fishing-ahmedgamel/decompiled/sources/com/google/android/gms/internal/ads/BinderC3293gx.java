package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.gx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3293gx extends AbstractBinderC3359i8 implements InterfaceC3239fx {
    public BinderC3293gx() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3239fx
    public final void D(int i) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Y2.b.t0(parcel.readStrongBinder());
                parcel.readString();
                AbstractC3411j8.f(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                AbstractC3411j8.f(parcel);
                break;
            case 5:
                parcel.createByteArray();
                AbstractC3411j8.f(parcel);
                break;
            case 6:
                parcel.readInt();
                AbstractC3411j8.f(parcel);
                break;
            case 7:
                parcel.readInt();
                AbstractC3411j8.f(parcel);
                break;
            case 8:
                Y2.b.t0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                AbstractC3411j8.f(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3239fx
    public final void a0(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3239fx
    public final void b2(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3239fx
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3239fx
    public final void p0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3239fx
    public final void T1(Y2.b bVar, String str) {
    }
}
