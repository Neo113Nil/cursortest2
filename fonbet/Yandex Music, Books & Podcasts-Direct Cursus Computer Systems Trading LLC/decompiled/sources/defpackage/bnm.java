package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class bnm {
    public final String a;
    public final String b;

    public bnm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnm)) {
            return false;
        }
        bnm bnmVar = (bnm) obj;
        return Intrinsics.d(this.a, bnmVar.a) && Intrinsics.d(this.b, bnmVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirstCacheInitDetails(message=");
        sb.append(this.a);
        sb.append(", stackTrace=");
        return dfi.i(sb, this.b, ')');
    }
}
