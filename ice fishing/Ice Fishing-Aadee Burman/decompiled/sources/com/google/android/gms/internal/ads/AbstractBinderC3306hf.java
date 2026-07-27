package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import q2.C4901p0;
import q2.InterfaceC4904r0;
import q2.InterfaceC4914w0;

/* renamed from: com.google.android.gms.internal.ads.hf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3306hf extends AbstractBinderC3336i8 implements InterfaceC3412jf {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f30823n = 0;

    public AbstractBinderC3306hf() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3790qf interfaceC3790qf = null;
        InterfaceC3790qf interfaceC3790qf2 = null;
        C4901p0 c4901p0 = null;
        C3843rf c3843rf = null;
        InterfaceC3574mf interfaceC3574mf = null;
        switch (i) {
            case 1:
                q2.c1 c1Var = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    interfaceC3790qf = queryLocalInterface instanceof InterfaceC3790qf ? (InterfaceC3790qf) queryLocalInterface : new C3682of(readStrongBinder);
                }
                AbstractC3388j8.f(parcel);
                k1(c1Var, interfaceC3790qf);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    interfaceC3574mf = queryLocalInterface2 instanceof InterfaceC3574mf ? (InterfaceC3574mf) queryLocalInterface2 : new C3466kf(readStrongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback", 2);
                }
                AbstractC3388j8.f(parcel);
                Z1(interfaceC3574mf);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean g4 = g();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3388j8.f31199a;
                parcel2.writeInt(g4 ? 1 : 0);
                return true;
            case 4:
                String n9 = n();
                parcel2.writeNoException();
                parcel2.writeString(n9);
                return true;
            case 5:
                W2.a w02 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                X1(w02);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    c3843rf = queryLocalInterface3 instanceof C3843rf ? (C3843rf) queryLocalInterface3 : new C3843rf(readStrongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener", 2);
                }
                AbstractC3388j8.f(parcel);
                T0(c3843rf);
                parcel2.writeNoException();
                return true;
            case 7:
                C4005uf c4005uf = (C4005uf) AbstractC3388j8.b(parcel, C4005uf.CREATOR);
                AbstractC3388j8.f(parcel);
                i3(c4005uf);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    c4901p0 = queryLocalInterface4 instanceof C4901p0 ? (C4901p0) queryLocalInterface4 : new C4901p0(readStrongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener", 2);
                }
                AbstractC3388j8.f(parcel);
                y0(c4901p0);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle e9 = e();
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, e9);
                return true;
            case 10:
                W2.a w03 = W2.b.w0(parcel.readStrongBinder());
                ClassLoader classLoader2 = AbstractC3388j8.f31199a;
                boolean z3 = parcel.readInt() != 0;
                AbstractC3388j8.f(parcel);
                m1(w03, z3);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC3198ff k9 = k();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, k9);
                return true;
            case 12:
                InterfaceC4914w0 l9 = l();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, l9);
                return true;
            case 13:
                InterfaceC4904r0 U3 = q2.U0.U3(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                K1(U3);
                parcel2.writeNoException();
                return true;
            case 14:
                q2.c1 c1Var2 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    interfaceC3790qf2 = queryLocalInterface5 instanceof InterfaceC3790qf ? (InterfaceC3790qf) queryLocalInterface5 : new C3682of(readStrongBinder5);
                }
                AbstractC3388j8.f(parcel);
                I1(c1Var2, interfaceC3790qf2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean a9 = AbstractC3388j8.a(parcel);
                AbstractC3388j8.f(parcel);
                u3(a9);
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
                AbstractC3388j8.f(parcel);
                X(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
