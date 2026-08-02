package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda3;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class TooltipKt {
    public static final PaddingValuesImpl PlainTooltipContentPadding = new PaddingValuesImpl(8.0f, 4.0f, 8.0f, 4.0f);

    /* renamed from: PlainTooltip-gv3ox5I, reason: not valid java name */
    public static final void m562PlainTooltipgv3ox5I(TooltipScopeImpl tooltipScopeImpl, Modifier modifier, float f, Shape shape, long j, long j2, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        final float f2;
        Shape shape2;
        long j3;
        long j4;
        final long value;
        int i3;
        long value2;
        Modifier modifier3;
        Shape shape3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer2.changed(tooltipScopeImpl) : gapComposer2.changedInstance(tooltipScopeImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= PKIFailureInfo.signerNotTrusted;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (gapComposer2.shouldExecute(i5 & 1, (306783379 & i5) != 306783378)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                f2 = TooltipDefaults.plainTooltipMaxWidth;
                Shape value3 = ShapesKt.getValue(PlainTooltipTokens.ContainerShape, gapComposer2);
                value = ColorSchemeKt.getValue(PlainTooltipTokens.SupportingTextColor, gapComposer2);
                i3 = i5 & (-4186113);
                value2 = ColorSchemeKt.getValue(PlainTooltipTokens.ContainerColor, gapComposer2);
                modifier3 = Modifier.Companion.$$INSTANCE;
                shape3 = value3;
            } else {
                gapComposer2.skipToGroupEnd();
                i3 = i5 & (-4186113);
                modifier3 = modifier;
                f2 = f;
                shape3 = shape;
                value = j;
                value2 = j2;
            }
            gapComposer2.endDefaults();
            gapComposer2.startReplaceGroup(-1719831991);
            gapComposer2.end(false);
            int i6 = i3 >> 9;
            gapComposer = gapComposer2;
            SurfaceKt.m554SurfaceT9BRK9s(modifier3, shape3, value2, 0L, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-1573998995, new Function2() { // from class: androidx.compose.material3.TooltipKt$PlainTooltip$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Number) obj2).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        PaddingValuesImpl paddingValuesImpl = TooltipKt.PlainTooltipContentPadding;
                        Modifier padding = SpacerKt.padding(SizeKt.m289sizeInqDBjuR0$default(Modifier.Companion.$$INSTANCE, 40.0f, 24.0f, f2, RecyclerView.DECELERATION_RATE, 8), TooltipKt.PlainTooltipContentPadding);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer3);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, padding);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer3.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        if (gapComposer3.inserting || !Intrinsics.areEqual(gapComposer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer3, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                        }
                        Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        Updater.CompositionLocalProvider(new ProvidedValue[]{Recorder$$ExternalSyntheticOutline2.m(value, ContentColorKt.LocalContentColor), TextKt.LocalTextStyle.defaultProvidedValue$runtime(TypographyKt.getValue(PlainTooltipTokens.SupportingTextFont, gapComposer3))}, composableLambdaImpl, gapComposer3, 8);
                        gapComposer3.end(true);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            j3 = value;
            modifier2 = modifier3;
            shape2 = shape3;
            j4 = value2;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            f2 = f;
            shape2 = shape;
            j3 = j;
            j4 = j2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AppBarKt$$ExternalSyntheticLambda3(tooltipScopeImpl, modifier2, f2, shape2, j3, j4, composableLambdaImpl, i);
        }
    }

    public static final void TooltipBox(PopupPositionProvider popupPositionProvider, ComposableLambdaImpl composableLambdaImpl, TooltipStateImpl tooltipStateImpl, Modifier modifier, boolean z, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl3;
        Modifier modifier2;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-293753984);
        int i2 = i | (gapComposer.changed(popupPositionProvider) ? 4 : 2) | (gapComposer.changed(tooltipStateImpl) ? 256 : 128) | 14380032;
        if (gapComposer.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            Transition updateTransition = AnimatableKt.updateTransition(tooltipStateImpl.transition, "tooltip transition", gapComposer, 48);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                new TooltipKt$$ExternalSyntheticLambda1(0, mutableState);
                rememberedValue2 = new TooltipScopeImpl();
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            composableLambdaImpl3 = composableLambdaImpl2;
            Icons$Filled.BasicTooltipBox(popupPositionProvider, Expect_jvmKt.rememberComposableLambda(-527401546, new TooltipKt$TooltipBox$3(0, updateTransition, composableLambdaImpl, (TooltipScopeImpl) rememberedValue2), gapComposer), tooltipStateImpl, Expect_jvmKt.rememberComposableLambda(-23901870, new ButtonKt$Button$2.AnonymousClass1(5, mutableState, composableLambdaImpl3), gapComposer), gapComposer, (i2 & 896) | (i2 & 14) | 100663344 | 14380032);
            modifier2 = Modifier.Companion.$$INSTANCE;
            z2 = true;
        } else {
            composableLambdaImpl3 = composableLambdaImpl2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TooltipKt$$ExternalSyntheticLambda2(popupPositionProvider, composableLambdaImpl, tooltipStateImpl, modifier2, z2, composableLambdaImpl3, i);
        }
    }
}
