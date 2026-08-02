package com.squareup.cash.investing.presenters.families;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.family.familyhub.backend.api.DependentRecurringPreference;
import com.squareup.cash.family.familyhub.backend.api.DependentRecurringPreferenceStore;
import com.squareup.cash.family.familyhub.backend.real.RealDependentRecurringPreferenceStore;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.families.DependentAutoInvestRecurringPurchaseViewModel;
import com.squareup.cash.investing.viewmodels.families.DependentAutoInvestViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Icon;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Image;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncRecurringPreference;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class InvestingDependentAutoInvestPresenter implements MoleculePresenter {
    public final DependentRecurringPreferenceStore dependentRecurringPreferenceStore;
    public final RealInvestmentEntities investmentEntities;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final InvestingScreens.InvestingHome screen;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurringSchedule.Frequency.values().length];
            try {
                iArr[RecurringSchedule.Frequency.EVERY_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_TWO_WEEKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InvestingDependentAutoInvestPresenter(AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, DependentRecurringPreferenceStore dependentRecurringPreferenceStore, RealInvestmentEntities realInvestmentEntities, InvestingScreens.InvestingHome investingHome, BetterNavigator.ScreenNavigator screenNavigator) {
        investingHome.getClass();
        this.stringManager = androidStringManager;
        this.dependentRecurringPreferenceStore = dependentRecurringPreferenceStore;
        this.investmentEntities = realInvestmentEntities;
        this.screen = investingHome;
        this.navigator = screenNavigator;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.squareup.cash.investing.viewmodels.families.DependentAutoInvestRecurringPurchaseViewModel] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.squareup.cash.investing.viewmodels.families.DependentAutoInvestRecurringPurchaseViewModel] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final DependentAutoInvestViewModel models(Flow flow, Composer composer, int i) {
        ScheduledTransactionPreference scheduledTransactionPreference;
        String str;
        String displayName;
        Character firstOrNull;
        String displayName2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-930771741);
        Continuation continuation = null;
        r5 = 0;
        ?? r5 = 0;
        Continuation continuation2 = null;
        Updater.LaunchedEffect(gapComposer, flow, new InvestingHomeView$onScrollFlow$1(flow, continuation, this, 21));
        String str2 = this.screen.dependentCustomerToken;
        str2.getClass();
        DependentRecurringPreference investingRecurringPreference = ((RealDependentRecurringPreferenceStore) this.dependentRecurringPreferenceStore).investingRecurringPreference(str2, gapComposer);
        AndroidStringManager androidStringManager = this.stringManager;
        String str3 = androidStringManager.get(R.string.dependent_auto_invest_title);
        if (investingRecurringPreference.equals(DependentRecurringPreference.RecurringPreferenceFailedToLoad.INSTANCE)) {
            gapComposer.startReplaceGroup(1258859266);
            gapComposer.end(false);
        } else if (investingRecurringPreference.equals(DependentRecurringPreference.RecurringPreferenceLoading.INSTANCE)) {
            gapComposer.startReplaceGroup(1258932674);
            gapComposer.end(false);
        } else {
            if (!(investingRecurringPreference instanceof DependentRecurringPreference.RecurringPreferenceLoaded)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -375034556, false);
            }
            gapComposer.startReplaceGroup(1259224943);
            SyncRecurringPreference syncRecurringPreference = ((DependentRecurringPreference.RecurringPreferenceLoaded) investingRecurringPreference).syncRecurringPreference;
            if (syncRecurringPreference == null || (scheduledTransactionPreference = syncRecurringPreference.preference) == null || !Intrinsics.areEqual(scheduledTransactionPreference.enabled, Boolean.TRUE)) {
                scheduledTransactionPreference = null;
            }
            if (scheduledTransactionPreference == null) {
                gapComposer.startReplaceGroup(1259224942);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1259224943);
                String str4 = scheduledTransactionPreference.investment_entity_token;
                if (str4 != null) {
                    boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(str4);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new InvestingHomeView$onScrollFlow$1(this, str4, continuation, 22);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    MutableState produceState = Updater.produceState(gapComposer, null, (Function2) rememberedValue);
                    StockDetails stockDetails = (StockDetails) produceState.getValue();
                    Image icon = stockDetails != null ? stockDetails.entityWithPrice.getIcon() : null;
                    StockDetails stockDetails2 = (StockDetails) produceState.getValue();
                    Color accentColor = stockDetails2 != null ? stockDetails2.entityWithPrice.getAccentColor() : null;
                    RecurringSchedule recurringSchedule = scheduledTransactionPreference.recurring_schedule;
                    RecurringSchedule.Frequency frequency = recurringSchedule != null ? recurringSchedule.frequency : null;
                    int i2 = frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
                    if (i2 == 1) {
                        str = androidStringManager.get(R.string.auto_invest_frequency_daily);
                    } else if (i2 == 2) {
                        str = androidStringManager.get(R.string.auto_invest_frequency_weekly);
                    } else {
                        if (i2 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("Unsupported frequency");
                            return null;
                        }
                        str = androidStringManager.get(R.string.auto_invest_frequency_biweekly);
                    }
                    String str5 = scheduledTransactionPreference.investment_entity_token;
                    String str6 = str5 == null ? "" : str5;
                    StockDetails stockDetails3 = (StockDetails) produceState.getValue();
                    String str7 = (stockDetails3 == null || (displayName2 = stockDetails3.entityWithPrice.getDisplayName()) == null) ? "" : displayName2;
                    StockDetails stockDetails4 = (StockDetails) produceState.getValue();
                    char charValue = (stockDetails4 == null || (displayName = stockDetails4.entityWithPrice.getDisplayName()) == null || (firstOrNull = StringsKt___StringsKt.firstOrNull(displayName)) == null) ? ' ' : firstOrNull.charValue();
                    Money money = scheduledTransactionPreference.amount;
                    if (money == null) {
                        money = new Money((Long) 0L, (CurrencyCode) null, 6);
                    }
                    String format2 = this.moneyFormatter.format(money);
                    format2.getClass();
                    str.getClass();
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    String format3 = new MessageFormat(resources.getString(R.string.dependent_auto_invest_schedule)).format(new Object[]{format2, str});
                    format3.getClass();
                    continuation = new DependentAutoInvestRecurringPurchaseViewModel((icon == null || accentColor == null) ? new InvestingCryptoAvatarContentModel$Icon(InvestingCryptoImage.ARROW_UP) : new InvestingCryptoAvatarContentModel$Image(icon, new ColorModel.Accented(accentColor)), str6, str7, charValue, format3);
                }
                gapComposer.end(false);
                continuation2 = continuation;
            }
            gapComposer.end(false);
            r5 = continuation2;
        }
        DependentAutoInvestViewModel dependentAutoInvestViewModel = new DependentAutoInvestViewModel(str3, r5);
        gapComposer.end(false);
        return dependentAutoInvestViewModel;
    }
}
