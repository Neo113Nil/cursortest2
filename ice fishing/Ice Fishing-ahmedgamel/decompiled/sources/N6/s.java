package N6;

import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final class s implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public int f2093a;

    /* renamed from: b, reason: collision with root package name */
    public int f2094b;

    /* renamed from: c, reason: collision with root package name */
    public p f2095c;

    /* renamed from: d, reason: collision with root package name */
    public j f2096d;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int b9 = this.f2096d.b();
        int a9 = this.f2095c.a(obj, obj2, this.f2096d);
        this.f2096d.f2066c[b9] = a9;
        this.f2093a = d.b(a9) + this.f2094b + a9 + this.f2093a;
    }
}
