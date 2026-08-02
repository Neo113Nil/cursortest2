package ru.yandex.taxi.analytics.referrer;

import android.content.Intent;
import android.net.Uri;
import com.adjust.sdk.Constants;
import defpackage.as21;
import defpackage.noi0;
import defpackage.ny61;
import defpackage.t61;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.referrer.analytics.DeferredDeeplinkSource;

/* loaded from: classes9.dex */
public final class b {
    public final as21 a;
    public final noi0 b;
    public final c c;

    public b(as21 as21Var, noi0 noi0Var, c cVar) {
        this.a = as21Var;
        this.b = noi0Var;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AdjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1 adjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1;
        int i;
        Pair pair;
        if (continuationImpl instanceof AdjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1) {
            adjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1 = (AdjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1) continuationImpl;
            int i2 = adjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = adjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = adjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1.label;
                as21 as21Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!as21Var.a("adjust_deferred_deeplink_handled", false)) {
                        adjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1.label = 1;
                        obj = b(adjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                pair = (Pair) obj;
                if (pair != null) {
                    String str = (String) pair.getFirst();
                    DeferredDeeplinkSource deferredDeeplinkSource = (DeferredDeeplinkSource) pair.getSecond();
                    as21Var.e("adjust_deferred_deeplink_handled", true);
                    as21Var.g("adjust_deferred_deeplink_pending", null);
                    t61 t61Var = this.b.b;
                    String value = deferredDeeplinkSource.getValue();
                    t61Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put(Constants.DEEPLINK, str);
                    hashMap.put("source", value);
                    t61Var.a.a("DeferredDeeplink.Processed", hashMap, 1, new HashMap());
                    return new Intent("android.intent.action.VIEW", Uri.parse(str));
                }
                return null;
            }
        }
        adjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1 = new AdjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1(this, continuationImpl);
        Object obj3 = adjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = adjustDeferredDeeplinkFallbackInteractor$resolveDeeplink$1.label;
        as21 as21Var2 = this.a;
        if (i != 0) {
        }
        pair = (Pair) obj3;
        if (pair != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ContinuationImpl continuationImpl) {
        AdjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1 adjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1;
        int i;
        String str;
        if (continuationImpl instanceof AdjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1) {
            adjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1 = (AdjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1) continuationImpl;
            int i2 = adjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1.label = i2 - Integer.MIN_VALUE;
                Object obj = adjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = adjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String c = this.a.c("adjust_deferred_deeplink_pending");
                    if (c != null) {
                        return new Pair(c, DeferredDeeplinkSource.ADJUST);
                    }
                    adjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1.label = 1;
                    obj = this.c.a(adjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                str = (String) obj;
                if (str == null) {
                    return new Pair(str, DeferredDeeplinkSource.FALLBACK);
                }
                return null;
            }
        }
        adjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1 = new AdjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1(this, continuationImpl);
        Object obj2 = adjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = adjustDeferredDeeplinkFallbackInteractor$resolveDeeplinkWithSource$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
    }
}
