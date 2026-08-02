package defpackage;

import android.content.Context;
import android.util.Base64;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes7.dex */
public final class qq71 {
    public final Context a;
    public final ge71 b;
    public final a081 c;

    public qq71(Context context, ge71 ge71Var) {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        this.a = context;
        this.b = ge71Var;
        this.c = a081Var2;
    }

    public final Map a(MapBuilder mapBuilder, int i, fe81 fe81Var, int i2) {
        Map f;
        Iterator it = ((vf00) mapBuilder.entrySet()).iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i3 += unr0.o((String) entry.getKey(), Extension.COLON_SPACE, (String) entry.getValue(), Constants.LINE_SEPARATOR).getBytes(uza.a).length;
        }
        String str = fe81Var.h;
        if (str == null || str.length() == 0) {
            f = b.f();
        } else {
            try {
                JSONArray optJSONArray = new JSONObject(new String(Base64.decode(str, 0), uza.a)).optJSONArray("networks");
                if (optJSONArray == null) {
                    f = b.f();
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int length = optJSONArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                        if (optJSONObject != null) {
                            linkedHashMap.put(optJSONObject.optString("adapter", "unknown_" + i4), Integer.valueOf((optJSONObject.toString().getBytes(uza.a).length + 512) / 1024));
                        }
                    }
                    f = linkedHashMap;
                }
            } catch (Exception unused) {
                f = b.f();
            }
        }
        return b.i(new Pair("headers_size", Integer.valueOf((i3 + 512) / 1024)), new Pair("sdk_request_size", Integer.valueOf((i + 512) / 1024)), new Pair("bidding_data_network_sizes", f), new Pair("ad_type_format", fe81Var.a.b), new Pair(AuthSdkActivity.RESPONSE_TYPE_CODE, Integer.valueOf(i2)), new Pair("sdk_version", "8.0.0-beta.1"), new Pair(CommonUrlParts.APP_ID, this.a.getPackageName()));
    }
}
