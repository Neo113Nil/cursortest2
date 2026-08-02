package com.squareup.cash.account.components.accountswitcher;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda7;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountToDoKt$$ExternalSyntheticLambda0;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountSwitcherViewModel;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountViewModel;
import com.squareup.cash.account.viewmodels.accountswitcher.AddAccountOptionsViewModel;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.activity.views.ErrorActivityItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.eligibility.backend.api.SettingVisibility;
import com.squareup.cash.investing.components.MyInvestmentsTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.mooncake.components.MooncakeLargeIcon;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BadgeTitleKt {

    /* renamed from: lambda$-1271007732, reason: not valid java name */
    public static final ComposableLambdaImpl f111lambda$1271007732 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(8), false, -1271007732);

    /* renamed from: lambda$-872594931, reason: not valid java name */
    public static final ComposableLambdaImpl f112lambda$872594931 = new ComposableLambdaImpl(new ErrorActivityItemKt$$ExternalSyntheticLambda0(9), false, -872594931);

    public static final void AccountSwitcher(AccountSwitcherViewModel accountSwitcherViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1596270506);
        int i2 = (gapComposer.changedInstance(accountSwitcherViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1388911541, new AccountSwitcherView$$ExternalSyntheticLambda0(function1, accountSwitcherViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) accountSwitcherViewModel, function1, (Object) modifier2, i, 27);
        }
    }

    public static final void AccountSwitcherContent(AccountSwitcherViewModel accountSwitcherViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(266413507);
        int i4 = i | (gapComposer.changedInstance(accountSwitcherViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        int i6 = i3;
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier3 = i5 != 0 ? companion : modifier2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier3);
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
            Transformations.SheetHeader(Room.stringResource(gapComposer, R.string.account_switcher_choose_an_account), (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            boolean z = accountSwitcherViewModel instanceof AccountSwitcherViewModel.Loaded;
            float f = (z && ((AccountSwitcherViewModel.Loaded) accountSwitcherViewModel).accountViewModels.size() == 1) ? 120.0f : 200.0f;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z2 = !z;
            Object rememberedValue = gapComposer.rememberedValue();
            int i7 = 3;
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ActivityTabViewKt$$ExternalSyntheticLambda17(i7);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Strings.m3984LoadableSheetContentosbwsH8(accountSwitcherViewModel, z2, f, fillMaxWidth, (Function1) rememberedValue, Expect_jvmKt.rememberComposableLambda(-248980309, new SetPinViewKt$$ExternalSyntheticLambda4(i7, function1), gapComposer), gapComposer, (i6 & 14) | 224256, 0);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(accountSwitcherViewModel, function1, modifier2, i, i2, 9);
        }
    }

    public static final void AccountSwitcherLoaded(final AccountSwitcherViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        Object obj;
        SettingVisibility settingVisibility;
        int i3;
        Object obj2;
        Object obj3;
        Object obj4;
        Function1 function13 = function1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2117655097);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function13) ? 32 : 16;
        }
        int i4 = i2;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            List list = loaded.accountViewModels;
            SettingVisibility settingVisibility2 = loaded.addAccountVisibility;
            SettingVisibility settingVisibility3 = loaded.createPersonalAccountVisibility;
            SettingVisibility settingVisibility4 = loaded.createBusinessAccountConfig.visibility;
            boolean z = list.size() == 1;
            gapComposer.startReplaceGroup(984432589);
            Iterator it = loaded.accountViewModels.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                obj = Composer.Companion.Empty;
                if (!hasNext) {
                    break;
                }
                AccountViewModel accountViewModel = (AccountViewModel) it.next();
                StackedAvatarViewModel.Single single = accountViewModel.avatarViewModel;
                single.getClass();
                Modifier testTag = TestTagKt.testTag(companion, "account_cell_" + accountViewModel.subtitle);
                CellDefaultAccessory.Radio radio = !z ? new CellDefaultAccessory.Radio(accountViewModel.isActiveAccount) : null;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2079477405, new SliderDefaults$$ExternalSyntheticLambda0(z, single, 5), gapComposer);
                byte b = 0;
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(623064350, new AccountSwitcherViewKt$$ExternalSyntheticLambda9(accountViewModel, b, b), gapComposer);
                boolean z2 = z;
                boolean changedInstance = ((i4 & 112) == 32) | gapComposer.changedInstance(accountViewModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == obj) {
                    rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(5, function13, accountViewModel);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                GapComposer gapComposer2 = gapComposer;
                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, testTag, (Function0) rememberedValue, null, false, false, Expect_jvmKt.rememberComposableLambda(474520612, new AccountSwitcherViewKt$$ExternalSyntheticLambda9(accountViewModel, 1, (byte) 0), gapComposer), null, radio, 0L, null, gapComposer2, 12582966, 0, 3440);
                function13 = function1;
                settingVisibility4 = settingVisibility4;
                gapComposer = gapComposer2;
                companion = companion;
                z = z2;
                settingVisibility2 = settingVisibility2;
                settingVisibility3 = settingVisibility3;
            }
            SettingVisibility settingVisibility5 = settingVisibility2;
            SettingVisibility settingVisibility6 = settingVisibility3;
            SettingVisibility settingVisibility7 = settingVisibility4;
            final int i5 = 0;
            gapComposer.end(false);
            SettingVisibility settingVisibility8 = SettingVisibility.HIDDEN;
            if (settingVisibility7 != settingVisibility8) {
                gapComposer.startReplaceGroup(454200628);
                Icons icons = Icons.Add24;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.background.standard;
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                boolean z3 = settingVisibility7 != SettingVisibility.DISABLED;
                ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(1916288977, new Function2() { // from class: com.squareup.cash.account.components.accountswitcher.AccountSwitcherViewKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        int i6 = i5;
                        AccountSwitcherViewModel.Loaded loaded2 = loaded;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj5;
                                int intValue = ((Integer) obj6).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.createBusinessAccountConfig.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.createBusinessAccountConfig.body, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                boolean z4 = (i4 & 112) == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z4 || rememberedValue2 == obj) {
                    rememberedValue2 = new AccountToDoKt$$ExternalSyntheticLambda0(21, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                final int i6 = 1;
                GapComposer gapComposer3 = gapComposer;
                obj2 = obj;
                settingVisibility = settingVisibility8;
                boolean z5 = z3;
                i3 = -1762997026;
                CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, j, rememberComposableLambda3, null, 0L, (Function0) rememberedValue2, null, z5, false, Expect_jvmKt.rememberComposableLambda(1569812477, new Function2() { // from class: com.squareup.cash.account.components.accountswitcher.AccountSwitcherViewKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        int i62 = i6;
                        AccountSwitcherViewModel.Loaded loaded2 = loaded;
                        switch (i62) {
                            case 0:
                                Composer composer2 = (Composer) obj5;
                                int intValue = ((Integer) obj6).intValue();
                                GapComposer gapComposer32 = (GapComposer) composer2;
                                if (gapComposer32.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.createBusinessAccountConfig.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer32.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.createBusinessAccountConfig.body, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), null, push, 0L, null, gapComposer3, 3126, 390, 27312);
                gapComposer = gapComposer3;
                gapComposer.end(false);
            } else {
                settingVisibility = settingVisibility8;
                i3 = -1762997026;
                obj2 = obj;
                gapComposer.startReplaceGroup(454695729);
                gapComposer.end(false);
            }
            if (settingVisibility6 != settingVisibility) {
                gapComposer.startReplaceGroup(454779026);
                Icons icons2 = Icons.Add24;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, i3, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j2 = colors2.semantic.background.standard;
                CellDefaultAccessory.Push push2 = CellDefaultAccessory.Push.INSTANCE;
                boolean z6 = settingVisibility6 != SettingVisibility.DISABLED;
                boolean z7 = (i4 & 112) == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z7) {
                    obj4 = obj2;
                } else {
                    obj4 = obj2;
                    if (rememberedValue3 != obj4) {
                        GapComposer gapComposer4 = gapComposer;
                        obj3 = obj4;
                        CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons2, null, j2, ComposableSingletons$AccountSwitcherViewKt.lambda$591413306, null, 0L, (Function0) rememberedValue3, null, z6, false, ComposableSingletons$AccountSwitcherViewKt.f113lambda$1660021402, null, push2, 0L, null, gapComposer4, 3126, 390, 27312);
                        gapComposer = gapComposer4;
                        gapComposer.end(false);
                    }
                }
                rememberedValue3 = new AccountToDoKt$$ExternalSyntheticLambda0(22, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
                GapComposer gapComposer42 = gapComposer;
                obj3 = obj4;
                CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons2, null, j2, ComposableSingletons$AccountSwitcherViewKt.lambda$591413306, null, 0L, (Function0) rememberedValue3, null, z6, false, ComposableSingletons$AccountSwitcherViewKt.f113lambda$1660021402, null, push2, 0L, null, gapComposer42, 3126, 390, 27312);
                gapComposer = gapComposer42;
                gapComposer.end(false);
            } else {
                obj3 = obj2;
                gapComposer.startReplaceGroup(455306801);
                gapComposer.end(false);
            }
            if (settingVisibility5 != settingVisibility) {
                gapComposer.startReplaceGroup(455376892);
                Icons icons3 = Icons.Add24;
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, i3, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j3 = colors3.semantic.background.standard;
                CellDefaultAccessory.Push push3 = CellDefaultAccessory.Push.INSTANCE;
                boolean z8 = settingVisibility5 != SettingVisibility.DISABLED;
                boolean z9 = (i4 & 112) == 32;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z9 || rememberedValue4 == obj3) {
                    rememberedValue4 = new AccountToDoKt$$ExternalSyntheticLambda0(23, function1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                GapComposer gapComposer5 = gapComposer;
                function12 = function1;
                CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons3, null, j3, ComposableSingletons$AccountSwitcherViewKt.f114lambda$1680054439, null, 0L, (Function0) rememberedValue4, null, z8, true, null, null, push3, 0L, null, gapComposer5, 805309494, MLKEMEngine.KyberPolyBytes, 27824);
                gapComposer = gapComposer5;
                gapComposer.end(false);
            } else {
                function12 = function1;
                gapComposer.startReplaceGroup(455833553);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            function12 = function13;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(loaded, function12, i, 3);
        }
    }

    public static final void AccountsLoadingFailedViewContent(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1306181165);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1564610264, new SwipeToDismissKt$$ExternalSyntheticLambda4(11, function1), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 2, false);
        }
    }

    public static final void AddAccountOptions(AddAccountOptionsViewModel addAccountOptionsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-708258642);
        int i2 = i | (gapComposer.changedInstance(addAccountOptionsViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, 1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Transformations.SheetHeader(Room.stringResource(gapComposer, R.string.account_linking_add_account_title), (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            if (addAccountOptionsViewModel instanceof AddAccountOptionsViewModel.Loading) {
                gapComposer.startReplaceGroup(-957383344);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                TransactorKt.LoadingPlaceholder(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 32.0f, 1), LoadingIndicatorPosition.CENTER, gapComposer, 48, 0);
                gapComposer.end(false);
            } else {
                if (!(addAccountOptionsViewModel instanceof AddAccountOptionsViewModel.Loaded)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -957385422, false);
                }
                gapComposer.startReplaceGroup(-957376469);
                AddAccountOptionsLoaded((AddAccountOptionsViewModel.Loaded) addAccountOptionsViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) addAccountOptionsViewModel, function1, (Object) modifier2, i, 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static final void AddAccountOptionsLoaded(AddAccountOptionsViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        final RowDetails rowDetails;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1601557121);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? (gapComposer2.changedInstance(loaded) ? 4 : 2) | i : i;
        int i4 = 32;
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i3;
        final boolean z = 0;
        final int i6 = 1;
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
            GapComposer gapComposer3 = gapComposer2;
            for (AddAccountOptionsViewModel.Loaded.AccountOption accountOption : loaded.accountOptions) {
                int ordinal = accountOption.optionType.ordinal();
                if (ordinal == 0) {
                    rowDetails = new RowDetails(R.string.account_linking_create_personal_account_title, R.string.account_linking_create_personal_account_description, Icons.Avatar24);
                } else if (ordinal == i6) {
                    rowDetails = new RowDetails(R.string.account_linking_create_business_account_title, R.string.account_linking_create_business_account_description, Icons.BusinessInformative24);
                } else {
                    if (ordinal != i2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    rowDetails = new RowDetails(R.string.account_linking_existing_account_title, R.string.account_linking_existing_account_description, Icons.BankLinked24);
                }
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, z);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(z);
                }
                long j = colors.semantic.background.standard;
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                boolean z2 = accountOption.isEnabled;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1864680431, new Function2() { // from class: com.squareup.cash.account.components.accountswitcher.AddAccountOptionsViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = z;
                        RowDetails rowDetails2 = rowDetails;
                        switch (i7) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer2;
                                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, rowDetails2.title), (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer3;
                                if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer5, rowDetails2.body), (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer3);
                int i7 = ((i5 & 112) == i4 ? i6 : z) | (gapComposer3.changedInstance(accountOption) ? 1 : 0);
                Object rememberedValue = gapComposer3.rememberedValue();
                if (i7 != 0 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(6, function1, accountOption);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                GapComposer gapComposer4 = gapComposer3;
                CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(rowDetails.icon, null, j, rememberComposableLambda, null, 0L, (Function0) rememberedValue, null, z2, false, Expect_jvmKt.rememberComposableLambda(2023025179, new Function2() { // from class: com.squareup.cash.account.components.accountswitcher.AddAccountOptionsViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i72 = i6;
                        RowDetails rowDetails2 = rowDetails;
                        switch (i72) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer42 = (GapComposer) composer2;
                                if (gapComposer42.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer42, rowDetails2.title), (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer42.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer3;
                                if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer5, rowDetails2.body), (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer3), null, push, 0L, null, gapComposer4, 3120, 390, 27312);
                gapComposer3 = gapComposer4;
                i2 = i2;
                i6 = i6;
                i4 = i4;
                z = z;
            }
            gapComposer = gapComposer3;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(loaded, function1, i, 4);
        }
    }

    /* renamed from: BadgeTitle-U-6WRak, reason: not valid java name */
    public static final void m2971BadgeTitleU6WRak(final Modifier modifier, final String str, final boolean z, final long j, final TextStyle textStyle, final int i, final long j2, final long j3, Composer composer, final int i2) {
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1945017156);
        int i3 = i2 | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(textStyle) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(i) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(j2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            gapComposer.startDefaults();
            if ((i2 & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            builder.append(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (z) {
                gapComposer.startReplaceGroup(-601770021);
                KeyMappingKt.appendInlineContent(builder, "badge", "�");
                linkedHashMap.put("badge", new InlineTextContent(new Placeholder(7, Room.pack(4294967296L, TextUnit.m1059getValueimpl(j3) + TextUnit.m1059getValueimpl(j2)), Room.pack(4294967296L, TextUnit.m1059getValueimpl(j2) + 1.0f)), Expect_jvmKt.rememberComposableLambda(-507168189, new MyInvestmentsTileKt$$ExternalSyntheticLambda6(j3, 1), gapComposer)));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-600898394);
                gapComposer.end(false);
            }
            Room.m1164Text25TpFw(0, 0, 0, i, ((i3 << 9) & 234881024) | ((i3 >> 6) & 896) | 3120, 0, 1776, j, (Composer) gapComposer, modifier, builder.toAnnotatedString(), textStyle, (TextLineBalancing) null, (Map) linkedHashMap, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(str, z, j, textStyle, i, j2, j3, i2) { // from class: com.squareup.cash.account.components.accountswitcher.BadgeTitleKt$$ExternalSyntheticLambda1
                public final /* synthetic */ String f$1;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ long f$3;
                public final /* synthetic */ TextStyle f$4;
                public final /* synthetic */ int f$5;
                public final /* synthetic */ long f$6;
                public final /* synthetic */ long f$7;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(12585991);
                    BadgeTitleKt.m2971BadgeTitleU6WRak(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void IconHeaderView(Modifier modifier, String str, String str2, MooncakeLargeIcon.Icon icon, Composer composer, int i) {
        Modifier modifier2;
        str.getClass();
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-417728385);
        int i2 = i | 6 | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
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
            KeypadKt.MooncakeLargeIcon(icon, null, gapComposer, 6, 2);
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, ((i2 >> 3) & 14) | 48, 0, 4080, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), MooncakeTheme.getTypography(gapComposer).header3, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, ((i2 >> 6) & 14) | 48, 0, 4080, MooncakeTheme.getColors(gapComposer).secondaryLabel, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), MooncakeTheme.getTypography(gapComposer).smallBody, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(modifier2, i, str, str2, icon, 10);
        }
    }

    public static final void SwitchAccountLoadingContent(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1512213057);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, f111lambda$1271007732, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorActivityItemKt$$ExternalSyntheticLambda0(i, 10);
        }
    }

    public static final void SwitchFullAccountLoadingContent(AccountViewModel accountViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-542554164);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(accountViewModel) ? 4 : 2) | i;
        byte b = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            long j = Color.Black;
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = SwitchFullAccountLoadingViewKt$SwitchFullAccountLoadingContent$1$1.INSTANCE;
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(SuspendingPointerInputFilterKt.pointerInput(fillMaxSize, "switch-account-loading", (PointerInputEventHandler) rememberedValue), j, ColorKt.RectangleShape), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, f112lambda$872594931, gapComposer, 3072, 6);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1340815428, new AccountSwitcherViewKt$$ExternalSyntheticLambda9(accountViewModel, i2, b), gapComposer), gapComposer, 3072, 7);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AccountSwitcherViewKt$$ExternalSyntheticLambda9(accountViewModel, i);
        }
    }
}
