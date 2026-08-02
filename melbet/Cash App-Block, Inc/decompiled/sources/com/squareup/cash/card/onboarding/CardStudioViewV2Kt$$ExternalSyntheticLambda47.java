package com.squareup.cash.card.onboarding;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.RealToastIconScope;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.borrow.views.BorrowHomeKt;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.onboarding.graphics.WandPose;
import com.squareup.cash.card.onboarding.graphics.WandPoseController;
import com.squareup.cash.cashapplite.views.KycAppletTileKt;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewV2Kt$$ExternalSyntheticLambda47 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CardStudioViewV2Kt$$ExternalSyntheticLambda47(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                Constraints constraints = (Constraints) obj3;
                measureScope.getClass();
                measurable.getClass();
                int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(constraints.value);
                long j = constraints.value;
                return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), Constraints.m1024getMaxHeightimpl(j), new BorrowHomeKt$$ExternalSyntheticLambda1(12, measurable.mo833measureBRTryo0(Constraints.m1017copyZbe2FdA(m1024getMaxHeightimpl, Constraints.m1024getMaxHeightimpl(j), Constraints.m1025getMaxWidthimpl(j), Constraints.m1025getMaxWidthimpl(j))), constraints));
            case 1:
                PainterRequest painterRequest = (PainterRequest) obj;
                int intValue = ((Integer) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(53509624);
                AsyncImagePainter loadPainter = BorrowHomeKt.loadPainter(painterRequest, gapComposer, intValue & 14);
                gapComposer.end(false);
                return loadPainter;
            case 2:
                PainterRequest painterRequest2 = (PainterRequest) obj;
                int intValue2 = ((Integer) obj3).intValue();
                painterRequest2.getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                gapComposer2.startReplaceGroup(-737555857);
                AsyncImagePainter loadPainter2 = BorrowHomeKt.loadPainter(painterRequest2, gapComposer2, intValue2 & 14);
                gapComposer2.end(false);
                return loadPainter2;
            case 3:
                PainterRequest painterRequest3 = (PainterRequest) obj;
                int intValue3 = ((Integer) obj3).intValue();
                painterRequest3.getClass();
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj2);
                gapComposer3.startReplaceGroup(357270576);
                AsyncImagePainter loadPainter3 = BorrowHomeKt.loadPainter(painterRequest3, gapComposer3, intValue3 & 14);
                gapComposer3.end(false);
                return loadPainter3;
            case 4:
                PainterRequest painterRequest4 = (PainterRequest) obj;
                int intValue4 = ((Integer) obj3).intValue();
                painterRequest4.getClass();
                GapComposer gapComposer4 = (GapComposer) ((Composer) obj2);
                gapComposer4.startReplaceGroup(404791728);
                AsyncImagePainter loadPainter4 = BorrowHomeKt.loadPainter(painterRequest4, gapComposer4, intValue4 & 14);
                gapComposer4.end(false);
                return loadPainter4;
            case 5:
                Composer composer = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Icons icons = Icons.InformationFill16;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, fillMaxSize, colors.semantic.icon.subtle, gapComposer5, 438, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer2 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer2;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.bug_reporting_submit_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer3 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer3;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer7, R.string.bug_reporting_attachment_remove), (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer4 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer4;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer8, R.string.bug_reporting_share_issue_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer5 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer5;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer9, R.string.bug_reporting_success_continue), (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer6 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer6;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer10, R.string.afterpay_try_again), (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer7 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer7;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer11.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 16.0f, 1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer11, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer11, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer11, null);
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                CardPreviewSheet cardPreviewSheet = (CardPreviewSheet) obj;
                int intValue12 = ((Integer) obj3).intValue();
                cardPreviewSheet.getClass();
                CardPreviewViewKt.ThemeInfoSheet(cardPreviewSheet, (Composer) obj2, intValue12 & 14);
                return Unit.INSTANCE;
            case 13:
                Composer composer8 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer8;
                if (gapComposer12.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Trace.m1191Iconww6aTOc(Icons.Clear24, (String) null, (Modifier) null, 0L, gapComposer12, 54, 12);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer12, R.string.card_studio_more_start_over), (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer9 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer9;
                if (gapComposer13.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer13, R.string.card_studio_more_done), (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer10 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer10;
                if (gapComposer14.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer14, null);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer11 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer11;
                if (gapComposer15.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer15, SizeKt.m290width3ABfNKs(companion, 16.0f));
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer12 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer12;
                if (gapComposer16.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer16, SizeKt.m290width3ABfNKs(companion, 16.0f));
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer13 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer13;
                if (!gapComposer17.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer14 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer14;
                if (gapComposer18.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.cancel), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                String str = (String) obj;
                Composer composer15 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                str.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((GapComposer) composer15).changed(str) ? 4 : 2;
                }
                GapComposer gapComposer19 = (GapComposer) composer15;
                if (!gapComposer19.shouldExecute(intValue20 & 1, (intValue20 & 19) != 18)) {
                    gapComposer19.skipToGroupEnd();
                } else if (str.length() > 0) {
                    gapComposer19.startReplaceGroup(-1136019974);
                    Colors colors2 = (Colors) gapComposer19.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer19, -1762997026, gapComposer19, false);
                    } else {
                        gapComposer19.startReplaceGroup(-1762997739);
                        gapComposer19.end(false);
                    }
                    Room.m1165Text25TpFw(2, 1, 0, 3, (intValue20 & 14) | 1769520, 0, 3732, colors2.semantic.text.standard, (Composer) gapComposer19, SizeKt.fillMaxWidth(companion, 1.0f), (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer19.end(false);
                } else {
                    gapComposer19.startReplaceGroup(-1135706192);
                    gapComposer19.end(false);
                }
                return Unit.INSTANCE;
            case 21:
                Image image = (Image) obj;
                Composer composer16 = (Composer) obj2;
                ((Integer) obj3).intValue();
                if (image != null) {
                    GapComposer gapComposer20 = (GapComposer) composer16;
                    gapComposer20.startReplaceGroup(-1363136242);
                    AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(image, gapComposer20), null, SizeKt.fillMaxSize(companion, 1.0f), null, ContentScale.Companion.Crop, null, gapComposer20, 1573296, 1976);
                    gapComposer20.end(false);
                } else {
                    GapComposer gapComposer21 = (GapComposer) composer16;
                    gapComposer21.startReplaceGroup(-1362937966);
                    gapComposer21.end(false);
                }
                return Unit.INSTANCE;
            case 22:
                WandPose wandPose = (WandPose) obj;
                int intValue21 = ((Integer) obj3).intValue();
                wandPose.getClass();
                GapComposer gapComposer22 = (GapComposer) ((Composer) obj2);
                gapComposer22.startReplaceGroup(1584794824);
                Pair rememberHeartController = FlowsKt.rememberHeartController(wandPose, gapComposer22, (intValue21 & 14) | 48);
                gapComposer22.end(false);
                return rememberHeartController;
            case 23:
                WandPose wandPose2 = (WandPose) obj;
                int intValue22 = ((Integer) obj3).intValue();
                wandPose2.getClass();
                GapComposer gapComposer23 = (GapComposer) ((Composer) obj2);
                gapComposer23.startReplaceGroup(-1195067087);
                Pair rememberMiniCardController = FlowsKt.rememberMiniCardController(wandPose2, gapComposer23, (intValue22 & 14) | 48);
                gapComposer23.end(false);
                return rememberMiniCardController;
            case 24:
                WandPose wandPose3 = (WandPose) obj;
                int intValue23 = ((Integer) obj3).intValue();
                wandPose3.getClass();
                GapComposer gapComposer24 = (GapComposer) ((Composer) obj2);
                gapComposer24.startReplaceGroup(-560785242);
                Pair rememberWandController = FlowsKt.rememberWandController(wandPose3, gapComposer24, intValue23 & 14);
                WandPoseController wandPoseController = (WandPoseController) rememberWandController.first;
                State state = (State) rememberWandController.second;
                boolean changed = gapComposer24.changed(state);
                Object rememberedValue = gapComposer24.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(state, 17));
                    gapComposer24.updateRememberedValue(rememberedValue);
                }
                Pair pair = new Pair(wandPoseController, (State) rememberedValue);
                gapComposer24.end(false);
                return pair;
            case 25:
                ((Integer) obj3).intValue();
                ((AnimatedVisibilityScope) obj).getClass();
                ProgressCircularKt.ProgressCircular(0, 1, (Composer) obj2, null);
                return Unit.INSTANCE;
            case 26:
                RealToastIconScope realToastIconScope = (RealToastIconScope) obj;
                Composer composer17 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                realToastIconScope.getClass();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((GapComposer) composer17).changed(realToastIconScope) ? 4 : 2;
                }
                GapComposer gapComposer25 = (GapComposer) composer17;
                if (gapComposer25.shouldExecute(intValue24 & 1, (intValue24 & 19) != 18)) {
                    realToastIconScope.Icon(Icons.CheckFill24, null, gapComposer25, ((intValue24 << 9) & 7168) | 390);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                PainterRequest painterRequest5 = (PainterRequest) obj;
                int intValue25 = ((Integer) obj3).intValue();
                painterRequest5.getClass();
                GapComposer gapComposer26 = (GapComposer) ((Composer) obj2);
                gapComposer26.startReplaceGroup(1317209850);
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest5, null, gapComposer26, intValue25 & 14, 1);
                gapComposer26.end(false);
                return rememberAsyncImagePainter;
            case 28:
                Composer composer18 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((ScrollingScaffoldContentScope) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer18;
                if (gapComposer27.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    Countries.PageHeader(Room.stringResource(gapComposer27, R.string.lite_cash_in_error_title), (Modifier) null, KycAppletTileKt.lambda$883151380, Room.stringResource(gapComposer27, R.string.lite_cash_in_error_subtitle), gapComposer27, MLKEMEngine.KyberPolyBytes, 2);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer19 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer28 = (GapComposer) composer19;
                if (gapComposer28.shouldExecute(intValue27 & 1, (intValue27 & 17) != 16)) {
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer28, null);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
