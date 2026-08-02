package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result;

import android.content.Context;
import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.scooters.api.analytics.AnalyticsCameraState;
import com.yandex.go.scooters.api.analytics.CameraTappedButton;
import defpackage.ban0;
import defpackage.fva0;
import defpackage.i3y;
import defpackage.j6m0;
import defpackage.kpm0;
import defpackage.l9n0;
import defpackage.m9n0;
import defpackage.t1w;
import defpackage.t9h0;
import defpackage.tje;
import defpackage.tso0;
import defpackage.v3n0;
import defpackage.xva0;
import defpackage.ycm0;
import defpackage.yuf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer;

/* loaded from: classes6.dex */
public final class b extends CameraLayer {
    public final Context k;
    public final fva0 l;
    public final tso0 m;
    public final ban0 n;
    public final i3y o = kotlin.a.b(LazyThreadSafetyMode.NONE, new j6m0(23, this));
    public final c p;

    public b(ycm0 ycm0Var, Context context, fva0 fva0Var, tso0 tso0Var, ban0 ban0Var) {
        this.k = context;
        this.l = fva0Var;
        this.m = tso0Var;
        this.n = ban0Var;
        this.p = (c) ycm0Var.invoke(new ScootersCompletionPhotoResultCameraLayer$scootersCompletionPhotoResultPresenter$1(this, null));
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void b() {
        j().g.setAlpha(0.0f);
        j().f.setDebounceClickListener(new v3n0(2, this));
        j().c.setDebounceClickListener(new Runnable() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.a
            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                c cVar = bVar.p;
                tje.N(cVar.Jg(), null, null, new ScootersCompletionPhotoResultPresenter$completeTrip$1(cVar, null), 3);
                ban0 ban0Var = bVar.n;
                tso0 tso0Var = bVar.m;
                ban0Var.a(tso0Var.c ? CameraTappedButton.RISKY_FINISH_RIDING : CameraTappedButton.FINISH_RIDING, AnalyticsCameraState.CAMERA, tso0Var.e, tso0Var.a);
            }
        });
        c cVar = this.p;
        l9n0 l9n0Var = new l9n0(this);
        cVar.Bg(l9n0Var);
        kpm0 kpm0Var = cVar.A.a;
        if (kpm0Var == null) {
            return;
        }
        j().e.setVisibility(0);
        j().d.setVisibility(8);
        tje.N(cVar.Jg(), null, null, new ScootersCompletionPhotoResultPresenter$attachView$1(cVar, l9n0Var, kpm0Var, null), 3);
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void d() {
        this.p.Cg();
        j().g.setImageDrawable(null);
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void h(t1w t1wVar) {
        j().b.setGuidelineEnd(t1wVar.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, android.view.View$OnAttachStateChangeListener, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.ScootersCompletionPhotoResultCameraLayer$provideView$$inlined$wrapJankStats$1] */
    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final View i() {
        final String str = "ScootersCompletionPhotoResultCameraLayer";
        fva0.f(this.l, "ScootersCompletionPhotoResultCameraLayer", PerformanceAnalytics$Type.Inflate, 0L, 4);
        final GoConstraintLayout goConstraintLayout = j().a;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r2 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.ScootersCompletionPhotoResultCameraLayer$provideView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = goConstraintLayout.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str);
                }
                View view = goConstraintLayout;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r2;
        goConstraintLayout.addOnAttachStateChangeListener(r2);
        return goConstraintLayout;
    }

    public final m9n0 j() {
        return (m9n0) this.o.getValue();
    }
}
