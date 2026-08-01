package t0;

import C1.l;
import D1.h;
import D1.i;

/* loaded from: classes.dex */
public final class e extends AbstractC0352d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4368a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4369b;

    /* renamed from: c, reason: collision with root package name */
    public final C0349a f4370c;

    public e(Object obj, int i, C0349a c0349a) {
        i.e(obj, "value");
        h.j("verificationMode", i);
        this.f4368a = obj;
        this.f4369b = i;
        this.f4370c = c0349a;
    }

    @Override // t0.AbstractC0352d
    public final Object a() {
        return this.f4368a;
    }

    @Override // t0.AbstractC0352d
    public final AbstractC0352d d(String str, l lVar) {
        Object obj = this.f4368a;
        return ((Boolean) lVar.g(obj)).booleanValue() ? this : new C0351c(obj, str, this.f4370c, this.f4369b);
    }
}
