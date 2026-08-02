package androidx.paging;

import androidx.paging.PageEvent;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PageEvent$StaticList$map$1 extends ContinuationImpl {
    public Function2 L$0;
    public Collection L$1;
    public Iterator L$2;
    public Collection L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PageEvent.StaticList this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$StaticList$map$1(PageEvent.StaticList staticList, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = staticList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.map(null, this);
    }
}
