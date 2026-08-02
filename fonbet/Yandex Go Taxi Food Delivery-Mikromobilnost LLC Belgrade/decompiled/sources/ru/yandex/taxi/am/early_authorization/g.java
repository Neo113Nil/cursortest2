package ru.yandex.taxi.am.early_authorization;

import defpackage.dbn;
import defpackage.ha2;
import defpackage.hdr;
import defpackage.jbh;
import defpackage.lbz;
import defpackage.ny61;
import defpackage.of;
import defpackage.rqo;
import defpackage.xan;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.am.r;

/* loaded from: classes5.dex */
public final class g {
    public final rqo a;
    public final ru.yandex.taxi.am.g b;
    public final of c;
    public final hdr d;
    public final com.yandex.go.permission.location_with_agreement.interactor.e e;
    public final lbz f;
    public final dbn g;
    public final r h;

    public g(rqo rqoVar, ru.yandex.taxi.am.g gVar, of ofVar, hdr hdrVar, com.yandex.go.permission.location_with_agreement.interactor.e eVar, lbz lbzVar, dbn dbnVar, r rVar) {
        this.a = rqoVar;
        this.b = gVar;
        this.c = ofVar;
        this.d = hdrVar;
        this.e = eVar;
        this.f = lbzVar;
        this.g = dbnVar;
        this.h = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        EarlyAuthorizationInteractor$awaitEarlyLoginReady$1 earlyAuthorizationInteractor$awaitEarlyLoginReady$1;
        int i;
        if (continuationImpl instanceof EarlyAuthorizationInteractor$awaitEarlyLoginReady$1) {
            earlyAuthorizationInteractor$awaitEarlyLoginReady$1 = (EarlyAuthorizationInteractor$awaitEarlyLoginReady$1) continuationImpl;
            int i2 = earlyAuthorizationInteractor$awaitEarlyLoginReady$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                earlyAuthorizationInteractor$awaitEarlyLoginReady$1.label = i2 - Integer.MIN_VALUE;
                Object obj = earlyAuthorizationInteractor$awaitEarlyLoginReady$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = earlyAuthorizationInteractor$awaitEarlyLoginReady$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ha2 m = kotlinx.coroutines.flow.e.m(new b(((jbh) this.a).d(xan.h).a()), kotlinx.coroutines.flow.e.d(this.c.b), new f(new m0(this.e.b(), this.f.b, new EarlyAuthorizationInteractor$isLocationPermissionWithAgreementNotShowing$1(3, null))), new d(this.h.u, this), new EarlyAuthorizationInteractor$awaitEarlyLoginReady$4(this, null));
                    EarlyAuthorizationInteractor$awaitEarlyLoginReady$5 earlyAuthorizationInteractor$awaitEarlyLoginReady$5 = new EarlyAuthorizationInteractor$awaitEarlyLoginReady$5(2, null);
                    earlyAuthorizationInteractor$awaitEarlyLoginReady$1.L$0 = null;
                    earlyAuthorizationInteractor$awaitEarlyLoginReady$1.label = 1;
                    if (kotlinx.coroutines.flow.e.z(m, earlyAuthorizationInteractor$awaitEarlyLoginReady$5, earlyAuthorizationInteractor$awaitEarlyLoginReady$1) == coroutineSingletons) {
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
        earlyAuthorizationInteractor$awaitEarlyLoginReady$1 = new EarlyAuthorizationInteractor$awaitEarlyLoginReady$1(this, continuationImpl);
        Object obj2 = earlyAuthorizationInteractor$awaitEarlyLoginReady$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = earlyAuthorizationInteractor$awaitEarlyLoginReady$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
