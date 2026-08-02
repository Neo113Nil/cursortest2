package defpackage;

import com.yandex.go.address.models.Address;
import java.util.Iterator;
import ru.yandex.taxi.common_models.net.NotificationParams;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes5.dex */
public final class qce0 implements pce0 {
    public final tq1 a;

    public qce0(tq1 tq1Var) {
        this.a = tq1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oce0 a(Address address, zzs zzsVar, yuf0 yuf0Var) {
        yf3 yf3Var;
        if (yuf0Var != null) {
            String str = (String) yuf0Var.a;
            NotificationParams notificationParams = (NotificationParams) yuf0Var.e;
            if (evu0.J(str)) {
                jst.e.x(new IllegalArgumentException("missing alert id"), "can't show alert");
            } else {
                boolean z = true;
                if (notificationParams == null) {
                    yf3Var = new yf3(yuf0Var, -1, true);
                } else {
                    sq1 a = this.a.a(str);
                    if (a.b(notificationParams)) {
                        int i = a.d + 1;
                        jsq0 jsq0Var = notificationParams.d;
                        if (jsq0Var == null || !jsq0Var.a.isEmpty()) {
                            Iterator it = jsq0Var.a.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (((NotificationParams.BehaviorOption) it.next()) == NotificationParams.BehaviorOption.DONT_HIDE_SUMMARY) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        yf3Var = new yf3(yuf0Var, i, z);
                    }
                }
                if (yf3Var != null) {
                    yuf0 yuf0Var2 = (yuf0) yf3Var.c;
                    return new oce0((String) yuf0Var2.a, (String) yuf0Var2.b, (String) yuf0Var2.c, (String) yuf0Var2.d, (String) yuf0Var2.f, address, zzsVar == null ? address.B() : zzsVar, RoutePointType.POINT_A, yf3Var.a, yf3Var.b, false);
                }
            }
            yf3Var = null;
            if (yf3Var != null) {
            }
        }
        return null;
    }
}
