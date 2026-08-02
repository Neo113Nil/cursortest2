package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g89 implements u1f {
    public final szb a;
    public final List b;
    public final vzb c;
    public Integer d;

    public g89(szb szbVar, List list, vzb vzbVar) {
        this.a = szbVar;
        this.b = list;
        this.c = vzbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
    
        if (r10 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(g89 g89Var, xzb xzbVar, xzb xzbVar2) {
        List a;
        List a2;
        if (g89Var != null) {
            vzb vzbVar = g89Var.c;
            if (((Number) this.a.a(xzbVar)).longValue() == ((Number) g89Var.a.a(xzbVar2)).longValue()) {
                List list = g89Var.b;
                List list2 = this.b;
                if (list2 != null) {
                    if (list != null && list2.size() == list.size()) {
                        int i = 0;
                        for (Object obj : list2) {
                            int i2 = i + 1;
                            if (i < 0) {
                                u75.n();
                                throw null;
                            }
                            f89 f89Var = (f89) list.get(i);
                            f89 f89Var2 = (f89) obj;
                            if (f89Var == null) {
                                f89Var2.getClass();
                                return false;
                            }
                            if (((Number) f89Var2.a.a(xzbVar)).intValue() != ((Number) f89Var.a.a(xzbVar2)).intValue() || ((Number) f89Var2.b.a(xzbVar)).doubleValue() != ((Number) f89Var.b.a(xzbVar2)).doubleValue()) {
                                break;
                            }
                            i = i2;
                        }
                        vzb vzbVar2 = this.c;
                        if (vzbVar2 != null && (a = vzbVar2.a(xzbVar)) != null) {
                            if (vzbVar != null && (a2 = vzbVar.a(xzbVar2)) != null && a.size() == a2.size()) {
                                int i3 = 0;
                                for (Object obj2 : a) {
                                    int i4 = i3 + 1;
                                    if (i3 < 0) {
                                        u75.n();
                                        throw null;
                                    }
                                    if (((Number) obj2).intValue() == ((Number) a2.get(i3)).intValue()) {
                                        i3 = i4;
                                    }
                                }
                                return true;
                            }
                        } else if (vzbVar == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        int i2;
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + ern.a(g89.class).hashCode();
        List<f89> list = this.b;
        if (list != null) {
            i = 0;
            for (f89 f89Var : list) {
                Integer num2 = f89Var.c;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    int hashCode2 = f89Var.b.hashCode() + f89Var.a.hashCode() + ern.a(f89.class).hashCode();
                    f89Var.c = Integer.valueOf(hashCode2);
                    i2 = hashCode2;
                }
                i += i2;
            }
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        vzb vzbVar = this.c;
        int hashCode3 = i3 + (vzbVar != null ? vzbVar.hashCode() : 0);
        this.d = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((j89) rj3.b.b5.getValue()).b(rj3.a, this);
    }
}
