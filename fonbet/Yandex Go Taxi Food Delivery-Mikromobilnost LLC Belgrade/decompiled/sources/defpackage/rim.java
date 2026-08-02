package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.objects.DriverPictures;
import com.yandex.go.taxi.order.models.api.objects.Organization;
import com.yandex.go.taxi.order.models.api.objects.TaxiOrderAdditionalData;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public abstract class rim {
    public static final qim a(TaxiOrder taxiOrder) {
        n7v n7vVar;
        TaxiOrderAdditionalData b = taxiOrder.b();
        OrderStatusInfo V = taxiOrder.V();
        Driver driver = taxiOrder.V().g;
        String str = driver.f;
        String str2 = driver.d;
        String str3 = driver.c;
        String str4 = driver.g;
        List list = driver.k;
        String str5 = driver.l;
        List list2 = driver.m;
        String str6 = driver.n;
        String str7 = driver.o;
        DriverPictures driverPictures = b.a;
        if (driverPictures == null || (n7vVar = driverPictures.b) == null) {
            n7vVar = n7v.f;
        }
        n7v a = b.a();
        Organization organization = V.d;
        String str8 = organization != null ? organization.b : null;
        if (str8 == null) {
            str8 = "";
        }
        StringBuilder sb = new StringBuilder();
        String str9 = driver.b;
        if (str3 != null && !evu0.J(str3)) {
            sb.append(str3);
        }
        if (str9 != null && !evu0.J(str9)) {
            sb.append(" ");
            sb.append(str9);
        }
        String a2 = t7s.a(str2);
        if (a2 != null && !evu0.J(a2)) {
            if (sb.length() > 0) {
                sb.append(Extension.FIX_SPACE);
            }
            sb.append(a2);
        }
        return new qim(str, str4, list, str5, list2, str6, str7, n7vVar, a, str8, evu0.k0(sb.toString()).toString(), t7s.a(str2), driver.q, driver.r, driver.s);
    }
}
