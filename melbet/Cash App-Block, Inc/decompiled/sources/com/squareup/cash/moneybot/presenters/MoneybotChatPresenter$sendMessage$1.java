package com.squareup.cash.moneybot.presenters;

import com.squareup.cash.moneybot.backend.real.managers.RealChatSessionManager;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class MoneybotChatPresenter$sendMessage$1 extends ContinuationImpl {
    public RealChatSessionManager L$0;
    public String L$1;
    public List L$2;
    public MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MoneybotChatPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$sendMessage$1(MoneybotChatPresenter moneybotChatPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = moneybotChatPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.sendMessage(null, null, false, null, null, this);
    }
}
