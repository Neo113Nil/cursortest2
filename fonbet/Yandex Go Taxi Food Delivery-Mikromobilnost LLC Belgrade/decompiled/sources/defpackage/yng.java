package defpackage;

/* loaded from: classes2.dex */
public final class yng extends zng {
    public static final yng b = new yng("Either JSON or binary data must be provided");

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yng);
    }

    public final int hashCode() {
        return -606734152;
    }

    public final String toString() {
        return "NoDataSourceProvided";
    }
}
