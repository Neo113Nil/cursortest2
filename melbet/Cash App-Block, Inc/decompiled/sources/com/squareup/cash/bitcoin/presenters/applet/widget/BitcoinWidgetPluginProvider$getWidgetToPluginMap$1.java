package com.squareup.cash.bitcoin.presenters.applet.widget;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class BitcoinWidgetPluginProvider$getWidgetToPluginMap$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BitcoinWidgetPluginProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinWidgetPluginProvider$getWidgetToPluginMap$1(BitcoinWidgetPluginProvider bitcoinWidgetPluginProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bitcoinWidgetPluginProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getWidgetToPluginMap(this);
    }
}
