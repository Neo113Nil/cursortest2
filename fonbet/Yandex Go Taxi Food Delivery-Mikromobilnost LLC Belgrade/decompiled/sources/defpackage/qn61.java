package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import yads.f5;

/* loaded from: classes7.dex */
public final class qn61 {
    public final e971 a = new e971();
    public final fl81 b = new fl81();
    public final f5 c = f5.F;

    public final Long a() {
        List J0;
        Object obj;
        e971 e971Var = this.a;
        synchronized (e971Var.a) {
            J0 = a.J0(e971Var.d);
        }
        Iterator it = J0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((y271) obj).a == this.c) {
                break;
            }
        }
        y271 y271Var = (y271) obj;
        if (y271Var != null) {
            Object obj2 = y271Var.b.get("duration");
            if (obj2 instanceof Long) {
                return (Long) obj2;
            }
        }
        return null;
    }
}
