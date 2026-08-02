package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class RegisterAliasPresenter$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RegisterAliasPresenter f$0;

    public /* synthetic */ RegisterAliasPresenter$$ExternalSyntheticLambda1(RegisterAliasPresenter registerAliasPresenter, int i) {
        this.$r8$classId = i;
        this.f$0 = registerAliasPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        RegisterAliasPresenter registerAliasPresenter = this.f$0;
        switch (i) {
            case 0:
                RegisterAliasViewModel registerAliasViewModel = (RegisterAliasViewModel) obj;
                registerAliasViewModel.getClass();
                RegisterAliasHelper registerAliasHelper = registerAliasPresenter.helper;
                BlockersScreens.RegisterAliasScreen registerAliasScreen = registerAliasPresenter.args;
                boolean isSmsOnly = registerAliasPresenter.isSmsOnly();
                boolean isSmsPreferredSignIn = registerAliasPresenter.isSmsPreferredSignIn();
                BlockersScreens.RegisterAliasScreen.Mode mode = BlockersScreens.RegisterAliasScreen.Mode.REGISTER_EMAIL;
                return RegisterAliasViewModel.copy$default(registerAliasViewModel, registerAliasHelper.getTitleText(registerAliasScreen, isSmsOnly, isSmsPreferredSignIn, mode), registerAliasHelper.hintText(registerAliasScreen, registerAliasPresenter.isSmsOnly(), registerAliasPresenter.isSmsPreferredSignIn(), mode), RegisterAliasViewModel.Mode.EMAIL, false, false, false, registerAliasHelper.termsText(registerAliasScreen, registerAliasPresenter.aliasType, registerAliasPresenter.selectedCountryConfig), false, registerAliasHelper.showUpdatedTerms(registerAliasScreen, registerAliasPresenter.aliasType, registerAliasPresenter.selectedCountryConfig), 521201);
            case 1:
                RegisterAliasViewModel registerAliasViewModel2 = (RegisterAliasViewModel) obj;
                registerAliasViewModel2.getClass();
                String str = registerAliasPresenter.initialTitle;
                RegisterAliasHelper registerAliasHelper2 = registerAliasPresenter.helper;
                BlockersScreens.RegisterAliasScreen registerAliasScreen2 = registerAliasPresenter.args;
                return RegisterAliasViewModel.copy$default(registerAliasViewModel2, str, registerAliasHelper2.hintText(registerAliasScreen2, registerAliasPresenter.isSmsOnly(), registerAliasPresenter.isSmsPreferredSignIn(), registerAliasScreen2.mode), RegisterAliasViewModel.Mode.SMS, false, false, false, registerAliasHelper2.termsText(registerAliasScreen2, registerAliasPresenter.aliasType, registerAliasPresenter.selectedCountryConfig), false, registerAliasHelper2.showUpdatedTerms(registerAliasScreen2, registerAliasPresenter.aliasType, registerAliasPresenter.selectedCountryConfig), 521201);
            default:
                RegisterAliasViewModel registerAliasViewModel3 = (RegisterAliasViewModel) obj;
                registerAliasViewModel3.getClass();
                RegisterAliasHelper registerAliasHelper3 = registerAliasPresenter.helper;
                BlockersScreens.RegisterAliasScreen registerAliasScreen3 = registerAliasPresenter.args;
                return RegisterAliasViewModel.copy$default(registerAliasViewModel3, registerAliasHelper3.getTitleText(registerAliasScreen3, registerAliasPresenter.isSmsOnly(), registerAliasPresenter.isSmsPreferredSignIn(), registerAliasScreen3.mode), registerAliasHelper3.hintText(registerAliasScreen3, registerAliasPresenter.isSmsOnly(), registerAliasPresenter.isSmsPreferredSignIn(), registerAliasScreen3.mode), null, registerAliasHelper3.isModeSwitchable(registerAliasScreen3, registerAliasPresenter.isSmsOnly()), false, false, registerAliasHelper3.termsText(registerAliasScreen3, registerAliasPresenter.aliasType, registerAliasPresenter.selectedCountryConfig), registerAliasHelper3.isModeSwitchable(registerAliasScreen3, registerAliasPresenter.isSmsOnly()) || registerAliasScreen3.skippable, registerAliasHelper3.showUpdatedTerms(registerAliasScreen3, registerAliasPresenter.aliasType, registerAliasPresenter.selectedCountryConfig), 489449);
        }
    }
}
