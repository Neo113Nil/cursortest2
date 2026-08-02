package com.squareup.cash.moneybot.backend.real.managers;

import com.squareup.cash.moneybot.backend.api.model.chat.TokenInfo;
import com.squareup.protos.cash.kgoose.api.v3.ChatSessionStatus;
import com.squareup.protos.cash.kgoose.api.v3.GetMessagesResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealChatManager$onFullResponse$1 extends ContinuationImpl {
    public int I$0;
    public String L$0;
    public Iterator L$13;
    public Map L$16;
    public GetMessagesResponse L$2;
    public String L$5;
    public ChatSessionStatus L$6;
    public List L$7;
    public TokenInfo L$8;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealChatManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealChatManager$onFullResponse$1(RealChatManager realChatManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realChatManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealChatManager.access$onFullResponse(this.this$0, null, null, this);
    }
}
