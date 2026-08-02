package com.squareup.cash.moneybot.presenters;

import com.squareup.cash.music.presenters.MusicPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class MoneybotPreambleEditorPresenter$fetchMoneybotPreamble$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MusicPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotPreambleEditorPresenter$fetchMoneybotPreamble$1(MusicPresenter musicPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = musicPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return MusicPresenter.access$fetchMoneybotPreamble(this.this$0, this);
    }
}
