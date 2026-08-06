package defpackage;

/* loaded from: classes.dex */
public abstract class v60 implements java.util.Iterator, defpackage.g90 {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return java.lang.Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
