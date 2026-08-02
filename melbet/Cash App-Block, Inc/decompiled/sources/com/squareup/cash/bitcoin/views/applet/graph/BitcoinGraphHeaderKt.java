package com.squareup.cash.bitcoin.views.applet.graph;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.text.zza;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel$Subtitle$StaleData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public abstract class BitcoinGraphHeaderKt {

    /* renamed from: lambda$-1751724486, reason: not valid java name */
    public static final ComposableLambdaImpl f254lambda$1751724486 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(19), false, -1751724486);

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InvestingCryptoImage.values().length];
            try {
                zza zzaVar = InvestingCryptoImage.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zza zzaVar2 = InvestingCryptoImage.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void BitcoinGraphHeader(InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-26056564);
        int i2 = (gapComposer.changedInstance(investingHomePortfolioHeaderContentModel) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 48);
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
            TextIndentKt textIndentKt = investingHomePortfolioHeaderContentModel != null ? investingHomePortfolioHeaderContentModel.subtitle : null;
            if (Intrinsics.areEqual(textIndentKt, InvestingHomePortfolioHeaderContentModel$Subtitle$StaleData.INSTANCE)) {
                gapComposer.startReplaceGroup(-662072467);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal2);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                ProvidedValue m = re$$ExternalSyntheticOutline0.m(colors.semantic.text.disabled, staticProvidableCompositionLocal);
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalIconColor;
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal2);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Updater.CompositionLocalProvider(new ProvidedValue[]{m, Recorder$$ExternalSyntheticOutline2.m(colors2.semantic.icon.disabled, dynamicProvidableCompositionLocal)}, f254lambda$1751724486, gapComposer, 56);
                gapComposer.end(false);
            } else if (textIndentKt instanceof InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData) {
                gapComposer.startReplaceGroup(1502671916);
                NewUpToDateSubtitle((InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData) textIndentKt, null, gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-661753818);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinUiFactory$$ExternalSyntheticLambda12(investingHomePortfolioHeaderContentModel, modifier, i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NewUpToDateSubtitle(InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        String stringResource;
        String str;
        Icons icons;
        Icons icons2;
        Modifier.Companion companion;
        InvestingCryptoImage investingCryptoImage = investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData.percentIcon;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-526697602);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData) ? 4 : 2) | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str2 = investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData.day;
            String str3 = investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData.percent;
            if (investingCryptoImage == null) {
                gapComposer.startReplaceGroup(-293978363);
                gapComposer.end(false);
                stringResource = null;
            } else {
                gapComposer.startReplaceGroup(-293978362);
                stringResource = Room.stringResource(gapComposer, investingCryptoImage == InvestingCryptoImage.ARROW_UP ? R.string.bitcoin_views_increase : R.string.bitcoin_views_decrease);
                gapComposer.end(false);
            }
            if (stringResource == null) {
                stringResource = "";
            }
            if (str3 != null) {
                str = StringsKt.trim(str3 + " " + stringResource).toString();
            } else {
                str = null;
            }
            String joinToString$default = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str, str2}), " ", null, null, 0, null, null, 62);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(4.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.CenterHorizontally, 1));
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            boolean changed = gapComposer.changed(joinToString$default);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BadgeKt$$ExternalSyntheticLambda3(joinToString$default, 8);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion2, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            int i3 = investingCryptoImage == null ? -1 : WhenMappings.$EnumSwitchMapping$0[investingCryptoImage.ordinal()];
            if (i3 == 1) {
                icons = Icons.TickerUp16;
            } else if (i3 != 2) {
                icons2 = null;
                if (icons2 != null) {
                    gapComposer.startReplaceGroup(-444382421);
                    gapComposer.end(false);
                    companion = companion2;
                } else {
                    gapComposer.startReplaceGroup(-444382420);
                    companion = companion2;
                    Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer, 48, 12);
                    gapComposer.end(false);
                }
                if (str3 == null) {
                    str3 = "";
                }
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4026, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).labelMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4026, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).labelMedium, (TextLineBalancing) null, str2 != null ? "" : str2, (Map) null, (Function1) null, false);
                gapComposer.end(true);
                String str4 = investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData.totalAmount;
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4026, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).labelMedium, (TextLineBalancing) null, str4 != null ? "" : str4, (Map) null, (Function1) null, false);
                gapComposer.end(true);
                modifier2 = companion;
            } else {
                icons = Icons.TickerDown16;
            }
            icons2 = icons;
            if (icons2 != null) {
            }
            if (str3 == null) {
            }
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTypography;
            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4026, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal2)).labelMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4026, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal2)).labelMedium, (TextLineBalancing) null, str2 != null ? "" : str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            String str42 = investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData.totalAmount;
            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4026, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal2)).labelMedium, (TextLineBalancing) null, str42 != null ? "" : str42, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinUiFactory$$ExternalSyntheticLambda12(investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData, modifier2, i, 12);
        }
    }

    public static final void OfflineText(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1785284732);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(companion, null, 3);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, wrapContentWidth$default);
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
            Trace.m1191Iconww6aTOc(Icons.AlertOffline16, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
            String stringResource = Room.stringResource(gapComposer, R.string.currently_offline);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), (TextStyle) null, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier2, i, 4);
        }
    }
}
