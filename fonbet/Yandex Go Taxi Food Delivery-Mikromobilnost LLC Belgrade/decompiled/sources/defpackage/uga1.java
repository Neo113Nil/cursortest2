package defpackage;

import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.experiments.c;

/* loaded from: classes6.dex */
public abstract class uga1 {
    public static final float a(vh71 vh71Var, RectF rectF, RectF rectF2) {
        float height = rectF.height();
        float width = rectF.width();
        float height2 = rectF2.height();
        float width2 = rectF2.width();
        if (height == 0.0f || width == 0.0f || height2 == 0.0f || width2 == 0.0f) {
            return Float.MAX_VALUE;
        }
        float min = Math.min(1.0f, width2 / height2 > width / height ? height / height2 : width / width2);
        int i = vh71Var.c;
        int i2 = vh71Var.d;
        float f = i * min;
        if (width < ((int) f)) {
            return Float.MAX_VALUE;
        }
        float f2 = i2 * min;
        if (height < ((int) f2)) {
            return Float.MAX_VALUE;
        }
        return Math.abs(height - f2) + Math.abs(width - f);
    }

    public static final c b(rqo rqoVar, w96 w96Var) {
        return new c(new dzm(10, w96Var), ((jbh) rqoVar).d(w96Var));
    }

    public static final boolean c(int i) {
        return i >= 1 && i < 4;
    }

    public static boolean d(int i) {
        return i >= 4 && i <= 5;
    }

    public static final boolean e(int i) {
        return i < 1 || i > 5;
    }

    public static final void f(bfx bfxVar, Object obj) {
        if (obj == null) {
            bfxVar.k2();
            return;
        }
        if (obj instanceof Map) {
            bfxVar.u();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                bfxVar.A1(String.valueOf(key));
                f(bfxVar, value);
            }
            bfxVar.y();
            return;
        }
        if (obj instanceof List) {
            bfxVar.l();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                f(bfxVar, it.next());
            }
            bfxVar.j();
            return;
        }
        if (obj instanceof Boolean) {
            bfxVar.n1(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            bfxVar.Y0(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            bfxVar.X0(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            bfxVar.Z0(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof hdx) {
            bfxVar.o0((hdx) obj);
        } else if (obj instanceof String) {
            bfxVar.r0((String) obj);
        } else {
            w511.j("Cannot write ", obj, " to Json");
        }
    }
}
