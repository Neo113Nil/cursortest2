package defpackage;

/* loaded from: classes6.dex */
public final class jnm implements Comparable {
    public final int a;

    public jnm(int i) {
        this.a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jnm jnmVar = (jnm) obj;
        jnmVar.getClass();
        return this.a - jnmVar.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
