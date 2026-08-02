package com.squareup.cash.moneybot.backend.real.managers;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.moneybot.backend.api.CachedChat;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.managers.ChatSession;
import com.squareup.cash.moneybot.backend.api.managers.ChatSessionError;
import com.squareup.cash.moneybot.backend.api.model.chat.Chat;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealChatSessionManager {
    public final ChatManager chatManager;
    public final SharedFlowImpl chatSession;
    public final AtomicBoolean isSubscribed;
    public final StateFlowImpl sessionId;

    public RealChatSessionManager(String str, ChatManager chatManager) {
        Chat chat;
        this.chatManager = chatManager;
        this.sessionId = FlowKt.MutableStateFlow(str);
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2);
        if (str != null) {
            CachedChat cachedChat = ((RealChatManager) chatManager).getCachedChat(str);
            if (cachedChat != null && (chat = cachedChat.chat) != null) {
                StateFlowKt.emitOrThrow(MutableSharedFlow$default, new ChatSession.Ok(chat, str, false));
            }
        } else {
            StateFlowKt.emitOrThrow(MutableSharedFlow$default, ChatSession.NotInitialized.INSTANCE);
        }
        this.chatSession = MutableSharedFlow$default;
        this.isSubscribed = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (r12 != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendMessages(String str, Message[] messageArr, ContinuationImpl continuationImpl) {
        RealChatSessionManager$sendMessages$1 realChatSessionManager$sendMessages$1;
        int i;
        String str2;
        String str3;
        if (continuationImpl instanceof RealChatSessionManager$sendMessages$1) {
            realChatSessionManager$sendMessages$1 = (RealChatSessionManager$sendMessages$1) continuationImpl;
            int i2 = realChatSessionManager$sendMessages$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatSessionManager$sendMessages$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatSessionManager$sendMessages$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatSessionManager$sendMessages$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str4 = (String) this.sessionId.getValue();
                    if (str4 == null) {
                        List list = ArraysKt___ArraysKt.toList(messageArr);
                        realChatSessionManager$sendMessages$1.L$0 = null;
                        realChatSessionManager$sendMessages$1.L$1 = null;
                        realChatSessionManager$sendMessages$1.L$2 = null;
                        realChatSessionManager$sendMessages$1.label = 1;
                        Object startChat = startChat(str, list, realChatSessionManager$sendMessages$1);
                        if (startChat != obj2) {
                            return startChat;
                        }
                    } else {
                        SharedFlowImpl sharedFlowImpl = this.chatSession;
                        ChatSession chatSession = (ChatSession) CollectionsKt.firstOrNull(sharedFlowImpl.getReplayCache());
                        ChatSession.Ok ok = new ChatSession.Ok(chatSession != null ? chatSession.getChat() : null, str4, true);
                        realChatSessionManager$sendMessages$1.L$0 = str;
                        realChatSessionManager$sendMessages$1.L$1 = messageArr;
                        realChatSessionManager$sendMessages$1.L$2 = str4;
                        realChatSessionManager$sendMessages$1.label = 2;
                        if (sharedFlowImpl.emit(ok, realChatSessionManager$sendMessages$1) != obj2) {
                            str2 = str;
                            str3 = str4;
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    ApiResult apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                        return ChatSessionError.RequestFailed.INSTANCE;
                    }
                    if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                        return ChatSessionError.NetworkError.INSTANCE;
                    }
                    if (apiResult instanceof ApiResult.Success) {
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str3 = realChatSessionManager$sendMessages$1.L$2;
                messageArr = (Message[]) realChatSessionManager$sendMessages$1.L$1;
                str2 = realChatSessionManager$sendMessages$1.L$0;
                SafeTrace.throwOnFailure(obj);
                Message[] messageArr2 = (Message[]) Arrays.copyOf(messageArr, messageArr.length);
                realChatSessionManager$sendMessages$1.L$0 = null;
                realChatSessionManager$sendMessages$1.L$1 = null;
                realChatSessionManager$sendMessages$1.L$2 = null;
                realChatSessionManager$sendMessages$1.label = 3;
                obj = ((RealChatManager) this.chatManager).sendMessages(str3, str2, messageArr2, realChatSessionManager$sendMessages$1);
            }
        }
        realChatSessionManager$sendMessages$1 = new RealChatSessionManager$sendMessages$1(this, continuationImpl);
        Object obj3 = realChatSessionManager$sendMessages$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatSessionManager$sendMessages$1.label;
        if (i != 0) {
        }
        Message[] messageArr22 = (Message[]) Arrays.copyOf(messageArr, messageArr.length);
        realChatSessionManager$sendMessages$1.L$0 = null;
        realChatSessionManager$sendMessages$1.L$1 = null;
        realChatSessionManager$sendMessages$1.L$2 = null;
        realChatSessionManager$sendMessages$1.label = 3;
        obj3 = ((RealChatManager) this.chatManager).sendMessages(str3, str2, messageArr22, realChatSessionManager$sendMessages$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startChat(String str, List list, ContinuationImpl continuationImpl) {
        RealChatSessionManager$startChat$1 realChatSessionManager$startChat$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealChatSessionManager$startChat$1) {
            realChatSessionManager$startChat$1 = (RealChatSessionManager$startChat$1) continuationImpl;
            int i2 = realChatSessionManager$startChat$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatSessionManager$startChat$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatSessionManager$startChat$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatSessionManager$startChat$1.label;
                StateFlowImpl stateFlowImpl = this.sessionId;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (stateFlowImpl.getValue() != null) {
                        return null;
                    }
                    Message[] messageArr = (Message[]) list.toArray(new Message[0]);
                    Message[] messageArr2 = (Message[]) Arrays.copyOf(messageArr, messageArr.length);
                    realChatSessionManager$startChat$1.label = 1;
                    obj = ((RealChatManager) this.chatManager).sendMessages(null, str, (Message[]) Arrays.copyOf(messageArr2, messageArr2.length), realChatSessionManager$startChat$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                    return ChatSessionError.NetworkError.INSTANCE;
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return ChatSessionError.RequestFailed.INSTANCE;
                }
                if (apiResult instanceof ApiResult.Success) {
                    stateFlowImpl.setValue(((ApiResult.Success) apiResult).response);
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realChatSessionManager$startChat$1 = new RealChatSessionManager$startChat$1(this, continuationImpl);
        Object obj2 = realChatSessionManager$startChat$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatSessionManager$startChat$1.label;
        StateFlowImpl stateFlowImpl2 = this.sessionId;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure.NetworkFailure)) {
        }
    }
}
