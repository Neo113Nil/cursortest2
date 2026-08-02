package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Function;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import okhttp3.internal.http1.HeadersReader;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class DragGestureDetectorKt$processDragGesture$1 extends ContinuationImpl {
    public float F$0;
    public Object L$0;
    public Object L$1;
    public HeadersReader L$10;
    public PointerInputChange L$11;
    public Function L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Ref$LongRef L$9;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DragGestureDetectorKt.processDragGesture(null, null, null, null, null, null, null, this);
    }
}
