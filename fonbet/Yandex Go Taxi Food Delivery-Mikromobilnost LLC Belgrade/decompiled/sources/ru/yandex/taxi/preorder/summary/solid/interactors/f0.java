package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.a7t0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.za31;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class f0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p0 b;

    public f0(vpr vprVar, p0 p0Var) {
        this.a = vprVar;
        this.b = p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TrapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1 trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof TrapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1) {
            trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1 = (TrapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1) continuation;
            int i2 = trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    String str = ((a7t0) this.b.b).a().b;
                    if (!jl40.l(str, "")) {
                        List list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (jl40.l(((za31) it.next()).d, str)) {
                                    break;
                                }
                            }
                        }
                        trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1.L$0 = null;
                        trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1.L$1 = null;
                        trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1.L$2 = null;
                        trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1.L$3 = null;
                        trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
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
        trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1 = new TrapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trapOnlyVerticalFallbackInteractor$fallbackToNormalStateWhenTrapVerticalDisappear$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
