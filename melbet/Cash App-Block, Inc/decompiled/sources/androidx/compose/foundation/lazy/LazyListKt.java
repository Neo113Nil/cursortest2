package androidx.compose.foundation.lazy;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.CombinedClickableElement;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.Arrangement$Vertical;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListKt;
import androidx.compose.foundation.lazy.layout.CachedItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScopeImpl;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidClipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.dynamite.zzg;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.moneybot.views.menu.DropdownItem;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.moneybot.views.message.UserMessageUiKt$$ExternalSyntheticLambda5;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import com.squareup.cash.ui.util.RealCashVibrator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KProperty0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:179:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyList(final Modifier modifier, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, final FlingBehavior flingBehavior, final boolean z2, final AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Alignment.Horizontal horizontal, Arrangement$Vertical arrangement$Vertical, BiasAlignment.Vertical vertical, Arrangement$Horizontal arrangement$Horizontal, final Function1 function1, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Alignment.Horizontal horizontal2;
        int i5;
        int i6;
        int i7;
        LazyListState lazyListState2;
        GapComposer gapComposer;
        final Arrangement$Vertical arrangement$Vertical2;
        final BiasAlignment.Vertical vertical2;
        final Arrangement$Horizontal arrangement$Horizontal2;
        final Alignment.Horizontal horizontal3;
        RecomposeScopeImpl endRestartGroup;
        int i8;
        Arrangement$Vertical arrangement$Vertical3;
        int i9;
        final Arrangement$Horizontal arrangement$Horizontal3;
        final BiasAlignment.Vertical vertical3;
        LazyLayoutSemanticState lazyLayoutSemanticState;
        int i10;
        KProperty0 kProperty0;
        Arrangement$Vertical arrangement$Vertical4;
        Arrangement$Horizontal arrangement$Horizontal4;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(924924659);
        if ((i & 6) == 0) {
            i4 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changed(lazyListState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(paddingValues) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= gapComposer2.changed(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i4 |= gapComposer2.changed(flingBehavior) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= gapComposer2.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i4 |= gapComposer2.changed(androidEdgeEffectOverscrollEffect) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i11 = i3 & 512;
        if (i11 != 0) {
            i4 |= 805306368;
            horizontal2 = horizontal;
        } else {
            horizontal2 = horizontal;
            if ((i & 805306368) == 0) {
                i4 |= gapComposer2.changed(horizontal2) ? PKIFailureInfo.duplicateCertReq : 268435456;
            }
        }
        int i12 = i3 & 1024;
        if (i12 != 0) {
            i6 = i2 | 6;
            i5 = i4;
        } else if ((i2 & 6) == 0) {
            i5 = i4;
            i6 = i2 | (gapComposer2.changed(arrangement$Vertical) ? 4 : 2);
        } else {
            i5 = i4;
            i6 = i2;
        }
        int i13 = i3 & 2048;
        if (i13 != 0) {
            i6 |= 48;
            i7 = i13;
        } else if ((i2 & 48) == 0) {
            i7 = i13;
            i6 |= gapComposer2.changed(vertical) ? 32 : 16;
        } else {
            i7 = i13;
        }
        int i14 = i6;
        int i15 = i3 & 4096;
        if (i15 != 0) {
            i14 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= gapComposer2.changed(arrangement$Horizontal) ? 256 : 128;
            if ((i2 & 3072) == 0) {
                i14 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
            }
            if (gapComposer2.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378 || (i14 & 1171) != 1170)) {
                lazyListState2 = lazyListState;
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                arrangement$Vertical2 = arrangement$Vertical;
                vertical2 = vertical;
                arrangement$Horizontal2 = arrangement$Horizontal;
                horizontal3 = horizontal2;
            } else {
                gapComposer2.startDefaults();
                if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                    i8 = i5 & (-234881025);
                    if (i11 != 0) {
                        horizontal2 = null;
                    }
                    arrangement$Vertical3 = i12 != 0 ? null : arrangement$Vertical;
                    BiasAlignment.Vertical vertical4 = i7 != 0 ? null : vertical;
                    if (i15 != 0) {
                        i9 = i14;
                        horizontal3 = horizontal2;
                        arrangement$Horizontal3 = null;
                    } else {
                        i9 = i14;
                        horizontal3 = horizontal2;
                        arrangement$Horizontal3 = arrangement$Horizontal;
                    }
                    vertical3 = vertical4;
                } else {
                    gapComposer2.skipToGroupEnd();
                    i8 = i5 & (-234881025);
                    arrangement$Vertical3 = arrangement$Vertical;
                    i9 = i14;
                    horizontal3 = horizontal2;
                    vertical3 = vertical;
                    arrangement$Horizontal3 = arrangement$Horizontal;
                }
                gapComposer2.endDefaults();
                int i16 = i8 >> 3;
                int i17 = i16 & 14;
                int i18 = i17 | ((i9 >> 6) & 112);
                int i19 = i8;
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(function1, gapComposer2);
                int i20 = i9;
                boolean z3 = (((i18 & 14) ^ 6) > 4 && gapComposer2.changed(lazyListState)) || (i18 & 6) == 4;
                Object rememberedValue = gapComposer2.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z3 || rememberedValue == neverEqualPolicy) {
                    LazyItemScopeImpl lazyItemScopeImpl = new LazyItemScopeImpl();
                    lazyItemScopeImpl.maxWidthState = new ParcelableSnapshotMutableIntState(Integer.MAX_VALUE);
                    lazyItemScopeImpl.maxHeightState = new ParcelableSnapshotMutableIntState(Integer.MAX_VALUE);
                    NeverEqualPolicy neverEqualPolicy2 = NeverEqualPolicy.INSTANCE$1;
                    rememberedValue = new LockFreeLinkedListNode$toString$1(0, 1, State.class, Updater.derivedStateOf(neverEqualPolicy2, new n$$ExternalSyntheticLambda1(3, Updater.derivedStateOf(neverEqualPolicy2, new TooltipKt$$ExternalSyntheticLambda1(3, rememberUpdatedState)), lazyListState, lazyItemScopeImpl)), "value", "getValue()Ljava/lang/Object;");
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                final KProperty0 kProperty02 = (KProperty0) rememberedValue;
                int i21 = i19 >> 9;
                int i22 = i17 | (i21 & 112);
                boolean z4 = ((((i22 & 112) ^ 48) > 32 && gapComposer2.changed(z)) || (i22 & 48) == 32) | ((((i22 & 14) ^ 6) > 4 && gapComposer2.changed(lazyListState)) || (i22 & 6) == 4);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z4 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new LazyLayoutSemanticState(z) { // from class: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
                        public final /* synthetic */ boolean $isVertical;
                        public final DerivedSnapshotState totalItemsCount$delegate;

                        {
                            this.$isVertical = z;
                            this.totalItemsCount$delegate = Updater.derivedStateOf(new DatePickerKt$$ExternalSyntheticLambda24(LazyListState.this, 1));
                        }

                        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                        public final CollectionInfo collectionInfo() {
                            boolean z5 = this.$isVertical;
                            DerivedSnapshotState derivedSnapshotState = this.totalItemsCount$delegate;
                            return z5 ? new CollectionInfo(((Number) derivedSnapshotState.getValue()).intValue(), 1) : new CollectionInfo(1, ((Number) derivedSnapshotState.getValue()).intValue());
                        }

                        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                        public final int getContentPadding() {
                            LazyListState lazyListState3 = LazyListState.this;
                            return (-lazyListState3.getLayoutInfo().viewportStartOffset) + lazyListState3.getLayoutInfo().afterContentPadding;
                        }

                        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                        public final float getMaxScrollOffset() {
                            LazyListState lazyListState3 = LazyListState.this;
                            int intValue = lazyListState3.scrollPosition.index$delegate.getIntValue();
                            int intValue2 = lazyListState3.scrollPosition.scrollOffset$delegate.getIntValue();
                            return lazyListState3.getCanScrollForward() ? (intValue * 500) + intValue2 + 100.0f : (intValue * 500) + intValue2;
                        }

                        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                        public final float getScrollOffset() {
                            LazyListState lazyListState3 = LazyListState.this;
                            return (lazyListState3.scrollPosition.index$delegate.getIntValue() * 500) + lazyListState3.scrollPosition.scrollOffset$delegate.getIntValue();
                        }

                        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                        public final int getViewport() {
                            LazyListState lazyListState3 = LazyListState.this;
                            return (int) (lazyListState3.getLayoutInfo().orientation == Orientation.Vertical ? lazyListState3.getLayoutInfo().m310getViewportSizeYbymL2g() & BodyPartID.bodyIdMax : lazyListState3.getLayoutInfo().m310getViewportSizeYbymL2g() >> 32);
                        }

                        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                        public final Object scrollToItem(int i23, RingtoneView$playRingtone$1 ringtoneView$playRingtone$1) {
                            WorkLauncherImpl workLauncherImpl = LazyListState.Saver;
                            Object scrollToItem = LazyListState.this.scrollToItem(i23, 0, ringtoneView$playRingtone$1);
                            return scrollToItem == CoroutineSingletons.COROUTINE_SUSPENDED ? scrollToItem : Unit.INSTANCE;
                        }
                    };
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                LazyLayoutSemanticState lazyLayoutSemanticState2 = (LazyLayoutSemanticState) rememberedValue2;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
                final GraphicsContext graphicsContext = (GraphicsContext) gapComposer2.consume(CompositionLocalsKt.LocalGraphicsContext);
                final CachedItem.NoKey noKey = ((Boolean) gapComposer2.consume(CompositionLocalsKt.LocalProvidableScrollCaptureInProgress)).booleanValue() ? null : StickyItemsPlacement$Companion.StickToTopPlacement;
                int i23 = i20 << 18;
                int i24 = (i19 & 65520) | (i21 & 3670016) | (i23 & 29360128) | (i23 & 234881024) | ((i20 << 27) & 1879048192);
                boolean changed = ((((i24 & 112) ^ 48) > 32 && gapComposer2.changed(lazyListState)) || (i24 & 48) == 32) | ((((i24 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer2.changed(paddingValues)) || (i24 & MLKEMEngine.KyberPolyBytes) == 256) | ((((i24 & 7168) ^ 3072) > 2048 && gapComposer2.changed(false)) || (i24 & 3072) == 2048) | ((((57344 & i24) ^ 24576) > 16384 && gapComposer2.changed(z)) || (i24 & 24576) == 16384) | gapComposer2.changed(0) | ((((i24 & 3670016) ^ 1572864) > 1048576 && gapComposer2.changed(horizontal3)) || (i24 & 1572864) == 1048576) | ((((i24 & 29360128) ^ 12582912) > 8388608 && gapComposer2.changed(vertical3)) || (i24 & 12582912) == 8388608) | ((((i24 & 234881024) ^ 100663296) > 67108864 && gapComposer2.changed(arrangement$Horizontal3)) || (i24 & 100663296) == 67108864) | ((((i24 & 1879048192) ^ 805306368) > 536870912 && gapComposer2.changed(arrangement$Vertical3)) || (i24 & 805306368) == 536870912) | gapComposer2.changed(graphicsContext) | gapComposer2.changed(noKey);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (changed || rememberedValue4 == neverEqualPolicy) {
                    gapComposer = gapComposer2;
                    lazyLayoutSemanticState = lazyLayoutSemanticState2;
                    i10 = 4;
                    final Arrangement$Vertical arrangement$Vertical5 = arrangement$Vertical3;
                    rememberedValue4 = new LazyLayoutMeasurePolicy() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:271:0x077b  */
                        /* JADX WARN: Removed duplicated region for block: B:276:0x07a5 A[ADDED_TO_REGION] */
                        /* JADX WARN: Removed duplicated region for block: B:280:0x07d8  */
                        /* JADX WARN: Removed duplicated region for block: B:282:0x07e1  */
                        /* JADX WARN: Removed duplicated region for block: B:285:0x07ee  */
                        /* JADX WARN: Removed duplicated region for block: B:287:0x07f1  */
                        /* JADX WARN: Removed duplicated region for block: B:288:0x07e6  */
                        /* JADX WARN: Removed duplicated region for block: B:289:0x07dd  */
                        /* JADX WARN: Removed duplicated region for block: B:291:0x0794  */
                        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
                        /* renamed from: measure-0kLqBqw, reason: not valid java name */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final MeasureResult mo307measure0kLqBqw(LazyLayoutMeasureScopeImpl lazyLayoutMeasureScopeImpl, long j) {
                            float mo252getSpacingD9Ej5fM;
                            LazyListState lazyListState3;
                            long j2;
                            int i25;
                            int i26;
                            int i27;
                            int i28;
                            int i29;
                            int i30;
                            int i31;
                            float f;
                            int i32;
                            float f2;
                            int i33;
                            int i34;
                            List list;
                            int i35;
                            float f3;
                            ArrayList arrayList;
                            int i36;
                            LazyListItemProviderImpl lazyListItemProviderImpl;
                            int i37;
                            int i38;
                            ArrayList arrayList2;
                            int i39;
                            LazyLayoutItemAnimator lazyLayoutItemAnimator;
                            LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1;
                            float f4;
                            LazyListMeasuredItem lazyListMeasuredItem;
                            boolean z5;
                            Integer valueOf;
                            Integer valueOf2;
                            int i40;
                            int i41;
                            LazyListMeasureResult lazyListMeasureResult;
                            SubcomposeMeasureScope subcomposeMeasureScope;
                            int i42;
                            List list2;
                            ArrayList arrayList3;
                            int i43;
                            SubcomposeMeasureScope subcomposeMeasureScope2 = lazyLayoutMeasureScopeImpl.subcomposeMeasureScope;
                            LazyListState lazyListState4 = LazyListState.this;
                            lazyListState4.measurementScopeInvalidator.getValue();
                            int i44 = 1;
                            boolean z6 = lazyListState4.hasLookaheadOccurred || subcomposeMeasureScope2.isLookingAhead();
                            boolean z7 = z;
                            ImageKt.m180checkScrollableContainerConstraintsK40F9xA(j, z7 ? Orientation.Vertical : Orientation.Horizontal);
                            PaddingValues paddingValues2 = paddingValues;
                            int mo230roundToPx0680j_4 = z7 ? subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo265calculateLeftPaddingu2uoSUM(subcomposeMeasureScope2.getLayoutDirection())) : subcomposeMeasureScope2.mo230roundToPx0680j_4(SpacerKt.calculateStartPadding(paddingValues2, subcomposeMeasureScope2.getLayoutDirection()));
                            int mo230roundToPx0680j_42 = z7 ? subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo266calculateRightPaddingu2uoSUM(subcomposeMeasureScope2.getLayoutDirection())) : subcomposeMeasureScope2.mo230roundToPx0680j_4(SpacerKt.calculateEndPadding(paddingValues2, subcomposeMeasureScope2.getLayoutDirection()));
                            int mo230roundToPx0680j_43 = subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo267calculateTopPaddingD9Ej5fM());
                            int mo230roundToPx0680j_44 = subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo264calculateBottomPaddingD9Ej5fM()) + mo230roundToPx0680j_43;
                            int i45 = mo230roundToPx0680j_4 + mo230roundToPx0680j_42;
                            int i46 = z7 ? mo230roundToPx0680j_44 : i45;
                            int i47 = z7 ? mo230roundToPx0680j_43 : !z7 ? mo230roundToPx0680j_4 : mo230roundToPx0680j_42;
                            int i48 = i46 - i47;
                            long m1034offsetNN6EwU = ConstraintsKt.m1034offsetNN6EwU(-i45, -mo230roundToPx0680j_44, j);
                            LazyListItemProviderImpl lazyListItemProviderImpl2 = (LazyListItemProviderImpl) kProperty02.invoke();
                            LazyItemScopeImpl lazyItemScopeImpl2 = lazyListItemProviderImpl2.itemScope;
                            int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(m1034offsetNN6EwU);
                            int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(m1034offsetNN6EwU);
                            lazyItemScopeImpl2.maxWidthState.setIntValue(m1025getMaxWidthimpl);
                            lazyItemScopeImpl2.maxHeightState.setIntValue(m1024getMaxHeightimpl);
                            Arrangement$Horizontal arrangement$Horizontal5 = arrangement$Horizontal3;
                            Arrangement$Vertical arrangement$Vertical6 = arrangement$Vertical5;
                            if (z7) {
                                if (arrangement$Vertical6 == null) {
                                    throw Recorder$$ExternalSyntheticOutline2.m("null verticalArrangement when isVertical == true");
                                }
                                mo252getSpacingD9Ej5fM = arrangement$Vertical6.mo252getSpacingD9Ej5fM();
                            } else {
                                if (arrangement$Horizontal5 == null) {
                                    throw Recorder$$ExternalSyntheticOutline2.m("null horizontalAlignment when isVertical == false");
                                }
                                mo252getSpacingD9Ej5fM = arrangement$Horizontal5.mo252getSpacingD9Ej5fM();
                            }
                            int mo230roundToPx0680j_45 = subcomposeMeasureScope2.mo230roundToPx0680j_4(mo252getSpacingD9Ej5fM);
                            int itemCount = lazyListItemProviderImpl2.getItemCount();
                            int m1024getMaxHeightimpl2 = z7 ? Constraints.m1024getMaxHeightimpl(j) - mo230roundToPx0680j_44 : Constraints.m1025getMaxWidthimpl(j) - i45;
                            long j3 = (mo230roundToPx0680j_4 << 32) | (mo230roundToPx0680j_43 & BodyPartID.bodyIdMax);
                            int i49 = m1024getMaxHeightimpl2;
                            int i50 = i47;
                            LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12 = new LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1(m1034offsetNN6EwU, z, lazyListItemProviderImpl2, lazyLayoutMeasureScopeImpl, itemCount, mo230roundToPx0680j_45, horizontal3, vertical3, i50, i48, j3, LazyListState.this);
                            int i51 = itemCount;
                            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                            try {
                                LazyListScrollPosition lazyListScrollPosition = lazyListState4.scrollPosition;
                                int intValue = lazyListScrollPosition.index$delegate.getIntValue();
                                int findIndexByKey = LazyLayoutKt.findIndexByKey(intValue, lazyListItemProviderImpl2, lazyListScrollPosition.lastKnownFirstItemKey);
                                if (intValue != findIndexByKey) {
                                    lazyListScrollPosition.index$delegate.setIntValue(findIndexByKey);
                                    lazyListScrollPosition.nearestRangeState.update(intValue);
                                }
                                int intValue2 = lazyListScrollPosition.scrollOffset$delegate.getIntValue();
                                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                List calculateLazyLayoutPinnedIndices = LazyLayoutKt.calculateLazyLayoutPinnedIndices(lazyListItemProviderImpl2, lazyListState4.pinnedItems, lazyListState4.beyondBoundsInfo);
                                float floatValue = (subcomposeMeasureScope2.isLookingAhead() || !z6) ? lazyListState4.scrollToBeConsumed : ((Number) ((AnimationState) lazyListState4._lazyLayoutScrollDeltaBetweenPasses.this$0).value$delegate.getValue()).floatValue();
                                LazyLayoutItemAnimator lazyLayoutItemAnimator2 = lazyListState4.itemAnimator;
                                boolean isLookingAhead = subcomposeMeasureScope2.isLookingAhead();
                                MutableState mutableState = lazyListState4.placementScopeInvalidator;
                                boolean z8 = lazyListState4.skipItemPlacementAnimation;
                                if (i50 < 0) {
                                    InlineClassHelperKt.throwIllegalArgumentException("invalid beforeContentPadding");
                                }
                                if (i48 < 0) {
                                    InlineClassHelperKt.throwIllegalArgumentException("invalid afterContentPadding");
                                }
                                LazyListItemProviderImpl lazyListItemProviderImpl3 = lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12.itemProvider;
                                boolean z9 = z;
                                CoroutineScope coroutineScope2 = coroutineScope;
                                GraphicsContext graphicsContext2 = graphicsContext;
                                int i52 = intValue2;
                                if (i51 <= 0) {
                                    int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(m1034offsetNN6EwU);
                                    int m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(m1034offsetNN6EwU);
                                    lazyLayoutItemAnimator2.onMeasured(0, m1027getMinWidthimpl, m1026getMinHeightimpl, new ArrayList(), lazyListItemProviderImpl3.keyIndexMap, lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12, z9, isLookingAhead, 1, z6, 0, 0, coroutineScope2, graphicsContext2);
                                    if (!isLookingAhead) {
                                        long m321getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator2.m321getMinSizeToFitDisappearingItemsYbymL2g();
                                        if (!IntSize.m1055equalsimpl0(m321getMinSizeToFitDisappearingItemsYbymL2g, 0L)) {
                                            m1027getMinWidthimpl = ConstraintsKt.m1033constrainWidthK40F9xA((int) (m321getMinSizeToFitDisappearingItemsYbymL2g >> 32), m1034offsetNN6EwU);
                                            m1026getMinHeightimpl = ConstraintsKt.m1032constrainHeightK40F9xA((int) (m321getMinSizeToFitDisappearingItemsYbymL2g & BodyPartID.bodyIdMax), m1034offsetNN6EwU);
                                        }
                                    }
                                    BasicTextKt$$ExternalSyntheticLambda14 basicTextKt$$ExternalSyntheticLambda14 = new BasicTextKt$$ExternalSyntheticLambda14(3);
                                    int m1033constrainWidthK40F9xA = ConstraintsKt.m1033constrainWidthK40F9xA(m1027getMinWidthimpl + i45, j);
                                    int m1032constrainHeightK40F9xA = ConstraintsKt.m1032constrainHeightK40F9xA(m1026getMinHeightimpl + mo230roundToPx0680j_44, j);
                                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                                    emptyMap.getClass();
                                    subcomposeMeasureScope = subcomposeMeasureScope2;
                                    lazyListState3 = lazyListState4;
                                    lazyListMeasureResult = new LazyListMeasureResult(null, 0, false, RecyclerView.DECELERATION_RATE, subcomposeMeasureScope2.layout(m1033constrainWidthK40F9xA, m1032constrainHeightK40F9xA, emptyMap, basicTextKt$$ExternalSyntheticLambda14), RecyclerView.DECELERATION_RATE, false, coroutineScope2, lazyLayoutMeasureScopeImpl, lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12.childConstraints, EmptyList.INSTANCE, -i50, i49 + i48, 0, z9 ? Orientation.Vertical : Orientation.Horizontal, i48, mo230roundToPx0680j_45);
                                } else {
                                    int i53 = i49;
                                    lazyListState3 = lazyListState4;
                                    if (findIndexByKey >= i51) {
                                        findIndexByKey = i51 - 1;
                                        i52 = 0;
                                    }
                                    int round = Math.round(floatValue);
                                    int i54 = i52 - round;
                                    if (findIndexByKey == 0 && i54 < 0) {
                                        round += i54;
                                        i54 = 0;
                                    }
                                    ArrayDeque arrayDeque = new ArrayDeque();
                                    boolean z10 = z8;
                                    int i55 = -i50;
                                    float f5 = floatValue;
                                    int i56 = i55 + (mo230roundToPx0680j_45 < 0 ? mo230roundToPx0680j_45 : 0);
                                    int i57 = i54 + i56;
                                    int i58 = findIndexByKey;
                                    int i59 = 0;
                                    while (true) {
                                        j2 = lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12.childConstraints;
                                        if (i57 >= 0 || i58 <= 0) {
                                            break;
                                        }
                                        boolean z11 = z10;
                                        int i60 = i58 - 1;
                                        LazyListMeasuredItem m309getAndMeasure0kLqBqw = lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12.m309getAndMeasure0kLqBqw(i60, j2);
                                        arrayDeque.add(0, m309getAndMeasure0kLqBqw);
                                        i59 = Math.max(i59, m309getAndMeasure0kLqBqw.crossAxisSize);
                                        i57 += m309getAndMeasure0kLqBqw.mainAxisSizeWithSpacings;
                                        i58 = i60;
                                        z10 = z11;
                                    }
                                    boolean z12 = z10;
                                    int i61 = 0;
                                    if (i57 < i56) {
                                        round -= i56 - i57;
                                        i57 = i56;
                                    }
                                    int i62 = round;
                                    int i63 = i57 - i56;
                                    int i64 = i59;
                                    int i65 = i53 + i48;
                                    if (i65 < 0) {
                                        i25 = i65;
                                    } else {
                                        i61 = i65;
                                        i25 = i61;
                                    }
                                    int i66 = i63;
                                    int i67 = -i63;
                                    int i68 = i58;
                                    int i69 = 0;
                                    boolean z13 = false;
                                    while (i69 < arrayDeque.size) {
                                        if (i67 >= i61) {
                                            arrayDeque.removeAt(i69);
                                            z13 = true;
                                        } else {
                                            i68++;
                                            i67 += ((LazyListMeasuredItem) arrayDeque.get(i69)).mainAxisSizeWithSpacings;
                                            i69++;
                                        }
                                    }
                                    int i70 = i68;
                                    int i71 = i64;
                                    boolean z14 = z13;
                                    while (i70 < i51 && (i67 < i61 || i67 <= 0 || arrayDeque.isEmpty())) {
                                        int i72 = i61;
                                        LazyListMeasuredItem m309getAndMeasure0kLqBqw2 = lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12.m309getAndMeasure0kLqBqw(i70, j2);
                                        int i73 = i51;
                                        int i74 = m309getAndMeasure0kLqBqw2.mainAxisSizeWithSpacings;
                                        i67 += i74;
                                        if (i67 <= i56) {
                                            i43 = i56;
                                            if (i70 != i73 - 1) {
                                                i66 -= i74;
                                                i58 = i70 + 1;
                                                z14 = true;
                                                i70++;
                                                i61 = i72;
                                                i56 = i43;
                                                i51 = i73;
                                            }
                                        } else {
                                            i43 = i56;
                                        }
                                        int max = Math.max(i71, m309getAndMeasure0kLqBqw2.crossAxisSize);
                                        arrayDeque.addLast(m309getAndMeasure0kLqBqw2);
                                        i71 = max;
                                        i70++;
                                        i61 = i72;
                                        i56 = i43;
                                        i51 = i73;
                                    }
                                    int i75 = i51;
                                    if (i67 < i53) {
                                        int i76 = i53 - i67;
                                        int i77 = i67 + i76;
                                        int i78 = i66 - i76;
                                        while (i78 < i50 && i58 > 0) {
                                            int i79 = i58 - 1;
                                            int i80 = i76;
                                            LazyListMeasuredItem m309getAndMeasure0kLqBqw3 = lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12.m309getAndMeasure0kLqBqw(i79, j2);
                                            arrayDeque.add(0, m309getAndMeasure0kLqBqw3);
                                            i71 = Math.max(i71, m309getAndMeasure0kLqBqw3.crossAxisSize);
                                            i78 += m309getAndMeasure0kLqBqw3.mainAxisSizeWithSpacings;
                                            i58 = i79;
                                            i76 = i80;
                                            i77 = i77;
                                        }
                                        int i81 = i76;
                                        int i82 = i77;
                                        i26 = i62;
                                        int i83 = i26 + i81;
                                        if (i78 < 0) {
                                            int i84 = i83 + i78;
                                            i27 = i82 + i78;
                                            i28 = i58;
                                            i30 = i84;
                                            i29 = 0;
                                        } else {
                                            i29 = i78;
                                            i28 = i58;
                                            i27 = i82;
                                            i30 = i83;
                                        }
                                    } else {
                                        i26 = i62;
                                        i27 = i67;
                                        i28 = i58;
                                        i29 = i66;
                                        i30 = i26;
                                    }
                                    int i85 = i71;
                                    if (Integer.signum(Math.round(f5)) != Integer.signum(i30) || Math.abs(Math.round(f5)) < Math.abs(i30)) {
                                        i31 = i30;
                                        f = f5;
                                    } else {
                                        i31 = i30;
                                        f = i31;
                                    }
                                    float f6 = f5 - f;
                                    float f7 = RecyclerView.DECELERATION_RATE;
                                    if (isLookingAhead && i31 > i26 && f6 <= RecyclerView.DECELERATION_RATE) {
                                        f7 = (i31 - i26) + f6;
                                    }
                                    float f8 = f7;
                                    if (i29 < 0) {
                                        InlineClassHelperKt.throwIllegalArgumentException("negative currentFirstItemScrollOffset");
                                    }
                                    int i86 = -i29;
                                    LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) arrayDeque.first();
                                    if (i50 > 0 || mo230roundToPx0680j_45 < 0) {
                                        i32 = i86;
                                        int size = arrayDeque.getSize();
                                        f2 = f8;
                                        int i87 = i29;
                                        int i88 = 0;
                                        while (i88 < size) {
                                            int i89 = size;
                                            int i90 = ((LazyListMeasuredItem) arrayDeque.get(i88)).mainAxisSizeWithSpacings;
                                            if (i87 == 0 || i90 > i87 || i88 == arrayDeque.getSize() - 1) {
                                                break;
                                            }
                                            i87 -= i90;
                                            i88++;
                                            lazyListMeasuredItem2 = (LazyListMeasuredItem) arrayDeque.get(i88);
                                            size = i89;
                                        }
                                        i33 = i87;
                                    } else {
                                        i32 = i86;
                                        i33 = i29;
                                        f2 = f8;
                                    }
                                    LazyListMeasuredItem lazyListMeasuredItem3 = lazyListMeasuredItem2;
                                    int max2 = Math.max(0, i28);
                                    int i91 = i28 - 1;
                                    if (max2 <= i91) {
                                        List list3 = null;
                                        while (true) {
                                            if (list3 == null) {
                                                list3 = new ArrayList();
                                            }
                                            i34 = i70;
                                            list = list3;
                                            list.add(lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12.m309getAndMeasure0kLqBqw(i91, j2));
                                            if (i91 == max2) {
                                                break;
                                            }
                                            i91--;
                                            list3 = list;
                                            i70 = i34;
                                        }
                                    } else {
                                        i34 = i70;
                                        list = null;
                                    }
                                    List list4 = calculateLazyLayoutPinnedIndices;
                                    int size2 = list4.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i92 = size2 - 1;
                                            int intValue3 = ((Number) calculateLazyLayoutPinnedIndices.get(size2)).intValue();
                                            if (intValue3 < max2) {
                                                if (list == null) {
                                                    list = new ArrayList();
                                                }
                                                list.add(lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12.m309getAndMeasure0kLqBqw(intValue3, j2));
                                            }
                                            if (i92 < 0) {
                                                break;
                                            }
                                            size2 = i92;
                                        }
                                    }
                                    if (list == null) {
                                        list = EmptyList.INSTANCE;
                                    }
                                    int i93 = i85;
                                    int i94 = 0;
                                    for (int size3 = list.size(); i94 < size3; size3 = size3) {
                                        i93 = Math.max(i93, ((LazyListMeasuredItem) list.get(i94)).crossAxisSize);
                                        i94++;
                                    }
                                    int min = Math.min(((LazyListMeasuredItem) CollectionsKt.last((List) arrayDeque)).index, i75 - 1);
                                    int i95 = ((LazyListMeasuredItem) CollectionsKt.last((List) arrayDeque)).index + 1;
                                    if (i95 <= min) {
                                        ArrayList arrayList4 = null;
                                        while (true) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            i35 = i93;
                                            f3 = f;
                                            arrayList = arrayList4;
                                            arrayList.add(lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12.m309getAndMeasure0kLqBqw(i95, j2));
                                            if (i95 == min) {
                                                break;
                                            }
                                            i95++;
                                            arrayList4 = arrayList;
                                            i93 = i35;
                                            f = f3;
                                        }
                                    } else {
                                        i35 = i93;
                                        f3 = f;
                                        arrayList = null;
                                    }
                                    if (arrayList != null && ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).index > min) {
                                        min = ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).index;
                                    }
                                    int size4 = list4.size();
                                    int i96 = 0;
                                    while (i96 < size4) {
                                        ArrayList arrayList5 = arrayList;
                                        int intValue4 = ((Number) calculateLazyLayoutPinnedIndices.get(i96)).intValue();
                                        if (intValue4 > min) {
                                            if (arrayList5 == null) {
                                                list2 = calculateLazyLayoutPinnedIndices;
                                                arrayList3 = new ArrayList();
                                            } else {
                                                list2 = calculateLazyLayoutPinnedIndices;
                                                arrayList3 = arrayList5;
                                            }
                                            arrayList3.add(lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12.m309getAndMeasure0kLqBqw(intValue4, j2));
                                            arrayList = arrayList3;
                                        } else {
                                            list2 = calculateLazyLayoutPinnedIndices;
                                            arrayList = arrayList5;
                                        }
                                        i96++;
                                        calculateLazyLayoutPinnedIndices = list2;
                                    }
                                    ArrayList arrayList6 = arrayList;
                                    List list5 = arrayList6 == null ? EmptyList.INSTANCE : arrayList6;
                                    int size5 = list5.size();
                                    int i97 = i35;
                                    for (int i98 = 0; i98 < size5; i98++) {
                                        i97 = Math.max(i97, ((LazyListMeasuredItem) list5.get(i98)).crossAxisSize);
                                    }
                                    boolean z15 = Intrinsics.areEqual(lazyListMeasuredItem3, arrayDeque.first()) && list.isEmpty() && list5.isEmpty();
                                    int m1033constrainWidthK40F9xA2 = ConstraintsKt.m1033constrainWidthK40F9xA(z9 ? i97 : i27, m1034offsetNN6EwU);
                                    if (z9) {
                                        i97 = i27;
                                    }
                                    int m1032constrainHeightK40F9xA2 = ConstraintsKt.m1032constrainHeightK40F9xA(i97, m1034offsetNN6EwU);
                                    int i99 = z9 ? m1032constrainHeightK40F9xA2 : m1033constrainWidthK40F9xA2;
                                    boolean z16 = i27 < Math.min(i99, i53);
                                    if (z16 && i32 != 0) {
                                        InlineClassHelperKt.throwIllegalStateException("non-zero itemsScrollOffset");
                                    }
                                    ArrayList arrayList7 = new ArrayList(list5.size() + list.size() + arrayDeque.getSize());
                                    if (z16) {
                                        if (!list.isEmpty() || !list5.isEmpty()) {
                                            InlineClassHelperKt.throwIllegalArgumentException("no extra items");
                                        }
                                        int size6 = arrayDeque.getSize();
                                        int[] iArr = new int[size6];
                                        for (int i100 = 0; i100 < size6; i100++) {
                                            iArr[i100] = ((LazyListMeasuredItem) arrayDeque.get(i100)).size;
                                        }
                                        int[] iArr2 = new int[size6];
                                        if (z9) {
                                            if (arrangement$Vertical6 == null) {
                                                throw Recorder$$ExternalSyntheticOutline2.m("null verticalArrangement when isVertical == true");
                                            }
                                            arrangement$Vertical6.arrange(lazyLayoutMeasureScopeImpl, i99, iArr, iArr2);
                                            i42 = i53;
                                            i36 = i27;
                                            lazyListItemProviderImpl = lazyListItemProviderImpl3;
                                            i37 = 0;
                                        } else {
                                            if (arrangement$Horizontal5 == null) {
                                                throw Recorder$$ExternalSyntheticOutline2.m("null horizontalArrangement when isVertical == false");
                                            }
                                            i42 = i53;
                                            i36 = i27;
                                            lazyListItemProviderImpl = lazyListItemProviderImpl3;
                                            i37 = 0;
                                            arrangement$Horizontal5.arrange(lazyLayoutMeasureScopeImpl, i99, iArr, LayoutDirection.Ltr, iArr2);
                                        }
                                        IntRange indices = ArraysKt___ArraysKt.getIndices(iArr2);
                                        int i101 = indices.last;
                                        int i102 = indices.step;
                                        if ((i102 > 0 && i101 >= 0) || (i102 < 0 && i101 <= 0)) {
                                            int i103 = i37;
                                            while (true) {
                                                int i104 = iArr2[i103];
                                                LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) arrayDeque.get(i103);
                                                lazyListMeasuredItem4.position(i104, m1033constrainWidthK40F9xA2, m1032constrainHeightK40F9xA2);
                                                arrayList7.add(lazyListMeasuredItem4);
                                                if (i103 == i101) {
                                                    break;
                                                }
                                                i103 += i102;
                                            }
                                        }
                                        i53 = i42;
                                    } else {
                                        i36 = i27;
                                        lazyListItemProviderImpl = lazyListItemProviderImpl3;
                                        i37 = 0;
                                        int i105 = i32;
                                        int i106 = 0;
                                        for (int size7 = list.size(); i106 < size7; size7 = size7) {
                                            LazyListMeasuredItem lazyListMeasuredItem5 = (LazyListMeasuredItem) list.get(i106);
                                            i105 -= lazyListMeasuredItem5.mainAxisSizeWithSpacings;
                                            lazyListMeasuredItem5.position(i105, m1033constrainWidthK40F9xA2, m1032constrainHeightK40F9xA2);
                                            arrayList7.add(lazyListMeasuredItem5);
                                            i106++;
                                        }
                                        int size8 = arrayDeque.getSize();
                                        int i107 = i32;
                                        for (int i108 = 0; i108 < size8; i108++) {
                                            LazyListMeasuredItem lazyListMeasuredItem6 = (LazyListMeasuredItem) arrayDeque.get(i108);
                                            lazyListMeasuredItem6.position(i107, m1033constrainWidthK40F9xA2, m1032constrainHeightK40F9xA2);
                                            arrayList7.add(lazyListMeasuredItem6);
                                            i107 += lazyListMeasuredItem6.mainAxisSizeWithSpacings;
                                        }
                                        int size9 = list5.size();
                                        for (int i109 = 0; i109 < size9; i109++) {
                                            LazyListMeasuredItem lazyListMeasuredItem7 = (LazyListMeasuredItem) list5.get(i109);
                                            lazyListMeasuredItem7.position(i107, m1033constrainWidthK40F9xA2, m1032constrainHeightK40F9xA2);
                                            arrayList7.add(lazyListMeasuredItem7);
                                            i107 += lazyListMeasuredItem7.mainAxisSizeWithSpacings;
                                        }
                                    }
                                    if (z12) {
                                        i38 = m1032constrainHeightK40F9xA2;
                                        arrayList2 = arrayList7;
                                        i39 = i36;
                                        lazyLayoutItemAnimator = lazyLayoutItemAnimator2;
                                        lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 = lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12;
                                        f4 = f3;
                                    } else {
                                        f4 = f3;
                                        int i110 = i36;
                                        lazyLayoutItemAnimator = lazyLayoutItemAnimator2;
                                        lazyLayoutItemAnimator.onMeasured((int) f4, m1033constrainWidthK40F9xA2, m1032constrainHeightK40F9xA2, arrayList7, lazyListItemProviderImpl.keyIndexMap, lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12, z9, isLookingAhead, 1, z6, i33, i110, coroutineScope2, graphicsContext2);
                                        i38 = m1032constrainHeightK40F9xA2;
                                        arrayList2 = arrayList7;
                                        lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 = lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$12;
                                        i39 = i110;
                                    }
                                    float f9 = f4;
                                    if (isLookingAhead) {
                                        lazyListMeasuredItem = lazyListMeasuredItem3;
                                        z5 = z15;
                                    } else {
                                        long m321getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m321getMinSizeToFitDisappearingItemsYbymL2g();
                                        lazyListMeasuredItem = lazyListMeasuredItem3;
                                        z5 = z15;
                                        if (!IntSize.m1055equalsimpl0(m321getMinSizeToFitDisappearingItemsYbymL2g2, 0L)) {
                                            int i111 = z9 ? i38 : m1033constrainWidthK40F9xA2;
                                            m1033constrainWidthK40F9xA2 = ConstraintsKt.m1033constrainWidthK40F9xA(Math.max(m1033constrainWidthK40F9xA2, (int) (m321getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)), m1034offsetNN6EwU);
                                            i38 = ConstraintsKt.m1032constrainHeightK40F9xA(Math.max(i38, (int) (m321getMinSizeToFitDisappearingItemsYbymL2g2 & BodyPartID.bodyIdMax)), m1034offsetNN6EwU);
                                            int i112 = z9 ? i38 : m1033constrainWidthK40F9xA2;
                                            if (i112 != i111) {
                                                int size10 = arrayList2.size();
                                                for (int i113 = i37; i113 < size10; i113++) {
                                                    LazyListMeasuredItem lazyListMeasuredItem8 = (LazyListMeasuredItem) arrayList2.get(i113);
                                                    lazyListMeasuredItem8.mainAxisLayoutSize = i112;
                                                    lazyListMeasuredItem8.maxMainAxisOffset = lazyListMeasuredItem8.afterContentPadding + i112;
                                                }
                                            }
                                        }
                                    }
                                    int i114 = i38;
                                    int i115 = m1033constrainWidthK40F9xA2;
                                    LazyListMeasuredItem lazyListMeasuredItem9 = (LazyListMeasuredItem) arrayDeque.firstOrNull();
                                    int i116 = lazyListMeasuredItem9 != null ? lazyListMeasuredItem9.index : i37;
                                    LazyListMeasuredItem lazyListMeasuredItem10 = (LazyListMeasuredItem) arrayDeque.lastOrNull();
                                    int i117 = lazyListMeasuredItem10 != null ? lazyListMeasuredItem10.index : i37;
                                    MutableIntList mutableIntList = lazyListItemProviderImpl.intervalContent._headerIndexes;
                                    if (mutableIntList == null) {
                                        mutableIntList = IntListKt.EmptyIntList;
                                    }
                                    ArrayList arrayList8 = arrayList2;
                                    List applyStickyItems = LazyLayoutKt.applyStickyItems(noKey, i116, i117, arrayList8, mutableIntList, i50, i115, i114, new ObjectList$$ExternalSyntheticLambda0(lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1, 17));
                                    if (z5) {
                                        LazyListMeasuredItem lazyListMeasuredItem11 = (LazyListMeasuredItem) CollectionsKt.firstOrNull((List) arrayList8);
                                        if (lazyListMeasuredItem11 != null) {
                                            valueOf = Integer.valueOf(lazyListMeasuredItem11.index);
                                            if (z5) {
                                                LazyListMeasuredItem lazyListMeasuredItem12 = (LazyListMeasuredItem) arrayDeque.lastOrNull();
                                                if (lazyListMeasuredItem12 != null) {
                                                    valueOf2 = Integer.valueOf(lazyListMeasuredItem12.index);
                                                    i40 = i75;
                                                    i41 = i34;
                                                }
                                                i40 = i75;
                                                i41 = i34;
                                                valueOf2 = null;
                                            } else {
                                                LazyListMeasuredItem lazyListMeasuredItem13 = (LazyListMeasuredItem) CollectionsKt.lastOrNull((List) arrayList8);
                                                if (lazyListMeasuredItem13 != null) {
                                                    valueOf2 = Integer.valueOf(lazyListMeasuredItem13.index);
                                                    i40 = i75;
                                                    i41 = i34;
                                                }
                                                i40 = i75;
                                                i41 = i34;
                                                valueOf2 = null;
                                            }
                                            if (i41 >= i40 && i39 <= i53) {
                                                i44 = i37;
                                            }
                                            LazyListMeasureKt$$ExternalSyntheticLambda2 lazyListMeasureKt$$ExternalSyntheticLambda2 = new LazyListMeasureKt$$ExternalSyntheticLambda2(mutableState, arrayList8, applyStickyItems, isLookingAhead, 0);
                                            int m1033constrainWidthK40F9xA3 = ConstraintsKt.m1033constrainWidthK40F9xA(i115 + i45, j);
                                            int m1032constrainHeightK40F9xA3 = ConstraintsKt.m1032constrainHeightK40F9xA(i114 + mo230roundToPx0680j_44, j);
                                            EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                                            emptyMap2.getClass();
                                            subcomposeMeasureScope = subcomposeMeasureScope2;
                                            lazyListMeasureResult = new LazyListMeasureResult(lazyListMeasuredItem, i33, i44, f9, subcomposeMeasureScope2.layout(m1033constrainWidthK40F9xA3, m1032constrainHeightK40F9xA3, emptyMap2, lazyListMeasureKt$$ExternalSyntheticLambda2), f2, z14, coroutineScope2, lazyLayoutMeasureScopeImpl, lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1.childConstraints, LazyLayoutKt.updatedVisibleItems(valueOf == null ? valueOf.intValue() : i37, valueOf2 == null ? valueOf2.intValue() : i37, arrayList8, applyStickyItems), i55, i25, i40, !z9 ? Orientation.Vertical : Orientation.Horizontal, i48, mo230roundToPx0680j_45);
                                        }
                                        valueOf = null;
                                        if (z5) {
                                        }
                                        if (i41 >= i40) {
                                            i44 = i37;
                                        }
                                        LazyListMeasureKt$$ExternalSyntheticLambda2 lazyListMeasureKt$$ExternalSyntheticLambda22 = new LazyListMeasureKt$$ExternalSyntheticLambda2(mutableState, arrayList8, applyStickyItems, isLookingAhead, 0);
                                        int m1033constrainWidthK40F9xA32 = ConstraintsKt.m1033constrainWidthK40F9xA(i115 + i45, j);
                                        int m1032constrainHeightK40F9xA32 = ConstraintsKt.m1032constrainHeightK40F9xA(i114 + mo230roundToPx0680j_44, j);
                                        EmptyMap emptyMap22 = EmptyMap.INSTANCE;
                                        emptyMap22.getClass();
                                        if (!z9) {
                                        }
                                        subcomposeMeasureScope = subcomposeMeasureScope2;
                                        lazyListMeasureResult = new LazyListMeasureResult(lazyListMeasuredItem, i33, i44, f9, subcomposeMeasureScope2.layout(m1033constrainWidthK40F9xA32, m1032constrainHeightK40F9xA32, emptyMap22, lazyListMeasureKt$$ExternalSyntheticLambda22), f2, z14, coroutineScope2, lazyLayoutMeasureScopeImpl, lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1.childConstraints, LazyLayoutKt.updatedVisibleItems(valueOf == null ? valueOf.intValue() : i37, valueOf2 == null ? valueOf2.intValue() : i37, arrayList8, applyStickyItems), i55, i25, i40, !z9 ? Orientation.Vertical : Orientation.Horizontal, i48, mo230roundToPx0680j_45);
                                    } else {
                                        LazyListMeasuredItem lazyListMeasuredItem14 = (LazyListMeasuredItem) arrayDeque.firstOrNull();
                                        if (lazyListMeasuredItem14 != null) {
                                            valueOf = Integer.valueOf(lazyListMeasuredItem14.index);
                                            if (z5) {
                                            }
                                            if (i41 >= i40) {
                                            }
                                            LazyListMeasureKt$$ExternalSyntheticLambda2 lazyListMeasureKt$$ExternalSyntheticLambda222 = new LazyListMeasureKt$$ExternalSyntheticLambda2(mutableState, arrayList8, applyStickyItems, isLookingAhead, 0);
                                            int m1033constrainWidthK40F9xA322 = ConstraintsKt.m1033constrainWidthK40F9xA(i115 + i45, j);
                                            int m1032constrainHeightK40F9xA322 = ConstraintsKt.m1032constrainHeightK40F9xA(i114 + mo230roundToPx0680j_44, j);
                                            EmptyMap emptyMap222 = EmptyMap.INSTANCE;
                                            emptyMap222.getClass();
                                            if (!z9) {
                                            }
                                            subcomposeMeasureScope = subcomposeMeasureScope2;
                                            lazyListMeasureResult = new LazyListMeasureResult(lazyListMeasuredItem, i33, i44, f9, subcomposeMeasureScope2.layout(m1033constrainWidthK40F9xA322, m1032constrainHeightK40F9xA322, emptyMap222, lazyListMeasureKt$$ExternalSyntheticLambda222), f2, z14, coroutineScope2, lazyLayoutMeasureScopeImpl, lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1.childConstraints, LazyLayoutKt.updatedVisibleItems(valueOf == null ? valueOf.intValue() : i37, valueOf2 == null ? valueOf2.intValue() : i37, arrayList8, applyStickyItems), i55, i25, i40, !z9 ? Orientation.Vertical : Orientation.Horizontal, i48, mo230roundToPx0680j_45);
                                        }
                                        valueOf = null;
                                        if (z5) {
                                        }
                                        if (i41 >= i40) {
                                        }
                                        LazyListMeasureKt$$ExternalSyntheticLambda2 lazyListMeasureKt$$ExternalSyntheticLambda2222 = new LazyListMeasureKt$$ExternalSyntheticLambda2(mutableState, arrayList8, applyStickyItems, isLookingAhead, 0);
                                        int m1033constrainWidthK40F9xA3222 = ConstraintsKt.m1033constrainWidthK40F9xA(i115 + i45, j);
                                        int m1032constrainHeightK40F9xA3222 = ConstraintsKt.m1032constrainHeightK40F9xA(i114 + mo230roundToPx0680j_44, j);
                                        EmptyMap emptyMap2222 = EmptyMap.INSTANCE;
                                        emptyMap2222.getClass();
                                        if (!z9) {
                                        }
                                        subcomposeMeasureScope = subcomposeMeasureScope2;
                                        lazyListMeasureResult = new LazyListMeasureResult(lazyListMeasuredItem, i33, i44, f9, subcomposeMeasureScope2.layout(m1033constrainWidthK40F9xA3222, m1032constrainHeightK40F9xA3222, emptyMap2222, lazyListMeasureKt$$ExternalSyntheticLambda2222), f2, z14, coroutineScope2, lazyLayoutMeasureScopeImpl, lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1.childConstraints, LazyLayoutKt.updatedVisibleItems(valueOf == null ? valueOf.intValue() : i37, valueOf2 == null ? valueOf2.intValue() : i37, arrayList8, applyStickyItems), i55, i25, i40, !z9 ? Orientation.Vertical : Orientation.Horizontal, i48, mo230roundToPx0680j_45);
                                    }
                                }
                                LazyListState lazyListState5 = lazyListState3;
                                lazyListState5.applyMeasureResult$foundation(lazyListMeasureResult, subcomposeMeasureScope.isLookingAhead(), false);
                                DefaultLazyListPrefetchStrategy defaultLazyListPrefetchStrategy = lazyListState5.prefetchStrategy;
                                return lazyListMeasureResult;
                            } catch (Throwable th) {
                                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                throw th;
                            }
                        }
                    };
                    kProperty0 = kProperty02;
                    arrangement$Vertical4 = arrangement$Vertical5;
                    arrangement$Horizontal4 = arrangement$Horizontal3;
                    gapComposer.updateRememberedValue(rememberedValue4);
                } else {
                    kProperty0 = kProperty02;
                    arrangement$Vertical4 = arrangement$Vertical3;
                    gapComposer = gapComposer2;
                    arrangement$Horizontal4 = arrangement$Horizontal3;
                    lazyLayoutSemanticState = lazyLayoutSemanticState2;
                    i10 = 4;
                }
                LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy = (LazyLayoutMeasurePolicy) rememberedValue4;
                Orientation orientation = z ? Orientation.Vertical : Orientation.Horizontal;
                if (z2) {
                    gapComposer.startReplaceGroup(-2077147368);
                    boolean changed2 = ((((i16 & 14) ^ 6) > i10 && gapComposer.changed(lazyListState)) || (i16 & 6) == i10) | gapComposer.changed(0);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new LazyListBeyondBoundsState(lazyListState);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    modifier2 = LazyLayoutKt.lazyLayoutBeyondBoundsModifier((LazyListBeyondBoundsState) rememberedValue5, lazyListState.beyondBoundsInfo, orientation);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-2076718545);
                    gapComposer.end(false);
                    modifier2 = Modifier.Companion.$$INSTANCE;
                }
                lazyListState2 = lazyListState;
                LazyLayoutKt.LazyLayout(kProperty0, ImageKt.scrollableArea(LazyLayoutKt.lazyLayoutSemantics(modifier.then(lazyListState.remeasurementModifier).then(lazyListState.awaitLayoutModifier), kProperty0, lazyLayoutSemanticState, orientation, z2).then(modifier2).then(lazyListState.itemAnimator.modifier), lazyListState, orientation, androidEdgeEffectOverscrollEffect, z2, flingBehavior, lazyListState.internalInteractionSource, null), lazyListState2.prefetchState, lazyLayoutMeasurePolicy, gapComposer, 0);
                arrangement$Vertical2 = arrangement$Vertical4;
                vertical2 = vertical3;
                arrangement$Horizontal2 = arrangement$Horizontal4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                final LazyListState lazyListState3 = lazyListState2;
                final Alignment.Horizontal horizontal4 = horizontal3;
                endRestartGroup.block = new Function2() { // from class: androidx.compose.foundation.lazy.LazyListKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                        int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                        LazyListKt.LazyList(Modifier.this, lazyListState3, paddingValues, z, flingBehavior, z2, androidEdgeEffectOverscrollEffect, horizontal4, arrangement$Vertical2, vertical2, arrangement$Horizontal2, function1, (Composer) obj, updateChangedFlags, updateChangedFlags2, i3);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        if ((i2 & 3072) == 0) {
        }
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378 || (i14 & 1171) != 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x03e6, code lost:
    
        if (r6 == r4) goto L115;
     */
    /* renamed from: UserMessageUi-AGcomas, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m306UserMessageUiAGcomas(final Modifier modifier, String str, final boolean z, Function0 function0, float f, float f2, Composer composer, final int i) {
        Function0 function02;
        final float f3;
        final float f4;
        float f5;
        int i2;
        float f6;
        float f7;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        Modifier then;
        Object bankingConfigQueries$$ExternalSyntheticLambda0;
        CoroutineScope coroutineScope;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        MutableState mutableState;
        float f8;
        Object obj;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12;
        int i3;
        AndroidClipboard androidClipboard;
        boolean z2;
        Object obj2;
        String str2 = str;
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-646570650);
        Applier applier = gapComposer.applier;
        int i4 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | 90112;
        if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) != 74898)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                f5 = 16.0f;
                i2 = i4 & (-458753);
                f6 = 272.0f;
            } else {
                gapComposer.skipToGroupEnd();
                f5 = f2;
                i2 = i4 & (-458753);
                f6 = f;
            }
            gapComposer.endDefaults();
            AndroidClipboard androidClipboard2 = (AndroidClipboard) gapComposer.consume(CompositionLocalsKt.LocalClipboard);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj3 = Composer.Companion.Empty;
            if (rememberedValue == obj3) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue;
            Object obj4 = (RealCashVibrator) gapComposer.consume(LocalCashVibratorKt.LocalCashVibrator);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj3) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj3) {
                rememberedValue3 = Updater.mutableStateOf$default(0);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState3 = (MutableState) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj3) {
                rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState4 = (MutableState) rememberedValue4;
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            TextMeasurer rememberTextMeasurer = TextPainterKt.rememberTextMeasurer(gapComposer);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(22), null, null, 0, 16646143);
            int mo230roundToPx0680j_4 = density.mo230roundToPx0680j_4(f6);
            int mo230roundToPx0680j_42 = density.mo230roundToPx0680j_4(f5) * 2;
            int i5 = mo230roundToPx0680j_4 - mo230roundToPx0680j_42;
            float f9 = f6;
            TextLayoutResult m980measurexDpz5zY$default = TextMeasurer.m980measurexDpz5zY$default(rememberTextMeasurer, new AnnotatedString(str2), m994copyp1EtxEg$default, false, 0, ConstraintsKt.Constraints$default(0, i5 < 0 ? 0 : i5, 0, 0, 13), null, null, null, 1980);
            IntProgressionIterator it = RangesKt___RangesKt.until(0, m980measurexDpz5zY$default.multiParagraph.lineCount).iterator();
            if (!it.hasNext) {
                a$$ExternalSyntheticBUOutline0.m();
                return;
            }
            float lineRight = m980measurexDpz5zY$default.getLineRight(it.nextInt());
            float f10 = f5;
            while (it.hasNext) {
                lineRight = Math.max(lineRight, m980measurexDpz5zY$default.getLineRight(it.nextInt()));
            }
            int ceil = ((int) Math.ceil(lineRight)) + mo230roundToPx0680j_42;
            if (ceil <= mo230roundToPx0680j_4) {
                mo230roundToPx0680j_4 = ceil;
            }
            float mo233toDpu2uoSUM = density.mo233toDpu2uoSUM(mo230roundToPx0680j_4);
            String stringResource = Room.stringResource(gapComposer, R.string.user_message_context_menu_copy_label);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterEnd, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            Function0 function03 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function03);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(companion, mo233toDpu2uoSUM);
            if (((Boolean) mutableState4.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(-1545649586);
                gapComposer.end(false);
                f7 = 20.0f;
            } else {
                gapComposer.startReplaceGroup(-1545648303);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj5 = DefaultSizes.border.entries;
                gapComposer.end(false);
                f7 = 24.0f;
            }
            Modifier clip = ClipKt.clip(m290width3ABfNKs, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f7));
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == obj3) {
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda9(17, mutableState3);
                gapComposer.updateRememberedValue(rememberedValue5);
            } else {
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
            }
            Modifier onSizeChanged = RulerKt.onSizeChanged(clip, (Function1) rememberedValue5);
            String stringResource2 = Room.stringResource(gapComposer, R.string.user_message_focus_options_accessibility_label);
            boolean changedInstance = gapComposer.changedInstance(obj4);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue6 == obj3) {
                rememberedValue6 = new UtilsKt$$ExternalSyntheticLambda0(14, obj4, mutableState2);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Function0 function04 = (Function0) rememberedValue6;
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (rememberedValue7 == obj3) {
                rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda6(21);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            then = onSizeChanged.then(new CombinedClickableElement(null, null, null, "", stringResource2, (Function0) rememberedValue7, function04, true, true));
            int i6 = i2 & 112;
            boolean changed = gapComposer.changed(stringResource) | gapComposer.changedInstance(coroutineScope2) | gapComposer.changedInstance(androidClipboard2) | (i6 == 32);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (changed || rememberedValue8 == obj3) {
                coroutineScope = coroutineScope2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                mutableState = mutableState2;
                f8 = f10;
                obj = obj3;
                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                i3 = i6;
                androidClipboard = androidClipboard2;
                bankingConfigQueries$$ExternalSyntheticLambda0 = new BankingConfigQueries$$ExternalSyntheticLambda0(stringResource, (Object) coroutineScope, (Object) androidClipboard, str, 24);
                gapComposer.updateRememberedValue(bankingConfigQueries$$ExternalSyntheticLambda0);
            } else {
                bankingConfigQueries$$ExternalSyntheticLambda0 = rememberedValue8;
                androidClipboard = androidClipboard2;
                i3 = i6;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                mutableState = mutableState2;
                f8 = f10;
                obj = obj3;
                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                coroutineScope = coroutineScope2;
            }
            Modifier semantics = SemanticsModifierKt.semantics(then, false, (Function1) bankingConfigQueries$$ExternalSyntheticLambda0);
            ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(providableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(semantics, colors.semantic.background.subtle, ColorKt.RectangleShape), f8, 10.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
            gapComposer.startReusableNode();
            CoroutineScope coroutineScope3 = coroutineScope;
            if (gapComposer.inserting) {
                gapComposer.createNode(function03);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$1);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$15);
            Colors colors2 = (Colors) gapComposer.consume(providableCompositionLocal);
            if (colors2 == null) {
                z2 = false;
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                z2 = false;
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors2.semantic.text.standard;
            Modifier m292widthInVpY3zN4$default = SizeKt.m292widthInVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 272.0f, 1);
            Object rememberedValue9 = gapComposer.rememberedValue();
            Object obj6 = obj;
            if (rememberedValue9 == obj6) {
                rememberedValue9 = new MoneyTabUIKt$$ExternalSyntheticLambda9(18, mutableState4);
                gapComposer.updateRememberedValue(rememberedValue9);
            }
            AndroidClipboard androidClipboard3 = androidClipboard;
            int i7 = i3;
            float f11 = f8;
            str2 = str;
            Room.m1165Text25TpFw(0, 0, 0, 0, ((i2 >> 3) & 14) | 24624, 0, 4064, j, (Composer) gapComposer, m292widthInVpY3zN4$default, m994copyp1EtxEg$default, (TextLineBalancing) null, str2, (Map) null, (Function1) rememberedValue9, false);
            gapComposer.end(true);
            gapComposer.startReplaceGroup(-1545605045);
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            Icons icons = Icons.Copy24;
            boolean changedInstance2 = gapComposer.changedInstance(coroutineScope3) | gapComposer.changedInstance(androidClipboard3) | (i7 == 32);
            Object rememberedValue10 = gapComposer.rememberedValue();
            if (changedInstance2) {
                obj2 = obj6;
            } else {
                obj2 = obj6;
            }
            rememberedValue10 = new UserMessageUiKt$$ExternalSyntheticLambda5(coroutineScope3, androidClipboard3, str2, 0);
            gapComposer.updateRememberedValue(rememberedValue10);
            createListBuilder.add(new DropdownItem(R.string.user_message_context_menu_copy_label, icons, (Function0) rememberedValue10, 4));
            if (!z || function0 == null) {
                function02 = function0;
            } else {
                function02 = function0;
                createListBuilder.add(new DropdownItem(R.string.user_message_context_menu_pin_label, Icons.NavigationMoneybotAlt, function02, 4));
            }
            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            gapComposer.end(false);
            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            Dp dp = new Dp(((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM(((Number) mutableState3.getValue()).intValue()));
            Object rememberedValue11 = gapComposer.rememberedValue();
            if (rememberedValue11 == obj2) {
                rememberedValue11 = new CashMapViewKt$$ExternalSyntheticLambda2(29, mutableState);
                gapComposer.updateRememberedValue(rememberedValue11);
            }
            ExpandableContentKt.m3634ExpandableContent0aeBpQE(build, booleanValue, 175.0f, dp, (Function0) rememberedValue11, gapComposer, 24960, 0);
            gapComposer.end(true);
            f4 = f11;
            f3 = f9;
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
            f3 = f;
            f4 = f2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final Function0 function05 = function02;
            final String str3 = str2;
            endRestartGroup.block = new Function2(str3, z, function05, f3, f4, i) { // from class: com.squareup.cash.moneybot.views.message.UserMessageUiKt$$ExternalSyntheticLambda7
                public final /* synthetic */ String f$1;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ Function0 f$3;
                public final /* synthetic */ float f$4;
                public final /* synthetic */ float f$5;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    LazyListKt.m306UserMessageUiAGcomas(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj7, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final boolean isSortedAndMerged(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        Integer num = null;
        while (it.hasNext()) {
            IntRange intRange = (IntRange) it.next();
            if (intRange.isEmpty()) {
                return false;
            }
            if (num != null && (num.intValue() >= 2147483646 || intRange.first < num.intValue() + 2)) {
                return false;
            }
            num = Integer.valueOf(intRange.last);
        }
        return true;
    }
}
