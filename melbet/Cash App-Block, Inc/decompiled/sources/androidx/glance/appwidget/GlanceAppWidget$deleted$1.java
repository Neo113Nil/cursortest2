package androidx.glance.appwidget;

import android.content.Context;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class GlanceAppWidget$deleted$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Context L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CashQrWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidget$deleted$1(CashQrWidget cashQrWidget, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cashQrWidget;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.deleted$glance_appwidget_release(null, 0, this);
    }
}
