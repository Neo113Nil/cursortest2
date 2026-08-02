package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g8t {
    public final y3c a;
    public final ysq b;
    public final bc4 c;
    public final boolean d;
    public final Map e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g8t(y3c y3cVar, ysq ysqVar, bc4 bc4Var, ocg ocgVar, LinkedHashMap linkedHashMap, int i) {
        this(r3, r4, r5, r6, r7, r14);
        y3c y3cVar2 = (i & 1) != 0 ? null : y3cVar;
        ysq ysqVar2 = (i & 2) != 0 ? null : ysqVar;
        bc4 bc4Var2 = (i & 4) != 0 ? null : bc4Var;
        ocg ocgVar2 = (i & 8) != 0 ? null : ocgVar;
        boolean z = (i & 16) == 0;
        Map map = linkedHashMap;
        if ((i & 32) != 0) {
            Map map2 = e5b.a;
            map2.getClass();
            map = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8t)) {
            return false;
        }
        g8t g8tVar = (g8t) obj;
        return Intrinsics.d(this.a, g8tVar.a) && Intrinsics.d(this.b, g8tVar.b) && Intrinsics.d(this.c, g8tVar.c) && Intrinsics.d(null, null) && this.d == g8tVar.d && Intrinsics.d(this.e, g8tVar.e);
    }

    public final int hashCode() {
        y3c y3cVar = this.a;
        int hashCode = (y3cVar == null ? 0 : y3cVar.hashCode()) * 31;
        ysq ysqVar = this.b;
        int hashCode2 = (hashCode + (ysqVar == null ? 0 : ysqVar.hashCode())) * 31;
        bc4 bc4Var = this.c;
        return this.e.hashCode() + k5r.e((((hashCode2 + (bc4Var == null ? 0 : bc4Var.hashCode())) * 31) + 0) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionData(fade=");
        sb.append(this.a);
        sb.append(", slide=");
        sb.append(this.b);
        sb.append(", changeSize=");
        sb.append(this.c);
        sb.append(", scale=");
        sb.append((Object) null);
        sb.append(", hold=");
        sb.append(this.d);
        sb.append(", effectsMap=");
        return k5r.p(sb, this.e, ')');
    }

    public g8t(y3c y3cVar, ysq ysqVar, bc4 bc4Var, ocg ocgVar, boolean z, Map map) {
        this.a = y3cVar;
        this.b = ysqVar;
        this.c = bc4Var;
        this.d = z;
        this.e = map;
    }
}
