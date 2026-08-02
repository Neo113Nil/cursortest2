package com.squareup.cash.bitcoin.views;

import androidx.compose.foundation.CanvasKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.passcode.views.ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDisplayCurrencyViewModel;
import com.squareup.cash.bitcoin.viewmodels.BitcoinPayInUsdSettingsViewModel;
import com.squareup.cash.blockers.presenters.CheckmarkPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.util.coroutines.TakeUntilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BitcoinInvoiceEntryViewKt {

    /* renamed from: lambda$-1214956078, reason: not valid java name */
    public static final ComposableLambdaImpl f245lambda$1214956078 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(12), false, -1214956078);

    /* renamed from: lambda$-729931589, reason: not valid java name */
    public static final ComposableLambdaImpl f252lambda$729931589 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(11), false, -729931589);
    public static final ComposableLambdaImpl lambda$459466141 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(13), false, 459466141);
    public static final ComposableLambdaImpl lambda$1041490708 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(12), false, 1041490708);

    /* renamed from: lambda$-945792616, reason: not valid java name */
    public static final ComposableLambdaImpl f253lambda$945792616 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(13), false, -945792616);

    /* renamed from: lambda$-437817289, reason: not valid java name */
    public static final ComposableLambdaImpl f251lambda$437817289 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(14), false, -437817289);

    /* renamed from: lambda$-1334473949, reason: not valid java name */
    public static final ComposableLambdaImpl f247lambda$1334473949 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(15), false, -1334473949);
    public static final ComposableLambdaImpl lambda$1068675998 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(17), false, 1068675998);

    /* renamed from: lambda$-1702294378, reason: not valid java name */
    public static final ComposableLambdaImpl f250lambda$1702294378 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(18), false, -1702294378);

    /* renamed from: lambda$-1685368762, reason: not valid java name */
    public static final ComposableLambdaImpl f249lambda$1685368762 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(19), false, -1685368762);
    public static final ComposableLambdaImpl lambda$134384781 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(20), false, 134384781);

    /* renamed from: lambda$-1595125122, reason: not valid java name */
    public static final ComposableLambdaImpl f248lambda$1595125122 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(21), false, -1595125122);
    public static final ComposableLambdaImpl lambda$1775473536 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(22), false, 1775473536);
    public static final ComposableLambdaImpl lambda$1545670438 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(23), false, 1545670438);

    /* renamed from: lambda$-1293106670, reason: not valid java name */
    public static final ComposableLambdaImpl f246lambda$1293106670 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(24), false, -1293106670);
    public static final ComposableLambdaImpl lambda$769318391 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(25), false, 769318391);
    public static final ComposableLambdaImpl lambda$1692230923 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(26), false, 1692230923);

    public static final void BitcoinDisplayCurrencyContent(BitcoinDisplayCurrencyViewModel bitcoinDisplayCurrencyViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1844480011);
        int i3 = (gapComposer.changedInstance(bitcoinDisplayCurrencyViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.icon.brand), null, null, Expect_jvmKt.rememberComposableLambda(-1033961056, new BankingDialog$$ExternalSyntheticLambda1(modifier, function1, bitcoinDisplayCurrencyViewModel, 21), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(bitcoinDisplayCurrencyViewModel, function1, modifier2, i, i2, 15);
        }
    }

    public static final void BitcoinDisplayCurrencyInfoView(Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-545558862);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.icon.brand), null, null, Expect_jvmKt.rememberComposableLambda(543888317, new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, z, 20), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 4, false);
        }
    }

    public static final void BitcoinDisplayCurrencyItem(int i, Composer composer, Modifier modifier, String str, String str2, Function0 function0, boolean z) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1837890131);
        int i2 = 2;
        int i3 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | 24576;
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            CellDefaultAccessory.Radio radio = new CellDefaultAccessory.Radio(z);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(596037729, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, i4), gapComposer), SizeKt.fillMaxWidth(companion, 1.0f), function0, false, false, Expect_jvmKt.rememberComposableLambda(785623195, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str2, i2), gapComposer), null, 0L, radio, null, gapComposer, ((i3 >> 3) & 896) | 1572870, 1464);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinDisplayCurrencyViewKt$$ExternalSyntheticLambda15(str, str2, z, function0, modifier2, i, 0);
        }
    }

    public static final void BitcoinDisplayCurrencySettings(BitcoinDisplayCurrencyViewModel.Loaded loaded, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(250514241);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            TakeUntilKt.WidgetSectionView(Room.stringResource(gapComposer, R.string.bitcoin_settings_display_currency), companion, null, null, Expect_jvmKt.rememberComposableLambda(-1315494117, new BankingDialogKt$$ExternalSyntheticLambda2(19, (Object) loaded, function1), gapComposer), gapComposer, ((i3 >> 3) & 112) | 196608, 28);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(i, 28, modifier2, loaded, function1);
        }
    }

    public static final void BitcoinDisplayCurrencySymbolInfoView(int i, Composer composer, Modifier modifier, Function1 function1) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1940610083);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.icon.brand), null, null, Expect_jvmKt.rememberComposableLambda(2144150450, new BalanceHomeViewKt$$ExternalSyntheticLambda12(19, function1), gapComposer), gapComposer, 3072, 6);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CanvasKt$$ExternalSyntheticLambda0(function1, modifier, i, 1);
        }
    }

    public static final void BitcoinInvoiceEntryView(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1372478636);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, f251lambda$437817289, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(i, 0);
        }
    }

    public static final void BitcoinPayInUsdSettings(BitcoinPayInUsdSettingsViewModel bitcoinPayInUsdSettingsViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        bitcoinPayInUsdSettingsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1702709264);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(bitcoinPayInUsdSettingsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-989507525, new BitcoinUiFactory$$ExternalSyntheticLambda12(6, (Object) bitcoinPayInUsdSettingsViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(bitcoinPayInUsdSettingsViewModel, function1, i, 3);
        }
    }
}
