package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.line_divider;

import defpackage.ny61;
import defpackage.sgy;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Collections;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
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
        LineDividerStateHolder$special$$inlined$map$1$2$1 lineDividerStateHolder$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof LineDividerStateHolder$special$$inlined$map$1$2$1) {
            lineDividerStateHolder$special$$inlined$map$1$2$1 = (LineDividerStateHolder$special$$inlined$map$1$2$1) continuation;
            int i2 = lineDividerStateHolder$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lineDividerStateHolder$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = lineDividerStateHolder$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lineDividerStateHolder$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    Object singletonList = ((Boolean) obj).booleanValue() ? Collections.singletonList(new sgy()) : EmptyList.a;
                    lineDividerStateHolder$special$$inlined$map$1$2$1.L$0 = null;
                    lineDividerStateHolder$special$$inlined$map$1$2$1.L$1 = null;
                    lineDividerStateHolder$special$$inlined$map$1$2$1.L$2 = null;
                    lineDividerStateHolder$special$$inlined$map$1$2$1.L$3 = null;
                    lineDividerStateHolder$special$$inlined$map$1$2$1.I$0 = 0;
                    lineDividerStateHolder$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(singletonList, lineDividerStateHolder$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        lineDividerStateHolder$special$$inlined$map$1$2$1 = new LineDividerStateHolder$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = lineDividerStateHolder$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lineDividerStateHolder$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
