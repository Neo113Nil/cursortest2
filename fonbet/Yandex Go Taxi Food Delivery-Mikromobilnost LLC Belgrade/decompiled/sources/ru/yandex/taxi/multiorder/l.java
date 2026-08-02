package ru.yandex.taxi.multiorder;

import defpackage.jst;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public l(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WaitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1 waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1;
        int i;
        boolean z;
        if (continuation instanceof WaitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1) {
            waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1 = (WaitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1) continuation;
            int i2 = waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((List) obj).size() > 1) {
                        jst.e.getClass();
                        z = false;
                    } else {
                        jst.e.n("Order " + this.b + " loaded to show details...");
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1.L$0 = null;
                    waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1.L$1 = null;
                    waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1.L$2 = null;
                    waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1.L$3 = null;
                    waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1 = new WaitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1(this, continuation);
        Object obj22 = waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = waitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
