package androidx.camera.camera2.adapter;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import radiography.internal.RenderTreeStringKt;

/* loaded from: classes3.dex */
public final class CoroutineAdaptersKt$awaitUntil$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RenderTreeStringKt.awaitUntil(null, 0L, this);
    }
}
