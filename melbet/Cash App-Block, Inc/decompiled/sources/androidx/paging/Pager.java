package androidx.paging;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class Pager {
    public final Flow flow;

    public Pager(PagingConfig pagingConfig, Function0 function0) {
        this.flow = new PageFetcher(new Pager$pageFetcher$2(function0, null, 0), pagingConfig).flow;
    }
}
