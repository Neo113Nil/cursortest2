package defpackage;

import com.connectsdk.service.DeviceService;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* loaded from: classes5.dex */
public final class xz2 extends uif implements Function1 {
    public final /* synthetic */ j03 r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ ime t;
    public final /* synthetic */ boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz2(j03 j03Var, boolean z, ime imeVar, boolean z2) {
        super(1);
        this.r = j03Var;
        this.s = z;
        this.t = imeVar;
        this.u = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dhk dhkVar = (dhk) obj;
        dhkVar.getClass();
        boolean v = c.v(dhkVar.a, "payment:", false);
        j03 j03Var = this.r;
        j03Var.o = v;
        vle vleVar = new vle(dhkVar.a, j03Var.a.b, this.s, j03Var.b, this.t, this.u);
        g0c g0cVar = j03Var.g;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Инициализация платежа", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(k, "event_name", "initiated_payment", "initiated_payment", k);
        yop a = mif.a(j03Var.e.a.C(vleVar, vsf.y0, p1j.a), new al(18, j03Var, dhkVar), null, 5);
        ((x60) g0cVar).b(j, a);
        return a;
    }
}
