package com.squareup.cash.moneybot.backend.real.managers;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.moneybot.MoneybotMessageClientSend;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.protos.cash.kgoose.api.v3.ChatContext;
import com.squareup.protos.cash.kgoose.api.v3.InputMessage;
import com.squareup.protos.cash.kgoose.api.v3.ProfileConfig;
import com.squareup.protos.cash.kgoose.api.v3.PushMessagesRequest;
import com.squareup.protos.cash.kgoose.api.v3.PushMessagesResponse;
import com.squareup.protos.cash.kgoose.api.v3.ServiceProfileConfig;
import com.squareup.protos.cash.kgoose.api.v3.Source;
import com.squareup.protos.cash.kgoose.api.v3.Tenancy;
import com.squareup.protos.cash.kgoose.api.v3.cash.CashKgooseService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyIterator;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealChatManager$pushMessagesToKgoose$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ArrayList $messages;
    public final /* synthetic */ MusicViewKt$$ExternalSyntheticLambda6 $onError;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ String $suggestionsId;
    public ArrayList L$0;
    public ChatContext L$1;
    public ArrayList L$2;
    public EmptyList L$3;
    public CashKgooseService L$4;
    public int label;
    public final /* synthetic */ RealChatManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealChatManager$pushMessagesToKgoose$2(RealChatManager realChatManager, ArrayList arrayList, String str, String str2, MusicViewKt$$ExternalSyntheticLambda6 musicViewKt$$ExternalSyntheticLambda6, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realChatManager;
        this.$messages = arrayList;
        this.$suggestionsId = str;
        this.$sessionId = str2;
        this.$onError = musicViewKt$$ExternalSyntheticLambda6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealChatManager$pushMessagesToKgoose$2(this.this$0, this.$messages, this.$suggestionsId, this.$sessionId, this.$onError, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealChatManager$pushMessagesToKgoose$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0147, code lost:
    
        if (r2 == r1) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RealChatManager realChatManager;
        CashKgooseService cashKgooseService;
        Object obj2;
        EmptyList emptyList;
        ArrayList arrayList;
        ChatContext chatContext;
        ArrayList arrayList2;
        Object pushMessages;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ArrayList<InputMessage> arrayList3 = this.$messages;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            for (InputMessage inputMessage : arrayList3) {
                if (RealChatManager.isVisibleUserSentMessage(inputMessage) && inputMessage.id == null) {
                    inputMessage = InputMessage.copy$default(inputMessage, null, RealUuidGenerator.generate().toString(), null, 59);
                }
                arrayList4.add(inputMessage);
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (RealChatManager.isVisibleUserSentMessage((InputMessage) next)) {
                    arrayList5.add(next);
                }
            }
            Iterator it2 = arrayList5.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                realChatManager = this.this$0;
                if (!hasNext) {
                    break;
                }
                InputMessage inputMessage2 = (InputMessage) it2.next();
                RealMoneybotAnalyticsService realMoneybotAnalyticsService = realChatManager.analyticsService;
                realMoneybotAnalyticsService.analytics.track(new MoneybotMessageClientSend(realMoneybotAnalyticsService.chatId, this.$sessionId, inputMessage2.id), null);
            }
            cashKgooseService = realChatManager.kgooseService;
            ChatContext chatContext2 = new ChatContext(Source.SOURCE_MONEYBOT_CHAT, Tenancy.TENANCY_DEFAULT, this.$suggestionsId, realChatManager.renderContextProvider.getRenderContext(), 4176510);
            EmptyList emptyList2 = EmptyList.INSTANCE;
            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(emptyList2, 10));
            EmptyIterator.INSTANCE.getClass();
            RealMoneybotPreambleManager realMoneybotPreambleManager = realChatManager.moneybotPreambleManager;
            this.L$0 = arrayList4;
            this.L$1 = chatContext2;
            this.L$2 = arrayList6;
            this.L$3 = emptyList2;
            this.L$4 = cashKgooseService;
            this.label = 1;
            obj2 = realMoneybotPreambleManager.moneybotPreambleOverride.get(this);
            if (obj2 != coroutineSingletons) {
                emptyList = emptyList2;
                arrayList = arrayList4;
                chatContext = chatContext2;
                arrayList2 = arrayList6;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            pushMessages = obj;
            ApiResult apiResult = (ApiResult) pushMessages;
            boolean z = apiResult instanceof ApiResult.Failure;
            if (z) {
                this.$onError.invoke(apiResult);
            }
            if (apiResult instanceof ApiResult.Success) {
                String str = ((PushMessagesResponse) ((ApiResult.Success) apiResult).response).session_id;
                return str != null ? new ApiResult.Success(str) : new ApiResult.Failure.NetworkFailure(new IllegalArgumentException("Session ID is null"));
            }
            if (z) {
                return apiResult;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        cashKgooseService = this.L$4;
        EmptyList emptyList3 = this.L$3;
        ArrayList arrayList7 = this.L$2;
        ChatContext chatContext3 = this.L$1;
        ArrayList arrayList8 = this.L$0;
        SafeTrace.throwOnFailure(obj);
        emptyList = emptyList3;
        chatContext = chatContext3;
        arrayList = arrayList8;
        obj2 = obj;
        arrayList2 = arrayList7;
        EmptyList emptyList4 = EmptyList.INSTANCE;
        ByteString byteString = ByteString.EMPTY;
        ProfileConfig profileConfig = new ProfileConfig(new ProfileConfig.AbstractC0071ProfileConfig.ServiceProfile(new ServiceProfileConfig((String) obj2, arrayList2, emptyList, null, null, null, emptyList4, null, null, null, emptyList4, byteString)), byteString);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        PushMessagesRequest pushMessagesRequest = new PushMessagesRequest(this.$sessionId, arrayList, null, profileConfig, null, null, chatContext, null, null, null, null, emptyList4, emptyMap, emptyList4, byteString);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
        pushMessages = cashKgooseService.pushMessages(pushMessagesRequest, this);
    }
}
