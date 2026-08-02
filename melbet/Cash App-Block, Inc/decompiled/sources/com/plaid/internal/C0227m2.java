package com.plaid.internal;

import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkController", f = "LinkController.kt", l = {98}, m = "handleSessionHandoff")
/* renamed from: com.plaid.internal.m2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0227m2 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0289t2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0227m2(C0289t2 c0289t2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c0289t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= PKIFailureInfo.systemUnavail;
        return this.b.a((LinkedHashMap) null, this);
    }
}
