package w2;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3324ha;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;

/* renamed from: w2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5143c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41650n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C5147g f41651u;

    public /* synthetic */ RunnableC5143c(C5147g c5147g, int i) {
        this.f41650n = i;
        this.f41651u = c5147g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41650n) {
            case 0:
                C5147g c5147g = this.f41651u;
                c5147g.d(c5147g.f41661a);
                return;
            case 1:
                C5147g c5147g2 = this.f41651u;
                c5147g2.getClass();
                C4906k c4906k = C4906k.f40186C;
                j jVar = c4906k.f40202o;
                Context context = c5147g2.f41661a;
                String str = c5147g2.f41664d;
                String str2 = c5147g2.f41665e;
                jVar.getClass();
                C3324ha c3324ha = AbstractC3592ma.f32917T5;
                s2.r rVar = s2.r.f40506e;
                String j6 = j.j(context, jVar.k(context, (String) rVar.f40509c.a(c3324ha), str, str2).toString(), str2);
                if (TextUtils.isEmpty(j6)) {
                    int i = z.f41712b;
                    x2.i.a("Not linked for in app preview.");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(j6.trim());
                        String optString = jSONObject.optString("gct");
                        jVar.f41683f = jSONObject.optString("status");
                        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.za)).booleanValue()) {
                            String str3 = jVar.f41683f;
                            boolean z6 = "0".equals(str3) || "2".equals(str3);
                            jVar.f(z6);
                            c4906k.f40196h.g().f(!z6 ? "" : str);
                        }
                        synchronized (jVar.f41678a) {
                            jVar.f41680c = optString;
                        }
                        String str4 = jVar.f41683f;
                        if ("2".equals(str4)) {
                            int i4 = z.f41712b;
                            x2.i.a("Creative is not pushed for this device.");
                            jVar.i(context, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if ("1".equals(str4)) {
                            int i6 = z.f41712b;
                            x2.i.a("The app is not linked for creative preview.");
                            jVar.c(context, str, str2);
                            return;
                        } else {
                            if ("0".equals(str4)) {
                                int i9 = z.f41712b;
                                x2.i.a("Device is linked for in app preview.");
                                jVar.i(context, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException e9) {
                        int i10 = z.f41712b;
                        x2.i.g("Fail to get in app preview response json.", e9);
                    }
                }
                jVar.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 2:
                C5147g c5147g3 = this.f41651u;
                c5147g3.getClass();
                j jVar2 = C4906k.f40186C.f40202o;
                String str5 = c5147g3.f41664d;
                String str6 = c5147g3.f41665e;
                String str7 = c5147g3.f41666f;
                boolean h3 = jVar2.h();
                Context context2 = c5147g3.f41661a;
                boolean b9 = jVar2.b(context2, str5, str6);
                synchronized (jVar2.f41678a) {
                    jVar2.f41681d = b9;
                }
                if (!jVar2.h()) {
                    jVar2.c(context2, str5, str6);
                    return;
                }
                if (!h3 && !TextUtils.isEmpty(str7)) {
                    jVar2.e(context2, str6, str7, str5);
                }
                int i11 = z.f41712b;
                x2.i.a("Device is linked for debug signals.");
                jVar2.i(context2, "The device is successfully linked for troubleshooting.", false, true);
                return;
            case 3:
                C5147g c5147g4 = this.f41651u;
                c5147g4.d(c5147g4.f41661a);
                return;
            case 4:
                C5147g c5147g5 = this.f41651u;
                c5147g5.getClass();
                C4906k.f40186C.f40202o.a(c5147g5.f41661a);
                return;
            case 5:
                C5147g c5147g6 = this.f41651u;
                c5147g6.getClass();
                C4906k.f40186C.f40202o.a(c5147g6.f41661a);
                return;
            default:
                C5147g c5147g7 = this.f41651u;
                c5147g7.f41667g = 4;
                c5147g7.b();
                return;
        }
    }
}
