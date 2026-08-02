package androidx.glance.appwidget;

import androidx.glance.appwidget.GlanceRemoteViewsService;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1 extends ContinuationImpl {
    public GlanceRemoteViewsService.GlanceRemoteViewsFactory L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GlanceRemoteViewsService.GlanceRemoteViewsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1(GlanceRemoteViewsService.GlanceRemoteViewsFactory glanceRemoteViewsFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = glanceRemoteViewsFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return GlanceRemoteViewsService.GlanceRemoteViewsFactory.access$startSessionIfNeededAndWaitUntilReady(this.this$0, null, this);
    }
}
