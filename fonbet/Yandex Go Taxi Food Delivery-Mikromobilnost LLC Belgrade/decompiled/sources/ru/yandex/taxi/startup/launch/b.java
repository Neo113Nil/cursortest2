package ru.yandex.taxi.startup.launch;

import defpackage.bvf0;
import defpackage.cvw;
import defpackage.gtq0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qhw0;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class b {
    public final i a;
    public final h b;
    public final ike c;
    public final kotlinx.coroutines.sync.a d;
    public pzt0 e;

    public b(i iVar, h hVar, tt2 tt2Var) {
        this.a = iVar;
        this.b = hVar;
        qhw0 a = jl40.a();
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.c = bvf0.a(cvw.U(a, mdh.b));
        this.d = gtq0.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl, boolean z) {
        LaunchControllerImpl$Worker$request$1 launchControllerImpl$Worker$request$1;
        int i;
        if (continuationImpl instanceof LaunchControllerImpl$Worker$request$1) {
            launchControllerImpl$Worker$request$1 = (LaunchControllerImpl$Worker$request$1) continuationImpl;
            int i2 = launchControllerImpl$Worker$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                launchControllerImpl$Worker$request$1.label = i2 - Integer.MIN_VALUE;
                LaunchControllerImpl$Worker$request$1 launchControllerImpl$Worker$request$12 = launchControllerImpl$Worker$request$1;
                Object obj = launchControllerImpl$Worker$request$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = launchControllerImpl$Worker$request$12.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                kotlin.b.b(obj);
                launchControllerImpl$Worker$request$12.L$0 = null;
                launchControllerImpl$Worker$request$12.Z$0 = z;
                launchControllerImpl$Worker$request$12.label = 1;
                Object b = i.b(this.a, str, null, z, launchControllerImpl$Worker$request$12, 6);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        launchControllerImpl$Worker$request$1 = new LaunchControllerImpl$Worker$request$1(this, continuationImpl);
        LaunchControllerImpl$Worker$request$1 launchControllerImpl$Worker$request$122 = launchControllerImpl$Worker$request$1;
        Object obj2 = launchControllerImpl$Worker$request$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = launchControllerImpl$Worker$request$122.label;
        if (i == 0) {
        }
    }
}
