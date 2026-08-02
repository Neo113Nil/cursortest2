package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.input.VisualTransformation$Companion$$ExternalSyntheticLambda0;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class OutlinedTextFieldKt {
    public static final /* synthetic */ int $r8$clinit = 0;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                LayoutDirection layoutDirection = LayoutDirection.Ltr;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Room.getSp(8);
    }

    public static final void OutlinedTextField(final String str, final Function1 function1, final Modifier modifier, final boolean z, TextStyle textStyle, final Function2 function2, final Function2 function22, final Function2 function23, final boolean z2, final KeyboardOptions keyboardOptions, final KeyboardActions keyboardActions, final int i, int i2, final Shape shape, final TextFieldColors textFieldColors, Composer composer, final int i3) {
        GapComposer gapComposer;
        final int i4;
        int i5;
        TextStyle textStyle2;
        int i6;
        long j;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(801000036);
        int i7 = i3 | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128) | (gapComposer2.changed(z) ? 2048 : 1024) | (gapComposer2.changed(false) ? 16384 : PKIFailureInfo.certRevoked) | 65536 | (gapComposer2.changedInstance(null) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changedInstance(function2) ? 8388608 : 4194304) | (gapComposer2.changedInstance(function22) ? 67108864 : 33554432) | (gapComposer2.changedInstance(function23) ? 536870912 : 268435456);
        int i8 = 196608 | (gapComposer2.changed(z2) ? 4 : 2);
        VisualTransformation$Companion$$ExternalSyntheticLambda0 visualTransformation$Companion$$ExternalSyntheticLambda0 = VisualTransformation.Companion.None;
        int i9 = i8 | (gapComposer2.changed(visualTransformation$Companion$$ExternalSyntheticLambda0) ? 32 : 16) | (gapComposer2.changed(keyboardOptions) ? 256 : 128) | (gapComposer2.changed(keyboardActions) ? 2048 : 1024) | 14180352 | (gapComposer2.changed(shape) ? 67108864 : 33554432) | (gapComposer2.changed(textFieldColors) ? 536870912 : 268435456);
        if (gapComposer2.shouldExecute(i7 & 1, ((i7 & 306783379) == 306783378 && (i9 & 306783379) == 306783378) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i3 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                i5 = i7 & (-458753);
                textStyle2 = (TextStyle) gapComposer2.consume(TextKt.LocalTextStyle);
                i6 = 1;
            } else {
                gapComposer2.skipToGroupEnd();
                i6 = i2;
                i5 = i7 & (-458753);
                textStyle2 = textStyle;
            }
            gapComposer2.endDefaults();
            gapComposer2.startReplaceGroup(-245181289);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            gapComposer2.end(false);
            gapComposer2.startReplaceGroup(961927346);
            long m996getColor0d7_KjU = textStyle2.m996getColor0d7_KjU();
            if (m996getColor0d7_KjU != 16) {
                textStyle = textStyle2;
                j = m996getColor0d7_KjU;
            } else {
                textStyle = textStyle2;
                j = ((Color) textFieldColors.textColor(z, gapComposer2).getValue()).value;
            }
            gapComposer2.end(false);
            TextStyle merge = textStyle.merge(new TextStyle(j, 0L, null, null, 0L, 0L, 0, 0, 0L, null, 16777214));
            gapComposer2.startReplaceGroup(-244324666);
            gapComposer2.end(false);
            Modifier then = modifier.then(Modifier.Companion.$$INSTANCE);
            String m478getString4foXLRw = CardKt.m478getString4foXLRw(gapComposer2, 3);
            if (z2) {
                then = SemanticsModifierKt.semantics(then, false, new IconKt$$ExternalSyntheticLambda0(m478getString4foXLRw, 1));
            }
            int i10 = i9 << 12;
            gapComposer = gapComposer2;
            BasicTextFieldKt.BasicTextField(str, function1, SizeKt.m275defaultMinSizeVpY3zN4(then, 280.0f, 56.0f), z, false, merge, keyboardOptions, keyboardActions, false, i, i6, visualTransformation$Companion$$ExternalSyntheticLambda0, null, mutableInteractionSourceImpl, new SolidColor(((Color) textFieldColors.cursorColor(z2, gapComposer2).getValue()).value), Expect_jvmKt.rememberComposableLambda(-591103097, new TabToolbarsKt$$ExternalSyntheticLambda1(str, z, mutableInteractionSourceImpl, z2, function2, function22, function23, shape, textFieldColors), gapComposer2), gapComposer, (i5 & 64638) | (3670016 & i10) | (i10 & 29360128) | 905969664, 196614 | (i9 & 112), 4096);
            i4 = i6;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            i4 = i2;
        }
        final TextStyle textStyle3 = textStyle;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(str, function1, modifier, z, textStyle3, function2, function22, function23, z2, keyboardOptions, keyboardActions, i, i4, shape, textFieldColors, i3) { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda3
                public final /* synthetic */ String f$0;
                public final /* synthetic */ Function1 f$1;
                public final /* synthetic */ boolean f$10;
                public final /* synthetic */ KeyboardOptions f$12;
                public final /* synthetic */ KeyboardActions f$13;
                public final /* synthetic */ int f$15;
                public final /* synthetic */ int f$16;
                public final /* synthetic */ Shape f$18;
                public final /* synthetic */ TextFieldColors f$19;
                public final /* synthetic */ Modifier f$2;
                public final /* synthetic */ boolean f$3;
                public final /* synthetic */ TextStyle f$5;
                public final /* synthetic */ Function2 f$7;
                public final /* synthetic */ Function2 f$8;
                public final /* synthetic */ Function2 f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    OutlinedTextFieldKt.OutlinedTextField(this.f$0, this.f$1, this.f$2, this.f$3, this.f$5, this.f$7, this.f$8, this.f$9, this.f$10, this.f$12, this.f$13, this.f$15, this.f$16, this.f$18, this.f$19, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void OutlinedTextFieldLayout(final Modifier modifier, Function2 function2, Function3 function3, Function2 function22, final Function2 function23, final Function2 function24, final boolean z, final float f, final Function1 function1, final ComposableLambdaImpl composableLambdaImpl, PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        Function2 function25;
        Function3 function32;
        LayoutDirection layoutDirection;
        boolean z2;
        boolean z3;
        final Function2 function26 = function22;
        final PaddingValues paddingValues2 = paddingValues;
        BiasAlignment biasAlignment = Alignment.Companion.Center;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(36320288);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function26) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function23) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function24) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i2 |= gapComposer.changed(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        char c = gapComposer.changed(paddingValues2) ? (char) 4 : (char) 2;
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, ((i2 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            boolean z4 = ((i3 & 234881024) == 67108864) | ((i3 & 3670016) == 1048576) | ((i3 & 29360128) == 8388608) | ((c & 14) == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z4 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OutlinedTextFieldMeasurePolicy(function1, z, f, paddingValues2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) rememberedValue;
            LayoutDirection layoutDirection2 = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, outlinedTextFieldMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$13);
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            composableLambdaImpl.invoke(gapComposer, Integer.valueOf((i3 >> 27) & 14));
            MinimumInteractiveModifier minimumInteractiveModifier = MinimumInteractiveModifier.INSTANCE;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (function23 != null) {
                gapComposer.startReplaceGroup(1336978507);
                Modifier layoutId = RulerKt.layoutId(companion, "Leading");
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.LocalMinimumInteractiveComponentEnforcement;
                Modifier then = layoutId.then(minimumInteractiveModifier);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, then);
                gapComposer.startReusableNode();
                layoutDirection = layoutDirection2;
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$13);
                }
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                z2 = false;
                Recorder$$ExternalSyntheticOutline2.m((i3 >> 12) & 14, function23, gapComposer, true, false);
            } else {
                layoutDirection = layoutDirection2;
                z2 = false;
                gapComposer.startReplaceGroup(1337224523);
                gapComposer.end(false);
            }
            if (function24 != null) {
                gapComposer.startReplaceGroup(1337267241);
                Modifier layoutId2 = RulerKt.layoutId(companion, "Trailing");
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = InteractiveComponentSizeKt.LocalMinimumInteractiveComponentEnforcement;
                Modifier then2 = layoutId2.then(minimumInteractiveModifier);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z2);
                int currentCompositeKeyHash3 = Updater.getCurrentCompositeKeyHash(gapComposer);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, then2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash3, gapComposer, currentCompositeKeyHash3, composeUiNode$Companion$SetModifier$13);
                }
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                Recorder$$ExternalSyntheticOutline2.m((i3 >> 15) & 14, function24, gapComposer, true, false);
            } else {
                gapComposer.startReplaceGroup(1337515179);
                gapComposer.end(z2);
            }
            paddingValues2 = paddingValues;
            LayoutDirection layoutDirection3 = layoutDirection;
            float calculateStartPadding = SpacerKt.calculateStartPadding(paddingValues2, layoutDirection3);
            float calculateEndPadding = SpacerKt.calculateEndPadding(paddingValues2, layoutDirection3);
            if (function23 != null) {
                calculateStartPadding -= 12.0f;
                if (calculateStartPadding < RecyclerView.DECELERATION_RATE) {
                    calculateStartPadding = 0.0f;
                }
            }
            float f2 = calculateStartPadding;
            if (function24 != null) {
                calculateEndPadding -= 12.0f;
                if (calculateEndPadding < RecyclerView.DECELERATION_RATE) {
                    calculateEndPadding = 0.0f;
                }
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, f2, RecyclerView.DECELERATION_RATE, calculateEndPadding, RecyclerView.DECELERATION_RATE, 10);
            if (function3 != null) {
                gapComposer.startReplaceGroup(1338367152);
                function32 = function3;
                function32.invoke(RulerKt.layoutId(companion, "Hint").then(m302paddingqDBjuR0$default), gapComposer, Integer.valueOf((i3 >> 3) & 112));
                gapComposer.end(false);
            } else {
                function32 = function3;
                gapComposer.startReplaceGroup(1338454603);
                gapComposer.end(false);
            }
            Modifier then3 = RulerKt.layoutId(companion, "TextField").then(m302paddingqDBjuR0$default);
            BiasAlignment biasAlignment2 = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, true);
            int currentCompositeKeyHash4 = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, then3);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash4, gapComposer, currentCompositeKeyHash4, composeUiNode$Companion$SetModifier$13);
            }
            Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
            function25 = function2;
            Recorder$$ExternalSyntheticOutline1.m((i3 >> 3) & 14, function25, gapComposer, true);
            if (function22 != null) {
                gapComposer.startReplaceGroup(1338685429);
                Modifier layoutId3 = RulerKt.layoutId(companion, "Label");
                MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, false);
                int currentCompositeKeyHash5 = Updater.getCurrentCompositeKeyHash(gapComposer);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, layoutId3);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash5, gapComposer, currentCompositeKeyHash5, composeUiNode$Companion$SetModifier$13);
                }
                Updater.m576setimpl(gapComposer, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                function26 = function22;
                z3 = true;
                Recorder$$ExternalSyntheticOutline2.m((i3 >> 9) & 14, function26, gapComposer, true, false);
            } else {
                function26 = function22;
                z3 = true;
                gapComposer.startReplaceGroup(1338768075);
                gapComposer.end(false);
            }
            gapComposer.end(z3);
        } else {
            function25 = function2;
            function32 = function3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final Function2 function27 = function25;
            final Function3 function33 = function32;
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    OutlinedTextFieldKt.OutlinedTextFieldLayout(Modifier.this, function27, function33, function26, function23, function24, z, f, function1, composableLambdaImpl, paddingValues2, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: access$calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m494access$calculateHeightO3s9Psw(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        int max = Math.max(i3, Math.max(i5, TransactorKt.lerp(i4, 0, f)));
        float mo267calculateTopPaddingD9Ej5fM = paddingValues.mo267calculateTopPaddingD9Ej5fM() * f2;
        return ConstraintsKt.m1032constrainHeightK40F9xA(Math.max(i, Math.max(i2, MathKt__MathJVMKt.roundToInt(TransactorKt.lerp(mo267calculateTopPaddingD9Ej5fM, Math.max(mo267calculateTopPaddingD9Ej5fM, i4 / 2.0f), f) + max + (paddingValues.mo264calculateBottomPaddingD9Ej5fM() * f2)))), j);
    }

    /* renamed from: access$calculateWidth-O3s9Psw, reason: not valid java name */
    public static final int m495access$calculateWidthO3s9Psw(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        int max = Math.max(i3, Math.max(TransactorKt.lerp(i4, 0, f), i5)) + i + i2;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return ConstraintsKt.m1033constrainWidthK40F9xA(Math.max(max, MathKt__MathJVMKt.roundToInt((i4 + ((paddingValues.mo266calculateRightPaddingu2uoSUM(layoutDirection) + paddingValues.mo265calculateLeftPaddingu2uoSUM(layoutDirection)) * f2)) * f)), j);
    }
}
