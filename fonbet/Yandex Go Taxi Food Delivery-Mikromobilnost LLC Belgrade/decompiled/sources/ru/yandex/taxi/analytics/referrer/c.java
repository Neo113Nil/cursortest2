package ru.yandex.taxi.analytics.referrer;

import android.content.SharedPreferences;
import defpackage.b3w;
import defpackage.c3w;
import defpackage.evu0;
import defpackage.exc0;
import defpackage.ny61;
import defpackage.s66;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class c {
    public final c3w a;
    public final exc0 b;
    public final s66 c;

    public c(c3w c3wVar, exc0 exc0Var, s66 s66Var) {
        this.a = c3wVar;
        this.b = exc0Var;
        this.c = s66Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.Result$Failure] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DeferredDeeplinkFallbackSource$findFallbackDeeplink$1 deferredDeeplinkFallbackSource$findFallbackDeeplink$1;
        int i;
        String str;
        String str2;
        String failure;
        String failure2;
        Map map;
        Object obj;
        if (continuationImpl instanceof DeferredDeeplinkFallbackSource$findFallbackDeeplink$1) {
            deferredDeeplinkFallbackSource$findFallbackDeeplink$1 = (DeferredDeeplinkFallbackSource$findFallbackDeeplink$1) continuationImpl;
            int i2 = deferredDeeplinkFallbackSource$findFallbackDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deferredDeeplinkFallbackSource$findFallbackDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deferredDeeplinkFallbackSource$findFallbackDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deferredDeeplinkFallbackSource$findFallbackDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String string = ((SharedPreferences) this.a.b.getValue()).getString("referrer", null);
                    if (string == null || evu0.J(string)) {
                        str = null;
                    } else {
                        try {
                            failure2 = URLDecoder.decode(string, "UTF-8");
                        } catch (Throwable th) {
                            failure2 = new Result.Failure(th);
                        }
                        if (!(failure2 instanceof Result.Failure)) {
                            string = failure2;
                        }
                        str = string;
                    }
                    if (str == null) {
                        String string2 = ((SharedPreferences) this.b.b.getValue()).getString("referrer", null);
                        if (string2 == null || evu0.J(string2)) {
                            str = null;
                        } else {
                            try {
                                failure = URLDecoder.decode(string2, "UTF-8");
                            } catch (Throwable th2) {
                                failure = new Result.Failure(th2);
                            }
                            if (!(failure instanceof Result.Failure)) {
                                string2 = failure;
                            }
                            str = string2;
                        }
                    }
                    if (str != null) {
                        deferredDeeplinkFallbackSource$findFallbackDeeplink$1.L$0 = str;
                        deferredDeeplinkFallbackSource$findFallbackDeeplink$1.label = 1;
                        Object b = this.c.b.b(deferredDeeplinkFallbackSource$findFallbackDeeplink$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        String str3 = str;
                        obj2 = b;
                        str2 = str3;
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = (String) deferredDeeplinkFallbackSource$findFallbackDeeplink$1.L$0;
                kotlin.b.b(obj2);
                map = ((b3w) obj2).b;
                if (!map.isEmpty()) {
                    Iterator it = map.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (evu0.y(str2, (CharSequence) ((Map.Entry) obj).getKey(), false)) {
                            break;
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry != null) {
                        return (String) entry.getValue();
                    }
                    return null;
                }
                return null;
            }
        }
        deferredDeeplinkFallbackSource$findFallbackDeeplink$1 = new DeferredDeeplinkFallbackSource$findFallbackDeeplink$1(this, continuationImpl);
        Object obj22 = deferredDeeplinkFallbackSource$findFallbackDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deferredDeeplinkFallbackSource$findFallbackDeeplink$1.label;
        if (i != 0) {
        }
        map = ((b3w) obj22).b;
        if (!map.isEmpty()) {
        }
        return null;
    }
}
