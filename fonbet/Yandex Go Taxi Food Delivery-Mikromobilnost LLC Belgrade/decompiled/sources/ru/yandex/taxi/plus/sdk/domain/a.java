package ru.yandex.taxi.plus.sdk.domain;

import defpackage.ny61;
import defpackage.scc;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.plus.api.dto.AvailableFields;
import ru.yandex.taxi.plus.repository.c;

/* loaded from: classes9.dex */
public final class a {
    public final c a;
    public final ru.yandex.taxi.plus.sdk.cache.c b;

    public a(c cVar, ru.yandex.taxi.plus.sdk.cache.c cVar2) {
        this.a = cVar;
        this.b = cVar2;
    }

    public static Object b(a aVar, String str, ContinuationImpl continuationImpl, int i) {
        List g = scc.g(AvailableFields.MENU, AvailableFields.STATE, AvailableFields.PLAQUE);
        if ((i & 2) != 0) {
            str = aVar.b.c;
        }
        return aVar.a(str, g, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, List list, ContinuationImpl continuationImpl) {
        PlusInteractor$sdkData$1 plusInteractor$sdkData$1;
        int i;
        if (continuationImpl instanceof PlusInteractor$sdkData$1) {
            plusInteractor$sdkData$1 = (PlusInteractor$sdkData$1) continuationImpl;
            int i2 = plusInteractor$sdkData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusInteractor$sdkData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusInteractor$sdkData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusInteractor$sdkData$1.label;
                if (i != 0) {
                    b.b(obj);
                    plusInteractor$sdkData$1.L$0 = null;
                    plusInteractor$sdkData$1.L$1 = null;
                    plusInteractor$sdkData$1.label = 1;
                    Object c = this.a.c(str, list, plusInteractor$sdkData$1);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        plusInteractor$sdkData$1 = new PlusInteractor$sdkData$1(this, continuationImpl);
        Object obj2 = plusInteractor$sdkData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusInteractor$sdkData$1.label;
        if (i != 0) {
        }
    }
}
