package com.squareup.cash.checks;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1;
import androidx.lifecycle.LifecycleOwner;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CaptureCheckFaceKt$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LifecycleOwner f$0;
    public final /* synthetic */ MutableState f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda10(LifecycleOwner lifecycleOwner, MutableState mutableState, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = lifecycleOwner;
        this.f$1 = mutableState;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        MutableState mutableState = this.f$1;
        LifecycleOwner lifecycleOwner = this.f$0;
        DisposableEffectScope disposableEffectScope = (DisposableEffectScope) obj;
        switch (i) {
            case 0:
                disposableEffectScope.getClass();
                ((MiSnapView) mutableState.getValue()).w.observe(lifecycleOwner, new CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0(0, new SsnViewKt$$ExternalSyntheticLambda1(24, function1)));
                ((MiSnapView) mutableState.getValue()).y.observe(lifecycleOwner, new CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0(0, new SsnViewKt$$ExternalSyntheticLambda1(25, function1)));
                ((MiSnapView) mutableState.getValue()).x.observe(lifecycleOwner, new CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0(0, new CashMapViewKt$$ExternalSyntheticLambda3(function1, mutableState, 11)));
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(0, mutableState, lifecycleOwner);
            default:
                disposableEffectScope.getClass();
                MenuHostHelper$$ExternalSyntheticLambda1 menuHostHelper$$ExternalSyntheticLambda1 = new MenuHostHelper$$ExternalSyntheticLambda1(3, mutableState, function1);
                lifecycleOwner.getLifecycle().addObserver(menuHostHelper$$ExternalSyntheticLambda1);
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(lifecycleOwner, menuHostHelper$$ExternalSyntheticLambda1, 16);
        }
    }
}
