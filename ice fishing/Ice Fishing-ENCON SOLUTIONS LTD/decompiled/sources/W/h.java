package W;

import t1.l;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1846a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1847b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1848c;

    public h(Object value, int i2, a aVar) {
        kotlin.jvm.internal.i.e(value, "value");
        C1.a.m(i2, "verificationMode");
        this.f1846a = value;
        this.f1847b = i2;
        this.f1848c = aVar;
    }

    @Override // W.g
    public final Object a() {
        return this.f1846a;
    }

    @Override // W.g
    public final g d(String str, l lVar) {
        Object obj = this.f1846a;
        return ((Boolean) lVar.invoke(obj)).booleanValue() ? this : new f(obj, str, this.f1848c, this.f1847b);
    }
}
