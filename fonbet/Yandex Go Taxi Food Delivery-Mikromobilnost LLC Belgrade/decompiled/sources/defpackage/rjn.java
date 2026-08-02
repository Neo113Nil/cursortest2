package defpackage;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.rt.ebs.cryptosdk.entities.exceptions.InstructionHandlerException;

/* loaded from: classes4.dex */
public final class rjn {
    public final z2v a;

    public rjn(z2v z2vVar) {
        this.a = z2vVar;
    }

    @JavascriptInterface
    public final void sendData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString(ACSPConstants.STATUS);
        boolean l = jl40.l(optString, "success");
        z2v z2vVar = this.a;
        if (l) {
            z2vVar.f();
        } else if (jl40.l(optString, "error")) {
            z2vVar.h(new InstructionHandlerException(jSONObject.optString(Constants.KEY_MESSAGE)));
        }
    }
}
