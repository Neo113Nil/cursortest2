package com.squareup.cash.family.fixtures;

import com.squareup.cash.family.familyhub.backend.api.DependentBalanceName;
import com.squareup.cash.family.familyhub.viewmodels.DependentBalancesViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewEvent;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public abstract class FamilyBalanceFixtures {
    public static final DependentBalancesViewModel INITIAL_DEPENDENT_BALANCES_VIEW_MODEL;
    public static final DependentBalancesViewModel LOADED_DEPENDENT_BALANCES_VIEW_MODEL;

    static {
        DependentBalanceName dependentBalanceName = DependentBalanceName.Cash;
        DependentBalancesViewModel.BalanceStatModel balanceStatModel = new DependentBalancesViewModel.BalanceStatModel("Cash", "$5045.56", "Cash balance", null, new DependentDetailViewEvent.BalanceTapped(dependentBalanceName), false);
        DependentBalanceName dependentBalanceName2 = DependentBalanceName.Savings;
        DependentBalancesViewModel.BalanceStatModel balanceStatModel2 = new DependentBalancesViewModel.BalanceStatModel("Savings", "$123.49", "Savings", "Unlock 4% interest", new DependentDetailViewEvent.BalanceTapped(dependentBalanceName2), false);
        DependentBalancesViewModel.BalanceStatModel balanceStatModel3 = new DependentBalancesViewModel.BalanceStatModel("Stocks", "$5.00", "Stocks", null, new DependentDetailViewEvent.BalanceTapped(DependentBalanceName.Stocks), false);
        DependentBalancesViewModel.BalanceStatModel balanceStatModel4 = new DependentBalancesViewModel.BalanceStatModel("Bitcoin", "$13.10", "Bitcoin", null, new DependentDetailViewEvent.BalanceTapped(DependentBalanceName.Bitcoin), false);
        new Money((Long) 145600L, CurrencyCode.CAD, 4);
        CurrencyCode currencyCode = CurrencyCode.GBP;
        new Money((Long) 4200L, currencyCode, 4);
        new Money((Long) 4600L, currencyCode, 4);
        INITIAL_DEPENDENT_BALANCES_VIEW_MODEL = new DependentBalancesViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new DependentBalancesViewModel.BalanceStatModel[]{DependentBalancesViewModel.BalanceStatModel.copy$default(balanceStatModel, new DependentDetailViewEvent.BalanceTapped(dependentBalanceName), 13), DependentBalancesViewModel.BalanceStatModel.copy$default(balanceStatModel2, new DependentDetailViewEvent.BalanceTapped(dependentBalanceName2), 5)}));
        LOADED_DEPENDENT_BALANCES_VIEW_MODEL = new DependentBalancesViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new DependentBalancesViewModel.BalanceStatModel[]{balanceStatModel, balanceStatModel3, balanceStatModel2, balanceStatModel4}));
    }
}
