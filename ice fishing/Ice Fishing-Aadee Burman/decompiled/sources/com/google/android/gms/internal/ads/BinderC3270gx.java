package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.gx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3270gx extends AbstractBinderC3336i8 implements InterfaceC3216fx {
    public BinderC3270gx() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3216fx
    public final void D(int i) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                W2.b.w0(parcel.readStrongBinder());
                parcel.readString();
                AbstractC3388j8.f(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                AbstractC3388j8.f(parcel);
                break;
            case 5:
                parcel.createByteArray();
                AbstractC3388j8.f(parcel);
                break;
            case 6:
                parcel.readInt();
                AbstractC3388j8.f(parcel);
                break;
            case 7:
                parcel.readInt();
                AbstractC3388j8.f(parcel);
                break;
            case 8:
                W2.b.w0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                AbstractC3388j8.f(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3216fx
    public final void a0(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3216fx
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3216fx
    public final void d2(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3216fx
    public final void p0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3216fx
    public final void a2(W2.b bVar, String str) {
    }
}
