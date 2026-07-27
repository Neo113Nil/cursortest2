package x0;

import E0.i;
import E0.q;

/* loaded from: classes.dex */
public abstract class f extends b implements E0.f {

    /* renamed from: h, reason: collision with root package name */
    public final int f3095h;

    public f(int i2, v0.d dVar) {
        super(dVar);
        this.f3095h = i2;
    }

    @Override // E0.f
    public final int g() {
        return this.f3095h;
    }

    @Override // x0.b
    public final String toString() {
        if (this.f3090e != null) {
            return super.toString();
        }
        q.f314a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
