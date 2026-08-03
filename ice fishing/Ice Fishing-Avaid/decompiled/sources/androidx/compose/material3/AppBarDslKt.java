package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: AppBarDsl.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001aI\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"rememberAppBarOverflowState", "Landroidx/compose/material3/AppBarOverflowState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/AppBarOverflowState;", "AppBarOverflowIndicator", "", "menuState", "Landroidx/compose/material3/AppBarMenuState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/IconButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/material3/AppBarMenuState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class AppBarDslKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarOverflowIndicator$lambda$2(AppBarMenuState appBarMenuState, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        AppBarOverflowIndicator(appBarMenuState, modifier, z, shape, iconButtonColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final AppBarOverflowState rememberAppBarOverflowState(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 209837519, "C(rememberAppBarOverflowState)276@8580L29,276@8524L85:AppBarDsl.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(209837519, i, -1, "androidx.compose.material3.rememberAppBarOverflowState (AppBarDsl.kt:275)");
        }
        Object[] objArr = new Object[0];
        Saver<AppBarOverflowStateImpl, ?> saver = AppBarOverflowStateImpl.INSTANCE.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, -209603156, "CC(remember):AppBarDsl.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: androidx.compose.material3.AppBarDslKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    AppBarOverflowStateImpl rememberAppBarOverflowState$lambda$0$0;
                    rememberAppBarOverflowState$lambda$0$0 = AppBarDslKt.rememberAppBarOverflowState$lambda$0$0();
                    return rememberAppBarOverflowState$lambda$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        AppBarOverflowStateImpl appBarOverflowStateImpl = (AppBarOverflowStateImpl) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) saver, (Function0) rememberedValue, composer, 384);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return appBarOverflowStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppBarOverflowStateImpl rememberAppBarOverflowState$lambda$0$0() {
        return new AppBarOverflowStateImpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppBarOverflowIndicator(final AppBarMenuState appBarMenuState, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
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
        final boolean z4;
        final Shape shape4;
        final MutableInteractionSource mutableInteractionSource4;
        final IconButtonColors iconButtonColors4;
        final Modifier modifier4;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1914581769);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppBarOverflowIndicator)N(menuState,modifier,enabled,shape,colors,interactionSource)441@15366L45,445@15484L60,446@15564L45,447@15627L22,448@15657L548,443@15417L788:AppBarDsl.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(appBarMenuState) ? 4 : 2) | i;
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
                        ComposerKt.sourceInformation(startRestartGroup, "437@15191L13,438@15256L18");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            z4 = z2;
                            shape4 = shape2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            iconButtonColors4 = iconButtonColors2;
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                shape2 = IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                iconButtonColors2 = IconButtonDefaults.INSTANCE.iconButtonColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                mutableInteractionSource4 = null;
                                z4 = z2;
                                shape4 = shape2;
                            } else {
                                z4 = z2;
                                shape4 = shape2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            iconButtonColors4 = iconButtonColors2;
                            modifier4 = companion;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1914581769, i3, -1, "androidx.compose.material3.AppBarOverflowIndicator (AppBarDsl.kt:440)");
                        }
                        Strings.Companion companion2 = Strings.INSTANCE;
                        final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_floating_toolbar_more_options), startRestartGroup, 0);
                        Modifier modifier5 = modifier4;
                        boolean z5 = z4;
                        IconButtonColors iconButtonColors5 = iconButtonColors4;
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                        Shape shape5 = shape4;
                        composer2 = startRestartGroup;
                        TooltipKt.TooltipBox(TooltipDefaults.INSTANCE.m4536rememberTooltipPositionProviderHu5FAss(TooltipAnchorPosition.INSTANCE.m4523getAbovelOKsHw4(), 0.0f, startRestartGroup, 390, 2), ComposableLambdaKt.rememberComposableLambda(-1648759198, true, new Function3() { // from class: androidx.compose.material3.AppBarDslKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Unit AppBarOverflowIndicator$lambda$0;
                                AppBarOverflowIndicator$lambda$0 = AppBarDslKt.AppBarOverflowIndicator$lambda$0(m4895getString2EP1pXo, (TooltipScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                return AppBarOverflowIndicator$lambda$0;
                            }
                        }, startRestartGroup, 54), TooltipKt.rememberTooltipState(false, false, null, startRestartGroup, 0, 7), null, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(-67358598, true, new Function2() { // from class: androidx.compose.material3.AppBarDslKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit AppBarOverflowIndicator$lambda$1;
                                AppBarOverflowIndicator$lambda$1 = AppBarDslKt.AppBarOverflowIndicator$lambda$1(AppBarMenuState.this, modifier4, z4, iconButtonColors4, mutableInteractionSource4, shape4, m4895getString2EP1pXo, (Composer) obj, ((Integer) obj2).intValue());
                                return AppBarOverflowIndicator$lambda$1;
                            }
                        }, startRestartGroup, 54), composer2, 100663344, 248);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        z3 = z5;
                        shape3 = shape5;
                        iconButtonColors3 = iconButtonColors5;
                        mutableInteractionSource3 = mutableInteractionSource5;
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
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarDslKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit AppBarOverflowIndicator$lambda$2;
                                AppBarOverflowIndicator$lambda$2 = AppBarDslKt.AppBarOverflowIndicator$lambda$2(AppBarMenuState.this, modifier3, z3, shape3, iconButtonColors3, mutableInteractionSource3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return AppBarOverflowIndicator$lambda$2;
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
    public static final Unit AppBarOverflowIndicator$lambda$0(final String str, TooltipScope tooltipScope, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "C446@15579L28,446@15566L41:AppBarDsl.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(tooltipScope) : composer.changedInstance(tooltipScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1648759198, i2, -1, "androidx.compose.material3.AppBarOverflowIndicator.<anonymous> (AppBarDsl.kt:446)");
            }
            TooltipKt.m4544PlainTooltipgv3ox5I(tooltipScope, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-2012512304, true, new Function2() { // from class: androidx.compose.material3.AppBarDslKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppBarOverflowIndicator$lambda$0$0;
                    AppBarOverflowIndicator$lambda$0$0 = AppBarDslKt.AppBarOverflowIndicator$lambda$0$0(str, (Composer) obj, ((Integer) obj2).intValue());
                    return AppBarOverflowIndicator$lambda$0$0;
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
    public static final Unit AppBarOverflowIndicator$lambda$0$0(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C446@15581L24:AppBarDsl.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2012512304, i, -1, "androidx.compose.material3.AppBarOverflowIndicator.<anonymous>.<anonymous> (AppBarDsl.kt:446)");
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
    public static final Unit AppBarOverflowIndicator$lambda$1(final AppBarMenuState appBarMenuState, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, final String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C450@15701L178,462@16074L114,449@15667L532:AppBarDsl.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-67358598, i, -1, "androidx.compose.material3.AppBarOverflowIndicator.<anonymous> (AppBarDsl.kt:449)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -307101652, "CC(remember):AppBarDsl.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(appBarMenuState);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.AppBarDslKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit AppBarOverflowIndicator$lambda$1$0$0;
                        AppBarOverflowIndicator$lambda$1$0$0 = AppBarDslKt.AppBarOverflowIndicator$lambda$1$0$0(AppBarMenuState.this);
                        return AppBarOverflowIndicator$lambda$1$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0<Unit>) rememberedValue, modifier, z, iconButtonColors, mutableInteractionSource, shape, ComposableLambdaKt.rememberComposableLambda(83642140, true, new Function2() { // from class: androidx.compose.material3.AppBarDslKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppBarOverflowIndicator$lambda$1$1;
                    AppBarOverflowIndicator$lambda$1$1 = AppBarDslKt.AppBarOverflowIndicator$lambda$1$1(str, (Composer) obj, ((Integer) obj2).intValue());
                    return AppBarOverflowIndicator$lambda$1$1;
                }
            }, composer, 54), composer, 1572864, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarOverflowIndicator$lambda$1$0$0(AppBarMenuState appBarMenuState) {
        if (appBarMenuState.isExpanded()) {
            appBarMenuState.dismiss();
        } else {
            appBarMenuState.show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarOverflowIndicator$lambda$1$1(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C463@16092L82:AppBarDsl.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(83642140, i, -1, "androidx.compose.material3.AppBarOverflowIndicator.<anonymous>.<anonymous> (AppBarDsl.kt:463)");
            }
            IconKt.m3345Iconww6aTOc(Icons.Filled.INSTANCE.getMoreVert$material3(), str, (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
