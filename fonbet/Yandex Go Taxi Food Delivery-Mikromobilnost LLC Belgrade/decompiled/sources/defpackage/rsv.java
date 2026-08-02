package defpackage;

import androidx.compose.animation.core.c;
import androidx.compose.animation.tooling.ComposeAnimation;

/* loaded from: classes10.dex */
public final class rsv implements eup0 {
    public final c a;
    public final c1x0 b;
    public final c c;

    public rsv(c cVar, c1x0 c1x0Var) {
        this.a = cVar;
        this.b = c1x0Var;
        this.c = cVar;
    }

    @Override // defpackage.eup0
    public final ComposeAnimation I() {
        return !qsv.c ? null : new qsv((ztz0) this.b.a, this.a);
    }

    @Override // defpackage.eup0
    public final Object a() {
        return this.c;
    }

    @Override // defpackage.eup0
    public final rfd b(ComposeAnimation composeAnimation, v5c0 v5c0Var) {
        return new psv((qsv) composeAnimation, new tzt(15, v5c0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsv)) {
            return false;
        }
        rsv rsvVar = (rsv) obj;
        return this.a == rsvVar.a && this.b == rsvVar.b;
    }

    @Override // defpackage.eup0
    public final String getLabel() {
        return this.a.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InfiniteTransitionSearchInfo(infiniteTransition=" + this.a + ", toolingOverride=" + this.b + ')';
    }
}
