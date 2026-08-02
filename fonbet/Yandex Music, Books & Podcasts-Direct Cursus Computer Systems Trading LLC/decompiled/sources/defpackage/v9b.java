package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v9b {
    public final String a;
    public final d85 b;
    public final String c;

    public v9b(String str, d85 d85Var, String str2) {
        str.getClass();
        this.a = str;
        this.b = d85Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9b)) {
            return false;
        }
        v9b v9bVar = (v9b) obj;
        return Intrinsics.d(this.a, v9bVar.a) && Intrinsics.d(this.b, v9bVar.b) && Intrinsics.d(this.c, v9bVar.c);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        d85 d85Var = this.b;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        int i = (hashCode2 + hashCode) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EntityCoverUiData(uri=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", videoUrl=");
        return su4.o(sb, this.c, ")");
    }
}
