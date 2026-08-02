package com.squareup.cash.moneybot.presenters;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class MoneybotChatPresenter$buildMessages$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public String L$0;
    public Collection L$4;
    public Iterator L$6;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MoneybotChatPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotChatPresenter$buildMessages$1(MoneybotChatPresenter moneybotChatPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = moneybotChatPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.buildMessages(null, false, null, this);
    }
}
