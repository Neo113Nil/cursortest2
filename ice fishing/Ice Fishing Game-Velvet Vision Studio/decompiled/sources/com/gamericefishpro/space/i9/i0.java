package com.gamericefishpro.space.i9;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.appsflyer.attribution.RequestError;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends x implements j0 {
    public static j0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof j0 ? (j0) iInterfaceQueryLocalInterface : new h0(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 2);
    }

    @Override // com.gamericefishpro.space.i9.x
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        l0 k0Var = null;
        n0 m0Var = null;
        l0 k0Var2 = null;
        l0 k0Var3 = null;
        l0 k0Var4 = null;
        l0 k0Var5 = null;
        q0 o0Var = null;
        q0 o0Var2 = null;
        q0 o0Var3 = null;
        l0 k0Var6 = null;
        l0 k0Var7 = null;
        l0 k0Var8 = null;
        l0 k0Var9 = null;
        l0 k0Var10 = null;
        l0 k0Var11 = null;
        s0 r0Var = null;
        l0 k0Var12 = null;
        l0 k0Var13 = null;
        l0 k0Var14 = null;
        l0 k0Var15 = null;
        l0 k0Var16 = null;
        switch (i) {
            case 1:
                com.gamericefishpro.space.c9.a aVarF = com.gamericefishpro.space.c9.b.F(parcel.readStrongBinder());
                t0 t0Var = (t0) y.a(parcel, t0.CREATOR);
                long j = parcel.readLong();
                y.d(parcel);
                initialize(aVarF, t0Var, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) y.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolean z2 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                y.d(parcel);
                logEvent(string, string2, bundle, z, z2, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) y.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var = iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new k0(strongBinder);
                }
                l0 l0Var = k0Var;
                long j3 = parcel.readLong();
                y.d(parcel);
                logEventAndBundle(string3, string4, bundle2, l0Var, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                com.gamericefishpro.space.c9.a aVarF2 = com.gamericefishpro.space.c9.b.F(parcel.readStrongBinder());
                ClassLoader classLoader = y.a;
                z = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                y.d(parcel);
                setUserProperty(string5, string6, aVarF2, z, j4);
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = y.a;
                z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var16 = iInterfaceQueryLocalInterface2 instanceof l0 ? (l0) iInterfaceQueryLocalInterface2 : new k0(strongBinder2);
                }
                y.d(parcel);
                getUserProperties(string7, string8, z, k0Var16);
                break;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var15 = iInterfaceQueryLocalInterface3 instanceof l0 ? (l0) iInterfaceQueryLocalInterface3 : new k0(strongBinder3);
                }
                y.d(parcel);
                getMaxUserProperties(string9, k0Var15);
                break;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                y.d(parcel);
                setUserId(string10, j5);
                break;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                Bundle bundle3 = (Bundle) y.a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                y.d(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) y.a(parcel, Bundle.CREATOR);
                y.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var14 = iInterfaceQueryLocalInterface4 instanceof l0 ? (l0) iInterfaceQueryLocalInterface4 : new k0(strongBinder4);
                }
                y.d(parcel);
                getConditionalUserProperties(string13, string14, k0Var14);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                ClassLoader classLoader3 = y.a;
                z = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                y.d(parcel);
                setMeasurementEnabled(z, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                y.d(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                y.d(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                y.d(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                com.gamericefishpro.space.c9.a aVarF3 = com.gamericefishpro.space.c9.b.F(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                y.d(parcel);
                setCurrentScreen(aVarF3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var13 = iInterfaceQueryLocalInterface5 instanceof l0 ? (l0) iInterfaceQueryLocalInterface5 : new k0(strongBinder5);
                }
                y.d(parcel);
                getCurrentScreenName(k0Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var12 = iInterfaceQueryLocalInterface6 instanceof l0 ? (l0) iInterfaceQueryLocalInterface6 : new k0(strongBinder6);
                }
                y.d(parcel);
                getCurrentScreenClass(k0Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    r0Var = iInterfaceQueryLocalInterface7 instanceof s0 ? (s0) iInterfaceQueryLocalInterface7 : new r0(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 2);
                }
                y.d(parcel);
                setInstanceIdProvider(r0Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var11 = iInterfaceQueryLocalInterface8 instanceof l0 ? (l0) iInterfaceQueryLocalInterface8 : new k0(strongBinder8);
                }
                y.d(parcel);
                getCachedAppInstanceId(k0Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var10 = iInterfaceQueryLocalInterface9 instanceof l0 ? (l0) iInterfaceQueryLocalInterface9 : new k0(strongBinder9);
                }
                y.d(parcel);
                getAppInstanceId(k0Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var9 = iInterfaceQueryLocalInterface10 instanceof l0 ? (l0) iInterfaceQueryLocalInterface10 : new k0(strongBinder10);
                }
                y.d(parcel);
                getGmpAppId(k0Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var8 = iInterfaceQueryLocalInterface11 instanceof l0 ? (l0) iInterfaceQueryLocalInterface11 : new k0(strongBinder11);
                }
                y.d(parcel);
                generateEventId(k0Var8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                y.d(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                y.d(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                com.gamericefishpro.space.c9.a aVarF4 = com.gamericefishpro.space.c9.b.F(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                y.d(parcel);
                onActivityStarted(aVarF4, j14);
                break;
            case 26:
                com.gamericefishpro.space.c9.a aVarF5 = com.gamericefishpro.space.c9.b.F(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                y.d(parcel);
                onActivityStopped(aVarF5, j15);
                break;
            case 27:
                com.gamericefishpro.space.c9.a aVarF6 = com.gamericefishpro.space.c9.b.F(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) y.a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                y.d(parcel);
                onActivityCreated(aVarF6, bundle5, j16);
                break;
            case 28:
                com.gamericefishpro.space.c9.a aVarF7 = com.gamericefishpro.space.c9.b.F(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                y.d(parcel);
                onActivityDestroyed(aVarF7, j17);
                break;
            case 29:
                com.gamericefishpro.space.c9.a aVarF8 = com.gamericefishpro.space.c9.b.F(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                y.d(parcel);
                onActivityPaused(aVarF8, j18);
                break;
            case 30:
                com.gamericefishpro.space.c9.a aVarF9 = com.gamericefishpro.space.c9.b.F(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                y.d(parcel);
                onActivityResumed(aVarF9, j19);
                break;
            case 31:
                com.gamericefishpro.space.c9.a aVarF10 = com.gamericefishpro.space.c9.b.F(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var7 = iInterfaceQueryLocalInterface12 instanceof l0 ? (l0) iInterfaceQueryLocalInterface12 : new k0(strongBinder12);
                }
                long j20 = parcel.readLong();
                y.d(parcel);
                onActivitySaveInstanceState(aVarF10, k0Var7, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) y.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var6 = iInterfaceQueryLocalInterface13 instanceof l0 ? (l0) iInterfaceQueryLocalInterface13 : new k0(strongBinder13);
                }
                long j21 = parcel.readLong();
                y.d(parcel);
                performAction(bundle6, k0Var6, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                com.gamericefishpro.space.c9.a aVarF11 = com.gamericefishpro.space.c9.b.F(parcel.readStrongBinder());
                com.gamericefishpro.space.c9.a aVarF12 = com.gamericefishpro.space.c9.b.F(parcel.readStrongBinder());
                com.gamericefishpro.space.c9.a aVarF13 = com.gamericefishpro.space.c9.b.F(parcel.readStrongBinder());
                y.d(parcel);
                logHealthData(i2, string19, aVarF11, aVarF12, aVarF13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    o0Var3 = iInterfaceQueryLocalInterface14 instanceof q0 ? (q0) iInterfaceQueryLocalInterface14 : new o0(strongBinder14);
                }
                y.d(parcel);
                setEventInterceptor(o0Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    o0Var2 = iInterfaceQueryLocalInterface15 instanceof q0 ? (q0) iInterfaceQueryLocalInterface15 : new o0(strongBinder15);
                }
                y.d(parcel);
                registerOnMeasurementEventListener(o0Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    o0Var = iInterfaceQueryLocalInterface16 instanceof q0 ? (q0) iInterfaceQueryLocalInterface16 : new o0(strongBinder16);
                }
                y.d(parcel);
                unregisterOnMeasurementEventListener(o0Var);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(y.a);
                y.d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var5 = iInterfaceQueryLocalInterface17 instanceof l0 ? (l0) iInterfaceQueryLocalInterface17 : new k0(strongBinder17);
                }
                int i3 = parcel.readInt();
                y.d(parcel);
                getTestFlag(k0Var5, i3);
                break;
            case 39:
                ClassLoader classLoader4 = y.a;
                z = parcel.readInt() != 0;
                y.d(parcel);
                setDataCollectionEnabled(z);
                break;
            case RequestError.NETWORK_FAILURE /* 40 */:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var4 = iInterfaceQueryLocalInterface18 instanceof l0 ? (l0) iInterfaceQueryLocalInterface18 : new k0(strongBinder18);
                }
                y.d(parcel);
                isDataCollectionEnabled(k0Var4);
                break;
            case RequestError.NO_DEV_KEY /* 41 */:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) y.a(parcel, Bundle.CREATOR);
                y.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                y.d(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) y.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                y.d(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) y.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                y.d(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var3 = iInterfaceQueryLocalInterface19 instanceof l0 ? (l0) iInterfaceQueryLocalInterface19 : new k0(strongBinder19);
                }
                y.d(parcel);
                getSessionId(k0Var3);
                break;
            case 48:
                Intent intent = (Intent) y.a(parcel, Intent.CREATOR);
                y.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                v0 v0Var = (v0) y.a(parcel, v0.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                y.d(parcel);
                setCurrentScreenByScionActivityInfo(v0Var, string20, string21, j25);
                break;
            case 51:
                v0 v0Var2 = (v0) y.a(parcel, v0.CREATOR);
                long j26 = parcel.readLong();
                y.d(parcel);
                onActivityStartedByScionActivityInfo(v0Var2, j26);
                break;
            case 52:
                v0 v0Var3 = (v0) y.a(parcel, v0.CREATOR);
                long j27 = parcel.readLong();
                y.d(parcel);
                onActivityStoppedByScionActivityInfo(v0Var3, j27);
                break;
            case 53:
                v0 v0Var4 = (v0) y.a(parcel, v0.CREATOR);
                Bundle bundle10 = (Bundle) y.a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                y.d(parcel);
                onActivityCreatedByScionActivityInfo(v0Var4, bundle10, j28);
                break;
            case 54:
                v0 v0Var5 = (v0) y.a(parcel, v0.CREATOR);
                long j29 = parcel.readLong();
                y.d(parcel);
                onActivityDestroyedByScionActivityInfo(v0Var5, j29);
                break;
            case 55:
                v0 v0Var6 = (v0) y.a(parcel, v0.CREATOR);
                long j30 = parcel.readLong();
                y.d(parcel);
                onActivityPausedByScionActivityInfo(v0Var6, j30);
                break;
            case 56:
                v0 v0Var7 = (v0) y.a(parcel, v0.CREATOR);
                long j31 = parcel.readLong();
                y.d(parcel);
                onActivityResumedByScionActivityInfo(v0Var7, j31);
                break;
            case 57:
                v0 v0Var8 = (v0) y.a(parcel, v0.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    k0Var2 = iInterfaceQueryLocalInterface20 instanceof l0 ? (l0) iInterfaceQueryLocalInterface20 : new k0(strongBinder20);
                }
                long j32 = parcel.readLong();
                y.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(v0Var8, k0Var2, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    m0Var = iInterfaceQueryLocalInterface21 instanceof n0 ? (n0) iInterfaceQueryLocalInterface21 : new m0(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 2);
                }
                y.d(parcel);
                retrieveAndUploadBatches(m0Var);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
