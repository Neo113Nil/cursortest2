package com.plaid.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.AbstractC0321w7;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class L {
    public final Context a;
    public final J b;

    public L(Context context, J j) {
        context.getClass();
        j.getClass();
        this.a = context;
        this.b = j;
    }

    public final Object a(String str, M m) {
        boolean z;
        Object invoke;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(m));
        Object systemService = this.a.getSystemService("connectivity");
        if (systemService == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.net.ConnectivityManager");
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        try {
            Method declaredMethod = Class.forName(connectivityManager.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.getClass();
            declaredMethod.setAccessible(true);
            invoke = declaredMethod.invoke(connectivityManager, null);
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        if (invoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
        z = ((Boolean) invoke).booleanValue();
        if (z) {
            connectivityManager.requestNetwork(new NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), new K(this, str, safeContinuation, connectivityManager));
        } else {
            Result.Companion companion = Result.Companion;
            safeContinuation.resumeWith(SafeTrace.createFailure(AbstractC0321w7.a.a));
        }
        Object orThrow = safeContinuation.getOrThrow();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return orThrow;
    }
}
