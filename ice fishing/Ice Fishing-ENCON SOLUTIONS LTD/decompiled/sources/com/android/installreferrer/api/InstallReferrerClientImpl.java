package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import i0.AbstractBinderC0243b;
import i0.C0242a;
import i0.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
class InstallReferrerClientImpl extends InstallReferrerClient {
    private static final int PLAY_STORE_MIN_APP_VER = 80837300;
    private static final String SERVICE_ACTION_NAME = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";
    private static final String SERVICE_NAME = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";
    private static final String SERVICE_PACKAGE_NAME = "com.android.vending";
    private static final String TAG = "InstallReferrerClient";
    private int clientState = 0;
    private final Context mApplicationContext;
    private c service;
    private ServiceConnection serviceConnection;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    public final class InstallReferrerServiceConnection implements ServiceConnection {
        private final InstallReferrerStateListener mListener;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            c c0242a;
            AbstractC1050a.r("Install Referrer service connected.");
            InstallReferrerClientImpl installReferrerClientImpl = InstallReferrerClientImpl.this;
            int i2 = AbstractBinderC0243b.f3398a;
            if (iBinder == null) {
                c0242a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                c0242a = queryLocalInterface instanceof c ? (c) queryLocalInterface : new C0242a(iBinder);
            }
            installReferrerClientImpl.service = c0242a;
            InstallReferrerClientImpl.this.clientState = 2;
            this.mListener.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            AbstractC1050a.s("Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.service = null;
            InstallReferrerClientImpl.this.clientState = 0;
            this.mListener.onInstallReferrerServiceDisconnected();
        }

        private InstallReferrerServiceConnection(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.mListener = installReferrerStateListener;
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.mApplicationContext = context.getApplicationContext();
    }

    private boolean isPlayStoreCompatible() {
        return this.mApplicationContext.getPackageManager().getPackageInfo(SERVICE_PACKAGE_NAME, 128).versionCode >= PLAY_STORE_MIN_APP_VER;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        this.clientState = 3;
        if (this.serviceConnection != null) {
            AbstractC1050a.r("Unbinding from service.");
            this.mApplicationContext.unbindService(this.serviceConnection);
            this.serviceConnection = null;
        }
        this.service = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails getInstallReferrer() {
        if (!isReady()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.mApplicationContext.getPackageName());
        try {
            return new ReferrerDetails(((C0242a) this.service).a(bundle));
        } catch (RemoteException e2) {
            AbstractC1050a.s("RemoteException getting install referrer information");
            this.clientState = 0;
            throw e2;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.clientState != 2 || this.service == null || this.serviceConnection == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            AbstractC1050a.r("Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i2 = this.clientState;
        if (i2 == 1) {
            AbstractC1050a.s("Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i2 == 3) {
            AbstractC1050a.s("Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        AbstractC1050a.r("Starting install referrer service setup.");
        Intent intent = new Intent(SERVICE_ACTION_NAME);
        intent.setComponent(new ComponentName(SERVICE_PACKAGE_NAME, SERVICE_NAME));
        List<ResolveInfo> queryIntentServices = this.mApplicationContext.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.clientState = 0;
            AbstractC1050a.r("Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!SERVICE_PACKAGE_NAME.equals(str) || str2 == null || !isPlayStoreCompatible()) {
            AbstractC1050a.s("Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.clientState = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        Intent intent2 = new Intent(intent);
        InstallReferrerServiceConnection installReferrerServiceConnection = new InstallReferrerServiceConnection(installReferrerStateListener);
        this.serviceConnection = installReferrerServiceConnection;
        try {
            if (this.mApplicationContext.bindService(intent2, installReferrerServiceConnection, 1)) {
                AbstractC1050a.r("Service was bonded successfully.");
                return;
            }
            AbstractC1050a.s("Connection to service is blocked.");
            this.clientState = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(1);
        } catch (SecurityException unused) {
            AbstractC1050a.s("No permission to connect to service.");
            this.clientState = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(4);
        }
    }
}
