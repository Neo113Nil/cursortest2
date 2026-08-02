package ru.yandex.taxi.scooters.data;

import defpackage.bmu;
import defpackage.cmt;
import defpackage.ny61;
import defpackage.zuo0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* loaded from: classes6.dex */
public final class o {
    public final ScootersHistoryApi a;
    public final ru.yandex.taxi.scooters.data.mapper.d b;
    public final a c;

    public o(ScootersHistoryApi scootersHistoryApi, ru.yandex.taxi.scooters.data.mapper.d dVar, a aVar) {
        this.a = scootersHistoryApi;
        this.b = dVar;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zuo0 zuo0Var, FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, ContinuationImpl continuationImpl) {
        ScootersHistoryRepository$getFinishInfo$1 scootersHistoryRepository$getFinishInfo$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj;
        ScootersHistoryApi scootersHistoryApi;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen2;
        ru.yandex.taxi.scooters.data.mapper.d dVar;
        zuo0 zuo0Var2;
        Object a;
        zuo0 zuo0Var3;
        ru.yandex.taxi.scooters.data.mapper.d dVar2;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen3;
        if (continuationImpl instanceof ScootersHistoryRepository$getFinishInfo$1) {
            scootersHistoryRepository$getFinishInfo$1 = (ScootersHistoryRepository$getFinishInfo$1) continuationImpl;
            int i2 = scootersHistoryRepository$getFinishInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersHistoryRepository$getFinishInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersHistoryRepository$getFinishInfo$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersHistoryRepository$getFinishInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    scootersHistoryRepository$getFinishInfo$1.L$0 = zuo0Var;
                    scootersHistoryRepository$getFinishInfo$1.L$1 = feedbackSettingsParams$Screen;
                    ru.yandex.taxi.scooters.data.mapper.d dVar3 = this.b;
                    scootersHistoryRepository$getFinishInfo$1.L$2 = dVar3;
                    scootersHistoryRepository$getFinishInfo$1.L$3 = zuo0Var;
                    ScootersHistoryApi scootersHistoryApi2 = this.a;
                    scootersHistoryRepository$getFinishInfo$1.L$4 = scootersHistoryApi2;
                    scootersHistoryRepository$getFinishInfo$1.label = 1;
                    Object a2 = this.c.a(false, scootersHistoryRepository$getFinishInfo$1);
                    if (a2 != coroutineSingletons) {
                        obj = a2;
                        scootersHistoryApi = scootersHistoryApi2;
                        feedbackSettingsParams$Screen2 = feedbackSettingsParams$Screen;
                        dVar = dVar3;
                        zuo0Var2 = zuo0Var;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    zuo0Var3 = (zuo0) scootersHistoryRepository$getFinishInfo$1.L$3;
                    dVar2 = (ru.yandex.taxi.scooters.data.mapper.d) scootersHistoryRepository$getFinishInfo$1.L$2;
                    feedbackSettingsParams$Screen3 = (FeedbackSettingsParams$Screen) scootersHistoryRepository$getFinishInfo$1.L$1;
                    kotlin.b.b(obj2);
                    scootersHistoryRepository$getFinishInfo$1.L$0 = null;
                    scootersHistoryRepository$getFinishInfo$1.L$1 = null;
                    scootersHistoryRepository$getFinishInfo$1.L$2 = null;
                    scootersHistoryRepository$getFinishInfo$1.L$3 = null;
                    scootersHistoryRepository$getFinishInfo$1.label = 3;
                    Object c = dVar2.c(zuo0Var3, (bmu) obj2, feedbackSettingsParams$Screen3, scootersHistoryRepository$getFinishInfo$1);
                    return c != coroutineSingletons ? coroutineSingletons : c;
                }
                scootersHistoryApi = (ScootersHistoryApi) scootersHistoryRepository$getFinishInfo$1.L$4;
                zuo0 zuo0Var4 = (zuo0) scootersHistoryRepository$getFinishInfo$1.L$3;
                dVar = (ru.yandex.taxi.scooters.data.mapper.d) scootersHistoryRepository$getFinishInfo$1.L$2;
                feedbackSettingsParams$Screen2 = (FeedbackSettingsParams$Screen) scootersHistoryRepository$getFinishInfo$1.L$1;
                zuo0 zuo0Var5 = (zuo0) scootersHistoryRepository$getFinishInfo$1.L$0;
                kotlin.b.b(obj2);
                zuo0Var2 = zuo0Var4;
                zuo0Var = zuo0Var5;
                obj = obj2;
                cmt<bmu> a3 = scootersHistoryApi.a((Map) obj, zuo0Var.getSessionId());
                scootersHistoryRepository$getFinishInfo$1.L$0 = null;
                scootersHistoryRepository$getFinishInfo$1.L$1 = feedbackSettingsParams$Screen2;
                scootersHistoryRepository$getFinishInfo$1.L$2 = dVar;
                scootersHistoryRepository$getFinishInfo$1.L$3 = zuo0Var2;
                scootersHistoryRepository$getFinishInfo$1.L$4 = null;
                scootersHistoryRepository$getFinishInfo$1.label = 2;
                a = ru.yandex.taxi.network.api.a.a(a3, null, scootersHistoryRepository$getFinishInfo$1);
                if (a != coroutineSingletons) {
                    zuo0 zuo0Var6 = zuo0Var2;
                    obj2 = a;
                    zuo0Var3 = zuo0Var6;
                    dVar2 = dVar;
                    feedbackSettingsParams$Screen3 = feedbackSettingsParams$Screen2;
                    scootersHistoryRepository$getFinishInfo$1.L$0 = null;
                    scootersHistoryRepository$getFinishInfo$1.L$1 = null;
                    scootersHistoryRepository$getFinishInfo$1.L$2 = null;
                    scootersHistoryRepository$getFinishInfo$1.L$3 = null;
                    scootersHistoryRepository$getFinishInfo$1.label = 3;
                    Object c2 = dVar2.c(zuo0Var3, (bmu) obj2, feedbackSettingsParams$Screen3, scootersHistoryRepository$getFinishInfo$1);
                    if (c2 != coroutineSingletons) {
                    }
                }
            }
        }
        scootersHistoryRepository$getFinishInfo$1 = new ScootersHistoryRepository$getFinishInfo$1(this, continuationImpl);
        Object obj22 = scootersHistoryRepository$getFinishInfo$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersHistoryRepository$getFinishInfo$1.label;
        if (i != 0) {
        }
        cmt<bmu> a32 = scootersHistoryApi.a((Map) obj, zuo0Var.getSessionId());
        scootersHistoryRepository$getFinishInfo$1.L$0 = null;
        scootersHistoryRepository$getFinishInfo$1.L$1 = feedbackSettingsParams$Screen2;
        scootersHistoryRepository$getFinishInfo$1.L$2 = dVar;
        scootersHistoryRepository$getFinishInfo$1.L$3 = zuo0Var2;
        scootersHistoryRepository$getFinishInfo$1.L$4 = null;
        scootersHistoryRepository$getFinishInfo$1.label = 2;
        a = ru.yandex.taxi.network.api.a.a(a32, null, scootersHistoryRepository$getFinishInfo$1);
        if (a != coroutineSingletons) {
        }
    }
}
