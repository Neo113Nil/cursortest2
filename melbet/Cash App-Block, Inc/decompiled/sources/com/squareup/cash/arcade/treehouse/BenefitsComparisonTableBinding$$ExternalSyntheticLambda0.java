package com.squareup.cash.arcade.treehouse;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.arcade.values.benefitsTable.BenefitsComparisonTableCell;
import app.cash.arcade.values.benefitsTable.BenefitsComparisonTableRow;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadq;
import com.squareup.cash.benefits.components.viewmodels.BenefitsComparisonTableViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BenefitsComparisonTableBinding$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ BenefitsComparisonTableBinding f$0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        BenefitsComparisonTableBinding benefitsComparisonTableBinding = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.startReplaceGroup(-1990567003);
                    List list = (List) benefitsComparisonTableBinding.rows$delegate.getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    int i2 = 0;
                    for (Object obj3 : list) {
                        int i3 = i2 + 1;
                        BenefitsComparisonTableViewModel.BenefitsComparisonTableCell benefitsComparisonTableCell = null;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        BenefitsComparisonTableRow benefitsComparisonTableRow = (BenefitsComparisonTableRow) obj3;
                        boolean z = i2 == 0;
                        BenefitsComparisonTableViewModel.BenefitsComparisonTableCell viewModel = BenefitsComparisonTableBinding.toViewModel(benefitsComparisonTableRow.cell1);
                        BenefitsComparisonTableViewModel.BenefitsComparisonTableCell viewModel2 = BenefitsComparisonTableBinding.toViewModel(benefitsComparisonTableRow.cell2);
                        BenefitsComparisonTableCell benefitsComparisonTableCell2 = benefitsComparisonTableRow.cell3;
                        if (benefitsComparisonTableCell2 == null) {
                            gapComposer.startReplaceGroup(-1676638026);
                        } else {
                            gapComposer.startReplaceGroup(638651563);
                            benefitsComparisonTableCell = BenefitsComparisonTableBinding.toViewModel(benefitsComparisonTableCell2);
                        }
                        gapComposer.end(false);
                        arrayList.add(new BenefitsComparisonTableViewModel.BenefitsComparisonTableRow(ArraysKt___ArraysKt.filterNotNull(new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell[]{viewModel, viewModel2, benefitsComparisonTableCell}), z));
                        i2 = i3;
                    }
                    gapComposer.end(false);
                    zzadq.BenefitsComparisonTable(new BenefitsComparisonTableViewModel.Loaded("", arrayList), gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                benefitsComparisonTableBinding.Content(composer, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }
}
