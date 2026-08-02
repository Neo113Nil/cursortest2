package defpackage;

import com.yandex.go.scooters.b;
import com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerificationStatusDto;
import java.util.List;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2ModalView;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class v1n0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ v1n0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        h9o h9oVar;
        h9o h9oVar2;
        zy11 zy11Var;
        int i = this.a;
        int i2 = 9;
        zy11 zy11Var2 = zy11.a;
        switch (i) {
            case 0:
                b2n0 b2n0Var = (b2n0) obj;
                b2n0Var.a.r(new qu(i2));
                b2n0Var.b.invoke(zy11Var2);
                return zy11Var2;
            case 1:
                e9o e9oVar = ((b9o) obj).a;
                if (e9oVar == null || (h9oVar = e9oVar.c) == null) {
                    return null;
                }
                return h9oVar.c;
            case 2:
                e9o e9oVar2 = ((b9o) obj).a;
                if (e9oVar2 == null || (h9oVar2 = e9oVar2.c) == null) {
                    return null;
                }
                return h9oVar2.c;
            case 3:
                ean0 ean0Var = (ean0) obj;
                switch (ean0Var.a) {
                    case 0:
                        ((a) ean0Var.b).r(new v1n0(i2));
                        return zy11Var2;
                    default:
                        ((tmm0) ean0Var.b).invoke();
                        return zy11Var2;
                }
            case 4:
                z5n0 z5n0Var = (z5n0) obj;
                return z5n0Var instanceof y5n0 ? q1b1.d(((y5n0) z5n0Var).j).a : qoi0.a(z5n0Var.getClass());
            case 5:
                return qoi0.a(((z5n0) obj).getClass());
            case 6:
                ((fan0) obj).a.invoke();
                return zy11Var2;
            case 7:
                ((han0) obj).a.r(new v1n0(11));
                return zy11Var2;
            case 8:
                ((egn0) obj).b.invoke();
                return zy11Var2;
            case 9:
                ((egn0) obj).a.invoke();
                return zy11Var2;
            case 10:
                ((egn0) obj).c.invoke();
                return zy11Var2;
            case 11:
                ((egn0) obj).c.invoke();
                return zy11Var2;
            case 12:
                ((egn0) obj).c.invoke();
                return zy11Var2;
            case 13:
                ((dnn0) obj).a.invoke();
                return zy11Var2;
            case 14:
                ((bso0) obj).a.invoke();
                return zy11Var2;
            case 15:
                ru.yandex.taxi.scooters.presentation.detailed_order.v2.a aVar = ((bgn0) obj).a;
                aVar.z((m950) aVar.a0.get(), sy60.Q2);
                return zy11Var2;
            case 16:
                zuo0 zuo0Var = (zuo0) obj;
                if (zuo0Var != null) {
                    return qoi0.a(zuo0Var.getClass());
                }
                return null;
            case 17:
                zy11Var = ScootersDetailedOrderV2ModalView.topButtonContainer$lambda$3((bhn0) obj);
                return zy11Var;
            case 18:
                ((nlo0) obj).a.r(new pzn0(25));
                return zy11Var2;
            case 19:
                nlo0 nlo0Var = (nlo0) obj;
                b bVar = nlo0Var.a;
                bVar.d0 = null;
                pxm0 pxm0Var = new pxm0("scooters_discovery", "scooter_discovery");
                nao0 nao0Var = new nao0(4, bVar, nlo0Var.b);
                com.yandex.go.scooters.offer_on_camera.b bVar2 = bVar.h0;
                if (bVar2 == null) {
                    bVar2 = (com.yandex.go.scooters.offer_on_camera.b) bVar.O.get();
                    bVar.h0 = bVar2;
                }
                bVar.A(bVar2, new v3o0(pxm0Var, null), new klo0(bVar, pxm0Var, nao0Var));
                return zy11Var2;
            case 20:
                return Boolean.valueOf(((ScootersDriverLicenseVerificationStatusDto) obj) == ScootersDriverLicenseVerificationStatusDto.PENDING);
            case 21:
                return zy11Var2;
            case 22:
                ((ujn0) obj).k();
                return zy11Var2;
            case 23:
                ((ujn0) obj).z();
                return zy11Var2;
            case 24:
                ((ujn0) obj).z0();
                return zy11Var2;
            case 25:
                ((ujn0) obj).c();
                return zy11Var2;
            case 26:
                ((ujn0) obj).y0();
                return zy11Var2;
            case 27:
                ((ujn0) obj).Q0();
                return zy11Var2;
            case 28:
                ((ujn0) obj).l0();
                return zy11Var2;
            default:
                return kotlin.collections.a.X((List) obj, ",", null, null, null, 62);
        }
    }
}
