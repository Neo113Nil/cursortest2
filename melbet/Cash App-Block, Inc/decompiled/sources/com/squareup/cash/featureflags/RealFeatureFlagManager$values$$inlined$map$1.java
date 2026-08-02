package com.squareup.cash.featureflags;

import app.cash.sqldelight.Query;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidget;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaad;
import com.squareup.cash.arcade.internalflags.InternalArcadeFlags;
import com.squareup.cash.crypto.backend.transaction.CryptoTransactionAction$InitiateTransactionAction;
import com.squareup.cash.data.contacts.RealContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.data.contacts.RealContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.data.profile.RealProfileAliasRepository$all$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.RealProfileAliasRepositoryKt;
import com.squareup.cash.data.profile.RealProfileManager$publicProfile$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.RealProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.db.profile.ProfileAlias;
import com.squareup.cash.db2.Intervals;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.db2.profile.ProfileToken;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.favorites.presenters.FavoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gps.backend.real.GpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.instruments.backend.real.RealAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics$createMetricsFlow$1;
import com.squareup.cash.lifecycle.ApplicationEvent$ConfigChanged;
import com.squareup.cash.localization.RealLocaleManager$special$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesDataManager$special$$inlined$map$1$2$1;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesDataSource$special$$inlined$map$1$2$1;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesValidator;
import com.squareup.cash.marketcapabilities.db.MarketCapabilitiesConfig;
import com.squareup.cash.observability.backend.real.ObservabilitySetupTeardown$special$$inlined$map$1$2$1;
import com.squareup.cash.observability.backend.real.ObservabilitySetupTeardown$special$$inlined$map$2$2$1;
import com.squareup.cash.observability.backend.real.bugsnag.ErrorReportingWorker$work$$inlined$map$1$2$1;
import com.squareup.cash.paymentpad.presenters.RealMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.paymentpad.presenters.RealMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.paymentpad.presenters.RealMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.paymentpad.presenters.RealMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.real.RealOfflineManager;
import com.squareup.cash.payments.backend.real.RealOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.payments.common.RealPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.performance.JankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.pools.backend.api.PoolAction$CreatePoolAction;
import com.squareup.cash.session.backend.AuthenticatedState;
import com.squareup.cash.session.backend.NotInitiatedState;
import com.squareup.cash.session.backend.OnboardedAccountStatus;
import com.squareup.cash.session.backend.SessionManagerKt$special$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SwitchingState;
import com.squareup.cash.taptopay.backend.api.TapToPayAction$InitiateTapToPayAction;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.util.android.ActivityResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda3;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealFeatureFlagManager$values$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowKt__MergeKt$flatMapConcat$$inlined$map$1 $this_unsafeTransform$inlined;

    public /* synthetic */ RealFeatureFlagManager$values$$inlined$map$1(FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new AnonymousClass2(flowCollector, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new AnonymousClass2(flowCollector, 9), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect3 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, 6), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0226  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x0273  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x027d  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x02bf  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x02f7  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x0301  */
        /* JADX WARN: Removed duplicated region for block: B:256:0x0335  */
        /* JADX WARN: Removed duplicated region for block: B:262:0x033f  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x0386  */
        /* JADX WARN: Removed duplicated region for block: B:287:0x0390  */
        /* JADX WARN: Removed duplicated region for block: B:301:0x03c2  */
        /* JADX WARN: Removed duplicated region for block: B:307:0x03cc  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:332:0x043b  */
        /* JADX WARN: Removed duplicated region for block: B:338:0x0445  */
        /* JADX WARN: Removed duplicated region for block: B:352:0x0477  */
        /* JADX WARN: Removed duplicated region for block: B:358:0x0481  */
        /* JADX WARN: Removed duplicated region for block: B:372:0x04b6  */
        /* JADX WARN: Removed duplicated region for block: B:378:0x04c0  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:390:0x0502  */
        /* JADX WARN: Removed duplicated region for block: B:396:0x050c  */
        /* JADX WARN: Removed duplicated region for block: B:411:0x0540  */
        /* JADX WARN: Removed duplicated region for block: B:417:0x054a  */
        /* JADX WARN: Removed duplicated region for block: B:429:0x0589  */
        /* JADX WARN: Removed duplicated region for block: B:435:0x0593  */
        /* JADX WARN: Removed duplicated region for block: B:447:0x05c5  */
        /* JADX WARN: Removed duplicated region for block: B:453:0x05cf  */
        /* JADX WARN: Removed duplicated region for block: B:465:0x0608  */
        /* JADX WARN: Removed duplicated region for block: B:471:0x0612  */
        /* JADX WARN: Removed duplicated region for block: B:485:0x0647  */
        /* JADX WARN: Removed duplicated region for block: B:491:0x0651  */
        /* JADX WARN: Removed duplicated region for block: B:510:0x0693  */
        /* JADX WARN: Removed duplicated region for block: B:516:0x069d  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:550:0x0718  */
        /* JADX WARN: Removed duplicated region for block: B:556:0x0722  */
        /* JADX WARN: Removed duplicated region for block: B:568:0x0756  */
        /* JADX WARN: Removed duplicated region for block: B:574:0x0760  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:586:0x0798  */
        /* JADX WARN: Removed duplicated region for block: B:592:0x07a2  */
        /* JADX WARN: Removed duplicated region for block: B:604:0x07d4  */
        /* JADX WARN: Removed duplicated region for block: B:610:0x07de  */
        /* JADX WARN: Removed duplicated region for block: B:624:0x0815  */
        /* JADX WARN: Removed duplicated region for block: B:630:0x081f  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0136  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            RealContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1 realContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1;
            int i2;
            RealContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1 realContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1;
            int i3;
            RealProfileAliasRepository$all$$inlined$map$1$2$1 realProfileAliasRepository$all$$inlined$map$1$2$1;
            int i4;
            RealProfileManager$publicProfile$$inlined$map$1$2$1 realProfileManager$publicProfile$$inlined$map$1$2$1;
            int i5;
            RealProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1 realProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1;
            int i6;
            RealFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1 realFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1;
            int i7;
            FavoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1 favoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1;
            int i8;
            InternalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1 internalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1;
            int i9;
            RealFeatureFlagManager$peekValues$$inlined$map$1$2$1 realFeatureFlagManager$peekValues$$inlined$map$1$2$1;
            int i10;
            RealFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1 realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1;
            int i11;
            RealFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1 realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1;
            int i12;
            RealFeatureFlagManager$special$$inlined$map$1$2$1 realFeatureFlagManager$special$$inlined$map$1$2$1;
            int i13;
            RealSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1 realSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i14;
            GpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1 gpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1;
            int i15;
            RealAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1 realAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1;
            int i16;
            RealLocaleManager$special$$inlined$filterIsInstance$1$2$1 realLocaleManager$special$$inlined$filterIsInstance$1$2$1;
            int i17;
            RealMarketCapabilitiesDataManager$special$$inlined$map$1$2$1 realMarketCapabilitiesDataManager$special$$inlined$map$1$2$1;
            int i18;
            RealMarketCapabilitiesDataSource$special$$inlined$map$1$2$1 realMarketCapabilitiesDataSource$special$$inlined$map$1$2$1;
            int i19;
            ObservabilitySetupTeardown$special$$inlined$map$1$2$1 observabilitySetupTeardown$special$$inlined$map$1$2$1;
            int i20;
            ObservabilitySetupTeardown$special$$inlined$map$2$2$1 observabilitySetupTeardown$special$$inlined$map$2$2$1;
            int i21;
            ErrorReportingWorker$work$$inlined$map$1$2$1 errorReportingWorker$work$$inlined$map$1$2$1;
            int i22;
            RealMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 realMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
            int i23;
            RealMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 realMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1;
            int i24;
            RealMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1 realMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1;
            int i25;
            RealMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1 realMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1;
            int i26;
            RealOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1 realOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1;
            int i27;
            List list;
            RealPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 realPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
            int i28;
            JankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1 jankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1;
            int i29;
            SessionManagerKt$special$$inlined$filterIsInstance$1$2$1 sessionManagerKt$special$$inlined$filterIsInstance$1$2$1;
            int i30;
            int i31 = this.$r8$classId;
            boolean z = false;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i31) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i32 = anonymousClass1.label;
                        if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                Object obj3 = ((RealFeatureFlagManager.FlagValue) obj).value;
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj3, anonymousClass1) == coroutineSingletons) {
                                    break;
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj2);
                            }
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                case 1:
                    if (continuation instanceof RealContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1) {
                        realContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1 = (RealContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i33 = realContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                            realContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                            Object obj4 = realContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = realContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                if (((Boolean) obj).booleanValue()) {
                                    realContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons3) {
                                        break;
                                    }
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj4);
                            }
                            break;
                        }
                    }
                    realContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1 = new RealContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj42 = realContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = realContactSync$setup$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i2 != 0) {
                    }
                case 2:
                    if (continuation instanceof RealContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1) {
                        realContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1 = (RealContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i34 = realContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                            realContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                            Object obj5 = realContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = realContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                Boolean bool = Boolean.TRUE;
                                realContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(bool, realContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons4) {
                                    break;
                                }
                            } else if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj5);
                            }
                            break;
                        }
                    }
                    realContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1 = new RealContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj52 = realContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = realContactSync$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i3 != 0) {
                    }
                case 3:
                    if (continuation instanceof RealProfileAliasRepository$all$$inlined$map$1$2$1) {
                        realProfileAliasRepository$all$$inlined$map$1$2$1 = (RealProfileAliasRepository$all$$inlined$map$1$2$1) continuation;
                        int i35 = realProfileAliasRepository$all$$inlined$map$1$2$1.label;
                        if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                            realProfileAliasRepository$all$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                            Object obj6 = realProfileAliasRepository$all$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = realProfileAliasRepository$all$$inlined$map$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj6);
                                List sortedWith = CollectionsKt.sortedWith((List) obj, RealProfileAliasRepositoryKt.COMPARATOR);
                                realProfileAliasRepository$all$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(sortedWith, realProfileAliasRepository$all$$inlined$map$1$2$1) == coroutineSingletons5) {
                                    break;
                                }
                            } else if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj6);
                            }
                            break;
                        }
                    }
                    realProfileAliasRepository$all$$inlined$map$1$2$1 = new RealProfileAliasRepository$all$$inlined$map$1$2$1(this, continuation);
                    Object obj62 = realProfileAliasRepository$all$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = realProfileAliasRepository$all$$inlined$map$1$2$1.label;
                    if (i4 != 0) {
                    }
                case 4:
                    if (continuation instanceof RealProfileManager$publicProfile$$inlined$map$1$2$1) {
                        realProfileManager$publicProfile$$inlined$map$1$2$1 = (RealProfileManager$publicProfile$$inlined$map$1$2$1) continuation;
                        int i36 = realProfileManager$publicProfile$$inlined$map$1$2$1.label;
                        if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                            realProfileManager$publicProfile$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                            Object obj7 = realProfileManager$publicProfile$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = realProfileManager$publicProfile$$inlined$map$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj7);
                                PublicProfile publicProfile = FillrWidget.WidgetType.AnonymousClass1.toPublicProfile((Profile) obj);
                                realProfileManager$publicProfile$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(publicProfile, realProfileManager$publicProfile$$inlined$map$1$2$1) == coroutineSingletons6) {
                                    break;
                                }
                            } else if (i5 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj7);
                            }
                            break;
                        }
                    }
                    realProfileManager$publicProfile$$inlined$map$1$2$1 = new RealProfileManager$publicProfile$$inlined$map$1$2$1(this, continuation);
                    Object obj72 = realProfileManager$publicProfile$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = realProfileManager$publicProfile$$inlined$map$1$2$1.label;
                    if (i5 != 0) {
                    }
                case 5:
                    if (continuation instanceof RealProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1) {
                        realProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1 = (RealProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i37 = realProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                            realProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                            Object obj8 = realProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = realProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj8);
                                List list2 = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((ProfileAlias) it.next()).canonical_text);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (z) {
                                        arrayList2.add(next);
                                    } else if (((String) next).length() != 0) {
                                        arrayList2.add(next);
                                        z = true;
                                    }
                                }
                                realProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList2, realProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons7) {
                                    break;
                                }
                            } else if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj8);
                            }
                            break;
                        }
                    }
                    realProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1 = new RealProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj82 = realProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = realProfileManager$syncAliases$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i6 != 0) {
                    }
                case 6:
                    if (continuation instanceof RealFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1) {
                        realFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1 = (RealFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1) continuation;
                        int i38 = realFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1.label;
                        if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                            realFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                            Object obj9 = realFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = realFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj9);
                                SessionState sessionState = (SessionState) obj;
                                SessionState.Authenticated authenticated = sessionState instanceof SessionState.Authenticated ? (SessionState.Authenticated) sessionState : null;
                                r6 = authenticated != null ? ((AuthenticatedState) authenticated).getAccountToken() : null;
                                if (r6 != null) {
                                    realFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector.emit(r6, realFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons8) {
                                        break;
                                    }
                                }
                            } else if (i7 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj9);
                            }
                            break;
                        }
                    }
                    realFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1 = new RealFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj92 = realFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = realFeatureEligibilityRepository$special$$inlined$mapNotNull$1$2$1.label;
                    if (i7 != 0) {
                    }
                case 7:
                    if (continuation instanceof FavoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1) {
                        favoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1 = (FavoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1) continuation;
                        int i39 = favoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1.label;
                        if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                            favoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                            Object obj10 = favoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = favoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj10);
                                if (((PaymentAction) obj) instanceof PaymentAction.InitiatePaymentAction) {
                                    favoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, favoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons9) {
                                        break;
                                    }
                                }
                            } else if (i8 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj10);
                            }
                            break;
                        }
                    }
                    favoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1 = new FavoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1(this, continuation);
                    Object obj102 = favoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = favoriteUpsellRefresher$setup$lambda$0$$inlined$filter$1$2$1.label;
                    if (i8 != 0) {
                    }
                case 8:
                    if (continuation instanceof InternalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1) {
                        internalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1 = (InternalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1) continuation;
                        int i40 = internalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1.label;
                        if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                            internalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                            Object obj11 = internalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = internalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj11);
                                InternalArcadeFlags internalArcadeFlags = new InternalArcadeFlags(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj).enabled());
                                internalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(internalArcadeFlags, internalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1) == coroutineSingletons10) {
                                    break;
                                }
                            } else if (i9 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj11);
                            }
                            break;
                        }
                    }
                    internalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1 = new InternalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1(this, continuation);
                    Object obj112 = internalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = internalArcadeFlagsManager$observeFlags$$inlined$map$1$2$1.label;
                    if (i9 != 0) {
                    }
                case 9:
                    if (continuation instanceof RealFeatureFlagManager$peekValues$$inlined$map$1$2$1) {
                        realFeatureFlagManager$peekValues$$inlined$map$1$2$1 = (RealFeatureFlagManager$peekValues$$inlined$map$1$2$1) continuation;
                        int i41 = realFeatureFlagManager$peekValues$$inlined$map$1$2$1.label;
                        if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                            realFeatureFlagManager$peekValues$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                            Object obj12 = realFeatureFlagManager$peekValues$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = realFeatureFlagManager$peekValues$$inlined$map$1$2$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj12);
                                Object obj13 = ((RealFeatureFlagManager.FlagValue) obj).value;
                                realFeatureFlagManager$peekValues$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj13, realFeatureFlagManager$peekValues$$inlined$map$1$2$1) == coroutineSingletons11) {
                                    break;
                                }
                            } else if (i10 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj12);
                            }
                            break;
                        }
                    }
                    realFeatureFlagManager$peekValues$$inlined$map$1$2$1 = new RealFeatureFlagManager$peekValues$$inlined$map$1$2$1(this, continuation);
                    Object obj122 = realFeatureFlagManager$peekValues$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = realFeatureFlagManager$peekValues$$inlined$map$1$2$1.label;
                    if (i10 != 0) {
                    }
                case 10:
                    if (continuation instanceof RealFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1) {
                        realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1 = (RealFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i42 = realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                            realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                            Object obj14 = realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i11 != 0) {
                                SafeTrace.throwOnFailure(obj14);
                                Timber.Forest.i("New Full Session. Re-sync Feature Flags.", new Object[0]);
                                String accountToken = ((AuthenticatedState) ((SessionState.Authenticated) obj)).getAccountToken();
                                realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(accountToken, realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons12) {
                                    break;
                                }
                            } else if (i11 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj14);
                            }
                            break;
                        }
                    }
                    realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1 = new RealFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj142 = realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i11 != 0) {
                    }
                case 11:
                    if (continuation instanceof RealFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1) {
                        realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1 = (RealFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1) continuation;
                        int i43 = realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                        if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                            realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                            Object obj15 = realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                            CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i12 = realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                            if (i12 != 0) {
                                SafeTrace.throwOnFailure(obj15);
                                ProfileToken profileToken = (ProfileToken) obj;
                                r6 = profileToken != null ? profileToken.profile_token : null;
                                realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label = 1;
                                if (flowCollector.emit(r6, realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1) == coroutineSingletons13) {
                                    break;
                                }
                            } else if (i12 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj15);
                            }
                            break;
                        }
                    }
                    realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1 = new RealFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                    Object obj152 = realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                    CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i12 = realFeatureFlagManager$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                    if (i12 != 0) {
                    }
                case 12:
                    if (continuation instanceof RealFeatureFlagManager$special$$inlined$map$1$2$1) {
                        realFeatureFlagManager$special$$inlined$map$1$2$1 = (RealFeatureFlagManager$special$$inlined$map$1$2$1) continuation;
                        int i44 = realFeatureFlagManager$special$$inlined$map$1$2$1.label;
                        if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                            realFeatureFlagManager$special$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                            Object obj16 = realFeatureFlagManager$special$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i13 = realFeatureFlagManager$special$$inlined$map$1$2$1.label;
                            if (i13 != 0) {
                                SafeTrace.throwOnFailure(obj16);
                                Query query = (Query) obj;
                                MapBuilder mapBuilder = new MapBuilder();
                                query.execute(new ViewTreeObservers$$ExternalSyntheticLambda3(7, query, mapBuilder));
                                MapBuilder build = mapBuilder.build();
                                realFeatureFlagManager$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(build, realFeatureFlagManager$special$$inlined$map$1$2$1) == coroutineSingletons14) {
                                    break;
                                }
                            } else if (i13 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj16);
                            }
                            break;
                        }
                    }
                    realFeatureFlagManager$special$$inlined$map$1$2$1 = new RealFeatureFlagManager$special$$inlined$map$1$2$1(this, continuation);
                    Object obj162 = realFeatureFlagManager$special$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i13 = realFeatureFlagManager$special$$inlined$map$1$2$1.label;
                    if (i13 != 0) {
                    }
                case 13:
                    if (continuation instanceof RealSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        realSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1 = (RealSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i45 = realSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                            realSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                            Object obj17 = realSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i14 = realSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i14 != 0) {
                                SafeTrace.throwOnFailure(obj17);
                                if (((SessionState) obj) instanceof SwitchingState) {
                                    realSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons15) {
                                        break;
                                    }
                                }
                            } else if (i14 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj17);
                            }
                            break;
                        }
                    }
                    realSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1 = new RealSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj172 = realSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i14 = realSessionFlags$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i14 != 0) {
                    }
                case 14:
                    if (continuation instanceof GpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1) {
                        gpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1 = (GpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                        int i46 = gpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                            gpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                            Object obj18 = gpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i15 = gpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                            if (i15 != 0) {
                                SafeTrace.throwOnFailure(obj18);
                                if (obj instanceof OnboardedAccountStatus.Onboarded) {
                                    gpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, gpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1) == coroutineSingletons16) {
                                        break;
                                    }
                                }
                            } else if (i15 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj18);
                            }
                            break;
                        }
                    }
                    gpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1 = new GpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj182 = gpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i15 = gpsLocationRefresher$setup$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if (i15 != 0) {
                    }
                case 15:
                    if (continuation instanceof RealAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1) {
                        realAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1 = (RealAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1) continuation;
                        int i47 = realAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1.label;
                        if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                            realAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                            Object obj19 = realAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i16 = realAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1.label;
                            if (i16 != 0) {
                                SafeTrace.throwOnFailure(obj19);
                                List list3 = (List) obj;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator it3 = list3.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (ArraysKt___ArraysKt.toSet(new CashInstrumentType[]{CashInstrumentType.BANK_ACCOUNT, CashInstrumentType.CREDIT_CARD, CashInstrumentType.DEBIT_CARD}).contains(((Instrument) it3.next()).getCashInstrumentType())) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                                Boolean valueOf = Boolean.valueOf(!z);
                                realAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf, realAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1) == coroutineSingletons17) {
                                    break;
                                }
                            } else if (i16 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj19);
                            }
                            break;
                        }
                    }
                    realAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1 = new RealAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1(this, continuation);
                    Object obj192 = realAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i16 = realAccountInstrumentsBadger$hasNoLinkedInstruments$$inlined$map$1$2$1.label;
                    if (i16 != 0) {
                    }
                    break;
                case 16:
                    if (continuation instanceof RealLocaleManager$special$$inlined$filterIsInstance$1$2$1) {
                        realLocaleManager$special$$inlined$filterIsInstance$1$2$1 = (RealLocaleManager$special$$inlined$filterIsInstance$1$2$1) continuation;
                        int i48 = realLocaleManager$special$$inlined$filterIsInstance$1$2$1.label;
                        if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                            realLocaleManager$special$$inlined$filterIsInstance$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                            Object obj20 = realLocaleManager$special$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i17 = realLocaleManager$special$$inlined$filterIsInstance$1$2$1.label;
                            if (i17 != 0) {
                                SafeTrace.throwOnFailure(obj20);
                                if (obj instanceof ApplicationEvent$ConfigChanged) {
                                    realLocaleManager$special$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realLocaleManager$special$$inlined$filterIsInstance$1$2$1) == coroutineSingletons18) {
                                        break;
                                    }
                                }
                            } else if (i17 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj20);
                            }
                            break;
                        }
                    }
                    realLocaleManager$special$$inlined$filterIsInstance$1$2$1 = new RealLocaleManager$special$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj202 = realLocaleManager$special$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i17 = realLocaleManager$special$$inlined$filterIsInstance$1$2$1.label;
                    if (i17 != 0) {
                    }
                case 17:
                    if (continuation instanceof RealMarketCapabilitiesDataManager$special$$inlined$map$1$2$1) {
                        realMarketCapabilitiesDataManager$special$$inlined$map$1$2$1 = (RealMarketCapabilitiesDataManager$special$$inlined$map$1$2$1) continuation;
                        int i49 = realMarketCapabilitiesDataManager$special$$inlined$map$1$2$1.label;
                        if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                            realMarketCapabilitiesDataManager$special$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                            Object obj21 = realMarketCapabilitiesDataManager$special$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i18 = realMarketCapabilitiesDataManager$special$$inlined$map$1$2$1.label;
                            if (i18 != 0) {
                                SafeTrace.throwOnFailure(obj21);
                                List list4 = (List) obj;
                                List list5 = list4;
                                if (list5 != null && !list5.isEmpty()) {
                                    ArrayList convertAndFilterKnownValues = zzaad.convertAndFilterKnownValues(list4);
                                    if (RealMarketCapabilitiesValidator.validateClientMarketCapabilities(convertAndFilterKnownValues)) {
                                        r6 = convertAndFilterKnownValues;
                                    }
                                }
                                realMarketCapabilitiesDataManager$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(r6, realMarketCapabilitiesDataManager$special$$inlined$map$1$2$1) == coroutineSingletons19) {
                                    break;
                                }
                            } else if (i18 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj21);
                            }
                            break;
                        }
                    }
                    realMarketCapabilitiesDataManager$special$$inlined$map$1$2$1 = new RealMarketCapabilitiesDataManager$special$$inlined$map$1$2$1(this, continuation);
                    Object obj212 = realMarketCapabilitiesDataManager$special$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i18 = realMarketCapabilitiesDataManager$special$$inlined$map$1$2$1.label;
                    if (i18 != 0) {
                    }
                    break;
                case 18:
                    if (continuation instanceof RealMarketCapabilitiesDataSource$special$$inlined$map$1$2$1) {
                        realMarketCapabilitiesDataSource$special$$inlined$map$1$2$1 = (RealMarketCapabilitiesDataSource$special$$inlined$map$1$2$1) continuation;
                        int i50 = realMarketCapabilitiesDataSource$special$$inlined$map$1$2$1.label;
                        if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                            realMarketCapabilitiesDataSource$special$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                            Object obj23 = realMarketCapabilitiesDataSource$special$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i19 = realMarketCapabilitiesDataSource$special$$inlined$map$1$2$1.label;
                            if (i19 != 0) {
                                SafeTrace.throwOnFailure(obj23);
                                MarketCapabilitiesConfig marketCapabilitiesConfig = (MarketCapabilitiesConfig) obj;
                                r6 = marketCapabilitiesConfig != null ? marketCapabilitiesConfig.capabilities : null;
                                realMarketCapabilitiesDataSource$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(r6, realMarketCapabilitiesDataSource$special$$inlined$map$1$2$1) == coroutineSingletons20) {
                                    break;
                                }
                            } else if (i19 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj23);
                            }
                            break;
                        }
                    }
                    realMarketCapabilitiesDataSource$special$$inlined$map$1$2$1 = new RealMarketCapabilitiesDataSource$special$$inlined$map$1$2$1(this, continuation);
                    Object obj232 = realMarketCapabilitiesDataSource$special$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i19 = realMarketCapabilitiesDataSource$special$$inlined$map$1$2$1.label;
                    if (i19 != 0) {
                    }
                case 19:
                    if (continuation instanceof ObservabilitySetupTeardown$special$$inlined$map$1$2$1) {
                        observabilitySetupTeardown$special$$inlined$map$1$2$1 = (ObservabilitySetupTeardown$special$$inlined$map$1$2$1) continuation;
                        int i51 = observabilitySetupTeardown$special$$inlined$map$1$2$1.label;
                        if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                            observabilitySetupTeardown$special$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                            Object obj24 = observabilitySetupTeardown$special$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i20 = observabilitySetupTeardown$special$$inlined$map$1$2$1.label;
                            if (i20 != 0) {
                                SafeTrace.throwOnFailure(obj24);
                                Boolean valueOf2 = Boolean.valueOf(((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) obj).enabled());
                                observabilitySetupTeardown$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf2, observabilitySetupTeardown$special$$inlined$map$1$2$1) == coroutineSingletons21) {
                                    break;
                                }
                            } else if (i20 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj24);
                            }
                            break;
                        }
                    }
                    observabilitySetupTeardown$special$$inlined$map$1$2$1 = new ObservabilitySetupTeardown$special$$inlined$map$1$2$1(this, continuation);
                    Object obj242 = observabilitySetupTeardown$special$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i20 = observabilitySetupTeardown$special$$inlined$map$1$2$1.label;
                    if (i20 != 0) {
                    }
                case 20:
                    if (continuation instanceof ObservabilitySetupTeardown$special$$inlined$map$2$2$1) {
                        observabilitySetupTeardown$special$$inlined$map$2$2$1 = (ObservabilitySetupTeardown$special$$inlined$map$2$2$1) continuation;
                        int i52 = observabilitySetupTeardown$special$$inlined$map$2$2$1.label;
                        if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                            observabilitySetupTeardown$special$$inlined$map$2$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                            Object obj25 = observabilitySetupTeardown$special$$inlined$map$2$2$1.result;
                            CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i21 = observabilitySetupTeardown$special$$inlined$map$2$2$1.label;
                            if (i21 != 0) {
                                SafeTrace.throwOnFailure(obj25);
                                Boolean valueOf3 = Boolean.valueOf(((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) obj).enabled());
                                observabilitySetupTeardown$special$$inlined$map$2$2$1.label = 1;
                                if (flowCollector.emit(valueOf3, observabilitySetupTeardown$special$$inlined$map$2$2$1) == coroutineSingletons22) {
                                    break;
                                }
                            } else if (i21 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj25);
                            }
                            break;
                        }
                    }
                    observabilitySetupTeardown$special$$inlined$map$2$2$1 = new ObservabilitySetupTeardown$special$$inlined$map$2$2$1(this, continuation);
                    Object obj252 = observabilitySetupTeardown$special$$inlined$map$2$2$1.result;
                    CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i21 = observabilitySetupTeardown$special$$inlined$map$2$2$1.label;
                    if (i21 != 0) {
                    }
                case 21:
                    if (continuation instanceof ErrorReportingWorker$work$$inlined$map$1$2$1) {
                        errorReportingWorker$work$$inlined$map$1$2$1 = (ErrorReportingWorker$work$$inlined$map$1$2$1) continuation;
                        int i53 = errorReportingWorker$work$$inlined$map$1$2$1.label;
                        if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                            errorReportingWorker$work$$inlined$map$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                            Object obj26 = errorReportingWorker$work$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i22 = errorReportingWorker$work$$inlined$map$1$2$1.label;
                            if (i22 != 0) {
                                SafeTrace.throwOnFailure(obj26);
                                SessionState sessionState2 = (SessionState) obj;
                                if (sessionState2 instanceof NotInitiatedState) {
                                    r6 = ((NotInitiatedState) sessionState2).appToken;
                                } else if (sessionState2 instanceof SessionState.Initiated) {
                                    r6 = ((SessionState.Initiated) sessionState2).getAppToken();
                                }
                                errorReportingWorker$work$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(r6, errorReportingWorker$work$$inlined$map$1$2$1) == coroutineSingletons23) {
                                    break;
                                }
                            } else if (i22 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj26);
                            }
                            break;
                        }
                    }
                    errorReportingWorker$work$$inlined$map$1$2$1 = new ErrorReportingWorker$work$$inlined$map$1$2$1(this, continuation);
                    Object obj262 = errorReportingWorker$work$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i22 = errorReportingWorker$work$$inlined$map$1$2$1.label;
                    if (i22 != 0) {
                    }
                case 22:
                    if (continuation instanceof RealMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                        realMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (RealMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                        int i54 = realMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                            realMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                            Object obj27 = realMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i23 = realMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                            if (i23 != 0) {
                                SafeTrace.throwOnFailure(obj27);
                                if (obj instanceof PaymentAction.InitiatePaymentPendingAction) {
                                    realMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons24) {
                                        break;
                                    }
                                }
                            } else if (i23 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj27);
                            }
                            break;
                        }
                    }
                    realMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new RealMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj272 = realMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i23 = realMainPaymentPadRefresher$setup$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if (i23 != 0) {
                    }
                case 23:
                    if (continuation instanceof RealMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                        realMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (RealMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                        int i55 = realMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                            realMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                            Object obj28 = realMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i24 = realMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                            if (i24 != 0) {
                                SafeTrace.throwOnFailure(obj28);
                                if (obj instanceof CryptoTransactionAction$InitiateTransactionAction) {
                                    realMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons25) {
                                        break;
                                    }
                                }
                            } else if (i24 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj28);
                            }
                            break;
                        }
                    }
                    realMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new RealMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj282 = realMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i24 = realMainPaymentPadRefresher$setup$1$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if (i24 != 0) {
                    }
                case 24:
                    if (continuation instanceof RealMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                        realMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (RealMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                        int i56 = realMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                            realMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                            Object obj29 = realMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i25 = realMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                            if (i25 != 0) {
                                SafeTrace.throwOnFailure(obj29);
                                if (obj instanceof PoolAction$CreatePoolAction) {
                                    realMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons26) {
                                        break;
                                    }
                                }
                            } else if (i25 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj29);
                            }
                            break;
                        }
                    }
                    realMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new RealMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj292 = realMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i25 = realMainPaymentPadRefresher$setup$1$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if (i25 != 0) {
                    }
                case 25:
                    if (continuation instanceof RealMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                        realMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (RealMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                        int i57 = realMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                            realMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                            Object obj30 = realMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i26 = realMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                            if (i26 != 0) {
                                SafeTrace.throwOnFailure(obj30);
                                if (obj instanceof TapToPayAction$InitiateTapToPayAction) {
                                    realMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons27) {
                                        break;
                                    }
                                }
                            } else if (i26 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj30);
                            }
                            break;
                        }
                    }
                    realMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new RealMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj302 = realMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i26 = realMainPaymentPadRefresher$setup$1$4$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if (i26 != 0) {
                    }
                case 26:
                    if (continuation instanceof RealOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1) {
                        realOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1 = (RealOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i58 = realOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                            realOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                            Object obj31 = realOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i27 = realOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i27 != 0) {
                                SafeTrace.throwOnFailure(obj31);
                                Intervals intervals = (Intervals) obj;
                                if (intervals.retry_intervals == null || !(!r9.isEmpty())) {
                                    list = RealOfflineManager.DEFAULT_RETRY_INTERVALS;
                                } else {
                                    list = intervals.retry_intervals;
                                    list.getClass();
                                }
                                realOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(list, realOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons28) {
                                    break;
                                }
                            } else if (i27 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj31);
                            }
                            break;
                        }
                    }
                    realOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1 = new RealOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj312 = realOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i27 = realOfflineManager$setup$1$3$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i27 != 0) {
                    }
                    break;
                case 27:
                    if (continuation instanceof RealPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                        realPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (RealPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                        int i59 = realPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                            realPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                            Object obj32 = realPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i28 = realPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                            if (i28 != 0) {
                                SafeTrace.throwOnFailure(obj32);
                                if (obj instanceof PaymentAction.InitiatePaymentAction) {
                                    realPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons29) {
                                        break;
                                    }
                                }
                            } else if (i28 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj32);
                            }
                            break;
                        }
                    }
                    realPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new RealPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj322 = realPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i28 = realPaymentListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if (i28 != 0) {
                    }
                case 28:
                    if (continuation instanceof JankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1) {
                        jankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1 = (JankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i60 = jankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                            jankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                            Object obj33 = jankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i29 = jankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i29 != 0) {
                                SafeTrace.throwOnFailure(obj33);
                                if (((ActivityResult) obj).getRequestCode() == 100) {
                                    jankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, jankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons30) {
                                        break;
                                    }
                                }
                            } else if (i29 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj33);
                            }
                            break;
                        }
                    }
                    jankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1 = new JankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj332 = jankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i29 = jankStatsAggregator$2$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i29 != 0) {
                    }
                default:
                    if (continuation instanceof SessionManagerKt$special$$inlined$filterIsInstance$1$2$1) {
                        sessionManagerKt$special$$inlined$filterIsInstance$1$2$1 = (SessionManagerKt$special$$inlined$filterIsInstance$1$2$1) continuation;
                        int i61 = sessionManagerKt$special$$inlined$filterIsInstance$1$2$1.label;
                        if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                            sessionManagerKt$special$$inlined$filterIsInstance$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                            Object obj34 = sessionManagerKt$special$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i30 = sessionManagerKt$special$$inlined$filterIsInstance$1$2$1.label;
                            if (i30 != 0) {
                                SafeTrace.throwOnFailure(obj34);
                                if (obj instanceof SessionState.Authenticated) {
                                    sessionManagerKt$special$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, sessionManagerKt$special$$inlined$filterIsInstance$1$2$1) == coroutineSingletons31) {
                                        break;
                                    }
                                }
                            } else if (i30 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj34);
                            }
                            break;
                        }
                    }
                    sessionManagerKt$special$$inlined$filterIsInstance$1$2$1 = new SessionManagerKt$special$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj342 = sessionManagerKt$special$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i30 = sessionManagerKt$special$$inlined$filterIsInstance$1$2$1.label;
                    if (i30 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, Object obj, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
        }
    }
}
