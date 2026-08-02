package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class DatePickerKt$Year$2 implements Function2 {
    public final /* synthetic */ Object $colors;
    public final /* synthetic */ boolean $currentYear;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ Object $text;

    public DatePickerKt$Year$2(String str, DatePickerColors datePickerColors, boolean z, boolean z2) {
        this.$text = str;
        this.$colors = datePickerColors;
        this.$currentYear = z;
        this.$selected = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.$colors;
        Object obj4 = this.$text;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    String str = (String) obj4;
                    DatePickerColors datePickerColors = (DatePickerColors) obj3;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                    }
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2(24);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue);
                    datePickerColors.getClass();
                    TextKt.m561TextNvy7gAk(str, clearAndSetSemantics, ((Color) SingleValueAnimationKt.m153animateColorAsStateeuL9pac(this.$selected ? datePickerColors.selectedYearContentColor : this.$currentYear ? datePickerColors.currentYearContentColor : datePickerColors.yearContentColor, MenuKt.value(MotionSchemeKeyTokens.DefaultEffects, gapComposer), null, gapComposer, 0, 12).getValue()).value, 0L, null, 0L, new TextAlign(3), 0L, 0, false, 0, 0, null, gapComposer, 0, 0, 261112);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Number) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Function0 function0 = (Function0) obj4;
                    Function0 function02 = (Function0) obj3;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, 0);
                    int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer2);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
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
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer2.inserting || !Intrinsics.areEqual(gapComposer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer2, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$12);
                    }
                    Updater.m576setimpl(gapComposer2, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    ImageVector imageVector = Icons$Filled._keyboardArrowLeft;
                    if (imageVector == null) {
                        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        EmptyList emptyList = VectorKt.EmptyPath;
                        SolidColor solidColor = new SolidColor(Color.Black);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new PathNode.MoveTo(15.41f, 16.59f));
                        arrayList.add(new PathNode.LineTo(10.83f, 12.0f));
                        arrayList.add(new PathNode.RelativeLineTo(4.58f, -4.59f));
                        arrayList.add(new PathNode.LineTo(14.0f, 6.0f));
                        arrayList.add(new PathNode.RelativeLineTo(-6.0f, 6.0f));
                        arrayList.add(new PathNode.RelativeLineTo(6.0f, 6.0f));
                        arrayList.add(new PathNode.RelativeLineTo(1.41f, -1.41f));
                        arrayList.add(PathNode.Close.INSTANCE);
                        ImageVector.Builder.m766addPathoIyEayM$default(builder, arrayList, solidColor);
                        imageVector = builder.build();
                        Icons$Filled._keyboardArrowLeft = imageVector;
                    }
                    DatePickerKt.IconButtonWithTooltip(function0, imageVector, Icons$Filled.m568getString2EP1pXo(gapComposer2, R.string.m3c_date_picker_switch_to_previous_month), null, this.$currentYear, gapComposer2, 0, 8);
                    ImageVector imageVector2 = Icons$Filled._keyboardArrowRight;
                    if (imageVector2 == null) {
                        ImageVector.Builder builder2 = new ImageVector.Builder("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        EmptyList emptyList2 = VectorKt.EmptyPath;
                        SolidColor solidColor2 = new SolidColor(Color.Black);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new PathNode.MoveTo(8.59f, 16.59f));
                        arrayList2.add(new PathNode.LineTo(13.17f, 12.0f));
                        arrayList2.add(new PathNode.LineTo(8.59f, 7.41f));
                        arrayList2.add(new PathNode.LineTo(10.0f, 6.0f));
                        arrayList2.add(new PathNode.RelativeLineTo(6.0f, 6.0f));
                        arrayList2.add(new PathNode.RelativeLineTo(-6.0f, 6.0f));
                        arrayList2.add(new PathNode.RelativeLineTo(-1.41f, -1.41f));
                        arrayList2.add(PathNode.Close.INSTANCE);
                        ImageVector.Builder.m766addPathoIyEayM$default(builder2, arrayList2, solidColor2);
                        imageVector2 = builder2.build();
                        Icons$Filled._keyboardArrowRight = imageVector2;
                    }
                    DatePickerKt.IconButtonWithTooltip(function02, imageVector2, Icons$Filled.m568getString2EP1pXo(gapComposer2, R.string.m3c_date_picker_switch_to_next_month), null, this.$selected, gapComposer2, 0, 8);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public DatePickerKt$Year$2(Function0 function0, boolean z, Function0 function02, boolean z2) {
        this.$text = function0;
        this.$currentYear = z;
        this.$colors = function02;
        this.$selected = z2;
    }
}
