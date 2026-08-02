package defpackage;

import com.connectsdk.service.NetcastTVService;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.analytics.evgen.a;
import com.yandex.plus.home.internal.di.c;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class omb {
    public final c a;
    public final a b;

    public omb(c cVar, a aVar, a1 a1Var) {
        aVar.getClass();
        this.a = cVar;
        this.b = aVar;
    }

    public static HashMap a(int i, HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", Integer.valueOf(i));
        hashMap2.put(NetcastTVService.UDAP_API_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void b(String str, vkb vkbVar) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from", str);
        linkedHashMap.put("offer_type", vkbVar.a);
        linkedHashMap.put("_meta", a(1, new HashMap()));
        d("PlusHome.BuySubscription.SuccessScreen.Button.Clicked", linkedHashMap);
    }

    public final void c(String str, vkb vkbVar) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from", str);
        linkedHashMap.put("offer_type", vkbVar.a);
        linkedHashMap.put("_meta", a(1, new HashMap()));
        d("PlusHome.BuySubscription.SuccessScreen.Shown", linkedHashMap);
    }

    public final void d(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        hashMap.putAll(this.b.a().a);
        hashMap.putAll(tah.b(new Pair("platform", ConstantDeviceInfo.APP_PLATFORM)));
        this.a.a.c().reportEvent(str, hashMap);
    }
}
