package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.core.provider.CallbackWrapper$2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.size.DimensionKt;
import com.android.volley.Response;
import com.bugsnag.android.Client;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.fillr.m1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.service.zau;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.SignInClientImpl;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.wire.GrpcMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes.dex */
public final class zabk implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final /* synthetic */ GoogleApiManager zaa;
    public final GmsClient zac;
    public final ApiKey zad;
    public final zaaa zae;
    public final int zah;
    public final zacm zai;
    public boolean zaj;
    public final LinkedList zab = new LinkedList();
    public final HashSet zaf = new HashSet();
    public final HashMap zag = new HashMap();
    public final ArrayList zak = new ArrayList();
    public ConnectionResult zal = null;
    public int zam = 0;

    public zabk(GoogleApiManager googleApiManager, GoogleApi googleApi) {
        this.zaa = googleApiManager;
        Looper looper = googleApiManager.zas.getLooper();
        GrpcMethod createClientSettingsBuilder = googleApi.createClientSettingsBuilder();
        ArraySet arraySet = (ArraySet) createClientSettingsBuilder.requestAdapter;
        String str = (String) createClientSettingsBuilder.path;
        String str2 = (String) createClientSettingsBuilder.responseAdapter;
        SignInOptions signInOptions = SignInOptions.zaa;
        Reward$Adapter reward$Adapter = new Reward$Adapter(arraySet, null, str, str2, signInOptions);
        DimensionKt dimensionKt = googleApi.zae.zaa;
        zzae.checkNotNull(dimensionKt);
        GmsClient buildClient = dimensionKt.buildClient(googleApi.zab, looper, reward$Adapter, googleApi.zaf, this, this);
        Extras.Key key = googleApi.zad;
        if (key == null || !(buildClient instanceof BaseGmsClient)) {
            String str3 = googleApi.zac;
            if (str3 != null && (buildClient instanceof BaseGmsClient)) {
                buildClient.zzA = str3;
            }
        } else {
            buildClient.zzB = key;
        }
        this.zac = buildClient;
        this.zad = googleApi.zag;
        this.zae = new zaaa();
        this.zah = googleApi.zai;
        if (!buildClient.requiresSignIn()) {
            this.zai = null;
            return;
        }
        Context context = googleApiManager.zaj;
        com.google.android.gms.internal.base.zao zaoVar = googleApiManager.zas;
        GrpcMethod createClientSettingsBuilder2 = googleApi.createClientSettingsBuilder();
        this.zai = new zacm(context, zaoVar, new Reward$Adapter((ArraySet) createClientSettingsBuilder2.requestAdapter, null, (String) createClientSettingsBuilder2.path, (String) createClientSettingsBuilder2.responseAdapter, signInOptions));
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        GoogleApiManager googleApiManager = this.zaa;
        if (Looper.myLooper() == googleApiManager.zas.getLooper()) {
            zaC();
        } else {
            googleApiManager.zas.post(new Client.AnonymousClass7(this, 23));
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zac(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        GoogleApiManager googleApiManager = this.zaa;
        if (Looper.myLooper() == googleApiManager.zas.getLooper()) {
            zaD(i);
        } else {
            googleApiManager.zas.post(new CallbackWrapper$2(this, i, 2));
        }
    }

    public final void zaC() {
        GmsClient gmsClient = this.zac;
        GoogleApiManager googleApiManager = this.zaa;
        zzae.checkHandlerThread(googleApiManager.zas);
        this.zal = null;
        zaN(ConnectionResult.RESULT_SUCCESS);
        if (this.zaj) {
            com.google.android.gms.internal.base.zao zaoVar = googleApiManager.zas;
            ApiKey apiKey = this.zad;
            zaoVar.removeMessages(11, apiKey);
            googleApiManager.zas.removeMessages(9, apiKey);
            this.zaj = false;
        }
        Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            Response response = ((zacd) it.next()).zaa;
            if (zaO(response.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    response.registerListener(gmsClient, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    gmsClient.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException | RuntimeException e) {
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        zaF();
        zaL();
    }

    public final void zaD(int i) {
        zzae.checkHandlerThread(this.zaa.zas);
        this.zal = null;
        this.zaj = true;
        String str = this.zac.zzk;
        zaaa zaaaVar = this.zae;
        zaaaVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        zaaaVar.zah(new Status(20, sb.toString(), null, null), true);
        ApiKey apiKey = this.zad;
        GoogleApiManager googleApiManager = this.zaa;
        com.google.android.gms.internal.base.zao zaoVar = googleApiManager.zas;
        zaoVar.sendMessageDelayed(Message.obtain(zaoVar, 9, apiKey), 5000L);
        com.google.android.gms.internal.base.zao zaoVar2 = googleApiManager.zas;
        zaoVar2.sendMessageDelayed(Message.obtain(zaoVar2, 11, apiKey), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) googleApiManager.zal.processor;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            ((zacd) it.next()).getClass();
        }
    }

    public final boolean zaE(ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.zae) {
            try {
                GoogleApiManager googleApiManager = this.zaa;
                int i = 0;
                if (googleApiManager.zap == null || !googleApiManager.zaq.contains(this.zad)) {
                    return false;
                }
                zaab zaabVar = googleApiManager.zap;
                int i2 = this.zah;
                zaabVar.getClass();
                zam zamVar = new zam(connectionResult, i2);
                if (FillrEnv$EnumUnboxingLocalUtility.m(zaabVar.zab, zamVar)) {
                    ((zap) zaabVar).zad.post(new zao(i, zaabVar, zamVar));
                }
                googleApiManager.zak.zae(googleApiManager.zaj, connectionResult, true);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zaF() {
        LinkedList linkedList = this.zab;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zai zaiVar = (zai) arrayList.get(i);
            if (!this.zac.isConnected()) {
                return;
            }
            if (zaG(zaiVar)) {
                linkedList.remove(zaiVar);
            }
        }
    }

    public final boolean zaG(zai zaiVar) {
        if (!(zaiVar instanceof zac)) {
            zaaa zaaaVar = this.zae;
            GmsClient gmsClient = this.zac;
            zaiVar.zaf(zaaaVar, gmsClient.requiresSignIn());
            try {
                zaiVar.zag(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                gmsClient.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        zac zacVar = (zac) zaiVar;
        Feature zaO = zaO(zacVar.zaa(this));
        if (zaO == null) {
            zaaa zaaaVar2 = this.zae;
            GmsClient gmsClient2 = this.zac;
            zaiVar.zaf(zaaaVar2, gmsClient2.requiresSignIn());
            try {
                zaiVar.zag(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                gmsClient2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.zac.getClass().getName();
        String str = zaO.zza;
        long version = zaO.getVersion();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(version).length() + 2);
        Boxes$$ExternalSyntheticOutline1.m(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(version);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        GoogleApiManager googleApiManager = this.zaa;
        if (!googleApiManager.zat || !zacVar.zab(this)) {
            zacVar.zae(new UnsupportedApiCallException(zaO));
            return true;
        }
        int zac = zacVar.zac(this);
        zabl zablVar = new zabl(this.zad, zaO);
        ArrayList arrayList = this.zak;
        int indexOf = arrayList.indexOf(zablVar);
        if (indexOf >= 0) {
            zabl zablVar2 = (zabl) arrayList.get(indexOf);
            googleApiManager.zas.removeMessages(15, zablVar2);
            googleApiManager.zas.sendMessageDelayed(Message.obtain(googleApiManager.zas, 15, zablVar2), 5000L);
            return false;
        }
        arrayList.add(zablVar);
        googleApiManager.zas.sendMessageDelayed(Message.obtain(googleApiManager.zas, 15, zablVar), 5000L);
        googleApiManager.zas.sendMessageDelayed(Message.obtain(googleApiManager.zas, 16, zablVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(zac));
        if (zaE(connectionResult)) {
            String str2 = zaO.zza;
            long version2 = zaO.getVersion();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(version2).length());
            sb2.append("A dialog should be displayed for missing feature: ");
            sb2.append(str2);
            sb2.append(", version: ");
            sb2.append(version2);
            Log.w("GoogleApiManager", sb2.toString());
            return false;
        }
        if (!googleApiManager.zap(connectionResult, this.zah)) {
            return false;
        }
        String str3 = zaO.zza;
        long version3 = zaO.getVersion();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(version3).length());
        sb3.append("Notification displayed for missing feature: ");
        sb3.append(str3);
        sb3.append(", version: ");
        sb3.append(version3);
        Log.w("GoogleApiManager", sb3.toString());
        return false;
    }

    public final void zaI(Status status, Exception exc, boolean z) {
        zzae.checkHandlerThread(this.zaa.zas);
        if ((status == null) == (exc == null)) {
            a$$ExternalSyntheticBUOutline0.m$3("Status XOR exception should be null");
            return;
        }
        Iterator it = this.zab.iterator();
        while (it.hasNext()) {
            zai zaiVar = (zai) it.next();
            if (!z || zaiVar.zac == 2) {
                if (status != null) {
                    zaiVar.zad(status);
                } else {
                    zaiVar.zae(exc);
                }
                it.remove();
            }
        }
    }

    public final void zaJ(Status status) {
        zzae.checkHandlerThread(this.zaa.zas);
        zaI(status, null, false);
    }

    public final void zaL() {
        GoogleApiManager googleApiManager = this.zaa;
        com.google.android.gms.internal.base.zao zaoVar = googleApiManager.zas;
        ApiKey apiKey = this.zad;
        zaoVar.removeMessages(12, apiKey);
        com.google.android.gms.internal.base.zao zaoVar2 = googleApiManager.zas;
        zaoVar2.sendMessageDelayed(zaoVar2.obtainMessage(12, apiKey), googleApiManager.zac);
    }

    public final void zaN(ConnectionResult connectionResult) {
        HashSet hashSet = this.zaf;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        if (zzae.equal(connectionResult, ConnectionResult.RESULT_SUCCESS)) {
            GmsClient gmsClient = this.zac;
            if (!gmsClient.isConnected() || gmsClient.zza == null) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1("Failed to connect when checking package");
                return;
            }
        }
        throw null;
    }

    public final Feature zaO(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.zac.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            ArrayMap arrayMap = new ArrayMap(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                arrayMap.put(feature.zza, Long.valueOf(feature.getVersion()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) arrayMap.get(feature2.zza);
                if (l == null || l.longValue() < feature2.getVersion()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void zab(ConnectionResult connectionResult) {
        zzae.checkHandlerThread(this.zaa.zas);
        GmsClient gmsClient = this.zac;
        String name = gmsClient.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        GmsClient gmsClient2 = gmsClient;
        gmsClient2.disconnect(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(name.length() + 25 + valueOf.length()), "onSignInFailed for ", name, " with ", valueOf));
        zac(connectionResult, null);
    }

    public final void zac(ConnectionResult connectionResult, RuntimeException runtimeException) {
        SignInClientImpl signInClientImpl;
        GoogleApiManager googleApiManager = this.zaa;
        zzae.checkHandlerThread(googleApiManager.zas);
        zacm zacmVar = this.zai;
        if (zacmVar != null && (signInClientImpl = zacmVar.zag) != null) {
            signInClientImpl.disconnect();
        }
        zzae.checkHandlerThread(this.zaa.zas);
        this.zal = null;
        SparseIntArray sparseIntArray = (SparseIntArray) googleApiManager.zal.processor;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        zaN(connectionResult);
        if ((this.zac instanceof zau) && connectionResult.zzb != 24) {
            googleApiManager.zad = true;
            com.google.android.gms.internal.base.zao zaoVar = googleApiManager.zas;
            zaoVar.sendMessageDelayed(zaoVar.obtainMessage(19), 300000L);
        }
        int i = connectionResult.zzb;
        if (i == 4) {
            zaJ(GoogleApiManager.zab);
            return;
        }
        if (i == 25) {
            zaJ(GoogleApiManager.zaJ(this.zad, connectionResult));
            return;
        }
        LinkedList linkedList = this.zab;
        if (linkedList.isEmpty()) {
            this.zal = connectionResult;
            return;
        }
        if (runtimeException != null) {
            zzae.checkHandlerThread(googleApiManager.zas);
            zaI(null, runtimeException, false);
            return;
        }
        boolean z = googleApiManager.zat;
        ApiKey apiKey = this.zad;
        if (!z) {
            zaJ(GoogleApiManager.zaJ(apiKey, connectionResult));
            return;
        }
        zaI(GoogleApiManager.zaJ(apiKey, connectionResult), null, true);
        if (linkedList.isEmpty() || zaE(connectionResult) || googleApiManager.zap(connectionResult, this.zah)) {
            return;
        }
        if (connectionResult.zzb == 18) {
            this.zaj = true;
        }
        if (!this.zaj) {
            zaJ(GoogleApiManager.zaJ(apiKey, connectionResult));
        } else {
            com.google.android.gms.internal.base.zao zaoVar2 = googleApiManager.zas;
            zaoVar2.sendMessageDelayed(Message.obtain(zaoVar2, 9, apiKey), 5000L);
        }
    }

    public final void zad(zai zaiVar) {
        zzae.checkHandlerThread(this.zaa.zas);
        boolean isConnected = this.zac.isConnected();
        LinkedList linkedList = this.zab;
        if (isConnected) {
            if (zaG(zaiVar)) {
                zaL();
                return;
            } else {
                linkedList.add(zaiVar);
                return;
            }
        }
        linkedList.add(zaiVar);
        ConnectionResult connectionResult = this.zal;
        if (connectionResult == null || !connectionResult.hasResolution()) {
            zam();
        } else {
            zac(this.zal, null);
        }
    }

    public final void zae() {
        zzae.checkHandlerThread(this.zaa.zas);
        Status status = GoogleApiManager.zaa;
        zaJ(status);
        this.zae.zah(status, false);
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.zag.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            zad(new zaf(listenerKey, new TaskCompletionSource()));
        }
        zaN(new ConnectionResult(4, null, null));
        if (this.zac.isConnected()) {
            new m1(this, 19).onSignOutComplete();
        }
    }

    public final void zam() {
        GoogleApiManager googleApiManager = this.zaa;
        zzae.checkHandlerThread(googleApiManager.zas);
        GmsClient gmsClient = this.zac;
        if (gmsClient.isConnected()) {
            return;
        }
        GmsClient gmsClient2 = gmsClient;
        if (gmsClient2.isConnecting()) {
            return;
        }
        try {
            int zaa = googleApiManager.zal.zaa(googleApiManager.zaj, gmsClient);
            if (zaa != 0) {
                ConnectionResult connectionResult = new ConnectionResult(zaa, null, null);
                String name = gmsClient.getClass().getName();
                String connectionResult2 = connectionResult.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + connectionResult2.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(connectionResult2);
                Log.w("GoogleApiManager", sb.toString());
                zac(connectionResult, null);
                return;
            }
            zabn zabnVar = new zabn(googleApiManager, gmsClient, this.zad);
            if (gmsClient.requiresSignIn()) {
                zacm zacmVar = this.zai;
                zzae.checkNotNull(zacmVar);
                SignInClientImpl signInClientImpl = zacmVar.zag;
                if (signInClientImpl != null) {
                    signInClientImpl.disconnect();
                }
                Reward$Adapter reward$Adapter = zacmVar.zaf;
                reward$Adapter.boost_attributesAdapter = Integer.valueOf(System.identityHashCode(zacmVar));
                zaa zaaVar = zacmVar.zad;
                Context context = zacmVar.zab;
                Handler handler = zacmVar.zac;
                zacmVar.zag = (SignInClientImpl) zaaVar.buildClient(context, handler.getLooper(), reward$Adapter, (SignInOptions) reward$Adapter.boost_detail_rowsAdapter, zacmVar, zacmVar);
                zacmVar.zah = zabnVar;
                Set set = zacmVar.zae;
                if (set == null || set.isEmpty()) {
                    handler.post(new Client.AnonymousClass7(zacmVar));
                } else {
                    zacmVar.zag.zad();
                }
            }
            try {
                gmsClient2.connect(zabnVar);
            } catch (SecurityException e) {
                zac(new ConnectionResult(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            zac(new ConnectionResult(10, null, null), e2);
        }
    }
}
