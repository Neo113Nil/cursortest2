package a1;

import com.google.android.gms.internal.ads.C2991bm;
import java.util.Collections;
import k1.C4629a;

/* loaded from: classes.dex */
public final class s extends AbstractC0428e {
    public final Object i;

    public s(C2991bm c2991bm, Object obj) {
        super(Collections.EMPTY_LIST);
        j(c2991bm);
        this.i = obj;
    }

    @Override // a1.AbstractC0428e
    public final float b() {
        return 1.0f;
    }

    @Override // a1.AbstractC0428e
    public final Object e() {
        C2991bm c2991bm = this.f4257e;
        float f3 = this.f4256d;
        Object obj = this.i;
        return c2991bm.R(0.0f, 0.0f, obj, obj, f3, f3, f3);
    }

    @Override // a1.AbstractC0428e
    public final Object f(C4629a c4629a, float f3) {
        return e();
    }

    @Override // a1.AbstractC0428e
    public final void h() {
        if (this.f4257e != null) {
            super.h();
        }
    }

    @Override // a1.AbstractC0428e
    public final void i(float f3) {
        this.f4256d = f3;
    }
}
