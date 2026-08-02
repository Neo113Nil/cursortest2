package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.yandex.messaging.auth.AuthEnvironment;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.enums.SwEnum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.design.AddressInputComponent;

/* loaded from: classes15.dex */
public abstract class una1 {
    public static mq0 a(AddressInputComponent addressInputComponent) {
        return new mq0(ngd0.n(addressInputComponent.getAddressEditText(), null, 0), addressInputComponent);
    }

    public static boolean b(byte[] bArr, SwEnum swEnum) {
        SwEnum swEnum2;
        SwEnum.Companion.getClass();
        if (bArr != null && bArr.length >= 2) {
            SwEnum[] values = SwEnum.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                swEnum2 = values[i];
                if ((swEnum2.getStatus().length == 1 && bArr[bArr.length - 2] == swEnum2.getStatus()[0]) || (bArr[bArr.length - 2] == swEnum2.getStatus()[0] && bArr[bArr.length - 1] == swEnum2.getStatus()[1])) {
                    break;
                }
            }
        }
        swEnum2 = null;
        return swEnum2 == swEnum;
    }

    public static final Filter c(vh3 vh3Var) {
        Filter.a aVar = new Filter.a();
        aVar.a = q8a1.d(vh3Var.a);
        AuthEnvironment authEnvironment = vh3Var.b;
        aVar.b = authEnvironment != null ? q8a1.d(authEnvironment) : null;
        aVar.c(PassportAccountType.PORTAL, PassportAccountType.SOCIAL, PassportAccountType.LITE, PassportAccountType.CHILDISH);
        return aVar.a();
    }

    public static Rect d(List list) {
        Iterator it = list.iterator();
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            i2 = Math.min(i2, point.x);
            i = Math.max(i, point.x);
            i3 = Math.min(i3, point.y);
            i4 = Math.max(i4, point.y);
        }
        return new Rect(i2, i3, i, i4);
    }

    public static List e(zzf zzfVar) {
        Point[] pointArr = new Point[4];
        double sin = Math.sin(Math.toRadians(zzfVar.zze));
        double cos = Math.cos(Math.toRadians(zzfVar.zze));
        pointArr[0] = new Point(zzfVar.zza, zzfVar.zzb);
        double d = zzfVar.zza;
        double d2 = zzfVar.zzc;
        Point point = new Point((int) (d + (d2 * cos)), (int) ((d2 * sin) + zzfVar.zzb));
        pointArr[1] = point;
        double d3 = point.x;
        int i = zzfVar.zzd;
        pointArr[2] = new Point((int) (d3 - (i * sin)), (int) ((i * cos) + pointArr[1].y));
        Point point2 = pointArr[0];
        int i2 = point2.x;
        Point point3 = pointArr[2];
        int i3 = point3.x;
        Point point4 = pointArr[1];
        pointArr[3] = new Point((i3 - point4.x) + i2, (point3.y - point4.y) + point2.y);
        return Arrays.asList(pointArr);
    }
}
