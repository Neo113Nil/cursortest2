package defpackage;

import com.google.android.gms.internal.play_billing.p;
import com.google.android.gms.internal.play_billing.s;
import com.google.android.gms.internal.play_billing.t;
import com.google.android.gms.internal.play_billing.u;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class xea1 {
    public static final xea1 c = new xea1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final lba1 a = new lba1();

    public final ofa1 a(Class cls) {
        ofa1 i;
        Charset charset = q7a1.a;
        if (cls == null) {
            ny61.t("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        ofa1 ofa1Var = (ofa1) concurrentHashMap.get(cls);
        if (ofa1Var != null) {
            return ofa1Var;
        }
        lba1 lba1Var = this.a;
        lba1Var.getClass();
        xp91 xp91Var = u.a;
        p.class.isAssignableFrom(cls);
        jfa1 a = lba1Var.a.a(cls);
        if ((a.d & 2) == 2) {
            xp91 xp91Var2 = u.a;
            sp91 sp91Var = e3a1.a;
            i = t.i(xp91Var2, a.a);
        } else {
            int i2 = kea1.a;
            int i3 = naa1.a;
            xp91 xp91Var3 = u.a;
            sp91 sp91Var2 = a.a() + (-1) != 1 ? e3a1.a : null;
            int i4 = hca1.a;
            i = s.u(a, xp91Var3, sp91Var2);
        }
        ofa1 ofa1Var2 = (ofa1) concurrentHashMap.putIfAbsent(cls, i);
        return ofa1Var2 == null ? i : ofa1Var2;
    }
}
