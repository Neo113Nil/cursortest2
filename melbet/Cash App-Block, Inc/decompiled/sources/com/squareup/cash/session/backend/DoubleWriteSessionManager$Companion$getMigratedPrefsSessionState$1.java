package com.squareup.cash.session.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class DoubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1 extends ContinuationImpl {
    public String L$4;
    public Session L$5;
    public String L$6;
    public String L$7;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    public DoubleWriteSessionManager$Companion$getMigratedPrefsSessionState$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return SessionParsingErrorFactory.access$getMigratedPrefsSessionState(null, null, null, null, this);
    }
}
