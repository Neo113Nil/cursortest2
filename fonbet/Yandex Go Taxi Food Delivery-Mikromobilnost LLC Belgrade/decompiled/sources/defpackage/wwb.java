package defpackage;

import androidx.compose.ui.semantics.f;
import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.masstransit.sdk.order.impl.tickets.b;
import com.yandex.go.promocodes.d;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;

/* loaded from: classes12.dex */
public final /* synthetic */ class wwb implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ wwb(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int i = this.a;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        String str = this.b;
        switch (i) {
            case 0:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 1:
                ((isd) obj).o(str);
                return zy11Var;
            case 2:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 3:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 4:
                ((b) obj).n1(str);
                return zy11Var;
            case 5:
                f.o((mnq0) obj, str);
                return zy11Var;
            case 6:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 7:
                return Boolean.valueOf(jl40.l(((mkb0) obj).getId(), str));
            case 8:
                w3j0 w3j0Var = (w3j0) obj;
                w3j0Var.a.put("close_reason", str);
                return w3j0Var;
            case 9:
                ((isd) obj).o(str);
                return zy11Var;
            case 10:
                w3j0 w3j0Var2 = (w3j0) obj;
                w3j0Var2.a.put("button_name", str);
                return w3j0Var2;
            case 11:
                ((ioi) obj).T(str);
                return zy11Var;
            case 12:
                ((rvi) obj).Z0(str);
                return zy11Var;
            case 13:
                T0 = ((oll0) obj).T0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    T0.g1(1, str);
                    if (T0.q()) {
                        z = ((int) T0.getLong(0)) != 0;
                    }
                    T0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 14:
                T0 = ((oll0) obj).T0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    T0.g1(1, str);
                    if (T0.q()) {
                        z = ((int) T0.getLong(0)) != 0;
                    }
                    T0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 15:
                qrj qrjVar = (qrj) obj;
                switch (qrjVar.a) {
                    case 0:
                        ((rrj) qrjVar.b).r(new wwb(str, 16));
                        return zy11Var;
                    default:
                        ((d) qrjVar.b).r(new dcc0(str, 9));
                        return zy11Var;
                }
            case 16:
                ((trf0) obj).a.r(new dcc0(str, 10));
                return zy11Var;
            case 17:
                return Boolean.valueOf(jl40.l(((o7m) obj).getStoryId(), str));
            case 18:
                mnq0 mnq0Var = (mnq0) obj;
                f.l(mnq0Var, str);
                f.p(mnq0Var, 0);
                return zy11Var;
            case 19:
                ((rhm) obj).a.r(new wwb(str, 21));
                return zy11Var;
            case 20:
                ((lhm) obj).b(str);
                return zy11Var;
            case 21:
                ((qhm) obj).a.r(new wwb(str, 20));
                return zy11Var;
            case 22:
                mnq0 mnq0Var2 = (mnq0) obj;
                if (str != null) {
                    f.l(mnq0Var2, str);
                }
                return zy11Var;
            case 23:
                mnq0 mnq0Var3 = (mnq0) obj;
                f.p(mnq0Var3, 0);
                f.l(mnq0Var3, str);
                return zy11Var;
            case 24:
                mnq0 mnq0Var4 = (mnq0) obj;
                f.p(mnq0Var4, 0);
                f.l(mnq0Var4, str);
                return zy11Var;
            case 25:
                mnq0 mnq0Var5 = (mnq0) obj;
                if (str == null) {
                    str = "";
                }
                f.l(mnq0Var5, str);
                return zy11Var;
            case 26:
                ((dlr0) obj).a.invoke(str);
                return zy11Var;
            case 27:
                w3j0 w3j0Var3 = (w3j0) obj;
                w3j0Var3.d("strategy", str);
                return w3j0Var3.l();
            case 28:
                AddressDTO.Companion.getClass();
                return AddressDTO.g(com.yandex.go.address.dto.b.b((v7v0) obj), null, null, null, null, null, null, this.b, null, null, null, null, null, null, null, null, null, 33554303);
            default:
                ((TaxiOrder) obj).S(new TaxiOrderSelectedTipsChoiceState(TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.PREFERRED_CHOICE, TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.PERCENT, str));
                return zy11Var;
        }
    }
}
