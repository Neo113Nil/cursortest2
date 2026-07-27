package R;

import D0.l;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f928a;

    /* renamed from: b, reason: collision with root package name */
    public final int f929b;

    /* renamed from: c, reason: collision with root package name */
    public final a f930c;

    public h(Object obj, int i2, a aVar) {
        E0.i.e(obj, "value");
        E0.h.j("verificationMode", i2);
        this.f928a = obj;
        this.f929b = i2;
        this.f930c = aVar;
    }

    @Override // R.g
    public final Object a() {
        return this.f928a;
    }

    @Override // R.g
    public final g d(String str, l lVar) {
        Object obj = this.f928a;
        return ((Boolean) lVar.i(obj)).booleanValue() ? this : new f(obj, str, this.f930c, this.f929b);
    }
}
