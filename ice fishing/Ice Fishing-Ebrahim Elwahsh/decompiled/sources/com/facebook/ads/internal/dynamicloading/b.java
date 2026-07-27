package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f23662n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f23663u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MultithreadedBundleWrapper f23664v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f23665w;

    public b(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z8) {
        this.f23662n = context;
        this.f23663u = z8;
        this.f23664v = multithreadedBundleWrapper;
        this.f23665w = initListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        DynamicLoader dynamicLoader;
        AtomicBoolean atomicBoolean;
        int i;
        ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.f23662n);
        synchronized (DynamicLoaderFactory.class) {
            DynamicLoader dynamicLoader2 = null;
            th = null;
            int i4 = 0;
            while (i4 < 3) {
                try {
                    dynamicLoader2 = DynamicLoaderFactory.doMakeLoader(this.f23662n, false);
                    break;
                } finally {
                    if (i4 == i) {
                        try {
                        } catch (Throwable th2) {
                        }
                    }
                }
            }
            dynamicLoader = dynamicLoader2;
        }
        DynamicLoaderFactory.doCallInitialize(this.f23662n, dynamicLoader, th, this.f23663u, this.f23664v, this.f23665w);
        atomicBoolean = DynamicLoaderFactory.sInitializing;
        atomicBoolean.set(false);
    }
}
