package ru.yandex.logistics.care.camera;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.camera.CareCameraViewModelImpl$startSelfTimer$1", f = "CareCameraViewModel.kt", l = {319, 322, 323}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareCameraViewModelImpl$startSelfTimer$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $effectiveTimeout;
    int I$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareCameraViewModelImpl$startSelfTimer$1(int i, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$effectiveTimeout = i;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CareCameraViewModelImpl$startSelfTimer$1(this.$effectiveTimeout, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareCameraViewModelImpl$startSelfTimer$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (r11.emit(r2, r10) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r10) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r10) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0047 -> B:17:0x004a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        if (i2 == 0) {
            kotlin.b.b(obj);
            i = this.$effectiveTimeout;
            b bVar = this.this$0;
            if (i <= 0) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            i = this.I$0;
            kotlin.b.b(obj);
            i--;
            b bVar2 = this.this$0;
            if (i <= 0) {
                r0 r0Var = bVar2.F;
                Integer num = new Integer(i);
                r0Var.getClass();
                r0Var.m(null, num);
                this.I$0 = i;
                this.label = 1;
            } else {
                r0 r0Var2 = bVar2.F;
                Integer num2 = new Integer(0);
                r0Var2.getClass();
                r0Var2.m(null, num2);
                this.label = 2;
            }
            return coroutineSingletons;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.this$0.C = null;
            return zy11Var;
        }
        kotlin.b.b(obj);
        n0 n0Var = this.this$0.I;
        this.label = 3;
    }
}
