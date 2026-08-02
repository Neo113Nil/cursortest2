package com.google.android.gms.ads;

import R2.w;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import m2.r;
import m2.t;
import s2.C4941l;
import s2.C4949p;
import s2.H0;
import s2.InterfaceC4932g0;
import s2.J0;
import s2.W0;
import x2.i;

/* loaded from: classes.dex */
public class MobileAds {
    public static void a(Context context) {
        J0 c9 = J0.c();
        synchronized (c9.f40360h) {
            if (c9.i == null) {
                c9.i = (InterfaceC4932g0) new C4941l(C4949p.f40498g.f40500b, context).d(context, false);
            }
            InterfaceC4932g0 interfaceC4932g0 = c9.i;
            if (interfaceC4932g0 == null) {
                return;
            }
            try {
                interfaceC4932g0.C();
            } catch (RemoteException unused) {
                i.c("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public static t b() {
        J0.c();
        String[] split = TextUtils.split("25.4.0", "\\.");
        if (split.length != 3) {
            return new t(0, 0, 0);
        }
        try {
            return new t(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new t(0, 0, 0);
        }
    }

    public static void c(boolean z6) {
        J0 c9 = J0.c();
        synchronized (c9.f40360h) {
            w.j("MobileAds.initialize() must be called prior to setting app muted state.", c9.i != null);
            InterfaceC4932g0 interfaceC4932g0 = c9.i;
            if (interfaceC4932g0 == null) {
                return;
            }
            try {
                interfaceC4932g0.Z(z6);
            } catch (RemoteException e9) {
                i.d("Unable to set app mute state.", e9);
            }
        }
    }

    public static void d(r rVar) {
        J0 c9 = J0.c();
        c9.getClass();
        synchronized (c9.f40360h) {
            try {
                r rVar2 = c9.f40361j;
                c9.f40361j = rVar;
                InterfaceC4932g0 interfaceC4932g0 = c9.i;
                if (interfaceC4932g0 == null) {
                    return;
                }
                if (rVar2.f39396a != rVar.f39396a && interfaceC4932g0 != null) {
                    try {
                        interfaceC4932g0.W1(new W0(rVar));
                    } catch (RemoteException e9) {
                        i.d("Unable to set request configuration parcel.", e9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void setPlugin(String str) {
        J0 c9 = J0.c();
        synchronized (c9.f40360h) {
            w.j("MobileAds.initialize() must be called prior to setting the plugin.", c9.i != null);
            InterfaceC4932g0 interfaceC4932g0 = c9.i;
            if (interfaceC4932g0 == null) {
                return;
            }
            try {
                interfaceC4932g0.U(str);
            } catch (RemoteException e9) {
                i.d("Unable to set plugin.", e9);
            }
        }
    }

    private static void stop() {
        J0 c9 = J0.c();
        synchronized (c9.f40356d) {
            c9.f40359g = false;
            c9.f40358f = false;
            c9.f40357e.clear();
        }
        synchronized (c9.f40360h) {
            try {
                InterfaceC4932g0 interfaceC4932g0 = c9.i;
                if (interfaceC4932g0 != null) {
                    interfaceC4932g0.q1();
                }
            } catch (RemoteException e9) {
                i.d("Unable to stop the SDK.", e9);
            }
            c9.i = null;
            H0 h02 = c9.f40353a;
            if (h02 != null) {
                h02.q();
                c9.f40353a = null;
            }
            H0 h03 = c9.f40354b;
            if (h03 != null) {
                h03.q();
                c9.f40354b = null;
            }
            H0 h04 = c9.f40355c;
            if (h04 != null) {
                h04.q();
                c9.f40355c = null;
            }
        }
    }
}
