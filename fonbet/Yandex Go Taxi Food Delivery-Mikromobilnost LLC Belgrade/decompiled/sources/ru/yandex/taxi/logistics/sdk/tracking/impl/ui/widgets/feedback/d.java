package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback;

import defpackage.gri;
import defpackage.ny61;
import defpackage.t701;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FeedbackStateHolder$special$$inlined$map$1$2$1 feedbackStateHolder$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof FeedbackStateHolder$special$$inlined$map$1$2$1) {
            feedbackStateHolder$special$$inlined$map$1$2$1 = (FeedbackStateHolder$special$$inlined$map$1$2$1) continuation;
            int i2 = feedbackStateHolder$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackStateHolder$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = feedbackStateHolder$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedbackStateHolder$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    gri griVar = ((t701) obj).a;
                    feedbackStateHolder$special$$inlined$map$1$2$1.L$0 = null;
                    feedbackStateHolder$special$$inlined$map$1$2$1.L$1 = null;
                    feedbackStateHolder$special$$inlined$map$1$2$1.L$2 = null;
                    feedbackStateHolder$special$$inlined$map$1$2$1.L$3 = null;
                    feedbackStateHolder$special$$inlined$map$1$2$1.I$0 = 0;
                    feedbackStateHolder$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(griVar, feedbackStateHolder$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        feedbackStateHolder$special$$inlined$map$1$2$1 = new FeedbackStateHolder$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = feedbackStateHolder$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedbackStateHolder$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
