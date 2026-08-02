package androidx.compose.ui.graphics;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountViewModel;
import com.squareup.cash.bitcoin.viewmodels.BitcoinKeypadModel;
import com.squareup.cash.bitcoin.views.amountpicker.BitcoinAmountPickerViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerKt;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerModel;
import com.squareup.cash.boost.db.RewardWithSelection;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.rewardly.ui.UiRewardAvatar;
import com.squareup.protos.rewardly.ui.UiRewardAvatars;
import com.squareup.util.cash.ColorsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt___StringsKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class CanvasUtils {
    public static final void BitcoinAmountPickerContent(BitcoinAmountViewModel bitcoinAmountViewModel, boolean z, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        boolean z2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1021350530);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(bitcoinAmountViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier2, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            BitcoinKeypadModel bitcoinKeypadModel = bitcoinAmountViewModel.keypadModel;
            String str = bitcoinAmountViewModel.title;
            BitcoinKeypadAmountPickerModel bitcoinKeypadAmountPickerModel = new BitcoinKeypadAmountPickerModel(64, bitcoinKeypadModel, str.length() > 0 ? str : null, bitcoinAmountViewModel.actionButtonText, bitcoinAmountViewModel.noteButtonText, false, bitcoinAmountViewModel.isActionEnabled, false);
            boolean z3 = (i3 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z3 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AvatarsKt$$ExternalSyntheticLambda1(11, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            BitcoinKeypadAmountPickerKt.BitcoinKeypadAmountPicker(bitcoinKeypadAmountPickerModel, z2, (Function1) rememberedValue, new LayoutWeightElement(1.0f, true), gapComposer, i3 & 112, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34((Object) bitcoinAmountViewModel, z, function1, (Object) modifier2, i, 10);
        }
    }

    public static final void BitcoinAmountPickerView(BitcoinAmountViewModel bitcoinAmountViewModel, boolean z, Function1 function1, RealCashVibrator realCashVibrator, Composer composer, int i) {
        int i2;
        bitcoinAmountViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1944339503);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(bitcoinAmountViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(realCashVibrator) ? 2048 : 1024;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Updater.CompositionLocalProvider(LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator), Expect_jvmKt.rememberComposableLambda(-2061047569, new BitcoinAmountPickerViewKt$$ExternalSyntheticLambda0(bitcoinAmountViewModel, z, function1, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34((Object) bitcoinAmountViewModel, z, function1, (Object) realCashVibrator, i, 9);
        }
    }

    public static void enableZ(android.graphics.Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final StackedAvatarViewModel.Avatar toAvatar(RewardWithSelection rewardWithSelection) {
        Iterable iterable;
        List list;
        com.squareup.protos.cash.ui.Color color;
        UiRewardAvatars uiRewardAvatars = rewardWithSelection.avatars;
        if (uiRewardAvatars == null || (iterable = uiRewardAvatars.reward_avatars) == null) {
            iterable = EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            Image image = null;
            if (!it.hasNext()) {
                break;
            }
            UiRewardAvatar uiRewardAvatar = (UiRewardAvatar) it.next();
            Image image2 = uiRewardAvatar.image;
            if (image2 == null) {
                String str = uiRewardAvatar.url;
                if (str != null) {
                    image = new Image(str, str, 4);
                }
            } else {
                image = image2;
            }
            if (image != null) {
                arrayList.add(image);
            }
        }
        Image image3 = (Image) CollectionsKt.firstOrNull((List) arrayList);
        if (image3 == null) {
            zzd zzdVar = Icons.Companion;
            return new StackedAvatarViewModel.Avatar(null, null, null, null, null, new Icon("B06Lkl"), null, null, false, false, null, true, null, null, 114655);
        }
        String str2 = rewardWithSelection.title;
        if (uiRewardAvatars == null || (list = uiRewardAvatars.reward_avatars) == null) {
            list = EmptyList.INSTANCE;
        }
        UiRewardAvatar uiRewardAvatar2 = (UiRewardAvatar) CollectionsKt.firstOrNull(list);
        if (uiRewardAvatar2 != null) {
            color = uiRewardAvatar2.themed_color;
            if (color == null) {
                String str3 = uiRewardAvatar2.color;
                if (str3 != null) {
                    color = ColorsKt.toColor(str3);
                }
            }
            return new StackedAvatarViewModel.Avatar(color == null ? new ColorModel.Accented(color) : null, str2 != null ? StringsKt___StringsKt.firstOrNull(str2) : null, str2, image3, null, null, null, null, false, false, null, false, null, null, 131056);
        }
        color = null;
        return new StackedAvatarViewModel.Avatar(color == null ? new ColorModel.Accented(color) : null, str2 != null ? StringsKt___StringsKt.firstOrNull(str2) : null, str2, image3, null, null, null, null, false, false, null, false, null, null, 131056);
    }
}
