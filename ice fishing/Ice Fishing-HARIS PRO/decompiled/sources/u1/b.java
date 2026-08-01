package u1;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends c implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final c f4463a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4464b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4465c;

    public b(c cVar, int i, int i2) {
        D1.i.e(cVar, "list");
        this.f4463a = cVar;
        this.f4464b = i;
        h0.f.f(i, i2, cVar.a());
        this.f4465c = i2 - i;
    }

    @Override // u1.c
    public final int a() {
        return this.f4465c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f4465c;
        if (i >= 0 && i < i2) {
            return this.f4463a.get(this.f4464b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
