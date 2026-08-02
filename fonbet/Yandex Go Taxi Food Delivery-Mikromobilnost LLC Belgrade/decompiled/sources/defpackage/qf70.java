package defpackage;

/* loaded from: classes12.dex */
public final class qf70 extends rf70 {
    public final String a;

    public qf70(String str) {
        this.a = str;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qf70) && jl40.l(this.a, ((qf70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
