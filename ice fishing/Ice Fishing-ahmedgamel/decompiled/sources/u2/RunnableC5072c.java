package u2;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C3301ha;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;

/* renamed from: u2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5072c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41260n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C5076g f41261u;

    public /* synthetic */ RunnableC5072c(C5076g c5076g, int i) {
        this.f41260n = i;
        this.f41261u = c5076g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41260n) {
            case 0:
                C5076g c5076g = this.f41261u;
                c5076g.d(c5076g.f41271a);
                return;
            case 1:
                C5076g c5076g2 = this.f41261u;
                c5076g2.getClass();
                C4835j c4835j = C4835j.f39733C;
                j jVar = c4835j.f39749o;
                Context context = c5076g2.f41271a;
                String str = c5076g2.f41274d;
                String str2 = c5076g2.f41275e;
                jVar.getClass();
                C3301ha c3301ha = AbstractC3569ma.f32138T5;
                q2.r rVar = q2.r.f40207e;
                String j6 = j.j(context, jVar.k(context, (String) rVar.f40210c.a(c3301ha), str, str2).toString(), str2);
                if (TextUtils.isEmpty(j6)) {
                    int i = z.f41322b;
                    v2.i.a("Not linked for in app preview.");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(j6.trim());
                        String optString = jSONObject.optString("gct");
                        jVar.f41293f = jSONObject.optString("status");
                        if (((Boolean) rVar.f40210c.a(AbstractC3569ma.za)).booleanValue()) {
                            String str3 = jVar.f41293f;
                            boolean z3 = "0".equals(str3) || "2".equals(str3);
                            jVar.f(z3);
                            c4835j.f39743h.g().f(!z3 ? "" : str);
                        }
                        synchronized (jVar.f41288a) {
                            jVar.f41290c = optString;
                        }
                        String str4 = jVar.f41293f;
                        if ("2".equals(str4)) {
                            int i6 = z.f41322b;
                            v2.i.a("Creative is not pushed for this device.");
                            jVar.i(context, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if ("1".equals(str4)) {
                            int i9 = z.f41322b;
                            v2.i.a("The app is not linked for creative preview.");
                            jVar.c(context, str, str2);
                            return;
                        } else {
                            if ("0".equals(str4)) {
                                int i10 = z.f41322b;
                                v2.i.a("Device is linked for in app preview.");
                                jVar.i(context, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException e9) {
                        int i11 = z.f41322b;
                        v2.i.g("Fail to get in app preview response json.", e9);
                    }
                }
                jVar.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 2:
                C5076g c5076g3 = this.f41261u;
                c5076g3.getClass();
                j jVar2 = C4835j.f39733C.f39749o;
                String str5 = c5076g3.f41274d;
                String str6 = c5076g3.f41275e;
                String str7 = c5076g3.f41276f;
                boolean h9 = jVar2.h();
                Context context2 = c5076g3.f41271a;
                boolean b9 = jVar2.b(context2, str5, str6);
                synchronized (jVar2.f41288a) {
                    jVar2.f41291d = b9;
                }
                if (!jVar2.h()) {
                    jVar2.c(context2, str5, str6);
                    return;
                }
                if (!h9 && !TextUtils.isEmpty(str7)) {
                    jVar2.e(context2, str6, str7, str5);
                }
                int i12 = z.f41322b;
                v2.i.a("Device is linked for debug signals.");
                jVar2.i(context2, "The device is successfully linked for troubleshooting.", false, true);
                return;
            case 3:
                C5076g c5076g4 = this.f41261u;
                c5076g4.d(c5076g4.f41271a);
                return;
            case 4:
                C5076g c5076g5 = this.f41261u;
                c5076g5.getClass();
                C4835j.f39733C.f39749o.a(c5076g5.f41271a);
                return;
            case 5:
                C5076g c5076g6 = this.f41261u;
                c5076g6.getClass();
                C4835j.f39733C.f39749o.a(c5076g6.f41271a);
                return;
            default:
                C5076g c5076g7 = this.f41261u;
                c5076g7.f41277g = 4;
                c5076g7.b();
                return;
        }
    }
}
