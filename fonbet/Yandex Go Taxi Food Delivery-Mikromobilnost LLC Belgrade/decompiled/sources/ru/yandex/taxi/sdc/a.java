package ru.yandex.taxi.sdc;

import defpackage.bd;
import defpackage.jbh;
import defpackage.ml50;
import defpackage.ny61;
import defpackage.rco;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class a {
    public final rco a;
    public final rqo b;

    public a(rco rcoVar, rqo rqoVar) {
        this.a = rcoVar;
        this.b = rqoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bd bdVar, ContinuationImpl continuationImpl) {
        EulaInteractor$getEulaConfig$1 eulaInteractor$getEulaConfig$1;
        int i;
        rco rcoVar;
        String str;
        if (continuationImpl instanceof EulaInteractor$getEulaConfig$1) {
            eulaInteractor$getEulaConfig$1 = (EulaInteractor$getEulaConfig$1) continuationImpl;
            int i2 = eulaInteractor$getEulaConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eulaInteractor$getEulaConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eulaInteractor$getEulaConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eulaInteractor$getEulaConfig$1.label;
                if (i != 0) {
                    b.b(obj);
                    t1b0 e = ((jbh) this.b).e(ml50.f);
                    String str2 = bdVar.a;
                    eulaInteractor$getEulaConfig$1.L$0 = null;
                    eulaInteractor$getEulaConfig$1.L$1 = null;
                    rco rcoVar2 = this.a;
                    eulaInteractor$getEulaConfig$1.L$2 = rcoVar2;
                    eulaInteractor$getEulaConfig$1.L$3 = str2;
                    eulaInteractor$getEulaConfig$1.label = 1;
                    obj = e.b(eulaInteractor$getEulaConfig$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rcoVar = rcoVar2;
                    str = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) eulaInteractor$getEulaConfig$1.L$3;
                    rcoVar = (rco) eulaInteractor$getEulaConfig$1.L$2;
                    b.b(obj);
                }
                rcoVar.getClass();
                return rco.a(str, (ml50) obj);
            }
        }
        eulaInteractor$getEulaConfig$1 = new EulaInteractor$getEulaConfig$1(this, continuationImpl);
        Object obj2 = eulaInteractor$getEulaConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eulaInteractor$getEulaConfig$1.label;
        if (i != 0) {
        }
        rcoVar.getClass();
        return rco.a(str, (ml50) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(bd bdVar, ContinuationImpl continuationImpl) {
        EulaInteractor$hasEulaConfig$1 eulaInteractor$hasEulaConfig$1;
        int i;
        if (continuationImpl instanceof EulaInteractor$hasEulaConfig$1) {
            eulaInteractor$hasEulaConfig$1 = (EulaInteractor$hasEulaConfig$1) continuationImpl;
            int i2 = eulaInteractor$hasEulaConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eulaInteractor$hasEulaConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eulaInteractor$hasEulaConfig$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eulaInteractor$hasEulaConfig$1.label;
                if (i != 0) {
                    b.b(obj);
                    eulaInteractor$hasEulaConfig$1.L$0 = null;
                    eulaInteractor$hasEulaConfig$1.label = 1;
                    obj = a(bdVar, eulaInteractor$hasEulaConfig$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return Boolean.valueOf(obj != null);
            }
        }
        eulaInteractor$hasEulaConfig$1 = new EulaInteractor$hasEulaConfig$1(this, continuationImpl);
        Object obj3 = eulaInteractor$hasEulaConfig$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eulaInteractor$hasEulaConfig$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(obj3 != null);
    }
}
