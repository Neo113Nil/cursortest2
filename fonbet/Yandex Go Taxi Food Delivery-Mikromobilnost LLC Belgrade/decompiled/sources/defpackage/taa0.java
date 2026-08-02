package defpackage;

/* loaded from: classes8.dex */
public final class taa0 extends r8 {
    public final String c;
    public final String w;
    public final Runnable x;

    public taa0(String str, String str2, Runnable runnable) {
        super(6, runnable);
        this.c = str;
        this.w = str2;
        this.x = runnable;
    }

    public final String Hg() {
        return this.w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof taa0)) {
            return false;
        }
        taa0 taa0Var = (taa0) obj;
        return this.c.equals(taa0Var.c) && this.w.equals(taa0Var.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + (this.c.hashCode() * 31);
    }
}
