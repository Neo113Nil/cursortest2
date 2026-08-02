package androidx.glance.appwidget;

import android.content.Context;
import androidx.glance.EmittableWithChildren;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class AppWidgetSession$processEmittableTree$1 extends ContinuationImpl {
    public Object L$0;
    public Context L$1;
    public EmittableWithChildren L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AppWidgetSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSession$processEmittableTree$1(AppWidgetSession appWidgetSession, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = appWidgetSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.processEmittableTree(null, null, this);
    }
}
