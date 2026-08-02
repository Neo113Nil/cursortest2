package androidx.compose.material.pullrefresh;

import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$5$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class PullRefreshNestedScrollConnection implements NestedScrollConnection {
    public final boolean enabled;
    public final GraphLoop$processingQueue$1 onPull;
    public final HeroCardViewKt$Render$1$5$1.AnonymousClass2.C00682 onRelease;

    public PullRefreshNestedScrollConnection(GraphLoop$processingQueue$1 graphLoop$processingQueue$1, HeroCardViewKt$Render$1$5$1.AnonymousClass2.C00682 c00682, boolean z) {
        this.onPull = graphLoop$processingQueue$1;
        this.onRelease = c00682;
        this.enabled = z;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo242onPostScrollDzOQY0M(int i, long j, long j2) {
        if (!this.enabled || i != 1) {
            return 0L;
        }
        int i2 = (int) (j2 & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i2) <= RecyclerView.DECELERATION_RATE) {
            return 0L;
        }
        float floatValue = ((Number) this.onPull.invoke(Float.valueOf(Float.intBitsToFloat(i2)))).floatValue();
        return (Float.floatToRawIntBits(floatValue) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo493onPreFlingQWom1Mo(long j, Continuation continuation) {
        PullRefreshNestedScrollConnection$onPreFling$1 pullRefreshNestedScrollConnection$onPreFling$1;
        int i;
        if (continuation instanceof PullRefreshNestedScrollConnection$onPreFling$1) {
            pullRefreshNestedScrollConnection$onPreFling$1 = (PullRefreshNestedScrollConnection$onPreFling$1) continuation;
            int i2 = pullRefreshNestedScrollConnection$onPreFling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pullRefreshNestedScrollConnection$onPreFling$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pullRefreshNestedScrollConnection$onPreFling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pullRefreshNestedScrollConnection$onPreFling$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f = new Float(Velocity.m1068getYimpl(j));
                    pullRefreshNestedScrollConnection$onPreFling$1.label = 1;
                    obj = this.onRelease.invoke(f, pullRefreshNestedScrollConnection$onPreFling$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return new Velocity(VelocityKt.Velocity(RecyclerView.DECELERATION_RATE, ((Number) obj).floatValue()));
            }
        }
        pullRefreshNestedScrollConnection$onPreFling$1 = new PullRefreshNestedScrollConnection$onPreFling$1(this, (ContinuationImpl) continuation);
        Object obj2 = pullRefreshNestedScrollConnection$onPreFling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pullRefreshNestedScrollConnection$onPreFling$1.label;
        if (i != 0) {
        }
        return new Velocity(VelocityKt.Velocity(RecyclerView.DECELERATION_RATE, ((Number) obj2).floatValue()));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo326onPreScrollOzD1aCk(int i, long j) {
        if (!this.enabled || i != 1) {
            return 0L;
        }
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i2) >= RecyclerView.DECELERATION_RATE) {
            return 0L;
        }
        float floatValue = ((Number) this.onPull.invoke(Float.valueOf(Float.intBitsToFloat(i2)))).floatValue();
        return (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(floatValue) & BodyPartID.bodyIdMax);
    }
}
