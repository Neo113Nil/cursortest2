package defpackage;

import kotlinx.coroutines.sync.a;

/* loaded from: classes.dex */
public final class vcr {
    public final a a;
    public p2f b = null;

    public vcr(a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vcr) {
            vcr vcrVar = (vcr) obj;
            if (this.a == vcrVar.a && jl40.l(this.b, vcrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p2f p2fVar = this.b;
        return hashCode + (p2fVar == null ? 0 : p2fVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
    }
}
