package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pr8 implements u1f {
    public final szb a;
    public final String b;
    public final List c;
    public Integer d;

    public pr8(szb szbVar, String str, List list) {
        this.a = szbVar;
        this.b = str;
        this.c = list;
    }

    public final boolean a(pr8 pr8Var, xzb xzbVar, xzb xzbVar2) {
        int i;
        if (pr8Var != null && Intrinsics.d(this.a.a(xzbVar), pr8Var.a.a(xzbVar2)) && this.b.equals(pr8Var.b)) {
            List list = pr8Var.c;
            List list2 = this.c;
            if (list2.size() == list.size()) {
                for (Object obj : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        u75.n();
                        throw null;
                    }
                    or8 or8Var = (or8) list.get(i);
                    or8 or8Var2 = (or8) obj;
                    if (or8Var == null) {
                        or8Var2.getClass();
                        return false;
                    }
                    if (or8Var2.a.a(or8Var.a, xzbVar, xzbVar2)) {
                        szb szbVar = or8Var2.b;
                        String str = szbVar != null ? (String) szbVar.a(xzbVar) : null;
                        szb szbVar2 = or8Var.b;
                        i = (Intrinsics.d(str, szbVar2 != null ? (String) szbVar2.a(xzbVar2) : null) && ((Boolean) or8Var2.c.a(xzbVar)).booleanValue() == ((Boolean) or8Var.c.a(xzbVar2)).booleanValue()) ? i2 : 0;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int b() {
        int i;
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + ern.a(pr8.class).hashCode();
        int i2 = 0;
        for (or8 or8Var : this.c) {
            Integer num2 = or8Var.d;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int b = or8Var.a.b() + ern.a(or8.class).hashCode();
                szb szbVar = or8Var.b;
                int hashCode2 = or8Var.c.hashCode() + b + (szbVar != null ? szbVar.hashCode() : 0);
                or8Var.d = Integer.valueOf(hashCode2);
                i = hashCode2;
            }
            i2 += i;
        }
        int i3 = hashCode + i2;
        this.d = Integer.valueOf(i3);
        return i3;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((qr8) rj3.b.m2.getValue()).b(rj3.a, this);
    }
}
