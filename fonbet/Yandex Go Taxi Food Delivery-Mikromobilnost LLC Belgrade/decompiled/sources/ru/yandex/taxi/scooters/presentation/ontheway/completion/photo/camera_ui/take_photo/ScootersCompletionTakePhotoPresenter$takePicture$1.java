package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo;

import defpackage.ico0;
import defpackage.jco0;
import defpackage.jl40;
import defpackage.kco0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.ScootersCompletionTakePhotoPresenter$takePicture$1", f = "ScootersCompletionTakePhotoPresenter.kt", l = {80, 82}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionTakePhotoPresenter$takePicture$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionTakePhotoPresenter$takePicture$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCompletionTakePhotoPresenter$takePicture$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCompletionTakePhotoPresenter$takePicture$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.d.Kg(r1, r8, r7) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002a, code lost:
    
        if (r8 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Boolean bool = null;
        if (i == 0) {
            kotlin.b.b(obj);
            jco0 jco0Var = this.this$0.B;
            this.label = 1;
            obj = jco0Var.a.b(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean z = ((ico0) obj).b;
        d dVar = this.this$0;
        if (z) {
            kco0 kco0Var = dVar.z;
            Long l = kco0Var.a;
            if (l != null) {
                bool = Boolean.valueOf(System.currentTimeMillis() - l.longValue() >= kco0Var.b);
            }
            boolean l2 = jl40.l(bool, Boolean.TRUE);
            d dVar2 = this.this$0;
            if (l2) {
                zuo0 a = dVar2.C.a();
                this.label = 2;
            } else {
                dVar2.Mg();
            }
        } else {
            dVar.Mg();
        }
        return zy11.a;
    }
}
