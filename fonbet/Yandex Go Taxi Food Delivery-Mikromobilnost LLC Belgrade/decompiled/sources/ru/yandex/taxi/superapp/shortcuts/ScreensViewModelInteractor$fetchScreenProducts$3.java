package ru.yandex.taxi.superapp.shortcuts;

import com.yandex.go.shortcuts.impl.interactors.w;
import defpackage.eaf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qaf0;
import defpackage.waf0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leaf0;", "param", "Lzy11;", "<anonymous>", "(Leaf0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.shortcuts.ScreensViewModelInteractor$fetchScreenProducts$3", f = "ScreensViewModelInteractor.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScreensViewModelInteractor$fetchScreenProducts$3 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $force;
    final /* synthetic */ qaf0 $screenInstance;
    final /* synthetic */ waf0 $screensType;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreensViewModelInteractor$fetchScreenProducts$3(b bVar, qaf0 qaf0Var, waf0 waf0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$screenInstance = qaf0Var;
        this.$screensType = waf0Var;
        this.$force = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScreensViewModelInteractor$fetchScreenProducts$3 screensViewModelInteractor$fetchScreenProducts$3 = new ScreensViewModelInteractor$fetchScreenProducts$3(this.this$0, this.$screenInstance, this.$screensType, this.$force, continuation);
        screensViewModelInteractor$fetchScreenProducts$3.L$0 = obj;
        return screensViewModelInteractor$fetchScreenProducts$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScreensViewModelInteractor$fetchScreenProducts$3) create((eaf0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        eaf0 eaf0Var = (eaf0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            w wVar = this.this$0.b;
            qaf0 qaf0Var = this.$screenInstance;
            waf0 waf0Var = this.$screensType;
            boolean z = this.$force;
            this.L$0 = null;
            this.label = 1;
            if (wVar.b(qaf0Var, eaf0Var, waf0Var, z, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
