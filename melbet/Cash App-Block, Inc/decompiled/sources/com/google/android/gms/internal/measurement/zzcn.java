package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes4.dex */
public final class zzcn extends zaa implements zzcp {
    public zzcn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 5);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void beginAdUnitExposure(String str, long j) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j);
        zzc(zza, 23);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbn.zzc(zza, bundle);
        zzc(zza, 9);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void endAdUnitExposure(String str, long j) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j);
        zzc(zza, 24);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void generateEventId(zzcs zzcsVar) {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcsVar);
        zzc(zza, 22);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCachedAppInstanceId(zzcs zzcsVar) {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcsVar);
        zzc(zza, 19);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getConditionalUserProperties(String str, String str2, zzcs zzcsVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbn.zzd(zza, zzcsVar);
        zzc(zza, 10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCurrentScreenClass(zzcs zzcsVar) {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcsVar);
        zzc(zza, 17);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCurrentScreenName(zzcs zzcsVar) {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcsVar);
        zzc(zza, 16);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getGmpAppId(zzcs zzcsVar) {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcsVar);
        zzc(zza, 21);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getMaxUserProperties(String str, zzcs zzcsVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbn.zzd(zza, zzcsVar);
        zzc(zza, 6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getUserProperties(String str, String str2, boolean z, zzcs zzcsVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        ClassLoader classLoader = zzbn.zzb;
        zza.writeInt(z ? 1 : 0);
        zzbn.zzd(zza, zzcsVar);
        zzc(zza, 5);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void initialize(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j) {
        Parcel zza = zza();
        zzbn.zzd(zza, iObjectWrapper);
        zzbn.zzc(zza, zzdbVar);
        zza.writeLong(j);
        zzc(zza, 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void initializeWithElapsedTime(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j, long j2) {
        Parcel zza = zza();
        zzbn.zzd(zza, iObjectWrapper);
        zzbn.zzc(zza, zzdbVar);
        zza.writeLong(j);
        zza.writeLong(j2);
        zzc(zza, 60);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbn.zzc(zza, bundle);
        zza.writeInt(z ? 1 : 0);
        zza.writeInt(1);
        zza.writeLong(j);
        zza.writeLong(j2);
        zzc(zza, 59);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel zza = zza();
        zza.writeInt(5);
        zza.writeString("Error with data collection. Data lost.");
        zzbn.zzd(zza, iObjectWrapper);
        zzbn.zzd(zza, iObjectWrapper2);
        zzbn.zzd(zza, iObjectWrapper3);
        zzc(zza, 33);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzddVar);
        zzbn.zzc(zza, bundle);
        zza.writeLong(j);
        zzc(zza, 53);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzddVar);
        zza.writeLong(j);
        zzc(zza, 54);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzddVar);
        zza.writeLong(j);
        zzc(zza, 55);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzddVar);
        zza.writeLong(j);
        zzc(zza, 56);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, zzcs zzcsVar, long j) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzddVar);
        zzbn.zzd(zza, zzcsVar);
        zza.writeLong(j);
        zzc(zza, 57);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzddVar);
        zza.writeLong(j);
        zzc(zza, 51);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzddVar);
        zza.writeLong(j);
        zzc(zza, 52);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void retrieveAndUploadBatches(zzcv zzcvVar) {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcvVar);
        zzc(zza, 58);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel zza = zza();
        zzbn.zzc(zza, bundle);
        zza.writeLong(j);
        zzc(zza, 8);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzddVar);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeLong(j);
        zzc(zza, 50);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setDataCollectionEnabled(boolean z) {
        Parcel zza = zza();
        ClassLoader classLoader = zzbn.zzb;
        zza.writeInt(z ? 1 : 0);
        zzc(zza, 39);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel zza = zza();
        ClassLoader classLoader = zzbn.zzb;
        zza.writeInt(z ? 1 : 0);
        zza.writeLong(j);
        zzc(zza, 11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) {
        Parcel zza = zza();
        zza.writeString("fcm");
        zza.writeString("_ln");
        zzbn.zzd(zza, iObjectWrapper);
        zza.writeInt(1);
        zza.writeLong(j);
        zzc(zza, 4);
    }
}
