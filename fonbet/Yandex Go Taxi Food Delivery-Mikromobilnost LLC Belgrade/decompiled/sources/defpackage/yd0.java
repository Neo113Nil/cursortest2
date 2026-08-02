package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.logistics.cargo_flow.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final /* synthetic */ class yd0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Address b;

    public /* synthetic */ yd0(Address address, int i) {
        this.a = i;
        this.b = address;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Address address = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((vd0) obj).T0(address);
                break;
            case 1:
                ((qz0) obj).P(address);
                break;
            case 2:
                ((k41) obj).d(address);
                break;
            case 3:
                ((tmt) obj).W(address);
                break;
            case 4:
                ((tmt) obj).H(address);
                break;
            case 5:
                ((tmt) obj).A0(address);
                break;
            case 6:
                ((tmt) obj).A0(address);
                break;
            case 7:
                ((tmt) obj).H(address);
                break;
            case 8:
                ((tmt) obj).H(address);
                break;
            case 9:
                ((tmt) obj).A0(address);
                break;
            case 10:
                tyh tyhVar = (tyh) obj;
                if (tyhVar.a) {
                    a.P(tyhVar.b, tyhVar.c, address, tyhVar.w);
                }
                tyhVar.x.invoke(address);
                break;
            case 11:
                ((cai) obj).d(address);
                break;
            case 12:
                wfp wfpVar = (wfp) obj;
                switch (wfpVar.a) {
                    case 0:
                        wfpVar.b.a(address);
                        break;
                    default:
                        ((gjp) wfpVar.b).a(address);
                        break;
                }
            case 13:
                hiw hiwVar = (hiw) obj;
                iiw iiwVar = hiwVar.a;
                iiwVar.Q();
                aow aowVar = new aow(address, hiwVar.b);
                r0 r0Var = iiwVar.J.b;
                r0Var.getClass();
                r0Var.m(null, aowVar);
                break;
            case 14:
                ((tmt) obj).A0(address);
                break;
            case 15:
                ((tmt) obj).H(address);
                break;
            case 16:
                ((tmt) obj).W(address);
                break;
            case 17:
                ((flm) obj).n1(new o8g0(a8l0.a, address));
                break;
            case 18:
                ((kc30) obj).d(address);
                break;
            case 19:
                ((pf50) obj).p0(new pv0(this.b, null, null, null, null, null, null, null, 1022));
                break;
            default:
                ((k41) obj).d(address);
                break;
        }
        return zy11Var;
    }
}
