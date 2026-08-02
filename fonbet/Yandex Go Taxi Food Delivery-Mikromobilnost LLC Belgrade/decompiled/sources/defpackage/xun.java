package defpackage;

/* loaded from: classes5.dex */
public final class xun extends v4v {
    public final Boolean a;

    public xun(int i) {
        this.a = Boolean.FALSE;
    }

    @Override // defpackage.v4v
    public final String a() {
        return null;
    }

    @Override // defpackage.v4v
    public final Boolean b() {
        return this.a;
    }

    @Override // defpackage.v4v
    public final bfz0 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xun) && jl40.l(this.a, ((xun) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return (bool == null ? 0 : bool.hashCode()) * 31;
    }

    public final String toString() {
        return "Empty(contentDescription=null, monochrome=" + this.a + ", tintColor=null)";
    }

    public xun() {
        this(0);
    }
}
