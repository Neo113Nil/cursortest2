package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public final /* synthetic */ int $r8$classId;

    public FixedSizeIntrinsicsPlaceable(int i, int i2, int i3) {
        this.$r8$classId = i3;
        switch (i3) {
            case 1:
                m852setMeasuredSizeozmzZPI((i2 & BodyPartID.bodyIdMax) | (i << 32));
                break;
            default:
                m852setMeasuredSizeozmzZPI((i2 & BodyPartID.bodyIdMax) | (i << 32));
                break;
        }
    }

    /* renamed from: placeAt-f8xVGno$androidx$compose$ui$layout$FixedSizeIntrinsicsPlaceable, reason: not valid java name */
    private final void m834xf00bb1d6(long j, float f, Function1 function1) {
    }

    /* renamed from: placeAt-f8xVGno$androidx$compose$ui$node$NodeMeasuringIntrinsics$EmptyPlaceable, reason: not valid java name */
    private final void m835x3c56d5b1(long j, float f, Function1 function1) {
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final int get(AlignmentLine alignmentLine) {
        switch (this.$r8$classId) {
        }
        return PKIFailureInfo.systemUnavail;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public final void mo836placeAtf8xVGno(long j, float f, Function1 function1) {
        int i = this.$r8$classId;
    }
}
