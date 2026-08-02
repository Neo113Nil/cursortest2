package ru.yandex.taxi.startup.launch;

import defpackage.h3y;
import defpackage.i3y;
import defpackage.mj;
import defpackage.ny61;
import defpackage.tje;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class c {
    public final i3y a;

    public c(h3y h3yVar) {
        this.a = kotlin.a.a(new mj(h3yVar, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl, boolean z) {
        LaunchControllerImpl$request$1 launchControllerImpl$request$1;
        int i;
        Object a;
        if (continuationImpl instanceof LaunchControllerImpl$request$1) {
            launchControllerImpl$request$1 = (LaunchControllerImpl$request$1) continuationImpl;
            int i2 = launchControllerImpl$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                launchControllerImpl$request$1.label = i2 - Integer.MIN_VALUE;
                Object obj = launchControllerImpl$request$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = launchControllerImpl$request$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = (b) this.a.getValue();
                    launchControllerImpl$request$1.L$0 = null;
                    launchControllerImpl$request$1.Z$0 = z;
                    launchControllerImpl$request$1.label = 1;
                    a = bVar.a(str, launchControllerImpl$request$1, z);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                kotlin.b.b(a);
                return a;
            }
        }
        launchControllerImpl$request$1 = new LaunchControllerImpl$request$1(this, continuationImpl);
        Object obj2 = launchControllerImpl$request$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = launchControllerImpl$request$1.label;
        if (i != 0) {
        }
        kotlin.b.b(a);
        return a;
    }

    public final void b(String str, boolean z) {
        b bVar = (b) this.a.getValue();
        tje.N(bVar.c, null, null, new LaunchControllerImpl$Worker$scheduleRequest$1(bVar, z, str, null), 3);
    }

    public final void c(String str) {
        b bVar = (b) this.a.getValue();
        tje.N(bVar.c, null, null, new LaunchControllerImpl$Worker$scheduleRequest$1(bVar, true, str, null), 3);
    }
}
