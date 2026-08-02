package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class reg {
    public final qeg a;
    public final leg b;
    public final List c;
    public final ArrayList d;

    public reg(qeg qegVar, leg legVar, List list, ArrayList arrayList) {
        this.a = qegVar;
        this.b = legVar;
        this.c = list;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reg)) {
            return false;
        }
        reg regVar = (reg) obj;
        return jl40.l(this.a, regVar.a) && jl40.l(this.b, regVar.b) && jl40.l(this.c, regVar.c) && this.d.equals(regVar.d);
    }

    public final int hashCode() {
        qeg qegVar = this.a;
        int hashCode = (qegVar == null ? 0 : qegVar.a.hashCode()) * 31;
        leg legVar = this.b;
        int hashCode2 = (hashCode + (legVar == null ? 0 : legVar.hashCode())) * 31;
        List list = this.c;
        return this.d.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DarkConfigurationShortcutFragment(textStyle=");
        sb.append(this.a);
        sb.append(", background=");
        sb.append(this.b);
        sb.append(", commonOverlays=");
        sb.append(this.c);
        sb.append(", actions=");
        return smw0.m(sb, this.d, ')');
    }
}
