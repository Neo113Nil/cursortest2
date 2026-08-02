package app.cash.local.views.marketingmessages;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.viewmodels.ToolbarModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageBadge;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesViewModel;
import app.cash.local.viewmodels.marketingmessages.MessageFilter;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.toolbar.LocalToolbarKt;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.views.ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import bo.app.c7$$ExternalSyntheticLambda6;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda10;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountAvatarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.arcade.components.FilterBarScope;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.text.InlineIconPosition;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.taptopay.views.TapToPayPaymentKt$$ExternalSyntheticLambda3;
import com.squareup.cash.work.views.shift.ShiftDetailViewKt$$ExternalSyntheticLambda19;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class MarketingMessageKt {

    /* renamed from: lambda$-711431629, reason: not valid java name */
    public static final ComposableLambdaImpl f56lambda$711431629;
    public static final ComposableLambdaImpl lambda$1203674690;
    public static final ComposableLambdaImpl lambda$334667818;
    public static final ComposableLambdaImpl lambda$184458969 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(4), false, 184458969);
    public static final ComposableLambdaImpl lambda$1307612932 = new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda10(8), false, 1307612932);

    /* renamed from: lambda$-1566898821, reason: not valid java name */
    public static final ComposableLambdaImpl f54lambda$1566898821 = new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda10(9), false, -1566898821);

    /* renamed from: lambda$-1887814398, reason: not valid java name */
    public static final ComposableLambdaImpl f55lambda$1887814398 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(5), false, -1887814398);

    static {
        new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda10(10), false, -1482392389);
        lambda$1203674690 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(6), false, 1203674690);
        new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda10(11), false, -146261628);
        new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda10(12), false, -863111160);
        f56lambda$711431629 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(2), false, -711431629);
        lambda$334667818 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(3), false, 334667818);
        new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda10(13), false, 1809391764);
        new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda10(14), false, -1253633249);
        new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda10(15), false, -1825072075);
        new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda10(16), false, 1287733028);
    }

    /* renamed from: Badge-FNF3uiM, reason: not valid java name */
    public static final void m1328BadgeFNF3uiM(Modifier modifier, MarketingMessageBadge marketingMessageBadge, long j, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1263932742);
        int i2 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changedInstance(marketingMessageBadge) ? 32 : 16) | (gapComposer2.changed(j) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier m1325borderIfWhiteiJQMabo = LocalViewsKt.m1325borderIfWhiteiJQMabo(ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer2).semantic.background.f1047app, roundedCornerShape), j, roundedCornerShape, gapComposer2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m1325borderIfWhiteiJQMabo);
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
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean z = marketingMessageBadge.isViewed;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer2.startReplaceGroup(-1050525982);
                SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, 8.0f));
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1050706216);
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(SpacerKt.m298padding3ABfNKs(companion, 4.0f), 8.0f), Strings.getColors(gapComposer2).component.badge.background, roundedCornerShape), gapComposer2, 0);
                gapComposer2.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11), Strings.getTypography(gapComposer2).labelSmall, (TextLineBalancing) null, marketingMessageBadge.text, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayPaymentKt$$ExternalSyntheticLambda3(i, 2, j, modifier, (Object) marketingMessageBadge);
        }
    }

    public static final void DashedDividerWithCircles(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(924099220);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.inverse;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 48.0f);
            boolean changed = gapComposer.changed(j);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new c7$$ExternalSyntheticLambda6(j, 6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            BoxKt.Box(ClipKt.drawBehind(m277height3ABfNKs, (Function1) rememberedValue), gapComposer, 0);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 1);
        }
    }

    public static final void EmptyMessages(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2034729036);
        int i3 = i | (gapComposer.changed(str) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            i2 = 1;
            Room.m1165Text25TpFw(0, 0, 0, 0, (i3 >> 3) & 14, 0, 4082, colors.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            i2 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda4(modifier, str, i, i2);
        }
    }

    public static final void InfoItem(Icons icons, String str, Composer composer, int i) {
        GapComposer gapComposer;
        int i2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1075798001);
        int i3 = i | (gapComposer2.changed(str) ? 32 : 16);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            i2 = 1;
            zzacp.m2014InlineIconTextQqsJerU(str, icons.painter(gapComposer2), null, Strings.getColors(gapComposer2).semantic.text.subtle, InlineIconPosition.START, Strings.getTypography(gapComposer2).bodyMedium, Strings.getColors(gapComposer2).semantic.text.subtle, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer2, ((i3 >> 3) & 14) | 24576 | (Painter.$stable << 3), 0, 32644);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            i2 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftDetailViewKt$$ExternalSyntheticLambda19(i, i2, icons, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarketingMessage(Modifier modifier, MarketingMessageViewModel marketingMessageViewModel, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function1 function12;
        Function1 function13;
        RecomposeScopeImpl endRestartGroup;
        Function1 function14;
        marketingMessageViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-447778852);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(marketingMessageViewModel) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function12 = function1;
            i3 |= gapComposer.changedInstance(function12) ? 256 : 128;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
                gapComposer.skipToGroupEnd();
                function13 = function12;
            } else {
                Modifier modifier3 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (i5 != 0) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new Yoga$$ExternalSyntheticLambda0(15);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    function14 = (Function1) rememberedValue;
                } else {
                    function14 = function12;
                }
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                ArcadeThemeKt.ArcadeTheme(ColorsLightKt.colorsLight, null, null, Expect_jvmKt.rememberComposableLambda(374425393, new DismissableToastKt$$ExternalSyntheticLambda4(modifier3, marketingMessageViewModel, function14, (MutableState) rememberedValue2, 3), gapComposer), gapComposer, 3072, 6);
                modifier2 = modifier3;
                function13 = function14;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(modifier2, marketingMessageViewModel, function13, i, i2, 5);
                return;
            }
            return;
        }
        function12 = function1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarketingMessageImage(Modifier modifier, LocalColor localColor, LocalImage localImage, String str, MarketingMessageBadge marketingMessageBadge, MarketingMessageImageStyle marketingMessageImageStyle, Composer composer, int i, int i2) {
        int i3;
        int i4;
        MarketingMessageImageStyle marketingMessageImageStyle2;
        RecomposeScopeImpl endRestartGroup;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        BiasAlignment biasAlignment;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        MarketingMessageImageStyle marketingMessageImageStyle3;
        boolean z;
        MarketingMessageImageStyle marketingMessageImageStyle4;
        Modifier.Companion companion2;
        boolean z2;
        boolean z3;
        boolean z4;
        BiasAlignment biasAlignment2 = Alignment.Companion.Center;
        localColor.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-565229154);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = i | (gapComposer.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | (gapComposer.changedInstance(localColor) ? 32 : 16) | (gapComposer.changedInstance(localImage) ? 256 : 128) | (gapComposer.changed(str) ? 2048 : 1024) | (gapComposer.changedInstance(marketingMessageBadge) ? 16384 : PKIFailureInfo.certRevoked);
        int i6 = i2 & 32;
        int i7 = 196608;
        if (i6 == 0) {
            if ((i & 196608) == 0) {
                i7 = gapComposer.changed(marketingMessageImageStyle == null ? -1 : marketingMessageImageStyle.ordinal()) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            i4 = i5;
            if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) == 74898)) {
                gapComposer.skipToGroupEnd();
                marketingMessageImageStyle2 = marketingMessageImageStyle;
            } else {
                MarketingMessageImageStyle marketingMessageImageStyle5 = i6 != 0 ? MarketingMessageImageStyle.LARGE : marketingMessageImageStyle;
                RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f);
                MarketingMessageImageStyle marketingMessageImageStyle6 = marketingMessageImageStyle5;
                long m1324blendColorsOWjLjI = LocalViewsKt.m1324blendColorsOWjLjI(LocalViewsKt.m1324blendColorsOWjLjI(Color.White, Color.m675copywmQWz5c$default(0.8f, LocalViewsKt.toLocalComposeColor(localColor, gapComposer).light, 14)), Color.m675copywmQWz5c$default(0.9f, Strings.getColors(gapComposer).base.constantWhite, 14));
                Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth(modifier, 1.0f), m340RoundedCornerShape0680j_4);
                RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                Modifier clipToBounds = ClipKt.clipToBounds(ClipKt.clip(LocalViewsKt.m1325borderIfWhiteiJQMabo(ImageKt.m177backgroundbw27NRU(clip, m1324blendColorsOWjLjI, rectangleShapeKt$RectangleShape$1), m1324blendColorsOWjLjI, m340RoundedCornerShape0680j_4, gapComposer), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)));
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clipToBounds);
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
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$16);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$17);
                Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                if (marketingMessageBadge == null) {
                    gapComposer.startReplaceGroup(-780802966);
                    gapComposer.end(false);
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                    z = false;
                    marketingMessageImageStyle3 = marketingMessageImageStyle6;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    companion = companion3;
                    biasAlignment = biasAlignment2;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                } else {
                    gapComposer.startReplaceGroup(-780802965);
                    float f = marketingMessageImageStyle6.badgePadding;
                    companion = companion3;
                    Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.End, SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, f, f, RecyclerView.DECELERATION_RATE, 9));
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    biasAlignment = biasAlignment2;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                    marketingMessageImageStyle3 = marketingMessageImageStyle6;
                    m1328BadgeFNF3uiM(m, marketingMessageBadge, m1324blendColorsOWjLjI, gapComposer, 0);
                    z = false;
                    gapComposer.end(false);
                }
                float f2 = marketingMessageBadge != null ? marketingMessageImageStyle3.imageToBadgeTopPadding : marketingMessageImageStyle3.contentTopPadding;
                float f3 = marketingMessageImageStyle3.contentBottomPadding;
                float f4 = marketingMessageImageStyle3.contentHorizontalPadding;
                Modifier fillMaxSize = SizeKt.fillMaxSize(OffsetKt.aspectRatio(1.0f, SpacerKt.m301paddingqDBjuR0(companion, f4, f2, f4, f3), z), 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(localImage != null ? Alignment.Companion.TopStart : biasAlignment, z);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$16, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$1);
                if (localImage != null) {
                    gapComposer.startReplaceGroup(2118137512);
                    companion2 = companion;
                    marketingMessageImageStyle4 = marketingMessageImageStyle3;
                    z2 = false;
                    z3 = true;
                    AsyncImageKt.m1438AsyncImage10Xjiaw(LocalViewsKt.getThemedUrl(localImage, gapComposer), null, SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxSize(companion, 1.0f), marketingMessageImageStyle3.imagePadding), null, marketingMessageImageStyle3.imageContentScale, null, gapComposer, 48, 1976);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else {
                    marketingMessageImageStyle4 = marketingMessageImageStyle3;
                    companion2 = companion;
                    z2 = false;
                    z3 = true;
                    gapComposer.startReplaceGroup(2118353024);
                    gapComposer.end(false);
                }
                if (str == null || StringsKt.isBlank(str)) {
                    z4 = z3;
                    gapComposer.startReplaceGroup(2119186304);
                    gapComposer.end(z2);
                } else {
                    gapComposer.startReplaceGroup(2118500863);
                    GapComposer gapComposer2 = gapComposer;
                    z4 = z3;
                    Room.m1165Text25TpFw(0, marketingMessageImageStyle4.textMaxLines, 0, 0, (i4 >> 9) & 14, 0, 4016, Strings.getColors(gapComposer).base.constantWhite, (Composer) gapComposer2, BoxScopeInstance.INSTANCE.align(SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.wrapContentWidth$default(SizeKt.fillMaxWidth(companion2, marketingMessageImageStyle4.textFillWidthFraction), marketingMessageImageStyle4.textAlignment, 2), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), Strings.getColors(gapComposer).base.constantBlack, rectangleShapeKt$RectangleShape$1), marketingMessageImageStyle4.textOverlayHorizontalPadding, marketingMessageImageStyle4.textOverlayVerticalPadding), localImage != null ? marketingMessageImageStyle4.textBoxAlignment : biasAlignment), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer = gapComposer2;
                    gapComposer.end(z2);
                }
                gapComposer.end(z4);
                gapComposer.end(z4);
                marketingMessageImageStyle2 = marketingMessageImageStyle4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(modifier, localColor, localImage, str, marketingMessageBadge, marketingMessageImageStyle2, i, i2, 4);
                return;
            }
            return;
        }
        i5 |= i7;
        i4 = i5;
        if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void MarketingMessageOfferSheetContent(Modifier modifier, MarketingMessageViewModel.OfferPreview.SheetDetails sheetDetails, LocalColor localColor, LocalColor localColor2, LocalImage localImage, String str, Function0 function0, Function0 function02, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        Modifier modifier3;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12;
        BiasAlignment.Horizontal horizontal;
        boolean z;
        int i4;
        localColor.getClass();
        localColor2.getClass();
        str.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1556744131);
        Applier applier = gapComposer.applier;
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i | (gapComposer.changed(modifier2) ? 4 : 2);
        }
        int i6 = i3 | (gapComposer.changedInstance(sheetDetails) ? 32 : 16) | (gapComposer.changedInstance(localColor) ? 256 : 128) | (gapComposer.changedInstance(localColor2) ? 2048 : 1024) | (gapComposer.changedInstance(localImage) ? 16384 : PKIFailureInfo.certRevoked);
        if ((i & 196608) == 0) {
            str2 = str;
            i6 |= gapComposer.changed(str2) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            str2 = str;
        }
        if ((i & 12582912) == 0) {
            i6 |= gapComposer.changedInstance(function02) ? 8388608 : 4194304;
        }
        if (gapComposer.shouldExecute(i6 & 1, (4793491 & i6) != 4793490)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier4 = i5 != 0 ? companion : modifier2;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(ImageKt.verticalScroll$default(modifier4, ImageKt.rememberScrollState(gapComposer), false, 14), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape), 24.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$13);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Modifier modifier5 = modifier4;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$18);
            MarketingMessageProfileLogo(SizeKt.m287sizeVpY3zN4(companion, 50.0f, 62.0f), localImage, localColor, localColor2, str2, gapComposer, ((i6 >> 9) & 112) | 6 | (i6 & 896) | (i6 & 7168) | ((i6 >> 3) & 57344));
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), Strings.getTypography(gapComposer).header, (TextLineBalancing) null, sheetDetails.title, (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer).getClass();
            Modifier.Companion companion2 = companion;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).linkMedium, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16773119), (TextLineBalancing) null, sheetDetails.subtitle, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            String str3 = sheetDetails.eligibleItems;
            if (str3 == null) {
                gapComposer.startReplaceGroup(1148798033);
                gapComposer.end(false);
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                horizontal = horizontal2;
                layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$13;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
            } else {
                gapComposer.startReplaceGroup(1148798034);
                Strings.getSizes(gapComposer).getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$17, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$18);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$1;
                horizontal = horizontal2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_offer_eligible_items), (Map) null, (Function1) null, false);
                Strings.getSizes(gapComposer).getClass();
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                companion2 = companion2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, m302paddingqDBjuR0$default2, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                gapComposer.end(true);
                gapComposer.end(false);
            }
            Strings.getSizes(gapComposer).getClass();
            Modifier.Companion companion3 = companion2;
            Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
            Strings.getSizes(gapComposer).getClass();
            ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default3);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$13);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_offer_details_and_terms), (Map) null, (Function1) null, false);
            String str4 = sheetDetails.redemptionInstructions;
            if (str4 == null) {
                gapComposer.startReplaceGroup(2089275224);
                z = false;
                gapComposer.end(false);
                i4 = 6;
            } else {
                z = false;
                gapComposer.startReplaceGroup(2089275225);
                i4 = 6;
                InfoItem(Icons.CategoryShopping16, str4, gapComposer, 6);
                gapComposer.end(false);
            }
            String str5 = sheetDetails.validThroughText;
            if (str5 == null) {
                gapComposer.startReplaceGroup(2089432487);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(2089432488);
                InfoItem(Icons.TimeStopwatch16, str5, gapComposer, i4);
                gapComposer.end(z);
            }
            String str6 = sheetDetails.termsText;
            if (str6 == null) {
                gapComposer.startReplaceGroup(2089566314);
            } else {
                gapComposer.startReplaceGroup(2089566315);
                InfoItem(Icons.Limits16, str6, gapComposer, i4);
            }
            gapComposer.end(z);
            gapComposer.end(true);
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, ImageKt.m183clickableoSLSa3U$default(Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.CenterHorizontally, SpacerKt.m300paddingVpY3zN4$default(companion3, RecyclerView.DECELERATION_RATE, 16.0f, 1)), false, null, null, function02, 15), Strings.getTypography(gapComposer).linkXSmall, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_offer_terms), (Map) null, (Function1) null, false);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion3, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            coil3.size.SizeKt.ButtonCta(function0, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, RecyclerView.DECELERATION_RATE, 16.0f, 1), buttonProminence, false, false, null, f55lambda$1887814398, gapComposer, 1573254, 56);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier3 = modifier5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToastKt$$ExternalSyntheticLambda8(modifier3, sheetDetails, localColor, localColor2, localImage, str, function0, function02, i, i2);
        }
    }

    public static final void MarketingMessageProfileHeader(MarketingMessageViewModel marketingMessageViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1304340833);
        int i2 = i | (gapComposer.changedInstance(marketingMessageViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 16.0f, 1);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            MarketingMessageProfileLogo(SizeKt.m287sizeVpY3zN4(companion, 16.0f, 20.0f), marketingMessageViewModel.logo, marketingMessageViewModel.backgroundColor, marketingMessageViewModel.foregroundColor, marketingMessageViewModel.logoFallbackLetter, gapComposer, 0);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) new LayoutWeightElement(1.0f, true), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodySmall, 0L, 0L, FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, marketingMessageViewModel.username, (Map) null, (Function1) null, false);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 16.0f);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandSheetViewKt$$ExternalSyntheticLambda0(6, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m285size3ABfNKs, false, null, null, (Function0) rememberedValue, 15);
            Painter painter = Icons.NavigationClose.painter(gapComposer);
            long j = Strings.getColors(gapComposer).semantic.icon.standard;
            ImageKt.Image(painter, null, m183clickableoSLSa3U$default, null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 24624, 40);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(marketingMessageViewModel, function1, i, 27);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.compose.ui.Modifier] */
    public static final void MarketingMessageProfileLogo(Modifier modifier, LocalImage localImage, LocalColor localColor, LocalColor localColor2, String str, Composer composer, int i) {
        int i2;
        String str2;
        boolean z;
        localColor.getClass();
        localColor2.getClass();
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(740841445);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(localImage) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(localColor) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(localColor2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str2 = str;
            i2 |= gapComposer.changed(str2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            str2 = str;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(4.0f, modifier, LocalViewsKt.toComposeColor(localColor, gapComposer, (i2 >> 6) & 14), 2.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m);
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
            if (localImage != null) {
                gapComposer.startReplaceGroup(840566132);
                Float ratio = LocalViewsKt.getRatio(localImage);
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                z = true;
                LocalMapKt.LocalAsyncImage(companion, ratio != null ? OffsetKt.aspectRatio(ratio.floatValue(), companion, false) : companion, LocalViewsKt.getThemedUrl(localImage, gapComposer), ContentScale.Companion.Fit, null, null, lambda$1203674690, gapComposer, 1575942, 48);
                gapComposer.end(false);
            } else {
                z = true;
                gapComposer.startReplaceGroup(840815899);
                zzacn.m2012AutoScaleTextZLomxE(0, 3, 0, 1572864 | ((i2 >> 12) & 14), 402, LocalViewsKt.toComposeColor(localColor2, gapComposer, (i2 >> 9) & 14), Room.getSp(7), gapComposer, null, TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, 0L, 0L, FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), str2, null);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(modifier, localImage, localColor, localColor2, str, i, 3);
        }
    }

    public static final void MarketingMessageTile(Modifier modifier, MarketingMessagesViewModel.MessageTile messageTile, Function0 function0, Function0 function02, Composer composer, int i) {
        Modifier modifier2;
        messageTile.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1767802350);
        int i2 = i | 6 | (gapComposer.changedInstance(messageTile) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changedInstance(function02) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier2, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int i3 = i2 >> 3;
            MessageCard(messageTile, function0, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            ProfileHeader(SpacerKt.m300paddingVpY3zN4$default(modifier2, RecyclerView.DECELERATION_RATE, 12.0f, 1), messageTile, function02, gapComposer, (i3 & 896) | (i2 & 112) | 6);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(modifier2, i, messageTile, function0, function02, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void MarketingMessages(Modifier modifier, final MarketingMessagesViewModel marketingMessagesViewModel, final Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String m;
        boolean z5;
        marketingMessagesViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-537768933);
        Applier applier = gapComposer.applier;
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(marketingMessagesViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier4 = i4 != 0 ? companion : modifier2;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier4, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape)));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ToolbarModel toolbarModel = new ToolbarModel(Room.stringResource(gapComposer, R.string.local_views_messages_title));
            int i5 = i3 & 896;
            boolean z6 = i5 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z6 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BrandSheetViewKt$$ExternalSyntheticLambda0(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier modifier5 = modifier4;
            LocalToolbarKt.m1333LocalToolbarflo8M7A(null, toolbarModel, null, (Function0) rememberedValue, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 109);
            if (marketingMessagesViewModel.showFilterBar) {
                gapComposer.startReplaceGroup(960541878);
                PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
                boolean changedInstance = gapComposer.changedInstance(marketingMessagesViewModel) | (i5 == 256);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    z5 = false;
                    final Object[] objArr = 0 == true ? 1 : 0;
                    rememberedValue2 = new Function1() { // from class: app.cash.local.views.marketingmessages.MarketingMessagesKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i6 = objArr;
                            Function1 function12 = function1;
                            MarketingMessagesViewModel marketingMessagesViewModel2 = marketingMessagesViewModel;
                            switch (i6) {
                                case 0:
                                    FilterBarScope filterBarScope = (FilterBarScope) obj;
                                    filterBarScope.getClass();
                                    FilterBarScope.chip$default(filterBarScope, new BrandSheetViewKt$$ExternalSyntheticLambda0(8, function12), marketingMessagesViewModel2.selectedFilter == MessageFilter.ALL, null, MarketingMessageKt.f56lambda$711431629, 54);
                                    FilterBarScope.chip$default(filterBarScope, new BrandSheetViewKt$$ExternalSyntheticLambda0(9, function12), marketingMessagesViewModel2.selectedFilter == MessageFilter.COUPONS, null, MarketingMessageKt.lambda$334667818, 54);
                                    break;
                                default:
                                    LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) obj;
                                    lazyGridIntervalContent.getClass();
                                    List list = marketingMessagesViewModel2.messages;
                                    lazyGridIntervalContent.items(list.size(), null, null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list, 7), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(6, function12, list), true, -1117249557));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue2);
                } else {
                    z5 = false;
                }
                z = z5;
                FilterBarKt.FilterBar(null, null, m295PaddingValuesYgX7TsA$default, (Function1) rememberedValue2, gapComposer, 0, 3);
                gapComposer = gapComposer;
                gapComposer.end(z);
            } else {
                z = false;
                gapComposer.startReplaceGroup(961152113);
                gapComposer.end(false);
            }
            if (marketingMessagesViewModel.isLoading) {
                gapComposer.startReplaceGroup(961182803);
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                z2 = true;
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                z2 = true;
                char c = 1;
                if (marketingMessagesViewModel.messages.isEmpty()) {
                    gapComposer.startReplaceGroup(961349583);
                    if (marketingMessagesViewModel.selectedFilter == MessageFilter.COUPONS) {
                        z4 = false;
                        m = re$$ExternalSyntheticOutline0.m(gapComposer, 961424448, R.string.local_views_messages_coupons_empty, gapComposer, false);
                    } else {
                        z4 = false;
                        m = re$$ExternalSyntheticOutline0.m(gapComposer, 961510504, R.string.local_views_messages_empty, gapComposer, false);
                    }
                    EmptyMessages(6, gapComposer, SizeKt.fillMaxSize(companion, 1.0f), m);
                    gapComposer.end(z4);
                } else {
                    gapComposer.startReplaceGroup(961697496);
                    Modifier m2 = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), true);
                    GridCells.Fixed fixed = new GridCells.Fixed(1);
                    PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, 2);
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    Arrangement$SpacedAligned arrangement$SpacedAligned2 = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    boolean changedInstance2 = (i5 == 256) | gapComposer.changedInstance(marketingMessagesViewModel);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                        final char c2 = c == true ? 1 : 0;
                        rememberedValue3 = new Function1() { // from class: app.cash.local.views.marketingmessages.MarketingMessagesKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i6 = c2;
                                Function1 function12 = function1;
                                MarketingMessagesViewModel marketingMessagesViewModel2 = marketingMessagesViewModel;
                                switch (i6) {
                                    case 0:
                                        FilterBarScope filterBarScope = (FilterBarScope) obj;
                                        filterBarScope.getClass();
                                        FilterBarScope.chip$default(filterBarScope, new BrandSheetViewKt$$ExternalSyntheticLambda0(8, function12), marketingMessagesViewModel2.selectedFilter == MessageFilter.ALL, null, MarketingMessageKt.f56lambda$711431629, 54);
                                        FilterBarScope.chip$default(filterBarScope, new BrandSheetViewKt$$ExternalSyntheticLambda0(9, function12), marketingMessagesViewModel2.selectedFilter == MessageFilter.COUPONS, null, MarketingMessageKt.lambda$334667818, 54);
                                        break;
                                    default:
                                        LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) obj;
                                        lazyGridIntervalContent.getClass();
                                        List list = marketingMessagesViewModel2.messages;
                                        lazyGridIntervalContent.items(list.size(), null, null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list, 7), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(6, function12, list), true, -1117249557));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    GapComposer gapComposer2 = gapComposer;
                    z3 = true;
                    LazyGridDslKt.LazyVerticalGrid(fixed, m2, null, m297PaddingValuesa9UjIt4$default, arrangement$SpacedAligned, arrangement$SpacedAligned2, null, false, null, (Function1) rememberedValue3, gapComposer2, 0, 916);
                    gapComposer = gapComposer2;
                    gapComposer.end(false);
                    gapComposer.end(z3);
                    modifier3 = modifier5;
                }
            }
            z3 = z2;
            gapComposer.end(z3);
            modifier3 = modifier5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(modifier3, marketingMessagesViewModel, function1, i, i2, 6);
        }
    }

    public static final void MessageCard(MarketingMessagesViewModel.MessageTile messageTile, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-11961555);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(messageTile) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            MarketingMessageImage(ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, new Role(0), function0, 11), messageTile.backgroundColor, messageTile.image, messageTile.messageText, messageTile.badge, null, gapComposer, 0, 32);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(messageTile, function0, i, 19);
        }
    }

    public static final void ProfileHeader(Modifier modifier, MarketingMessagesViewModel.MessageTile messageTile, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1661444311);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(messageTile) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(SizeKt.fillMaxWidth(modifier, 1.0f), false, null, new Role(0), function0, 11);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            MarketingMessageProfileLogo(SizeKt.m287sizeVpY3zN4(Modifier.Companion.$$INSTANCE, 16.0f, 20.0f), messageTile.logo, messageTile.backgroundColor, messageTile.foregroundColor, messageTile.logoFallbackLetter, gapComposer, 0);
            Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3984, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) new LayoutWeightElement(1.0f, true), Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, messageTile.username, (Map) null, (Function1) null, false);
            String str = messageTile.timestampText;
            if (str != null) {
                gapComposer.startReplaceGroup(2068038731);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2068196335);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(i, 11, modifier, messageTile, function0);
        }
    }
}
