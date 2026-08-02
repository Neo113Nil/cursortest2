package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e87 {
    public final boolean a;
    public final z77 b;
    public final String c;
    public final String d;

    public e87(boolean z, z77 z77Var, String str, String str2) {
        z77Var.getClass();
        str2.getClass();
        this.a = z;
        this.b = z77Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e87)) {
            return false;
        }
        e87 e87Var = (e87) obj;
        return this.a == e87Var.a && Intrinsics.d(this.b, e87Var.b) && Intrinsics.d(this.c, e87Var.c) && Intrinsics.d(this.d, e87Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(isDailyAppWidgetEnabled=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", userId=");
        sb.append(this.c);
        sb.append(", consumerName=");
        return dfi.i(sb, this.d, ')');
    }
}
