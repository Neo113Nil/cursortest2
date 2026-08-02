package ru.yandex.taxi.launch;

import defpackage.dvx;
import defpackage.fl3;
import defpackage.gl3;
import defpackage.hl3;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.startup.launch.h;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldvx;", "launchInfo", "Lhl3;", "authStatus", "<anonymous>", "(Ldvx;Lhl3;)Ldvx;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.launch.LaunchInfoRepository$authorizedWithTokenLaunchInfoFlow$1", f = "LaunchInfoRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LaunchInfoRepository$authorizedWithTokenLaunchInfoFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchInfoRepository$authorizedWithTokenLaunchInfoFlow$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LaunchInfoRepository$authorizedWithTokenLaunchInfoFlow$1 launchInfoRepository$authorizedWithTokenLaunchInfoFlow$1 = new LaunchInfoRepository$authorizedWithTokenLaunchInfoFlow$1(this.this$0, (Continuation) obj3);
        launchInfoRepository$authorizedWithTokenLaunchInfoFlow$1.L$0 = (dvx) obj;
        launchInfoRepository$authorizedWithTokenLaunchInfoFlow$1.L$1 = (hl3) obj2;
        return launchInfoRepository$authorizedWithTokenLaunchInfoFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dvx dvxVar = (dvx) this.L$0;
        hl3 hl3Var = (hl3) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!(hl3Var instanceof gl3)) {
            if (!(hl3Var instanceof fl3)) {
                w511.b();
                return null;
            }
            c cVar = this.this$0;
            if (dvxVar.a()) {
                cVar.getClass();
                if (jl40.l(dvxVar.a, ((h) cVar.a).Hg())) {
                    return dvxVar;
                }
            }
        }
        return null;
    }
}
