package coil3.compose;

import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalTextsKt;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda35;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda36;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda37;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.molecule.PlatformKt;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.size.SizeResolver;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.viewmodels.SsnViewModel;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.borrow.views.BorrowAmountPickerKt$$ExternalSyntheticLambda10;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import com.squareup.cash.moneybot.views.plugins.TemplateCardKt$$ExternalSyntheticLambda6;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.moneybot.widgets.ComposerInputStatus;
import com.squareup.cash.moneybot.widgets.ComposerKt;
import com.squareup.cash.moneybot.widgets.ComposerSharedElementKey;
import com.squareup.cash.moneybot.widgets.ComposerSharedElementKeys;
import com.squareup.cash.moneybot.widgets.ComposerSharedTransitionScope;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.paymentpad.viewmodels.HomeViewModel;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.viewmodels.ArticleViewModel;
import com.squareup.cash.support.views.article.ArticleViewKt;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.cash.tax.views.TaxReturnsViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.cash.work.views.clockin.ClockInSheetMode;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.StateFlowKt$$ExternalSyntheticLambda3;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import com.stripe.android.model.parsers.WalletJsonParser;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class SubcomposeAsyncImageKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(Modifier modifier, String str, Function2 function2, String str2, Function0 function0, String str3) {
        this.$r8$classId = 6;
        this.f$0 = modifier;
        this.f$3 = str;
        this.f$1 = function2;
        this.f$2 = str2;
        this.f$4 = function0;
        this.f$5 = str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:303:0x0c39, code lost:
    
        if (r4 == r3) goto L318;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r7v22, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.GapComposer] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LocalText localText;
        LocalFulfillmentType localFulfillmentType;
        Object obj4;
        int i;
        final ?? r4;
        Color m;
        Color m2;
        TextStyle textStyle;
        Modifier.Companion companion;
        TemplateCardViewModel.BottomPicker bottomPicker;
        int i2 = this.$r8$classId;
        int i3 = 3;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        Object obj5 = Composer.Companion.Empty;
        Object obj6 = this.f$5;
        Object obj7 = this.f$4;
        Object obj8 = this.f$3;
        Object obj9 = this.f$2;
        Object obj10 = this.f$1;
        Object obj11 = this.f$0;
        switch (i2) {
            case 0:
                SizeResolver sizeResolver = (SizeResolver) obj11;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj10;
                AsyncImagePainter asyncImagePainter = (AsyncImagePainter) obj9;
                String str = (String) obj8;
                Alignment alignment = (Alignment) obj7;
                ContentScale contentScale = (ContentScale) obj6;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    ((ConstraintsSizeResolver) sizeResolver).m1451setConstraintsBRTryo0(boxWithConstraintsScopeImpl.constraints);
                    composableLambdaImpl.invoke((Object) new RealSubcomposeAsyncImageScope(boxWithConstraintsScopeImpl, asyncImagePainter, str, alignment, contentScale), (Object) gapComposer, (Object) 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                LocalBrandLocationCartViewModel.Fulfillment fulfillment = (LocalBrandLocationCartViewModel.Fulfillment) obj11;
                Function0 function0 = (Function0) obj10;
                Function0 function02 = (Function0) obj9;
                Function0 function03 = (Function0) obj8;
                List list = (List) obj7;
                Function1 function1 = (Function1) obj6;
                Composer composer2 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion3, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer2, 0);
                GapComposer gapComposer2 = (GapComposer) composer2;
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer2, m302paddingqDBjuR0$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                ?? r8 = (GapComposer) composer2;
                if (r8.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                r8.startReusableNode();
                if (r8.inserting) {
                    r8.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    r8.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(composer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(composer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(composer2, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(composer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(composer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                LocalFulfillment.SchedulingDetails.SchedulingMode selectedSchedulingMode = fulfillment.getSelectedSchedulingMode();
                if (fulfillment.getCanFulfillAsap()) {
                    r8.startReplaceGroup(288544109);
                    FulfillmentRadioCellKt.FulfillmentRadioCell(SizeKt.fillMaxWidth(companion3, 1.0f), Room.stringResource(composer2, R.string.local_views_asap), fulfillment.getEstimatedCompletionAsap(), null, selectedSchedulingMode == LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_ASAP, null, function0, composer2, 6, 40);
                    r8.end(false);
                } else {
                    r8.startReplaceGroup(288877576);
                    r8.end(false);
                }
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
                String stringResource = Room.stringResource(composer2, R.string.local_views_later);
                LocalText estimatedCompletionScheduled = fulfillment.getEstimatedCompletionScheduled();
                if (estimatedCompletionScheduled == null) {
                    r8.startReplaceGroup(-1514692857);
                    LocalText localText2 = LocalTextsKt.toLocalText(Room.stringResource(composer2, R.string.local_views_schedule_this_order));
                    r8.end(false);
                    localText = localText2;
                } else {
                    r8.startReplaceGroup(-1514696422);
                    r8.end(false);
                    localText = estimatedCompletionScheduled;
                }
                String stringResource2 = Room.stringResource(composer2, R.string.local_views_schedule_this_order_change);
                LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode = LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED;
                FulfillmentRadioCellKt.FulfillmentRadioCell(fillMaxWidth, stringResource, localText, selectedSchedulingMode == schedulingMode ? stringResource2 : null, selectedSchedulingMode == schedulingMode, null, function02, composer2, 6, 32);
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, composer2, 6);
                int hashCode2 = Long.hashCode(r8.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = r8.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(composer2, m302paddingqDBjuR0$default2);
                r8.startReusableNode();
                if (r8.inserting) {
                    r8.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    r8.useNode();
                }
                Updater.m576setimpl(composer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(composer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Request$Priority$EnumUnboxingLocalUtility.m(hashCode2, composer2, composeUiNode$Companion$SetModifier$13, composer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(composer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                coil3.size.SizeKt.ButtonCompact(function03, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1703835198, new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda35(fulfillment, 1), composer2), composer2, 1572864, 62);
                if (fulfillment instanceof LocalBrandLocationCartViewModel.Fulfillment.Delivery) {
                    localFulfillmentType = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP;
                } else {
                    if (!(fulfillment instanceof LocalBrandLocationCartViewModel.Fulfillment.Pickup)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    localFulfillmentType = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY;
                }
                boolean changed = r8.changed(localFulfillmentType.ordinal()) | r8.changed(list);
                Object rememberedValue = r8.rememberedValue();
                if (!changed) {
                    obj4 = obj5;
                    break;
                } else {
                    obj4 = obj5;
                }
                rememberedValue = Boolean.valueOf(list.contains(localFulfillmentType));
                r8.updateRememberedValue(rememberedValue);
                if (((Boolean) rememberedValue).booleanValue()) {
                    r8.startReplaceGroup(1569141168);
                    boolean changed2 = r8.changed(function1) | r8.changed(localFulfillmentType.ordinal());
                    Object rememberedValue2 = r8.rememberedValue();
                    if (changed2 || rememberedValue2 == obj4) {
                        i = 1;
                        rememberedValue2 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda36(function1, localFulfillmentType, 1);
                        r8.updateRememberedValue(rememberedValue2);
                    } else {
                        i = 1;
                    }
                    coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue2, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-3183741, new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda37(localFulfillmentType, i), composer2), composer2, 1572864, 62);
                    r8.end(false);
                } else {
                    r8.startReplaceGroup(1569690860);
                    r8.end(false);
                }
                r8.end(true);
                r8.end(true);
                return Unit.INSTANCE;
            case 2:
                ActivityFeedEntry activityFeedEntry = (ActivityFeedEntry) obj11;
                Function3 function3 = (Function3) obj10;
                Function2 function2 = (Function2) obj9;
                Function3 function32 = (Function3) obj8;
                Function1 function12 = (Function1) obj7;
                ActivityEmbeddedViewModel activityEmbeddedViewModel = (ActivityEmbeddedViewModel) obj6;
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                lazyItemScopeImpl.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer3).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    AvatarsKt.EntryContent(LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, companion2), activityFeedEntry, function3, null, function2, function32, function12, activityEmbeddedViewModel.compact, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                AmountPickerViewModel.Ready ready = (AmountPickerViewModel.Ready) obj11;
                AmountDisplayState amountDisplayState = (AmountDisplayState) obj10;
                AmountConfig amountConfig = (AmountConfig) obj9;
                Function1 function13 = (Function1) obj8;
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj7;
                Shaker shaker = (Shaker) obj6;
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean z = ready.buttonEnabled;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                    boolean changed3 = gapComposer4.changed(amountDisplayState) | gapComposer4.changedInstance(amountConfig) | gapComposer4.changedInstance(ready) | gapComposer4.changed(function13) | gapComposer4.changedInstance(realCashVibrator) | gapComposer4.changedInstance(shaker);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue3 == obj5) {
                        StateFlowKt$$ExternalSyntheticLambda3 stateFlowKt$$ExternalSyntheticLambda3 = new StateFlowKt$$ExternalSyntheticLambda3(amountDisplayState, amountConfig, ready, function13, realCashVibrator, shaker, 3);
                        gapComposer4.updateRememberedValue(stateFlowKt$$ExternalSyntheticLambda3);
                        rememberedValue3 = stateFlowKt$$ExternalSyntheticLambda3;
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth2, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(1117021002, new BorrowAmountPickerKt$$ExternalSyntheticLambda10(ready, 1), gapComposer4), gapComposer4, 1573296, 40);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                MutableState mutableState = (MutableState) obj11;
                Function1 function14 = (Function1) obj10;
                final InlineAppMessageV2ViewModel.Ready ready2 = (InlineAppMessageV2ViewModel.Ready) obj9;
                UiAvatar uiAvatar = ready2.avatar;
                Icons icons = (Icons) obj8;
                CoroutineScope coroutineScope = (CoroutineScope) obj7;
                MutableTransitionState mutableTransitionState = (MutableTransitionState) obj6;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ?? r7 = (GapComposer) ((Composer) obj2);
                boolean changed4 = r7.changed(mutableState) | r7.changed(function14) | r7.changedInstance(ready2);
                Object rememberedValue4 = r7.rememberedValue();
                if (changed4 || rememberedValue4 == obj5) {
                    CopyCodeKt$$ExternalSyntheticLambda4 copyCodeKt$$ExternalSyntheticLambda4 = new CopyCodeKt$$ExternalSyntheticLambda4(function14, ready2, mutableState, false, 7);
                    r7.updateRememberedValue(copyCodeKt$$ExternalSyntheticLambda4);
                    rememberedValue4 = copyCodeKt$$ExternalSyntheticLambda4;
                }
                Modifier onVisible$default = VisibleKt.onVisible$default(companion2, (Function0) rememberedValue4);
                com.squareup.protos.cash.ui.Color color = uiAvatar.tint_color;
                if (color == null) {
                    r7.startReplaceGroup(123536216);
                    r4 = 0;
                    r7.end(false);
                    m = null;
                } else {
                    r4 = 0;
                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m((GapComposer) r7, 1943647689, color, (GapComposer) r7, false);
                }
                long j = m != null ? m.value : Color.Unspecified;
                com.squareup.protos.cash.ui.Color color2 = uiAvatar.background_color;
                if (color2 == null) {
                    r7.startReplaceGroup(123628472);
                    r7.end(r4);
                    m2 = null;
                } else {
                    m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m((GapComposer) r7, 1943650665, color2, (GapComposer) r7, (boolean) r4);
                }
                long j2 = m2 != null ? m2.value : Color.Unspecified;
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(76702394, new Function2() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageV2Kt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj12, Object obj13) {
                        int i4 = r4;
                        InlineAppMessageV2ViewModel.Ready ready3 = ready2;
                        switch (i4) {
                            case 0:
                                Composer composer5 = (Composer) obj12;
                                int intValue4 = ((Integer) obj13).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer5;
                                if (gapComposer5.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                    String str2 = ready3.title;
                                    if (str2 == null) {
                                        gapComposer5.startReplaceGroup(118437527);
                                    } else {
                                        gapComposer5.startReplaceGroup(118437528);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer5.end(false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer6 = (Composer) obj12;
                                int intValue5 = ((Integer) obj13).intValue();
                                GapComposer gapComposer6 = (GapComposer) composer6;
                                if (gapComposer6.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                    String str3 = ready3.subtitle;
                                    if (str3 == null) {
                                        gapComposer6.startReplaceGroup(-276458357);
                                    } else {
                                        gapComposer6.startReplaceGroup(-276458356);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer6.end(false);
                                } else {
                                    gapComposer6.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, r7);
                boolean changed5 = r7.changed(function14) | r7.changedInstance(ready2);
                Object rememberedValue5 = r7.rememberedValue();
                if (changed5 || rememberedValue5 == obj5) {
                    rememberedValue5 = new ActivityTabViewKt$$ExternalSyntheticLambda12(function14, ready2, 2);
                    r7.updateRememberedValue(rememberedValue5);
                }
                Function0 function04 = (Function0) rememberedValue5;
                final int i4 = 1;
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1168199910, new Function2() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageV2Kt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj12, Object obj13) {
                        int i42 = i4;
                        InlineAppMessageV2ViewModel.Ready ready3 = ready2;
                        switch (i42) {
                            case 0:
                                Composer composer5 = (Composer) obj12;
                                int intValue4 = ((Integer) obj13).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer5;
                                if (gapComposer5.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                    String str2 = ready3.title;
                                    if (str2 == null) {
                                        gapComposer5.startReplaceGroup(118437527);
                                    } else {
                                        gapComposer5.startReplaceGroup(118437528);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer5.end(false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer6 = (Composer) obj12;
                                int intValue5 = ((Integer) obj13).intValue();
                                GapComposer gapComposer6 = (GapComposer) composer6;
                                if (gapComposer6.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                                    String str3 = ready3.subtitle;
                                    if (str3 == null) {
                                        gapComposer6.startReplaceGroup(-276458357);
                                    } else {
                                        gapComposer6.startReplaceGroup(-276458356);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer6.end(false);
                                } else {
                                    gapComposer6.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, r7);
                boolean changedInstance = r7.changedInstance(coroutineScope) | r7.changedInstance(mutableTransitionState) | r7.changed(function14) | r7.changedInstance(ready2);
                Object rememberedValue6 = r7.rememberedValue();
                if (changedInstance || rememberedValue6 == obj5) {
                    rememberedValue6 = new l2$$ExternalSyntheticLambda7(coroutineScope, mutableTransitionState, function14, ready2, 16);
                    r7.updateRememberedValue(rememberedValue6);
                }
                CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, j2, rememberComposableLambda, onVisible$default, j, function04, null, false, false, rememberComposableLambda2, null, push, 0L, (Function0) rememberedValue6, r7, 3120, 390, 11136);
                return Unit.INSTANCE;
            case 5:
                SsnViewModel ssnViewModel = (SsnViewModel) obj11;
                TouchRecorder touchRecorder = (TouchRecorder) obj10;
                Function1 function15 = (Function1) obj9;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj8;
                MutableState mutableState2 = (MutableState) obj7;
                MutableState mutableState3 = (MutableState) obj6;
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (ssnViewModel.showHelpButton) {
                        gapComposer5.startReplaceGroup(962563623);
                        Strings.TouchRecordingLayout(touchRecorder, null, Expect_jvmKt.rememberComposableLambda(-75302415, new SsnViewKt$$ExternalSyntheticLambda12(0, function15), gapComposer5), gapComposer5, 392, 2);
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(962813483);
                        gapComposer5.end(false);
                    }
                    Strings.TouchRecordingLayout(touchRecorder, null, Expect_jvmKt.rememberComposableLambda(-269296276, new AvatarsKt$$ExternalSyntheticLambda4(animatedContentScopeImpl, function15, mutableState2, touchRecorder, mutableState3, 12), gapComposer5), gapComposer5, 392, 2);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Modifier modifier = (Modifier) obj11;
                String str2 = (String) obj8;
                Function2 function22 = (Function2) obj10;
                String str3 = (String) obj9;
                Function0 function05 = (Function0) obj7;
                String str4 = (String) obj6;
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                boolean shouldExecute = gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16);
                Applier applier = gapComposer6.applier;
                if (shouldExecute) {
                    Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(modifier, 24.0f, 24.0f, 24.0f, RecyclerView.DECELERATION_RATE, 8);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer6, 0);
                    int hashCode3 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer6, m302paddingqDBjuR0$default3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer6.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer6, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer6, materializeModifier3, composeUiNode$Companion$SetModifier$18);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer6, 54);
                    int hashCode4 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer6.currentCompositionLocalScope();
                    Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer6, companion4);
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer6, composeUiNode$Companion$SetModifier$17, gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer6, materializeModifier4, composeUiNode$Companion$SetModifier$18);
                    Icons icons2 = Icons.AlertFill24;
                    HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLinesKt.FirstLineCenter;
                    Trace.m1191Iconww6aTOc(icons2, (String) null, new WithAlignmentLineElement(horizontalAlignmentLine), Strings.getColors(gapComposer6).semantic.icon.standard, gapComposer6, 54, 0);
                    if (str2 != null) {
                        gapComposer6.startReplaceGroup(-432226147);
                        textStyle = Strings.getTypography(gapComposer6).labelMedium;
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(-432156738);
                        textStyle = Strings.getTypography(gapComposer6).bodyMedium;
                        gapComposer6.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer6).semantic.text.prominent, (Composer) gapComposer6, SpacerKt.m302paddingqDBjuR0$default(new WithAlignmentLineElement(horizontalAlignmentLine), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), textStyle, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                    gapComposer6.end(true);
                    if (str2 != null) {
                        gapComposer6.startReplaceGroup(-1161299841);
                        TextStyle textStyle2 = Strings.getTypography(gapComposer6).bodyMedium;
                        MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(new SpanStyle(Strings.getColors(gapComposer6).semantic.text.prominent, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61438), 2);
                        long j3 = Strings.getColors(gapComposer6).semantic.text.prominent;
                        companion = companion4;
                        Modifier m302paddingqDBjuR0$default4 = SpacerKt.m302paddingqDBjuR0$default(companion, 32.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 6);
                        boolean changed6 = gapComposer6.changed(function22);
                        Object rememberedValue7 = gapComposer6.rememberedValue();
                        if (changed6 || rememberedValue7 == obj5) {
                            rememberedValue7 = new ToastKt$$ExternalSyntheticLambda11(18, function22);
                            gapComposer6.updateRememberedValue(rememberedValue7);
                        }
                        LazyDslKt.m304MarkdownTextpCuZGqc(str2, (Function2) rememberedValue7, m302paddingqDBjuR0$default4, textStyle2, j3, markdownSpanValues, null, null, 0, 0, 0, gapComposer6, MLKEMEngine.KyberPolyBytes, 1984);
                        gapComposer6.end(false);
                    } else {
                        companion = companion4;
                        gapComposer6.startReplaceGroup(-1160713383);
                        gapComposer6.end(false);
                    }
                    Modifier.Companion companion5 = companion;
                    KeypadKt.m3642DivideraMcp0Q(SpacerKt.m302paddingqDBjuR0$default(companion5, RecyclerView.DECELERATION_RATE, 10.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), Strings.getColors(gapComposer6).semantic.border.standard, RecyclerView.DECELERATION_RATE, gapComposer6, 6, 4);
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion5, 1.0f), RecyclerView.DECELERATION_RATE, 4.0f, 1);
                    MooncakePillButton.Style style = MooncakePillButton.Style.TERTIARY;
                    boolean changed7 = gapComposer6.changed(function05);
                    Object rememberedValue8 = gapComposer6.rememberedValue();
                    if (changed7 || rememberedValue8 == obj5) {
                        rememberedValue8 = new ComposeDialogKt$$ExternalSyntheticLambda10(14, function05);
                        gapComposer6.updateRememberedValue(rememberedValue8);
                    }
                    KeypadKt.m3640ButtonGFipHI0(str3, (Function0) rememberedValue8, m300paddingVpY3zN4$default, null, null, style, null, false, 0, null, null, gapComposer6, 196992, 0, 4056);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                TemplateCardViewModel templateCardViewModel = (TemplateCardViewModel) obj11;
                TemplateCardViewModel.EditState editState = templateCardViewModel.editState;
                RealHapticVibrator realHapticVibrator = (RealHapticVibrator) obj10;
                Haptics haptics = (Haptics) obj9;
                Function1 function16 = (Function1) obj8;
                TemplateCardViewModel.TapBehavior tapBehavior = (TemplateCardViewModel.TapBehavior) obj7;
                Function1 function17 = (Function1) obj6;
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), 24.0f, RecyclerView.DECELERATION_RATE, 2);
                    ArrayList arrayList = templateCardViewModel.displayLines;
                    TemplateCardViewModel.BottomPicker bottomPicker2 = templateCardViewModel.bottomPicker;
                    boolean changedInstance2 = gapComposer7.changedInstance(realHapticVibrator) | gapComposer7.changed(haptics) | gapComposer7.changed(function16);
                    Object rememberedValue9 = gapComposer7.rememberedValue();
                    if (changedInstance2 || rememberedValue9 == obj5) {
                        rememberedValue9 = new MoneyTabUIKt$$ExternalSyntheticLambda39(11, realHapticVibrator, haptics, function16);
                        gapComposer7.updateRememberedValue(rememberedValue9);
                    }
                    TextCardKt.TokenizedDisplayText(arrayList, editState, (Function1) rememberedValue9, m300paddingVpY3zN4$default2, gapComposer7, 3072);
                    if (bottomPicker2 == null) {
                        gapComposer7.startReplaceGroup(580063349);
                        gapComposer7.end(false);
                        bottomPicker = bottomPicker2;
                    } else {
                        re$$ExternalSyntheticOutline0.m(gapComposer7, 580063350, companion2, 40.0f, gapComposer7);
                        boolean z2 = editState == TemplateCardViewModel.EditState.Editable;
                        Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), 24.0f, RecyclerView.DECELERATION_RATE, 2);
                        boolean changedInstance3 = gapComposer7.changedInstance(realHapticVibrator) | gapComposer7.changed(haptics) | gapComposer7.changed(function16) | gapComposer7.changedInstance(bottomPicker2);
                        Object rememberedValue10 = gapComposer7.rememberedValue();
                        if (changedInstance3 || rememberedValue10 == obj5) {
                            rememberedValue10 = new UiWorkflow$$ExternalSyntheticLambda25(realHapticVibrator, haptics, function16, bottomPicker2, 10);
                            bottomPicker = bottomPicker2;
                            gapComposer7.updateRememberedValue(rememberedValue10);
                        } else {
                            bottomPicker = bottomPicker2;
                        }
                        TextCardKt.BottomPicker(bottomPicker, z2, m300paddingVpY3zN4$default3, (Function0) rememberedValue10, gapComposer7, MLKEMEngine.KyberPolyBytes);
                        gapComposer7.end(false);
                    }
                    String str5 = templateCardViewModel.description;
                    if (str5 == null) {
                        gapComposer7.startReplaceGroup(580533991);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(580533992);
                        TextCardKt.Description(MLKEMEngine.KyberPolyBytes, gapComposer7, SpacerKt.m300paddingVpY3zN4$default(Request$Priority$EnumUnboxingLocalUtility.m(companion2, bottomPicker != null ? 24.0f : 40.0f, gapComposer7, companion2, 1.0f), 24.0f, RecyclerView.DECELERATION_RATE, 2), str5, tapBehavior instanceof TemplateCardViewModel.TapBehavior.TapAction);
                        gapComposer7.end(false);
                    }
                    TemplateCardViewModel.TapBehavior.ButtonGroup buttonGroup = tapBehavior instanceof TemplateCardViewModel.TapBehavior.ButtonGroup ? (TemplateCardViewModel.TapBehavior.ButtonGroup) tapBehavior : null;
                    if (buttonGroup == null) {
                        gapComposer7.startReplaceGroup(580937053);
                        gapComposer7.end(false);
                    } else {
                        re$$ExternalSyntheticOutline0.m(gapComposer7, 580937054, companion2, 20.0f, gapComposer7);
                        Updater.CompositionLocalProvider(ArcadeThemeKt.LocalScreenMargin.defaultProvidedValue$runtime(new Dp(24.0f)), Expect_jvmKt.rememberComposableLambda(1792481191, new TemplateCardKt$$ExternalSyntheticLambda6(buttonGroup, function17), gapComposer7), gapComposer7, 56);
                        gapComposer7.end(false);
                    }
                    String str6 = templateCardViewModel.toolRequestErrorMessage;
                    if (str6 == null) {
                        gapComposer7.startReplaceGroup(581193671);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(581193672);
                        ((DefaultSizes) gapComposer7.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion2, 8.0f, gapComposer7);
                        TextCardKt.ToolRequestError(48, gapComposer7, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), 24.0f, RecyclerView.DECELERATION_RATE, 2), str6);
                        gapComposer7.end(false);
                    }
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ComposerSharedTransitionScope composerSharedTransitionScope = (ComposerSharedTransitionScope) obj10;
                TextFieldValue textFieldValue = (TextFieldValue) obj9;
                Function0 function06 = (Function0) obj8;
                Function0 function07 = (Function0) obj7;
                ComposerSharedElementKeys composerSharedElementKeys = (ComposerSharedElementKeys) obj6;
                Composer composer8 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                int ordinal = ((ComposerInputStatus) obj11).ordinal();
                Modifier modifier2 = Modifier.Companion.$$INSTANCE;
                if (ordinal == 0) {
                    GapComposer gapComposer8 = (GapComposer) composer8;
                    gapComposer8.startReplaceGroup(-414890528);
                    gapComposer8.startReplaceGroup(-567570648);
                    if (composerSharedTransitionScope != null) {
                        gapComposer8.startReplaceGroup(-567568372);
                        Object obj12 = composerSharedElementKeys.sendButton;
                        if (obj12 == null) {
                            obj12 = ComposerSharedElementKey.SendButton;
                        }
                        modifier2 = SharedTransitionScope.sharedElement$default(composerSharedTransitionScope, modifier2, composerSharedTransitionScope.rememberSharedContentState(obj12, gapComposer8, 0), composerSharedTransitionScope, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        gapComposer8.end(false);
                    }
                    gapComposer8.end(false);
                    ComposerKt.SendButton(0, gapComposer8, modifier2, function06, !StringsKt.isBlank(textFieldValue.annotatedString.text));
                    gapComposer8.end(false);
                } else {
                    if (ordinal != 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer8, -567574169, false);
                    }
                    GapComposer gapComposer9 = (GapComposer) composer8;
                    gapComposer9.startReplaceGroup(-414275922);
                    gapComposer9.startReplaceGroup(-567550712);
                    if (composerSharedTransitionScope != null) {
                        gapComposer9.startReplaceGroup(-567548436);
                        Object obj13 = composerSharedElementKeys.sendButton;
                        if (obj13 == null) {
                            obj13 = ComposerSharedElementKey.SendButton;
                        }
                        modifier2 = SharedTransitionScope.sharedElement$default(composerSharedTransitionScope, modifier2, composerSharedTransitionScope.rememberSharedContentState(obj13, gapComposer9, 0), composerSharedTransitionScope, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        gapComposer9.end(false);
                    }
                    gapComposer9.end(false);
                    ComposerKt.CancelButton(0, gapComposer9, modifier2, function07);
                    gapComposer9.end(false);
                }
                return Unit.INSTANCE;
            case 9:
                HomeViewModel homeViewModel = (HomeViewModel) obj11;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj10;
                Painter painter = (Painter) obj9;
                String str7 = (String) obj8;
                Function1 function18 = (Function1) obj7;
                ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) obj6;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer9 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer9).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    HomeViewModel.Ready ready3 = (HomeViewModel.Ready) homeViewModel;
                    if (ready3.qrButtonPlacement == HomeViewModel.QrButtonPlacement.START) {
                        gapComposer10.startReplaceGroup(-1637256070);
                        composableLambdaImpl2.invoke(titleBarActionScope, gapComposer10, Integer.valueOf((intValue7 & 14) | 48));
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(-1637194566);
                        gapComposer10.end(false);
                    }
                    if (ready3.showNearbyP2pIcon) {
                        gapComposer10.startReplaceGroup(-1637115361);
                        boolean changed8 = gapComposer10.changed(function18);
                        Object rememberedValue11 = gapComposer10.rememberedValue();
                        if (changed8 || rememberedValue11 == obj5) {
                            rememberedValue11 = new HomeViewKt$$ExternalSyntheticLambda8(5, function18);
                            gapComposer10.updateRememberedValue(rememberedValue11);
                        }
                        Function0 function08 = (Function0) rememberedValue11;
                        Modifier.Companion companion6 = companion2;
                        if (elementBoundsRegistry != null) {
                            companion6 = WalletJsonParser.provideBounds(elementBoundsRegistry, ElementBoundsRegistry.Element.KeypadNearbyButton);
                        }
                        TransactorKt.IconAction(titleBarActionScope, painter, str7, function08, companion6.then(TabToolbarsKt.tabToolbarIconTonalBackground(gapComposer10)), null, gapComposer10, (intValue7 & 14) | (Painter.$stable << 3), 48);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(-1636351366);
                        gapComposer10.end(false);
                    }
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ArticleViewModel articleViewModel = (ArticleViewModel) obj11;
                RealImageLoader realImageLoader = (RealImageLoader) obj10;
                Function1 function19 = (Function1) obj9;
                WebViewProvider webViewProvider = (WebViewProvider) obj8;
                ScrollState scrollState = (ScrollState) obj7;
                SupportActivityItemLoader supportActivityItemLoader = (SupportActivityItemLoader) obj6;
                Composer composer10 = (Composer) obj2;
                ((Integer) obj3).intValue();
                ((AnimatedVisibilityScope) obj).getClass();
                if (articleViewModel instanceof ArticleViewModel.Loaded) {
                    GapComposer gapComposer11 = (GapComposer) composer10;
                    gapComposer11.startReplaceGroup(-1559845923);
                    ArticleViewKt.LoadedArticle((ArticleViewModel.Loaded) articleViewModel, realImageLoader, function19, webViewProvider, scrollState, supportActivityItemLoader, gapComposer11, 0, 0);
                    gapComposer11.end(false);
                } else {
                    GapComposer gapComposer12 = (GapComposer) composer10;
                    gapComposer12.startReplaceGroup(-1559590297);
                    gapComposer12.end(false);
                }
                return Unit.INSTANCE;
            case 11:
                MutableState mutableState4 = (MutableState) obj11;
                View view = (View) obj10;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj9;
                Function1 function110 = (Function1) obj8;
                Function0 function09 = (Function0) obj7;
                WithdrawViewModel.ManagedAccountAmountEntry managedAccountAmountEntry = (WithdrawViewModel.ManagedAccountAmountEntry) obj6;
                Composer composer11 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer11;
                if (gapComposer13.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    boolean z3 = ((Number) mutableState4.getValue()).longValue() > 0;
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    boolean changedInstance4 = gapComposer13.changedInstance(view) | gapComposer13.changedInstance(coroutineScope2) | gapComposer13.changed(function110) | gapComposer13.changed(function09);
                    Object rememberedValue12 = gapComposer13.rememberedValue();
                    if (changedInstance4 || rememberedValue12 == obj5) {
                        rememberedValue12 = new UiWorkflow$$ExternalSyntheticLambda25(view, coroutineScope2, function110, function09, 13);
                        gapComposer13.updateRememberedValue(rememberedValue12);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue12, null, buttonProminence2, false, z3, null, Expect_jvmKt.rememberComposableLambda(-1387089607, new TaxReturnsViewKt$$ExternalSyntheticLambda5(managedAccountAmountEntry, 15), gapComposer13), gapComposer13, 1573248, 42);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ClockInBottomSheetViewModel clockInBottomSheetViewModel = (ClockInBottomSheetViewModel) obj11;
                MutableState mutableState5 = (MutableState) obj10;
                Function0 function010 = (Function0) obj9;
                Function1 function111 = (Function1) obj8;
                MutableState mutableState6 = (MutableState) obj7;
                MutableState mutableState7 = (MutableState) obj6;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer12 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer12).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer12;
                if (gapComposer14.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    Modifier padding = SpacerKt.padding(companion2, paddingValues);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode5 = Long.hashCode(gapComposer14.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer14.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer14, padding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer14.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer14.startReusableNode();
                    if (gapComposer14.inserting) {
                        gapComposer14.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer14.useNode();
                    }
                    Updater.m576setimpl(gapComposer14, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer14, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer14, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer14, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer14, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    ClockInSheetMode clockInSheetMode = (ClockInSheetMode) mutableState5.getValue();
                    Object rememberedValue13 = gapComposer14.rememberedValue();
                    if (rememberedValue13 == obj5) {
                        rememberedValue13 = new StripePaymentController$$ExternalSyntheticLambda1(i3);
                        gapComposer14.updateRememberedValue(rememberedValue13);
                    }
                    AnimatedContentKt.AnimatedContent(clockInSheetMode, null, (Function1) rememberedValue13, null, "ClockInSheetModeTransition", null, Expect_jvmKt.rememberComposableLambda(1160541852, new SsnViewKt$$ExternalSyntheticLambda7(mutableState6, mutableState7, mutableState5, clockInBottomSheetViewModel, function010, function111), gapComposer14), gapComposer14, 1597824, 42);
                    ToastState toastState = clockInBottomSheetViewModel.toastState;
                    if (toastState == null) {
                        gapComposer14.startReplaceGroup(-1616005594);
                        gapComposer14.end(false);
                    } else {
                        gapComposer14.startReplaceGroup(-1616005593);
                        ModalKt.m3381ToastBAHpl2s(BoxScopeInstance.INSTANCE.align(companion2, Alignment.Companion.BottomCenter), toastState.key, toastState.message, null, null, null, null, gapComposer14, 0, 504);
                        gapComposer14.end(false);
                    }
                    gapComposer14.end(true);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
    }
}
