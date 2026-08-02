package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class sfg {
    public final xiu a;
    public final g0c b;
    public final CoroutineContext c;

    public sfg(xiu xiuVar, g0c g0cVar) {
        dq7 dq7Var = ca8.a;
        mn7 mn7Var = mn7.d;
        xiuVar.getClass();
        g0cVar.getClass();
        mn7Var.getClass();
        this.a = xiuVar;
        this.b = g0cVar;
        this.c = mn7Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(1:17))(3:45|(1:47)|32)|18|19|20|21))|48|6|7|(0)(0)|18|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        r2 = (defpackage.dq8) r2.a;
        r12 = defpackage.eq8.PRIMARY;
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        switch(r2.ordinal()) {
            case 0: goto L38;
            case 1: goto L37;
            case 2: goto L36;
            case 3: goto L35;
            case 4: goto L34;
            case 5: goto L33;
            case 6: goto L32;
            case 7: goto L31;
            case 8: goto L30;
            case 9: goto L29;
            case 10: goto L28;
            default: goto L27;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
    
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00db, code lost:
    
        r11 = ("Рендер карточки DivKit " + r13 + ", div_card_json = " + r12).concat(", произошёл откат к предустановленной карточке: fallback_to_predefined = ");
        r12 = new java.util.LinkedHashMap();
        r13 = defpackage.r1f.a;
        r12.put("div_card_json", new defpackage.jkr("primary"));
        r12.put("div_card", new defpackage.jkr(r2.a));
        r12.put("fallback_to_predefined", new defpackage.jkr(""));
        r2 = defpackage.su4.k(r11, r12, com.connectsdk.service.DeviceService.KEY_DESC, r12);
        r11 = defpackage.qjb.a;
        r11.a = defpackage.su4.g(1, r11.a);
        r2.u(defpackage.qee.n() + r11.a, "eventus_id");
        r2 = defpackage.su4.j(r2, "event_name", "div_card_rendered", "div_card_rendered", r2);
        r5 = r5.b;
        r10 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x014a, code lost:
    
        if (r10 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x014c, code lost:
    
        r10 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0150, code lost:
    
        r0 = defpackage.qne.m(r2, r10, 2);
        r5 = (defpackage.x60) r5;
        r5.getClass();
        r5.a(r0);
        r7.j = r3;
        r7.k = r6;
        r7.l = null;
        r7.m = null;
        r7.p = 2;
        r0 = r4.invoke(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x016b, code lost:
    
        if (r0 != r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x016e, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        r13 = "на экране iPayment";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        r13 = "на экране результата";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
    
        r13 = "на экране выбора метода";
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        r13 = "на экране привязки карты";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        r13 = "на экране СБП Челленджера";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        r13 = "в поле поиска банка";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        r13 = "на экране лицензии СБП";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        r13 = "на экране выхода";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        r13 = "на экране выбора банка";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
    
        r13 = "на экране ввода CVV";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d9, code lost:
    
        r13 = "на экране выбора способа оплаты";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(qc9 qc9Var, sfm sfmVar, Function1 function1, cg6 cg6Var) {
        qfg qfgVar;
        int i;
        qc9 qc9Var2;
        Function1 function12;
        sfg sfgVar;
        sfm sfmVar2 = sfmVar;
        if (cg6Var instanceof qfg) {
            qfgVar = (qfg) cg6Var;
            int i2 = qfgVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qfgVar.p = i2 - Integer.MIN_VALUE;
                qfg qfgVar2 = qfgVar;
                Object obj = qfgVar2.n;
                nm6 nm6Var = nm6.a;
                i = qfgVar2.p;
                if (i != 0) {
                    qgg.h0(obj);
                    qne V0 = gut.V0((dq8) sfmVar2.a);
                    x60 x60Var = (x60) this.b;
                    x60Var.getClass();
                    x60Var.a(V0);
                    rfg rfgVar = new rfg(this, sfmVar2, V0, function1, null, 0);
                    qfgVar2.j = this;
                    qc9Var2 = qc9Var;
                    qfgVar2.k = qc9Var2;
                    qfgVar2.l = sfmVar2;
                    qfgVar2.m = (aur) function1;
                    qfgVar2.p = 1;
                    obj = x97.V(this.c, rfgVar, qfgVar2);
                    if (obj != nm6Var) {
                        function12 = function1;
                        sfgVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uv8 uv8Var = (uv8) qfgVar2.k;
                    qc9Var2 = (qc9) qfgVar2.j;
                    qgg.h0(obj);
                    qc9Var2.e(((uv8) obj).a);
                    int i3 = rv8.i;
                    return fgq.y(qc9Var2, uv8Var.b);
                }
                Function1 function13 = (Function1) qfgVar2.m;
                sfm sfmVar3 = qfgVar2.l;
                qc9 qc9Var3 = (qc9) qfgVar2.k;
                sfgVar = (sfg) qfgVar2.j;
                qgg.h0(obj);
                function12 = function13;
                sfmVar2 = sfmVar3;
                qc9Var2 = qc9Var3;
                uv8 uv8Var2 = (uv8) obj;
                qc9Var2.e(uv8Var2.a);
                int i4 = rv8.i;
                return fgq.y(qc9Var2, uv8Var2.b);
            }
        }
        qfgVar = new qfg(this, cg6Var);
        qfg qfgVar22 = qfgVar;
        Object obj2 = qfgVar22.n;
        nm6 nm6Var2 = nm6.a;
        i = qfgVar22.p;
        if (i != 0) {
        }
        uv8 uv8Var22 = (uv8) obj2;
        qc9Var2.e(uv8Var22.a);
        int i42 = rv8.i;
        return fgq.y(qc9Var2, uv8Var22.b);
    }
}
