package com.squareup.cash.cashapppay.settings.views;

import android.icu.text.MessageFormat;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.room.Room;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda47;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsRowViewModel$BusinessViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.LinkedBusinessDetailsViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.RemoveLinkedBusinessViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.UnlinkResultViewModel;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda3;
import com.squareup.cash.investing.components.search.InvestingSearchViewKt$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class UnlinkResultViewKt {

    /* renamed from: lambda$-864064098, reason: not valid java name */
    public static final ComposableLambdaImpl f350lambda$864064098;
    public static final ComposableLambdaImpl lambda$1696709199 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(29), false, 1696709199);
    public static final ComposableLambdaImpl lambda$1727258503 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(1), false, 1727258503);

    static {
        new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(10), false, 554063761);
        new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(11), false, 1225746765);
        new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(12), false, -75917060);
        f350lambda$864064098 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(2), false, -864064098);
    }

    public static final void BusinessList(List list, RealImageLoader realImageLoader, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-812748102);
        int i2 = i | (gapComposer.changedInstance(list) ? 4 : 2) | (gapComposer.changedInstance(realImageLoader) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            boolean changedInstance = gapComposer.changedInstance(list) | gapComposer.changedInstance(realImageLoader) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InvestingSearchViewKt$$ExternalSyntheticLambda1(list, realImageLoader, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyColumn(m177backgroundbw27NRU, null, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 0, 510);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(list, realImageLoader, function1, i, 23);
        }
    }

    public static final void CashAppPaySettings(CashAppPaySettingsViewModel cashAppPaySettingsViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1736947990);
        int i2 = (gapComposer.changedInstance(cashAppPaySettingsViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | (gapComposer.changedInstance(realImageLoader) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1290064639, new CashCardKt$$ExternalSyntheticLambda1(22, cashAppPaySettingsViewModel, function1, realImageLoader), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(cashAppPaySettingsViewModel, function1, realImageLoader, i, 20);
        }
    }

    public static final void ConfirmRemoveLinkedBusinessContent(RemoveLinkedBusinessViewModel removeLinkedBusinessViewModel, Function1 function1, Composer composer, int i) {
        String format2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1409046848);
        int i2 = 16;
        int i3 = (gapComposer.changedInstance(removeLinkedBusinessViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i4 = 18;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            int ordinal = removeLinkedBusinessViewModel.actionType.ordinal();
            int i5 = R.string.remove_confirmation_title_linked_account;
            if (ordinal != 4 && ordinal != 5) {
                i5 = R.string.remove_confirmation_title;
            }
            String stringResource = Room.stringResource(gapComposer, i5);
            SyncBusinessGrant.ActionType actionType = removeLinkedBusinessViewModel.actionType;
            String str = removeLinkedBusinessViewModel.name;
            int ordinal2 = actionType.ordinal();
            if (ordinal2 == 4) {
                gapComposer.startReplaceGroup(1669235984);
                str.getClass();
                format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.remove_confirmation_message_linked_account)).format(new Object[]{str});
                format2.getClass();
                gapComposer.end(false);
            } else if (ordinal2 != 5) {
                gapComposer.startReplaceGroup(1669242273);
                str.getClass();
                format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.remove_confirmation_message)).format(new Object[]{str});
                format2.getClass();
                gapComposer.end(false);
            } else {
                format2 = re$$ExternalSyntheticOutline0.m(gapComposer, 1669239585, R.string.remove_confirmation_message_sq_btc_conversions, gapComposer, false);
            }
            ModalKt.Modal((Modifier) null, stringResource, format2, Expect_jvmKt.rememberComposableLambda(2015733020, new CheckDepositAmountKt$$ExternalSyntheticLambda6(i4, (Object) removeLinkedBusinessViewModel, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(-255734725, new BookletGridKt$$ExternalSyntheticLambda1(i2, function1), gapComposer), (Function3) null, gapComposer, 27648, 33);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CaptureCheckFaceKt$$ExternalSyntheticLambda6(removeLinkedBusinessViewModel, function1, i, i2);
        }
    }

    public static final void LinkedBusinessDetailSheet(LinkedBusinessDetailsViewModel linkedBusinessDetailsViewModel, RealImageLoader realImageLoader, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1144064291);
        int i2 = (gapComposer.changedInstance(linkedBusinessDetailsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(realImageLoader) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1108122104, new CashCardKt$$ExternalSyntheticLambda1(24, realImageLoader, linkedBusinessDetailsViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(linkedBusinessDetailsViewModel, realImageLoader, function1, i, 21);
        }
    }

    public static final void LinkedBusinessRow(CashAppPaySettingsRowViewModel$BusinessViewModel cashAppPaySettingsRowViewModel$BusinessViewModel, RealImageLoader realImageLoader, Function1 function1, Composer composer, int i) {
        String str;
        cashAppPaySettingsRowViewModel$BusinessViewModel.getClass();
        realImageLoader.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1749842052);
        int i2 = (gapComposer.changedInstance(cashAppPaySettingsRowViewModel$BusinessViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(realImageLoader) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if (cashAppPaySettingsRowViewModel$BusinessViewModel.actionType == SyncBusinessGrant.ActionType.RECURRING_DEPOSITS) {
                str = re$$ExternalSyntheticOutline0.m(gapComposer, -1525969695, R.string.linked_businesses_sq_btc_title, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1525896380);
                gapComposer.end(false);
                str = cashAppPaySettingsRowViewModel$BusinessViewModel.title;
            }
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-2043225412, new LocalHomeViewKt$$ExternalSyntheticLambda0(function1, cashAppPaySettingsRowViewModel$BusinessViewModel, cashAppPaySettingsRowViewModel$BusinessViewModel.renderingBehavior == SyncBusinessGrant.RenderingBehavior.AFTERPAY, str), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(cashAppPaySettingsRowViewModel$BusinessViewModel, realImageLoader, function1, i, 25);
        }
    }

    public static final void UnlinkResult(UnlinkResultViewModel unlinkResultViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2046308427);
        int i2 = (gapComposer.changedInstance(unlinkResultViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1304805750, new UnlinkResultViewKt$$ExternalSyntheticLambda0(function1, unlinkResultViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new UnlinkResultViewKt$$ExternalSyntheticLambda0(unlinkResultViewModel, function1, i);
        }
    }
}
