package com.plaid.internal;

import com.plaid.link.OnLoadCallback;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController", f = "PreloadLinkController.kt", l = {57, 65, 70, 72}, m = "maybePreloadLink")
/* renamed from: com.plaid.internal.e6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0159e6 extends ContinuationImpl {
    public C0213k6 a;
    public OnLoadCallback b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0213k6 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0159e6(C0213k6 c0213k6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0213k6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= PKIFailureInfo.systemUnavail;
        return this.d.a(null, this);
    }
}
