package defpackage;

/* loaded from: classes6.dex */
public final class q9o implements p9o {
    public final l0o a;
    public long b;

    public q9o(long j) {
        this.a = new l0o(3);
        this.b = j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.b;
        this.b = ((Number) this.a.invoke(Long.valueOf(j))).longValue();
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public q9o() {
        this(100L);
    }
}
