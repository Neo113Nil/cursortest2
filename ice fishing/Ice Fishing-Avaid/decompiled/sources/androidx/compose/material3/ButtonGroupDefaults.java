package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.ButtonGroupSmallTokens;
import androidx.compose.material3.tokens.ConnectedButtonGroupSmallTokens;
import androidx.compose.material3.tokens.ShapeTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: ButtonGroup.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010%J+\u0010&\u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010%J+\u0010'\u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010%JI\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u00100\u001a\u0002012\n\b\u0002\u00102\u001a\u0004\u0018\u000103H\u0007¢\u0006\u0002\u00104R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u00020\r¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013¨\u00065"}, d2 = {"Landroidx/compose/material3/ButtonGroupDefaults;", "", "<init>", "()V", "ExpandedRatio", "", "getExpandedRatio", "()F", "HorizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "ConnectedSpaceBetween", "Landroidx/compose/ui/unit/Dp;", "getConnectedSpaceBetween-D9Ej5fM", "F", "connectedLeadingButtonShape", "Landroidx/compose/ui/graphics/Shape;", "getConnectedLeadingButtonShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "connectedLeadingButtonPressShape", "getConnectedLeadingButtonPressShape", "connectedTrailingButtonShape", "getConnectedTrailingButtonShape", "connectedTrailingButtonPressShape", "getConnectedTrailingButtonPressShape", "connectedButtonCheckedShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getConnectedButtonCheckedShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "connectedMiddleButtonPressShape", "getConnectedMiddleButtonPressShape", "connectedLeadingButtonShapes", "Landroidx/compose/material3/ToggleButtonShapes;", "shape", "pressedShape", "checkedShape", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ToggleButtonShapes;", "connectedMiddleButtonShapes", "connectedTrailingButtonShapes", "OverflowIndicator", "", "menuState", "Landroidx/compose/material3/ButtonGroupMenuState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "colors", "Landroidx/compose/material3/IconButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/material3/ButtonGroupMenuState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ButtonGroupDefaults {
    public static final int $stable = 0;
    public static final ButtonGroupDefaults INSTANCE = new ButtonGroupDefaults();
    private static final float ExpandedRatio = 0.15f;
    private static final Arrangement.Horizontal HorizontalArrangement = Arrangement.INSTANCE.m868spacedBy0680j_4(ButtonGroupSmallTokens.INSTANCE.m4973getBetweenSpaceD9Ej5fM());
    private static final float ConnectedSpaceBetween = ConnectedButtonGroupSmallTokens.INSTANCE.m5121getBetweenSpaceD9Ej5fM();
    private static final RoundedCornerShape connectedButtonCheckedShape = ShapeTokens.INSTANCE.getCornerFull();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverflowIndicator$lambda$2(ButtonGroupDefaults buttonGroupDefaults, ButtonGroupMenuState buttonGroupMenuState, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        buttonGroupDefaults.OverflowIndicator(buttonGroupMenuState, modifier, z, shape, iconButtonColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private ButtonGroupDefaults() {
    }

    public final float getExpandedRatio() {
        return ExpandedRatio;
    }

    public final Arrangement.Horizontal getHorizontalArrangement() {
        return HorizontalArrangement;
    }

    /* renamed from: getConnectedSpaceBetween-D9Ej5fM, reason: not valid java name */
    public final float m2622getConnectedSpaceBetweenD9Ej5fM() {
        return ConnectedSpaceBetween;
    }

    public final Shape getConnectedLeadingButtonShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1246076717, "C(<get-connectedLeadingButtonShape>):ButtonGroup.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1246076717, i, -1, "androidx.compose.material3.ButtonGroupDefaults.<get-connectedLeadingButtonShape> (ButtonGroup.kt:311)");
        }
        RoundedCornerShape roundedCornerShape = new RoundedCornerShape(ShapeDefaults.INSTANCE.getCornerFull$material3(), ConnectedButtonGroupSmallTokens.INSTANCE.getInnerCornerCornerSize(), ConnectedButtonGroupSmallTokens.INSTANCE.getInnerCornerCornerSize(), ShapeDefaults.INSTANCE.getCornerFull$material3());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return roundedCornerShape;
    }

    public final Shape getConnectedLeadingButtonPressShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1457991935, "C(<get-connectedLeadingButtonPressShape>):ButtonGroup.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1457991935, i, -1, "androidx.compose.material3.ButtonGroupDefaults.<get-connectedLeadingButtonPressShape> (ButtonGroup.kt:322)");
        }
        RoundedCornerShape roundedCornerShape = new RoundedCornerShape(ShapeDefaults.INSTANCE.getCornerFull$material3(), ConnectedButtonGroupSmallTokens.INSTANCE.getPressedInnerCornerCornerSize(), ConnectedButtonGroupSmallTokens.INSTANCE.getPressedInnerCornerCornerSize(), ShapeDefaults.INSTANCE.getCornerFull$material3());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return roundedCornerShape;
    }

    public final Shape getConnectedTrailingButtonShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -2057653407, "C(<get-connectedTrailingButtonShape>):ButtonGroup.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2057653407, i, -1, "androidx.compose.material3.ButtonGroupDefaults.<get-connectedTrailingButtonShape> (ButtonGroup.kt:333)");
        }
        RoundedCornerShape roundedCornerShape = new RoundedCornerShape(ConnectedButtonGroupSmallTokens.INSTANCE.getInnerCornerCornerSize(), ShapeDefaults.INSTANCE.getCornerFull$material3(), ShapeDefaults.INSTANCE.getCornerFull$material3(), ConnectedButtonGroupSmallTokens.INSTANCE.getInnerCornerCornerSize());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return roundedCornerShape;
    }

    public final Shape getConnectedTrailingButtonPressShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -52557273, "C(<get-connectedTrailingButtonPressShape>):ButtonGroup.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-52557273, i, -1, "androidx.compose.material3.ButtonGroupDefaults.<get-connectedTrailingButtonPressShape> (ButtonGroup.kt:344)");
        }
        RoundedCornerShape roundedCornerShape = new RoundedCornerShape(ConnectedButtonGroupSmallTokens.INSTANCE.getPressedInnerCornerCornerSize(), ShapeDefaults.INSTANCE.getCornerFull$material3(), ShapeDefaults.INSTANCE.getCornerFull$material3(), ConnectedButtonGroupSmallTokens.INSTANCE.getPressedInnerCornerCornerSize());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return roundedCornerShape;
    }

    public final RoundedCornerShape getConnectedButtonCheckedShape() {
        return connectedButtonCheckedShape;
    }

    public final Shape getConnectedMiddleButtonPressShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -285671115, "C(<get-connectedMiddleButtonPressShape>):ButtonGroup.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-285671115, i, -1, "androidx.compose.material3.ButtonGroupDefaults.<get-connectedMiddleButtonPressShape> (ButtonGroup.kt:357)");
        }
        RoundedCornerShape RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(ConnectedButtonGroupSmallTokens.INSTANCE.getPressedInnerCornerCornerSize());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return RoundedCornerShape;
    }

    public final ToggleButtonShapes connectedLeadingButtonShapes(Shape shape, Shape shape2, Shape shape3, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1795302403, "C(connectedLeadingButtonShapes)N(shape,pressedShape,checkedShape)362@18146L27,363@18205L32:ButtonGroup.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            shape = getConnectedLeadingButtonShape(composer, (i >> 9) & 14);
        }
        if ((i2 & 2) != 0) {
            shape2 = getConnectedLeadingButtonPressShape(composer, (i >> 9) & 14);
        }
        if ((i2 & 4) != 0) {
            shape3 = connectedButtonCheckedShape;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1795302403, i, -1, "androidx.compose.material3.ButtonGroupDefaults.connectedLeadingButtonShapes (ButtonGroup.kt:366)");
        }
        ToggleButtonShapes toggleButtonShapes = new ToggleButtonShapes(shape, shape2, shape3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return toggleButtonShapes;
    }

    public final ToggleButtonShapes connectedMiddleButtonShapes(Shape shape, Shape shape2, Shape shape3, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -669854558, "C(connectedMiddleButtonShapes)N(shape,pressedShape,checkedShape)375@18739L31:ButtonGroup.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            shape = ShapeDefaults.INSTANCE.getSmall();
        }
        if ((i2 & 2) != 0) {
            shape2 = getConnectedMiddleButtonPressShape(composer, (i >> 9) & 14);
        }
        if ((i2 & 4) != 0) {
            shape3 = connectedButtonCheckedShape;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-669854558, i, -1, "androidx.compose.material3.ButtonGroupDefaults.connectedMiddleButtonShapes (ButtonGroup.kt:378)");
        }
        ToggleButtonShapes toggleButtonShapes = new ToggleButtonShapes(shape, shape2, shape3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return toggleButtonShapes;
    }

    public final ToggleButtonShapes connectedTrailingButtonShapes(Shape shape, Shape shape2, Shape shape3, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1136219689, "C(connectedTrailingButtonShapes)N(shape,pressedShape,checkedShape)383@19120L28,384@19180L33:ButtonGroup.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            shape = getConnectedTrailingButtonShape(composer, (i >> 9) & 14);
        }
        if ((i2 & 2) != 0) {
            shape2 = getConnectedTrailingButtonPressShape(composer, (i >> 9) & 14);
        }
        if ((i2 & 4) != 0) {
            shape3 = connectedButtonCheckedShape;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1136219689, i, -1, "androidx.compose.material3.ButtonGroupDefaults.connectedTrailingButtonShapes (ButtonGroup.kt:387)");
        }
        ToggleButtonShapes toggleButtonShapes = new ToggleButtonShapes(shape, shape2, shape3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return toggleButtonShapes;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OverflowIndicator(final ButtonGroupMenuState buttonGroupMenuState, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final IconButtonColors iconButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        final Modifier modifier4;
        MutableInteractionSource mutableInteractionSource4;
        final boolean z4;
        final Shape shape4;
        final IconButtonColors iconButtonColors4;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1050099185);
        ComposerKt.sourceInformation(startRestartGroup, "C(OverflowIndicator)N(menuState,modifier,enabled,shape,colors,interactionSource)416@21080L41,420@21206L60,421@21290L45,422@21357L22,423@21391L697,418@21131L957:ButtonGroup.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(buttonGroupMenuState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i7 = 2048;
                            i3 |= i7;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i7 = 1024;
                    i3 |= i7;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "412@20885L11,413@20952L24");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                shape2 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                iconButtonColors2 = IconButtonDefaults.INSTANCE.filledIconButtonColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                mutableInteractionSource4 = null;
                                modifier4 = companion;
                                z4 = z2;
                                shape4 = shape2;
                                iconButtonColors4 = iconButtonColors2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1050099185, i3, -1, "androidx.compose.material3.ButtonGroupDefaults.OverflowIndicator (ButtonGroup.kt:415)");
                                }
                                Strings.Companion companion2 = Strings.INSTANCE;
                                final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_button_group_more_options), startRestartGroup, 0);
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                Modifier modifier5 = modifier4;
                                boolean z5 = z4;
                                Shape shape5 = shape4;
                                IconButtonColors iconButtonColors5 = iconButtonColors4;
                                TooltipKt.TooltipBox(TooltipDefaults.INSTANCE.m4536rememberTooltipPositionProviderHu5FAss(TooltipAnchorPosition.INSTANCE.m4523getAbovelOKsHw4(), 0.0f, startRestartGroup, 390, 2), ComposableLambdaKt.rememberComposableLambda(-1592749658, true, new Function3() { // from class: androidx.compose.material3.ButtonGroupDefaults$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        Unit OverflowIndicator$lambda$0;
                                        OverflowIndicator$lambda$0 = ButtonGroupDefaults.OverflowIndicator$lambda$0(m4895getString2EP1pXo, (TooltipScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                        return OverflowIndicator$lambda$0;
                                    }
                                }, startRestartGroup, 54), TooltipKt.rememberTooltipState(false, false, null, startRestartGroup, 0, 7), null, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(-519192434, true, new Function2() { // from class: androidx.compose.material3.ButtonGroupDefaults$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit OverflowIndicator$lambda$1;
                                        OverflowIndicator$lambda$1 = ButtonGroupDefaults.OverflowIndicator$lambda$1(ButtonGroupMenuState.this, modifier4, z4, shape4, iconButtonColors4, mutableInteractionSource5, m4895getString2EP1pXo, (Composer) obj, ((Integer) obj2).intValue());
                                        return OverflowIndicator$lambda$1;
                                    }
                                }, startRestartGroup, 54), startRestartGroup, 100663344, 248);
                                composer2 = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier5;
                                z3 = z5;
                                shape3 = shape5;
                                iconButtonColors3 = iconButtonColors5;
                                mutableInteractionSource3 = mutableInteractionSource5;
                            } else {
                                modifier4 = companion;
                            }
                        }
                        shape4 = shape2;
                        iconButtonColors4 = iconButtonColors2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        z4 = z2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Strings.Companion companion22 = Strings.INSTANCE;
                        final String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_button_group_more_options), startRestartGroup, 0);
                        final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource4;
                        Modifier modifier52 = modifier4;
                        boolean z52 = z4;
                        Shape shape52 = shape4;
                        IconButtonColors iconButtonColors52 = iconButtonColors4;
                        TooltipKt.TooltipBox(TooltipDefaults.INSTANCE.m4536rememberTooltipPositionProviderHu5FAss(TooltipAnchorPosition.INSTANCE.m4523getAbovelOKsHw4(), 0.0f, startRestartGroup, 390, 2), ComposableLambdaKt.rememberComposableLambda(-1592749658, true, new Function3() { // from class: androidx.compose.material3.ButtonGroupDefaults$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Unit OverflowIndicator$lambda$0;
                                OverflowIndicator$lambda$0 = ButtonGroupDefaults.OverflowIndicator$lambda$0(m4895getString2EP1pXo2, (TooltipScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                return OverflowIndicator$lambda$0;
                            }
                        }, startRestartGroup, 54), TooltipKt.rememberTooltipState(false, false, null, startRestartGroup, 0, 7), null, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(-519192434, true, new Function2() { // from class: androidx.compose.material3.ButtonGroupDefaults$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit OverflowIndicator$lambda$1;
                                OverflowIndicator$lambda$1 = ButtonGroupDefaults.OverflowIndicator$lambda$1(ButtonGroupMenuState.this, modifier4, z4, shape4, iconButtonColors4, mutableInteractionSource52, m4895getString2EP1pXo2, (Composer) obj, ((Integer) obj2).intValue());
                                return OverflowIndicator$lambda$1;
                            }
                        }, startRestartGroup, 54), startRestartGroup, 100663344, 248);
                        composer2 = startRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        z3 = z52;
                        shape3 = shape52;
                        iconButtonColors3 = iconButtonColors52;
                        mutableInteractionSource3 = mutableInteractionSource52;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        iconButtonColors3 = iconButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ButtonGroupDefaults$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit OverflowIndicator$lambda$2;
                                OverflowIndicator$lambda$2 = ButtonGroupDefaults.OverflowIndicator$lambda$2(ButtonGroupDefaults.this, buttonGroupMenuState, modifier3, z3, shape3, iconButtonColors3, mutableInteractionSource3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return OverflowIndicator$lambda$2;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverflowIndicator$lambda$0(final String str, TooltipScope tooltipScope, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "C421@21305L28,421@21292L41:ButtonGroup.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(tooltipScope) : composer.changedInstance(tooltipScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1592749658, i2, -1, "androidx.compose.material3.ButtonGroupDefaults.OverflowIndicator.<anonymous> (ButtonGroup.kt:421)");
            }
            TooltipKt.m4544PlainTooltipgv3ox5I(tooltipScope, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1424127112, true, new Function2() { // from class: androidx.compose.material3.ButtonGroupDefaults$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OverflowIndicator$lambda$0$0;
                    OverflowIndicator$lambda$0$0 = ButtonGroupDefaults.OverflowIndicator$lambda$0$0(str, (Composer) obj, ((Integer) obj2).intValue());
                    return OverflowIndicator$lambda$0$0;
                }
            }, composer, 54), composer, (i2 & 14) | 805306368, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverflowIndicator$lambda$0$0(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C421@21307L24:ButtonGroup.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1424127112, i, -1, "androidx.compose.material3.ButtonGroupDefaults.OverflowIndicator.<anonymous>.<anonymous> (ButtonGroup.kt:421)");
            }
            TextKt.m4292TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverflowIndicator$lambda$1(final ButtonGroupMenuState buttonGroupMenuState, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C425@21449L202,437@21870L193,424@21405L673:ButtonGroup.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-519192434, i, -1, "androidx.compose.material3.ButtonGroupDefaults.OverflowIndicator.<anonymous> (ButtonGroup.kt:424)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -727720680, "CC(remember):ButtonGroup.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(buttonGroupMenuState);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.ButtonGroupDefaults$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit OverflowIndicator$lambda$1$0$0;
                        OverflowIndicator$lambda$1$0$0 = ButtonGroupDefaults.OverflowIndicator$lambda$1$0$0(ButtonGroupMenuState.this);
                        return OverflowIndicator$lambda$1$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.FilledIconButton((Function0<Unit>) rememberedValue, modifier, z, shape, iconButtonColors, mutableInteractionSource, ComposableLambdaKt.rememberComposableLambda(-833349714, true, new Function2() { // from class: androidx.compose.material3.ButtonGroupDefaults$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OverflowIndicator$lambda$1$1;
                    OverflowIndicator$lambda$1$1 = ButtonGroupDefaults.OverflowIndicator$lambda$1$1(str, (Composer) obj, ((Integer) obj2).intValue());
                    return OverflowIndicator$lambda$1$1;
                }
            }, composer, 54), composer, 1572864, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverflowIndicator$lambda$1$0$0(ButtonGroupMenuState buttonGroupMenuState) {
        if (buttonGroupMenuState.isExpanded()) {
            buttonGroupMenuState.dismiss();
        } else {
            buttonGroupMenuState.show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverflowIndicator$lambda$1$1(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C438@21892L153:ButtonGroup.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-833349714, i, -1, "androidx.compose.material3.ButtonGroupDefaults.OverflowIndicator.<anonymous>.<anonymous> (ButtonGroup.kt:438)");
            }
            IconKt.m3345Iconww6aTOc(Icons.Filled.INSTANCE.getMoreVert$material3(), str, (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
