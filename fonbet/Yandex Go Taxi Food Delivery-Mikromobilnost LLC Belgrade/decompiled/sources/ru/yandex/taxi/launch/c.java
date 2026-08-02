package ru.yandex.taxi.launch;

import defpackage.bvf0;
import defpackage.dvx;
import defpackage.evu0;
import defpackage.evx;
import defpackage.fn21;
import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes9.dex */
public final class c {
    public final fn21 a;
    public final evx b;
    public final m c;
    public final r0 d;

    public c(fn21 fn21Var, evx evxVar, m mVar) {
        this.a = fn21Var;
        this.b = evxVar;
        this.c = mVar;
        String Hg = ((h) fn21Var).Hg();
        this.d = bvf0.c((Hg == null || evu0.J(Hg)) ? null : evxVar.a(Hg));
    }

    public final tpr a() {
        mth b = b();
        m mVar = this.c;
        return e.t(new m0(b, com.yandex.go.coroutines.b.d(mVar.f, new LaunchInfoRepository$special$$inlined$start$1(mVar.a(), null)), new LaunchInfoRepository$authorizedWithTokenLaunchInfoFlow$1(this, null)));
    }

    public final mth b() {
        return new mth(this.d, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        LaunchInfoRepository$launchId$1 launchInfoRepository$launchId$1;
        int i;
        if (continuationImpl instanceof LaunchInfoRepository$launchId$1) {
            launchInfoRepository$launchId$1 = (LaunchInfoRepository$launchId$1) continuationImpl;
            int i2 = launchInfoRepository$launchId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                launchInfoRepository$launchId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = launchInfoRepository$launchId$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = launchInfoRepository$launchId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    launchInfoRepository$launchId$1.label = 1;
                    obj = d(launchInfoRepository$launchId$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((dvx) obj).a;
            }
        }
        launchInfoRepository$launchId$1 = new LaunchInfoRepository$launchId$1(this, continuationImpl);
        Object obj3 = launchInfoRepository$launchId$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = launchInfoRepository$launchId$1.label;
        if (i != 0) {
        }
        return ((dvx) obj3).a;
    }

    public final Object d(ContinuationImpl continuationImpl) {
        return e.y(new b(b(), this), continuationImpl);
    }
}
