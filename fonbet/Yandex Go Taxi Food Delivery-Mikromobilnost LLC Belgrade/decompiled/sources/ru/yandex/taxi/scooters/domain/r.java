package ru.yandex.taxi.scooters.domain;

import defpackage.ny61;
import defpackage.p6p0;
import defpackage.zgz;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class r {
    public final ru.yandex.taxi.scooters.data.data_source.c a;
    public final ru.yandex.taxi.scooters.data.h b;

    public r(ru.yandex.taxi.scooters.data.data_source.c cVar, ru.yandex.taxi.scooters.data.h hVar) {
        this.a = cVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersUserStateInteractor$safeUpdateUserState$1 scootersUserStateInteractor$safeUpdateUserState$1;
        int i;
        try {
            if (continuationImpl instanceof ScootersUserStateInteractor$safeUpdateUserState$1) {
                scootersUserStateInteractor$safeUpdateUserState$1 = (ScootersUserStateInteractor$safeUpdateUserState$1) continuationImpl;
                int i2 = scootersUserStateInteractor$safeUpdateUserState$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersUserStateInteractor$safeUpdateUserState$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersUserStateInteractor$safeUpdateUserState$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersUserStateInteractor$safeUpdateUserState$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersUserStateInteractor$safeUpdateUserState$1.label = 1;
                        obj = b(scootersUserStateInteractor$safeUpdateUserState$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (p6p0) obj;
                }
            }
            if (i != 0) {
            }
            return (p6p0) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            zgz.a(null, th);
            return this.b.a();
        }
        scootersUserStateInteractor$safeUpdateUserState$1 = new ScootersUserStateInteractor$safeUpdateUserState$1(this, continuationImpl);
        Object obj3 = scootersUserStateInteractor$safeUpdateUserState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersUserStateInteractor$safeUpdateUserState$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r4.c((defpackage.w6p0) r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ScootersUserStateInteractor$updateUserState$1 scootersUserStateInteractor$updateUserState$1;
        int i;
        if (continuationImpl instanceof ScootersUserStateInteractor$updateUserState$1) {
            scootersUserStateInteractor$updateUserState$1 = (ScootersUserStateInteractor$updateUserState$1) continuationImpl;
            int i2 = scootersUserStateInteractor$updateUserState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersUserStateInteractor$updateUserState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersUserStateInteractor$updateUserState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersUserStateInteractor$updateUserState$1.label;
                ru.yandex.taxi.scooters.data.h hVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersUserStateInteractor$updateUserState$1.label = 1;
                    obj = this.a.a(scootersUserStateInteractor$updateUserState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return hVar.a();
                    }
                    kotlin.b.b(obj);
                }
                scootersUserStateInteractor$updateUserState$1.L$0 = null;
                scootersUserStateInteractor$updateUserState$1.label = 2;
            }
        }
        scootersUserStateInteractor$updateUserState$1 = new ScootersUserStateInteractor$updateUserState$1(this, continuationImpl);
        Object obj2 = scootersUserStateInteractor$updateUserState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersUserStateInteractor$updateUserState$1.label;
        ru.yandex.taxi.scooters.data.h hVar2 = this.b;
        if (i != 0) {
        }
        scootersUserStateInteractor$updateUserState$1.L$0 = null;
        scootersUserStateInteractor$updateUserState$1.label = 2;
    }
}
