package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class Z0 {
    public static final Z0 a = new Z0();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(U2 u2, ContinuationImpl continuationImpl) {
        X0 x0;
        Object obj;
        int i;
        Function1 function1;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        DefaultIoScheduler defaultIoScheduler;
        Y0 y0;
        Ref$ObjectRef ref$ObjectRef3;
        if (continuationImpl instanceof X0) {
            x0 = (X0) continuationImpl;
            int i2 = x0.f;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                x0.f = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = x0.d;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = x0.f;
                if (i != 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj2);
                    x0.a = u2;
                    x0.b = m;
                    x0.c = m;
                    x0.f = 1;
                    Object invoke = u2.invoke(x0);
                    if (invoke != obj) {
                        function1 = u2;
                        ref$ObjectRef = m;
                        obj2 = invoke;
                        ref$ObjectRef2 = ref$ObjectRef;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef3 = (Ref$ObjectRef) x0.a;
                    SafeTrace.throwOnFailure(obj2);
                    return ref$ObjectRef3.element;
                }
                ref$ObjectRef = x0.c;
                ref$ObjectRef2 = x0.b;
                function1 = (Function1) x0.a;
                SafeTrace.throwOnFailure(obj2);
                ref$ObjectRef.element = obj2;
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                y0 = new Y0(ref$IntRef, ref$ObjectRef2, function1, null);
                x0.a = ref$ObjectRef2;
                x0.b = null;
                x0.c = null;
                x0.f = 2;
                if (JobKt.withContext(defaultIoScheduler, y0, x0) != obj) {
                    ref$ObjectRef3 = ref$ObjectRef2;
                    return ref$ObjectRef3.element;
                }
                return obj;
            }
        }
        x0 = new X0(this, continuationImpl);
        Object obj22 = x0.d;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = x0.f;
        if (i != 0) {
        }
        ref$ObjectRef.element = obj22;
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
        defaultIoScheduler = DefaultIoScheduler.INSTANCE;
        y0 = new Y0(ref$IntRef2, ref$ObjectRef2, function1, null);
        x0.a = ref$ObjectRef2;
        x0.b = null;
        x0.c = null;
        x0.f = 2;
        if (JobKt.withContext(defaultIoScheduler, y0, x0) != obj) {
        }
        return obj;
    }
}
