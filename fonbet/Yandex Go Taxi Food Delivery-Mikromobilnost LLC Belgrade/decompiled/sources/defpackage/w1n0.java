package defpackage;

import android.content.Context;
import android.view.View;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.ScootersBluetoothModalView;

/* loaded from: classes6.dex */
public final class w1n0 extends m230 {
    public final w030 E;
    public final fva0 F;
    public final t1n0 G;

    public w1n0(w030 w030Var, fva0 fva0Var, t1n0 t1n0Var) {
        super(null);
        this.E = w030Var;
        this.F = fva0Var;
        this.G = t1n0Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, android.view.View$OnAttachStateChangeListener, ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.ScootersBluetoothDialogRouter$provideModalView$$inlined$wrapJankStats$1] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        final String str = "ScootersBluetoothView";
        fva0.f(this.F, "ScootersBluetoothView", PerformanceAnalytics$Type.Inflate, 0L, 4);
        final int i = 0;
        sls slsVar = new sls(this) { // from class: u1n0
            public final /* synthetic */ w1n0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                zy11 zy11Var = zy11.a;
                w1n0 w1n0Var = this.b;
                switch (i2) {
                    case 0:
                        w1n0Var.r(new qu(9));
                        break;
                    default:
                        w1n0Var.r(new v1n0(0));
                        break;
                }
                return zy11Var;
            }
        };
        final int i2 = 1;
        sls slsVar2 = new sls(this) { // from class: u1n0
            public final /* synthetic */ w1n0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                w1n0 w1n0Var = this.b;
                switch (i22) {
                    case 0:
                        w1n0Var.r(new qu(9));
                        break;
                    default:
                        w1n0Var.r(new v1n0(0));
                        break;
                }
                return zy11Var;
            }
        };
        cjm0 cjm0Var = this.G.a;
        final ScootersBluetoothModalView scootersBluetoothModalView = new ScootersBluetoothModalView((Context) ((xvf0) cjm0Var.b).get(), (y1n0) ((z1n0) cjm0Var.c).get(), slsVar, slsVar2);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r7 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.ScootersBluetoothDialogRouter$provideModalView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = scootersBluetoothModalView.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str);
                }
                View view = scootersBluetoothModalView;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r7;
        scootersBluetoothModalView.addOnAttachStateChangeListener(r7);
        return scootersBluetoothModalView;
    }
}
