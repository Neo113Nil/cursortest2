package defpackage;

import com.yandex.go.places.base.ui.common.map.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes13.dex */
public abstract class y55 extends c implements kf80 {
    public final boolean D;
    public final i3y E;
    public final i3y F;

    public y55(q3v q3vVar, k0b0 k0b0Var, ah00 ah00Var, boolean z, boolean z2) {
        super(ye80.class, q3vVar, k0b0Var, ah00Var, z);
        this.D = z2;
        tt4 tt4Var = new tt4(8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E = a.b(lazyThreadSafetyMode, tt4Var);
        this.F = a.b(lazyThreadSafetyMode, new tt4(9));
    }
}
