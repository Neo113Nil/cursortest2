package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Qn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2748Qn {

    /* renamed from: a, reason: collision with root package name */
    public final C3481ku f27078a;

    /* renamed from: b, reason: collision with root package name */
    public final C2731Pn f27079b;

    public C2748Qn(C3481ku c3481ku, C2731Pn c2731Pn) {
        this.f27078a = c3481ku;
        this.f27079b = c2731Pn;
    }

    public final C3535lu a(String str, JSONObject jSONObject) {
        InterfaceC3680od b9;
        C2731Pn c2731Pn = this.f27079b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                b9 = new BinderC2466Ad(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                b9 = new BinderC2466Ad(new zzbym());
            } else {
                InterfaceC3572md interfaceC3572md = (InterfaceC3572md) ((AtomicReference) this.f27078a.f31665w).get();
                if (interfaceC3572md == null) {
                    int i = u2.z.f41319b;
                    v2.i.f("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        b9 = interfaceC3572md.z(string) ? interfaceC3572md.b("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : interfaceC3572md.B0(string) ? interfaceC3572md.b(string) : interfaceC3572md.b("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e9) {
                        int i6 = u2.z.f41319b;
                        v2.i.d("Invalid custom event.", e9);
                    }
                }
                b9 = interfaceC3572md.b(str);
            }
            C3535lu c3535lu = new C3535lu(b9);
            c2731Pn.a(str, c3535lu);
            return c3535lu;
        } catch (Throwable th) {
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Ha)).booleanValue()) {
                c2731Pn.a(str, null);
            }
            throw new C3267gu(th);
        }
    }

    public final InterfaceC2721Pd b(String str) {
        InterfaceC3572md interfaceC3572md = (InterfaceC3572md) ((AtomicReference) this.f27078a.f31665w).get();
        if (interfaceC3572md == null) {
            int i = u2.z.f41319b;
            v2.i.f("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        InterfaceC2721Pd H8 = interfaceC3572md.H(str);
        C2731Pn c2731Pn = this.f27079b;
        synchronized (c2731Pn) {
            if (c2731Pn.f26860a.containsKey(str)) {
                return H8;
            }
            try {
                c2731Pn.f26860a.put(str, new C2714On(str, H8.e(), H8.h(), true));
                return H8;
            } catch (Throwable unused) {
                return H8;
            }
        }
    }
}
