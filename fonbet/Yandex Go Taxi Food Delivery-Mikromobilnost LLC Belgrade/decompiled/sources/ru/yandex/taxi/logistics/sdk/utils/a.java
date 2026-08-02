package ru.yandex.taxi.logistics.sdk.utils;

import android.os.Handler;
import android.os.Looper;
import defpackage.h60;
import defpackage.jl40;
import defpackage.rol0;
import defpackage.sls;
import defpackage.tls;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.logistics.sdk.network.c;

/* loaded from: classes5.dex */
public abstract class a {
    public static Object a(tls tlsVar, SuspendLambda suspendLambda) {
        return kotlinx.coroutines.a.w(c.h, new RequestUtilsKt$getResultCatchingWithRetry$2(3, c.g, tlsVar, null), suspendLambda);
    }

    public static final void b(sls slsVar) {
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            slsVar.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new h60(15, slsVar));
        }
    }

    public static final rol0 c(n0 n0Var) {
        return new rol0(new ConcurrencyUtilsKt$throttleFirst$1(n0Var, 1500L, null));
    }
}
