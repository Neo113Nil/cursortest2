package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.tokens.NavigationBarHorizontalItemTokens;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.material3.tokens.NavigationBarVerticalItemTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;

/* compiled from: ShortNavigationBar.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u001aT\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0081\u0001\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'H\u0002\"\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0016\u0010*\u001a\u00020+X\u0080\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-\"\u0016\u0010/\u001a\u00020+X\u0080\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b0\u0010-\"\u0016\u00101\u001a\u00020+X\u0080\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b2\u0010-\"\u0016\u00103\u001a\u00020+X\u0080\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b4\u0010-\"\u0016\u00105\u001a\u00020+X\u0080\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b6\u0010-\"\u0016\u00107\u001a\u00020+X\u0080\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b8\u0010-\"\u0016\u00109\u001a\u00020+X\u0080\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b:\u0010-¨\u0006;"}, d2 = {"ShortNavigationBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "arrangement", "Landroidx/compose/material3/ShortNavigationBarArrangement;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "ShortNavigationBar-kQ6Tpik", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/foundation/layout/WindowInsets;ILkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ShortNavigationBarItem", "selected", "", "onClick", "icon", "label", "enabled", "iconPosition", "Landroidx/compose/material3/NavigationItemIconPosition;", "colors", "Landroidx/compose/material3/NavigationItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "ShortNavigationBarItem-6ZDA4I0", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZILandroidx/compose/material3/NavigationItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "LocalShortNavigationBarOverride", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/ShortNavigationBarOverride;", "getLocalShortNavigationBarOverride$annotations", "()V", "getLocalShortNavigationBarOverride", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "calculateCenteredContentHorizontalPadding", "", "itemsCount", "barWidth", "TopIconItemVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "getTopIconItemVerticalPadding", "()F", "F", "TopIconIndicatorVerticalPadding", "getTopIconIndicatorVerticalPadding", "TopIconIndicatorHorizontalPadding", "getTopIconIndicatorHorizontalPadding", "StartIconIndicatorVerticalPadding", "getStartIconIndicatorVerticalPadding", "TopIconIndicatorToLabelPadding", "getTopIconIndicatorToLabelPadding", "StartIconIndicatorHorizontalPadding", "getStartIconIndicatorHorizontalPadding", "StartIconToLabelPadding", "getStartIconToLabelPadding", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ShortNavigationBarKt {
    private static final float StartIconIndicatorVerticalPadding;
    private static final float TopIconIndicatorHorizontalPadding;
    private static final float TopIconIndicatorVerticalPadding;
    private static final ProvidableCompositionLocal<ShortNavigationBarOverride> LocalShortNavigationBarOverride = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.material3.ShortNavigationBarKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ShortNavigationBarOverride LocalShortNavigationBarOverride$lambda$0;
            LocalShortNavigationBarOverride$lambda$0 = ShortNavigationBarKt.LocalShortNavigationBarOverride$lambda$0();
            return LocalShortNavigationBarOverride$lambda$0;
        }
    }, 1, null);
    private static final float TopIconItemVerticalPadding = NavigationBarVerticalItemTokens.INSTANCE.m5370getContainerBetweenSpaceD9Ej5fM();
    private static final float TopIconIndicatorToLabelPadding = Dp.m9732constructorimpl(4);
    private static final float StartIconIndicatorHorizontalPadding = NavigationBarHorizontalItemTokens.INSTANCE.m5360getActiveIndicatorLeadingSpaceD9Ej5fM();
    private static final float StartIconToLabelPadding = NavigationBarTokens.INSTANCE.m5365getItemActiveIndicatorIconLabelSpaceD9Ej5fM();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortNavigationBarItem_6ZDA4I0$lambda$1(boolean z, Function0 function0, Function2 function2, Function2 function22, Modifier modifier, boolean z2, int i, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        m3960ShortNavigationBarItem6ZDA4I0(z, function0, function2, function22, modifier, z2, i, navigationItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortNavigationBar_kQ6Tpik$lambda$1(Modifier modifier, long j, long j2, WindowInsets windowInsets, int i, Function2 function2, int i2, int i3, Composer composer, int i4) {
        m3959ShortNavigationBarkQ6Tpik(modifier, j, j2, windowInsets, i, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getLocalShortNavigationBarOverride$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0177  */
    /* renamed from: ShortNavigationBar-kQ6Tpik, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3959ShortNavigationBarkQ6Tpik(Modifier modifier, long j, long j2, WindowInsets windowInsets, int i, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long j3;
        long j4;
        WindowInsets windowInsets2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Modifier modifier3;
        final long j5;
        final long j6;
        final WindowInsets windowInsets3;
        final int i6;
        int m3957getArrangementLnnQw40;
        long j7;
        WindowInsets windowInsets4;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(552087412);
        ComposerKt.sourceInformation(startRestartGroup, "C(ShortNavigationBar)N(modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,windowInsets,arrangement:c#material3.ShortNavigationBarArrangement,content)103@4941L7,*112@5274L20:ShortNavigationBar.kt#uh7d8r");
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i10 = 32;
                    i4 |= i10;
                }
            } else {
                j3 = j;
            }
            i10 = 16;
            i4 |= i10;
        } else {
            j3 = j;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i9 = 256;
                    i4 |= i9;
                }
            } else {
                j4 = j2;
            }
            i9 = 128;
            i4 |= i9;
        } else {
            j4 = j2;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                windowInsets2 = windowInsets;
                if (startRestartGroup.changed(windowInsets2)) {
                    i8 = 2048;
                    i4 |= i8;
                }
            } else {
                windowInsets2 = windowInsets;
            }
            i8 = 1024;
            i4 |= i8;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                i5 = i;
                if (startRestartGroup.changed(i5)) {
                    i7 = 16384;
                    i4 |= i7;
                }
            } else {
                i5 = i;
            }
            i7 = 8192;
            i4 |= i7;
        } else {
            i5 = i;
        }
        if ((196608 & i2) == 0) {
            function22 = function2;
            i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
        } else {
            function22 = function2;
        }
        if (startRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "97@4613L14,98@4682L12,99@4756L12");
            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion = i11 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i3 & 2) != 0) {
                    j3 = ShortNavigationBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    j4 = ShortNavigationBarDefaults.INSTANCE.getContentColor(startRestartGroup, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                    windowInsets2 = ShortNavigationBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    modifier3 = companion;
                    m3957getArrangementLnnQw40 = ShortNavigationBarDefaults.INSTANCE.m3957getArrangementLnnQw40();
                    j7 = j4;
                    windowInsets4 = windowInsets2;
                    long j8 = j3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(552087412, i4, -1, "androidx.compose.material3.ShortNavigationBar (ShortNavigationBar.kt:102)");
                    }
                    ProvidableCompositionLocal<ShortNavigationBarOverride> providableCompositionLocal = LocalShortNavigationBarOverride;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(providableCompositionLocal);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ((ShortNavigationBarOverride) consume).ShortNavigationBar(new ShortNavigationBarOverrideScope(modifier3, j8, j7, windowInsets4, m3957getArrangementLnnQw40, function22, null), startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = j8;
                    j6 = j7;
                    windowInsets3 = windowInsets4;
                    i6 = m3957getArrangementLnnQw40;
                } else {
                    modifier3 = companion;
                }
            }
            j7 = j4;
            windowInsets4 = windowInsets2;
            m3957getArrangementLnnQw40 = i5;
            long j82 = j3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<ShortNavigationBarOverride> providableCompositionLocal2 = LocalShortNavigationBarOverride;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(providableCompositionLocal2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ((ShortNavigationBarOverride) consume2).ShortNavigationBar(new ShortNavigationBarOverrideScope(modifier3, j82, j7, windowInsets4, m3957getArrangementLnnQw40, function22, null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            j5 = j82;
            j6 = j7;
            windowInsets3 = windowInsets4;
            i6 = m3957getArrangementLnnQw40;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j5 = j3;
            j6 = j4;
            windowInsets3 = windowInsets2;
            i6 = i5;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ShortNavigationBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ShortNavigationBar_kQ6Tpik$lambda$1;
                    ShortNavigationBar_kQ6Tpik$lambda$1 = ShortNavigationBarKt.ShortNavigationBar_kQ6Tpik$lambda$1(Modifier.this, j5, j6, windowInsets3, i6, function2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return ShortNavigationBar_kQ6Tpik$lambda$1;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ad  */
    /* renamed from: ShortNavigationBarItem-6ZDA4I0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3960ShortNavigationBarItem6ZDA4I0(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Modifier modifier, boolean z2, int i, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        NavigationItemColors navigationItemColors2;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final boolean z4;
        final int i11;
        final NavigationItemColors navigationItemColors3;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i12;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        boolean z5;
        NavigationItemColors navigationItemColors4;
        MutableInteractionSource mutableInteractionSource4;
        boolean m3653equalsimpl0;
        float f;
        float f2;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1164996656);
        ComposerKt.sourceInformation(startRestartGroup, "C(ShortNavigationBarItem)N(selected,onClick,icon,label,modifier,enabled,iconPosition:c#material3.NavigationItemIconPosition,colors,interactionSource)243@10657L5,244@10734L5,239@10505L842:ShortNavigationBar.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        int i14 = i3 & 16;
        if (i14 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((1572864 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 1048576 : 524288;
                    if ((12582912 & i2) != 0) {
                        if ((i3 & 128) == 0) {
                            navigationItemColors2 = navigationItemColors;
                            if (startRestartGroup.changed(navigationItemColors2)) {
                                i13 = 8388608;
                                i4 |= i13;
                            }
                        } else {
                            navigationItemColors2 = navigationItemColors;
                        }
                        i13 = 4194304;
                        i4 |= i13;
                    } else {
                        navigationItemColors2 = navigationItemColors;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        i10 = i4;
                        if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i10 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "219@9856L8");
                            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i5 != 0) {
                                    z3 = true;
                                }
                                if (i6 != 0) {
                                    i7 = NavigationItemIconPosition.INSTANCE.m3658getTopxw1Ddg();
                                }
                                if ((i3 & 128) != 0) {
                                    i12 = i10 & (-29360129);
                                    navigationItemColors2 = ShortNavigationBarItemDefaults.INSTANCE.colors(startRestartGroup, 6);
                                } else {
                                    i12 = i10;
                                }
                                mutableInteractionSource3 = i9 != 0 ? null : mutableInteractionSource;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 128) != 0) {
                                    i12 = i10 & (-29360129);
                                    modifier3 = modifier2;
                                    z5 = z3;
                                    navigationItemColors4 = navigationItemColors2;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1164996656, i12, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:221)");
                                    }
                                    if (mutableInteractionSource3 != null) {
                                        startRestartGroup.startReplaceGroup(1215846219);
                                        ComposerKt.sourceInformation(startRestartGroup, "223@10008L39");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1424694167, "CC(remember):ShortNavigationBar.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        startRestartGroup.startReplaceGroup(1424693516);
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                    m3653equalsimpl0 = NavigationItemIconPosition.m3653equalsimpl0(i7, NavigationItemIconPosition.INSTANCE.m3658getTopxw1Ddg());
                                    if (!m3653equalsimpl0) {
                                        f = TopIconIndicatorHorizontalPadding;
                                    } else {
                                        f = StartIconIndicatorHorizontalPadding;
                                    }
                                    float f3 = f;
                                    if (!m3653equalsimpl0) {
                                        f2 = TopIconIndicatorVerticalPadding;
                                    } else {
                                        f2 = StartIconIndicatorVerticalPadding;
                                    }
                                    int i15 = i12 >> 6;
                                    composer2 = startRestartGroup;
                                    int i16 = i7;
                                    NavigationItemKt.m3667NavigationItem8Df7sds(z, function0, function2, TypographyKt.getValue(NavigationBarTokens.INSTANCE.getLabelTextFont(), startRestartGroup, 6), ShapesKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveIndicatorShape(), startRestartGroup, 6), NavigationBarVerticalItemTokens.INSTANCE.m5369getActiveIndicatorWidthD9Ej5fM(), f3, f2, TopIconIndicatorToLabelPadding, StartIconToLabelPadding, TopIconItemVerticalPadding, navigationItemColors4, modifier3, z5, function22, i16, mutableInteractionSource4, composer2, (i12 & 14) | 906166272 | (i12 & 112) | (i12 & 896), 6 | ((i12 >> 18) & 112) | (i15 & 896) | (i15 & 7168) | ((i12 << 3) & 57344) | ((i12 >> 3) & 458752));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    navigationItemColors3 = navigationItemColors4;
                                    modifier2 = modifier3;
                                    z4 = z5;
                                    i11 = i16;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    i12 = i10;
                                }
                            }
                            modifier3 = modifier2;
                            z5 = z3;
                            navigationItemColors4 = navigationItemColors2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (mutableInteractionSource3 != null) {
                            }
                            m3653equalsimpl0 = NavigationItemIconPosition.m3653equalsimpl0(i7, NavigationItemIconPosition.INSTANCE.m3658getTopxw1Ddg());
                            if (!m3653equalsimpl0) {
                            }
                            float f32 = f;
                            if (!m3653equalsimpl0) {
                            }
                            int i152 = i12 >> 6;
                            composer2 = startRestartGroup;
                            int i162 = i7;
                            NavigationItemKt.m3667NavigationItem8Df7sds(z, function0, function2, TypographyKt.getValue(NavigationBarTokens.INSTANCE.getLabelTextFont(), startRestartGroup, 6), ShapesKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveIndicatorShape(), startRestartGroup, 6), NavigationBarVerticalItemTokens.INSTANCE.m5369getActiveIndicatorWidthD9Ej5fM(), f32, f2, TopIconIndicatorToLabelPadding, StartIconToLabelPadding, TopIconItemVerticalPadding, navigationItemColors4, modifier3, z5, function22, i162, mutableInteractionSource4, composer2, (i12 & 14) | 906166272 | (i12 & 112) | (i12 & 896), 6 | ((i12 >> 18) & 112) | (i152 & 896) | (i152 & 7168) | ((i12 << 3) & 57344) | ((i12 >> 3) & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            mutableInteractionSource2 = mutableInteractionSource3;
                            navigationItemColors3 = navigationItemColors4;
                            modifier2 = modifier3;
                            z4 = z5;
                            i11 = i162;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            z4 = z3;
                            i11 = i7;
                            navigationItemColors3 = navigationItemColors2;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ShortNavigationBarKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit ShortNavigationBarItem_6ZDA4I0$lambda$1;
                                    ShortNavigationBarItem_6ZDA4I0$lambda$1 = ShortNavigationBarKt.ShortNavigationBarItem_6ZDA4I0$lambda$1(z, function0, function2, function22, modifier2, z4, i11, navigationItemColors3, mutableInteractionSource2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return ShortNavigationBarItem_6ZDA4I0$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    i10 = i4;
                    if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i10 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i;
                if ((12582912 & i2) != 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i4;
                if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i10 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i;
            if ((12582912 & i2) != 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i4;
            if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i10 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        z3 = z2;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i;
        if ((12582912 & i2) != 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i4;
        if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final ProvidableCompositionLocal<ShortNavigationBarOverride> getLocalShortNavigationBarOverride() {
        return LocalShortNavigationBarOverride;
    }

    static {
        float f = 2;
        TopIconIndicatorVerticalPadding = Dp.m9732constructorimpl(Dp.m9732constructorimpl(NavigationBarVerticalItemTokens.INSTANCE.m5368getActiveIndicatorHeightD9Ej5fM() - NavigationBarVerticalItemTokens.INSTANCE.m5371getIconSizeD9Ej5fM()) / f);
        TopIconIndicatorHorizontalPadding = Dp.m9732constructorimpl(Dp.m9732constructorimpl(NavigationBarVerticalItemTokens.INSTANCE.m5369getActiveIndicatorWidthD9Ej5fM() - NavigationBarVerticalItemTokens.INSTANCE.m5371getIconSizeD9Ej5fM()) / f);
        StartIconIndicatorVerticalPadding = Dp.m9732constructorimpl(Dp.m9732constructorimpl(NavigationBarHorizontalItemTokens.INSTANCE.m5359getActiveIndicatorHeightD9Ej5fM() - NavigationBarHorizontalItemTokens.INSTANCE.m5362getIconSizeD9Ej5fM()) / f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShortNavigationBarOverride LocalShortNavigationBarOverride$lambda$0() {
        return DefaultShortNavigationBarOverride.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateCenteredContentHorizontalPadding(int i, int i2) {
        if (i > 6) {
            return 0;
        }
        return MathKt.roundToInt((((100 - ((i + 3) * 10)) / 2.0f) / 100) * i2);
    }

    public static final float getTopIconItemVerticalPadding() {
        return TopIconItemVerticalPadding;
    }

    public static final float getTopIconIndicatorVerticalPadding() {
        return TopIconIndicatorVerticalPadding;
    }

    public static final float getTopIconIndicatorHorizontalPadding() {
        return TopIconIndicatorHorizontalPadding;
    }

    public static final float getStartIconIndicatorVerticalPadding() {
        return StartIconIndicatorVerticalPadding;
    }

    public static final float getTopIconIndicatorToLabelPadding() {
        return TopIconIndicatorToLabelPadding;
    }

    public static final float getStartIconIndicatorHorizontalPadding() {
        return StartIconIndicatorHorizontalPadding;
    }

    public static final float getStartIconToLabelPadding() {
        return StartIconToLabelPadding;
    }
}
