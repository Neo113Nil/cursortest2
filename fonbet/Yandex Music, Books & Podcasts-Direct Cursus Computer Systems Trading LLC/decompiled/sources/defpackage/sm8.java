package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sm8 implements u1f {
    public static final ozb k;
    public static final ku8 l;
    public static final ozb m;
    public final szb a;
    public final szb b;
    public final szb c;
    public final List d;
    public final szb e;
    public final lu8 f;
    public final szb g;
    public final szb h;
    public Integer i;
    public Integer j;

    static {
        e3s.L(300L);
        k = e3s.L(um8.SPRING);
        l = new ku8(new b49());
        m = e3s.L(0L);
    }

    public sm8(szb szbVar, szb szbVar2, szb szbVar3, List list, szb szbVar4, lu8 lu8Var, szb szbVar5, szb szbVar6) {
        this.a = szbVar;
        this.b = szbVar2;
        this.c = szbVar3;
        this.d = list;
        this.e = szbVar4;
        this.f = lu8Var;
        this.g = szbVar5;
        this.h = szbVar6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x008e, code lost:
    
        if (r2 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(sm8 sm8Var, xzb xzbVar, xzb xzbVar2) {
        if (sm8Var != null && ((Number) this.a.a(xzbVar)).longValue() == ((Number) sm8Var.a.a(xzbVar2)).longValue()) {
            szb szbVar = this.b;
            Double d = szbVar != null ? (Double) szbVar.a(xzbVar) : null;
            szb szbVar2 = sm8Var.b;
            if (Intrinsics.b(d, szbVar2 != null ? (Double) szbVar2.a(xzbVar2) : null) && this.c.a(xzbVar) == sm8Var.c.a(xzbVar2)) {
                List list = sm8Var.d;
                List list2 = this.d;
                if (list2 != null) {
                    if (list != null && list2.size() == list.size()) {
                        int i = 0;
                        for (Object obj : list2) {
                            int i2 = i + 1;
                            if (i < 0) {
                                u75.n();
                                throw null;
                            }
                            if (!((sm8) obj).a((sm8) list.get(i), xzbVar, xzbVar2)) {
                                break;
                            }
                            i = i2;
                        }
                        if (this.e.a(xzbVar) == sm8Var.e.a(xzbVar2) && this.f.a(sm8Var.f, xzbVar, xzbVar2) && ((Number) this.g.a(xzbVar)).longValue() == ((Number) sm8Var.g.a(xzbVar2)).longValue()) {
                            szb szbVar3 = this.h;
                            Double d2 = szbVar3 != null ? (Double) szbVar3.a(xzbVar) : null;
                            szb szbVar4 = sm8Var.h;
                            if (Intrinsics.b(d2, szbVar4 != null ? (Double) szbVar4.a(xzbVar2) : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int hashCode;
        Integer num = this.j;
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = this.i;
        if (num2 != null) {
            hashCode = num2.intValue();
        } else {
            int hashCode2 = this.a.hashCode() + ern.a(sm8.class).hashCode();
            szb szbVar = this.b;
            int hashCode3 = this.g.hashCode() + this.f.b() + this.e.hashCode() + this.c.hashCode() + hashCode2 + (szbVar != null ? szbVar.hashCode() : 0);
            szb szbVar2 = this.h;
            hashCode = (szbVar2 != null ? szbVar2.hashCode() : 0) + hashCode3;
            this.i = Integer.valueOf(hashCode);
        }
        int i = 0;
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += ((sm8) it.next()).b();
            }
        }
        int i2 = hashCode + i;
        this.j = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((vm8) rj3.b.z1.getValue()).b(rj3.a, this);
    }

    public /* synthetic */ sm8(ozb ozbVar, ozb ozbVar2, ozb ozbVar3, ozb ozbVar4) {
        this(ozbVar, ozbVar2, k, null, ozbVar3, l, m, ozbVar4);
    }
}
