package defpackage;

/* loaded from: classes.dex */
public final class tvm {
    public final int a;
    public final boolean b;

    public tvm(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tvm.class != obj.getClass()) {
            return false;
        }
        tvm tvmVar = (tvm) obj;
        return this.a == tvmVar.a && this.b == tvmVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
