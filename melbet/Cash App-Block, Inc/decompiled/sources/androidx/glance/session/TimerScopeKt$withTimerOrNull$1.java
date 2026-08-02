package androidx.glance.session;

import androidx.paging.PageFetcher$flow$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class TimerScopeKt$withTimerOrNull$1 extends ContinuationImpl {
    public PageFetcher$flow$1 L$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TimerScopeKt.withTimerOrNull(null, null, this);
    }
}
