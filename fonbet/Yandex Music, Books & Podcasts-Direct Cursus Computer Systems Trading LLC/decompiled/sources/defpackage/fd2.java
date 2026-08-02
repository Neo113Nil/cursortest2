package defpackage;

/* loaded from: classes.dex */
public final class fd2 extends z1c {
    public final Integer a;

    public fd2(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z1c)) {
            return false;
        }
        Integer num = this.a;
        fd2 fd2Var = (fd2) ((z1c) obj);
        return num == null ? fd2Var.a == null : num.equals(fd2Var.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
