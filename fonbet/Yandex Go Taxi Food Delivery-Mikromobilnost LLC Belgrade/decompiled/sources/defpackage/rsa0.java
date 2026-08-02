package defpackage;

import com.yandex.messaging.ChatRequest;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class rsa0 {
    public final kse a;
    public final i6f0 b;
    public final wff0 c;
    public final ax80 d;
    public final HashMap e = new HashMap();
    public final ksa0 f;
    public gta0 g;

    public rsa0(kse kseVar, i6f0 i6f0Var, wff0 wff0Var, ax80 ax80Var, at2 at2Var) {
        this.a = kseVar;
        this.b = i6f0Var;
        this.c = wff0Var;
        this.d = ax80Var;
        this.f = at2Var.E();
        kse.a(kseVar);
    }

    public final void a(psa0 psa0Var, fta0 fta0Var) {
        kse.a(this.a);
        ChatRequest chatRequest = psa0Var.a;
        z83.g(null, psa0Var, this.e.get(chatRequest));
        String uniqueRequestId = chatRequest.uniqueRequestId();
        ksa0 ksa0Var = this.f;
        for (osa0 osa0Var : ksa0Var.d(uniqueRequestId)) {
            this.d.getClass();
            yw80 c = ax80.c(osa0Var);
            String str = osa0Var.c;
            qsa0 qsa0Var = new qsa0(this, chatRequest, fta0Var, c);
            qsa0Var.c();
            if (qsa0Var.f || qsa0Var.d == null) {
                ksa0Var.k(chatRequest, str);
            } else {
                this.b.b.put(str, qsa0Var);
            }
        }
    }

    public final psa0 b(ChatRequest chatRequest) {
        gta0 gta0Var = this.g;
        if (gta0Var == null) {
            return null;
        }
        HashMap hashMap = this.e;
        psa0 psa0Var = (psa0) hashMap.get(chatRequest);
        if (psa0Var != null) {
            return psa0Var;
        }
        psa0 psa0Var2 = new psa0(this, gta0Var, chatRequest);
        hashMap.put(chatRequest, psa0Var2);
        return psa0Var2;
    }
}
