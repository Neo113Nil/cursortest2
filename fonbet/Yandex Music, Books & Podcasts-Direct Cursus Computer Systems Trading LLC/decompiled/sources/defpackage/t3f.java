package defpackage;

import com.yandex.messenger.websdk.api.MessengerParams;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t3f {
    public final nnd a;

    public t3f(String str, MessengerParams messengerParams, n nVar) {
        str.getClass();
        this.a = new nnd(nVar, str);
    }

    public static String a(String[] strArr) {
        return strArr.length == 0 ? "" : hrg.q("console.log(", xz0.J(strArr, ", ", null, 62), ");");
    }

    public static String b(JSONObject jSONObject) {
        return "\n            var message = " + jSONObject + ";\n            " + a(new String[]{Constants.KEY_MESSAGE, "androidMessengerChannel"}) + "\n            androidMessengerChannel.port1.postMessage(message);\n        ";
    }
}
