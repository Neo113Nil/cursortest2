package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.text.CatchingFishAndroidXPayPal;
import kotlin.text.CatchingFishExoPlayerRealm;
import kotlin.text.CatchingFishJUnitJUnitKtor;
import kotlin.text.CatchingFishMVIMockkService;
import kotlin.text.CatchingFishMVPFluxFirebase;
import kotlin.text.CatchingFishMoshiWidgetMVP;
import kotlin.text.CatchingFishViewPagerMockk;
import kotlin.text.CatchingFishWorkManagerMVP;
import kotlin.text.CatchingFishXMLLayoutOkHttp;

/* loaded from: classes.dex */
public abstract class EnhancedIntentService extends Service {
    public static final /* synthetic */ int CatchingFishLayout = 0;
    public CatchingFishMVIMockkService CatchingFishDaggerWebsocket;
    public final ExecutorService CatchingFishReduxKtor;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public final Object CatchingFishWorkManager;

    public EnhancedIntentService() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new CatchingFishMoshiWidgetMVP("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.CatchingFishReduxKtor = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.CatchingFishWorkManager = new Object();
        this.CatchingFishViewModelFAB = 0;
    }

    public abstract void CatchingFishCoroutine(Intent intent);

    public final void CatchingFishParcelableFAB(Intent intent) {
        if (intent != null) {
            CatchingFishJUnitJUnitKtor.CatchingFishSnackbar(intent);
        }
        synchronized (this.CatchingFishWorkManager) {
            try {
                int i = this.CatchingFishViewModelFAB - 1;
                this.CatchingFishViewModelFAB = i;
                if (i == 0) {
                    stopSelfResult(this.CatchingFishViewModelScope);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Intent CatchingFishSnackbar(Intent intent) {
        return intent;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.CatchingFishDaggerWebsocket == null) {
                this.CatchingFishDaggerWebsocket = new CatchingFishMVIMockkService(new CatchingFishViewPagerMockk(8, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.CatchingFishReduxKtor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.CatchingFishWorkManager) {
            this.CatchingFishViewModelScope = i2;
            this.CatchingFishViewModelFAB++;
        }
        Intent CatchingFishSnackbar = CatchingFishSnackbar(intent);
        if (CatchingFishSnackbar == null) {
            CatchingFishParcelableFAB(intent);
            return 2;
        }
        CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = new CatchingFishAndroidXPayPal();
        this.CatchingFishReduxKtor.execute(new CatchingFishMVPFluxFirebase(this, CatchingFishSnackbar, catchingFishAndroidXPayPal, 2));
        CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = catchingFishAndroidXPayPal.CatchingFishParcelableFAB;
        if (catchingFishWorkManagerMVP.CatchingFishViewModelScope()) {
            CatchingFishParcelableFAB(intent);
            return 2;
        }
        catchingFishWorkManagerMVP.CatchingFishParcelableFAB(new CatchingFishExoPlayerRealm(), new CatchingFishXMLLayoutOkHttp(1, this, intent));
        return 3;
    }
}
