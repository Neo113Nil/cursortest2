package defpackage;

import com.yandex.go.scooters.offers.v2.domain.b;
import com.yandex.go.scooters.offers.v2.newbie_guide.a;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import java.util.Arrays;
import java.util.Locale;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.scooters.domain.model.ScootersEvolvingFailedException;

/* loaded from: classes13.dex */
public final /* synthetic */ class umm0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ umm0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 1:
                return qoi0.a(((cb01) obj).getClass());
            case 2:
                return ((rsg) obj).c.i();
            case 3:
                return ((b8z0) obj).b;
            case 4:
                String str = (String) obj;
                if (str.length() <= 0) {
                    return str;
                }
                return ((Object) String.valueOf(str.charAt(0)).toLowerCase(Locale.ROOT)) + str.substring(1);
            case 5:
                String str2 = (String) obj;
                if (str2.length() <= 0) {
                    return str2;
                }
                return ((Object) String.valueOf(str2.charAt(0)).toUpperCase(Locale.ROOT)) + str2.substring(1);
            case 6:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = av0.H;
                lbd.a.getClass();
                ((agd) yfdVar).g = lbd.b;
                return zy11Var;
            case 7:
                ((ypm0) obj).onCancel();
                return zy11Var;
            case 8:
                ((ypm0) obj).c1();
                return zy11Var;
            case 9:
                Throwable th = (Throwable) obj;
                if ((th instanceof ScootersEvolvingFailedException) && ((ScootersEvolvingFailedException) th).getErrorCode() == ScootersErrorCode.REQUIRED_DEPOSIT_IS_NOT_HELD) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 10:
                nsm0 nsm0Var = (nsm0) obj;
                ygi0 ygi0Var = nsm0Var.a;
                ygi0Var.D((m950) ((zmm0) ygi0Var.M).get(), new hum0(nsm0Var.b, nsm0Var.c), new psm0(ygi0Var));
                return zy11Var;
            case 11:
                ((nsm0) obj).a.r(new umm0(16));
                return zy11Var;
            case 12:
                ((nsm0) obj).a.r(new umm0(15));
                return zy11Var;
            case 13:
                osm0 osm0Var = (osm0) obj;
                ygi0 ygi0Var2 = osm0Var.a;
                avm0 avm0Var = osm0Var.b;
                ScootersPassesFromScreen scootersPassesFromScreen = osm0Var.c;
                ygi0Var2.D((m950) ((zmm0) ygi0Var2.L).get(), new jrm0(avm0Var, scootersPassesFromScreen), new nsm0(ygi0Var2, avm0Var, scootersPassesFromScreen));
                return zy11Var;
            case 14:
                ((osm0) obj).a.r(new umm0(17));
                return zy11Var;
            case 15:
                ((jsm0) obj).K();
                return zy11Var;
            case 16:
                ((jsm0) obj).L();
                return zy11Var;
            case 17:
                ((jsm0) obj).K();
                return zy11Var;
            case 18:
                ((psm0) obj).a.r(new qu(9));
                return zy11Var;
            case 19:
                ((a) obj).n1();
                return zy11Var;
            case 20:
                return Boolean.valueOf(((zs7) obj).c);
            case 21:
                rsn rsnVar = (rsn) obj;
                return Long.valueOf((rsnVar.a == null || rsnVar.b != null) ? 0L : 600L);
            case 22:
                ((aso0) obj).a.invoke();
                return zy11Var;
            case 23:
                ((aso0) obj).a.invoke();
                return zy11Var;
            case 24:
                ((p0n0) obj).s0();
                return zy11Var;
            case 25:
                return Boolean.valueOf(((Integer) obj).intValue() == qfh0.scooters_component_header);
            case 26:
                return Boolean.valueOf(((Integer) obj).intValue() == qfh0.scooters_component_scooters_list);
            case 27:
                ((Integer) obj).getClass();
                int i2 = b.h;
                return Boolean.FALSE;
            case 28:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%x", Arrays.copyOf(new Object[]{b}, 1));
            default:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                return String.format("%x", Arrays.copyOf(new Object[]{b2}, 1));
        }
    }
}
