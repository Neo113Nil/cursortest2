package a1;

import java.util.Collections;
import k1.C4628a;

/* loaded from: classes.dex */
public final class s extends AbstractC0421e {
    public final Object i;

    public s(S0.s sVar, Object obj) {
        super(Collections.EMPTY_LIST);
        j(sVar);
        this.i = obj;
    }

    @Override // a1.AbstractC0421e
    public final float b() {
        return 1.0f;
    }

    @Override // a1.AbstractC0421e
    public final Object e() {
        S0.s sVar = this.f4306e;
        float f6 = this.f4305d;
        Object obj = this.i;
        return sVar.h(0.0f, 0.0f, obj, obj, f6, f6, f6);
    }

    @Override // a1.AbstractC0421e
    public final Object f(C4628a c4628a, float f6) {
        return e();
    }

    @Override // a1.AbstractC0421e
    public final void h() {
        if (this.f4306e != null) {
            super.h();
        }
    }

    @Override // a1.AbstractC0421e
    public final void i(float f6) {
        this.f4305d = f6;
    }
}
