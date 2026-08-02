package com.google.android.gms.common.api;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.internal.zbc;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class GoogleApiClient {
    public static final Set zaa = Collections.newSetFromMap(new WeakHashMap());

    public interface ConnectionCallbacks {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public abstract Looper getLooper();

    public boolean maybeSignIn(zbc zbcVar) {
        throw new UnsupportedOperationException();
    }

    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }
}
