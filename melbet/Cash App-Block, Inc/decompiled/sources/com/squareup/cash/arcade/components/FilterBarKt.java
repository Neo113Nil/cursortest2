package com.squareup.cash.arcade.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class FilterBarKt {
    public static final CubicBezierEasing ExitPositionEasing = new CubicBezierEasing(0.55f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
    public static final CubicBezierEasing ExitOpacityEasing = new CubicBezierEasing(1.0f, RecyclerView.DECELERATION_RATE, 0.74f, 1.0f);
    public static final CubicBezierEasing EnterPositionEasing = new CubicBezierEasing(0.55f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
    public static final CubicBezierEasing EnterOpacityEasing = new CubicBezierEasing(0.33f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
    public static final float AnimationVerticalOffset = 22.0f;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01cb, code lost:
    
        if (r12.changed(r47) == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Chip(Function0 function0, Modifier modifier, boolean z, boolean z2, FilterBarChipType filterBarChipType, Object obj, boolean z3, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        boolean z4;
        int i3;
        boolean z5;
        RecomposeScopeImpl endRestartGroup;
        boolean z6;
        long j;
        long j2;
        Object rememberedValue;
        NeverEqualPolicy neverEqualPolicy;
        boolean z7;
        boolean changed;
        Object rememberedValue2;
        TextStyle textStyle;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(422682906);
        int i4 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(z2) ? 2048 : 1024) | (gapComposer.changed(filterBarChipType.ordinal()) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(obj) ? PKIFailureInfo.unsupportedVersion : 65536);
        int i5 = i2 & 64;
        if (i5 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            z4 = z3;
            i4 |= gapComposer.changed(z4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            i3 = i4 | (!gapComposer.changedInstance(composableLambdaImpl) ? 8388608 : 4194304);
            if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) == 4793490)) {
                gapComposer.skipToGroupEnd();
                z5 = z4;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                    gapComposer.skipToGroupEnd();
                } else if (i5 != 0) {
                    z6 = false;
                    gapComposer.endDefaults();
                    long j3 = Strings.getColors(gapComposer).component.filterBar.chip.text.f183default;
                    long j4 = Strings.getColors(gapComposer).component.filterBar.chip.text.disabled;
                    if (z6) {
                        j = j3;
                        gapComposer.startReplaceGroup(-697047191);
                        gapComposer.end(false);
                        j2 = Color.Transparent;
                    } else {
                        gapComposer.startReplaceGroup(-697127140);
                        j = j3;
                        j2 = Strings.getColors(gapComposer).component.filterBar.chip.background.f181default;
                        gapComposer.end(false);
                    }
                    long j5 = Strings.getColors(gapComposer).component.filterBar.chip.background.disabled;
                    boolean z8 = z6;
                    long j6 = Strings.getColors(gapComposer).component.filterBar.chip.background.selected;
                    long j7 = Strings.getColors(gapComposer).component.filterBar.chip.icon.f182default;
                    long j8 = Strings.getColors(gapComposer).component.filterBar.chip.icon.disabled;
                    long j9 = j2;
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).buttonCompact, 0L, 0L, null, null, 0L, new BaselineShift(0.12f), 0L, null, null, null, 3, 0L, null, null, 0, 16744191);
                    rememberedValue = gapComposer.rememberedValue();
                    neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue;
                    Function0 rememberHapticTrigger = PlatformKt.rememberHapticTrigger(((Haptics) gapComposer.consume(HapticsKt.LocalHaptics)).input.subtle, gapComposer, 0);
                    if (z) {
                        j4 = j;
                    }
                    if (z) {
                        j8 = j7;
                    }
                    if (z) {
                        j9 = j5;
                    } else if (z2) {
                        j9 = j6;
                    }
                    Strings.getSizes(gapComposer).getClass();
                    Object obj2 = DefaultSizes.border.entries;
                    RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
                    Object[] objArr = {mutableInteractionSourceImpl2, Boolean.valueOf(z), filterBarChipType, rememberHapticTrigger};
                    if (((i3 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256) {
                    }
                    if ((i3 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z7 = false;
                        changed = z7 | gapComposer.changed(rememberHapticTrigger);
                        rememberedValue2 = gapComposer.rememberedValue();
                        if (!changed || rememberedValue2 == neverEqualPolicy) {
                            textStyle = m994copyp1EtxEg$default;
                            RoomDatabase$performClear$1 roomDatabase$performClear$1 = new RoomDatabase$performClear$1(z, mutableInteractionSourceImpl2, rememberHapticTrigger, (Continuation) null, 7);
                            mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                            gapComposer.updateRememberedValue(roomDatabase$performClear$1);
                            rememberedValue2 = roomDatabase$performClear$1;
                        } else {
                            mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                            textStyle = m994copyp1EtxEg$default;
                        }
                        Updater.LaunchedEffect(objArr, (Function2) rememberedValue2, gapComposer);
                        Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(textStyle), re$$ExternalSyntheticOutline0.m(j4, ArcadeThemeKt.LocalTextColor), Recorder$$ExternalSyntheticOutline2.m(j8, ArcadeThemeKt.LocalIconColor), LocalEnabledStateKt.LocalEnabledState.defaultProvidedValue$runtime(Boolean.valueOf(z))}, Expect_jvmKt.rememberComposableLambda(-551127974, new FilterBarKt$$ExternalSyntheticLambda2(modifier, j9, m340RoundedCornerShape0680j_4, mutableInteractionSourceImpl, z, function0, obj, composableLambdaImpl, filterBarChipType), gapComposer), gapComposer, 56);
                        z5 = z8;
                    }
                    z7 = true;
                    changed = z7 | gapComposer.changed(rememberHapticTrigger);
                    rememberedValue2 = gapComposer.rememberedValue();
                    if (changed) {
                    }
                    textStyle = m994copyp1EtxEg$default;
                    RoomDatabase$performClear$1 roomDatabase$performClear$12 = new RoomDatabase$performClear$1(z, mutableInteractionSourceImpl2, rememberHapticTrigger, (Continuation) null, 7);
                    mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                    gapComposer.updateRememberedValue(roomDatabase$performClear$12);
                    rememberedValue2 = roomDatabase$performClear$12;
                    Updater.LaunchedEffect(objArr, (Function2) rememberedValue2, gapComposer);
                    Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(textStyle), re$$ExternalSyntheticOutline0.m(j4, ArcadeThemeKt.LocalTextColor), Recorder$$ExternalSyntheticOutline2.m(j8, ArcadeThemeKt.LocalIconColor), LocalEnabledStateKt.LocalEnabledState.defaultProvidedValue$runtime(Boolean.valueOf(z))}, Expect_jvmKt.rememberComposableLambda(-551127974, new FilterBarKt$$ExternalSyntheticLambda2(modifier, j9, m340RoundedCornerShape0680j_4, mutableInteractionSourceImpl, z, function0, obj, composableLambdaImpl, filterBarChipType), gapComposer), gapComposer, 56);
                    z5 = z8;
                }
                z6 = z4;
                gapComposer.endDefaults();
                long j32 = Strings.getColors(gapComposer).component.filterBar.chip.text.f183default;
                long j42 = Strings.getColors(gapComposer).component.filterBar.chip.text.disabled;
                if (z6) {
                }
                long j52 = Strings.getColors(gapComposer).component.filterBar.chip.background.disabled;
                boolean z82 = z6;
                long j62 = Strings.getColors(gapComposer).component.filterBar.chip.background.selected;
                long j72 = Strings.getColors(gapComposer).component.filterBar.chip.icon.f182default;
                long j82 = Strings.getColors(gapComposer).component.filterBar.chip.icon.disabled;
                long j92 = j2;
                TextStyle m994copyp1EtxEg$default2 = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).buttonCompact, 0L, 0L, null, null, 0L, new BaselineShift(0.12f), 0L, null, null, null, 3, 0L, null, null, 0, 16744191);
                rememberedValue = gapComposer.rememberedValue();
                neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl22 = (MutableInteractionSourceImpl) rememberedValue;
                Function0 rememberHapticTrigger2 = PlatformKt.rememberHapticTrigger(((Haptics) gapComposer.consume(HapticsKt.LocalHaptics)).input.subtle, gapComposer, 0);
                if (z) {
                }
                if (z) {
                }
                if (z) {
                }
                Strings.getSizes(gapComposer).getClass();
                Object obj22 = DefaultSizes.border.entries;
                RoundedCornerShape m340RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
                Object[] objArr2 = {mutableInteractionSourceImpl22, Boolean.valueOf(z), filterBarChipType, rememberHapticTrigger2};
                if (((i3 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256) {
                }
                if ((i3 & MLKEMEngine.KyberPolyBytes) != 256) {
                }
                z7 = true;
                changed = z7 | gapComposer.changed(rememberHapticTrigger2);
                rememberedValue2 = gapComposer.rememberedValue();
                if (changed) {
                }
                textStyle = m994copyp1EtxEg$default2;
                RoomDatabase$performClear$1 roomDatabase$performClear$122 = new RoomDatabase$performClear$1(z, mutableInteractionSourceImpl22, rememberHapticTrigger2, (Continuation) null, 7);
                mutableInteractionSourceImpl = mutableInteractionSourceImpl22;
                gapComposer.updateRememberedValue(roomDatabase$performClear$122);
                rememberedValue2 = roomDatabase$performClear$122;
                Updater.LaunchedEffect(objArr2, (Function2) rememberedValue2, gapComposer);
                Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(textStyle), re$$ExternalSyntheticOutline0.m(j42, ArcadeThemeKt.LocalTextColor), Recorder$$ExternalSyntheticOutline2.m(j82, ArcadeThemeKt.LocalIconColor), LocalEnabledStateKt.LocalEnabledState.defaultProvidedValue$runtime(Boolean.valueOf(z))}, Expect_jvmKt.rememberComposableLambda(-551127974, new FilterBarKt$$ExternalSyntheticLambda2(modifier, j92, m340RoundedCornerShape0680j_42, mutableInteractionSourceImpl, z, function0, obj, composableLambdaImpl, filterBarChipType), gapComposer), gapComposer, 56);
                z5 = z82;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new FilterBarKt$$ExternalSyntheticLambda3(function0, modifier, z, z2, filterBarChipType, obj, z5, composableLambdaImpl, i, i2);
                return;
            }
            return;
        }
        z4 = z3;
        i3 = i4 | (!gapComposer.changedInstance(composableLambdaImpl) ? 8388608 : 4194304);
        if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterBar(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        Modifier modifier3;
        LazyListState lazyListState3;
        RecomposeScopeImpl endRestartGroup;
        LazyListState lazyListState4;
        Modifier modifier4;
        LazyListState lazyListState5;
        int i4;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1981780572);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (gapComposer.changed(lazyListState2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            lazyListState2 = lazyListState;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            paddingValues2 = paddingValues;
            i3 |= gapComposer.changed(paddingValues2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
            }
            int i7 = 1;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
                lazyListState3 = lazyListState2;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListState4 = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
                        i3 &= -113;
                    } else {
                        lazyListState4 = lazyListState2;
                    }
                    if (i6 != 0) {
                        modifier4 = modifier5;
                        paddingValues2 = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 2);
                    } else {
                        modifier4 = modifier5;
                    }
                    lazyListState5 = lazyListState4;
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    lazyListState5 = lazyListState2;
                    modifier4 = modifier2;
                }
                gapComposer.endDefaults();
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                boolean z = (i3 & 7168) == 2048;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new AvatarsKt$$ExternalSyntheticLambda1(i7, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LazyDslKt.LazyRow(modifier4, lazyListState5, paddingValues2, arrangement$SpacedAligned, vertical, null, false, null, (Function1) rememberedValue, gapComposer, (i3 & 14) | 221184 | (i3 & 112) | (i3 & 896), 456);
                modifier3 = modifier4;
                lazyListState3 = lazyListState5;
            }
            PaddingValues paddingValues3 = paddingValues2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(modifier3, lazyListState3, paddingValues3, function1, i, i2, 7);
                return;
            }
            return;
        }
        paddingValues2 = paddingValues;
        if ((i & 3072) == 0) {
        }
        int i72 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        PaddingValues paddingValues32 = paddingValues2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void FilterBarChipContent(final Object obj, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        final Object obj2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(207593312);
        int i2 = (gapComposer.changedInstance(obj) ? 32 : 16) | i | (gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128);
        final int i3 = 0;
        final int i4 = 1;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            obj2 = obj;
            gapComposer.skipToGroupEnd();
        } else {
            if (obj == null) {
                gapComposer.startReplaceGroup(-340415270);
                composableLambdaImpl.invoke(RowScopeInstance.INSTANCE, obj, gapComposer, Integer.valueOf(i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO));
                gapComposer.end(false);
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2(obj, composableLambdaImpl, i, i3) { // from class: com.squareup.cash.arcade.components.FilterBarKt$$ExternalSyntheticLambda6
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ Object f$1;
                        public final /* synthetic */ ComposableLambdaImpl f$2;

                        {
                            this.$r8$classId = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i5 = this.$r8$classId;
                            ComposableLambdaImpl composableLambdaImpl2 = this.f$2;
                            Object obj5 = this.f$1;
                            Composer composer2 = (Composer) obj3;
                            ((Integer) obj4).getClass();
                            switch (i5) {
                                case 0:
                                    FilterBarKt.FilterBarChipContent(obj5, composableLambdaImpl2, composer2, Updater.updateChangedFlags(7));
                                    break;
                                default:
                                    FilterBarKt.FilterBarChipContent(obj5, composableLambdaImpl2, composer2, Updater.updateChangedFlags(7));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            gapComposer.startReplaceGroup(-340376830);
            gapComposer.end(false);
            int mo230roundToPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo230roundToPx0680j_4(AnimationVerticalOffset);
            boolean changed = gapComposer.changed(mo230roundToPx0680j_4);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new DatePickerKt$$ExternalSyntheticLambda10(mo230roundToPx0680j_4, 4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            obj2 = obj;
            AnimatedContentKt.AnimatedContent(obj2, null, (Function1) rememberedValue, null, "FilterBarChipContent", null, Expect_jvmKt.rememberComposableLambda(455715833, new FilterBarKt$$ExternalSyntheticLambda8(composableLambdaImpl, i3), gapComposer), gapComposer, ((i2 >> 3) & 14) | 1597440, 42);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new Function2(obj2, composableLambdaImpl, i, i4) { // from class: com.squareup.cash.arcade.components.FilterBarKt$$ExternalSyntheticLambda6
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ Object f$1;
                public final /* synthetic */ ComposableLambdaImpl f$2;

                {
                    this.$r8$classId = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    int i5 = this.$r8$classId;
                    ComposableLambdaImpl composableLambdaImpl2 = this.f$2;
                    Object obj5 = this.f$1;
                    Composer composer2 = (Composer) obj3;
                    ((Integer) obj4).getClass();
                    switch (i5) {
                        case 0:
                            FilterBarKt.FilterBarChipContent(obj5, composableLambdaImpl2, composer2, Updater.updateChangedFlags(7));
                            break;
                        default:
                            FilterBarKt.FilterBarChipContent(obj5, composableLambdaImpl2, composer2, Updater.updateChangedFlags(7));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
