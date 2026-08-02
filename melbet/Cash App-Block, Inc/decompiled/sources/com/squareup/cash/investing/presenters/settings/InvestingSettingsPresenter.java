package com.squareup.cash.investing.presenters.settings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.emoji2.text.MetadataRepo;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.presenters.navigation.RealInvestingInboundNavigator$Factory$Impl;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiCategoryNotificationPreference;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiNotificationSettings;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.DropMode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class InvestingSettingsPresenter implements MoleculePresenter {
    public static final List STOCK_CATEGORIES = CollectionsKt__CollectionsKt.listOf((Object[]) new NotificationCategory[]{NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_FOLLOWED_STOCK_EARNINGS_REPORTS, NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_FOLLOWED_STOCK_PRICE_CHANGES, NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_OWNED_STOCK_EARNINGS_REPORTS, NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_OWNED_STOCK_PRICE_CHANGES});
    public final MetadataRepo inboundNavigator;
    public final RealInvestingStateManager investingStateManager;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealProfileNotificationsRepository repository;
    public final SessionManager sessionManager;
    public final AndroidStringManager stringManager;

    public InvestingSettingsPresenter(AndroidStringManager androidStringManager, RealInvestingStateManager realInvestingStateManager, RealInvestingInboundNavigator$Factory$Impl realInvestingInboundNavigator$Factory$Impl, RealProfileNotificationsRepository realProfileNotificationsRepository, SessionManager sessionManager, BetterNavigator.ScreenNavigator screenNavigator) {
        this.stringManager = androidStringManager;
        this.investingStateManager = realInvestingStateManager;
        this.repository = realProfileNotificationsRepository;
        this.sessionManager = sessionManager;
        this.navigator = screenNavigator;
        this.inboundNavigator = realInvestingInboundNavigator$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        DropMode dropMode;
        List list;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1559208227);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = this.repository.getNotificationSettings();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        InvestingSettingsViewModel.Section section = 0;
        section = 0;
        section = 0;
        section = 0;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Updater.LaunchedEffect(gapComposer, flow, new InvestingHomeView$onScrollFlow$1(flow, (Continuation) section, this, 24));
        InvestingState investingStates = this.investingStateManager.investingStates(gapComposer);
        boolean equals = investingStates.equals(InvestingState.Loading.INSTANCE);
        AndroidStringManager androidStringManager = this.stringManager;
        if (equals) {
            dropMode = null;
        } else {
            if (!(investingStates instanceof InvestingState.Content)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            int ordinal = ((InvestingState.Content) investingStates).dividendState.ordinal();
            if (ordinal == 0) {
                final String upperCase = androidStringManager.get(R.string.investing_settings_sublabel_on).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                dropMode = new DropMode(upperCase) { // from class: com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewModel$Entry$SubLabel$Highlight
                    public final String text;

                    {
                        upperCase.getClass();
                        this.text = upperCase;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof InvestingSettingsViewModel$Entry$SubLabel$Highlight) && Intrinsics.areEqual(this.text, ((InvestingSettingsViewModel$Entry$SubLabel$Highlight) obj).text);
                    }

                    @Override // defpackage.DropMode
                    public final String getText() {
                        return this.text;
                    }

                    public final int hashCode() {
                        return this.text.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Highlight(text=", this.text, ")");
                    }
                };
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                final String upperCase2 = androidStringManager.get(R.string.investing_settings_sublabel_off).toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                dropMode = new DropMode(upperCase2) { // from class: com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewModel$Entry$SubLabel$Standard
                    public final String text;

                    {
                        upperCase2.getClass();
                        this.text = upperCase2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof InvestingSettingsViewModel$Entry$SubLabel$Standard) && Intrinsics.areEqual(this.text, ((InvestingSettingsViewModel$Entry$SubLabel$Standard) obj).text);
                    }

                    @Override // defpackage.DropMode
                    public final String getText() {
                        return this.text;
                    }

                    public final int hashCode() {
                        return this.text.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Standard(text=", this.text, ")");
                    }
                };
            }
        }
        String str = androidStringManager.get(R.string.investing_settings_title);
        InvestingSettingsViewModel.Section section2 = new InvestingSettingsViewModel.Section(androidStringManager.get(R.string.investing_settings_alerts_section_title), CollectionsKt__CollectionsJVMKt.listOf(new InvestingSettingsViewModel.Entry(InvestingSettingsViewModel.Entry.Type.NOTIFICATIONS, androidStringManager.get(R.string.investing_settings_notifications_label), null, androidStringManager.get(R.string.investing_settings_notifications_action_description))));
        UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) collectAsState.getValue();
        if (uiNotificationSettings != null && (list = uiNotificationSettings.category_preferences) != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (CollectionsKt.contains(STOCK_CATEGORIES, ((UiCategoryNotificationPreference) it.next()).category)) {
                        section = section2;
                        break;
                    }
                }
            }
        }
        InvestingSettingsViewModel investingSettingsViewModel = new InvestingSettingsViewModel(str, ArraysKt___ArraysKt.filterNotNull(new InvestingSettingsViewModel.Section[]{section, new InvestingSettingsViewModel.Section(androidStringManager.get(R.string.investing_settings_investments_section_title), CollectionsKt__CollectionsJVMKt.listOf(new InvestingSettingsViewModel.Entry(InvestingSettingsViewModel.Entry.Type.DIVIDEND_REINVESTMENT, androidStringManager.get(R.string.investing_settings_drip_label), dropMode, androidStringManager.get(R.string.investing_settings_drip_action_description))))}));
        gapComposer.end(false);
        return investingSettingsViewModel;
    }
}
