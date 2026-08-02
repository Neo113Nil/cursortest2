package defpackage;

/* loaded from: classes13.dex */
public final class uaa0 extends r8 {
    public final String c;
    public final String w;
    public final Runnable x;

    public uaa0(String str, String str2, Runnable runnable) {
        super(6, runnable);
        this.c = str;
        this.w = str2;
        this.x = runnable;
    }

    public final Runnable Hg() {
        return this.x;
    }

    public final String Ig() {
        return this.w;
    }

    public final String Jg() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaa0)) {
            return false;
        }
        uaa0 uaa0Var = (uaa0) obj;
        return this.c.equals(uaa0Var.c) && this.w.equals(uaa0Var.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + (this.c.hashCode() * 31);
    }
}
