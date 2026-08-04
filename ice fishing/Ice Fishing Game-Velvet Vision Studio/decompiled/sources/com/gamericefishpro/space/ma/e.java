package com.gamericefishpro.space.ma;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.e4.g;
import com.gamericefishpro.space.f1.h;
import com.gamericefishpro.space.r8.k;
import com.gamericefishpro.space.r8.l;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.v8.l0;
import com.gamericefishpro.space.v8.m0;
import com.gamericefishpro.space.v8.n0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Handler.Callback {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (message.what != 0) {
                    return false;
                }
                g gVar = (g) this.e;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (gVar.d) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 1:
                int i = message.arg1;
                Log.isLoggable("MessengerIpcClient", 3);
                k kVar = (k) this.e;
                synchronized (kVar) {
                    try {
                        l lVar = (l) kVar.w.get(i);
                        if (lVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                            return true;
                        }
                        kVar.w.remove(i);
                        kVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            lVar.b(new h("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (lVar.e) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                if (!data.getBoolean("ack", false)) {
                                    lVar.b(new h("Invalid response to one way request", null));
                                    return true;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    lVar.toString();
                                }
                                lVar.b.a(null);
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    lVar.toString();
                                    String.valueOf(bundle);
                                }
                                lVar.b.a(bundle);
                                return true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                int i2 = message.what;
                if (i2 != 0) {
                    if (i2 != 1) {
                        return false;
                    }
                    n0 n0Var = (n0) this.e;
                    synchronized (n0Var.a) {
                        try {
                            l0 l0Var = (l0) message.obj;
                            m0 m0Var = (m0) n0Var.a.get(l0Var);
                            if (m0Var != null && m0Var.e == 3) {
                                String strValueOf = String.valueOf(l0Var);
                                StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                                sb.append("Timeout waiting for ServiceConnection callback ");
                                sb.append(strValueOf);
                                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                                ComponentName componentName = m0Var.y;
                                if (componentName == null) {
                                    l0Var.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = l0Var.b;
                                    c0.g(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                m0Var.onServiceDisconnected(componentName);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                } else {
                    n0 n0Var2 = (n0) this.e;
                    synchronized (n0Var2.a) {
                        try {
                            l0 l0Var2 = (l0) message.obj;
                            m0 m0Var2 = (m0) n0Var2.a.get(l0Var2);
                            if (m0Var2 != null && m0Var2.d.isEmpty()) {
                                if (m0Var2.i) {
                                    l0 l0Var3 = m0Var2.w;
                                    n0 n0Var3 = m0Var2.z;
                                    n0Var3.c.removeMessages(1, l0Var3);
                                    n0Var3.d.c(n0Var3.b, m0Var2);
                                    m0Var2.i = false;
                                    m0Var2.e = 2;
                                }
                                n0Var2.a.remove(l0Var2);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                        break;
                    }
                }
                return true;
        }
    }
}
