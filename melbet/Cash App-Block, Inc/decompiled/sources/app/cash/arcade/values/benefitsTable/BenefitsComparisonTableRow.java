package app.cash.arcade.values.benefitsTable;

import app.cash.arcade.values.Shape$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class BenefitsComparisonTableRow {
    public static final Lazy[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final BenefitsComparisonTableCell cell1;
    public final BenefitsComparisonTableCell cell2;
    public final BenefitsComparisonTableCell cell3;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/benefitsTable/BenefitsComparisonTableRow$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/benefitsTable/BenefitsComparisonTableRow;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return BenefitsComparisonTableRow$$serializer.INSTANCE;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(20)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(21)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Shape$$ExternalSyntheticLambda0(22))};
    }

    public /* synthetic */ BenefitsComparisonTableRow(int i, BenefitsComparisonTableCell benefitsComparisonTableCell, BenefitsComparisonTableCell benefitsComparisonTableCell2, BenefitsComparisonTableCell benefitsComparisonTableCell3) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, BenefitsComparisonTableRow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.cell1 = benefitsComparisonTableCell;
        this.cell2 = benefitsComparisonTableCell2;
        if ((i & 4) == 0) {
            this.cell3 = null;
        } else {
            this.cell3 = benefitsComparisonTableCell3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitsComparisonTableRow)) {
            return false;
        }
        BenefitsComparisonTableRow benefitsComparisonTableRow = (BenefitsComparisonTableRow) obj;
        return Intrinsics.areEqual(this.cell1, benefitsComparisonTableRow.cell1) && Intrinsics.areEqual(this.cell2, benefitsComparisonTableRow.cell2) && Intrinsics.areEqual(this.cell3, benefitsComparisonTableRow.cell3);
    }

    public final int hashCode() {
        int hashCode = (this.cell2.hashCode() + (this.cell1.hashCode() * 31)) * 31;
        BenefitsComparisonTableCell benefitsComparisonTableCell = this.cell3;
        return hashCode + (benefitsComparisonTableCell == null ? 0 : benefitsComparisonTableCell.hashCode());
    }

    public final String toString() {
        return "BenefitsComparisonTableRow(cell1=" + this.cell1 + ", cell2=" + this.cell2 + ", cell3=" + this.cell3 + ")";
    }
}
