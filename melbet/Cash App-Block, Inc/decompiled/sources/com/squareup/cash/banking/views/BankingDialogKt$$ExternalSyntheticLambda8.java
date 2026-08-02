package com.squareup.cash.banking.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.arcade.values.InputFieldHelperText;
import app.cash.arcade.values.TitleBarAction;
import app.cash.arcade.values.timeline.ArcadeTimeline2Item;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.EmptyPainter;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.components.list.ListOrderedColors$Subtle;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.components.list.ListOrderedStandardItemsScope;
import com.squareup.cash.arcade.components.list.ListOrderedSubtleItemsScope;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ArcadeTimeline2Binding;
import com.squareup.cash.arcade.treehouse.CardUpsellBinding;
import com.squareup.cash.arcade.treehouse.ShimmerBinding;
import com.squareup.cash.arcade.treehouse.TitleBarCoreBinding;
import com.squareup.cash.arcade.treehouse.TitleBarCoreBinding$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.treehouse.TitleBarSubBinding;
import com.squareup.cash.arcade.treehouse.TitleBarSubBinding$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.viewmodels.BankingDialogViewModel;
import com.squareup.cash.banking.viewmodels.BetterOverdraftViewModel;
import com.squareup.cash.banking.viewmodels.RecurringDepositsFirstTimeUserViewModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHomeViewModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.benefits.viewmodels.PdsaBenefitsExplainerViewModel$Loaded;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDepositsViewModel;
import com.squareup.cash.bitcoin.viewmodels.WalletAddressOptionsViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonDisplayType;
import com.squareup.cash.bitcoin.viewmodels.applet.disabled.DependentBitcoinDisabledViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoriesWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.dependents.BitcoinDependentWelcomeViewModel;
import com.squareup.cash.bitcoin.views.applet.BitcoinHomeViewKt;
import com.squareup.cash.bitcoin.views.applet.education.BitcoinStoriesWidgetViewKt;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.IntRange;
import kotlinx.collections.immutable.ImmutableList;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes5.dex */
public final /* synthetic */ class BankingDialogKt$$ExternalSyntheticLambda8 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BankingDialogKt$$ExternalSyntheticLambda8(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$applet$BitcoinHomeViewKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3) {
        Object obj4;
        BitcoinHomeViewModel bitcoinHomeViewModel = (BitcoinHomeViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Iterator it = ((BitcoinHomeViewModel.Ready) bitcoinHomeViewModel).getWidgetViewModels().values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                if (((BitcoinHomeWidgetViewModel) obj4) != null) {
                    break;
                }
            }
            BitcoinHomeViewKt.TopDivider((BitcoinHomeWidgetViewModel) obj4, null, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$applet$autoinvest$BitcoinRecurringPurchaseTileKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        InvestingCryptoRecurringPurchaseTileViewModel.Item item = (InvestingCryptoRecurringPurchaseTileViewModel.Item) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RealCellActivityAvatarScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            PointMode.Icon(item.icon, null, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$applet$buttons$BitcoinTradeButtonsWidgetViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        BitcoinTradeButtonDisplayType bitcoinTradeButtonDisplayType = (BitcoinTradeButtonDisplayType) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Icons icons = Icons.TransferP2P24;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BenefitsHubViewKt$$ExternalSyntheticLambda2(20);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Trace.m1191Iconww6aTOc(icons, (String) null, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue), 0L, gapComposer, 48, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$applet$disabled$BitcoinDisabledViewKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        DependentBitcoinDisabledViewModel dependentBitcoinDisabledViewModel = (DependentBitcoinDisabledViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String str = dependentBitcoinDisabledViewModel.ctaText;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).button;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$applet$education$BitcoinStoriesWidgetViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        BitcoinStoriesWidgetViewModel.Loading loading = (BitcoinStoriesWidgetViewModel.Loading) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        ((BoxScope) obj).getClass();
        boolean z = true;
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            int i = 3;
            float f = 16.0f;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Object rememberedValue = gapComposer.rememberedValue();
            char c = 4;
            if (rememberedValue == Composer.Companion.Empty) {
                loading.getClass();
                rememberedValue = CollectionsKt.windowed(new IntRange(1, 4, 1), 2, 2, true);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            gapComposer.startReplaceGroup(-1713126626);
            int i2 = 0;
            for (Object obj4 : (List) rememberedValue) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                List list = (List) obj4;
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(f, z, new Drop$$ExternalSyntheticBUOutline0(i)), Alignment.Companion.Top, gapComposer, 0);
                float f2 = f;
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                char c2 = c;
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                gapComposer.startReplaceGroup(-736061057);
                int size = list.size();
                int i4 = 0;
                while (i4 < size) {
                    if (!(((double) 1.0f) > 0.0d ? z : false)) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, z);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 0);
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                    Modifier alpha = AlphaKt.alpha(OffsetKt.aspectRatio(1.2958f, SizeKt.fillMaxWidth(companion, 1.0f), false), 0.2f);
                    long j = Strings.getColors(gapComposer).semantic.icon.brand;
                    Strings.getSizes(gapComposer).getClass();
                    Object obj5 = DefaultSizes.border.entries;
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(alpha, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f2)), gapComposer, 0);
                    Strings.getSizes(gapComposer).getClass();
                    DefaultSizes.spacing.getClass();
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 8.0f));
                    int i5 = ((i2 * 2) + i4) % 4;
                    float f3 = (i5 == 0 || i5 == 3) ? 144.0f : 96.0f;
                    gapComposer.startReplaceGroup(1268258866);
                    float mo231toDpGaN1DYA = density.mo231toDpGaN1DYA(Strings.getTypography(gapComposer).labelMedium.paragraphStyle.lineHeight);
                    gapComposer.end(false);
                    Modifier alpha2 = AlphaKt.alpha(SizeKt.m287sizeVpY3zN4(companion, f3, mo231toDpGaN1DYA), 0.4f);
                    long j2 = Strings.getColors(gapComposer).semantic.icon.brand;
                    Strings.getSizes(gapComposer).getClass();
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(alpha2, j2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f2)), gapComposer, 0);
                    z = true;
                    gapComposer.end(true);
                    BitcoinStoriesWidgetViewKt.FillRemainingTiles(list.size(), 6, gapComposer);
                    i4++;
                    i = 3;
                }
                gapComposer.end(false);
                gapComposer.end(z);
                f = f2;
                i2 = i3;
                c = c2;
            }
            gapComposer.end(false);
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$dependents$BitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        BitcoinDependentWelcomeViewModel bitcoinDependentWelcomeViewModel = (BitcoinDependentWelcomeViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinDependentWelcomeViewModel.ctaLabel, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$deposits$BitcoinDepositsViewKt$$ExternalSyntheticLambda17(Object obj, Object obj2, Object obj3) {
        BitcoinDepositsViewModel.Loaded loaded = (BitcoinDepositsViewModel.Loaded) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded.adjustAmountText, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        long j2;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        int i2 = 15;
        Object obj4 = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i3 = 0;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                BankingDialogViewModel.Button button = (BankingDialogViewModel.Button) obj5;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton cellDefaultAccessoryCompactButton = (CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton) obj5;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ArcadeComponentProtoBindingKt.translatedOrEmpty(cellDefaultAccessoryCompactButton.text), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                PainterRequest painterRequest = (PainterRequest) obj;
                ((Integer) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj2);
                gapComposer3.startReplaceGroup(114135581);
                Painter painter = ((AvatarOverlay) obj5).painter(painterRequest, gapComposer3);
                if (painter == null) {
                    painter = EmptyPainter.INSTANCE;
                }
                gapComposer3.end(false);
                return painter;
            case 3:
                SwipeToDismissBoxState swipeToDismissBoxState = (SwipeToDismissBoxState) obj5;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    int ordinal = swipeToDismissBoxState.getDismissDirection().ordinal();
                    if (ordinal == 0 || ordinal == 1) {
                        gapComposer4.startReplaceGroup(-1950761239);
                        Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                        } else {
                            gapComposer4.startReplaceGroup(-1762997739);
                            gapComposer4.end(false);
                        }
                        j = colors.semantic.text.warning;
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-1950758843);
                        Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                        } else {
                            gapComposer4.startReplaceGroup(-1762997739);
                            gapComposer4.end(false);
                        }
                        j = colors2.semantic.background.f1047app;
                        gapComposer4.end(false);
                    }
                    Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f);
                    ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxSize, 32.0f, RecyclerView.DECELERATION_RATE, 2);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterEnd, false);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Icons icons = Icons.Clear24;
                    Colors colors3 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, colors3.semantic.icon.inverse, gapComposer4, 54, 4);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ListOrderedStandardItemsScope listOrderedStandardItemsScope = (ListOrderedStandardItemsScope) obj5;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    SnapshotStateList snapshotStateList = listOrderedStandardItemsScope.items;
                    int size = snapshotStateList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ListOrderedStandardItemsScope.StandardItem standardItem = (ListOrderedStandardItemsScope.StandardItem) snapshotStateList.get(i4);
                        Function2 function2 = standardItem.body;
                        ComposableLambdaImpl composableLambdaImpl = standardItem.label;
                        if (function2 != null) {
                            gapComposer5.startReplaceGroup(722666732);
                            ListOrderedKt.StandardItemWithBody(String.valueOf(i4 + 1), composableLambdaImpl, standardItem.body, SizeKt.fillMaxWidth(companion, 1.0f), gapComposer5, 3072);
                            gapComposer5.end(false);
                        } else {
                            gapComposer5.startReplaceGroup(722867550);
                            ListOrderedKt.ItemWithoutBody(3456, gapComposer5, composableLambdaImpl, SizeKt.fillMaxWidth(companion, 1.0f), ListOrderedColors$Subtle.INSTANCE$1, String.valueOf(i4 + 1));
                            gapComposer5.end(false);
                        }
                    }
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ListOrderedSubtleItemsScope listOrderedSubtleItemsScope = (ListOrderedSubtleItemsScope) obj5;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    SnapshotStateList snapshotStateList2 = listOrderedSubtleItemsScope.items;
                    int size2 = snapshotStateList2.size();
                    while (i3 < size2) {
                        ListOrderedSubtleItemsScope.SubtleItem subtleItem = (ListOrderedSubtleItemsScope.SubtleItem) snapshotStateList2.get(i3);
                        i3++;
                        ListOrderedKt.ItemWithoutBody(3456, gapComposer6, subtleItem.label, SizeKt.fillMaxWidth(companion, 1.0f), ListOrderedColors$Subtle.INSTANCE, String.valueOf(i3));
                    }
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ImmutableList<ListUnorderedItem> immutableList = (ImmutableList) obj5;
                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(listUnorderedScope) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    for (ListUnorderedItem listUnorderedItem : immutableList) {
                        listUnorderedScope.ListUnorderedItem(listUnorderedItem.label, (Modifier) null, listUnorderedItem.icon, listUnorderedItem.value, listUnorderedItem.body, gapComposer7, (intValue6 << 15) & 458752, 2);
                    }
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ArcadeTimeline2Item arcadeTimeline2Item = (ArcadeTimeline2Item) obj5;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                int i5 = ArcadeTimeline2Binding.$r8$clinit;
                ((BoxScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, arcadeTimeline2Item.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                CardUpsellBinding cardUpsellBinding = (CardUpsellBinding) obj5;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, (String) cardUpsellBinding.buttonText$delegate.getValue(), (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                InputFieldHelperText inputFieldHelperText = (InputFieldHelperText) obj5;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Trace.m1191Iconww6aTOc(Icons.LockLockedFill16, inputFieldHelperText.iconContentDescription, (Modifier) null, 0L, gapComposer10, 6, 12);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, inputFieldHelperText.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ShimmerBinding shimmerBinding = (ShimmerBinding) obj5;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                int i6 = ShimmerBinding.$r8$clinit;
                ((BoxScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Modifier clip = ClipKt.clip(companion, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(((Dp) shimmerBinding.cornerRadius.getValue()).value));
                    Colors colors4 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    BoxKt.Box(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(clip, colors4.semantic.background.subtle, rectangleShapeKt$RectangleShape$1), 1.0f), gapComposer11, 0);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                TitleBarCoreBinding titleBarCoreBinding = (TitleBarCoreBinding) obj5;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer11).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    TitleBarAction titleBarAction = ((TitleBarCoreBinding.ActionBinding) titleBarCoreBinding.endPrimaryAction$delegate.getValue()).action;
                    if (titleBarAction == null) {
                        gapComposer12.startReplaceGroup(1726261406);
                        gapComposer12.end(false);
                    } else {
                        gapComposer12.startReplaceGroup(1726261407);
                        boolean changed = gapComposer12.changed(titleBarCoreBinding);
                        Object rememberedValue = gapComposer12.rememberedValue();
                        Object obj6 = rememberedValue;
                        if (changed || rememberedValue == obj4) {
                            Object titleBarCoreBinding$$ExternalSyntheticLambda3 = new TitleBarCoreBinding$$ExternalSyntheticLambda3(titleBarCoreBinding, 1);
                            gapComposer12.updateRememberedValue(titleBarCoreBinding$$ExternalSyntheticLambda3);
                            obj6 = titleBarCoreBinding$$ExternalSyntheticLambda3;
                        }
                        titleBarCoreBinding.Action(titleBarActionScope, titleBarAction, (Function0) obj6, gapComposer12, intValue11 & 14);
                        gapComposer12.end(false);
                    }
                    TitleBarAction titleBarAction2 = ((TitleBarCoreBinding.ActionBinding) titleBarCoreBinding.endSecondaryAction$delegate.getValue()).action;
                    if (titleBarAction2 == null) {
                        gapComposer12.startReplaceGroup(1726398364);
                        gapComposer12.end(false);
                    } else {
                        gapComposer12.startReplaceGroup(1726398365);
                        boolean changed2 = gapComposer12.changed(titleBarCoreBinding);
                        Object rememberedValue2 = gapComposer12.rememberedValue();
                        Object obj7 = rememberedValue2;
                        if (changed2 || rememberedValue2 == obj4) {
                            Object titleBarCoreBinding$$ExternalSyntheticLambda32 = new TitleBarCoreBinding$$ExternalSyntheticLambda3(titleBarCoreBinding, 2);
                            gapComposer12.updateRememberedValue(titleBarCoreBinding$$ExternalSyntheticLambda32);
                            obj7 = titleBarCoreBinding$$ExternalSyntheticLambda32;
                        }
                        titleBarCoreBinding.Action(titleBarActionScope, titleBarAction2, (Function0) obj7, gapComposer12, intValue11 & 14);
                        gapComposer12.end(false);
                    }
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                TitleBarSubBinding titleBarSubBinding = (TitleBarSubBinding) obj5;
                TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                int i7 = TitleBarSubBinding.$r8$clinit;
                titleBarActionScope2.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer12).changed(titleBarActionScope2) ? 4 : 2;
                }
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (gapComposer13.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    TitleBarAction titleBarAction3 = ((TitleBarSubBinding.ActionBinding) titleBarSubBinding.primaryAction$delegate.getValue()).action;
                    if (titleBarAction3 == null) {
                        gapComposer13.startReplaceGroup(-602872358);
                        gapComposer13.end(false);
                    } else {
                        gapComposer13.startReplaceGroup(-602872357);
                        boolean changed3 = gapComposer13.changed(titleBarSubBinding);
                        Object rememberedValue3 = gapComposer13.rememberedValue();
                        Object obj8 = rememberedValue3;
                        if (changed3 || rememberedValue3 == obj4) {
                            Object titleBarSubBinding$$ExternalSyntheticLambda0 = new TitleBarSubBinding$$ExternalSyntheticLambda0(titleBarSubBinding, 1);
                            gapComposer13.updateRememberedValue(titleBarSubBinding$$ExternalSyntheticLambda0);
                            obj8 = titleBarSubBinding$$ExternalSyntheticLambda0;
                        }
                        titleBarSubBinding.Action$1(titleBarActionScope2, titleBarAction3, (Function0) obj8, gapComposer13, intValue12 & 14);
                        gapComposer13.end(false);
                    }
                    TitleBarAction titleBarAction4 = ((TitleBarSubBinding.ActionBinding) titleBarSubBinding.secondaryAction$delegate.getValue()).action;
                    if (titleBarAction4 == null) {
                        gapComposer13.startReplaceGroup(-602741352);
                        gapComposer13.end(false);
                    } else {
                        gapComposer13.startReplaceGroup(-602741351);
                        boolean changed4 = gapComposer13.changed(titleBarSubBinding);
                        Object rememberedValue4 = gapComposer13.rememberedValue();
                        Object obj9 = rememberedValue4;
                        if (changed4 || rememberedValue4 == obj4) {
                            Object titleBarSubBinding$$ExternalSyntheticLambda02 = new TitleBarSubBinding$$ExternalSyntheticLambda0(titleBarSubBinding, 2);
                            gapComposer13.updateRememberedValue(titleBarSubBinding$$ExternalSyntheticLambda02);
                            obj9 = titleBarSubBinding$$ExternalSyntheticLambda02;
                        }
                        titleBarSubBinding.Action$1(titleBarActionScope2, titleBarAction4, (Function0) obj9, gapComposer13, intValue12 & 14);
                        gapComposer13.end(false);
                    }
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                BetterOverdraftViewModel.Loaded loaded = (BetterOverdraftViewModel.Loaded) obj5;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer14, 54);
                    int hashCode2 = Long.hashCode(gapComposer14.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer14.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer14, fillMaxSize2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer14.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer14.startReusableNode();
                    if (gapComposer14.inserting) {
                        gapComposer14.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer14.useNode();
                    }
                    Updater.m576setimpl(gapComposer14, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer14, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer14, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer14, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer14, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    String str = loaded.usageViewModel.remainingAmount;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    zzacn.m2012AutoScaleTextZLomxE(1, 0, 0, 1597440, 426, 0L, Room.getSp(12), gapComposer14, null, ((Typography) gapComposer14.consume(staticProvidableCompositionLocal)).numeralLarge, str, null);
                    String str2 = loaded.usageViewModel.subtitle;
                    TextStyle textStyle = ((Typography) gapComposer14.consume(staticProvidableCompositionLocal)).bodyMedium;
                    Colors colors5 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, colors5.semantic.text.subtle, (Composer) gapComposer14, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    gapComposer14.end(true);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                BetterOverdraftViewModel.Loaded.TurnOffConfirmationSheet turnOffConfirmationSheet = (BetterOverdraftViewModel.Loaded.TurnOffConfirmationSheet) obj5;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (gapComposer15.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, turnOffConfirmationSheet.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                RecurringDepositsFirstTimeUserViewModel recurringDepositsFirstTimeUserViewModel = (RecurringDepositsFirstTimeUserViewModel) obj5;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recurringDepositsFirstTimeUserViewModel.continueButtonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                BenefitsHomeViewModel.Content.ActivitySection activitySection = (BenefitsHomeViewModel.Content.ActivitySection) obj5;
                EmbeddedHeaderScope embeddedHeaderScope = (EmbeddedHeaderScope) obj;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                embeddedHeaderScope.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((GapComposer) composer16).changed(embeddedHeaderScope) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer16;
                if (gapComposer17.shouldExecute(intValue16 & 1, (intValue16 & 19) != 18)) {
                    String str3 = activitySection.title;
                    str3.getClass();
                    boolean changedInstance = gapComposer17.changedInstance(activitySection);
                    Object rememberedValue5 = gapComposer17.rememberedValue();
                    if (changedInstance || rememberedValue5 == obj4) {
                        rememberedValue5 = new ErrorView$$ExternalSyntheticLambda0(activitySection, i2);
                        gapComposer17.updateRememberedValue(rememberedValue5);
                    }
                    embeddedHeaderScope.DefaultHeader((intValue16 << 9) & 7168, 2, gapComposer17, str3, null, (Function0) rememberedValue5);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                BenefitsHomeViewModel.Content.HeaderViewModel headerViewModel = (BenefitsHomeViewModel.Content.HeaderViewModel) obj5;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer17;
                if (gapComposer18.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer18, SizeKt.m290width3ABfNKs(companion, 24.0f));
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer18, 0);
                    int hashCode3 = Long.hashCode(gapComposer18.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer18.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer18, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer18.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer18.startReusableNode();
                    if (gapComposer18.inserting) {
                        gapComposer18.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer18.useNode();
                    }
                    Updater.m576setimpl(gapComposer18, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer18, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer18, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer18, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer18, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    gapComposer18.startReplaceGroup(854720372);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                    builder.append(headerViewModel.statusLabel);
                    builder.append("\n");
                    int ordinal2 = headerViewModel.greenStatus.ordinal();
                    if (ordinal2 == 0) {
                        gapComposer18.startReplaceGroup(1841186725);
                        Colors colors6 = (Colors) gapComposer18.consume(ArcadeThemeKt.LocalColors);
                        if (colors6 == null) {
                            colors6 = re$$ExternalSyntheticOutline0.m(gapComposer18, -1762997026, gapComposer18, false);
                        } else {
                            gapComposer18.startReplaceGroup(-1762997739);
                            gapComposer18.end(false);
                        }
                        j2 = colors6.semantic.text.placeholder;
                        gapComposer18.end(false);
                    } else {
                        if (ordinal2 != 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer18, 1841180487, false);
                        }
                        gapComposer18.startReplaceGroup(1841183842);
                        Colors colors7 = (Colors) gapComposer18.consume(ArcadeThemeKt.LocalColors);
                        if (colors7 == null) {
                            colors7 = re$$ExternalSyntheticOutline0.m(gapComposer18, -1762997026, gapComposer18, false);
                        } else {
                            gapComposer18.startReplaceGroup(-1762997739);
                            gapComposer18.end(false);
                        }
                        j2 = colors7.semantic.text.standard;
                        gapComposer18.end(false);
                    }
                    int pushStyle = builder.pushStyle(new SpanStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
                    try {
                        builder.append(headerViewModel.statusStateLabel);
                        builder.pop(pushStyle);
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        gapComposer18.end(false);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTypography;
                        Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer18, (Modifier) null, annotatedString, ((Typography) gapComposer18.consume(staticProvidableCompositionLocal2)).headlineLarge, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                        String str4 = headerViewModel.statusDescription;
                        if (str4 == null) {
                            gapComposer18.startReplaceGroup(727198814);
                            gapComposer18.end(false);
                        } else {
                            gapComposer18.startReplaceGroup(727198815);
                            TextStyle textStyle2 = ((Typography) gapComposer18.consume(staticProvidableCompositionLocal2)).bodySmall;
                            Colors colors8 = (Colors) gapComposer18.consume(ArcadeThemeKt.LocalColors);
                            if (colors8 == null) {
                                colors8 = re$$ExternalSyntheticOutline0.m(gapComposer18, -1762997026, gapComposer18, false);
                            } else {
                                gapComposer18.startReplaceGroup(-1762997739);
                                gapComposer18.end(false);
                            }
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors8.semantic.text.subtle, (Composer) gapComposer18, (Modifier) null, textStyle2, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                            gapComposer18.end(false);
                        }
                        gapComposer18.end(true);
                    } catch (Throwable th) {
                        builder.pop(pushStyle);
                        throw th;
                    }
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                BenefitsHomeViewModel.Content.StickyCtaViewModel stickyCtaViewModel = (BenefitsHomeViewModel.Content.StickyCtaViewModel) obj5;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer18;
                if (gapComposer19.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, stickyCtaViewModel.primaryButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                BenefitsHubViewModel.Error error = (BenefitsHubViewModel.Error) obj5;
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer19;
                if (gapComposer20.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, error.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                BenefitsHubViewModel.Loaded.CallToActionViewModel callToActionViewModel = (BenefitsHubViewModel.Loaded.CallToActionViewModel) obj5;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer20;
                if (gapComposer21.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, callToActionViewModel.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                PdsaBenefitsExplainerViewModel$Loaded pdsaBenefitsExplainerViewModel$Loaded = (PdsaBenefitsExplainerViewModel$Loaded) obj5;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer21;
                if (gapComposer22.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pdsaBenefitsExplainerViewModel$Loaded.primaryButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                return invoke$com$squareup$cash$bitcoin$views$applet$BitcoinHomeViewKt$$ExternalSyntheticLambda8(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$bitcoin$views$applet$autoinvest$BitcoinRecurringPurchaseTileKt$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$bitcoin$views$applet$buttons$BitcoinTradeButtonsWidgetViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$bitcoin$views$applet$disabled$BitcoinDisabledViewKt$$ExternalSyntheticLambda1(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$bitcoin$views$applet$education$BitcoinStoriesWidgetViewKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$bitcoin$views$dependents$BitcoinDependentWelcomeScreenViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$bitcoin$views$deposits$BitcoinDepositsViewKt$$ExternalSyntheticLambda17(obj, obj2, obj3);
            default:
                WalletAddressOptionsViewModel.Error error2 = (WalletAddressOptionsViewModel.Error) obj5;
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer22;
                if (gapComposer23.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    ((DefaultSizes) gapComposer23.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer23, 48);
                    int hashCode4 = Long.hashCode(gapComposer23.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer23.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer23, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer23.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer23.startReusableNode();
                    if (gapComposer23.inserting) {
                        gapComposer23.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer23.useNode();
                    }
                    Updater.m576setimpl(gapComposer23, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer23, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer23, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer23, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer23, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    String str5 = error2.errorTitle;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3832, 0L, (Composer) gapComposer23, SizeKt.fillMaxWidth(companion, 1.0f), ((Typography) gapComposer23.consume(staticProvidableCompositionLocal3)).titleBarPageTitle, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                    String str6 = error2.errorMessage;
                    TextStyle textStyle3 = ((Typography) gapComposer23.consume(staticProvidableCompositionLocal3)).bodyMedium;
                    Colors colors9 = (Colors) gapComposer23.consume(ArcadeThemeKt.LocalColors);
                    if (colors9 == null) {
                        colors9 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-1762997739);
                        gapComposer23.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, colors9.semantic.text.subtle, (Composer) gapComposer23, SizeKt.fillMaxWidth(companion, 1.0f), textStyle3, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                    gapComposer23.end(true);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
