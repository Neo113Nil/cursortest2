package defpackage;

import com.connectsdk.service.DeviceService;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class hos {
    public final t28 a;
    public final g0c b;

    public hos(t28 t28Var, g0c g0cVar) {
        this.a = t28Var;
        this.b = g0cVar;
    }

    public final yop a(String str, z9h z9hVar) {
        z9hVar.getClass();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        ios iosVar = new ios(uuid, new tao(null, null, null, null, str), z9hVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Получение токенизированного CVN", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(k, "event_name", "tokenize", "tokenize", k);
        t28 t28Var = this.a;
        yop I = yd5.I("tokenize", t28Var.b, new qs6(19, t28Var, iosVar));
        ((x60) this.b).b(j, I);
        return I;
    }

    public final yop b(n3m n3mVar, z9h z9hVar) {
        z9hVar.getClass();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        ios iosVar = new ios(uuid, new tao((String) n3mVar.b, (String) n3mVar.d, (String) n3mVar.c, (String) n3mVar.e, (String) n3mVar.f), z9hVar);
        String A = bcx.A((String) n3mVar.b);
        String concat = "Получение токенизированных карточных данных для карты ".concat(A);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put(Constants.KEY_VALUE, new jkr(A));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(vtmVar, "event_name", "tokenize", "tokenize", vtmVar);
        t28 t28Var = this.a;
        yop I = yd5.I("tokenize", t28Var.b, new qs6(19, t28Var, iosVar));
        ((x60) this.b).b(j, I);
        return I;
    }
}
