package com.squareup.cash.afterpayapplet.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.RealSubcomposeAsyncImageScope;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.compact.CompactActivityScopesKt;
import com.squareup.cash.activity.views.compact.RealCompactActivityAccessoryScope;
import com.squareup.cash.activity.views.compact.RealCompactActivityAvatarScope;
import com.squareup.cash.afterpayapplet.viewmodels.LoadableText;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.amountslider.TickersAmountCaptionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.moneybot.genie.DatePickerViewKt$$ExternalSyntheticLambda11;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterpaySearchViewKt$$ExternalSyntheticLambda16 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AfterpaySearchViewKt$$ExternalSyntheticLambda16(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ProgressCircularKt.ProgressCircular(0, 0, gapComposer, SizeKt.m285size3ABfNKs(BoxScopeInstance.INSTANCE.align(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 16.0f, 1), Alignment.Companion.Center), 32.0f));
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.activity_error_action), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                RealCellActivityAvatarScope realCellActivityAvatarScope = (RealCellActivityAvatarScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                realCellActivityAvatarScope.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(realCellActivityAvatarScope) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    realCellActivityAvatarScope.m3395AvatarOadGlvw("", colors.semantic.background.subtle, null, null, gapComposer3, ((intValue3 << 18) & 3670016) | 6, 60);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                realCellActivityAccessoryScope.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(realCellActivityAccessoryScope) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    realCellActivityAccessoryScope.amount(AvatarsKt.f116lambda$1345117277);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer5, R.string.card_message_modal_dismiss_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.card_message_modal_cancel_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                RealCompactActivityAvatarScope realCompactActivityAvatarScope = (RealCompactActivityAvatarScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                realCompactActivityAvatarScope.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(realCompactActivityAvatarScope) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    Colors colors2 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    realCompactActivityAvatarScope.m2974AvatarOadGlvw(colors2.semantic.background.brand, gapComposer7, ((intValue7 << 18) & 3670016) | 6);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                RealCompactActivityAccessoryScope realCompactActivityAccessoryScope = (RealCompactActivityAccessoryScope) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                realCompactActivityAccessoryScope.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(realCompactActivityAccessoryScope) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    realCompactActivityAccessoryScope.amount(CompactActivityScopesKt.f127lambda$1931533675);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer9, R.string.receipt_load_error_retry), (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer10, R.string.receipt_location_open_map), (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Colors colors3 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    SharedUIKt.m3604FilledCircleWithIconJqkWdHE(colors3.semantic.text.brand, Icons.LogoAfterpay16, Color.White, RecyclerView.DECELERATION_RATE, gapComposer11, 432, 8);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer12, SizeKt.m277height3ABfNKs(companion, 96.0f));
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                LoadableText loadableText = (LoadableText) obj;
                ((Integer) obj3).getClass();
                loadableText.getClass();
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                GapComposer gapComposer13 = (GapComposer) ((Composer) obj2);
                TextStyle textStyle = ((Typography) gapComposer13.consume(staticProvidableCompositionLocal)).hero;
                if (loadableText instanceof LoadableText.Loaded) {
                    gapComposer13.startReplaceGroup(475391276);
                    ((DefaultSizes) gapComposer13.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer13, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), ((Typography) gapComposer13.consume(staticProvidableCompositionLocal)).numeralLarge, (TextLineBalancing) null, ((LoadableText.Loaded) loadableText).text, (Map) null, (Function1) null, false);
                    gapComposer13.end(false);
                } else {
                    gapComposer13.startReplaceGroup(475633169);
                    VisibleKt.ShimmerBox(null, false, null, Expect_jvmKt.rememberComposableLambda(1248532319, new DatePickerViewKt$$ExternalSyntheticLambda11(textStyle, r10 ? 1 : 0), gapComposer13), gapComposer13, 3072, 7);
                    gapComposer13.end(false);
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 16.0f, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8);
                    Object rememberedValue = gapComposer14.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(7);
                        gapComposer14.updateRememberedValue(rememberedValue);
                    }
                    ModalKt.HorizontalDivider(0, 0, gapComposer14, SemanticsModifierKt.clearAndSetSemantics(m302paddingqDBjuR0$default, (Function1) rememberedValue));
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (gapComposer15.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    ((DefaultSizes) gapComposer15.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion, 16.0f);
                    Object rememberedValue2 = gapComposer15.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(14);
                        gapComposer15.updateRememberedValue(rememberedValue2);
                    }
                    SpacerKt.Spacer(gapComposer15, SemanticsModifierKt.clearAndSetSemantics(m277height3ABfNKs, (Function1) rememberedValue2));
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer16, R.string.select_afterpay_prompt_button_text), (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                PainterRequest painterRequest = (PainterRequest) obj;
                int intValue16 = ((Integer) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer17 = (GapComposer) ((Composer) obj2);
                gapComposer17.startReplaceGroup(-608946256);
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, null, gapComposer17, intValue16 & 14, 1);
                gapComposer17.end(false);
                return rememberAsyncImagePainter;
            case 17:
                PainterRequest painterRequest2 = (PainterRequest) obj;
                int intValue17 = ((Integer) obj3).intValue();
                painterRequest2.getClass();
                GapComposer gapComposer18 = (GapComposer) ((Composer) obj2);
                gapComposer18.startReplaceGroup(-149370390);
                AsyncImagePainter rememberAsyncImagePainter2 = AsyncImageKt.rememberAsyncImagePainter(painterRequest2, null, gapComposer18, intValue17 & 14, 1);
                gapComposer18.end(false);
                return rememberAsyncImagePainter2;
            case 18:
                Composer composer16 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer16;
                if (gapComposer19.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 38.0f);
                    Colors colors4 = (Colors) gapComposer19.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer19, -1762997026, gapComposer19, false);
                    } else {
                        gapComposer19.startReplaceGroup(-1762997739);
                        gapComposer19.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors4.semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), gapComposer19, 0);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer17 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer17;
                if (gapComposer20.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(SizeKt.m290width3ABfNKs(companion, 240.0f), RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    Colors colors5 = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                    } else {
                        gapComposer20.startReplaceGroup(-1762997739);
                        gapComposer20.end(false);
                    }
                    long j = colors5.semantic.background.subtle;
                    ((DefaultSizes) gapComposer20.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj4 = DefaultSizes.border.entries;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m302paddingqDBjuR0$default2, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer20.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer20.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer20, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer20.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer20.startReusableNode();
                    if (gapComposer20.inserting) {
                        gapComposer20.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer20.useNode();
                    }
                    Updater.m576setimpl(gapComposer20, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer20, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer20, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer20, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer20, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer20.end(true);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer18 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer18;
                if (gapComposer21.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors6 = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                    } else {
                        gapComposer21.startReplaceGroup(-1762997739);
                        gapComposer21.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors6.semantic.background.subtle, ColorKt.RectangleShape), gapComposer21, 0);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope = (RealSubcomposeAsyncImageScope) obj;
                Composer composer19 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                realSubcomposeAsyncImageScope.getClass();
                AsyncImagePainter asyncImagePainter = realSubcomposeAsyncImageScope.painter;
                if ((intValue21 & 6) == 0) {
                    intValue21 |= ((GapComposer) composer19).changed(realSubcomposeAsyncImageScope) ? 4 : 2;
                }
                GapComposer gapComposer22 = (GapComposer) composer19;
                if (gapComposer22.shouldExecute(intValue21 & 1, (intValue21 & 19) != 18)) {
                    Object rememberedValue3 = gapComposer22.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = asyncImagePainter.state;
                        gapComposer22.updateRememberedValue(rememberedValue3);
                    }
                    AsyncImagePainter.State state = (AsyncImagePainter.State) Updater.collectAsState((StateFlow) rememberedValue3, null, gapComposer22, 1).getValue();
                    if ((state instanceof AsyncImagePainter.State.Loading) || (state instanceof AsyncImagePainter.State.Empty) || (state instanceof AsyncImagePainter.State.Error)) {
                        gapComposer22.startReplaceGroup(-1275753338);
                        VisibleKt.ShimmerBox(null, false, null, AfterpayCardKt.f138lambda$814953346, gapComposer22, 3072, 7);
                        gapComposer22.end(false);
                    } else {
                        if (!(state instanceof AsyncImagePainter.State.Success)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer22, 1621412238, false);
                        }
                        gapComposer22.startReplaceGroup(-1275517118);
                        ImageKt.Image(asyncImagePainter, null, SizeKt.fillMaxSize(companion, 1.0f), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer22, 25008, 104);
                        gapComposer22.end(false);
                    }
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer20 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer20;
                if (gapComposer23.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors7 = (Colors) gapComposer23.consume(ArcadeThemeKt.LocalColors);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-1762997739);
                        gapComposer23.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors7.semantic.background.subtle, RoundedCornerShapeKt.CircleShape), gapComposer23, 0);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope2 = (RealSubcomposeAsyncImageScope) obj;
                Composer composer21 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                realSubcomposeAsyncImageScope2.getClass();
                AsyncImagePainter asyncImagePainter2 = realSubcomposeAsyncImageScope2.painter;
                if ((intValue23 & 6) == 0) {
                    intValue23 |= ((GapComposer) composer21).changed(realSubcomposeAsyncImageScope2) ? 4 : 2;
                }
                GapComposer gapComposer24 = (GapComposer) composer21;
                if (gapComposer24.shouldExecute(intValue23 & 1, (intValue23 & 19) != 18)) {
                    Object rememberedValue4 = gapComposer24.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = asyncImagePainter2.state;
                        gapComposer24.updateRememberedValue(rememberedValue4);
                    }
                    AsyncImagePainter.State state2 = (AsyncImagePainter.State) Updater.collectAsState((StateFlow) rememberedValue4, null, gapComposer24, 1).getValue();
                    if ((state2 instanceof AsyncImagePainter.State.Loading) || (state2 instanceof AsyncImagePainter.State.Error) || (state2 instanceof AsyncImagePainter.State.Empty)) {
                        gapComposer24.startReplaceGroup(1190366946);
                        VisibleKt.ShimmerBox(null, false, null, AfterpayCardKt.lambda$1114729874, gapComposer24, 3072, 7);
                        gapComposer24.end(false);
                    } else {
                        if (!(state2 instanceof AsyncImagePainter.State.Success)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer24, -1762719134, false);
                        }
                        gapComposer24.startReplaceGroup(1190671428);
                        ImageKt.Image(asyncImagePainter2, null, SizeKt.fillMaxSize(companion, 1.0f), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer24, 25008, 104);
                        gapComposer24.end(false);
                    }
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer22 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer22;
                if (gapComposer25.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer25.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(fillMaxWidth, 32.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer25.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer25.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer25, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer25.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer25.startReusableNode();
                    if (gapComposer25.inserting) {
                        gapComposer25.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer25.useNode();
                    }
                    Updater.m576setimpl(gapComposer25, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer25, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer25, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer25, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer25, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer25, null);
                    gapComposer25.end(true);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer23 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer23;
                if (!gapComposer26.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer24 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer24;
                if (gapComposer27.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    Icons icons = Icons.Switcher16;
                    Colors colors8 = (Colors) gapComposer27.consume(ArcadeThemeKt.LocalColors);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer27, -1762997026, gapComposer27, false);
                    } else {
                        gapComposer27.startReplaceGroup(-1762997739);
                        gapComposer27.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, fillMaxSize3, colors8.semantic.text.brand, gapComposer27, 438, 0);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                String str = (String) obj;
                Composer composer25 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                str.getClass();
                if ((intValue27 & 6) == 0) {
                    intValue27 |= ((GapComposer) composer25).changed(str) ? 4 : 2;
                }
                GapComposer gapComposer28 = (GapComposer) composer25;
                if (gapComposer28.shouldExecute(intValue27 & 1, (intValue27 & 19) != 18)) {
                    TickersAmountCaptionKt.TickersAmountCaption(intValue27 & 14, gapComposer28, null, str);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer26 = (Composer) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer29 = (GapComposer) composer26;
                if (gapComposer29.shouldExecute(intValue28 & 1, (intValue28 & 17) != 16)) {
                    Icons icons2 = Icons.TickerUp16;
                    Colors colors9 = (Colors) gapComposer29.consume(ArcadeThemeKt.LocalColors);
                    if (colors9 == null) {
                        colors9 = re$$ExternalSyntheticOutline0.m(gapComposer29, -1762997026, gapComposer29, false);
                    } else {
                        gapComposer29.startReplaceGroup(-1762997739);
                        gapComposer29.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, colors9.semantic.text.subtle, gapComposer29, 54, 4);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer27 = (Composer) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer30 = (GapComposer) composer27;
                if (gapComposer30.shouldExecute(intValue29 & 1, (intValue29 & 17) != 16)) {
                    Icons icons3 = Icons.TickerDown16;
                    Colors colors10 = (Colors) gapComposer30.consume(ArcadeThemeKt.LocalColors);
                    if (colors10 == null) {
                        colors10 = re$$ExternalSyntheticOutline0.m(gapComposer30, -1762997026, gapComposer30, false);
                    } else {
                        gapComposer30.startReplaceGroup(-1762997739);
                        gapComposer30.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons3, (String) null, (Modifier) null, colors10.semantic.text.subtle, gapComposer30, 54, 4);
                } else {
                    gapComposer30.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
