package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes5.dex */
public final class u610 implements gie0 {
    public final String a;
    public final String b;

    public u610(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.gie0
    public final boolean a(die0 die0Var) {
        if (!jl40.l(die0Var.b, this.b)) {
            return false;
        }
        List list = die0Var.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaymentMethod$Type a = ((e4a0) it.next()).a();
            if (jl40.l(a != null ? a.getCode() : null, this.a)) {
                return true;
            }
        }
        return false;
    }
}
