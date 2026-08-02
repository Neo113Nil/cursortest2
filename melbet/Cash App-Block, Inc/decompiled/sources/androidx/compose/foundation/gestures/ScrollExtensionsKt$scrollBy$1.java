package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class ScrollExtensionsKt$scrollBy$1 extends ContinuationImpl {
    public Ref$FloatRef L$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PlatformKt.scrollBy(null, RecyclerView.DECELERATION_RATE, this);
    }
}
