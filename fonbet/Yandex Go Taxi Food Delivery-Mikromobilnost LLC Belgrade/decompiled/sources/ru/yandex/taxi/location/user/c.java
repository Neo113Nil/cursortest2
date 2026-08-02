package ru.yandex.taxi.location.user;

import defpackage.atd0;
import defpackage.dqe0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes9.dex */
public final class c {
    public final dqe0 a;
    public final atd0 b;
    public final po21 c;

    public c(dqe0 dqe0Var, atd0 atd0Var, po21 po21Var) {
        this.a = dqe0Var;
        this.b = atd0Var;
        this.c = po21Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r15 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RoutePointType routePointType, ContinuationImpl continuationImpl) {
        UserPositionInteractorImpl$loadUserAddress$1 userPositionInteractorImpl$loadUserAddress$1;
        int i;
        if (continuationImpl instanceof UserPositionInteractorImpl$loadUserAddress$1) {
            userPositionInteractorImpl$loadUserAddress$1 = (UserPositionInteractorImpl$loadUserAddress$1) continuationImpl;
            int i2 = userPositionInteractorImpl$loadUserAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPositionInteractorImpl$loadUserAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userPositionInteractorImpl$loadUserAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPositionInteractorImpl$loadUserAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userPositionInteractorImpl$loadUserAddress$1.L$0 = routePointType;
                    userPositionInteractorImpl$loadUserAddress$1.label = 1;
                    obj = ((e) this.c).g(userPositionInteractorImpl$loadUserAddress$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    routePointType = (RoutePointType) userPositionInteractorImpl$loadUserAddress$1.L$0;
                    kotlin.b.b(obj);
                }
                b bVar = new b(atd0.c(this.b, ((mo21) obj).a(), routePointType, PositionInitAction.AUTO_LOCATION, null, null, null, 56));
                userPositionInteractorImpl$loadUserAddress$1.L$0 = null;
                userPositionInteractorImpl$loadUserAddress$1.L$1 = null;
                userPositionInteractorImpl$loadUserAddress$1.label = 2;
                Object y = kotlinx.coroutines.flow.e.y(bVar, userPositionInteractorImpl$loadUserAddress$1);
                return y != coroutineSingletons ? coroutineSingletons : y;
            }
        }
        userPositionInteractorImpl$loadUserAddress$1 = new UserPositionInteractorImpl$loadUserAddress$1(this, continuationImpl);
        Object obj2 = userPositionInteractorImpl$loadUserAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPositionInteractorImpl$loadUserAddress$1.label;
        if (i != 0) {
        }
        b bVar2 = new b(atd0.c(this.b, ((mo21) obj2).a(), routePointType, PositionInitAction.AUTO_LOCATION, null, null, null, 56));
        userPositionInteractorImpl$loadUserAddress$1.L$0 = null;
        userPositionInteractorImpl$loadUserAddress$1.L$1 = null;
        userPositionInteractorImpl$loadUserAddress$1.label = 2;
        Object y2 = kotlinx.coroutines.flow.e.y(bVar2, userPositionInteractorImpl$loadUserAddress$1);
        if (y2 != coroutineSingletons2) {
        }
    }
}
