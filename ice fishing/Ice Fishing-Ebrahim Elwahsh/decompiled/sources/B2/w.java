package B2;

import com.google.android.gms.internal.ads.AbstractC2734Qa;
import com.google.android.gms.internal.ads.C3398j5;
import com.google.android.gms.internal.ads.C4067va;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w extends E2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f312b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f313c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f314d;

    public w(C0267a c0267a, String str) {
        this.f313c = str;
        this.f314d = c0267a;
    }

    @Override // E2.b
    public final void onFailure(String str) {
        int i = 0;
        String str2 = this.f313c;
        Object obj = this.f314d;
        switch (this.f312b) {
            case 0:
                int i4 = t2.C.f40822b;
                u2.i.f("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
                C0267a c0267a = (C0267a) obj;
                String concat = ((Boolean) AbstractC2734Qa.f27165c.r()).booleanValue() ? ",\"as\":".concat(c0267a.f210k.b().toString()) : "";
                Locale locale = Locale.getDefault();
                C3398j5 c3398j5 = AbstractC2734Qa.f27167e;
                String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) c3398j5.r()).booleanValue() ? ((Long) AbstractC2734Qa.f27170h.r()).longValue() : 0L), concat);
                if (((Boolean) c3398j5.r()).booleanValue()) {
                    try {
                        c0267a.f208h.execute(new v(this, format, i));
                    } catch (RuntimeException e6) {
                        p2.j.f39798C.f39808h.e("TaggingLibraryJsInterface.getQueryInfo.onFailure", e6);
                    }
                } else {
                    c0267a.f202b.evaluateJavascript(format, null);
                }
                if (((Boolean) AbstractC2734Qa.f27165c.r()).booleanValue() && ((Boolean) AbstractC2734Qa.f27166d.r()).booleanValue()) {
                    B b9 = c0267a.f211l;
                    b9.getClass();
                    b9.f144b.execute(new A(b9, i));
                    break;
                }
                break;
            default:
                int i9 = t2.C.f40822b;
                u2.i.f("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
                try {
                    C4067va c4067va = (C4067va) obj;
                    c4067va.f34807g.k(c4067va.b(str2, str).toString());
                    break;
                } catch (JSONException e9) {
                    u2.i.d("Error creating PACT Error Response JSON: ", e9);
                }
        }
    }

    @Override // E2.b
    public final void onSuccess(E2.a aVar) {
        String format;
        String str = this.f313c;
        Object obj = this.f314d;
        switch (this.f312b) {
            case 0:
                C0267a c0267a = (C0267a) obj;
                String str2 = aVar.f810a.f289a;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("paw_id", str);
                    if (((Boolean) AbstractC2734Qa.f27165c.r()).booleanValue()) {
                        jSONObject.put("as", c0267a.f210k.b());
                    }
                    jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC2734Qa.f27167e.r()).booleanValue() ? ((Long) AbstractC2734Qa.f27170h.r()).longValue() : 0L);
                    jSONObject.put("signal", str2);
                    format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
                } catch (JSONException unused) {
                    String concat = ((Boolean) AbstractC2734Qa.f27165c.r()).booleanValue() ? ",\"as\":".concat(c0267a.f210k.b().toString()) : "";
                    format = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str, aVar.f810a.f289a, Long.valueOf(((Boolean) AbstractC2734Qa.f27167e.r()).booleanValue() ? ((Long) AbstractC2734Qa.f27170h.r()).longValue() : 0L), concat);
                }
                if (((Boolean) AbstractC2734Qa.f27167e.r()).booleanValue()) {
                    try {
                        c0267a.f208h.execute(new v(this, format, 1));
                    } catch (RuntimeException e6) {
                        p2.j.f39798C.f39808h.e("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e6);
                    }
                } else {
                    c0267a.f202b.evaluateJavascript(format, null);
                }
                if (((Boolean) AbstractC2734Qa.f27165c.r()).booleanValue() && ((Boolean) AbstractC2734Qa.f27166d.r()).booleanValue()) {
                    B b9 = c0267a.f211l;
                    b9.getClass();
                    b9.f144b.execute(new A(b9, 0));
                    break;
                }
                break;
            default:
                try {
                    C4067va c4067va = (C4067va) obj;
                    c4067va.f34807g.k(c4067va.c(str, aVar.f810a.f289a).toString());
                    break;
                } catch (JSONException e9) {
                    int i = t2.C.f40822b;
                    u2.i.d("Error creating PACT Signal Response JSON: ", e9);
                }
        }
    }

    public w(C4067va c4067va, String str) {
        this.f313c = str;
        Objects.requireNonNull(c4067va);
        this.f314d = c4067va;
    }
}
