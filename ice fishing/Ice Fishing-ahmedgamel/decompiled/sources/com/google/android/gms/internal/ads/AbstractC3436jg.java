package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.jg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3436jg {

    /* renamed from: a, reason: collision with root package name */
    public static final C3383ig f32055a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3383ig f32056b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3383ig f32057c;

    /* renamed from: d, reason: collision with root package name */
    public static final B8.c f32058d;

    /* renamed from: e, reason: collision with root package name */
    public static final WD f32059e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3383ig f32060f;

    /* renamed from: g, reason: collision with root package name */
    public static final ExecutorService f32061g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3383ig f32062h;

    static {
        ThreadPoolExecutor threadPoolExecutor;
        C3324ha c3324ha = AbstractC3592ma.Hc;
        s2.r rVar = s2.r.f40506e;
        if (rVar.f40509c.b(c3324ha) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.b(c3324ha)).booleanValue()) {
                C3324ha c3324ha2 = AbstractC3592ma.Ic;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.b(c3324ha2) != null) {
                    C3324ha c3324ha3 = AbstractC3592ma.Jc;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.b(c3324ha3) != null) {
                        threadPoolExecutor = new ThreadPoolExecutor(((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.b(c3324ha2)).intValue(), ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.b(c3324ha2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3330hg("Default", 0));
                        threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.b(c3324ha3)).booleanValue());
                        f32055a = new C3383ig((Executor) threadPoolExecutor);
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC3330hg("Loader", 0));
                        threadPoolExecutor2.allowCoreThreadTimeOut(true);
                        f32056b = new C3383ig((Executor) threadPoolExecutor2);
                        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC3330hg("Activeview", 0));
                        threadPoolExecutor3.allowCoreThreadTimeOut(true);
                        f32057c = new C3383ig((Executor) threadPoolExecutor3);
                        B8.c cVar = new B8.c(3, new ThreadFactoryC3330hg("Schedule", 0));
                        f32058d = cVar;
                        f32059e = new WD(cVar);
                        f32060f = new C3383ig(new J());
                        f32061g = Executors.newSingleThreadExecutor(new ThreadFactoryC3330hg("AdQualityMetrics", 0));
                        f32062h = new C3383ig(GD.f25742n);
                    }
                }
            }
        }
        threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC3330hg("Default", 0));
        f32055a = new C3383ig((Executor) threadPoolExecutor);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor22 = new ThreadPoolExecutor(5, 5, 10L, timeUnit2, new LinkedBlockingQueue(), new ThreadFactoryC3330hg("Loader", 0));
        threadPoolExecutor22.allowCoreThreadTimeOut(true);
        f32056b = new C3383ig((Executor) threadPoolExecutor22);
        ThreadPoolExecutor threadPoolExecutor32 = new ThreadPoolExecutor(1, 1, 10L, timeUnit2, new LinkedBlockingQueue(), new ThreadFactoryC3330hg("Activeview", 0));
        threadPoolExecutor32.allowCoreThreadTimeOut(true);
        f32057c = new C3383ig((Executor) threadPoolExecutor32);
        B8.c cVar2 = new B8.c(3, new ThreadFactoryC3330hg("Schedule", 0));
        f32058d = cVar2;
        f32059e = new WD(cVar2);
        f32060f = new C3383ig(new J());
        f32061g = Executors.newSingleThreadExecutor(new ThreadFactoryC3330hg("AdQualityMetrics", 0));
        f32062h = new C3383ig(GD.f25742n);
    }
}
