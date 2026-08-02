package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o04 {
    public final c01 a;
    public final q91 b;
    public final int c;

    public o04(c01 c01Var, q91 q91Var, int i) {
        c01Var.getClass();
        this.a = c01Var;
        this.b = q91Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o04)) {
            return false;
        }
        o04 o04Var = (o04) obj;
        return Intrinsics.d(this.a, o04Var.a) && this.b.equals(o04Var.b) && this.c == o04Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarouselArtistsBlockUiData(artist=");
        sb.append(this.a);
        sb.append(", uiData=");
        sb.append(this.b);
        sb.append(", likesCount=");
        return f1d.i(sb, this.c, ")");
    }
}
