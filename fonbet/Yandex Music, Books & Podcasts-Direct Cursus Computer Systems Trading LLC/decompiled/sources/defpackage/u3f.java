package defpackage;

import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class u3f implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ hie b;
    public final /* synthetic */ v3f c;

    public /* synthetic */ u3f(hie hieVar, v3f v3fVar) {
        this.b = hieVar;
        this.c = v3fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        imf imfVar;
        List list;
        List w0;
        switch (this.a) {
            case 0:
                v3f v3fVar = this.c;
                hie hieVar = this.b;
                h02 h02Var = v3fVar.c;
                nzh nzhVar = hieVar.b;
                String str = nzhVar.a;
                String str2 = nzhVar.b;
                h02Var.getClass();
                str.getClass();
                str2.getClass();
                h02 h02Var2 = v3fVar.c;
                h02Var2.getClass();
                String a = h02Var2.a();
                boolean z = false;
                if (a != null && Intrinsics.d(CollectionsKt.Q(StringsKt.e0(a, new char[]{' '}, 6)), "YAMBAUTH")) {
                    wn0 wn0Var = h02Var2.e;
                    wn0Var.getClass();
                    qdc qdcVar = wn0Var.b;
                    String string = wn0Var.a.getString("ANONYMOUS_GUID_KEY", "");
                    qdcVar.sendEvent("wm_auth_cleanup_anonymous", tah.b(new Pair("guid", string != null ? string : "")));
                    wn0Var.c = null;
                    wn0Var.d = 0L;
                    wn0Var.a.edit().remove("ANONYMOUS_TOKEN_KEY").remove("ANONYMOUS_GUID_KEY").remove("ANONYMOUS_TOKEN_GENERATED_TIME_KEY").apply();
                    z = true;
                }
                qxp qxpVar = v3fVar.d;
                nzh nzhVar2 = hieVar.b;
                String str3 = nzhVar2.a;
                String str4 = nzhVar2.b;
                str3.getClass();
                str4.getClass();
                fi4 fi4Var = (fi4) qxpVar.a;
                if (z) {
                    s9f[] s9fVarArr = fi4.Q;
                    fi4Var.i("WebJsError", null);
                    return;
                } else {
                    obv obvVar = new obv(str3, str4);
                    fi4Var.l(null);
                    fi4Var.M.setValue(fi4Var, fi4.Q[4], null);
                    fi4Var.j(new ai4(obvVar));
                    return;
                }
            default:
                hie hieVar2 = this.b;
                v3f v3fVar2 = this.c;
                HashSet hashSet = v3fVar2.h;
                HashMap hashMap = v3fVar2.f;
                String str5 = hieVar2.e;
                JSONObject jSONObject = hieVar2.c;
                if (str5 != null) {
                    mcv mcvVar = (mcv) hashMap.get(str5);
                    if (mcvVar != null) {
                        mcvVar.a(hieVar2);
                    }
                    hashMap.remove(str5);
                    return;
                }
                if (Intrinsics.d(hieVar2.f, "notify")) {
                    String optString = jSONObject != null ? jSONObject.optString("observerId") : null;
                    JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("object") : null;
                    if (optString != null && optJSONObject != null) {
                        qbv qbvVar = (qbv) v3fVar2.g.get(optString);
                        if (qbvVar != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            keys.getClass();
                            eps epsVar = qbvVar.a;
                            rbv rbvVar = qbvVar.b;
                            while (keys.hasNext()) {
                                String next = keys.next();
                                JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                                if (optJSONObject2 != null) {
                                    qdc qdcVar2 = (qdc) epsVar.f;
                                    qdcVar2.getClass();
                                    dwt.b(new zya(18, qdcVar2, "wm_js_lastmessage_chat " + next));
                                    String optString2 = optJSONObject2.optString("text");
                                    long optLong = optJSONObject2.optLong("timestamp");
                                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("from");
                                    if (optJSONObject3 != null) {
                                        optJSONObject3.optString("display_name");
                                    }
                                    optJSONObject2.optBoolean("own");
                                    optString2.getClass();
                                    new Date(optLong / 1000);
                                    eps epsVar2 = rbvVar.c;
                                    String str6 = rbvVar.a;
                                    epsVar2.getClass();
                                    str6.getClass();
                                    ChatRequest g = epsVar2.g(str6);
                                    if (g != null && (imfVar = (imf) epsVar2.b) != null && (list = (List) imfVar.a.get(g)) != null && (w0 = CollectionsKt.w0(list)) != null) {
                                        Iterator it = w0.iterator();
                                        if (it.hasNext()) {
                                            throw hrg.j(it);
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                String optString3 = jSONObject != null ? jSONObject.optString("type") : null;
                if (optString3 != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (Intrinsics.d(((mbv) next2).a, optString3)) {
                            arrayList.add(next2);
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        mbv mbvVar = (mbv) it3.next();
                        mbvVar.a(hieVar2);
                        if (mbvVar.b) {
                            hashSet.remove(mbvVar);
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ u3f(v3f v3fVar, hie hieVar) {
        this.c = v3fVar;
        this.b = hieVar;
    }
}
