package defpackage;

import com.yandex.go.address.models.Address;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public final class vyx0 {
    public final mzz a = new mzz(30);

    public static String a(Address address, String str) {
        zzs B = address.B();
        BigDecimal bigDecimal = new BigDecimal(B.a);
        RoundingMode roundingMode = RoundingMode.DOWN;
        return a.X(scc.g(str, Float.valueOf(bigDecimal.setScale(7, roundingMode).floatValue()), Float.valueOf(new BigDecimal(B.b).setScale(7, roundingMode).floatValue()), "a"), null, null, null, null, 63);
    }
}
