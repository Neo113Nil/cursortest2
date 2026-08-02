package androidx.glance.appwidget;

import android.content.Context;
import androidx.glance.appwidget.ContentReceiver;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class LayoutConfiguration$Companion$load$1 extends ContinuationImpl {
    public int I$0;
    public Context L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ContentReceiver.Key this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutConfiguration$Companion$load$1(ContentReceiver.Key key, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = key;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.load$glance_appwidget_release(null, 0, this);
    }
}
