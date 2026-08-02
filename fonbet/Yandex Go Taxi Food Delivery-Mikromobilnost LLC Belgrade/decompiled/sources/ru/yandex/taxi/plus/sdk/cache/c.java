package ru.yandex.taxi.plus.sdk.cache;

import defpackage.bvf0;
import defpackage.f29;
import defpackage.ny61;
import defpackage.vhu;
import defpackage.znp0;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class c {
    public volatile znp0 a;
    public volatile vhu b;
    public volatile String c;
    public final Set d = Collections.synchronizedSet(new LinkedHashSet());
    public final r0 e = bvf0.c(null);

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SdkDataCache$awaitSdkStateAvailability$1 sdkDataCache$awaitSdkStateAvailability$1;
        int i;
        if (continuationImpl instanceof SdkDataCache$awaitSdkStateAvailability$1) {
            sdkDataCache$awaitSdkStateAvailability$1 = (SdkDataCache$awaitSdkStateAvailability$1) continuationImpl;
            int i2 = sdkDataCache$awaitSdkStateAvailability$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkDataCache$awaitSdkStateAvailability$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdkDataCache$awaitSdkStateAvailability$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkDataCache$awaitSdkStateAvailability$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b b = b();
                    SdkDataCache$awaitSdkStateAvailability$2 sdkDataCache$awaitSdkStateAvailability$2 = new SdkDataCache$awaitSdkStateAvailability$2(2, null);
                    sdkDataCache$awaitSdkStateAvailability$1.label = 1;
                    if (e.x(b, sdkDataCache$awaitSdkStateAvailability$2, sdkDataCache$awaitSdkStateAvailability$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        sdkDataCache$awaitSdkStateAvailability$1 = new SdkDataCache$awaitSdkStateAvailability$1(this, continuationImpl);
        Object obj2 = sdkDataCache$awaitSdkStateAvailability$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkDataCache$awaitSdkStateAvailability$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final b b() {
        return new b(this.e);
    }

    public final void c(znp0 znp0Var) {
        synchronized (this.d) {
            this.a = znp0Var;
            r0 r0Var = this.e;
            r0Var.getClass();
            r0Var.m(null, znp0Var);
            Iterator it = kotlin.collections.a.N0(this.d).iterator();
            while (it.hasNext()) {
                ((f29) it.next()).a();
            }
        }
    }
}
