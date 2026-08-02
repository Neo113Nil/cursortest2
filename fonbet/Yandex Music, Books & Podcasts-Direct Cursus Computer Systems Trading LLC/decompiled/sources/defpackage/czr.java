package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class czr implements ComponentCallbacks2 {
    public final WeakReference a;
    public Context b;
    public c1j c;
    public boolean d;
    public boolean e = true;

    public czr(skn sknVar) {
        this.a = new WeakReference(sknVar);
    }

    public final synchronized void a() {
        Unit unit;
        c1j i9wVar;
        try {
            skn sknVar = (skn) this.a.get();
            if (sknVar != null) {
                if (this.c == null) {
                    if (sknVar.f.b) {
                        Context context = sknVar.a;
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                        if (connectivityManager == null || etn.z(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                            i9wVar = new i9w();
                        } else {
                            try {
                                i9wVar = new lum(connectivityManager, this);
                            } catch (Exception unused) {
                                i9wVar = new i9w();
                            }
                        }
                    } else {
                        i9wVar = new i9w();
                    }
                    this.c = i9wVar;
                    this.e = i9wVar.r();
                }
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit == null) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            Context context = this.b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            c1j c1jVar = this.c;
            if (c1jVar != null) {
                c1jVar.shutdown();
            }
            this.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        try {
            if ((((skn) this.a.get()) != null ? Unit.a : null) == null) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        Unit unit;
        try {
            skn sknVar = (skn) this.a.get();
            if (sknVar != null) {
                vkn vknVar = (vkn) sknVar.c.getValue();
                if (vknVar != null) {
                    vknVar.a.m(i);
                    j4x j4xVar = vknVar.b;
                    synchronized (j4xVar) {
                        if (i >= 10 && i != 20) {
                            j4xVar.c();
                        }
                    }
                }
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit == null) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
