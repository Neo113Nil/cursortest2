package ru.yandex.taxi.shortcuts.router;

import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o820;
import defpackage.tse;
import defpackage.unr0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsxg;", "<anonymous>", "(Ltse;)Lsxg;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.shortcuts.router.ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2$decodeResultAsync$1", f = "ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2$decodeResultAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ Action$TaxiExpectedDestination $action;
    final /* synthetic */ o820 $shortcutAnalyticsInfo;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2$decodeResultAsync$1(a aVar, Action$TaxiExpectedDestination action$TaxiExpectedDestination, o820 o820Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$action = action$TaxiExpectedDestination;
        this.$shortcutAnalyticsInfo = o820Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2$decodeResultAsync$1(this.this$0, this.$action, this.$shortcutAnalyticsInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2$decodeResultAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        Action$TaxiExpectedDestination action$TaxiExpectedDestination = this.$action;
        zzs zzsVar = action$TaxiExpectedDestination.a;
        String str = action$TaxiExpectedDestination.b;
        if (str.length() == 0) {
            str = action$TaxiExpectedDestination.c;
        }
        o820 o820Var = this.$shortcutAnalyticsInfo;
        this.label = 1;
        aVar.getClass();
        unr0.C(new Object[]{zzsVar}, 1, "decodeAddress %s", jst.e);
        Object a = aVar.b.a(zzsVar, str, o820Var, true, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
