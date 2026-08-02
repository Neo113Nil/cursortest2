package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g09 implements u1f {
    public final List a;
    public final String b;
    public final String c;
    public final nx8 d;
    public Integer e;

    public g09(List list, String str, String str2, nx8 nx8Var) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = nx8Var;
    }

    public final boolean a(g09 g09Var) {
        if (g09Var != null) {
            List list = g09Var.a;
            List list2 = this.a;
            if (list2.size() == list.size()) {
                Iterator it = list2.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        if (!Intrinsics.d(this.b, g09Var.b) || !Intrinsics.d(this.c, g09Var.c) || this.d != g09Var.d) {
                            break;
                        }
                        return true;
                    }
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        u75.n();
                        throw null;
                    }
                    h09 h09Var = (h09) list.get(i);
                    h09 h09Var2 = (h09) next;
                    if (h09Var != null) {
                        if (!Intrinsics.d(h09Var2.a, h09Var.a) || h09Var2.b != h09Var.b) {
                            break;
                        }
                        i = i2;
                    } else {
                        h09Var2.getClass();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(g09.class).hashCode();
        int i2 = 0;
        for (h09 h09Var : this.a) {
            Integer num2 = h09Var.c;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode2 = h09Var.b.hashCode() + h09Var.a.hashCode() + ern.a(h09.class).hashCode();
                h09Var.c = Integer.valueOf(hashCode2);
                i = hashCode2;
            }
            i2 += i;
        }
        int hashCode3 = this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + hashCode + i2;
        this.e = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((l09) rj3.b.U3.getValue()).b(rj3.a, this);
    }
}
