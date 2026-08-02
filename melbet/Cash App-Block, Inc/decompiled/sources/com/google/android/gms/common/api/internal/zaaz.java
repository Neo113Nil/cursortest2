package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.ArrayMap;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.OneShotDisposable;
import com.fillr.embedded.profile.FEMainActivity;
import com.google.android.gms.auth.api.signin.internal.zbc;
import com.google.android.gms.auth.api.signin.internal.zbe;
import com.google.android.gms.auth.api.signin.internal.zbi;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.signin.zad;
import com.google.android.gms.tasks.zzb;
import com.squareup.cash.boost.db.Reward$Adapter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class zaaz extends GoogleApiClient implements zabu {
    public final LinkedList zaa;
    public zabs zab;
    public final ArrayMap zac;
    public Set zad;
    public final Reward$Adapter zae;
    public final ArrayMap zaf;
    public final zaa zag;
    public final zaz zai;
    public final ReentrantLock zaj;
    public final com.google.android.gms.common.internal.zan zak;
    public zabv zal;
    public final int zam;
    public final FEMainActivity zan;
    public final Looper zao;
    public volatile boolean zap;
    public final long zaq;
    public final long zar;
    public final zaax zas;
    public final GoogleApiAvailability zat;
    public final zzb zau;
    public final ArrayList zav;
    public Integer zaw;

    public zaaz(FEMainActivity fEMainActivity, ReentrantLock reentrantLock, Looper looper, Reward$Adapter reward$Adapter, GoogleApiAvailability googleApiAvailability, ArrayMap arrayMap, ArrayList arrayList, ArrayList arrayList2, ArrayMap arrayMap2, int i, ArrayList arrayList3) {
        zaa zaaVar = zad.zac;
        this.zal = null;
        this.zaa = new LinkedList();
        this.zaq = 120000L;
        this.zar = 5000L;
        this.zad = new HashSet();
        this.zau = new zzb(14);
        this.zaw = null;
        OneShotDisposable oneShotDisposable = new OneShotDisposable(this, 17);
        this.zan = fEMainActivity;
        this.zaj = reentrantLock;
        this.zak = new com.google.android.gms.common.internal.zan(looper, oneShotDisposable);
        this.zao = looper;
        this.zas = new zaax(this, looper, 0);
        this.zat = googleApiAvailability;
        this.zam = 1;
        this.zaw = Integer.valueOf(i);
        this.zaf = arrayMap;
        this.zac = arrayMap2;
        this.zav = arrayList3;
        this.zai = new zaz();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
            com.google.android.gms.common.internal.zan zanVar = this.zak;
            zanVar.getClass();
            zzae.checkNotNull(connectionCallbacks);
            synchronized (zanVar.zai) {
                try {
                    ArrayList arrayList4 = zanVar.zac;
                    if (arrayList4.contains(connectionCallbacks)) {
                        String valueOf = String.valueOf(connectionCallbacks);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                        sb.append("registerConnectionCallbacks(): listener ");
                        sb.append(valueOf);
                        sb.append(" is already registered");
                        Log.w("GmsClientEvents", sb.toString());
                    } else {
                        arrayList4.add(connectionCallbacks);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zanVar.zab.isConnected()) {
                com.google.android.gms.internal.base.zao zaoVar = zanVar.zah;
                zaoVar.sendMessage(zaoVar.obtainMessage(1, connectionCallbacks));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.zak.zai((GoogleApiClient.OnConnectionFailedListener) it2.next());
        }
        this.zae = reward$Adapter;
        this.zag = zaaVar;
    }

    public static int zaf(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            GmsClient gmsClient = (GmsClient) it.next();
            z2 |= gmsClient.requiresSignIn();
            z3 |= gmsClient instanceof zbe;
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }

    public final void connect() {
        ReentrantLock reentrantLock = this.zaj;
        reentrantLock.lock();
        try {
            int i = this.zam;
            Integer num = this.zaw;
            int i2 = 2;
            boolean z = false;
            if (i >= 0) {
                zzae.checkState("Sign-in mode should have been set explicitly by auto-manage.", num != null);
            } else if (num == null) {
                this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            Integer num2 = this.zaw;
            zzae.checkNotNull(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i2 = intValue;
                } else if (intValue != 2) {
                    i2 = intValue;
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(i2);
                    zzae.checkArgument(sb.toString(), z);
                    zam(i2);
                    zan();
                    reentrantLock.unlock();
                    return;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 22);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i2);
                zzae.checkArgument(sb2.toString(), z);
                zam(i2);
                zan();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void disconnect() {
        ReentrantLock reentrantLock = this.zaj;
        reentrantLock.lock();
        try {
            this.zai.zab();
            zabv zabvVar = this.zal;
            if (zabvVar != null) {
                zabvVar.zah();
            }
            Set set = (Set) this.zau.zza;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((ListenerHolder) it.next()).zab = null;
            }
            set.clear();
            LinkedList<zbi> linkedList = this.zaa;
            for (zbi zbiVar : linkedList) {
                zbiVar.zai.set(null);
                zbiVar.cancel();
            }
            linkedList.clear();
            if (this.zal != null) {
                zad();
                com.google.android.gms.common.internal.zan zanVar = this.zak;
                zanVar.zae = false;
                zanVar.zaf.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.zan);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.zap);
        printWriter.append(" mWorkQueue.size()=").print(this.zaa.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(((Set) this.zai.f62zaa).size());
        zabv zabvVar = this.zal;
        if (zabvVar != null) {
            zabvVar.zan(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.zao;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(zbc zbcVar) {
        zabv zabvVar = this.zal;
        return zabvVar != null && zabvVar.zak(zbcVar);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        zabv zabvVar = this.zal;
        if (zabvVar != null) {
            zabvVar.zam();
        }
    }

    public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        com.google.android.gms.common.internal.zan zanVar = this.zak;
        zanVar.getClass();
        synchronized (zanVar.zai) {
            try {
                if (!zanVar.zad.remove(onConnectionFailedListener)) {
                    String valueOf = String.valueOf(onConnectionFailedListener);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 57);
                    sb.append("unregisterConnectionFailedListener(): listener ");
                    sb.append(valueOf);
                    sb.append(" not found");
                    Log.w("GmsClientEvents", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zaa(Bundle bundle) {
        while (true) {
            LinkedList linkedList = this.zaa;
            if (linkedList.isEmpty()) {
                com.google.android.gms.common.internal.zan zanVar = this.zak;
                com.google.android.gms.internal.base.zao zaoVar = zanVar.zah;
                if (Looper.myLooper() != zaoVar.getLooper()) {
                    a$$ExternalSyntheticBUOutline0.m$1("onConnectionSuccess must only be called on the Handler thread");
                    return;
                }
                synchronized (zanVar.zai) {
                    try {
                        zzae.checkState(!zanVar.zag);
                        zaoVar.removeMessages(1);
                        zanVar.zag = true;
                        ArrayList arrayList = zanVar.zaa;
                        zzae.checkState(arrayList.isEmpty());
                        ArrayList arrayList2 = new ArrayList(zanVar.zac);
                        AtomicInteger atomicInteger = zanVar.zaf;
                        int i = atomicInteger.get();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                            if (!zanVar.zae || !zanVar.zab.isConnected() || atomicInteger.get() != i) {
                                break;
                            } else if (!arrayList.contains(connectionCallbacks)) {
                                connectionCallbacks.onConnected(bundle);
                            }
                        }
                        arrayList.clear();
                        zanVar.zag = false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            zbi zbiVar = (zbi) linkedList.remove();
            ArrayMap arrayMap = this.zac;
            Api api = zbiVar.api;
            boolean containsKey = arrayMap.containsKey(zbiVar.clientKey);
            String str = api != null ? api.zac : "the API";
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
            sb.append("GoogleApiClient is not configured to use ");
            sb.append(str);
            sb.append(" required for this call.");
            zzae.checkArgument(sb.toString(), containsKey);
            ReentrantLock reentrantLock = this.zaj;
            reentrantLock.lock();
            try {
                zabv zabvVar = this.zal;
                if (zabvVar == null) {
                    throw new IllegalStateException("GoogleApiClient is not connected yet.");
                }
                if (this.zap) {
                    LinkedList linkedList2 = this.zaa;
                    linkedList2.add(zbiVar);
                    while (!linkedList2.isEmpty()) {
                        zbi zbiVar2 = (zbi) linkedList2.remove();
                        zaz zazVar = this.zai;
                        ((Set) zazVar.f62zaa).add(zbiVar2);
                        zbiVar2.zai.set((zact) zazVar.zab);
                        zbiVar2.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                    }
                    reentrantLock.unlock();
                } else {
                    zabvVar.zac(zbiVar);
                }
            } finally {
                this.zaj.unlock();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zab(ConnectionResult connectionResult) {
        GoogleApiAvailability googleApiAvailability = this.zat;
        FEMainActivity fEMainActivity = this.zan;
        int i = connectionResult.zzb;
        googleApiAvailability.getClass();
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.sCanceledAvailabilityNotification;
        if (!(i == 18 ? true : i == 1 ? GooglePlayServicesUtilLight.zza(fEMainActivity) : false)) {
            zad();
        }
        if (this.zap) {
            return;
        }
        com.google.android.gms.common.internal.zan zanVar = this.zak;
        com.google.android.gms.internal.base.zao zaoVar = zanVar.zah;
        if (Looper.myLooper() != zaoVar.getLooper()) {
            a$$ExternalSyntheticBUOutline0.m$1("onConnectionFailure must only be called on the Handler thread");
            return;
        }
        zaoVar.removeMessages(1);
        synchronized (zanVar.zai) {
            try {
                ArrayList arrayList = zanVar.zad;
                ArrayList arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = zanVar.zaf;
                int i2 = atomicInteger.get();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener) it.next();
                    if (zanVar.zae && atomicInteger.get() == i2) {
                        if (arrayList.contains(onConnectionFailedListener)) {
                            onConnectionFailedListener.onConnectionFailed(connectionResult);
                        }
                    }
                }
            } finally {
            }
        }
        zanVar.zae = false;
        zanVar.zaf.incrementAndGet();
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zac(int i) {
        if (i == 1) {
            if (!this.zap) {
                this.zap = true;
                if (this.zab == null) {
                    try {
                        GoogleApiAvailability googleApiAvailability = this.zat;
                        Context applicationContext = this.zan.getApplicationContext();
                        zaay zaayVar = new zaay(this);
                        googleApiAvailability.getClass();
                        this.zab = GoogleApiAvailability.zag(applicationContext, zaayVar);
                    } catch (SecurityException unused) {
                    }
                }
                zaax zaaxVar = this.zas;
                zaaxVar.sendMessageDelayed(zaaxVar.obtainMessage(1), this.zaq);
                zaaxVar.sendMessageDelayed(zaaxVar.obtainMessage(2), this.zar);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) ((Set) this.zai.f62zaa).toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(zaz.zaa);
        }
        com.google.android.gms.common.internal.zan zanVar = this.zak;
        com.google.android.gms.internal.base.zao zaoVar = zanVar.zah;
        if (Looper.myLooper() != zaoVar.getLooper()) {
            a$$ExternalSyntheticBUOutline0.m$1("onUnintentionalDisconnection must only be called on the Handler thread");
            return;
        }
        zaoVar.removeMessages(1);
        synchronized (zanVar.zai) {
            try {
                zanVar.zag = true;
                ArrayList arrayList = zanVar.zac;
                ArrayList arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = zanVar.zaf;
                int i2 = atomicInteger.get();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                    if (!zanVar.zae || atomicInteger.get() != i2) {
                        break;
                    } else if (arrayList.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnectionSuspended(i);
                    }
                }
                zanVar.zaa.clear();
                zanVar.zag = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        zanVar.zae = false;
        zanVar.zaf.incrementAndGet();
        if (i == 2) {
            zan();
        }
    }

    public final boolean zad() {
        if (!this.zap) {
            return false;
        }
        this.zap = false;
        zaax zaaxVar = this.zas;
        zaaxVar.removeMessages(2);
        zaaxVar.removeMessages(1);
        zabs zabsVar = this.zab;
        if (zabsVar != null) {
            zabsVar.zab();
            this.zab = null;
        }
        return true;
    }

    public final /* synthetic */ void zai() {
        this.zaj.lock();
        try {
            if (this.zap) {
                zan();
            }
        } finally {
            this.zaj.unlock();
        }
    }

    public final void zam(int i) {
        ReentrantLock reentrantLock;
        Integer num = this.zaw;
        if (num == null) {
            this.zaw = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            int intValue = this.zaw.intValue();
            String str = intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            String str2 = i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            throw new IllegalStateException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(str.length() + str2.length() + 51), "Cannot use sign-in mode: ", str2, ". Mode was already set to ", str));
        }
        if (this.zal != null) {
            return;
        }
        ArrayMap arrayMap = this.zac;
        Iterator it = ((ArrayMap.ValueCollection) arrayMap.values()).iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            GmsClient gmsClient = (GmsClient) it.next();
            z |= gmsClient.requiresSignIn();
            z2 |= gmsClient instanceof zbe;
        }
        int intValue2 = this.zaw.intValue();
        ArrayList arrayList = this.zav;
        ArrayMap arrayMap2 = this.zaf;
        ReentrantLock reentrantLock2 = this.zaj;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z) {
                a$$ExternalSyntheticBUOutline0.m$1("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                return;
            } else {
                if (z2) {
                    a$$ExternalSyntheticBUOutline0.m$1("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    return;
                }
                arrayMap = arrayMap;
            }
        } else {
            if (intValue2 == 2 && z) {
                ArrayMap arrayMap3 = new ArrayMap(0);
                ArrayMap arrayMap4 = new ArrayMap(0);
                Iterator it2 = ((ArrayMap.EntrySet) arrayMap.entrySet()).iterator();
                GmsClient gmsClient2 = null;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    GmsClient gmsClient3 = (GmsClient) entry.getValue();
                    GmsClient gmsClient4 = gmsClient3;
                    gmsClient4.getClass();
                    if (true == (gmsClient4 instanceof zbe)) {
                        gmsClient2 = gmsClient3;
                    }
                    if (gmsClient3.requiresSignIn()) {
                        arrayMap3.put((Api.ClientKey) entry.getKey(), gmsClient3);
                    } else {
                        arrayMap4.put((Api.ClientKey) entry.getKey(), gmsClient3);
                    }
                }
                zzae.checkState("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !arrayMap3.isEmpty());
                ArrayMap arrayMap5 = new ArrayMap(0);
                ArrayMap arrayMap6 = new ArrayMap(0);
                Iterator it3 = ((ArrayMap.KeySet) arrayMap2.keySet()).iterator();
                while (it3.hasNext()) {
                    Api api = (Api) it3.next();
                    Api.ClientKey clientKey = api.zab;
                    if (arrayMap3.containsKey(clientKey)) {
                        arrayMap5.put(api, (Boolean) arrayMap2.get(api));
                    } else {
                        if (!arrayMap4.containsKey(clientKey)) {
                            a$$ExternalSyntheticBUOutline0.m$1("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                            return;
                        }
                        arrayMap6.put(api, (Boolean) arrayMap2.get(api));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    zas zasVar = (zas) arrayList.get(i2);
                    Api api2 = zasVar.zaa;
                    if (arrayMap5.containsKey(api2)) {
                        arrayList2.add(zasVar);
                    } else {
                        if (!arrayMap6.containsKey(api2)) {
                            a$$ExternalSyntheticBUOutline0.m$1("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                            return;
                        }
                        arrayList3.add(zasVar);
                    }
                }
                this.zal = new zax(this.zan, this, reentrantLock2, this.zao, this.zat, arrayMap3, arrayMap4, this.zae, this.zag, gmsClient2, arrayList2, arrayList3, arrayMap5, arrayMap6);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.zal = new zabd(this.zan, this, reentrantLock, this.zao, this.zat, arrayMap, this.zae, arrayMap2, this.zag, arrayList, this);
    }

    public final void zan() {
        this.zak.zae = true;
        zabv zabvVar = this.zal;
        zzae.checkNotNull(zabvVar);
        zabvVar.zae();
    }
}
