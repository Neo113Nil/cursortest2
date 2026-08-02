package com.squareup.cash.investing.components.custom.order;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.datefilterbar.views.DateFilterChipKt$$ExternalSyntheticLambda1;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda11;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.custom.order.CustomOrderTooltipViewModel$Informational;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderContentModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda33;
import com.squareup.cash.multiplatform.investing.PriceValue;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsViewKt;
import com.squareup.cash.savings.views.FullTransferInViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.ComposeBottomSheetKt;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.TypesJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class CustomOrderKt {

    /* renamed from: lambda$-732352192, reason: not valid java name */
    public static final ComposableLambdaImpl f447lambda$732352192 = new ComposableLambdaImpl(new InstrumentCellKt$$ExternalSyntheticLambda11(15), false, -732352192);
    public static final ComposableLambdaImpl lambda$21709586 = new ComposableLambdaImpl(new InstrumentCellKt$$ExternalSyntheticLambda11(16), false, 21709586);

    static {
        new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(14), false, 1358854659);
    }

    public static final void BottomText(String str, Icons icons, Composer composer, int i, int i2) {
        int i3;
        Icons icons2;
        Throwable th;
        Icons icons3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-367801832);
        int i4 = i | (gapComposer.changed(str) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (gapComposer.changed(icons == null ? -1 : icons.ordinal()) ? 32 : 16);
        }
        int i6 = i3;
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 19) != 18)) {
            Icons icons4 = null;
            if (i5 != 0) {
                th = null;
            } else {
                th = null;
                icons4 = icons;
            }
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw th;
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
            if (icons4 == null) {
                gapComposer.startReplaceGroup(123383480);
                gapComposer.end(false);
                icons3 = icons4;
            } else {
                gapComposer.startReplaceGroup(123383481);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Trace.m1191Iconww6aTOc(icons4, (String) null, (Modifier) null, colors.semantic.icon.subtle, gapComposer, 48, 4);
                icons3 = icons4;
                gapComposer.end(false);
            }
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, i6 & 14, 0, 3826, colors2.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
            icons2 = icons3;
        } else {
            gapComposer.skipToGroupEnd();
            icons2 = icons;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(i, i2, icons2, str);
        }
    }

    public static final void CollapsedWidget(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1415155269);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(ClipKt.clip(modifier, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f)), 40.0f), Strings.getColors(gapComposer).component.button.prominent.background.f160default, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Trace.m1191Iconww6aTOc(Icons.Scrubber24, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.inverse, gapComposer, 54, 4);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 20);
        }
    }

    public static final void CustomOrder(final InvestingCustomOrderContentModel investingCustomOrderContentModel, final Function1 function1, final ColorModel colorModel, Composer composer, final int i) {
        ColorModel colorModel2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        InvestingCustomOrderContentModel.Content content;
        GapComposer gapComposer;
        Function1 function12;
        MutableState mutableState;
        Boolean bool;
        MutableState mutableState2;
        boolean z;
        function1.getClass();
        colorModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-696607869);
        int i2 = i | (gapComposer2.changed(investingCustomOrderContentModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(colorModel) ? 256 : 128);
        if (!gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            colorModel2 = colorModel;
            gapComposer2.skipToGroupEnd();
        } else {
            if (!(investingCustomOrderContentModel instanceof InvestingCustomOrderContentModel.Content)) {
                endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    function2 = new Function2(investingCustomOrderContentModel, function1, colorModel, i, i3) { // from class: com.squareup.cash.investing.components.custom.order.CustomOrderKt$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ InvestingCustomOrderContentModel f$0;
                        public final /* synthetic */ Function1 f$1;
                        public final /* synthetic */ ColorModel f$2;

                        {
                            this.$r8$classId = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.$r8$classId;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    CustomOrderKt.CustomOrder(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    CustomOrderKt.CustomOrder(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            colorModel2 = colorModel;
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(new PriceWidgetState());
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState3 = (MutableState) rememberedValue;
            int i4 = i2 & 112;
            boolean z2 = i4 == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == obj) {
                rememberedValue2 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(6, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Function1 function13 = (Function1) rememberedValue2;
            function13.getClass();
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = Updater.mutableStateOf$default(new GraphState(function13));
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState4 = (MutableState) rememberedValue3;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((GraphState) mutableState4.getValue()).priceWidgetOffsetY$delegate.getFloatValue(), null, "selected price offset", null, gapComposer2, 3072, 22);
            GraphState graphState = (GraphState) mutableState4.getValue();
            InvestingCustomOrderContentModel.Content content2 = (InvestingCustomOrderContentModel.Content) investingCustomOrderContentModel;
            List list = content2.ticks;
            long j = ((PriceValue) CollectionsKt.maxOrThrow(list)).value;
            list.getClass();
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return;
            }
            Comparable comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
            graphState.priceModel$delegate.setValue(new CustomOrderGraphPriceModel(j, ((PriceValue) comparable).value, content2.ticks));
            Integer valueOf = Integer.valueOf(((GraphState) mutableState4.getValue()).graphHeight$delegate.getIntValue());
            Boolean valueOf2 = Boolean.valueOf(content2.isGraphReady);
            Boolean valueOf3 = Boolean.valueOf(content2.isGraphReset);
            boolean changed = gapComposer2.changed(mutableState4) | ((i2 & 14) == 4) | gapComposer2.changed(mutableState3) | (i4 == 32);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed || rememberedValue4 == obj) {
                content = content2;
                gapComposer = gapComposer2;
                function12 = function1;
                mutableState = mutableState3;
                bool = valueOf3;
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) investingCustomOrderContentModel, (Object) function12, mutableState4, mutableState, (Continuation) null, 12);
                mutableState2 = mutableState4;
                gapComposer.updateRememberedValue(dotGridKt$DotGrid$3$1);
                rememberedValue4 = dotGridKt$DotGrid$3$1;
            } else {
                gapComposer = gapComposer2;
                content = content2;
                mutableState2 = mutableState4;
                function12 = function1;
                mutableState = mutableState3;
                bool = valueOf3;
            }
            Updater.LaunchedEffect(valueOf, valueOf2, bool, (Function2) rememberedValue4, gapComposer);
            if (content.explanation != null) {
                gapComposer.startReplaceGroup(637983613);
                CustomOrderExplanation(content, function12, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                z = false;
                gapComposer.end(false);
            } else {
                z = false;
                gapComposer.startReplaceGroup(638047039);
                gapComposer.end(false);
            }
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(z);
            }
            Color forTheme = ThemablesKt.forTheme(colorModel2, gapComposer);
            MutableState mutableState5 = mutableState;
            gapComposer2 = gapComposer;
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, forTheme != null ? forTheme.value : Color.Unspecified), null, null, Expect_jvmKt.rememberComposableLambda(-906814632, new CashMapViewKt$$ExternalSyntheticLambda15(3, investingCustomOrderContentModel, mutableState2, animateFloatAsState, mutableState5, function12), gapComposer), gapComposer2, 3072, 6);
        }
        endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            final int i5 = 1;
            final ColorModel colorModel3 = colorModel2;
            function2 = new Function2(investingCustomOrderContentModel, function1, colorModel3, i, i5) { // from class: com.squareup.cash.investing.components.custom.order.CustomOrderKt$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ InvestingCustomOrderContentModel f$0;
                public final /* synthetic */ Function1 f$1;
                public final /* synthetic */ ColorModel f$2;

                {
                    this.$r8$classId = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj22) {
                    int i42 = this.$r8$classId;
                    Composer composer2 = (Composer) obj2;
                    ((Integer) obj22).getClass();
                    switch (i42) {
                        case 0:
                            CustomOrderKt.CustomOrder(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            CustomOrderKt.CustomOrder(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void CustomOrderDragWidget(DragWidgetState dragWidgetState, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, Function0 function04, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function0 function05;
        int i4;
        Modifier modifier3;
        Function0 function06;
        Function0 function07;
        dragWidgetState.getClass();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = dragWidgetState.expand$delegate;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1228752636);
        int i5 = (gapComposer.changed(dragWidgetState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= gapComposer.changedInstance(function03) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i5 | 24576;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i5 | (gapComposer.changed(modifier2) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i4 = i3 | 196608;
            function05 = function04;
        } else {
            function05 = function04;
            i4 = i3 | (gapComposer.changedInstance(function05) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) != 74898)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier4 = i6 != 0 ? companion : modifier2;
            if (i7 != 0) {
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda0(12);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function07 = (Function0) rememberedValue;
            } else {
                function07 = function05;
            }
            Modifier m289sizeInqDBjuR0$default = SizeKt.m289sizeInqDBjuR0$default(modifier4, 168.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
            Modifier modifier5 = modifier4;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m289sizeInqDBjuR0$default);
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
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(companion, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f));
            boolean booleanValue = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
            CubicBezierEasing cubicBezierEasing = EasingKt.LinearOutSlowInEasing;
            EnterTransitionImpl fadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, cubicBezierEasing, 2), 2);
            TweenSpec tween$default = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, cubicBezierEasing, 2);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Function0 function08 = function07;
            AnimatedContentKt.AnimatedVisibility(booleanValue, clip, fadeIn$default.plus(EnterExitTransitionKt.expandHorizontally$default(tween$default, horizontal, 12)), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, EasingKt.LinearEasing, 2), 2).plus(EnterExitTransitionKt.shrinkHorizontally$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, EasingKt.FastOutSlowInEasing, 2), horizontal, 12)), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-1333587998, new PoolToastKt$$ExternalSyntheticLambda0(9, function0, function02, function03), gapComposer), (Composer) gapComposer, 196608, 16);
            AnimatedContentKt.AnimatedVisibility(!((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(500, 0, cubicBezierEasing, 2), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(400, 0, cubicBezierEasing, 2), 2), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1514709465, new MoneyTabBookletKt$$ExternalSyntheticLambda4(18, function08, dragWidgetState), gapComposer), (Composer) gapComposer, 196608, 18);
            gapComposer.end(true);
            function06 = function08;
            modifier3 = modifier5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
            function06 = function05;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(dragWidgetState, function0, function02, function03, modifier3, function06, i, i2);
        }
    }

    public static final void CustomOrderExplanation(InvestingCustomOrderContentModel.Content content, Function1 function1, Composer composer, int i) {
        content.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1387247026);
        int i2 = (gapComposer.changed(content) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = content.explanation;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InvestingNewsKt$$ExternalSyntheticLambda0(8, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ComposeBottomSheetKt.BottomSheet(null, str, (Function0) rememberedValue, false, false, 0, null, Navigation.ArcadeBottomSheetStyle(gapComposer), Expect_jvmKt.rememberComposableLambda(1953966172, new FormView$$ExternalSyntheticLambda0(content, 20), gapComposer), gapComposer, 117440512, 121);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SkipPaymentView$$ExternalSyntheticLambda1(content, function1, i, 21);
        }
    }

    public static final void CustomOrderHeader(InvestingStockDetailsHeaderViewModel investingStockDetailsHeaderViewModel, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(231641776);
        int i2 = i | (gapComposer.changed(investingStockDetailsHeaderViewModel) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader(investingStockDetailsHeaderViewModel.title, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1893184561, new SkipPaymentView$$ExternalSyntheticLambda1(22, investingStockDetailsHeaderViewModel, function0), gapComposer), (String) null, gapComposer, MLKEMEngine.KyberPolyBytes, 10);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1(investingStockDetailsHeaderViewModel, function0, modifier2, i, 20);
        }
    }

    public static final void CustomOrderKeypad(AmountPickerViewModel amountPickerViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1034018763);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(amountPickerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        byte b = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1169721782, new FullTransferInViewKt$$ExternalSyntheticLambda1(amountPickerViewModel, function1, i2, b), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FullTransferInViewKt$$ExternalSyntheticLambda1(amountPickerViewModel, function1, i);
        }
    }

    public static final void CustomOrderTimeRange(HistoricalRange historicalRange, Function1 function1, Composer composer, int i) {
        HistoricalRange historicalRange2;
        Function1 function12;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1045435549);
        int i2 = (gapComposer.changed(historicalRange == null ? -1 : historicalRange.ordinal()) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            historicalRange2 = historicalRange;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        } else if (historicalRange == null) {
            gapComposer.startReplaceGroup(-1762441244);
            gapComposer.end(false);
            historicalRange2 = historicalRange;
            function12 = function1;
        } else {
            gapComposer.startReplaceGroup(-1762441243);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            historicalRange2 = historicalRange;
            function12 = function1;
            InvestingGraphTabsViewKt.InvestingGraphTimeRangeButtons(historicalRange2, false, function12, null, CollectionsKt__CollectionsKt.listOf((Object[]) new HistoricalRange[]{HistoricalRange.DAY, HistoricalRange.WEEK, HistoricalRange.MONTH, HistoricalRange.YEAR}), gapComposer, ((i2 << 3) & 896) | 24624, 8);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SkipPaymentView$$ExternalSyntheticLambda1(historicalRange2, function12, i, 24);
        }
    }

    public static final void CustomOrderToolbar(String str, Function0 function0, Function0 function02, Composer composer, int i) {
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1079619607);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            DBUtil.TitleBarSub(str, NavigationType.BACK, (Modifier) null, (DynamicColorConfiguration) null, function0, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-303954712, new DismissableToastKt$$ExternalSyntheticLambda3(15, function02), gapComposer), gapComposer, (i2 & 14) | 1572912 | ((i2 << 9) & 57344), 44);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1((Object) str, (Object) function0, (Function) function02, i, 21);
        }
    }

    public static final void CustomOrderTooltip(TypesJVMKt typesJVMKt, Modifier modifier, Composer composer, int i) {
        int i2;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-559930896);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(typesJVMKt) : gapComposer.changedInstance(typesJVMKt) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new NewsArticleAdapter$$ExternalSyntheticLambda1(15);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue);
            if (typesJVMKt instanceof CustomOrderTooltipViewModel$Informational) {
                gapComposer.startReplaceGroup(751882966);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.f1047app;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(751948593);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.background.standard;
                gapComposer.end(false);
            }
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            VisibleKt.m3500TooltipBubblesW7UJKQ(semantics, j, new PaddingValuesImpl(16.0f, 16.0f, 16.0f, 16.0f), Expect_jvmKt.rememberComposableLambda(12717249, new FormView$$ExternalSyntheticLambda0(typesJVMKt, 22), gapComposer), gapComposer, 3072);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(typesJVMKt, modifier, i, 20);
        }
    }

    public static final void DimmableBackground(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0, boolean z) {
        ComposableLambdaImpl composableLambdaImpl2;
        Modifier modifier2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        boolean z2;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1866595219);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(z) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier2, 1.0f);
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            if (z) {
                gapComposer.startReplaceGroup(1643033690);
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(modifier2, 1.0f);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors.component.ui.dimmer.background, ColorKt.RectangleShape), false, null, null, function0, 15);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new NewsArticleAdapter$$ExternalSyntheticLambda1(14);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(m183clickableoSLSa3U$default, (Function1) rememberedValue);
                z2 = false;
                BoxKt.Box(clearAndSetSemantics, gapComposer, 0);
                gapComposer.end(false);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                z2 = false;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                gapComposer.startReplaceGroup(1643274901);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(modifier2);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z2);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$1);
            composableLambdaImpl2 = composableLambdaImpl;
            composableLambdaImpl2.invoke((Object) BoxScopeInstance.INSTANCE, (Object) gapComposer, (Object) 54);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateFilterChipKt$$ExternalSyntheticLambda1(z, function0, modifier2, composableLambdaImpl2, i, 3);
        }
    }

    public static final void ExpandedWidget(Function0 function0, Function0 function02, Function0 function03, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(310207716);
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changedInstance(function02) ? 32 : 16) | (gapComposer.changedInstance(function03) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(companion, m340RoundedCornerShape0680j_4), Strings.getColors(gapComposer).semantic.background.subtle, ColorKt.RectangleShape);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 4.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            StepButton((i2 & 896) | 6, gapComposer, Icons.CaretDown16, Room.stringResource(gapComposer, R.string.investing_components_custom_order_arrow_down), function03);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
            coil3.size.SizeKt.ButtonCompact(function0, companion, ButtonProminence.PROMINENT, false, false, null, f447lambda$732352192, gapComposer, (i2 & 14) | 1573296, 56);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
            StepButton(((i2 << 3) & 896) | 6, gapComposer, Icons.CaretUp16, Room.stringResource(gapComposer, R.string.investing_components_custom_order_arrow_up), function02);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1((Object) function0, (Object) function02, (Function) function03, i, 19);
        }
    }

    public static final void InformationText(String str, Composer composer, int i) {
        int access$packBytes;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-548151291);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
            access$packBytes = TextOverflow.access$packBytes(3, (r1 >> 8) & 255, (LineBreak.Simple >> 16) & 255);
            Room.m1165Text25TpFw(0, 0, 0, 3, i2 & 14, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, access$packBytes, 14680063), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda5(str, i, 3);
        }
    }

    public static final void PriceWidget(TypesJVMKt typesJVMKt, GraphState graphState, PriceWidgetState priceWidgetState, Function1 function1, float f, ColorModel colorModel, Modifier modifier, Composer composer, int i) {
        graphState.getClass();
        priceWidgetState.getClass();
        function1.getClass();
        colorModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(754515670);
        int i2 = i | (gapComposer.changed(typesJVMKt) ? 4 : 2) | (gapComposer.changedInstance(graphState) ? 32 : 16) | (gapComposer.changed(priceWidgetState) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024) | (gapComposer.changed(f) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(colorModel) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(modifier) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Modifier align = BoxScopeInstance.INSTANCE.align(Modifier.Companion.$$INSTANCE, Alignment.Companion.TopCenter);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CustomOrderPriceWidgetKt$$ExternalSyntheticLambda0(priceWidgetState, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier onSizeChanged = RulerKt.onSizeChanged(align, (Function1) rememberedValue);
            boolean changedInstance = (i3 == 256) | gapComposer.changedInstance(graphState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CustomOrderPriceWidgetKt$$ExternalSyntheticLambda1(graphState, priceWidgetState, 0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier offset = OffsetKt.offset(onSizeChanged, (Function1) rememberedValue2);
            boolean z2 = (57344 & i2) == 16384;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new PulsingState$$ExternalSyntheticLambda0(f, 8);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            CustomOrderTooltip(typesJVMKt, OffsetKt.offset(offset, (Function1) rememberedValue3), gapComposer, i2 & 14);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Color forTheme = ThemablesKt.forTheme(colorModel, gapComposer);
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, forTheme != null ? forTheme.value : Color.Unspecified), null, null, Expect_jvmKt.rememberComposableLambda(406150887, new TrackRowKt$$ExternalSyntheticLambda5(priceWidgetState, graphState, f, function1), gapComposer), gapComposer, 3072, 6);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabUIKt$$ExternalSyntheticLambda33(typesJVMKt, graphState, priceWidgetState, function1, f, colorModel, modifier, i);
        }
    }

    public static final void StepButton(int i, Composer composer, Icons icons, String str, Function0 function0) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1241972492);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(icons.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(ClipKt.clip(Modifier.Companion.$$INSTANCE, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f)), 32.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors.semantic.background.prominent, ColorKt.RectangleShape);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 8.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m298padding3ABfNKs, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9), false, null, new Role(0), function0, 4);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m182clickableO2vRcR0$default);
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
            Trace.m1191Iconww6aTOc(icons, str, (Modifier) null, 0L, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 12);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(icons, str, function0, i, 12);
        }
    }

    public static final void TopText(String str, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-21070404);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).keypadNumbers;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, i2 & 14, 0, 3826, colors.semantic.text.prominent, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda5(str, i, 2);
        }
    }
}
