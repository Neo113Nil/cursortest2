package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {489, 491}, m = "handleSuccess")
/* loaded from: classes5.dex */
public final class S2 extends ContinuationImpl {
    public Y2 a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Pane$PaneRendering f;
    public List g;
    public List h;
    public String i;
    public Iterator j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Y2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(Y2 y2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.l = y2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= PKIFailureInfo.systemUnavail;
        return this.l.a(null, null, null, null, null, null, null, null, this);
    }
}
