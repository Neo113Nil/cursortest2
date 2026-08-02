package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class eyu implements fyu {
    public final List a;

    public eyu(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eyu) && this.a.equals(((eyu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("ShuffleState.Enabled(shuffleMapping=[", w1g.J(this.a), "])");
    }
}
