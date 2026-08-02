package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a6t implements b6t {
    public final p5t a;
    public final List b;
    public final ybb c;
    public final l5t d;
    public final boolean e;

    public a6t(p5t p5tVar, List list, ybb ybbVar, l5t l5tVar, boolean z) {
        ybbVar.getClass();
        l5tVar.getClass();
        this.a = p5tVar;
        this.b = list;
        this.c = ybbVar;
        this.d = l5tVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6t)) {
            return false;
        }
        a6t a6tVar = (a6t) obj;
        return this.a.equals(a6tVar.a) && this.b.equals(a6tVar.b) && Intrinsics.d(this.c, a6tVar.c) && this.d == a6tVar.d && this.e == a6tVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(headerUiData=");
        sb.append(this.a);
        sb.append(", smartPreviewItems=");
        sb.append(this.b);
        sb.append(", entity=");
        sb.append(this.c);
        sb.append(", entityType=");
        sb.append(this.d);
        sb.append(", showNavigationButton=");
        return ouj.r(sb, this.e, ")");
    }
}
