package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.bugsnag.android.Client;
import com.fillr.embedded.profile.FEMainActivity;
import com.fillr.n;
import com.google.android.gms.auth.api.signin.internal.zbc;
import com.google.android.gms.auth.api.signin.internal.zbi;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.tasks.zzb;
import com.squareup.cash.boost.db.Reward$Adapter;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class zax implements zabv {
    public final Context zaa;
    public final zaaz zab;
    public final Looper zac;
    public final zabd zad;
    public final zabd zae;
    public final Map zaf;
    public final GmsClient zah;
    public Bundle zai;
    public final Lock zam;
    public final Set zag = Collections.newSetFromMap(new WeakHashMap());
    public ConnectionResult zaj = null;
    public ConnectionResult zak = null;
    public boolean zal = false;
    public int zan = 0;

    public zax(FEMainActivity fEMainActivity, zaaz zaazVar, ReentrantLock reentrantLock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, ArrayMap arrayMap, ArrayMap arrayMap2, Reward$Adapter reward$Adapter, zaa zaaVar, GmsClient gmsClient, ArrayList arrayList, ArrayList arrayList2, ArrayMap arrayMap3, ArrayMap arrayMap4) {
        this.zaa = fEMainActivity;
        this.zab = zaazVar;
        this.zam = reentrantLock;
        this.zac = looper;
        this.zah = gmsClient;
        this.zad = new zabd(fEMainActivity, zaazVar, reentrantLock, looper, googleApiAvailabilityLight, arrayMap2, null, arrayMap4, null, arrayList2, new zzb(this, 15));
        this.zae = new zabd(fEMainActivity, zaazVar, reentrantLock, looper, googleApiAvailabilityLight, arrayMap, reward$Adapter, arrayMap3, zaaVar, arrayList, new n.b(this, 19));
        ArrayMap arrayMap5 = new ArrayMap(0);
        Iterator it = ((ArrayMap.KeySet) arrayMap2.keySet()).iterator();
        while (it.hasNext()) {
            arrayMap5.put((Api.ClientKey) it.next(), this.zad);
        }
        Iterator it2 = ((ArrayMap.KeySet) arrayMap.keySet()).iterator();
        while (it2.hasNext()) {
            arrayMap5.put((Api.ClientKey) it2.next(), this.zae);
        }
        this.zaf = Collections.unmodifiableMap(arrayMap5);
    }

    public final void zaA() {
        Set set = this.zag;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((zbc) it.next()).zba.release();
        }
        set.clear();
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final zbi zac(zbi zbiVar) {
        zabd zabdVar = (zabd) this.zaf.get(zbiVar.clientKey);
        zzae.checkNotNull(zabdVar, "GoogleApiClient is not configured to use the API required for this call.");
        zabd zabdVar2 = this.zae;
        if (zabdVar != zabdVar2) {
            zabd zabdVar3 = this.zad;
            zabdVar3.getClass();
            zbiVar.zak();
            return zabdVar3.zan.zac(zbiVar);
        }
        ConnectionResult connectionResult = this.zak;
        if (connectionResult == null || connectionResult.zzb != 4) {
            zabdVar2.getClass();
            zbiVar.zak();
            return zabdVar2.zan.zac(zbiVar);
        }
        GmsClient gmsClient = this.zah;
        zbiVar.setFailedResult(new Status(4, null, gmsClient == null ? null : PendingIntent.getActivity(this.zaa, System.identityHashCode(this.zab), gmsClient.getSignInIntent(), com.google.android.gms.internal.base.zak.zaa | 134217728), null));
        return zbiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zae() {
        this.zan = 2;
        this.zal = false;
        this.zak = null;
        this.zaj = null;
        this.zad.zae();
        this.zae.zae();
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zah() {
        this.zak = null;
        this.zaj = null;
        this.zan = 0;
        this.zad.zah();
        this.zae.zah();
        zaA();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r4.zan == 1) goto L16;
     */
    @Override // com.google.android.gms.common.api.internal.zabv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zai() {
        this.zam.lock();
        try {
            boolean z = false;
            if (this.zad.zan instanceof zaag) {
                if (!(this.zae.zan instanceof zaag)) {
                    ConnectionResult connectionResult = this.zak;
                    if (!(connectionResult != null && connectionResult.zzb == 4)) {
                    }
                }
                z = true;
            }
            return z;
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final boolean zak(zbc zbcVar) {
        Lock lock;
        this.zam.lock();
        try {
            lock = this.zam;
            lock.lock();
            try {
                boolean z = true;
                boolean z2 = this.zan == 2;
                lock.unlock();
                if (!z2) {
                    if (zai()) {
                    }
                    z = false;
                    return z;
                }
                zabd zabdVar = this.zae;
                if (!(zabdVar.zan instanceof zaag)) {
                    this.zag.add(zbcVar);
                    if (this.zan == 0) {
                        this.zan = 1;
                    }
                    this.zak = null;
                    zabdVar.zae();
                    return z;
                }
                z = false;
                return z;
            } finally {
                lock.unlock();
            }
        } finally {
            lock = this.zam;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zam() {
        Lock lock = this.zam;
        lock.lock();
        try {
            lock.lock();
            try {
                boolean z = this.zan == 2;
                lock.unlock();
                this.zae.zah();
                this.zak = new ConnectionResult(4, null, null);
                if (z) {
                    new com.google.android.gms.internal.base.zao(this.zac, 0).post(new Client.AnonymousClass7(this, 26));
                } else {
                    zaA();
                }
            } finally {
                lock.unlock();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zan(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.zae.zan(str.concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.zad.zan(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final void zao() {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3;
        ConnectionResult connectionResult4 = this.zaj;
        zabd zabdVar = this.zad;
        if (connectionResult4 == null || !connectionResult4.isSuccess()) {
            ConnectionResult connectionResult5 = this.zaj;
            zabd zabdVar2 = this.zae;
            if (connectionResult5 != null && (connectionResult2 = this.zak) != null && connectionResult2.isSuccess()) {
                zabdVar2.zah();
                ConnectionResult connectionResult6 = this.zaj;
                zzae.checkNotNull(connectionResult6);
                zaz(connectionResult6);
                return;
            }
            ConnectionResult connectionResult7 = this.zaj;
            if (connectionResult7 == null || (connectionResult = this.zak) == null) {
                return;
            }
            if (zabdVar2.zaf < zabdVar.zaf) {
                connectionResult7 = connectionResult;
            }
            zaz(connectionResult7);
            return;
        }
        ConnectionResult connectionResult8 = this.zak;
        if ((connectionResult8 == null || !connectionResult8.isSuccess()) && ((connectionResult3 = this.zak) == null || connectionResult3.zzb != 4)) {
            if (connectionResult3 != null) {
                if (this.zan == 1) {
                    zaA();
                    return;
                } else {
                    zaz(connectionResult3);
                    zabdVar.zah();
                    return;
                }
            }
            return;
        }
        int i = this.zan;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                this.zan = 0;
            } else {
                zaaz zaazVar = this.zab;
                zzae.checkNotNull(zaazVar);
                zaazVar.zaa(this.zai);
            }
        }
        zaA();
        this.zan = 0;
    }

    public final void zaz(ConnectionResult connectionResult) {
        int i = this.zan;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.zan = 0;
            }
            this.zab.zab(connectionResult);
        }
        zaA();
        this.zan = 0;
    }
}
