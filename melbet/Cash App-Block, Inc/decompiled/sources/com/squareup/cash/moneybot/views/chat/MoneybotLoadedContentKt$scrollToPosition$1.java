package com.squareup.cash.moneybot.views.chat;

import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class MoneybotLoadedContentKt$scrollToPosition$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public LazyListState L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CardViewApi21Impl.scrollToPosition(null, 0, 0, false, this);
    }
}
