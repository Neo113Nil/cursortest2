package ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll;

import defpackage.f151;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;

    public f(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1 scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1) {
            scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1 = (ScrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1) continuation;
            int i2 = scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f151 f151Var = (f151) obj;
                    Float f = f151Var != null ? new Float(f151Var.c) : null;
                    scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1.L$0 = null;
                    scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1.L$1 = null;
                    scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1.L$2 = null;
                    scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1.L$3 = null;
                    scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1.I$0 = 0;
                    scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1 = new ScrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollVisibilityRepositoryImpl$visibleFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
