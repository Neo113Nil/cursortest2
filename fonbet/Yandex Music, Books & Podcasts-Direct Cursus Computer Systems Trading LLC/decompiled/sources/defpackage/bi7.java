package defpackage;

/* loaded from: classes3.dex */
public final class bi7 implements ci7 {
    public final bve a;

    public bi7(bve bveVar) {
        this.a = bveVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi7) && this.a.equals(((bi7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(offer=" + this.a + ")";
    }
}
