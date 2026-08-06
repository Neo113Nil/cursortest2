package w1;

/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1062c extends C1060a {

    /* renamed from: d, reason: collision with root package name */
    public static final C1062c f8523d = new C1062c(1, 0, 1);

    @Override // w1.C1060a
    public final boolean equals(Object obj) {
        if (obj instanceof C1062c) {
            if (!isEmpty() || !((C1062c) obj).isEmpty()) {
                C1062c c1062c = (C1062c) obj;
                if (this.f8516a == c1062c.f8516a) {
                    if (this.f8517b == c1062c.f8517b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // w1.C1060a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f8516a * 31) + this.f8517b;
    }

    @Override // w1.C1060a
    public final boolean isEmpty() {
        return this.f8516a > this.f8517b;
    }

    @Override // w1.C1060a
    public final String toString() {
        return this.f8516a + ".." + this.f8517b;
    }
}
