package defpackage;

import com.connectsdk.service.DeviceService;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class z28 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ g0c s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z28(g0c g0cVar, int i) {
        super(1);
        this.r = i;
        this.s = g0cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        g0c g0cVar = this.s;
        switch (i) {
            case 0:
                y7o y7oVar = (y7o) obj;
                y7oVar.getClass();
                boolean b = y7oVar.b();
                r7w r7wVar = y7oVar.b;
                if (b) {
                    up6.D(r7wVar);
                    String message = r7wVar.getMessage();
                    message.getClass();
                    String concat = "Ошибка при поллинге дайхарда: ".concat(message);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    r1f r1fVar = r1f.a;
                    linkedHashMap.put(Constants.KEY_MESSAGE, new jkr(message));
                    linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
                    vtm vtmVar = new vtm((Map) linkedHashMap);
                    ci0 ci0Var = qjb.a;
                    ci0Var.a = su4.g(1, ci0Var.a);
                    vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                    qne j = su4.j(vtmVar, "event_name", "error_while_polling", "error_while_polling", vtmVar);
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(j);
                }
                if (!y7oVar.c()) {
                    up6.D(r7wVar);
                    if (!(r7wVar instanceof n1j) || !((n1j) r7wVar).c()) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                q1f q1fVar = (q1f) obj;
                q1fVar.getClass();
                y7o C = new ozw(25, (byte) 0).C(q1fVar);
                if (!C.c()) {
                    if (C.b()) {
                        r7w r7wVar2 = C.b;
                        up6.D(r7wVar2);
                        String message2 = r7wVar2.getMessage();
                        message2.getClass();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        r1f r1fVar2 = r1f.a;
                        linkedHashMap2.put("reason", new jkr(message2));
                        linkedHashMap2.put(DeviceService.KEY_DESC, new jkr("Не получилось преобразовать пейлоад в json"));
                        vtm vtmVar2 = new vtm((Map) linkedHashMap2);
                        ci0 ci0Var2 = qjb.a;
                        ci0Var2.a = su4.g(1, ci0Var2.a);
                        vtmVar2.u(qee.n() + ci0Var2.a, "eventus_id");
                        ((x60) g0cVar).a(su4.j(vtmVar2, "event_name", "serialize_error", "serialize_error", vtmVar2));
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                try {
                    break;
                } catch (Exception e) {
                    String message3 = e.getMessage();
                    if (message3 == null) {
                        message3 = e.toString();
                    }
                    message3.getClass();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    r1f r1fVar3 = r1f.a;
                    linkedHashMap3.put("reason", new jkr(message3));
                    linkedHashMap3.put(DeviceService.KEY_DESC, new jkr("Не получилось распарсить пейлоад из json"));
                    vtm vtmVar3 = new vtm((Map) linkedHashMap3);
                    ci0 ci0Var3 = qjb.a;
                    ci0Var3.a = su4.g(1, ci0Var3.a);
                    vtmVar3.u(qee.n() + ci0Var3.a, "eventus_id");
                    ((x60) g0cVar).a(su4.j(vtmVar3, "event_name", "deserialize_error", "deserialize_error", vtmVar3));
                    return null;
                }
        }
        return null;
    }
}
