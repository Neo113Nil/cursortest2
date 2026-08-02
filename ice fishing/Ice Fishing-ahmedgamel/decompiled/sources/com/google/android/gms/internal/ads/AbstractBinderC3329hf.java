package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s2.C4950p0;
import s2.InterfaceC4953r0;
import s2.InterfaceC4963w0;

/* renamed from: com.google.android.gms.internal.ads.hf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3329hf extends AbstractBinderC3359i8 implements InterfaceC3435jf {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f31584n = 0;

    public AbstractBinderC3329hf() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3813qf interfaceC3813qf = null;
        InterfaceC3813qf interfaceC3813qf2 = null;
        C4950p0 c4950p0 = null;
        C3866rf c3866rf = null;
        InterfaceC3597mf interfaceC3597mf = null;
        switch (i) {
            case 1:
                s2.c1 c1Var = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    interfaceC3813qf = queryLocalInterface instanceof InterfaceC3813qf ? (InterfaceC3813qf) queryLocalInterface : new C3705of(readStrongBinder);
                }
                AbstractC3411j8.f(parcel);
                R1(c1Var, interfaceC3813qf);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    interfaceC3597mf = queryLocalInterface2 instanceof InterfaceC3597mf ? (InterfaceC3597mf) queryLocalInterface2 : new C3489kf(readStrongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback", 1);
                }
                AbstractC3411j8.f(parcel);
                X1(interfaceC3597mf);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean g9 = g();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3411j8.f31986a;
                parcel2.writeInt(g9 ? 1 : 0);
                return true;
            case 4:
                String n9 = n();
                parcel2.writeNoException();
                parcel2.writeString(n9);
                return true;
            case 5:
                Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                K1(t02);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    c3866rf = queryLocalInterface3 instanceof C3866rf ? (C3866rf) queryLocalInterface3 : new C3866rf(readStrongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener", 1);
                }
                AbstractC3411j8.f(parcel);
                S0(c3866rf);
                parcel2.writeNoException();
                return true;
            case 7:
                C4028uf c4028uf = (C4028uf) AbstractC3411j8.b(parcel, C4028uf.CREATOR);
                AbstractC3411j8.f(parcel);
                e3(c4028uf);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    c4950p0 = queryLocalInterface4 instanceof C4950p0 ? (C4950p0) queryLocalInterface4 : new C4950p0(readStrongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener", 1);
                }
                AbstractC3411j8.f(parcel);
                O3(c4950p0);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle e9 = e();
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, e9);
                return true;
            case 10:
                Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
                ClassLoader classLoader2 = AbstractC3411j8.f31986a;
                boolean z6 = parcel.readInt() != 0;
                AbstractC3411j8.f(parcel);
                A2(t03, z6);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC3221ff k9 = k();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, k9);
                return true;
            case 12:
                InterfaceC4963w0 l9 = l();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, l9);
                return true;
            case 13:
                InterfaceC4953r0 U32 = s2.U0.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                z1(U32);
                parcel2.writeNoException();
                return true;
            case 14:
                s2.c1 c1Var2 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    interfaceC3813qf2 = queryLocalInterface5 instanceof InterfaceC3813qf ? (InterfaceC3813qf) queryLocalInterface5 : new C3705of(readStrongBinder5);
                }
                AbstractC3411j8.f(parcel);
                H0(c1Var2, interfaceC3813qf2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean a9 = AbstractC3411j8.a(parcel);
                AbstractC3411j8.f(parcel);
                o3(a9);
                parcel2.writeNoException();
                return true;
            case 16:
                String q8 = q();
                parcel2.writeNoException();
                parcel2.writeString(q8);
                return true;
            case 17:
                long r9 = r();
                parcel2.writeNoException();
                parcel2.writeLong(r9);
                return true;
            case 18:
                long readLong = parcel.readLong();
                AbstractC3411j8.f(parcel);
                X(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
