package defpackage;

import com.yandex.xplat.common.JSONItemKind;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public abstract class toa1 {
    public static final LinkedHashMap a(y3x y3xVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if ((y3xVar != null ? y3xVar.a : null) == JSONItemKind.map) {
            zv91.b(((wj00) y3xVar).b, new loj(25, linkedHashMap));
        }
        return linkedHashMap;
    }

    public static final a1k0 b(oeu oeuVar) {
        try {
            if (jl40.l(oeuVar.a("X-YaTaxi-Retry-Action"), "stop")) {
                return y0k0.a;
            }
            String a = oeuVar.a("X-YaTaxi-Retry-Interval-Ms");
            Long m = a != null ? bvu0.m(10, a) : null;
            if (m == null || m.longValue() <= 0) {
                return null;
            }
            return new w0k0(m.longValue());
        } catch (Throwable th) {
            xby.d.k(th, "Invalid retry headers received");
            return null;
        }
    }

    public static int c(Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }
}
