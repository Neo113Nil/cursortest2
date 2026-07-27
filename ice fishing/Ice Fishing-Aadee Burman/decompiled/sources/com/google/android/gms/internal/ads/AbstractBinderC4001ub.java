package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ub, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4001ub extends AbstractBinderC3336i8 implements InterfaceC4055vb {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f34546n = 0;

    public AbstractBinderC4001ub() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3732pb c3678ob;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                W2.a w02 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                S2(w02, readString);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                AbstractC3388j8.f(parcel);
                W2.a z3 = z(readString2);
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, z3);
                return true;
            case 3:
                W2.a w03 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                R0(w03);
                parcel2.writeNoException();
                return true;
            case 4:
                o();
                parcel2.writeNoException();
                return true;
            case 5:
                W2.b.w0(parcel.readStrongBinder());
                parcel.readInt();
                AbstractC3388j8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                W2.a w04 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                A3(w04);
                parcel2.writeNoException();
                return true;
            case 7:
                W2.a w05 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                S0(w05);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c3678ob = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    c3678ob = queryLocalInterface instanceof InterfaceC3732pb ? (InterfaceC3732pb) queryLocalInterface : new C3678ob(readStrongBinder);
                }
                AbstractC3388j8.f(parcel);
                K2(c3678ob);
                parcel2.writeNoException();
                return true;
            case 9:
                W2.a w06 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                n0(w06);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
