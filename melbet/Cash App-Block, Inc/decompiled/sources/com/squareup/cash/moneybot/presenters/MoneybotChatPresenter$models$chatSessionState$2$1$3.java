package com.squareup.cash.moneybot.presenters;

import androidx.compose.runtime.ProduceStateScope;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.moneybot.backend.api.managers.ChatSession;
import com.squareup.cash.moneybot.backend.api.model.chat.Chat;
import com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.protos.cash.kgoose.api.v3.ChatSessionStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneybotChatPresenter$models$chatSessionState$2$1$3 extends SuspendLambda implements Function2 {
    public ProduceStateScope $$this$produceState;
    public final /* synthetic */ int $r8$classId = 0;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ MoneybotChatPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$models$chatSessionState$2$1$3(ProduceStateScope produceStateScope, MoneybotChatPresenter moneybotChatPresenter, Continuation continuation) {
        super(2, continuation);
        this.$$this$produceState = produceStateScope;
        this.this$0 = moneybotChatPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MoneybotChatPresenter moneybotChatPresenter = this.this$0;
        switch (i) {
            case 0:
                MoneybotChatPresenter$models$chatSessionState$2$1$3 moneybotChatPresenter$models$chatSessionState$2$1$3 = new MoneybotChatPresenter$models$chatSessionState$2$1$3(this.$$this$produceState, moneybotChatPresenter, continuation);
                moneybotChatPresenter$models$chatSessionState$2$1$3.L$0 = obj;
                return moneybotChatPresenter$models$chatSessionState$2$1$3;
            default:
                MoneybotChatPresenter$models$chatSessionState$2$1$3 moneybotChatPresenter$models$chatSessionState$2$1$32 = new MoneybotChatPresenter$models$chatSessionState$2$1$3(moneybotChatPresenter, continuation);
                moneybotChatPresenter$models$chatSessionState$2$1$32.L$0 = obj;
                return moneybotChatPresenter$models$chatSessionState$2$1$32;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((MoneybotChatPresenter$models$chatSessionState$2$1$3) create((ChatSession) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((MoneybotChatPresenter$models$chatSessionState$2$1$3) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0199 A[LOOP:6: B:100:0x0193->B:102:0x0199, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d7 A[LOOP:8: B:116:0x01d1->B:118:0x01d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a A[LOOP:2: B:64:0x0114->B:66:0x011a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0154  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MoneybotChatPresenter.TokenStreamingState tokenStreamingState;
        Iterable flatten;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        Set set;
        Iterator it5;
        MoneybotChatPresenter.ToolRequestState toolRequestState;
        List list;
        Chat chat;
        List list2;
        Object withContext;
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                ProduceStateScope produceStateScope = this.$$this$produceState;
                ChatSession chatSession = (ChatSession) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z = chatSession instanceof ChatSession.Ok;
                    if (z && (chat = ((ChatSession.Ok) chatSession).chat) != null && (list2 = chat.messages) != null) {
                        ArrayList flatten2 = CollectionsKt__IterablesKt.flatten(list2);
                        if (!flatten2.isEmpty()) {
                            Iterator it6 = flatten2.iterator();
                            while (it6.hasNext()) {
                                Message message = (Message) it6.next();
                                if ((message instanceof Message.TextMessage) && !((Message.TextMessage) message).isFinal) {
                                    tokenStreamingState = MoneybotChatPresenter.TokenStreamingState.InProgress;
                                    MoneybotChatPresenter.ChatSessionState chatSessionState = (MoneybotChatPresenter.ChatSessionState) produceStateScope.getValue();
                                    Chat chat2 = chatSession.getChat();
                                    MoneybotChatPresenter.ToolRequestState toolRequestState2 = ((MoneybotChatPresenter.ChatSessionState) produceStateScope.getValue()).toolRequestInProgress;
                                    flatten = (chat2 != null || (list = chat2.messages) == null) ? null : CollectionsKt__IterablesKt.flatten(list);
                                    if (flatten == null) {
                                        flatten = EmptyList.INSTANCE;
                                    }
                                    Iterable iterable = flatten;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj2 : iterable) {
                                        if (obj2 instanceof Message.ToolRequest) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((Message.ToolRequest) it.next()).requestId);
                                    }
                                    Set set2 = CollectionsKt.toSet(arrayList2);
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj3 : iterable) {
                                        if (obj3 instanceof Message.ToolResponse) {
                                            arrayList3.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        List list3 = ((Message.ToolResponse) next).results;
                                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                            Iterator it7 = list3.iterator();
                                            while (true) {
                                                if (!it7.hasNext()) {
                                                    break;
                                                }
                                                if (((Message.ToolResponse.UserContent) it7.next()) instanceof ClientRenderable) {
                                                    arrayList4.add(next);
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                                    it3 = arrayList4.iterator();
                                    while (it3.hasNext()) {
                                        arrayList5.add(((Message.ToolResponse) it3.next()).requestId);
                                    }
                                    Set set3 = CollectionsKt.toSet(arrayList5);
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj4 : iterable) {
                                        if (obj4 instanceof Message.ToolResponse) {
                                            arrayList6.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
                                    it4 = arrayList6.iterator();
                                    while (it4.hasNext()) {
                                        arrayList7.add(((Message.ToolResponse) it4.next()).requestId);
                                    }
                                    Set set4 = CollectionsKt.toSet(arrayList7);
                                    set = set2;
                                    if ((set instanceof Collection) || !set.isEmpty()) {
                                        it5 = set.iterator();
                                        while (it5.hasNext()) {
                                            if (!set4.contains((String) it5.next())) {
                                                toolRequestState = MoneybotChatPresenter.ToolRequestState.InProgress;
                                                chatSessionState.getClass();
                                                produceStateScope.setValue(new MoneybotChatPresenter.ChatSessionState(chatSession, tokenStreamingState, toolRequestState));
                                                if (((MoneybotChatPresenter.ChatSessionState) produceStateScope.getValue()).toolRequestInProgress == MoneybotChatPresenter.ToolRequestState.Complete) {
                                                    Duration.Companion companion = Duration.Companion;
                                                    long duration = DurationKt.toDuration(1, DurationUnit.SECONDS);
                                                    this.L$0 = null;
                                                    this.label = 1;
                                                    if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons) {
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    toolRequestState = (toolRequestState2 == MoneybotChatPresenter.ToolRequestState.InProgress || set3.isEmpty()) ? null : MoneybotChatPresenter.ToolRequestState.Complete;
                                    chatSessionState.getClass();
                                    produceStateScope.setValue(new MoneybotChatPresenter.ChatSessionState(chatSession, tokenStreamingState, toolRequestState));
                                    if (((MoneybotChatPresenter.ChatSessionState) produceStateScope.getValue()).toolRequestInProgress == MoneybotChatPresenter.ToolRequestState.Complete) {
                                    }
                                }
                            }
                        }
                    }
                    if (z) {
                        Chat chat3 = ((ChatSession.Ok) chatSession).chat;
                        if ((chat3 != null ? chat3.status : null) == ChatSessionStatus.CHAT_SESSION_STATUS_IDLE) {
                            tokenStreamingState = null;
                            MoneybotChatPresenter.ChatSessionState chatSessionState2 = (MoneybotChatPresenter.ChatSessionState) produceStateScope.getValue();
                            Chat chat22 = chatSession.getChat();
                            MoneybotChatPresenter.ToolRequestState toolRequestState22 = ((MoneybotChatPresenter.ChatSessionState) produceStateScope.getValue()).toolRequestInProgress;
                            if (chat22 != null) {
                            }
                            if (flatten == null) {
                            }
                            Iterable iterable2 = flatten;
                            ArrayList arrayList8 = new ArrayList();
                            while (r11.hasNext()) {
                            }
                            ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList8, 10));
                            it = arrayList8.iterator();
                            while (it.hasNext()) {
                            }
                            Set set22 = CollectionsKt.toSet(arrayList22);
                            ArrayList arrayList32 = new ArrayList();
                            while (r13.hasNext()) {
                            }
                            ArrayList arrayList42 = new ArrayList();
                            it2 = arrayList32.iterator();
                            while (it2.hasNext()) {
                            }
                            ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList42, 10));
                            it3 = arrayList42.iterator();
                            while (it3.hasNext()) {
                            }
                            Set set32 = CollectionsKt.toSet(arrayList52);
                            ArrayList arrayList62 = new ArrayList();
                            while (r8.hasNext()) {
                            }
                            ArrayList arrayList72 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList62, 10));
                            it4 = arrayList62.iterator();
                            while (it4.hasNext()) {
                            }
                            Set set42 = CollectionsKt.toSet(arrayList72);
                            set = set22;
                            if (set instanceof Collection) {
                            }
                            it5 = set.iterator();
                            while (it5.hasNext()) {
                            }
                            if (toolRequestState22 == MoneybotChatPresenter.ToolRequestState.InProgress) {
                            }
                            chatSessionState2.getClass();
                            produceStateScope.setValue(new MoneybotChatPresenter.ChatSessionState(chatSession, tokenStreamingState, toolRequestState));
                            if (((MoneybotChatPresenter.ChatSessionState) produceStateScope.getValue()).toolRequestInProgress == MoneybotChatPresenter.ToolRequestState.Complete) {
                            }
                        }
                    }
                    tokenStreamingState = (z && ((MoneybotChatPresenter.ChatSessionState) produceStateScope.getValue()).tokenStreamingState == MoneybotChatPresenter.TokenStreamingState.InProgress) ? MoneybotChatPresenter.TokenStreamingState.Complete : ((MoneybotChatPresenter.ChatSessionState) produceStateScope.getValue()).tokenStreamingState;
                    MoneybotChatPresenter.ChatSessionState chatSessionState22 = (MoneybotChatPresenter.ChatSessionState) produceStateScope.getValue();
                    Chat chat222 = chatSession.getChat();
                    MoneybotChatPresenter.ToolRequestState toolRequestState222 = ((MoneybotChatPresenter.ChatSessionState) produceStateScope.getValue()).toolRequestInProgress;
                    if (chat222 != null) {
                    }
                    if (flatten == null) {
                    }
                    Iterable iterable22 = flatten;
                    ArrayList arrayList82 = new ArrayList();
                    while (r11.hasNext()) {
                    }
                    ArrayList arrayList222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList82, 10));
                    it = arrayList82.iterator();
                    while (it.hasNext()) {
                    }
                    Set set222 = CollectionsKt.toSet(arrayList222);
                    ArrayList arrayList322 = new ArrayList();
                    while (r13.hasNext()) {
                    }
                    ArrayList arrayList422 = new ArrayList();
                    it2 = arrayList322.iterator();
                    while (it2.hasNext()) {
                    }
                    ArrayList arrayList522 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList422, 10));
                    it3 = arrayList422.iterator();
                    while (it3.hasNext()) {
                    }
                    Set set322 = CollectionsKt.toSet(arrayList522);
                    ArrayList arrayList622 = new ArrayList();
                    while (r8.hasNext()) {
                    }
                    ArrayList arrayList722 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList622, 10));
                    it4 = arrayList622.iterator();
                    while (it4.hasNext()) {
                    }
                    Set set422 = CollectionsKt.toSet(arrayList722);
                    set = set222;
                    if (set instanceof Collection) {
                    }
                    it5 = set.iterator();
                    while (it5.hasNext()) {
                    }
                    if (toolRequestState222 == MoneybotChatPresenter.ToolRequestState.InProgress) {
                    }
                    chatSessionState22.getClass();
                    produceStateScope.setValue(new MoneybotChatPresenter.ChatSessionState(chatSession, tokenStreamingState, toolRequestState));
                    if (((MoneybotChatPresenter.ChatSessionState) produceStateScope.getValue()).toolRequestInProgress == MoneybotChatPresenter.ToolRequestState.Complete) {
                    }
                } else if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                if (((MoneybotChatPresenter.ChatSessionState) produceStateScope.getValue()).toolRequestInProgress != MoneybotChatPresenter.ToolRequestState.InProgress) {
                    MoneybotChatPresenter.ChatSessionState chatSessionState3 = (MoneybotChatPresenter.ChatSessionState) produceStateScope.getValue();
                    ChatSession chatSession2 = chatSessionState3.session;
                    MoneybotChatPresenter.TokenStreamingState tokenStreamingState2 = chatSessionState3.tokenStreamingState;
                    chatSession2.getClass();
                    produceStateScope.setValue(new MoneybotChatPresenter.ChatSessionState(chatSession2, tokenStreamingState2, null));
                }
                break;
            default:
                ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MoneybotChatPresenter moneybotChatPresenter = this.this$0;
                    CoroutineContext coroutineContext = moneybotChatPresenter.ioContext;
                    MoneybotChatPresenter$models$3$1 moneybotChatPresenter$models$3$1 = new MoneybotChatPresenter$models$3$1(moneybotChatPresenter, continuation, 3);
                    this.L$0 = null;
                    this.$$this$produceState = produceStateScope2;
                    this.label = 1;
                    withContext = JobKt.withContext(coroutineContext, moneybotChatPresenter$models$3$1, this);
                    if (withContext == coroutineSingletons2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    produceStateScope2 = this.$$this$produceState;
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                produceStateScope2.setValue(withContext);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$models$chatSessionState$2$1$3(MoneybotChatPresenter moneybotChatPresenter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = moneybotChatPresenter;
    }
}
