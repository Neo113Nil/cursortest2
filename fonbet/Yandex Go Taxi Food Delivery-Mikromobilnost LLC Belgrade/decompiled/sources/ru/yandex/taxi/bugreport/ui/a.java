package ru.yandex.taxi.bugreport.ui;

import defpackage.evu0;
import defpackage.ir6;
import defpackage.jr6;
import defpackage.ny61;
import defpackage.or6;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BugReportViewModelImpl$observeState$$inlined$map$1$2$1 bugReportViewModelImpl$observeState$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof BugReportViewModelImpl$observeState$$inlined$map$1$2$1) {
            bugReportViewModelImpl$observeState$$inlined$map$1$2$1 = (BugReportViewModelImpl$observeState$$inlined$map$1$2$1) continuation;
            int i2 = bugReportViewModelImpl$observeState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bugReportViewModelImpl$observeState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = bugReportViewModelImpl$observeState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bugReportViewModelImpl$observeState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    or6 or6Var = (or6) obj;
                    boolean z = or6Var.b && !evu0.J(or6Var.c);
                    if (z) {
                        obj2 = jr6.a;
                    } else {
                        if (z) {
                            w511.b();
                            return null;
                        }
                        obj2 = ir6.a;
                    }
                    bugReportViewModelImpl$observeState$$inlined$map$1$2$1.L$0 = null;
                    bugReportViewModelImpl$observeState$$inlined$map$1$2$1.L$1 = null;
                    bugReportViewModelImpl$observeState$$inlined$map$1$2$1.L$2 = null;
                    bugReportViewModelImpl$observeState$$inlined$map$1$2$1.L$3 = null;
                    bugReportViewModelImpl$observeState$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, bugReportViewModelImpl$observeState$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        bugReportViewModelImpl$observeState$$inlined$map$1$2$1 = new BugReportViewModelImpl$observeState$$inlined$map$1$2$1(this, continuation);
        Object obj32 = bugReportViewModelImpl$observeState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bugReportViewModelImpl$observeState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
