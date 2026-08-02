package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hf implements jf {
    public final t5a a;
    public final String b;
    public final String c;

    public hf(t5a t5aVar, String str, String str2) {
        this.a = t5aVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hf.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        hf hfVar = (hf) obj;
        return Intrinsics.d(this.a, hfVar.a) && Intrinsics.d(this.b, hfVar.b) && this.c.equals(hfVar.c);
    }

    public final int hashCode() {
        t5a t5aVar = this.a;
        int hashCode = (t5aVar != null ? t5aVar.hashCode() : 0) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Unsupported(query=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", actionType=");
        return su4.o(sb, this.c, ")");
    }
}
