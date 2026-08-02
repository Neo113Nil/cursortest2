package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class vr50 implements pq50 {
    public static final ur50 Companion = new ur50();
    public final String a;

    public /* synthetic */ vr50(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, tr50.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vr50) && jl40.l(this.a, ((vr50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("NetworkDisabledContentDescriptionModel(type="), this.a, ')');
    }
}
