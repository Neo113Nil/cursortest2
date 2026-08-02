package kotlinx.coroutines.flow;

import defpackage.mvg;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", l = {21}, m = "toCollection", v = 1)
/* loaded from: classes9.dex */
final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.V(null, null, this);
    }
}
