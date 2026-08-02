package defpackage;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.a;
import com.yandex.div2.DivPager$ItemAlignment;

/* loaded from: classes11.dex */
public final class wl50 extends p2l implements qer {
    public final float d;
    public final float e;
    public final boolean f;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wl50(yzk yzkVar, rvo rvoVar, DisplayMetrics displayMetrics, int i, float f, l2l l2lVar, DivPager$ItemAlignment divPager$ItemAlignment) {
        super(i, l2lVar, divPager$ItemAlignment);
        float f2;
        float f3;
        float f4;
        float K = a.K(yzkVar.a, displayMetrics, rvoVar);
        float f5 = f + K;
        this.d = f5;
        int i2 = vl50.a[divPager$ItemAlignment.ordinal()];
        if (i2 == 1) {
            f2 = i;
            f3 = l2lVar.g;
        } else {
            if (i2 == 2) {
                f4 = i;
                f5 *= 2.0f;
                this.e = f4 - f5;
                this.f = K > 0.0f;
            }
            if (i2 != 3) {
                w511.b();
                throw null;
            }
            f2 = i;
            f3 = l2lVar.h;
        }
        f4 = f2 - f3;
        this.e = f4 - f5;
        this.f = K > 0.0f;
    }

    @Override // defpackage.qer
    public final float a() {
        return this.e;
    }

    @Override // defpackage.qer
    public final float b() {
        return this.d;
    }

    @Override // defpackage.qer
    public final boolean c() {
        return this.f;
    }

    @Override // defpackage.p2l
    public final Float f(int i) {
        return Float.valueOf(this.e);
    }
}
