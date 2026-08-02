package defpackage;

import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zw8 implements u1f {
    public final List a;
    public final List b;
    public Integer c;

    public zw8(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0044, code lost:
    
        if (r1 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(zw8 zw8Var, xzb xzbVar, xzb xzbVar2) {
        if (zw8Var == null) {
            return false;
        }
        List list = zw8Var.a;
        List list2 = this.a;
        if (list2 != null) {
            if (list != null && list2.size() == list.size()) {
                int i = 0;
                for (Object obj : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        u75.n();
                        throw null;
                    }
                    if (!((bd8) obj).a((bd8) list.get(i), xzbVar, xzbVar2)) {
                        break;
                    }
                    i = i2;
                }
                List list3 = zw8Var.b;
                List list4 = this.b;
                if (list4 != null) {
                    if (list3 != null && list4.size() == list3.size()) {
                        int i3 = 0;
                        for (Object obj2 : list4) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                u75.n();
                                throw null;
                            }
                            if (((bd8) obj2).a((bd8) list3.get(i3), xzbVar, xzbVar2)) {
                                i3 = i4;
                            }
                        }
                        return true;
                    }
                } else if (list3 == null) {
                    return true;
                }
            }
            return false;
        }
    }

    public final int b() {
        int i;
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(zw8.class).hashCode();
        int i2 = 0;
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((bd8) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        List list2 = this.b;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                i2 += ((bd8) it2.next()).b();
            }
        }
        int i4 = i3 + i2;
        this.c = Integer.valueOf(i4);
        return i4;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        ax8 ax8Var = (ax8) rj3.b.b3.getValue();
        pt0 pt0Var = rj3.a;
        ax8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        jyr jyrVar = ax8Var.a.t1;
        etn.n0(pt0Var, jSONObject, "on_fail_actions", this.a, jyrVar);
        etn.n0(pt0Var, jSONObject, "on_success_actions", this.b, jyrVar);
        return jSONObject;
    }
}
