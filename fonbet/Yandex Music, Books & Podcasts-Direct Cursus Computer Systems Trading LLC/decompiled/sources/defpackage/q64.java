package defpackage;

/* loaded from: classes3.dex */
public final class q64 implements s64 {
    public final v68 a;
    public final String b;
    public final uhd c;

    public q64(v68 v68Var) {
        this.a = v68Var;
        String name = v68Var.getName();
        name.getClass();
        this.b = name;
        mvn mvnVar = uhd.b;
        String platform = v68Var.getPlatform();
        mvnVar.getClass();
        this.c = mvn.O(platform);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q64) && this.a.equals(((q64) obj).a);
    }

    @Override // defpackage.u64
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GlagolDescriptor(device=" + this.a + ")";
    }
}
