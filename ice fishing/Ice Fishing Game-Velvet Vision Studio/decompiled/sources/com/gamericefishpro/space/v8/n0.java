package com.gamericefishpro.space.v8;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public static final Object g = new Object();
    public static n0 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile com.gamericefishpro.space.f9.e c;
    public final com.gamericefishpro.space.y8.a d;
    public final long e;
    public final long f;

    public n0(Context context, Looper looper) {
        com.gamericefishpro.space.ma.e eVar = new com.gamericefishpro.space.ma.e(2, this);
        this.b = context.getApplicationContext();
        com.gamericefishpro.space.f9.e eVar2 = new com.gamericefishpro.space.f9.e(looper, eVar);
        Looper.getMainLooper();
        this.c = eVar2;
        this.d = com.gamericefishpro.space.y8.a.b();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static n0 a(Context context) {
        synchronized (g) {
            try {
                if (h == null) {
                    h = new n0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    public final com.gamericefishpro.space.s8.b b(l0 l0Var, h0 h0Var, String str, Executor executor) {
        com.gamericefishpro.space.s8.b bVarA;
        HashMap map = this.a;
        synchronized (map) {
            try {
                m0 m0Var = (m0) map.get(l0Var);
                if (executor == null) {
                    executor = null;
                }
                if (m0Var == null) {
                    m0Var = new m0(this, l0Var);
                    m0Var.d.put(h0Var, h0Var);
                    bVarA = m0Var.a(str, executor);
                    map.put(l0Var, m0Var);
                } else {
                    this.c.removeMessages(0, l0Var);
                    if (m0Var.d.containsKey(h0Var)) {
                        String string = l0Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    m0Var.d.put(h0Var, h0Var);
                    int i2 = m0Var.e;
                    if (i2 == 1) {
                        h0Var.onServiceConnected(m0Var.y, m0Var.v);
                    } else if (i2 == 2) {
                        bVarA = m0Var.a(str, executor);
                    }
                    bVarA = null;
                }
                if (m0Var.i) {
                    return com.gamericefishpro.space.s8.b.y;
                }
                if (bVarA == null) {
                    bVarA = new com.gamericefishpro.space.s8.b(-1, null, null);
                }
                return bVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z) {
        l0 l0Var = new l0(str, z);
        c0.h(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.a;
        synchronized (map) {
            try {
                m0 m0Var = (m0) map.get(l0Var);
                if (m0Var == null) {
                    String string = l0Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!m0Var.d.containsKey(serviceConnection)) {
                    String string2 = l0Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                m0Var.d.remove(serviceConnection);
                if (m0Var.d.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, l0Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
