package defpackage;

/* loaded from: classes.dex */
public final class v2x extends x3x {
    public static final v2x a = new v2x();

    @Override // defpackage.x3x
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.x3x
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
