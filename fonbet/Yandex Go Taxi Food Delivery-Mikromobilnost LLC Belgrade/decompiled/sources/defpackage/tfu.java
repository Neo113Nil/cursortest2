package defpackage;

import android.graphics.Color;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;

/* loaded from: classes.dex */
public final class tfu implements yp2 {
    public final yp2 a;

    public tfu(int i) {
        this.a = xp2.a;
    }

    @Override // defpackage.yp2
    public final wp2 a(String str, wp2 wp2Var) {
        yp2 yp2Var = this.a;
        if (str == null) {
            return yp2Var.a(null, wp2Var);
        }
        if (!cvu0.x(str, ShimmerDivHandler.NUMBER_SING, false)) {
            return yp2Var.a(str, wp2Var);
        }
        try {
            return new up2(rzo.d(Color.parseColor(str)));
        } catch (IllegalArgumentException unused) {
            return yp2Var.a(str, wp2Var);
        }
    }

    public tfu() {
        this(0);
    }
}
