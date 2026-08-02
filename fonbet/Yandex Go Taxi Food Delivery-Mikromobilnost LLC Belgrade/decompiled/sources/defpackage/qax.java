package defpackage;

import com.yandex.messenger.websdk.internal.web.WebJsException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.a;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes15.dex */
public final /* synthetic */ class qax implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ fqv b;
    public final /* synthetic */ rax c;

    public /* synthetic */ qax(fqv fqvVar, rax raxVar) {
        this.b = fqvVar;
        this.c = raxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rax raxVar = this.c;
                fqv fqvVar = this.b;
                jm3 jm3Var = raxVar.d;
                jm3Var.getClass();
                jl40.m();
                String str = jm3Var.d;
                boolean z = false;
                if (str != null && jl40.l(a.P(evu0.Y(str, new char[]{HexString.CHAR_SPACE}, 0, 6)), "YAMBAUTH")) {
                    wk2 wk2Var = jm3Var.e;
                    wk2Var.getClass();
                    jl40.m();
                    ew2 ew2Var = wk2Var.b;
                    String string = wk2Var.a.getString("ANONYMOUS_GUID_KEY", "");
                    ew2Var.c("wm_auth_cleanup_anonymous", gw00.e(new Pair("guid", string != null ? string : "")));
                    wk2Var.c = null;
                    wk2Var.d = 0L;
                    wk2Var.a.edit().remove("ANONYMOUS_TOKEN_KEY").remove("ANONYMOUS_GUID_KEY").remove("ANONYMOUS_TOKEN_GENERATED_TIME_KEY").apply();
                    z = true;
                }
                c29 c29Var = raxVar.e;
                ct10 ct10Var = fqvVar.b;
                String str2 = ct10Var.a;
                String str3 = ct10Var.b;
                heb hebVar = (heb) c29Var.b;
                if (!z) {
                    WebJsException webJsException = new WebJsException(str2, str3);
                    hebVar.l(null);
                    hebVar.N.setValue(hebVar, heb.R[4], null);
                    hebVar.j(new ceb(webJsException));
                    break;
                } else {
                    kgx[] kgxVarArr = heb.R;
                    hebVar.i("WebJsError", null);
                    break;
                }
                break;
            default:
                fqv fqvVar2 = this.b;
                rax raxVar2 = this.c;
                HashSet hashSet = raxVar2.i;
                HashMap hashMap = raxVar2.g;
                String str4 = fqvVar2.e;
                JSONObject jSONObject = fqvVar2.c;
                if (str4 == null) {
                    if (jl40.l(fqvVar2.f, "notify")) {
                        String optString = jSONObject != null ? jSONObject.optString("observerId") : null;
                        JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("object") : null;
                        if (optString != null && optJSONObject != null) {
                            yh41 yh41Var = (yh41) raxVar2.h.get(optString);
                            if (yh41Var != null) {
                                yh41Var.a(optJSONObject);
                                break;
                            }
                        }
                    }
                    String optString2 = jSONObject != null ? jSONObject.optString("type") : null;
                    if (optString2 != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (jl40.l(((vg41) next).a, optString2)) {
                                arrayList.add(next);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            vg41 vg41Var = (vg41) it2.next();
                            vg41Var.a(fqvVar2);
                            if (vg41Var.b) {
                                hashSet.remove(vg41Var);
                            }
                        }
                        break;
                    }
                } else {
                    tj41 tj41Var = (tj41) hashMap.get(str4);
                    if (tj41Var != null) {
                        tj41Var.a(fqvVar2);
                    }
                    hashMap.remove(str4);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qax(rax raxVar, fqv fqvVar) {
        this.c = raxVar;
        this.b = fqvVar;
    }
}
