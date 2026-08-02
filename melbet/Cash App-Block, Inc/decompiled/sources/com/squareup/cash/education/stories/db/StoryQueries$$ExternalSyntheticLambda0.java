package com.squareup.cash.education.stories.db;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.charting.viewmodels.EarningsBarViewModel;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.common.moneyformatter.FractionDigitsStrategy;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.moneyformatter.NumberFormat;
import com.squareup.cash.common.moneyformatter.RoundingMode;
import com.squareup.cash.common.moneyformatter.UnitMagnitudeFormat;
import com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileModel;
import com.squareup.cash.earningstracker.viewmodels.EarningsTimeframeSelectorSheetViewEvent;
import com.squareup.cash.earningstracker.viewmodels.NetEarningsInfoSheetViewEvent;
import com.squareup.cash.family.applets.viewmodels.AllowanceAppletTileViewModel;
import com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.money.core.ids.AppletTileUninstallationSectionId;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.cash.moneyformatter.fakes.UnlocalizedMoneyFormatter;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipState;
import com.squareup.protos.cash.cashbusinessaccounts.EarningsTrackerSummary;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Month;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.savings.SavingsConfig;

/* loaded from: classes6.dex */
public final /* synthetic */ class StoryQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ StoryQueries$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        FamilyProfile.Standard standard = FamilyProfile.Standard.INSTANCE;
        AppletTileInstallationState.Loading loading = AppletTileInstallationState.Loading.INSTANCE;
        int i2 = 6;
        AppletTileInstallationState.Installed installed = AppletTileInstallationState.Installed.INSTANCE;
        AppletTileInstallationState.Uninstalled uninstalled = AppletTileInstallationState.Uninstalled.INSTANCE;
        CurrencyCode currencyCode = null;
        switch (i) {
            case 0:
                StoryQueries$selectWithSceneData$2 storyQueries$selectWithSceneData$2 = StoryQueries$selectWithSceneData$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                String string2 = androidCursor.getString(1);
                String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                String string3 = androidCursor.getString(3);
                string3.getClass();
                String string4 = androidCursor.getString(4);
                Long l = androidCursor.getLong(5);
                Long l2 = androidCursor.getLong(6);
                Long m2 = re$$ExternalSyntheticOutline0.m(l2, androidCursor, 7);
                Long l3 = androidCursor.getLong(8);
                Long l4 = androidCursor.getLong(9);
                Long l5 = androidCursor.getLong(10);
                String string5 = androidCursor.getString(11);
                long longValue = l2.longValue();
                long longValue2 = m2.longValue();
                string2.getClass();
                string3.getClass();
                return new SelectWithSceneData(m1431m, string2, m, string3, string4, l, longValue, longValue2, l3, l4, l5, string5);
            case 1:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 2:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    return AppletAvailabilityState.LOADING;
                }
                if (bool.equals(Boolean.TRUE)) {
                    return AppletAvailabilityState.AVAILABLE;
                }
                if (bool.equals(Boolean.FALSE)) {
                    return AppletAvailabilityState.UNAVAILABLE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 3:
                EarningsAppletTileModel earningsAppletTileModel = (EarningsAppletTileModel) obj;
                earningsAppletTileModel.getClass();
                return earningsAppletTileModel instanceof EarningsAppletTileModel.Uninstalled ? AppletTileUninstallationSectionId.DEFAULT : AppletTileUninstallationSectionId.BANKING;
            case 4:
                EarningsAppletTileModel earningsAppletTileModel2 = (EarningsAppletTileModel) obj;
                earningsAppletTileModel2.getClass();
                if (earningsAppletTileModel2 instanceof EarningsAppletTileModel.Installed) {
                    return installed;
                }
                if (earningsAppletTileModel2 instanceof EarningsAppletTileModel.Uninstalled) {
                    return uninstalled;
                }
                if (earningsAppletTileModel2 instanceof EarningsAppletTileModel.Failure) {
                    return new AppletTileInstallationState.Failure(((EarningsAppletTileModel.Failure) earningsAppletTileModel2).cause);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 5:
                EarningsTrackerSummary earningsTrackerSummary = (EarningsTrackerSummary) obj;
                earningsTrackerSummary.getClass();
                return earningsTrackerSummary.first_business_upgrade_at;
            case 6:
                String lowerCase = Month.of(((Integer) obj).intValue()).name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (lowerCase.length() <= 0) {
                    return lowerCase;
                }
                return Character.toUpperCase(lowerCase.charAt(0)) + lowerCase.substring(1);
            case 7:
                ((EarningsTimeframeSelectorSheetViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                ((EarningsTimeframeSelectorSheetViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                ((NetEarningsInfoSheetViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                ((EarningsBarViewModel) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                Long l6 = (Long) obj;
                l6.getClass();
                RoundingMode roundingMode = RoundingMode.HALF_UP;
                MoneyFormatterConfig moneyFormatterConfig = MoneyFormatterConfig.COMPACT;
                UnitMagnitudeFormat unitMagnitudeFormat = UnitMagnitudeFormat.ABBREVIATED;
                return new UnlocalizedMoneyFormatter(MoneyFormatterConfig.copy$default(moneyFormatterConfig, new NumberFormat.Abbreviated(roundingMode, FractionDigitsStrategy.BALANCED), null, null, 30)).format(new Money(l6, currencyCode, i2));
            case 12:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                List list = (List) obj;
                list.getClass();
                long longValue3 = ((Number) CollectionsKt.maxOrThrow(list)).longValue();
                if (longValue3 == 0) {
                    longValue3 = 10000;
                } else if (longValue3 <= 100) {
                    longValue3 = 100;
                } else {
                    long j = longValue3 % 200;
                    if (j != 0) {
                        longValue3 = (longValue3 + 200) - j;
                    }
                }
                return Long.valueOf(longValue3);
            case 14:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("education_story_scene_data");
                return Unit.INSTANCE;
            case 15:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("education_story_scene_data");
                return Unit.INSTANCE;
            case 16:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("education_story");
                function13.invoke("education_story_scene_data");
                return Unit.INSTANCE;
            case 17:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("education_story");
                return Unit.INSTANCE;
            case 18:
                StoryQueries$selectBySlug$2 storyQueries$selectBySlug$2 = StoryQueries$selectBySlug$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                String string6 = androidCursor2.getString(1);
                String m3 = Matcher$$ExternalSyntheticOutline0.m(string6, androidCursor2, 2);
                String string7 = androidCursor2.getString(3);
                string7.getClass();
                String string8 = androidCursor2.getString(4);
                Long l7 = androidCursor2.getLong(5);
                Long l8 = androidCursor2.getLong(6);
                Long m4 = re$$ExternalSyntheticOutline0.m(l8, androidCursor2, 7);
                Long l9 = androidCursor2.getLong(8);
                Long l10 = androidCursor2.getLong(9);
                Long l11 = androidCursor2.getLong(10);
                String string9 = androidCursor2.getString(11);
                long longValue4 = l8.longValue();
                long longValue5 = m4.longValue();
                string6.getClass();
                string7.getClass();
                return new SelectBySlug(m1431m2, string6, m3, string7, string8, l7, longValue4, longValue5, l9, l10, l11, string9);
            case 19:
                Sponsor sponsor = (Sponsor) obj;
                if (sponsor != null) {
                    return sponsor.customer_token;
                }
                return null;
            case 20:
                FamilyProfile familyProfile = (FamilyProfile) obj;
                familyProfile.getClass();
                if (Intrinsics.areEqual(familyProfile, standard)) {
                    return AppletAvailabilityState.UNAVAILABLE;
                }
                if (familyProfile instanceof FamilyProfile.ManagedAccount) {
                    return AppletAvailabilityState.AVAILABLE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 21:
                FamilyProfile familyProfile2 = (FamilyProfile) obj;
                familyProfile2.getClass();
                if (Intrinsics.areEqual(familyProfile2, standard)) {
                    return AppletAvailabilityState.UNAVAILABLE;
                }
                if (familyProfile2 instanceof FamilyProfile.ManagedAccount) {
                    return AppletAvailabilityState.AVAILABLE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 22:
                AllowanceAppletTileViewModel allowanceAppletTileViewModel = (AllowanceAppletTileViewModel) obj;
                allowanceAppletTileViewModel.getClass();
                if (allowanceAppletTileViewModel instanceof AllowanceAppletTileViewModel.Loading) {
                    return loading;
                }
                if (allowanceAppletTileViewModel instanceof AllowanceAppletTileViewModel.Installed) {
                    return installed;
                }
                if (allowanceAppletTileViewModel instanceof AllowanceAppletTileViewModel.Uninstalled) {
                    return uninstalled;
                }
                if (allowanceAppletTileViewModel instanceof AllowanceAppletTileViewModel.Failure) {
                    return new AppletTileInstallationState.Failure((String) null);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 23:
                FamilyAppletTileViewModel familyAppletTileViewModel = (FamilyAppletTileViewModel) obj;
                familyAppletTileViewModel.getClass();
                if (familyAppletTileViewModel instanceof FamilyAppletTileViewModel.Loading) {
                    return loading;
                }
                if (familyAppletTileViewModel instanceof FamilyAppletTileViewModel.Installed) {
                    return installed;
                }
                if (familyAppletTileViewModel instanceof FamilyAppletTileViewModel.Uninstalled) {
                    return uninstalled;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 24:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("dependentLastSeenSavingsBalance");
                return Unit.INSTANCE;
            case 25:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("dependentLastSeenSavingsBalance");
                return Unit.INSTANCE;
            case 26:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("dependentLastSeenSavingsBalance");
                return Unit.INSTANCE;
            case 27:
                SavingsConfig.Yield yield = ((SavingsConfig) obj).yield;
                if (yield != null) {
                    return yield.yield_current_rate_enhanced;
                }
                return null;
            case 28:
                List list2 = (List) obj;
                list2.getClass();
                List list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (((Sponsor) it.next()).status == SponsorshipState.ACTIVE) {
                            return Boolean.valueOf(r3);
                        }
                    }
                }
                r3 = false;
                return Boolean.valueOf(r3);
            default:
                List list4 = (List) obj;
                list4.getClass();
                Sponsor sponsor2 = (Sponsor) CollectionsKt.firstOrNull(list4);
                return Boolean.valueOf(sponsor2 != null && sponsor2.status == SponsorshipState.SUSPENDED);
        }
    }
}
