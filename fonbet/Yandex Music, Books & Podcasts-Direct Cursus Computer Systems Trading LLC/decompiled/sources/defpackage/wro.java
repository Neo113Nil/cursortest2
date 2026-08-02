package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wro implements xro {
    public final t5a a;
    public final String b;
    public final String c;

    public wro(t5a t5aVar, String str, String str2) {
        this.a = t5aVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!wro.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        wro wroVar = (wro) obj;
        return Intrinsics.d(this.a, wroVar.a) && Intrinsics.d(this.b, wroVar.b) && this.c.equals(wroVar.c);
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
        sb.append(", scaffoldType=");
        return su4.o(sb, this.c, ")");
    }
}
