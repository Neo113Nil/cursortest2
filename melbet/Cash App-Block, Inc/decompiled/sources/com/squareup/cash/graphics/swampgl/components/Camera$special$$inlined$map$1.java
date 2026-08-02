package com.squareup.cash.graphics.swampgl.components;

import android.database.Cursor;
import androidx.lifecycle.Lifecycle;
import app.cash.broadway.screen.Screen;
import app.cash.copper.ContentResolverQuery;
import app.cash.history.screens.HistoryScreens;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.maps.android.compose.MapComposeViewRenderKt;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.core.navigationcontainer.PaymentActionResult;
import com.squareup.cash.data.db.InvitationConfig;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db.contacts.RecipientUtil;
import com.squareup.cash.db2.activity.ActivityRecipient;
import com.squareup.cash.db2.entities.ForExternalId;
import com.squareup.cash.db2.payment.PendingPayment;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.graphics.views.AnimationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.graphics.views.effect.SwampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.history.backend.api.StockActivity;
import com.squareup.cash.history.backend.real.RealInvestingActivitiesManager;
import com.squareup.cash.history.backend.real.RealInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1;
import com.squareup.cash.history.backend.real.RealLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1;
import com.squareup.cash.history.navigation.PaymentActionHandler$confirmPayment$$inlined$map$1$2$1;
import com.squareup.cash.history.navigation.PaymentActionHandler$linkCard$$inlined$map$1$2$1;
import com.squareup.cash.history.navigation.PaymentActionHandler$passcode$$inlined$map$1$2$1;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$$inlined$filter$1$2$1;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$$inlined$filter$2$2$1;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1;
import com.squareup.cash.history.presenters.CancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1;
import com.squareup.cash.history.presenters.CheckStatusPresenter$models$lambda$3$$inlined$map$1$2$1;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter$collect$$inlined$map$1$2$1;
import com.squareup.cash.history.viewmodels.ActivityInviteViewModel;
import com.squareup.cash.initialscreenloader.presenters.InitialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.initialscreenloader.viewmodels.InitialScreenPlaceholderViewEvent;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager$select$$inlined$map$1$2$1;
import com.squareup.cash.instruments.presenters.SelectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1;
import com.squareup.cash.instruments.presenters.SelectPaymentInstrumentPresenter$initialModel$Config;
import com.squareup.cash.integration.contacts.RealContactBook;
import com.squareup.cash.integration.contacts.RealContactBook$latestRowId$$inlined$map$1$2$1;
import com.squareup.cash.integration.contacts.RealContactBook$latestRowId$$inlined$map$2$2$1;
import com.squareup.cash.integration.contacts.RealContactBook$special$$inlined$map$1$2$1;
import com.squareup.cash.integration.contacts.RealContactBook$special$$inlined$map$2$2$1;
import com.squareup.cash.integration.contacts.RealContactBook$special$$inlined$map$3$2$1;
import com.squareup.cash.integration.contacts.RealContactBookKt$maybeGetLong$1;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1;
import com.squareup.cash.limits.presenters.LimitsPresenter$models$lambda$2$$inlined$map$1$2;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$filter$1$2;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.UiPayment;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class Camera$special$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChannelFlowBuilder $this_unsafeTransform$inlined;

    /* renamed from: com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1$2$1, reason: invalid class name */
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:108:0x016e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0152 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x0271  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x027b  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x02b1  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x02bb  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x02f4  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x02fe  */
        /* JADX WARN: Removed duplicated region for block: B:247:0x0339  */
        /* JADX WARN: Removed duplicated region for block: B:253:0x0343  */
        /* JADX WARN: Removed duplicated region for block: B:268:0x0377  */
        /* JADX WARN: Removed duplicated region for block: B:274:0x0381  */
        /* JADX WARN: Removed duplicated region for block: B:288:0x03b8  */
        /* JADX WARN: Removed duplicated region for block: B:294:0x03c2  */
        /* JADX WARN: Removed duplicated region for block: B:308:0x03f4  */
        /* JADX WARN: Removed duplicated region for block: B:314:0x03fe  */
        /* JADX WARN: Removed duplicated region for block: B:328:0x0435  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:334:0x043f  */
        /* JADX WARN: Removed duplicated region for block: B:350:0x047c  */
        /* JADX WARN: Removed duplicated region for block: B:356:0x0486  */
        /* JADX WARN: Removed duplicated region for block: B:368:0x04bb  */
        /* JADX WARN: Removed duplicated region for block: B:374:0x04c5  */
        /* JADX WARN: Removed duplicated region for block: B:386:0x04fa  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:392:0x0504  */
        /* JADX WARN: Removed duplicated region for block: B:407:0x053b  */
        /* JADX WARN: Removed duplicated region for block: B:413:0x0545  */
        /* JADX WARN: Removed duplicated region for block: B:425:0x0579  */
        /* JADX WARN: Removed duplicated region for block: B:431:0x0585  */
        /* JADX WARN: Removed duplicated region for block: B:462:0x0628 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:466:0x05d8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:500:0x0659  */
        /* JADX WARN: Removed duplicated region for block: B:506:0x0663  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:520:0x069e  */
        /* JADX WARN: Removed duplicated region for block: B:526:0x06a8  */
        /* JADX WARN: Removed duplicated region for block: B:540:0x06df  */
        /* JADX WARN: Removed duplicated region for block: B:546:0x06e9  */
        /* JADX WARN: Removed duplicated region for block: B:558:0x071e  */
        /* JADX WARN: Removed duplicated region for block: B:564:0x0728  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:576:0x075d  */
        /* JADX WARN: Removed duplicated region for block: B:582:0x0767  */
        /* JADX WARN: Removed duplicated region for block: B:594:0x079c  */
        /* JADX WARN: Removed duplicated region for block: B:600:0x07a6  */
        /* JADX WARN: Removed duplicated region for block: B:612:0x07db  */
        /* JADX WARN: Removed duplicated region for block: B:618:0x07e5  */
        /* JADX WARN: Removed duplicated region for block: B:632:0x081c  */
        /* JADX WARN: Removed duplicated region for block: B:638:0x0826  */
        /* JADX WARN: Removed duplicated region for block: B:652:0x085d  */
        /* JADX WARN: Removed duplicated region for block: B:658:0x0867  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x013a  */
        /* JADX WARN: Type inference failed for: r10v11, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r10v15, types: [java.util.ArrayList] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            GLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1 gLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i2;
            GLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1 gLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i3;
            Entity$special$$inlined$map$1$2$1 entity$special$$inlined$map$1$2$1;
            int i4;
            Entity$special$$inlined$map$2$2$1 entity$special$$inlined$map$2$2$1;
            int i5;
            Entity$special$$inlined$map$3$2$1 entity$special$$inlined$map$3$2$1;
            int i6;
            Entity$special$$inlined$map$4$2$1 entity$special$$inlined$map$4$2$1;
            int i7;
            AnimationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1 animationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i8;
            SwampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1 swampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1;
            int i9;
            RealInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1 realInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1;
            int i10;
            Object obj2;
            StockActivity.Side side;
            StockActivity stockActivity;
            RealLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1 realLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1;
            int i11;
            PaymentActionHandler$confirmPayment$$inlined$map$1$2$1 paymentActionHandler$confirmPayment$$inlined$map$1$2$1;
            int i12;
            Object goToScreen;
            PaymentActionHandler$linkCard$$inlined$map$1$2$1 paymentActionHandler$linkCard$$inlined$map$1$2$1;
            int i13;
            PaymentActionHandler$passcode$$inlined$map$1$2$1 paymentActionHandler$passcode$$inlined$map$1$2$1;
            int i14;
            PaymentActionHandler$transform$$inlined$filter$1$2$1 paymentActionHandler$transform$$inlined$filter$1$2$1;
            int i15;
            PaymentActionHandler$transform$$inlined$filter$2$2$1 paymentActionHandler$transform$$inlined$filter$2$2$1;
            int i16;
            PaymentActionHandler$transform$$inlined$filterIsInstance$1$2$1 paymentActionHandler$transform$$inlined$filterIsInstance$1$2$1;
            int i17;
            PaymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1 paymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1;
            int i18;
            CancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1 cancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1;
            int i19;
            CheckStatusPresenter$models$lambda$3$$inlined$map$1$2$1 checkStatusPresenter$models$lambda$3$$inlined$map$1$2$1;
            int i20;
            RealActivityInvitePresenter$collect$$inlined$map$1$2$1 realActivityInvitePresenter$collect$$inlined$map$1$2$1;
            int i21;
            InitialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1 initialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1;
            int i22;
            RealBalanceSnapshotManager$select$$inlined$map$1$2$1 realBalanceSnapshotManager$select$$inlined$map$1$2$1;
            int i23;
            SelectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1 selectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1;
            int i24;
            RealContactBook$latestRowId$$inlined$map$1$2$1 realContactBook$latestRowId$$inlined$map$1$2$1;
            int i25;
            RealContactBook$latestRowId$$inlined$map$2$2$1 realContactBook$latestRowId$$inlined$map$2$2$1;
            int i26;
            Object invoke;
            Long l;
            List list;
            RealContactBook$special$$inlined$map$1$2$1 realContactBook$special$$inlined$map$1$2$1;
            int i27;
            RealContactBook$special$$inlined$map$2$2$1 realContactBook$special$$inlined$map$2$2$1;
            int i28;
            RealContactBook$special$$inlined$map$3$2$1 realContactBook$special$$inlined$map$3$2$1;
            int i29;
            RealStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1 realStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1;
            int i30;
            int i31 = this.$r8$classId;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i31) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i32 = anonymousClass1.label;
                        if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                            Object obj3 = anonymousClass1.result;
                            Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                Object obj5 = Unit.INSTANCE;
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj5, anonymousClass1) == obj4) {
                                    return obj4;
                                }
                            } else {
                                if (i != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj3);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj32 = anonymousClass1.result;
                    Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                case 1:
                    if (continuation instanceof GLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        gLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1 = (GLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i33 = gLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                            gLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                            Object obj6 = gLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = gLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj6);
                                if (((Boolean) obj).booleanValue()) {
                                    gLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, gLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1) == obj7) {
                                        return obj7;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj6);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    gLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1 = new GLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj62 = gLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    Object obj72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = gLSceneScope$rememberMaterialInstance$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i2 != 0) {
                    }
                    return Unit.INSTANCE;
                case 2:
                    if (continuation instanceof GLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        gLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1 = (GLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i34 = gLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                            gLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                            Object obj8 = gLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = gLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj8);
                                if (((Boolean) obj).booleanValue()) {
                                    gLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, gLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1) == obj9) {
                                        return obj9;
                                    }
                                }
                            } else {
                                if (i3 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj8);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    gLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1 = new GLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj82 = gLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    Object obj92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = gLSceneScope$rememberMesh$mesh$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i3 != 0) {
                    }
                    return Unit.INSTANCE;
                case 3:
                    if (continuation instanceof Entity$special$$inlined$map$1$2$1) {
                        entity$special$$inlined$map$1$2$1 = (Entity$special$$inlined$map$1$2$1) continuation;
                        int i35 = entity$special$$inlined$map$1$2$1.label;
                        if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                            entity$special$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                            Object obj10 = entity$special$$inlined$map$1$2$1.result;
                            Object obj11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = entity$special$$inlined$map$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj10);
                                ((Boolean) obj).getClass();
                                Object obj12 = Unit.INSTANCE;
                                entity$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj12, entity$special$$inlined$map$1$2$1) == obj11) {
                                    return obj11;
                                }
                            } else {
                                if (i4 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj10);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    entity$special$$inlined$map$1$2$1 = new Entity$special$$inlined$map$1$2$1(this, continuation);
                    Object obj102 = entity$special$$inlined$map$1$2$1.result;
                    Object obj112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = entity$special$$inlined$map$1$2$1.label;
                    if (i4 != 0) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    if (continuation instanceof Entity$special$$inlined$map$2$2$1) {
                        entity$special$$inlined$map$2$2$1 = (Entity$special$$inlined$map$2$2$1) continuation;
                        int i36 = entity$special$$inlined$map$2$2$1.label;
                        if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                            entity$special$$inlined$map$2$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                            Object obj13 = entity$special$$inlined$map$2$2$1.result;
                            Object obj14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = entity$special$$inlined$map$2$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj13);
                                ((Boolean) obj).getClass();
                                Object obj15 = Unit.INSTANCE;
                                entity$special$$inlined$map$2$2$1.label = 1;
                                if (flowCollector.emit(obj15, entity$special$$inlined$map$2$2$1) == obj14) {
                                    return obj14;
                                }
                            } else {
                                if (i5 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj13);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    entity$special$$inlined$map$2$2$1 = new Entity$special$$inlined$map$2$2$1(this, continuation);
                    Object obj132 = entity$special$$inlined$map$2$2$1.result;
                    Object obj142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = entity$special$$inlined$map$2$2$1.label;
                    if (i5 != 0) {
                    }
                    return Unit.INSTANCE;
                case 5:
                    if (continuation instanceof Entity$special$$inlined$map$3$2$1) {
                        entity$special$$inlined$map$3$2$1 = (Entity$special$$inlined$map$3$2$1) continuation;
                        int i37 = entity$special$$inlined$map$3$2$1.label;
                        if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                            entity$special$$inlined$map$3$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                            Object obj16 = entity$special$$inlined$map$3$2$1.result;
                            Object obj17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = entity$special$$inlined$map$3$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj16);
                                ((Boolean) obj).getClass();
                                Object obj18 = Unit.INSTANCE;
                                entity$special$$inlined$map$3$2$1.label = 1;
                                if (flowCollector.emit(obj18, entity$special$$inlined$map$3$2$1) == obj17) {
                                    return obj17;
                                }
                            } else {
                                if (i6 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj16);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    entity$special$$inlined$map$3$2$1 = new Entity$special$$inlined$map$3$2$1(this, continuation);
                    Object obj162 = entity$special$$inlined$map$3$2$1.result;
                    Object obj172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = entity$special$$inlined$map$3$2$1.label;
                    if (i6 != 0) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    if (continuation instanceof Entity$special$$inlined$map$4$2$1) {
                        entity$special$$inlined$map$4$2$1 = (Entity$special$$inlined$map$4$2$1) continuation;
                        int i38 = entity$special$$inlined$map$4$2$1.label;
                        if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                            entity$special$$inlined$map$4$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                            Object obj19 = entity$special$$inlined$map$4$2$1.result;
                            Object obj20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = entity$special$$inlined$map$4$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj19);
                                ((Boolean) obj).getClass();
                                Object obj21 = Unit.INSTANCE;
                                entity$special$$inlined$map$4$2$1.label = 1;
                                if (flowCollector.emit(obj21, entity$special$$inlined$map$4$2$1) == obj20) {
                                    return obj20;
                                }
                            } else {
                                if (i7 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj19);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    entity$special$$inlined$map$4$2$1 = new Entity$special$$inlined$map$4$2$1(this, continuation);
                    Object obj192 = entity$special$$inlined$map$4$2$1.result;
                    Object obj202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = entity$special$$inlined$map$4$2$1.label;
                    if (i7 != 0) {
                    }
                    return Unit.INSTANCE;
                case 7:
                    if (continuation instanceof AnimationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        animationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1 = (AnimationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i39 = animationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                            animationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                            Object obj22 = animationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            Object obj23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = animationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj22);
                                if (!((Boolean) obj).booleanValue()) {
                                    animationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, animationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1) == obj23) {
                                        return obj23;
                                    }
                                }
                            } else {
                                if (i8 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj22);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    animationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1 = new AnimationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj222 = animationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    Object obj232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = animationsKt$flingTo$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i8 != 0) {
                    }
                    return Unit.INSTANCE;
                case 8:
                    if (continuation instanceof SwampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1) {
                        swampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1 = (SwampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i40 = swampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                            swampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                            Object obj24 = swampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            Object obj25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = swampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj24);
                                if (((Number) obj).longValue() > 0) {
                                    swampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, swampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1) == obj25) {
                                        return obj25;
                                    }
                                }
                            } else {
                                if (i9 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj24);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    swampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1 = new SwampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj242 = swampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    Object obj252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = swampGLEffectKt$SwampGLEffect$6$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i9 != 0) {
                    }
                    return Unit.INSTANCE;
                case 9:
                    if (continuation instanceof RealInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1) {
                        realInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1 = (RealInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1) continuation;
                        int i41 = realInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1.label;
                        if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                            realInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                            Object obj26 = realInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1.result;
                            Object obj27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = realInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj26);
                                List list2 = ((Activities) obj).recentActivities;
                                if (list2 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj28 : list2) {
                                        if (obj28 instanceof FormattedPaymentHistoryActivityItem) {
                                            arrayList.add(obj28);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        if (((FormattedPaymentHistoryActivityItem) next).getUiPayment().state == PaymentState.COMPLETE) {
                                            arrayList2.add(next);
                                        }
                                    }
                                    obj2 = new ArrayList();
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = (FormattedPaymentHistoryActivityItem) it2.next();
                                        UiPayment uiPayment = formattedPaymentHistoryActivityItem.getUiPayment();
                                        Money money = uiPayment.amount;
                                        if (money != null) {
                                            if (uiPayment.gifted_investment_entity_token == null) {
                                                Role role = uiPayment.role;
                                                if (role != null) {
                                                    int i42 = RealInvestingActivitiesManager.WhenMappings.$EnumSwitchMapping$1[role.ordinal()];
                                                    if (i42 == 1) {
                                                        side = StockActivity.Side.BUY;
                                                    } else {
                                                        if (i42 != 2) {
                                                            if (i42 != 3) {
                                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                return null;
                                                            }
                                                            a$$ExternalSyntheticBUOutline0.m$1("Unexpected value");
                                                            return null;
                                                        }
                                                        side = StockActivity.Side.SELL;
                                                    }
                                                }
                                            } else {
                                                side = StockActivity.Side.BUY;
                                            }
                                            stockActivity = new StockActivity(money, side, formattedPaymentHistoryActivityItem.getDisplayInstant().toEpochMilli());
                                            if (stockActivity == null) {
                                                obj2.add(stockActivity);
                                            }
                                        }
                                        stockActivity = null;
                                        if (stockActivity == null) {
                                        }
                                    }
                                } else {
                                    obj2 = EmptyList.INSTANCE;
                                }
                                realInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, realInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1) == obj27) {
                                    return obj27;
                                }
                            } else {
                                if (i10 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj26);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1 = new RealInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1(this, continuation);
                    Object obj262 = realInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1.result;
                    Object obj272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = realInvestingActivitiesManager$stockActivities$$inlined$map$1$2$1.label;
                    if (i10 != 0) {
                    }
                    return Unit.INSTANCE;
                case 10:
                    if (continuation instanceof RealLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1) {
                        realLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1 = (RealLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1) continuation;
                        int i43 = realLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1.label;
                        if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                            realLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                            Object obj29 = realLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1.result;
                            Object obj30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = realLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1.label;
                            if (i11 != 0) {
                                SafeTrace.throwOnFailure(obj29);
                                Object createRecipient = RecipientUtil.createRecipient((ActivityRecipient) obj, false);
                                realLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(createRecipient, realLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1) == obj30) {
                                    return obj30;
                                }
                            } else {
                                if (i11 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj29);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1 = new RealLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1(this, continuation);
                    Object obj292 = realLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1.result;
                    Object obj302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = realLegacyActivityEntityManager$getCustomerRecipientForPayment$$inlined$map$1$2$1.label;
                    if (i11 != 0) {
                    }
                    return Unit.INSTANCE;
                case 11:
                    if (continuation instanceof PaymentActionHandler$confirmPayment$$inlined$map$1$2$1) {
                        paymentActionHandler$confirmPayment$$inlined$map$1$2$1 = (PaymentActionHandler$confirmPayment$$inlined$map$1$2$1) continuation;
                        int i44 = paymentActionHandler$confirmPayment$$inlined$map$1$2$1.label;
                        if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                            paymentActionHandler$confirmPayment$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                            Object obj31 = paymentActionHandler$confirmPayment$$inlined$map$1$2$1.result;
                            Object obj33 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i12 = paymentActionHandler$confirmPayment$$inlined$map$1$2$1.label;
                            if (i12 != 0) {
                                SafeTrace.throwOnFailure(obj31);
                                HistoryScreens.SelectPaymentInstrument selectPaymentInstrument = (HistoryScreens.SelectPaymentInstrument) obj;
                                goToScreen = selectPaymentInstrument != null ? new PaymentActionResult.GoToScreen(selectPaymentInstrument) : null;
                                paymentActionHandler$confirmPayment$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(goToScreen, paymentActionHandler$confirmPayment$$inlined$map$1$2$1) == obj33) {
                                    return obj33;
                                }
                            } else {
                                if (i12 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj31);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    paymentActionHandler$confirmPayment$$inlined$map$1$2$1 = new PaymentActionHandler$confirmPayment$$inlined$map$1$2$1(this, continuation);
                    Object obj312 = paymentActionHandler$confirmPayment$$inlined$map$1$2$1.result;
                    Object obj332 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i12 = paymentActionHandler$confirmPayment$$inlined$map$1$2$1.label;
                    if (i12 != 0) {
                    }
                    return Unit.INSTANCE;
                case 12:
                    if (continuation instanceof PaymentActionHandler$linkCard$$inlined$map$1$2$1) {
                        paymentActionHandler$linkCard$$inlined$map$1$2$1 = (PaymentActionHandler$linkCard$$inlined$map$1$2$1) continuation;
                        int i45 = paymentActionHandler$linkCard$$inlined$map$1$2$1.label;
                        if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                            paymentActionHandler$linkCard$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                            Object obj34 = paymentActionHandler$linkCard$$inlined$map$1$2$1.result;
                            Object obj35 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i13 = paymentActionHandler$linkCard$$inlined$map$1$2$1.label;
                            if (i13 != 0) {
                                SafeTrace.throwOnFailure(obj34);
                                Object goToScreen2 = new PaymentActionResult.GoToScreen((Screen) obj);
                                paymentActionHandler$linkCard$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(goToScreen2, paymentActionHandler$linkCard$$inlined$map$1$2$1) == obj35) {
                                    return obj35;
                                }
                            } else {
                                if (i13 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj34);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    paymentActionHandler$linkCard$$inlined$map$1$2$1 = new PaymentActionHandler$linkCard$$inlined$map$1$2$1(this, continuation);
                    Object obj342 = paymentActionHandler$linkCard$$inlined$map$1$2$1.result;
                    Object obj352 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i13 = paymentActionHandler$linkCard$$inlined$map$1$2$1.label;
                    if (i13 != 0) {
                    }
                    return Unit.INSTANCE;
                case 13:
                    if (continuation instanceof PaymentActionHandler$passcode$$inlined$map$1$2$1) {
                        paymentActionHandler$passcode$$inlined$map$1$2$1 = (PaymentActionHandler$passcode$$inlined$map$1$2$1) continuation;
                        int i46 = paymentActionHandler$passcode$$inlined$map$1$2$1.label;
                        if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                            paymentActionHandler$passcode$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                            Object obj36 = paymentActionHandler$passcode$$inlined$map$1$2$1.result;
                            Object obj37 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i14 = paymentActionHandler$passcode$$inlined$map$1$2$1.label;
                            if (i14 != 0) {
                                SafeTrace.throwOnFailure(obj36);
                                Object goToScreen3 = new PaymentActionResult.GoToScreen((Screen) obj);
                                paymentActionHandler$passcode$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(goToScreen3, paymentActionHandler$passcode$$inlined$map$1$2$1) == obj37) {
                                    return obj37;
                                }
                            } else {
                                if (i14 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj36);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    paymentActionHandler$passcode$$inlined$map$1$2$1 = new PaymentActionHandler$passcode$$inlined$map$1$2$1(this, continuation);
                    Object obj362 = paymentActionHandler$passcode$$inlined$map$1$2$1.result;
                    Object obj372 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i14 = paymentActionHandler$passcode$$inlined$map$1$2$1.label;
                    if (i14 != 0) {
                    }
                    return Unit.INSTANCE;
                case 14:
                    if (continuation instanceof PaymentActionHandler$transform$$inlined$filter$1$2$1) {
                        paymentActionHandler$transform$$inlined$filter$1$2$1 = (PaymentActionHandler$transform$$inlined$filter$1$2$1) continuation;
                        int i47 = paymentActionHandler$transform$$inlined$filter$1$2$1.label;
                        if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                            paymentActionHandler$transform$$inlined$filter$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                            Object obj38 = paymentActionHandler$transform$$inlined$filter$1$2$1.result;
                            Object obj39 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i15 = paymentActionHandler$transform$$inlined$filter$1$2$1.label;
                            if (i15 != 0) {
                                SafeTrace.throwOnFailure(obj38);
                                Object obj40 = (PaymentAction) obj;
                                if (!(obj40 instanceof PaymentAction.HasPaymentToken) || ((PaymentAction.HasPaymentToken) obj40).getPaymentToken() == null) {
                                    paymentActionHandler$transform$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, paymentActionHandler$transform$$inlined$filter$1$2$1) == obj39) {
                                        return obj39;
                                    }
                                }
                            } else {
                                if (i15 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj38);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    paymentActionHandler$transform$$inlined$filter$1$2$1 = new PaymentActionHandler$transform$$inlined$filter$1$2$1(this, continuation);
                    Object obj382 = paymentActionHandler$transform$$inlined$filter$1$2$1.result;
                    Object obj392 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i15 = paymentActionHandler$transform$$inlined$filter$1$2$1.label;
                    if (i15 != 0) {
                    }
                    return Unit.INSTANCE;
                case 15:
                    if (continuation instanceof PaymentActionHandler$transform$$inlined$filter$2$2$1) {
                        paymentActionHandler$transform$$inlined$filter$2$2$1 = (PaymentActionHandler$transform$$inlined$filter$2$2$1) continuation;
                        int i48 = paymentActionHandler$transform$$inlined$filter$2$2$1.label;
                        if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                            paymentActionHandler$transform$$inlined$filter$2$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                            Object obj41 = paymentActionHandler$transform$$inlined$filter$2$2$1.result;
                            Object obj43 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i16 = paymentActionHandler$transform$$inlined$filter$2$2$1.label;
                            if (i16 != 0) {
                                SafeTrace.throwOnFailure(obj41);
                                if (((PaymentAction.HasPaymentToken) obj).getPaymentToken() != null) {
                                    paymentActionHandler$transform$$inlined$filter$2$2$1.label = 1;
                                    if (flowCollector.emit(obj, paymentActionHandler$transform$$inlined$filter$2$2$1) == obj43) {
                                        return obj43;
                                    }
                                }
                            } else {
                                if (i16 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj41);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    paymentActionHandler$transform$$inlined$filter$2$2$1 = new PaymentActionHandler$transform$$inlined$filter$2$2$1(this, continuation);
                    Object obj412 = paymentActionHandler$transform$$inlined$filter$2$2$1.result;
                    Object obj432 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i16 = paymentActionHandler$transform$$inlined$filter$2$2$1.label;
                    if (i16 != 0) {
                    }
                    return Unit.INSTANCE;
                case 16:
                    if (continuation instanceof PaymentActionHandler$transform$$inlined$filterIsInstance$1$2$1) {
                        paymentActionHandler$transform$$inlined$filterIsInstance$1$2$1 = (PaymentActionHandler$transform$$inlined$filterIsInstance$1$2$1) continuation;
                        int i49 = paymentActionHandler$transform$$inlined$filterIsInstance$1$2$1.label;
                        if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                            paymentActionHandler$transform$$inlined$filterIsInstance$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                            Object obj44 = paymentActionHandler$transform$$inlined$filterIsInstance$1$2$1.result;
                            Object obj45 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i17 = paymentActionHandler$transform$$inlined$filterIsInstance$1$2$1.label;
                            if (i17 != 0) {
                                SafeTrace.throwOnFailure(obj44);
                                if (obj instanceof PaymentAction.HasPaymentToken) {
                                    paymentActionHandler$transform$$inlined$filterIsInstance$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, paymentActionHandler$transform$$inlined$filterIsInstance$1$2$1) == obj45) {
                                        return obj45;
                                    }
                                }
                            } else {
                                if (i17 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj44);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    paymentActionHandler$transform$$inlined$filterIsInstance$1$2$1 = new PaymentActionHandler$transform$$inlined$filterIsInstance$1$2$1(this, continuation);
                    Object obj442 = paymentActionHandler$transform$$inlined$filterIsInstance$1$2$1.result;
                    Object obj452 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i17 = paymentActionHandler$transform$$inlined$filterIsInstance$1$2$1.label;
                    if (i17 != 0) {
                    }
                    return Unit.INSTANCE;
                case 17:
                    if (continuation instanceof PaymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1) {
                        paymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1 = (PaymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1) continuation;
                        int i50 = paymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1.label;
                        if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                            paymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                            Object obj46 = paymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1.result;
                            Object obj47 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i18 = paymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1.label;
                            if (i18 != 0) {
                                SafeTrace.throwOnFailure(obj46);
                                if (!((Boolean) obj).booleanValue()) {
                                    paymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, paymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1) == obj47) {
                                        return obj47;
                                    }
                                }
                            } else {
                                if (i18 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj46);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    paymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1 = new PaymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1(this, continuation);
                    Object obj462 = paymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1.result;
                    Object obj472 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i18 = paymentActionHandler$transform$lambda$2$$inlined$filterNot$1$2$1.label;
                    if (i18 != 0) {
                    }
                    return Unit.INSTANCE;
                case 18:
                    if (continuation instanceof CancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1) {
                        cancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1 = (CancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1) continuation;
                        int i51 = cancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                        if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                            cancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                            Object obj48 = cancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                            Object obj49 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i19 = cancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                            if (i19 != 0) {
                                SafeTrace.throwOnFailure(obj48);
                                PendingPayment pendingPayment = (PendingPayment) obj;
                                goToScreen = pendingPayment != null ? pendingPayment.orientation : null;
                                cancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(goToScreen, cancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1) == obj49) {
                                    return obj49;
                                }
                            } else {
                                if (i19 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj48);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    cancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1 = new CancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1(this, continuation);
                    Object obj482 = cancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                    Object obj492 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i19 = cancelPaymentPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                    if (i19 != 0) {
                    }
                    return Unit.INSTANCE;
                case 19:
                    if (continuation instanceof CheckStatusPresenter$models$lambda$3$$inlined$map$1$2$1) {
                        checkStatusPresenter$models$lambda$3$$inlined$map$1$2$1 = (CheckStatusPresenter$models$lambda$3$$inlined$map$1$2$1) continuation;
                        int i52 = checkStatusPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                        if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                            checkStatusPresenter$models$lambda$3$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                            Object obj50 = checkStatusPresenter$models$lambda$3$$inlined$map$1$2$1.result;
                            Object obj51 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i20 = checkStatusPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                            if (i20 != 0) {
                                SafeTrace.throwOnFailure(obj50);
                                ForExternalId forExternalId = (ForExternalId) obj;
                                Object pair = new Pair(null, forExternalId != null ? forExternalId.orientation : null);
                                checkStatusPresenter$models$lambda$3$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(pair, checkStatusPresenter$models$lambda$3$$inlined$map$1$2$1) == obj51) {
                                    return obj51;
                                }
                            } else {
                                if (i20 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj50);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    checkStatusPresenter$models$lambda$3$$inlined$map$1$2$1 = new CheckStatusPresenter$models$lambda$3$$inlined$map$1$2$1(this, continuation);
                    Object obj502 = checkStatusPresenter$models$lambda$3$$inlined$map$1$2$1.result;
                    Object obj512 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i20 = checkStatusPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                    if (i20 != 0) {
                    }
                    return Unit.INSTANCE;
                case 20:
                    if (continuation instanceof RealActivityInvitePresenter$collect$$inlined$map$1$2$1) {
                        realActivityInvitePresenter$collect$$inlined$map$1$2$1 = (RealActivityInvitePresenter$collect$$inlined$map$1$2$1) continuation;
                        int i53 = realActivityInvitePresenter$collect$$inlined$map$1$2$1.label;
                        if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                            realActivityInvitePresenter$collect$$inlined$map$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                            Object obj52 = realActivityInvitePresenter$collect$$inlined$map$1$2$1.result;
                            Object obj53 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i21 = realActivityInvitePresenter$collect$$inlined$map$1$2$1.label;
                            if (i21 != 0) {
                                SafeTrace.throwOnFailure(obj52);
                                InvitationConfig invitationConfig = (InvitationConfig) obj;
                                Object activityInviteViewModel = new ActivityInviteViewModel(invitationConfig.activity_button_text, invitationConfig.enabled);
                                realActivityInvitePresenter$collect$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(activityInviteViewModel, realActivityInvitePresenter$collect$$inlined$map$1$2$1) == obj53) {
                                    return obj53;
                                }
                            } else {
                                if (i21 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj52);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realActivityInvitePresenter$collect$$inlined$map$1$2$1 = new RealActivityInvitePresenter$collect$$inlined$map$1$2$1(this, continuation);
                    Object obj522 = realActivityInvitePresenter$collect$$inlined$map$1$2$1.result;
                    Object obj532 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i21 = realActivityInvitePresenter$collect$$inlined$map$1$2$1.label;
                    if (i21 != 0) {
                    }
                    return Unit.INSTANCE;
                case 21:
                    if (continuation instanceof InitialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1) {
                        initialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1 = (InitialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i54 = initialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                            initialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                            Object obj54 = initialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                            Object obj55 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i22 = initialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i22 != 0) {
                                SafeTrace.throwOnFailure(obj54);
                                Object valueOf = Boolean.valueOf(((InitialScreenPlaceholderViewEvent) obj) instanceof InitialScreenPlaceholderViewEvent.RetryError);
                                initialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf, initialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1) == obj55) {
                                    return obj55;
                                }
                            } else {
                                if (i22 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj54);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    initialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1 = new InitialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj542 = initialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                    Object obj552 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i22 = initialScreenLoaderPresenter$models$1$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i22 != 0) {
                    }
                    return Unit.INSTANCE;
                case 22:
                    if (continuation instanceof RealBalanceSnapshotManager$select$$inlined$map$1$2$1) {
                        realBalanceSnapshotManager$select$$inlined$map$1$2$1 = (RealBalanceSnapshotManager$select$$inlined$map$1$2$1) continuation;
                        int i55 = realBalanceSnapshotManager$select$$inlined$map$1$2$1.label;
                        if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                            realBalanceSnapshotManager$select$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                            Object obj56 = realBalanceSnapshotManager$select$$inlined$map$1$2$1.result;
                            Object obj57 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i23 = realBalanceSnapshotManager$select$$inlined$map$1$2$1.label;
                            if (i23 != 0) {
                                SafeTrace.throwOnFailure(obj56);
                                Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) obj);
                                realBalanceSnapshotManager$select$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(firstOrNull, realBalanceSnapshotManager$select$$inlined$map$1$2$1) == obj57) {
                                    return obj57;
                                }
                            } else {
                                if (i23 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj56);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realBalanceSnapshotManager$select$$inlined$map$1$2$1 = new RealBalanceSnapshotManager$select$$inlined$map$1$2$1(this, continuation);
                    Object obj562 = realBalanceSnapshotManager$select$$inlined$map$1$2$1.result;
                    Object obj572 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i23 = realBalanceSnapshotManager$select$$inlined$map$1$2$1.label;
                    if (i23 != 0) {
                    }
                    return Unit.INSTANCE;
                case 23:
                    if (continuation instanceof SelectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1) {
                        selectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1 = (SelectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1) continuation;
                        int i56 = selectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1.label;
                        if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                            selectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                            Object obj58 = selectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1.result;
                            Object obj59 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i24 = selectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1.label;
                            if (i24 != 0) {
                                SafeTrace.throwOnFailure(obj58);
                                InstrumentLinkingConfig instrumentLinkingConfig = (InstrumentLinkingConfig) obj;
                                Object selectPaymentInstrumentPresenter$initialModel$Config = new SelectPaymentInstrumentPresenter$initialModel$Config(instrumentLinkingConfig.credit_card_fee_bps, instrumentLinkingConfig.credit_card_linking_enabled, instrumentLinkingConfig.cash_balance_enabled);
                                selectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(selectPaymentInstrumentPresenter$initialModel$Config, selectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1) == obj59) {
                                    return obj59;
                                }
                            } else {
                                if (i24 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj58);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    selectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1 = new SelectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1(this, continuation);
                    Object obj582 = selectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1.result;
                    Object obj592 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i24 = selectPaymentInstrumentPresenter$initialModel$$inlined$map$1$2$1.label;
                    if (i24 != 0) {
                    }
                    return Unit.INSTANCE;
                case 24:
                    if (continuation instanceof RealContactBook$latestRowId$$inlined$map$1$2$1) {
                        realContactBook$latestRowId$$inlined$map$1$2$1 = (RealContactBook$latestRowId$$inlined$map$1$2$1) continuation;
                        int i57 = realContactBook$latestRowId$$inlined$map$1$2$1.label;
                        if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                            realContactBook$latestRowId$$inlined$map$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                            Object obj60 = realContactBook$latestRowId$$inlined$map$1$2$1.result;
                            Object obj61 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i25 = realContactBook$latestRowId$$inlined$map$1$2$1.label;
                            if (i25 != 0) {
                                SafeTrace.throwOnFailure(obj60);
                                Object copperContactAccountLookup = new RealContactBook.CopperContactAccountLookup((ContentResolverQuery) obj);
                                realContactBook$latestRowId$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(copperContactAccountLookup, realContactBook$latestRowId$$inlined$map$1$2$1) == obj61) {
                                    return obj61;
                                }
                            } else {
                                if (i25 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj60);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realContactBook$latestRowId$$inlined$map$1$2$1 = new RealContactBook$latestRowId$$inlined$map$1$2$1(this, continuation);
                    Object obj602 = realContactBook$latestRowId$$inlined$map$1$2$1.result;
                    Object obj612 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i25 = realContactBook$latestRowId$$inlined$map$1$2$1.label;
                    if (i25 != 0) {
                    }
                    return Unit.INSTANCE;
                case 25:
                    if (continuation instanceof RealContactBook$latestRowId$$inlined$map$2$2$1) {
                        realContactBook$latestRowId$$inlined$map$2$2$1 = (RealContactBook$latestRowId$$inlined$map$2$2$1) continuation;
                        int i58 = realContactBook$latestRowId$$inlined$map$2$2$1.label;
                        if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                            realContactBook$latestRowId$$inlined$map$2$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                            Object obj63 = realContactBook$latestRowId$$inlined$map$2$2$1.result;
                            Object obj64 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i26 = realContactBook$latestRowId$$inlined$map$2$2$1.label;
                            if (i26 != 0) {
                                SafeTrace.throwOnFailure(obj63);
                                Cursor run = ((RealContactBook.CopperContactAccountLookup) obj).query.run();
                                if (run != null) {
                                    try {
                                        Integer access$maybeGetColumnIndex = MapComposeViewRenderKt.access$maybeGetColumnIndex(run, "_id");
                                        ArrayList arrayList3 = new ArrayList();
                                        while (run.moveToNext()) {
                                            RealContactBookKt$maybeGetLong$1 realContactBookKt$maybeGetLong$1 = RealContactBookKt$maybeGetLong$1.INSTANCE;
                                            if (access$maybeGetColumnIndex != null) {
                                                try {
                                                    invoke = realContactBookKt$maybeGetLong$1.invoke(run, Integer.valueOf(access$maybeGetColumnIndex.intValue()));
                                                } catch (Exception unused) {
                                                }
                                                l = (Long) invoke;
                                                if (l == null) {
                                                    arrayList3.add(l);
                                                }
                                            }
                                            invoke = null;
                                            l = (Long) invoke;
                                            if (l == null) {
                                            }
                                        }
                                        run.close();
                                        list = arrayList3;
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            Utf8.closeFinally(run, th);
                                            throw th2;
                                        }
                                    }
                                } else {
                                    list = EmptyList.INSTANCE;
                                }
                                Object firstOrNull2 = CollectionsKt.firstOrNull((List<? extends Object>) list);
                                realContactBook$latestRowId$$inlined$map$2$2$1.label = 1;
                                if (flowCollector.emit(firstOrNull2, realContactBook$latestRowId$$inlined$map$2$2$1) == obj64) {
                                    return obj64;
                                }
                            } else {
                                if (i26 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj63);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realContactBook$latestRowId$$inlined$map$2$2$1 = new RealContactBook$latestRowId$$inlined$map$2$2$1(this, continuation);
                    Object obj632 = realContactBook$latestRowId$$inlined$map$2$2$1.result;
                    Object obj642 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i26 = realContactBook$latestRowId$$inlined$map$2$2$1.label;
                    if (i26 != 0) {
                    }
                    return Unit.INSTANCE;
                case 26:
                    if (continuation instanceof RealContactBook$special$$inlined$map$1$2$1) {
                        realContactBook$special$$inlined$map$1$2$1 = (RealContactBook$special$$inlined$map$1$2$1) continuation;
                        int i59 = realContactBook$special$$inlined$map$1$2$1.label;
                        if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                            realContactBook$special$$inlined$map$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                            Object obj65 = realContactBook$special$$inlined$map$1$2$1.result;
                            Object obj66 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i27 = realContactBook$special$$inlined$map$1$2$1.label;
                            if (i27 != 0) {
                                SafeTrace.throwOnFailure(obj65);
                                Object copperContactsQuery = new RealContactBook.CopperContactsQuery((ContentResolverQuery) obj);
                                realContactBook$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(copperContactsQuery, realContactBook$special$$inlined$map$1$2$1) == obj66) {
                                    return obj66;
                                }
                            } else {
                                if (i27 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj65);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realContactBook$special$$inlined$map$1$2$1 = new RealContactBook$special$$inlined$map$1$2$1(this, continuation);
                    Object obj652 = realContactBook$special$$inlined$map$1$2$1.result;
                    Object obj662 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i27 = realContactBook$special$$inlined$map$1$2$1.label;
                    if (i27 != 0) {
                    }
                    return Unit.INSTANCE;
                case 27:
                    if (continuation instanceof RealContactBook$special$$inlined$map$2$2$1) {
                        realContactBook$special$$inlined$map$2$2$1 = (RealContactBook$special$$inlined$map$2$2$1) continuation;
                        int i60 = realContactBook$special$$inlined$map$2$2$1.label;
                        if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                            realContactBook$special$$inlined$map$2$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                            Object obj67 = realContactBook$special$$inlined$map$2$2$1.result;
                            Object obj68 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i28 = realContactBook$special$$inlined$map$2$2$1.label;
                            if (i28 != 0) {
                                SafeTrace.throwOnFailure(obj67);
                                Object copperDetailsContactsQuery = new RealContactBook.CopperDetailsContactsQuery((ContentResolverQuery) obj);
                                realContactBook$special$$inlined$map$2$2$1.label = 1;
                                if (flowCollector.emit(copperDetailsContactsQuery, realContactBook$special$$inlined$map$2$2$1) == obj68) {
                                    return obj68;
                                }
                            } else {
                                if (i28 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj67);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realContactBook$special$$inlined$map$2$2$1 = new RealContactBook$special$$inlined$map$2$2$1(this, continuation);
                    Object obj672 = realContactBook$special$$inlined$map$2$2$1.result;
                    Object obj682 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i28 = realContactBook$special$$inlined$map$2$2$1.label;
                    if (i28 != 0) {
                    }
                    return Unit.INSTANCE;
                case 28:
                    if (continuation instanceof RealContactBook$special$$inlined$map$3$2$1) {
                        realContactBook$special$$inlined$map$3$2$1 = (RealContactBook$special$$inlined$map$3$2$1) continuation;
                        int i61 = realContactBook$special$$inlined$map$3$2$1.label;
                        if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                            realContactBook$special$$inlined$map$3$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                            Object obj69 = realContactBook$special$$inlined$map$3$2$1.result;
                            Object obj70 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i29 = realContactBook$special$$inlined$map$3$2$1.label;
                            if (i29 != 0) {
                                SafeTrace.throwOnFailure(obj69);
                                Object copperContactAccountDetails = new RealContactBook.CopperContactAccountDetails((ContentResolverQuery) obj);
                                realContactBook$special$$inlined$map$3$2$1.label = 1;
                                if (flowCollector.emit(copperContactAccountDetails, realContactBook$special$$inlined$map$3$2$1) == obj70) {
                                    return obj70;
                                }
                            } else {
                                if (i29 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj69);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realContactBook$special$$inlined$map$3$2$1 = new RealContactBook$special$$inlined$map$3$2$1(this, continuation);
                    Object obj692 = realContactBook$special$$inlined$map$3$2$1.result;
                    Object obj702 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i29 = realContactBook$special$$inlined$map$3$2$1.label;
                    if (i29 != 0) {
                    }
                    return Unit.INSTANCE;
                default:
                    if (continuation instanceof RealStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1) {
                        realStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1 = (RealStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1) continuation;
                        int i62 = realStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1.label;
                        if ((i62 & PKIFailureInfo.systemUnavail) != 0) {
                            realStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1.label = i62 - PKIFailureInfo.systemUnavail;
                            Object obj71 = realStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1.result;
                            Object obj73 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i30 = realStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1.label;
                            if (i30 != 0) {
                                SafeTrace.throwOnFailure(obj71);
                                Object valueOf2 = Boolean.valueOf(((Lifecycle.State) obj).compareTo(Lifecycle.State.STARTED) >= 0);
                                realStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf2, realStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1) == obj73) {
                                    return obj73;
                                }
                            } else {
                                if (i30 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj71);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1 = new RealStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1(this, continuation);
                    Object obj712 = realStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1.result;
                    Object obj732 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i30 = realStocksAppletTilePriceMovementRepository$models$$inlined$map$1$2$1.label;
                    if (i30 != 0) {
                    }
                    return Unit.INSTANCE;
            }
        }
    }

    public /* synthetic */ Camera$special$$inlined$map$1(ChannelFlowBuilder channelFlowBuilder, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = channelFlowBuilder;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 0;
        ChannelFlowBuilder channelFlowBuilder = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = channelFlowBuilder.collect(new AnonymousClass2(flowCollector, i2), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = channelFlowBuilder.collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, 17), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = channelFlowBuilder.collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, 25), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect4 = channelFlowBuilder.collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(flowCollector, i2), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
