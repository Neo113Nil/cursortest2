package com.squareup.cash.blockers.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.IdvViewModel;
import com.squareup.cash.blockers.viewmodels.SsnViewModel;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.recipient.RecipientSearchViewBlocker;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.ConfirmRecipientDialogViewModel;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.cash.recipients.analytics.RecipientAnalyticsKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.franklin.api.Region;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.Regions;
import com.squareup.wire.GrpcStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import papa.PapaEvent;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class SsnPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object args;
    public final Object blockersHelper;
    public final Object idvPresenter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Object region;
    public final boolean showHelpButton;
    public final AndroidStringManager stringManager;
    public final Comparable titleOverride;

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[Region.CAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SsnPresenter(AndroidStringManager androidStringManager, RealIdvPresenter$RealIdvPresenterFactory$Impl realIdvPresenter$RealIdvPresenterFactory$Impl, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockersScreens.SsnScreen ssnScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        boolean z = false;
        this.stringManager = androidStringManager;
        this.args = ssnScreen;
        this.navigator = screenNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.region = ssnScreen.blockersData.region;
        this.titleOverride = (String) ssnScreen.titleOverride.getValue();
        this.idvPresenter = realIdvPresenter$RealIdvPresenterFactory$Impl.create$1(ssnScreen);
        List list = ssnScreen.helpItems;
        if (list != null && !list.isEmpty()) {
            z = true;
        }
        this.showHelpButton = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r20v8, types: [java.lang.Character] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        SsnViewModel ssnViewModel;
        String str;
        int i2 = this.$r8$classId;
        Object obj = this.args;
        AndroidStringManager androidStringManager = this.stringManager;
        Comparable comparable = this.titleOverride;
        Object obj2 = this.idvPresenter;
        Object obj3 = this.region;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(1111467616);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                Continuation continuation = null;
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new CardModelView.AnonymousClass1.C00581(this, continuation, 8);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = PapaEvent.Channel$default(-2, null, null, 6);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Channel channel = (Channel) rememberedValue3;
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = FlowKt.shareIn(FlowKt.consumeAsFlow(channel), coroutineScope, SharingStarted.Companion.Lazily, 0);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                IdvViewModel idvViewModel = (IdvViewModel) disclosurePresenter.models((Flow) rememberedValue4, (Composer) gapComposer, 0);
                boolean changed = gapComposer.changed(idvViewModel.isLoading);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changed || rememberedValue5 == neverEqualPolicy) {
                    boolean z = idvViewModel.isLoading;
                    String str2 = (String) comparable;
                    BlockersScreens.SsnScreen ssnScreen = (BlockersScreens.SsnScreen) obj;
                    boolean z2 = ssnScreen.idvFlow;
                    Redacted redacted = ssnScreen.ssn;
                    boolean z3 = ssnScreen.fullSsn;
                    Region region = (Region) obj3;
                    if (WhenMappings.$EnumSwitchMapping$0[region.ordinal()] != 1) {
                        if (region != Region.USA) {
                            Timber.Forest.e(new IllegalStateException(String.format("Ssn Blocker for region %s", Arrays.copyOf(new Object[]{region}, 1))));
                        }
                        if (z3) {
                            if (str2 == null) {
                                str2 = z2 ? androidStringManager.get(R.string.blockers_ssn_title_idv_full) : androidStringManager.get(R.string.blockers_ssn_title_pin_full);
                            }
                            ssnViewModel = new SsnViewModel(str2, androidStringManager.get(R.string.blockers_ssn_hint_full), 9, true, (Region) obj3, z, (String) redacted.getValue(), this.showHelpButton);
                        } else {
                            if (str2 == null) {
                                str2 = z2 ? androidStringManager.get(R.string.blockers_ssn_title_idv) : androidStringManager.get(R.string.blockers_ssn_title_pin);
                            }
                            ssnViewModel = new SsnViewModel(str2, androidStringManager.get(R.string.blockers_ssn_hint), 4, false, (Region) obj3, z, (String) redacted.getValue(), this.showHelpButton);
                        }
                    } else if (z3) {
                        if (str2 == null) {
                            str2 = z2 ? androidStringManager.get(R.string.blockers_sin_title_idv_full) : androidStringManager.get(R.string.blockers_sin_title_pin_full);
                        }
                        ssnViewModel = new SsnViewModel(str2, androidStringManager.get(R.string.blockers_sin_hint_full), 9, true, (Region) obj3, z, (String) redacted.getValue(), this.showHelpButton);
                    } else {
                        if (str2 == null) {
                            str2 = z2 ? androidStringManager.get(R.string.blockers_sin_title_idv) : androidStringManager.get(R.string.blockers_sin_title_pin);
                        }
                        ssnViewModel = new SsnViewModel(str2, androidStringManager.get(R.string.blockers_sin_hint), 4, false, (Region) obj3, z, (String) redacted.getValue(), this.showHelpButton);
                    }
                    rememberedValue5 = Updater.mutableStateOf$default(ssnViewModel);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Updater.LaunchedEffect(gapComposer, flow, new RealBoostSelector$removeBoost$1(flow, continuation, this, channel, 3));
                SsnViewModel ssnViewModel2 = (SsnViewModel) ((MutableState) rememberedValue5).getValue();
                gapComposer.end(false);
                return ssnViewModel2;
            default:
                Recipient recipient = (Recipient) comparable;
                Resources resources = androidStringManager.resources;
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1815726889);
                String str3 = null;
                ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = null;
                Updater.LaunchedEffect(gapComposer2, flow, new MainPaymentPresenter$models$4$4(flow, (Continuation) null, this, 13));
                Analytics analytics = (Analytics) obj;
                PaymentScreens.ConfirmRecipient confirmRecipient = (PaymentScreens.ConfirmRecipient) this.blockersHelper;
                PaymentScreens.ConfirmRecipient.Analytics analytics2 = confirmRecipient.analytics;
                if ((analytics2 != null ? Boolean.valueOf(analytics2.isRecipientSearchViewBlockerTracked) : null) == null || !analytics2.isRecipientSearchViewBlockerTracked) {
                    String str4 = analytics2 != null ? analytics2.externalId : null;
                    Map map = RecipientAnalyticsKt.SEARCH_TYPES;
                    analytics.track(new RecipientSearchViewBlocker(str4, analytics2 != null ? analytics2.origin : null, analytics2 != null ? analytics2.entityToken : null, analytics2 != null ? analytics2.blockerReason : null, analytics2 != null ? analytics2.queryToken : null), null);
                }
                if (analytics2 != null) {
                    analytics2.isRecipientSearchViewBlockerTracked = true;
                }
                int ordinal = confirmRecipient.recipientConfirmationType.ordinal();
                if (ordinal == 0) {
                    String fromString = Cashtags.fromString(recipient.cashtag, recipient.region);
                    if (fromString == null) {
                        fromString = "";
                    }
                    String str5 = fromString;
                    String str6 = recipient.displayName;
                    str6.getClass();
                    ArrayMap arrayMap = new ArrayMap(1);
                    arrayMap.put("customerName", str6);
                    resources.getClass();
                    String format2 = new MessageFormat(resources.getString(R.string.send_payment_confirm_recipient)).format(arrayMap);
                    format2.getClass();
                    AvatarViewModel avatarViewModel = (AvatarViewModel) obj2;
                    String str7 = confirmRecipient.recipient.displayName;
                    Continuation monogram = str7 != null ? GrpcStatus.Companion.monogram(str7) : null;
                    confirmRecipientDialogViewModel = new ConfirmRecipientDialogViewModel(str5, format2, this.showHelpButton, avatarViewModel, monogram, androidStringManager.get(R.string.send_payment_confirm_recipient_positive), null, 64);
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return confirmRecipientDialogViewModel;
                    }
                    Region region2 = recipient.region;
                    if (region2 != null) {
                        RealLocaleManager realLocaleManager = (RealLocaleManager) obj3;
                        int i3 = Regions.WhenMappings.$EnumSwitchMapping$0[region2.ordinal()];
                        if (i3 == 1) {
                            str = androidStringManager.get(R.string.gbr_region_country_name_with_article);
                        } else if (i3 != 2) {
                            str = new Locale(((Locale) realLocaleManager.resolvedLocale.$$delegate_0.getValue()).toLanguageTag(), Regions.toCountry(region2).name()).getDisplayCountry();
                            str.getClass();
                        } else {
                            str = androidStringManager.get(R.string.usa_region_country_name_with_article);
                        }
                        str3 = str;
                    }
                    String str8 = androidStringManager.get(R.string.send_payment_confirm_country_title);
                    String str9 = recipient.cashtag;
                    if (str9 == null) {
                        str9 = recipient.displayName;
                        str9.getClass();
                    }
                    ArrayMap m = SVG$Unit$EnumUnboxingLocalUtility.m(2, str3, "recipientRegion", str3);
                    m.put("cashtag", str9);
                    resources.getClass();
                    String format3 = new MessageFormat(resources.getString(R.string.send_payment_confirm_recipient_region)).format(m);
                    format3.getClass();
                    confirmRecipientDialogViewModel = new ConfirmRecipientDialogViewModel(str8, format3, this.showHelpButton, (AvatarViewModel) obj2, null, androidStringManager.get(R.string.confirm_recipient_dialog_primary_button_text), confirmRecipient.flagEmoji, 16);
                }
                gapComposer2.end(false);
                return confirmRecipientDialogViewModel;
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider blockersHelperFactory;
        public final Provider idvPresenterFactory;
        public final LambdaProvider stringManager;

        public MetroFactory(RealMessageSigner.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck) {
            this.idvPresenterFactory = doubleCheck;
            this.blockersHelperFactory = metroFactory;
            this.stringManager = lambdaProvider;
        }

        public MetroFactory(IntentLauncher.MetroFactory metroFactory, LambdaProvider lambdaProvider, RealBrazeManager.MetroFactory metroFactory2) {
            this.idvPresenterFactory = metroFactory;
            this.stringManager = lambdaProvider;
            this.blockersHelperFactory = metroFactory2;
        }

        public /* synthetic */ MetroFactory(LambdaProvider lambdaProvider, Factory factory, Factory factory2) {
            this.stringManager = lambdaProvider;
            this.idvPresenterFactory = factory;
            this.blockersHelperFactory = factory2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r3 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SsnPresenter(AndroidStringManager androidStringManager, Analytics analytics, PaymentScreens.ConfirmRecipient confirmRecipient, BetterNavigator.ScreenNavigator screenNavigator, RealLocaleManager realLocaleManager) {
        boolean z = true;
        confirmRecipient.getClass();
        this.stringManager = androidStringManager;
        this.args = analytics;
        this.blockersHelper = confirmRecipient;
        this.navigator = screenNavigator;
        this.region = realLocaleManager;
        Recipient recipient = confirmRecipient.recipient;
        this.titleOverride = recipient;
        this.idvPresenter = RecipientAvatars.avatarViewModel(recipient);
        if (confirmRecipient.includeViewProfileOption) {
            String str = recipient.customerId;
            if (str == null && (str = recipient.sms) == null) {
                str = recipient.email;
            }
        }
        z = false;
        this.showHelpButton = z;
    }
}
