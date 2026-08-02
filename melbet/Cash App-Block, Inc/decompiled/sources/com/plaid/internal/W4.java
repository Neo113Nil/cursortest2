package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class W4 {
    public final H5 a;
    public S4 b;

    public W4(H5 h5) {
        h5.getClass();
        this.a = h5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        T4 t4;
        int i;
        if (continuationImpl instanceof T4) {
            t4 = (T4) continuationImpl;
            int i2 = t4.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                t4.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = t4.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = t4.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    S4 s4 = this.b;
                    if (s4 != null) {
                        return s4;
                    }
                    t4.a = this;
                    t4.d = 1;
                    if ((s4 != null ? Boolean.valueOf(s4.a) : null) != null) {
                        S4 s42 = this.b;
                        obj = Boolean.valueOf(s42 != null && s42.a);
                    } else {
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        obj = JobKt.withContext(DefaultIoScheduler.INSTANCE, new U4(this, null), t4);
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = t4.a;
                    SafeTrace.throwOnFailure(obj);
                }
                S4 s43 = new S4(((Boolean) obj).booleanValue());
                this.b = s43;
                return s43;
            }
        }
        t4 = new T4(this, continuationImpl);
        Object obj2 = t4.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = t4.d;
        if (i != 0) {
        }
        S4 s432 = new S4(((Boolean) obj2).booleanValue());
        this.b = s432;
        return s432;
    }
}
