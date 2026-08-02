package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f24293n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f24294u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MultithreadedBundleWrapper f24295v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f24296w;

    public b(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z6) {
        this.f24293n = context;
        this.f24294u = z6;
        this.f24295v = multithreadedBundleWrapper;
        this.f24296w = initListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        DynamicLoader dynamicLoader;
        AtomicBoolean atomicBoolean;
        int i;
        ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.f24293n);
        synchronized (DynamicLoaderFactory.class) {
            DynamicLoader dynamicLoader2 = null;
            th = null;
            int i4 = 0;
            while (i4 < 3) {
                try {
                    dynamicLoader2 = DynamicLoaderFactory.doMakeLoader(this.f24293n, false);
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
        DynamicLoaderFactory.doCallInitialize(this.f24293n, dynamicLoader, th, this.f24294u, this.f24295v, this.f24296w);
        atomicBoolean = DynamicLoaderFactory.sInitializing;
        atomicBoolean.set(false);
    }
}
