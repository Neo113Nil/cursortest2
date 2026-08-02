package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r44 implements drf {
    public final nrf a;
    public final String b;
    public final int c;

    public r44(nrf nrfVar, String str, int i) {
        nrfVar.getClass();
        this.a = nrfVar;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r44)) {
            return false;
        }
        r44 r44Var = (r44) obj;
        return Intrinsics.d(this.a, r44Var.a) && Intrinsics.d(this.b, r44Var.b) && this.c == r44Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarouselSectionsBlock(meta=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", sectionsCount=");
        return f1d.i(sb, this.c, ")");
    }
}
