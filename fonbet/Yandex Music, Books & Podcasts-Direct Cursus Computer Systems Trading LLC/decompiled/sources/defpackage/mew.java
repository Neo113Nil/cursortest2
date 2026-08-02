package defpackage;

/* loaded from: classes6.dex */
public final class mew implements Cnew {
    public final se5 b;

    public mew(se5 se5Var) {
        this.b = se5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mew) && this.b.equals(((mew) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TransferQueue(queueDescriptor=" + this.b + ")";
    }
}
