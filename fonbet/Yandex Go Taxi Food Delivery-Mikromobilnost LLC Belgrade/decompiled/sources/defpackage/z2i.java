package defpackage;

import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public final class z2i extends ad5 {
    public final y2i x;
    public final j0g y;
    public final a3i z;

    public z2i(y2i y2iVar, j0g j0gVar, a3i a3iVar) {
        super(v2i.class);
        this.x = y2iVar;
        this.y = j0gVar;
        this.z = a3iVar;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        Map Kg = Kg();
        o61 o61Var = (o61) this.y.b;
        Object obj = Kg.get("bot_id");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = Kg.get("chat_id");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = Kg.get("delivery_metrics");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = Kg.get("order_id");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        HashMap hashMap = new HashMap();
        if (str3 != null) {
            hashMap.put("delivery_metrics", str3);
        }
        if (str != null) {
            hashMap.put("bot_id", str);
        }
        if (str2 != null) {
            hashMap.put("chat_id", str2);
        }
        if (str4 != null) {
            hashMap.put("order_id", str4);
        }
        o61Var.a.a("Chat.Close", hashMap, 1, new HashMap());
    }

    public final Map Kg() {
        y2i y2iVar = this.x;
        Map a = y2iVar.a();
        if (a != null) {
            return a;
        }
        MapBuilder mapBuilder = new MapBuilder();
        ChatRequest b = y2iVar.b();
        if (b instanceof f8b) {
            mapBuilder.put("chat_id", ((f8b) b).a);
        } else if (b instanceof j8b) {
            mapBuilder.put("bot_id", ((j8b) b).a);
        }
        return mapBuilder.j();
    }
}
