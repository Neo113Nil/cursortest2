package ru.yandex.logistics.care.camera.ui;

import android.util.Range;
import defpackage.co7;
import defpackage.eur;
import defpackage.fur;
import defpackage.gvo;
import defpackage.jzd;
import defpackage.m810;
import defpackage.mvg;
import defpackage.nnw0;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.y6i0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.camera.ui.CameraPreviewKt$CameraPreview$4$1", f = "CameraPreview.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CameraPreviewKt$CameraPreview$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $boundCamera$delegate;
    final /* synthetic */ jzd $exposureConfig;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPreviewKt$CameraPreview$4$1(jzd jzdVar, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$exposureConfig = jzdVar;
        this.$boundCamera$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraPreviewKt$CameraPreview$4$1(this.$exposureConfig, this.$boundCamera$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CameraPreviewKt$CameraPreview$4$1 cameraPreviewKt$CameraPreview$4$1 = (CameraPreviewKt$CameraPreview$4$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        cameraPreviewKt$CameraPreview$4$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        co7 co7Var = (co7) this.$boundCamera$delegate.getValue();
        if (co7Var != null) {
            jzd jzdVar = this.$exposureConfig;
            if (jzdVar == null) {
                if (co7Var.c().v().b()) {
                    co7Var.b().k(0);
                }
                co7Var.b().l();
            } else {
                float f = jzdVar.a;
                if (f != 0.0f) {
                    gvo v = co7Var.c().v();
                    if (v.b()) {
                        float floatValue = v.a().floatValue();
                        Range c = v.c();
                        co7Var.b().k(y6i0.d(m810.b(f / floatValue), ((Number) c.getLower()).intValue(), ((Number) c.getUpper()).intValue()));
                    }
                }
                if (jzdVar.b) {
                    co7Var.b().j(new fur(new eur(new nnw0().b(0.5f, 0.5f, 0.15f), 3)));
                }
            }
        }
        return zy11.a;
    }
}
