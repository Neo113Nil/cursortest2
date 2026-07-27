package R;

import D0.l;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f936a;

    /* renamed from: b, reason: collision with root package name */
    public final int f937b;

    /* renamed from: c, reason: collision with root package name */
    public final a f938c;

    public h(Object obj, int i2, a aVar) {
        E0.i.e(obj, "value");
        E0.h.i("verificationMode", i2);
        this.f936a = obj;
        this.f937b = i2;
        this.f938c = aVar;
    }

    @Override // R.g
    public final Object a() {
        return this.f936a;
    }

    @Override // R.g
    public final g d(String str, l lVar) {
        Object obj = this.f936a;
        return ((Boolean) lVar.i(obj)).booleanValue() ? this : new f(obj, str, this.f938c, this.f937b);
    }
}
