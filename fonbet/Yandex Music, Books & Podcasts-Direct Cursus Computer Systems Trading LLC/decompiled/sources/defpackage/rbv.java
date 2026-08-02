package defpackage;

import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rbv {
    public final String a;
    public final c02 b;
    public final /* synthetic */ eps c;

    public rbv(final eps epsVar, ChatRequest chatRequest) {
        String C = hld.C();
        String C2 = hld.C();
        C.getClass();
        C2.getClass();
        this.c = epsVar;
        this.a = C2;
        v3f v3fVar = (v3f) epsVar.e;
        qbv qbvVar = new qbv(epsVar, this);
        v3fVar.getClass();
        v3fVar.g.put(C2, qbvVar);
        this.b = new c02(1, v3fVar, C2);
        mcv mcvVar = new mcv() { // from class: pbv
            @Override // defpackage.mcv
            public final void a(hie hieVar) {
                List list;
                List w0;
                String str = this.a;
                nzh nzhVar = hieVar.b;
                if (nzhVar != null) {
                    String str2 = nzhVar.a;
                    eps epsVar2 = eps.this;
                    qdc qdcVar = (qdc) epsVar2.f;
                    qdcVar.getClass();
                    dwt.b(new zya(18, qdcVar, "wm_js_lastmessage_error " + str2));
                    new IllegalStateException(str2);
                    str.getClass();
                    ChatRequest g = epsVar2.g(str);
                    if (g != null) {
                        imf imfVar = (imf) epsVar2.b;
                        if (imfVar != null && (list = (List) imfVar.a.get(g)) != null && (w0 = CollectionsKt.w0(list)) != null) {
                            Iterator it = w0.iterator();
                            if (it.hasNext()) {
                                throw hrg.j(it);
                            }
                        }
                        String str3 = (String) ((LinkedHashMap) epsVar2.a).remove(g);
                        if (str3 != null) {
                            epsVar2.p(str3);
                        }
                    }
                    epsVar2.p(str);
                }
            }
        };
        v3fVar.getClass();
        v3fVar.f.put(C, mcvVar);
        t3f t3fVar = (t3f) epsVar.c;
        t3fVar.getClass();
        nnd nndVar = t3fVar.a;
        nndVar.getClass();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        if (chatRequest instanceof oh4) {
            jSONArray.put(((oh4) chatRequest).a);
        } else if (chatRequest instanceof rh4) {
            jSONArray2.put(((rh4) chatRequest).a);
        }
        JSONObject put = new JSONObject().put("objectName", "chatsLastMessageChanged").put("observerId", C2).put("params", new JSONObject().put("chatIds", jSONArray).put("guids", jSONArray2));
        JSONObject H = nndVar.H(b0i.Observe, C, C2);
        if (put != null) {
            H.put("data", put);
        }
        jtc.v((jtc) epsVar.d, t3f.b(H));
    }
}
