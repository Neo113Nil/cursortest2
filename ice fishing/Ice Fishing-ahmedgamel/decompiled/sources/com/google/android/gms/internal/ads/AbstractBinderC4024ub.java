package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ub, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4024ub extends AbstractBinderC3359i8 implements InterfaceC4078vb {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f35318n = 0;

    public AbstractBinderC4024ub() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3755pb c3701ob;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                t3(t02, readString);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                AbstractC3411j8.f(parcel);
                Y2.a z6 = z(readString2);
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, z6);
                return true;
            case 3:
                Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                V0(t03);
                parcel2.writeNoException();
                return true;
            case 4:
                o();
                parcel2.writeNoException();
                return true;
            case 5:
                Y2.b.t0(parcel.readStrongBinder());
                parcel.readInt();
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                Y2.a t04 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                v3(t04);
                parcel2.writeNoException();
                return true;
            case 7:
                Y2.a t05 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                q3(t05);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c3701ob = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    c3701ob = queryLocalInterface instanceof InterfaceC3755pb ? (InterfaceC3755pb) queryLocalInterface : new C3701ob(readStrongBinder);
                }
                AbstractC3411j8.f(parcel);
                I2(c3701ob);
                parcel2.writeNoException();
                return true;
            case 9:
                Y2.a t06 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                Y2(t06);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
