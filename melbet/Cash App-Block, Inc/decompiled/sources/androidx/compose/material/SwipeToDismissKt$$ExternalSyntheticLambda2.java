package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.DefaultTransformableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.q2$$ExternalSyntheticLambda8;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImagePainter;
import com.google.android.gms.common.api.internal.zabr;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda28;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.compact.RealCompactActivityAccessoryScope;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.CheckboxKt$$ExternalSyntheticLambda6;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.ToastKt$Toast$12$1$1;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyAliasModel;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.blockers.views.components.VerifyAliasViewKt;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.common.composeui.SegmentedCircleInteractableState;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.navigationcontainer.LegacySheetConfig;
import com.squareup.cash.core.navigationcontainer.UiContainerKt;
import com.squareup.cash.core.navigationcontainer.UiContainerKt$BottomSheet$1$sheetScope$1;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.investing.components.custom.order.GraphState;
import com.squareup.cash.investing.components.custom.order.PriceWidgetState;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderContentModel;
import com.squareup.cash.maps.views.CashMapViewKt;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneybot.views.menu.OpenSessionByIdDialogKt$$ExternalSyntheticLambda1;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.overlays.RealOverlayLayer$show$3;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.views.DistributionWheelGesturesKt$handleGestures$1$1$1;
import com.squareup.cash.payments.views.UtilKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.payments.views.personalization.TransformableKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageRetryKt$$ExternalSyntheticLambda13;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda21;
import com.squareup.cash.ui.BottomSheetStateListener;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.views.SellerCardShape;
import com.squareup.cash.work.views.SellerCardSize;
import com.squareup.cash.work.views.clockin.ClockInOverlayState;
import com.squareup.cash.work.views.clockin.ClockInOverlayTransitionsKt;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.util.Strings;
import com.squareup.util.compose.ListsKt;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.ConnectedAccessNotice;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.ui.ImageResource$Network;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.sdui.BulletUI;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public final /* synthetic */ class SwipeToDismissKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda2(DefaultTransformableState defaultTransformableState, Integer num, Function0 function0, Function0 function02, Function1 function1) {
        this.$r8$classId = 14;
        this.f$0 = defaultTransformableState;
        this.f$2 = num;
        this.f$3 = function0;
        this.f$4 = function02;
        this.f$1 = function1;
    }

    private final Object invoke$com$squareup$cash$payments$views$personalization$ExpressivePreviewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        Function0 function0;
        float f;
        Modifier.Companion companion;
        Color color;
        BiasAlignment biasAlignment;
        boolean z;
        Color m;
        Function0 function02 = (Function0) this.f$0;
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.f$1;
        com.squareup.protos.cash.ui.Color color2 = (com.squareup.protos.cash.ui.Color) this.f$2;
        String str = (String) this.f$3;
        List list = (List) this.f$4;
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        boxWithConstraintsScopeImpl.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
            float mo236toPx0680j_4 = ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo236toPx0680j_4(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM());
            float mo236toPx0680j_42 = ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo236toPx0680j_4(boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM());
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PoolDetailsViewKt$$ExternalSyntheticLambda3(10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(fillMaxSize, true, (Function1) rememberedValue);
            BiasAlignment biasAlignment2 = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (((AsyncImagePainter.State) Updater.collectAsState(asyncImagePainter.state, null, gapComposer, 1).getValue()) instanceof AsyncImagePainter.State.Success) {
                gapComposer.startReplaceGroup(-1052141456);
                f = mo236toPx0680j_42;
                color = null;
                function0 = function02;
                biasAlignment = biasAlignment2;
                companion = companion2;
                ImageKt.Image(asyncImagePainter, Room.stringResource(gapComposer, R.string.expressive_preview_content_description), SizeKt.fillMaxSize(companion2, 1.0f), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer, 24960, 104);
                z = false;
                gapComposer.end(false);
            } else {
                function0 = function02;
                f = mo236toPx0680j_42;
                companion = companion2;
                color = null;
                biasAlignment = biasAlignment2;
                z = false;
                gapComposer.startReplaceGroup(1074446908);
                gapComposer.end(false);
            }
            if (color2 == null) {
                gapComposer.startReplaceGroup(-1051809633);
                gapComposer.end(z);
                m = color;
            } else {
                m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1074449314, color2, gapComposer, z);
            }
            long j = m != null ? m.value : Color.White;
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((com.squareup.cash.arcade.Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).keypadTotal, 0L, UtilKt.scaledSp(gapComposer, 56), null, null, 0L, null, 0L, null, null, null, 0, UtilKt.scaledSp(gapComposer, 56), null, null, 0, 16646141);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier align = boxScopeInstance.align(companion, biasAlignment);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion3 = companion;
            boolean z2 = z;
            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4016, j, (Composer) gapComposer, ZIndexModifierKt.zIndex(SpacerKt.m298padding3ABfNKs(align, 16.0f), 1000.0f), m994copyp1EtxEg$default, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            AlphaKt.StickerOverlay(list, mo236toPx0680j_4, f, gapComposer, z2 ? 1 : 0);
            gapComposer.end(true);
            AlphaKt.EditStyleButton(z2 ? 1 : 0, gapComposer, ZIndexModifierKt.zIndex(SpacerKt.m298padding3ABfNKs(boxScopeInstance.align(companion3, Alignment.Companion.BottomEnd), 12.0f), 1000.0f), function0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$payments$views$personalization$TransformableKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        DefaultTransformableState defaultTransformableState = (DefaultTransformableState) this.f$0;
        Integer num = (Integer) this.f$2;
        Function0 function0 = (Function0) this.f$3;
        Function0 function02 = (Function0) this.f$4;
        Function1 function1 = (Function1) this.f$1;
        ((Integer) obj3).getClass();
        ((Modifier) obj).getClass();
        GapComposer gapComposer = (GapComposer) ((Composer) obj2);
        gapComposer.startReplaceGroup(1800263755);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = PapaEvent.Channel$default(Integer.MAX_VALUE, null, null, 6);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Channel channel = (Channel) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(channel) | gapComposer.changedInstance(defaultTransformableState) | gapComposer.changed(function0);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            MoneybotChatPresenter$models$6$1 moneybotChatPresenter$models$6$1 = new MoneybotChatPresenter$models$6$1(channel, defaultTransformableState, function0, continuation, 28);
            gapComposer.updateRememberedValue(moneybotChatPresenter$models$6$1);
            rememberedValue2 = moneybotChatPresenter$models$6$1;
        }
        Updater.LaunchedEffect(defaultTransformableState, num, (Function2) rememberedValue2, gapComposer);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$1 = new PhonePlansHomePresenter$models$1$1(channel, function02, function1, continuation, 12);
            gapComposer.updateRememberedValue(phonePlansHomePresenter$models$1$1);
            rememberedValue3 = phonePlansHomePresenter$models$1$1;
        }
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion.$$INSTANCE, Unit.INSTANCE, new TransformableKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) rememberedValue3));
        gapComposer.end(false);
        return pointerInput;
    }

    private final Object invoke$com$squareup$cash$support$chat$views$transcript$message$compose$MessageRetryKt$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3) {
        Function1 function1;
        String str;
        Function1 function12;
        Function1 function13;
        Modifier.Companion companion;
        int i;
        GapComposer gapComposer;
        boolean z;
        String str2 = (String) this.f$0;
        String str3 = (String) this.f$2;
        Function1 function14 = (Function1) this.f$1;
        Function1 function15 = (Function1) this.f$3;
        Function1 function16 = (Function1) this.f$4;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer2 = (GapComposer) composer;
        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier imePadding = SpacerKt.imePadding(SpacerKt.navigationBarsPadding(SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion2, 1.0f), Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape), 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, paddingValues.mo267calculateTopPaddingD9Ej5fM(), RecyclerView.DECELERATION_RATE, 32.0f, 5)));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, imePadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (str2 != null) {
                gapComposer2.startReplaceGroup(-1078048217);
                function12 = function14;
                function1 = function16;
                str = str3;
                i = 0;
                function13 = function15;
                companion = companion2;
                gapComposer = gapComposer2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), Strings.getTypography(gapComposer2).pageTitle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                function1 = function16;
                str = str3;
                function12 = function14;
                function13 = function15;
                companion = companion2;
                i = 0;
                gapComposer = gapComposer2;
                gapComposer.startReplaceGroup(-1077823033);
                gapComposer.end(false);
            }
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 32.0f));
            String str4 = str;
            Function1 function17 = function12;
            Function1 function18 = function13;
            boolean changed = gapComposer.changed(str4) | gapComposer.changed(function17) | gapComposer.changed(function18);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MessageRetryKt$$ExternalSyntheticLambda13(str4, function18, function17, i);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue, SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.STANDARD, false, false, null, MessageFileKt.f686lambda$767805880, gapComposer, 1573296, 56);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 8.0f));
            Function1 function19 = function1;
            boolean changed2 = gapComposer.changed(str4) | gapComposer.changed(function19) | gapComposer.changed(function18);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                z = true;
                rememberedValue2 = new MessageRetryKt$$ExternalSyntheticLambda13(str4, function18, function19, 1);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                z = true;
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue2, SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, false, null, MessageFileKt.lambda$796123327, gapComposer, 1573296, 56);
            gapComposer.end(z);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$work$views$clockin$ClockInOverlayViewKt$$ExternalSyntheticLambda27(Object obj, Object obj2, Object obj3) {
        Object realOverlayLayer$show$3;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        Modifier.Companion companion;
        ClockInOverlayViewModel.Loaded loaded;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        Function0 function0;
        boolean z;
        State state = (State) this.f$0;
        State state2 = (State) this.f$1;
        ClockInOverlayViewModel.Loaded loaded2 = (ClockInOverlayViewModel.Loaded) this.f$2;
        Transition transition = (Transition) this.f$3;
        ClockInOverlayState clockInOverlayState = (ClockInOverlayState) this.f$4;
        ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        scrollingScaffoldContentScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(scrollingScaffoldContentScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(scrollingScaffoldContentScope.weight(1.0f, companion2, true), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$18);
            boolean changed = gapComposer.changed(state) | gapComposer.changed(state2);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CheckboxKt$$ExternalSyntheticLambda6(state, state2, 6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SellerCardKt.SellerCard(loaded2.getSellerCard(), ColorKt.graphicsLayer(companion2, (Function1) rememberedValue), SellerCardSize.XLarge, SellerCardShape.Circle, gapComposer, 3456, 0);
            gapComposer.end(true);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$17, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$18);
            boolean changed2 = gapComposer.changed(clockInOverlayState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                companion = companion2;
                loaded = loaded2;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                realOverlayLayer$show$3 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onOpenLocationPicker", "onOpenLocationPicker()V", 0, 18);
                gapComposer.updateRememberedValue(realOverlayLayer$show$3);
            } else {
                realOverlayLayer$show$3 = rememberedValue2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                loaded = loaded2;
                companion = companion2;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
            }
            Function0 function02 = (Function0) ((KFunction) realOverlayLayer$show$3);
            boolean changed3 = gapComposer.changed(clockInOverlayState);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                function0 = function02;
                RealOverlayLayer$show$3 realOverlayLayer$show$32 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onOpenJobPicker", "onOpenJobPicker()V", 0, 19);
                gapComposer.updateRememberedValue(realOverlayLayer$show$32);
                rememberedValue3 = realOverlayLayer$show$32;
            } else {
                function0 = function02;
            }
            ClockInOverlayTransitionsKt.AnimatedClockInOverlaySection(transition, function0, (Function0) ((KFunction) rememberedValue3), gapComposer, 0);
            ToastState toastState = loaded.getToastState();
            if (toastState == null) {
                gapComposer.startReplaceGroup(300304265);
                gapComposer.end(false);
                z = true;
            } else {
                gapComposer.startReplaceGroup(300304266);
                Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, align);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$1, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                DisclaimerTextKt.ClockInOverlayToast(toastState, null, gapComposer, 0);
                if (loaded instanceof ClockInOverlayViewModel.Loaded.ClockedOutSummary) {
                    re$$ExternalSyntheticOutline0.m(gapComposer, -803276641, companion, 128.0f, gapComposer);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-803140179);
                    gapComposer.end(false);
                }
                z = true;
                gapComposer.end(true);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$stripe$android$financialconnections$features$common$ModalBottomSheetContentKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        LegalDetailsNotice legalDetailsNotice = (LegalDetailsNotice) this.f$0;
        TextResource.Text text = (TextResource.Text) this.f$2;
        Function1 function1 = (Function1) this.f$1;
        TextResource.Text text2 = (TextResource.Text) this.f$3;
        List list = (List) this.f$4;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Image image = legalDetailsNotice.icon;
            String str = image != null ? image.f809default : null;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (str == null) {
                gapComposer.startReplaceGroup(1014253599);
            } else {
                gapComposer.startReplaceGroup(1014253600);
                ListItemKt.ShapedIcon(str, null, null, null, "legal details icon", false, gapComposer, 24576, 110);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
            }
            gapComposer.end(false);
            ListItemKt.Title(text, function1, gapComposer, 0);
            if (text2 == null) {
                gapComposer.startReplaceGroup(1014483960);
            } else {
                gapComposer.startReplaceGroup(1014483961);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
                ListItemKt.Subtitle(text2, function1, gapComposer, 0);
            }
            gapComposer.end(false);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 24.0f));
            ListItemKt.Links(list, function1, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$stripe$android$financialconnections$features$common$ModalBottomSheetContentKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        String str;
        DataAccessNotice dataAccessNotice = (DataAccessNotice) this.f$0;
        TextResource.Text text = (TextResource.Text) this.f$2;
        Function1 function1 = (Function1) this.f$1;
        TextResource.Text text2 = (TextResource.Text) this.f$3;
        List list = (List) this.f$4;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Image image = dataAccessNotice.icon;
            String str2 = image != null ? image.f809default : null;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1901250821);
            } else {
                gapComposer.startReplaceGroup(-1901250820);
                ListItemKt.ShapedIcon(str2, null, null, null, "Icon", false, gapComposer, 24576, 110);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
            }
            gapComposer.end(false);
            ListItemKt.Title(text, function1, gapComposer, 0);
            ConnectedAccessNotice connectedAccessNotice = dataAccessNotice.connectedAccountNotice;
            if (connectedAccessNotice == null) {
                gapComposer.startReplaceGroup(-1900878511);
            } else {
                gapComposer.startReplaceGroup(-1900878510);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
                ListItemKt.Subtitle(zabr.rememberHtml(connectedAccessNotice.subtitle, gapComposer), function1, gapComposer, 0);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 24.0f));
                gapComposer.startReplaceGroup(1739806314);
                for (Bullet bullet : connectedAccessNotice.body.bullets) {
                    bullet.getClass();
                    Image image2 = bullet.icon;
                    ImageResource$Network imageResource$Network = (image2 == null || (str = image2.f809default) == null) ? null : new ImageResource$Network(str);
                    String str3 = bullet.title;
                    TextResource.Text text3 = str3 != null ? new TextResource.Text(zabr.fromHtml(str3)) : null;
                    String str4 = bullet.content;
                    ListItemKt.ListItem(new BulletUI(text3, str4 != null ? new TextResource.Text(zabr.fromHtml(str4)) : null, imageResource$Network), function1, gapComposer, 0);
                    SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
                }
                gapComposer.end(false);
            }
            gapComposer.end(false);
            if (text2 == null) {
                gapComposer.startReplaceGroup(-1900196790);
            } else {
                gapComposer.startReplaceGroup(-1900196789);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
                ListItemKt.Subtitle(text2, function1, gapComposer, 0);
            }
            gapComposer.end(false);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 24.0f));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ListItemKt.ListItem((BulletUI) it.next(), function1, gapComposer, 0);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Applier applier;
        int i = this.$r8$classId;
        int i2 = 7;
        int i3 = 3;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj4 = this.f$4;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        Object obj7 = this.f$3;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                Set set = (Set) obj8;
                Function1 function1 = (Function1) obj6;
                DismissState dismissState = (DismissState) obj5;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj7;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj4;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18);
                Applier applier2 = gapComposer.applier;
                if (shouldExecute) {
                    float m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(boxWithConstraintsScopeImpl.constraints);
                    boolean z = gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection) == LayoutDirection.Rtl;
                    Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
                    DismissValue dismissValue = DismissValue.Default;
                    LinkedHashMap mutableMapOf = MapsKt__MapsKt.mutableMapOf(new Pair(valueOf, dismissValue));
                    DismissDirection dismissDirection = DismissDirection.StartToEnd;
                    if (set.contains(dismissDirection)) {
                        mutableMapOf.put(Float.valueOf(m1025getMaxWidthimpl), DismissValue.DismissedToEnd);
                    }
                    DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                    if (set.contains(dismissDirection2)) {
                        applier = applier2;
                        mutableMapOf.put(Float.valueOf(-m1025getMaxWidthimpl), DismissValue.DismissedToStart);
                    } else {
                        applier = applier2;
                    }
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new SwipeToDismissKt$$ExternalSyntheticLambda4(0, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function2 function2 = (Function2) rememberedValue;
                    float f = set.contains(dismissDirection2) ? 10.0f : 20.0f;
                    float f2 = set.contains(dismissDirection) ? 10.0f : 20.0f;
                    Orientation orientation = Orientation.Vertical;
                    boolean z2 = dismissState.currentValue$delegate.getValue() == dismissValue;
                    ResistanceConfig resistanceConfig = new ResistanceConfig(m1025getMaxWidthimpl, f, f2);
                    SpringSpec springSpec = SwipeableDefaults.AnimationSpec;
                    Modifier composed = PlatformKt.composed(companion, new SwipeableKt$$ExternalSyntheticLambda0(mutableMapOf, dismissState, resistanceConfig, function2, z2, z));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, composed);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$13);
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize();
                    Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
                    BiasAlignment.Vertical vertical = Alignment.Companion.Top;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 0);
                    int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, matchParentSize);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$13);
                    }
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composableLambdaImpl.invoke((Object) rowScopeInstance, (Object) gapComposer, (Object) 6);
                    gapComposer.end(true);
                    boolean changed2 = gapComposer.changed(dismissState);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new SwipeableState$$ExternalSyntheticLambda2(dismissState, 1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Modifier offset = OffsetKt.offset(companion, (Function1) rememberedValue2);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 0);
                    int currentCompositeKeyHash3 = Updater.getCurrentCompositeKeyHash(gapComposer);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, offset);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash3, gapComposer, currentCompositeKeyHash3, composeUiNode$Companion$SetModifier$13);
                    }
                    Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    composableLambdaImpl2.invoke((Object) rowScopeInstance, (Object) gapComposer, (Object) 6);
                    gapComposer.end(true);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj8;
                final Function0 function0 = (Function0) obj6;
                final ItemAccessory.PortraitImage portraitImage = (ItemAccessory.PortraitImage) obj5;
                final AsyncImagePainter asyncImagePainter = (AsyncImagePainter) obj7;
                final AsyncImagePainter.State state = (AsyncImagePainter.State) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(booleanValue) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    gapComposer2.skipToGroupEnd();
                } else if (booleanValue) {
                    gapComposer2.startReplaceGroup(727652908);
                    boolean changedInstance = gapComposer2.changedInstance(portraitImage);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ActivityItemViewKt$$ExternalSyntheticLambda28(portraitImage, 0);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    realCellActivityAccessoryScope.button(function0, (Function1) rememberedValue3);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(727846038);
                    final int i4 = 0;
                    realCellActivityAccessoryScope.custom(Expect_jvmKt.rememberComposableLambda(-568497122, new Function2() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            int i5 = i4;
                            Composer composer3 = (Composer) obj9;
                            int intValue3 = ((Integer) obj10).intValue();
                            switch (i5) {
                                case 0:
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        ActivityItemViewKt.ImageButton(function0, asyncImagePainter, state, portraitImage, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), gapComposer3, 0, 0);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        ActivityItemViewKt.ImageButton(function0, asyncImagePainter, state, portraitImage, null, gapComposer4, 0, 16);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2));
                    gapComposer2.end(false);
                }
                return Unit.INSTANCE;
            case 2:
                RealCompactActivityAccessoryScope realCompactActivityAccessoryScope = (RealCompactActivityAccessoryScope) obj8;
                final Function0 function02 = (Function0) obj6;
                final ItemAccessory.PortraitImage portraitImage2 = (ItemAccessory.PortraitImage) obj5;
                final AsyncImagePainter asyncImagePainter2 = (AsyncImagePainter) obj7;
                final AsyncImagePainter.State state2 = (AsyncImagePainter.State) obj4;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(booleanValue2) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    gapComposer3.skipToGroupEnd();
                } else if (booleanValue2) {
                    gapComposer3.startReplaceGroup(2019465227);
                    boolean changedInstance2 = gapComposer3.changedInstance(portraitImage2);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ActivityItemViewKt$$ExternalSyntheticLambda28(portraitImage2, 2);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    Function1 function12 = (Function1) rememberedValue4;
                    realCompactActivityAccessoryScope.getClass();
                    function02.getClass();
                    function12.getClass();
                    realCompactActivityAccessoryScope.type$delegate.setValue(RealCompactActivityAccessoryScope.Type.BUTTON);
                    realCompactActivityAccessoryScope.accessoryContent$delegate.setValue(new ComposableLambdaImpl(new OpenSessionByIdDialogKt$$ExternalSyntheticLambda1(function12, function02, 1, false ? (byte) 1 : (byte) 0), true, -497601775));
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(2019655846);
                    final int i5 = 1;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1435748955, new Function2() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            int i52 = i5;
                            Composer composer32 = (Composer) obj9;
                            int intValue32 = ((Integer) obj10).intValue();
                            switch (i52) {
                                case 0:
                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                    if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 3) != 2)) {
                                        ((DefaultSizes) gapComposer32.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        ActivityItemViewKt.ImageButton(function02, asyncImagePainter2, state2, portraitImage2, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), gapComposer32, 0, 0);
                                    } else {
                                        gapComposer32.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    GapComposer gapComposer4 = (GapComposer) composer32;
                                    if (gapComposer4.shouldExecute(intValue32 & 1, (intValue32 & 3) != 2)) {
                                        ActivityItemViewKt.ImageButton(function02, asyncImagePainter2, state2, portraitImage2, null, gapComposer4, 0, 16);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer3);
                    realCompactActivityAccessoryScope.getClass();
                    realCompactActivityAccessoryScope.type$delegate.setValue(RealCompactActivityAccessoryScope.Type.CUSTOM);
                    realCompactActivityAccessoryScope.accessoryContent$delegate.setValue(rememberComposableLambda);
                    gapComposer3.end(false);
                }
                return Unit.INSTANCE;
            case 3:
                LazyListState lazyListState = (LazyListState) obj8;
                AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RowViewModel rowViewModel = (AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RowViewModel) obj5;
                Function1 function13 = (Function1) obj6;
                AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.SectionViewModel sectionViewModel = (AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.SectionViewModel) obj7;
                SearchBarKeyboardState searchBarKeyboardState = (SearchBarKeyboardState) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    boolean changedInstance3 = gapComposer4.changedInstance(rowViewModel);
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new ContextKt$$ExternalSyntheticLambda1(rowViewModel, 12);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    }
                    if (((Boolean) ListsKt.rememberLazyListItemVisibility(lazyListState, (Function1) rememberedValue5, gapComposer4).getValue()).booleanValue()) {
                        function13.invoke(new AfterpaySearchViewEvent.SearchResultRowViewed(sectionViewModel.id, rowViewModel.id));
                    }
                    String str = rowViewModel.title;
                    String str2 = rowViewModel.subtitle;
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(752028014, new ButtonBinding$$ExternalSyntheticLambda2(rowViewModel, i2), gapComposer4);
                    boolean changed3 = gapComposer4.changed(searchBarKeyboardState) | gapComposer4.changed(function13) | gapComposer4.changedInstance(sectionViewModel) | gapComposer4.changedInstance(rowViewModel);
                    Object rememberedValue6 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new l2$$ExternalSyntheticLambda7(searchBarKeyboardState, function13, sectionViewModel, rowViewModel, 15);
                        gapComposer4.updateRememberedValue(rememberedValue6);
                    }
                    CellDefaultKt.CellSearchResult(rememberComposableLambda2, str, (Modifier) null, (Function0) rememberedValue6, str2, (Function1) null, gapComposer4, 6, 36);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Function3 function3 = (Function3) obj8;
                ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) obj7;
                Function2 function22 = (Function2) obj6;
                Function3 function32 = (Function3) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer5 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Strings.getSizes(composer5).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(SpacerKt.m298padding3ABfNKs(companion, 8.0f), 1.0f), 64.0f, RecyclerView.DECELERATION_RATE, 2);
                long j = Strings.getColors(composer5).component.toast.background.f220default;
                Strings.getSizes(composer5).getClass();
                Object obj9 = DefaultSizes.border.entries;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m279heightInVpY3zN4$default, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
                Strings.getSizes(composer5).getClass();
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 8.0f);
                Unit unit = Unit.INSTANCE;
                GapComposer gapComposer5 = (GapComposer) composer5;
                Object rememberedValue7 = gapComposer5.rememberedValue();
                if (rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = ToastKt$Toast$12$1$1.INSTANCE;
                    gapComposer5.updateRememberedValue(rememberedValue7);
                }
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(m298padding3ABfNKs, unit, (PointerInputEventHandler) rememberedValue7);
                RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer5, 48);
                int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer5.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer5, pointerInput);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                if (gapComposer5.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer5.startReusableNode();
                if (gapComposer5.inserting) {
                    gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer5.useNode();
                }
                Updater.m576setimpl(gapComposer5, rowMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer5, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer5, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer5).semantic.text.inverse, ArcadeThemeKt.LocalTextColor), Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer5).semantic.icon.inverse, ArcadeThemeKt.LocalIconColor)}, Expect_jvmKt.rememberComposableLambda(2029301385, new AvatarsKt$$ExternalSyntheticLambda4(function3, composableLambdaImpl3, function22, function32, mutableState), gapComposer5), gapComposer5, 56);
                gapComposer5.end(true);
                return unit;
            case 5:
                BankAccountLinkingViewModel bankAccountLinkingViewModel = (BankAccountLinkingViewModel) obj8;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj5;
                Function1 function14 = (Function1) obj6;
                MutableState mutableState2 = (MutableState) obj7;
                MutableState mutableState3 = (MutableState) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    int ordinal = bankAccountLinkingViewModel.bottomButton.ordinal();
                    Integer valueOf2 = ordinal != 1 ? ordinal != 2 ? null : Integer.valueOf(R.string.blockers_skip) : Integer.valueOf(R.string.blockers_help);
                    if (valueOf2 == null) {
                        gapComposer6.startReplaceGroup(-159963350);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(-159963349);
                        int intValue6 = valueOf2.intValue();
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changedInstance4 = gapComposer6.changedInstance(bankAccountLinkingViewModel) | gapComposer6.changed(function14);
                        Object rememberedValue8 = gapComposer6.rememberedValue();
                        if (changedInstance4 || rememberedValue8 == neverEqualPolicy) {
                            rememberedValue8 = new BulletinTileKt$$ExternalSyntheticLambda12(10, (Object) bankAccountLinkingViewModel, function14);
                            gapComposer6.updateRememberedValue(rememberedValue8);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue8, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1271580964, new TabToolbarsKt$$ExternalSyntheticLambda21(intValue6, 2), gapComposer6), gapComposer6, 1572912, 60);
                        gapComposer6.end(false);
                    }
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean z3 = !animatedContentScopeImpl.$$delegate_0.getTransition().isRunning() && ((Boolean) mutableState3.getValue()).booleanValue();
                    boolean changed4 = gapComposer6.changed(function14) | gapComposer6.changed(mutableState2);
                    Object rememberedValue9 = gapComposer6.rememberedValue();
                    if (changed4 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new CashtagViewKt$$ExternalSyntheticLambda13(function14, mutableState2, 6);
                        gapComposer6.updateRememberedValue(rememberedValue9);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue9, fillMaxWidth2, buttonProminence, false, z3, null, AmountBlockerViewKt.f289lambda$2090056210, gapComposer6, 1573296, 40);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                VerifyAliasModel.ResendCodeButtonState resendCodeButtonState = (VerifyAliasModel.ResendCodeButtonState) obj8;
                Function1 function15 = (Function1) obj6;
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj5;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj7;
                MutableState mutableState4 = (MutableState) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    ButtonProminence buttonProminence2 = ButtonProminence.STANDARD;
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean z4 = resendCodeButtonState instanceof VerifyAliasModel.ResendCodeButtonState.Enabled;
                    boolean changed5 = gapComposer7.changed(function15);
                    Object rememberedValue10 = gapComposer7.rememberedValue();
                    if (changed5 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new BorrowHomeKt$$ExternalSyntheticLambda3(3, function15);
                        gapComposer7.updateRememberedValue(rememberedValue10);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue10, fillMaxWidth3, buttonProminence2, false, z4, null, VerifyAliasViewKt.lambda$1043950068, gapComposer7, 1573296, 40);
                    ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean z5 = ((String) mutableState4.getValue()).length() > 0;
                    boolean changedInstance5 = gapComposer7.changedInstance(focusOwnerImpl) | gapComposer7.changed(delegatingSoftwareKeyboardController) | gapComposer7.changed(function15) | gapComposer7.changed(mutableState4);
                    Object rememberedValue11 = gapComposer7.rememberedValue();
                    if (changedInstance5 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new l2$$ExternalSyntheticLambda7(focusOwnerImpl, delegatingSoftwareKeyboardController, function15, mutableState4, 18);
                        gapComposer7.updateRememberedValue(rememberedValue11);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue11, fillMaxWidth4, buttonProminence3, false, z5, null, VerifyAliasViewKt.f310lambda$1084544483, gapComposer7, 1573296, 40);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                LegacySheetConfig legacySheetConfig = (LegacySheetConfig) obj8;
                RealSheetState realSheetState = (RealSheetState) obj6;
                Function0 function03 = (Function0) obj5;
                BottomSheetStateListener bottomSheetStateListener = (BottomSheetStateListener) obj7;
                Function2 function23 = (Function2) obj4;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    if (legacySheetConfig != null && legacySheetConfig.getInitialHeightPx() != null) {
                        paddingValues = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, (1.0f - realSheetState.getExpandProgress()) * 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    } else if (legacySheetConfig != null && legacySheetConfig.getConsumeInsetsBeforeSheet()) {
                        paddingValues = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 3);
                    }
                    if (legacySheetConfig != null) {
                        gapComposer8.startReplaceGroup(1030563675);
                        int expandProgress = (int) ((1.0f - realSheetState.getExpandProgress()) * (((((Number) function03.invoke()).floatValue() - DensityUtilsKt.m3477toPx8Feqmps(paddingValues.mo267calculateTopPaddingD9Ej5fM(), gapComposer8)) - DensityUtilsKt.m3477toPx8Feqmps(paddingValues.mo264calculateBottomPaddingD9Ej5fM(), gapComposer8)) - (legacySheetConfig.getInitialHeightPx() != null ? r3.intValue() : 0)));
                        boolean changedInstance6 = gapComposer8.changedInstance(legacySheetConfig) | gapComposer8.changed(expandProgress);
                        Object rememberedValue12 = gapComposer8.rememberedValue();
                        if (changedInstance6 || rememberedValue12 == neverEqualPolicy) {
                            rememberedValue12 = new q2$$ExternalSyntheticLambda8(legacySheetConfig, expandProgress, 10);
                            gapComposer8.updateRememberedValue(rememberedValue12);
                        }
                        Updater.SideEffect((Function0) rememberedValue12, gapComposer8);
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(1030893298);
                        gapComposer8.end(false);
                    }
                    if (bottomSheetStateListener != null) {
                        gapComposer8.startReplaceGroup(1030941069);
                        SheetPosition settledPosition = realSheetState.getSettledPosition();
                        boolean changedInstance7 = gapComposer8.changedInstance(bottomSheetStateListener) | gapComposer8.changed(realSheetState);
                        Object rememberedValue13 = gapComposer8.rememberedValue();
                        if (changedInstance7 || rememberedValue13 == neverEqualPolicy) {
                            rememberedValue13 = new RealAppConfigManager$update$2$2(bottomSheetStateListener, realSheetState, null, 12);
                            gapComposer8.updateRememberedValue(rememberedValue13);
                        }
                        Updater.LaunchedEffect(gapComposer8, settledPosition, (Function2) rememberedValue13);
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(1031560914);
                        gapComposer8.end(false);
                    }
                    Object rememberedValue14 = gapComposer8.rememberedValue();
                    if (rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer8);
                        gapComposer8.updateRememberedValue(rememberedValue14);
                    }
                    Updater.CompositionLocalProvider(UiContainerKt.LocalLegacySheetScope.defaultProvidedValue$runtime(new UiContainerKt$BottomSheet$1$sheetScope$1((CoroutineScope) rememberedValue14, realSheetState)), Expect_jvmKt.rememberComposableLambda(-452035472, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(1, paddingValues, function23), gapComposer8), gapComposer8, 56);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                String str3 = (String) obj8;
                String str4 = (String) obj6;
                Function0 function04 = (Function0) obj5;
                Painter painter = (Painter) obj7;
                String str5 = (String) obj4;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                boolean shouldExecute2 = gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16);
                Applier applier3 = gapComposer9.applier;
                if (shouldExecute2) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer9, 0);
                    int hashCode2 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer9, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier3 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer9.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer9, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf3 = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer9, valueOf3, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer9, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer9, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                    Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(companion, 1.0f);
                    Strings.getSizes(gapComposer9).getClass();
                    Object obj10 = DefaultSizes.border.entries;
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(ClipKt.clip(fillMaxWidth5, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), Strings.getColors(gapComposer9).semantic.background.subtle, ColorKt.RectangleShape);
                    Strings.getSizes(gapComposer9).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m177backgroundbw27NRU2, RecyclerView.DECELERATION_RATE, 16.0f, 1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode3 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer9, m300paddingVpY3zN4$default);
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer9, composeUiNode$Companion$SetModifier$17, gapComposer9, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer9, materializeModifier6, composeUiNode$Companion$SetModifier$18);
                    ImageKt.Image(painter, null, SizeKt.m285size3ABfNKs(companion, 120.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer9, Painter.$stable | 432, 120);
                    gapComposer9.end(true);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer9, null);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer9, SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer9).sectionTitle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer9, null);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer9).semantic.text.subtle, (Composer) gapComposer9, (Modifier) null, Strings.getTypography(gapComposer9).bodyMedium, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer9, null);
                    coil3.size.SizeKt.ButtonCta(function04, SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(-1271637475, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str5, 5), gapComposer9), gapComposer9, 1573296, 56);
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                InvestingCustomOrderContentModel investingCustomOrderContentModel = (InvestingCustomOrderContentModel) obj8;
                Function1 function16 = (Function1) obj6;
                MutableState mutableState5 = (MutableState) obj5;
                MutableState mutableState6 = (MutableState) obj7;
                State state3 = (State) obj4;
                BoxScope boxScope = (BoxScope) obj;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                boxScope.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer10).changed(boxScope) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    InvestingCustomOrderContentModel.Content content = (InvestingCustomOrderContentModel.Content) investingCustomOrderContentModel;
                    CustomOrderKt.PriceWidget(content.tooltip, (GraphState) mutableState5.getValue(), (PriceWidgetState) mutableState6.getValue(), function16, ((Number) state3.getValue()).floatValue(), content.headerViewModel.accentColor, boxScope.align(SizeKt.fillMaxSize(companion, 1.0f), Alignment.Companion.TopCenter), gapComposer10, 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Function5 function5 = (Function5) obj8;
                List list = (List) obj5;
                Function1 function17 = (Function1) obj6;
                Function1 function18 = (Function1) obj7;
                MutableState mutableState7 = (MutableState) obj4;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer11).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (!gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    gapComposer11.skipToGroupEnd();
                } else if (function5 == null) {
                    gapComposer11.startReplaceGroup(-1942196261);
                    Modifier padding = SpacerKt.padding(companion, paddingValues2);
                    Object rememberedValue15 = gapComposer11.rememberedValue();
                    if (rememberedValue15 == neverEqualPolicy) {
                        rememberedValue15 = new CashMapViewKt$$ExternalSyntheticLambda2(8, mutableState7);
                        gapComposer11.updateRememberedValue(rememberedValue15);
                    }
                    CashMapViewKt.MarkerLocationSelectorSheetContent(padding, list, function17, function18, (Function0) rememberedValue15, gapComposer11, 24576);
                    gapComposer11.end(false);
                } else {
                    gapComposer11.startReplaceGroup(-1941872032);
                    Modifier padding2 = SpacerKt.padding(companion, paddingValues2);
                    Object rememberedValue16 = gapComposer11.rememberedValue();
                    if (rememberedValue16 == neverEqualPolicy) {
                        rememberedValue16 = new CashMapViewKt$$ExternalSyntheticLambda2(9, mutableState7);
                        gapComposer11.updateRememberedValue(rememberedValue16);
                    }
                    function5.invoke(padding2, list, (Function0) rememberedValue16, gapComposer11, Integer.valueOf(MLKEMEngine.KyberPolyBytes));
                    gapComposer11.end(false);
                }
                return Unit.INSTANCE;
            case 11:
                List list2 = (List) obj8;
                Function2 function24 = (Function2) obj6;
                InstalledAppletTileHeaderModel installedAppletTileHeaderModel = (InstalledAppletTileHeaderModel) obj5;
                InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig = (InstalledServiceAppletTileLayoutConfig) obj7;
                Function2 function25 = (Function2) obj4;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    SharedUIKt.InstalledServiceAppletTileContent(list2, function24, installedAppletTileHeaderModel != null, installedServiceAppletTileLayoutConfig, function25, gapComposer12, 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                SegmentedCircleInteractableState segmentedCircleInteractableState = (SegmentedCircleInteractableState) obj6;
                Function2 function26 = (Function2) obj5;
                Function2 function27 = (Function2) obj7;
                Function2 function28 = (Function2) obj4;
                Modifier modifier = (Modifier) obj;
                ((Integer) obj3).getClass();
                modifier.getClass();
                GapComposer gapComposer13 = (GapComposer) ((Composer) obj2);
                gapComposer13.startReplaceGroup(-405252938);
                MutableState rememberUpdatedState = Updater.rememberUpdatedState((DistributionWheelViewModel) obj8, gapComposer13);
                Object rememberedValue17 = gapComposer13.rememberedValue();
                Object obj11 = rememberedValue17;
                if (rememberedValue17 == neverEqualPolicy) {
                    DerivedSnapshotState derivedStateOf = Updater.derivedStateOf(new OverlayKt$$ExternalSyntheticLambda1(i2, rememberUpdatedState));
                    gapComposer13.updateRememberedValue(derivedStateOf);
                    obj11 = derivedStateOf;
                }
                State state4 = (State) obj11;
                Object rememberedValue18 = gapComposer13.rememberedValue();
                Object obj12 = rememberedValue18;
                if (rememberedValue18 == neverEqualPolicy) {
                    DerivedSnapshotState derivedStateOf2 = Updater.derivedStateOf(new HeroCardViewKt$$ExternalSyntheticLambda2(rememberUpdatedState, state4, i3));
                    gapComposer13.updateRememberedValue(derivedStateOf2);
                    obj12 = derivedStateOf2;
                }
                State state5 = (State) obj12;
                Integer valueOf4 = Integer.valueOf(((DistributionWheelViewModel) rememberUpdatedState.getValue()).allocations.size());
                boolean changedInstance8 = gapComposer13.changedInstance(segmentedCircleInteractableState) | gapComposer13.changed(function26) | gapComposer13.changed(rememberUpdatedState) | gapComposer13.changed(function27) | gapComposer13.changed(function28);
                Object rememberedValue19 = gapComposer13.rememberedValue();
                if (changedInstance8 || rememberedValue19 == neverEqualPolicy) {
                    rememberedValue19 = new DistributionWheelGesturesKt$handleGestures$1$1$1(segmentedCircleInteractableState, function26, state4, rememberUpdatedState, state5, function27, function28);
                    gapComposer13.updateRememberedValue(rememberedValue19);
                }
                Modifier pointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifier, valueOf4, (PointerInputEventHandler) rememberedValue19);
                gapComposer13.end(false);
                return pointerInput2;
            case 13:
                return invoke$com$squareup$cash$payments$views$personalization$ExpressivePreviewKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 14:
                return invoke$com$squareup$cash$payments$views$personalization$TransformableKt$$ExternalSyntheticLambda1(obj, obj2, obj3);
            case 15:
                return invoke$com$squareup$cash$support$chat$views$transcript$message$compose$MessageRetryKt$$ExternalSyntheticLambda7(obj, obj2, obj3);
            case 16:
                return invoke$com$squareup$cash$work$views$clockin$ClockInOverlayViewKt$$ExternalSyntheticLambda27(obj, obj2, obj3);
            case 17:
                return invoke$com$stripe$android$financialconnections$features$common$ModalBottomSheetContentKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 18:
                return invoke$com$stripe$android$financialconnections$features$common$ModalBottomSheetContentKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            default:
                Density density = (Density) obj8;
                ComposableLambdaImpl composableLambdaImpl4 = (ComposableLambdaImpl) obj7;
                Brush brush = (Brush) obj6;
                State state6 = (State) obj5;
                MutableState mutableState8 = (MutableState) obj4;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    TextKt.ProvideTextStyle(TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer14.consume(ThemeKt.LocalTypography)).labelLargeEmphasized, 0L, 0L, null, null, Room.getSp(0), null, 0L, null, null, null, 0, 0L, null, null, 0, 16777087), Expect_jvmKt.rememberComposableLambda(1138396394, new WalletHomeViewKt$$ExternalSyntheticLambda4(density, composableLambdaImpl4, brush, state6, mutableState8, 7), gapComposer14), gapComposer14, 48);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda2(int i, Object obj, Object obj2, Object obj3, Object obj4, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = function1;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda2(Object obj, ComposableLambdaImpl composableLambdaImpl, Object obj2, Object obj3, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$3 = composableLambdaImpl;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = mutableState;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }
}
