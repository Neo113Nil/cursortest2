package ru.yandex.taxi.surge.repository;

import defpackage.btw0;
import defpackage.i3y;
import defpackage.ky2;
import defpackage.lr40;
import defpackage.mth;
import defpackage.ny61;
import defpackage.on2;
import defpackage.vpw0;
import defpackage.wsw0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes6.dex */
public final class b {
    public final ky2 a;
    public final vpw0 b;
    public final i3y c;

    public b(ky2 ky2Var, vpw0 vpw0Var, on2 on2Var) {
        this.a = ky2Var;
        this.b = vpw0Var;
        this.c = kotlin.a.a(new lr40(on2Var, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wsw0 wsw0Var, ContinuationImpl continuationImpl) {
        SurgeInfoRepository$loadInfoFromNet$1 surgeInfoRepository$loadInfoFromNet$1;
        int i;
        if (continuationImpl instanceof SurgeInfoRepository$loadInfoFromNet$1) {
            surgeInfoRepository$loadInfoFromNet$1 = (SurgeInfoRepository$loadInfoFromNet$1) continuationImpl;
            int i2 = surgeInfoRepository$loadInfoFromNet$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                surgeInfoRepository$loadInfoFromNet$1.label = i2 - Integer.MIN_VALUE;
                Object obj = surgeInfoRepository$loadInfoFromNet$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeInfoRepository$loadInfoFromNet$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth mthVar = new mth(e.I(this.a.i(), new SurgeInfoRepository$loadInfoFromNet$response$1(this, wsw0Var, null)), 6);
                    surgeInfoRepository$loadInfoFromNet$1.L$0 = null;
                    surgeInfoRepository$loadInfoFromNet$1.label = 1;
                    obj = e.y(mthVar, surgeInfoRepository$loadInfoFromNet$1);
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
                return (btw0) obj;
            }
        }
        surgeInfoRepository$loadInfoFromNet$1 = new SurgeInfoRepository$loadInfoFromNet$1(this, continuationImpl);
        Object obj2 = surgeInfoRepository$loadInfoFromNet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeInfoRepository$loadInfoFromNet$1.label;
        if (i != 0) {
        }
        return (btw0) obj2;
    }
}
