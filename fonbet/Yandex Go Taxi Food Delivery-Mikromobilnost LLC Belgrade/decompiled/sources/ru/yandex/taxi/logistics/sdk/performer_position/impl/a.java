package ru.yandex.taxi.logistics.sdk.performer_position.impl;

import com.adjust.sdk.Constants;
import defpackage.d6w;
import defpackage.ike;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.rol0;
import defpackage.st2;
import defpackage.tpr;
import defpackage.wsr0;
import defpackage.xli;
import defpackage.xsr0;
import java.util.LinkedHashMap;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes9.dex */
public final class a {
    public static final d6w f = new d6w(Constants.MINIMAL_ERROR_STATUS_CODE, 499, 1);
    public final ru.yandex.taxi.logistics.sdk.performer_position.impl.data.a a;
    public final AppVisibilitySubscriptionImpl b;
    public final ike d;
    public final Object c = new Object();
    public final LinkedHashMap e = new LinkedHashMap();

    public a(ru.yandex.taxi.logistics.sdk.performer_position.impl.data.a aVar, AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl, st2 st2Var) {
        this.a = aVar;
        this.b = appVisibilitySubscriptionImpl;
        this.d = qv10.e(st2Var.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (ru.yandex.taxi.logistics.sdk.ui.a.a(r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        PerformerPositionInteractorImpl$requestPerformerPosition$1 performerPositionInteractorImpl$requestPerformerPosition$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof PerformerPositionInteractorImpl$requestPerformerPosition$1) {
            performerPositionInteractorImpl$requestPerformerPosition$1 = (PerformerPositionInteractorImpl$requestPerformerPosition$1) continuationImpl;
            int i2 = performerPositionInteractorImpl$requestPerformerPosition$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                performerPositionInteractorImpl$requestPerformerPosition$1.label = i2 - Integer.MIN_VALUE;
                Object obj = performerPositionInteractorImpl$requestPerformerPosition$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = performerPositionInteractorImpl$requestPerformerPosition$1.label;
                if (i != 0) {
                    b.b(obj);
                    AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl = aVar.b;
                    performerPositionInteractorImpl$requestPerformerPosition$1.L$0 = str;
                    performerPositionInteractorImpl$requestPerformerPosition$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    str = (String) performerPositionInteractorImpl$requestPerformerPosition$1.L$0;
                    b.b(obj);
                }
                ru.yandex.taxi.logistics.sdk.performer_position.impl.data.a aVar2 = aVar.a;
                performerPositionInteractorImpl$requestPerformerPosition$1.L$0 = null;
                performerPositionInteractorImpl$requestPerformerPosition$1.label = 2;
                Object b = aVar2.b(str, performerPositionInteractorImpl$requestPerformerPosition$1);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        performerPositionInteractorImpl$requestPerformerPosition$1 = new PerformerPositionInteractorImpl$requestPerformerPosition$1(aVar, continuationImpl);
        Object obj2 = performerPositionInteractorImpl$requestPerformerPosition$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = performerPositionInteractorImpl$requestPerformerPosition$1.label;
        if (i != 0) {
        }
        ru.yandex.taxi.logistics.sdk.performer_position.impl.data.a aVar22 = aVar.a;
        performerPositionInteractorImpl$requestPerformerPosition$1.L$0 = null;
        performerPositionInteractorImpl$requestPerformerPosition$1.label = 2;
        Object b2 = aVar22.b(str, performerPositionInteractorImpl$requestPerformerPosition$1);
        if (b2 != coroutineSingletons2) {
        }
    }

    public final tpr b(String str) {
        tpr tprVar;
        synchronized (this.c) {
            try {
                LinkedHashMap linkedHashMap = this.e;
                xli a = xli.a(str);
                Object obj = linkedHashMap.get(a);
                if (obj == null) {
                    obj = e.O(new rol0(new PerformerPositionInteractorImpl$createPerformerPositionPollingFlow$1(this, str, null)), this.d, wsr0.a(xsr0.a, 2), 1);
                    linkedHashMap.put(a, obj);
                }
                tprVar = (tpr) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tprVar;
    }
}
