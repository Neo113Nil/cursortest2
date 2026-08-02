package androidx.compose.foundation.text.input.internal.selection;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class TextFieldSelectionState$detectCursorHandleDragGestures$1 extends ContinuationImpl {
    public Ref$LongRef L$0;
    public Ref$LongRef L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectCursorHandleDragGestures$1(TextFieldSelectionState textFieldSelectionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TextFieldSelectionState.access$detectCursorHandleDragGestures(this.this$0, null, this);
    }
}
