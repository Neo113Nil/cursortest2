package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class AsyncFontListLoader$load$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public List L$0;
    public ResourceFont L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.load(this);
    }
}
