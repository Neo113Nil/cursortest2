package N6;

import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final class s implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public int f2005a;

    /* renamed from: b, reason: collision with root package name */
    public int f2006b;

    /* renamed from: c, reason: collision with root package name */
    public p f2007c;

    /* renamed from: d, reason: collision with root package name */
    public j f2008d;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int b9 = this.f2008d.b();
        int a9 = this.f2007c.a(obj, obj2, this.f2008d);
        this.f2008d.f1978c[b9] = a9;
        this.f2005a = d.b(a9) + this.f2006b + a9 + this.f2005a;
    }
}
