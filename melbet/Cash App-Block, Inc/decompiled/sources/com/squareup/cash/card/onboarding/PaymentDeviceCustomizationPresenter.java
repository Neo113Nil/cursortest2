package com.squareup.cash.card.onboarding;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.nfc.NfcAdapter;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FormattedResources;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.presenters.LocalAddBrandsPresenter$models$2$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.card.onboarding.CollapsibleDetailsSection;
import com.squareup.cash.card.onboarding.CtaAction;
import com.squareup.cash.card.onboarding.GridItemVisual;
import com.squareup.cash.card.onboarding.IconGridSection;
import com.squareup.cash.card.onboarding.LabelsSection;
import com.squareup.cash.card.onboarding.ProductDetailsPageToastLabel;
import com.squareup.cash.card.onboarding.TileCarouselSection;
import com.squareup.cash.card.onboarding.db.CardStudio;
import com.squareup.cash.card.onboarding.screens.CardStudioScreen;
import com.squareup.cash.card.onboarding.screens.PaymentDeviceCustomizationScreen;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.formview.components.arcade.ArcadeFormDateInputView$Content$7$1;
import com.squareup.cash.graphics.swampgl.RealGraphicsSupportProvider;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.nfc.backend.real.RealNfcPaymentsManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinition;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.AvailableStampOption;
import com.squareup.protos.franklin.api.CardCustomizationBlocker;
import com.squareup.protos.franklin.api.LabelTreatment;
import com.squareup.protos.franklin.api.PaymentCardConfig;
import com.squareup.protos.franklin.api.PaymentCardGlobalConfig;
import com.squareup.protos.franklin.api.PaymentDeviceCustomizationBlocker;
import com.squareup.protos.franklin.api.PaymentDeviceCustomizationBlockerConfig;
import com.squareup.protos.franklin.api.PaymentDeviceGlobalConfig;
import com.squareup.protos.franklin.api.PaymentDeviceOption;
import com.squareup.protos.franklin.api.ProductDetailsPage;
import com.squareup.protos.franklin.api.StampsConfig;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.CardCustomizationInputs;
import com.squareup.protos.franklin.app.CardCustomizationInputs$CustomizationSource$CustomDesign;
import com.squareup.protos.franklin.app.CustomDesign;
import com.squareup.protos.franklin.app.CustomizationInputs;
import com.squareup.protos.franklin.app.PaymentDeviceType;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.CardThemeDefinition;
import com.squareup.protos.franklin.cards.PaymentMethod;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class PaymentDeviceCustomizationPresenter implements MoleculePresenter {
    public final CoroutineScope activityScope;
    public final Analytics analytics;
    public final AppConfigManager appConfig;
    public final AppService appService;
    public final PaymentDeviceCustomizationScreen args;
    public final BlockersDataNavigator blockersNavigator;
    public final LocalTabContentQueries cardStudioQueries;
    public final CashAccountDatabaseImpl cashDatabase;
    public final CoroutineContext ioDispatcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealNfcPaymentsManager nfcPaymentsManager;
    public final PdpNotifiedPreference pdpNotifiedPreference;
    public final RealRouter router;
    public final SessionManager sessionManager;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[PaymentDeviceCustomizationBlockerConfig.PresentationMode.values().length];
            try {
                iArr[PaymentDeviceCustomizationBlockerConfig.PresentationMode.DEVICE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentDeviceCustomizationBlockerConfig.PresentationMode.GRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentDeviceCustomizationBlockerConfig.PresentationMode.PRESENTATION_MODE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentDeviceOption.PaymentDeviceType.values().length];
            try {
                iArr2[PaymentDeviceOption.PaymentDeviceType.PAYMENT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PaymentDeviceOption.PaymentDeviceType.PAYMENT_CARD_LITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PaymentDeviceOption.PaymentDeviceType.PAYMENT_TOKEN_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PaymentDeviceOption.PaymentDeviceType.PAYMENT_DEVICE_TYPE_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TagFormFactor.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TagFormFactor tagFormFactor = TagFormFactor.WAND;
                iArr3[3] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                TagFormFactor tagFormFactor2 = TagFormFactor.WAND;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                TagFormFactor tagFormFactor3 = TagFormFactor.WAND;
                iArr3[5] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                TagFormFactor tagFormFactor4 = TagFormFactor.WAND;
                iArr3[1] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                TagFormFactor tagFormFactor5 = TagFormFactor.WAND;
                iArr3[4] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr4 = new int[PaymentDeviceOption.AvailabilityState.values().length];
            try {
                iArr4[PaymentDeviceOption.AvailabilityState.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[PaymentDeviceOption.AvailabilityState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[PaymentDeviceOption.AvailabilityState.TEASER.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[PaymentDeviceOption.AvailabilityState.COMING_SOON.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[PaymentDeviceOption.AvailabilityState.SOLD_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[PaymentDeviceOption.AvailabilityState.AVAILABILITY_STATE_UNSPECIFIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[PaymentCardGlobalConfig.CashtagDisplayOption.values().length];
            try {
                iArr5[PaymentCardGlobalConfig.CashtagDisplayOption.ALWAYS_HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[PaymentCardGlobalConfig.CashtagDisplayOption.CASHTAG_DISPLAY_OPTION_UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[PaymentCardGlobalConfig.CashtagDisplayOption.OPTIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[PaymentCardGlobalConfig.PaymentMethod.values().length];
            try {
                iArr6[PaymentCardGlobalConfig.PaymentMethod.DEBIT_FLEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[PaymentCardGlobalConfig.PaymentMethod.PREPAID.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[PaymentCardGlobalConfig.PaymentMethod.PAYMENT_METHOD_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    public PaymentDeviceCustomizationPresenter(PaymentDeviceCustomizationScreen paymentDeviceCustomizationScreen, BetterNavigator.ScreenNavigator screenNavigator, AppService appService, Analytics analytics, BlockersDataNavigator blockersDataNavigator, SyncValueReader syncValueReader, AndroidStringManager androidStringManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, AppConfigManager appConfigManager, RealCardDetailsCreator realCardDetailsCreator, RealRouter$Factory$Impl realRouter$Factory$Impl, RealGraphicsSupportProvider realGraphicsSupportProvider, SessionManager sessionManager, PdpNotifiedPreference pdpNotifiedPreference, RealNfcPaymentsManager realNfcPaymentsManager, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        paymentDeviceCustomizationScreen.getClass();
        this.args = paymentDeviceCustomizationScreen;
        this.navigator = screenNavigator;
        this.appService = appService;
        this.analytics = analytics;
        this.blockersNavigator = blockersDataNavigator;
        this.syncValueReader = syncValueReader;
        this.stringManager = androidStringManager;
        this.cashDatabase = cashAccountDatabaseImpl;
        this.appConfig = appConfigManager;
        this.sessionManager = sessionManager;
        this.pdpNotifiedPreference = pdpNotifiedPreference;
        this.nfcPaymentsManager = realNfcPaymentsManager;
        this.ioDispatcher = coroutineContext;
        this.activityScope = coroutineScope;
        this.cardStudioQueries = cashAccountDatabaseImpl.cardStudioQueries;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$personalizeCard(PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter, String str, String str2, List list, Map map, PaymentCardGlobalConfig paymentCardGlobalConfig, ContinuationImpl continuationImpl) {
        PaymentDeviceCustomizationPresenter$personalizeCard$1 paymentDeviceCustomizationPresenter$personalizeCard$1;
        int i;
        RedactedString redactedString;
        Object obj;
        PaymentDeviceOption paymentDeviceOption;
        ?? r7;
        CoroutineContext coroutineContext;
        ArcadeFormDateInputView$Content$7$1 arcadeFormDateInputView$Content$7$1;
        PaymentCardGlobalConfig paymentCardGlobalConfig2;
        int i2;
        Boolean bool;
        String str3;
        if (continuationImpl instanceof PaymentDeviceCustomizationPresenter$personalizeCard$1) {
            paymentDeviceCustomizationPresenter$personalizeCard$1 = (PaymentDeviceCustomizationPresenter$personalizeCard$1) continuationImpl;
            int i3 = paymentDeviceCustomizationPresenter$personalizeCard$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                paymentDeviceCustomizationPresenter$personalizeCard$1.label = i3 - PKIFailureInfo.systemUnavail;
                PaymentDeviceCustomizationPresenter$personalizeCard$1 paymentDeviceCustomizationPresenter$personalizeCard$12 = paymentDeviceCustomizationPresenter$personalizeCard$1;
                Object obj2 = paymentDeviceCustomizationPresenter$personalizeCard$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentDeviceCustomizationPresenter$personalizeCard$12.label;
                redactedString = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual(((PaymentDeviceOption) obj).payment_device_id, str)) {
                            break;
                        }
                    }
                    paymentDeviceOption = (PaymentDeviceOption) obj;
                    if (paymentDeviceOption == null) {
                        return Unit.INSTANCE;
                    }
                    CardThemeDefinition cardThemeDefinition = (CardThemeDefinition) map.get(str);
                    CardTheme cardTheme = cardThemeDefinition != null ? cardThemeDefinition.card_theme : null;
                    PaymentDeviceOption.PaymentDeviceConfig paymentDeviceConfig = paymentDeviceOption.payment_device_config;
                    if (paymentDeviceConfig != null) {
                        PaymentDeviceOption.PaymentDeviceConfig.PaymentCard paymentCard = paymentDeviceConfig instanceof PaymentDeviceOption.PaymentDeviceConfig.PaymentCard ? (PaymentDeviceOption.PaymentDeviceConfig.PaymentCard) paymentDeviceConfig : null;
                        PaymentCardConfig value = paymentCard != null ? paymentCard.getValue() : null;
                        if (value != null && (bool = value.cashtag_supported) != null) {
                            r7 = bool.booleanValue();
                            coroutineContext = paymentDeviceCustomizationPresenter.ioDispatcher;
                            arcadeFormDateInputView$Content$7$1 = new ArcadeFormDateInputView$Content$7$1(2, paymentDeviceCustomizationPresenter, str2, str, cardTheme, null, r7);
                            paymentCardGlobalConfig2 = paymentCardGlobalConfig;
                            paymentDeviceCustomizationPresenter$personalizeCard$12.L$4 = paymentCardGlobalConfig2;
                            paymentDeviceCustomizationPresenter$personalizeCard$12.L$5 = paymentDeviceOption;
                            paymentDeviceCustomizationPresenter$personalizeCard$12.I$0 = r7;
                            paymentDeviceCustomizationPresenter$personalizeCard$12.label = 1;
                            if (JobKt.withContext(coroutineContext, arcadeFormDateInputView$Content$7$1, paymentDeviceCustomizationPresenter$personalizeCard$12) != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            i2 = r7;
                        }
                    }
                    r7 = 0;
                    coroutineContext = paymentDeviceCustomizationPresenter.ioDispatcher;
                    arcadeFormDateInputView$Content$7$1 = new ArcadeFormDateInputView$Content$7$1(2, paymentDeviceCustomizationPresenter, str2, str, cardTheme, null, r7);
                    paymentCardGlobalConfig2 = paymentCardGlobalConfig;
                    paymentDeviceCustomizationPresenter$personalizeCard$12.L$4 = paymentCardGlobalConfig2;
                    paymentDeviceCustomizationPresenter$personalizeCard$12.L$5 = paymentDeviceOption;
                    paymentDeviceCustomizationPresenter$personalizeCard$12.I$0 = r7;
                    paymentDeviceCustomizationPresenter$personalizeCard$12.label = 1;
                    if (JobKt.withContext(coroutineContext, arcadeFormDateInputView$Content$7$1, paymentDeviceCustomizationPresenter$personalizeCard$12) != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = paymentDeviceCustomizationPresenter$personalizeCard$12.I$0;
                    PaymentDeviceOption paymentDeviceOption2 = paymentDeviceCustomizationPresenter$personalizeCard$12.L$5;
                    PaymentCardGlobalConfig paymentCardGlobalConfig3 = paymentDeviceCustomizationPresenter$personalizeCard$12.L$4;
                    SafeTrace.throwOnFailure(obj2);
                    paymentDeviceOption = paymentDeviceOption2;
                    paymentCardGlobalConfig2 = paymentCardGlobalConfig3;
                }
                CardCustomizationBlocker.CardOption.CashtagDisplay cashtagDisplay = !isCashtagVisible(paymentCardGlobalConfig2, i2 != 0) ? CardCustomizationBlocker.CardOption.CashtagDisplay.OPTIONAL : CardCustomizationBlocker.CardOption.CashtagDisplay.ALWAYS_HIDDEN;
                BetterNavigator.ScreenNavigator screenNavigator = paymentDeviceCustomizationPresenter.navigator;
                BlockersData blockersData = paymentDeviceCustomizationPresenter.args.blockersData;
                if (paymentCardGlobalConfig2 != null && (str3 = paymentCardGlobalConfig2.cashtag) != null) {
                    redactedString = new RedactedString(str3);
                }
                Boolean bool2 = paymentDeviceOption.customization_eligible;
                screenNavigator.goTo(new CardStudioScreen(blockersData, cashtagDisplay, redactedString, bool2 != null ? bool2.booleanValue() : false, paymentDeviceCustomizationPresenter.getBlockerAvailableStamps()));
                return Unit.INSTANCE;
            }
        }
        paymentDeviceCustomizationPresenter$personalizeCard$1 = new PaymentDeviceCustomizationPresenter$personalizeCard$1(paymentDeviceCustomizationPresenter, continuationImpl);
        PaymentDeviceCustomizationPresenter$personalizeCard$1 paymentDeviceCustomizationPresenter$personalizeCard$122 = paymentDeviceCustomizationPresenter$personalizeCard$1;
        Object obj22 = paymentDeviceCustomizationPresenter$personalizeCard$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentDeviceCustomizationPresenter$personalizeCard$122.label;
        redactedString = null;
        if (i != 0) {
        }
        if (!isCashtagVisible(paymentCardGlobalConfig2, i2 != 0)) {
        }
        BetterNavigator.ScreenNavigator screenNavigator2 = paymentDeviceCustomizationPresenter.navigator;
        BlockersData blockersData2 = paymentDeviceCustomizationPresenter.args.blockersData;
        if (paymentCardGlobalConfig2 != null) {
            redactedString = new RedactedString(str3);
        }
        Boolean bool22 = paymentDeviceOption.customization_eligible;
        screenNavigator2.goTo(new CardStudioScreen(blockersData2, cashtagDisplay, redactedString, bool22 != null ? bool22.booleanValue() : false, paymentDeviceCustomizationPresenter.getBlockerAvailableStamps()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x012c, code lost:
    
        if (r1 == r11) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
    
        if (r2 == r11) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitBlocker(PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter, String str, ContinuationImpl continuationImpl) {
        PaymentDeviceCustomizationPresenter$submitBlocker$1 paymentDeviceCustomizationPresenter$submitBlocker$1;
        int i;
        Object obj;
        Object buildCustomizationInputs;
        String str2;
        PaymentDeviceOption paymentDeviceOption;
        PaymentDeviceGlobalConfig paymentDeviceGlobalConfig;
        int i2;
        PaymentDeviceType paymentDeviceType;
        AndroidStringManager androidStringManager;
        PaymentDeviceCustomizationPresenter$submitBlocker$1 paymentDeviceCustomizationPresenter$submitBlocker$12;
        PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter2;
        PaymentDeviceType paymentDeviceType2;
        BlockersData updateFromResponseContext;
        AndroidStringManager androidStringManager2 = paymentDeviceCustomizationPresenter.stringManager;
        BetterNavigator.ScreenNavigator screenNavigator = paymentDeviceCustomizationPresenter.navigator;
        PaymentDeviceCustomizationScreen paymentDeviceCustomizationScreen = paymentDeviceCustomizationPresenter.args;
        if (continuationImpl instanceof PaymentDeviceCustomizationPresenter$submitBlocker$1) {
            paymentDeviceCustomizationPresenter$submitBlocker$1 = (PaymentDeviceCustomizationPresenter$submitBlocker$1) continuationImpl;
            int i3 = paymentDeviceCustomizationPresenter$submitBlocker$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                paymentDeviceCustomizationPresenter$submitBlocker$1.label = i3 - PKIFailureInfo.systemUnavail;
                PaymentDeviceCustomizationPresenter$submitBlocker$1 paymentDeviceCustomizationPresenter$submitBlocker$13 = paymentDeviceCustomizationPresenter$submitBlocker$1;
                Object obj2 = paymentDeviceCustomizationPresenter$submitBlocker$13.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentDeviceCustomizationPresenter$submitBlocker$13.label;
                int i4 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Iterator<T> it = paymentDeviceCustomizationScreen.blocker.payment_device_options.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual(((PaymentDeviceOption) obj).payment_device_id, str)) {
                            break;
                        }
                    }
                    PaymentDeviceOption paymentDeviceOption2 = (PaymentDeviceOption) obj;
                    if (paymentDeviceOption2 == null) {
                        return Unit.INSTANCE;
                    }
                    PaymentDeviceCustomizationBlockerConfig paymentDeviceCustomizationBlockerConfig = paymentDeviceCustomizationScreen.blocker.blocker_config;
                    PaymentCardGlobalConfig paymentCardGlobalConfig = (paymentDeviceCustomizationBlockerConfig == null || (paymentDeviceGlobalConfig = paymentDeviceCustomizationBlockerConfig.payment_device_global_config) == null) ? null : paymentDeviceGlobalConfig.payment_card_global_config;
                    paymentDeviceCustomizationPresenter$submitBlocker$13.L$0 = str;
                    paymentDeviceCustomizationPresenter$submitBlocker$13.L$1 = paymentDeviceOption2;
                    paymentDeviceCustomizationPresenter$submitBlocker$13.label = 1;
                    buildCustomizationInputs = paymentDeviceCustomizationPresenter.buildCustomizationInputs(paymentDeviceOption2, paymentCardGlobalConfig, paymentDeviceCustomizationPresenter$submitBlocker$13);
                    if (buildCustomizationInputs != coroutineSingletons) {
                        str2 = str;
                        paymentDeviceOption = paymentDeviceOption2;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    paymentDeviceOption = paymentDeviceCustomizationPresenter$submitBlocker$13.L$1;
                    String str3 = paymentDeviceCustomizationPresenter$submitBlocker$13.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    buildCustomizationInputs = obj2;
                    str2 = str3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        updateFromResponseContext = paymentDeviceCustomizationPresenter$submitBlocker$13.L$6;
                        SafeTrace.throwOnFailure(obj2);
                        paymentDeviceCustomizationPresenter2 = paymentDeviceCustomizationPresenter;
                        screenNavigator.goTo(paymentDeviceCustomizationPresenter2.blockersNavigator.getNext(paymentDeviceCustomizationScreen, updateFromResponseContext));
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    androidStringManager = androidStringManager2;
                    paymentDeviceCustomizationPresenter$submitBlocker$12 = paymentDeviceCustomizationPresenter$submitBlocker$13;
                    paymentDeviceCustomizationPresenter2 = paymentDeviceCustomizationPresenter;
                    ApiResult apiResult = (ApiResult) obj2;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.e("Failed to submit payment device customization blocker.", new Object[0]);
                        screenNavigator.goTo(CanvasKt.toFailureScreen((ApiResult.Failure) apiResult, paymentDeviceCustomizationScreen.blockersData, androidStringManager));
                        return Unit.INSTANCE;
                    }
                    BlockersData blockersData = paymentDeviceCustomizationScreen.blockersData;
                    ResponseContext responseContext = (ResponseContext) ((ApiResult.Success) apiResult).response;
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
                    paymentDeviceCustomizationPresenter$submitBlocker$12.L$0 = null;
                    paymentDeviceCustomizationPresenter$submitBlocker$12.L$1 = null;
                    paymentDeviceCustomizationPresenter$submitBlocker$12.L$6 = updateFromResponseContext;
                    paymentDeviceCustomizationPresenter$submitBlocker$12.label = 3;
                    Object withContext = JobKt.withContext(paymentDeviceCustomizationPresenter2.ioDispatcher, new PaymentDeviceCustomizationPresenter$models$3$1$1(paymentDeviceCustomizationPresenter2, continuation, i4), paymentDeviceCustomizationPresenter$submitBlocker$12);
                    if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        withContext = Unit.INSTANCE;
                    }
                }
                CustomizationInputs customizationInputs = (CustomizationInputs) buildCustomizationInputs;
                PaymentDeviceOption.PaymentDeviceType paymentDeviceType3 = paymentDeviceOption.payment_device_type;
                i2 = paymentDeviceType3 != null ? -1 : WhenMappings.$EnumSwitchMapping$1[paymentDeviceType3.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        paymentDeviceType2 = PaymentDeviceType.PAYMENT_CARD;
                    } else if (i2 == 2) {
                        paymentDeviceType2 = PaymentDeviceType.PAYMENT_CARD_LITE;
                    } else if (i2 == 3) {
                        paymentDeviceType2 = PaymentDeviceType.PAYMENT_TOKEN_DEVICE;
                    } else if (i2 != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    paymentDeviceType = paymentDeviceType2;
                    Analytics analytics = paymentDeviceCustomizationPresenter.analytics;
                    BlockersData blockersData2 = paymentDeviceCustomizationScreen.blockersData;
                    DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(paymentDeviceCustomizationPresenter, str2, paymentDeviceType, customizationInputs, null, 6);
                    paymentDeviceCustomizationPresenter$submitBlocker$13.L$0 = null;
                    paymentDeviceCustomizationPresenter$submitBlocker$13.L$1 = null;
                    paymentDeviceCustomizationPresenter$submitBlocker$13.label = 2;
                    androidStringManager = androidStringManager2;
                    paymentDeviceCustomizationPresenter$submitBlocker$12 = paymentDeviceCustomizationPresenter$submitBlocker$13;
                    paymentDeviceCustomizationPresenter2 = paymentDeviceCustomizationPresenter;
                    obj2 = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData2, analytics, androidStringManager, paymentDeviceCustomizationPresenter$submitBlocker$12, null, dataStoreImpl$readDataOrHandleCorruption$3);
                }
                paymentDeviceType = null;
                Analytics analytics2 = paymentDeviceCustomizationPresenter.analytics;
                BlockersData blockersData22 = paymentDeviceCustomizationScreen.blockersData;
                DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$32 = new DataStoreImpl$readDataOrHandleCorruption$3(paymentDeviceCustomizationPresenter, str2, paymentDeviceType, customizationInputs, null, 6);
                paymentDeviceCustomizationPresenter$submitBlocker$13.L$0 = null;
                paymentDeviceCustomizationPresenter$submitBlocker$13.L$1 = null;
                paymentDeviceCustomizationPresenter$submitBlocker$13.label = 2;
                androidStringManager = androidStringManager2;
                paymentDeviceCustomizationPresenter$submitBlocker$12 = paymentDeviceCustomizationPresenter$submitBlocker$13;
                paymentDeviceCustomizationPresenter2 = paymentDeviceCustomizationPresenter;
                obj2 = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData22, analytics2, androidStringManager, paymentDeviceCustomizationPresenter$submitBlocker$12, null, dataStoreImpl$readDataOrHandleCorruption$32);
            }
        }
        paymentDeviceCustomizationPresenter$submitBlocker$1 = new PaymentDeviceCustomizationPresenter$submitBlocker$1(paymentDeviceCustomizationPresenter, continuationImpl);
        PaymentDeviceCustomizationPresenter$submitBlocker$1 paymentDeviceCustomizationPresenter$submitBlocker$132 = paymentDeviceCustomizationPresenter$submitBlocker$1;
        Object obj22 = paymentDeviceCustomizationPresenter$submitBlocker$132.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentDeviceCustomizationPresenter$submitBlocker$132.label;
        int i42 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        CustomizationInputs customizationInputs2 = (CustomizationInputs) buildCustomizationInputs;
        PaymentDeviceOption.PaymentDeviceType paymentDeviceType32 = paymentDeviceOption.payment_device_type;
        if (paymentDeviceType32 != null) {
        }
        if (i2 != -1) {
        }
        paymentDeviceType = null;
        Analytics analytics22 = paymentDeviceCustomizationPresenter.analytics;
        BlockersData blockersData222 = paymentDeviceCustomizationScreen.blockersData;
        DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$322 = new DataStoreImpl$readDataOrHandleCorruption$3(paymentDeviceCustomizationPresenter, str2, paymentDeviceType, customizationInputs2, null, 6);
        paymentDeviceCustomizationPresenter$submitBlocker$132.L$0 = null;
        paymentDeviceCustomizationPresenter$submitBlocker$132.L$1 = null;
        paymentDeviceCustomizationPresenter$submitBlocker$132.label = 2;
        androidStringManager = androidStringManager2;
        paymentDeviceCustomizationPresenter$submitBlocker$12 = paymentDeviceCustomizationPresenter$submitBlocker$132;
        paymentDeviceCustomizationPresenter2 = paymentDeviceCustomizationPresenter;
        obj22 = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData222, analytics22, androidStringManager, paymentDeviceCustomizationPresenter$submitBlocker$12, null, dataStoreImpl$readDataOrHandleCorruption$322);
    }

    public static boolean isCashtagVisible(PaymentCardGlobalConfig paymentCardGlobalConfig, boolean z) {
        PaymentCardGlobalConfig.CashtagDisplayOption cashtagDisplayOption = paymentCardGlobalConfig != null ? paymentCardGlobalConfig.cashtag_display_option : null;
        int i = cashtagDisplayOption == null ? -1 : WhenMappings.$EnumSwitchMapping$4[cashtagDisplayOption.ordinal()];
        if (i != -1 && i != 1 && i != 2) {
            if (i == 3) {
                return z;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        if (r12 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x006c, code lost:
    
        if (r5 == r4) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable buildCustomizationInputs(PaymentDeviceOption paymentDeviceOption, PaymentCardGlobalConfig paymentCardGlobalConfig, ContinuationImpl continuationImpl) {
        PaymentDeviceCustomizationPresenter$buildCustomizationInputs$1 paymentDeviceCustomizationPresenter$buildCustomizationInputs$1;
        int i;
        PaymentCardGlobalConfig paymentCardGlobalConfig2;
        Object withContext;
        CardStudio cardStudio;
        boolean booleanValue;
        TouchData touchData;
        PaymentDeviceOption.PaymentDeviceConfig paymentDeviceConfig;
        boolean z;
        int i2;
        CustomizationDetails customizationDetails;
        int i3;
        TouchData touchData2;
        PaymentDeviceOption paymentDeviceOption2 = paymentDeviceOption;
        if (continuationImpl instanceof PaymentDeviceCustomizationPresenter$buildCustomizationInputs$1) {
            paymentDeviceCustomizationPresenter$buildCustomizationInputs$1 = (PaymentDeviceCustomizationPresenter$buildCustomizationInputs$1) continuationImpl;
            int i4 = paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.label;
                CoroutineContext coroutineContext = this.ioDispatcher;
                int i5 = 2;
                int i6 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentDeviceOption.PaymentDeviceType paymentDeviceType = paymentDeviceOption2.payment_device_type;
                    if (paymentDeviceType != PaymentDeviceOption.PaymentDeviceType.PAYMENT_CARD && paymentDeviceType != PaymentDeviceOption.PaymentDeviceType.PAYMENT_CARD_LITE) {
                        return null;
                    }
                    paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.L$0 = paymentDeviceOption2;
                    paymentCardGlobalConfig2 = paymentCardGlobalConfig;
                    paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.L$1 = paymentCardGlobalConfig2;
                    paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.label = 1;
                    withContext = JobKt.withContext(coroutineContext, new PaymentDeviceCustomizationPresenter$models$3$1$1(this, continuation, i5), paymentDeviceCustomizationPresenter$buildCustomizationInputs$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.I$1;
                        touchData2 = paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.L$3;
                        SafeTrace.throwOnFailure(obj);
                        customizationDetails = StyledCardViewModelKt.toCustomizationDetails(touchData2, (Map) obj);
                        touchData = touchData2;
                        i2 = i3;
                        ByteString createSignatureBytes = RealCardDetailsCreator.createSignatureBytes(customizationDetails);
                        ByteString byteString = ByteString.EMPTY;
                        return new CustomizationInputs(new CardCustomizationInputs(new CardCustomizationInputs$CustomizationSource$CustomDesign(new CustomDesign(createSignatureBytes, "image/png", touchData, byteString)), Boolean.valueOf(i2 != 0), byteString), byteString);
                    }
                    PaymentCardGlobalConfig paymentCardGlobalConfig3 = paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.L$1;
                    PaymentDeviceOption paymentDeviceOption3 = paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    paymentCardGlobalConfig2 = paymentCardGlobalConfig3;
                    paymentDeviceOption2 = paymentDeviceOption3;
                    withContext = obj;
                }
                cardStudio = (CardStudio) withContext;
                Boolean bool = paymentDeviceOption2.customization_eligible;
                booleanValue = bool == null ? bool.booleanValue() : false;
                if (cardStudio != null && (touchData = cardStudio.touch_data) != null) {
                    if (!booleanValue) {
                        touchData = null;
                    }
                }
                touchData = new TouchData(new Float(RecyclerView.DECELERATION_RATE), new Float(RecyclerView.DECELERATION_RATE), (List) null, (List) null, 28);
                paymentDeviceConfig = paymentDeviceOption2.payment_device_config;
                if (paymentDeviceConfig != null) {
                    PaymentDeviceOption.PaymentDeviceConfig.PaymentCard paymentCard = paymentDeviceConfig instanceof PaymentDeviceOption.PaymentDeviceConfig.PaymentCard ? (PaymentDeviceOption.PaymentDeviceConfig.PaymentCard) paymentDeviceConfig : null;
                    PaymentCardConfig value = paymentCard != null ? paymentCard.getValue() : null;
                    if (value != null) {
                        z = Intrinsics.areEqual(value.cashtag_supported, Boolean.TRUE);
                        if (isCashtagVisible(paymentCardGlobalConfig2, z)) {
                            if (cardStudio != null ? cardStudio.cashtag_enabled : true) {
                                i2 = 1;
                                if (booleanValue) {
                                    customizationDetails = new CustomizationDetails();
                                    ByteString createSignatureBytes2 = RealCardDetailsCreator.createSignatureBytes(customizationDetails);
                                    ByteString byteString2 = ByteString.EMPTY;
                                    return new CustomizationInputs(new CardCustomizationInputs(new CardCustomizationInputs$CustomizationSource$CustomDesign(new CustomDesign(createSignatureBytes2, "image/png", touchData, byteString2)), Boolean.valueOf(i2 != 0), byteString2), byteString2);
                                }
                                paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.L$0 = null;
                                paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.L$1 = null;
                                paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.L$3 = touchData;
                                paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.I$1 = i2;
                                paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.label = 2;
                                obj = JobKt.withContext(coroutineContext, new PaymentDeviceCustomizationPresenter$models$2$1(this, continuation, i6), paymentDeviceCustomizationPresenter$buildCustomizationInputs$1);
                                if (obj != coroutineSingletons) {
                                    i3 = i2;
                                    touchData2 = touchData;
                                    customizationDetails = StyledCardViewModelKt.toCustomizationDetails(touchData2, (Map) obj);
                                    touchData = touchData2;
                                    i2 = i3;
                                    ByteString createSignatureBytes22 = RealCardDetailsCreator.createSignatureBytes(customizationDetails);
                                    ByteString byteString22 = ByteString.EMPTY;
                                    return new CustomizationInputs(new CardCustomizationInputs(new CardCustomizationInputs$CustomizationSource$CustomDesign(new CustomDesign(createSignatureBytes22, "image/png", touchData, byteString22)), Boolean.valueOf(i2 != 0), byteString22), byteString22);
                                }
                                return coroutineSingletons;
                            }
                        }
                        i2 = 0;
                        if (booleanValue) {
                        }
                    }
                }
                z = false;
                if (isCashtagVisible(paymentCardGlobalConfig2, z)) {
                }
                i2 = 0;
                if (booleanValue) {
                }
            }
        }
        paymentDeviceCustomizationPresenter$buildCustomizationInputs$1 = new PaymentDeviceCustomizationPresenter$buildCustomizationInputs$1(this, continuationImpl);
        Object obj2 = paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentDeviceCustomizationPresenter$buildCustomizationInputs$1.label;
        CoroutineContext coroutineContext2 = this.ioDispatcher;
        int i52 = 2;
        int i62 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        cardStudio = (CardStudio) withContext;
        Boolean bool2 = paymentDeviceOption2.customization_eligible;
        if (bool2 == null) {
        }
        if (cardStudio != null) {
            if (!booleanValue) {
            }
        }
        touchData = new TouchData(new Float(RecyclerView.DECELERATION_RATE), new Float(RecyclerView.DECELERATION_RATE), (List) null, (List) null, 28);
        paymentDeviceConfig = paymentDeviceOption2.payment_device_config;
        if (paymentDeviceConfig != null) {
        }
        z = false;
        if (isCashtagVisible(paymentCardGlobalConfig2, z)) {
        }
        i2 = 0;
        if (booleanValue) {
        }
    }

    public final List getBlockerAvailableStamps() {
        List<AvailableStampOption> list;
        StampsConfig stampsConfig = this.args.blocker.stamps_config;
        if (stampsConfig == null || (list = stampsConfig.available_stamps) == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = ((AvailableStampOption) it.next()).stamp_token;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03b0  */
    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        ?? r6;
        ZoomLevel zoomLevel;
        PaymentDeviceAvailability paymentDeviceAvailability;
        CardTheme cardTheme;
        boolean z;
        GridItemVisual card;
        int i2;
        PaymentMethod paymentMethod;
        CardTheme cardTheme2;
        MutableState mutableState;
        String str;
        String str2;
        String str3;
        String str4;
        PaymentMethod paymentMethod2;
        Boolean bool;
        PaymentCardGlobalConfig paymentCardGlobalConfig;
        PaymentDeviceItemViewModel paymentDeviceItemViewModel;
        ProductDetailsPageToastLabel productDetailsPageToastLabel;
        ProductDetailsPageToastLabel productDetailsPageToastLabel2;
        GridItemVisual gridItemVisual;
        String str5;
        String str6;
        AvailabilityPill availabilityPill;
        ProductDetailsPage productDetailsPage;
        String str7;
        AvailabilityPill availabilityPill2;
        ProductDetailsPageViewModel productDetailsPageViewModel;
        CtaAction ctaAction;
        ProductDetailsPageViewModel productDetailsPageViewModel2;
        Iterator it;
        String str8;
        AvailabilityPill availabilityPill3;
        ProductDetailsPageSection productDetailsPageSection;
        AvailabilityPill availabilityPill4;
        Iterator it2;
        LabelsSection.LabelTreatment labelTreatment;
        String obj;
        TagFormFactor appTagFormFactor;
        PaymentDeviceGlobalConfig paymentDeviceGlobalConfig;
        flow.getClass();
        ?? r13 = (GapComposer) composer;
        r13.startReplaceGroup(117205262);
        PaymentDeviceCustomizationBlocker paymentDeviceCustomizationBlocker = this.args.blocker;
        List<PaymentDeviceOption> list = paymentDeviceCustomizationBlocker.payment_device_options;
        PaymentDeviceCustomizationBlockerConfig paymentDeviceCustomizationBlockerConfig = paymentDeviceCustomizationBlocker.blocker_config;
        PaymentCardGlobalConfig paymentCardGlobalConfig2 = (paymentDeviceCustomizationBlockerConfig == null || (paymentDeviceGlobalConfig = paymentDeviceCustomizationBlockerConfig.payment_device_global_config) == null) ? null : paymentDeviceGlobalConfig.payment_card_global_config;
        Object[] objArr = new Object[0];
        boolean changedInstance = r13.changedInstance(this);
        Object rememberedValue = r13.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == obj2) {
            rememberedValue = new SsnViewKt$$ExternalSyntheticLambda4(this, 12);
            r13.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, r13, 0);
        Object rememberedValue2 = r13.rememberedValue();
        SyncValueReader syncValueReader = this.syncValueReader;
        if (rememberedValue2 == obj2) {
            rememberedValue2 = StateFlowKt.mapState(syncValueReader.getAllValues(AndroidSyncValueSpecs.CardThemeDefinitions), new CalendarRowKt$$ExternalSyntheticLambda10(19));
            r13.updateRememberedValue(rememberedValue2);
        }
        MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue2, r13);
        Object rememberedValue3 = r13.rememberedValue();
        if (rememberedValue3 == obj2) {
            rememberedValue3 = StateFlowKt.mapState(syncValueReader.getAllValues(AndroidSyncValueSpecs.TagThemeDefinitions), new CalendarRowKt$$ExternalSyntheticLambda10(20));
            r13.updateRememberedValue(rememberedValue3);
        }
        MutableState receiveValueAsState2 = Strings.receiveValueAsState((StateFlow) rememberedValue3, r13);
        Object rememberedValue4 = r13.rememberedValue();
        if (rememberedValue4 == obj2) {
            rememberedValue4 = Updater.mutableStateOf$default(null);
            r13.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState3 = (MutableState) rememberedValue4;
        Object rememberedValue5 = r13.rememberedValue();
        if (rememberedValue5 == obj2) {
            rememberedValue5 = Updater.mutableStateOf$default(0L);
            r13.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState4 = (MutableState) rememberedValue5;
        Object rememberedValue6 = r13.rememberedValue();
        if (rememberedValue6 == obj2) {
            rememberedValue6 = Updater.mutableStateOf$default(EmptySet.INSTANCE);
            r13.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState5 = (MutableState) rememberedValue6;
        Object rememberedValue7 = r13.rememberedValue();
        if (rememberedValue7 == obj2) {
            rememberedValue7 = Updater.mutableStateOf$default(Boolean.FALSE);
            r13.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState6 = (MutableState) rememberedValue7;
        Object rememberedValue8 = r13.rememberedValue();
        if (rememberedValue8 == obj2) {
            rememberedValue8 = Updater.mutableStateOf$default(EmptySet.INSTANCE);
            r13.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState7 = (MutableState) rememberedValue8;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance2 = r13.changedInstance(list) | r13.changedInstance(this);
        Object rememberedValue9 = r13.rememberedValue();
        if (changedInstance2 || rememberedValue9 == obj2) {
            rememberedValue9 = new PaymentDeviceCustomizationPresenter$models$1$1(list, this, mutableState7, null);
            r13.updateRememberedValue(rememberedValue9);
        }
        Updater.LaunchedEffect((Composer) r13, unit, (Function2) rememberedValue9);
        Updater.LaunchedEffect((Composer) r13, flow, new LocalAddBrandsPresenter$models$2$1(flow, (Continuation) null, this, list, mutableState6, mutableState3, mutableState5, mutableState4, mutableState7, paymentCardGlobalConfig2, mutableState2, receiveValueAsState));
        Object rememberedValue10 = r13.rememberedValue();
        if (rememberedValue10 == obj2) {
            rememberedValue10 = Updater.mutableStateOf$default(null);
            r13.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState8 = (MutableState) rememberedValue10;
        Object rememberedValue11 = r13.rememberedValue();
        if (rememberedValue11 == obj2) {
            rememberedValue11 = Updater.mutableStateOf$default(Boolean.TRUE);
            r13.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState9 = (MutableState) rememberedValue11;
        boolean changedInstance3 = r13.changedInstance(this);
        Object rememberedValue12 = r13.rememberedValue();
        if (changedInstance3 || rememberedValue12 == obj2) {
            rememberedValue12 = new CardStudioPresenter$models$1$1(this, mutableState8, mutableState9, (Continuation) null);
            r13.updateRememberedValue(rememberedValue12);
        }
        Updater.LaunchedEffect((Composer) r13, unit, (Function2) rememberedValue12);
        CustomizationDetails customizationDetails = (CustomizationDetails) mutableState8.getValue();
        Object rememberedValue13 = r13.rememberedValue();
        if (rememberedValue13 == obj2) {
            rememberedValue13 = Boolean.valueOf(((NfcAdapter) this.nfcPaymentsManager.nfcAdapter$delegate.getValue()) != null);
            r13.updateRememberedValue(rememberedValue13);
        }
        boolean booleanValue = ((Boolean) rememberedValue13).booleanValue();
        AndroidStringManager androidStringManager = this.stringManager;
        if (customizationDetails != null) {
            String str9 = (customizationDetails.strokes.isEmpty() && customizationDetails.stamps.isEmpty()) ? androidStringManager.get(R.string.payment_device_customization_customize) : androidStringManager.get(R.string.payment_device_customization_edit_personalization);
            r6 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                PaymentDeviceOption paymentDeviceOption = (PaymentDeviceOption) it3.next();
                Map map = (Map) receiveValueAsState.getValue();
                Map map2 = (Map) receiveValueAsState2.getValue();
                CustomizationDetails customizationDetails2 = customizationDetails;
                Set set = (Set) mutableState7.getValue();
                boolean booleanValue2 = ((Boolean) mutableState9.getValue()).booleanValue();
                MutableState mutableState10 = mutableState9;
                String str10 = paymentDeviceOption.payment_device_id;
                str10.getClass();
                boolean z2 = booleanValue;
                PaymentDeviceOption.AvailabilityState availabilityState = paymentDeviceOption.availability_state;
                switch (availabilityState == null ? -1 : WhenMappings.$EnumSwitchMapping$3[availabilityState.ordinal()]) {
                    case -1:
                    case 6:
                        paymentDeviceAvailability = PaymentDeviceAvailability.AVAILABLE;
                        break;
                    case 0:
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 1:
                        paymentDeviceAvailability = PaymentDeviceAvailability.AVAILABLE;
                        break;
                    case 2:
                        paymentDeviceAvailability = PaymentDeviceAvailability.NEW;
                        break;
                    case 3:
                        paymentDeviceAvailability = PaymentDeviceAvailability.TEASER;
                        break;
                    case 4:
                        paymentDeviceAvailability = PaymentDeviceAvailability.COMING_SOON;
                        break;
                    case 5:
                        paymentDeviceAvailability = PaymentDeviceAvailability.SOLD_OUT;
                        break;
                }
                PaymentDeviceAvailability paymentDeviceAvailability2 = paymentDeviceAvailability;
                PaymentDeviceOption.PaymentDeviceType paymentDeviceType = paymentDeviceOption.payment_device_type;
                int i3 = paymentDeviceType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[paymentDeviceType.ordinal()];
                Iterator it4 = it3;
                if (i3 == 1 || i3 == 2) {
                    CardThemeDefinition cardThemeDefinition = (CardThemeDefinition) map.get(str10);
                    if (cardThemeDefinition != null && (cardTheme = cardThemeDefinition.card_theme) != null) {
                        PaymentDeviceOption.PaymentDeviceConfig paymentDeviceConfig = paymentDeviceOption.payment_device_config;
                        if (paymentDeviceConfig != null) {
                            PaymentDeviceOption.PaymentDeviceConfig.PaymentCard paymentCard = paymentDeviceConfig instanceof PaymentDeviceOption.PaymentDeviceConfig.PaymentCard ? (PaymentDeviceOption.PaymentDeviceConfig.PaymentCard) paymentDeviceConfig : null;
                            PaymentCardConfig value = paymentCard != null ? paymentCard.getValue() : null;
                            if (value != null && (bool = value.cashtag_supported) != null) {
                                z = bool.booleanValue();
                                boolean z3 = !isCashtagVisible(paymentCardGlobalConfig2, z) && booleanValue2;
                                String str11 = paymentCardGlobalConfig2 == null ? paymentCardGlobalConfig2.cashtag : null;
                                String str12 = str11 != null ? "" : str11;
                                Boolean bool2 = paymentDeviceOption.customization_eligible;
                                boolean booleanValue3 = bool2 == null ? bool2.booleanValue() : false;
                                CustomizationDetails customizationDetails3 = !Intrinsics.areEqual(paymentDeviceOption.customization_eligible, Boolean.TRUE) ? customizationDetails2 : new CustomizationDetails();
                                PaymentCardGlobalConfig.PaymentMethod paymentMethod3 = paymentCardGlobalConfig2 == null ? paymentCardGlobalConfig2.payment_method : null;
                                i2 = paymentMethod3 != null ? -1 : WhenMappings.$EnumSwitchMapping$5[paymentMethod3.ordinal()];
                                if (i2 != -1) {
                                    if (i2 == 1) {
                                        paymentMethod2 = PaymentMethod.DEBIT_FLEX;
                                    } else if (i2 == 2) {
                                        paymentMethod2 = PaymentMethod.PREPAID;
                                    } else if (i2 != 3) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    paymentMethod = paymentMethod2;
                                    String str13 = paymentCardGlobalConfig2 != null ? paymentCardGlobalConfig2.legal_name : null;
                                    if (paymentCardGlobalConfig2 != null || (str4 = paymentCardGlobalConfig2.card_pan) == null) {
                                        cardTheme2 = cardTheme;
                                        mutableState = mutableState7;
                                        str = null;
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        cardTheme2 = cardTheme;
                                        int length = str4.length();
                                        mutableState = mutableState7;
                                        int i4 = 0;
                                        while (i4 < length) {
                                            int i5 = length;
                                            char charAt = str4.charAt(i4);
                                            if (Character.isDigit(charAt)) {
                                                sb.append(charAt);
                                            }
                                            i4++;
                                            length = i5;
                                        }
                                        str = CollectionsKt.joinToString$default(StringsKt___StringsKt.chunked(4, sb.toString()), " ", null, null, 0, null, null, 62);
                                    }
                                    if (paymentCardGlobalConfig2 != null || (str3 = paymentCardGlobalConfig2.expiration) == null) {
                                        str2 = null;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        int length2 = str3.length();
                                        int i6 = 0;
                                        while (i6 < length2) {
                                            int i7 = length2;
                                            char charAt2 = str3.charAt(i6);
                                            if (Character.isDigit(charAt2)) {
                                                sb2.append(charAt2);
                                            }
                                            i6++;
                                            length2 = i7;
                                        }
                                        str2 = CollectionsKt.joinToString$default(StringsKt___StringsKt.chunked(2, sb2.toString()), "/", null, null, 0, null, null, 62);
                                    }
                                    card = new GridItemVisual.Card(new StyledCardViewModel(str12, z3, cardTheme2, booleanValue3, customizationDetails3, null, false, paymentMethod, null, str13, str, str2, paymentCardGlobalConfig2 != null ? paymentCardGlobalConfig2.cvv : null, 3040));
                                    if (card != null) {
                                        String str14 = paymentDeviceOption.offered_price;
                                        if (str14 == null) {
                                            str14 = "";
                                        }
                                        String str15 = Intrinsics.areEqual(paymentDeviceOption.customization_eligible, Boolean.TRUE) ? str9 : null;
                                        String str16 = paymentDeviceOption.payment_device_name;
                                        if (card instanceof GridItemVisual.Card) {
                                            if (str16 != null && (obj = StringsKt.trim(str16).toString()) != null) {
                                                if (obj.length() <= 0) {
                                                    obj = null;
                                                }
                                                if (obj != null) {
                                                    Locale locale = Locale.US;
                                                    productDetailsPageToastLabel2 = new ProductDetailsPageToastLabel.Card(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, obj, locale));
                                                }
                                            }
                                            productDetailsPageToastLabel2 = null;
                                        } else {
                                            if (!(card instanceof GridItemVisual.Tag)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            int ordinal = ((GridItemVisual.Tag) card).viewModel.formFactor.ordinal();
                                            if (ordinal != 0) {
                                                if (ordinal != 1) {
                                                    if (ordinal != 2) {
                                                        if (ordinal != 3) {
                                                            if (ordinal != 4) {
                                                                if (ordinal != 5) {
                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                    return null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    productDetailsPageToastLabel = ProductDetailsPageToastLabel.MiniCard.INSTANCE;
                                                    productDetailsPageToastLabel2 = productDetailsPageToastLabel;
                                                }
                                                productDetailsPageToastLabel = ProductDetailsPageToastLabel.Heart.INSTANCE;
                                                productDetailsPageToastLabel2 = productDetailsPageToastLabel;
                                            }
                                            productDetailsPageToastLabel = ProductDetailsPageToastLabel.Wand.INSTANCE;
                                            productDetailsPageToastLabel2 = productDetailsPageToastLabel;
                                        }
                                        String str17 = paymentDeviceOption.payment_device_name;
                                        if (str17 == null) {
                                            str17 = "";
                                        }
                                        String str18 = paymentDeviceOption.accessibility_text;
                                        if (str18 == null) {
                                            str18 = "";
                                        }
                                        String str19 = paymentDeviceOption.availability_pill_label;
                                        String str20 = str14;
                                        if (str19 != null) {
                                            LabelTreatment labelTreatment2 = paymentDeviceOption.availability_pill_treatment;
                                            gridItemVisual = card;
                                            if (labelTreatment2 != null) {
                                                str5 = str17;
                                                str6 = str18;
                                                paymentCardGlobalConfig = paymentCardGlobalConfig2;
                                                availabilityPill = new AvailabilityPill(str19, new LabelsSection.LabelTreatment(labelTreatment2.background_color, labelTreatment2.text_color, labelTreatment2.border_color));
                                                productDetailsPage = paymentDeviceOption.product_details_page;
                                                if (productDetailsPage == null) {
                                                    boolean contains = set.contains(str10);
                                                    String str21 = productDetailsPage.title;
                                                    String str22 = str21 == null ? "" : str21;
                                                    List<ProductDetailsPage.Section> list2 = productDetailsPage.sections;
                                                    ArrayList arrayList = new ArrayList();
                                                    Iterator it5 = list2.iterator();
                                                    while (it5.hasNext()) {
                                                        ProductDetailsPage.Section.Type type2 = ((ProductDetailsPage.Section) it5.next()).type;
                                                        if (type2 instanceof ProductDetailsPage.Section.Type.Labels) {
                                                            List<ProductDetailsPage.LabelsSection.Label> list3 = ((ProductDetailsPage.Section.Type.Labels) type2).getValue().labels;
                                                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                                            Iterator it6 = list3.iterator();
                                                            while (it6.hasNext()) {
                                                                ProductDetailsPage.LabelsSection.Label label = (ProductDetailsPage.LabelsSection.Label) it6.next();
                                                                Iterator it7 = it5;
                                                                String str23 = label.label;
                                                                str23.getClass();
                                                                LabelTreatment labelTreatment3 = label.treatment;
                                                                String str24 = str10;
                                                                if (labelTreatment3 != null) {
                                                                    availabilityPill4 = availabilityPill;
                                                                    it2 = it6;
                                                                    labelTreatment = new LabelsSection.LabelTreatment(labelTreatment3.background_color, labelTreatment3.text_color, labelTreatment3.border_color);
                                                                } else {
                                                                    availabilityPill4 = availabilityPill;
                                                                    it2 = it6;
                                                                    labelTreatment = null;
                                                                }
                                                                arrayList2.add(new LabelsSection.Label(str23, labelTreatment));
                                                                it5 = it7;
                                                                str10 = str24;
                                                                it6 = it2;
                                                                availabilityPill = availabilityPill4;
                                                            }
                                                            it = it5;
                                                            str8 = str10;
                                                            availabilityPill3 = availabilityPill;
                                                            productDetailsPageSection = new LabelsSection(arrayList2);
                                                        } else {
                                                            it = it5;
                                                            str8 = str10;
                                                            availabilityPill3 = availabilityPill;
                                                            if (type2 instanceof ProductDetailsPage.Section.Type.Header) {
                                                                String str25 = ((ProductDetailsPage.Section.Type.Header) type2).getValue().title;
                                                                str25.getClass();
                                                                productDetailsPageSection = new HeaderSection(str25);
                                                            } else if (type2 instanceof ProductDetailsPage.Section.Type.ImageCarousel) {
                                                                ProductDetailsPage.Section.Type.ImageCarousel imageCarousel = (ProductDetailsPage.Section.Type.ImageCarousel) type2;
                                                                List<Image> list4 = imageCarousel.getValue().images;
                                                                Float f = imageCarousel.getValue().image_aspect_ratio;
                                                                productDetailsPageSection = new ImageCarouselSection(f != null ? f.floatValue() : 1.0f, list4);
                                                            } else if (type2 instanceof ProductDetailsPage.Section.Type.CollapsibleDetails) {
                                                                List<ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail> list5 = ((ProductDetailsPage.Section.Type.CollapsibleDetails) type2).getValue().collapsible_details;
                                                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                                                for (ProductDetailsPage.CollapsibleDetailsSection.CollapsibleDetail collapsibleDetail : list5) {
                                                                    String str26 = collapsibleDetail.title;
                                                                    str26.getClass();
                                                                    String str27 = collapsibleDetail.content;
                                                                    str27.getClass();
                                                                    arrayList3.add(new CollapsibleDetailsSection.CollapsibleDetail(str26, str27));
                                                                }
                                                                productDetailsPageSection = new CollapsibleDetailsSection(arrayList3);
                                                            } else if (type2 instanceof ProductDetailsPage.Section.Type.TileCarousel) {
                                                                List<ProductDetailsPage.TileCarouselSection.Tile> list6 = ((ProductDetailsPage.Section.Type.TileCarousel) type2).getValue().tiles;
                                                                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                                                                for (ProductDetailsPage.TileCarouselSection.Tile tile : list6) {
                                                                    Image image = tile.image;
                                                                    image.getClass();
                                                                    String str28 = tile.title;
                                                                    str28.getClass();
                                                                    String str29 = tile.description;
                                                                    str29.getClass();
                                                                    arrayList4.add(new TileCarouselSection.Tile(image, str28, str29));
                                                                }
                                                                productDetailsPageSection = new TileCarouselSection(arrayList4);
                                                            } else if (type2 instanceof ProductDetailsPage.Section.Type.IconGrid) {
                                                                ProductDetailsPage.Section.Type.IconGrid iconGrid = (ProductDetailsPage.Section.Type.IconGrid) type2;
                                                                BookletTile.GridContent gridContent = iconGrid.getValue().grid_content;
                                                                gridContent.getClass();
                                                                LocalizedString localizedString = gridContent.title_text;
                                                                String str30 = localizedString != null ? localizedString.translated_value : null;
                                                                BookletTile.GridContent gridContent2 = iconGrid.getValue().grid_content;
                                                                gridContent2.getClass();
                                                                List<BookletTile.GridContent.GridItem> list7 = gridContent2.grid_items;
                                                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                                                                Iterator it8 = list7.iterator();
                                                                while (it8.hasNext()) {
                                                                    BookletTile.GridContent.GridItem gridItem = (BookletTile.GridContent.GridItem) it8.next();
                                                                    Icon icon = gridItem.icon;
                                                                    String str31 = icon != null ? icon.arcade_id : null;
                                                                    str31.getClass();
                                                                    Iterator it9 = it8;
                                                                    LocalizedString localizedString2 = gridItem.title_text;
                                                                    String str32 = localizedString2 != null ? localizedString2.translated_value : null;
                                                                    str32.getClass();
                                                                    LocalizedString localizedString3 = gridItem.detail_text;
                                                                    String str33 = localizedString3 != null ? localizedString3.translated_value : null;
                                                                    str33.getClass();
                                                                    arrayList5.add(new IconGridSection.IconCell(str31, str32, str33));
                                                                    it8 = it9;
                                                                }
                                                                productDetailsPageSection = new IconGridSection(str30, arrayList5);
                                                            } else if (type2 instanceof ProductDetailsPage.Section.Type.MarkdownText) {
                                                                String str34 = ((ProductDetailsPage.Section.Type.MarkdownText) type2).getValue().text;
                                                                str34.getClass();
                                                                productDetailsPageSection = new MarkdownTextSection(str34);
                                                            } else if (type2 instanceof ProductDetailsPage.Section.Type.Disclosure) {
                                                                String str35 = ((ProductDetailsPage.Section.Type.Disclosure) type2).getValue().text;
                                                                str35.getClass();
                                                                productDetailsPageSection = new DisclosureSection(str35);
                                                            } else {
                                                                productDetailsPageSection = null;
                                                            }
                                                        }
                                                        if (productDetailsPageSection != null) {
                                                            arrayList.add(productDetailsPageSection);
                                                        }
                                                        it5 = it;
                                                        str10 = str8;
                                                        availabilityPill = availabilityPill3;
                                                    }
                                                    String str36 = str10;
                                                    availabilityPill2 = availabilityPill;
                                                    String str37 = productDetailsPage.cta_label;
                                                    String str38 = str37 != null ? str37 : "";
                                                    ProductDetailsPage.Action action = productDetailsPage.action;
                                                    int i8 = action == null ? -1 : ProductDetailsPageViewModelKt$WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
                                                    CtaAction ctaAction2 = CtaAction.Disabled.INSTANCE;
                                                    CtaAction ctaAction3 = CtaAction.Submit.INSTANCE;
                                                    if (i8 != -1 && i8 != 1) {
                                                        if (i8 == 2) {
                                                            ctaAction3 = CtaAction.Notify.INSTANCE;
                                                        } else if (i8 == 3) {
                                                            ctaAction = ctaAction2;
                                                            str7 = str36;
                                                            productDetailsPageViewModel2 = new ProductDetailsPageViewModel(str7, str22, arrayList, str38, ctaAction, str15, productDetailsPageToastLabel2, contains);
                                                            PaymentDeviceOption.PaymentDeviceType paymentDeviceType2 = paymentDeviceOption.payment_device_type;
                                                            if (!z2 && paymentDeviceType2 == PaymentDeviceOption.PaymentDeviceType.PAYMENT_TOKEN_DEVICE) {
                                                                String str39 = androidStringManager.get(R.string.payment_device_pdp_no_nfc_unsupported);
                                                                str39.getClass();
                                                                productDetailsPageViewModel2 = new ProductDetailsPageViewModel(str7, str22, arrayList, str39, ctaAction2, str15, productDetailsPageToastLabel2, contains);
                                                            }
                                                            productDetailsPageViewModel = productDetailsPageViewModel2;
                                                        } else if (i8 != 4) {
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            return null;
                                                        }
                                                    }
                                                    ctaAction = ctaAction3;
                                                    str7 = str36;
                                                    productDetailsPageViewModel2 = new ProductDetailsPageViewModel(str7, str22, arrayList, str38, ctaAction, str15, productDetailsPageToastLabel2, contains);
                                                    PaymentDeviceOption.PaymentDeviceType paymentDeviceType22 = paymentDeviceOption.payment_device_type;
                                                    if (!z2) {
                                                        String str392 = androidStringManager.get(R.string.payment_device_pdp_no_nfc_unsupported);
                                                        str392.getClass();
                                                        productDetailsPageViewModel2 = new ProductDetailsPageViewModel(str7, str22, arrayList, str392, ctaAction2, str15, productDetailsPageToastLabel2, contains);
                                                    }
                                                    productDetailsPageViewModel = productDetailsPageViewModel2;
                                                } else {
                                                    str7 = str10;
                                                    availabilityPill2 = availabilityPill;
                                                    productDetailsPageViewModel = null;
                                                }
                                                paymentDeviceItemViewModel = new PaymentDeviceItemViewModel(str7, gridItemVisual, str5, str20, str6, paymentDeviceAvailability2, availabilityPill2, productDetailsPageViewModel, paymentDeviceOption.background_image);
                                            }
                                        } else {
                                            gridItemVisual = card;
                                        }
                                        str5 = str17;
                                        str6 = str18;
                                        paymentCardGlobalConfig = paymentCardGlobalConfig2;
                                        availabilityPill = null;
                                        productDetailsPage = paymentDeviceOption.product_details_page;
                                        if (productDetailsPage == null) {
                                        }
                                        paymentDeviceItemViewModel = new PaymentDeviceItemViewModel(str7, gridItemVisual, str5, str20, str6, paymentDeviceAvailability2, availabilityPill2, productDetailsPageViewModel, paymentDeviceOption.background_image);
                                    }
                                    paymentCardGlobalConfig = paymentCardGlobalConfig2;
                                    paymentDeviceItemViewModel = null;
                                }
                                paymentMethod = null;
                                if (paymentCardGlobalConfig2 != null) {
                                }
                                if (paymentCardGlobalConfig2 != null) {
                                }
                                cardTheme2 = cardTheme;
                                mutableState = mutableState7;
                                str = null;
                                if (paymentCardGlobalConfig2 != null) {
                                }
                                str2 = null;
                                card = new GridItemVisual.Card(new StyledCardViewModel(str12, z3, cardTheme2, booleanValue3, customizationDetails3, null, false, paymentMethod, null, str13, str, str2, paymentCardGlobalConfig2 != null ? paymentCardGlobalConfig2.cvv : null, 3040));
                                if (card != null) {
                                }
                                paymentCardGlobalConfig = paymentCardGlobalConfig2;
                                paymentDeviceItemViewModel = null;
                            }
                        }
                        z = false;
                        if (isCashtagVisible(paymentCardGlobalConfig2, z)) {
                        }
                        if (paymentCardGlobalConfig2 == null) {
                        }
                        if (str11 != null) {
                        }
                        Boolean bool22 = paymentDeviceOption.customization_eligible;
                        if (bool22 == null) {
                        }
                        if (!Intrinsics.areEqual(paymentDeviceOption.customization_eligible, Boolean.TRUE)) {
                        }
                        if (paymentCardGlobalConfig2 == null) {
                        }
                        if (paymentMethod3 != null) {
                        }
                        if (i2 != -1) {
                        }
                        paymentMethod = null;
                        if (paymentCardGlobalConfig2 != null) {
                        }
                        if (paymentCardGlobalConfig2 != null) {
                        }
                        cardTheme2 = cardTheme;
                        mutableState = mutableState7;
                        str = null;
                        if (paymentCardGlobalConfig2 != null) {
                        }
                        str2 = null;
                        card = new GridItemVisual.Card(new StyledCardViewModel(str12, z3, cardTheme2, booleanValue3, customizationDetails3, null, false, paymentMethod, null, str13, str, str2, paymentCardGlobalConfig2 != null ? paymentCardGlobalConfig2.cvv : null, 3040));
                        if (card != null) {
                        }
                        paymentCardGlobalConfig = paymentCardGlobalConfig2;
                        paymentDeviceItemViewModel = null;
                    }
                    mutableState = mutableState7;
                    card = null;
                    if (card != null) {
                    }
                    paymentCardGlobalConfig = paymentCardGlobalConfig2;
                    paymentDeviceItemViewModel = null;
                } else {
                    if (i3 == 3) {
                        TagThemeDefinition tagThemeDefinition = (TagThemeDefinition) map2.get(str10);
                        if (tagThemeDefinition == null || (appTagFormFactor = FormattedResources.toAppTagFormFactor(tagThemeDefinition.form_factor)) == null) {
                            mutableState = mutableState7;
                            paymentCardGlobalConfig = paymentCardGlobalConfig2;
                            paymentDeviceItemViewModel = null;
                        } else {
                            card = new GridItemVisual.Tag(new TagThemeViewModel(str10, appTagFormFactor));
                            mutableState = mutableState7;
                            if (card != null) {
                            }
                            paymentCardGlobalConfig = paymentCardGlobalConfig2;
                            paymentDeviceItemViewModel = null;
                        }
                    }
                    mutableState = mutableState7;
                    card = null;
                    if (card != null) {
                    }
                    paymentCardGlobalConfig = paymentCardGlobalConfig2;
                    paymentDeviceItemViewModel = null;
                }
                if (paymentDeviceItemViewModel != null) {
                    r6.add(paymentDeviceItemViewModel);
                }
                mutableState7 = mutableState;
                customizationDetails = customizationDetails2;
                mutableState9 = mutableState10;
                booleanValue = z2;
                it3 = it4;
                paymentCardGlobalConfig2 = paymentCardGlobalConfig;
            }
        } else {
            r6 = EmptyList.INSTANCE;
        }
        List list8 = r6;
        Integer[] numArr = {Integer.valueOf(list8.size())};
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.payment_device_customization_item_count)).format(numArr);
        format2.getClass();
        String str40 = (String) mutableState2.getValue();
        String str41 = (String) mutableState2.getValue();
        if (str41 != null) {
            List list9 = list8;
            if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                Iterator it10 = list9.iterator();
                while (it10.hasNext()) {
                    if (Intrinsics.areEqual(((PaymentDeviceItemViewModel) it10.next()).id, str41)) {
                        PaymentDeviceCustomizationBlockerConfig paymentDeviceCustomizationBlockerConfig2 = paymentDeviceCustomizationBlocker.blocker_config;
                        PaymentDeviceCustomizationBlockerConfig.PresentationMode presentationMode = paymentDeviceCustomizationBlockerConfig2 != null ? paymentDeviceCustomizationBlockerConfig2.presentation_mode : null;
                        int i9 = presentationMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[presentationMode.ordinal()];
                        if (i9 != -1) {
                            if (i9 == 1) {
                                zoomLevel = ZoomLevel.NEAR;
                                PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel = new PaymentDeviceCustomizationViewModel(format2, list8, str40, zoomLevel, false, paymentDeviceCustomizationBlocker.background_image);
                                r13.end(false);
                                return paymentDeviceCustomizationViewModel;
                            }
                            if (i9 != 2 && i9 != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        }
                        zoomLevel = ZoomLevel.MEDIUM;
                        PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel2 = new PaymentDeviceCustomizationViewModel(format2, list8, str40, zoomLevel, false, paymentDeviceCustomizationBlocker.background_image);
                        r13.end(false);
                        return paymentDeviceCustomizationViewModel2;
                    }
                }
            }
        }
        zoomLevel = ZoomLevel.FAR;
        PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel22 = new PaymentDeviceCustomizationViewModel(format2, list8, str40, zoomLevel, false, paymentDeviceCustomizationBlocker.background_image);
        r13.end(false);
        return paymentDeviceCustomizationViewModel22;
    }
}
