package com.squareup.cash.amountslider;

import android.net.Uri;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidget;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.OrderActivityData;
import com.squareup.cash.activity.presenters.ActivityFeedCallbackEvent$RefreshFeed;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$models$lambda$32$$inlined$map$1$2$1;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$special$$inlined$map$1$2$1;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$special$$inlined$map$1$2$1;
import com.squareup.cash.activity.presenters.RealContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.activity.presenters.RealContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityInviteItemViewEvent$Click;
import com.squareup.cash.activity.viewmodels.AppMessageEvent;
import com.squareup.cash.activity.viewmodels.ContactHeaderViewEvent;
import com.squareup.cash.activity.viewmodels.PulledToRefresh;
import com.squareup.cash.advertising.backend.api.FullscreenAd;
import com.squareup.cash.advertising.backend.api.Status$Complete;
import com.squareup.cash.advertising.backend.real.RealFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1;
import com.squareup.cash.afterpayapplet.applets.presenters.RealAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1;
import com.squareup.cash.afterpayapplet.backend.HomeResult;
import com.squareup.cash.afterpayapplet.backend.RetroOrderSelectionResult;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1;
import com.squareup.cash.afterpayapplet.db.AfterpayApplet;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1;
import com.squareup.cash.afterpayapplet.presenters.AfterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.afterpayapplet.presenters.CompletedOrdersActivitiesManager;
import com.squareup.cash.afterpayapplet.presenters.CompletedOrdersActivitiesManager$activities$$inlined$map$1$2$1;
import com.squareup.cash.afterpayapplet.presenters.FilteredActivitiesManager$activities$lambda$0$1$$inlined$sortedBy$1;
import com.squareup.cash.afterpayapplet.presenters.UpcomingOrdersActivitiesManager;
import com.squareup.cash.afterpayapplet.presenters.UpcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.afterpayapplet.views.floatingtiles.FloatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemSelected;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetEvent$ItemSelected;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.appmessages.db.FullScreenMessage;
import com.squareup.cash.appmessages.db.InlineMessage;
import com.squareup.cash.appmessages.presenters.CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.appmessages.presenters.CardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.appmessages.presenters.CardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1;
import com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.banking.presenters.BalanceHomePresenter$models$lambda$14$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse;
import com.squareup.protos.cash.composer.app.Action;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.cash.composer.app.Asset$AssetType$VideoAsset;
import com.squareup.protos.cash.composer.app.VideoAsset;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.Video;
import com.squareup.protos.franklin.ui.FullCashtag;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AmountPickerCondensedView$events$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.amountslider.AmountPickerCondensedView$events$$inlined$map$1$2$1, reason: invalid class name */
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
            return AmountPickerCondensedView$events$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ AmountPickerCondensedView$events$$inlined$map$1$2(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0134  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        ActivityTabPresenter$models$lambda$32$$inlined$map$1$2$1 activityTabPresenter$models$lambda$32$$inlined$map$1$2$1;
        int i2;
        ActivityTabPresenter$special$$inlined$map$1$2$1 activityTabPresenter$special$$inlined$map$1$2$1;
        int i3;
        RealActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1 realActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1;
        int i4;
        RealActivityEmbeddedPresenter$special$$inlined$map$1$2$1 realActivityEmbeddedPresenter$special$$inlined$map$1$2$1;
        int i5;
        RealContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 realContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1;
        int i6;
        RealContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1 realContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1;
        int i7;
        RealFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1 realFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1;
        int i8;
        Video.AudioPreference audioPreference;
        String str;
        RealAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1 realAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1;
        int i9;
        RealAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1 realAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1;
        int i10;
        AfterpayAppletResponse afterpayAppletResponse;
        AfterpayAppletHome afterpayAppletHome;
        RealAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1 realAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1;
        int i11;
        AfterpayAppletResponse afterpayAppletResponse2;
        AfterpayAppletHome afterpayAppletHome2;
        RealAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1 realAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1;
        int i12;
        RetroOrderSelectionResponse retroOrderSelectionResponse;
        AfterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1 afterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1;
        int i13;
        AfterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 afterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i14;
        CompletedOrdersActivitiesManager$activities$$inlined$map$1$2$1 completedOrdersActivitiesManager$activities$$inlined$map$1$2$1;
        int i15;
        ArrayList arrayList;
        UpcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1 upcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1;
        int i16;
        List list;
        FloatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1 floatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1;
        int i17;
        CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1 cardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1;
        int i18;
        CardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i19;
        CardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i20;
        InlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1 inlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1;
        int i21;
        InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1 inlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1;
        int i22;
        InlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i23;
        InlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i24;
        InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1 inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1;
        int i25;
        InlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 inlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i26;
        InlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i27;
        InlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1 inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i28;
        InlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1 inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1;
        int i29;
        BalanceHomePresenter$models$lambda$14$$inlined$map$1$2$1 balanceHomePresenter$models$lambda$14$$inlined$map$1$2$1;
        int i30;
        int i31 = this.$r8$classId;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        Object obj2 = null;
        r9 = null;
        r9 = null;
        Object obj3 = null;
        r9 = null;
        r9 = null;
        Object obj4 = null;
        r9 = null;
        Uri uri = null;
        switch (i31) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i32 = anonymousClass1.label;
                    if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                        Object obj5 = anonymousClass1.result;
                        Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            AmountSelectorWidgetEvent$ItemSelected amountSelectorWidgetEvent$ItemSelected = (AmountSelectorWidgetEvent$ItemSelected) obj;
                            if (amountSelectorWidgetEvent$ItemSelected != null) {
                                Object amountPickerViewEvent$Condensed$ItemSelected = new AmountPickerViewEvent$Condensed$ItemSelected(amountSelectorWidgetEvent$ItemSelected.item);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(amountPickerViewEvent$Condensed$ItemSelected, anonymousClass1) == obj6) {
                                    break;
                                }
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj52 = anonymousClass1.result;
                Object obj62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof ActivityTabPresenter$models$lambda$32$$inlined$map$1$2$1) {
                    activityTabPresenter$models$lambda$32$$inlined$map$1$2$1 = (ActivityTabPresenter$models$lambda$32$$inlined$map$1$2$1) continuation;
                    int i33 = activityTabPresenter$models$lambda$32$$inlined$map$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        activityTabPresenter$models$lambda$32$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj7 = activityTabPresenter$models$lambda$32$$inlined$map$1$2$1.result;
                        Object obj8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = activityTabPresenter$models$lambda$32$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            Object obj9 = ((AppMessageEvent) obj).appMessageEvent;
                            if (obj9 instanceof AppMessageViewEvent.AppMessageActionTaken) {
                                obj9 = AppMessageViewEvent.AppMessageActionTaken.copy$default((AppMessageViewEvent.AppMessageActionTaken) obj9, ActivityScreen.INSTANCE);
                            }
                            activityTabPresenter$models$lambda$32$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj9, activityTabPresenter$models$lambda$32$$inlined$map$1$2$1) == obj8) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj7);
                        }
                        break;
                    }
                }
                activityTabPresenter$models$lambda$32$$inlined$map$1$2$1 = new ActivityTabPresenter$models$lambda$32$$inlined$map$1$2$1(this, continuation);
                Object obj72 = activityTabPresenter$models$lambda$32$$inlined$map$1$2$1.result;
                Object obj82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = activityTabPresenter$models$lambda$32$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof ActivityTabPresenter$special$$inlined$map$1$2$1) {
                    activityTabPresenter$special$$inlined$map$1$2$1 = (ActivityTabPresenter$special$$inlined$map$1$2$1) continuation;
                    int i34 = activityTabPresenter$special$$inlined$map$1$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        activityTabPresenter$special$$inlined$map$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj10 = activityTabPresenter$special$$inlined$map$1$2$1.result;
                        Object obj11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = activityTabPresenter$special$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            if (Intrinsics.areEqual((ActivityFeedCallbackEvent$RefreshFeed) obj, ActivityFeedCallbackEvent$RefreshFeed.INSTANCE)) {
                                Object pulledToRefresh = new PulledToRefresh(false);
                                activityTabPresenter$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(pulledToRefresh, activityTabPresenter$special$$inlined$map$1$2$1) == obj11) {
                                    break;
                                }
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj10);
                        }
                        break;
                    }
                }
                activityTabPresenter$special$$inlined$map$1$2$1 = new ActivityTabPresenter$special$$inlined$map$1$2$1(this, continuation);
                Object obj102 = activityTabPresenter$special$$inlined$map$1$2$1.result;
                Object obj112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = activityTabPresenter$special$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof RealActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1) {
                    realActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1 = (RealActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1) continuation;
                    int i35 = realActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1.label;
                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                        realActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                        Object obj12 = realActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1.result;
                        Object obj13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = realActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            if (obj instanceof ActivityEmbeddedViewEvent.Refresh) {
                                realActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1) == obj13) {
                                    break;
                                }
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj12);
                        }
                        break;
                    }
                }
                realActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1 = new RealActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj122 = realActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1.result;
                Object obj132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = realActivityEmbeddedPresenter$special$$inlined$filterIsInstance$1$2$1.label;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof RealActivityEmbeddedPresenter$special$$inlined$map$1$2$1) {
                    realActivityEmbeddedPresenter$special$$inlined$map$1$2$1 = (RealActivityEmbeddedPresenter$special$$inlined$map$1$2$1) continuation;
                    int i36 = realActivityEmbeddedPresenter$special$$inlined$map$1$2$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        realActivityEmbeddedPresenter$special$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj14 = realActivityEmbeddedPresenter$special$$inlined$map$1$2$1.result;
                        Object obj15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realActivityEmbeddedPresenter$special$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            if (((ActivityFeedCallbackEvent$RefreshFeed) obj) != null) {
                                realActivityEmbeddedPresenter$special$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(ActivityEmbeddedViewEvent.Refresh.INSTANCE, realActivityEmbeddedPresenter$special$$inlined$map$1$2$1) == obj15) {
                                    break;
                                }
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj14);
                        }
                        break;
                    }
                }
                realActivityEmbeddedPresenter$special$$inlined$map$1$2$1 = new RealActivityEmbeddedPresenter$special$$inlined$map$1$2$1(this, continuation);
                Object obj142 = realActivityEmbeddedPresenter$special$$inlined$map$1$2$1.result;
                Object obj152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = realActivityEmbeddedPresenter$special$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof RealContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) {
                    realContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = (RealContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) continuation;
                    int i37 = realContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        realContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj16 = realContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                        Object obj17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = realContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            if (obj instanceof ContactHeaderViewEvent.InviteClick) {
                                realContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1) == obj17) {
                                    break;
                                }
                            }
                        } else if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj16);
                        }
                        break;
                    }
                }
                realContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1 = new RealContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj162 = realContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.result;
                Object obj172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = realContactHeaderPresenter$models$lambda$0$$inlined$filterIsInstance$1$2$1.label;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof RealContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1) {
                    realContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1 = (RealContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i38 = realContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        realContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj18 = realContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        Object obj19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = realContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            ((ContactHeaderViewEvent.InviteClick) obj).getClass();
                            realContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(ActivityInviteItemViewEvent$Click.INSTANCE, realContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1) == obj19) {
                                break;
                            }
                        } else if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj18);
                        }
                        break;
                    }
                }
                realContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1 = new RealContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj182 = realContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                Object obj192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = realContactHeaderPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof RealFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1) {
                    realFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1 = (RealFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1) continuation;
                    int i39 = realFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1.label;
                    if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                        realFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                        Object obj20 = realFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1.result;
                        Object obj21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = realFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj20);
                            FullScreenMessage fullScreenMessage = (FullScreenMessage) obj;
                            if (fullScreenMessage != null) {
                                Video video = fullScreenMessage.video;
                                String str2 = video != null ? video.asset_url : null;
                                String str3 = video != null ? video.video_accessibility_hint : null;
                                Boolean bool = video != null ? video.should_loop : null;
                                ByteString byteString = ByteString.EMPTY;
                                Asset asset = new Asset(new Asset$AssetType$VideoAsset(new VideoAsset(str2, str3, null, bool, null, byteString)), byteString);
                                AppMessageAction appMessageAction = fullScreenMessage.primaryAction;
                                Action action = appMessageAction != null ? new Action(appMessageAction.url_to_open, appMessageAction.text, fullScreenMessage.primaryActionColor, appMessageAction.text_color) : null;
                                AppMessageAction appMessageAction2 = fullScreenMessage.secondaryAction;
                                List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new Action[]{action, appMessageAction2 != null ? new Action(appMessageAction2.url_to_open, appMessageAction2.text, fullScreenMessage.secondaryActionColor, appMessageAction2.text_color) : null});
                                if (video == null || (audioPreference = video.audio_preference) == null) {
                                    audioPreference = Video.AudioPreference.START_MUTED;
                                }
                                FullscreenAd.Config config = new FullscreenAd.Config(asset, filterNotNull, audioPreference);
                                if (video != null && (str = video.asset_url) != null) {
                                    uri = Uri.parse(str);
                                }
                                obj2 = new FullscreenAd(config, new Status$Complete(uri));
                            }
                            realFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj2, realFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1) == obj21) {
                                break;
                            }
                        } else if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj20);
                        }
                        break;
                    }
                }
                realFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1 = new RealFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1(this, continuation);
                Object obj202 = realFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1.result;
                Object obj212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = realFullscreenAdStore$getFullscreenAd$$inlined$map$1$2$1.label;
                if (i8 != 0) {
                }
                break;
            case 8:
                if (continuation instanceof RealAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1) {
                    realAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1 = (RealAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1) continuation;
                    int i40 = realAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1.label;
                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                        realAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                        Object obj22 = realAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1.result;
                        Object obj23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = realAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj22);
                            Object obj24 = ((Boolean) obj).booleanValue() ? AppletAvailabilityState.AVAILABLE : AppletAvailabilityState.UNAVAILABLE;
                            realAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj24, realAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1) == obj23) {
                                break;
                            }
                        } else if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj22);
                        }
                        break;
                    }
                }
                realAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1 = new RealAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1(this, continuation);
                Object obj222 = realAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1.result;
                Object obj232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = realAfterpayAppletAvailabilityStateManager$special$$inlined$map$1$2$1.label;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof RealAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1) {
                    realAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1 = (RealAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1) continuation;
                    int i41 = realAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1.label;
                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                        realAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                        Object obj25 = realAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1.result;
                        Object obj26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = realAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj25);
                            AfterpayApplet afterpayApplet = (AfterpayApplet) obj;
                            if (afterpayApplet != null && (afterpayAppletResponse = afterpayApplet.afterpay_applet_response) != null && (afterpayAppletHome = afterpayAppletResponse.home) != null) {
                                obj4 = afterpayAppletHome.activity_preload;
                            }
                            if (obj4 != null) {
                                realAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(obj4, realAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1) == obj26) {
                                    break;
                                }
                            }
                        } else if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj25);
                        }
                        break;
                    }
                }
                realAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1 = new RealAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj252 = realAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1.result;
                Object obj262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = realAfterpayAppletRepository$getPreloadedActivityResponse$$inlined$mapNotNull$1$2$1.label;
                if (i10 != 0) {
                }
                break;
            case 10:
                if (continuation instanceof RealAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1) {
                    realAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1 = (RealAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1) continuation;
                    int i42 = realAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1.label;
                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                        realAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                        Object obj27 = realAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1.result;
                        Object obj28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = realAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj27);
                            AfterpayApplet afterpayApplet2 = (AfterpayApplet) obj;
                            if (afterpayApplet2 != null && (afterpayAppletResponse2 = afterpayApplet2.afterpay_applet_response) != null && (afterpayAppletHome2 = afterpayAppletResponse2.home) != null) {
                                obj3 = afterpayAppletHome2.purchase_history_preload;
                            }
                            if (obj3 != null) {
                                realAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(obj3, realAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1) == obj28) {
                                    break;
                                }
                            }
                        } else if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj27);
                        }
                        break;
                    }
                }
                realAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1 = new RealAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj272 = realAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1.result;
                Object obj282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = realAfterpayAppletRepository$getPreloadedPurchaseHistoryResponse$$inlined$mapNotNull$1$2$1.label;
                if (i11 != 0) {
                }
                break;
            case 11:
                if (continuation instanceof RealAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1) {
                    realAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1 = (RealAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1) continuation;
                    int i43 = realAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1.label;
                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                        realAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                        Object obj29 = realAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1.result;
                        Object obj30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = realAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj29);
                            HomeResult homeResult = (HomeResult) obj;
                            boolean z = homeResult instanceof HomeResult.HomeData;
                            Object obj31 = RetroOrderSelectionResult.Error.INSTANCE;
                            if (z) {
                                AfterpayAppletHome afterpayAppletHome3 = ((HomeResult.HomeData) homeResult).data.home;
                                if (afterpayAppletHome3 != null && (retroOrderSelectionResponse = afterpayAppletHome3.retro_selection_preload) != null) {
                                    obj31 = new RetroOrderSelectionResult.Success(retroOrderSelectionResponse);
                                }
                            } else if (!Intrinsics.areEqual(homeResult, HomeResult.HomeError.INSTANCE)) {
                                if (Intrinsics.areEqual(homeResult, HomeResult.HomeLoading.INSTANCE)) {
                                    obj31 = RetroOrderSelectionResult.Loading.INSTANCE;
                                } else if (!Intrinsics.areEqual(homeResult, HomeResult.Empty.INSTANCE)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    obj31 = RetroOrderSelectionResult.Empty.INSTANCE;
                                }
                            }
                            realAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj31, realAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1) == obj30) {
                                break;
                            }
                        } else if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj29);
                        }
                        break;
                    }
                }
                realAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1 = new RealAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1(this, continuation);
                Object obj292 = realAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1.result;
                Object obj302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = realAfterpayAppletRepository$getPreloadedRetroSelectionData$$inlined$map$1$2$1.label;
                if (i12 != 0) {
                }
                break;
            case 12:
                if (continuation instanceof AfterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1) {
                    afterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1 = (AfterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1) continuation;
                    int i44 = afterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1.label;
                    if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                        afterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                        Object obj32 = afterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1.result;
                        Object obj33 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = afterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj32);
                            FullCashtag fullCashtag = ((PublicProfile) obj).fullCashtag;
                            Object cashtagWithCurrencySymbol = fullCashtag != null ? FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag) : null;
                            if (cashtagWithCurrencySymbol == null) {
                                cashtagWithCurrencySymbol = "";
                            }
                            afterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(cashtagWithCurrencySymbol, afterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1) == obj33) {
                                break;
                            }
                        } else if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj32);
                        }
                        break;
                    }
                }
                afterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1 = new AfterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1(this, continuation);
                Object obj322 = afterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1.result;
                Object obj332 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = afterpayAppletHomePresenter$models$lambda$3$$inlined$map$1$2$1.label;
                if (i13 != 0) {
                }
            case 13:
                if (continuation instanceof AfterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    afterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (AfterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i45 = afterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                        afterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                        Object obj34 = afterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        Object obj35 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = afterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj34);
                            if (obj instanceof AfterpaySearchViewEvent.QueryUpdated) {
                                afterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, afterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj35) {
                                    break;
                                }
                            }
                        } else if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj34);
                        }
                        break;
                    }
                }
                afterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new AfterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj342 = afterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                Object obj352 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = afterpaySearchPresenter$models$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof CompletedOrdersActivitiesManager$activities$$inlined$map$1$2$1) {
                    completedOrdersActivitiesManager$activities$$inlined$map$1$2$1 = (CompletedOrdersActivitiesManager$activities$$inlined$map$1$2$1) continuation;
                    int i46 = completedOrdersActivitiesManager$activities$$inlined$map$1$2$1.label;
                    if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                        completedOrdersActivitiesManager$activities$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                        Object obj36 = completedOrdersActivitiesManager$activities$$inlined$map$1$2$1.result;
                        Object obj37 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = completedOrdersActivitiesManager$activities$$inlined$map$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj36);
                            Activities activities = (Activities) obj;
                            List list2 = activities.recentActivities;
                            if (list2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj38 : list2) {
                                    if (obj38 instanceof OrderActivityData) {
                                        arrayList2.add(obj38);
                                    }
                                }
                                arrayList = new ArrayList();
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (CompletedOrdersActivitiesManager.COMPLETED_STATES.contains(((OrderActivityData) next).orderRowState)) {
                                        arrayList.add(next);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            Object copy$default = Activities.copy$default(activities, arrayList, null, 30);
                            completedOrdersActivitiesManager$activities$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(copy$default, completedOrdersActivitiesManager$activities$$inlined$map$1$2$1) == obj37) {
                                break;
                            }
                        } else if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj36);
                        }
                        break;
                    }
                }
                completedOrdersActivitiesManager$activities$$inlined$map$1$2$1 = new CompletedOrdersActivitiesManager$activities$$inlined$map$1$2$1(this, continuation);
                Object obj362 = completedOrdersActivitiesManager$activities$$inlined$map$1$2$1.result;
                Object obj372 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = completedOrdersActivitiesManager$activities$$inlined$map$1$2$1.label;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof UpcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1) {
                    upcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1 = (UpcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1) continuation;
                    int i47 = upcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1.label;
                    if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                        upcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                        Object obj39 = upcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1.result;
                        Object obj40 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = upcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj39);
                            Activities activities2 = (Activities) obj;
                            List list3 = activities2.recentActivities;
                            if (list3 != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj41 : list3) {
                                    if (obj41 instanceof OrderActivityData) {
                                        arrayList3.add(obj41);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    if (UpcomingOrdersActivitiesManager.UPCOMING_STATES.contains(((OrderActivityData) next2).orderRowState)) {
                                        arrayList4.add(next2);
                                    }
                                }
                                list = CollectionsKt.sortedWith(arrayList4, new FilteredActivitiesManager$activities$lambda$0$1$$inlined$sortedBy$1(1));
                            } else {
                                list = null;
                            }
                            Object copy$default2 = Activities.copy$default(activities2, list, null, 30);
                            upcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(copy$default2, upcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1) == obj40) {
                                break;
                            }
                        } else if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj39);
                        }
                        break;
                    }
                }
                upcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1 = new UpcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1(this, continuation);
                Object obj392 = upcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1.result;
                Object obj402 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = upcomingOrdersActivitiesManager$activities$$inlined$map$1$2$1.label;
                if (i16 != 0) {
                }
            case 16:
                if (continuation instanceof FloatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1) {
                    floatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1 = (FloatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i48 = floatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                        floatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                        Object obj42 = floatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        Object obj43 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = floatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj42);
                            if (!((Boolean) obj).booleanValue()) {
                                floatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, floatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1) == obj43) {
                                    break;
                                }
                            }
                        } else if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj42);
                        }
                        break;
                    }
                }
                floatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1 = new FloatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj422 = floatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
                Object obj432 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = floatingTileRowKt$FloatingTileRow$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i17 != 0) {
                }
            case 17:
                if (continuation instanceof CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1) {
                    cardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1 = (CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1) continuation;
                    int i49 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1.label;
                    if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                        cardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                        Object obj44 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1.result;
                        Object obj45 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i18 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1.label;
                        if (i18 != 0) {
                            SafeTrace.throwOnFailure(obj44);
                            cardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(CardAppMessageViewModel.NotAvailable.INSTANCE, cardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1) == obj45) {
                                break;
                            }
                        } else if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj44);
                        }
                        break;
                    }
                }
                cardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1 = new CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1(this, continuation);
                Object obj442 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1.result;
                Object obj452 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i18 = cardAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1.label;
                if (i18 != 0) {
                }
            case 18:
                if (continuation instanceof CardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (CardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i50 = cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                        cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                        Object obj46 = cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        Object obj47 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i19 = cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i19 != 0) {
                            SafeTrace.throwOnFailure(obj46);
                            if (obj instanceof AppMessageViewEvent.AppMessageActionTaken) {
                                cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj47) {
                                    break;
                                }
                            }
                        } else if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj46);
                        }
                        break;
                    }
                }
                cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new CardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj462 = cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                Object obj472 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i19 = cardAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof CardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (CardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i51 = cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                        cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                        Object obj48 = cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        Object obj49 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i20 = cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i20 != 0) {
                            SafeTrace.throwOnFailure(obj48);
                            if (obj instanceof AppMessageViewEvent.AppMessageViewed) {
                                cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj49) {
                                    break;
                                }
                            }
                        } else if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj48);
                        }
                        break;
                    }
                }
                cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new CardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj482 = cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                Object obj492 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i20 = cardAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i20 != 0) {
                }
            case 20:
                if (continuation instanceof InlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1) {
                    inlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1 = (InlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1) continuation;
                    int i52 = inlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label;
                    if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                        Object obj50 = inlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1.result;
                        Object obj51 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i21 = inlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label;
                        if (i21 != 0) {
                            SafeTrace.throwOnFailure(obj50);
                            if (((InlineMessage) obj) == null) {
                                inlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1) == obj51) {
                                    break;
                                }
                            }
                        } else if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj50);
                        }
                        break;
                    }
                }
                inlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1 = new InlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1(this, continuation);
                Object obj502 = inlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1.result;
                Object obj512 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i21 = inlineAppMessagePresenterHelper$models$lambda$1$$inlined$filter$1$2$1.label;
                if (i21 != 0) {
                }
            case 21:
                if (continuation instanceof InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1) {
                    inlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1 = (InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1) continuation;
                    int i53 = inlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1.label;
                    if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                        Object obj53 = inlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1.result;
                        Object obj54 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i22 = inlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1.label;
                        if (i22 != 0) {
                            SafeTrace.throwOnFailure(obj53);
                            inlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(InlineAppMessageViewModel.NotAvailable.INSTANCE, inlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1) == obj54) {
                                break;
                            }
                        } else if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj53);
                        }
                        break;
                    }
                }
                inlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1 = new InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1(this, continuation);
                Object obj532 = inlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1.result;
                Object obj542 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i22 = inlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$1$2$1.label;
                if (i22 != 0) {
                }
            case 22:
                if (continuation instanceof InlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (InlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i54 = inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                        Object obj55 = inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        Object obj56 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i23 = inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i23 != 0) {
                            SafeTrace.throwOnFailure(obj55);
                            if (obj instanceof AppMessageViewEvent.AppMessageActionTaken) {
                                inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj56) {
                                    break;
                                }
                            }
                        } else if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj55);
                        }
                        break;
                    }
                }
                inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new InlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj552 = inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                Object obj562 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i23 = inlineAppMessagePresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i23 != 0) {
                }
            case 23:
                if (continuation instanceof InlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (InlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i55 = inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                        Object obj57 = inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        Object obj58 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i24 = inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i24 != 0) {
                            SafeTrace.throwOnFailure(obj57);
                            if (obj instanceof AppMessageViewEvent.AppMessageViewed) {
                                inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj58) {
                                    break;
                                }
                            }
                        } else if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj57);
                        }
                        break;
                    }
                }
                inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new InlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj572 = inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                Object obj582 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i24 = inlineAppMessagePresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i24 != 0) {
                }
            case 24:
                if (continuation instanceof InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1) {
                    inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1 = (InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1) continuation;
                    int i56 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1.label;
                    if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                        Object obj59 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1.result;
                        Object obj60 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i25 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1.label;
                        if (i25 != 0) {
                            SafeTrace.throwOnFailure(obj59);
                            inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(InlineAppMessageV2ViewModel.NotAvailable.INSTANCE, inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1) == obj60) {
                                break;
                            }
                        } else if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj59);
                        }
                        break;
                    }
                }
                inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1 = new InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1(this, continuation);
                Object obj592 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1.result;
                Object obj602 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i25 = inlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$1$2$1.label;
                if (i25 != 0) {
                }
            case 25:
                if (continuation instanceof InlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    inlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (InlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i57 = inlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                        Object obj61 = inlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        Object obj63 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i26 = inlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i26 != 0) {
                            SafeTrace.throwOnFailure(obj61);
                            if (obj instanceof AppMessageViewEvent.AppMessageUndoDismiss) {
                                inlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj63) {
                                    break;
                                }
                            }
                        } else if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj61);
                        }
                        break;
                    }
                }
                inlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new InlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj612 = inlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                Object obj632 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i26 = inlineAppMessageV2PresenterHelper$processEvents$2$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i26 != 0) {
                }
            case 26:
                if (continuation instanceof InlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (InlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i58 = inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                        Object obj64 = inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        Object obj65 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i27 = inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i27 != 0) {
                            SafeTrace.throwOnFailure(obj64);
                            if (obj instanceof AppMessageViewEvent.AppMessageTemporarilyDismiss) {
                                inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj65) {
                                    break;
                                }
                            }
                        } else if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj64);
                        }
                        break;
                    }
                }
                inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new InlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj642 = inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                Object obj652 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i27 = inlineAppMessageV2PresenterHelper$processEvents$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i27 != 0) {
                }
            case 27:
                if (continuation instanceof InlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (InlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i59 = inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                        Object obj66 = inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        Object obj67 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i28 = inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i28 != 0) {
                            SafeTrace.throwOnFailure(obj66);
                            if (obj instanceof AppMessageViewEvent.AppMessageActionTaken) {
                                inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj67) {
                                    break;
                                }
                            }
                        } else if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj66);
                        }
                        break;
                    }
                }
                inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new InlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj662 = inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                Object obj672 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i28 = inlineAppMessageV2PresenterHelper$processEvents$2$3$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i28 != 0) {
                }
            case 28:
                if (continuation instanceof InlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1) {
                    inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1 = (InlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1) continuation;
                    int i60 = inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                    if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                        inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                        Object obj68 = inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                        Object obj69 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i29 = inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                        if (i29 != 0) {
                            SafeTrace.throwOnFailure(obj68);
                            if (obj instanceof AppMessageViewEvent.AppMessageViewed) {
                                inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1.label = 1;
                                if (flowCollector.emit(obj, inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1) == obj69) {
                                    break;
                                }
                            }
                        } else if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj68);
                        }
                        break;
                    }
                }
                inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1 = new InlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1(this, continuation);
                Object obj682 = inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1.result;
                Object obj692 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i29 = inlineAppMessageV2PresenterHelper$processEvents$2$4$invokeSuspend$$inlined$filterIsInstance$1$2$1.label;
                if (i29 != 0) {
                }
            default:
                if (continuation instanceof BalanceHomePresenter$models$lambda$14$$inlined$map$1$2$1) {
                    balanceHomePresenter$models$lambda$14$$inlined$map$1$2$1 = (BalanceHomePresenter$models$lambda$14$$inlined$map$1$2$1) continuation;
                    int i61 = balanceHomePresenter$models$lambda$14$$inlined$map$1$2$1.label;
                    if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                        balanceHomePresenter$models$lambda$14$$inlined$map$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                        Object obj70 = balanceHomePresenter$models$lambda$14$$inlined$map$1$2$1.result;
                        Object obj71 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i30 = balanceHomePresenter$models$lambda$14$$inlined$map$1$2$1.label;
                        if (i30 != 0) {
                            SafeTrace.throwOnFailure(obj70);
                            Object valueOf = Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) obj).enabled());
                            balanceHomePresenter$models$lambda$14$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf, balanceHomePresenter$models$lambda$14$$inlined$map$1$2$1) == obj71) {
                                break;
                            }
                        } else if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj70);
                        }
                        break;
                    }
                }
                balanceHomePresenter$models$lambda$14$$inlined$map$1$2$1 = new BalanceHomePresenter$models$lambda$14$$inlined$map$1$2$1(this, continuation);
                Object obj702 = balanceHomePresenter$models$lambda$14$$inlined$map$1$2$1.result;
                Object obj712 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i30 = balanceHomePresenter$models$lambda$14$$inlined$map$1$2$1.label;
                if (i30 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
