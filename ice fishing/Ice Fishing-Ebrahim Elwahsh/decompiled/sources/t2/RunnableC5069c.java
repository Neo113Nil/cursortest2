package t2;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3151ea;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: t2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5069c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40881n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C5074h f40882u;

    public /* synthetic */ RunnableC5069c(C5074h c5074h, int i) {
        this.f40881n = i;
        this.f40882u = c5074h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40881n) {
            case 0:
                C5074h c5074h = this.f40882u;
                c5074h.d(c5074h.f40894a);
                return;
            case 1:
                C5074h c5074h2 = this.f40882u;
                c5074h2.getClass();
                p2.j jVar = p2.j.f39798C;
                C5077k c5077k = jVar.f39814o;
                Context context = c5074h2.f40894a;
                String str = c5074h2.f40897d;
                String str2 = c5074h2.f40898e;
                c5077k.getClass();
                C3151ea c3151ea = AbstractC3368ia.f31558T5;
                q2.r rVar = q2.r.f40116e;
                String j9 = C5077k.j(context, c5077k.k(context, (String) rVar.f40119c.a(c3151ea), str, str2).toString(), str2);
                if (TextUtils.isEmpty(j9)) {
                    int i = C.f40822b;
                    u2.i.a("Not linked for in app preview.");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(j9.trim());
                        String optString = jSONObject.optString("gct");
                        c5077k.f40916f = jSONObject.optString("status");
                        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.za)).booleanValue()) {
                            String str3 = c5077k.f40916f;
                            boolean z8 = "0".equals(str3) || "2".equals(str3);
                            c5077k.f(z8);
                            jVar.f39808h.g().f(!z8 ? "" : str);
                        }
                        synchronized (c5077k.f40911a) {
                            c5077k.f40913c = optString;
                        }
                        String str4 = c5077k.f40916f;
                        if ("2".equals(str4)) {
                            int i4 = C.f40822b;
                            u2.i.a("Creative is not pushed for this device.");
                            c5077k.i(context, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if ("1".equals(str4)) {
                            int i9 = C.f40822b;
                            u2.i.a("The app is not linked for creative preview.");
                            c5077k.c(context, str, str2);
                            return;
                        } else {
                            if ("0".equals(str4)) {
                                int i10 = C.f40822b;
                                u2.i.a("Device is linked for in app preview.");
                                c5077k.i(context, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException e6) {
                        int i11 = C.f40822b;
                        u2.i.g("Fail to get in app preview response json.", e6);
                    }
                }
                c5077k.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 2:
                C5074h c5074h3 = this.f40882u;
                c5074h3.getClass();
                C5077k c5077k2 = p2.j.f39798C.f39814o;
                String str5 = c5074h3.f40897d;
                String str6 = c5074h3.f40898e;
                String str7 = c5074h3.f40899f;
                boolean h9 = c5077k2.h();
                Context context2 = c5074h3.f40894a;
                boolean b9 = c5077k2.b(context2, str5, str6);
                synchronized (c5077k2.f40911a) {
                    c5077k2.f40914d = b9;
                }
                if (!c5077k2.h()) {
                    c5077k2.c(context2, str5, str6);
                    return;
                }
                if (!h9 && !TextUtils.isEmpty(str7)) {
                    c5077k2.e(context2, str6, str7, str5);
                }
                int i12 = C.f40822b;
                u2.i.a("Device is linked for debug signals.");
                c5077k2.i(context2, "The device is successfully linked for troubleshooting.", false, true);
                return;
            case 3:
                C5074h c5074h4 = this.f40882u;
                c5074h4.d(c5074h4.f40894a);
                return;
            case 4:
                C5074h c5074h5 = this.f40882u;
                c5074h5.getClass();
                p2.j.f39798C.f39814o.a(c5074h5.f40894a);
                return;
            case 5:
                C5074h c5074h6 = this.f40882u;
                c5074h6.getClass();
                p2.j.f39798C.f39814o.a(c5074h6.f40894a);
                return;
            default:
                C5074h c5074h7 = this.f40882u;
                c5074h7.f40900g = 4;
                c5074h7.b();
                return;
        }
    }
}
