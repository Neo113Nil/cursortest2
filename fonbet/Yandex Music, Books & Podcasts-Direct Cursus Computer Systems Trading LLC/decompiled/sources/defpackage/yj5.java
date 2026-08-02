package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class yj5 {
    public final cy2 a;
    public final qkp b;

    public yj5(cy2 cy2Var, qkp qkpVar) {
        this.a = cy2Var;
        this.b = qkpVar;
    }

    public final void a(String str, boolean z) {
        str.getClass();
        Map e = uah.e(new Pair("anchorId", str), new Pair("toastAnchorEnabled", Boolean.valueOf(z)));
        if (((Boolean) this.b.invoke()).booleanValue()) {
            this.a.b("COMMUNICATION_TRIGGER_ANCHOR_TRIGGERED", e);
        }
    }

    public final void b(String str, kk5 kk5Var, String str2, String str3) {
        str.getClass();
        f9h f9hVar = new f9h();
        f9hVar.put("anchorId", str);
        f9hVar.put("outcome", kk5Var.a);
        if (str2 != null) {
            f9hVar.put("triggerType", str2);
        }
        if (str3 != null) {
            f9hVar.put(Constants.KEY_MESSAGE, str3);
        }
        f9h b = f9hVar.b();
        if (((Boolean) this.b.invoke()).booleanValue()) {
            this.a.b("COMMUNICATION_TRIGGER_RESULT", b);
        }
    }
}
