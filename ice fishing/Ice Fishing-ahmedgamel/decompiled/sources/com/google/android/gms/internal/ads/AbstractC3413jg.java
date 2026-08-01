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
public abstract class AbstractC3413jg {

    /* renamed from: a, reason: collision with root package name */
    public static final C3360ig f31268a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3360ig f31269b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3360ig f31270c;

    /* renamed from: d, reason: collision with root package name */
    public static final B8.c f31271d;

    /* renamed from: e, reason: collision with root package name */
    public static final WD f31272e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3360ig f31273f;

    /* renamed from: g, reason: collision with root package name */
    public static final ExecutorService f31274g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3360ig f31275h;

    static {
        ThreadPoolExecutor threadPoolExecutor;
        C3301ha c3301ha = AbstractC3569ma.Hc;
        q2.r rVar = q2.r.f40207e;
        if (rVar.f40210c.b(c3301ha) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.b(c3301ha)).booleanValue()) {
                C3301ha c3301ha2 = AbstractC3569ma.Ic;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.b(c3301ha2) != null) {
                    C3301ha c3301ha3 = AbstractC3569ma.Jc;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.b(c3301ha3) != null) {
                        threadPoolExecutor = new ThreadPoolExecutor(((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.b(c3301ha2)).intValue(), ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.b(c3301ha2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3307hg("Default", 0));
                        threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.b(c3301ha3)).booleanValue());
                        f31268a = new C3360ig((Executor) threadPoolExecutor);
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC3307hg("Loader", 0));
                        threadPoolExecutor2.allowCoreThreadTimeOut(true);
                        f31269b = new C3360ig((Executor) threadPoolExecutor2);
                        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC3307hg("Activeview", 0));
                        threadPoolExecutor3.allowCoreThreadTimeOut(true);
                        f31270c = new C3360ig((Executor) threadPoolExecutor3);
                        B8.c cVar = new B8.c(3, new ThreadFactoryC3307hg("Schedule", 0));
                        f31271d = cVar;
                        f31272e = new WD(cVar);
                        f31273f = new C3360ig(new J());
                        f31274g = Executors.newSingleThreadExecutor(new ThreadFactoryC3307hg("AdQualityMetrics", 0));
                        f31275h = new C3360ig(GD.f24952n);
                    }
                }
            }
        }
        threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC3307hg("Default", 0));
        f31268a = new C3360ig((Executor) threadPoolExecutor);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor22 = new ThreadPoolExecutor(5, 5, 10L, timeUnit2, new LinkedBlockingQueue(), new ThreadFactoryC3307hg("Loader", 0));
        threadPoolExecutor22.allowCoreThreadTimeOut(true);
        f31269b = new C3360ig((Executor) threadPoolExecutor22);
        ThreadPoolExecutor threadPoolExecutor32 = new ThreadPoolExecutor(1, 1, 10L, timeUnit2, new LinkedBlockingQueue(), new ThreadFactoryC3307hg("Activeview", 0));
        threadPoolExecutor32.allowCoreThreadTimeOut(true);
        f31270c = new C3360ig((Executor) threadPoolExecutor32);
        B8.c cVar2 = new B8.c(3, new ThreadFactoryC3307hg("Schedule", 0));
        f31271d = cVar2;
        f31272e = new WD(cVar2);
        f31273f = new C3360ig(new J());
        f31274g = Executors.newSingleThreadExecutor(new ThreadFactoryC3307hg("AdQualityMetrics", 0));
        f31275h = new C3360ig(GD.f24952n);
    }
}
