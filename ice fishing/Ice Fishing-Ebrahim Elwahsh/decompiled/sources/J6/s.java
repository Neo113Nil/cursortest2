package J6;

import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final class s implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public int f1452a;

    /* renamed from: b, reason: collision with root package name */
    public int f1453b;

    /* renamed from: c, reason: collision with root package name */
    public p f1454c;

    /* renamed from: d, reason: collision with root package name */
    public j f1455d;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int b9 = this.f1455d.b();
        int a9 = this.f1454c.a(obj, obj2, this.f1455d);
        this.f1455d.f1425c[b9] = a9;
        this.f1452a = d.b(a9) + this.f1453b + a9 + this.f1452a;
    }
}
