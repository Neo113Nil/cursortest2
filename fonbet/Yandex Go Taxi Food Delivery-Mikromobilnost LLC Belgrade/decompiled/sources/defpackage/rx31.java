package defpackage;

/* loaded from: classes9.dex */
public final class rx31 implements Runnable {
    public static final rx31 b = new rx31(new bgc(12));
    public final sls a;

    public rx31(sls slsVar) {
        this.a = slsVar;
    }

    public final boolean equals(Object obj) {
        return obj instanceof rx31;
    }

    public final int hashCode() {
        return rx31.class.hashCode();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.invoke();
    }
}
