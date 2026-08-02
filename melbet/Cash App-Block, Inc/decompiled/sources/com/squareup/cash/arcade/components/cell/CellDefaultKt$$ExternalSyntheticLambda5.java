package com.squareup.cash.arcade.components.cell;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyImpl;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.input.DropdownState;
import com.squareup.cash.arcade.components.input.InputDropdownKt$$ExternalSyntheticLambda6;
import com.squareup.cash.arcade.components.input.InputFieldKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.components.internal.InputColors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class CellDefaultKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Object f$10;
    public final /* synthetic */ boolean f$11;
    public final /* synthetic */ Function2 f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ ComposableLambdaImpl f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ Function2 f$9;

    public /* synthetic */ CellDefaultKt$$ExternalSyntheticLambda5(Modifier modifier, long j, Function2 function2, Function0 function0, String str, boolean z, CellDefaultAccessory cellDefaultAccessory, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, ComposableLambdaImpl composableLambdaImpl4, boolean z2) {
        this.f$0 = modifier;
        this.f$1 = j;
        this.f$2 = function2;
        this.f$3 = function0;
        this.f$4 = str;
        this.f$5 = z;
        this.f$6 = cellDefaultAccessory;
        this.f$7 = composableLambdaImpl;
        this.f$8 = composableLambdaImpl2;
        this.f$9 = composableLambdaImpl3;
        this.f$10 = composableLambdaImpl4;
        this.f$11 = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ComposableLambdaImpl composableLambdaImpl;
        Modifier m182clickableO2vRcR0$default;
        int i = this.$r8$classId;
        int i2 = 15;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$10;
        Object obj4 = this.f$8;
        Function2 function2 = this.f$2;
        boolean z = this.f$11;
        Object obj5 = this.f$6;
        Object obj6 = this.f$3;
        Modifier modifier = this.f$0;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj6;
                CellDefaultAccessory cellDefaultAccessory = (CellDefaultAccessory) obj5;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj4;
                ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) this.f$9;
                ComposableLambdaImpl composableLambdaImpl4 = (ComposableLambdaImpl) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m276defaultMinSizeVpY3zN4$default(ImageKt.m177backgroundbw27NRU(modifier, this.f$1, ColorKt.RectangleShape), RecyclerView.DECELERATION_RATE, function2 != null ? 76.0f : 58.0f, 1), 1.0f);
                    CellDefaultAccessory.AccessoryConfig config = cellDefaultAccessory.getConfig();
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                    RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 15);
                    Role role = config.role;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (role != null && role.value == 0) {
                        m182clickableO2vRcR0$default = SemanticsModifierKt.semantics(companion, true, new NavBarBinding$$ExternalSyntheticLambda2(6));
                        composableLambdaImpl = composableLambdaImpl3;
                    } else {
                        boolean z2 = this.f$5;
                        if (function0 == null || !config.toggleable) {
                            composableLambdaImpl = composableLambdaImpl3;
                            m182clickableO2vRcR0$default = function0 != null ? ImageKt.m182clickableO2vRcR0$default(companion, mutableInteractionSourceImpl, m3400rippleYJYuY3k, z2, this.f$4, null, function0, 16) : SemanticsModifierKt.semantics(companion, true, new NavBarBinding$$ExternalSyntheticLambda2(7));
                        } else {
                            composableLambdaImpl = composableLambdaImpl3;
                            m182clickableO2vRcR0$default = SelectableKt.m336toggleableO2vRcR0(companion, config.toggleableValue, mutableInteractionSourceImpl, m3400rippleYJYuY3k, z2, role, new LocalMapKt$$ExternalSyntheticLambda10(15, function0));
                        }
                    }
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth.then(m182clickableO2vRcR0$default), ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, 16.0f);
                    List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Function2[]{this.f$7, composableLambdaImpl2, composableLambdaImpl, composableLambdaImpl4});
                    boolean changed = gapComposer.changed(z) | gapComposer.changed(cellDefaultAccessory);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CellActivityKt$CellActivity$2$1(z, cellDefaultAccessory);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue2;
                    ComposableLambdaImpl combineAsVirtualLayouts = RulerKt.combineAsVirtualLayouts(listOf);
                    boolean changed2 = gapComposer.changed(multiContentMeasurePolicy);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new MultiContentMeasurePolicyImpl(multiContentMeasurePolicy);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
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
                    Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, combineAsVirtualLayouts, gapComposer, true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) obj6;
                DropdownState dropdownState = (DropdownState) obj5;
                InputColors inputColors = (InputColors) obj4;
                String str = (String) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer2, 6);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, modifier);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    String stringResource = Room.stringResource(gapComposer2, R.string.click_dropdown);
                    Role role2 = new Role(6);
                    boolean changed3 = gapComposer2.changed(dropdownState);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new InputDropdownKt$$ExternalSyntheticLambda6(dropdownState, 0);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    OffsetKt.BoxWithConstraints(ImageKt.m181clickableO2vRcR0(Modifier.Companion.$$INSTANCE, mutableInteractionSourceImpl2, null, this.f$5, stringResource, role2, (Function0) rememberedValue4), null, false, Expect_jvmKt.rememberComposableLambda(-323713621, new InputFieldKt$$ExternalSyntheticLambda8(this.f$4, inputColors, this.f$1, mutableInteractionSourceImpl2, this.f$9, str, dropdownState, this.f$7), gapComposer2), gapComposer2, 3072, 6);
                    if (!z || function2 == null) {
                        gapComposer2.startReplaceGroup(-1559107891);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1559343336);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(colors.component.input.helper.text.error, staticProvidableCompositionLocal), ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).helpText)}, Expect_jvmKt.rememberComposableLambda(-562817552, new ToastKt$$ExternalSyntheticLambda11(i2, function2), gapComposer2), gapComposer2, 56);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CellDefaultKt$$ExternalSyntheticLambda5(Modifier modifier, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, DropdownState dropdownState, boolean z2, Function2 function2, String str, InputColors inputColors, long j, Function2 function22, String str2, ComposableLambdaImpl composableLambdaImpl) {
        this.f$0 = modifier;
        this.f$3 = mutableInteractionSourceImpl;
        this.f$5 = z;
        this.f$6 = dropdownState;
        this.f$11 = z2;
        this.f$2 = function2;
        this.f$4 = str;
        this.f$8 = inputColors;
        this.f$1 = j;
        this.f$9 = function22;
        this.f$10 = str2;
        this.f$7 = composableLambdaImpl;
    }
}
