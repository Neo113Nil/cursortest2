package defpackage;

import android.content.Context;
import com.yandex.go.chargers.payments.domain.d;
import com.yandex.messaging.ui.settings.folder.addChat.i;
import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$Style;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class tb0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ tb0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ola olaVar;
        hfa0 hfa0Var;
        hfa0 hfa0Var2;
        int i = this.a;
        lea0 lea0Var = null;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                sls slsVar = (sls) obj4;
                i iVar = (i) obj5;
                tls tlsVar = (tls) obj6;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                String e = ohb1.e(fidVar, oyh0.folder_add_chat_ready);
                DsButton$Style dsButton$Style = DsButton$Style.Brand;
                DsButton$Size dsButton$Size = DsButton$Size.Lg;
                boolean b = ((ac0) ((m3u0) obj3).getValue()).b();
                f530 d = u3a1.d(c530.a, "folder_add_chats_list_done_button");
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(561357804);
                boolean k = btsVar2.k(tlsVar) | btsVar2.e(iVar) | btsVar2.k(slsVar);
                Object Q = btsVar2.Q();
                if (k || Q == did.a) {
                    Q = new sb0(0, tlsVar, iVar, slsVar);
                    btsVar2.o0(Q);
                }
                btsVar2.t(false);
                po91.c(e, (sls) Q, dsButton$Style, d, b, dsButton$Size, false, btsVar2, 196992, 0, 4032);
                break;
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue = ((Number) obj2).intValue();
                bts btsVar3 = (bts) fidVar2;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    btsVar3.e0(-1795708880);
                    dha dhaVar = (dha) obj6;
                    z0a0 d2 = ((dy90) ((d) ((tla) obj5)).b()).a.d();
                    yga ygaVar = (yga) obj4;
                    Context context = ygaVar.F;
                    int i2 = kyh0.scooters_offer_card_v2_a11y_payment_info_button;
                    rea0 rea0Var = ygaVar.J;
                    dha dhaVar2 = (dha) obj6;
                    aha ahaVar = dhaVar2 instanceof aha ? (aha) dhaVar2 : null;
                    if (ahaVar != null && (olaVar = ahaVar.a) != null && (hfa0Var = olaVar.j) != null) {
                        lea0Var = hfa0Var.b();
                    }
                    xib1.a(dhaVar, d2, context.getString(i2, Arrays.copyOf(new Object[]{((sea0) rea0Var).a(context, lea0Var)}, 1)), ((bgd) ((xfd) obj3)).a, btsVar3, 0);
                    btsVar3.t(false);
                    break;
                }
            default:
                fid fidVar3 = (fid) obj;
                int intValue2 = ((Number) obj2).intValue();
                bts btsVar4 = (bts) fidVar3;
                if (!btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    btsVar4.e0(1079801836);
                    qla qlaVar = (qla) obj6;
                    z0a0 d3 = ((dy90) ((d) ((tla) obj5)).b()).a.d();
                    ika ikaVar = (ika) obj4;
                    Context context2 = ikaVar.F;
                    int i3 = kyh0.scooters_offer_card_v2_a11y_payment_info_button;
                    rea0 rea0Var2 = ikaVar.J;
                    qla qlaVar2 = (qla) obj6;
                    ola olaVar2 = qlaVar2 instanceof ola ? (ola) qlaVar2 : null;
                    if (olaVar2 != null && (hfa0Var2 = olaVar2.j) != null) {
                        lea0Var = hfa0Var2.b();
                    }
                    djb1.d(qlaVar, d3, context2.getString(i3, Arrays.copyOf(new Object[]{((sea0) rea0Var2).a(context2, lea0Var)}, 1)), ((bgd) ((xfd) obj3)).a, btsVar4, 0);
                    btsVar4.t(false);
                    break;
                }
        }
        return zy11Var;
    }
}
