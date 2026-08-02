package androidx.glance.state;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class GlanceState$deleteStore$1 extends ContinuationImpl {
    public Context L$0;
    public GlanceStateDefinition L$1;
    public String L$2;
    public MutexImpl L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GlanceState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceState$deleteStore$1(GlanceState glanceState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = glanceState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.deleteStore(null, null, null, this);
    }
}
