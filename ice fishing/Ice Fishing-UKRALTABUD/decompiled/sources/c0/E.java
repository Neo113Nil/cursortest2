package c0;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public int f1656a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1657b;

    public /* synthetic */ E(int i2, Object[] objArr) {
        this.f1656a = i2;
        this.f1657b = objArr;
    }

    public E(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1657b = new Object[i2];
    }
}
