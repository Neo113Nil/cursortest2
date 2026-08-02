package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class TextFieldSelectionState$detectSelectionHandleDragGestures$1 extends ContinuationImpl {
    public Ref$LongRef L$0;
    public Ref$LongRef L$1;
    public Handle L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$1(TextFieldSelectionState textFieldSelectionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TextFieldSelectionState.access$detectSelectionHandleDragGestures(this.this$0, null, false, this);
    }
}
