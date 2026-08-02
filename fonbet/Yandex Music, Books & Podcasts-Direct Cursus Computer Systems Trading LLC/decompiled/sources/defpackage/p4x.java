package defpackage;

/* loaded from: classes.dex */
public final class p4x extends n5x {
    @Override // defpackage.n5x
    public final int a() {
        return 0;
    }

    @Override // defpackage.n5x
    public final n5x b(p5x p5xVar, p5x p5xVar2) {
        int compareTo = p5xVar.compareTo(p5xVar2);
        return compareTo < 0 ? n5x.b : compareTo > 0 ? n5x.c : n5x.a;
    }
}
