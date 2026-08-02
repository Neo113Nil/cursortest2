package ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data;

import defpackage.jgz;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import retrofit2.Response;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryfeedback.DeliveryFeedbackRequestDto;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0114, code lost:
    
        if (kotlinx.coroutines.a.i(r4 * 1000, r2) == r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00f9 -> B:11:0x00fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0114 -> B:11:0x00fb). Please report as a decompilation issue!!! */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(DeliveryFeedbackRequestDto deliveryFeedbackRequestDto, Continuation continuation) {
        FeedbackRemoteDataSource$1$1$emit$1 feedbackRemoteDataSource$1$1$emit$1;
        int i;
        String str;
        FeedbackRemoteDataSource$1$1$emit$1 feedbackRemoteDataSource$1$1$emit$12;
        int i2;
        DeliveryFeedbackRequestDto deliveryFeedbackRequestDto2;
        DeliveryFeedbackRequestDto deliveryFeedbackRequestDto3;
        String str2;
        int i3;
        Exception e;
        DeliveryFeedbackRequestDto deliveryFeedbackRequestDto4;
        Response response;
        if (continuation instanceof FeedbackRemoteDataSource$1$1$emit$1) {
            feedbackRemoteDataSource$1$1$emit$1 = (FeedbackRemoteDataSource$1$1$emit$1) continuation;
            int i4 = feedbackRemoteDataSource$1$1$emit$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                feedbackRemoteDataSource$1$1$emit$1.label = i4 - Integer.MIN_VALUE;
                Object obj = feedbackRemoteDataSource$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedbackRemoteDataSource$1$1$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String uuid = UUID.randomUUID().toString();
                    jgz.a.h("SendFeedbackInteractor");
                    jgz.f("Sending feedback for deliveryId " + deliveryFeedbackRequestDto.getDeliveryId() + " with score " + deliveryFeedbackRequestDto.getScore(), new Object[0]);
                    str = uuid;
                    feedbackRemoteDataSource$1$1$emit$12 = feedbackRemoteDataSource$1$1$emit$1;
                    i2 = 0;
                    deliveryFeedbackRequestDto2 = deliveryFeedbackRequestDto;
                    FeedbackApi feedbackApi = (FeedbackApi) this.a.a.get();
                    feedbackRemoteDataSource$1$1$emit$12.L$0 = deliveryFeedbackRequestDto2;
                    feedbackRemoteDataSource$1$1$emit$12.L$1 = str;
                    feedbackRemoteDataSource$1$1$emit$12.L$2 = null;
                    feedbackRemoteDataSource$1$1$emit$12.I$0 = i2;
                    feedbackRemoteDataSource$1$1$emit$12.label = 1;
                    obj = feedbackApi.a(str, deliveryFeedbackRequestDto2, feedbackRemoteDataSource$1$1$emit$12);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = feedbackRemoteDataSource$1$1$emit$1.I$0;
                    response = (Response) feedbackRemoteDataSource$1$1$emit$1.L$2;
                    str = (String) feedbackRemoteDataSource$1$1$emit$1.L$1;
                    deliveryFeedbackRequestDto4 = (DeliveryFeedbackRequestDto) feedbackRemoteDataSource$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                    int i5 = i3;
                    feedbackRemoteDataSource$1$1$emit$12 = feedbackRemoteDataSource$1$1$emit$1;
                    deliveryFeedbackRequestDto2 = deliveryFeedbackRequestDto4;
                    if ((response == null && response.a.w == 200) || i5 >= 3) {
                        return zy11.a;
                    }
                    i2 = i5;
                    try {
                    } catch (Exception e2) {
                        e = e2;
                        String str3 = str;
                        deliveryFeedbackRequestDto3 = deliveryFeedbackRequestDto2;
                        feedbackRemoteDataSource$1$1$emit$1 = feedbackRemoteDataSource$1$1$emit$12;
                        i3 = i2;
                        str2 = str3;
                        jgz.a.h("SendFeedbackInteractor");
                        jgz.c(e);
                        deliveryFeedbackRequestDto4 = deliveryFeedbackRequestDto3;
                        str = str2;
                        response = null;
                        jgz.a.h("SendFeedbackInteractor");
                        if (response == null) {
                        }
                        jgz.f("Send feedback result code: " + (response == null ? new Integer(response.a.w) : null), new Object[0]);
                        if (response != null) {
                        }
                        i3++;
                        feedbackRemoteDataSource$1$1$emit$1.L$0 = deliveryFeedbackRequestDto4;
                        feedbackRemoteDataSource$1$1$emit$1.L$1 = str;
                        feedbackRemoteDataSource$1$1$emit$1.L$2 = response;
                        feedbackRemoteDataSource$1$1$emit$1.I$0 = i3;
                        feedbackRemoteDataSource$1$1$emit$1.label = 2;
                    }
                    FeedbackApi feedbackApi2 = (FeedbackApi) this.a.a.get();
                    feedbackRemoteDataSource$1$1$emit$12.L$0 = deliveryFeedbackRequestDto2;
                    feedbackRemoteDataSource$1$1$emit$12.L$1 = str;
                    feedbackRemoteDataSource$1$1$emit$12.L$2 = null;
                    feedbackRemoteDataSource$1$1$emit$12.I$0 = i2;
                    feedbackRemoteDataSource$1$1$emit$12.label = 1;
                    obj = feedbackApi2.a(str, deliveryFeedbackRequestDto2, feedbackRemoteDataSource$1$1$emit$12);
                    if (obj != coroutineSingletons) {
                        String str4 = str;
                        deliveryFeedbackRequestDto3 = deliveryFeedbackRequestDto2;
                        feedbackRemoteDataSource$1$1$emit$1 = feedbackRemoteDataSource$1$1$emit$12;
                        i3 = i2;
                        str2 = str4;
                        deliveryFeedbackRequestDto4 = deliveryFeedbackRequestDto3;
                        str = str2;
                        response = (Response) obj;
                        jgz.a.h("SendFeedbackInteractor");
                        jgz.f("Send feedback result code: " + (response == null ? new Integer(response.a.w) : null), new Object[0]);
                        if (response != null || response.a.w != 200) {
                            i3++;
                            feedbackRemoteDataSource$1$1$emit$1.L$0 = deliveryFeedbackRequestDto4;
                            feedbackRemoteDataSource$1$1$emit$1.L$1 = str;
                            feedbackRemoteDataSource$1$1$emit$1.L$2 = response;
                            feedbackRemoteDataSource$1$1$emit$1.I$0 = i3;
                            feedbackRemoteDataSource$1$1$emit$1.label = 2;
                        }
                        int i52 = i3;
                        feedbackRemoteDataSource$1$1$emit$12 = feedbackRemoteDataSource$1$1$emit$1;
                        deliveryFeedbackRequestDto2 = deliveryFeedbackRequestDto4;
                        if (response == null) {
                        }
                        i2 = i52;
                        FeedbackApi feedbackApi22 = (FeedbackApi) this.a.a.get();
                        feedbackRemoteDataSource$1$1$emit$12.L$0 = deliveryFeedbackRequestDto2;
                        feedbackRemoteDataSource$1$1$emit$12.L$1 = str;
                        feedbackRemoteDataSource$1$1$emit$12.L$2 = null;
                        feedbackRemoteDataSource$1$1$emit$12.I$0 = i2;
                        feedbackRemoteDataSource$1$1$emit$12.label = 1;
                        obj = feedbackApi22.a(str, deliveryFeedbackRequestDto2, feedbackRemoteDataSource$1$1$emit$12);
                        if (obj != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                i3 = feedbackRemoteDataSource$1$1$emit$1.I$0;
                str2 = (String) feedbackRemoteDataSource$1$1$emit$1.L$1;
                deliveryFeedbackRequestDto3 = (DeliveryFeedbackRequestDto) feedbackRemoteDataSource$1$1$emit$1.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Exception e3) {
                    e = e3;
                    jgz.a.h("SendFeedbackInteractor");
                    jgz.c(e);
                    deliveryFeedbackRequestDto4 = deliveryFeedbackRequestDto3;
                    str = str2;
                    response = null;
                    jgz.a.h("SendFeedbackInteractor");
                    if (response == null) {
                    }
                    jgz.f("Send feedback result code: " + (response == null ? new Integer(response.a.w) : null), new Object[0]);
                    if (response != null) {
                    }
                    i3++;
                    feedbackRemoteDataSource$1$1$emit$1.L$0 = deliveryFeedbackRequestDto4;
                    feedbackRemoteDataSource$1$1$emit$1.L$1 = str;
                    feedbackRemoteDataSource$1$1$emit$1.L$2 = response;
                    feedbackRemoteDataSource$1$1$emit$1.I$0 = i3;
                    feedbackRemoteDataSource$1$1$emit$1.label = 2;
                }
                deliveryFeedbackRequestDto4 = deliveryFeedbackRequestDto3;
                str = str2;
                response = (Response) obj;
                jgz.a.h("SendFeedbackInteractor");
                if (response == null) {
                }
                jgz.f("Send feedback result code: " + (response == null ? new Integer(response.a.w) : null), new Object[0]);
                if (response != null) {
                }
                i3++;
                feedbackRemoteDataSource$1$1$emit$1.L$0 = deliveryFeedbackRequestDto4;
                feedbackRemoteDataSource$1$1$emit$1.L$1 = str;
                feedbackRemoteDataSource$1$1$emit$1.L$2 = response;
                feedbackRemoteDataSource$1$1$emit$1.I$0 = i3;
                feedbackRemoteDataSource$1$1$emit$1.label = 2;
            }
        }
        feedbackRemoteDataSource$1$1$emit$1 = new FeedbackRemoteDataSource$1$1$emit$1(this, continuation);
        Object obj2 = feedbackRemoteDataSource$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedbackRemoteDataSource$1$1$emit$1.label;
        if (i != 0) {
        }
    }
}
