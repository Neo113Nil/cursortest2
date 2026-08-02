package defpackage;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.f;
import kotlin.coroutines.Continuation;

/* loaded from: classes10.dex */
public final class xny0 implements wkp0 {
    public final /* synthetic */ wkp0 a;
    public final qxi b;
    public final qxi c;

    public xny0(wkp0 wkp0Var, final yny0 yny0Var) {
        this.a = wkp0Var;
        final int i = 0;
        this.b = f.d(new sls() { // from class: wny0
            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                yny0 yny0Var2 = yny0Var;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(yny0Var2.a.getFloatValue() < yny0Var2.b.getFloatValue());
                    default:
                        return Boolean.valueOf(yny0Var2.a.getFloatValue() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.c = f.d(new sls() { // from class: wny0
            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                yny0 yny0Var2 = yny0Var;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(yny0Var2.a.getFloatValue() < yny0Var2.b.getFloatValue());
                    default:
                        return Boolean.valueOf(yny0Var2.a.getFloatValue() > 0.0f);
                }
            }
        });
    }

    @Override // defpackage.wkp0
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.wkp0
    public final boolean b() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.wkp0
    public final float c(float f) {
        return this.a.c(f);
    }

    @Override // defpackage.wkp0
    public final Object d(MutatePriority mutatePriority, wls wlsVar, Continuation continuation) {
        return this.a.d(mutatePriority, wlsVar, continuation);
    }

    @Override // defpackage.wkp0
    public final boolean e() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }
}
