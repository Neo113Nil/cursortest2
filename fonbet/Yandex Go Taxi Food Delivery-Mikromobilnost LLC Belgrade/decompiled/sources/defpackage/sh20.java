package defpackage;

import com.yandex.messaging.miniapps.js.ChannelMessageType;
import com.yandex.messaging.miniapps.js.messages.MiniAppMessageError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.UUID;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class sh20 {
    public final uh20 a;
    public final String b;

    public sh20(uh20 uh20Var, wh20 wh20Var) {
        this.a = uh20Var;
        this.b = wh20Var.b();
    }

    public static String b(String[] strArr) {
        return strArr.length == 0 ? "" : oyr.p("console.log(", j73.L(strArr, Extension.FIX_SPACE, null, null, 62), ");");
    }

    public static String d(JSONObject jSONObject) {
        return cvu0.v(cvu0.v("\n            var message = " + jSONObject + ";\n            " + b(new String[]{Constants.KEY_MESSAGE, "miniappChannel"}) + "\n            miniappChannel.port1.postMessage(message);\n        ", "\"@undefined\"", StringUtils.UNDEFINED, false), "'@undefined'", StringUtils.UNDEFINED, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(String str) {
        MiniAppMessageError miniAppMessageError = new MiniAppMessageError("BotRequest error", null, 2, 0 == true ? 1 : 0);
        uh20 uh20Var = this.a;
        uh20Var.getClass();
        JSONObject a = uh20Var.a(ChannelMessageType.Response, UUID.randomUUID().toString(), str);
        a.put("error", miniAppMessageError);
        a.put(Constants.KEY_DATA, "@undefined");
        return d(a);
    }

    public final String c(String str) {
        uh20 uh20Var = this.a;
        uh20Var.getClass();
        JSONObject a = uh20Var.a(ChannelMessageType.Response, UUID.randomUUID().toString(), str);
        a.put(Constants.KEY_DATA, "@undefined");
        a.put("error", "@undefined");
        return d(a);
    }
}
