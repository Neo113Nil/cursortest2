package com.squareup.cash.family.familyhub.backend.real;

import androidx.compose.ui.draw.RotateKt;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import app.cash.api.ApiResult;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e0;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.cryptonauts.api.CryptoCustomerControlsService;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatusRequestHandler;
import com.squareup.cash.family.familyhub.backend.api.FamilyParsingErrorFactory;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FamiliesSponsorDrivenP2pLimits;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.familynotifications.api.v1.FamilyNotificationsService;
import com.squareup.protos.cash.familynotifications.api.v1.ListNotificationSettingsRequest;
import com.squareup.protos.cash.familynotifications.api.v1.ListNotificationSettingsResponse;
import com.squareup.protos.cash.familynotifications.api.v1.NotificationSetting;
import com.squareup.protos.cash.familynotifications.api.v1.NotificationSetting$Setting$RealtimeNotificationSetting;
import com.squareup.protos.cash.familynotifications.api.v1.RealtimeNotificationSetting;
import com.squareup.protos.cash.familynotifications.api.v1.UpdateNotificationSettingsRequest;
import com.squareup.protos.cash.fiatly.api.v1.CustomP2PLimit;
import com.squareup.protos.cash.fiatly.api.v1.FiatlyService;
import com.squareup.protos.cash.fiatly.api.v1.GetP2PControlsRequest;
import com.squareup.protos.cash.fiatly.api.v1.GetP2PControlsResponse;
import com.squareup.protos.cash.fiatly.api.v1.P2PControls;
import com.squareup.protos.cash.fiatly.api.v1.SetP2PControlsRequest;
import com.squareup.protos.cash.fiatly.api.v1.SetP2PControlsResponse;
import com.squareup.protos.cash.investcustomer.api.v1.InvestCustomerService;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.protos.cash.referly.api.incentives.client.IncentivesClientService;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealDependentControlStatusManager implements HasObservability {
    public final ControlType controlType;
    public final SharedFlowImpl dependentControlStatus;
    public final DependentControlStatusRequestHandler dependentControlStatusRequestHandler;
    public final RealDependentControlsCache dependentControlsCache;
    public final String dependentToken;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final FiatlyService fiatlyService;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final FamilyNotificationsService service;
    public final SessionManager sessionManager;

    public final class Factory {
        public final AegisService aegisService;
        public final CryptoCustomerControlsService cryptoService;
        public final RealDependentControlsCache dependentControlsCache;
        public final ErrorReporter errorReporter;
        public final FamilyNotificationsService familyNotificationsService;
        public final FeatureFlagManager featureFlagManager;
        public final FiatlyService fiatlyService;
        public final IncentivesClientService incentivesClientService;
        public final InvestCustomerService investCustomerService;
        public final SampleStrategy oneErrorPerAppSessionStrategy;
        public final PostcardClientService postcardService;
        public final CoroutineScope scope;
        public final SessionManager sessionManager;
        public final SponseeWalletSnapshotFetcher snapshotFetcher;

        public Factory(InvestCustomerService investCustomerService, FamilyNotificationsService familyNotificationsService, FiatlyService fiatlyService, PostcardClientService postcardClientService, AegisService aegisService, CryptoCustomerControlsService cryptoCustomerControlsService, IncentivesClientService incentivesClientService, SessionManager sessionManager, RealDependentControlsCache realDependentControlsCache, FeatureFlagManager featureFlagManager, SponseeWalletSnapshotFetcher sponseeWalletSnapshotFetcher, CoroutineScope coroutineScope, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
            this.investCustomerService = investCustomerService;
            this.familyNotificationsService = familyNotificationsService;
            this.fiatlyService = fiatlyService;
            this.postcardService = postcardClientService;
            this.aegisService = aegisService;
            this.cryptoService = cryptoCustomerControlsService;
            this.incentivesClientService = incentivesClientService;
            this.sessionManager = sessionManager;
            this.dependentControlsCache = realDependentControlsCache;
            this.featureFlagManager = featureFlagManager;
            this.snapshotFetcher = sponseeWalletSnapshotFetcher;
            this.scope = coroutineScope;
            this.errorReporter = errorReporter;
            this.oneErrorPerAppSessionStrategy = sampleStrategy;
        }

        public final RealDependentControlStatusManager create(ControlType controlType, String str) {
            controlType.getClass();
            str.getClass();
            RealDependentControlsCache realDependentControlsCache = this.dependentControlsCache;
            if (!Intrinsics.areEqual(realDependentControlsCache.currentToken, str)) {
                realDependentControlsCache.currentToken = str;
                realDependentControlsCache.cache.clear();
            }
            int ordinal = controlType.ordinal();
            FeatureFlagManager featureFlagManager = this.featureFlagManager;
            return new RealDependentControlStatusManager(this.familyNotificationsService, this.fiatlyService, this.sessionManager, str, controlType, ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? null : new Result(this.incentivesClientService, str) : new BinaryBitmap(this.cryptoService, str) : new BinaryBitmap(this.investCustomerService, str) : new e0(str, this.snapshotFetcher, this.postcardService, this.aegisService, featureFlagManager), realDependentControlsCache, featureFlagManager, this.scope, this.errorReporter, this.oneErrorPerAppSessionStrategy);
        }
    }

    public final class P2pEnabled {
        public final boolean enabled;

        public P2pEnabled(boolean z) {
            this.enabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof P2pEnabled) && this.enabled == ((P2pEnabled) obj).enabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("P2pEnabled(enabled=", ")", this.enabled);
        }
    }

    public RealDependentControlStatusManager(FamilyNotificationsService familyNotificationsService, FiatlyService fiatlyService, SessionManager sessionManager, String str, ControlType controlType, DependentControlStatusRequestHandler dependentControlStatusRequestHandler, RealDependentControlsCache realDependentControlsCache, FeatureFlagManager featureFlagManager, CoroutineScope coroutineScope, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        str.getClass();
        controlType.getClass();
        this.service = familyNotificationsService;
        this.fiatlyService = fiatlyService;
        this.sessionManager = sessionManager;
        this.dependentToken = str;
        this.controlType = controlType;
        this.dependentControlStatusRequestHandler = dependentControlStatusRequestHandler;
        this.dependentControlsCache = realDependentControlsCache;
        this.featureFlagManager = featureFlagManager;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        JobKt.launch$default(coroutineScope, null, null, new GooglePayPresenter$models$1$1(this, null, 19), 3);
        this.dependentControlStatus = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02b2, code lost:
    
        if (updateCacheAndEmitNewStatus(r2, r3) == r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02cc, code lost:
    
        if (r11.emit(r0, r3) == r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00e7, code lost:
    
        if (r11.emit(r14, r3) == r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0105, code lost:
    
        if (r11.emit(r0, r3) == r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0133, code lost:
    
        if (r2 == r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0178, code lost:
    
        if (r2 == r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x024c, code lost:
    
        if (r2 == r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00b5, code lost:
    
        if (r11.emit(r2, r3) == r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00c5, code lost:
    
        if (r11.emit(com.squareup.cash.family.familyhub.backend.api.DependentControlStatus.InitialLoading.INSTANCE, r3) == r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0147, code lost:
    
        if (updateCacheAndEmitNewStatus(r2, r3) == r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x015c, code lost:
    
        if (r11.emit(r0, r3) == r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0210, code lost:
    
        if (updateCacheAndEmitNewStatus(r13, r3) == r4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x022c, code lost:
    
        if (r11.emit(r0, r3) == r4) goto L172;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDependentControlStatus(boolean z, ContinuationImpl continuationImpl) {
        RealDependentControlStatusManager$getDependentControlStatus$1 realDependentControlStatusManager$getDependentControlStatus$1;
        int i;
        DependentControlStatus.Loaded loaded;
        DependentControlStatus.Loaded loaded2;
        Object obj;
        NotificationSetting$Setting$RealtimeNotificationSetting notificationSetting$Setting$RealtimeNotificationSetting;
        RealtimeNotificationSetting realtimeNotificationSetting;
        RealtimeNotificationSetting realtimeNotificationSetting2;
        DependentControlStatus.Loaded loadedNonLimitControl;
        List list;
        boolean z2 = z;
        if (continuationImpl instanceof RealDependentControlStatusManager$getDependentControlStatus$1) {
            realDependentControlStatusManager$getDependentControlStatus$1 = (RealDependentControlStatusManager$getDependentControlStatus$1) continuationImpl;
            int i2 = realDependentControlStatusManager$getDependentControlStatus$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDependentControlStatusManager$getDependentControlStatus$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realDependentControlStatusManager$getDependentControlStatus$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDependentControlStatusManager$getDependentControlStatus$1.label;
                String str = this.dependentToken;
                SharedFlowImpl sharedFlowImpl = this.dependentControlStatus;
                switch (i) {
                    case 0:
                        SafeTrace.throwOnFailure(obj2);
                        DependentControlStatus dependentControlStatus = (DependentControlStatus) CollectionsKt.firstOrNull(sharedFlowImpl.getReplayCache());
                        if (!(dependentControlStatus instanceof DependentControlStatus.Loaded)) {
                            if (!(dependentControlStatus instanceof DependentControlStatus.Error)) {
                                if (!(dependentControlStatus instanceof DependentControlStatus.Updating)) {
                                    loaded = null;
                                    if (loaded != null) {
                                        realDependentControlStatusManager$getDependentControlStatus$1.L$0 = loaded;
                                        realDependentControlStatusManager$getDependentControlStatus$1.Z$0 = z2;
                                        realDependentControlStatusManager$getDependentControlStatus$1.label = 2;
                                        break;
                                    } else {
                                        DependentControlStatus.Updating updating = new DependentControlStatus.Updating(loaded);
                                        realDependentControlStatusManager$getDependentControlStatus$1.L$0 = loaded;
                                        realDependentControlStatusManager$getDependentControlStatus$1.Z$0 = z2;
                                        realDependentControlStatusManager$getDependentControlStatus$1.label = 1;
                                        break;
                                    }
                                } else {
                                    loaded2 = ((DependentControlStatus.Updating) dependentControlStatus).previousLoaded;
                                }
                            } else {
                                loaded2 = ((DependentControlStatus.Error) dependentControlStatus).previousLoaded;
                            }
                        } else {
                            loaded2 = (DependentControlStatus.Loaded) dependentControlStatus;
                        }
                        loaded = loaded2;
                        if (loaded != null) {
                        }
                    case 1:
                    case 2:
                        z2 = realDependentControlStatusManager$getDependentControlStatus$1.Z$0;
                        loaded = realDependentControlStatusManager$getDependentControlStatus$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        ControlType controlType = this.controlType;
                        if (!z2) {
                            controlType.getClass();
                            DependentControlStatus dependentControlStatus2 = (DependentControlStatus) this.dependentControlsCache.cache.get(controlType);
                            if (dependentControlStatus2 != null) {
                                realDependentControlStatusManager$getDependentControlStatus$1.L$0 = null;
                                realDependentControlStatusManager$getDependentControlStatus$1.Z$0 = z2;
                                realDependentControlStatusManager$getDependentControlStatus$1.label = 3;
                                break;
                            }
                        }
                        String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(this.sessionManager);
                        if (activeAccountTokenOrNull != null) {
                            int ordinal = controlType.ordinal();
                            if (ordinal == 0) {
                                ListNotificationSettingsRequest listNotificationSettingsRequest = new ListNotificationSettingsRequest(activeAccountTokenOrNull, CollectionsKt__CollectionsJVMKt.listOf(str), EmptyList.INSTANCE, ByteString.EMPTY);
                                realDependentControlStatusManager$getDependentControlStatus$1.L$0 = loaded;
                                realDependentControlStatusManager$getDependentControlStatus$1.Z$0 = z2;
                                realDependentControlStatusManager$getDependentControlStatus$1.label = 5;
                                obj2 = this.service.listNotificationSettings(listNotificationSettingsRequest, realDependentControlStatusManager$getDependentControlStatus$1);
                                break;
                            } else if (ordinal == 1) {
                                GetP2PControlsRequest getP2PControlsRequest = new GetP2PControlsRequest(str, ByteString.EMPTY);
                                realDependentControlStatusManager$getDependentControlStatus$1.L$0 = loaded;
                                realDependentControlStatusManager$getDependentControlStatus$1.Z$0 = z2;
                                realDependentControlStatusManager$getDependentControlStatus$1.label = 8;
                                obj2 = this.fiatlyService.getP2PControls(getP2PControlsRequest, realDependentControlStatusManager$getDependentControlStatus$1);
                                break;
                            } else {
                                if (ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5) {
                                    Path$$ExternalSyntheticBUOutline0.m$3();
                                    return null;
                                }
                                DependentControlStatusRequestHandler dependentControlStatusRequestHandler = this.dependentControlStatusRequestHandler;
                                dependentControlStatusRequestHandler.getClass();
                                realDependentControlStatusManager$getDependentControlStatus$1.L$0 = loaded;
                                realDependentControlStatusManager$getDependentControlStatus$1.Z$0 = z2;
                                realDependentControlStatusManager$getDependentControlStatus$1.label = 11;
                                obj2 = dependentControlStatusRequestHandler.getDependentControlStatus(z2, realDependentControlStatusManager$getDependentControlStatus$1);
                                break;
                            }
                        } else {
                            DependentControlStatus.Error error = new DependentControlStatus.Error(loaded);
                            realDependentControlStatusManager$getDependentControlStatus$1.L$0 = null;
                            realDependentControlStatusManager$getDependentControlStatus$1.Z$0 = z2;
                            realDependentControlStatusManager$getDependentControlStatus$1.label = 4;
                            break;
                        }
                        return obj3;
                    case 3:
                        SafeTrace.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    case 4:
                        SafeTrace.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    case 5:
                        z2 = realDependentControlStatusManager$getDependentControlStatus$1.Z$0;
                        loaded = realDependentControlStatusManager$getDependentControlStatus$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        ApiResult apiResult = (ApiResult) obj2;
                        if ((apiResult instanceof ApiResult.Failure.HttpFailure) || (apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                            DependentControlStatus.Error error2 = new DependentControlStatus.Error(loaded);
                            realDependentControlStatusManager$getDependentControlStatus$1.L$0 = null;
                            realDependentControlStatusManager$getDependentControlStatus$1.Z$0 = z2;
                            realDependentControlStatusManager$getDependentControlStatus$1.label = 6;
                            break;
                        } else {
                            if (!(apiResult instanceof ApiResult.Success)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Iterator it = ((ListNotificationSettingsResponse) ((ApiResult.Success) apiResult).response).settings.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    NotificationSetting$Setting$RealtimeNotificationSetting notificationSetting$Setting$RealtimeNotificationSetting2 = ((NotificationSetting) obj).setting;
                                    if (Intrinsics.areEqual((notificationSetting$Setting$RealtimeNotificationSetting2 == null || (realtimeNotificationSetting2 = notificationSetting$Setting$RealtimeNotificationSetting2.value) == null) ? null : realtimeNotificationSetting2.target_customer_token, str)) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            NotificationSetting notificationSetting = (NotificationSetting) obj;
                            if (notificationSetting != null && (notificationSetting$Setting$RealtimeNotificationSetting = notificationSetting.setting) != null && (realtimeNotificationSetting = notificationSetting$Setting$RealtimeNotificationSetting.value) != null) {
                                r10 = Intrinsics.areEqual(realtimeNotificationSetting.enabled, Boolean.TRUE);
                            }
                            DependentControlStatus.Loaded loadedNonLimitControl2 = new DependentControlStatus.Loaded.LoadedNonLimitControl(null, r10);
                            realDependentControlStatusManager$getDependentControlStatus$1.L$0 = null;
                            realDependentControlStatusManager$getDependentControlStatus$1.Z$0 = z2;
                            realDependentControlStatusManager$getDependentControlStatus$1.label = 7;
                            break;
                        }
                        return obj3;
                    case 6:
                        SafeTrace.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    case 7:
                        SafeTrace.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    case 8:
                        z2 = realDependentControlStatusManager$getDependentControlStatus$1.Z$0;
                        loaded = realDependentControlStatusManager$getDependentControlStatus$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        ApiResult apiResult2 = (ApiResult) obj2;
                        if ((apiResult2 instanceof ApiResult.Failure.HttpFailure) || (apiResult2 instanceof ApiResult.Failure.NetworkFailure)) {
                            DependentControlStatus.Error error3 = new DependentControlStatus.Error(loaded);
                            realDependentControlStatusManager$getDependentControlStatus$1.L$0 = null;
                            realDependentControlStatusManager$getDependentControlStatus$1.Z$0 = z2;
                            realDependentControlStatusManager$getDependentControlStatus$1.label = 9;
                            break;
                        } else {
                            if (!(apiResult2 instanceof ApiResult.Success)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            GetP2PControlsResponse getP2PControlsResponse = (GetP2PControlsResponse) ((ApiResult.Success) apiResult2).response;
                            if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesSponsorDrivenP2pLimits.INSTANCE)).enabled()) {
                                P2PControls p2PControls = getP2PControlsResponse.p2p_controls;
                                CustomP2PLimit customP2PLimit = (p2PControls == null || (list = p2PControls.custom_limits) == null) ? null : (CustomP2PLimit) CollectionsKt.firstOrNull(list);
                                Money money = (customP2PLimit != null ? customP2PLimit.f1261type : null) == CustomP2PLimit.LimitType.LIMIT_TYPE_SPONSORED_P2P_SEND_AMOUNT_30_DAY ? customP2PLimit != null ? customP2PLimit.max : null : null;
                                P2PControls p2PControls2 = getP2PControlsResponse.p2p_controls;
                                loadedNonLimitControl = new DependentControlStatus.Loaded.LoadedP2PControl(p2PControls2 != null ? Intrinsics.areEqual(p2PControls2.is_p2p_enabled, Boolean.TRUE) : false, getP2PControlsResponse.custom_p2p_send_limit_30_day_presets, money, new Money(getP2PControlsResponse.custom_p2p_send_limit_30_day_max_amount, CurrencyCode.USD, 4), customP2PLimit != null ? customP2PLimit.remaining_usage : null);
                            } else {
                                P2PControls p2PControls3 = getP2PControlsResponse.p2p_controls;
                                loadedNonLimitControl = new DependentControlStatus.Loaded.LoadedNonLimitControl(null, p2PControls3 != null ? Intrinsics.areEqual(p2PControls3.is_p2p_enabled, Boolean.TRUE) : false);
                            }
                            realDependentControlStatusManager$getDependentControlStatus$1.L$0 = null;
                            realDependentControlStatusManager$getDependentControlStatus$1.Z$0 = z2;
                            realDependentControlStatusManager$getDependentControlStatus$1.label = 10;
                            break;
                        }
                        return obj3;
                    case 9:
                        SafeTrace.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    case 10:
                        SafeTrace.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    case 11:
                        z2 = realDependentControlStatusManager$getDependentControlStatus$1.Z$0;
                        loaded = realDependentControlStatusManager$getDependentControlStatus$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        DependentControlStatus.Loaded loaded3 = (DependentControlStatus.Loaded) obj2;
                        if (loaded3 == null) {
                            DependentControlStatus.Error error4 = new DependentControlStatus.Error(loaded);
                            realDependentControlStatusManager$getDependentControlStatus$1.L$0 = null;
                            realDependentControlStatusManager$getDependentControlStatus$1.Z$0 = z2;
                            realDependentControlStatusManager$getDependentControlStatus$1.label = 13;
                            break;
                        } else {
                            realDependentControlStatusManager$getDependentControlStatus$1.L$0 = loaded;
                            realDependentControlStatusManager$getDependentControlStatus$1.Z$0 = z2;
                            realDependentControlStatusManager$getDependentControlStatus$1.label = 12;
                            break;
                        }
                    case 12:
                    case 13:
                        SafeTrace.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        realDependentControlStatusManager$getDependentControlStatus$1 = new RealDependentControlStatusManager$getDependentControlStatus$1(this, continuationImpl);
        Object obj22 = realDependentControlStatusManager$getDependentControlStatus$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDependentControlStatusManager$getDependentControlStatus$1.label;
        String str2 = this.dependentToken;
        SharedFlowImpl sharedFlowImpl2 = this.dependentControlStatus;
        switch (i) {
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02fd, code lost:
    
        if (r10.emit(r0, r3) != r4) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0355, code lost:
    
        if (updateCacheAndEmitNewStatus(r0, r3) == r4) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x036f, code lost:
    
        if (r10.emit(r0, r3) != r4) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00df, code lost:
    
        if (r10.emit(r1, r3) == r4) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012e, code lost:
    
        if (updateCacheAndEmitNewStatus(r0, r3) == r4) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0143, code lost:
    
        if (r10.emit(r0, r3) == r4) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0208, code lost:
    
        if (updateCacheAndEmitNewStatus(r0, r3) == r4) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x021d, code lost:
    
        if (r10.emit(r0, r3) == r4) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x017c, code lost:
    
        if (updateCacheAndEmitNewStatus(r0, r3) == r4) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0191, code lost:
    
        if (r10.emit(r0, r3) == r4) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c6, code lost:
    
        if (updateCacheAndEmitNewStatus(r0, r3) == r4) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01db, code lost:
    
        if (r10.emit(r0, r3) == r4) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02d2, code lost:
    
        if (updateCacheAndEmitNewStatus(r0, r3) == r4) goto L185;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setDependentControlStatus(boolean z, Continuation continuation) {
        RealDependentControlStatusManager$setDependentControlStatus$1 realDependentControlStatusManager$setDependentControlStatus$1;
        int i;
        DependentControlStatus.Loaded loaded;
        boolean z2;
        String activeAccountTokenOrNull;
        DependentControlStatus.Loaded loaded2;
        boolean z3;
        DependentControlStatus.Loaded loaded3;
        DependentControlStatus.Loaded loaded4;
        boolean z4;
        DependentControlStatus.Loaded loaded5;
        boolean z5;
        DependentControlStatus.Loaded loaded6;
        boolean z6;
        DependentControlStatus.Loaded loaded7;
        boolean z7;
        ApiResult apiResult;
        ApiResult apiResult2;
        DependentControlStatus.Loaded loadedNonLimitControl;
        DependentControlStatus.Loaded loaded8;
        DependentControlStatus.Loaded loaded9;
        DependentControlStatus.Loaded loaded10;
        DependentControlStatus.Loaded loaded11;
        if (continuation instanceof RealDependentControlStatusManager$setDependentControlStatus$1) {
            realDependentControlStatusManager$setDependentControlStatus$1 = (RealDependentControlStatusManager$setDependentControlStatus$1) continuation;
            int i2 = realDependentControlStatusManager$setDependentControlStatus$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDependentControlStatusManager$setDependentControlStatus$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDependentControlStatusManager$setDependentControlStatus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDependentControlStatusManager$setDependentControlStatus$1.label;
                SharedFlowImpl sharedFlowImpl = this.dependentControlStatus;
                switch (i) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        DependentControlStatus dependentControlStatus = (DependentControlStatus) CollectionsKt.firstOrNull(sharedFlowImpl.getReplayCache());
                        loaded = dependentControlStatus instanceof DependentControlStatus.Loaded ? (DependentControlStatus.Loaded) dependentControlStatus : dependentControlStatus instanceof DependentControlStatus.Error ? ((DependentControlStatus.Error) dependentControlStatus).previousLoaded : dependentControlStatus instanceof DependentControlStatus.Updating ? ((DependentControlStatus.Updating) dependentControlStatus).previousLoaded : null;
                        DependentControlStatus.Updating updating = new DependentControlStatus.Updating(loaded);
                        realDependentControlStatusManager$setDependentControlStatus$1.L$0 = loaded;
                        realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z;
                        realDependentControlStatusManager$setDependentControlStatus$1.label = 1;
                        if (sharedFlowImpl.emit(updating, realDependentControlStatusManager$setDependentControlStatus$1) != obj2) {
                            z2 = z;
                            activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(this.sessionManager);
                            if (activeAccountTokenOrNull != null) {
                                DependentControlStatus.Error error = new DependentControlStatus.Error(loaded);
                                realDependentControlStatusManager$setDependentControlStatus$1.L$0 = null;
                                realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z2;
                                realDependentControlStatusManager$setDependentControlStatus$1.label = 2;
                                break;
                            } else {
                                int ordinal = this.controlType.ordinal();
                                String str = this.dependentToken;
                                if (ordinal == 0) {
                                    Boolean valueOf = Boolean.valueOf(z2);
                                    ByteString byteString = ByteString.EMPTY;
                                    UpdateNotificationSettingsRequest updateNotificationSettingsRequest = new UpdateNotificationSettingsRequest(activeAccountTokenOrNull, CollectionsKt__CollectionsJVMKt.listOf(new NotificationSetting(new NotificationSetting$Setting$RealtimeNotificationSetting(new RealtimeNotificationSetting(str, valueOf, byteString)), byteString)), byteString);
                                    realDependentControlStatusManager$setDependentControlStatus$1.L$0 = loaded;
                                    realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z2;
                                    realDependentControlStatusManager$setDependentControlStatus$1.label = 3;
                                    Object updateNotificationSettings = this.service.updateNotificationSettings(updateNotificationSettingsRequest, realDependentControlStatusManager$setDependentControlStatus$1);
                                    if (updateNotificationSettings != obj2) {
                                        boolean z8 = z2;
                                        loaded2 = loaded;
                                        obj = updateNotificationSettings;
                                        z3 = z8;
                                        apiResult = (ApiResult) obj;
                                        if (!(apiResult instanceof ApiResult.Failure.HttpFailure) || (apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                                            DependentControlStatus.Error error2 = new DependentControlStatus.Error(loaded2);
                                            realDependentControlStatusManager$setDependentControlStatus$1.L$0 = null;
                                            realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z3;
                                            realDependentControlStatusManager$setDependentControlStatus$1.label = 4;
                                            break;
                                        } else {
                                            if (!(apiResult instanceof ApiResult.Success)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            DependentControlStatus.Loaded loadedNonLimitControl2 = new DependentControlStatus.Loaded.LoadedNonLimitControl(null, z3);
                                            realDependentControlStatusManager$setDependentControlStatus$1.L$0 = null;
                                            realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z3;
                                            realDependentControlStatusManager$setDependentControlStatus$1.label = 5;
                                            break;
                                        }
                                    }
                                } else if (ordinal != 1) {
                                    DependentControlStatusRequestHandler dependentControlStatusRequestHandler = this.dependentControlStatusRequestHandler;
                                    if (ordinal == 2) {
                                        dependentControlStatusRequestHandler.getClass();
                                        realDependentControlStatusManager$setDependentControlStatus$1.L$0 = loaded;
                                        realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z2;
                                        realDependentControlStatusManager$setDependentControlStatus$1.label = 15;
                                        Object obj3 = dependentControlStatusRequestHandler.toggleDependentControl(z2, realDependentControlStatusManager$setDependentControlStatus$1);
                                        if (obj3 != obj2) {
                                            boolean z9 = z2;
                                            loaded4 = loaded;
                                            obj = obj3;
                                            z4 = z9;
                                            loaded10 = (DependentControlStatus.Loaded) obj;
                                            if (loaded10 != null) {
                                                DependentControlStatus.Error error3 = new DependentControlStatus.Error(loaded4);
                                                realDependentControlStatusManager$setDependentControlStatus$1.L$0 = null;
                                                realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z4;
                                                realDependentControlStatusManager$setDependentControlStatus$1.label = 17;
                                                break;
                                            } else {
                                                realDependentControlStatusManager$setDependentControlStatus$1.L$0 = loaded4;
                                                realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z4;
                                                realDependentControlStatusManager$setDependentControlStatus$1.label = 16;
                                                break;
                                            }
                                        }
                                    } else if (ordinal == 3) {
                                        dependentControlStatusRequestHandler.getClass();
                                        realDependentControlStatusManager$setDependentControlStatus$1.L$0 = loaded;
                                        realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z2;
                                        realDependentControlStatusManager$setDependentControlStatus$1.label = 9;
                                        Object obj4 = dependentControlStatusRequestHandler.toggleDependentControl(z2, realDependentControlStatusManager$setDependentControlStatus$1);
                                        if (obj4 != obj2) {
                                            boolean z10 = z2;
                                            loaded5 = loaded;
                                            obj = obj4;
                                            z5 = z10;
                                            DependentControlStatus.Loaded loaded12 = (DependentControlStatus.Loaded) obj;
                                            loaded8 = !(loaded12 instanceof DependentControlStatus.Loaded.LoadedStockControl) ? (DependentControlStatus.Loaded.LoadedStockControl) loaded12 : null;
                                            if (loaded8 != null) {
                                                DependentControlStatus.Error error4 = new DependentControlStatus.Error(loaded5);
                                                realDependentControlStatusManager$setDependentControlStatus$1.L$0 = null;
                                                realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z5;
                                                realDependentControlStatusManager$setDependentControlStatus$1.label = 11;
                                                break;
                                            } else {
                                                realDependentControlStatusManager$setDependentControlStatus$1.L$0 = loaded5;
                                                realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z5;
                                                realDependentControlStatusManager$setDependentControlStatus$1.label = 10;
                                                break;
                                            }
                                        }
                                    } else if (ordinal == 4) {
                                        dependentControlStatusRequestHandler.getClass();
                                        realDependentControlStatusManager$setDependentControlStatus$1.L$0 = loaded;
                                        realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z2;
                                        realDependentControlStatusManager$setDependentControlStatus$1.label = 12;
                                        Object obj5 = dependentControlStatusRequestHandler.toggleDependentControl(z2, realDependentControlStatusManager$setDependentControlStatus$1);
                                        if (obj5 != obj2) {
                                            boolean z11 = z2;
                                            loaded6 = loaded;
                                            obj = obj5;
                                            z6 = z11;
                                            DependentControlStatus.Loaded loaded13 = (DependentControlStatus.Loaded) obj;
                                            loaded9 = !(loaded13 instanceof DependentControlStatus.Loaded.LoadedBitcoinControl) ? (DependentControlStatus.Loaded.LoadedBitcoinControl) loaded13 : null;
                                            if (loaded9 != null) {
                                                DependentControlStatus.Error error5 = new DependentControlStatus.Error(loaded6);
                                                realDependentControlStatusManager$setDependentControlStatus$1.L$0 = null;
                                                realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z6;
                                                realDependentControlStatusManager$setDependentControlStatus$1.label = 14;
                                                break;
                                            } else {
                                                realDependentControlStatusManager$setDependentControlStatus$1.L$0 = loaded6;
                                                realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z6;
                                                realDependentControlStatusManager$setDependentControlStatus$1.label = 13;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (ordinal != 5) {
                                            Path$$ExternalSyntheticBUOutline0.m$3();
                                            return null;
                                        }
                                        dependentControlStatusRequestHandler.getClass();
                                        realDependentControlStatusManager$setDependentControlStatus$1.L$0 = loaded;
                                        realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z2;
                                        realDependentControlStatusManager$setDependentControlStatus$1.label = 18;
                                        Object obj6 = dependentControlStatusRequestHandler.toggleDependentControl(z2, realDependentControlStatusManager$setDependentControlStatus$1);
                                        if (obj6 != obj2) {
                                            boolean z12 = z2;
                                            loaded7 = loaded;
                                            obj = obj6;
                                            z7 = z12;
                                            DependentControlStatus.Loaded loaded14 = (DependentControlStatus.Loaded) obj;
                                            loaded11 = !(loaded14 instanceof DependentControlStatus.Loaded.LoadedPromotionControl) ? (DependentControlStatus.Loaded.LoadedPromotionControl) loaded14 : null;
                                            if (loaded11 != null) {
                                                DependentControlStatus.Error error6 = new DependentControlStatus.Error(loaded7);
                                                realDependentControlStatusManager$setDependentControlStatus$1.L$0 = null;
                                                realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z7;
                                                realDependentControlStatusManager$setDependentControlStatus$1.label = 20;
                                                break;
                                            } else {
                                                realDependentControlStatusManager$setDependentControlStatus$1.L$0 = loaded7;
                                                realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z7;
                                                realDependentControlStatusManager$setDependentControlStatus$1.label = 19;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    SetP2PControlsRequest setP2PControlsRequest = new SetP2PControlsRequest(str, new P2PControls(14, Boolean.valueOf(z2), null));
                                    realDependentControlStatusManager$setDependentControlStatus$1.L$0 = loaded;
                                    realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z2;
                                    realDependentControlStatusManager$setDependentControlStatus$1.label = 6;
                                    Object p2PControls = this.fiatlyService.setP2PControls(setP2PControlsRequest, realDependentControlStatusManager$setDependentControlStatus$1);
                                    if (p2PControls != obj2) {
                                        loaded3 = loaded;
                                        obj = p2PControls;
                                        apiResult2 = (ApiResult) obj;
                                        if ((apiResult2 instanceof ApiResult.Failure.HttpFailure) && !(apiResult2 instanceof ApiResult.Failure.NetworkFailure)) {
                                            if (!(apiResult2 instanceof ApiResult.Success)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            SetP2PControlsResponse setP2PControlsResponse = (SetP2PControlsResponse) ((ApiResult.Success) apiResult2).response;
                                            FamilyParsingErrorFactory familyParsingErrorFactory = FamilyParsingErrorFactory.INSTANCE;
                                            try {
                                                P2PControls p2PControls2 = setP2PControlsResponse.p2p_controls;
                                                if (p2PControls2 == null) {
                                                    try {
                                                        throw new IllegalArgumentException("p2p_controls");
                                                    } catch (Exception e) {
                                                        this.errorReporter.report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(SetP2PControlsResponse.class), familyParsingErrorFactory, null), this.oneErrorPerAppSessionStrategy);
                                                        p2PControls2 = null;
                                                    }
                                                }
                                                P2pEnabled p2pEnabled = p2PControls2 == null ? null : new P2pEnabled(Intrinsics.areEqual(p2PControls2.is_p2p_enabled, Boolean.TRUE));
                                                Boolean valueOf2 = p2pEnabled != null ? Boolean.valueOf(p2pEnabled.enabled) : null;
                                                if (!(loaded3 instanceof DependentControlStatus.Loaded.LoadedP2PControl)) {
                                                    if ((loaded3 instanceof DependentControlStatus.Loaded.LoadedNonLimitControl) && valueOf2 != null) {
                                                        loadedNonLimitControl = new DependentControlStatus.Loaded.LoadedNonLimitControl(((DependentControlStatus.Loaded.LoadedNonLimitControl) loaded3).isActivated, valueOf2.booleanValue());
                                                        if (loadedNonLimitControl != null) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                    loadedNonLimitControl = null;
                                                    if (loadedNonLimitControl != null) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                if (valueOf2 != null) {
                                                    loadedNonLimitControl = DependentControlStatus.Loaded.LoadedP2PControl.copy$default((DependentControlStatus.Loaded.LoadedP2PControl) loaded3, valueOf2.booleanValue(), null, 30);
                                                    if (loadedNonLimitControl != null) {
                                                        realDependentControlStatusManager$setDependentControlStatus$1.L$0 = null;
                                                        realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z2;
                                                        realDependentControlStatusManager$setDependentControlStatus$1.label = 8;
                                                        break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                loadedNonLimitControl = null;
                                                if (loadedNonLimitControl != null) {
                                                }
                                                return Unit.INSTANCE;
                                            } catch (Exception e2) {
                                                throw RotateKt.toProtoParsingExceptionFor(e2, setP2PControlsResponse != null ? Reflection.factory.getOrCreateKotlinClass(SetP2PControlsResponse.class) : null, familyParsingErrorFactory, null);
                                            }
                                        }
                                        DependentControlStatus.Error error7 = new DependentControlStatus.Error(loaded3);
                                        realDependentControlStatusManager$setDependentControlStatus$1.L$0 = null;
                                        realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z2;
                                        realDependentControlStatusManager$setDependentControlStatus$1.label = 7;
                                        break;
                                    }
                                }
                            }
                        }
                        return obj2;
                    case 1:
                        z2 = realDependentControlStatusManager$setDependentControlStatus$1.Z$0;
                        DependentControlStatus.Loaded loaded15 = realDependentControlStatusManager$setDependentControlStatus$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        loaded = loaded15;
                        activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(this.sessionManager);
                        if (activeAccountTokenOrNull != null) {
                        }
                        return obj2;
                    case 2:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 3:
                        z3 = realDependentControlStatusManager$setDependentControlStatus$1.Z$0;
                        loaded2 = realDependentControlStatusManager$setDependentControlStatus$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        apiResult = (ApiResult) obj;
                        if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                            break;
                        }
                        DependentControlStatus.Error error22 = new DependentControlStatus.Error(loaded2);
                        realDependentControlStatusManager$setDependentControlStatus$1.L$0 = null;
                        realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z3;
                        realDependentControlStatusManager$setDependentControlStatus$1.label = 4;
                        break;
                    case 4:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 5:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 6:
                        z2 = realDependentControlStatusManager$setDependentControlStatus$1.Z$0;
                        loaded3 = realDependentControlStatusManager$setDependentControlStatus$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        apiResult2 = (ApiResult) obj;
                        if (apiResult2 instanceof ApiResult.Failure.HttpFailure) {
                            break;
                        }
                        DependentControlStatus.Error error72 = new DependentControlStatus.Error(loaded3);
                        realDependentControlStatusManager$setDependentControlStatus$1.L$0 = null;
                        realDependentControlStatusManager$setDependentControlStatus$1.Z$0 = z2;
                        realDependentControlStatusManager$setDependentControlStatus$1.label = 7;
                        break;
                    case 7:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 8:
                    case 10:
                    case 11:
                    case 13:
                    case 14:
                    case 16:
                    case 17:
                    case 19:
                    case 20:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 9:
                        z5 = realDependentControlStatusManager$setDependentControlStatus$1.Z$0;
                        loaded5 = realDependentControlStatusManager$setDependentControlStatus$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        DependentControlStatus.Loaded loaded122 = (DependentControlStatus.Loaded) obj;
                        if (!(loaded122 instanceof DependentControlStatus.Loaded.LoadedStockControl)) {
                        }
                        if (loaded8 != null) {
                        }
                        break;
                    case 12:
                        z6 = realDependentControlStatusManager$setDependentControlStatus$1.Z$0;
                        loaded6 = realDependentControlStatusManager$setDependentControlStatus$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        DependentControlStatus.Loaded loaded132 = (DependentControlStatus.Loaded) obj;
                        if (!(loaded132 instanceof DependentControlStatus.Loaded.LoadedBitcoinControl)) {
                        }
                        if (loaded9 != null) {
                        }
                        break;
                    case 15:
                        z4 = realDependentControlStatusManager$setDependentControlStatus$1.Z$0;
                        loaded4 = realDependentControlStatusManager$setDependentControlStatus$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        loaded10 = (DependentControlStatus.Loaded) obj;
                        if (loaded10 != null) {
                        }
                        break;
                    case 18:
                        z7 = realDependentControlStatusManager$setDependentControlStatus$1.Z$0;
                        loaded7 = realDependentControlStatusManager$setDependentControlStatus$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        DependentControlStatus.Loaded loaded142 = (DependentControlStatus.Loaded) obj;
                        if (!(loaded142 instanceof DependentControlStatus.Loaded.LoadedPromotionControl)) {
                        }
                        if (loaded11 != null) {
                        }
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        realDependentControlStatusManager$setDependentControlStatus$1 = new RealDependentControlStatusManager$setDependentControlStatus$1(this, continuation);
        Object obj7 = realDependentControlStatusManager$setDependentControlStatus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDependentControlStatusManager$setDependentControlStatus$1.label;
        SharedFlowImpl sharedFlowImpl2 = this.dependentControlStatus;
        switch (i) {
        }
    }

    public final Object updateCacheAndEmitNewStatus(DependentControlStatus.Loaded loaded, ContinuationImpl continuationImpl) {
        Object status = this.dependentControlsCache.setStatus(this.controlType, loaded, continuationImpl);
        return status == CoroutineSingletons.COROUTINE_SUSPENDED ? status : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r6 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r6 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r6 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        if (r6 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateLimit(Money money, SuspendLambda suspendLambda) {
        Object status;
        RealDependentControlsCache realDependentControlsCache = this.dependentControlsCache;
        LinkedHashMap linkedHashMap = realDependentControlsCache.cache;
        ControlType controlType = this.controlType;
        int ordinal = controlType.ordinal();
        if (ordinal == 1) {
            Object obj = linkedHashMap.get(controlType);
            DependentControlStatus.Loaded.LoadedP2PControl loadedP2PControl = obj instanceof DependentControlStatus.Loaded.LoadedP2PControl ? (DependentControlStatus.Loaded.LoadedP2PControl) obj : null;
            if (loadedP2PControl != null) {
                status = realDependentControlsCache.setStatus(controlType, DependentControlStatus.Loaded.LoadedP2PControl.copy$default(loadedP2PControl, false, money, 27), suspendLambda);
            }
            status = Unit.INSTANCE;
        } else if (ordinal == 2) {
            Object obj2 = linkedHashMap.get(controlType);
            DependentControlStatus.Loaded.LoadedCardControl loadedCardControl = obj2 instanceof DependentControlStatus.Loaded.LoadedCardControl ? (DependentControlStatus.Loaded.LoadedCardControl) obj2 : null;
            if (loadedCardControl != null) {
                status = realDependentControlsCache.setStatus(controlType, DependentControlStatus.Loaded.LoadedCardControl.copy$default(loadedCardControl, false, money, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), suspendLambda);
            }
            status = Unit.INSTANCE;
        } else if (ordinal == 3) {
            Object obj3 = linkedHashMap.get(controlType);
            DependentControlStatus.Loaded.LoadedStockControl loadedStockControl = obj3 instanceof DependentControlStatus.Loaded.LoadedStockControl ? (DependentControlStatus.Loaded.LoadedStockControl) obj3 : null;
            if (loadedStockControl != null) {
                status = realDependentControlsCache.setStatus(controlType, new DependentControlStatus.Loaded.LoadedStockControl(loadedStockControl.controlEnabled, money, loadedStockControl.limitFrequency, loadedStockControl.onboardingUrl), suspendLambda);
            }
            status = Unit.INSTANCE;
        } else if (ordinal != 4) {
            status = Unit.INSTANCE;
        } else {
            Object obj4 = linkedHashMap.get(controlType);
            DependentControlStatus.Loaded.LoadedBitcoinControl loadedBitcoinControl = obj4 instanceof DependentControlStatus.Loaded.LoadedBitcoinControl ? (DependentControlStatus.Loaded.LoadedBitcoinControl) obj4 : null;
            if (loadedBitcoinControl != null) {
                status = realDependentControlsCache.setStatus(controlType, new DependentControlStatus.Loaded.LoadedBitcoinControl(loadedBitcoinControl.controlEnabled, money, loadedBitcoinControl.limitFrequency, loadedBitcoinControl.onboardingUrl), suspendLambda);
            }
            status = Unit.INSTANCE;
        }
        return status == CoroutineSingletons.COROUTINE_SUSPENDED ? status : Unit.INSTANCE;
    }
}
