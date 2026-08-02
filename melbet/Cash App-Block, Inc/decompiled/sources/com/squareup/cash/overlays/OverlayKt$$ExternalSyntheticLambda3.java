package com.squareup.cash.overlays;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.activity.compose.ActivityResultLauncherHolder;
import androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda2;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.video.Recorder;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.CompositionLocalContext;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.emoji2.text.MetadataRepo;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.internal.NavControllerImpl;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.local.db.Local_tab_content;
import app.cash.local.viewmodels.CartItemCounterViewEvent;
import app.cash.local.viewmodels.LocalBottomModalViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewEvent;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneyChanged;
import com.squareup.cash.blockers.views.ScannerTextSwapper;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardTextureState;
import com.squareup.cash.card.onboarding.CardsKt;
import com.squareup.cash.common.composeui.SegmentedCircleInteractableState;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageViewKt;
import com.squareup.cash.db.contacts.AliasSyncState;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.RecipientConfig$Adapter;
import com.squareup.cash.db2.contacts.Alias$Adapter;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import com.squareup.cash.directory_ui.views.MooncakeHeaderView;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel;
import com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import com.squareup.cash.filament.BaseModelView;
import com.squareup.cash.formview.components.FormElementViewBuilder;
import com.squareup.cash.formview.components.FormElementViewBuilder$toView$46;
import com.squareup.cash.formview.components.arcade.AccessoryCheckedState;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$4$4$1$1;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.mooncake.compose_ui.components.AlertDialogButton;
import com.squareup.cash.mooncake.compose_ui.components.IconContainerView;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.offers.db.OffersSheet;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.profile.viewmodels.OpenSourceViewModel;
import com.squareup.cash.profile.views.BadgeNameKt;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda7;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountChangedSource;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountEvent;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.Hero3DCardViewKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetResponse;
import com.squareup.protos.cash.postcard.CardRenderingInfo;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.scannerview.ScannerView;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.util.coroutines.StateFlowKt;
import com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class OverlayKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ OverlayKt$$ExternalSyntheticLambda3(String str, String str2, String str3, String str4, InstrumentQueries instrumentQueries) {
        this.$r8$classId = 14;
        AliasSyncState aliasSyncState = AliasSyncState.SYNCED;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = str4;
        this.f$4 = instrumentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x055a  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.platform.ViewConfiguration] */
    /* JADX WARN: Type inference failed for: r8v35 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List list;
        boolean z;
        PointF pointF;
        int i = this.$r8$classId;
        int i2 = 4;
        int i3 = 3;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        Object obj2 = this.f$2;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                OverlayLayer overlayLayer = (OverlayLayer) obj6;
                MutableTransitionState mutableTransitionState = (MutableTransitionState) obj2;
                ((DisposableEffectScope) obj).getClass();
                CoroutineScope coroutineScope = overlayLayer.getCoroutineScope();
                MetadataRepo metadataRepo = new MetadataRepo();
                metadataRepo.mEmojiCharArray = mutableTransitionState;
                metadataRepo.mRootNode = (CompositionLocalContext) obj4;
                metadataRepo.mTypeface = (ComposableLambdaImpl) obj3;
                metadataRepo.mMetadataList = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new OffersHomeV2Kt$$ExternalSyntheticLambda7(10, (Context) obj5, metadataRepo));
                break;
            case 1:
                ActivityResultLauncherHolder activityResultLauncherHolder = (ActivityResultLauncherHolder) obj6;
                activityResultLauncherHolder.launcher = ((ActivityResultRegistry) obj5).register((String) obj2, (ActivityResultContract) obj4, new ActivityResultRegistryKt$$ExternalSyntheticLambda2((MutableState) obj3, 0));
                break;
            case 2:
                MouseWheelScrollingLogic mouseWheelScrollingLogic = (MouseWheelScrollingLogic) obj6;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj5;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj2;
                ScrollingLogic scrollingLogic = (ScrollingLogic) obj4;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                float floatValue = ((Float) obj).floatValue();
                MouseWheelScrollingLogic.MouseWheelScrollDelta sumOrNull = MouseWheelScrollingLogic.sumOrNull(mouseWheelScrollingLogic.channel);
                if (sumOrNull != null) {
                    Recorder.AnonymousClass4 anonymousClass4 = mouseWheelScrollingLogic.velocityTracker;
                    long j = sumOrNull.timeMillis;
                    long j2 = sumOrNull.value;
                    ((VelocityTracker1D) anonymousClass4.val$audioErrorConsumer).addDataPoint(j, Float.intBitsToFloat((int) (j2 >> 32)));
                    ((VelocityTracker1D) anonymousClass4.this$0).addDataPoint(j, Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)));
                    MouseWheelScrollingLogic.MouseWheelScrollDelta plus = ((MouseWheelScrollingLogic.MouseWheelScrollDelta) ref$ObjectRef.element).plus(sumOrNull);
                    ref$ObjectRef.element = plus;
                    ref$FloatRef.element = scrollingLogic.m249toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m246reverseIfNeededMKHz9U(plus.value));
                    ref$BooleanRef.element = !Draggable2DKt.access$isLowScrollingDelta(r2 - floatValue);
                }
                break;
            case 3:
                OffsetMapping offsetMapping = (OffsetMapping) obj5;
                TextFieldValue textFieldValue = (TextFieldValue) obj2;
                LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) obj4;
                Brush brush = (Brush) obj3;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.drawContent();
                float floatValue2 = ((CursorAnimationState) obj6).cursorAlpha$delegate.getFloatValue();
                if (floatValue2 != RecyclerView.DECELERATION_RATE) {
                    long j3 = textFieldValue.selection;
                    int i4 = TextRange.$r8$clinit;
                    int originalToTransformed = offsetMapping.originalToTransformed((int) (j3 >> 32));
                    TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                    Rect cursorRect = layoutResult != null ? layoutResult.value.getCursorRect(originalToTransformed) : new Rect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                    float floor = (float) Math.floor(layoutNodeDrawScope.mo236toPx0680j_4(2.0f));
                    if (floor < 1.0f) {
                        floor = 1.0f;
                    }
                    float f = floor / 2.0f;
                    float f2 = cursorRect.left + f;
                    float intBitsToFloat = Float.intBitsToFloat((int) (layoutNodeDrawScope.canvasDrawScope.mo753getSizeNHjbRc() >> 32)) - f;
                    if (f2 > intBitsToFloat) {
                        f2 = intBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float floor2 = ((int) floor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    DrawScope.m741drawLine1RTmtNc$default(layoutNodeDrawScope, brush, (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(cursorRect.top) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(cursorRect.bottom) & BodyPartID.bodyIdMax), floor, floatValue2, 432);
                }
                break;
            case 4:
                LegacyTextInputMethodRequest legacyTextInputMethodRequest = (LegacyTextInputMethodRequest) obj;
                LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode = ((AndroidLegacyPlatformTextInputServiceAdapter) obj5).textInputModifierNode;
                legacyTextInputMethodRequest.state = (TextFieldValue) obj6;
                legacyTextInputMethodRequest.imeOptions = (ImeOptions) obj2;
                legacyTextInputMethodRequest.onEditCommand = (MenuKt$$ExternalSyntheticLambda0) obj4;
                legacyTextInputMethodRequest.onImeActionPerformed = (Function1) obj3;
                legacyTextInputMethodRequest.legacyTextFieldState = legacyAdaptingPlatformTextInputModifierNode != null ? legacyAdaptingPlatformTextInputModifierNode.legacyTextFieldState : null;
                legacyTextInputMethodRequest.textFieldSelectionManager = legacyAdaptingPlatformTextInputModifierNode != null ? legacyAdaptingPlatformTextInputModifierNode.textFieldSelectionManager : null;
                legacyTextInputMethodRequest.viewConfiguration = legacyAdaptingPlatformTextInputModifierNode != null ? (ViewConfiguration) DepthSortedSetKt.currentValueOf(legacyAdaptingPlatformTextInputModifierNode, CompositionLocalsKt.LocalViewConfiguration) : 0;
                break;
            case 5:
                int intValue = ((Integer) obj).intValue();
                PaddingValuesImpl paddingValuesImpl = DatePickerKt.DatePickerModeTogglePadding;
                ((MutableState) obj5).setValue(Boolean.valueOf(!((Boolean) r4.getValue()).booleanValue()));
                JobKt.launch$default((CoroutineScope) obj6, null, null, new GovernmentIdFeed$analyze$5((LazyListState) obj2, intValue, (IntRange) obj4, (CalendarMonth) obj3, (Continuation) null, 2), 3);
                break;
            case 6:
                ArrayList arrayList = (ArrayList) obj5;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                NavControllerImpl navControllerImpl = (NavControllerImpl) obj4;
                Bundle bundle = (Bundle) obj3;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                navBackStackEntry.getClass();
                ((Ref$BooleanRef) obj6).element = true;
                int indexOf = arrayList.indexOf(navBackStackEntry);
                if (indexOf != -1) {
                    int i5 = indexOf + 1;
                    list = arrayList.subList(ref$IntRef.element, i5);
                    ref$IntRef.element = i5;
                } else {
                    list = EmptyList.INSTANCE;
                }
                navControllerImpl.addEntryToBackStack(navBackStackEntry.destination, bundle, navBackStackEntry, list);
                break;
            case 7:
                LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel = (LocalBrandLocationCheckoutViewModel) obj6;
                TextFieldState textFieldState = (TextFieldState) obj5;
                TextFieldState textFieldState2 = (TextFieldState) obj2;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj4;
                Function1 function1 = (Function1) obj3;
                LocalBottomModalViewEvent localBottomModalViewEvent = (LocalBottomModalViewEvent) obj;
                localBottomModalViewEvent.getClass();
                if (!(localBottomModalViewEvent instanceof CartItemCounterViewEvent.Decrement) && !(localBottomModalViewEvent instanceof CartItemCounterViewEvent.Increment) && !(localBottomModalViewEvent instanceof CartItemCounterViewEvent.Trash) && !(localBottomModalViewEvent instanceof LocalBottomModalViewEvent.BottomModalLinkClicked)) {
                    if (localBottomModalViewEvent instanceof LocalBottomModalViewEvent.CtaClicked) {
                        OrderBuilderModel.BuyerInfo buyerInfo = localBrandLocationCheckoutViewModel.buyerInfo;
                        if (!(buyerInfo instanceof OrderBuilderModel.BuyerInfo.UiReady.Validated)) {
                            buyerInfo = new OrderBuilderModel.BuyerInfo.Unvalidated(textFieldState.getValue$foundation().text.toString(), textFieldState2.getValue$foundation().text.toString(), localBrandLocationCheckoutViewModel.buyerInfo.getLegalConsent());
                        }
                        if (delegatingSoftwareKeyboardController != null) {
                            delegatingSoftwareKeyboardController.hide();
                        }
                        function1.invoke(new LocalBrandLocationCheckoutViewEvent.PlaceOrderClicked(buyerInfo));
                        break;
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("Unexpected operation.");
                    break;
                }
                break;
            case 8:
                LocalOpenTabCheckoutViewModel localOpenTabCheckoutViewModel = (LocalOpenTabCheckoutViewModel) obj6;
                TextFieldState textFieldState3 = (TextFieldState) obj5;
                TextFieldState textFieldState4 = (TextFieldState) obj2;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) obj4;
                Function1 function12 = (Function1) obj3;
                LocalBottomModalViewEvent localBottomModalViewEvent2 = (LocalBottomModalViewEvent) obj;
                localBottomModalViewEvent2.getClass();
                if (localBottomModalViewEvent2 instanceof LocalBottomModalViewEvent.CtaClicked) {
                    OrderBuilderModel.BuyerInfo buyerInfo2 = localOpenTabCheckoutViewModel.buyerInfo;
                    if (!(buyerInfo2 instanceof OrderBuilderModel.BuyerInfo.UiReady.Validated)) {
                        buyerInfo2 = new OrderBuilderModel.BuyerInfo.Unvalidated(textFieldState3.getValue$foundation().text.toString(), textFieldState4.getValue$foundation().text.toString(), localOpenTabCheckoutViewModel.buyerInfo.getLegalConsent());
                    }
                    if (delegatingSoftwareKeyboardController2 != null) {
                        delegatingSoftwareKeyboardController2.hide();
                    }
                    function12.invoke(new LocalOpenTabCheckoutViewEvent.PlaceOrderClicked(buyerInfo2));
                    break;
                } else if (!(localBottomModalViewEvent2 instanceof CartItemCounterViewEvent.Decrement) && !(localBottomModalViewEvent2 instanceof CartItemCounterViewEvent.Increment) && !(localBottomModalViewEvent2 instanceof CartItemCounterViewEvent.Trash) && !(localBottomModalViewEvent2 instanceof LocalBottomModalViewEvent.BottomModalLinkClicked)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("Unexpected operation.");
                    break;
                }
                break;
            case 9:
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                AvatarsKt.activityEmbeddedItems(lazyListScope, (ActivityEmbeddedViewModel) obj6, (Function1) obj5, (Function3) obj2, (Function2) obj4, (Function3) obj3);
                break;
            case 10:
                AmountConfig amountConfig = (AmountConfig) obj6;
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj5;
                Shaker shaker = (Shaker) obj2;
                MutableState mutableState = (MutableState) obj4;
                Function1 function13 = (Function1) obj3;
                AmountEvent amountEvent = (AmountEvent) obj;
                amountEvent.getClass();
                if (amountEvent instanceof AmountEvent.AmountChanged) {
                    AmountEvent.AmountChanged amountChanged = (AmountEvent.AmountChanged) amountEvent;
                    AmountChangedSource amountChangedSource = amountChanged.source;
                    if (Intrinsics.areEqual(amountChangedSource, AmountChangedSource.ConfigReset.INSTANCE)) {
                        break;
                    } else {
                        if (Intrinsics.areEqual(amountChangedSource, AmountChangedSource.DigitInput.INSTANCE)) {
                            mutableState.setValue(Boolean.TRUE);
                        }
                        AmountConfig.MoneyConfig moneyConfig = amountConfig instanceof AmountConfig.MoneyConfig ? (AmountConfig.MoneyConfig) amountConfig : null;
                        if (moneyConfig != null) {
                            function13.invoke(new AmountPickerViewEvent$Full$MoneyChanged(new Money(Long.valueOf(MathKt__MathJVMKt.roundToLong(Double.parseDouble(amountChanged.rawAmount) * 100.0d)), moneyConfig.currency, 4)));
                        }
                    }
                } else if (!(amountEvent instanceof AmountEvent.InvalidChange)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    if (realCashVibrator != null) {
                        realCashVibrator.error();
                    }
                    shaker.shake();
                }
                break;
            case 11:
                ScannerView scannerView = (ScannerView) obj6;
                Density density = (Density) obj5;
                ((Context) obj).getClass();
                scannerView.setCallback(new n(26, (Function1) obj2, (ParcelableSnapshotMutableIntState) obj4, (MutableState) obj3));
                scannerView.setClipToPadding(false);
                TextSetter textSetter = scannerView.textSetter;
                TextThemeInfo textThemeInfo = TextStyles.mainTitle;
                textSetter.getClass();
                ScannerTextSwapper scannerTextSwapper = (ScannerTextSwapper) textSetter.scannerText;
                TextSwitcher textSwitcher = (TextSwitcher) textSetter.textSwitcher;
                textThemeInfo.getClass();
                TextView textView = (TextView) textSetter.textView;
                if (textView != null) {
                    Strings.applyStyle(textView, textThemeInfo);
                }
                if (textSwitcher != null) {
                    Iterator it = new ViewGroupKt$children$1(textSwitcher).iterator();
                    while (true) {
                        ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
                        if (viewGroupKt$iterator$1.hasNext()) {
                            View view = (View) viewGroupKt$iterator$1.next();
                            TextView textView2 = view instanceof TextView ? (TextView) view : null;
                            if (textView2 != null) {
                                Strings.applyStyle(textView2, textThemeInfo);
                            }
                        }
                    }
                }
                if (scannerTextSwapper != null) {
                    View childAt = scannerTextSwapper.getChildAt(scannerTextSwapper.currentChild);
                    childAt.getClass();
                    Strings.applyStyle((TextView) childAt, textThemeInfo);
                    View childAt2 = scannerTextSwapper.getChildAt(scannerTextSwapper.currentChild == 0 ? 1 : 0);
                    childAt2.getClass();
                    Strings.applyStyle((TextView) childAt2, textThemeInfo);
                }
                if (textView != null) {
                    textView.setGravity(81);
                }
                if (textSwitcher != null) {
                    Iterator it2 = new ViewGroupKt$children$1(textSwitcher).iterator();
                    while (true) {
                        ViewGroupKt$iterator$1 viewGroupKt$iterator$12 = (ViewGroupKt$iterator$1) it2;
                        if (viewGroupKt$iterator$12.hasNext()) {
                            View view2 = (View) viewGroupKt$iterator$12.next();
                            TextView textView3 = view2 instanceof TextView ? (TextView) view2 : null;
                            if (textView3 != null) {
                                textView3.setGravity(81);
                            }
                        }
                    }
                }
                if (scannerTextSwapper != null) {
                    scannerTextSwapper.setGravity(81);
                }
                Views.updateMargins$default(scannerView.textLayout, 0, (int) density.mo236toPx0680j_4(52.0f), 0, 0, 13);
                scannerView.overlayView.setSquareOutlineCornerRadius(R.dimen.sv_outline_square_corner_radius_arcade);
                LegacySessionConfig legacySessionConfig = scannerView.flashView;
                legacySessionConfig.isLegacy = false;
                legacySessionConfig.setVisibility(8);
                break;
            case 12:
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) obj6;
                SegmentedCircleInteractableState segmentedCircleInteractableState = (SegmentedCircleInteractableState) obj5;
                Function0 function0 = (Function0) obj2;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj4;
                PointerInputScope pointerInputScope = (PointerInputScope) obj3;
                Offset offset = (Offset) obj;
                Offset offset2 = (Offset) segmentedCircleInteractableState.center$delegate.getValue();
                if (offset2 != null) {
                    long j4 = offset2.packedValue;
                    long j5 = offset.packedValue;
                    if (((float) Math.sqrt(((float) Math.pow(Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (j4 >> 32)), 2.0d)) + ((float) Math.pow(Float.intBitsToFloat((int) (j5 & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (j4 & BodyPartID.bodyIdMax)), 2.0d)))) < ((SuspendingPointerInputModifierNodeImpl) pointerInputScope).getDensity() * ((Dp) segmentedCircleInteractableState.radius$delegate.getValue()).value) {
                        z = true;
                        ref$BooleanRef2.element = z;
                        if (z) {
                            function0.invoke();
                            ref$ObjectRef2.element = BitcoinP2pConversionPercentageViewKt.m3509access$angleAndQuadrant3MmeM6k((int) (((SuspendingPointerInputModifierNodeImpl) pointerInputScope).boundsSize >> 32), offset.packedValue).quadrant;
                        }
                        break;
                    }
                }
                z = false;
                ref$BooleanRef2.element = z;
                if (z) {
                }
            case 13:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, (String) obj6, 1, (String) obj5);
                androidStatement.bindString(2, (String) obj2);
                androidStatement.bindString(3, (String) obj4);
                androidStatement.bindLong(4, (Long) obj3);
                break;
            case 14:
                AliasSyncState aliasSyncState = AliasSyncState.SYNCED;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement2, 0, (String) obj6, 1, (String) obj5);
                androidStatement2.bindString(2, (String) obj2);
                androidStatement2.bindString(3, (String) obj4);
                androidStatement2.bindString(4, (String) ((Alias$Adapter) ((InstrumentQueries) obj3).instrumentAdapter).sync_stateAdapter.encode(aliasSyncState));
                androidStatement2.bindString(5, null);
                break;
            case 15:
                StatementCoverage statementCoverage = (StatementCoverage) obj4;
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj3;
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement3, 0, (String) obj6, 1, (String) obj5);
                androidStatement3.bindString(2, (String) obj2);
                androidStatement3.bindBytes(3, statementCoverage != null ? (byte[]) ((Local_tab_content.Adapter) instrumentQueries.instrumentAdapter).responseAdapter.encode(statementCoverage) : null);
                break;
            case 16:
                String str = (String) obj2;
                String str2 = (String) obj4;
                Function1 function14 = (Function1) obj3;
                AlertDialogView alertDialogView = (AlertDialogView) obj;
                alertDialogView.getClass();
                alertDialogView.setTitle((String) obj6);
                alertDialogView.setMessage((String) obj5);
                if (str != null) {
                    alertDialogView.setPositiveButton(str, new ComposeDialogKt$$ExternalSyntheticLambda4(25, function14));
                }
                if (str2 != null) {
                    alertDialogView.setNegativeButton(str2, new ComposeDialogKt$$ExternalSyntheticLambda4(26, function14));
                }
                alertDialogView.dialog.buttonsContainer.updateVisibleButtons(str != null, str2 != null);
                break;
            case 17:
                Density density2 = (Density) obj2;
                PaddingValuesImpl paddingValuesImpl2 = (PaddingValuesImpl) obj4;
                LayoutDirection layoutDirection = (LayoutDirection) obj3;
                MooncakeHeaderView mooncakeHeaderView = (MooncakeHeaderView) obj;
                mooncakeHeaderView.getClass();
                mooncakeHeaderView.setModel((DirectoryListItem.Header) obj6, (Ui.EventReceiver) obj5);
                mooncakeHeaderView.setPadding((int) density2.mo236toPx0680j_4(SpacerKt.calculateStartPadding(paddingValuesImpl2, layoutDirection)), (int) density2.mo236toPx0680j_4(paddingValuesImpl2.top), (int) density2.mo236toPx0680j_4(SpacerKt.calculateEndPadding(paddingValuesImpl2, layoutDirection)), (int) density2.mo236toPx0680j_4(paddingValuesImpl2.bottom));
                break;
            case 18:
                AddPayerCustomersViewModel.Loaded loaded = (AddPayerCustomersViewModel.Loaded) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj2;
                String str5 = (String) obj4;
                Function1 function15 = (Function1) obj3;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                boolean z5 = loaded.isSearching;
                List list2 = loaded.mostRecent;
                boolean z6 = loaded.isToggleSaving;
                if (z5) {
                    LazyListScope.item$default(lazyListScope2, null, null, AddPayerCustomersViewKt.lambda$2126136727, 3);
                } else if (!loaded.searchResults.isEmpty()) {
                    AddPayerCustomersViewKt.payerSection(lazyListScope2, loaded.searchResults, str3, "search", false, new ComposeDialogKt$$ExternalSyntheticLambda3(8, function15), !z6);
                } else if (loaded.searchQuery.length() <= 0) {
                    boolean z7 = !z6;
                    AddPayerCustomersViewKt.payerSection(lazyListScope2, loaded.mostRecent, str4, "recent", false, new ComposeDialogKt$$ExternalSyntheticLambda3(9, function15), z7);
                    List list3 = list2;
                    AddPayerCustomersViewKt.payerSection(lazyListScope2, loaded.currentCustomers, str5, "current", !list3.isEmpty(), new ComposeDialogKt$$ExternalSyntheticLambda3(10, function15), z7);
                    AddPayerCustomersViewKt.payerSection(lazyListScope2, loaded.allContacts, loaded.allContactsSectionTitle, "contact", (list3.isEmpty() && loaded.currentCustomers.isEmpty()) ? false : true, new ComposeDialogKt$$ExternalSyntheticLambda3(11, function15), z7);
                }
                break;
            case 19:
                final Activity activity = (Activity) obj6;
                final MutableState mutableState2 = (MutableState) obj5;
                final FidesmoDeprovisioningPresenter fidesmoDeprovisioningPresenter = (FidesmoDeprovisioningPresenter) obj4;
                final Set set = (Set) obj3;
                ((DisposableEffectScope) obj).getClass();
                final int i6 = 1;
                final Object obj7 = this.f$2;
                break;
            case 20:
                final Activity activity2 = (Activity) obj6;
                final MutableState mutableState3 = (MutableState) obj5;
                final FidesmoProvisioningPresenter fidesmoProvisioningPresenter = (FidesmoProvisioningPresenter) obj4;
                final Set set2 = (Set) obj3;
                ((DisposableEffectScope) obj).getClass();
                final int i7 = 0;
                final Object obj8 = this.f$2;
                break;
            case 21:
                FormBlocker.Element.CellDefaultElement cellDefaultElement = (FormBlocker.Element.CellDefaultElement) obj6;
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj5;
                String str6 = (String) obj2;
                FormElementViewBuilder$toView$46 formElementViewBuilder$toView$46 = (FormElementViewBuilder$toView$46) obj4;
                FormElementViewBuilder formElementViewBuilder = (FormElementViewBuilder) obj3;
                FormViewEvent formViewEvent = (FormViewEvent) obj;
                formViewEvent.getClass();
                if (formViewEvent instanceof FormViewEvent.UpdateResultEvent.CellDefaultChecked) {
                    String str7 = cellDefaultElement.selection_group_id;
                    if (str7 != null) {
                        snapshotStateMap.put(str7, str6);
                    }
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = formElementViewBuilder$toView$46.checked;
                    AccessoryCheckedState accessoryCheckedState = (AccessoryCheckedState) parcelableSnapshotMutableState.getValue();
                    parcelableSnapshotMutableState.setValue(accessoryCheckedState != null ? accessoryCheckedState.withChecked(((FormViewEvent.UpdateResultEvent.CellDefaultChecked) formViewEvent).checked) : null);
                    formElementViewBuilder$toView$46.updateSingleSelectionCheckedState();
                }
                StateFlowKt.emitOrThrow(formElementViewBuilder.viewEvents, formViewEvent);
                break;
            case 22:
                Function2 function2 = (Function2) obj6;
                String str8 = (String) obj5;
                String str9 = (String) obj2;
                AlertDialogButton alertDialogButton = (AlertDialogButton) obj4;
                AlertDialogButton alertDialogButton2 = (AlertDialogButton) obj3;
                AlertDialogView alertDialogView2 = (AlertDialogView) obj;
                alertDialogView2.getClass();
                AlertDialogView.Layout layout = alertDialogView2.dialog;
                LinearLayout linearLayout = layout.titleAndContentView;
                if (function2 != null) {
                    Context context = alertDialogView2.getContext();
                    context.getClass();
                    linearLayout.addView(new IconContainerView(context, function2), 0);
                } else {
                    View childAt3 = linearLayout.getChildAt(0);
                    IconContainerView iconContainerView = childAt3 instanceof IconContainerView ? (IconContainerView) childAt3 : null;
                    if (iconContainerView != null) {
                        linearLayout.removeView(iconContainerView);
                    }
                }
                alertDialogView2.setTitle(str8);
                alertDialogView2.setMessage(str9);
                layout.buttonsContainer.updateVisibleButtons(false, false);
                if (alertDialogButton != null) {
                    alertDialogView2.setNegativeButton(alertDialogButton.text, alertDialogButton.onClick);
                }
                if (alertDialogButton2 != null) {
                    alertDialogView2.setPositiveButton(alertDialogButton2.text, alertDialogButton2.onClick);
                }
                if (alertDialogButton2 != null || alertDialogButton != null) {
                    break;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("must have at least one button");
                    break;
                }
            case 23:
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj6;
                OfferType offerType = (OfferType) obj3;
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindBytes(0, (byte[]) ((OffersSheet.Adapter) gpsConfigQueries.gpsConfigAdapter).sheet_keyAdapter.encode((OfferSheetKey) obj5));
                androidStatement4.bindLong(1, (Long) obj2);
                OffersSheet.Adapter adapter = (OffersSheet.Adapter) gpsConfigQueries.gpsConfigAdapter;
                androidStatement4.bindBytes(2, (byte[]) adapter.offers_sheet_responseAdapter.encode((OffersSheetResponse) obj4));
                androidStatement4.bindString(3, offerType != null ? (String) adapter.offer_typeAdapter.encode(offerType) : null);
                break;
            case 24:
                OpenSourceViewModel openSourceViewModel = (OpenSourceViewModel) obj6;
                Function1 function16 = (Function1) obj3;
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                LazyListScope.item$default(lazyListScope3, null, null, new ComposableLambdaImpl(new SheetKt$$ExternalSyntheticLambda5(i3, (Ref$ObjectRef) obj2, (MutableState) obj4, (Context) obj5), true, 1486717785), 3);
                if (openSourceViewModel instanceof OpenSourceViewModel.Ready) {
                    for (Map.Entry entry : ((OpenSourceViewModel.Ready) openSourceViewModel).artifacts.entrySet()) {
                        String str10 = (String) entry.getKey();
                        List list4 = (List) entry.getValue();
                        LazyListScope.stickyHeader$default(lazyListScope3, null, new ComposableLambdaImpl(new OpenSourceKt$$ExternalSyntheticLambda5(str10, z4 ? 1 : 0), true, -1788151880), 3);
                        LazyListScope.items$default(lazyListScope3, list4.size(), new OpenSourceKt$$ExternalSyntheticLambda6(list4, z3 ? 1 : 0), new ComposableLambdaImpl(new OpenSourceKt$$ExternalSyntheticLambda7(z2 ? 1 : 0, function16, list4), true, -853946251), 4);
                    }
                } else if (Intrinsics.areEqual(openSourceViewModel, OpenSourceViewModel.Loading.INSTANCE)) {
                    LazyListScope.item$default(lazyListScope3, null, null, BadgeNameKt.f596lambda$835749766, 3);
                } else if (!Intrinsics.areEqual(openSourceViewModel, OpenSourceViewModel.Error.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    LazyListScope.item$default(lazyListScope3, null, null, BadgeNameKt.f594lambda$422843559, 3);
                }
                break;
            case 25:
                String str11 = (String) obj6;
                GpsConfigQueries gpsConfigQueries2 = (GpsConfigQueries) obj3;
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement5, 0, str11, 1, str11);
                androidStatement5.bindString(2, str11);
                androidStatement5.bindString(3, str11);
                androidStatement5.bindBytes(4, (byte[]) ((RecipientConfig$Adapter) gpsConfigQueries2.gpsConfigAdapter).pay_dataAdapter.encode((Money) obj5));
                androidStatement5.bindBytes(5, (byte[]) ((RecipientConfig$Adapter) gpsConfigQueries2.gpsConfigAdapter).request_dataAdapter.encode((Money) obj2));
                androidStatement5.bindLong(6, (Long) obj4);
                break;
            case 26:
                CardRenderingInfo cardRenderingInfo = (CardRenderingInfo) obj5;
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj4;
                GpsConfigQueries gpsConfigQueries3 = (GpsConfigQueries) obj3;
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                androidStatement6.getClass();
                androidStatement6.bindString(0, (String) obj6);
                androidStatement6.bindBytes(1, cardRenderingInfo != null ? (byte[]) ((Local_tab_content.Adapter) gpsConfigQueries3.gpsConfigAdapter).responseAdapter.encode(cardRenderingInfo) : null);
                androidStatement6.bindBoolean(2, bool);
                androidStatement6.bindBoolean(3, bool2);
                break;
            case 27:
                CardTextureState cardTextureState = (CardTextureState) obj6;
                Function0<Unit> function02 = (Function0) obj5;
                MutableState mutableState4 = (MutableState) obj2;
                Function1 function17 = (Function1) obj4;
                MutableState mutableState5 = (MutableState) obj3;
                Context context2 = (Context) obj;
                context2.getClass();
                CardModelView cardModelView = new CardModelView(context2, null);
                cardModelView.setAlpha(RecyclerView.DECELERATION_RATE);
                if (cardTextureState != null) {
                    cardModelView.updateTextureState(cardTextureState, (CardModelView) mutableState4.getValue());
                }
                cardModelView.setOnError(function02);
                BaseModelView.setCameraPosition$default(cardModelView, 0.0d, 0.0d, 8.87d, 3, null);
                cardModelView.setCameraFov(25.0d);
                cardModelView.setOnFirstFrame(new HeroCardViewKt$$ExternalSyntheticLambda9(i2, function17, cardModelView, mutableState5));
                break;
            case 28:
                State state = (State) obj2;
                State state2 = (State) obj4;
                MutableState mutableState6 = (MutableState) obj3;
                CardModelView cardModelView2 = (CardModelView) obj;
                cardModelView2.getClass();
                ((MutableState) obj6).setValue(cardModelView2);
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) ((MutableState) obj5).getValue();
                if (heroCardDetails != null) {
                    if (heroCardDetails.customizationImage == null || ((Bitmap) state.getValue()) != null) {
                        cardModelView2.setCustomizationMask((Bitmap) state.getValue());
                    }
                    cardModelView2.setIndicatorColor(ColorKt.m694toArgb8_81llA(Color.m675copywmQWz5c$default(0.3f, Color.Black, 14)));
                    Bitmap bitmap = (Bitmap) state2.getValue();
                    if (bitmap != null) {
                        cardModelView2.setIcon(bitmap);
                    }
                    CardModelView.ViewModel viewModel = (CardModelView.ViewModel) mutableState6.getValue();
                    if (viewModel != null) {
                        cardModelView2.render(viewModel);
                    }
                }
                break;
            default:
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) obj6;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj5;
                MutableState mutableState7 = (MutableState) obj4;
                Animatable animatable = (Animatable) obj3;
                Offset offset3 = (Offset) obj;
                float[] fArr = Hero3DCardViewKt.X_AXIS;
                CardModelView cardModelView3 = (CardModelView) ((MutableState) obj2).getValue();
                if (cardModelView3 != null && (pointF = cardModelView3.touchTextureIntersect(new PointF(Float.intBitsToFloat((int) (offset3.packedValue >> 32)), Float.intBitsToFloat((int) (offset3.packedValue & BodyPartID.bodyIdMax))))) != null && CardsKt.ICON_TEXTURE_BOUNDS.contains(pointF.x, pointF.y)) {
                    ((Function0) mutableState7.getValue()).invoke();
                    Job job = (Job) ref$ObjectRef3.element;
                    if (job != null) {
                        job.cancel(null);
                    }
                    ref$ObjectRef3.element = JobKt.launch$default(coroutineScope2, null, null, new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable, r8, 13), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OverlayKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    public /* synthetic */ OverlayKt$$ExternalSyntheticLambda3(OpenSourceViewModel openSourceViewModel, Ref$ObjectRef ref$ObjectRef, MutableState mutableState, Context context, Function1 function1) {
        this.$r8$classId = 24;
        this.f$0 = openSourceViewModel;
        this.f$2 = ref$ObjectRef;
        this.f$3 = mutableState;
        this.f$1 = context;
        this.f$4 = function1;
    }
}
