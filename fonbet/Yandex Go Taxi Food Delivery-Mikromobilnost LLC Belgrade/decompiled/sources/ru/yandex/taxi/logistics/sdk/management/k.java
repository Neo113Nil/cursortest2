package ru.yandex.taxi.logistics.sdk.management;

import defpackage.fyc;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qej;
import defpackage.rzh0;
import defpackage.w511;
import defpackage.yuj0;
import defpackage.z1k0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class k {
    public final com.yandex.delivery.utils.dialogmanager.impl.b a;
    public final yuj0 b;
    public final com.yandex.delivery.utils.dialogmanager.b c;

    public k(com.yandex.delivery.utils.dialogmanager.impl.b bVar, yuj0 yuj0Var, com.yandex.delivery.utils.dialogmanager.b bVar2) {
        this.a = bVar;
        this.b = yuj0Var;
        this.c = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UserInteraction$askIfNeedRetry$1 userInteraction$askIfNeedRetry$1;
        int i;
        z1k0 z1k0Var;
        if (continuationImpl instanceof UserInteraction$askIfNeedRetry$1) {
            userInteraction$askIfNeedRetry$1 = (UserInteraction$askIfNeedRetry$1) continuationImpl;
            int i2 = userInteraction$askIfNeedRetry$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userInteraction$askIfNeedRetry$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userInteraction$askIfNeedRetry$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userInteraction$askIfNeedRetry$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userInteraction$askIfNeedRetry$1.label = 1;
                    obj = this.c.a(userInteraction$askIfNeedRetry$1);
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
                z1k0Var = (z1k0) obj;
                if (!jl40.l(z1k0Var, z1k0.a)) {
                    z = false;
                } else if (!jl40.l(z1k0Var, z1k0.b)) {
                    w511.b();
                    return null;
                }
                return Boolean.valueOf(z);
            }
        }
        userInteraction$askIfNeedRetry$1 = new UserInteraction$askIfNeedRetry$1(this, continuationImpl);
        Object obj2 = userInteraction$askIfNeedRetry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userInteraction$askIfNeedRetry$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        z1k0Var = (z1k0) obj2;
        if (!jl40.l(z1k0Var, z1k0.a)) {
        }
        return Boolean.valueOf(z2);
    }

    public final fyc b(String str) {
        yuj0 yuj0Var = this.b;
        if (str == null) {
            str = yuj0Var.a(rzh0.logistics_unknown_error, new Object[0]);
        }
        return this.a.b(new qej(null, str, null, null, yuj0Var.a(rzh0.logistics_ok_button, new Object[0]), true, null, null, 205));
    }
}
