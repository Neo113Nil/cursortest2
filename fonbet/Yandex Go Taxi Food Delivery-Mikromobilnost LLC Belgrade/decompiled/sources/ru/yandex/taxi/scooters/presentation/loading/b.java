package ru.yandex.taxi.scooters.presentation.loading;

import android.view.ViewGroup;
import defpackage.epo0;
import defpackage.h55;
import defpackage.i3y;
import defpackage.krl0;
import defpackage.sls;
import defpackage.yes0;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes6.dex */
public final class b extends h55 {
    public final krl0 D;

    public b(krl0 krl0Var) {
        super(null);
        this.D = krl0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        krl0 krl0Var = this.D;
        SimpleSpinnerModalView simpleSpinnerModalView = (SimpleSpinnerModalView) krl0Var.a;
        if (simpleSpinnerModalView != null) {
            simpleSpinnerModalView.dismiss();
        }
        krl0Var.a = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        final ScootersLoadingRouter$onLaunch$1 scootersLoadingRouter$onLaunch$1 = new ScootersLoadingRouter$onLaunch$1(0, this, b.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
        krl0 krl0Var = this.D;
        if (((SimpleSpinnerModalView) krl0Var.a) == null) {
            yes0 yes0Var = SimpleSpinnerModalView.Companion;
            ViewGroup viewGroup = (ViewGroup) ((i3y) krl0Var.b).getValue();
            Runnable runnable = new Runnable() { // from class: ru.yandex.taxi.scooters.presentation.loading.c
                @Override // java.lang.Runnable
                public final void run() {
                    ((ScootersLoadingRouter$onLaunch$1) sls.this).invoke();
                }
            };
            yes0Var.getClass();
            krl0Var.a = yes0.d(viewGroup, new epo0(24, viewGroup, runnable));
        }
    }
}
