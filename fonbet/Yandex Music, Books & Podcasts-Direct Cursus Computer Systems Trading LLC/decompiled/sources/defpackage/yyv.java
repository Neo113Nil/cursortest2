package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yyv {
    public final Map a;
    public final String b;
    public final axv c;

    public yyv(Map map, String str, axv axvVar) {
        map.getClass();
        str.getClass();
        this.a = map;
        this.b = str;
        this.c = axvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyv)) {
            return false;
        }
        yyv yyvVar = (yyv) obj;
        return Intrinsics.d(this.a, yyvVar.a) && Intrinsics.d(this.b, yyvVar.b) && this.c.equals(yyvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WizardMatrixState(coordinatesItems=" + this.a + ", currentGenreId=" + this.b + ", recommendations=" + this.c + ")";
    }
}
