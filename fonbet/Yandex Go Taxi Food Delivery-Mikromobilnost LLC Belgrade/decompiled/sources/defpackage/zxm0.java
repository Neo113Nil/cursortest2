package defpackage;

import com.yandex.go.scooters.passes.active.domain.d;
import com.yandex.go.scooters.passes.active.domain.e;
import com.yandex.go.scooters.passes.active.v3.winback.domain.a;

/* loaded from: classes13.dex */
public final class zxm0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final wun0 c;

    public /* synthetic */ zxm0(z8n0 z8n0Var, wun0 wun0Var, int i) {
        this.a = i;
        this.b = z8n0Var;
        this.c = wun0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        wun0 wun0Var = this.c;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new a((yfo0) xvf0Var.get(), (e) wun0Var.get());
            default:
                return new d((yfo0) xvf0Var.get(), (e) wun0Var.get());
        }
    }
}
