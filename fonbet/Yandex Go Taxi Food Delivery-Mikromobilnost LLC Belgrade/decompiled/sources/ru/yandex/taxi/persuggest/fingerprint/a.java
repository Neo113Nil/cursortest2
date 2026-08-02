package ru.yandex.taxi.persuggest.fingerprint;

import defpackage.ny61;
import defpackage.v03;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public final b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:18)(2:15|16)))|32|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        defpackage.xby.l(defpackage.jst.e, "UserFingerprint", null, r0, "fingerprint collect failed", 2);
        r12 = kotlin.collections.EmptyList.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v03 v03Var, ContinuationImpl continuationImpl) {
        UserFingerprintApplicationStateInteractor$enrich$1 userFingerprintApplicationStateInteractor$enrich$1;
        int i;
        if (continuationImpl instanceof UserFingerprintApplicationStateInteractor$enrich$1) {
            userFingerprintApplicationStateInteractor$enrich$1 = (UserFingerprintApplicationStateInteractor$enrich$1) continuationImpl;
            int i2 = userFingerprintApplicationStateInteractor$enrich$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userFingerprintApplicationStateInteractor$enrich$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userFingerprintApplicationStateInteractor$enrich$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userFingerprintApplicationStateInteractor$enrich$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = this.a;
                    userFingerprintApplicationStateInteractor$enrich$1.L$0 = v03Var;
                    userFingerprintApplicationStateInteractor$enrich$1.label = 1;
                    obj = bVar.b(userFingerprintApplicationStateInteractor$enrich$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v03Var = (v03) userFingerprintApplicationStateInteractor$enrich$1.L$0;
                    kotlin.b.b(obj);
                }
                List list = (List) obj;
                return !list.isEmpty() ? v03Var : v03.a(v03Var, null, list, 67108863);
            }
        }
        userFingerprintApplicationStateInteractor$enrich$1 = new UserFingerprintApplicationStateInteractor$enrich$1(this, continuationImpl);
        Object obj3 = userFingerprintApplicationStateInteractor$enrich$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userFingerprintApplicationStateInteractor$enrich$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj3;
        if (!list2.isEmpty()) {
        }
    }
}
