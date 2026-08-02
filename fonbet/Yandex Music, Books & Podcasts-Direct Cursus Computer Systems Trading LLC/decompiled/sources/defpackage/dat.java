package defpackage;

/* loaded from: classes.dex */
public final class dat extends bat {
    public final j7 d;

    public dat(j7 j7Var) {
        this.d = j7Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 2;
        Object[] objArr = this.a;
        return new api(this.d, objArr[i], objArr[i + 1]);
    }
}
