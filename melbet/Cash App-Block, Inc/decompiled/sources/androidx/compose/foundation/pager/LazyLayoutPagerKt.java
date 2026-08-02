package androidx.compose.foundation.pager;

import android.os.Trace;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition$Start;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScopeImpl;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material3.SliderKt$sliderTapModifier$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import com.google.android.gms.dynamite.zzg;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.views.SsnViewKt$SsnContent$3$1$1;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.moneybot.viewmodels.textinput.MoneybotTextInputViewModel;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KProperty0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1;
import net.oneformapp.schema.Schema;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LazyLayoutPagerKt {
    public static final void MoneybotTextInputView(MoneybotTextInputViewModel moneybotTextInputViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        moneybotTextInputViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1403827551);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(moneybotTextInputViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MusicViewKt$$ExternalSyntheticLambda0(12, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(moneybotTextInputViewModel.initialText, 0L, gapComposer, 0, 2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue2;
            Unit unit = Unit.INSTANCE;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new SsnViewKt$SsnContent$3$1$1(focusRequester, null, 4);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
            boolean z2 = i4 == 32;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new MusicViewKt$$ExternalSyntheticLambda0(13, function1);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            i3 = 4;
            SheetKt.Sheet((Function0) rememberedValue4, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-1910298890, new BasicShieetScope$$ExternalSyntheticLambda0(focusRequester, m382rememberTextFieldStateLepunE, function1, moneybotTextInputViewModel, 8), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            i3 = 4;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(moneybotTextInputViewModel, function1, i, i3);
        }
    }

    /* renamed from: Pager-eLwUrMk, reason: not valid java name */
    public static final void m327PagereLwUrMk(final Modifier modifier, PagerState pagerState, final PaddingValues paddingValues, final Orientation orientation, SnapFlingBehavior snapFlingBehavior, final boolean z, final AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, int i, final float f, final PageSize pageSize, NestedScrollConnection nestedScrollConnection, final Alignment.Horizontal horizontal, final BiasAlignment.Vertical vertical, final SnapPosition$Start snapPosition$Start, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        ComposableLambdaImpl composableLambdaImpl2;
        NestedScrollConnection nestedScrollConnection2;
        final int i6;
        GapComposer gapComposer;
        SnapFlingBehavior snapFlingBehavior2;
        PagerState pagerState2;
        Object obj;
        final PagerState pagerState3;
        final Orientation orientation2;
        final CoroutineScope coroutineScope;
        int i7;
        KProperty0 kProperty0;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-572816025);
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changed(modifier) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changed(pagerState) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(paddingValues) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer2.changed(false) ? 2048 : 1024;
        }
        int i8 = i2 & 24576;
        int i9 = PKIFailureInfo.certRevoked;
        if (i8 == 0) {
            i4 |= gapComposer2.changed(orientation.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= gapComposer2.changed(snapFlingBehavior) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i10 = i2 & 1572864;
        int i11 = PKIFailureInfo.signerNotTrusted;
        if (i10 == 0) {
            i4 |= gapComposer2.changed(z) ? PKIFailureInfo.badCertTemplate : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= gapComposer2.changed(androidEdgeEffectOverscrollEffect) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= gapComposer2.changed(i) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= gapComposer2.changed(f) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (gapComposer2.changed(pageSize) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= gapComposer2.changedInstance(nestedScrollConnection) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer2.changedInstance(null) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= gapComposer2.changed(horizontal) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            if (gapComposer2.changed(vertical)) {
                i9 = 16384;
            }
            i5 |= i9;
        }
        if ((i3 & 196608) == 0) {
            i5 |= gapComposer2.changed(snapPosition$Start) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i3 & 1572864) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            if (gapComposer2.changedInstance(composableLambdaImpl2)) {
                i11 = PKIFailureInfo.badCertTemplate;
            }
            i5 |= i11;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
        }
        int i12 = i5;
        if (gapComposer2.shouldExecute(i4 & 1, ((i4 & 306783379) == 306783378 && (599187 & i12) == 599186) ? false : true)) {
            if (i < 0) {
                InlineClassHelperKt.throwIllegalArgumentException("beyondViewportPageCount should be greater than or equal to 0, you selected " + i);
            }
            int i13 = i4 & 112;
            boolean z2 = i13 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new PagerState$$ExternalSyntheticLambda1(pagerState, 1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            int i14 = i4 >> 3;
            int i15 = i14 & 14;
            int i16 = i12 >> 15;
            int i17 = i15 | (i16 & 112) | (i12 & 896);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(composableLambdaImpl2, gapComposer2);
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(null, gapComposer2);
            boolean changed = ((((i17 & 14) ^ 6) > 4 && gapComposer2.changed(pagerState)) || (i17 & 6) == 4) | gapComposer2.changed(rememberUpdatedState) | gapComposer2.changed(rememberUpdatedState2) | gapComposer2.changed(function0);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                NeverEqualPolicy neverEqualPolicy2 = NeverEqualPolicy.INSTANCE$1;
                rememberedValue2 = new LockFreeLinkedListNode$toString$1(0, 3, State.class, Updater.derivedStateOf(neverEqualPolicy2, new DialogHostKt$$ExternalSyntheticLambda0(12, Updater.derivedStateOf(neverEqualPolicy2, new LazyLayoutPagerKt$$ExternalSyntheticLambda3(rememberUpdatedState, rememberUpdatedState2, function0)), pagerState)), "value", "getValue()Ljava/lang/Object;");
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            final KProperty0 kProperty02 = (KProperty0) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue3;
            boolean z3 = i13 == 32;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (z3 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new PagerState$$ExternalSyntheticLambda1(pagerState, 2);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            final Function0 function02 = (Function0) rememberedValue4;
            int i18 = i4 >> 9;
            int i19 = (i4 & 65520) | (i18 & 458752) | (i18 & 3670016) | ((i12 << 21) & 29360128);
            int i20 = i12 << 15;
            int i21 = i19 | (i20 & 234881024) | (i20 & 1879048192);
            boolean changed2 = ((((i21 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer2.changed(paddingValues)) || (i21 & MLKEMEngine.KyberPolyBytes) == 256) | ((((i21 & 112) ^ 48) > 32 && gapComposer2.changed(pagerState)) || (i21 & 48) == 32) | ((((i21 & 7168) ^ 3072) > 2048 && gapComposer2.changed(false)) || (i21 & 3072) == 2048) | ((((57344 & i21) ^ 24576) > 16384 && gapComposer2.changed(orientation.ordinal())) || (i21 & 24576) == 16384) | ((((i21 & 234881024) ^ 100663296) > 67108864 && gapComposer2.changed(horizontal)) || (i21 & 100663296) == 67108864) | ((((i21 & 1879048192) ^ 805306368) > 536870912 && gapComposer2.changed(vertical)) || (i21 & 805306368) == 536870912) | ((((i21 & 3670016) ^ 1572864) > 1048576 && gapComposer2.changed(f)) || (i21 & 1572864) == 1048576) | ((((i21 & 29360128) ^ 12582912) > 8388608 && gapComposer2.changed(pageSize)) || (i21 & 12582912) == 8388608) | ((((i16 & 14) ^ 6) > 4 && gapComposer2.changed(snapPosition$Start)) || (i16 & 6) == 4) | gapComposer2.changed(function02) | ((((i21 & 458752) ^ 196608) > 131072 && gapComposer2.changed(i)) || (i21 & 196608) == 131072) | gapComposer2.changed(coroutineScope2);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue5 == neverEqualPolicy) {
                i6 = i;
                pagerState3 = pagerState;
                orientation2 = orientation;
                gapComposer = gapComposer2;
                coroutineScope = coroutineScope2;
                i7 = 4;
                obj = new LazyLayoutMeasurePolicy() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v106 */
                    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r0v35 */
                    /* JADX WARN: Type inference failed for: r0v36 */
                    /* JADX WARN: Type inference failed for: r0v40 */
                    /* JADX WARN: Type inference failed for: r0v41 */
                    /* JADX WARN: Type inference failed for: r0v55, types: [kotlin.collections.EmptyList] */
                    /* JADX WARN: Type inference failed for: r2v50, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r2v51 */
                    /* JADX WARN: Type inference failed for: r2v65, types: [kotlin.collections.EmptyList] */
                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
                    /* renamed from: measure-0kLqBqw */
                    public final MeasureResult mo307measure0kLqBqw(LazyLayoutMeasureScopeImpl lazyLayoutMeasureScopeImpl, long j) {
                        Orientation orientation3;
                        int i22;
                        Orientation orientation4;
                        int i23;
                        int i24;
                        BiasAlignment.Vertical vertical2;
                        PagerState pagerState4;
                        Alignment.Horizontal horizontal2;
                        PagerState pagerState5;
                        int i25;
                        int i26;
                        int i27;
                        long j2;
                        int i28;
                        int i29;
                        int i30;
                        int i31;
                        int i32;
                        int i33;
                        int i34;
                        int i35;
                        int i36;
                        int i37;
                        int i38;
                        MeasuredPage measuredPage;
                        int i39;
                        int i40;
                        ArrayDeque arrayDeque;
                        int i41;
                        int i42;
                        ArrayList arrayList;
                        int i43;
                        List list;
                        int i44;
                        int i45;
                        ArrayList arrayList2;
                        int i46;
                        Orientation orientation5;
                        int i47;
                        MeasuredPage measuredPage2;
                        ArrayDeque arrayDeque2;
                        int i48;
                        SubcomposeMeasureScope subcomposeMeasureScope;
                        ArrayList arrayList3;
                        List list2;
                        ArrayList arrayList4;
                        ?? arrayList5;
                        ?? arrayList6;
                        Object obj2;
                        List list3;
                        int i49;
                        SnapPosition$Start snapPosition$Start2;
                        int i50;
                        int i51;
                        int i52;
                        ArrayList arrayList7;
                        int i53;
                        PagerMeasureResult pagerMeasureResult;
                        LazyLayoutMeasureScopeImpl lazyLayoutMeasureScopeImpl2;
                        ArrayDeque arrayDeque3;
                        List list4;
                        int i54;
                        int i55;
                        int i56;
                        BiasAlignment.Vertical vertical3;
                        MeasuredPage measuredPage3;
                        long j3;
                        int i57;
                        int i58;
                        int i59;
                        List list5;
                        ArrayDeque arrayDeque4;
                        PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 = this;
                        SubcomposeMeasureScope subcomposeMeasureScope2 = lazyLayoutMeasureScopeImpl.subcomposeMeasureScope;
                        PagerState pagerState6 = PagerState.this;
                        pagerState6.measurementScopeInvalidator.getValue();
                        Orientation orientation6 = Orientation.Vertical;
                        Orientation orientation7 = orientation2;
                        boolean z4 = orientation7 == orientation6;
                        ImageKt.m180checkScrollableContainerConstraintsK40F9xA(j, z4 ? orientation6 : Orientation.Horizontal);
                        PaddingValues paddingValues2 = paddingValues;
                        int mo230roundToPx0680j_4 = z4 ? subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo265calculateLeftPaddingu2uoSUM(subcomposeMeasureScope2.getLayoutDirection())) : subcomposeMeasureScope2.mo230roundToPx0680j_4(SpacerKt.calculateStartPadding(paddingValues2, subcomposeMeasureScope2.getLayoutDirection()));
                        int mo230roundToPx0680j_42 = z4 ? subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo266calculateRightPaddingu2uoSUM(subcomposeMeasureScope2.getLayoutDirection())) : subcomposeMeasureScope2.mo230roundToPx0680j_4(SpacerKt.calculateEndPadding(paddingValues2, subcomposeMeasureScope2.getLayoutDirection()));
                        int mo230roundToPx0680j_43 = subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo267calculateTopPaddingD9Ej5fM());
                        int mo230roundToPx0680j_44 = subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo264calculateBottomPaddingD9Ej5fM()) + mo230roundToPx0680j_43;
                        int i60 = mo230roundToPx0680j_4 + mo230roundToPx0680j_42;
                        int i61 = z4 ? mo230roundToPx0680j_44 : i60;
                        if (z4) {
                            mo230roundToPx0680j_42 = mo230roundToPx0680j_43;
                        } else if (!z4) {
                            mo230roundToPx0680j_42 = mo230roundToPx0680j_4;
                        }
                        int i62 = i61 - mo230roundToPx0680j_42;
                        boolean z5 = z4;
                        long m1034offsetNN6EwU = ConstraintsKt.m1034offsetNN6EwU(-i60, -mo230roundToPx0680j_44, j);
                        pagerState6.density = lazyLayoutMeasureScopeImpl;
                        int mo230roundToPx0680j_45 = subcomposeMeasureScope2.mo230roundToPx0680j_4(f);
                        long j4 = m1034offsetNN6EwU;
                        int m1024getMaxHeightimpl = z5 ? Constraints.m1024getMaxHeightimpl(j) - mo230roundToPx0680j_44 : Constraints.m1025getMaxWidthimpl(j) - i60;
                        long j5 = (mo230roundToPx0680j_4 << 32) | (mo230roundToPx0680j_43 & BodyPartID.bodyIdMax);
                        int calculateMainAxisPageSize = pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScopeImpl, m1024getMaxHeightimpl);
                        int i63 = calculateMainAxisPageSize < 0 ? 0 : calculateMainAxisPageSize;
                        int i64 = m1024getMaxHeightimpl;
                        long j6 = j5;
                        ConstraintsKt.Constraints$default(0, orientation7 == orientation6 ? Constraints.m1025getMaxWidthimpl(j4) : i63, 0, orientation7 != orientation6 ? Constraints.m1024getMaxHeightimpl(j4) : i63, 5);
                        PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = (PagerLazyLayoutItemProvider) kProperty02.invoke();
                        int i65 = i64 + mo230roundToPx0680j_42 + i62;
                        SnapPosition$Start snapPosition$Start3 = snapPosition$Start;
                        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope2;
                        try {
                            Schema schema = pagerState6.scrollPosition;
                            int intValue = ((ParcelableSnapshotMutableIntState) schema.elementTypes).getIntValue();
                            int findIndexByKey = LazyLayoutKt.findIndexByKey(intValue, pagerLazyLayoutItemProvider, schema.mVersion);
                            if (intValue != findIndexByKey) {
                                orientation3 = orientation6;
                                ((ParcelableSnapshotMutableIntState) schema.elementTypes).setIntValue(findIndexByKey);
                                ((LazyLayoutNearestRangeState) schema.rootElements).update(intValue);
                            } else {
                                orientation3 = orientation6;
                            }
                            ((ParcelableSnapshotMutableIntState) schema.elementTypes).getIntValue();
                            float floatValue = ((ParcelableSnapshotMutableFloatState) schema.fieldSortOrder).getFloatValue();
                            pagerState6.getPageCount();
                            int i66 = i63 + mo230roundToPx0680j_45;
                            int roundToInt = MathKt__MathJVMKt.roundToInt(snapPosition$Start3.position(i65, i63, mo230roundToPx0680j_42, i62) - (floatValue * i66));
                            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            List calculateLazyLayoutPinnedIndices = LazyLayoutKt.calculateLazyLayoutPinnedIndices(pagerLazyLayoutItemProvider, pagerState6.pinnedPages, pagerState6.beyondBoundsInfo);
                            MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.EmptyIntObjectMap;
                            MutableIntObjectMap mutableIntObjectMap2 = new MutableIntObjectMap();
                            int intValue2 = ((Number) function02.invoke()).intValue();
                            MutableState mutableState = pagerState6.placementScopeInvalidator;
                            if (mo230roundToPx0680j_42 < 0) {
                                InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
                            }
                            if (i62 < 0) {
                                InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
                            }
                            int i67 = i66 < 0 ? 0 : i66;
                            PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider2 = pagerLazyLayoutItemProvider;
                            int i68 = i6;
                            if (i68 > intValue2) {
                                orientation4 = orientation3;
                                i22 = intValue2;
                            } else {
                                Orientation orientation8 = orientation3;
                                i22 = i68;
                                orientation4 = orientation8;
                            }
                            if (orientation7 == orientation4) {
                                i23 = roundToInt;
                                i24 = Constraints.m1025getMaxWidthimpl(j4);
                            } else {
                                i23 = roundToInt;
                                i24 = i63;
                            }
                            long Constraints$default = ConstraintsKt.Constraints$default(0, i24, 0, orientation7 != orientation4 ? Constraints.m1024getMaxHeightimpl(j4) : i63, 5);
                            MutableState mutableState2 = mutableState;
                            SnapPosition$Start snapPosition$Start4 = snapPosition$Start;
                            CoroutineScope coroutineScope3 = coroutineScope;
                            if (intValue2 <= 0) {
                                int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j4);
                                int m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j4);
                                BasicTextKt$$ExternalSyntheticLambda14 basicTextKt$$ExternalSyntheticLambda14 = new BasicTextKt$$ExternalSyntheticLambda14(11);
                                int m1033constrainWidthK40F9xA = ConstraintsKt.m1033constrainWidthK40F9xA(m1027getMinWidthimpl + i60, j);
                                int m1032constrainHeightK40F9xA = ConstraintsKt.m1032constrainHeightK40F9xA(m1026getMinHeightimpl + mo230roundToPx0680j_44, j);
                                EmptyMap emptyMap = EmptyMap.INSTANCE;
                                emptyMap.getClass();
                                pagerMeasureResult = new PagerMeasureResult(EmptyList.INSTANCE, i63, mo230roundToPx0680j_45, i62, orientation7, -mo230roundToPx0680j_42, i64 + i62, i22, snapPosition$Start4, subcomposeMeasureScope3.layout(m1033constrainWidthK40F9xA, m1032constrainHeightK40F9xA, emptyMap, basicTextKt$$ExternalSyntheticLambda14), coroutineScope3, lazyLayoutMeasureScopeImpl, Constraints$default);
                                lazyLayoutMeasureScopeImpl2 = lazyLayoutMeasureScopeImpl;
                                pagerState5 = pagerState6;
                            } else {
                                PagerState pagerState7 = pagerState6;
                                long j7 = Constraints$default;
                                int i69 = mo230roundToPx0680j_45;
                                int i70 = i62;
                                int i71 = i22;
                                int i72 = i63;
                                int i73 = i65;
                                while (findIndexByKey > 0 && i23 > 0) {
                                    findIndexByKey--;
                                    i23 -= i67;
                                }
                                int i74 = i23 * (-1);
                                if (findIndexByKey >= intValue2) {
                                    findIndexByKey = intValue2 - 1;
                                    i74 = 0;
                                }
                                int i75 = findIndexByKey;
                                ArrayDeque arrayDeque5 = new ArrayDeque();
                                int i76 = -mo230roundToPx0680j_42;
                                int i77 = i76 + (i69 < 0 ? i69 : 0);
                                int i78 = i67;
                                int i79 = i74 + i77;
                                int i80 = 0;
                                while (true) {
                                    vertical2 = vertical;
                                    pagerState4 = pagerState7;
                                    horizontal2 = horizontal;
                                    if (i79 >= 0 || i75 <= 0) {
                                        break;
                                    }
                                    i75--;
                                    int i81 = i71;
                                    int i82 = i73;
                                    PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider3 = pagerLazyLayoutItemProvider2;
                                    int i83 = i72;
                                    long j8 = j7;
                                    int i84 = intValue2;
                                    long j9 = j6;
                                    MeasuredPage m331getAndMeasureG5IdpRk = PagerMeasureKt.m331getAndMeasureG5IdpRk(lazyLayoutMeasureScopeImpl, i75, j8, pagerLazyLayoutItemProvider3, j9, orientation7, horizontal2, vertical2, subcomposeMeasureScope3.getLayoutDirection(), i83, mutableIntObjectMap2);
                                    arrayDeque5.add(0, m331getAndMeasureG5IdpRk);
                                    i80 = Math.max(i80, m331getAndMeasureG5IdpRk.crossAxisSize);
                                    i79 += i78;
                                    pagerLazyLayoutItemProvider2 = pagerLazyLayoutItemProvider3;
                                    j6 = j9;
                                    i72 = i83;
                                    i70 = i70;
                                    intValue2 = i84;
                                    j7 = j8;
                                    mo230roundToPx0680j_42 = mo230roundToPx0680j_42;
                                    j4 = j4;
                                    i69 = i69;
                                    i73 = i82;
                                    mutableState2 = mutableState2;
                                    i71 = i81;
                                    pagerState7 = pagerState4;
                                    pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 = this;
                                }
                                MutableState mutableState3 = mutableState2;
                                int i85 = i69;
                                int i86 = i71;
                                BiasAlignment.Vertical vertical4 = vertical2;
                                int i87 = mo230roundToPx0680j_42;
                                int i88 = i73;
                                long j10 = j4;
                                int i89 = i80;
                                int i90 = 0;
                                pagerState5 = pagerState4;
                                int i91 = i72;
                                long j11 = j7;
                                int i92 = i70;
                                int i93 = intValue2;
                                long j12 = j6;
                                PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider4 = pagerLazyLayoutItemProvider2;
                                if (i79 < i77) {
                                    i79 = i77;
                                }
                                int i94 = i79 - i77;
                                int i95 = i64 + i92;
                                int i96 = i95 < 0 ? 0 : i95;
                                int i97 = -i94;
                                boolean z6 = false;
                                int i98 = i89;
                                int i99 = i75;
                                while (i90 < arrayDeque5.size) {
                                    if (i97 >= i96) {
                                        arrayDeque5.removeAt(i90);
                                        z6 = true;
                                    } else {
                                        i99++;
                                        i97 += i78;
                                        i90++;
                                    }
                                }
                                int i100 = i93;
                                int i101 = i99;
                                int i102 = i94;
                                int i103 = i97;
                                int i104 = i92;
                                boolean z7 = z6;
                                while (true) {
                                    if (i101 >= i100) {
                                        i25 = i103;
                                        i26 = i104;
                                        i27 = i100;
                                        j2 = j11;
                                        i28 = i98;
                                        i29 = i64;
                                        break;
                                    }
                                    if (i103 >= i96 && i103 > 0 && !arrayDeque5.isEmpty()) {
                                        i25 = i103;
                                        i26 = i104;
                                        i27 = i100;
                                        i29 = i64;
                                        j2 = j11;
                                        i28 = i98;
                                        break;
                                    }
                                    int i105 = i104;
                                    int i106 = i100;
                                    int i107 = i103;
                                    int i108 = i64;
                                    long j13 = j11;
                                    int i109 = i98;
                                    int i110 = i96;
                                    ArrayDeque arrayDeque6 = arrayDeque5;
                                    int i111 = i101;
                                    MeasuredPage m331getAndMeasureG5IdpRk2 = PagerMeasureKt.m331getAndMeasureG5IdpRk(lazyLayoutMeasureScopeImpl, i111, j13, pagerLazyLayoutItemProvider4, j12, orientation7, horizontal2, vertical4, subcomposeMeasureScope3.getLayoutDirection(), i91, mutableIntObjectMap2);
                                    int i112 = i106 - 1;
                                    int i113 = i107 + (i111 == i112 ? i91 : i78);
                                    if (i113 > i77 || i111 == i112) {
                                        int max = Math.max(i109, m331getAndMeasureG5IdpRk2.crossAxisSize);
                                        arrayDeque4 = arrayDeque6;
                                        arrayDeque4.addLast(m331getAndMeasureG5IdpRk2);
                                        i98 = max;
                                    } else {
                                        i102 -= i78;
                                        i75 = i111 + 1;
                                        i98 = i109;
                                        arrayDeque4 = arrayDeque6;
                                        z7 = true;
                                    }
                                    i101 = i111 + 1;
                                    arrayDeque5 = arrayDeque4;
                                    i103 = i113;
                                    i96 = i110;
                                    i64 = i108;
                                    j11 = j13;
                                    i104 = i105;
                                    i100 = i106;
                                }
                                if (i25 < i29) {
                                    int i114 = i29 - i25;
                                    int i115 = i25 + i114;
                                    int i116 = i28;
                                    int i117 = i102 - i114;
                                    int i118 = i87;
                                    while (i117 < i118 && i75 > 0) {
                                        i75--;
                                        MeasuredPage m331getAndMeasureG5IdpRk3 = PagerMeasureKt.m331getAndMeasureG5IdpRk(lazyLayoutMeasureScopeImpl, i75, j2, pagerLazyLayoutItemProvider4, j12, orientation7, horizontal2, vertical4, subcomposeMeasureScope3.getLayoutDirection(), i91, mutableIntObjectMap2);
                                        arrayDeque5.add(0, m331getAndMeasureG5IdpRk3);
                                        i116 = Math.max(i116, m331getAndMeasureG5IdpRk3.crossAxisSize);
                                        i117 += i78;
                                        i118 = i118;
                                        i101 = i101;
                                    }
                                    i30 = i101;
                                    i31 = i118;
                                    int i119 = i117;
                                    int i120 = i116;
                                    if (i119 < 0) {
                                        i32 = i120;
                                        i34 = i115 + i119;
                                        i33 = 0;
                                    } else {
                                        i32 = i120;
                                        i33 = i119;
                                        i34 = i115;
                                    }
                                } else {
                                    i30 = i101;
                                    i31 = i87;
                                    i32 = i28;
                                    i33 = i102;
                                    i34 = i25;
                                }
                                if (i33 < 0) {
                                    InlineClassHelperKt.throwIllegalArgumentException("invalid currentFirstPageScrollOffset");
                                }
                                int i121 = -i33;
                                MeasuredPage measuredPage4 = (MeasuredPage) arrayDeque5.first();
                                int i122 = i34;
                                int i123 = i85;
                                if (i31 > 0 || i123 < 0) {
                                    int i124 = i33;
                                    int size = arrayDeque5.getSize();
                                    MeasuredPage measuredPage5 = measuredPage4;
                                    int i125 = i124;
                                    i35 = i121;
                                    int i126 = 0;
                                    while (i126 < size && i125 != 0) {
                                        i36 = i123;
                                        int i127 = i78;
                                        if (i127 > i125) {
                                            i78 = i127;
                                            break;
                                        }
                                        i78 = i127;
                                        i37 = 1;
                                        if (i126 == arrayDeque5.getSize() - 1) {
                                            break;
                                        }
                                        i125 -= i78;
                                        i126++;
                                        measuredPage5 = (MeasuredPage) arrayDeque5.get(i126);
                                        i123 = i36;
                                    }
                                    i36 = i123;
                                    i37 = 1;
                                    i38 = i125;
                                    measuredPage4 = measuredPage5;
                                } else {
                                    i35 = i121;
                                    i36 = i123;
                                    i37 = 1;
                                    i38 = i33;
                                }
                                int max2 = Math.max(0, i75 - i86);
                                int i128 = i75 - 1;
                                if (max2 <= i128) {
                                    ArrayList arrayList8 = null;
                                    while (true) {
                                        if (arrayList8 == null) {
                                            arrayList8 = new ArrayList();
                                        }
                                        i40 = i38;
                                        arrayList = arrayList8;
                                        measuredPage = measuredPage4;
                                        i39 = i29;
                                        arrayDeque = arrayDeque5;
                                        i41 = i86;
                                        i42 = max2;
                                        arrayList.add(PagerMeasureKt.m331getAndMeasureG5IdpRk(lazyLayoutMeasureScopeImpl, i128, j2, pagerLazyLayoutItemProvider4, j12, orientation7, horizontal2, vertical4, subcomposeMeasureScope3.getLayoutDirection(), i91, mutableIntObjectMap2));
                                        if (i128 == i42) {
                                            break;
                                        }
                                        i128--;
                                        max2 = i42;
                                        i86 = i41;
                                        measuredPage4 = measuredPage;
                                        arrayDeque5 = arrayDeque;
                                        i29 = i39;
                                        arrayList8 = arrayList;
                                        i38 = i40;
                                    }
                                } else {
                                    measuredPage = measuredPage4;
                                    i39 = i29;
                                    i40 = i38;
                                    arrayDeque = arrayDeque5;
                                    i41 = i86;
                                    i42 = max2;
                                    arrayList = null;
                                }
                                List list6 = calculateLazyLayoutPinnedIndices;
                                List list7 = list6;
                                int size2 = list7.size();
                                List list8 = arrayList;
                                int i129 = 0;
                                while (i129 < size2) {
                                    List list9 = list6;
                                    int intValue3 = ((Number) list6.get(i129)).intValue();
                                    if (intValue3 < i42) {
                                        if (list8 == null) {
                                            list8 = new ArrayList();
                                        }
                                        i58 = i42;
                                        i59 = i129;
                                        list5 = list9;
                                        List list10 = list8;
                                        i57 = size2;
                                        list10.add(PagerMeasureKt.m331getAndMeasureG5IdpRk(lazyLayoutMeasureScopeImpl, intValue3, j2, pagerLazyLayoutItemProvider4, j12, orientation7, horizontal2, vertical4, subcomposeMeasureScope3.getLayoutDirection(), i91, mutableIntObjectMap2));
                                        list8 = list10;
                                    } else {
                                        i57 = size2;
                                        i58 = i42;
                                        i59 = i129;
                                        list5 = list9;
                                    }
                                    i129 = i59 + 1;
                                    list6 = list5;
                                    size2 = i57;
                                    i42 = i58;
                                }
                                List list11 = list6;
                                if (list8 == null) {
                                    list8 = EmptyList.INSTANCE;
                                }
                                List list12 = list8;
                                int i130 = i32;
                                int i131 = 0;
                                for (int size3 = list12.size(); i131 < size3; size3 = size3) {
                                    i130 = Math.max(i130, ((MeasuredPage) list12.get(i131)).crossAxisSize);
                                    i131++;
                                }
                                int i132 = ((MeasuredPage) arrayDeque.last()).index;
                                int min = Math.min(i41, (i27 - i132) - 1) + i132;
                                int i133 = i132 + 1;
                                if (i133 <= min) {
                                    ArrayList arrayList9 = null;
                                    while (true) {
                                        if (arrayList9 == null) {
                                            arrayList9 = new ArrayList();
                                        }
                                        i44 = i41;
                                        arrayList2 = arrayList9;
                                        i43 = i130;
                                        list = list12;
                                        i45 = min;
                                        int i134 = i133;
                                        arrayList2.add(PagerMeasureKt.m331getAndMeasureG5IdpRk(lazyLayoutMeasureScopeImpl, i134, j2, pagerLazyLayoutItemProvider4, j12, orientation7, horizontal2, vertical4, subcomposeMeasureScope3.getLayoutDirection(), i91, mutableIntObjectMap2));
                                        if (i134 == i45) {
                                            break;
                                        }
                                        i133 = i134 + 1;
                                        min = i45;
                                        i130 = i43;
                                        list12 = list;
                                        arrayList9 = arrayList2;
                                        i41 = i44;
                                    }
                                } else {
                                    i43 = i130;
                                    list = list12;
                                    i44 = i41;
                                    i45 = min;
                                    arrayList2 = null;
                                }
                                int size4 = list7.size();
                                List list13 = arrayList2;
                                int i135 = 0;
                                while (i135 < size4) {
                                    int intValue4 = ((Number) list11.get(i135)).intValue();
                                    int i136 = size4;
                                    if (i45 + 1 <= intValue4) {
                                        int i137 = i27;
                                        if (intValue4 < i137) {
                                            if (list13 == null) {
                                                list13 = new ArrayList();
                                            }
                                            int i138 = i45;
                                            List list14 = list13;
                                            i55 = i138;
                                            list4 = list11;
                                            i54 = i137;
                                            MeasuredPage m331getAndMeasureG5IdpRk4 = PagerMeasureKt.m331getAndMeasureG5IdpRk(lazyLayoutMeasureScopeImpl, intValue4, j2, pagerLazyLayoutItemProvider4, j12, orientation7, horizontal2, vertical4, subcomposeMeasureScope3.getLayoutDirection(), i91, mutableIntObjectMap2);
                                            i56 = i40;
                                            long j14 = j2;
                                            vertical3 = vertical4;
                                            measuredPage3 = measuredPage;
                                            j3 = j14;
                                            list14.add(m331getAndMeasureG5IdpRk4);
                                            list13 = list14;
                                            i135++;
                                            MeasuredPage measuredPage6 = measuredPage3;
                                            vertical4 = vertical3;
                                            j2 = j3;
                                            measuredPage = measuredPage6;
                                            i40 = i56;
                                            i27 = i54;
                                            size4 = i136;
                                            i45 = i55;
                                            list11 = list4;
                                        } else {
                                            list4 = list11;
                                            i54 = i137;
                                            i55 = i45;
                                            i56 = i40;
                                        }
                                    } else {
                                        list4 = list11;
                                        i54 = i27;
                                        i55 = i45;
                                        i56 = i40;
                                    }
                                    long j15 = j2;
                                    vertical3 = vertical4;
                                    measuredPage3 = measuredPage;
                                    j3 = j15;
                                    i135++;
                                    MeasuredPage measuredPage62 = measuredPage3;
                                    vertical4 = vertical3;
                                    j2 = j3;
                                    measuredPage = measuredPage62;
                                    i40 = i56;
                                    i27 = i54;
                                    size4 = i136;
                                    i45 = i55;
                                    list11 = list4;
                                }
                                int i139 = i27;
                                MeasuredPage measuredPage7 = measuredPage;
                                int i140 = i40;
                                long j16 = j2;
                                if (list13 == null) {
                                    list13 = EmptyList.INSTANCE;
                                }
                                List list15 = list13;
                                int size5 = list15.size();
                                int i141 = i43;
                                for (int i142 = 0; i142 < size5; i142++) {
                                    i141 = Math.max(i141, ((MeasuredPage) list15.get(i142)).crossAxisSize);
                                }
                                int i143 = (Intrinsics.areEqual(measuredPage7, arrayDeque.first()) && list.isEmpty() && list15.isEmpty()) ? i37 : 0;
                                Orientation orientation9 = Orientation.Vertical;
                                int m1033constrainWidthK40F9xA2 = ConstraintsKt.m1033constrainWidthK40F9xA(orientation7 == orientation9 ? i141 : i122, j10);
                                if (orientation7 == orientation9) {
                                    i141 = i122;
                                }
                                int m1032constrainHeightK40F9xA2 = ConstraintsKt.m1032constrainHeightK40F9xA(i141, j10);
                                int i144 = orientation7 == orientation9 ? m1032constrainHeightK40F9xA2 : m1033constrainWidthK40F9xA2;
                                int i145 = i39;
                                int i146 = i122 < Math.min(i144, i145) ? i37 : 0;
                                if (i146 == 0 || i35 == 0) {
                                    i46 = i35;
                                } else {
                                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                                    i46 = i35;
                                    sb.append(i46);
                                    InlineClassHelperKt.throwIllegalStateException(sb.toString());
                                }
                                ArrayList arrayList10 = new ArrayList(list15.size() + list.size() + arrayDeque.getSize());
                                if (i146 != 0) {
                                    if (!list.isEmpty() || !list15.isEmpty()) {
                                        InlineClassHelperKt.throwIllegalArgumentException("No extra pages");
                                    }
                                    int size6 = arrayDeque.getSize();
                                    int[] iArr = new int[size6];
                                    for (int i147 = 0; i147 < size6; i147++) {
                                        iArr[i147] = i91;
                                    }
                                    int[] iArr2 = new int[size6];
                                    i47 = i143;
                                    measuredPage2 = measuredPage7;
                                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(subcomposeMeasureScope3.mo233toDpu2uoSUM(i36), false, null);
                                    if (orientation7 == Orientation.Vertical) {
                                        arrangement$SpacedAligned.arrange(lazyLayoutMeasureScopeImpl, i144, iArr, iArr2);
                                        arrayList3 = arrayList10;
                                        i48 = i122;
                                        orientation5 = orientation7;
                                        subcomposeMeasureScope = subcomposeMeasureScope3;
                                    } else {
                                        arrayList3 = arrayList10;
                                        i48 = i122;
                                        orientation5 = orientation7;
                                        subcomposeMeasureScope = subcomposeMeasureScope3;
                                        arrangement$SpacedAligned.arrange(lazyLayoutMeasureScopeImpl, i144, iArr, LayoutDirection.Ltr, iArr2);
                                    }
                                    IntRange indices = ArraysKt___ArraysKt.getIndices(iArr2);
                                    int i148 = indices.last;
                                    int i149 = indices.step;
                                    if ((i149 <= 0 || i148 < 0) && (i149 >= 0 || i148 > 0)) {
                                        arrayDeque2 = arrayDeque;
                                    } else {
                                        int i150 = 0;
                                        while (true) {
                                            int i151 = iArr2[i150];
                                            arrayDeque3 = arrayDeque;
                                            int i152 = i149;
                                            MeasuredPage measuredPage8 = (MeasuredPage) arrayDeque3.get(i150);
                                            measuredPage8.position(i151, m1033constrainWidthK40F9xA2, m1032constrainHeightK40F9xA2);
                                            arrayList3.add(measuredPage8);
                                            if (i150 == i148) {
                                                break;
                                            }
                                            i150 += i152;
                                            i149 = i152;
                                            arrayDeque = arrayDeque3;
                                        }
                                        arrayDeque2 = arrayDeque3;
                                    }
                                    list2 = list;
                                } else {
                                    orientation5 = orientation7;
                                    i47 = i143;
                                    measuredPage2 = measuredPage7;
                                    arrayDeque2 = arrayDeque;
                                    i48 = i122;
                                    subcomposeMeasureScope = subcomposeMeasureScope3;
                                    arrayList3 = arrayList10;
                                    int size7 = list.size();
                                    int i153 = i46;
                                    int i154 = 0;
                                    while (i154 < size7) {
                                        int i155 = size7;
                                        MeasuredPage measuredPage9 = (MeasuredPage) list.get(i154);
                                        i153 -= i66;
                                        measuredPage9.position(i153, m1033constrainWidthK40F9xA2, m1032constrainHeightK40F9xA2);
                                        arrayList3.add(measuredPage9);
                                        i154++;
                                        size7 = i155;
                                    }
                                    list2 = list;
                                    int size8 = arrayDeque2.getSize();
                                    for (int i156 = 0; i156 < size8; i156++) {
                                        MeasuredPage measuredPage10 = (MeasuredPage) arrayDeque2.get(i156);
                                        measuredPage10.position(i46, m1033constrainWidthK40F9xA2, m1032constrainHeightK40F9xA2);
                                        arrayList3.add(measuredPage10);
                                        i46 += i66;
                                    }
                                    int size9 = list15.size();
                                    for (int i157 = 0; i157 < size9; i157++) {
                                        MeasuredPage measuredPage11 = (MeasuredPage) list15.get(i157);
                                        measuredPage11.position(i46, m1033constrainWidthK40F9xA2, m1032constrainHeightK40F9xA2);
                                        arrayList3.add(measuredPage11);
                                        i46 += i66;
                                    }
                                }
                                if (i47 != 0) {
                                    arrayList4 = arrayList3;
                                } else {
                                    arrayList4 = new ArrayList(arrayList3.size());
                                    int size10 = arrayList3.size();
                                    int i158 = 0;
                                    while (i158 < size10) {
                                        Object obj3 = arrayList3.get(i158);
                                        ArrayDeque arrayDeque7 = arrayDeque2;
                                        MeasuredPage measuredPage12 = (MeasuredPage) obj3;
                                        int i159 = size10;
                                        int i160 = i158;
                                        if (measuredPage12.index >= ((MeasuredPage) arrayDeque7.first()).index && measuredPage12.index <= ((MeasuredPage) arrayDeque7.last()).index) {
                                            arrayList4.add(obj3);
                                        }
                                        i158 = i160 + 1;
                                        size10 = i159;
                                        arrayDeque2 = arrayDeque7;
                                    }
                                }
                                ArrayDeque arrayDeque8 = arrayDeque2;
                                if (list2.isEmpty()) {
                                    arrayList5 = EmptyList.INSTANCE;
                                } else {
                                    arrayList5 = new ArrayList(arrayList3.size());
                                    int size11 = arrayList3.size();
                                    int i161 = 0;
                                    while (i161 < size11) {
                                        Object obj4 = arrayList3.get(i161);
                                        int i162 = size11;
                                        if (((MeasuredPage) obj4).index < ((MeasuredPage) arrayDeque8.first()).index) {
                                            arrayList5.add(obj4);
                                        }
                                        i161++;
                                        size11 = i162;
                                    }
                                }
                                if (list15.isEmpty()) {
                                    arrayList6 = EmptyList.INSTANCE;
                                } else {
                                    arrayList6 = new ArrayList(arrayList3.size());
                                    int size12 = arrayList3.size();
                                    int i163 = 0;
                                    arrayList5 = arrayList5;
                                    while (i163 < size12) {
                                        Object obj5 = arrayList3.get(i163);
                                        Object obj6 = arrayList5;
                                        if (((MeasuredPage) obj5).index > ((MeasuredPage) arrayDeque8.last()).index) {
                                            arrayList6.add(obj5);
                                        }
                                        i163++;
                                        arrayList5 = obj6;
                                    }
                                }
                                List list16 = arrayList5;
                                if (arrayList4.isEmpty()) {
                                    arrayList7 = arrayList4;
                                    list3 = arrayList6;
                                    i53 = i140;
                                    i49 = m1032constrainHeightK40F9xA2;
                                    snapPosition$Start2 = snapPosition$Start4;
                                    i50 = i31;
                                    i51 = i88;
                                    i52 = i26;
                                    obj2 = null;
                                } else {
                                    obj2 = arrayList4.get(0);
                                    list3 = arrayList6;
                                    i49 = m1032constrainHeightK40F9xA2;
                                    snapPosition$Start2 = snapPosition$Start4;
                                    i50 = i31;
                                    i51 = i88;
                                    i52 = i26;
                                    float f2 = -Math.abs(((MeasuredPage) obj2).offset - snapPosition$Start2.position(i51, i91, i50, i52));
                                    int size13 = arrayList4.size() - 1;
                                    int i164 = i37;
                                    if (i164 <= size13) {
                                        Object obj7 = obj2;
                                        float f3 = f2;
                                        while (true) {
                                            Object obj8 = arrayList4.get(i164);
                                            arrayList7 = arrayList4;
                                            i53 = i140;
                                            float f4 = -Math.abs(((MeasuredPage) obj8).offset - snapPosition$Start2.position(i51, i91, i50, i52));
                                            if (Float.compare(f3, f4) < 0) {
                                                f3 = f4;
                                                obj7 = obj8;
                                            }
                                            if (i164 == size13) {
                                                break;
                                            }
                                            i164++;
                                            arrayList4 = arrayList7;
                                            i140 = i53;
                                        }
                                        obj2 = obj7;
                                    } else {
                                        arrayList7 = arrayList4;
                                        i53 = i140;
                                    }
                                }
                                MeasuredPage measuredPage13 = (MeasuredPage) obj2;
                                float coerceIn = i78 == 0 ? RecyclerView.DECELERATION_RATE : RangesKt___RangesKt.coerceIn((snapPosition$Start2.position(i51, i91, i50, i52) - (measuredPage13 != null ? measuredPage13.offset : 0)) / i78, -0.5f, 0.5f);
                                ClickableKt$$ExternalSyntheticLambda0 clickableKt$$ExternalSyntheticLambda0 = new ClickableKt$$ExternalSyntheticLambda0(28, mutableState3, arrayList3);
                                int m1033constrainWidthK40F9xA3 = ConstraintsKt.m1033constrainWidthK40F9xA(m1033constrainWidthK40F9xA2 + i60, j);
                                int m1032constrainHeightK40F9xA3 = ConstraintsKt.m1032constrainHeightK40F9xA(i49 + mo230roundToPx0680j_44, j);
                                EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                                emptyMap2.getClass();
                                MeasureResult layout = subcomposeMeasureScope.layout(m1033constrainWidthK40F9xA3, m1032constrainHeightK40F9xA3, emptyMap2, clickableKt$$ExternalSyntheticLambda0);
                                subcomposeMeasureScope3 = subcomposeMeasureScope;
                                pagerMeasureResult = new PagerMeasureResult(arrayList7, i91, i36, i52, orientation5, i76, i95, i44, measuredPage2, measuredPage13, coerceIn, i53, i30 < i139 || i48 > i145, snapPosition$Start2, layout, z7, list16, list3, coroutineScope3, lazyLayoutMeasureScopeImpl, j16);
                                lazyLayoutMeasureScopeImpl2 = lazyLayoutMeasureScopeImpl;
                            }
                            PagerState pagerState8 = pagerState5;
                            pagerState8.applyMeasureResult$foundation(pagerMeasureResult, subcomposeMeasureScope3.isLookingAhead(), false);
                            PagerCacheWindowLogic pagerCacheWindowLogic = pagerState8.cacheWindowLogic;
                            List list17 = pagerMeasureResult.visiblePagesInfo;
                            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
                            try {
                                if (pagerCacheWindowLogic.hasValidBounds() && !list17.isEmpty()) {
                                    int i165 = ((MeasuredPage) CollectionsKt.first(list17)).index;
                                    int i166 = ((MeasuredPage) CollectionsKt.last(list17)).index;
                                    for (int i167 = pagerCacheWindowLogic.prefetchWindowStartLine; i167 < i165; i167++) {
                                        lazyLayoutMeasureScopeImpl2.compose(i167);
                                    }
                                    int i168 = i166 + 1;
                                    int i169 = pagerCacheWindowLogic.prefetchWindowEndLine;
                                    if (i168 <= i169) {
                                        while (true) {
                                            lazyLayoutMeasureScopeImpl2.compose(i168);
                                            if (i168 == i169) {
                                                break;
                                            }
                                            i168++;
                                        }
                                    }
                                }
                                return pagerMeasureResult;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (Throwable th) {
                            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            throw th;
                        }
                    }
                };
                kProperty0 = kProperty02;
                gapComposer.updateRememberedValue(obj);
            } else {
                orientation2 = orientation;
                coroutineScope = coroutineScope2;
                obj = rememberedValue5;
                kProperty0 = kProperty02;
                gapComposer = gapComposer2;
                i7 = 4;
                pagerState3 = pagerState;
                i6 = i;
            }
            LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy = (LazyLayoutMeasurePolicy) obj;
            Orientation orientation3 = Orientation.Vertical;
            final boolean z4 = orientation2 == orientation3;
            boolean changed3 = (((i15 ^ 6) > i7 && gapComposer.changed(pagerState3)) || (i14 & 6) == i7) | gapComposer.changed(z4);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.pager.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final CollectionInfo collectionInfo() {
                        boolean z5 = z4;
                        PagerState pagerState4 = PagerState.this;
                        return z5 ? new CollectionInfo(pagerState4.getPageCount(), 1) : new CollectionInfo(1, pagerState4.getPageCount());
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final int getContentPadding() {
                        PagerState pagerState4 = PagerState.this;
                        return (-pagerState4.getLayoutInfo().viewportStartOffset) + pagerState4.getLayoutInfo().afterContentPadding;
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final float getMaxScrollOffset() {
                        PagerState pagerState4 = PagerState.this;
                        return PagerStateKt.calculateNewMaxScrollOffset(pagerState4.getLayoutInfo(), pagerState4.getPageCount());
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final float getScrollOffset() {
                        return ComposeUtilsKt.currentAbsoluteScrollOffset(PagerState.this);
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final int getViewport() {
                        PagerState pagerState4 = PagerState.this;
                        return (int) (pagerState4.getLayoutInfo().orientation == Orientation.Vertical ? pagerState4.getLayoutInfo().m332getViewportSizeYbymL2g() & BodyPartID.bodyIdMax : pagerState4.getLayoutInfo().m332getViewportSizeYbymL2g() >> 32);
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final Object scrollToItem(int i22, RingtoneView$playRingtone$1 ringtoneView$playRingtone$1) {
                        Object scrollToPage$default = PagerState.scrollToPage$default(PagerState.this, i22, ringtoneView$playRingtone$1);
                        return scrollToPage$default == CoroutineSingletons.COROUTINE_SUSPENDED ? scrollToPage$default : Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            LazyLayoutSemanticState lazyLayoutSemanticState = (LazyLayoutSemanticState) rememberedValue6;
            boolean z5 = (i13 == 32) | ((i4 & 458752) == 131072);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (z5 || rememberedValue7 == neverEqualPolicy) {
                snapFlingBehavior2 = snapFlingBehavior;
                rememberedValue7 = new PagerWrapperFlingBehavior(snapFlingBehavior2, pagerState3);
                gapComposer.updateRememberedValue(rememberedValue7);
            } else {
                snapFlingBehavior2 = snapFlingBehavior;
            }
            PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) rememberedValue7;
            BringIntoViewSpec bringIntoViewSpec = (BringIntoViewSpec) gapComposer.consume(BringIntoViewSpec_androidKt.LocalBringIntoViewSpec);
            LayoutDirection layoutDirection = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
            gapComposer.startReplaceGroup(-853904960);
            boolean changed4 = (i13 == 32) | gapComposer.changed(bringIntoViewSpec) | gapComposer.changed(layoutDirection.ordinal());
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (changed4 || rememberedValue8 == neverEqualPolicy) {
                rememberedValue8 = new PagerBringIntoViewSpec(pagerState3, bringIntoViewSpec, layoutDirection);
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            PagerBringIntoViewSpec pagerBringIntoViewSpec = (PagerBringIntoViewSpec) rememberedValue8;
            gapComposer.end(false);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-853484445);
                int i22 = i15 | ((i4 >> 21) & 112);
                boolean z6 = ((((i22 & 112) ^ 48) > 32 && gapComposer.changed(i6)) || (i22 & 48) == 32) | ((((i22 & 14) ^ 6) > 4 && gapComposer.changed(pagerState3)) || (i22 & 6) == 4);
                Object rememberedValue9 = gapComposer.rememberedValue();
                if (z6 || rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = new PagerBeyondBoundsState(pagerState3, i6);
                    gapComposer.updateRememberedValue(rememberedValue9);
                }
                modifier2 = LazyLayoutKt.lazyLayoutBeyondBoundsModifier((PagerBeyondBoundsState) rememberedValue9, pagerState3.beyondBoundsInfo, orientation2);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-853054661);
                gapComposer.end(false);
                modifier2 = companion;
            }
            Modifier lazyLayoutSemantics = LazyLayoutKt.lazyLayoutSemantics(modifier.then(pagerState3.remeasurementModifier).then(pagerState3.awaitLayoutModifier), kProperty0, lazyLayoutSemanticState, orientation2, z);
            Modifier scrollableArea = ImageKt.scrollableArea((z ? lazyLayoutSemantics.then(SemanticsModifierKt.semantics(companion, false, new DialogHostKt$$ExternalSyntheticLambda2(orientation2 == orientation3, pagerState3, coroutineScope, 2))) : lazyLayoutSemantics.then(companion)).then(modifier2), pagerState3, orientation, androidEdgeEffectOverscrollEffect, z, pagerWrapperFlingBehavior, pagerState3.internalInteractionSource, pagerBringIntoViewSpec);
            pagerState2 = pagerState3;
            Modifier then = scrollableArea.then(SuspendingPointerInputFilterKt.pointerInput(companion, pagerState2, new SliderKt$sliderTapModifier$1(pagerState2, 1)));
            nestedScrollConnection2 = nestedScrollConnection;
            LazyLayoutKt.LazyLayout(kProperty0, NestedScrollModifierKt.nestedScroll(then, nestedScrollConnection2, null), pagerState2.prefetchState, lazyLayoutMeasurePolicy, gapComposer, 0);
        } else {
            nestedScrollConnection2 = nestedScrollConnection;
            i6 = i;
            gapComposer = gapComposer2;
            snapFlingBehavior2 = snapFlingBehavior;
            pagerState2 = pagerState;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final NestedScrollConnection nestedScrollConnection3 = nestedScrollConnection2;
            final PagerState pagerState4 = pagerState2;
            final int i23 = i6;
            final SnapFlingBehavior snapFlingBehavior3 = snapFlingBehavior2;
            endRestartGroup.block = new Function2() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i3);
                    LazyLayoutPagerKt.m327PagereLwUrMk(Modifier.this, pagerState4, paddingValues, orientation, snapFlingBehavior3, z, androidEdgeEffectOverscrollEffect, i23, f, pageSize, nestedScrollConnection3, horizontal, vertical, snapPosition$Start, composableLambdaImpl, (Composer) obj2, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Money balance(BalanceSnapshot balanceSnapshot) {
        Money money;
        return (balanceSnapshot == null || (money = balanceSnapshot.balance) == null) ? new Money((Long) 0L, (CurrencyCode) null, 6) : money;
    }
}
