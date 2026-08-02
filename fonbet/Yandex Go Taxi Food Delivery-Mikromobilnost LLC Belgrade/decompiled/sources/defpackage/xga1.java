package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Iterator;
import kotlin.time.DurationUnit;

/* loaded from: classes11.dex */
public abstract class xga1 {
    public static final wis0 a(int i, int i2) {
        return new wis0(new lkj(i), new lkj(i2));
    }

    public static final boolean b(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    public static final boolean c(Context context) {
        return (context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static long d(sro sroVar) {
        long receivedAt = sroVar.getReceivedAt();
        o430 o430Var = e3n.b;
        return e3n.e(kp50.V(sroVar.getTtl(), DurationUnit.SECONDS)) + receivedAt;
    }

    public static final boolean e(wis0 wis0Var) {
        return wis0Var.equals(wis0.c);
    }

    public static final boolean f(x9i0 x9i0Var, String str) {
        Iterator it = x9i0Var.e.iterator();
        while (it.hasNext()) {
            if (((kyn) it.next()).a.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
