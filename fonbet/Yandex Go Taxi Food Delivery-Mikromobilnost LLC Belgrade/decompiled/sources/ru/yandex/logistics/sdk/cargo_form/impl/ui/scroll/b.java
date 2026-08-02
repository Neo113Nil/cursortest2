package ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll;

import defpackage.ny61;
import defpackage.t3s;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScrollTagStateHolder$tagFlow$$inlined$map$1$2$1 scrollTagStateHolder$tagFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScrollTagStateHolder$tagFlow$$inlined$map$1$2$1) {
            scrollTagStateHolder$tagFlow$$inlined$map$1$2$1 = (ScrollTagStateHolder$tagFlow$$inlined$map$1$2$1) continuation;
            int i2 = scrollTagStateHolder$tagFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollTagStateHolder$tagFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scrollTagStateHolder$tagFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollTagStateHolder$tagFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((t3s) obj).d;
                    scrollTagStateHolder$tagFlow$$inlined$map$1$2$1.L$0 = null;
                    scrollTagStateHolder$tagFlow$$inlined$map$1$2$1.L$1 = null;
                    scrollTagStateHolder$tagFlow$$inlined$map$1$2$1.L$2 = null;
                    scrollTagStateHolder$tagFlow$$inlined$map$1$2$1.L$3 = null;
                    scrollTagStateHolder$tagFlow$$inlined$map$1$2$1.I$0 = 0;
                    scrollTagStateHolder$tagFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(list, scrollTagStateHolder$tagFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scrollTagStateHolder$tagFlow$$inlined$map$1$2$1 = new ScrollTagStateHolder$tagFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scrollTagStateHolder$tagFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollTagStateHolder$tagFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
