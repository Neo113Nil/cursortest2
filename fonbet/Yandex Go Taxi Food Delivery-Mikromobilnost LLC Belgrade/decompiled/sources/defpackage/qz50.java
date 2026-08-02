package defpackage;

/* loaded from: classes2.dex */
public final class qz50 implements sz50 {
    public final Object a;

    public qz50(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qz50) && this.a.equals(((qz50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.r(new StringBuilder("Success(data="), this.a, ')');
    }
}
