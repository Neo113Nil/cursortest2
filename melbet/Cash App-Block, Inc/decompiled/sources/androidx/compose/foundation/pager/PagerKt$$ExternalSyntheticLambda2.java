package androidx.compose.foundation.pager;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class PagerKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PagerState f$0;
    public final /* synthetic */ CoroutineScope f$1;

    public /* synthetic */ PagerKt$$ExternalSyntheticLambda2(PagerState pagerState, CoroutineScope coroutineScope, int i) {
        this.$r8$classId = i;
        this.f$0 = pagerState;
        this.f$1 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        boolean z = false;
        PagerState pagerState = this.f$0;
        CoroutineScope coroutineScope = this.f$1;
        switch (i) {
            case 0:
                if (pagerState.getCanScrollBackward()) {
                    JobKt.launch$default(coroutineScope, null, null, new PagerState$requestScrollToPage$1(1, pagerState, null), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                if (pagerState.getCanScrollForward()) {
                    JobKt.launch$default(coroutineScope, null, null, new PagerState$requestScrollToPage$1(2, pagerState, null), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                if (pagerState.getCanScrollBackward()) {
                    JobKt.launch$default(coroutineScope, null, null, new PagerState$requestScrollToPage$1(1, pagerState, null), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                if (pagerState.getCanScrollForward()) {
                    JobKt.launch$default(coroutineScope, null, null, new PagerState$requestScrollToPage$1(2, pagerState, null), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                JobKt.launch$default(coroutineScope, null, null, new PagerState$requestScrollToPage$1(3, pagerState, null), 3);
                break;
            default:
                JobKt.launch$default(coroutineScope, null, null, new PagerState$requestScrollToPage$1(4, pagerState, null), 3);
                break;
        }
        return Boolean.TRUE;
    }

    public /* synthetic */ PagerKt$$ExternalSyntheticLambda2(CoroutineScope coroutineScope, PagerState pagerState, int i) {
        this.$r8$classId = i;
        this.f$1 = coroutineScope;
        this.f$0 = pagerState;
    }
}
