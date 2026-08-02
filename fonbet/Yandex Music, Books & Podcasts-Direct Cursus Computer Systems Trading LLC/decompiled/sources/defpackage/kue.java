package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class kue {
    public final qdc a;

    public kue(vbv vbvVar) {
        this.a = vbvVar.r;
    }

    public final void a(String str, Throwable th, boolean z) {
        String str2 = z ? "wm_error_foreground" : "wm_error_background";
        Pair pair = new Pair("type", str);
        Pair pair2 = new Pair("error", th.getClass().getName());
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        Map e = uah.e(pair, pair2, new Pair(Constants.KEY_MESSAGE, message));
        qdc qdcVar = this.a;
        qdcVar.sendEvent(str2, e);
        dwt.b(new cte(0, qdcVar, str2, th));
    }
}
