package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", l = {50, 50, 52}, m = "next")
/* renamed from: com.plaid.internal.o2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0245o2 extends ContinuationImpl {
    public C0289t2 a;
    public Pane$PaneOutput[] b;
    public Y2 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C0289t2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0245o2(C0289t2 c0289t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c0289t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= PKIFailureInfo.systemUnavail;
        return this.e.a((Pane$PaneOutput[]) null, this);
    }
}
