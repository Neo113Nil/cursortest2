package com.squareup.cash.investing.components.categories;

import android.view.View;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.investing.viewmodels.categories.FilterSubFiltersViewEvent;
import com.squareup.cash.investing.viewmodels.categories.SubFilterViewModel;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingSubFilterIncremental$$ExternalSyntheticLambda14 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ InvestingSubFilterIncremental f$0;
    public final /* synthetic */ SubFilterViewModel.SubFilterIncrementalViewModel f$1;
    public final /* synthetic */ ArrayList f$2;
    public final /* synthetic */ EnumListAdapter$encode$1 f$3;

    public /* synthetic */ InvestingSubFilterIncremental$$ExternalSyntheticLambda14(InvestingSubFilterIncremental investingSubFilterIncremental, SubFilterViewModel.SubFilterIncrementalViewModel subFilterIncrementalViewModel, ArrayList arrayList, EnumListAdapter$encode$1 enumListAdapter$encode$1) {
        this.f$0 = investingSubFilterIncremental;
        this.f$1 = subFilterIncrementalViewModel;
        this.f$2 = arrayList;
        this.f$3 = enumListAdapter$encode$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        EnumListAdapter$encode$1 enumListAdapter$encode$1 = this.f$3;
        SubFilterViewModel.SubFilterIncrementalViewModel subFilterIncrementalViewModel = this.f$1;
        InvestingSubFilterIncremental investingSubFilterIncremental = this.f$0;
        ArrayList arrayList = this.f$2;
        View view = (View) obj;
        switch (i) {
            case 0:
                int i2 = InvestingSubFilterIncremental.$r8$clinit;
                view.getClass();
                int max = Math.max(0, (investingSubFilterIncremental.selectedIndex != null ? r7.intValue() : subFilterIncrementalViewModel.placeholderIndex) - 1);
                Object obj2 = arrayList.get(max);
                SyncInvestmentFilterGroup.SubfilterOption subfilterOption = obj2 instanceof SyncInvestmentFilterGroup.SubfilterOption ? (SyncInvestmentFilterGroup.SubfilterOption) obj2 : null;
                enumListAdapter$encode$1.invoke(new FilterSubFiltersViewEvent.OptionClick(subFilterIncrementalViewModel.subFilterToken, subfilterOption != null ? subfilterOption.token : null));
                InvestingSubFilterIncremental.render$announceOption(investingSubFilterIncremental, arrayList.get(max));
                break;
            default:
                int i3 = InvestingSubFilterIncremental.$r8$clinit;
                view.getClass();
                int size = arrayList.size() - 1;
                Integer num = investingSubFilterIncremental.selectedIndex;
                int min = Math.min(size, (num != null ? num.intValue() : subFilterIncrementalViewModel.placeholderIndex) + 1);
                Object obj3 = arrayList.get(min);
                SyncInvestmentFilterGroup.SubfilterOption subfilterOption2 = obj3 instanceof SyncInvestmentFilterGroup.SubfilterOption ? (SyncInvestmentFilterGroup.SubfilterOption) obj3 : null;
                enumListAdapter$encode$1.invoke(new FilterSubFiltersViewEvent.OptionClick(subFilterIncrementalViewModel.subFilterToken, subfilterOption2 != null ? subfilterOption2.token : null));
                InvestingSubFilterIncremental.render$announceOption(investingSubFilterIncremental, arrayList.get(min));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingSubFilterIncremental$$ExternalSyntheticLambda14(ArrayList arrayList, InvestingSubFilterIncremental investingSubFilterIncremental, SubFilterViewModel.SubFilterIncrementalViewModel subFilterIncrementalViewModel, EnumListAdapter$encode$1 enumListAdapter$encode$1) {
        this.f$2 = arrayList;
        this.f$0 = investingSubFilterIncremental;
        this.f$1 = subFilterIncrementalViewModel;
        this.f$3 = enumListAdapter$encode$1;
    }
}
