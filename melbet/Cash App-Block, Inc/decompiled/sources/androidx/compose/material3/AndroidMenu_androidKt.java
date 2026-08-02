package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.DropdownMenuPositionProvider;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class AndroidMenu_androidKt {
    public static final PopupProperties DefaultMenuProperties = new PopupProperties(true);

    /* JADX WARN: Removed duplicated region for block: B:105:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: DropdownMenu-IlH_yew, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m516DropdownMenuIlH_yew(final boolean z, final Function0 function0, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, Shape shape, long j2, float f, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        int i3;
        Function0 function02;
        Modifier modifier2;
        int i4;
        int i5;
        PopupProperties popupProperties2;
        Shape shape2;
        char c;
        final long j3;
        int i6;
        final ScrollState scrollState2;
        final float f2;
        final Shape shape3;
        final Modifier modifier3;
        final long j4;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        int i8;
        long j5;
        int i9;
        final Modifier modifier4;
        int i10;
        final Shape shape4;
        final ScrollState scrollState3;
        final long j6;
        final float f3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1725609375);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i3 |= gapComposer.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= gapComposer.changed(j) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= PKIFailureInfo.certRevoked;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    popupProperties2 = popupProperties;
                    i3 |= gapComposer.changed(popupProperties2) ? PKIFailureInfo.unsupportedVersion : 65536;
                    if ((i & 1572864) != 0) {
                        shape2 = shape;
                        c = ' ';
                        i3 |= ((i2 & 64) == 0 && gapComposer.changed(shape2)) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    } else {
                        shape2 = shape;
                        c = ' ';
                    }
                    if ((i & 12582912) != 0) {
                        j3 = j2;
                        i3 |= ((i2 & 128) == 0 && gapComposer.changed(j3)) ? 8388608 : 4194304;
                    } else {
                        j3 = j2;
                    }
                    i6 = i3 | 905969664;
                    if (gapComposer.shouldExecute(i6 & 1, (306783379 & i6) == 306783378)) {
                        gapComposer.skipToGroupEnd();
                        scrollState2 = scrollState;
                        f2 = f;
                        shape3 = shape2;
                        modifier3 = modifier2;
                        j4 = j;
                    } else {
                        gapComposer.startDefaults();
                        if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                            Modifier modifier5 = i11 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                            if (i4 != 0) {
                                i7 = -3727361;
                                i8 = i5;
                                j5 = (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << c) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax);
                            } else {
                                i7 = -3727361;
                                i8 = i5;
                                j5 = j;
                            }
                            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
                            int i12 = i6 & (-57345);
                            PopupProperties popupProperties3 = i8 != 0 ? DefaultMenuProperties : popupProperties2;
                            if ((i2 & 64) != 0) {
                                float f4 = MenuDefaults.ShadowElevation;
                                shape2 = ShapesKt.getValue(MenuTokens.ContainerShape, gapComposer);
                                i12 = i6 & i7;
                            }
                            if ((i2 & 128) != 0) {
                                float f5 = MenuDefaults.ShadowElevation;
                                j3 = ColorSchemeKt.getValue(MenuTokens.ContainerColor, gapComposer);
                                i9 = i12 & (-29360129);
                            } else {
                                i9 = i12;
                            }
                            modifier4 = modifier5;
                            i10 = i9;
                            shape4 = shape2;
                            scrollState3 = rememberScrollState;
                            j6 = j3;
                            f3 = MenuDefaults.ShadowElevation;
                            popupProperties2 = popupProperties3;
                        } else {
                            gapComposer.skipToGroupEnd();
                            i10 = i6 & (-57345);
                            if ((i2 & 64) != 0) {
                                i10 = i6 & (-3727361);
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                            }
                            scrollState3 = scrollState;
                            f3 = f;
                            shape4 = shape2;
                            modifier4 = modifier2;
                            j6 = j3;
                            j5 = j;
                        }
                        gapComposer.endDefaults();
                        Object rememberedValue = gapComposer.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = new MutableTransitionState(Boolean.FALSE);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        final MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue;
                        mutableTransitionState.setTargetState(Boolean.valueOf(z));
                        if (((Boolean) mutableTransitionState.currentState$delegate.getValue()).booleanValue() || ((Boolean) mutableTransitionState.targetState$delegate.getValue()).booleanValue()) {
                            gapComposer.startReplaceGroup(1165905588);
                            Object rememberedValue2 = gapComposer.rememberedValue();
                            if (rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = Updater.mutableStateOf$default(new TransformOrigin(TransformOrigin.Center));
                                gapComposer.updateRememberedValue(rememberedValue2);
                            }
                            final MutableState mutableState = (MutableState) rememberedValue2;
                            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                            boolean changed = ((i10 & 7168) == 2048) | gapComposer.changed(density);
                            Object rememberedValue3 = gapComposer.rememberedValue();
                            if (changed || rememberedValue3 == neverEqualPolicy) {
                                rememberedValue3 = new DropdownMenuPositionProvider(j5, density, new HeroTagViewKt$$ExternalSyntheticLambda12(2, mutableState));
                                gapComposer.updateRememberedValue(rememberedValue3);
                            }
                            AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) rememberedValue3, function02, popupProperties2, Expect_jvmKt.rememberComposableLambda(-917492520, new Function2() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Number) obj2).intValue();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        MenuKt.m535DropdownMenuContentQj0Zi0g(Modifier.this, mutableTransitionState, mutableState, scrollState3, shape4, j6, f3, composableLambdaImpl, gapComposer2, MLKEMEngine.KyberPolyBytes);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer), gapComposer, ((i10 >> 9) & 896) | (i10 & 112) | 3072, 0);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(1166965571);
                            gapComposer.end(false);
                        }
                        j4 = j5;
                        modifier3 = modifier4;
                        scrollState2 = scrollState3;
                        shape3 = shape4;
                        j3 = j6;
                        f2 = f3;
                    }
                    final PopupProperties popupProperties4 = popupProperties2;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new Function2() { // from class: androidx.compose.material3.AndroidMenu_androidKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                AndroidMenu_androidKt.m516DropdownMenuIlH_yew(z, function0, modifier3, j4, scrollState2, popupProperties4, shape3, j3, f2, composableLambdaImpl, (Composer) obj, updateChangedFlags, i2);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                popupProperties2 = popupProperties;
                if ((i & 1572864) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i6 = i3 | 905969664;
                if (gapComposer.shouldExecute(i6 & 1, (306783379 & i6) == 306783378)) {
                }
                final PopupProperties popupProperties42 = popupProperties2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            popupProperties2 = popupProperties;
            if ((i & 1572864) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i6 = i3 | 905969664;
            if (gapComposer.shouldExecute(i6 & 1, (306783379 & i6) == 306783378)) {
            }
            final PopupProperties popupProperties422 = popupProperties2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        popupProperties2 = popupProperties;
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i6 = i3 | 905969664;
        if (gapComposer.shouldExecute(i6 & 1, (306783379 & i6) == 306783378)) {
        }
        final PopupProperties popupProperties4222 = popupProperties2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItem(ComposableLambdaImpl composableLambdaImpl, Function0 function0, Modifier modifier, Function2 function2, Function2 function22, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function23;
        int i5;
        Function2 function24;
        int i6;
        boolean z2;
        MenuItemColors menuItemColors2;
        int i7;
        int i8;
        int i9;
        GapComposer gapComposer;
        PaddingValues paddingValues2;
        Function2 function25;
        Function2 function26;
        boolean z3;
        MenuItemColors menuItemColors3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer2;
        Modifier modifier3;
        PaddingValues paddingValues3;
        Function2 function27;
        MenuItemColors menuItemColors4;
        int i10;
        Function2 function28;
        boolean z4;
        Modifier modifier4;
        MenuItemColors menuItemColors5;
        int i11;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-532959117);
        if ((i & 6) == 0) {
            i3 = (gapComposer3.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer3.changedInstance(function0) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer3.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function23 = function2;
                i3 |= gapComposer3.changedInstance(function23) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function24 = function22;
                    i3 |= gapComposer3.changedInstance(function24) ? 16384 : PKIFailureInfo.certRevoked;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= gapComposer3.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536;
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                menuItemColors2 = menuItemColors;
                                if (gapComposer3.changed(menuItemColors2)) {
                                    i11 = PKIFailureInfo.badCertTemplate;
                                    i3 |= i11;
                                }
                            } else {
                                menuItemColors2 = menuItemColors;
                            }
                            i11 = PKIFailureInfo.signerNotTrusted;
                            i3 |= i11;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i8 = i3 | 12582912;
                        } else {
                            int i13 = i3;
                            if ((i & 12582912) == 0) {
                                i8 = i13 | (gapComposer3.changed(paddingValues) ? 8388608 : 4194304);
                            } else {
                                i8 = i13;
                            }
                        }
                        i9 = i8 | 100663296;
                        if (gapComposer3.shouldExecute(i9 & 1, (i9 & 38347923) != 38347922)) {
                            gapComposer3.startDefaults();
                            if ((i & 1) == 0 || gapComposer3.getDefaultsInvalid()) {
                                Modifier modifier5 = i12 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function23 = null;
                                }
                                if (i5 != 0) {
                                    function24 = null;
                                }
                                if (i6 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    float f = MenuDefaults.ShadowElevation;
                                    ColorScheme colorScheme = (ColorScheme) gapComposer3.consume(ColorSchemeKt.LocalColorScheme);
                                    MenuItemColors menuItemColors6 = colorScheme.defaultMenuItemColorsCached;
                                    if (menuItemColors6 == null) {
                                        gapComposer2 = gapComposer3;
                                        modifier3 = modifier5;
                                        menuItemColors5 = new MenuItemColors(ColorSchemeKt.fromToken(colorScheme, ListTokens.ListItemLabelTextColor), ColorSchemeKt.fromToken(colorScheme, ListTokens.ListItemLeadingIconColor), ColorSchemeKt.fromToken(colorScheme, ListTokens.ListItemTrailingIconColor), Color.m675copywmQWz5c$default(ListTokens.ListItemDisabledLabelTextOpacity, ColorSchemeKt.fromToken(colorScheme, ListTokens.ListItemDisabledLabelTextColor), 14), Color.m675copywmQWz5c$default(ListTokens.ListItemDisabledLeadingIconOpacity, ColorSchemeKt.fromToken(colorScheme, ListTokens.ListItemDisabledLeadingIconColor), 14), Color.m675copywmQWz5c$default(ListTokens.ListItemDisabledTrailingIconOpacity, ColorSchemeKt.fromToken(colorScheme, ListTokens.ListItemDisabledTrailingIconColor), 14));
                                        colorScheme.defaultMenuItemColorsCached = menuItemColors5;
                                    } else {
                                        gapComposer2 = gapComposer3;
                                        modifier3 = modifier5;
                                        menuItemColors5 = menuItemColors6;
                                    }
                                    i9 &= -3670017;
                                    menuItemColors2 = menuItemColors5;
                                } else {
                                    gapComposer2 = gapComposer3;
                                    modifier3 = modifier5;
                                }
                                paddingValues3 = i7 != 0 ? MenuDefaults.DropdownMenuItemContentPadding : paddingValues;
                                function27 = function24;
                                menuItemColors4 = menuItemColors2;
                                i10 = i9;
                                function28 = function23;
                                z4 = z2;
                                modifier4 = modifier3;
                            } else {
                                gapComposer3.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i9 &= -3670017;
                                }
                                paddingValues3 = paddingValues;
                                gapComposer2 = gapComposer3;
                                function27 = function24;
                                menuItemColors4 = menuItemColors2;
                                i10 = i9;
                                function28 = function23;
                                z4 = z2;
                                modifier4 = modifier2;
                            }
                            gapComposer2.endDefaults();
                            gapComposer = gapComposer2;
                            MenuKt.DropdownMenuItemContent(composableLambdaImpl, function0, modifier4, function28, function27, z4, menuItemColors4, paddingValues3, gapComposer, i10 & 268435454);
                            modifier2 = modifier4;
                            function25 = function28;
                            function26 = function27;
                            z3 = z4;
                            menuItemColors3 = menuItemColors4;
                            paddingValues2 = paddingValues3;
                        } else {
                            gapComposer = gapComposer3;
                            gapComposer.skipToGroupEnd();
                            paddingValues2 = paddingValues;
                            function25 = function23;
                            function26 = function24;
                            z3 = z2;
                            menuItemColors3 = menuItemColors2;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda1(composableLambdaImpl, function0, modifier2, function25, function26, z3, menuItemColors3, paddingValues2, i, i2);
                            return;
                        }
                        return;
                    }
                    z2 = z;
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i9 = i8 | 100663296;
                    if (gapComposer3.shouldExecute(i9 & 1, (i9 & 38347923) != 38347922)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function24 = function22;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                z2 = z;
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i9 = i8 | 100663296;
                if (gapComposer3.shouldExecute(i9 & 1, (i9 & 38347923) != 38347922)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function24 = function22;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z2 = z;
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i9 = i8 | 100663296;
            if (gapComposer3.shouldExecute(i9 & 1, (i9 & 38347923) != 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function24 = function22;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z2 = z;
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i9 = i8 | 100663296;
        if (gapComposer3.shouldExecute(i9 & 1, (i9 & 38347923) != 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
