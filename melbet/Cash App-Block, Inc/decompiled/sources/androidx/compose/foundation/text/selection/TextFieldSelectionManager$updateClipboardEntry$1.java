package androidx.compose.foundation.text.selection;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class TextFieldSelectionManager$updateClipboardEntry$1 extends ContinuationImpl {
    public TextFieldSelectionManager L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$updateClipboardEntry$1(TextFieldSelectionManager textFieldSelectionManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.updateClipboardEntry$foundation(this);
    }
}
