package defpackage;

/* loaded from: classes3.dex */
public final class fd0 {
    public final e0k a;

    public fd0(e0k e0kVar) {
        this.a = e0kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd0) && this.a.equals(((fd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AndroidAutoUiLogicConfig(packageValidatorType=" + this.a + ")";
    }
}
