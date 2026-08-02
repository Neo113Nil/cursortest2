package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.ui.unit.Constraints;
import com.withpersona.sdk2.inquiry.shared.SharedModule;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class FlowLayoutBuildingBlocks {
    public final long constraints;
    public final int crossAxisSpacing;
    public final int mainAxisSpacing;
    public final int maxItemsInMainAxis;
    public final FlowLayoutOverflowState overflow;

    public FlowLayoutBuildingBlocks(int i, FlowLayoutOverflowState flowLayoutOverflowState, long j, int i2, int i3) {
        this.maxItemsInMainAxis = i;
        this.overflow = flowLayoutOverflowState;
        this.constraints = j;
        this.mainAxisSpacing = i2;
        this.crossAxisSpacing = i3;
    }

    public final OffsetKt getWrapEllipsisInfo(SharedModule sharedModule, boolean z, int i, int i2, int i3, int i4) {
        if (!sharedModule.controlStatusBar) {
            return null;
        }
        this.overflow.getClass();
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = FlowLayoutOverflow$OverflowType.Clip;
        return null;
    }

    /* renamed from: getWrapInfo-OpUlnko, reason: not valid java name */
    public final SharedModule m261getWrapInfoOpUlnko(boolean z, int i, long j, IntIntPair intIntPair, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i3 + i4;
        if (intIntPair == null) {
            return new SharedModule(true, true);
        }
        long j2 = intIntPair.packedValue;
        this.overflow.getClass();
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = FlowLayoutOverflow$OverflowType.Clip;
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType2 = FlowLayoutOverflow$OverflowType.Clip;
        if (i2 >= Integer.MAX_VALUE || ((int) (j & BodyPartID.bodyIdMax)) - ((int) (j2 & BodyPartID.bodyIdMax)) < 0) {
            return new SharedModule(true, true);
        }
        if (i != 0 && (i >= this.maxItemsInMainAxis || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            return z2 ? new SharedModule(true, true) : new SharedModule(true, m261getWrapInfoOpUlnko(z, 0, IntIntPair.m128constructorimpl(Constraints.m1025getMaxWidthimpl(this.constraints), (((int) (j & BodyPartID.bodyIdMax)) - this.crossAxisSpacing) - i4), new IntIntPair(IntIntPair.m128constructorimpl(((int) (j2 >> 32)) - this.mainAxisSpacing, (int) (j2 & BodyPartID.bodyIdMax))), i2 + 1, i5, 0, true, false).controlStatusBar);
        }
        Math.max(i4, (int) (j2 & BodyPartID.bodyIdMax));
        return new SharedModule(false, false);
    }
}
