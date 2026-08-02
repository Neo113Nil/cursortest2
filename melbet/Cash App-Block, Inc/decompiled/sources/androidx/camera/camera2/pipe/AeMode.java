package androidx.camera.camera2.pipe;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletRetroOrderSelectionViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.TappableIcon;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.afterpayapplet.views.retro.OrderSelectionRetroSectionKt;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.cash.money.viewmodels.api.ViewModel;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda42;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class AeMode {
    public static final List values = CollectionsKt__CollectionsKt.listOf((Object[]) new AeMode[]{new AeMode(0), new AeMode(1), new AeMode(2), new AeMode(3), new AeMode(4), new AeMode(5), new AeMode(6)});
    public final int value;

    public abstract class Companion {
        public static final void ErrorAppletRetroOrderSelectionView(AfterpayAppletRetroOrderSelectionViewModel.Error error, Function1 function1, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(1744536419);
            int i2 = 4;
            int i3 = (gapComposer.changed(error) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                String str = error.titleText;
                String str2 = error.subtitleText;
                String str3 = error.buttonText;
                int i4 = i3 & 112;
                boolean z = i4 == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(3, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                boolean z2 = i4 == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(i2, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                AfterpaySearchViewKt.AfterpayAppletError(null, str, str2, str3, null, function0, (Function0) rememberedValue2, null, gapComposer, 6, 144);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(error, function1, i, 22);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [boolean, byte, int] */
        /* JADX WARN: Type inference failed for: r10v7 */
        public static final void LoadedAppletRetroOrderSelectionView(AfterpayAppletRetroOrderSelectionViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
            AfterpayAppletRetroOrderSelectionViewModel.Loaded loaded2;
            Function1 function12;
            GapComposer gapComposer;
            ?? r10;
            Function1 function13;
            ComposableLambdaImpl composableLambdaImpl;
            ComposableLambdaImpl composableLambdaImpl2;
            boolean z;
            boolean z2;
            GapComposer gapComposer2;
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startRestartGroup(-939264945);
            Applier applier = gapComposer3.applier;
            int i2 = i | (gapComposer3.changed(loaded) ? 4 : 2) | (gapComposer3.changedInstance(function1) ? 32 : 16);
            int i3 = 1;
            if (gapComposer3.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape));
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, systemBarsPadding);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer3.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                TappableIcon tappableIcon = loaded.headerIcon;
                int i4 = i2 & 112;
                boolean z3 = i4 == 32;
                Object rememberedValue = gapComposer3.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z3 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(i3, function1);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                int i5 = i2 & 14;
                boolean z4 = (i5 == 4) | (i4 == 32);
                Object rememberedValue2 = gapComposer3.rememberedValue();
                if (z4 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new BankingDialogKt$$ExternalSyntheticLambda5(6, (Object) loaded, function1);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                }
                AfterpaySearchViewKt.AppletTitleBar(null, null, tappableIcon, function0, (Function0) rememberedValue2, gapComposer3, 48, 1);
                GapComposer gapComposer4 = gapComposer3;
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion, 1.0f), ImageKt.rememberScrollState(gapComposer4), false, 14);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, 0);
                int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, verticalScroll$default);
                gapComposer4.startReusableNode();
                if (gapComposer4.inserting) {
                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer4.useNode();
                }
                Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer4, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                loaded2 = loaded;
                String str = loaded2.subtitle;
                if (str == null) {
                    gapComposer4.startReplaceGroup(-441554703);
                    r10 = 0;
                    gapComposer4.end(false);
                    function13 = function1;
                    composableLambdaImpl = null;
                } else {
                    r10 = 0;
                    gapComposer4.startReplaceGroup(-441554702);
                    function13 = function1;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2013803232, new PoolCreateViewKt$$ExternalSyntheticLambda6(str, function13, 5), gapComposer4);
                    gapComposer4.end(false);
                    composableLambdaImpl = rememberComposableLambda;
                }
                StackedAvatarViewModel.Single single = loaded2.stackedAvatar;
                if (single == null) {
                    gapComposer4.startReplaceGroup(-441395673);
                    gapComposer4.end(r10);
                    composableLambdaImpl2 = null;
                } else {
                    gapComposer4.startReplaceGroup(-441395672);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-550705983, new PaymentPlanSummaryKt$$ExternalSyntheticLambda42(single, 1, r10), gapComposer4);
                    gapComposer4.end(r10);
                    composableLambdaImpl2 = rememberComposableLambda2;
                }
                Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(346183674, new ButtonBinding$$ExternalSyntheticLambda2(loaded2, 11), gapComposer4), (Modifier) null, composableLambdaImpl2, composableLambdaImpl, gapComposer4, 6, 2);
                DBUtil.SpacerWithinSectionMedium(r10, 1, gapComposer4, null);
                OrderSelectionRetroSectionKt.OrderSelectionRetroSection(null, loaded2.orderSection, function13, gapComposer4, (i2 << 3) & 896);
                DBUtil.SpacerWithinSectionMedium(r10, 1, gapComposer4, null);
                String str2 = loaded2.bottomText;
                if (str2 == null) {
                    gapComposer4.startReplaceGroup(-441058796);
                    gapComposer4.end(r10);
                    z = true;
                    z2 = r10;
                    function12 = function13;
                    gapComposer2 = gapComposer4;
                } else {
                    gapComposer4.startReplaceGroup(-441058795);
                    TextStyle textStyle = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    function12 = function1;
                    z = true;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer4, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    GapComposer gapComposer5 = gapComposer4;
                    z2 = false;
                    gapComposer5.end(false);
                    gapComposer2 = gapComposer5;
                }
                gapComposer2.end(z);
                List list = loaded2.impressionEvent;
                boolean z5 = i5 == 4 ? z : z2;
                if (i4 == 32) {
                    z2 = z;
                }
                boolean z6 = z5 | z2;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (z6 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new SearchBarBinding$Content$1$1(loaded2, function12, null, 15);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer2, list, (Function2) rememberedValue3);
                gapComposer2.end(z);
                gapComposer = gapComposer2;
            } else {
                loaded2 = loaded;
                function12 = function1;
                GapComposer gapComposer6 = gapComposer3;
                gapComposer6.skipToGroupEnd();
                gapComposer = gapComposer6;
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(loaded2, function12, i, 23);
            }
        }

        public static final void LoadingAppletRetroOrderSelectionView(AfterpayAppletRetroOrderSelectionViewModel.Loading loading, Function1 function1, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-222880989);
            int i2 = (gapComposer.changedInstance(function1) ? 32 : 16) | i;
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(2, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                AfterpaySearchViewKt.AfterpayAppletLoading(null, null, null, (Function0) rememberedValue, null, gapComposer, 0, 23);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(loading, function1, i, 24);
            }
        }

        /* renamed from: fromIntOrNull-kQd0u18, reason: not valid java name */
        public static AeMode m40fromIntOrNullkQd0u18(int i) {
            Object obj;
            Iterator it = AeMode.values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((AeMode) obj).value == i) {
                    break;
                }
            }
            return (AeMode) obj;
        }

        public static final List viewModels(Section section) {
            section.getClass();
            Section.Header header = section.header();
            ViewModel.HeaderModel headerModel = header != null ? new ViewModel.HeaderModel(header, section.getId()) : null;
            ViewModel.ItemList itemList = new ViewModel.ItemList(section.items(), section.getLayout(), section.getId());
            return headerModel == null ? CollectionsKt__CollectionsJVMKt.listOf(itemList) : CollectionsKt__CollectionsKt.listOf((Object[]) new ViewModel[]{headerModel, itemList});
        }
    }

    public /* synthetic */ AeMode(int i) {
        this.value = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AeMode) {
            return this.value == ((AeMode) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AeMode(value=", this.value, ')');
    }
}
