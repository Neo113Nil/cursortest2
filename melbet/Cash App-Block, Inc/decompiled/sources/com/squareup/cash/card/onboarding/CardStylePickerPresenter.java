package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.db.LocalTabContentQueries;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.card.onboarding.screens.CardStyleScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.CardCustomizationBlocker;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class CardStylePickerPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppConfigManager appConfig;
    public final CardStyleScreen args;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final LocalTabContentQueries cardStudioQueries;
    public final CashAccountDatabaseImpl cashDatabase;
    public final RealFilamentSupportProvider filamentSupportProvider;
    public final CoroutineContext ioDispatcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealProfileManager profileManager;

    /* loaded from: classes4.dex */
    public final class CardCustomization {
        public final boolean cashtagEnabled;
        public final TouchData touchData;

        public CardCustomization(boolean z, TouchData touchData) {
            this.cashtagEnabled = z;
            this.touchData = touchData;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardCustomizationBlocker.CardOption.CashtagDisplay.values().length];
            try {
                iArr[CardCustomizationBlocker.CardOption.CashtagDisplay.ALWAYS_HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardCustomizationBlocker.CardOption.CashtagDisplay.OPTIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardCustomizationBlocker.CardOption.CashtagDisplay.ALWAYS_SHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CardStylePickerPresenter(CardStyleScreen cardStyleScreen, BetterNavigator.ScreenNavigator screenNavigator, RealProfileManager realProfileManager, Analytics analytics, BlockerFlowListener blockerFlowListener, AppConfigManager appConfigManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealFilamentSupportProvider realFilamentSupportProvider, CoroutineContext coroutineContext) {
        cardStyleScreen.getClass();
        this.args = cardStyleScreen;
        this.navigator = screenNavigator;
        this.profileManager = realProfileManager;
        this.analytics = analytics;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.appConfig = appConfigManager;
        this.cashDatabase = cashAccountDatabaseImpl;
        this.filamentSupportProvider = realFilamentSupportProvider;
        this.ioDispatcher = coroutineContext;
        this.cardStudioQueries = cashAccountDatabaseImpl.cardStudioQueries;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        boolean z;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1395109544);
        Continuation continuation = null;
        Updater.LaunchedEffect(gapComposer, flow, new CardStudioPresenter$models$1$1(flow, continuation, this, 8));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new CardStylePickerPresenter$models$2$1(this, continuation, i2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new CardStudioPresenter$models$1$1(this, continuation, 9);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState produceState = Updater.produceState(gapComposer, "", (Function2) rememberedValue2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(new CustomizationDetails());
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState3 = (MutableState) rememberedValue4;
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
            mutableState = mutableState3;
            RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$1 = new RealBoostSelector$removeBoost$1(23, mutableState, mutableState2, this, continuation);
            gapComposer.updateRememberedValue(realBoostSelector$removeBoost$1);
            rememberedValue5 = realBoostSelector$removeBoost$1;
        } else {
            mutableState = mutableState3;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue5);
        CardStyleScreen cardStyleScreen = this.args;
        String str = cardStyleScreen.style_picker_title_text;
        List list = cardStyleScreen.cardSections;
        String str2 = cardStyleScreen.style_picker_short_title_text;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str3 = ((CardCustomizationBlocker.CardOptionSection) it.next()).short_title_text;
            if (str3 != null) {
                arrayList.add(str3);
            }
        }
        int i3 = 10;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            CardCustomizationBlocker.CardOptionSection cardOptionSection = (CardCustomizationBlocker.CardOptionSection) it2.next();
            String str4 = cardOptionSection.header_text;
            List<CardCustomizationBlocker.CardOption> list3 = cardOptionSection.options;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, i3));
            for (CardCustomizationBlocker.CardOption cardOption : list3) {
                CardCustomizationBlocker.CardOption.CashtagDisplay cashtagDisplay = cardOption.cashtag_display;
                cashtagDisplay.getClass();
                int i4 = WhenMappings.$EnumSwitchMapping$0[cashtagDisplay.ordinal()];
                if (i4 == 1) {
                    z = false;
                } else if (i4 == 2) {
                    z = ((Boolean) mutableState2.getValue()).booleanValue();
                } else {
                    if (i4 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    z = true;
                }
                String str5 = (String) produceState.getValue();
                CardTheme cardTheme = cardOption.card_theme;
                cardTheme.getClass();
                CardTheme.Gradient gradient = cardTheme.gradient_style;
                CardTheme.Identifier identifier = cardTheme.id;
                MutableState mutableState4 = mutableState;
                CardTheme.Identifier identifier2 = CardTheme.Identifier.TORTOISE_ID;
                MutableState mutableState5 = mutableState2;
                CardTheme copy$default = CardTheme.copy$default(cardTheme, identifier != identifier2 ? gradient : null, null, null, 16775167);
                Boolean bool = cardOption.customization_eligible;
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                CustomizationDetails customizationDetails = (CustomizationDetails) mutableState4.getValue();
                CardTheme cardTheme2 = cardOption.card_theme;
                cardTheme2.getClass();
                StyledCardViewModel styledCardViewModel = new StyledCardViewModel(str5, z, copy$default, booleanValue, customizationDetails, null, cardTheme2.id == identifier2, cardOption.payment_method, null, null, null, null, null, 64224);
                String str6 = cardOption.intro_text;
                Color color = cardOption.intro_text_color;
                String str7 = cardOption.title;
                Iterator it3 = it2;
                String str8 = cardOption.detail_text;
                UnleashContext unleashContext = new UnleashContext();
                unleashContext.userId = str6;
                unleashContext.properties = color;
                unleashContext.sessionId = str7;
                unleashContext.remoteAddress = str8;
                String str9 = cardOption.accessibility_text;
                if (str9 == null) {
                    str9 = Boxes$$ExternalSyntheticOutline1.m$1(str6, " ", str7, " ", str8);
                }
                arrayList3.add(new CardStyleItemViewModel(styledCardViewModel, unleashContext, str9, cardOption.card_availability != CardCustomizationBlocker.CardOption.CardAvailability.UNAVAILABLE));
                it2 = it3;
                mutableState = mutableState4;
                mutableState2 = mutableState5;
            }
            arrayList2.add(new CardStyleSectionViewModel(str4, arrayList3));
            mutableState = mutableState;
            i3 = 10;
        }
        CardStylePickerViewModel cardStylePickerViewModel = new CardStylePickerViewModel(str, str2, arrayList, arrayList2);
        gapComposer.end(false);
        return cardStylePickerViewModel;
    }
}
