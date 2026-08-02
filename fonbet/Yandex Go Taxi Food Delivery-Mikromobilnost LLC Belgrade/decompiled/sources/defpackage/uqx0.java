package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final class uqx0 {
    public final bt90 a;
    public final sbx b;

    public uqx0(bt90 bt90Var, sbx sbxVar) {
        this.a = bt90Var;
        this.b = sbxVar;
    }

    public final void a(String str, String str2, String str3, String str4) {
        if (str == null) {
            str = "no_value";
        }
        if (str2 == null) {
            str2 = "no_value";
        }
        if (str4 == null) {
            str4 = "no_value";
        }
        LinkedHashMap y = g8e.y("requestId", str, "additionalData", "silent_param_always_false");
        y.put("sessionId", str2);
        y.put("invoiceId", str3);
        y.put(ACSPConstants.STATUS, str4);
        y.put("silent", String.valueOf(false));
        y.put("_meta", bt90.b(new HashMap()));
        this.a.c("Error.Subscription.Tarifficator.Native.Invoice.GetStatus.UnexpectedStatus", y);
    }
}
