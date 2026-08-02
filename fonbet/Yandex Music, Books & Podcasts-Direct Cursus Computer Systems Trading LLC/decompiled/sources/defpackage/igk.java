package defpackage;

import com.connectsdk.service.DeviceService;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class igk extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ mgk s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ igk(mgk mgkVar, int i) {
        super(1);
        this.r = i;
        this.s = mgkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        mgk mgkVar = this.s;
        switch (i) {
            case 0:
                fgk fgkVar = (fgk) obj;
                fgkVar.getClass();
                qdq.A(new ssb(26, mgkVar, fgkVar));
                return Unit.a;
            case 1:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                qdq.A(new ssb(27, mgkVar, r7wVar));
                return Unit.a;
            case 2:
                String str = (String) obj;
                str.getClass();
                j03 j03Var = mgkVar.f;
                String b = mgkVar.b();
                gek gekVar = mgkVar.b;
                oxa oxaVar = new oxa(gekVar);
                jtc jtcVar = new jtc(mgkVar, gekVar);
                j03Var.getClass();
                g0c g0cVar = j03Var.g;
                boolean z = j03Var.p;
                String concat = "Оплата через GooglePay ".concat(z ? "через PSP" : "через Trust");
                String str2 = z ? "google_pay_payment_v2" : "google_pay_payment";
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                vtm k = su4.k(concat, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                k.u(qee.n() + ci0Var.a, "eventus_id");
                qne j = su4.j(k, "event_name", str2, str2, k);
                yop a = mif.a(j03Var.d(b), new ak0(j03Var, str, oxaVar, jtcVar, 1), null, 5);
                ((x60) g0cVar).b(j, a);
                return a;
            default:
                ((r7w) obj).getClass();
                qdq.A(new kgk(0, mgkVar));
                return Unit.a;
        }
    }
}
