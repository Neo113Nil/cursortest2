package androidx.glance.appwidget;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class GlanceAppWidgetManager$getState$1 extends ContinuationImpl {
    public GlanceAppWidgetManager L$0;
    public GlanceAppWidgetManager L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GlanceAppWidgetManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$getState$1(GlanceAppWidgetManager glanceAppWidgetManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = glanceAppWidgetManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getState(this);
    }
}
