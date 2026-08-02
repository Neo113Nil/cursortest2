package defpackage;

import com.yandex.messenger.websdk.api.Cancelable;
import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final /* synthetic */ class c02 implements Cancelable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c02(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.yandex.messenger.websdk.api.Cancelable
    public final void cancel() {
        switch (this.a) {
            case 0:
                h02 h02Var = (h02) this.b;
                th4 th4Var = (th4) this.c;
                qdc qdcVar = h02Var.c;
                qdcVar.getClass();
                dwt.b(new zya(18, qdcVar, "wm_auth_cancel_token_subscription"));
                dwt.b(new ap1(4, h02Var, th4Var));
                break;
            case 1:
                v3f v3fVar = (v3f) this.b;
                v3fVar.g.remove((String) this.c);
                break;
            default:
                eps epsVar = (eps) this.b;
                imf imfVar = (imf) this.c;
                epsVar.b = null;
                imfVar.b.remove(epsVar);
                for (ChatRequest chatRequest : imfVar.a.keySet()) {
                    chatRequest.getClass();
                    String str = (String) ((LinkedHashMap) epsVar.a).remove(chatRequest);
                    if (str != null) {
                        epsVar.p(str);
                    }
                }
                break;
        }
    }
}
