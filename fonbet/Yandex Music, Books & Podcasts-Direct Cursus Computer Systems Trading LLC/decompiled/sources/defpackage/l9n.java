package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l9n {
    public final String a;
    public final String b;
    public final c94 c;
    public final k9n d;
    public final jxi e;

    public l9n(String str, String str2, c94 c94Var, k9n k9nVar, jxi jxiVar) {
        k9nVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = c94Var;
        this.d = k9nVar;
        this.e = jxiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9n)) {
            return false;
        }
        l9n l9nVar = (l9n) obj;
        return Intrinsics.d(this.a, l9nVar.a) && Intrinsics.d(this.b, l9nVar.b) && this.c.equals(l9nVar.c) && Intrinsics.d(this.d, l9nVar.d) && Intrinsics.d(this.e, l9nVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        jxi jxiVar = this.e;
        return hashCode2 + (jxiVar != null ? jxiVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("QueueInfoUiData(title=", this.a, ", subtitle=", this.b, ", castState=");
        m.append(this.c);
        m.append(", queueNavigation=");
        m.append(this.d);
        m.append(", navigationContextEntity=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
