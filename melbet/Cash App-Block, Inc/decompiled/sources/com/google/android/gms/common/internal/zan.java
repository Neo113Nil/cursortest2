package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import coil3.request.OneShotDisposable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.base.zao;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class zan implements Handler.Callback {
    public final OneShotDisposable zab;
    public final zao zah;
    public final ArrayList zac = new ArrayList();
    public final ArrayList zaa = new ArrayList();
    public final ArrayList zad = new ArrayList();
    public volatile boolean zae = false;
    public final AtomicInteger zaf = new AtomicInteger(0);
    public boolean zag = false;
    public final Object zai = new Object();

    public zan(Looper looper, OneShotDisposable oneShotDisposable) {
        this.zab = oneShotDisposable;
        this.zah = new zao(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.wtf("GmsClientEvents", Boxes$$ExternalSyntheticOutline1.m(i, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i).length() + 34)), new Exception());
            return false;
        }
        GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
        synchronized (this.zai) {
            try {
                if (this.zae && this.zab.isConnected() && this.zac.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final void zai(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        zzae.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            try {
                ArrayList arrayList = this.zad;
                if (arrayList.contains(onConnectionFailedListener)) {
                    String valueOf = String.valueOf(onConnectionFailedListener);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 67);
                    sb.append("registerConnectionFailedListener(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    arrayList.add(onConnectionFailedListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
