package ru.yandex.taxi.persuggest.source;

import defpackage.ny61;
import defpackage.q3e;
import defpackage.sta0;
import defpackage.v03;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class b {
    public final ru.yandex.taxi.persuggest.api.a a;
    public final sta0 b;
    public final a c;

    public b(ru.yandex.taxi.persuggest.api.a aVar, sta0 sta0Var, a aVar2) {
        this.a = aVar;
        this.b = sta0Var;
        this.c = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r15 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ConfirmRepositoryImpl$confirm$1 confirmRepositoryImpl$confirm$1;
        int i;
        if (continuationImpl instanceof ConfirmRepositoryImpl$confirm$1) {
            confirmRepositoryImpl$confirm$1 = (ConfirmRepositoryImpl$confirm$1) continuationImpl;
            int i2 = confirmRepositoryImpl$confirm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                confirmRepositoryImpl$confirm$1.label = i2 - Integer.MIN_VALUE;
                ConfirmRepositoryImpl$confirm$1 confirmRepositoryImpl$confirm$12 = confirmRepositoryImpl$confirm$1;
                Object obj = confirmRepositoryImpl$confirm$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = confirmRepositoryImpl$confirm$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    confirmRepositoryImpl$confirm$12.label = 1;
                    obj = a.b(this.c, null, null, null, null, null, null, null, false, confirmRepositoryImpl$confirm$12, 255);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                q3e q3eVar = new q3e((v03) obj);
                String a = this.b.a();
                confirmRepositoryImpl$confirm$12.L$0 = null;
                confirmRepositoryImpl$confirm$12.L$1 = null;
                confirmRepositoryImpl$confirm$12.label = 2;
                Object b = this.a.b(a, q3eVar, confirmRepositoryImpl$confirm$12);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        confirmRepositoryImpl$confirm$1 = new ConfirmRepositoryImpl$confirm$1(this, continuationImpl);
        ConfirmRepositoryImpl$confirm$1 confirmRepositoryImpl$confirm$122 = confirmRepositoryImpl$confirm$1;
        Object obj2 = confirmRepositoryImpl$confirm$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = confirmRepositoryImpl$confirm$122.label;
        if (i != 0) {
        }
        q3e q3eVar2 = new q3e((v03) obj2);
        String a2 = this.b.a();
        confirmRepositoryImpl$confirm$122.L$0 = null;
        confirmRepositoryImpl$confirm$122.L$1 = null;
        confirmRepositoryImpl$confirm$122.label = 2;
        Object b2 = this.a.b(a2, q3eVar2, confirmRepositoryImpl$confirm$122);
        if (b2 != coroutineSingletons2) {
        }
    }
}
