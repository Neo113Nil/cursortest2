package ru.yandex.taxi.scooters.presentation.feedback.data;

import defpackage.avq;
import defpackage.cmt;
import defpackage.ny61;
import defpackage.utq;
import defpackage.xuq;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* loaded from: classes6.dex */
public final class a {
    public final ScootersFeedbackApi a;
    public final ru.yandex.taxi.scooters.presentation.feedback.data.mapper.a b;
    public final ru.yandex.taxi.scooters.data.a c;

    public a(ScootersFeedbackApi scootersFeedbackApi, ru.yandex.taxi.scooters.presentation.feedback.data.mapper.a aVar, ru.yandex.taxi.scooters.data.a aVar2) {
        this.a = scootersFeedbackApi;
        this.b = aVar;
        this.c = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, String str, ContinuationImpl continuationImpl) {
        ScootersFeedbackRepository$getScootersFeedbackSettings$1 scootersFeedbackRepository$getScootersFeedbackSettings$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen2;
        ScootersFeedbackApi scootersFeedbackApi;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen3;
        if (continuationImpl instanceof ScootersFeedbackRepository$getScootersFeedbackSettings$1) {
            scootersFeedbackRepository$getScootersFeedbackSettings$1 = (ScootersFeedbackRepository$getScootersFeedbackSettings$1) continuationImpl;
            int i2 = scootersFeedbackRepository$getScootersFeedbackSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFeedbackRepository$getScootersFeedbackSettings$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersFeedbackRepository$getScootersFeedbackSettings$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFeedbackRepository$getScootersFeedbackSettings$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersFeedbackRepository$getScootersFeedbackSettings$1.L$0 = feedbackSettingsParams$Screen;
                    scootersFeedbackRepository$getScootersFeedbackSettings$1.L$1 = str;
                    ScootersFeedbackApi scootersFeedbackApi2 = this.a;
                    scootersFeedbackRepository$getScootersFeedbackSettings$1.L$2 = scootersFeedbackApi2;
                    scootersFeedbackRepository$getScootersFeedbackSettings$1.label = 1;
                    Object a = this.c.a(false, scootersFeedbackRepository$getScootersFeedbackSettings$1);
                    if (a != coroutineSingletons) {
                        feedbackSettingsParams$Screen2 = feedbackSettingsParams$Screen;
                        scootersFeedbackApi = scootersFeedbackApi2;
                        obj = a;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    feedbackSettingsParams$Screen3 = (FeedbackSettingsParams$Screen) scootersFeedbackRepository$getScootersFeedbackSettings$1.L$0;
                    b.b(obj);
                    scootersFeedbackRepository$getScootersFeedbackSettings$1.L$0 = null;
                    scootersFeedbackRepository$getScootersFeedbackSettings$1.L$1 = null;
                    scootersFeedbackRepository$getScootersFeedbackSettings$1.L$2 = null;
                    scootersFeedbackRepository$getScootersFeedbackSettings$1.label = 3;
                    Object e = this.b.e((avq) obj, feedbackSettingsParams$Screen3, scootersFeedbackRepository$getScootersFeedbackSettings$1);
                    return e != coroutineSingletons ? coroutineSingletons : e;
                }
                scootersFeedbackApi = (ScootersFeedbackApi) scootersFeedbackRepository$getScootersFeedbackSettings$1.L$2;
                str = (String) scootersFeedbackRepository$getScootersFeedbackSettings$1.L$1;
                feedbackSettingsParams$Screen2 = (FeedbackSettingsParams$Screen) scootersFeedbackRepository$getScootersFeedbackSettings$1.L$0;
                b.b(obj);
                cmt<avq> a2 = scootersFeedbackApi.a((Map) obj, new xuq(feedbackSettingsParams$Screen2, str));
                scootersFeedbackRepository$getScootersFeedbackSettings$1.L$0 = feedbackSettingsParams$Screen2;
                scootersFeedbackRepository$getScootersFeedbackSettings$1.L$1 = null;
                scootersFeedbackRepository$getScootersFeedbackSettings$1.L$2 = null;
                scootersFeedbackRepository$getScootersFeedbackSettings$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.a(a2, null, scootersFeedbackRepository$getScootersFeedbackSettings$1);
                if (obj != coroutineSingletons) {
                    feedbackSettingsParams$Screen3 = feedbackSettingsParams$Screen2;
                    scootersFeedbackRepository$getScootersFeedbackSettings$1.L$0 = null;
                    scootersFeedbackRepository$getScootersFeedbackSettings$1.L$1 = null;
                    scootersFeedbackRepository$getScootersFeedbackSettings$1.L$2 = null;
                    scootersFeedbackRepository$getScootersFeedbackSettings$1.label = 3;
                    Object e2 = this.b.e((avq) obj, feedbackSettingsParams$Screen3, scootersFeedbackRepository$getScootersFeedbackSettings$1);
                    if (e2 != coroutineSingletons) {
                    }
                }
            }
        }
        scootersFeedbackRepository$getScootersFeedbackSettings$1 = new ScootersFeedbackRepository$getScootersFeedbackSettings$1(this, continuationImpl);
        obj = scootersFeedbackRepository$getScootersFeedbackSettings$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFeedbackRepository$getScootersFeedbackSettings$1.label;
        if (i != 0) {
        }
        cmt<avq> a22 = scootersFeedbackApi.a((Map) obj, new xuq(feedbackSettingsParams$Screen2, str));
        scootersFeedbackRepository$getScootersFeedbackSettings$1.L$0 = feedbackSettingsParams$Screen2;
        scootersFeedbackRepository$getScootersFeedbackSettings$1.L$1 = null;
        scootersFeedbackRepository$getScootersFeedbackSettings$1.L$2 = null;
        scootersFeedbackRepository$getScootersFeedbackSettings$1.label = 2;
        obj = ru.yandex.taxi.network.api.a.a(a22, null, scootersFeedbackRepository$getScootersFeedbackSettings$1);
        if (obj != coroutineSingletons) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00de, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r7, null, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, String str, String str2, int i, String str3, ArrayList arrayList, ArrayList arrayList2, ContinuationImpl continuationImpl) {
        ScootersFeedbackRepository$leaveFeedback$1 scootersFeedbackRepository$leaveFeedback$1;
        int i2;
        ScootersFeedbackApi scootersFeedbackApi;
        Collection collection;
        Collection collection2;
        String str4;
        Collection collection3;
        Collection collection4;
        if (continuationImpl instanceof ScootersFeedbackRepository$leaveFeedback$1) {
            scootersFeedbackRepository$leaveFeedback$1 = (ScootersFeedbackRepository$leaveFeedback$1) continuationImpl;
            int i3 = scootersFeedbackRepository$leaveFeedback$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersFeedbackRepository$leaveFeedback$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersFeedbackRepository$leaveFeedback$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = scootersFeedbackRepository$leaveFeedback$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    scootersFeedbackRepository$leaveFeedback$1.L$0 = feedbackSettingsParams$Screen;
                    scootersFeedbackRepository$leaveFeedback$1.L$1 = str;
                    scootersFeedbackRepository$leaveFeedback$1.L$2 = str2;
                    scootersFeedbackRepository$leaveFeedback$1.L$3 = str3;
                    scootersFeedbackRepository$leaveFeedback$1.L$4 = arrayList;
                    scootersFeedbackRepository$leaveFeedback$1.L$5 = arrayList2;
                    ScootersFeedbackApi scootersFeedbackApi2 = this.a;
                    scootersFeedbackRepository$leaveFeedback$1.L$6 = scootersFeedbackApi2;
                    scootersFeedbackRepository$leaveFeedback$1.I$0 = i;
                    scootersFeedbackRepository$leaveFeedback$1.label = 1;
                    Object a = this.c.a(false, scootersFeedbackRepository$leaveFeedback$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersFeedbackApi = scootersFeedbackApi2;
                        collection2 = arrayList;
                        collection = arrayList2;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11.a;
                }
                i = scootersFeedbackRepository$leaveFeedback$1.I$0;
                scootersFeedbackApi = (ScootersFeedbackApi) scootersFeedbackRepository$leaveFeedback$1.L$6;
                Collection collection5 = (List) scootersFeedbackRepository$leaveFeedback$1.L$5;
                Collection collection6 = (List) scootersFeedbackRepository$leaveFeedback$1.L$4;
                str3 = (String) scootersFeedbackRepository$leaveFeedback$1.L$3;
                str2 = (String) scootersFeedbackRepository$leaveFeedback$1.L$2;
                str = (String) scootersFeedbackRepository$leaveFeedback$1.L$1;
                feedbackSettingsParams$Screen = (FeedbackSettingsParams$Screen) scootersFeedbackRepository$leaveFeedback$1.L$0;
                b.b(obj);
                collection2 = collection6;
                collection = collection5;
                String str5 = str;
                FeedbackSettingsParams$Screen feedbackSettingsParams$Screen2 = feedbackSettingsParams$Screen;
                str4 = str3;
                int i4 = i;
                String str6 = str2;
                Map<String, String> map = (Map) obj;
                if (str4.length() == 0) {
                    str4 = null;
                }
                collection3 = collection2;
                if (collection3.isEmpty()) {
                    collection3 = null;
                }
                ArrayList arrayList3 = collection3;
                collection4 = collection;
                if (collection4.isEmpty()) {
                    collection4 = null;
                }
                cmt<zy11> b = scootersFeedbackApi.b(map, new utq(feedbackSettingsParams$Screen2, str5, str6, i4, str4, arrayList3, collection4));
                scootersFeedbackRepository$leaveFeedback$1.L$0 = null;
                scootersFeedbackRepository$leaveFeedback$1.L$1 = null;
                scootersFeedbackRepository$leaveFeedback$1.L$2 = null;
                scootersFeedbackRepository$leaveFeedback$1.L$3 = null;
                scootersFeedbackRepository$leaveFeedback$1.L$4 = null;
                scootersFeedbackRepository$leaveFeedback$1.L$5 = null;
                scootersFeedbackRepository$leaveFeedback$1.L$6 = null;
                scootersFeedbackRepository$leaveFeedback$1.I$0 = i4;
                scootersFeedbackRepository$leaveFeedback$1.label = 2;
            }
        }
        scootersFeedbackRepository$leaveFeedback$1 = new ScootersFeedbackRepository$leaveFeedback$1(this, continuationImpl);
        Object obj2 = scootersFeedbackRepository$leaveFeedback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = scootersFeedbackRepository$leaveFeedback$1.label;
        if (i2 != 0) {
        }
        String str52 = str;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen22 = feedbackSettingsParams$Screen;
        str4 = str3;
        int i42 = i;
        String str62 = str2;
        Map<String, String> map2 = (Map) obj2;
        if (str4.length() == 0) {
        }
        collection3 = collection2;
        if (collection3.isEmpty()) {
        }
        ArrayList arrayList32 = collection3;
        collection4 = collection;
        if (collection4.isEmpty()) {
        }
        cmt<zy11> b2 = scootersFeedbackApi.b(map2, new utq(feedbackSettingsParams$Screen22, str52, str62, i42, str4, arrayList32, collection4));
        scootersFeedbackRepository$leaveFeedback$1.L$0 = null;
        scootersFeedbackRepository$leaveFeedback$1.L$1 = null;
        scootersFeedbackRepository$leaveFeedback$1.L$2 = null;
        scootersFeedbackRepository$leaveFeedback$1.L$3 = null;
        scootersFeedbackRepository$leaveFeedback$1.L$4 = null;
        scootersFeedbackRepository$leaveFeedback$1.L$5 = null;
        scootersFeedbackRepository$leaveFeedback$1.L$6 = null;
        scootersFeedbackRepository$leaveFeedback$1.I$0 = i42;
        scootersFeedbackRepository$leaveFeedback$1.label = 2;
    }
}
