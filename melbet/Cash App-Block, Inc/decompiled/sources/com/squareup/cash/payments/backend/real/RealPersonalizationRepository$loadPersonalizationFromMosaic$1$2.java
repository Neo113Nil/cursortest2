package com.squareup.cash.payments.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.db2.ReactionConfig;
import com.squareup.cash.mosaic.personalization.api.v1.Personalization;
import com.squareup.cash.mosaic.personalization.api.v2.GetEntityActivityItemResponse;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.payments.backend.api.RemotePersonalizedPaymentLoadingState;
import com.squareup.cash.reactions.api.ReactionsData;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Reaction;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.PaymentHistoryReactions;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ String $token;
    public /* synthetic */ ZiplineHistoryDataJavaScripter L$0;
    public /* synthetic */ ReactionConfig L$1;
    public PaymentHistoryInputsRow L$4;
    public int label;
    public final /* synthetic */ RealPersonalizationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2(RealPersonalizationRepository realPersonalizationRepository, String str, Continuation continuation) {
        super(3, continuation);
        this.this$0 = realPersonalizationRepository;
        this.$token = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2 realPersonalizationRepository$loadPersonalizationFromMosaic$1$2 = new RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2(this.this$0, this.$token, (Continuation) obj3);
        realPersonalizationRepository$loadPersonalizationFromMosaic$1$2.L$0 = (ZiplineHistoryDataJavaScripter) obj;
        realPersonalizationRepository$loadPersonalizationFromMosaic$1$2.L$1 = (ReactionConfig) obj2;
        return realPersonalizationRepository$loadPersonalizationFromMosaic$1$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0099, code lost:
    
        if (r0 == r8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x009b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0046, code lost:
    
        if (r1 == r8) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ab  */
    /* JADX WARN: Type inference failed for: r3v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object withContext;
        PaymentHistoryInputsRow value;
        Object withContext2;
        PaymentHistoryInputsRow paymentHistoryInputsRow;
        PaymentHistoryData paymentHistoryData;
        UiCustomer access$getSenderInformation;
        Image image;
        ?? r3;
        List list;
        Iterator it;
        PaymentHistoryReactions paymentHistoryReactions;
        PaymentHistoryReactions paymentHistoryReactions2;
        List<Reaction> list2;
        UiPayment uiPayment;
        UiPayment uiPayment2;
        ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = this.L$0;
        ReactionConfig reactionConfig = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = this.$token;
        RealPersonalizationRepository realPersonalizationRepository = this.this$0;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                CoroutineContext coroutineContext = realPersonalizationRepository.ioDispatcher;
                OverlayKt$Overlay$1$1$1$1$1 overlayKt$Overlay$1$1$1$1$1 = new OverlayKt$Overlay$1$1$1$1$1(realPersonalizationRepository, str, null, 15);
                this.L$0 = ziplineHistoryDataJavaScripter;
                this.L$1 = reactionConfig;
                this.label = 1;
                withContext = JobKt.withContext(coroutineContext, overlayKt$Overlay$1$1$1$1$1, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    paymentHistoryInputsRow = this.L$4;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        value = paymentHistoryInputsRow;
                        withContext2 = obj;
                        paymentHistoryData = (PaymentHistoryData) withContext2;
                    } catch (AssertionError | Exception unused) {
                        value = paymentHistoryInputsRow;
                        paymentHistoryData = null;
                        UiCustomer access$getSenderInformation2 = RealPersonalizationRepository.access$getSenderInformation(realPersonalizationRepository, value);
                        if (access$getSenderInformation2 != null) {
                        }
                        if (r1 == null) {
                        }
                        UiCustomer access$getSenderInformation3 = RealPersonalizationRepository.access$getSenderInformation(realPersonalizationRepository, value);
                        if (access$getSenderInformation3 != null) {
                        }
                        access$getSenderInformation = RealPersonalizationRepository.access$getSenderInformation(realPersonalizationRepository, value);
                        if (access$getSenderInformation != null) {
                        }
                        if (value != null) {
                        }
                        if (paymentHistoryData != null) {
                        }
                        if (paymentHistoryData != null) {
                        }
                        if (paymentHistoryData != null) {
                        }
                        boolean z = ((value != null || (uiPayment = value.payment) == null) ? null : uiPayment.role) == Role.SENDER;
                        if (paymentHistoryData != null) {
                        }
                        r3 = EmptyList.INSTANCE;
                        if (reactionConfig != null) {
                        }
                        if (list == null) {
                        }
                        List list3 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                        }
                        if (paymentHistoryData != null) {
                        }
                        List list4 = EmptyList.INSTANCE;
                        return new RemotePersonalizedPaymentLoadingState.LocallyStoredPersonalizedPayment(r14, r15, image, r17, r18, r19, z, new ReactionsData(r3, list4, arrayList), r22);
                    }
                    UiCustomer access$getSenderInformation22 = RealPersonalizationRepository.access$getSenderInformation(realPersonalizationRepository, value);
                    String str2 = access$getSenderInformation22 != null ? access$getSenderInformation22.id : null;
                    String str3 = str2 == null ? "" : str2;
                    UiCustomer access$getSenderInformation32 = RealPersonalizationRepository.access$getSenderInformation(realPersonalizationRepository, value);
                    String str4 = access$getSenderInformation32 != null ? access$getSenderInformation32.full_name : null;
                    access$getSenderInformation = RealPersonalizationRepository.access$getSenderInformation(realPersonalizationRepository, value);
                    if (access$getSenderInformation != null) {
                        Image image2 = access$getSenderInformation.photo;
                        if (image2 == null) {
                            String str5 = access$getSenderInformation.photo_url;
                            image2 = str5 != null ? new Image(str5, str5, 4) : null;
                        }
                        image = image2;
                    } else {
                        image = null;
                    }
                    Money money = (value != null || (uiPayment2 = value.payment) == null) ? null : uiPayment2.amount;
                    Personalization personalization = paymentHistoryData != null ? paymentHistoryData.personalization : null;
                    com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization2 = paymentHistoryData != null ? paymentHistoryData.personalization_payload : null;
                    String str6 = paymentHistoryData != null ? paymentHistoryData.notes : null;
                    boolean z2 = ((value != null || (uiPayment = value.payment) == null) ? null : uiPayment.role) == Role.SENDER;
                    if (paymentHistoryData != null || (paymentHistoryReactions2 = paymentHistoryData.reactions) == null || (list2 = paymentHistoryReactions2.available_reactions) == null) {
                        r3 = EmptyList.INSTANCE;
                    } else {
                        List<Reaction> list5 = list2;
                        r3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            String str7 = ((Reaction) it2.next()).data;
                            if (str7 == null) {
                                str7 = "";
                            }
                            r3.add(str7);
                        }
                    }
                    list = reactionConfig != null ? reactionConfig.extendedReactions : null;
                    if (list == null) {
                        list = EmptyList.INSTANCE;
                    }
                    List list32 = list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list32, 10));
                    it = list32.iterator();
                    while (it.hasNext()) {
                        String str8 = ((Reaction) it.next()).data;
                        if (str8 == null) {
                            str8 = "";
                        }
                        arrayList2.add(str8);
                    }
                    if (paymentHistoryData != null || (paymentHistoryReactions = paymentHistoryData.reactions) == null || (list4 = paymentHistoryReactions.existing_reactions) == null) {
                        List list42 = EmptyList.INSTANCE;
                    }
                    return new RemotePersonalizedPaymentLoadingState.LocallyStoredPersonalizedPayment(str3, str4, image, money, personalization, personalization2, z2, new ReactionsData(r3, list42, arrayList2), str6);
                }
                SafeTrace.throwOnFailure(obj);
                withContext = obj;
            }
            ApiResult apiResult = (ApiResult) withContext;
            if (apiResult instanceof ApiResult.Success) {
                try {
                    JsonAdapter adapter = _MoshiKotlinExtensionsKt.adapter(realPersonalizationRepository.moshi, Reflection.typeOf(ActivityRow.class));
                    String str9 = ((GetEntityActivityItemResponse) ((ApiResult.Success) apiResult).response).activity_row_json;
                    if (str9 == null) {
                        str9 = "";
                    }
                    ActivityRow activityRow = (ActivityRow) adapter.fromJson(str9);
                    if (activityRow != null) {
                        ActivityRow.Body body = activityRow.body;
                        ActivityRow.Body.PaymentHistoryInputsRow paymentHistoryInputsRow2 = body instanceof ActivityRow.Body.PaymentHistoryInputsRow ? (ActivityRow.Body.PaymentHistoryInputsRow) body : null;
                        value = paymentHistoryInputsRow2 != null ? paymentHistoryInputsRow2.getValue() : null;
                        try {
                            CoroutineContext coroutineContext2 = realPersonalizationRepository.jsDispatcher;
                            RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2$paymentHistoryData$1 realPersonalizationRepository$loadPersonalizationFromMosaic$1$2$paymentHistoryData$1 = new RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2$paymentHistoryData$1(ziplineHistoryDataJavaScripter, value, str, null, 0);
                            this.L$0 = null;
                            this.L$1 = reactionConfig;
                            this.L$4 = value;
                            this.label = 2;
                            withContext2 = JobKt.withContext(coroutineContext2, realPersonalizationRepository$loadPersonalizationFromMosaic$1$2$paymentHistoryData$1, this);
                        } catch (AssertionError | Exception unused2) {
                            paymentHistoryInputsRow = value;
                            value = paymentHistoryInputsRow;
                            paymentHistoryData = null;
                            UiCustomer access$getSenderInformation222 = RealPersonalizationRepository.access$getSenderInformation(realPersonalizationRepository, value);
                            if (access$getSenderInformation222 != null) {
                            }
                            if (str2 == null) {
                            }
                            UiCustomer access$getSenderInformation322 = RealPersonalizationRepository.access$getSenderInformation(realPersonalizationRepository, value);
                            if (access$getSenderInformation322 != null) {
                            }
                            access$getSenderInformation = RealPersonalizationRepository.access$getSenderInformation(realPersonalizationRepository, value);
                            if (access$getSenderInformation != null) {
                            }
                            if (value != null) {
                            }
                            if (paymentHistoryData != null) {
                            }
                            if (paymentHistoryData != null) {
                            }
                            if (paymentHistoryData != null) {
                            }
                            boolean z22 = ((value != null || (uiPayment = value.payment) == null) ? null : uiPayment.role) == Role.SENDER;
                            if (paymentHistoryData != null) {
                            }
                            r3 = EmptyList.INSTANCE;
                            if (reactionConfig != null) {
                            }
                            if (list == null) {
                            }
                            List list322 = list;
                            ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list322, 10));
                            it = list322.iterator();
                            while (it.hasNext()) {
                            }
                            if (paymentHistoryData != null) {
                            }
                            List list422 = EmptyList.INSTANCE;
                            return new RemotePersonalizedPaymentLoadingState.LocallyStoredPersonalizedPayment(str3, str4, image, money, personalization, personalization2, z22, new ReactionsData(r3, list422, arrayList22), str6);
                        }
                    }
                } catch (Exception unused3) {
                }
            }
            return RemotePersonalizedPaymentLoadingState.ErrorLoadingPersonalizedPayment.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
