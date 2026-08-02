package androidx.glance.appwidget;

import android.content.Context;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class GlanceAppWidgetKt$updateAll$1 extends ContinuationImpl {
    public CashQrWidget L$0;
    public Context L$1;
    public Iterator L$2;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return GlanceAppWidgetKt.updateAll(null, null, this);
    }
}
