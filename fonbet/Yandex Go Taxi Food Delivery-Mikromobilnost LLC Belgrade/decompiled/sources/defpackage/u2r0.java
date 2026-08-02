package defpackage;

import android.net.Uri;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes9.dex */
public final class u2r0 {
    public final JsonAdapter a;

    public u2r0(Moshi moshi) {
        this.a = moshi.adapter(Types.newParameterizedType(Map.class, String.class, String.class));
    }

    public final DeeplinkAction.SetDivVariables a(Uri uri) {
        Map map;
        String o = bzk0.o(uri, SdkUri$QueryParam.PAYLOAD);
        if (o != null) {
            try {
                map = (Map) this.a.fromJson(o);
            } catch (Exception unused) {
                map = null;
            }
            if (map != null) {
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new Uri.Builder().scheme("div-action").authority("set_variable").appendQueryParameter("name", (String) entry.getKey()).appendQueryParameter("value", (String) entry.getValue()).build());
                }
                return new DeeplinkAction.SetDivVariables(arrayList);
            }
        }
        return null;
    }
}
