package ru.yandex.taxi.scooters.presentation.ontheway.damage;

import com.yandex.go.scooters.api.analytics.AnalyticsCameraState;
import defpackage.fcn0;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.uq1;
import defpackage.wbn0;
import defpackage.ybn0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.domain.model.ScootersPhotoShootingException;
import ru.yandex.taxi.scooters.presentation.common.ui.ScootersCameraView;

/* loaded from: classes6.dex */
public final class e implements ybn0 {
    public final /* synthetic */ ScootersDamageView a;

    public e(ScootersDamageView scootersDamageView) {
        this.a = scootersDamageView;
    }

    @Override // defpackage.ybn0
    public final void V() {
        ScootersCameraView scootersCameraView;
        ScootersDamageView scootersDamageView = this.a;
        scootersCameraView = scootersDamageView.getScootersCameraView();
        scootersCameraView.showPermissionNotGranted();
        scootersDamageView.analyticsCameraState = AnalyticsCameraState.PERMISSION_REQUEST;
    }

    @Override // defpackage.ybn0
    public final void Y0() {
        uq1 uq1Var;
        ScootersDamageView scootersDamageView = this.a;
        uq1Var = scootersDamageView.alertDialogFactory;
        uq1Var.a().setTitle(kyh0.scooters_dismiss_title).setNegativeButton(kyh0.scooters_remove, new fcn0(scootersDamageView, 2)).setPositiveButton(kyh0.scooters_save, new fcn0(scootersDamageView, 3)).show();
    }

    @Override // defpackage.ybn0
    public final void db() {
        ScootersCameraView scootersCameraView;
        scootersCameraView = this.a.getScootersCameraView();
        scootersCameraView.setUseBackWideAngleLens(true);
    }

    @Override // defpackage.ybn0
    public final void disableShotButton() {
        ScootersCameraView scootersCameraView;
        scootersCameraView = this.a.getScootersCameraView();
        scootersCameraView.disableShotButton();
    }

    @Override // defpackage.ybn0
    public final void dismissView() {
        Runnable runnable;
        runnable = this.a.backPressedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.ybn0
    public final void enableShotButton() {
        ScootersCameraView scootersCameraView;
        scootersCameraView = this.a.getScootersCameraView();
        scootersCameraView.enableShotButton();
    }

    @Override // defpackage.ybn0
    public final void hc(List list) {
        wbn0 requireDamageAdapter;
        ScootersDamageView scootersDamageView = this.a;
        requireDamageAdapter = scootersDamageView.requireDamageAdapter();
        requireDamageAdapter.submitList(list, new fcn0(scootersDamageView, 4));
    }

    @Override // defpackage.ybn0
    public final void releaseCamera() {
        ScootersCameraView scootersCameraView;
        scootersCameraView = this.a.getScootersCameraView();
        scootersCameraView.releaseCamera();
    }

    @Override // defpackage.ybn0
    public final void s4(ScootersPhotoShootingException scootersPhotoShootingException) {
        tls tlsVar;
        tlsVar = this.a.showErrorDialog;
        tlsVar.invoke(scootersPhotoShootingException);
    }

    @Override // defpackage.ybn0
    public final void setFlashlightEnabled(boolean z) {
        ScootersCameraView scootersCameraView;
        scootersCameraView = this.a.getScootersCameraView();
        scootersCameraView.setFlashlightEnabled(z);
    }

    @Override // defpackage.ybn0
    public final void stopCamera() {
        ScootersCameraView scootersCameraView;
        scootersCameraView = this.a.getScootersCameraView();
        scootersCameraView.stopCamera();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.ybn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u6(ContinuationImpl continuationImpl) {
        ScootersDamageView$MvpViewImpl$startCamera$1 scootersDamageView$MvpViewImpl$startCamera$1;
        int i;
        ScootersCameraView scootersCameraView;
        if (continuationImpl instanceof ScootersDamageView$MvpViewImpl$startCamera$1) {
            scootersDamageView$MvpViewImpl$startCamera$1 = (ScootersDamageView$MvpViewImpl$startCamera$1) continuationImpl;
            int i2 = scootersDamageView$MvpViewImpl$startCamera$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDamageView$MvpViewImpl$startCamera$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDamageView$MvpViewImpl$startCamera$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDamageView$MvpViewImpl$startCamera$1.label;
                ScootersDamageView scootersDamageView = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersCameraView = scootersDamageView.getScootersCameraView();
                    scootersDamageView$MvpViewImpl$startCamera$1.label = 1;
                    if (ScootersCameraView.startCamera$default(scootersCameraView, null, scootersDamageView$MvpViewImpl$startCamera$1, 1, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                scootersDamageView.analyticsCameraState = AnalyticsCameraState.CAMERA;
                return zy11.a;
            }
        }
        scootersDamageView$MvpViewImpl$startCamera$1 = new ScootersDamageView$MvpViewImpl$startCamera$1(this, continuationImpl);
        Object obj2 = scootersDamageView$MvpViewImpl$startCamera$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDamageView$MvpViewImpl$startCamera$1.label;
        ScootersDamageView scootersDamageView2 = this.a;
        if (i != 0) {
        }
        scootersDamageView2.analyticsCameraState = AnalyticsCameraState.CAMERA;
        return zy11.a;
    }
}
