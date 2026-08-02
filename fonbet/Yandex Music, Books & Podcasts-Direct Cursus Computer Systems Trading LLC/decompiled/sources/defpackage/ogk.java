package defpackage;

import com.connectsdk.service.DeviceService;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ogk {
    public final j03 a;
    public final lnd b;
    public final g0c c;
    public final vfk d;
    public final ime e;
    public final boolean f;
    public yop g;

    public ogk(j03 j03Var, lnd lndVar, g0c g0cVar, vfk vfkVar, ime imeVar, boolean z) {
        this.a = j03Var;
        this.b = lndVar;
        this.c = g0cVar;
        this.d = vfkVar;
        this.e = imeVar;
        this.f = z;
        this.g = mif.a(j03Var.c, new xz2(j03Var, z, imeVar, false), null, 5);
    }

    public final void a() {
        j03 j03Var = this.a;
        if (j03Var.n != null) {
            g0c g0cVar = j03Var.g;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            r1f r1fVar = r1f.a;
            linkedHashMap.put("in_progress", new mc3(true));
            linkedHashMap.put(DeviceService.KEY_DESC, new jkr("Пользователь / сервис закрыл форму до начала оплаты"));
            vtm vtmVar = new vtm((Map) linkedHashMap);
            ci0 ci0Var = qjb.a;
            ci0Var.a = su4.g(1, ci0Var.a);
            vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
            ((x60) g0cVar).a(su4.j(vtmVar, "event_name", "cancelled_payment", "cancelled_payment", vtmVar));
            n20 n20Var = j03Var.n;
            n20Var.getClass();
            n20Var.a = true;
            j03Var.n = null;
        }
    }

    public final yop b(String str, String str2, String str3, oxa oxaVar, String str4, jtc jtcVar) {
        str.getClass();
        str2.getClass();
        yop yopVar = this.g;
        lt8 lt8Var = new lt8(this, str, str2, str3, str4, oxaVar, jtcVar, 4);
        yopVar.getClass();
        return mif.a(yopVar, lt8Var, null, 5);
    }
}
