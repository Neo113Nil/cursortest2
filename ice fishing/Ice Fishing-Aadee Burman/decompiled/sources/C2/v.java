package C2;

import com.google.android.gms.internal.ads.AbstractC2801Ua;
import com.google.android.gms.internal.ads.C3493l5;
import com.google.android.gms.internal.ads.C4216ya;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;

/* loaded from: classes.dex */
public final class v extends F2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f416b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f417c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f418d;

    public v(C0268a c0268a, String str) {
        this.f417c = str;
        this.f418d = c0268a;
    }

    @Override // F2.b
    public final void onFailure(String str) {
        int i = 0;
        String str2 = this.f417c;
        Object obj = this.f418d;
        switch (this.f416b) {
            case 0:
                int i6 = u2.z.f41319b;
                v2.i.f("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
                C0268a c0268a = (C0268a) obj;
                String concat = ((Boolean) AbstractC2801Ua.f27927c.r()).booleanValue() ? ",\"as\":".concat(c0268a.f315k.b().toString()) : "";
                Locale locale = Locale.getDefault();
                C3493l5 c3493l5 = AbstractC2801Ua.f27929e;
                String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) c3493l5.r()).booleanValue() ? ((Long) AbstractC2801Ua.f27932h.r()).longValue() : 0L), concat);
                if (((Boolean) c3493l5.r()).booleanValue()) {
                    try {
                        c0268a.f313h.execute(new u(this, format, i));
                    } catch (RuntimeException e9) {
                        C4835j.f39730C.f39740h.e("TaggingLibraryJsInterface.getQueryInfo.onFailure", e9);
                    }
                } else {
                    c0268a.f307b.evaluateJavascript(format, null);
                }
                if (((Boolean) AbstractC2801Ua.f27927c.r()).booleanValue() && ((Boolean) AbstractC2801Ua.f27928d.r()).booleanValue()) {
                    A a9 = c0268a.f316l;
                    a9.getClass();
                    a9.f246b.execute(new z(a9, i));
                    break;
                }
                break;
            default:
                int i9 = u2.z.f41319b;
                v2.i.f("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
                try {
                    C4216ya c4216ya = (C4216ya) obj;
                    c4216ya.f35168g.k(c4216ya.b(str2, str).toString());
                    break;
                } catch (JSONException e10) {
                    v2.i.d("Error creating PACT Error Response JSON: ", e10);
                }
        }
    }

    @Override // F2.b
    public final void onSuccess(F2.a aVar) {
        String format;
        String str = this.f417c;
        Object obj = this.f418d;
        switch (this.f416b) {
            case 0:
                C0268a c0268a = (C0268a) obj;
                String str2 = aVar.f951a.f634u;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("paw_id", str);
                    if (((Boolean) AbstractC2801Ua.f27927c.r()).booleanValue()) {
                        jSONObject.put("as", c0268a.f315k.b());
                    }
                    jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC2801Ua.f27929e.r()).booleanValue() ? ((Long) AbstractC2801Ua.f27932h.r()).longValue() : 0L);
                    jSONObject.put("signal", str2);
                    format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
                } catch (JSONException unused) {
                    String concat = ((Boolean) AbstractC2801Ua.f27927c.r()).booleanValue() ? ",\"as\":".concat(c0268a.f315k.b().toString()) : "";
                    format = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str, aVar.f951a.f634u, Long.valueOf(((Boolean) AbstractC2801Ua.f27929e.r()).booleanValue() ? ((Long) AbstractC2801Ua.f27932h.r()).longValue() : 0L), concat);
                }
                if (((Boolean) AbstractC2801Ua.f27929e.r()).booleanValue()) {
                    try {
                        c0268a.f313h.execute(new u(this, format, 1));
                    } catch (RuntimeException e9) {
                        C4835j.f39730C.f39740h.e("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e9);
                    }
                } else {
                    c0268a.f307b.evaluateJavascript(format, null);
                }
                if (((Boolean) AbstractC2801Ua.f27927c.r()).booleanValue() && ((Boolean) AbstractC2801Ua.f27928d.r()).booleanValue()) {
                    A a9 = c0268a.f316l;
                    a9.getClass();
                    a9.f246b.execute(new z(a9, 0));
                    break;
                }
                break;
            default:
                try {
                    C4216ya c4216ya = (C4216ya) obj;
                    c4216ya.f35168g.k(c4216ya.c(str, aVar.f951a.f634u).toString());
                    break;
                } catch (JSONException e10) {
                    int i = u2.z.f41319b;
                    v2.i.d("Error creating PACT Signal Response JSON: ", e10);
                }
        }
    }

    public v(C4216ya c4216ya, String str) {
        this.f417c = str;
        Objects.requireNonNull(c4216ya);
        this.f418d = c4216ya;
    }
}
