package ru.yandex.taxi.masstransit.main.flex;

import defpackage.evu0;
import defpackage.ivj0;
import defpackage.ny61;
import defpackage.omt;
import defpackage.qjr;
import defpackage.x4j0;
import defpackage.y210;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a implements qjr {
    public final y210 a;

    public a(y210 y210Var) {
        this.a = y210Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.qjr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(omt omtVar, ContinuationImpl continuationImpl) {
        MasstransitMainBduiInterceptor$intercept$1 masstransitMainBduiInterceptor$intercept$1;
        int i;
        if (continuationImpl instanceof MasstransitMainBduiInterceptor$intercept$1) {
            masstransitMainBduiInterceptor$intercept$1 = (MasstransitMainBduiInterceptor$intercept$1) continuationImpl;
            int i2 = masstransitMainBduiInterceptor$intercept$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitMainBduiInterceptor$intercept$1.label = i2 - Integer.MIN_VALUE;
                Object obj = masstransitMainBduiInterceptor$intercept$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitMainBduiInterceptor$intercept$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x4j0 x4j0Var = omtVar.b;
                    masstransitMainBduiInterceptor$intercept$1.L$0 = omtVar;
                    masstransitMainBduiInterceptor$intercept$1.label = 1;
                    obj = omtVar.a(x4j0Var, masstransitMainBduiInterceptor$intercept$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    omtVar = (omt) masstransitMainBduiInterceptor$intercept$1.L$0;
                    kotlin.b.b(obj);
                }
                ivj0 ivj0Var = (ivj0) obj;
                if (evu0.y(omtVar.b.a.b(), "masstransit/main", true)) {
                    this.a.a.set(ivj0Var.b.a("X-YaRequestId"));
                }
                return ivj0Var;
            }
        }
        masstransitMainBduiInterceptor$intercept$1 = new MasstransitMainBduiInterceptor$intercept$1(this, continuationImpl);
        Object obj2 = masstransitMainBduiInterceptor$intercept$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitMainBduiInterceptor$intercept$1.label;
        if (i != 0) {
        }
        ivj0 ivj0Var2 = (ivj0) obj2;
        if (evu0.y(omtVar.b.a.b(), "masstransit/main", true)) {
        }
        return ivj0Var2;
    }
}
