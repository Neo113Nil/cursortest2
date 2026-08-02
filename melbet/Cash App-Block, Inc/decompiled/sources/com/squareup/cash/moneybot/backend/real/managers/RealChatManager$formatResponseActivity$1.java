package com.squareup.cash.moneybot.backend.real.managers;

import com.squareup.cash.moneybot.backend.api.model.chat.ClientRenderable;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealChatManager$formatResponseActivity$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public Collection L$10;
    public Iterator L$12;
    public Message.ToolResponse L$16;
    public Collection L$17;
    public Collection L$3;
    public Iterator L$4;
    public Message.ToolResponse.UserContent L$6;
    public ClientRenderable.ActivityList L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealChatManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealChatManager$formatResponseActivity$1(RealChatManager realChatManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realChatManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.formatResponseActivity(null, this);
    }
}
