package com.squareup.cash.moneybot.backend.real.managers;

import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.moneybot.backend.api.model.chat.MessageList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealChatManager$formatMessages$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Collection L$3;
    public Iterator L$4;
    public Message L$6;
    public MessageList L$7;
    public Collection L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealChatManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealChatManager$formatMessages$1(RealChatManager realChatManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realChatManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.formatMessages(null, this);
    }
}
