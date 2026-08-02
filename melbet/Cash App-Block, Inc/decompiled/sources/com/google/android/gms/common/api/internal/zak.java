package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes4.dex */
public final class zak extends zap {
    public final SparseArray zad;

    public zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.zad = new SparseArray();
        lifecycleFragment.addCallback("AutoManageHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.zad.size(); i++) {
            zaj zai = zai(i);
            if (zai != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(zai.zaa);
                printWriter.println(":");
                zai.zab.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void onStart() {
        this.zaa = true;
        SparseArray sparseArray = this.zad;
        boolean z = this.zaa;
        String valueOf = String.valueOf(sparseArray);
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 9 + valueOf.length());
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.zab.get() == null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                zaj zai = zai(i);
                if (zai != null) {
                    zai.zab.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void onStop() {
        this.zaa = false;
        for (int i = 0; i < this.zad.size(); i++) {
            zaj zai = zai(i);
            if (zai != null) {
                zai.zab.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zad(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        SparseArray sparseArray = this.zad;
        if (((zaj) sparseArray.get(i)) != null) {
            zaj zajVar = (zaj) sparseArray.get(i);
            sparseArray.remove(i);
            if (zajVar != null) {
                zaaz zaazVar = zajVar.zab;
                zaazVar.unregisterConnectionFailedListener(zajVar);
                zaazVar.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zae() {
        for (int i = 0; i < this.zad.size(); i++) {
            zaj zai = zai(i);
            if (zai != null) {
                zai.zab.connect();
            }
        }
    }

    public final zaj zai(int i) {
        SparseArray sparseArray = this.zad;
        if (sparseArray.size() <= i) {
            return null;
        }
        return (zaj) sparseArray.get(sparseArray.keyAt(i));
    }
}
