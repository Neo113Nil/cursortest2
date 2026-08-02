package defpackage;

import com.connectsdk.service.DeviceService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class j9i extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ l9i s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j9i(l9i l9iVar, int i) {
        super(1);
        this.r = i;
        this.s = l9iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        l9i l9iVar = this.s;
        switch (i) {
            case 0:
                ((aai) obj).getClass();
                g0c g0cVar = l9iVar.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                vtm k = su4.k("Предоставление CVV успешно завершилось", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                k.u(qee.n() + ci0Var.a, "eventus_id");
                ((x60) g0cVar).a(su4.j(k, "event_name", "supply_cvv", "supply_cvv", k));
                return Unit.a;
            default:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                g0c g0cVar2 = l9iVar.b;
                String message = r7wVar.getMessage();
                message.getClass();
                String concat = "Предоставление CVV завершилось с ошибкой: ".concat(message);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                r1f r1fVar2 = r1f.a;
                linkedHashMap2.put("reason", new jkr(message));
                linkedHashMap2.put(DeviceService.KEY_DESC, new jkr(concat));
                vtm vtmVar = new vtm((Map) linkedHashMap2);
                ci0 ci0Var2 = qjb.a;
                ci0Var2.a = su4.g(1, ci0Var2.a);
                vtmVar.u(qee.n() + ci0Var2.a, "eventus_id");
                ((x60) g0cVar2).a(su4.j(vtmVar, "event_name", "supply_cvv_failed", "supply_cvv_failed", vtmVar));
                return nif.c(r7wVar);
        }
    }
}
