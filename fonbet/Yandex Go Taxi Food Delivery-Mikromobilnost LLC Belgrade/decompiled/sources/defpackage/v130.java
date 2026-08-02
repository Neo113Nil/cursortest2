package defpackage;

/* loaded from: classes10.dex */
public final class v130 implements e230 {
    public final boolean a;

    public v130(int i) {
        this.a = (i & 1) == 0;
    }

    @Override // defpackage.e230
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.e230
    public final int b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v130) && this.a == ((v130) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.b("Cropped(handleIme=", ", consume=0)", this.a);
    }

    public v130() {
        this(3);
    }
}
