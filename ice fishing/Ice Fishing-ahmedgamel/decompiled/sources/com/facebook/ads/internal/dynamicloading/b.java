package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f23508n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f23509u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MultithreadedBundleWrapper f23510v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f23511w;

    public b(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z3) {
        this.f23508n = context;
        this.f23509u = z3;
        this.f23510v = multithreadedBundleWrapper;
        this.f23511w = initListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        DynamicLoader dynamicLoader;
        AtomicBoolean atomicBoolean;
        int i;
        ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.f23508n);
        synchronized (DynamicLoaderFactory.class) {
            DynamicLoader dynamicLoader2 = null;
            th = null;
            int i6 = 0;
            while (i6 < 3) {
                try {
                    dynamicLoader2 = DynamicLoaderFactory.doMakeLoader(this.f23508n, false);
                    break;
                } finally {
                    if (i6 == i) {
                        try {
                        } catch (Throwable th2) {
                        }
                    }
                }
            }
            dynamicLoader = dynamicLoader2;
        }
        DynamicLoaderFactory.doCallInitialize(this.f23508n, dynamicLoader, th, this.f23509u, this.f23510v, this.f23511w);
        atomicBoolean = DynamicLoaderFactory.sInitializing;
        atomicBoolean.set(false);
    }
}
