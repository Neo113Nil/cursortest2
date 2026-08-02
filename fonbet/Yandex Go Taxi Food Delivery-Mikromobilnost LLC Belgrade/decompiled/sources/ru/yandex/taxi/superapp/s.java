package ru.yandex.taxi.superapp;

import android.content.pm.PackageManager;
import android.os.DeadSystemException;
import defpackage.ny61;
import defpackage.v3x;
import defpackage.vpr;
import defpackage.xby;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class s implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ u b;

    public s(vpr vprVar, u uVar) {
        this.a = vprVar;
        this.b = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1 superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof SuperAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1) {
            superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1 = (SuperAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    try {
                        this.b.a.getPackageManager().getPackageInfo((String) obj, 1);
                        superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                        superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                        superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                        superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                        superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Exception e) {
                        if (!(e instanceof PackageManager.NameNotFoundException) && !(e instanceof DeadSystemException)) {
                            xby.y(v3x.a, "SuperAppSystemInfoDelegate", null, e, "PackageManager getPackageInfo crashed", 2);
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1 = new SuperAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppSystemInfoDelegate$installedApplications$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
