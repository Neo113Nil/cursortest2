package defpackage;

/* loaded from: classes7.dex */
public final class x181 {
    public final Object a;
    public je71 b = new je71();
    public boolean c;
    public boolean d;

    public x181(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x181.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((x181) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
