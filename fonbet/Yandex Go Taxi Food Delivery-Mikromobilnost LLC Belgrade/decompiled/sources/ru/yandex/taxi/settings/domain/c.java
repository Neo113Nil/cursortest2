package ru.yandex.taxi.settings.domain;

import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u3g0;
import defpackage.uyj;
import defpackage.zy11;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class c {
    public final e a;
    public final tt2 b;

    public c(e eVar, tt2 tt2Var) {
        this.a = eVar;
        this.b = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Set set, long j, ContinuationImpl continuationImpl) {
        PushSettingsFetchInteractor$fetchSettings$1 pushSettingsFetchInteractor$fetchSettings$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        long j2;
        Object k0;
        u3g0 u3g0Var;
        if (continuationImpl instanceof PushSettingsFetchInteractor$fetchSettings$1) {
            pushSettingsFetchInteractor$fetchSettings$1 = (PushSettingsFetchInteractor$fetchSettings$1) continuationImpl;
            int i2 = pushSettingsFetchInteractor$fetchSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushSettingsFetchInteractor$fetchSettings$1.label = i2 - Integer.MIN_VALUE;
                PushSettingsFetchInteractor$fetchSettings$1 pushSettingsFetchInteractor$fetchSettings$12 = pushSettingsFetchInteractor$fetchSettings$1;
                Object obj = pushSettingsFetchInteractor$fetchSettings$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushSettingsFetchInteractor$fetchSettings$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pushSettingsFetchInteractor$fetchSettings$12.L$0 = null;
                    pushSettingsFetchInteractor$fetchSettings$12.J$0 = j;
                    pushSettingsFetchInteractor$fetchSettings$12.label = 1;
                    obj = this.a.c(false, set, j, pushSettingsFetchInteractor$fetchSettings$12);
                    if (obj != coroutineSingletons) {
                        j2 = j;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u3g0Var = (u3g0) pushSettingsFetchInteractor$fetchSettings$12.L$1;
                    kotlin.b.b(obj);
                    return Boolean.valueOf(u3g0Var.c);
                }
                j2 = pushSettingsFetchInteractor$fetchSettings$12.J$0;
                kotlin.b.b(obj);
                u3g0 u3g0Var2 = (u3g0) obj;
                pushSettingsFetchInteractor$fetchSettings$12.L$0 = null;
                pushSettingsFetchInteractor$fetchSettings$12.L$1 = u3g0Var2;
                pushSettingsFetchInteractor$fetchSettings$12.J$0 = j2;
                pushSettingsFetchInteractor$fetchSettings$12.label = 2;
                this.b.getClass();
                sjh sjhVar = uyj.a;
                k0 = tje.k0(o400.a, new PushSettingsFetchInteractor$updateSettings$2(this, u3g0Var2, null), pushSettingsFetchInteractor$fetchSettings$12);
                if (k0 != coroutineSingletons) {
                    k0 = zy11.a;
                }
                if (k0 != coroutineSingletons) {
                    u3g0Var = u3g0Var2;
                    return Boolean.valueOf(u3g0Var.c);
                }
                return coroutineSingletons;
            }
        }
        pushSettingsFetchInteractor$fetchSettings$1 = new PushSettingsFetchInteractor$fetchSettings$1(this, continuationImpl);
        PushSettingsFetchInteractor$fetchSettings$1 pushSettingsFetchInteractor$fetchSettings$122 = pushSettingsFetchInteractor$fetchSettings$1;
        Object obj2 = pushSettingsFetchInteractor$fetchSettings$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushSettingsFetchInteractor$fetchSettings$122.label;
        if (i != 0) {
        }
        u3g0 u3g0Var22 = (u3g0) obj2;
        pushSettingsFetchInteractor$fetchSettings$122.L$0 = null;
        pushSettingsFetchInteractor$fetchSettings$122.L$1 = u3g0Var22;
        pushSettingsFetchInteractor$fetchSettings$122.J$0 = j2;
        pushSettingsFetchInteractor$fetchSettings$122.label = 2;
        this.b.getClass();
        sjh sjhVar2 = uyj.a;
        k0 = tje.k0(o400.a, new PushSettingsFetchInteractor$updateSettings$2(this, u3g0Var22, null), pushSettingsFetchInteractor$fetchSettings$122);
        if (k0 != coroutineSingletons) {
        }
        if (k0 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
