package defpackage;

import com.yandex.go.profile.domain.divkit.variables.InternalNotificationVariableHandler$init$$inlined$safeCollectIn$1;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import ru.yandex.taxi.settings.support.g;

/* loaded from: classes8.dex */
public final class yrw extends nwl {
    public final h3y b;

    public yrw(h3y h3yVar, h3y h3yVar2) {
        super(h3yVar2);
        this.b = h3yVar;
    }

    @Override // defpackage.nwl
    public final void a(tse tseVar) {
        tje.N(tseVar, null, null, new InternalNotificationVariableHandler$init$$inlined$safeCollectIn$1(((g) this.b.get()).a.c, null, this), 3);
    }

    @Override // defpackage.nwl
    public final void c() {
        d();
    }

    public final void d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = ((g) this.b.get()).a.b.i("unread_support_messages_count", 0);
        if (i > 0) {
            linkedHashMap.put("support_message", String.valueOf(i));
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        b(new w131("superapp.profile.internal_notifications", jSONObject));
    }
}
