package com.squareup.cash.blockers.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.SelectionViewModel;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.protos.franklin.api.SelectionBlocker;
import com.squareup.protos.franklin.api.SelectionOption;
import com.squareup.util.cash.Countries;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class SelectionViewKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectionBlocker.Icon.values().length];
            try {
                iArr[SelectionBlocker.Icon.INSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectionBlocker.Icon.ISSUED_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectionBlocker.Icon.VERIFICATION_REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void FooterSection(final SelectionViewModel selectionViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        final int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(113382983);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(selectionViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = selectionViewModel.linkableFooter;
            SelectionOption selectionOption = selectionViewModel.primaryOption;
            SelectionOption selectionOption2 = selectionViewModel.secondaryOption;
            List list = selectionViewModel.helpItems;
            if (str == null && selectionOption == null && selectionOption2 == null && list.isEmpty()) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.blockers.views.SelectionViewKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    SelectionViewKt.FooterSection(selectionViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    SelectionViewKt.FooterSection(selectionViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            i3 = 1;
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, Expect_jvmKt.rememberComposableLambda(282018278, new TabContentViewKt$$ExternalSyntheticLambda11(str, function1, 13), gapComposer), Expect_jvmKt.rememberComposableLambda(-1454096251, new ComposeDialogKt$$ExternalSyntheticLambda12(list, function1, selectionOption2, selectionOption, 20), gapComposer), gapComposer, 28032, 3);
        } else {
            i3 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.blockers.views.SelectionViewKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            SelectionViewKt.FooterSection(selectionViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            SelectionViewKt.FooterSection(selectionViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void HeaderSection(SelectionViewModel selectionViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer;
        Icons icons;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(741071267);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(selectionViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            SelectionBlocker.Icon icon = selectionViewModel.icon;
            String str = selectionViewModel.amount;
            String str2 = selectionViewModel.headerText;
            String str3 = selectionViewModel.mainText;
            if (str != null) {
                gapComposer2.startReplaceGroup(1122443035);
                gapComposer = gapComposer2;
                modifier2 = modifier;
                zzacg.m2010HeroNumericsHeadertv5qRRQ(str, modifier2, 0, (String) null, (String) null, str2, str3, gapComposer, i2 & 112, 28);
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer2;
                gapComposer.startReplaceGroup(1122601321);
                if (icon != null) {
                    int i3 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                    icons = i3 != 1 ? i3 != 2 ? i3 != 3 ? Icons.Help32 : Icons.SecurityCheckFill32 : Icons.CardBasicFill32 : Icons.Instant32;
                } else {
                    icons = null;
                }
                if (icons == null) {
                    gapComposer.startReplaceGroup(1122674759);
                    gapComposer.end(false);
                    composableLambdaImpl = null;
                } else {
                    gapComposer.startReplaceGroup(1122674760);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(681487749, new InfoSectionKt$$ExternalSyntheticLambda6(icons, 12), gapComposer);
                    gapComposer.end(false);
                    composableLambdaImpl = rememberComposableLambda;
                }
                String str4 = str2 == null ? str3 : str2;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = str4;
                modifier2 = modifier;
                Countries.PageHeader(str5, modifier2, composableLambdaImpl, (str3 == null || str2 == null) ? null : str3, gapComposer, i2 & 112, 0);
                gapComposer.end(false);
            }
        } else {
            modifier2 = modifier;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(selectionViewModel, modifier2, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OptionsSection(List list, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(366316484);
        int i3 = 256;
        int i4 = (gapComposer.changedInstance(list) ? 32 : 16) | i | (gapComposer.changedInstance(function1) ? 256 : 128);
        int i5 = 0;
        int i6 = 1;
        if (!gapComposer.shouldExecute(i4 & 1, (i4 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            i2 = 1;
            gapComposer.skipToGroupEnd();
        } else {
            if (list.isEmpty()) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, 0);
                    return;
                }
                return;
            }
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(Modifier.Companion.$$INSTANCE, ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(1538201968);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SelectionOption selectionOption = (SelectionOption) it.next();
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1295991466, new BulletinTileKt$$ExternalSyntheticLambda6(selectionOption, i6), gapComposer);
                int i7 = ((i4 & 896) == i3 ? i6 : i5) | (gapComposer.changedInstance(selectionOption) ? 1 : 0);
                Object rememberedValue = gapComposer.rememberedValue();
                if (i7 != 0 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new SelectionViewKt$$ExternalSyntheticLambda8(function1, selectionOption, i5);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue, false, true, null, null, 0L, push, null, gapComposer, 805502982, 1498);
                i6 = 1;
                i5 = i5;
                i4 = i4;
                i3 = i3;
            }
            gapComposer.end(i5);
            i2 = 1;
            gapComposer.end(true);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, i2);
        }
    }

    public static final void SelectionBlockerUi(SelectionViewModel selectionViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2000947140);
        int i2 = (gapComposer.changedInstance(selectionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1526077521, new SetPinViewKt$$ExternalSyntheticLambda2(selectionViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(modifier2, selectionViewModel, function1, i, 28);
        }
    }
}
