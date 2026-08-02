package com.squareup.cash.billssubscriptions.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.views.ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1;
import bo.app.n3$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.billssubscriptions.viewmodels.BillsSubscriptionsMerchantListViewModel$Loaded;
import com.squareup.cash.billssubscriptions.viewmodels.model.Merchant;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$1$1;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda8;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BillsSubscriptionsMerchantListViewKt {
    public static final ComposableLambdaImpl lambda$1912940576 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(10), false, 1912940576);
    public static final ComposableLambdaImpl lambda$1669881079 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(11), false, 1669881079);
    public static final ComposableLambdaImpl lambda$182234115 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(10), false, 182234115);
    public static final ComposableLambdaImpl lambda$1814575545 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(16), false, 1814575545);

    public static final void AddedPill(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(39402596);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(Modifier.Companion.$$INSTANCE, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.standard, ColorKt.RectangleShape);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m177backgroundbw27NRU, 8.0f, 4.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.bills_subscriptions_merchant_list_added_label), (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(i, 9);
        }
    }

    public static final void BillsSubscriptionsMerchantListView(BillsSubscriptionsMerchantListViewModel$Loaded billsSubscriptionsMerchantListViewModel$Loaded, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ComposableLambdaImpl composableLambdaImpl;
        billsSubscriptionsMerchantListViewModel$Loaded.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-931998854);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(billsSubscriptionsMerchantListViewModel$Loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Continuation continuation = null;
            BillsSubscriptionsMerchantListViewModel$Loaded billsSubscriptionsMerchantListViewModel$Loaded2 = billsSubscriptionsMerchantListViewModel$Loaded instanceof BillsSubscriptionsMerchantListViewModel$Loaded ? billsSubscriptionsMerchantListViewModel$Loaded : null;
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(null, 0L, gapComposer, 0, 3);
            gapComposer = gapComposer;
            SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer);
            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
            int i4 = i3 & 112;
            boolean changed = (i4 == 32) | gapComposer.changed(m382rememberTextFieldStateLepunE);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MusicViewKt$LoadedMusicContent$1$1(function1, m382rememberTextFieldStateLepunE, continuation, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, charSequence, (Function2) rememberedValue);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1780727106, new BrandSheetViewKt$$ExternalSyntheticLambda6(22, function1), gapComposer);
            if (billsSubscriptionsMerchantListViewModel$Loaded2 == null || !billsSubscriptionsMerchantListViewModel$Loaded2.showDoneButton) {
                gapComposer.startReplaceGroup(-352211148);
                gapComposer.end(false);
                composableLambdaImpl = null;
            } else {
                gapComposer.startReplaceGroup(-352287098);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-377742798, new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, false, 18), gapComposer);
                gapComposer.end(false);
            }
            boolean changedInstance = gapComposer.changedInstance(billsSubscriptionsMerchantListViewModel$Loaded2) | gapComposer.changed(m382rememberTextFieldStateLepunE) | gapComposer.changed(rememberSearchBarKeyboardState) | (i4 == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                n3$$ExternalSyntheticLambda0 n3__externalsyntheticlambda0 = new n3$$ExternalSyntheticLambda0(billsSubscriptionsMerchantListViewModel$Loaded2, m382rememberTextFieldStateLepunE, rememberSearchBarKeyboardState, function1, 25);
                gapComposer.updateRememberedValue(n3__externalsyntheticlambda0);
                rememberedValue2 = n3__externalsyntheticlambda0;
            }
            ScreenScaffoldKt.ScreenScaffoldLazy(null, null, null, rememberComposableLambda, composableLambdaImpl, (Function1) rememberedValue2, gapComposer, 3072, 7);
            gapComposer.startReplaceGroup(-351943805);
            gapComposer.end(false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(i, 24, modifier2, billsSubscriptionsMerchantListViewModel$Loaded, function1);
        }
    }

    public static final void DoneFooter(Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1047890042);
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(428929800, new DismissableToastKt$$ExternalSyntheticLambda3(9, function0), gapComposer), gapComposer, 24576, 15);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda8(function0, i, 3);
        }
    }

    public static final void MerchantRow(Merchant merchant, Function0 function0, Composer composer, int i) {
        Function0 function02;
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1455427959);
        int i2 = 2;
        int i3 = 16;
        int i4 = (gapComposer.changedInstance(merchant) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            String str = merchant.subtitle;
            if (str == null) {
                gapComposer.startReplaceGroup(-959203779);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(-959203778);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1882070669, new TransfersViewKt$$ExternalSyntheticLambda5(str, 29), gapComposer);
                gapComposer.end(false);
            }
            ComposableLambdaImpl composableLambdaImpl = rememberComposableLambda;
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-2014317442, new CashtagViewKt$$ExternalSyntheticLambda10(merchant, i3), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(merchant);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BadgeQueries$$ExternalSyntheticLambda5(merchant, 9);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            function02 = function0;
            CellDefaultKt.CellSearchResult((Function2) null, rememberComposableLambda2, (Modifier) null, function02, composableLambdaImpl, (Function1) rememberedValue, gapComposer, ((i4 << 6) & 7168) | 54, 4);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinUiFactory$$ExternalSyntheticLambda12(merchant, function02, i, i2);
        }
    }
}
