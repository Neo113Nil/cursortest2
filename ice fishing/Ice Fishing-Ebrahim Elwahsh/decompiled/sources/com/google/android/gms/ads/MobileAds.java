package com.google.android.gms.ads;

import O2.w;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import k2.r;
import k2.t;
import q2.C4899l;
import q2.C4907p;
import q2.H0;
import q2.InterfaceC4890g0;
import q2.J0;
import q2.X0;
import u2.i;

/* loaded from: classes.dex */
public class MobileAds {
    public static void a(Context context) {
        J0 c4 = J0.c();
        synchronized (c4.f39968h) {
            if (c4.i == null) {
                c4.i = (InterfaceC4890g0) new C4899l(C4907p.f40108g.f40110b, context).d(context, false);
            }
            InterfaceC4890g0 interfaceC4890g0 = c4.i;
            if (interfaceC4890g0 == null) {
                return;
            }
            try {
                interfaceC4890g0.w();
            } catch (RemoteException unused) {
                i.c("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public static t b() {
        J0.c();
        String[] split = TextUtils.split("25.3.0", "\\.");
        if (split.length != 3) {
            return new t(0, 0, 0);
        }
        try {
            return new t(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new t(0, 0, 0);
        }
    }

    public static void c(boolean z8) {
        J0 c4 = J0.c();
        synchronized (c4.f39968h) {
            w.j("MobileAds.initialize() must be called prior to setting app muted state.", c4.i != null);
            InterfaceC4890g0 interfaceC4890g0 = c4.i;
            if (interfaceC4890g0 == null) {
                return;
            }
            try {
                interfaceC4890g0.d0(z8);
            } catch (RemoteException e6) {
                i.d("Unable to set app mute state.", e6);
            }
        }
    }

    public static void d(r rVar) {
        J0 c4 = J0.c();
        c4.getClass();
        synchronized (c4.f39968h) {
            try {
                r rVar2 = c4.f39969j;
                c4.f39969j = rVar;
                InterfaceC4890g0 interfaceC4890g0 = c4.i;
                if (interfaceC4890g0 == null) {
                    return;
                }
                if (rVar2.f38727a != rVar.f38727a && interfaceC4890g0 != null) {
                    try {
                        interfaceC4890g0.g2(new X0(rVar));
                    } catch (RemoteException e6) {
                        i.d("Unable to set request configuration parcel.", e6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void setPlugin(String str) {
        J0 c4 = J0.c();
        synchronized (c4.f39968h) {
            w.j("MobileAds.initialize() must be called prior to setting the plugin.", c4.i != null);
            InterfaceC4890g0 interfaceC4890g0 = c4.i;
            if (interfaceC4890g0 == null) {
                return;
            }
            try {
                interfaceC4890g0.W(str);
            } catch (RemoteException e6) {
                i.d("Unable to set plugin.", e6);
            }
        }
    }

    private static void stop() {
        J0 c4 = J0.c();
        synchronized (c4.f39964d) {
            c4.f39967g = false;
            c4.f39966f = false;
            c4.f39965e.clear();
        }
        synchronized (c4.f39968h) {
            try {
                InterfaceC4890g0 interfaceC4890g0 = c4.i;
                if (interfaceC4890g0 != null) {
                    interfaceC4890g0.X();
                }
            } catch (RemoteException e6) {
                i.d("Unable to stop the SDK.", e6);
            }
            c4.i = null;
            H0 h02 = c4.f39961a;
            if (h02 != null) {
                h02.q();
                c4.f39961a = null;
            }
            H0 h03 = c4.f39962b;
            if (h03 != null) {
                h03.q();
                c4.f39962b = null;
            }
            H0 h04 = c4.f39963c;
            if (h04 != null) {
                h04.q();
                c4.f39963c = null;
            }
        }
    }
}
