package E2;

import com.google.android.gms.internal.ads.AbstractC2823Ua;
import com.google.android.gms.internal.ads.C3516l5;
import com.google.android.gms.internal.ads.C4239ya;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;

/* loaded from: classes.dex */
public final class u extends H2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f875b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f876c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f877d;

    public u(C0304a c0304a, String str) {
        this.f876c = str;
        this.f877d = c0304a;
    }

    @Override // H2.b
    public final void onFailure(String str) {
        int i = 0;
        String str2 = this.f876c;
        Object obj = this.f877d;
        switch (this.f875b) {
            case 0:
                int i4 = w2.z.f41712b;
                x2.i.f("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
                C0304a c0304a = (C0304a) obj;
                String concat = ((Boolean) AbstractC2823Ua.f28725c.r()).booleanValue() ? ",\"as\":".concat(c0304a.f775k.b().toString()) : "";
                Locale locale = Locale.getDefault();
                C3516l5 c3516l5 = AbstractC2823Ua.f28727e;
                String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) c3516l5.r()).booleanValue() ? ((Long) AbstractC2823Ua.f28730h.r()).longValue() : 0L), concat);
                if (((Boolean) c3516l5.r()).booleanValue()) {
                    try {
                        c0304a.f773h.execute(new t(this, format, i));
                    } catch (RuntimeException e9) {
                        C4906k.f40186C.f40196h.e("TaggingLibraryJsInterface.getQueryInfo.onFailure", e9);
                    }
                } else {
                    c0304a.f767b.evaluateJavascript(format, null);
                }
                if (((Boolean) AbstractC2823Ua.f28725c.r()).booleanValue() && ((Boolean) AbstractC2823Ua.f28726d.r()).booleanValue()) {
                    z zVar = c0304a.f776l;
                    zVar.getClass();
                    zVar.f890b.execute(new y(zVar, i));
                    break;
                }
                break;
            default:
                int i6 = w2.z.f41712b;
                x2.i.f("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
                try {
                    C4239ya c4239ya = (C4239ya) obj;
                    c4239ya.f35958g.e(c4239ya.b(str2, str).toString());
                    break;
                } catch (JSONException e10) {
                    x2.i.d("Error creating PACT Error Response JSON: ", e10);
                }
        }
    }

    @Override // H2.b
    public final void onSuccess(H2.a aVar) {
        String format;
        String str = this.f876c;
        Object obj = this.f877d;
        switch (this.f875b) {
            case 0:
                C0304a c0304a = (C0304a) obj;
                String str2 = aVar.f1236a.f2011n;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("paw_id", str);
                    if (((Boolean) AbstractC2823Ua.f28725c.r()).booleanValue()) {
                        jSONObject.put("as", c0304a.f775k.b());
                    }
                    jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC2823Ua.f28727e.r()).booleanValue() ? ((Long) AbstractC2823Ua.f28730h.r()).longValue() : 0L);
                    jSONObject.put("signal", str2);
                    format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
                } catch (JSONException unused) {
                    String concat = ((Boolean) AbstractC2823Ua.f28725c.r()).booleanValue() ? ",\"as\":".concat(c0304a.f775k.b().toString()) : "";
                    format = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str, aVar.f1236a.f2011n, Long.valueOf(((Boolean) AbstractC2823Ua.f28727e.r()).booleanValue() ? ((Long) AbstractC2823Ua.f28730h.r()).longValue() : 0L), concat);
                }
                if (((Boolean) AbstractC2823Ua.f28727e.r()).booleanValue()) {
                    try {
                        c0304a.f773h.execute(new t(this, format, 1));
                    } catch (RuntimeException e9) {
                        C4906k.f40186C.f40196h.e("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e9);
                    }
                } else {
                    c0304a.f767b.evaluateJavascript(format, null);
                }
                if (((Boolean) AbstractC2823Ua.f28725c.r()).booleanValue() && ((Boolean) AbstractC2823Ua.f28726d.r()).booleanValue()) {
                    z zVar = c0304a.f776l;
                    zVar.getClass();
                    zVar.f890b.execute(new y(zVar, 0));
                    break;
                }
                break;
            default:
                try {
                    C4239ya c4239ya = (C4239ya) obj;
                    c4239ya.f35958g.e(c4239ya.c(str, aVar.f1236a.f2011n).toString());
                    break;
                } catch (JSONException e10) {
                    int i = w2.z.f41712b;
                    x2.i.d("Error creating PACT Signal Response JSON: ", e10);
                }
        }
    }

    public u(C4239ya c4239ya, String str) {
        this.f876c = str;
        Objects.requireNonNull(c4239ya);
        this.f877d = c4239ya;
    }
}
