package defpackage;

import android.content.Intent;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class rww0 {
    public final y72 a;
    public final h3y b;
    public final ng60 c;
    public final mg60 d;

    public rww0(y72 y72Var, h3y h3yVar, ng60 ng60Var, mg60 mg60Var) {
        this.a = y72Var;
        this.b = h3yVar;
        this.c = ng60Var;
        this.d = mg60Var;
    }

    public final void a(Intent intent) {
        if (intent.hasExtra("SURVEY_ID")) {
            String stringExtra = intent.getStringExtra("BUTTON_ID");
            String stringExtra2 = intent.getStringExtra("SURVEY_ID");
            mg60 mg60Var = this.d;
            mg60Var.getClass();
            HashMap hashMap = new HashMap();
            if (stringExtra != null) {
                hashMap.put("button_id", stringExtra);
            }
            if (stringExtra2 != null) {
                hashMap.put("survey_id", stringExtra2);
            }
            mg60Var.a.a("Notification.Survey.Answer", hashMap, 1, new HashMap());
            ((xk60) this.b.get()).i.a(17533, null);
        }
    }
}
