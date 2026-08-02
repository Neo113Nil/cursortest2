package com.yandex.passport.internal.network.client;

import com.yandex.passport.api.p1;
import com.yandex.passport.internal.entities.r;
import defpackage.ezc;
import defpackage.l3o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class e extends ezc implements Function1 {
    public static final e a = new e(1, com.yandex.passport.internal.network.a.class, "parseGetPersonProfileResponse", "parseGetPersonProfileResponse(Lokhttp3/Response;)Lcom/yandex/passport/internal/entities/PersonProfile;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        l3o l3oVar = (l3o) obj;
        l3oVar.getClass();
        JSONObject b = com.yandex.passport.internal.network.a.b(l3oVar);
        String d = com.yandex.passport.internal.network.a.d(b);
        if (d != null) {
            com.yandex.passport.internal.network.a.i(d);
            throw new com.yandex.passport.data.exceptions.h(d);
        }
        String string = b.getString("status");
        if (!string.equals("ok")) {
            throw new com.yandex.passport.data.exceptions.h(string);
        }
        JSONObject jSONObject = b.getJSONObject("account");
        String x = com.yandex.plus.pay.ui.core.b.x("name", jSONObject.getJSONObject("display_name"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("person");
        String x2 = com.yandex.plus.pay.ui.core.b.x("firstname", jSONObject2);
        String x3 = com.yandex.plus.pay.ui.core.b.x("lastname", jSONObject2);
        String x4 = com.yandex.plus.pay.ui.core.b.x("birthday", jSONObject2);
        String x5 = com.yandex.plus.pay.ui.core.b.x("gender", jSONObject2);
        JSONObject optJSONObject = jSONObject.optJSONObject("display_names");
        p1 p1Var = null;
        if (optJSONObject == null) {
            arrayList = null;
        } else {
            Iterator<String> keys = optJSONObject.keys();
            ArrayList arrayList2 = new ArrayList();
            while (keys.hasNext()) {
                arrayList2.add(keys.next());
            }
            arrayList = arrayList2;
        }
        if (x5 != null) {
            p1.b.getClass();
            p1[] values = p1.values();
            int length = values.length;
            int i = 0;
            loop0: while (true) {
                if (i >= length) {
                    break;
                }
                p1 p1Var2 = values[i];
                String[] strArr = p1Var2.a;
                for (int i2 = 0; i2 < 3; i2++) {
                    if (x5.equals(strArr[i2])) {
                        p1Var = p1Var2;
                        break loop0;
                    }
                }
                i++;
            }
        }
        return new r(x, x2, x3, x4, p1Var, arrayList);
    }
}
