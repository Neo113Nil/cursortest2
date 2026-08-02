package defpackage;

import com.yandex.messaging.base.rights.ChatRightsFlag;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public abstract class t8b {
    public static final LinkedHashMap a;

    static {
        k4o a2 = ChatRightsFlag.a();
        int d = gw00.d(tcc.n(a2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : a2) {
            linkedHashMap.put(((ChatRightsFlag) obj).getFlagName(), obj);
        }
        a = linkedHashMap;
    }
}
