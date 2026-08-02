package defpackage;

/* loaded from: classes3.dex */
public final class b75 implements e75 {
    public final ilu a;

    public b75(ilu iluVar) {
        this.a = iluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b75) && this.a.equals(((b75) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content(data=" + this.a + ")";
    }
}
