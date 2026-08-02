package defpackage;

import com.yandex.go.address_confirmation.navigation.a;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.pickup_from_photo.navigation.c;
import ru.yandex.taxi.masstransit.main.router.b;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final /* synthetic */ class t71 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv0 b;

    public /* synthetic */ t71(pv0 pv0Var, PointType pointType) {
        this.a = 10;
        this.b = pv0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        pv0 pv0Var = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((r71) obj).a1(pv0Var);
                break;
            case 1:
                ((l51) obj).a1(pv0Var);
                break;
            case 2:
                ((cai) obj).d(pv0Var.a);
                break;
            case 3:
                ((cai) obj).d(pv0Var.a);
                break;
            case 4:
                ((l51) obj).a1(pv0Var);
                break;
            case 5:
                ((l51) obj).h(PointType.DESTINATION, pv0Var != null ? pv0Var.a : null, pv0Var);
                break;
            case 6:
                b.P(((oo30) obj).a, PointType.SOURCE, pv0Var != null ? pv0Var.a : null, pv0Var);
                break;
            case 7:
                ((rx30) obj).a.r(new t71(pv0Var, 8));
                break;
            case 8:
                oy30 oy30Var = (oy30) obj;
                PointType pointType = PointType.DESTINATION;
                pv0 pv0Var2 = this.b;
                oy30Var.a.r(new cc2((Object) pointType, (Object) (pv0Var2 != null ? pv0Var2.a : null), (Object) pv0Var2, true, 3));
                break;
            case 9:
                ((pf50) obj).p0(pv0Var);
                break;
            case 10:
                ((rf50) obj).a.r(new t71(pv0Var, 9));
                break;
            case 11:
                qob0 qob0Var = (qob0) obj;
                c cVar = qob0Var.b;
                cob0 cob0Var = qob0Var.a;
                if (cob0Var != null && !cob0Var.b) {
                    cVar.M.a(lnb0.a);
                    break;
                } else {
                    c.P(cVar, pv0Var, false);
                    break;
                }
                break;
            case 12:
                c cVar2 = ((pob0) obj).a;
                ((com.yandex.go.pickup_from_photo.data.b) cVar2.S.getValue()).a();
                cVar2.P.a = false;
                cVar2.M.a(new inb0(pv0Var));
                cVar2.i();
                break;
            case 13:
                c cVar3 = ((pob0) obj).a;
                ((com.yandex.go.pickup_from_photo.data.b) cVar3.S.getValue()).a();
                cVar3.P.a = false;
                cVar3.M.a(new inb0(pv0Var));
                cVar3.i();
                break;
            case 14:
                ((e3h) obj).n1(pv0Var);
                break;
            case 15:
                ((e3h) obj).n1(pv0Var);
                break;
            case 16:
                c cVar4 = ((rob0) obj).a;
                cVar4.P.a = false;
                cVar4.M.a(new inb0(pv0Var));
                cVar4.i();
                break;
            case 17:
                ((nal0) obj).t(pv0Var);
                break;
            case 18:
                ((a) obj).n1(pv0Var, AddressClarificationReason.Map);
                break;
            case 19:
                ((a) obj).n1(pv0Var, AddressClarificationReason.Suggest);
                break;
            case 20:
                ((a) obj).n1(pv0Var, AddressClarificationReason.Map);
                break;
            case 21:
                ((l51) obj).a1(pv0Var);
                break;
            default:
                ((l51) obj).h(PointType.SOURCE, null, pv0Var);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ t71(pv0 pv0Var, int i) {
        this.a = i;
        this.b = pv0Var;
    }
}
