package com.gamericefishpro.space.i9;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends x implements l0 {
    public final AtomicReference d;
    public boolean e;

    public g0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.d = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", "Unexpected object type. Expected, Received: " + cls.getCanonicalName() + ", " + obj.getClass().getCanonicalName(), e);
            throw e;
        }
    }

    @Override // com.gamericefishpro.space.i9.x
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) y.a(parcel, Bundle.CREATOR);
        y.d(parcel);
        h(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final String F(long j) {
        return (String) H(G(j), String.class);
    }

    public final Bundle G(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            if (!this.e) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.d.get();
        }
        return bundle;
    }

    @Override // com.gamericefishpro.space.i9.l0
    public final void h(Bundle bundle) {
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.e = true;
                    this.d.notify();
                } catch (Throwable th) {
                    this.d.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
