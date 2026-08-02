package ru.yandex.taxi.shortcuts.router;

import com.yandex.go.address.models.Address;
import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import com.yandex.go.mainscreen.superapp.impl.foundation.domain.e;
import com.yandex.go.mainscreen.superapp.impl.foundation.domain.g;
import com.yandex.go.route.interactor.b;
import defpackage.bhv0;
import defpackage.bvf0;
import defpackage.jst;
import defpackage.ny61;
import defpackage.o820;
import defpackage.s870;
import defpackage.spo;
import defpackage.sxg;
import defpackage.t870;
import defpackage.tiv0;
import defpackage.unr0;
import defpackage.ynv0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class a {
    public final b a;
    public final ru.yandex.taxi.shortcuts.interactors.a b;
    public final g c;
    public final e d;
    public final s870 e;
    public final tiv0 f;

    public a(b bVar, ru.yandex.taxi.shortcuts.interactors.a aVar, g gVar, e eVar, s870 s870Var, tiv0 tiv0Var) {
        this.a = bVar;
        this.b = aVar;
        this.c = gVar;
        this.d = eVar;
        this.e = s870Var;
        this.f = tiv0Var;
    }

    public final void a(sxg sxgVar, ynv0 ynv0Var) {
        Address address = sxgVar.a.a;
        unr0.C(new Object[]{address}, 1, "openDecodedAddress %s", jst.e);
        this.a.l(address);
        ((t870) this.e).a(address, "open from superapp_main screen", true, ynv0Var, new bhv0(0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|13|(1:15)|16))|29|6|7|(0)(0)|12|13|(0)|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        r5 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Action$TaxiExpectedDestination action$TaxiExpectedDestination, o820 o820Var, ContinuationImpl continuationImpl) {
        ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1 expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1) {
            expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1 = (ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1) continuationImpl;
            int i2 = expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1.label = i2 - Integer.MIN_VALUE;
                Object obj = expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1.L$0 = null;
                    expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1.L$1 = null;
                    expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1.label = 1;
                    obj = bvf0.n(new ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$obtainDecodeResultWithOrigin$2(this, action$TaxiExpectedDestination, o820Var, null), expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                spo spoVar = (spo) obj;
                a(spoVar.a(), spoVar.b());
                Object failure = zy11.a;
                a = Result.a(failure);
                if (a != null) {
                    jst.e.h("SHORTCUTS_CLICK", "failed to openExpectedDestination", a);
                }
                return failure;
            }
        }
        expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1 = new ExpectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1(this, continuationImpl);
        Object obj2 = expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = expectedDestinationFromSuperAppMainFromSuperAppMainRouterImpl$openExpectedDestination$1.label;
        if (i != 0) {
        }
        spo spoVar2 = (spo) obj2;
        a(spoVar2.a(), spoVar2.b());
        Object failure2 = zy11.a;
        a = Result.a(failure2);
        if (a != null) {
        }
        return failure2;
    }
}
