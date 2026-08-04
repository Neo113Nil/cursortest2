package com.gamericefishpro.space.i9;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends com.gamericefishpro.space.f9.a implements j0 {
    @Override // com.gamericefishpro.space.i9.j0
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelH = H();
        parcelH.writeString(str);
        parcelH.writeLong(j);
        I(parcelH, 23);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelH = H();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        y.b(parcelH, bundle);
        I(parcelH, 9);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelH = H();
        parcelH.writeString(str);
        parcelH.writeLong(j);
        I(parcelH, 24);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void generateEventId(l0 l0Var) {
        Parcel parcelH = H();
        y.c(parcelH, l0Var);
        I(parcelH, 22);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void getAppInstanceId(l0 l0Var) {
        Parcel parcelH = H();
        y.c(parcelH, l0Var);
        I(parcelH, 20);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void getCachedAppInstanceId(l0 l0Var) {
        Parcel parcelH = H();
        y.c(parcelH, l0Var);
        I(parcelH, 19);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void getConditionalUserProperties(String str, String str2, l0 l0Var) {
        Parcel parcelH = H();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        y.c(parcelH, l0Var);
        I(parcelH, 10);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void getCurrentScreenClass(l0 l0Var) {
        Parcel parcelH = H();
        y.c(parcelH, l0Var);
        I(parcelH, 17);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void getCurrentScreenName(l0 l0Var) {
        Parcel parcelH = H();
        y.c(parcelH, l0Var);
        I(parcelH, 16);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void getGmpAppId(l0 l0Var) {
        Parcel parcelH = H();
        y.c(parcelH, l0Var);
        I(parcelH, 21);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void getMaxUserProperties(String str, l0 l0Var) {
        Parcel parcelH = H();
        parcelH.writeString(str);
        y.c(parcelH, l0Var);
        I(parcelH, 6);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void getUserProperties(String str, String str2, boolean z, l0 l0Var) {
        Parcel parcelH = H();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        ClassLoader classLoader = y.a;
        parcelH.writeInt(z ? 1 : 0);
        y.c(parcelH, l0Var);
        I(parcelH, 5);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void initialize(com.gamericefishpro.space.c9.a aVar, t0 t0Var, long j) {
        Parcel parcelH = H();
        y.c(parcelH, aVar);
        y.b(parcelH, t0Var);
        parcelH.writeLong(j);
        I(parcelH, 1);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelH = H();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        y.b(parcelH, bundle);
        parcelH.writeInt(1);
        parcelH.writeInt(1);
        parcelH.writeLong(j);
        I(parcelH, 2);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void logHealthData(int i, String str, com.gamericefishpro.space.c9.a aVar, com.gamericefishpro.space.c9.a aVar2, com.gamericefishpro.space.c9.a aVar3) {
        Parcel parcelH = H();
        parcelH.writeInt(5);
        parcelH.writeString(str);
        y.c(parcelH, aVar);
        y.c(parcelH, aVar2);
        y.c(parcelH, aVar3);
        I(parcelH, 33);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void onActivityCreatedByScionActivityInfo(v0 v0Var, Bundle bundle, long j) {
        Parcel parcelH = H();
        y.b(parcelH, v0Var);
        y.b(parcelH, bundle);
        parcelH.writeLong(j);
        I(parcelH, 53);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void onActivityDestroyedByScionActivityInfo(v0 v0Var, long j) {
        Parcel parcelH = H();
        y.b(parcelH, v0Var);
        parcelH.writeLong(j);
        I(parcelH, 54);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void onActivityPausedByScionActivityInfo(v0 v0Var, long j) {
        Parcel parcelH = H();
        y.b(parcelH, v0Var);
        parcelH.writeLong(j);
        I(parcelH, 55);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void onActivityResumedByScionActivityInfo(v0 v0Var, long j) {
        Parcel parcelH = H();
        y.b(parcelH, v0Var);
        parcelH.writeLong(j);
        I(parcelH, 56);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void onActivitySaveInstanceStateByScionActivityInfo(v0 v0Var, l0 l0Var, long j) {
        Parcel parcelH = H();
        y.b(parcelH, v0Var);
        y.c(parcelH, l0Var);
        parcelH.writeLong(j);
        I(parcelH, 57);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void onActivityStartedByScionActivityInfo(v0 v0Var, long j) {
        Parcel parcelH = H();
        y.b(parcelH, v0Var);
        parcelH.writeLong(j);
        I(parcelH, 51);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void onActivityStoppedByScionActivityInfo(v0 v0Var, long j) {
        Parcel parcelH = H();
        y.b(parcelH, v0Var);
        parcelH.writeLong(j);
        I(parcelH, 52);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void retrieveAndUploadBatches(n0 n0Var) {
        Parcel parcelH = H();
        y.c(parcelH, n0Var);
        I(parcelH, 58);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelH = H();
        y.b(parcelH, bundle);
        parcelH.writeLong(j);
        I(parcelH, 8);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void setCurrentScreenByScionActivityInfo(v0 v0Var, String str, String str2, long j) {
        Parcel parcelH = H();
        y.b(parcelH, v0Var);
        parcelH.writeString(str);
        parcelH.writeString(str2);
        parcelH.writeLong(j);
        I(parcelH, 50);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // com.gamericefishpro.space.i9.j0
    public final void setUserProperty(String str, String str2, com.gamericefishpro.space.c9.a aVar, boolean z, long j) {
        Parcel parcelH = H();
        parcelH.writeString("fcm");
        parcelH.writeString("_ln");
        y.c(parcelH, aVar);
        parcelH.writeInt(1);
        parcelH.writeLong(j);
        I(parcelH, 4);
    }
}
