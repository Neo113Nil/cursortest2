package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Rn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2785Rn {

    /* renamed from: a, reason: collision with root package name */
    public final C3504ku f28022a;

    /* renamed from: b, reason: collision with root package name */
    public final C2768Qn f28023b;

    public C2785Rn(C3504ku c3504ku, C2768Qn c2768Qn) {
        this.f28022a = c3504ku;
        this.f28023b = c2768Qn;
    }

    public final C3558lu a(String str, JSONObject jSONObject) {
        InterfaceC3703od b9;
        C2768Qn c2768Qn = this.f28023b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                b9 = new BinderC2486Ad(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                b9 = new BinderC2486Ad(new zzbym());
            } else {
                InterfaceC3595md interfaceC3595md = (InterfaceC3595md) ((AtomicReference) this.f28022a.f32447w).get();
                if (interfaceC3595md == null) {
                    int i = w2.z.f41712b;
                    x2.i.f("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        b9 = interfaceC3595md.z(string) ? interfaceC3595md.b("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : interfaceC3595md.y0(string) ? interfaceC3595md.b(string) : interfaceC3595md.b("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e9) {
                        int i4 = w2.z.f41712b;
                        x2.i.d("Invalid custom event.", e9);
                    }
                }
                b9 = interfaceC3595md.b(str);
            }
            C3558lu c3558lu = new C3558lu(b9);
            c2768Qn.a(str, c3558lu);
            return c3558lu;
        } catch (Throwable th) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ha)).booleanValue()) {
                c2768Qn.a(str, null);
            }
            throw new C3290gu(th);
        }
    }

    public final InterfaceC2741Pd b(String str) {
        InterfaceC3595md interfaceC3595md = (InterfaceC3595md) ((AtomicReference) this.f28022a.f32447w).get();
        if (interfaceC3595md == null) {
            int i = w2.z.f41712b;
            x2.i.f("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        InterfaceC2741Pd G2 = interfaceC3595md.G(str);
        C2768Qn c2768Qn = this.f28023b;
        synchronized (c2768Qn) {
            if (c2768Qn.f27853a.containsKey(str)) {
                return G2;
            }
            try {
                c2768Qn.f27853a.put(str, new C2751Pn(str, G2.e(), G2.h(), true));
                return G2;
            } catch (Throwable unused) {
                return G2;
            }
        }
    }
}
