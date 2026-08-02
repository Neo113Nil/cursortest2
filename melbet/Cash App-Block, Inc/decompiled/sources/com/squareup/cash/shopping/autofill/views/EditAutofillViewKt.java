package com.squareup.cash.shopping.autofill.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.input.DropdownState;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.scrubbing.USPhoneNumberVisualTransformer;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.autofill.viewmodels.EditAutofillViewModel;
import com.squareup.cash.shopping.autofill.viewmodels.InputViewModel;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public abstract class EditAutofillViewKt {
    static {
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel((String) null, "Alice", (InputViewModel.InputState) null, InputViewModel.InputType.FIRST_NAME, "First name", (String) null, 101));
        List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel((String) null, "Smith", (InputViewModel.InputState) null, InputViewModel.InputType.LAST_NAME, "Last name", (String) null, 101));
        List listOf3 = CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel((String) null, "123 Main Street", (InputViewModel.InputState) null, InputViewModel.InputType.ADDRESS1, "Address line 1", (String) null, 101));
        List listOf4 = CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel((String) null, "Apartment 3B", (InputViewModel.InputState) null, InputViewModel.InputType.ADDRESS2, "Address line 2", (String) null, 101));
        List listOf5 = CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel((String) null, "San Francisco", (InputViewModel.InputState) null, InputViewModel.InputType.CITY, "City", (String) null, 101));
        InputViewModel.InputType inputType = InputViewModel.InputType.FIRST_NAME;
        CollectionsKt__CollectionsKt.listOf((Object[]) new List[]{listOf, listOf2, listOf3, listOf4, listOf5, CollectionsKt__CollectionsKt.listOf((Object[]) new InputViewModel[]{new InputViewModel.InputDropdownViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"AL", "AK", "AR"})), new InputViewModel.InputFieldViewModel((String) null, "12345", (InputViewModel.InputState) null, InputViewModel.InputType.POSTAL, "Zip", (String) null, 101)})}).getClass();
    }

    public static final void BodyContent(Function1 function1, EditAutofillViewModel.Content content, Composer composer, int i) {
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        int i2;
        InputState inputState;
        int i3;
        Modifier.Companion companion;
        NeverEqualPolicy neverEqualPolicy;
        char c;
        Function1 function12 = function1;
        EditAutofillViewModel.Content content2 = content;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1056321352);
        Applier applier = gapComposer.applier;
        int i4 = i | (gapComposer.changedInstance(function12) ? 4 : 2) | (gapComposer.changedInstance(content2) ? 32 : 16);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            NavigationType navigationType = NavigationType.CLOSE;
            int i5 = i4 & 14;
            boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController) | (i5 == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy2) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
                rememberedValue = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function12, 23);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
            int i6 = i5;
            boolean z = true;
            DBUtil.TitleBarSub("", navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            gapComposer = gapComposer;
            float f = 1.0f;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$16);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$15);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader(content2.title, (Modifier) null, (Function2) null, content2.subTitle, gapComposer, 0, 6);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(1824263632);
            for (List<InputViewModel> list : content2.inputFields) {
                int i7 = 3;
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, z, new Drop$$ExternalSyntheticBUOutline0(3));
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, f);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                char c2 = 2;
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, Alignment.Companion.Top, gapComposer, 6);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                gapComposer.startReplaceGroup(1386544687);
                for (InputViewModel inputViewModel : list) {
                    boolean z2 = inputViewModel instanceof InputViewModel.InputDropdownViewModel;
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (z2) {
                        gapComposer.startReplaceGroup(-161920717);
                        Modifier weight = rowScopeInstance.weight(f, companion2, z);
                        DropdownState rememberDropdownState = InputChipKt.rememberDropdownState(gapComposer);
                        InputViewModel.InputDropdownViewModel inputDropdownViewModel = (InputViewModel.InputDropdownViewModel) inputViewModel;
                        String str = inputDropdownViewModel.value;
                        String str2 = str != null ? str : "";
                        InputViewModel.InputState inputState2 = inputDropdownViewModel.state;
                        int i8 = 0;
                        i2 = 3;
                        InputChipKt.InputDropdown(rememberDropdownState, str2, weight, inputState2 != InputViewModel.InputState.DISABLED ? z : false, inputState2 == InputViewModel.InputState.ERROR ? z : false, Expect_jvmKt.rememberComposableLambda(1938883911, new EditAutofillViewKt$$ExternalSyntheticLambda8(inputDropdownViewModel, i8), gapComposer), inputDropdownViewModel.placeholder, Expect_jvmKt.rememberComposableLambda(-1731870971, new EditAutofillViewKt$$ExternalSyntheticLambda8(inputDropdownViewModel, i7), gapComposer), Expect_jvmKt.rememberComposableLambda(801641565, new EditAutofillViewKt$$ExternalSyntheticLambda10(inputDropdownViewModel, function12, i8), gapComposer), gapComposer, 113442816, 0);
                        gapComposer.end(false);
                        companion = companion2;
                        neverEqualPolicy = neverEqualPolicy2;
                        c = 2;
                        function12 = function1;
                    } else {
                        i2 = i7;
                        float f2 = f;
                        Modifier.Companion companion3 = companion2;
                        int i9 = 0;
                        if (!(inputViewModel instanceof InputViewModel.InputFieldViewModel)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -5223998, false);
                        }
                        gapComposer.startReplaceGroup(-160966072);
                        InputViewModel.InputFieldViewModel inputFieldViewModel = (InputViewModel.InputFieldViewModel) inputViewModel;
                        InputViewModel.InputState inputState3 = inputFieldViewModel.state;
                        Icons icons = inputState3 == InputViewModel.InputState.ERROR ? Icons.AlertFill24 : null;
                        Modifier weight2 = rowScopeInstance.weight(f2, companion3, true);
                        String str3 = inputFieldViewModel.value;
                        String str4 = str3 != null ? str3 : "";
                        int ordinal = inputState3.ordinal();
                        if (ordinal == 0) {
                            inputState = InputState.DEFAULT;
                        } else if (ordinal == 1) {
                            inputState = InputState.ERROR;
                        } else {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            inputState = InputState.DISABLED;
                        }
                        String str5 = inputFieldViewModel.placeholder;
                        KeyboardOptions keyboardOptions = KeyboardOptions.Default;
                        int ordinal2 = inputFieldViewModel.keyboardType.ordinal();
                        if (ordinal2 == 0) {
                            i3 = 1;
                        } else {
                            if (ordinal2 != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            i3 = i2;
                        }
                        KeyboardOptions m359copyINvB4aQ$default = KeyboardOptions.m359copyINvB4aQ$default(i3, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                        VisualTransformation uSPhoneNumberVisualTransformer = inputFieldViewModel.f1203type == InputViewModel.InputType.PHONE ? new USPhoneNumberVisualTransformer() : VisualTransformation.Companion.None;
                        int i10 = i6;
                        boolean changedInstance = gapComposer.changedInstance(inputViewModel) | (i10 == 4);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue2 == neverEqualPolicy2) {
                            rememberedValue2 = new EditAutofillViewKt$$ExternalSyntheticLambda11(inputFieldViewModel, function1, 0);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        companion = companion3;
                        i6 = i10;
                        neverEqualPolicy = neverEqualPolicy2;
                        GapComposer gapComposer2 = gapComposer;
                        c = 2;
                        function12 = function1;
                        InputFieldKt.InputField(str4, (Function1) rememberedValue2, weight2, inputState, Expect_jvmKt.rememberComposableLambda(337960166, new EditAutofillViewKt$$ExternalSyntheticLambda12(inputFieldViewModel, i9), gapComposer), (Function2) null, Expect_jvmKt.rememberComposableLambda(-2135755928, new InfoSectionKt$$ExternalSyntheticLambda6(icons, 27), gapComposer), Expect_jvmKt.rememberComposableLambda(693197905, new EditAutofillViewKt$$ExternalSyntheticLambda14(inputFieldViewModel, 0), gapComposer), str5, m359copyINvB4aQ$default, (KeyboardActions) null, uSPhoneNumberVisualTransformer, gapComposer2, 14180352, 0, 1056);
                        gapComposer = gapComposer2;
                        gapComposer.end(false);
                    }
                    neverEqualPolicy2 = neverEqualPolicy;
                    i7 = i2;
                    companion2 = companion;
                    c2 = c;
                    z = true;
                    f = 1.0f;
                }
                gapComposer.end(false);
                gapComposer.end(true);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                z = true;
                companion2 = companion2;
                f = 1.0f;
            }
            Modifier.Companion companion4 = companion2;
            gapComposer.end(false);
            content2 = content;
            String str6 = content2.footer;
            TextStyle textStyle = Strings.getTypography(gapComposer).bodyXSmall;
            long j = Strings.getColors(gapComposer).semantic.text.subtle;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion4, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, 2), textStyle, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion4, 1.0f), true, null, null, Expect_jvmKt.rememberComposableLambda(-984548304, new ShareSheetViewKt$$ExternalSyntheticLambda1(25, (Object) content2, (Object) function12), gapComposer), gapComposer, 24630, 12);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda0(function12, content2, i, 24);
        }
    }

    public static final void EditAutofill(EditAutofillViewModel editAutofillViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        editAutofillViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2066330616);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(editAutofillViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1460694045, new BasicShieetScope$$ExternalSyntheticLambda1(11, editAutofillViewModel, function1, (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController)), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(editAutofillViewModel, function1, i, 8);
        }
    }
}
