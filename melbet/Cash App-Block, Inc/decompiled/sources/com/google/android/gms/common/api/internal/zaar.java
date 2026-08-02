package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import coil3.size.DimensionKt;
import com.bugsnag.android.Client;
import com.google.android.gms.auth.api.signin.internal.zbi;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.SignInClientImpl;
import com.squareup.cash.boost.db.Reward$Adapter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* loaded from: classes4.dex */
public final class zaar implements zaba {
    public final zabd zaa;
    public final Lock zab;
    public final Context zac;
    public final GoogleApiAvailabilityLight zad;
    public ConnectionResult zae;
    public int zaf;
    public int zah;
    public SignInClientImpl zak;
    public boolean zal;
    public boolean zam;
    public boolean zan;
    public IAccountAccessor zao;
    public boolean zap;
    public boolean zaq;
    public final Reward$Adapter zar;
    public final Map zas;
    public final DimensionKt zat;
    public int zag = 0;
    public final Bundle zai = new Bundle();
    public final HashSet zaj = new HashSet();
    public final ArrayList zau = new ArrayList();

    public zaar(zabd zabdVar, Reward$Adapter reward$Adapter, Map map, GoogleApiAvailabilityLight googleApiAvailabilityLight, DimensionKt dimensionKt, Lock lock, Context context) {
        this.zaa = zabdVar;
        this.zar = reward$Adapter;
        this.zas = map;
        this.zad = googleApiAvailabilityLight;
        this.zat = dimensionKt;
        this.zab = lock;
        this.zac = context;
    }

    public final void zaA() {
        if (this.zah != 0) {
            return;
        }
        if (!this.zam || this.zan) {
            ArrayList arrayList = new ArrayList();
            int i = 1;
            this.zag = 1;
            zabd zabdVar = this.zaa;
            Map map = zabdVar.zaa;
            this.zah = map.size();
            for (Api.ClientKey clientKey : map.keySet()) {
                if (!zabdVar.zab.containsKey(clientKey)) {
                    arrayList.add((GmsClient) map.get(clientKey));
                } else if (zaz()) {
                    zaB();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.zau.add(zabe.zaa.submit(new zaal(this, arrayList, i)));
        }
    }

    public final void zaB() {
        zabd zabdVar = this.zaa;
        zabdVar.zai.lock();
        try {
            zabdVar.zag.zad();
            zabdVar.zan = new zaag(zabdVar);
            zabdVar.zan.zaa();
            zabdVar.zaj.signalAll();
            zabdVar.zai.unlock();
            zabe.zaa.execute(new Client.AnonymousClass7(this, 22));
            SignInClientImpl signInClientImpl = this.zak;
            if (signInClientImpl != null) {
                if (this.zap) {
                    IAccountAccessor iAccountAccessor = this.zao;
                    zzae.checkNotNull(iAccountAccessor);
                    boolean z = this.zaq;
                    try {
                        com.google.android.gms.signin.internal.zaf zafVar = (com.google.android.gms.signin.internal.zaf) signInClientImpl.getService();
                        Integer num = signInClientImpl.zae;
                        zzae.checkNotNull(num);
                        int intValue = num.intValue();
                        Parcel zaa = zafVar.zaa();
                        com.google.android.gms.internal.base.zac.zac(zaa, iAccountAccessor);
                        zaa.writeInt(intValue);
                        zaa.writeInt(z ? 1 : 0);
                        zafVar.zac(zaa, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                zaG(false);
            }
            Iterator it = zabdVar.zab.keySet().iterator();
            while (it.hasNext()) {
                GmsClient gmsClient = (GmsClient) zabdVar.zaa.get((Api.ClientKey) it.next());
                zzae.checkNotNull(gmsClient);
                gmsClient.disconnect();
            }
            Bundle bundle = this.zai;
            if (true == bundle.isEmpty()) {
                bundle = null;
            }
            zabdVar.zah.zaa(bundle);
        } catch (Throwable th) {
            zabdVar.zai.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.zad.getErrorResolutionIntent(null, r3.zzb, null) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zaC(ConnectionResult connectionResult, Api api, boolean z) {
        api.zaa.getClass();
        if (z && !connectionResult.hasResolution()) {
        }
        if (this.zae == null || Integer.MAX_VALUE < this.zaf) {
            this.zae = connectionResult;
            this.zaf = Integer.MAX_VALUE;
        }
        this.zaa.zab.put(api.zab, connectionResult);
    }

    public final void zaD() {
        this.zam = false;
        zabd zabdVar = this.zaa;
        zabdVar.zag.zad = Collections.EMPTY_SET;
        Iterator it = this.zaj.iterator();
        while (it.hasNext()) {
            Api.ClientKey clientKey = (Api.ClientKey) it.next();
            HashMap hashMap = zabdVar.zab;
            if (!hashMap.containsKey(clientKey)) {
                hashMap.put(clientKey, new ConnectionResult(17, null, null));
            }
        }
    }

    public final void zaF(ConnectionResult connectionResult) {
        ArrayList arrayList = this.zau;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        zaG(!connectionResult.hasResolution());
        zabd zabdVar = this.zaa;
        zabdVar.zaq();
        zabdVar.zah.zab(connectionResult);
    }

    public final void zaG(boolean z) {
        SignInClientImpl signInClientImpl = this.zak;
        if (signInClientImpl != null) {
            if (signInClientImpl.isConnected() && z) {
                try {
                    com.google.android.gms.signin.internal.zaf zafVar = (com.google.android.gms.signin.internal.zaf) signInClientImpl.getService();
                    Integer num = signInClientImpl.zae;
                    zzae.checkNotNull(num);
                    int intValue = num.intValue();
                    Parcel zaa = zafVar.zaa();
                    zaa.writeInt(intValue);
                    zafVar.zac(zaa, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            signInClientImpl.disconnect();
            zzae.checkNotNull(this.zar);
            this.zao = null;
        }
    }

    public final boolean zaI(int i) {
        if (this.zag == i) {
            return true;
        }
        zaaz zaazVar = this.zaa.zag;
        zaazVar.getClass();
        StringWriter stringWriter = new StringWriter();
        zaazVar.dump("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i2 = this.zah;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
        sb.append("mRemainingConnections=");
        sb.append(i2);
        Log.w("GACConnecting", sb.toString());
        String str = this.zag != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        Log.e("GACConnecting", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(str2.length() + str.length() + 70), "GoogleApiClient connecting is in step ", str, " but received callback for step ", str2), new Exception());
        zaF(new ConnectionResult(8, null, null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zaa() {
        zabd zabdVar = this.zaa;
        HashMap hashMap = zabdVar.zab;
        Map map = zabdVar.zaa;
        hashMap.clear();
        int i = 0;
        this.zam = false;
        this.zae = null;
        this.zag = 0;
        this.zal = true;
        this.zan = false;
        this.zap = false;
        HashMap hashMap2 = new HashMap();
        Map map2 = this.zas;
        for (Api api : map2.keySet()) {
            GmsClient gmsClient = (GmsClient) map.get(api.zab);
            zzae.checkNotNull(gmsClient);
            api.zaa.getClass();
            boolean booleanValue = ((Boolean) map2.get(api)).booleanValue();
            if (gmsClient.requiresSignIn()) {
                this.zam = true;
                if (booleanValue) {
                    this.zaj.add(api.zab);
                } else {
                    this.zal = false;
                }
            }
            hashMap2.put(gmsClient, new zaai(this, api, booleanValue));
        }
        if (this.zam) {
            Reward$Adapter reward$Adapter = this.zar;
            zzae.checkNotNull(reward$Adapter);
            DimensionKt dimensionKt = this.zat;
            zzae.checkNotNull(dimensionKt);
            zaaz zaazVar = zabdVar.zag;
            reward$Adapter.boost_attributesAdapter = Integer.valueOf(System.identityHashCode(zaazVar));
            zaap zaapVar = new zaap(this);
            this.zak = (SignInClientImpl) dimensionKt.buildClient(this.zac, zaazVar.zao, reward$Adapter, (SignInOptions) reward$Adapter.boost_detail_rowsAdapter, zaapVar, zaapVar);
        }
        this.zah = map.size();
        this.zau.add(zabe.zaa.submit(new zaal(this, hashMap2, i)));
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final zbi zac(zbi zbiVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final boolean zad() {
        ArrayList arrayList = this.zau;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        zaG(true);
        this.zaa.zaq();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zae() {
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zaf(Bundle bundle) {
        if (zaI(1)) {
            if (bundle != null) {
                this.zai.putAll(bundle);
            }
            if (zaz()) {
                zaB();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zag(ConnectionResult connectionResult, Api api, boolean z) {
        if (zaI(1)) {
            zaC(connectionResult, api, z);
            if (zaz()) {
                zaB();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zah(int i) {
        zaF(new ConnectionResult(8, null, null));
    }

    public final boolean zaz() {
        int i = this.zah - 1;
        this.zah = i;
        if (i > 0) {
            return false;
        }
        zabd zabdVar = this.zaa;
        if (i >= 0) {
            ConnectionResult connectionResult = this.zae;
            if (connectionResult == null) {
                return true;
            }
            zabdVar.zaf = this.zaf;
            zaF(connectionResult);
            return false;
        }
        zaaz zaazVar = zabdVar.zag;
        zaazVar.getClass();
        StringWriter stringWriter = new StringWriter();
        zaazVar.dump("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        zaF(new ConnectionResult(8, null, null));
        return false;
    }
}
