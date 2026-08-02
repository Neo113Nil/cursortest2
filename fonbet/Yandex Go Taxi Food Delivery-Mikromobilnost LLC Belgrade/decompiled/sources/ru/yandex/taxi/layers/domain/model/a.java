package ru.yandex.taxi.layers.domain.model;

import defpackage.mn6;
import defpackage.ny61;
import defpackage.qn6;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes5.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mn6 mn6Var, c cVar, ContinuationImpl continuationImpl) {
        BubbleOverlayConfig$Companion$create$1 bubbleOverlayConfig$Companion$create$1;
        int i;
        FormattedText formattedText;
        if (continuationImpl instanceof BubbleOverlayConfig$Companion$create$1) {
            bubbleOverlayConfig$Companion$create$1 = (BubbleOverlayConfig$Companion$create$1) continuationImpl;
            int i2 = bubbleOverlayConfig$Companion$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bubbleOverlayConfig$Companion$create$1.label = i2 - Integer.MIN_VALUE;
                BubbleOverlayConfig$Companion$create$1 bubbleOverlayConfig$Companion$create$12 = bubbleOverlayConfig$Companion$create$1;
                Object obj = bubbleOverlayConfig$Companion$create$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bubbleOverlayConfig$Companion$create$12.label;
                if (i != 0) {
                    b.b(obj);
                    if (mn6Var == null || (formattedText = mn6Var.a) == null || mn6Var.b.a.isEmpty()) {
                        return null;
                    }
                    bubbleOverlayConfig$Companion$create$12.L$0 = mn6Var;
                    bubbleOverlayConfig$Companion$create$12.L$1 = null;
                    bubbleOverlayConfig$Companion$create$12.label = 1;
                    obj = c.e(cVar, formattedText, null, false, bubbleOverlayConfig$Companion$create$12, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mn6Var = (mn6) bubbleOverlayConfig$Companion$create$12.L$0;
                    b.b(obj);
                }
                return new qn6((CharSequence) obj, kotlin.collections.a.M(mn6Var.b), mn6Var.c);
            }
        }
        bubbleOverlayConfig$Companion$create$1 = new BubbleOverlayConfig$Companion$create$1(this, continuationImpl);
        BubbleOverlayConfig$Companion$create$1 bubbleOverlayConfig$Companion$create$122 = bubbleOverlayConfig$Companion$create$1;
        Object obj2 = bubbleOverlayConfig$Companion$create$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bubbleOverlayConfig$Companion$create$122.label;
        if (i != 0) {
        }
        return new qn6((CharSequence) obj2, kotlin.collections.a.M(mn6Var.b), mn6Var.c);
    }
}
