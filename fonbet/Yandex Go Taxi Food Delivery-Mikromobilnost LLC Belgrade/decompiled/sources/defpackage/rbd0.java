package defpackage;

/* loaded from: classes2.dex */
public final class rbd0 implements sbd0 {
    public final String a;

    public rbd0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rbd0) && jl40.l(this.a, ((rbd0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Raw(value="), this.a, ')');
    }
}
