package com.squareup.cash.google.pay;

import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter$special$$inlined$map$1$2;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.db2.profile.SelectRegion;
import com.squareup.cash.favorites.presenters.AddFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1;
import com.squareup.cash.favorites.presenters.AddFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1;
import com.squareup.cash.favorites.presenters.ListFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.featureflags.RealFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1;
import com.squareup.cash.featureflags.RealFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1;
import com.squareup.cash.fidesmo.api.FidesmoActivationData;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$getActivationData$$inlined$map$1$2$1;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$getActivationData$$inlined$map$2$2$1;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.formview.components.FormRequirement;
import com.squareup.cash.formview.components.FormView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.formview.components.FormView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.formview.components.FormView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.formview.components.IndividualFormRequirementProvider$requirements$$inlined$map$1$2$1;
import com.squareup.cash.formview.components.arcade.ArcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1;
import com.squareup.cash.formview.components.arcade.ArcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1;
import com.squareup.cash.formview.components.arcade.MultilineInputHelperTextType;
import com.squareup.cash.formview.components.arcade.MultilineTextInputValidator$Result;
import com.squareup.cash.formview.presenters.FormCashtagPresenter;
import com.squareup.cash.formview.presenters.FormCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1;
import com.squareup.cash.formview.presenters.FormCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1;
import com.squareup.cash.formview.presenters.FormCashtagPresenter$lookupCashtag$$inlined$map$1$2$1;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.formview.viewmodels.FormCashtagViewEvent$InputChange;
import com.squareup.cash.formview.viewmodels.FormMoneyInputViewModel;
import com.squareup.cash.globalsearch.backend.api.SearchResult;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository$search$$inlined$map$1$2$1;
import com.squareup.cash.globalsearch.presenters.GlobalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics$createMetricsFlow$1;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$lambda$0$$inlined$map$1$2;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import com.squareup.protos.franklin.common.FeatureFlag;
import com.squareup.util.android.ActivityResult;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealGooglePayer$createWallet$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowKt__MergeKt$flatMapConcat$$inlined$map$1 $this_unsafeTransform$inlined;

    public /* synthetic */ RealGooglePayer$createWallet$$inlined$map$1(FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 8;
        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new AnonymousClass2(flowCollector, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new SwipeableState$special$$inlined$filter$1.AnonymousClass2(flowCollector, 9), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new SwipeableState$special$$inlined$filter$1.AnonymousClass2(flowCollector, 11), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, 25), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 26), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, i2), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, 10), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, 12), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new RealTabProvider$setup$lambda$0$$inlined$map$1$2(flowCollector, i2), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect10 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 21), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1$2$1, reason: invalid class name */
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

        public AnonymousClass2(FlowCollector flowCollector, RealGooglePayer realGooglePayer) {
            this.$r8$classId = 26;
            this.$this_unsafeFlow = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:556:0x0778, code lost:
        
            if (r3.emit(r1, r0) != r12) goto L503;
         */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x01d3  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x020f  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x0219  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x0291  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x029b  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x02d2  */
        /* JADX WARN: Removed duplicated region for block: B:228:0x02dc  */
        /* JADX WARN: Removed duplicated region for block: B:242:0x0313  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x031f  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x03c0  */
        /* JADX WARN: Removed duplicated region for block: B:295:0x03ca  */
        /* JADX WARN: Removed duplicated region for block: B:309:0x0401  */
        /* JADX WARN: Removed duplicated region for block: B:315:0x040b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:330:0x0442  */
        /* JADX WARN: Removed duplicated region for block: B:336:0x044c  */
        /* JADX WARN: Removed duplicated region for block: B:348:0x0482  */
        /* JADX WARN: Removed duplicated region for block: B:354:0x048c  */
        /* JADX WARN: Removed duplicated region for block: B:366:0x04c9  */
        /* JADX WARN: Removed duplicated region for block: B:372:0x04d3  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:384:0x0505  */
        /* JADX WARN: Removed duplicated region for block: B:390:0x050f  */
        /* JADX WARN: Removed duplicated region for block: B:402:0x0541  */
        /* JADX WARN: Removed duplicated region for block: B:408:0x054b  */
        /* JADX WARN: Removed duplicated region for block: B:420:0x0580  */
        /* JADX WARN: Removed duplicated region for block: B:426:0x058a  */
        /* JADX WARN: Removed duplicated region for block: B:438:0x05bf  */
        /* JADX WARN: Removed duplicated region for block: B:444:0x05c9  */
        /* JADX WARN: Removed duplicated region for block: B:456:0x05fe  */
        /* JADX WARN: Removed duplicated region for block: B:462:0x0608  */
        /* JADX WARN: Removed duplicated region for block: B:474:0x063a  */
        /* JADX WARN: Removed duplicated region for block: B:480:0x0644  */
        /* JADX WARN: Removed duplicated region for block: B:492:0x0679  */
        /* JADX WARN: Removed duplicated region for block: B:498:0x0683  */
        /* JADX WARN: Removed duplicated region for block: B:510:0x06b8  */
        /* JADX WARN: Removed duplicated region for block: B:516:0x06c2  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:533:0x0718  */
        /* JADX WARN: Removed duplicated region for block: B:544:0x0757  */
        /* JADX WARN: Removed duplicated region for block: B:559:0x072c  */
        /* JADX WARN: Removed duplicated region for block: B:570:0x079d  */
        /* JADX WARN: Removed duplicated region for block: B:576:0x07a7  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:591:0x07dd  */
        /* JADX WARN: Removed duplicated region for block: B:597:0x07e7  */
        /* JADX WARN: Removed duplicated region for block: B:609:0x0819  */
        /* JADX WARN: Removed duplicated region for block: B:615:0x0823  */
        /* JADX WARN: Removed duplicated region for block: B:627:0x0855  */
        /* JADX WARN: Removed duplicated region for block: B:633:0x085f  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00fa  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            AddFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1 addFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1;
            int i2;
            AddFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1 addFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1;
            int i3;
            ListFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1 listFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1;
            int i4;
            RealFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1 realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1;
            int i5;
            int i6;
            RealFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1 realFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1;
            int i7;
            RealFidesmoClient$getActivationData$$inlined$map$1$2$1 realFidesmoClient$getActivationData$$inlined$map$1$2$1;
            int i8;
            RealFidesmoClient$getActivationData$$inlined$map$2$2$1 realFidesmoClient$getActivationData$$inlined$map$2$2$1;
            int i9;
            RealFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1 realFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1;
            int i10;
            RealFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1 realFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1;
            int i11;
            FormCashtag$8$invokeSuspend$$inlined$map$1$2$1 formCashtag$8$invokeSuspend$$inlined$map$1$2$1;
            int i12;
            FormView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1 formView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1;
            int i13;
            FormView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1 formView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1;
            int i14;
            FormView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1 formView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1;
            int i15;
            IndividualFormRequirementProvider$requirements$$inlined$map$1$2$1 individualFormRequirementProvider$requirements$$inlined$map$1$2$1;
            int i16;
            ArcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1 arcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1;
            int i17;
            ArcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1 arcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1;
            int i18;
            ArcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1 arcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1;
            int i19;
            ArcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1 arcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1;
            int i20;
            Integer num;
            FormCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1 formCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1;
            int i21;
            FormCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1 formCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1;
            int i22;
            FormCashtagPresenter$lookupCashtag$$inlined$map$1$2$1 formCashtagPresenter$lookupCashtag$$inlined$map$1$2$1;
            int i23;
            RealGlobalSearchRepository$search$$inlined$map$1$2$1 realGlobalSearchRepository$search$$inlined$map$1$2$1;
            int i24;
            GlobalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 globalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
            int i25;
            RealGooglePayer$createWallet$$inlined$filter$1$2$1 realGooglePayer$createWallet$$inlined$filter$1$2$1;
            int i26;
            RealGooglePayer$pushTokenize$$inlined$filter$1$2$1 realGooglePayer$pushTokenize$$inlined$filter$1$2$1;
            int i27;
            RealGooglePayer$pushTokenize$$inlined$map$1$2$1 realGooglePayer$pushTokenize$$inlined$map$1$2$1;
            int i28;
            DigitalWalletTokenProvisioningCompletionData.ProvisioningResult provisioningResult;
            RealGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1 realGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1;
            int i29;
            GLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1 gLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i30;
            GLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1 gLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i31;
            int i32 = this.$r8$classId;
            int i33 = 3;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i32) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i34 = anonymousClass1.label;
                        if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i34 - PKIFailureInfo.systemUnavail;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                GooglePayer$GooglePayEvent$CreateWalletResult googlePayer$GooglePayEvent$CreateWalletResult = new GooglePayer$GooglePayEvent$CreateWalletResult(((ActivityResult) obj).resultCode);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(googlePayer$GooglePayEvent$CreateWalletResult, anonymousClass1) == coroutineSingletons) {
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
                    if (continuation instanceof AddFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1) {
                        addFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1 = (AddFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1) continuation;
                        int i35 = addFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1.label;
                        if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                            addFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                            Object obj3 = addFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = addFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                Region region = ((SelectRegion) obj).region;
                                addFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(region, addFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1) == coroutineSingletons3) {
                                    break;
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                            }
                            break;
                        }
                    }
                    addFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1 = new AddFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1(this, continuation);
                    Object obj32 = addFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = addFavoritesPresenter$models$lambda$20$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                case 2:
                    if (continuation instanceof AddFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1) {
                        addFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1 = (AddFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1) continuation;
                        int i36 = addFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                        if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                            addFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                            Object obj4 = addFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = addFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                Region region2 = ((SelectRegion) obj).region;
                                addFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(region2, addFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1) == coroutineSingletons4) {
                                    break;
                                }
                            } else if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj4);
                            }
                            break;
                        }
                    }
                    addFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1 = new AddFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1(this, continuation);
                    Object obj42 = addFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = addFavoritesPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                    if (i3 != 0) {
                    }
                case 3:
                    if (continuation instanceof ListFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1) {
                        listFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1 = (ListFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                        int i37 = listFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                            listFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                            Object obj5 = listFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = listFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                Region region3 = ((SelectRegion) obj).region;
                                if (region3 == null) {
                                    region3 = Region.USA;
                                }
                                listFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(region3, listFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons5) {
                                    break;
                                }
                            } else if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj5);
                            }
                            break;
                        }
                    }
                    listFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1 = new ListFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj52 = listFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = listFavoritesPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if (i4 != 0) {
                    }
                case 4:
                    if (continuation instanceof RealFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1) {
                        realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1 = (RealFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1) continuation;
                        int i38 = realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.label;
                        if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                            realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                            Object obj6 = realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.label;
                            if (i5 == 0) {
                                if (i5 != 1) {
                                    if (i5 == 2) {
                                        SafeTrace.throwOnFailure(obj6);
                                        break;
                                    } else {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    }
                                } else {
                                    i6 = realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.I$0;
                                    flowCollector = realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.L$4;
                                    SafeTrace.throwOnFailure(obj6);
                                }
                            } else {
                                SafeTrace.throwOnFailure(obj6);
                                StartedLazily$command$$inlined$unsafeFlow$1 startedLazily$command$$inlined$unsafeFlow$1 = new StartedLazily$command$$inlined$unsafeFlow$1((List) obj, i33);
                                realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.L$4 = flowCollector;
                                realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.I$0 = 0;
                                realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.label = 1;
                                obj6 = FlowKt__CollectionKt.toCollection(startedLazily$command$$inlined$unsafeFlow$1, new ArrayList(), realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1);
                                if (obj6 != coroutineSingletons6) {
                                    i6 = 0;
                                }
                                break;
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Object obj7 : (Iterable) obj6) {
                                Boolean bool = ((FeatureFlag) obj7).client_data_enabled;
                                if (bool != null ? bool.booleanValue() : false) {
                                    arrayList.add(obj7);
                                }
                            }
                            realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.L$4 = null;
                            realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.I$0 = i6;
                            realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.label = 2;
                            break;
                        }
                    }
                    realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1 = new RealFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1(this, continuation);
                    Object obj62 = realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.label;
                    if (i5 == 0) {
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (r10.hasNext()) {
                    }
                    realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.L$4 = null;
                    realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.I$0 = i6;
                    realFeatureFlagManager$clientDataFeatureFlags$$inlined$map$1$2$1.label = 2;
                case 5:
                    if (continuation instanceof RealFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1) {
                        realFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1 = (RealFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1) continuation;
                        int i39 = realFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1.label;
                        if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                            realFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                            Object obj8 = realFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = realFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj8);
                                List list = (List) obj;
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add(((FeatureFlag) it.next()).encodeByteString());
                                }
                                realFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList3, realFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1) == coroutineSingletons7) {
                                    break;
                                }
                            } else if (i7 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj8);
                            }
                            break;
                        }
                    }
                    realFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1 = new RealFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1(this, continuation);
                    Object obj82 = realFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = realFeatureFlagManager$encodedClientDataFeatureFlags$$inlined$map$1$2$1.label;
                    if (i7 != 0) {
                    }
                case 6:
                    if (continuation instanceof RealFidesmoClient$getActivationData$$inlined$map$1$2$1) {
                        realFidesmoClient$getActivationData$$inlined$map$1$2$1 = (RealFidesmoClient$getActivationData$$inlined$map$1$2$1) continuation;
                        int i40 = realFidesmoClient$getActivationData$$inlined$map$1$2$1.label;
                        if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                            realFidesmoClient$getActivationData$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                            Object obj9 = realFidesmoClient$getActivationData$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = realFidesmoClient$getActivationData$$inlined$map$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj9);
                                RealFidesmoClient.ActivationDataWaitResult.Received received = new RealFidesmoClient.ActivationDataWaitResult.Received((FidesmoActivationData) obj);
                                realFidesmoClient$getActivationData$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(received, realFidesmoClient$getActivationData$$inlined$map$1$2$1) == coroutineSingletons8) {
                                    break;
                                }
                            } else if (i8 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj9);
                            }
                            break;
                        }
                    }
                    realFidesmoClient$getActivationData$$inlined$map$1$2$1 = new RealFidesmoClient$getActivationData$$inlined$map$1$2$1(this, continuation);
                    Object obj92 = realFidesmoClient$getActivationData$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = realFidesmoClient$getActivationData$$inlined$map$1$2$1.label;
                    if (i8 != 0) {
                    }
                case 7:
                    if (continuation instanceof RealFidesmoClient$getActivationData$$inlined$map$2$2$1) {
                        realFidesmoClient$getActivationData$$inlined$map$2$2$1 = (RealFidesmoClient$getActivationData$$inlined$map$2$2$1) continuation;
                        int i41 = realFidesmoClient$getActivationData$$inlined$map$2$2$1.label;
                        if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                            realFidesmoClient$getActivationData$$inlined$map$2$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                            Object obj10 = realFidesmoClient$getActivationData$$inlined$map$2$2$1.result;
                            CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = realFidesmoClient$getActivationData$$inlined$map$2$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj10);
                                ((Number) obj).longValue();
                                realFidesmoClient$getActivationData$$inlined$map$2$2$1.label = 1;
                                if (flowCollector.emit(RealFidesmoClient.ActivationDataWaitResult.ConnectionInvalidated.INSTANCE, realFidesmoClient$getActivationData$$inlined$map$2$2$1) == coroutineSingletons9) {
                                    break;
                                }
                            } else if (i9 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj10);
                            }
                            break;
                        }
                    }
                    realFidesmoClient$getActivationData$$inlined$map$2$2$1 = new RealFidesmoClient$getActivationData$$inlined$map$2$2$1(this, continuation);
                    Object obj102 = realFidesmoClient$getActivationData$$inlined$map$2$2$1.result;
                    CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = realFidesmoClient$getActivationData$$inlined$map$2$2$1.label;
                    if (i9 != 0) {
                    }
                case 8:
                    if (continuation instanceof RealFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1) {
                        realFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1 = (RealFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1) continuation;
                        int i42 = realFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1.label;
                        if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                            realFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                            Object obj11 = realFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = realFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj11);
                                realFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(RealFidesmoClient.ProvisioningDataWaitResult.Received.INSTANCE, realFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1) == coroutineSingletons10) {
                                    break;
                                }
                            } else if (i10 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj11);
                            }
                            break;
                        }
                    }
                    realFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1 = new RealFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1(this, continuation);
                    Object obj112 = realFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = realFidesmoClient$waitForProvisioningData$$inlined$map$1$2$1.label;
                    if (i10 != 0) {
                    }
                case 9:
                    if (continuation instanceof RealFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1) {
                        realFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1 = (RealFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1) continuation;
                        int i43 = realFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1.label;
                        if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                            realFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                            Object obj12 = realFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1.result;
                            CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = realFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1.label;
                            if (i11 != 0) {
                                SafeTrace.throwOnFailure(obj12);
                                ((Number) obj).longValue();
                                realFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1.label = 1;
                                if (flowCollector.emit(RealFidesmoClient.ProvisioningDataWaitResult.ConnectionInvalidated.INSTANCE, realFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1) == coroutineSingletons11) {
                                    break;
                                }
                            } else if (i11 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj12);
                            }
                            break;
                        }
                    }
                    realFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1 = new RealFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1(this, continuation);
                    Object obj122 = realFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1.result;
                    CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = realFidesmoClient$waitForProvisioningData$$inlined$map$2$2$1.label;
                    if (i11 != 0) {
                    }
                case 10:
                    if (continuation instanceof FormCashtag$8$invokeSuspend$$inlined$map$1$2$1) {
                        formCashtag$8$invokeSuspend$$inlined$map$1$2$1 = (FormCashtag$8$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i44 = formCashtag$8$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                            formCashtag$8$invokeSuspend$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                            Object obj13 = formCashtag$8$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i12 = formCashtag$8$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i12 != 0) {
                                SafeTrace.throwOnFailure(obj13);
                                FormCashtagViewEvent$InputChange formCashtagViewEvent$InputChange = new FormCashtagViewEvent$InputChange((String) obj);
                                formCashtag$8$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(formCashtagViewEvent$InputChange, formCashtag$8$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons12) {
                                    break;
                                }
                            } else if (i12 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj13);
                            }
                            break;
                        }
                    }
                    formCashtag$8$invokeSuspend$$inlined$map$1$2$1 = new FormCashtag$8$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj132 = formCashtag$8$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i12 = formCashtag$8$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i12 != 0) {
                    }
                case 11:
                    if (continuation instanceof FormView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1) {
                        formView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1 = (FormView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i45 = formView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                            formView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                            Object obj14 = formView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i13 = formView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i13 != 0) {
                                SafeTrace.throwOnFailure(obj14);
                                FormViewEvent.FormUrlClicked formUrlClicked = new FormViewEvent.FormUrlClicked((String) obj);
                                formView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(formUrlClicked, formView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons13) {
                                    break;
                                }
                            } else if (i13 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj14);
                            }
                            break;
                        }
                    }
                    formView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1 = new FormView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj142 = formView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i13 = formView$renderViewModel$4$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i13 != 0) {
                    }
                case 12:
                    if (continuation instanceof FormView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1) {
                        formView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1 = (FormView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i46 = formView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                            formView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                            Object obj15 = formView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i14 = formView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i14 != 0) {
                                SafeTrace.throwOnFailure(obj15);
                                formView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(FormViewEvent.PrimaryActionSelected.INSTANCE, formView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons14) {
                                    break;
                                }
                            } else if (i14 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj15);
                            }
                            break;
                        }
                    }
                    formView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1 = new FormView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj152 = formView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i14 = formView$renderViewModel$5$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i14 != 0) {
                    }
                case 13:
                    if (continuation instanceof FormView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1) {
                        formView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1 = (FormView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i47 = formView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                            formView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                            Object obj16 = formView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i15 = formView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i15 != 0) {
                                SafeTrace.throwOnFailure(obj16);
                                formView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(FormViewEvent.SecondaryActionSelected.INSTANCE, formView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons15) {
                                    break;
                                }
                            } else if (i15 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj16);
                            }
                            break;
                        }
                    }
                    formView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1 = new FormView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj162 = formView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i15 = formView$renderViewModel$6$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i15 != 0) {
                    }
                case 14:
                    if (continuation instanceof IndividualFormRequirementProvider$requirements$$inlined$map$1$2$1) {
                        individualFormRequirementProvider$requirements$$inlined$map$1$2$1 = (IndividualFormRequirementProvider$requirements$$inlined$map$1$2$1) continuation;
                        int i48 = individualFormRequirementProvider$requirements$$inlined$map$1$2$1.label;
                        if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                            individualFormRequirementProvider$requirements$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                            Object obj17 = individualFormRequirementProvider$requirements$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i16 = individualFormRequirementProvider$requirements$$inlined$map$1$2$1.label;
                            if (i16 != 0) {
                                SafeTrace.throwOnFailure(obj17);
                                List listOf = CollectionsKt__CollectionsJVMKt.listOf(new FormRequirement(((Boolean) obj).booleanValue(), null));
                                individualFormRequirementProvider$requirements$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(listOf, individualFormRequirementProvider$requirements$$inlined$map$1$2$1) == coroutineSingletons16) {
                                    break;
                                }
                            } else if (i16 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj17);
                            }
                            break;
                        }
                    }
                    individualFormRequirementProvider$requirements$$inlined$map$1$2$1 = new IndividualFormRequirementProvider$requirements$$inlined$map$1$2$1(this, continuation);
                    Object obj172 = individualFormRequirementProvider$requirements$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i16 = individualFormRequirementProvider$requirements$$inlined$map$1$2$1.label;
                    if (i16 != 0) {
                    }
                case 15:
                    if (continuation instanceof ArcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1) {
                        arcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1 = (ArcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1) continuation;
                        int i49 = arcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1.label;
                        if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                            arcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                            Object obj18 = arcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i17 = arcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1.label;
                            if (i17 != 0) {
                                SafeTrace.throwOnFailure(obj18);
                                Boolean valueOf = Boolean.valueOf(((FormMoneyInputViewModel) obj).isValid);
                                arcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf, arcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1) == coroutineSingletons17) {
                                    break;
                                }
                            } else if (i17 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj18);
                            }
                            break;
                        }
                    }
                    arcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1 = new ArcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1(this, continuation);
                    Object obj182 = arcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i17 = arcadeFormMoneyInput$isRequirementFulfilled$$inlined$map$1$2$1.label;
                    if (i17 != 0) {
                    }
                case 16:
                    if (continuation instanceof ArcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1) {
                        arcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1 = (ArcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1) continuation;
                        int i50 = arcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1.label;
                        if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                            arcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                            Object obj19 = arcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i18 = arcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1.label;
                            if (i18 != 0) {
                                SafeTrace.throwOnFailure(obj19);
                                Boolean valueOf2 = Boolean.valueOf(((String) obj) != null);
                                arcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf2, arcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1) == coroutineSingletons18) {
                                    break;
                                }
                            } else if (i18 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj19);
                            }
                            break;
                        }
                    }
                    arcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1 = new ArcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1(this, continuation);
                    Object obj192 = arcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i18 = arcadeFormOptionPickerView$isRequirementFulfilled$$inlined$map$1$2$1.label;
                    if (i18 != 0) {
                    }
                case 17:
                    if (continuation instanceof ArcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1) {
                        arcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1 = (ArcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i51 = arcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                            arcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                            Object obj20 = arcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i19 = arcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i19 != 0) {
                                SafeTrace.throwOnFailure(obj20);
                                if (!StringsKt.isBlank((CharSequence) obj)) {
                                    arcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, arcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons19) {
                                        break;
                                    }
                                }
                            } else if (i19 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj20);
                            }
                            break;
                        }
                    }
                    arcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1 = new ArcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj202 = arcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i19 = arcadeFormTextInputGroupView$Content$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i19 != 0) {
                    }
                case 18:
                    if (continuation instanceof ArcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1) {
                        arcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1 = (ArcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1) continuation;
                        int i52 = arcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1.label;
                        if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                            arcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                            Object obj21 = arcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i20 = arcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1.label;
                            if (i20 != 0) {
                                SafeTrace.throwOnFailure(obj21);
                                MultilineTextInputValidator$Result multilineTextInputValidator$Result = (MultilineTextInputValidator$Result) obj;
                                multilineTextInputValidator$Result.getClass();
                                boolean z = multilineTextInputValidator$Result instanceof MultilineTextInputValidator$Result.Success;
                                Object obj23 = MultilineInputHelperTextType.Nothing.INSTANCE;
                                if (z) {
                                    MultilineTextInputValidator$Result.Success success = (MultilineTextInputValidator$Result.Success) multilineTextInputValidator$Result;
                                    int i53 = success.currentCharCount;
                                    if ((success.isRequired || i53 != 0) && (num = success.maxCharCount) != null) {
                                        obj23 = new MultilineInputHelperTextType.MaxCharCount(i53, num.intValue());
                                    }
                                } else if (multilineTextInputValidator$Result instanceof MultilineTextInputValidator$Result.Failure) {
                                    MultilineTextInputValidator$Result.Failure.Reason reason = ((MultilineTextInputValidator$Result.Failure) multilineTextInputValidator$Result).reason;
                                    if (reason instanceof MultilineTextInputValidator$Result.Failure.Reason.MinCharCountNotReached) {
                                        MultilineTextInputValidator$Result.Failure.Reason.MinCharCountNotReached minCharCountNotReached = (MultilineTextInputValidator$Result.Failure.Reason.MinCharCountNotReached) reason;
                                        obj23 = new MultilineInputHelperTextType.RequiredCharCount(minCharCountNotReached.minCharCount - minCharCountNotReached.currentCharCount);
                                    } else if (reason instanceof MultilineTextInputValidator$Result.Failure.Reason.EmptyRequiredInput) {
                                        MultilineTextInputValidator$Result.Failure.Reason.EmptyRequiredInput emptyRequiredInput = (MultilineTextInputValidator$Result.Failure.Reason.EmptyRequiredInput) reason;
                                        Integer num2 = emptyRequiredInput.minCharCount;
                                        if (num2 != null) {
                                            obj23 = new MultilineInputHelperTextType.RequiredCharCount(num2.intValue());
                                        } else {
                                            Integer num3 = emptyRequiredInput.maxCharCount;
                                            if (num3 != null) {
                                                obj23 = new MultilineInputHelperTextType.MaxCharCount(0, num3.intValue());
                                            }
                                        }
                                    } else if (!(reason instanceof MultilineTextInputValidator$Result.Failure.Reason.MaxCharCountExceeded)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    }
                                } else if (!multilineTextInputValidator$Result.equals(MultilineTextInputValidator$Result.NotApplicable.INSTANCE)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                }
                                arcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj23, arcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1) == coroutineSingletons20) {
                                    break;
                                }
                            } else if (i20 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj21);
                            }
                            break;
                        }
                    }
                    arcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1 = new ArcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1(this, continuation);
                    Object obj212 = arcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i20 = arcadeFormTextInputGroupView$Content$lambda$6$0$0$0$$inlined$map$1$2$1.label;
                    if (i20 != 0) {
                    }
                    break;
                case 19:
                    if (continuation instanceof FormCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1) {
                        formCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1 = (FormCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1) continuation;
                        int i54 = formCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1.label;
                        if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                            formCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                            Object obj24 = formCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i21 = formCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1.label;
                            if (i21 != 0) {
                                SafeTrace.throwOnFailure(obj24);
                                if (((String) obj).length() > 0) {
                                    formCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, formCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1) == coroutineSingletons21) {
                                        break;
                                    }
                                }
                            } else if (i21 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj24);
                            }
                            break;
                        }
                    }
                    formCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1 = new FormCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1(this, continuation);
                    Object obj242 = formCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i21 = formCashtagPresenter$lookupCashtag$$inlined$filter$1$2$1.label;
                    if (i21 != 0) {
                    }
                case 20:
                    if (continuation instanceof FormCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1) {
                        formCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1 = (FormCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1) continuation;
                        int i55 = formCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1.label;
                        if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                            formCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                            Object obj25 = formCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1.result;
                            CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i22 = formCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1.label;
                            if (i22 != 0) {
                                SafeTrace.throwOnFailure(obj25);
                                if (((String) obj).length() == 0) {
                                    formCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1.label = 1;
                                    if (flowCollector.emit(obj, formCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1) == coroutineSingletons22) {
                                        break;
                                    }
                                }
                            } else if (i22 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj25);
                            }
                            break;
                        }
                    }
                    formCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1 = new FormCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1(this, continuation);
                    Object obj252 = formCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1.result;
                    CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i22 = formCashtagPresenter$lookupCashtag$$inlined$filter$2$2$1.label;
                    if (i22 != 0) {
                    }
                case 21:
                    if (continuation instanceof FormCashtagPresenter$lookupCashtag$$inlined$map$1$2$1) {
                        formCashtagPresenter$lookupCashtag$$inlined$map$1$2$1 = (FormCashtagPresenter$lookupCashtag$$inlined$map$1$2$1) continuation;
                        int i56 = formCashtagPresenter$lookupCashtag$$inlined$map$1$2$1.label;
                        if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                            formCashtagPresenter$lookupCashtag$$inlined$map$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                            Object obj26 = formCashtagPresenter$lookupCashtag$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i23 = formCashtagPresenter$lookupCashtag$$inlined$map$1$2$1.label;
                            if (i23 != 0) {
                                SafeTrace.throwOnFailure(obj26);
                                FormCashtagPresenter.LookupResult lookupResult = new FormCashtagPresenter.LookupResult(null, false, true);
                                formCashtagPresenter$lookupCashtag$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(lookupResult, formCashtagPresenter$lookupCashtag$$inlined$map$1$2$1) == coroutineSingletons23) {
                                    break;
                                }
                            } else if (i23 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj26);
                            }
                            break;
                        }
                    }
                    formCashtagPresenter$lookupCashtag$$inlined$map$1$2$1 = new FormCashtagPresenter$lookupCashtag$$inlined$map$1$2$1(this, continuation);
                    Object obj262 = formCashtagPresenter$lookupCashtag$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i23 = formCashtagPresenter$lookupCashtag$$inlined$map$1$2$1.label;
                    if (i23 != 0) {
                    }
                case 22:
                    if (continuation instanceof RealGlobalSearchRepository$search$$inlined$map$1$2$1) {
                        realGlobalSearchRepository$search$$inlined$map$1$2$1 = (RealGlobalSearchRepository$search$$inlined$map$1$2$1) continuation;
                        int i57 = realGlobalSearchRepository$search$$inlined$map$1$2$1.label;
                        if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                            realGlobalSearchRepository$search$$inlined$map$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                            Object obj27 = realGlobalSearchRepository$search$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i24 = realGlobalSearchRepository$search$$inlined$map$1$2$1.label;
                            if (i24 != 0) {
                                SafeTrace.throwOnFailure(obj27);
                                Object obj28 = (SearchResult) obj;
                                if (obj28 == null) {
                                    obj28 = new SearchResult.Success(EmptyList.INSTANCE);
                                }
                                realGlobalSearchRepository$search$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj28, realGlobalSearchRepository$search$$inlined$map$1$2$1) == coroutineSingletons24) {
                                    break;
                                }
                            } else if (i24 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj27);
                            }
                            break;
                        }
                    }
                    realGlobalSearchRepository$search$$inlined$map$1$2$1 = new RealGlobalSearchRepository$search$$inlined$map$1$2$1(this, continuation);
                    Object obj272 = realGlobalSearchRepository$search$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i24 = realGlobalSearchRepository$search$$inlined$map$1$2$1.label;
                    if (i24 != 0) {
                    }
                case 23:
                    if (continuation instanceof GlobalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                        globalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (GlobalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                        int i58 = globalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                            globalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                            Object obj29 = globalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i25 = globalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                            if (i25 != 0) {
                                SafeTrace.throwOnFailure(obj29);
                                if (obj instanceof GlobalSearchViewEvent.QueryUpdateEvent) {
                                    globalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, globalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == coroutineSingletons25) {
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
                    globalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new GlobalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj292 = globalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                    CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i25 = globalSearchPresenter$models$4$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if (i25 != 0) {
                    }
                case 24:
                    if (continuation instanceof RealGooglePayer$createWallet$$inlined$filter$1$2$1) {
                        realGooglePayer$createWallet$$inlined$filter$1$2$1 = (RealGooglePayer$createWallet$$inlined$filter$1$2$1) continuation;
                        int i59 = realGooglePayer$createWallet$$inlined$filter$1$2$1.label;
                        if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                            realGooglePayer$createWallet$$inlined$filter$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                            Object obj30 = realGooglePayer$createWallet$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i26 = realGooglePayer$createWallet$$inlined$filter$1$2$1.label;
                            if (i26 != 0) {
                                SafeTrace.throwOnFailure(obj30);
                                if (((ActivityResult) obj).requestCode == 4) {
                                    realGooglePayer$createWallet$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realGooglePayer$createWallet$$inlined$filter$1$2$1) == coroutineSingletons26) {
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
                    realGooglePayer$createWallet$$inlined$filter$1$2$1 = new RealGooglePayer$createWallet$$inlined$filter$1$2$1(this, continuation);
                    Object obj302 = realGooglePayer$createWallet$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i26 = realGooglePayer$createWallet$$inlined$filter$1$2$1.label;
                    if (i26 != 0) {
                    }
                case 25:
                    if (continuation instanceof RealGooglePayer$pushTokenize$$inlined$filter$1$2$1) {
                        realGooglePayer$pushTokenize$$inlined$filter$1$2$1 = (RealGooglePayer$pushTokenize$$inlined$filter$1$2$1) continuation;
                        int i60 = realGooglePayer$pushTokenize$$inlined$filter$1$2$1.label;
                        if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                            realGooglePayer$pushTokenize$$inlined$filter$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                            Object obj31 = realGooglePayer$pushTokenize$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i27 = realGooglePayer$pushTokenize$$inlined$filter$1$2$1.label;
                            if (i27 != 0) {
                                SafeTrace.throwOnFailure(obj31);
                                if (((ActivityResult) obj).requestCode == 3) {
                                    realGooglePayer$pushTokenize$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realGooglePayer$pushTokenize$$inlined$filter$1$2$1) == coroutineSingletons27) {
                                        break;
                                    }
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
                    realGooglePayer$pushTokenize$$inlined$filter$1$2$1 = new RealGooglePayer$pushTokenize$$inlined$filter$1$2$1(this, continuation);
                    Object obj312 = realGooglePayer$pushTokenize$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i27 = realGooglePayer$pushTokenize$$inlined$filter$1$2$1.label;
                    if (i27 != 0) {
                    }
                case 26:
                    if (continuation instanceof RealGooglePayer$pushTokenize$$inlined$map$1$2$1) {
                        realGooglePayer$pushTokenize$$inlined$map$1$2$1 = (RealGooglePayer$pushTokenize$$inlined$map$1$2$1) continuation;
                        int i61 = realGooglePayer$pushTokenize$$inlined$map$1$2$1.label;
                        if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                            realGooglePayer$pushTokenize$$inlined$map$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                            Object obj33 = realGooglePayer$pushTokenize$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i28 = realGooglePayer$pushTokenize$$inlined$map$1$2$1.label;
                            if (i28 != 0) {
                                SafeTrace.throwOnFailure(obj33);
                                int i62 = ((ActivityResult) obj).resultCode;
                                if (i62 == -1) {
                                    provisioningResult = DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.SUCCESS;
                                } else if (i62 == 0) {
                                    provisioningResult = DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.USER_CANCELED;
                                } else if (i62 != 15009) {
                                    switch (i62) {
                                        case 15002:
                                            provisioningResult = DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.NO_ACTIVE_WALLET;
                                            break;
                                        case 15003:
                                            provisioningResult = DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.TOKEN_NOT_FOUND;
                                            break;
                                        case 15004:
                                            provisioningResult = DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.INVALID_TOKEN_STATE;
                                            break;
                                        case 15005:
                                            provisioningResult = DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.ATTESTATION_ERROR;
                                            break;
                                        default:
                                            provisioningResult = DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.UNKNOWN_ERROR;
                                            break;
                                    }
                                } else {
                                    provisioningResult = DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.TAP_AND_PAY_UNAVAILABLE;
                                }
                                GooglePayer$GooglePayEvent$ProvisionResult googlePayer$GooglePayEvent$ProvisionResult = new GooglePayer$GooglePayEvent$ProvisionResult(provisioningResult);
                                realGooglePayer$pushTokenize$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(googlePayer$GooglePayEvent$ProvisionResult, realGooglePayer$pushTokenize$$inlined$map$1$2$1) == coroutineSingletons28) {
                                    break;
                                }
                            } else if (i28 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj33);
                            }
                            break;
                        }
                    }
                    realGooglePayer$pushTokenize$$inlined$map$1$2$1 = new RealGooglePayer$pushTokenize$$inlined$map$1$2$1(this, continuation);
                    Object obj332 = realGooglePayer$pushTokenize$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i28 = realGooglePayer$pushTokenize$$inlined$map$1$2$1.label;
                    if (i28 != 0) {
                    }
                case 27:
                    if (continuation instanceof RealGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1) {
                        realGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1 = (RealGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1) continuation;
                        int i63 = realGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1.label;
                        if ((i63 & PKIFailureInfo.systemUnavail) != 0) {
                            realGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1.label = i63 - PKIFailureInfo.systemUnavail;
                            Object obj34 = realGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i29 = realGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1.label;
                            if (i29 != 0) {
                                SafeTrace.throwOnFailure(obj34);
                                if (((ActivityResult) obj).requestCode == 11) {
                                    realGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1) == coroutineSingletons29) {
                                        break;
                                    }
                                }
                            } else if (i29 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj34);
                            }
                            break;
                        }
                    }
                    realGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1 = new RealGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1(this, continuation);
                    Object obj342 = realGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i29 = realGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1.label;
                    if (i29 != 0) {
                    }
                case 28:
                    if (continuation instanceof GLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        gLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1 = (GLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i64 = gLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i64 & PKIFailureInfo.systemUnavail) != 0) {
                            gLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i64 - PKIFailureInfo.systemUnavail;
                            Object obj35 = gLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i30 = gLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i30 != 0) {
                                SafeTrace.throwOnFailure(obj35);
                                if (((Boolean) obj).booleanValue()) {
                                    gLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, gLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons30) {
                                        break;
                                    }
                                }
                            } else if (i30 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj35);
                            }
                            break;
                        }
                    }
                    gLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1 = new GLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj352 = gLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i30 = gLSceneScope$produceTexture$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i30 != 0) {
                    }
                default:
                    if (continuation instanceof GLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        gLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1 = (GLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i65 = gLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i65 & PKIFailureInfo.systemUnavail) != 0) {
                            gLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i65 - PKIFailureInfo.systemUnavail;
                            Object obj36 = gLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i31 = gLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i31 != 0) {
                                SafeTrace.throwOnFailure(obj36);
                                if (((Boolean) obj).booleanValue()) {
                                    gLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, gLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons31) {
                                        break;
                                    }
                                }
                            } else if (i31 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj36);
                            }
                            break;
                        }
                    }
                    gLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1 = new GLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj362 = gLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i31 = gLSceneScope$rememberMaterial$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i31 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
        }
    }
}
