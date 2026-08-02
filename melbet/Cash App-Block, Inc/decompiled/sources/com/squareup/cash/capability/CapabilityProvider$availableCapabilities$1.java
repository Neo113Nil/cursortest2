package com.squareup.cash.capability;

import androidx.compose.ui.text.android.CanvasCompatQ;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class CapabilityProvider$availableCapabilities$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Collection L$2;
    public Iterator L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CanvasCompatQ this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapabilityProvider$availableCapabilities$1(CanvasCompatQ canvasCompatQ, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = canvasCompatQ;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.availableCapabilities(this);
    }
}
