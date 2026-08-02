package defpackage;

import com.yandex.go.quark.dynamic.chat.c;
import com.yandex.messaging.internal.authorized.b;
import com.yandex.mob.api.model.MobEnvironment;
import java.util.Collections;
import ru.yandex.taxi.experiments.p;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.data.mapper.f;
import ru.yandex.taxi.vendor_api.google.push.a;

/* loaded from: classes9.dex */
public final class zof0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public zof0(xxm0 xxm0Var, yxm0 yxm0Var) {
        this.a = 25;
        this.b = yxm0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new yof0((qdx) ((npe0) xvf0Var).get());
            case 1:
                return (ju6) ((r2i) xvf0Var).get();
            case 2:
                ((eqf0) xvf0Var).get();
                MobEnvironment mobEnvironment = MobEnvironment.PROD;
                q5z.i(mobEnvironment);
                return mobEnvironment;
            case 3:
                return (apt) ((xsi) xvf0Var).get();
            case 4:
                return (oot) ((o0t) xvf0Var).get();
            case 5:
                return (gxf0) ((ea0) xvf0Var).get();
            case 6:
                return (ept) ((a4t) xvf0Var).get();
            case 7:
                return (cpt) ((o0t) xvf0Var).get();
            case 8:
                return (nq20) ((i020) xvf0Var).get();
            case 9:
                return (vot) ((a4t) xvf0Var).get();
            case 10:
                return new q0g0((ofa0) ((yly) xvf0Var).get());
            case 11:
                return new y1g0((b) ((r10) xvf0Var).get());
            case 12:
                return new g3g0((cqq) xvf0Var);
            case 13:
                return new j3g0((o4g0) ((n4g0) xvf0Var).get());
            case 14:
                return new i3g0((n4g0) xvf0Var);
            case 15:
                return new z4g0((g4g0) ((eqf0) xvf0Var).get());
            case 16:
                return new g5g0((a) ((t6i) xvf0Var).get());
            case 17:
                return new vgg0((s66) ((n4g0) xvf0Var).get());
            case 18:
                return new c((lhg0) ((d6g) xvf0Var).get());
            case 19:
                return new qig0((ac20) ((d6g) xvf0Var).get());
            case 20:
                return new sue0(19, (y4a0) ((tj70) xvf0Var).get());
            case 21:
                return new gqk0((f8k0) ((xpj0) xvf0Var).get());
            case 22:
                return new yzg(i5m.a((ggl0) xvf0Var));
            case 23:
                return new aye0(23, (ppl0) ((ggl0) xvf0Var).get());
            case 24:
                return new ndl0(7, (x770) ((ggl0) xvf0Var).get());
            case 25:
                return new dwn0(Collections.singletonList((cvn0) ((yxm0) xvf0Var).get()));
            case 26:
                return new abn0((p) ((le30) xvf0Var).get());
            case 27:
                return new h((f) ((sxn0) xvf0Var).get());
            case 28:
                return new com.yandex.go.scooters.ignition.data.b((brn0) ((yxm0) xvf0Var).get());
            default:
                return new ru.yandex.taxi.scooters.presentation.loading.b((krl0) ((yxm0) xvf0Var).get());
        }
    }

    public /* synthetic */ zof0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
