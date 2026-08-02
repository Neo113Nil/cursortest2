package androidx.paging;

import androidx.paging.PageEvent;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PageEvent$Insert$map$1 extends ContinuationImpl {
    public Function2 L$0;
    public PageEvent.Insert L$1;
    public Collection L$10;
    public LoadType L$2;
    public Collection L$3;
    public Iterator L$4;
    public TransformablePage L$5;
    public int[] L$6;
    public Collection L$7;
    public Iterator L$8;
    public Collection L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PageEvent.Insert this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$Insert$map$1(PageEvent.Insert insert, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = insert;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.map(null, this);
    }
}
