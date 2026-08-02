package defpackage;

import com.yandex.media.ynison.service.e0;
import com.yandex.media.ynison.service.x;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rqw extends sqw {
    public final e0 a;
    public final how b;

    public rqw(e0 e0Var, how howVar) {
        e0Var.getClass();
        this.a = e0Var;
        this.b = howVar;
    }

    @Override // defpackage.sqw
    public final how a() {
        return this.b;
    }

    @Override // defpackage.sqw
    public final e0 b() {
        return this.a;
    }

    public final aaq c() {
        x j = this.a.n().j();
        j.getClass();
        return zdg.M(j);
    }

    public final x d() {
        x j = this.a.n().j();
        j.getClass();
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqw)) {
            return false;
        }
        rqw rqwVar = (rqw) obj;
        return Intrinsics.d(this.a, rqwVar.a) && this.b.equals(rqwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Raw(raw=" + this.a + ", devices=" + this.b + ")";
    }
}
