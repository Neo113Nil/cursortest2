package defpackage;

import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;

/* loaded from: classes12.dex */
public final class t3a0 extends yr31 {
    public final z22 b;
    public final DefaultEnvironment c;
    public final w870 w;
    public final abe x;
    public final ji41 y;
    public final fp51 z;

    public t3a0(z22 z22Var, DefaultEnvironment defaultEnvironment, w870 w870Var, abe abeVar, ji41 ji41Var, fp51 fp51Var) {
        this.b = z22Var;
        this.c = defaultEnvironment;
        this.w = w870Var;
        this.x = abeVar;
        this.y = ji41Var;
        this.z = fp51Var;
    }

    @Override // defpackage.yr31
    public final void V() {
        this.w.destroy();
    }
}
