package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.graph.GraphCommand;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class GraphLoop$processShutdown$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public List L$0;
    public GraphCommand.RequestProcessor L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GraphLoop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphLoop$processShutdown$1(GraphLoop graphLoop, Continuation continuation) {
        super(continuation);
        this.this$0 = graphLoop;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.processShutdown(null, this);
    }
}
