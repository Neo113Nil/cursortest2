package defpackage;

import com.connectsdk.service.DeviceService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class ww3 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ g0c s;
    public final /* synthetic */ nw3 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ww3(g0c g0cVar, nw3 nw3Var, int i) {
        super(1);
        this.r = i;
        this.s = g0cVar;
        this.t = nw3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        g0c g0cVar = this.s;
        nw3 nw3Var = this.t;
        switch (i) {
            case 0:
                lne lneVar = (lne) obj;
                lneVar.getClass();
                if (lneVar instanceof jne) {
                    jne jneVar = (jne) lneVar;
                    qne s1 = gut.s1(jneVar.b, jneVar.a, qgg.I(nw3Var));
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(s1);
                } else if (lneVar instanceof kne) {
                    qne d0 = gut.d0(((kne) lneVar).a, qgg.I(nw3Var));
                    x60 x60Var2 = (x60) g0cVar;
                    x60Var2.getClass();
                    x60Var2.a(d0);
                } else if (lneVar instanceof hne) {
                    int ordinal = ((hne) lneVar).a.ordinal();
                    if (ordinal == 0) {
                        qne m0 = gut.m0(qgg.I(nw3Var));
                        x60 x60Var3 = (x60) g0cVar;
                        x60Var3.getClass();
                        x60Var3.a(m0);
                    } else if (ordinal == 1) {
                        qne n0 = gut.n0(qgg.I(nw3Var));
                        x60 x60Var4 = (x60) g0cVar;
                        x60Var4.getClass();
                        x60Var4.a(n0);
                    } else if (ordinal == 2) {
                        qne l0 = gut.l0(qgg.I(nw3Var));
                        x60 x60Var5 = (x60) g0cVar;
                        x60Var5.getClass();
                        x60Var5.a(l0);
                    }
                } else if (lneVar instanceof ine) {
                    qne o0 = gut.o0(((ine) lneVar).a);
                    x60 x60Var6 = (x60) g0cVar;
                    x60Var6.getClass();
                    x60Var6.a(o0);
                }
                break;
            default:
                lne lneVar2 = (lne) obj;
                lneVar2.getClass();
                if (lneVar2 instanceof jne) {
                    jne jneVar2 = (jne) lneVar2;
                    ((x60) g0cVar).a(gut.s1(jneVar2.b, jneVar2.a, qgg.I(nw3Var)));
                } else if (lneVar2 instanceof kne) {
                    ((x60) g0cVar).a(gut.d0(((kne) lneVar2).a, qgg.I(nw3Var)));
                } else {
                    if (lneVar2 instanceof hne) {
                        int ordinal2 = ((hne) lneVar2).a.ordinal();
                        if (ordinal2 == 0) {
                            ((x60) g0cVar).a(gut.m0(qgg.I(nw3Var)));
                        } else if (ordinal2 == 1) {
                            ((x60) g0cVar).a(gut.n0(qgg.I(nw3Var)));
                        } else if (ordinal2 == 2) {
                            ((x60) g0cVar).a(gut.l0(qgg.I(nw3Var)));
                        } else if (ordinal2 == 4) {
                            zso I = qgg.I(nw3Var);
                            int ordinal3 = I.ordinal();
                            String concat = "Cканирование карты прошло успешно в сценарии ".concat(ordinal3 != 0 ? ordinal3 != 1 ? "" : "привязки карты" : "оплаты новой картой");
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            r1f r1fVar = r1f.a;
                            linkedHashMap.put("scenario", new jkr(I.a));
                            linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
                            vtm vtmVar = new vtm((Map) linkedHashMap);
                            ci0 ci0Var = qjb.a;
                            ci0Var.a = up6.z(1) + ci0Var.a;
                            vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                            ((x60) g0cVar).a(su4.j(vtmVar, "event_name", "payment_form_card_scanner_completed", "payment_form_card_scanner_completed", vtmVar));
                        }
                    } else if (lneVar2 instanceof ine) {
                        ((x60) g0cVar).a(gut.o0(((ine) lneVar2).a));
                    } else if (lneVar2 instanceof fne) {
                        zso I2 = qgg.I(nw3Var);
                        kl3 kl3Var = kl3.SCANNER_BUTTON;
                        int ordinal4 = I2.ordinal();
                        String concat2 = "Кнопка scanner_button недоступна в сценарии ".concat(ordinal4 != 0 ? ordinal4 != 1 ? "" : "привязки карты" : "оплаты новой картой");
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        r1f r1fVar2 = r1f.a;
                        linkedHashMap2.put("scenario", new jkr(I2.a));
                        linkedHashMap2.put(DeviceService.KEY_DESC, new jkr(concat2));
                        vtm vtmVar2 = new vtm((Map) linkedHashMap2);
                        ci0 ci0Var2 = qjb.a;
                        ci0Var2.a = up6.z(1) + ci0Var2.a;
                        vtmVar2.u(qee.n() + ci0Var2.a, "eventus_id");
                        ((x60) g0cVar).a(su4.j(vtmVar2, "event_name", "payment_form_button_available", "payment_form_button_available", vtmVar2));
                    } else if (lneVar2 instanceof gne) {
                        zso I3 = qgg.I(nw3Var);
                        kl3 kl3Var2 = kl3.SCANNER_BUTTON;
                        String concat3 = "Нажата кнопка ".concat("scanner_button");
                        int ordinal5 = I3.ordinal();
                        String o = ouj.o(concat3, " в сценарии ", ordinal5 != 0 ? ordinal5 != 1 ? "" : "привязки карты" : "оплаты новой картой");
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        r1f r1fVar3 = r1f.a;
                        linkedHashMap3.put("scenario", new jkr(I3.a));
                        linkedHashMap3.put(DeviceService.KEY_DESC, new jkr(o));
                        vtm vtmVar3 = new vtm((Map) linkedHashMap3);
                        ci0 ci0Var3 = qjb.a;
                        ci0Var3.a = up6.z(1) + ci0Var3.a;
                        vtmVar3.u(qee.n() + ci0Var3.a, "eventus_id");
                        ((x60) g0cVar).a(su4.j(vtmVar3, "event_name", "payment_form_button_pressed", "payment_form_button_pressed", vtmVar3));
                    }
                }
                break;
        }
        return Unit.a;
    }
}
