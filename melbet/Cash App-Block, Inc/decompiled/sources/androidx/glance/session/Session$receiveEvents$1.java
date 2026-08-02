package androidx.glance.session;

import android.content.Context;
import androidx.glance.appwidget.AppWidgetSession;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.BufferedChannel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Session$receiveEvents$1 extends ContinuationImpl {
    public AppWidgetSession L$0;
    public Context L$1;
    public Function1 L$2;
    public BufferedChannel.BufferedChannelIterator L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AppWidgetSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Session$receiveEvents$1(AppWidgetSession appWidgetSession, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = appWidgetSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.receiveEvents(null, null, this);
    }
}
