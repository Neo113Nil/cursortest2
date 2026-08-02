package defpackage;

/* loaded from: classes3.dex */
public final class l3d implements Comparable {
    public final int a;
    public final prv b;
    public final boolean c;

    public l3d(jse jseVar, int i, prv prvVar, boolean z, boolean z2) {
        this.a = i;
        this.b = prvVar;
        this.c = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((l3d) obj).a;
    }
}
