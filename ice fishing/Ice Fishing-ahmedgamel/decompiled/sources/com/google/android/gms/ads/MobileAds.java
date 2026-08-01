package com.google.android.gms.ads;

import P2.w;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import k2.r;
import k2.t;
import q2.C4892l;
import q2.C4900p;
import q2.H0;
import q2.InterfaceC4883g0;
import q2.J0;
import q2.W0;
import v2.i;

/* loaded from: classes.dex */
public class MobileAds {
    public static void a(Context context) {
        J0 c9 = J0.c();
        synchronized (c9.f40061h) {
            if (c9.i == null) {
                c9.i = (InterfaceC4883g0) new C4892l(C4900p.f40199g.f40201b, context).d(context, false);
            }
            InterfaceC4883g0 interfaceC4883g0 = c9.i;
            if (interfaceC4883g0 == null) {
                return;
            }
            try {
                interfaceC4883g0.C();
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

    public static void c(boolean z3) {
        J0 c9 = J0.c();
        synchronized (c9.f40061h) {
            w.j("MobileAds.initialize() must be called prior to setting app muted state.", c9.i != null);
            InterfaceC4883g0 interfaceC4883g0 = c9.i;
            if (interfaceC4883g0 == null) {
                return;
            }
            try {
                interfaceC4883g0.Z(z3);
            } catch (RemoteException e9) {
                i.d("Unable to set app mute state.", e9);
            }
        }
    }

    public static void d(r rVar) {
        J0 c9 = J0.c();
        c9.getClass();
        synchronized (c9.f40061h) {
            try {
                r rVar2 = c9.f40062j;
                c9.f40062j = rVar;
                InterfaceC4883g0 interfaceC4883g0 = c9.i;
                if (interfaceC4883g0 == null) {
                    return;
                }
                if (rVar2.f38607a != rVar.f38607a && interfaceC4883g0 != null) {
                    try {
                        interfaceC4883g0.i2(new W0(rVar));
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
        synchronized (c9.f40061h) {
            w.j("MobileAds.initialize() must be called prior to setting the plugin.", c9.i != null);
            InterfaceC4883g0 interfaceC4883g0 = c9.i;
            if (interfaceC4883g0 == null) {
                return;
            }
            try {
                interfaceC4883g0.U(str);
            } catch (RemoteException e9) {
                i.d("Unable to set plugin.", e9);
            }
        }
    }

    private static void stop() {
        J0 c9 = J0.c();
        synchronized (c9.f40057d) {
            c9.f40060g = false;
            c9.f40059f = false;
            c9.f40058e.clear();
        }
        synchronized (c9.f40061h) {
            try {
                InterfaceC4883g0 interfaceC4883g0 = c9.i;
                if (interfaceC4883g0 != null) {
                    interfaceC4883g0.r1();
                }
            } catch (RemoteException e9) {
                i.d("Unable to stop the SDK.", e9);
            }
            c9.i = null;
            H0 h02 = c9.f40054a;
            if (h02 != null) {
                h02.q();
                c9.f40054a = null;
            }
            H0 h03 = c9.f40055b;
            if (h03 != null) {
                h03.q();
                c9.f40055b = null;
            }
            H0 h04 = c9.f40056c;
            if (h04 != null) {
                h04.q();
                c9.f40056c = null;
            }
        }
    }
}
