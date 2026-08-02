package ru.yandex.taxi.am.early_authorization;

import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isExpEnabled", "", "Ldd;", "<unused var>", "isLocationPermissionWithAgreementNotShowing", "autoLoginWasWithoutPassport", "<anonymous>", "(ZLjava/util/List;ZZ)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.early_authorization.EarlyAuthorizationInteractor$awaitEarlyLoginReady$4", f = "EarlyAuthorizationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class EarlyAuthorizationInteractor$awaitEarlyLoginReady$4 extends SuspendLambda implements dms {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarlyAuthorizationInteractor$awaitEarlyLoginReady$4(g gVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        boolean booleanValue3 = ((Boolean) obj4).booleanValue();
        EarlyAuthorizationInteractor$awaitEarlyLoginReady$4 earlyAuthorizationInteractor$awaitEarlyLoginReady$4 = new EarlyAuthorizationInteractor$awaitEarlyLoginReady$4(this.this$0, (Continuation) obj5);
        earlyAuthorizationInteractor$awaitEarlyLoginReady$4.Z$0 = booleanValue;
        earlyAuthorizationInteractor$awaitEarlyLoginReady$4.Z$1 = booleanValue2;
        earlyAuthorizationInteractor$awaitEarlyLoginReady$4.Z$2 = booleanValue3;
        return earlyAuthorizationInteractor$awaitEarlyLoginReady$4.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2 = this.Z$0;
        boolean z3 = this.Z$1;
        boolean z4 = this.Z$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z2) {
            g gVar = this.this$0;
            if (gVar.d.a && !gVar.g.a.get() && !this.this$0.b.f() && z3 && z4) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
