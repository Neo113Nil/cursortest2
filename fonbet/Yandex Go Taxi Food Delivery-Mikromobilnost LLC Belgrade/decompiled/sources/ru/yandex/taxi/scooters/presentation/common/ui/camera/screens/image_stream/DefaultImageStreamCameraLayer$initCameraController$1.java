package ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream;

import android.os.Handler;
import androidx.lifecycle.v;
import defpackage.bq7;
import defpackage.cfv;
import defpackage.ddh;
import defpackage.dfv;
import defpackage.g700;
import defpackage.gdh;
import defpackage.i5f0;
import defpackage.jl40;
import defpackage.l1b1;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pdy;
import defpackage.qyy0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wfz;
import defpackage.wls;
import defpackage.xs7;
import defpackage.zgz;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.DefaultImageStreamCameraLayer$initCameraController$1", f = "DefaultImageStreamCameraLayer.kt", l = {182}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class DefaultImageStreamCameraLayer$initCameraController$1 extends SuspendLambda implements wls {
    final /* synthetic */ pdy $cameraController;
    final /* synthetic */ List<noh> $combined;
    final /* synthetic */ long $sessionId;
    int label;
    final /* synthetic */ gdh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultImageStreamCameraLayer$initCameraController$1(List list, gdh gdhVar, long j, pdy pdyVar, Continuation continuation) {
        super(2, continuation);
        this.$combined = list;
        this.this$0 = gdhVar;
        this.$sessionId = j;
        this.$cameraController = pdyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultImageStreamCameraLayer$initCameraController$1(this.$combined, this.this$0, this.$sessionId, this.$cameraController, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultImageStreamCameraLayer$initCameraController$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xs7 xs7Var;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            List<noh> list = this.$combined;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(list, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        List list2 = (List) obj;
        if (this.this$0.w == this.$sessionId) {
            if (!this.$cameraController.K.a.isDone()) {
                zgz.a("Strange bug with `initializationFuture`: not done after await", new IllegalStateException());
            }
            i5f0 i5f0Var = (i5f0) kotlin.collections.a.P(list2);
            gdh gdhVar = this.this$0;
            a aVar = gdhVar.r;
            pdy pdyVar = this.$cameraController;
            v previewStreamState = gdhVar.j().getPreviewStreamState();
            g700 g700Var = new g700(15, new ConcurrentHashMap(1), new ddh(this.this$0, 2));
            pdyVar.p(aVar.c ? 3 : 1);
            if (aVar.c) {
                pdyVar.q();
            }
            aVar.d = previewStreamState;
            aVar.e = g700Var;
            r0 r0Var = aVar.b;
            r0Var.getClass();
            r0Var.m(null, pdyVar);
            gdh gdhVar2 = this.this$0;
            pdy pdyVar2 = this.$cameraController;
            dfv dfvVar = gdhVar2.s;
            if (jl40.l(dfvVar, wfz.G)) {
                xs7Var = xs7.b;
            } else {
                if (!(dfvVar instanceof cfv)) {
                    w511.b();
                    return null;
                }
                xs7 b = ((cfv) dfvVar).a ? l1b1.b(i5f0Var) : null;
                xs7Var = b == null ? xs7.c : b;
            }
            try {
                if (pdyVar2.j(xs7Var)) {
                    gdhVar2.l(pdyVar2, xs7Var);
                    return zy11Var;
                }
            } catch (IllegalStateException e) {
                zgz.a("Strange bug with `hasCamera` on some devices", e);
                try {
                    gdhVar2.l(pdyVar2, xs7Var);
                } catch (Exception e2) {
                    zgz.a("Strange bug with `hasCamera` with set selector without `hasCamera` invocation", e2);
                }
                ((Handler) qyy0.a.getValue()).postDelayed(new bq7(pdyVar2, xs7Var, 1), 10L);
                return zy11Var;
            }
        }
        return zy11Var;
    }
}
