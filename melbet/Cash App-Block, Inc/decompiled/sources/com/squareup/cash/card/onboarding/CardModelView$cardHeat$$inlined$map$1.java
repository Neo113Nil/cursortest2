package com.squareup.cash.card.onboarding;

import android.graphics.Bitmap;
import android.graphics.Paint;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.android.CanvasCompatO;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidget;
import com.squareup.cash.amountslider.AmountPickerCondensedView$events$$inlined$map$1$2;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter$special$$inlined$map$1$2;
import com.squareup.cash.bugreporting.presenters.BugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1;
import com.squareup.cash.businessaccount.backend.real.RealKybRestrictionManager$get$$inlined$filter$1$2$1;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardStylePickerPresenter;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.card.onboarding.db.CardStudio;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState$wobbleFlow$$inlined$map$1$2$1;
import com.squareup.cash.cashapppay.presenters.GrantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.cashapppay.presenters.GrantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.cashapppay.settings.presenters.CashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsRowViewModel$BusinessViewModel;
import com.squareup.cash.checks.CaptureCheckFacePresenter$special$$inlined$filter$1$2$1;
import com.squareup.cash.clientrouting.routers.activity.ActivityRouter$route$2$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.clientrouting.routers.local.LocalRouter$route$2$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo$special$$inlined$map$1$2;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.db2.contacts.MerchantsWithBusinessGrants;
import com.squareup.cash.db2.loyalty.LoyaltyMerchant;
import com.squareup.cash.earnings.backend.real.RealEarningsChartRepository$header$$inlined$map$1$2;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.util.Quadruple;
import com.squareup.util.Septuple;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardModelView$cardHeat$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChannelFlowTransformLatest $this_unsafeTransform$inlined;

    /* renamed from: com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int I$0;
            public FlowCollector L$4;
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

        /* JADX WARN: Code restructure failed: missing block: B:306:0x046e, code lost:
        
            if (r7.emit(r0, r3) == r2) goto L285;
         */
        /* JADX WARN: Code restructure failed: missing block: B:312:0x045d, code lost:
        
            if (r0 == r2) goto L285;
         */
        /* JADX WARN: Code restructure failed: missing block: B:589:0x0892, code lost:
        
            if (r7.emit(r0, r3) != r2) goto L537;
         */
        /* JADX WARN: Code restructure failed: missing block: B:593:0x0885, code lost:
        
            if (r0 == r2) goto L536;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x024a  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0254  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x0287  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0291  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:194:0x02ce  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x02d8  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x030f  */
        /* JADX WARN: Removed duplicated region for block: B:220:0x0319  */
        /* JADX WARN: Removed duplicated region for block: B:237:0x0356  */
        /* JADX WARN: Removed duplicated region for block: B:243:0x0360  */
        /* JADX WARN: Removed duplicated region for block: B:255:0x039a  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x03a4  */
        /* JADX WARN: Removed duplicated region for block: B:278:0x03e1  */
        /* JADX WARN: Removed duplicated region for block: B:284:0x03eb  */
        /* JADX WARN: Removed duplicated region for block: B:296:0x042e  */
        /* JADX WARN: Removed duplicated region for block: B:309:0x0442  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:322:0x0493  */
        /* JADX WARN: Removed duplicated region for block: B:328:0x049d  */
        /* JADX WARN: Removed duplicated region for block: B:340:0x04ce  */
        /* JADX WARN: Removed duplicated region for block: B:346:0x04d8  */
        /* JADX WARN: Removed duplicated region for block: B:358:0x0509  */
        /* JADX WARN: Removed duplicated region for block: B:364:0x0513  */
        /* JADX WARN: Removed duplicated region for block: B:376:0x0546  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:382:0x0550  */
        /* JADX WARN: Removed duplicated region for block: B:394:0x059a  */
        /* JADX WARN: Removed duplicated region for block: B:400:0x05a4  */
        /* JADX WARN: Removed duplicated region for block: B:412:0x05d7  */
        /* JADX WARN: Removed duplicated region for block: B:418:0x05e1  */
        /* JADX WARN: Removed duplicated region for block: B:430:0x062c  */
        /* JADX WARN: Removed duplicated region for block: B:436:0x0636  */
        /* JADX WARN: Removed duplicated region for block: B:448:0x0669  */
        /* JADX WARN: Removed duplicated region for block: B:454:0x0673  */
        /* JADX WARN: Removed duplicated region for block: B:466:0x06a6  */
        /* JADX WARN: Removed duplicated region for block: B:472:0x06b0  */
        /* JADX WARN: Removed duplicated region for block: B:484:0x06e3  */
        /* JADX WARN: Removed duplicated region for block: B:490:0x06ed  */
        /* JADX WARN: Removed duplicated region for block: B:502:0x074d  */
        /* JADX WARN: Removed duplicated region for block: B:508:0x0757  */
        /* JADX WARN: Removed duplicated region for block: B:520:0x0795  */
        /* JADX WARN: Removed duplicated region for block: B:526:0x079f  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:540:0x07d4  */
        /* JADX WARN: Removed duplicated region for block: B:546:0x07de  */
        /* JADX WARN: Removed duplicated region for block: B:560:0x0815  */
        /* JADX WARN: Removed duplicated region for block: B:566:0x081f  */
        /* JADX WARN: Removed duplicated region for block: B:580:0x0858  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:592:0x086c  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x016b  */
        /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r11v37 */
        /* JADX WARN: Type inference failed for: r11v75 */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            FlowCollector flowCollector;
            BugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1 bugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1;
            int i2;
            RealKybRestrictionManager$get$$inlined$filter$1$2$1 realKybRestrictionManager$get$$inlined$filter$1$2$1;
            int i3;
            CardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1 cardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i4;
            CardModelView$1$2$invokeSuspend$$inlined$map$1$2$1 cardModelView$1$2$invokeSuspend$$inlined$map$1$2$1;
            int i5;
            CardModelView$cardAlbedo$$inlined$map$1$2$1 cardModelView$cardAlbedo$$inlined$map$1$2$1;
            int i6;
            CardModelView$cardHeatSample$$inlined$map$1$2$1 cardModelView$cardHeatSample$$inlined$map$1$2$1;
            int i7;
            CardModelView$cardHoloSamples$$inlined$map$1$2$1 cardModelView$cardHoloSamples$$inlined$map$1$2$1;
            int i8;
            CardModelView$cardNormal$$inlined$map$1$2$1 cardModelView$cardNormal$$inlined$map$1$2$1;
            int i9;
            CardModelView$colorGradient$$inlined$map$1$2$1 cardModelView$colorGradient$$inlined$map$1$2$1;
            int i10;
            CardModelView$contouredTextTexture$$inlined$map$1$2$1 cardModelView$contouredTextTexture$$inlined$map$1$2$1;
            int i11;
            CardModelView$copyPanTexture$$inlined$map$1$2$1 cardModelView$copyPanTexture$$inlined$map$1$2$1;
            int i12;
            CardModelView$getActiveHeat$$inlined$map$1$2$1 cardModelView$getActiveHeat$$inlined$map$1$2$1;
            int i13;
            CardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1 cardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1;
            int i14;
            CardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1 cardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1;
            int i15;
            CardModelView$iconTexture$$inlined$map$1$2$1 cardModelView$iconTexture$$inlined$map$1$2$1;
            int i16;
            EquatableBitmap equatableBitmap;
            FlowCollector flowCollector2;
            FlowCollector flowCollector3;
            CardModelView$lighting$$inlined$map$1$2$1 cardModelView$lighting$$inlined$map$1$2$1;
            int i17;
            CardPreviewPresenter$cashtag$$inlined$map$1$2$1 cardPreviewPresenter$cashtag$$inlined$map$1$2$1;
            int i18;
            String str;
            CardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1 cardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1;
            int i19;
            CardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1 cardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1;
            int i20;
            CardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1 cardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1;
            int i21;
            RealStyledCardPresenter$cashtag$$inlined$map$1$2$1 realStyledCardPresenter$cashtag$$inlined$map$1$2$1;
            int i22;
            CardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1 cardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1;
            int i23;
            CardWobbleState$wobbleFlow$$inlined$map$1$2$1 cardWobbleState$wobbleFlow$$inlined$map$1$2$1;
            int i24;
            GrantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1 grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1;
            int i25;
            GrantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1 grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1;
            int i26;
            CashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1 cashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1;
            int i27;
            CaptureCheckFacePresenter$special$$inlined$filter$1$2$1 captureCheckFacePresenter$special$$inlined$filter$1$2$1;
            int i28;
            ActivityRouter$route$2$invokeSuspend$$inlined$map$1$2$1 activityRouter$route$2$invokeSuspend$$inlined$map$1$2$1;
            int i29;
            LocalRouter$route$2$invokeSuspend$$inlined$filter$1$2$1 localRouter$route$2$invokeSuspend$$inlined$filter$1$2$1;
            int i30;
            int i31 = this.$r8$classId;
            int i32 = 0;
            FlowCollector flowCollector4 = this.$this_unsafeFlow;
            switch (i31) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i33 = anonymousClass1.label;
                        if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i33 - PKIFailureInfo.systemUnavail;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i == 0) {
                                if (i != 1) {
                                    if (i == 2) {
                                        SafeTrace.throwOnFailure(obj2);
                                        break;
                                    } else {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    }
                                } else {
                                    i32 = anonymousClass1.I$0;
                                    FlowCollector flowCollector5 = anonymousClass1.L$4;
                                    SafeTrace.throwOnFailure(obj2);
                                    flowCollector = flowCollector5;
                                }
                            } else {
                                SafeTrace.throwOnFailure(obj2);
                                anonymousClass1.L$4 = flowCollector4;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                DefaultScheduler defaultScheduler = Dispatchers.Default;
                                obj2 = JobKt.withContext(DefaultIoScheduler.INSTANCE, new EquatableBitmap$Companion$toEquatable$2((Bitmap) obj, r11, i32), anonymousClass1);
                                flowCollector = flowCollector4;
                                break;
                            }
                            anonymousClass1.L$4 = null;
                            anonymousClass1.I$0 = i32;
                            anonymousClass1.label = 2;
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i == 0) {
                    }
                    anonymousClass1.L$4 = null;
                    anonymousClass1.I$0 = i32;
                    anonymousClass1.label = 2;
                case 1:
                    if (continuation instanceof BugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1) {
                        bugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1 = (BugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1) continuation;
                        int i34 = bugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1.label;
                        if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                            bugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                            Object obj3 = bugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = bugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                if (((String) obj).length() > 20) {
                                    bugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector4.emit(obj, bugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1) == coroutineSingletons3) {
                                        break;
                                    }
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
                    bugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1 = new BugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1(this, continuation);
                    Object obj32 = bugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = bugReportingPresenter$models$lambda$45$$inlined$filter$1$2$1.label;
                    if (i2 != 0) {
                    }
                case 2:
                    if (continuation instanceof RealKybRestrictionManager$get$$inlined$filter$1$2$1) {
                        realKybRestrictionManager$get$$inlined$filter$1$2$1 = (RealKybRestrictionManager$get$$inlined$filter$1$2$1) continuation;
                        int i35 = realKybRestrictionManager$get$$inlined$filter$1$2$1.label;
                        if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                            realKybRestrictionManager$get$$inlined$filter$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                            Object obj4 = realKybRestrictionManager$get$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = realKybRestrictionManager$get$$inlined$filter$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                if (CanvasCompatO.isRatePlanBusiness((P2pSettingsManager$P2pSettings) obj)) {
                                    realKybRestrictionManager$get$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector4.emit(obj, realKybRestrictionManager$get$$inlined$filter$1$2$1) == coroutineSingletons4) {
                                        break;
                                    }
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
                    realKybRestrictionManager$get$$inlined$filter$1$2$1 = new RealKybRestrictionManager$get$$inlined$filter$1$2$1(this, continuation);
                    Object obj42 = realKybRestrictionManager$get$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = realKybRestrictionManager$get$$inlined$filter$1$2$1.label;
                    if (i3 != 0) {
                    }
                case 3:
                    if (continuation instanceof CardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        cardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1 = (CardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i36 = cardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                            cardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                            Object obj5 = cardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = cardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                if (((Lifecycle.Event) obj) == Lifecycle.Event.ON_RESUME) {
                                    cardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector4.emit(obj, cardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons5) {
                                        break;
                                    }
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
                    cardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1 = new CardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj52 = cardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = cardModelView$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i4 != 0) {
                    }
                case 4:
                    if (continuation instanceof CardModelView$1$2$invokeSuspend$$inlined$map$1$2$1) {
                        cardModelView$1$2$invokeSuspend$$inlined$map$1$2$1 = (CardModelView$1$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i37 = cardModelView$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                            cardModelView$1$2$invokeSuspend$$inlined$map$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                            Object obj6 = cardModelView$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = cardModelView$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj6);
                                CardModelView.ViewModel viewModel = (CardModelView.ViewModel) obj;
                                Pair pair = new Pair(viewModel.contouredText, Boolean.valueOf(viewModel.isCardLocked));
                                cardModelView$1$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(pair, cardModelView$1$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons6) {
                                    break;
                                }
                            } else if (i5 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj6);
                            }
                            break;
                        }
                    }
                    cardModelView$1$2$invokeSuspend$$inlined$map$1$2$1 = new CardModelView$1$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj62 = cardModelView$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = cardModelView$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i5 != 0) {
                    }
                case 5:
                    if (continuation instanceof CardModelView$cardAlbedo$$inlined$map$1$2$1) {
                        cardModelView$cardAlbedo$$inlined$map$1$2$1 = (CardModelView$cardAlbedo$$inlined$map$1$2$1) continuation;
                        int i38 = cardModelView$cardAlbedo$$inlined$map$1$2$1.label;
                        if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                            cardModelView$cardAlbedo$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                            Object obj7 = cardModelView$cardAlbedo$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = cardModelView$cardAlbedo$$inlined$map$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj7);
                                CardModelView.ViewModel viewModel2 = (CardModelView.ViewModel) obj;
                                CardTheme.Identifier identifier = viewModel2.id;
                                Integer num = new Integer(viewModel2.color);
                                CardTheme.BackgroundImage backgroundImage = viewModel2.backgroundImage;
                                Integer num2 = new Integer(viewModel2.backInkColor);
                                Integer num3 = new Integer(viewModel2.magStripColor);
                                Paint paint = CardModelView.REMOVE_PAINT;
                                Septuple septuple = new Septuple(identifier, num, backgroundImage, num2, num3, CardModelView.Companion.toCardBack(viewModel2), new Float(viewModel2.opacity));
                                cardModelView$cardAlbedo$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(septuple, cardModelView$cardAlbedo$$inlined$map$1$2$1) == coroutineSingletons7) {
                                    break;
                                }
                            } else if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj7);
                            }
                            break;
                        }
                    }
                    cardModelView$cardAlbedo$$inlined$map$1$2$1 = new CardModelView$cardAlbedo$$inlined$map$1$2$1(this, continuation);
                    Object obj72 = cardModelView$cardAlbedo$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = cardModelView$cardAlbedo$$inlined$map$1$2$1.label;
                    if (i6 != 0) {
                    }
                case 6:
                    if (continuation instanceof CardModelView$cardHeatSample$$inlined$map$1$2$1) {
                        cardModelView$cardHeatSample$$inlined$map$1$2$1 = (CardModelView$cardHeatSample$$inlined$map$1$2$1) continuation;
                        int i39 = cardModelView$cardHeatSample$$inlined$map$1$2$1.label;
                        if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                            cardModelView$cardHeatSample$$inlined$map$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                            Object obj8 = cardModelView$cardHeatSample$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = cardModelView$cardHeatSample$$inlined$map$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj8);
                                CardTheme.BackgroundImage backgroundImage2 = ((CardModelView.ViewModel) obj).backgroundImage;
                                cardModelView$cardHeatSample$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(backgroundImage2, cardModelView$cardHeatSample$$inlined$map$1$2$1) == coroutineSingletons8) {
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
                    cardModelView$cardHeatSample$$inlined$map$1$2$1 = new CardModelView$cardHeatSample$$inlined$map$1$2$1(this, continuation);
                    Object obj82 = cardModelView$cardHeatSample$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = cardModelView$cardHeatSample$$inlined$map$1$2$1.label;
                    if (i7 != 0) {
                    }
                case 7:
                    if (continuation instanceof CardModelView$cardHoloSamples$$inlined$map$1$2$1) {
                        cardModelView$cardHoloSamples$$inlined$map$1$2$1 = (CardModelView$cardHoloSamples$$inlined$map$1$2$1) continuation;
                        int i40 = cardModelView$cardHoloSamples$$inlined$map$1$2$1.label;
                        if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                            cardModelView$cardHoloSamples$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                            Object obj9 = cardModelView$cardHoloSamples$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = cardModelView$cardHoloSamples$$inlined$map$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj9);
                                CardTheme.Identifier identifier2 = ((CardModelView.ViewModel) obj).id;
                                cardModelView$cardHoloSamples$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(identifier2, cardModelView$cardHoloSamples$$inlined$map$1$2$1) == coroutineSingletons9) {
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
                    cardModelView$cardHoloSamples$$inlined$map$1$2$1 = new CardModelView$cardHoloSamples$$inlined$map$1$2$1(this, continuation);
                    Object obj92 = cardModelView$cardHoloSamples$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = cardModelView$cardHoloSamples$$inlined$map$1$2$1.label;
                    if (i8 != 0) {
                    }
                case 8:
                    if (continuation instanceof CardModelView$cardNormal$$inlined$map$1$2$1) {
                        cardModelView$cardNormal$$inlined$map$1$2$1 = (CardModelView$cardNormal$$inlined$map$1$2$1) continuation;
                        int i41 = cardModelView$cardNormal$$inlined$map$1$2$1.label;
                        if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                            cardModelView$cardNormal$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                            Object obj10 = cardModelView$cardNormal$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = cardModelView$cardNormal$$inlined$map$1$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj10);
                                CardTheme.BackgroundImage backgroundImage3 = ((CardModelView.ViewModel) obj).backgroundImage;
                                cardModelView$cardNormal$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(backgroundImage3, cardModelView$cardNormal$$inlined$map$1$2$1) == coroutineSingletons10) {
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
                    cardModelView$cardNormal$$inlined$map$1$2$1 = new CardModelView$cardNormal$$inlined$map$1$2$1(this, continuation);
                    Object obj102 = cardModelView$cardNormal$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = cardModelView$cardNormal$$inlined$map$1$2$1.label;
                    if (i9 != 0) {
                    }
                case 9:
                    if (continuation instanceof CardModelView$colorGradient$$inlined$map$1$2$1) {
                        cardModelView$colorGradient$$inlined$map$1$2$1 = (CardModelView$colorGradient$$inlined$map$1$2$1) continuation;
                        int i42 = cardModelView$colorGradient$$inlined$map$1$2$1.label;
                        if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                            cardModelView$colorGradient$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                            Object obj11 = cardModelView$colorGradient$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = cardModelView$colorGradient$$inlined$map$1$2$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj11);
                                CardModelView.ViewModel viewModel3 = (CardModelView.ViewModel) obj;
                                Triple triple = new Triple(new Float(viewModel3.vibrance), new Float(viewModel3.contrast), new Float(viewModel3.saturation));
                                cardModelView$colorGradient$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(triple, cardModelView$colorGradient$$inlined$map$1$2$1) == coroutineSingletons11) {
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
                    cardModelView$colorGradient$$inlined$map$1$2$1 = new CardModelView$colorGradient$$inlined$map$1$2$1(this, continuation);
                    Object obj112 = cardModelView$colorGradient$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = cardModelView$colorGradient$$inlined$map$1$2$1.label;
                    if (i10 != 0) {
                    }
                case 10:
                    if (continuation instanceof CardModelView$contouredTextTexture$$inlined$map$1$2$1) {
                        cardModelView$contouredTextTexture$$inlined$map$1$2$1 = (CardModelView$contouredTextTexture$$inlined$map$1$2$1) continuation;
                        int i43 = cardModelView$contouredTextTexture$$inlined$map$1$2$1.label;
                        if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                            cardModelView$contouredTextTexture$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                            Object obj12 = cardModelView$contouredTextTexture$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = cardModelView$contouredTextTexture$$inlined$map$1$2$1.label;
                            if (i11 != 0) {
                                SafeTrace.throwOnFailure(obj12);
                                CardContouredText cardContouredText = ((CardModelView.ViewModel) obj).contouredText;
                                cardModelView$contouredTextTexture$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(cardContouredText, cardModelView$contouredTextTexture$$inlined$map$1$2$1) == coroutineSingletons12) {
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
                    cardModelView$contouredTextTexture$$inlined$map$1$2$1 = new CardModelView$contouredTextTexture$$inlined$map$1$2$1(this, continuation);
                    Object obj122 = cardModelView$contouredTextTexture$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = cardModelView$contouredTextTexture$$inlined$map$1$2$1.label;
                    if (i11 != 0) {
                    }
                case 11:
                    if (continuation instanceof CardModelView$copyPanTexture$$inlined$map$1$2$1) {
                        cardModelView$copyPanTexture$$inlined$map$1$2$1 = (CardModelView$copyPanTexture$$inlined$map$1$2$1) continuation;
                        int i44 = cardModelView$copyPanTexture$$inlined$map$1$2$1.label;
                        if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                            cardModelView$copyPanTexture$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                            Object obj13 = cardModelView$copyPanTexture$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i12 = cardModelView$copyPanTexture$$inlined$map$1$2$1.label;
                            if (i12 != 0) {
                                SafeTrace.throwOnFailure(obj13);
                                CardModelView.ViewModel viewModel4 = (CardModelView.ViewModel) obj;
                                CardModelView.CardBack cardBack = new CardModelView.CardBack(viewModel4.cardHolderName, viewModel4.cardNumber, viewModel4.cardCVV, viewModel4.cardExpiration, viewModel4.font, viewModel4.paymentMethod, viewModel4.withRealCard);
                                cardModelView$copyPanTexture$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(cardBack, cardModelView$copyPanTexture$$inlined$map$1$2$1) == coroutineSingletons13) {
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
                    cardModelView$copyPanTexture$$inlined$map$1$2$1 = new CardModelView$copyPanTexture$$inlined$map$1$2$1(this, continuation);
                    Object obj132 = cardModelView$copyPanTexture$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i12 = cardModelView$copyPanTexture$$inlined$map$1$2$1.label;
                    if (i12 != 0) {
                    }
                case 12:
                    if (continuation instanceof CardModelView$getActiveHeat$$inlined$map$1$2$1) {
                        cardModelView$getActiveHeat$$inlined$map$1$2$1 = (CardModelView$getActiveHeat$$inlined$map$1$2$1) continuation;
                        int i45 = cardModelView$getActiveHeat$$inlined$map$1$2$1.label;
                        if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                            cardModelView$getActiveHeat$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                            Object obj14 = cardModelView$getActiveHeat$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i13 = cardModelView$getActiveHeat$$inlined$map$1$2$1.label;
                            if (i13 != 0) {
                                SafeTrace.throwOnFailure(obj14);
                                CardTheme.BackgroundImage backgroundImage4 = ((CardModelView.ViewModel) obj).backgroundImage;
                                cardModelView$getActiveHeat$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(backgroundImage4, cardModelView$getActiveHeat$$inlined$map$1$2$1) == coroutineSingletons14) {
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
                    cardModelView$getActiveHeat$$inlined$map$1$2$1 = new CardModelView$getActiveHeat$$inlined$map$1$2$1(this, continuation);
                    Object obj142 = cardModelView$getActiveHeat$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i13 = cardModelView$getActiveHeat$$inlined$map$1$2$1.label;
                    if (i13 != 0) {
                    }
                case 13:
                    if (continuation instanceof CardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1) {
                        cardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1 = (CardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i46 = cardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                            cardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                            Object obj15 = cardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i14 = cardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i14 != 0) {
                                SafeTrace.throwOnFailure(obj15);
                                cardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(null, cardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons15) {
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
                    cardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1 = new CardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj152 = cardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i14 = cardModelView$getActiveHeat$2$coolingStream$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i14 != 0) {
                    }
                case 14:
                    if (continuation instanceof CardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1) {
                        cardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1 = (CardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1) continuation;
                        int i47 = cardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1.label;
                        if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                            cardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                            Object obj16 = cardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i15 = cardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1.label;
                            if (i15 != 0) {
                                SafeTrace.throwOnFailure(obj16);
                                cardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(null, cardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1) == coroutineSingletons16) {
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
                    cardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1 = new CardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1(this, continuation);
                    Object obj162 = cardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i15 = cardModelView$getActiveHeat$lambda$1$0$$inlined$map$1$2$1.label;
                    if (i15 != 0) {
                    }
                case 15:
                    if (continuation instanceof CardModelView$iconTexture$$inlined$map$1$2$1) {
                        cardModelView$iconTexture$$inlined$map$1$2$1 = (CardModelView$iconTexture$$inlined$map$1$2$1) continuation;
                        int i48 = cardModelView$iconTexture$$inlined$map$1$2$1.label;
                        if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                            cardModelView$iconTexture$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                            Object obj17 = cardModelView$iconTexture$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i16 = cardModelView$iconTexture$$inlined$map$1$2$1.label;
                            if (i16 == 0) {
                                if (i16 != 1) {
                                    if (i16 == 2) {
                                        SafeTrace.throwOnFailure(obj17);
                                        break;
                                    } else {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    }
                                } else {
                                    i32 = cardModelView$iconTexture$$inlined$map$1$2$1.I$0;
                                    FlowCollector flowCollector6 = cardModelView$iconTexture$$inlined$map$1$2$1.L$4;
                                    SafeTrace.throwOnFailure(obj17);
                                    flowCollector3 = flowCollector6;
                                }
                            } else {
                                SafeTrace.throwOnFailure(obj17);
                                Bitmap bitmap = (Bitmap) obj;
                                if (bitmap != null) {
                                    cardModelView$iconTexture$$inlined$map$1$2$1.L$4 = flowCollector4;
                                    cardModelView$iconTexture$$inlined$map$1$2$1.I$0 = 0;
                                    cardModelView$iconTexture$$inlined$map$1$2$1.label = 1;
                                    DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                                    obj17 = JobKt.withContext(DefaultIoScheduler.INSTANCE, new EquatableBitmap$Companion$toEquatable$2(bitmap, r11, i32), cardModelView$iconTexture$$inlined$map$1$2$1);
                                    flowCollector3 = flowCollector4;
                                    break;
                                } else {
                                    equatableBitmap = null;
                                    flowCollector2 = flowCollector4;
                                    cardModelView$iconTexture$$inlined$map$1$2$1.L$4 = null;
                                    cardModelView$iconTexture$$inlined$map$1$2$1.I$0 = i32;
                                    cardModelView$iconTexture$$inlined$map$1$2$1.label = 2;
                                    break;
                                }
                            }
                            equatableBitmap = (EquatableBitmap) obj17;
                            flowCollector2 = flowCollector3;
                            cardModelView$iconTexture$$inlined$map$1$2$1.L$4 = null;
                            cardModelView$iconTexture$$inlined$map$1$2$1.I$0 = i32;
                            cardModelView$iconTexture$$inlined$map$1$2$1.label = 2;
                        }
                    }
                    cardModelView$iconTexture$$inlined$map$1$2$1 = new CardModelView$iconTexture$$inlined$map$1$2$1(this, continuation);
                    Object obj172 = cardModelView$iconTexture$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i16 = cardModelView$iconTexture$$inlined$map$1$2$1.label;
                    if (i16 == 0) {
                    }
                    equatableBitmap = (EquatableBitmap) obj172;
                    flowCollector2 = flowCollector3;
                    cardModelView$iconTexture$$inlined$map$1$2$1.L$4 = null;
                    cardModelView$iconTexture$$inlined$map$1$2$1.I$0 = i32;
                    cardModelView$iconTexture$$inlined$map$1$2$1.label = 2;
                case 16:
                    if (continuation instanceof CardModelView$lighting$$inlined$map$1$2$1) {
                        cardModelView$lighting$$inlined$map$1$2$1 = (CardModelView$lighting$$inlined$map$1$2$1) continuation;
                        int i49 = cardModelView$lighting$$inlined$map$1$2$1.label;
                        if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                            cardModelView$lighting$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                            Object obj18 = cardModelView$lighting$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i17 = cardModelView$lighting$$inlined$map$1$2$1.label;
                            if (i17 != 0) {
                                SafeTrace.throwOnFailure(obj18);
                                CardModelView.ViewModel viewModel5 = (CardModelView.ViewModel) obj;
                                Quadruple quadruple = new Quadruple(viewModel5.environment, new Float(viewModel5.indirectLightIntensity), Boolean.FALSE, viewModel5.backgroundImage);
                                cardModelView$lighting$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(quadruple, cardModelView$lighting$$inlined$map$1$2$1) == coroutineSingletons18) {
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
                    cardModelView$lighting$$inlined$map$1$2$1 = new CardModelView$lighting$$inlined$map$1$2$1(this, continuation);
                    Object obj182 = cardModelView$lighting$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i17 = cardModelView$lighting$$inlined$map$1$2$1.label;
                    if (i17 != 0) {
                    }
                case 17:
                    if (continuation instanceof CardPreviewPresenter$cashtag$$inlined$map$1$2$1) {
                        cardPreviewPresenter$cashtag$$inlined$map$1$2$1 = (CardPreviewPresenter$cashtag$$inlined$map$1$2$1) continuation;
                        int i50 = cardPreviewPresenter$cashtag$$inlined$map$1$2$1.label;
                        if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                            cardPreviewPresenter$cashtag$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                            Object obj19 = cardPreviewPresenter$cashtag$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i18 = cardPreviewPresenter$cashtag$$inlined$map$1$2$1.label;
                            if (i18 != 0) {
                                SafeTrace.throwOnFailure(obj19);
                                FullCashtag fullCashtag = ((PublicProfile) obj).fullCashtag;
                                r11 = fullCashtag != null ? FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag) : 0;
                                str = r11 != 0 ? r11 : "";
                                cardPreviewPresenter$cashtag$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(str, cardPreviewPresenter$cashtag$$inlined$map$1$2$1) == coroutineSingletons19) {
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
                    cardPreviewPresenter$cashtag$$inlined$map$1$2$1 = new CardPreviewPresenter$cashtag$$inlined$map$1$2$1(this, continuation);
                    Object obj192 = cardPreviewPresenter$cashtag$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i18 = cardPreviewPresenter$cashtag$$inlined$map$1$2$1.label;
                    if (i18 != 0) {
                    }
                case 18:
                    if (continuation instanceof CardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1) {
                        cardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1 = (CardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i51 = cardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                            cardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                            Object obj20 = cardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i19 = cardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i19 != 0) {
                                SafeTrace.throwOnFailure(obj20);
                                CardStudio cardStudio = (CardStudio) obj;
                                CardStylePickerPresenter.CardCustomization cardCustomization = new CardStylePickerPresenter.CardCustomization(cardStudio.cashtag_enabled, cardStudio.touch_data);
                                cardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(cardCustomization, cardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons20) {
                                    break;
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
                    cardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1 = new CardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj202 = cardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i19 = cardStylePickerPresenter$cardCustomizations$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i19 != 0) {
                    }
                case 19:
                    if (continuation instanceof CardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1) {
                        cardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1 = (CardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i52 = cardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                            cardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                            Object obj21 = cardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i20 = cardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i20 != 0) {
                                SafeTrace.throwOnFailure(obj21);
                                FullCashtag fullCashtag2 = ((PublicProfile) obj).fullCashtag;
                                String cashtagWithCurrencySymbol = fullCashtag2 != null ? FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag2) : null;
                                str = cashtagWithCurrencySymbol != null ? cashtagWithCurrencySymbol : "";
                                cardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(str, cardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons21) {
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
                    cardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1 = new CardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj212 = cardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i20 = cardStylePickerPresenter$profileCashtag$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i20 != 0) {
                    }
                case 20:
                    if (continuation instanceof CardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1) {
                        cardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1 = (CardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i53 = cardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                            cardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                            Object obj23 = cardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i21 = cardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i21 != 0) {
                                SafeTrace.throwOnFailure(obj23);
                                if (((Boolean) obj).booleanValue()) {
                                    cardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector4.emit(obj, cardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons22) {
                                        break;
                                    }
                                }
                            } else if (i21 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj23);
                            }
                            break;
                        }
                    }
                    cardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1 = new CardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj232 = cardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i21 = cardStylePickerViewKt$CardStylePicker$1$1$1$6$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i21 != 0) {
                    }
                case 21:
                    if (continuation instanceof RealStyledCardPresenter$cashtag$$inlined$map$1$2$1) {
                        realStyledCardPresenter$cashtag$$inlined$map$1$2$1 = (RealStyledCardPresenter$cashtag$$inlined$map$1$2$1) continuation;
                        int i54 = realStyledCardPresenter$cashtag$$inlined$map$1$2$1.label;
                        if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                            realStyledCardPresenter$cashtag$$inlined$map$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                            Object obj24 = realStyledCardPresenter$cashtag$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i22 = realStyledCardPresenter$cashtag$$inlined$map$1$2$1.label;
                            if (i22 != 0) {
                                SafeTrace.throwOnFailure(obj24);
                                FullCashtag fullCashtag3 = ((PublicProfile) obj).fullCashtag;
                                String cashtagWithCurrencySymbol2 = fullCashtag3 != null ? FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag3) : null;
                                str = cashtagWithCurrencySymbol2 != null ? cashtagWithCurrencySymbol2 : "";
                                realStyledCardPresenter$cashtag$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(str, realStyledCardPresenter$cashtag$$inlined$map$1$2$1) == coroutineSingletons23) {
                                    break;
                                }
                            } else if (i22 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj24);
                            }
                            break;
                        }
                    }
                    realStyledCardPresenter$cashtag$$inlined$map$1$2$1 = new RealStyledCardPresenter$cashtag$$inlined$map$1$2$1(this, continuation);
                    Object obj242 = realStyledCardPresenter$cashtag$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i22 = realStyledCardPresenter$cashtag$$inlined$map$1$2$1.label;
                    if (i22 != 0) {
                    }
                case 22:
                    if (continuation instanceof CardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1) {
                        cardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1 = (CardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1) continuation;
                        int i55 = cardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1.label;
                        if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                            cardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                            Object obj25 = cardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i23 = cardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1.label;
                            if (i23 != 0) {
                                SafeTrace.throwOnFailure(obj25);
                                Offset offset = (Offset) obj;
                                if (offset != null) {
                                    cardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector4.emit(offset, cardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons24) {
                                        break;
                                    }
                                }
                            } else if (i23 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj25);
                            }
                            break;
                        }
                    }
                    cardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1 = new CardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj252 = cardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i23 = cardSceneEffectKt$rotateDragFlow$$inlined$mapNotNull$1$2$1.label;
                    if (i23 != 0) {
                    }
                case 23:
                    if (continuation instanceof CardWobbleState$wobbleFlow$$inlined$map$1$2$1) {
                        cardWobbleState$wobbleFlow$$inlined$map$1$2$1 = (CardWobbleState$wobbleFlow$$inlined$map$1$2$1) continuation;
                        int i56 = cardWobbleState$wobbleFlow$$inlined$map$1$2$1.label;
                        if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                            cardWobbleState$wobbleFlow$$inlined$map$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                            Object obj26 = cardWobbleState$wobbleFlow$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i24 = cardWobbleState$wobbleFlow$$inlined$map$1$2$1.label;
                            if (i24 != 0) {
                                SafeTrace.throwOnFailure(obj26);
                                Triple triple2 = (Triple) obj;
                                Pair pair2 = new Pair(new Quat(new float[]{((Number) triple2.first).floatValue(), ((Number) triple2.second).floatValue(), RecyclerView.DECELERATION_RATE}), (Vector4) triple2.third);
                                cardWobbleState$wobbleFlow$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(pair2, cardWobbleState$wobbleFlow$$inlined$map$1$2$1) == coroutineSingletons25) {
                                    break;
                                }
                            } else if (i24 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj26);
                            }
                            break;
                        }
                    }
                    cardWobbleState$wobbleFlow$$inlined$map$1$2$1 = new CardWobbleState$wobbleFlow$$inlined$map$1$2$1(this, continuation);
                    Object obj262 = cardWobbleState$wobbleFlow$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i24 = cardWobbleState$wobbleFlow$$inlined$map$1$2$1.label;
                    if (i24 != 0) {
                    }
                case 24:
                    if (continuation instanceof GrantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1) {
                        grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1 = (GrantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i57 = grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                            grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                            Object obj27 = grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i25 = grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i25 != 0) {
                                SafeTrace.throwOnFailure(obj27);
                                if (((ActivityEvent) obj) == ActivityEvent.PAUSE) {
                                    grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector4.emit(obj, grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons26) {
                                        break;
                                    }
                                }
                            } else if (i25 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj27);
                            }
                            break;
                        }
                    }
                    grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1 = new GrantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj272 = grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i25 = grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i25 != 0) {
                    }
                case 25:
                    if (continuation instanceof GrantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1) {
                        grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1 = (GrantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i58 = grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                            grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                            Object obj28 = grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i26 = grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i26 != 0) {
                                SafeTrace.throwOnFailure(obj28);
                                Boolean bool = Boolean.TRUE;
                                grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(bool, grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons27) {
                                    break;
                                }
                            } else if (i26 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj28);
                            }
                            break;
                        }
                    }
                    grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1 = new GrantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj282 = grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i26 = grantPresenter$models$activityWasPaused$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i26 != 0) {
                    }
                case 26:
                    if (continuation instanceof CashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1) {
                        cashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1 = (CashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1) continuation;
                        int i59 = cashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1.label;
                        if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                            cashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                            Object obj29 = cashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1.result;
                            CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i27 = cashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1.label;
                            if (i27 != 0) {
                                SafeTrace.throwOnFailure(obj29);
                                List<MerchantsWithBusinessGrants> list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                for (MerchantsWithBusinessGrants merchantsWithBusinessGrants : list) {
                                    String str2 = merchantsWithBusinessGrants.business_grant_id;
                                    Image image = merchantsWithBusinessGrants.photo;
                                    String str3 = merchantsWithBusinessGrants.customer_display_name;
                                    str3.getClass();
                                    SyncBusinessGrant.ActionType actionType = merchantsWithBusinessGrants.action_type;
                                    actionType.getClass();
                                    arrayList.add(new CashAppPaySettingsRowViewModel$BusinessViewModel(str2, image, str3, actionType, merchantsWithBusinessGrants.rendering_behavior));
                                }
                                cashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1.label = 1;
                                if (flowCollector4.emit(arrayList, cashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1) == coroutineSingletons28) {
                                    break;
                                }
                            } else if (i27 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj29);
                            }
                            break;
                        }
                    }
                    cashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1 = new CashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1(this, continuation);
                    Object obj292 = cashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1.result;
                    CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i27 = cashAppPaySettingsPresenter$models$lambda$3$$inlined$mapItems$1$2$1.label;
                    if (i27 != 0) {
                    }
                case 27:
                    if (continuation instanceof CaptureCheckFacePresenter$special$$inlined$filter$1$2$1) {
                        captureCheckFacePresenter$special$$inlined$filter$1$2$1 = (CaptureCheckFacePresenter$special$$inlined$filter$1$2$1) continuation;
                        int i60 = captureCheckFacePresenter$special$$inlined$filter$1$2$1.label;
                        if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                            captureCheckFacePresenter$special$$inlined$filter$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                            Object obj30 = captureCheckFacePresenter$special$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i28 = captureCheckFacePresenter$special$$inlined$filter$1$2$1.label;
                            if (i28 != 0) {
                                SafeTrace.throwOnFailure(obj30);
                                if (Intrinsics.areEqual((String) obj, "android.permission.CAMERA")) {
                                    captureCheckFacePresenter$special$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector4.emit(obj, captureCheckFacePresenter$special$$inlined$filter$1$2$1) == coroutineSingletons29) {
                                        break;
                                    }
                                }
                            } else if (i28 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj30);
                            }
                            break;
                        }
                    }
                    captureCheckFacePresenter$special$$inlined$filter$1$2$1 = new CaptureCheckFacePresenter$special$$inlined$filter$1$2$1(this, continuation);
                    Object obj302 = captureCheckFacePresenter$special$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i28 = captureCheckFacePresenter$special$$inlined$filter$1$2$1.label;
                    if (i28 != 0) {
                    }
                case 28:
                    if (continuation instanceof ActivityRouter$route$2$invokeSuspend$$inlined$map$1$2$1) {
                        activityRouter$route$2$invokeSuspend$$inlined$map$1$2$1 = (ActivityRouter$route$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i61 = activityRouter$route$2$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                            activityRouter$route$2$invokeSuspend$$inlined$map$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                            Object obj31 = activityRouter$route$2$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i29 = activityRouter$route$2$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i29 != 0) {
                                SafeTrace.throwOnFailure(obj31);
                                LoyaltyMerchant loyaltyMerchant = (LoyaltyMerchant) obj;
                                String str4 = loyaltyMerchant != null ? loyaltyMerchant.cash_merchant_token : null;
                                activityRouter$route$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector4.emit(str4, activityRouter$route$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons30) {
                                    break;
                                }
                            } else if (i29 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj31);
                            }
                            break;
                        }
                    }
                    activityRouter$route$2$invokeSuspend$$inlined$map$1$2$1 = new ActivityRouter$route$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj312 = activityRouter$route$2$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i29 = activityRouter$route$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i29 != 0) {
                    }
                default:
                    if (continuation instanceof LocalRouter$route$2$invokeSuspend$$inlined$filter$1$2$1) {
                        localRouter$route$2$invokeSuspend$$inlined$filter$1$2$1 = (LocalRouter$route$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i62 = localRouter$route$2$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i62 & PKIFailureInfo.systemUnavail) != 0) {
                            localRouter$route$2$invokeSuspend$$inlined$filter$1$2$1.label = i62 - PKIFailureInfo.systemUnavail;
                            Object obj33 = localRouter$route$2$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i30 = localRouter$route$2$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i30 != 0) {
                                SafeTrace.throwOnFailure(obj33);
                                if (((Boolean) obj).booleanValue()) {
                                    localRouter$route$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector4.emit(obj, localRouter$route$2$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons31) {
                                        break;
                                    }
                                }
                            } else if (i30 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj33);
                            }
                            break;
                        }
                    }
                    localRouter$route$2$invokeSuspend$$inlined$filter$1$2$1 = new LocalRouter$route$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj332 = localRouter$route$2$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i30 = localRouter$route$2$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i30 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CardModelView$cardHeat$$inlined$map$1(ChannelFlowTransformLatest channelFlowTransformLatest, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = channelFlowTransformLatest;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 14;
        int i3 = 18;
        int i4 = 11;
        int i5 = 12;
        int i6 = 17;
        int i7 = 0;
        ChannelFlowTransformLatest channelFlowTransformLatest = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = channelFlowTransformLatest.collect(new AnonymousClass2(flowCollector, i7), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = channelFlowTransformLatest.collect(new SwipeableState$special$$inlined$filter$1.AnonymousClass2(flowCollector, 10), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = channelFlowTransformLatest.collect(new SwipeableState$special$$inlined$filter$1.AnonymousClass2(flowCollector, i2), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = channelFlowTransformLatest.collect(new SwipeableState$special$$inlined$filter$1.AnonymousClass2(flowCollector, 25), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = channelFlowTransformLatest.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(flowCollector, i5), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = channelFlowTransformLatest.collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, 8), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = channelFlowTransformLatest.collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, i4), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = channelFlowTransformLatest.collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, 16), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = channelFlowTransformLatest.collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, i6), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = channelFlowTransformLatest.collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, 22), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = channelFlowTransformLatest.collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, 29), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = channelFlowTransformLatest.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, i2), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = channelFlowTransformLatest.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, 15), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect14 = channelFlowTransformLatest.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, i6), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect15 = channelFlowTransformLatest.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, i3), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect16 = channelFlowTransformLatest.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, 19), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect17 = channelFlowTransformLatest.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, 24), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect18 = channelFlowTransformLatest.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, 26), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object collect19 = channelFlowTransformLatest.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, 27), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect20 = channelFlowTransformLatest.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, i7), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object collect21 = channelFlowTransformLatest.collect(new AnonymousClass2(flowCollector, 21), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object collect22 = channelFlowTransformLatest.collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, i6), continuation);
                if (collect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object collect23 = channelFlowTransformLatest.collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, i3), continuation);
                if (collect23 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object collect24 = channelFlowTransformLatest.collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, i7), continuation);
                if (collect24 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object collect25 = channelFlowTransformLatest.collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, 3), continuation);
                if (collect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object collect26 = channelFlowTransformLatest.collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, 4), continuation);
                if (collect26 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object collect27 = channelFlowTransformLatest.collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, 7), continuation);
                if (collect27 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object collect28 = channelFlowTransformLatest.collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, i4), continuation);
                if (collect28 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object collect29 = channelFlowTransformLatest.collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, i5), continuation);
                if (collect29 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect30 = channelFlowTransformLatest.collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, 13), continuation);
                if (collect30 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
