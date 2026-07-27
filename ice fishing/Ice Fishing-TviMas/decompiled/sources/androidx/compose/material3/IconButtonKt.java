package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IconButton.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a`\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001an\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0016\u001a`\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001an\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0016\u001aV\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u001a\u001ad\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u001c\u001al\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010 \u001az\u0010!\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\"¨\u0006#"}, d2 = {"FilledIconButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/IconButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledIconToggleButton", "checked", "onCheckedChange", "Lkotlin/Function1;", "Landroidx/compose/material3/IconToggleButtonColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledTonalIconButton", "FilledTonalIconToggleButton", "IconButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "IconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OutlinedIconButton", "border", "Landroidx/compose/foundation/BorderStroke;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OutlinedIconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IconButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconButton(final Function0<Unit> function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        boolean z3;
        IconButtonColors iconButtonColors3;
        int currentCompositeKeyHash;
        Composer m2937constructorimpl;
        final IconButtonColors iconButtonColors4;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1142896114);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconButton)P(5,4,2!1,3)78@3867L18,79@3937L39,87@4239L5,94@4557L135,83@4057L857:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
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
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i7 = 2048;
                            i3 |= i7;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i7 = 1024;
                    i3 |= i7;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                iconButtonColors2 = IconButtonDefaults.INSTANCE.iconButtonColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                startRestartGroup.startReplaceableGroup(793644531);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):IconButton.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                i6 = i3;
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                modifier3 = modifier2;
                                z3 = z2;
                                iconButtonColors3 = iconButtonColors2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1142896114, i6, -1, "androidx.compose.material3.IconButton (IconButton.kt:81)");
                                }
                                int i9 = i6;
                                IconButtonColors iconButtonColors5 = iconButtonColors3;
                                Modifier m242clickableO2vRcR0$default = ClickableKt.m242clickableO2vRcR0$default(BackgroundKt.m210backgroundbw27NRU$default(ClipKt.clip(SizeKt.m611size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconButtonColors3.m1581containerColorvNxB06k$material3_release(z3), null, 2, null), mutableInteractionSource3, RippleKt.m1214rememberRipple9IZ8Weo(false, Dp.m5734constructorimpl(IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z3, null, Role.m5054boximpl(Role.INSTANCE.m5061getButtono7Vup1c()), function0, 8, null);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                startRestartGroup.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m242clickableO2vRcR0$default);
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                                Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1676789843, "C102@4824L84:IconButton.kt#uh7d8r");
                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3397boximpl(iconButtonColors5.m1582contentColorvNxB06k$material3_release(z3))), function2, startRestartGroup, ProvidedValue.$stable | ((i9 >> 12) & 112));
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                iconButtonColors4 = iconButtonColors5;
                                z4 = z3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                        }
                        z3 = z2;
                        iconButtonColors3 = iconButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i6 = i3;
                        modifier3 = modifier2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i92 = i6;
                        IconButtonColors iconButtonColors52 = iconButtonColors3;
                        Modifier m242clickableO2vRcR0$default2 = ClickableKt.m242clickableO2vRcR0$default(BackgroundKt.m210backgroundbw27NRU$default(ClipKt.clip(SizeKt.m611size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconButtonColors3.m1581containerColorvNxB06k$material3_release(z3), null, 2, null), mutableInteractionSource3, RippleKt.m1214rememberRipple9IZ8Weo(false, Dp.m5734constructorimpl(IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z3, null, Role.m5054boximpl(Role.INSTANCE.m5061getButtono7Vup1c()), function0, 8, null);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        startRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m242clickableO2vRcR0$default2);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                        Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m2937constructorimpl.getInserting()) {
                        }
                        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                        modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1676789843, "C102@4824L84:IconButton.kt#uh7d8r");
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3397boximpl(iconButtonColors52.m1582contentColorvNxB06k$material3_release(z3))), function2, startRestartGroup, ProvidedValue.$stable | ((i92 >> 12) & 112));
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier3;
                        iconButtonColors4 = iconButtonColors52;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z4 = z2;
                        iconButtonColors4 = iconButtonColors2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier4 = modifier2;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i10) {
                                IconButtonKt.IconButton(function0, modifier4, z4, iconButtonColors4, mutableInteractionSource4, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 32) == 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i5 != 0) {
                }
                z3 = z2;
                iconButtonColors3 = iconButtonColors2;
                mutableInteractionSource3 = mutableInteractionSource2;
                i6 = i3;
                modifier3 = modifier2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i922 = i6;
                IconButtonColors iconButtonColors522 = iconButtonColors3;
                Modifier m242clickableO2vRcR0$default22 = ClickableKt.m242clickableO2vRcR0$default(BackgroundKt.m210backgroundbw27NRU$default(ClipKt.clip(SizeKt.m611size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconButtonColors3.m1581containerColorvNxB06k$material3_release(z3), null, 2, null), mutableInteractionSource3, RippleKt.m1214rememberRipple9IZ8Weo(false, Dp.m5734constructorimpl(IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z3, null, Role.m5054boximpl(Role.INSTANCE.m5061getButtono7Vup1c()), function0, 8, null);
                Alignment center22 = Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(m242clickableO2vRcR0$default22);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m2937constructorimpl.getInserting()) {
                }
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                modifierMaterializerOf22.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1676789843, "C102@4824L84:IconButton.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3397boximpl(iconButtonColors522.m1582contentColorvNxB06k$material3_release(z3))), function2, startRestartGroup, ProvidedValue.$stable | ((i922 >> 12) & 112));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
                iconButtonColors4 = iconButtonColors522;
                z4 = z3;
                mutableInteractionSource4 = mutableInteractionSource3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            z3 = z2;
            iconButtonColors3 = iconButtonColors2;
            mutableInteractionSource3 = mutableInteractionSource2;
            i6 = i3;
            modifier3 = modifier2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i9222 = i6;
            IconButtonColors iconButtonColors5222 = iconButtonColors3;
            Modifier m242clickableO2vRcR0$default222 = ClickableKt.m242clickableO2vRcR0$default(BackgroundKt.m210backgroundbw27NRU$default(ClipKt.clip(SizeKt.m611size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconButtonColors3.m1581containerColorvNxB06k$material3_release(z3), null, 2, null), mutableInteractionSource3, RippleKt.m1214rememberRipple9IZ8Weo(false, Dp.m5734constructorimpl(IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z3, null, Role.m5054boximpl(Role.INSTANCE.m5061getButtono7Vup1c()), function0, 8, null);
            Alignment center222 = Alignment.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(m242clickableO2vRcR0$default222);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m2937constructorimpl.getInserting()) {
            }
            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            modifierMaterializerOf222.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1676789843, "C102@4824L84:IconButton.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3397boximpl(iconButtonColors5222.m1582contentColorvNxB06k$material3_release(z3))), function2, startRestartGroup, ProvidedValue.$stable | ((i9222 >> 12) & 112));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
            iconButtonColors4 = iconButtonColors5222;
            z4 = z3;
            mutableInteractionSource4 = mutableInteractionSource3;
            endRestartGroup = startRestartGroup.endRestartGroup();
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
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        z3 = z2;
        iconButtonColors3 = iconButtonColors2;
        mutableInteractionSource3 = mutableInteractionSource2;
        i6 = i3;
        modifier3 = modifier2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i92222 = i6;
        IconButtonColors iconButtonColors52222 = iconButtonColors3;
        Modifier m242clickableO2vRcR0$default2222 = ClickableKt.m242clickableO2vRcR0$default(BackgroundKt.m210backgroundbw27NRU$default(ClipKt.clip(SizeKt.m611size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconButtonColors3.m1581containerColorvNxB06k$material3_release(z3), null, 2, null), mutableInteractionSource3, RippleKt.m1214rememberRipple9IZ8Weo(false, Dp.m5734constructorimpl(IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z3, null, Role.m5054boximpl(Role.INSTANCE.m5061getButtono7Vup1c()), function0, 8, null);
        Alignment center2222 = Alignment.INSTANCE.getCenter();
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(center2222, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2222 = LayoutKt.modifierMaterializerOf(m242clickableO2vRcR0$default2222);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
        Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m2937constructorimpl.getInserting()) {
        }
        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        modifierMaterializerOf2222.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1676789843, "C102@4824L84:IconButton.kt#uh7d8r");
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3397boximpl(iconButtonColors52222.m1582contentColorvNxB06k$material3_release(z3))), function2, startRestartGroup, ProvidedValue.$stable | ((i92222 >> 12) & 112));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3;
        iconButtonColors4 = iconButtonColors52222;
        z4 = z3;
        mutableInteractionSource4 = mutableInteractionSource3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        boolean z4;
        IconToggleButtonColors iconToggleButtonColors3;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        IconToggleButtonColors iconToggleButtonColors4;
        Composer composer2;
        int currentCompositeKeyHash;
        Composer m2937constructorimpl;
        final boolean z5;
        final IconToggleButtonColors iconToggleButtonColors5;
        final Modifier modifier4;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(692561811);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconToggleButton)P(!1,6,5,3!1,4)140@6931L24,141@7007L39,149@7309L5,150@7355L32,157@7692L135,145@7127L937:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((196608 & i) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                        z4 = i4 != 0 ? true : z3;
                        if ((i2 & 16) != 0) {
                            iconToggleButtonColors3 = IconButtonDefaults.INSTANCE.m1593iconToggleButtonColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                            i3 &= -57345;
                        } else {
                            iconToggleButtonColors3 = iconToggleButtonColors2;
                        }
                        if (i5 != 0) {
                            startRestartGroup.startReplaceableGroup(155032829);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):IconButton.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            modifier3 = companion;
                            iconToggleButtonColors4 = iconToggleButtonColors3;
                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier3 = companion;
                            iconToggleButtonColors4 = iconToggleButtonColors3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        modifier3 = modifier2;
                        z4 = z3;
                        iconToggleButtonColors4 = iconToggleButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(692561811, i3, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:143)");
                    }
                    int i8 = ((i3 >> 9) & 14) | ((i3 << 3) & 112) | ((i3 >> 6) & 896);
                    int i9 = i3;
                    IconToggleButtonColors iconToggleButtonColors6 = iconToggleButtonColors4;
                    boolean z6 = z4;
                    composer2 = startRestartGroup;
                    Modifier m807toggleableO2vRcR0 = ToggleableKt.m807toggleableO2vRcR0(BackgroundKt.m210backgroundbw27NRU$default(ClipKt.clip(SizeKt.m611size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconToggleButtonColors4.containerColor$material3_release(z4, z, startRestartGroup, i8).getValue().m3417unboximpl(), null, 2, null), z, mutableInteractionSource3, RippleKt.m1214rememberRipple9IZ8Weo(false, Dp.m5734constructorimpl(IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z4, Role.m5054boximpl(Role.INSTANCE.m5062getCheckboxo7Vup1c()), function1);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m807toggleableO2vRcR0);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                    Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 165225886, "C164@7929L30,165@7974L84:IconButton.kt#uh7d8r");
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3397boximpl(iconToggleButtonColors6.contentColor$material3_release(z6, z, composer2, i8).getValue().m3417unboximpl())), function2, composer2, ProvidedValue.$stable | ((i9 >> 15) & 112));
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z6;
                    iconToggleButtonColors5 = iconToggleButtonColors6;
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    z5 = z3;
                    iconToggleButtonColors5 = iconToggleButtonColors2;
                    composer2 = startRestartGroup;
                    mutableInteractionSource4 = mutableInteractionSource2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$IconToggleButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            IconButtonKt.IconToggleButton(z, function1, modifier4, z5, iconToggleButtonColors5, mutableInteractionSource4, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((599187 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i82 = ((i3 >> 9) & 14) | ((i3 << 3) & 112) | ((i3 >> 6) & 896);
            int i92 = i3;
            IconToggleButtonColors iconToggleButtonColors62 = iconToggleButtonColors4;
            boolean z62 = z4;
            composer2 = startRestartGroup;
            Modifier m807toggleableO2vRcR02 = ToggleableKt.m807toggleableO2vRcR0(BackgroundKt.m210backgroundbw27NRU$default(ClipKt.clip(SizeKt.m611size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconToggleButtonColors4.containerColor$material3_release(z4, z, startRestartGroup, i82).getValue().m3417unboximpl(), null, 2, null), z, mutableInteractionSource3, RippleKt.m1214rememberRipple9IZ8Weo(false, Dp.m5734constructorimpl(IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z4, Role.m5054boximpl(Role.INSTANCE.m5062getCheckboxo7Vup1c()), function1);
            Alignment center2 = Alignment.INSTANCE.getCenter();
            composer2.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m807toggleableO2vRcR02);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            m2937constructorimpl = Updater.m2937constructorimpl(composer2);
            Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m2937constructorimpl.getInserting()) {
            }
            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 165225886, "C164@7929L30,165@7974L84:IconButton.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3397boximpl(iconToggleButtonColors62.contentColor$material3_release(z62, z, composer2, i82).getValue().m3417unboximpl())), function2, composer2, ProvidedValue.$stable | ((i92 >> 15) & 112));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z62;
            iconToggleButtonColors5 = iconToggleButtonColors62;
            modifier4 = modifier3;
            mutableInteractionSource4 = mutableInteractionSource3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i822 = ((i3 >> 9) & 14) | ((i3 << 3) & 112) | ((i3 >> 6) & 896);
        int i922 = i3;
        IconToggleButtonColors iconToggleButtonColors622 = iconToggleButtonColors4;
        boolean z622 = z4;
        composer2 = startRestartGroup;
        Modifier m807toggleableO2vRcR022 = ToggleableKt.m807toggleableO2vRcR0(BackgroundKt.m210backgroundbw27NRU$default(ClipKt.clip(SizeKt.m611size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(IconButtonTokens.INSTANCE.getStateLayerShape(), startRestartGroup, 6)), iconToggleButtonColors4.containerColor$material3_release(z4, z, startRestartGroup, i822).getValue().m3417unboximpl(), null, 2, null), z, mutableInteractionSource3, RippleKt.m1214rememberRipple9IZ8Weo(false, Dp.m5734constructorimpl(IconButtonTokens.INSTANCE.m2592getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z4, Role.m5054boximpl(Role.INSTANCE.m5062getCheckboxo7Vup1c()), function1);
        Alignment center22 = Alignment.INSTANCE.getCenter();
        composer2.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(m807toggleableO2vRcR022);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        m2937constructorimpl = Updater.m2937constructorimpl(composer2);
        Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m2937constructorimpl.getInserting()) {
        }
        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        modifierMaterializerOf22.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer2, 165225886, "C164@7929L30,165@7974L84:IconButton.kt#uh7d8r");
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3397boximpl(iconToggleButtonColors622.contentColor$material3_release(z622, z, composer2, i822).getValue().m3417unboximpl())), function2, composer2, ProvidedValue.$stable | ((i922 >> 15) & 112));
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z622;
        iconToggleButtonColors5 = iconToggleButtonColors622;
        modifier4 = modifier3;
        mutableInteractionSource4 = mutableInteractionSource3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledIconButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Modifier.Companion companion;
        boolean z3;
        Shape shape3;
        IconButtonColors iconButtonColors3;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        IconButtonColors iconButtonColors4;
        final IconButtonColors iconButtonColors5;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1594730011);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledIconButton)P(5,4,2,6!1,3)203@10017L11,204@10080L24,205@10156L39,207@10237L429:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
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
                            i8 = 2048;
                            i3 |= i8;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i8 = 1024;
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((196608 & i) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                        z3 = i4 != 0 ? true : z2;
                        if ((i2 & 8) != 0) {
                            shape3 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                            i3 &= -7169;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            iconButtonColors3 = IconButtonDefaults.INSTANCE.m1588filledIconButtonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                            i3 &= -57345;
                        } else {
                            iconButtonColors3 = iconButtonColors2;
                        }
                        if (i5 != 0) {
                            startRestartGroup.startReplaceableGroup(825486780);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):IconButton.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        IconButtonColors iconButtonColors6 = iconButtonColors3;
                        i6 = i3;
                        iconButtonColors4 = iconButtonColors6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        companion = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i6 = i3;
                        iconButtonColors4 = iconButtonColors2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1594730011, i6, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:207)");
                    }
                    SurfaceKt.m1980Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5061getButtono7Vup1c());
                        }
                    }, 1, null), z3, shape3, iconButtonColors4.m1581containerColorvNxB06k$material3_release(z3), iconButtonColors4.m1582contentColorvNxB06k$material3_release(z3), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, -1560623888, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            ComposerKt.sourceInformation(composer2, "C216@10512L152:IconButton.kt#uh7d8r");
                            if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1560623888, i10, -1, "androidx.compose.material3.FilledIconButton.<anonymous> (IconButton.kt:216)");
                                }
                                Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, FilledIconButtonTokens.INSTANCE.m2556getContainerSizeD9Ej5fM());
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2<Composer, Integer, Unit> function22 = function2;
                                composer2.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                                Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, -1557816725, "C220@10649L9:IconButton.kt#uh7d8r");
                                function22.invoke(composer2, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, (i6 & 8078) | ((i6 << 12) & 1879048192), 6, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z5 = z3;
                    iconButtonColors5 = iconButtonColors4;
                    z4 = z5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    z4 = z2;
                    shape3 = shape2;
                    iconButtonColors5 = iconButtonColors2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = companion;
                    final Shape shape4 = shape3;
                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            IconButtonKt.FilledIconButton(function0, modifier3, z4, shape4, iconButtonColors5, mutableInteractionSource4, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((599187 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            IconButtonColors iconButtonColors62 = iconButtonColors3;
            i6 = i3;
            iconButtonColors4 = iconButtonColors62;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            SurfaceKt.m1980Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5061getButtono7Vup1c());
                }
            }, 1, null), z3, shape3, iconButtonColors4.m1581containerColorvNxB06k$material3_release(z3), iconButtonColors4.m1582contentColorvNxB06k$material3_release(z3), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, -1560623888, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    ComposerKt.sourceInformation(composer2, "C216@10512L152:IconButton.kt#uh7d8r");
                    if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1560623888, i10, -1, "androidx.compose.material3.FilledIconButton.<anonymous> (IconButton.kt:216)");
                        }
                        Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, FilledIconButtonTokens.INSTANCE.m2556getContainerSizeD9Ej5fM());
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Function2<Composer, Integer, Unit> function22 = function2;
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                        Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1557816725, "C220@10649L9:IconButton.kt#uh7d8r");
                        function22.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i6 & 8078) | ((i6 << 12) & 1879048192), 6, 448);
            if (ComposerKt.isTraceInProgress()) {
            }
            boolean z52 = z3;
            iconButtonColors5 = iconButtonColors4;
            z4 = z52;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
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
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        IconButtonColors iconButtonColors622 = iconButtonColors3;
        i6 = i3;
        iconButtonColors4 = iconButtonColors622;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        SurfaceKt.m1980Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5061getButtono7Vup1c());
            }
        }, 1, null), z3, shape3, iconButtonColors4.m1581containerColorvNxB06k$material3_release(z3), iconButtonColors4.m1582contentColorvNxB06k$material3_release(z3), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, -1560623888, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i10) {
                ComposerKt.sourceInformation(composer2, "C216@10512L152:IconButton.kt#uh7d8r");
                if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1560623888, i10, -1, "androidx.compose.material3.FilledIconButton.<anonymous> (IconButton.kt:216)");
                    }
                    Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, FilledIconButtonTokens.INSTANCE.m2556getContainerSizeD9Ej5fM());
                    Alignment center = Alignment.INSTANCE.getCenter();
                    Function2<Composer, Integer, Unit> function22 = function2;
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                    Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1557816725, "C220@10649L9:IconButton.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i6 & 8078) | ((i6 << 12) & 1879048192), 6, 448);
        if (ComposerKt.isTraceInProgress()) {
        }
        boolean z522 = z3;
        iconButtonColors5 = iconButtonColors4;
        z4 = z522;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalIconButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Modifier.Companion companion;
        boolean z3;
        Shape shape3;
        IconButtonColors iconButtonColors3;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        IconButtonColors iconButtonColors4;
        final IconButtonColors iconButtonColors5;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-783937767);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledTonalIconButton)P(5,4,2,6!1,3)263@12954L11,264@13017L29,265@13098L39,267@13179L434:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
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
                            i8 = 2048;
                            i3 |= i8;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i8 = 1024;
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((196608 & i) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                        z3 = i4 != 0 ? true : z2;
                        if ((i2 & 8) != 0) {
                            shape3 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                            i3 &= -7169;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            iconButtonColors3 = IconButtonDefaults.INSTANCE.m1590filledTonalIconButtonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                            i3 &= -57345;
                        } else {
                            iconButtonColors3 = iconButtonColors2;
                        }
                        if (i5 != 0) {
                            startRestartGroup.startReplaceableGroup(1459260166);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):IconButton.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        IconButtonColors iconButtonColors6 = iconButtonColors3;
                        i6 = i3;
                        iconButtonColors4 = iconButtonColors6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        companion = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i6 = i3;
                        iconButtonColors4 = iconButtonColors2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-783937767, i6, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:267)");
                    }
                    SurfaceKt.m1980Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5061getButtono7Vup1c());
                        }
                    }, 1, null), z3, shape3, iconButtonColors4.m1581containerColorvNxB06k$material3_release(z3), iconButtonColors4.m1582contentColorvNxB06k$material3_release(z3), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, -1772884636, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            ComposerKt.sourceInformation(composer2, "C276@13454L157:IconButton.kt#uh7d8r");
                            if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1772884636, i10, -1, "androidx.compose.material3.FilledTonalIconButton.<anonymous> (IconButton.kt:276)");
                                }
                                Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, FilledTonalIconButtonTokens.INSTANCE.m2572getContainerSizeD9Ej5fM());
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2<Composer, Integer, Unit> function22 = function2;
                                composer2.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                                Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, 151425978, "C280@13596L9:IconButton.kt#uh7d8r");
                                function22.invoke(composer2, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, (i6 & 8078) | ((i6 << 12) & 1879048192), 6, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z5 = z3;
                    iconButtonColors5 = iconButtonColors4;
                    z4 = z5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    z4 = z2;
                    shape3 = shape2;
                    iconButtonColors5 = iconButtonColors2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = companion;
                    final Shape shape4 = shape3;
                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            IconButtonKt.FilledTonalIconButton(function0, modifier3, z4, shape4, iconButtonColors5, mutableInteractionSource4, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((599187 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            IconButtonColors iconButtonColors62 = iconButtonColors3;
            i6 = i3;
            iconButtonColors4 = iconButtonColors62;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            SurfaceKt.m1980Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5061getButtono7Vup1c());
                }
            }, 1, null), z3, shape3, iconButtonColors4.m1581containerColorvNxB06k$material3_release(z3), iconButtonColors4.m1582contentColorvNxB06k$material3_release(z3), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, -1772884636, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    ComposerKt.sourceInformation(composer2, "C276@13454L157:IconButton.kt#uh7d8r");
                    if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1772884636, i10, -1, "androidx.compose.material3.FilledTonalIconButton.<anonymous> (IconButton.kt:276)");
                        }
                        Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, FilledTonalIconButtonTokens.INSTANCE.m2572getContainerSizeD9Ej5fM());
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Function2<Composer, Integer, Unit> function22 = function2;
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                        Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 151425978, "C280@13596L9:IconButton.kt#uh7d8r");
                        function22.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i6 & 8078) | ((i6 << 12) & 1879048192), 6, 448);
            if (ComposerKt.isTraceInProgress()) {
            }
            boolean z52 = z3;
            iconButtonColors5 = iconButtonColors4;
            z4 = z52;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
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
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        IconButtonColors iconButtonColors622 = iconButtonColors3;
        i6 = i3;
        iconButtonColors4 = iconButtonColors622;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        SurfaceKt.m1980Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5061getButtono7Vup1c());
            }
        }, 1, null), z3, shape3, iconButtonColors4.m1581containerColorvNxB06k$material3_release(z3), iconButtonColors4.m1582contentColorvNxB06k$material3_release(z3), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, -1772884636, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i10) {
                ComposerKt.sourceInformation(composer2, "C276@13454L157:IconButton.kt#uh7d8r");
                if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1772884636, i10, -1, "androidx.compose.material3.FilledTonalIconButton.<anonymous> (IconButton.kt:276)");
                    }
                    Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, FilledTonalIconButtonTokens.INSTANCE.m2572getContainerSizeD9Ej5fM());
                    Alignment center = Alignment.INSTANCE.getCenter();
                    Function2<Composer, Integer, Unit> function22 = function2;
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                    Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 151425978, "C280@13596L9:IconButton.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i6 & 8078) | ((i6 << 12) & 1879048192), 6, 448);
        if (ComposerKt.isTraceInProgress()) {
        }
        boolean z522 = z3;
        iconButtonColors5 = iconButtonColors4;
        z4 = z522;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Modifier.Companion companion;
        Shape shape3;
        IconToggleButtonColors iconToggleButtonColors3;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        Shape shape4;
        IconToggleButtonColors iconToggleButtonColors4;
        boolean z4;
        Composer composer2;
        final Shape shape5;
        final MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier2;
        final IconToggleButtonColors iconToggleButtonColors5;
        final boolean z5;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1708189280);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledIconToggleButton)P(!1,6,5,3,7!1,4)321@15769L11,322@15838L30,323@15920L39,331@16193L32,332@16259L30,325@16001L500:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i7 = 131072;
                            i3 |= i7;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i7 = 65536;
                    i3 |= i7;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    if ((4793491 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i9 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) == 0) {
                                shape3 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i2 & 32) == 0) {
                                iconToggleButtonColors3 = IconButtonDefaults.INSTANCE.m1589filledIconToggleButtonColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                                i3 &= -458753;
                            } else {
                                iconToggleButtonColors3 = iconToggleButtonColors2;
                            }
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(1287876812);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):IconButton.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                i6 = i3;
                                shape4 = shape3;
                                z4 = z3;
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                iconToggleButtonColors4 = iconToggleButtonColors3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1708189280, i6, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:325)");
                                }
                                int i10 = i6 >> 9;
                                int i11 = (i10 & 14) | ((i6 << 3) & 112) | (i10 & 896);
                                Modifier modifier3 = companion;
                                IconToggleButtonColors iconToggleButtonColors6 = iconToggleButtonColors4;
                                boolean z6 = z4;
                                composer2 = startRestartGroup;
                                SurfaceKt.m1979Surfaced85dljk(z, function1, SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5062getCheckboxo7Vup1c());
                                    }
                                }, 1, null), z6, shape4, iconToggleButtonColors4.containerColor$material3_release(z4, z, startRestartGroup, i11).getValue().m3417unboximpl(), iconToggleButtonColors4.contentColor$material3_release(z4, z, startRestartGroup, i11).getValue().m3417unboximpl(), 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 1235871670, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i12) {
                                        ComposerKt.sourceInformation(composer3, "C335@16347L152:IconButton.kt#uh7d8r");
                                        if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1235871670, i12, -1, "androidx.compose.material3.FilledIconToggleButton.<anonymous> (IconButton.kt:335)");
                                            }
                                            Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, FilledIconButtonTokens.INSTANCE.m2556getContainerSizeD9Ej5fM());
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function22 = function2;
                                            composer3.startReplaceableGroup(733328855);
                                            ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                            composer3.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer m2937constructorimpl = Updater.m2937constructorimpl(composer3);
                                            Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 1822112194, "C339@16484L9:IconButton.kt#uh7d8r");
                                            function22.invoke(composer3, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 64638 & i6, ((i6 >> 18) & 14) | 48, 896);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                shape5 = shape4;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier2 = modifier3;
                                iconToggleButtonColors5 = iconToggleButtonColors6;
                                z5 = z6;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                i6 = i3;
                                shape4 = shape3;
                                iconToggleButtonColors4 = iconToggleButtonColors3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            companion = modifier;
                            shape4 = shape2;
                            iconToggleButtonColors4 = iconToggleButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i6 = i3;
                        }
                        z4 = z3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = i6 >> 9;
                        int i112 = (i102 & 14) | ((i6 << 3) & 112) | (i102 & 896);
                        Modifier modifier32 = companion;
                        IconToggleButtonColors iconToggleButtonColors62 = iconToggleButtonColors4;
                        boolean z62 = z4;
                        composer2 = startRestartGroup;
                        SurfaceKt.m1979Surfaced85dljk(z, function1, SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5062getCheckboxo7Vup1c());
                            }
                        }, 1, null), z62, shape4, iconToggleButtonColors4.containerColor$material3_release(z4, z, startRestartGroup, i112).getValue().m3417unboximpl(), iconToggleButtonColors4.contentColor$material3_release(z4, z, startRestartGroup, i112).getValue().m3417unboximpl(), 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 1235871670, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                ComposerKt.sourceInformation(composer3, "C335@16347L152:IconButton.kt#uh7d8r");
                                if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1235871670, i12, -1, "androidx.compose.material3.FilledIconToggleButton.<anonymous> (IconButton.kt:335)");
                                    }
                                    Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, FilledIconButtonTokens.INSTANCE.m2556getContainerSizeD9Ej5fM());
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    Function2<Composer, Integer, Unit> function22 = function2;
                                    composer3.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m2937constructorimpl = Updater.m2937constructorimpl(composer3);
                                    Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 1822112194, "C339@16484L9:IconButton.kt#uh7d8r");
                                    function22.invoke(composer3, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 64638 & i6, ((i6 >> 18) & 14) | 48, 896);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        shape5 = shape4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier2 = modifier32;
                        iconToggleButtonColors5 = iconToggleButtonColors62;
                        z5 = z62;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        composer2 = startRestartGroup;
                        z5 = z3;
                        shape5 = shape2;
                        iconToggleButtonColors5 = iconToggleButtonColors2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                IconButtonKt.FilledIconToggleButton(z, function1, modifier2, z5, shape5, iconToggleButtonColors5, mutableInteractionSource4, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 128) == 0) {
                }
                if ((4793491 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i5 == 0) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 128) == 0) {
            }
            if ((4793491 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if (i5 == 0) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 128) == 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i5 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Modifier.Companion companion;
        Shape shape3;
        IconToggleButtonColors iconToggleButtonColors3;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        Shape shape4;
        IconToggleButtonColors iconToggleButtonColors4;
        boolean z4;
        Composer composer2;
        final Shape shape5;
        final MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier2;
        final IconToggleButtonColors iconToggleButtonColors5;
        final boolean z5;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1676089246);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledTonalIconToggleButton)P(!1,6,5,3,7!1,4)385@19013L11,386@19082L35,387@19169L39,395@19442L32,396@19508L30,389@19250L505:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i7 = 131072;
                            i3 |= i7;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i7 = 65536;
                    i3 |= i7;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    if ((4793491 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i9 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) == 0) {
                                shape3 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i2 & 32) == 0) {
                                iconToggleButtonColors3 = IconButtonDefaults.INSTANCE.m1591filledTonalIconToggleButtonColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                                i3 &= -458753;
                            } else {
                                iconToggleButtonColors3 = iconToggleButtonColors2;
                            }
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(353404489);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):IconButton.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                i6 = i3;
                                shape4 = shape3;
                                z4 = z3;
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                iconToggleButtonColors4 = iconToggleButtonColors3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1676089246, i6, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:389)");
                                }
                                int i10 = i6 >> 9;
                                int i11 = (i10 & 14) | ((i6 << 3) & 112) | (i10 & 896);
                                Modifier modifier3 = companion;
                                IconToggleButtonColors iconToggleButtonColors6 = iconToggleButtonColors4;
                                boolean z6 = z4;
                                composer2 = startRestartGroup;
                                SurfaceKt.m1979Surfaced85dljk(z, function1, SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5062getCheckboxo7Vup1c());
                                    }
                                }, 1, null), z6, shape4, iconToggleButtonColors4.containerColor$material3_release(z4, z, startRestartGroup, i11).getValue().m3417unboximpl(), iconToggleButtonColors4.contentColor$material3_release(z4, z, startRestartGroup, i11).getValue().m3417unboximpl(), 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, -58218680, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i12) {
                                        ComposerKt.sourceInformation(composer3, "C399@19596L157:IconButton.kt#uh7d8r");
                                        if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-58218680, i12, -1, "androidx.compose.material3.FilledTonalIconToggleButton.<anonymous> (IconButton.kt:399)");
                                            }
                                            Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, FilledTonalIconButtonTokens.INSTANCE.m2572getContainerSizeD9Ej5fM());
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function22 = function2;
                                            composer3.startReplaceableGroup(733328855);
                                            ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                            composer3.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer m2937constructorimpl = Updater.m2937constructorimpl(composer3);
                                            Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 919448388, "C403@19738L9:IconButton.kt#uh7d8r");
                                            function22.invoke(composer3, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 64638 & i6, ((i6 >> 18) & 14) | 48, 896);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                shape5 = shape4;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier2 = modifier3;
                                iconToggleButtonColors5 = iconToggleButtonColors6;
                                z5 = z6;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                i6 = i3;
                                shape4 = shape3;
                                iconToggleButtonColors4 = iconToggleButtonColors3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            companion = modifier;
                            shape4 = shape2;
                            iconToggleButtonColors4 = iconToggleButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i6 = i3;
                        }
                        z4 = z3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = i6 >> 9;
                        int i112 = (i102 & 14) | ((i6 << 3) & 112) | (i102 & 896);
                        Modifier modifier32 = companion;
                        IconToggleButtonColors iconToggleButtonColors62 = iconToggleButtonColors4;
                        boolean z62 = z4;
                        composer2 = startRestartGroup;
                        SurfaceKt.m1979Surfaced85dljk(z, function1, SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5062getCheckboxo7Vup1c());
                            }
                        }, 1, null), z62, shape4, iconToggleButtonColors4.containerColor$material3_release(z4, z, startRestartGroup, i112).getValue().m3417unboximpl(), iconToggleButtonColors4.contentColor$material3_release(z4, z, startRestartGroup, i112).getValue().m3417unboximpl(), 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, -58218680, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                ComposerKt.sourceInformation(composer3, "C399@19596L157:IconButton.kt#uh7d8r");
                                if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-58218680, i12, -1, "androidx.compose.material3.FilledTonalIconToggleButton.<anonymous> (IconButton.kt:399)");
                                    }
                                    Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, FilledTonalIconButtonTokens.INSTANCE.m2572getContainerSizeD9Ej5fM());
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    Function2<Composer, Integer, Unit> function22 = function2;
                                    composer3.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m2937constructorimpl = Updater.m2937constructorimpl(composer3);
                                    Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 919448388, "C403@19738L9:IconButton.kt#uh7d8r");
                                    function22.invoke(composer3, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 64638 & i6, ((i6 >> 18) & 14) | 48, 896);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        shape5 = shape4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier2 = modifier32;
                        iconToggleButtonColors5 = iconToggleButtonColors62;
                        z5 = z62;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        composer2 = startRestartGroup;
                        z5 = z3;
                        shape5 = shape2;
                        iconToggleButtonColors5 = iconToggleButtonColors2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                IconButtonKt.FilledTonalIconToggleButton(z, function1, modifier2, z5, shape5, iconToggleButtonColors5, mutableInteractionSource4, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 128) == 0) {
                }
                if ((4793491 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i5 == 0) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 128) == 0) {
            }
            if ((4793491 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if (i5 == 0) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 128) == 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i5 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00de  */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedIconButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        BorderStroke borderStroke2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape3;
        boolean z3;
        IconButtonColors iconButtonColors3;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        BorderStroke borderStroke4;
        ?? r4;
        final Shape shape4;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1746603025);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedIconButton)P(6,5,3,7,1!1,4)449@22175L13,450@22240L26,451@22315L33,452@22400L39,454@22481L452:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
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
                            i8 = 2048;
                            i3 |= i8;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i8 = 1024;
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                if ((196608 & i) == 0) {
                    borderStroke2 = borderStroke;
                    i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(borderStroke2)) ? 131072 : 65536;
                } else {
                    borderStroke2 = borderStroke;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            shape3 = IconButtonDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                            i3 &= -7169;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            z3 = true;
                            iconButtonColors3 = IconButtonDefaults.INSTANCE.m1594outlinedIconButtonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                            i3 &= -57345;
                        } else {
                            z3 = true;
                            iconButtonColors3 = iconButtonColors2;
                        }
                        if ((i2 & 32) != 0) {
                            borderStroke3 = IconButtonDefaults.INSTANCE.outlinedIconButtonBorder(z2, startRestartGroup, ((i3 >> 6) & 14) | 48);
                            i3 &= -458753;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i5 != 0) {
                            startRestartGroup.startReplaceableGroup(1332264784);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):IconButton.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        BorderStroke borderStroke5 = borderStroke3;
                        i6 = i3;
                        borderStroke4 = borderStroke5;
                        r4 = z3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        shape3 = shape2;
                        iconButtonColors3 = iconButtonColors2;
                        r4 = 1;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i6 = i3;
                        borderStroke4 = borderStroke2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1746603025, i6, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:454)");
                    }
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconButton$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5061getButtono7Vup1c());
                        }
                    }, r4, null);
                    long m1581containerColorvNxB06k$material3_release = iconButtonColors3.m1581containerColorvNxB06k$material3_release(z2);
                    long m1582contentColorvNxB06k$material3_release = iconButtonColors3.m1582contentColorvNxB06k$material3_release(z2);
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 582332538, r4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            ComposerKt.sourceInformation(composer2, "C464@22777L154:IconButton.kt#uh7d8r");
                            if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(582332538, i10, -1, "androidx.compose.material3.OutlinedIconButton.<anonymous> (IconButton.kt:464)");
                                }
                                Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, OutlinedIconButtonTokens.INSTANCE.m2659getContainerSizeD9Ej5fM());
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2<Composer, Integer, Unit> function22 = function2;
                                composer2.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                                Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, -369021930, "C468@22916L9:IconButton.kt#uh7d8r");
                                function22.invoke(composer2, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    });
                    int i10 = i6 & 8078;
                    int i11 = i6 << 9;
                    SurfaceKt.m1980Surfaceo_FOJdg(function0, semantics$default, z2, shape3, m1581containerColorvNxB06k$material3_release, m1582contentColorvNxB06k$material3_release, 0.0f, 0.0f, borderStroke4, mutableInteractionSource3, composableLambda, startRestartGroup, i10 | (234881024 & i11) | (i11 & 1879048192), 6, 192);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke2 = borderStroke4;
                    z4 = z2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z4 = z2;
                    shape4 = shape2;
                    iconButtonColors3 = iconButtonColors2;
                    mutableInteractionSource4 = mutableInteractionSource2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    final IconButtonColors iconButtonColors4 = iconButtonColors3;
                    final BorderStroke borderStroke6 = borderStroke2;
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconButton$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i12) {
                            IconButtonKt.OutlinedIconButton(function0, modifier3, z4, shape4, iconButtonColors4, borderStroke6, mutableInteractionSource4, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((4793491 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i5 != 0) {
            }
            BorderStroke borderStroke52 = borderStroke3;
            i6 = i3;
            borderStroke4 = borderStroke52;
            r4 = z3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier semantics$default2 = SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconButton$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5061getButtono7Vup1c());
                }
            }, r4, null);
            long m1581containerColorvNxB06k$material3_release2 = iconButtonColors3.m1581containerColorvNxB06k$material3_release(z2);
            long m1582contentColorvNxB06k$material3_release2 = iconButtonColors3.m1582contentColorvNxB06k$material3_release(z2);
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 582332538, r4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i102) {
                    ComposerKt.sourceInformation(composer2, "C464@22777L154:IconButton.kt#uh7d8r");
                    if ((i102 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(582332538, i102, -1, "androidx.compose.material3.OutlinedIconButton.<anonymous> (IconButton.kt:464)");
                        }
                        Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, OutlinedIconButtonTokens.INSTANCE.m2659getContainerSizeD9Ej5fM());
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Function2<Composer, Integer, Unit> function22 = function2;
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                        Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -369021930, "C468@22916L9:IconButton.kt#uh7d8r");
                        function22.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            });
            int i102 = i6 & 8078;
            int i112 = i6 << 9;
            SurfaceKt.m1980Surfaceo_FOJdg(function0, semantics$default2, z2, shape3, m1581containerColorvNxB06k$material3_release2, m1582contentColorvNxB06k$material3_release2, 0.0f, 0.0f, borderStroke4, mutableInteractionSource3, composableLambda2, startRestartGroup, i102 | (234881024 & i112) | (i112 & 1879048192), 6, 192);
            if (ComposerKt.isTraceInProgress()) {
            }
            shape4 = shape3;
            borderStroke2 = borderStroke4;
            z4 = z2;
            mutableInteractionSource4 = mutableInteractionSource3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
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
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i5 != 0) {
        }
        BorderStroke borderStroke522 = borderStroke3;
        i6 = i3;
        borderStroke4 = borderStroke522;
        r4 = z3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier semantics$default22 = SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconButton$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5061getButtono7Vup1c());
            }
        }, r4, null);
        long m1581containerColorvNxB06k$material3_release22 = iconButtonColors3.m1581containerColorvNxB06k$material3_release(z2);
        long m1582contentColorvNxB06k$material3_release22 = iconButtonColors3.m1582contentColorvNxB06k$material3_release(z2);
        ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 582332538, r4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconButton$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i1022) {
                ComposerKt.sourceInformation(composer2, "C464@22777L154:IconButton.kt#uh7d8r");
                if ((i1022 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(582332538, i1022, -1, "androidx.compose.material3.OutlinedIconButton.<anonymous> (IconButton.kt:464)");
                    }
                    Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, OutlinedIconButtonTokens.INSTANCE.m2659getContainerSizeD9Ej5fM());
                    Alignment center = Alignment.INSTANCE.getCenter();
                    Function2<Composer, Integer, Unit> function22 = function2;
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                    Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -369021930, "C468@22916L9:IconButton.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        });
        int i1022 = i6 & 8078;
        int i1122 = i6 << 9;
        SurfaceKt.m1980Surfaceo_FOJdg(function0, semantics$default22, z2, shape3, m1581containerColorvNxB06k$material3_release22, m1582contentColorvNxB06k$material3_release22, 0.0f, 0.0f, borderStroke4, mutableInteractionSource3, composableLambda22, startRestartGroup, i1022 | (234881024 & i1122) | (i1122 & 1879048192), 6, 192);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape4 = shape3;
        borderStroke2 = borderStroke4;
        z4 = z2;
        mutableInteractionSource4 = mutableInteractionSource3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        BorderStroke borderStroke2;
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        Shape shape3;
        BorderStroke borderStroke3;
        Modifier modifier2;
        boolean z4;
        Composer composer2;
        final Shape shape4;
        final BorderStroke borderStroke4;
        final MutableInteractionSource mutableInteractionSource3;
        final boolean z5;
        final Modifier modifier3;
        final IconToggleButtonColors iconToggleButtonColors3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1470292106);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedIconToggleButton)P(1,7,6,4,8,2!1,5)511@25267L13,512@25338L32,513@25419L48,514@25519L39,522@25792L32,523@25858L30,516@25600L523:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i9 = 131072;
                            i3 |= i9;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i9 = 65536;
                    i3 |= i9;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        borderStroke2 = borderStroke;
                        if (startRestartGroup.changed(borderStroke2)) {
                            i8 = 1048576;
                            i3 |= i8;
                        }
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i8 = 524288;
                    i3 |= i8;
                } else {
                    borderStroke2 = borderStroke;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i11 != 0 ? Modifier.INSTANCE : modifier;
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            shape2 = IconButtonDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                        }
                        if ((i2 & 32) != 0) {
                            i6 = i5;
                            i3 &= -458753;
                            iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.m1595outlinedIconToggleButtonColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                        } else {
                            i6 = i5;
                        }
                        if ((i2 & 64) != 0) {
                            BorderStroke outlinedIconToggleButtonBorder = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonBorder(z3, z, startRestartGroup, ((i3 >> 9) & 14) | 384 | ((i3 << 3) & 112));
                            i3 &= -3670017;
                            borderStroke2 = outlinedIconToggleButtonBorder;
                        }
                        if (i6 != 0) {
                            startRestartGroup.startReplaceableGroup(1810360331);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):IconButton.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            i7 = i3;
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            i7 = i3;
                        }
                        shape3 = shape2;
                        borderStroke3 = borderStroke2;
                        modifier2 = companion;
                        z4 = z3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        mutableInteractionSource2 = mutableInteractionSource;
                        i7 = i3;
                        z4 = z3;
                        shape3 = shape2;
                        borderStroke3 = borderStroke2;
                        modifier2 = modifier;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1470292106, i7, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:516)");
                    }
                    int i12 = i7 >> 9;
                    int i13 = (i12 & 14) | ((i7 << 3) & 112) | (i12 & 896);
                    boolean z6 = z4;
                    Modifier modifier4 = modifier2;
                    IconToggleButtonColors iconToggleButtonColors4 = iconToggleButtonColors2;
                    composer2 = startRestartGroup;
                    SurfaceKt.m1979Surfaced85dljk(z, function1, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5062getCheckboxo7Vup1c());
                        }
                    }, 1, null), z6, shape3, iconToggleButtonColors2.containerColor$material3_release(z4, z, startRestartGroup, i13).getValue().m3417unboximpl(), iconToggleButtonColors2.contentColor$material3_release(z4, z, startRestartGroup, i13).getValue().m3417unboximpl(), 0.0f, 0.0f, borderStroke3, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1207657396, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i14) {
                            ComposerKt.sourceInformation(composer3, "C527@25967L154:IconButton.kt#uh7d8r");
                            if ((i14 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1207657396, i14, -1, "androidx.compose.material3.OutlinedIconToggleButton.<anonymous> (IconButton.kt:527)");
                                }
                                Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, OutlinedIconButtonTokens.INSTANCE.m2659getContainerSizeD9Ej5fM());
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2<Composer, Integer, Unit> function22 = function2;
                                composer3.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m2937constructorimpl = Updater.m2937constructorimpl(composer3);
                                Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer3, -866750184, "C531@26106L9:IconButton.kt#uh7d8r");
                                function22.invoke(composer3, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (64638 & i7) | ((i7 << 9) & 1879048192), ((i7 >> 21) & 14) | 48, 384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z5 = z6;
                    modifier3 = modifier4;
                    iconToggleButtonColors3 = iconToggleButtonColors4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer2 = startRestartGroup;
                    z5 = z3;
                    shape4 = shape2;
                    iconToggleButtonColors3 = iconToggleButtonColors2;
                    borderStroke4 = borderStroke2;
                    modifier3 = modifier;
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i14) {
                            IconButtonKt.OutlinedIconToggleButton(z, function1, modifier3, z5, shape4, iconToggleButtonColors3, borderStroke4, mutableInteractionSource3, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if ((38347923 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i6 != 0) {
            }
            shape3 = shape2;
            borderStroke3 = borderStroke2;
            modifier2 = companion;
            z4 = z3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i122 = i7 >> 9;
            int i132 = (i122 & 14) | ((i7 << 3) & 112) | (i122 & 896);
            boolean z62 = z4;
            Modifier modifier42 = modifier2;
            IconToggleButtonColors iconToggleButtonColors42 = iconToggleButtonColors2;
            composer2 = startRestartGroup;
            SurfaceKt.m1979Surfaced85dljk(z, function1, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5062getCheckboxo7Vup1c());
                }
            }, 1, null), z62, shape3, iconToggleButtonColors2.containerColor$material3_release(z4, z, startRestartGroup, i132).getValue().m3417unboximpl(), iconToggleButtonColors2.contentColor$material3_release(z4, z, startRestartGroup, i132).getValue().m3417unboximpl(), 0.0f, 0.0f, borderStroke3, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1207657396, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i14) {
                    ComposerKt.sourceInformation(composer3, "C527@25967L154:IconButton.kt#uh7d8r");
                    if ((i14 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1207657396, i14, -1, "androidx.compose.material3.OutlinedIconToggleButton.<anonymous> (IconButton.kt:527)");
                        }
                        Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, OutlinedIconButtonTokens.INSTANCE.m2659getContainerSizeD9Ej5fM());
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Function2<Composer, Integer, Unit> function22 = function2;
                        composer3.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer m2937constructorimpl = Updater.m2937constructorimpl(composer3);
                        Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, -866750184, "C531@26106L9:IconButton.kt#uh7d8r");
                        function22.invoke(composer3, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, (64638 & i7) | ((i7 << 9) & 1879048192), ((i7 >> 21) & 14) | 48, 384);
            if (ComposerKt.isTraceInProgress()) {
            }
            shape4 = shape3;
            borderStroke4 = borderStroke3;
            mutableInteractionSource3 = mutableInteractionSource2;
            z5 = z62;
            modifier3 = modifier42;
            iconToggleButtonColors3 = iconToggleButtonColors42;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i6 != 0) {
        }
        shape3 = shape2;
        borderStroke3 = borderStroke2;
        modifier2 = companion;
        z4 = z3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1222 = i7 >> 9;
        int i1322 = (i1222 & 14) | ((i7 << 3) & 112) | (i1222 & 896);
        boolean z622 = z4;
        Modifier modifier422 = modifier2;
        IconToggleButtonColors iconToggleButtonColors422 = iconToggleButtonColors2;
        composer2 = startRestartGroup;
        SurfaceKt.m1979Surfaced85dljk(z, function1, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.m5077setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5062getCheckboxo7Vup1c());
            }
        }, 1, null), z622, shape3, iconToggleButtonColors2.containerColor$material3_release(z4, z, startRestartGroup, i1322).getValue().m3417unboximpl(), iconToggleButtonColors2.contentColor$material3_release(z4, z, startRestartGroup, i1322).getValue().m3417unboximpl(), 0.0f, 0.0f, borderStroke3, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1207657396, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i14) {
                ComposerKt.sourceInformation(composer3, "C527@25967L154:IconButton.kt#uh7d8r");
                if ((i14 & 3) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1207657396, i14, -1, "androidx.compose.material3.OutlinedIconToggleButton.<anonymous> (IconButton.kt:527)");
                    }
                    Modifier m611size3ABfNKs = SizeKt.m611size3ABfNKs(Modifier.INSTANCE, OutlinedIconButtonTokens.INSTANCE.m2659getContainerSizeD9Ej5fM());
                    Alignment center = Alignment.INSTANCE.getCenter();
                    Function2<Composer, Integer, Unit> function22 = function2;
                    composer3.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m611size3ABfNKs);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer m2937constructorimpl = Updater.m2937constructorimpl(composer3);
                    Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, -866750184, "C531@26106L9:IconButton.kt#uh7d8r");
                    function22.invoke(composer3, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, (64638 & i7) | ((i7 << 9) & 1879048192), ((i7 >> 21) & 14) | 48, 384);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape4 = shape3;
        borderStroke4 = borderStroke3;
        mutableInteractionSource3 = mutableInteractionSource2;
        z5 = z622;
        modifier3 = modifier422;
        iconToggleButtonColors3 = iconToggleButtonColors422;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
