package c1;

import com.google.android.gms.internal.ads.LP;
import java.util.Collections;
import m1.C4739a;

/* loaded from: classes.dex */
public final class s extends AbstractC0545e {
    public final Object i;

    public s(LP lp, Object obj) {
        super(Collections.EMPTY_LIST);
        j(lp);
        this.i = obj;
    }

    @Override // c1.AbstractC0545e
    public final float b() {
        return 1.0f;
    }

    @Override // c1.AbstractC0545e
    public final Object e() {
        LP lp = this.f5652e;
        float f2 = this.f5651d;
        Object obj = this.i;
        return lp.d(0.0f, 0.0f, obj, obj, f2, f2, f2);
    }

    @Override // c1.AbstractC0545e
    public final Object f(C4739a c4739a, float f2) {
        return e();
    }

    @Override // c1.AbstractC0545e
    public final void h() {
        if (this.f5652e != null) {
            super.h();
        }
    }

    @Override // c1.AbstractC0545e
    public final void i(float f2) {
        this.f5651d = f2;
    }
}
