package com.gamericefishpro.space.i9;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d4 {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public static final String[] j = {"key", "value"};
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public volatile Map g;
    public com.gamericefishpro.space.i2.l2 d = null;
    public volatile boolean e = true;
    public final Object f = new Object();
    public final ArrayList h = new ArrayList();

    public d4(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
    }

    public static d4 a(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        d4 d4Var = (d4) i.computeIfAbsent(uri, new Function() { // from class: com.gamericefishpro.space.i9.c4
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return new d4(contentResolver, uri, runnable);
            }
        });
        try {
            if (!d4Var.e) {
                return d4Var;
            }
            synchronized (d4Var) {
                try {
                    if (d4Var.e) {
                        com.gamericefishpro.space.i2.l2 l2Var = new com.gamericefishpro.space.i2.l2(d4Var);
                        d4Var.a.registerContentObserver(d4Var.b, false, l2Var);
                        d4Var.d = l2Var;
                        d4Var.e = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return d4Var;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void c() {
        Iterator it = i.values().iterator();
        while (it.hasNext()) {
            d4 d4Var = (d4) it.next();
            synchronized (d4Var) {
                try {
                    if (d4Var.e) {
                        d4Var.e = false;
                    } else {
                        com.gamericefishpro.space.i2.l2 l2Var = d4Var.d;
                        if (l2Var != null) {
                            d4Var.a.unregisterContentObserver(l2Var);
                            d4Var.d = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Map b() {
        Map map;
        ?? r0;
        Object objC;
        Map map2 = this.g;
        ?? r1 = map2;
        if (map2 == null) {
            synchronized (this.f) {
                ?? r2 = this.g;
                r0 = r2;
                if (r2 == 0) {
                    try {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                v5 v5Var = new v5(this);
                                try {
                                    objC = v5Var.c();
                                } catch (SecurityException unused) {
                                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                                    try {
                                        objC = v5Var.c();
                                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                                    } catch (Throwable th) {
                                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                                        throw th;
                                    }
                                }
                                map = (Map) objC;
                            } catch (SecurityException e) {
                                e = e;
                                Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                                map = Collections.EMPTY_MAP;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                        } catch (IllegalStateException e3) {
                            e = e3;
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        this.g = map;
                        r0 = map;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(r2);
                        throw th2;
                    }
                }
            }
            r1 = r0;
        }
        return r1 != 0 ? r1 : Collections.EMPTY_MAP;
    }
}
