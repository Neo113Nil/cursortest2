package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import androidx.collection.ArrayMap;
import coil3.size.DimensionKt;
import com.fillr.n;
import com.google.android.gms.auth.api.signin.internal.zbc;
import com.google.android.gms.auth.api.signin.internal.zbi;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.withpersona.sdk2.inquiry.device.EmulatorDeviceUtilsKt;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes4.dex */
public final class zabd implements zabv, GoogleApiClient.ConnectionCallbacks {
    public final Map zaa;
    public final HashMap zab = new HashMap();
    public final Reward$Adapter zac;
    public final Map zad;
    public final DimensionKt zae;
    public int zaf;
    public final zaaz zag;
    public final zabu zah;
    public final Lock zai;
    public final Condition zaj;
    public final Context zak;
    public final GoogleApiAvailabilityLight zal;
    public final zaax zam;
    public volatile zaba zan;

    public zabd(Context context, zaaz zaazVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, ArrayMap arrayMap, Reward$Adapter reward$Adapter, ArrayMap arrayMap2, DimensionKt dimensionKt, ArrayList arrayList, zabu zabuVar) {
        this.zak = context;
        this.zai = lock;
        this.zal = googleApiAvailabilityLight;
        this.zaa = arrayMap;
        this.zac = reward$Adapter;
        this.zad = arrayMap2;
        this.zae = dimensionKt;
        this.zag = zaazVar;
        this.zah = zabuVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zas) arrayList.get(i)).zac = this;
        }
        this.zam = new zaax(this, looper, 1);
        this.zaj = lock.newCondition();
        this.zan = new n.b(this, 18);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.zai.lock();
        try {
            this.zan.zaf(bundle);
        } finally {
            this.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zai.lock();
        try {
            this.zan.zah(i);
        } finally {
            this.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final zbi zac(zbi zbiVar) {
        zbiVar.zak();
        return this.zan.zac(zbiVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zae() {
        this.zan.zae();
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zah() {
        if (this.zan.zad()) {
            this.zab.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final boolean zai() {
        return this.zan instanceof zaag;
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final boolean zak(zbc zbcVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zam() {
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zan(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        zzaa zzaaVar;
        long j;
        printWriter.append((CharSequence) str).append("mState=").println(this.zan);
        for (Api api : this.zad.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) api.zac).println(":");
            GmsClient gmsClient = (GmsClient) this.zaa.get(api.zab);
            zzae.checkNotNull(gmsClient);
            String concat = str.concat("  ");
            GmsClient gmsClient2 = gmsClient;
            synchronized (gmsClient2.zzp) {
                i = gmsClient2.zzv;
                iInterface = gmsClient2.zzs;
            }
            synchronized (gmsClient2.zzq) {
                zzaaVar = gmsClient2.zzr;
            }
            printWriter.append((CharSequence) concat).append("mConnectState=");
            if (i == 1) {
                printWriter.print("DISCONNECTED");
            } else if (i == 2) {
                printWriter.print("REMOTE_CONNECTING");
            } else if (i == 3) {
                printWriter.print("LOCAL_CONNECTING");
            } else if (i == 4) {
                printWriter.print("CONNECTED");
            } else if (i != 5) {
                printWriter.print("UNKNOWN");
            } else {
                printWriter.print("DISCONNECTING");
            }
            printWriter.append(" mService=");
            if (iInterface == null) {
                printWriter.append("null");
            } else {
                printWriter.append((CharSequence) gmsClient2.getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
            }
            printWriter.append(" mServiceBroker=");
            if (zzaaVar == null) {
                printWriter.println("null");
            } else {
                printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(zzaaVar.zza)));
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            if (gmsClient2.zzh > 0) {
                PrintWriter append = printWriter.append((CharSequence) concat).append("lastConnectedTime=");
                long j2 = gmsClient2.zzh;
                j = 0;
                String format2 = simpleDateFormat.format(new Date(j2));
                StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 1 + String.valueOf(format2).length());
                sb.append(j2);
                sb.append(" ");
                sb.append(format2);
                append.println(sb.toString());
            } else {
                j = 0;
            }
            if (gmsClient2.zzg > j) {
                printWriter.append((CharSequence) concat).append("lastSuspendedCause=");
                int i2 = gmsClient2.zzf;
                if (i2 == 1) {
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                } else if (i2 == 2) {
                    printWriter.append("CAUSE_NETWORK_LOST");
                } else if (i2 != 3) {
                    printWriter.append((CharSequence) String.valueOf(i2));
                } else {
                    printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                }
                PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
                long j3 = gmsClient2.zzg;
                String format3 = simpleDateFormat.format(new Date(j3));
                StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 1 + String.valueOf(format3).length());
                sb2.append(j3);
                sb2.append(" ");
                sb2.append(format3);
                append2.println(sb2.toString());
            }
            if (gmsClient2.zzj > j) {
                printWriter.append((CharSequence) concat).append("lastFailedStatus=").append((CharSequence) EmulatorDeviceUtilsKt.getStatusCodeString(gmsClient2.zzi));
                PrintWriter append3 = printWriter.append(" lastFailedTime=");
                long j4 = gmsClient2.zzj;
                String format4 = simpleDateFormat.format(new Date(j4));
                StringBuilder sb3 = new StringBuilder(String.valueOf(j4).length() + 1 + String.valueOf(format4).length());
                sb3.append(j4);
                sb3.append(" ");
                sb3.append(format4);
                append3.println(sb3.toString());
            }
        }
    }

    public final void zaq() {
        this.zai.lock();
        try {
            this.zan = new n.b(this, 18);
            this.zan.zaa();
            this.zaj.signalAll();
        } finally {
            this.zai.unlock();
        }
    }
}
