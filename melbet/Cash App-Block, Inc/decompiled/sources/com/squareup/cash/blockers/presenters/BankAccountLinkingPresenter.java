package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.biometrics.BiometricsStore$read$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.instruments.backend.api.BankAccountLinker$Args;
import com.squareup.cash.instruments.backend.api.BankAccountLinker$Result;
import com.squareup.cash.instruments.backend.api.InstrumentVerifier$Args;
import com.squareup.cash.instruments.backend.api.InstrumentVerifier$Result;
import com.squareup.cash.instruments.backend.real.RealInstrumentVerifier;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.scannerview.SizeMap;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class BankAccountLinkingPresenter implements MoleculePresenter {
    public final BankAccountLinkingViewModel accountModel;
    public String accountNumber;
    public final Analytics analytics;
    public final BlockersScreens.BankAccountLinkingScreen args;
    public final SizeMap bankAccountLinker;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final RealBlockersHelper blockersHelper;
    public final BlockersDataNavigator blockersNavigator;
    public final BankAccountLinkingViewModel bsbModel;
    public String bsbNumber;
    public final BankAccountLinkingViewModel institutionModel;
    public String institutionNumber;
    public final RealInstrumentVerifier instrumentVerifier;
    public final BetterNavigator.ScreenNavigator navigator;
    public final TimeToLiveSyncState profileSyncState;
    public final BankAccountLinkingViewModel routingModel;
    public String routingNumber;
    public String sortCode;
    public final BankAccountLinkingViewModel sortCodeModel;
    public final AndroidStringManager stringManager;
    public final BankAccountLinkingViewModel transitModel;
    public String transitNumber;
    public final BankAccountLinkingViewModel verifyAccountModel;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BankAccountLinkingViewModel.Mode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BankAccountLinkingViewModel.Mode mode = BankAccountLinkingViewModel.Mode.ROUTING;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BankAccountLinkingViewModel.Mode mode2 = BankAccountLinkingViewModel.Mode.ROUTING;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                BankAccountLinkingViewModel.Mode mode3 = BankAccountLinkingViewModel.Mode.ROUTING;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                BankAccountLinkingViewModel.Mode mode4 = BankAccountLinkingViewModel.Mode.ROUTING;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                BankAccountLinkingViewModel.Mode mode5 = BankAccountLinkingViewModel.Mode.ROUTING;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                BankAccountLinkingViewModel.Mode mode6 = BankAccountLinkingViewModel.Mode.ROUTING;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[Region.values().length];
            try {
                iArr2[Region.AUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Region.CAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Region.GBR.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[InstrumentVerifier$Result.NotSuccessful.Status.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                InstrumentVerifier$Result.NotSuccessful.Status status = InstrumentVerifier$Result.NotSuccessful.Status.FAILURE;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                InstrumentVerifier$Result.NotSuccessful.Status status2 = InstrumentVerifier$Result.NotSuccessful.Status.FAILURE;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public BankAccountLinkingPresenter(AndroidStringManager androidStringManager, Analytics analytics, BlockerFlowListener blockerFlowListener, BlockersDataNavigator blockersDataNavigator, SizeMap sizeMap, RealInstrumentVerifier realInstrumentVerifier, CoroutineScope coroutineScope, TimeToLiveSyncState timeToLiveSyncState, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockersScreens.BankAccountLinkingScreen bankAccountLinkingScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        String str;
        String str2;
        String str3;
        String str4;
        BlockersData blockersData = bankAccountLinkingScreen.blockersData;
        Redacted redacted = bankAccountLinkingScreen.titleOverride;
        String str5 = bankAccountLinkingScreen.inputHint;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.blockersNavigator = blockersDataNavigator;
        this.bankAccountLinker = sizeMap;
        this.instrumentVerifier = realInstrumentVerifier;
        this.profileSyncState = timeToLiveSyncState;
        this.args = bankAccountLinkingScreen;
        this.navigator = screenNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        List list = bankAccountLinkingScreen.helpItems;
        BankAccountLinkingViewModel.BottomButton bottomButton = (list == null || !(list.isEmpty() ^ true)) ? blockersData.flow == BlockersData.Flow.ONBOARDING ? BankAccountLinkingViewModel.BottomButton.SKIP : BankAccountLinkingViewModel.BottomButton.NONE : BankAccountLinkingViewModel.BottomButton.HELP;
        BankAccountLinkingViewModel.Mode mode = BankAccountLinkingViewModel.Mode.ROUTING;
        BankAccountLinkingViewModel bankAccountLinkingViewModel = new BankAccountLinkingViewModel(mode, null, null, null, 0, Integer.MAX_VALUE, null, null, new Versioned(null, 0), false, new Versioned(Boolean.TRUE, 0), bottomButton);
        this.routingModel = BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel, mode, (redacted == null || (str4 = (String) redacted.getValue()) == null) ? androidStringManager.get(R.string.blockers_ach_routing_title) : str4, androidStringManager.get(R.string.blockers_ach_routing_subtitle), str5 == null ? androidStringManager.get(R.string.blockers_ach_routing_hint) : str5, 9, 9, null, null, null, false, null, 8128);
        this.transitModel = BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel, BankAccountLinkingViewModel.Mode.TRANSIT, (redacted == null || (str3 = (String) redacted.getValue()) == null) ? androidStringManager.get(R.string.blockers_ach_transit_title) : str3, null, str5 == null ? androidStringManager.get(R.string.blockers_ach_transit_hint) : str5, 5, 5, null, null, null, false, null, 8132);
        this.institutionModel = BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel, BankAccountLinkingViewModel.Mode.INSTITUTION, androidStringManager.get(R.string.blockers_ach_institution_title), null, str5 == null ? androidStringManager.get(R.string.blockers_ach_institution_hint) : str5, 3, 3, null, null, null, false, null, 8132);
        this.bsbModel = BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel, BankAccountLinkingViewModel.Mode.BSB, (redacted == null || (str2 = (String) redacted.getValue()) == null) ? androidStringManager.get(R.string.blockers_ach_bsb_title) : str2, null, str5 == null ? androidStringManager.get(R.string.blockers_ach_bsb_hint) : str5, 6, 6, "XXX-XXX", null, null, false, null, 8068);
        this.sortCodeModel = BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel, BankAccountLinkingViewModel.Mode.SORT_CODE, (redacted == null || (str = (String) redacted.getValue()) == null) ? androidStringManager.get(R.string.blockers_ach_sort_code_title) : str, null, str5 == null ? androidStringManager.get(R.string.blockers_ach_sort_code_hint) : str5, 6, 6, "XX-XX-XX", null, null, false, null, 8068);
        this.accountModel = BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel, BankAccountLinkingViewModel.Mode.ACCOUNT, androidStringManager.get(R.string.blockers_ach_account_title), blockersData.region == Region.CAN ? androidStringManager.get(R.string.blockers_ach_account_subtitle_ca) : androidStringManager.get(R.string.blockers_ach_account_subtitle), str5 == null ? androidStringManager.get(R.string.blockers_ach_account_hint) : str5, 4, 20, null, null, null, false, null, 8128);
        this.verifyAccountModel = BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel, BankAccountLinkingViewModel.Mode.VERIFY_ACCOUNT, androidStringManager.get(R.string.blockers_ach_verify_account_title), null, str5 == null ? androidStringManager.get(R.string.blockers_ach_account_hint) : str5, 4, 20, null, null, null, false, null, 8132);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0074, code lost:
    
        if (r1 == r11) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$linkAccount(BankAccountLinkingPresenter bankAccountLinkingPresenter, BankAccountLinkingViewModel bankAccountLinkingViewModel, ContinuationImpl continuationImpl) {
        BankAccountLinkingPresenter$linkAccount$1 bankAccountLinkingPresenter$linkAccount$1;
        int i;
        BankAccountLinkingViewModel bankAccountLinkingViewModel2;
        BankAccountLinkingViewModel bankAccountLinkingViewModel3;
        BankAccountLinker$Result bankAccountLinker$Result;
        BankAccountLinkingViewModel bankAccountLinkingViewModel4;
        BankAccountLinker$Result bankAccountLinker$Result2;
        AndroidStringManager androidStringManager = bankAccountLinkingPresenter.stringManager;
        BetterNavigator.ScreenNavigator screenNavigator = bankAccountLinkingPresenter.navigator;
        BlockersScreens.BankAccountLinkingScreen bankAccountLinkingScreen = bankAccountLinkingPresenter.args;
        BlockersData blockersData = bankAccountLinkingScreen.blockersData;
        if (continuationImpl instanceof BankAccountLinkingPresenter$linkAccount$1) {
            bankAccountLinkingPresenter$linkAccount$1 = (BankAccountLinkingPresenter$linkAccount$1) continuationImpl;
            int i2 = bankAccountLinkingPresenter$linkAccount$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bankAccountLinkingPresenter$linkAccount$1.label = i2 - PKIFailureInfo.systemUnavail;
                BankAccountLinkingPresenter$linkAccount$1 bankAccountLinkingPresenter$linkAccount$12 = bankAccountLinkingPresenter$linkAccount$1;
                Object obj = bankAccountLinkingPresenter$linkAccount$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bankAccountLinkingPresenter$linkAccount$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String routingNumberForServerRequest = bankAccountLinkingPresenter.routingNumberForServerRequest();
                    String str = bankAccountLinkingPresenter.accountNumber;
                    str.getClass();
                    BankAccountLinker$Args bankAccountLinker$Args = new BankAccountLinker$Args(routingNumberForServerRequest, str, blockersData.requestContext, blockersData.clientScenario, blockersData.flowToken);
                    SizeMap sizeMap = bankAccountLinkingPresenter.bankAccountLinker;
                    bankAccountLinkingViewModel2 = bankAccountLinkingViewModel;
                    bankAccountLinkingPresenter$linkAccount$12.L$0 = bankAccountLinkingViewModel2;
                    bankAccountLinkingPresenter$linkAccount$12.label = 1;
                    obj = sizeMap.link(bankAccountLinker$Args, bankAccountLinkingPresenter$linkAccount$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bankAccountLinker$Result2 = bankAccountLinkingPresenter$linkAccount$12.L$2;
                        bankAccountLinkingViewModel4 = bankAccountLinkingPresenter$linkAccount$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        bankAccountLinker$Result = bankAccountLinker$Result2;
                        bankAccountLinkingViewModel3 = bankAccountLinkingViewModel4;
                        if (bankAccountLinker$Result instanceof BankAccountLinker$Result.Loading) {
                            return BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel3, null, null, null, null, 0, 0, null, null, null, true, null, 7167);
                        }
                        if (bankAccountLinker$Result instanceof BankAccountLinker$Result.NotSuccessful) {
                            screenNavigator.goTo(new BlockersScreens.InvalidInputScreen(blockersData, ((BankAccountLinker$Result.NotSuccessful) bankAccountLinker$Result).failureMessage, null));
                            BankAccountLinkingViewModel initialModel = bankAccountLinkingPresenter.initialModel();
                            return BankAccountLinkingViewModel.copy$default(initialModel, null, null, null, null, 0, 0, null, null, null, false, VersionedKt.update(initialModel.valid, Boolean.FALSE), 6143);
                        }
                        if (!(bankAccountLinker$Result instanceof BankAccountLinker$Result.Successful)) {
                            if (!(bankAccountLinker$Result instanceof BankAccountLinker$Result.NetworkFailure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Timber.Forest.e("Failed to link bank account", new Object[0]);
                            screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, TextUtilsCompat.errorMessaging(androidStringManager, ((BankAccountLinker$Result.NetworkFailure) bankAccountLinker$Result).failure, null).message, null, 4));
                            return BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel3, null, null, null, null, 0, 0, null, null, null, false, null, 7167);
                        }
                        bankAccountLinkingPresenter.profileSyncState.lastAttemptedRefresh = 0L;
                        BlockersDataNavigator blockersDataNavigator = bankAccountLinkingPresenter.blockersNavigator;
                        ResponseContext responseContext = ((BankAccountLinker$Result.Successful) bankAccountLinker$Result).responseContext;
                        responseContext.getClass();
                        Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                        screenNavigator.goTo(blockersDataNavigator.getNext(bankAccountLinkingScreen, blockersData.updateFromResponseContext(responseContext, false)));
                        return bankAccountLinkingViewModel3;
                    }
                    bankAccountLinkingViewModel2 = bankAccountLinkingPresenter$linkAccount$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                bankAccountLinkingViewModel3 = bankAccountLinkingViewModel2;
                bankAccountLinker$Result = (BankAccountLinker$Result) obj;
                if (!Intrinsics.areEqual(bankAccountLinker$Result, BankAccountLinker$Result.Loading.INSTANCE)) {
                    Analytics analytics = bankAccountLinkingPresenter.analytics;
                    BlockersData blockersData2 = bankAccountLinkingScreen.blockersData;
                    bankAccountLinkingPresenter$linkAccount$12.L$0 = bankAccountLinkingViewModel3;
                    bankAccountLinkingPresenter$linkAccount$12.L$2 = bankAccountLinker$Result;
                    bankAccountLinkingPresenter$linkAccount$12.label = 2;
                    Object trackBlockerSubmissionAnalyticsInternal2 = PointerInputModifierNodeKt.trackBlockerSubmissionAnalyticsInternal2(analytics, androidStringManager, blockersData2, R.string.blockers_retrofit_error_message, new BadgeQueries$$ExternalSyntheticLambda0(22, bankAccountLinker$Result, androidStringManager), new BiometricsStore$read$1(1, null, 1), bankAccountLinkingPresenter$linkAccount$12);
                    if (trackBlockerSubmissionAnalyticsInternal2 != coroutineSingletons) {
                        trackBlockerSubmissionAnalyticsInternal2 = Unit.INSTANCE;
                    }
                    if (trackBlockerSubmissionAnalyticsInternal2 != coroutineSingletons) {
                        bankAccountLinkingViewModel4 = bankAccountLinkingViewModel3;
                        bankAccountLinker$Result2 = bankAccountLinker$Result;
                        bankAccountLinker$Result = bankAccountLinker$Result2;
                        bankAccountLinkingViewModel3 = bankAccountLinkingViewModel4;
                    }
                    return coroutineSingletons;
                }
                if (bankAccountLinker$Result instanceof BankAccountLinker$Result.Loading) {
                }
            }
        }
        bankAccountLinkingPresenter$linkAccount$1 = new BankAccountLinkingPresenter$linkAccount$1(bankAccountLinkingPresenter, continuationImpl);
        BankAccountLinkingPresenter$linkAccount$1 bankAccountLinkingPresenter$linkAccount$122 = bankAccountLinkingPresenter$linkAccount$1;
        Object obj2 = bankAccountLinkingPresenter$linkAccount$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bankAccountLinkingPresenter$linkAccount$122.label;
        if (i != 0) {
        }
        bankAccountLinkingViewModel3 = bankAccountLinkingViewModel2;
        bankAccountLinker$Result = (BankAccountLinker$Result) obj2;
        if (!Intrinsics.areEqual(bankAccountLinker$Result, BankAccountLinker$Result.Loading.INSTANCE)) {
        }
        if (bankAccountLinker$Result instanceof BankAccountLinker$Result.Loading) {
        }
    }

    public static final boolean access$validNumber(BankAccountLinkingPresenter bankAccountLinkingPresenter, String str, int i, int i2) {
        int i3;
        if (str.length() >= i && str.length() <= i2) {
            for (0; i3 < str.length(); i3 + 1) {
                char charAt = str.charAt(i3);
                i3 = (Intrinsics.compare((int) charAt, 48) >= 0 && Intrinsics.compare((int) charAt, 57) <= 0) ? i3 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$verifyAccount(BankAccountLinkingPresenter bankAccountLinkingPresenter, BankAccountLinkingViewModel bankAccountLinkingViewModel, ContinuationImpl continuationImpl) {
        BankAccountLinkingPresenter$verifyAccount$1 bankAccountLinkingPresenter$verifyAccount$1;
        int i;
        BankAccountLinkingViewModel bankAccountLinkingViewModel2;
        InstrumentVerifier$Result instrumentVerifier$Result;
        BlockersDataNavigator blockersDataNavigator = bankAccountLinkingPresenter.blockersNavigator;
        BetterNavigator.ScreenNavigator screenNavigator = bankAccountLinkingPresenter.navigator;
        BlockersScreens.BankAccountLinkingScreen bankAccountLinkingScreen = bankAccountLinkingPresenter.args;
        BlockersData blockersData = bankAccountLinkingScreen.blockersData;
        if (continuationImpl instanceof BankAccountLinkingPresenter$verifyAccount$1) {
            bankAccountLinkingPresenter$verifyAccount$1 = (BankAccountLinkingPresenter$verifyAccount$1) continuationImpl;
            int i2 = bankAccountLinkingPresenter$verifyAccount$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bankAccountLinkingPresenter$verifyAccount$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = bankAccountLinkingPresenter$verifyAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bankAccountLinkingPresenter$verifyAccount$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String routingNumberForServerRequest = bankAccountLinkingPresenter.routingNumberForServerRequest();
                    String str = bankAccountLinkingPresenter.accountNumber;
                    str.getClass();
                    InstrumentVerifier$Args instrumentVerifier$Args = new InstrumentVerifier$Args(null, routingNumberForServerRequest, str, blockersData.clientScenario, blockersData.flowToken, 1);
                    RealInstrumentVerifier realInstrumentVerifier = bankAccountLinkingPresenter.instrumentVerifier;
                    bankAccountLinkingPresenter$verifyAccount$1.L$0 = bankAccountLinkingViewModel;
                    bankAccountLinkingPresenter$verifyAccount$1.label = 1;
                    obj = realInstrumentVerifier.verify(instrumentVerifier$Args, bankAccountLinkingPresenter$verifyAccount$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bankAccountLinkingViewModel2 = bankAccountLinkingViewModel;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    BankAccountLinkingViewModel bankAccountLinkingViewModel3 = bankAccountLinkingPresenter$verifyAccount$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    bankAccountLinkingViewModel2 = bankAccountLinkingViewModel3;
                }
                instrumentVerifier$Result = (InstrumentVerifier$Result) obj;
                if (!(instrumentVerifier$Result instanceof InstrumentVerifier$Result.Loading)) {
                    return BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel2, null, null, null, null, 0, 0, null, null, null, true, null, 7167);
                }
                if (!(instrumentVerifier$Result instanceof InstrumentVerifier$Result.NotSuccessful)) {
                    if (instrumentVerifier$Result instanceof InstrumentVerifier$Result.Successful) {
                        Timber.Forest.d("Bank verified successfully.", new Object[0]);
                        ResponseContext responseContext = ((InstrumentVerifier$Result.Successful) instrumentVerifier$Result).responseContext;
                        Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                        screenNavigator.goTo(blockersDataNavigator.getNext(bankAccountLinkingScreen, blockersData.updateFromResponseContext(responseContext, false)));
                        return bankAccountLinkingViewModel2;
                    }
                    if (instrumentVerifier$Result instanceof InstrumentVerifier$Result.NetworkFailure) {
                        screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, TextUtilsCompat.errorMessaging(bankAccountLinkingPresenter.stringManager, ((InstrumentVerifier$Result.NetworkFailure) instrumentVerifier$Result).failure, null).message, null, 4));
                        return BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel2, null, null, null, null, 0, 0, null, null, null, false, null, 7167);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                InstrumentVerifier$Result.NotSuccessful notSuccessful = (InstrumentVerifier$Result.NotSuccessful) instrumentVerifier$Result;
                ResponseContext responseContext2 = notSuccessful.responseContext;
                String str2 = notSuccessful.failureMessage;
                Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
                BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext2, false);
                InstrumentVerifier$Result.NotSuccessful.Status status = notSuccessful.status;
                int ordinal = status.ordinal();
                if (ordinal == 0) {
                    if (str2 != null) {
                        screenNavigator.goTo(new BlockersScreens.InvalidInputScreen(blockersData, str2, null));
                    }
                    BankAccountLinkingViewModel initialModel = bankAccountLinkingPresenter.initialModel();
                    return BankAccountLinkingViewModel.copy$default(initialModel, null, null, null, null, 0, 0, null, null, null, false, VersionedKt.update(initialModel.valid, Boolean.FALSE), 6143);
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                        return null;
                    }
                    bankAccountLinkingPresenter.blockerFlowAnalytics.onFlowCancelled(blockersData);
                    screenNavigator.goTo(blockersData.exitScreen);
                    return bankAccountLinkingViewModel2;
                }
                Screen next = blockersDataNavigator.getNext(bankAccountLinkingScreen, updateFromResponseContext);
                if (str2 == null || StringsKt.isBlank(str2)) {
                    screenNavigator.goTo(next);
                    return bankAccountLinkingViewModel2;
                }
                screenNavigator.goTo(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, next, str2, null, 8));
                return bankAccountLinkingViewModel2;
            }
        }
        bankAccountLinkingPresenter$verifyAccount$1 = new BankAccountLinkingPresenter$verifyAccount$1(bankAccountLinkingPresenter, continuationImpl);
        Object obj2 = bankAccountLinkingPresenter$verifyAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bankAccountLinkingPresenter$verifyAccount$1.label;
        if (i != 0) {
        }
        instrumentVerifier$Result = (InstrumentVerifier$Result) obj2;
        if (!(instrumentVerifier$Result instanceof InstrumentVerifier$Result.Loading)) {
        }
    }

    public final BankAccountLinkingViewModel initialModel() {
        int i = WhenMappings.$EnumSwitchMapping$1[this.args.blockersData.region.ordinal()];
        if (i == 1) {
            BankAccountLinkingViewModel bankAccountLinkingViewModel = this.bsbModel;
            return BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel, null, bankAccountLinkingViewModel.title, null, null, 0, 0, null, this.bsbNumber, null, false, null, 7933);
        }
        if (i == 2) {
            BankAccountLinkingViewModel bankAccountLinkingViewModel2 = this.transitModel;
            return BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel2, null, bankAccountLinkingViewModel2.title, null, null, 0, 0, null, this.transitNumber, null, false, null, 7933);
        }
        if (i != 3) {
            BankAccountLinkingViewModel bankAccountLinkingViewModel3 = this.routingModel;
            return BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel3, null, bankAccountLinkingViewModel3.title, null, null, 0, 0, null, this.routingNumber, null, false, null, 7933);
        }
        BankAccountLinkingViewModel bankAccountLinkingViewModel4 = this.sortCodeModel;
        return BankAccountLinkingViewModel.copy$default(bankAccountLinkingViewModel4, null, bankAccountLinkingViewModel4.title, null, null, 0, 0, null, this.sortCode, null, false, null, 7933);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(867675541);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.mutableStateOf$default(initialModel());
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Updater.LaunchedEffect(gapComposer, flow, new SetNamePresenter$models$1$1$1(11, mutableState, this, flow, (Continuation) null));
        BankAccountLinkingViewModel bankAccountLinkingViewModel = (BankAccountLinkingViewModel) mutableState.getValue();
        gapComposer.end(false);
        return bankAccountLinkingViewModel;
    }

    public final String routingNumberForServerRequest() {
        int i = WhenMappings.$EnumSwitchMapping$1[this.args.blockersData.region.ordinal()];
        if (i == 1) {
            String str = this.bsbNumber;
            str.getClass();
            return str;
        }
        if (i != 2) {
            if (i != 3) {
                String str2 = this.routingNumber;
                str2.getClass();
                return str2;
            }
            String str3 = this.sortCode;
            str3.getClass();
            return str3;
        }
        String str4 = this.institutionNumber;
        str4.getClass();
        String str5 = this.transitNumber;
        str5.getClass();
        return "0" + str4 + str5;
    }
}
