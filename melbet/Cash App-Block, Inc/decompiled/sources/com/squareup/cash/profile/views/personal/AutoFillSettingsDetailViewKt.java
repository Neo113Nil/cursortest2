package com.squareup.cash.profile.views.personal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
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
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
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
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.settings.viewmodels.ArcadeAutofillSettingsDetailViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.DropdownState;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.SecurityLockView$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.scrubbing.USPhoneNumberVisualTransformer;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.autofill.viewmodels.InputViewModel;
import com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda14;
import com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda8;
import com.squareup.util.Strings;
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
public abstract class AutoFillSettingsDetailViewKt {
    static {
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel((String) null, "Alice", (InputViewModel.InputState) null, InputViewModel.InputType.FIRST_NAME, "First name", (String) null, 101));
        List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel((String) null, "Smith", (InputViewModel.InputState) null, InputViewModel.InputType.LAST_NAME, "Last name", (String) null, 101));
        List listOf3 = CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel((String) null, "123 Main Street", (InputViewModel.InputState) null, InputViewModel.InputType.ADDRESS1, "Address line 1", (String) null, 101));
        List listOf4 = CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel((String) null, "Apartment 3B", (InputViewModel.InputState) null, InputViewModel.InputType.ADDRESS2, "Address line 2", (String) null, 101));
        List listOf5 = CollectionsKt__CollectionsJVMKt.listOf(new InputViewModel.InputFieldViewModel((String) null, "San Francisco", (InputViewModel.InputState) null, InputViewModel.InputType.CITY, "City", (String) null, 101));
        InputViewModel.InputType inputType = InputViewModel.InputType.FIRST_NAME;
        CollectionsKt__CollectionsKt.listOf((Object[]) new List[]{listOf, listOf2, listOf3, listOf4, listOf5, CollectionsKt__CollectionsKt.listOf((Object[]) new InputViewModel[]{new InputViewModel.InputDropdownViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"AL", "AK", "AR"})), new InputViewModel.InputFieldViewModel((String) null, "12345", (InputViewModel.InputState) null, InputViewModel.InputType.POSTAL, "Zip", (String) null, 101)})}).getClass();
    }

    public static final void AutoFillSettingsDetail(ArcadeAutofillSettingsDetailViewModel arcadeAutofillSettingsDetailViewModel, Function1 function1, Composer composer, int i) {
        arcadeAutofillSettingsDetailViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(294683785);
        int i2 = (gapComposer.changedInstance(arcadeAutofillSettingsDetailViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(894567508, new SecurityLockView$$ExternalSyntheticLambda1(arcadeAutofillSettingsDetailViewModel, function1, (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController)), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AutoFillSettingsDetailView$$ExternalSyntheticLambda1(arcadeAutofillSettingsDetailViewModel, function1, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x03bc, code lost:
    
        if (r1 == r4) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BodyContent(Function1 function1, ArcadeAutofillSettingsDetailViewModel.Content content, Composer composer, int i) {
        String str;
        boolean z;
        Modifier.Companion companion;
        boolean z2;
        int i2;
        NeverEqualPolicy neverEqualPolicy;
        Modifier.Companion companion2;
        int i3;
        char c;
        InputState inputState;
        int i4;
        NeverEqualPolicy neverEqualPolicy2;
        NeverEqualPolicy neverEqualPolicy3;
        Modifier.Companion companion3;
        int i5;
        ArcadeAutofillSettingsDetailViewModel.Content content2;
        boolean z3;
        int i6;
        boolean z4;
        Function1 function12 = function1;
        ArcadeAutofillSettingsDetailViewModel.Content content3 = content;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-803121399);
        Applier applier = gapComposer.applier;
        int i7 = i | (gapComposer.changedInstance(function12) ? 4 : 2) | (gapComposer.changedInstance(content3) ? 32 : 16);
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 19) != 18)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion4);
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
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true), ImageKt.rememberScrollState(gapComposer), false, 14);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            String str2 = content3.title;
            String str3 = content3.footer;
            String str4 = content3.subTitle;
            NavigationType navigationType = NavigationType.BACK;
            int i8 = i7 & 14;
            boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController) | (i8 == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy4 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy4) {
                rememberedValue = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function12, 21);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(str2, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
            gapComposer = gapComposer;
            if (str4 != null) {
                gapComposer.startReplaceGroup(332645137);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.text.subtle;
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                str = str3;
                companion = companion4;
                z2 = true;
                z = false;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion4, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
                i2 = i8;
                neverEqualPolicy = neverEqualPolicy4;
            } else {
                str = str3;
                z = false;
                companion = companion4;
                z2 = true;
                gapComposer.startReplaceGroup(332989609);
                CellDefaultAccessory.Toggle toggle = new CellDefaultAccessory.Toggle(content.autofillEnabled);
                ComposableLambdaImpl composableLambdaImpl = RatePlanSectionKt.lambda$1603817899;
                boolean z5 = i8 == 4;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z5 || rememberedValue2 == neverEqualPolicy4) {
                    rememberedValue2 = new PersonalInfoView$$ExternalSyntheticLambda0(15, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                i2 = i8;
                neverEqualPolicy = neverEqualPolicy4;
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(composableLambdaImpl, null, (Function0) rememberedValue2, false, false, RatePlanSectionKt.lambda$1078450993, null, 0L, toggle, null, gapComposer, 1572870, 1466);
                gapComposer = gapComposer;
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(842041383);
            ArcadeAutofillSettingsDetailViewModel.Content content4 = content;
            boolean z6 = z2;
            for (List<InputViewModel> list : content4.inputFields) {
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                int i9 = 3;
                char c2 = 0;
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, z6, new Drop$$ExternalSyntheticBUOutline0(3));
                Modifier.Companion companion5 = companion;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion5, 1.0f);
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                int i10 = 2;
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, Alignment.Companion.Top, gapComposer, z ? 1 : 0);
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
                gapComposer.startReplaceGroup(-27532679);
                ?? r2 = z6;
                for (InputViewModel inputViewModel : list) {
                    boolean z7 = inputViewModel instanceof InputViewModel.InputDropdownViewModel;
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (z7) {
                        gapComposer.startReplaceGroup(1334136707);
                        Modifier weight = rowScopeInstance.weight(1.0f, companion5, r2);
                        DropdownState rememberDropdownState = InputChipKt.rememberDropdownState(gapComposer);
                        InputViewModel.InputDropdownViewModel inputDropdownViewModel = (InputViewModel.InputDropdownViewModel) inputViewModel;
                        String str5 = inputDropdownViewModel.value;
                        if (str5 == null) {
                            str5 = "";
                        }
                        InputViewModel.InputState inputState2 = inputDropdownViewModel.state;
                        boolean z8 = inputState2 != InputViewModel.InputState.DISABLED ? r2 : z;
                        if (inputState2 == InputViewModel.InputState.ERROR) {
                            i6 = i9;
                            z4 = r2;
                        } else {
                            i6 = i9;
                            z4 = z;
                        }
                        companion3 = companion5;
                        i3 = i6;
                        c = 0;
                        InputChipKt.InputDropdown(rememberDropdownState, str5, weight, z8, z4, Expect_jvmKt.rememberComposableLambda(1702548314, new EditAutofillViewKt$$ExternalSyntheticLambda8(inputDropdownViewModel, r2), gapComposer), inputDropdownViewModel.placeholder, Expect_jvmKt.rememberComposableLambda(1007169372, new EditAutofillViewKt$$ExternalSyntheticLambda8(inputDropdownViewModel, i10), gapComposer), Expect_jvmKt.rememberComposableLambda(-1022075644, new EditAutofillViewKt$$ExternalSyntheticLambda10(inputDropdownViewModel, function1, r2), gapComposer), gapComposer, 113442816, 0);
                        gapComposer.end(z);
                        z3 = z;
                        neverEqualPolicy3 = neverEqualPolicy;
                        i5 = 2;
                        content2 = content;
                    } else {
                        i3 = i9;
                        c = c2;
                        Modifier.Companion companion6 = companion5;
                        if (!(inputViewModel instanceof InputViewModel.InputFieldViewModel)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -926795426, z);
                        }
                        gapComposer.startReplaceGroup(1335082083);
                        InputViewModel.InputFieldViewModel inputFieldViewModel = (InputViewModel.InputFieldViewModel) inputViewModel;
                        InputViewModel.InputState inputState3 = inputFieldViewModel.state;
                        Icons icons = inputState3 == InputViewModel.InputState.ERROR ? Icons.AlertFill24 : null;
                        Modifier weight2 = rowScopeInstance.weight(1.0f, companion6, r2);
                        String str6 = inputFieldViewModel.value;
                        if (str6 == null) {
                            str6 = "";
                        }
                        int ordinal = inputState3.ordinal();
                        if (ordinal == 0) {
                            inputState = InputState.DEFAULT;
                        } else if (ordinal == r2) {
                            inputState = InputState.ERROR;
                        } else {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            inputState = InputState.DISABLED;
                        }
                        String str7 = inputFieldViewModel.placeholder;
                        KeyboardOptions keyboardOptions = KeyboardOptions.Default;
                        int ordinal2 = inputFieldViewModel.keyboardType.ordinal();
                        if (ordinal2 == 0) {
                            i4 = r2;
                        } else {
                            if (ordinal2 != r2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            i4 = i3;
                        }
                        KeyboardOptions m359copyINvB4aQ$default = KeyboardOptions.m359copyINvB4aQ$default(i4, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                        VisualTransformation uSPhoneNumberVisualTransformer = inputFieldViewModel.f1203type == InputViewModel.InputType.PHONE ? new USPhoneNumberVisualTransformer() : VisualTransformation.Companion.None;
                        int i11 = i2;
                        boolean changedInstance = gapComposer.changedInstance(inputViewModel) | (i11 == 4 ? r2 : false);
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (changedInstance) {
                            neverEqualPolicy2 = neverEqualPolicy;
                        } else {
                            neverEqualPolicy2 = neverEqualPolicy;
                        }
                        rememberedValue3 = new EditAutofillViewKt$$ExternalSyntheticLambda11(inputFieldViewModel, function1, r2);
                        gapComposer.updateRememberedValue(rememberedValue3);
                        i2 = i11;
                        neverEqualPolicy3 = neverEqualPolicy2;
                        companion3 = companion6;
                        i5 = 2;
                        GapComposer gapComposer2 = gapComposer;
                        content2 = content;
                        InputFieldKt.InputField(str6, (Function1) rememberedValue3, weight2, inputState, Expect_jvmKt.rememberComposableLambda(568729243, new EditAutofillViewKt$$ExternalSyntheticLambda12(inputFieldViewModel, r2), gapComposer), (Function2) null, Expect_jvmKt.rememberComposableLambda(1377581657, new InfoSectionKt$$ExternalSyntheticLambda6(icons, 24), gapComposer), Expect_jvmKt.rememberComposableLambda(-1475688560, new EditAutofillViewKt$$ExternalSyntheticLambda14(inputFieldViewModel, 1), gapComposer), str7, m359copyINvB4aQ$default, (KeyboardActions) null, uSPhoneNumberVisualTransformer, gapComposer2, 14180352, 0, 1056);
                        gapComposer = gapComposer2;
                        z3 = false;
                        gapComposer.end(false);
                    }
                    content4 = content2;
                    z = z3;
                    i9 = i3;
                    neverEqualPolicy = neverEqualPolicy3;
                    i10 = i5;
                    c2 = c;
                    companion5 = companion3;
                    r2 = 1;
                }
                boolean z9 = z;
                companion = companion5;
                gapComposer.end(z9);
                gapComposer.end(true);
                DBUtil.SpacerWithinSectionMedium(z9 ? 1 : 0, 1, gapComposer, null);
                z6 = true;
                z = z9 ? 1 : 0;
            }
            function12 = function1;
            boolean z10 = z ? 1 : 0;
            content3 = content4;
            gapComposer.end(z10);
            if (str != null) {
                gapComposer.startReplaceGroup(336590228);
                TextStyle textStyle2 = Strings.getTypography(gapComposer).bodyXSmall;
                long j2 = Strings.getColors(gapComposer).semantic.text.subtle;
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Strings.getSizes(gapComposer).getClass();
                Strings.getSizes(gapComposer).getClass();
                Modifier.Companion companion7 = companion;
                companion2 = companion7;
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j2, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion7, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, 2), textStyle2, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                companion2 = companion;
                gapComposer.startReplaceGroup(337014277);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion2, 1.0f), true, ButtonCtaGroupOrientation.VERTICAL, null, Expect_jvmKt.rememberComposableLambda(-2077781359, new ShareSheetViewKt$$ExternalSyntheticLambda1(6, (Object) content3, (Object) function12), gapComposer), gapComposer, 25014, 8);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda0(i, 25, content3, function12);
        }
    }
}
