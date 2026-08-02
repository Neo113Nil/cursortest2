package com.squareup.cash.blockers.presenters;

import app.cash.onboarding.global.countries.CountryOnboardingConfig;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.cdf.AliasType;

/* loaded from: classes.dex */
public interface RegisterAliasHelper {
    RegisterAliasViewModel buildInitialViewModel(BlockersScreens.RegisterAliasScreen registerAliasScreen);

    String getTitleText(BlockersScreens.RegisterAliasScreen registerAliasScreen, boolean z, boolean z2, BlockersScreens.RegisterAliasScreen.Mode mode);

    String hintText(BlockersScreens.RegisterAliasScreen registerAliasScreen, boolean z, boolean z2, BlockersScreens.RegisterAliasScreen.Mode mode);

    boolean isCountrySelectorEnabled();

    boolean isModeSwitchable(BlockersScreens.RegisterAliasScreen registerAliasScreen, boolean z);

    boolean showUpdatedTerms(BlockersScreens.RegisterAliasScreen registerAliasScreen, AliasType aliasType, CountryOnboardingConfig countryOnboardingConfig);

    String termsText(BlockersScreens.RegisterAliasScreen registerAliasScreen, AliasType aliasType, CountryOnboardingConfig countryOnboardingConfig);
}
