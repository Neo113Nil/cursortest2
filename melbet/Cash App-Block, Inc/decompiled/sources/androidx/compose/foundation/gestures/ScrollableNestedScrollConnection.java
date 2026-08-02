package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ScrollableNestedScrollConnection implements NestedScrollConnection {
    public boolean enabled;
    public final ScrollingLogic scrollingLogic;

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z) {
        this.scrollingLogic = scrollingLogic;
        this.enabled = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo241onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        ScrollableNestedScrollConnection$onPostFling$1 scrollableNestedScrollConnection$onPostFling$1;
        int i;
        long j3;
        if (continuation instanceof ScrollableNestedScrollConnection$onPostFling$1) {
            scrollableNestedScrollConnection$onPostFling$1 = (ScrollableNestedScrollConnection$onPostFling$1) continuation;
            int i2 = scrollableNestedScrollConnection$onPostFling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                scrollableNestedScrollConnection$onPostFling$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = scrollableNestedScrollConnection$onPostFling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollableNestedScrollConnection$onPostFling$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    j3 = 0;
                    if (this.enabled) {
                        ScrollingLogic scrollingLogic = this.scrollingLogic;
                        if (!scrollingLogic.isFlinging) {
                            scrollableNestedScrollConnection$onPostFling$1.J$0 = j2;
                            scrollableNestedScrollConnection$onPostFling$1.label = 1;
                            obj = scrollingLogic.m243doFlingAnimationQWom1Mo(j2, scrollableNestedScrollConnection$onPostFling$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        j3 = Velocity.m1069minusAH228Gc(j2, j3);
                    }
                    return Velocity.m1064boximpl(j3);
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = scrollableNestedScrollConnection$onPostFling$1.J$0;
                SafeTrace.throwOnFailure(obj);
                j3 = ((Velocity) obj).m1073unboximpl();
                j3 = Velocity.m1069minusAH228Gc(j2, j3);
                return Velocity.m1064boximpl(j3);
            }
        }
        scrollableNestedScrollConnection$onPostFling$1 = new ScrollableNestedScrollConnection$onPostFling$1(this, (ContinuationImpl) continuation);
        Object obj2 = scrollableNestedScrollConnection$onPostFling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollableNestedScrollConnection$onPostFling$1.label;
        if (i != 0) {
        }
        j3 = ((Velocity) obj2).m1073unboximpl();
        j3 = Velocity.m1069minusAH228Gc(j2, j3);
        return Velocity.m1064boximpl(j3);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public final long mo242onPostScrollDzOQY0M(int i, long j, long j2) {
        if (!this.enabled) {
            return 0L;
        }
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        if (scrollingLogic.scrollableState.isScrollInProgress()) {
            return 0L;
        }
        return scrollingLogic.m248toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(scrollingLogic.scrollableState.dispatchRawDelta(scrollingLogic.reverseIfNeeded(scrollingLogic.m247toFloatk4lQ0M(j2)))));
    }
}
