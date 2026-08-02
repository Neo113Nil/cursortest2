package com.squareup.cash.afterpayapplet.applets.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.network.NetworkFetcher$doFetch$2;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.cashsuggest.api.CreditLineData;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSnapshot;
import com.squareup.protos.cash.cashsuggest.api.CreditLineType;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.cash.Countries;
import com.squareup.util.cash.StringsKt;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes5.dex */
public final class AfterpayAppletTilePresenter implements MoleculePresenter {
    public final RealAfterpayAppletAnalytics afterpayAppletAnalytics;
    public final String appletFlowToken;
    public final MoneyAnalyticsService moneyAnalyticsService;
    public final MoneyFormatter moneyFormatter;
    public final Navigator navigator;
    public final VerifyCheckDialogPresenter promotedAppletTilePresenter;
    public final RealAfterpayAppletRepository repository;
    public final KeyValue seenInstalledAfterpayAppletTile;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AfterpayAppletEntrypoint.TileConfiguration.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Alignment.Companion companion = AfterpayAppletEntrypoint.TileConfiguration.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CreditLineType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Channel.Companion companion2 = CreditLineType.Companion;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Channel.Companion companion3 = CreditLineType.Companion;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Channel.Companion companion4 = CreditLineType.Companion;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Channel.Companion companion5 = CreditLineType.Companion;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public AfterpayAppletTilePresenter(Navigator navigator, RealAfterpayAppletRepository realAfterpayAppletRepository, LocalizedMoneyFormatter.Factory factory, MoneyAnalyticsService moneyAnalyticsService, RealUuidGenerator realUuidGenerator, KeyValue keyValue, RealAfterpayAppletAnalytics realAfterpayAppletAnalytics, PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl) {
        navigator.getClass();
        this.navigator = navigator;
        this.repository = realAfterpayAppletRepository;
        this.moneyAnalyticsService = moneyAnalyticsService;
        this.seenInstalledAfterpayAppletTile = keyValue;
        this.afterpayAppletAnalytics = realAfterpayAppletAnalytics;
        this.promotedAppletTilePresenter = promotedAppletTilePresenter$Factory$Impl.create(AppletId.AFTERPAY);
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        String m = re$$ExternalSyntheticOutline0.m();
        this.appletFlowToken = m;
        realAfterpayAppletAnalytics.afterpayAppletFlowToken = m;
    }

    public static CreditLineData allCreditLine(CreditLineSnapshot creditLineSnapshot) {
        for (CreditLineData creditLineData : creditLineSnapshot.credit_lines) {
            if (creditLineData.line_type == CreditLineType.ALL) {
                return creditLineData;
            }
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
        return null;
    }

    public static StackedAvatarViewModel.Avatar createAvatarFromUiAvatar(UiAvatar uiAvatar) {
        StackedAvatarViewModel.Avatar avatar;
        return (uiAvatar == null || (avatar = StackedAvatarViewModelKt.toStackedAvatarViewModel(uiAvatar).avatar) == null) ? new StackedAvatarViewModel.Avatar(null, null, null, null, null, new Icon("logo-afterpay-24"), new ColorModel.Accented(new Color(new Color.ModeVariant("#FFFFFF", null, null, null, null, 30, null), new Color.ModeVariant("#FFFFFF", null, null, null, null, 30, null), 4)), new ColorModel.Accented(new Color(new Color.ModeVariant("#00E013", null, null, null, null, 30, null), new Color.ModeVariant("#00E013", null, null, null, null, 30, null), 4)), false, false, null, false, null, null, 129503) : avatar;
    }

    public static String getRequiredString(LocalizedString localizedString) {
        if (localizedString != null) {
            return StringsKt.translated(localizedString);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        return null;
    }

    public final String getRequiredMoney(Money money) {
        if (money != null) {
            return this.moneyFormatter.format(money);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        return null;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Object obj;
        Continuation continuation;
        MutableState mutableState;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2041897216);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue == obj2) {
            rememberedValue = StateFlowKt.mapState(Countries.observeState(this.seenInstalledAfterpayAppletTile), new ActivityTabViewKt$$ExternalSyntheticLambda17(13));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        VerifyCheckDialogPresenter verifyCheckDialogPresenter = this.promotedAppletTilePresenter;
        verifyCheckDialogPresenter.getClass();
        gapComposer.startReplaceGroup(-1613152821);
        boolean changed = gapComposer.changed(((AppletId) verifyCheckDialogPresenter.navigator).ordinal());
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == obj2) {
            rememberedValue2 = new InviteContactsPresenter$special$$inlined$map$1(((RealPromotedAppletTileStore) verifyCheckDialogPresenter.args).getPromotedAppletTiles(), verifyCheckDialogPresenter, 17);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Object obj3 = (PromotedAppletTileViewModel) Updater.collectAsState((Flow) rememberedValue2, PromotedAppletTileViewModel.Loading.INSTANCE, null, gapComposer, 0, 2).getValue();
        gapComposer.end(false);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj2) {
            rememberedValue3 = Updater.mutableStateOf$default((AfterpayAppletTileViewModel.Loading) collectAsState.getValue());
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) rememberedValue3;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(collectAsState);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue4 == obj2) {
            obj = this;
            continuation = null;
            mutableState = mutableState2;
            Object editProfilePresenter$models$2$1 = new EditProfilePresenter$models$2$1(22, mutableState, obj, collectAsState, continuation);
            gapComposer.updateRememberedValue(editProfilePresenter$models$2$1);
            rememberedValue4 = editProfilePresenter$models$2$1;
        } else {
            obj = this;
            continuation = null;
            mutableState = mutableState2;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue4);
        MutableState mutableState3 = mutableState;
        Continuation continuation2 = continuation;
        Updater.LaunchedEffect(gapComposer, flow, new zzmo(flow, continuation2, obj, mutableState3, 27));
        AfterpayAppletTileViewModel afterpayAppletTileViewModel = (AfterpayAppletTileViewModel) mutableState3.getValue();
        boolean changedInstance2 = gapComposer.changedInstance(obj);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == obj2) {
            rememberedValue5 = new NetworkFetcher$doFetch$2(obj, mutableState3, continuation2, 29);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.LaunchedEffect(gapComposer, afterpayAppletTileViewModel, (Function2) rememberedValue5);
        AfterpayAppletTileViewModel afterpayAppletTileViewModel2 = (AfterpayAppletTileViewModel) mutableState3.getValue();
        boolean changedInstance3 = gapComposer.changedInstance(obj3);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue6 == obj2) {
            rememberedValue6 = new SearchBarBinding$Content$1$1(obj3, mutableState3, continuation2, 8);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        Updater.LaunchedEffect(afterpayAppletTileViewModel2, obj3, (Function2) rememberedValue6, gapComposer);
        AfterpayAppletTileViewModel afterpayAppletTileViewModel3 = (AfterpayAppletTileViewModel) mutableState3.getValue();
        gapComposer.end(false);
        return afterpayAppletTileViewModel3;
    }
}
