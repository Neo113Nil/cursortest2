package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.le, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3542le extends AbstractBinderC3359i8 implements InterfaceC3596me {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f32551n = 0;

    public AbstractBinderC3542le() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
                AbstractC3411j8.f(parcel);
                A0(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                g();
                parcel2.writeNoException();
                return true;
            case 3:
                n();
                parcel2.writeNoException();
                return true;
            case 4:
                j();
                parcel2.writeNoException();
                return true;
            case 5:
                k();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
                AbstractC3411j8.f(parcel);
                x1(bundle2);
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, bundle2);
                return true;
            case 7:
                E();
                parcel2.writeNoException();
                return true;
            case 8:
                I();
                parcel2.writeNoException();
                return true;
            case 9:
                I0();
                parcel2.writeNoException();
                return true;
            case 10:
                o();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean e9 = e();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3411j8.f31986a;
                parcel2.writeInt(e9 ? 1 : 0);
                return true;
            case 12:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                Intent intent = (Intent) AbstractC3411j8.b(parcel, Intent.CREATOR);
                AbstractC3411j8.f(parcel);
                r3(readInt, readInt2, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 14:
                d();
                parcel2.writeNoException();
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                AbstractC3411j8.f(parcel);
                p1(readInt3, createStringArray, createIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
