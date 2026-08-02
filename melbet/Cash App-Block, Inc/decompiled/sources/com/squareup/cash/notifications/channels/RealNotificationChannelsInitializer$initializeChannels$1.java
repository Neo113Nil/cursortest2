package com.squareup.cash.notifications.channels;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.internal.DefaultSocket;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealNotificationChannelsInitializer$initializeChannels$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public long J$0;
    public Collection L$2;
    public Iterator L$3;
    public MiscNotificationChannelContributor L$5;
    public Collection L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultSocket this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealNotificationChannelsInitializer$initializeChannels$1(DefaultSocket defaultSocket, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = defaultSocket;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m4350initializeChannelsVtjQ1oo(0L, this);
    }
}
