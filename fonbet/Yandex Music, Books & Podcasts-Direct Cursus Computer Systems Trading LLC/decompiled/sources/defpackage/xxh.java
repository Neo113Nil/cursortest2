package defpackage;

/* loaded from: classes.dex */
public final class xxh {
    public final int a;

    public /* synthetic */ xxh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xxh) {
            return this.a == ((xxh) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hrg.o("MenuItemsAvailability(value=", this.a, ')');
    }
}
