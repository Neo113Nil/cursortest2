package defpackage;

/* loaded from: classes.dex */
public final class xgv implements Comparable {
    public final int a;
    public final tgv b;

    public xgv(int i, tgv tgvVar) {
        this.a = i;
        this.b = tgvVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((xgv) obj).a);
    }
}
