package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pow implements row {
    public final izs a;
    public final int b;
    public final String c;

    public pow(izs izsVar, int i, String str) {
        izsVar.getClass();
        this.a = izsVar;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pow)) {
            return false;
        }
        pow powVar = (pow) obj;
        return Intrinsics.d(this.a, powVar.a) && this.b == powVar.b && Intrinsics.d(this.c, powVar.c);
    }

    public final int hashCode() {
        int a = f1d.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdditionalInfoTrack(source=");
        sb.append(this.a);
        sb.append(", sourceKey=");
        sb.append(this.b);
        sb.append(", batchId=");
        return su4.o(sb, this.c, ")");
    }
}
