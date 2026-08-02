package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q7n {
    public final String a;
    public final String b;
    public final int c;

    public q7n(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7n)) {
            return false;
        }
        q7n q7nVar = (q7n) obj;
        return this.a.equals(q7nVar.a) && Intrinsics.d(this.b, q7nVar.b) && this.c == q7nVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return f1d.i(f1d.m("QueryToVibeWaveListItemUiData(title=", this.a, ", description=", this.b, ", iconIndex="), this.c, ")");
    }
}
