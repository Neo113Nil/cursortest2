package androidx.compose.foundation.lazy.grid;

import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.IntListKt;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.Arrangement$Vertical;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.DefaultLazyListPrefetchStrategy;
import androidx.compose.foundation.lazy.LazyListMeasureKt$$ExternalSyntheticLambda2;
import androidx.compose.foundation.lazy.LazyListScrollPosition;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.CachedItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScopeImpl;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import bo.app.c7$$ExternalSyntheticLambda6;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.google.android.gms.dynamite.zzg;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import java.util.ArrayList;
import java.util.Collection;
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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LazyGridKt {
    /* JADX WARN: Code restructure failed: missing block: B:143:0x026b, code lost:
    
        if (r14.changed(false) != false) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0326  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyGrid(Modifier modifier, final LazyGridState lazyGridState, final GridSlotCache gridSlotCache, final PaddingValues paddingValues, FlingBehavior flingBehavior, boolean z, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, final Arrangement$Vertical arrangement$Vertical, final Arrangement$Horizontal arrangement$Horizontal, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        int i4;
        LazyGridState lazyGridState2;
        GapComposer gapComposer;
        boolean z2;
        boolean changed;
        Object obj;
        final LazyGridState lazyGridState3;
        LazySemanticsKt$rememberLazyGridSemanticState$1$1 lazySemanticsKt$rememberLazyGridSemanticState$1$1;
        boolean z3;
        boolean z4;
        KProperty0 kProperty0;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(708740370);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(lazyGridState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= (i & 512) == 0 ? gapComposer2.changed(gridSlotCache) : gapComposer2.changedInstance(gridSlotCache) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer2.changed(false) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i & 196608) == 0) {
            i3 |= gapComposer2.changed(true) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= gapComposer2.changed(flingBehavior) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i3 |= gapComposer2.changed(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= gapComposer2.changed(androidEdgeEffectOverscrollEffect) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= gapComposer2.changed(arrangement$Vertical) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changed(arrangement$Horizontal) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            int i5 = i3 >> 3;
            int i6 = i5 & 14;
            int i7 = i6 | (i4 & 112);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(function1, gapComposer2);
            int i8 = i3;
            boolean z5 = (((i7 & 14) ^ 6) > 4 && gapComposer2.changed(lazyGridState)) || (i7 & 6) == 4;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z5 || rememberedValue == neverEqualPolicy) {
                NeverEqualPolicy neverEqualPolicy2 = NeverEqualPolicy.INSTANCE$1;
                rememberedValue = new LockFreeLinkedListNode$toString$1(0, 2, State.class, Updater.derivedStateOf(neverEqualPolicy2, new DialogHostKt$$ExternalSyntheticLambda0(10, Updater.derivedStateOf(neverEqualPolicy2, new TooltipKt$$ExternalSyntheticLambda1(4, rememberUpdatedState)), lazyGridState)), "value", "getValue()Ljava/lang/Object;");
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            final KProperty0 kProperty02 = (KProperty0) rememberedValue;
            int i9 = i6 | ((i8 >> 9) & 112);
            boolean z6 = ((((i9 & 14) ^ 6) > 4 && gapComposer2.changed(lazyGridState)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && gapComposer2.changed(false)) || (i9 & 48) == 32);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z6 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$rememberLazyGridSemanticState$1$1
                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final CollectionInfo collectionInfo() {
                        return new CollectionInfo(-1, -1);
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final int getContentPadding() {
                        LazyGridState lazyGridState4 = LazyGridState.this;
                        return (-lazyGridState4.getLayoutInfo().viewportStartOffset) + lazyGridState4.getLayoutInfo().afterContentPadding;
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final float getMaxScrollOffset() {
                        LazyGridState lazyGridState4 = LazyGridState.this;
                        int intValue = lazyGridState4.scrollPosition.index$delegate.getIntValue();
                        int intValue2 = lazyGridState4.scrollPosition.scrollOffset$delegate.getIntValue();
                        return lazyGridState4.getCanScrollForward() ? (intValue * 500) + intValue2 + 100.0f : (intValue * 500) + intValue2;
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final float getScrollOffset() {
                        LazyGridState lazyGridState4 = LazyGridState.this;
                        return (lazyGridState4.scrollPosition.index$delegate.getIntValue() * 500) + lazyGridState4.scrollPosition.scrollOffset$delegate.getIntValue();
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final int getViewport() {
                        LazyGridState lazyGridState4 = LazyGridState.this;
                        return (int) (lazyGridState4.getLayoutInfo().orientation == Orientation.Vertical ? lazyGridState4.getLayoutInfo().m317getViewportSizeYbymL2g() & BodyPartID.bodyIdMax : lazyGridState4.getLayoutInfo().m317getViewportSizeYbymL2g() >> 32);
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final Object scrollToItem(int i10, RingtoneView$playRingtone$1 ringtoneView$playRingtone$1) {
                        Object scrollToItem$default = LazyGridState.scrollToItem$default(LazyGridState.this, i10, ringtoneView$playRingtone$1);
                        return scrollToItem$default == CoroutineSingletons.COROUTINE_SUSPENDED ? scrollToItem$default : Unit.INSTANCE;
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            LazySemanticsKt$rememberLazyGridSemanticState$1$1 lazySemanticsKt$rememberLazyGridSemanticState$1$12 = (LazySemanticsKt$rememberLazyGridSemanticState$1$1) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
            final GraphicsContext graphicsContext = (GraphicsContext) gapComposer2.consume(CompositionLocalsKt.LocalGraphicsContext);
            final CachedItem.NoKey noKey = !((Boolean) gapComposer2.consume(CompositionLocalsKt.LocalProvidableScrollCaptureInProgress)).booleanValue() ? StickyItemsPlacement$Companion.StickToTopPlacement : null;
            int i10 = (i8 & 524272) | ((i4 << 18) & 3670016) | ((i8 >> 6) & 29360128);
            boolean z7 = ((((i10 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer2.changed(gridSlotCache)) || (i10 & MLKEMEngine.KyberPolyBytes) == 256) | ((((i10 & 112) ^ 48) > 32 && gapComposer2.changed(lazyGridState)) || (i10 & 48) == 32) | ((((i10 & 7168) ^ 3072) > 2048 && gapComposer2.changed(paddingValues)) || (i10 & 3072) == 2048);
            if (((57344 & i10) ^ 24576) <= 16384) {
            }
            if ((i10 & 24576) != 16384) {
                z2 = false;
                changed = ((((i10 & 29360128) ^ 12582912) <= 8388608 && gapComposer2.changed(arrangement$Vertical)) || (i10 & 12582912) == 8388608) | z7 | z2 | ((((458752 & i10) ^ 196608) <= 131072 && gapComposer2.changed(true)) || (i10 & 196608) == 131072) | ((((i10 & 3670016) ^ 1572864) <= 1048576 && gapComposer2.changed(arrangement$Horizontal)) || (i10 & 1572864) == 1048576) | gapComposer2.changed(graphicsContext);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (!changed || rememberedValue4 == neverEqualPolicy) {
                    lazyGridState3 = lazyGridState;
                    lazySemanticsKt$rememberLazyGridSemanticState$1$1 = lazySemanticsKt$rememberLazyGridSemanticState$1$12;
                    z3 = false;
                    z4 = true;
                    obj = new LazyLayoutMeasurePolicy(paddingValues, kProperty02, gridSlotCache, arrangement$Vertical, arrangement$Horizontal, coroutineScope, graphicsContext, noKey) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                        public final /* synthetic */ PaddingValues $contentPadding;
                        public final /* synthetic */ CoroutineScope $coroutineScope;
                        public final /* synthetic */ GraphicsContext $graphicsContext;
                        public final /* synthetic */ Function0 $itemProviderLambda;
                        public final /* synthetic */ GridSlotCache $slots;
                        public final /* synthetic */ CachedItem.NoKey $stickyItemsScrollBehavior;
                        public final /* synthetic */ Arrangement$Vertical $verticalArrangement;

                        {
                            this.$coroutineScope = coroutineScope;
                            this.$graphicsContext = graphicsContext;
                            this.$stickyItemsScrollBehavior = noKey;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:129:0x0462  */
                        /* JADX WARN: Removed duplicated region for block: B:144:0x04b8  */
                        /* JADX WARN: Removed duplicated region for block: B:150:0x04cb  */
                        /* JADX WARN: Removed duplicated region for block: B:16:0x00fb  */
                        /* JADX WARN: Removed duplicated region for block: B:182:0x0580  */
                        /* JADX WARN: Removed duplicated region for block: B:185:0x0589  */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x011e  */
                        /* JADX WARN: Removed duplicated region for block: B:212:0x0612  */
                        /* JADX WARN: Removed duplicated region for block: B:215:0x0618 A[ADDED_TO_REGION] */
                        /* JADX WARN: Removed duplicated region for block: B:219:0x065a  */
                        /* JADX WARN: Removed duplicated region for block: B:222:0x0666  */
                        /* JADX WARN: Removed duplicated region for block: B:224:0x066c A[ADDED_TO_REGION] */
                        /* JADX WARN: Removed duplicated region for block: B:228:0x067d A[LOOP:12: B:227:0x067b->B:228:0x067d, LOOP_END] */
                        /* JADX WARN: Removed duplicated region for block: B:232:0x0691  */
                        /* JADX WARN: Removed duplicated region for block: B:256:0x07b8  */
                        /* JADX WARN: Removed duplicated region for block: B:268:0x0825 A[ADDED_TO_REGION] */
                        /* JADX WARN: Removed duplicated region for block: B:279:0x0710  */
                        /* JADX WARN: Removed duplicated region for block: B:300:0x0669  */
                        /* JADX WARN: Removed duplicated region for block: B:303:0x062b  */
                        /* JADX WARN: Removed duplicated region for block: B:365:0x088a  */
                        /* JADX WARN: Removed duplicated region for block: B:367:0x0119  */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x021e  */
                        /* JADX WARN: Removed duplicated region for block: B:40:0x0227  */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x023f  */
                        /* JADX WARN: Removed duplicated region for block: B:52:0x02c9  */
                        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
                        /* renamed from: measure-0kLqBqw */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final MeasureResult mo307measure0kLqBqw(LazyLayoutMeasureScopeImpl lazyLayoutMeasureScopeImpl, long j) {
                            int i11;
                            int i12;
                            int i13;
                            long j2;
                            LazyGridItemProviderImpl lazyGridItemProviderImpl;
                            LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider;
                            int i14;
                            Recorder.AnonymousClass4 anonymousClass4;
                            int length;
                            Arrangement$Vertical arrangement$Vertical2;
                            ObjectList$$ExternalSyntheticLambda0 objectList$$ExternalSyntheticLambda0;
                            Function1 function12;
                            int i15;
                            int lineIndexOfItem;
                            int intValue;
                            SubcomposeMeasureScope subcomposeMeasureScope;
                            LazyGridState lazyGridState4;
                            boolean z8;
                            int i16;
                            int i17;
                            int i18;
                            int i19;
                            int size;
                            List list;
                            int i20;
                            int i21;
                            float f;
                            List list2;
                            List list3;
                            int size2;
                            int i22;
                            int i23;
                            int size3;
                            LazyGridMeasuredLine lazyGridMeasuredLine;
                            int i24;
                            int i25;
                            boolean z9;
                            int size4;
                            int i26;
                            int i27;
                            int i28;
                            float f2;
                            int i29;
                            int i30;
                            LazyGridMeasureResult lazyGridMeasureResult;
                            List list4;
                            int i31;
                            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;
                            List list5;
                            LazyGridMeasuredItem lazyGridMeasuredItem;
                            int i32;
                            LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider2;
                            int i33;
                            LazyGridMeasuredItem lazyGridMeasuredItem2;
                            SubcomposeMeasureScope subcomposeMeasureScope2 = lazyLayoutMeasureScopeImpl.subcomposeMeasureScope;
                            LazyGridState lazyGridState5 = LazyGridState.this;
                            lazyGridState5.measurementScopeInvalidator.getValue();
                            boolean z10 = lazyGridState5.hasLookaheadOccurred || subcomposeMeasureScope2.isLookingAhead();
                            Orientation orientation = Orientation.Vertical;
                            ImageKt.m180checkScrollableContainerConstraintsK40F9xA(j, orientation);
                            LayoutDirection layoutDirection = subcomposeMeasureScope2.getLayoutDirection();
                            PaddingValues paddingValues2 = this.$contentPadding;
                            int mo230roundToPx0680j_4 = subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo265calculateLeftPaddingu2uoSUM(layoutDirection));
                            int mo230roundToPx0680j_42 = subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo266calculateRightPaddingu2uoSUM(subcomposeMeasureScope2.getLayoutDirection()));
                            int mo230roundToPx0680j_43 = subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo267calculateTopPaddingD9Ej5fM());
                            int mo230roundToPx0680j_44 = subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo264calculateBottomPaddingD9Ej5fM()) + mo230roundToPx0680j_43;
                            int i34 = mo230roundToPx0680j_42 + mo230roundToPx0680j_4;
                            int i35 = mo230roundToPx0680j_44 - mo230roundToPx0680j_43;
                            long m1034offsetNN6EwU = ConstraintsKt.m1034offsetNN6EwU(-i34, -mo230roundToPx0680j_44, j);
                            LazyGridItemProviderImpl lazyGridItemProviderImpl2 = (LazyGridItemProviderImpl) this.$itemProviderLambda.invoke();
                            LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider3 = lazyGridItemProviderImpl2.intervalContent.spanLayoutProvider;
                            GridSlotCache gridSlotCache2 = this.$slots;
                            if (gridSlotCache2.cachedSizes != null) {
                                i11 = mo230roundToPx0680j_44;
                                if (Constraints.m1019equalsimpl0(gridSlotCache2.cachedConstraints, m1034offsetNN6EwU) && gridSlotCache2.cachedDensity == subcomposeMeasureScope2.getDensity()) {
                                    anonymousClass4 = gridSlotCache2.cachedSizes;
                                    anonymousClass4.getClass();
                                    j2 = m1034offsetNN6EwU;
                                    i12 = i11;
                                    i13 = i34;
                                    i14 = mo230roundToPx0680j_43;
                                    lazyGridItemProviderImpl = lazyGridItemProviderImpl2;
                                    lazyGridSpanLayoutProvider = lazyGridSpanLayoutProvider3;
                                    Recorder.AnonymousClass4 anonymousClass42 = anonymousClass4;
                                    length = ((int[]) anonymousClass42.val$audioErrorConsumer).length;
                                    if (length == lazyGridSpanLayoutProvider.slotsPerLine) {
                                        lazyGridSpanLayoutProvider.slotsPerLine = length;
                                        ArrayList arrayList = lazyGridSpanLayoutProvider.buckets;
                                        arrayList.clear();
                                        arrayList.add(new LazyGridSpanLayoutProvider.Bucket(0, 0));
                                        lazyGridSpanLayoutProvider.lastLineIndex = 0;
                                        lazyGridSpanLayoutProvider.lastLineStartItemIndex = 0;
                                        lazyGridSpanLayoutProvider.lastLineStartKnownSpan = 0;
                                        lazyGridSpanLayoutProvider.cachedBucketIndex = -1;
                                        lazyGridSpanLayoutProvider.cachedBucket.clear();
                                    }
                                    arrangement$Vertical2 = this.$verticalArrangement;
                                    if (arrangement$Vertical2 != null) {
                                        throw Recorder$$ExternalSyntheticOutline2.m("null verticalArrangement when isVertical == true");
                                    }
                                    int mo230roundToPx0680j_45 = subcomposeMeasureScope2.mo230roundToPx0680j_4(arrangement$Vertical2.mo252getSpacingD9Ej5fM());
                                    int itemCount = lazyGridItemProviderImpl.getItemCount();
                                    int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j) - i12;
                                    LazyGridItemProviderImpl lazyGridItemProviderImpl3 = lazyGridItemProviderImpl;
                                    int i36 = i14;
                                    LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider4 = lazyGridSpanLayoutProvider;
                                    LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$12 = new LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1(lazyGridItemProviderImpl3, lazyLayoutMeasureScopeImpl, mo230roundToPx0680j_45, LazyGridState.this, i36, i35, (mo230roundToPx0680j_4 << 32) | (i14 & BodyPartID.bodyIdMax));
                                    LruArrayPool lruArrayPool = new LruArrayPool(anonymousClass42, itemCount, mo230roundToPx0680j_45, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$12, lazyGridSpanLayoutProvider4);
                                    int i37 = itemCount;
                                    LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider5 = (LazyGridSpanLayoutProvider) lruArrayPool.sortedSizes;
                                    ClickableKt$$ExternalSyntheticLambda0 clickableKt$$ExternalSyntheticLambda0 = new ClickableKt$$ExternalSyntheticLambda0(22, lazyGridSpanLayoutProvider4, lruArrayPool);
                                    ObjectList$$ExternalSyntheticLambda0 objectList$$ExternalSyntheticLambda02 = new ObjectList$$ExternalSyntheticLambda0(lazyGridSpanLayoutProvider4, 19);
                                    Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                                    List list6 = null;
                                    if (currentThreadSnapshot != null) {
                                        objectList$$ExternalSyntheticLambda0 = objectList$$ExternalSyntheticLambda02;
                                        function12 = currentThreadSnapshot.getReadObserver();
                                    } else {
                                        objectList$$ExternalSyntheticLambda0 = objectList$$ExternalSyntheticLambda02;
                                        function12 = null;
                                    }
                                    Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                                    LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider6 = lazyGridSpanLayoutProvider5;
                                    try {
                                        LazyListScrollPosition lazyListScrollPosition = lazyGridState5.scrollPosition;
                                        int intValue2 = lazyListScrollPosition.index$delegate.getIntValue();
                                        int findIndexByKey = LazyLayoutKt.findIndexByKey(intValue2, lazyGridItemProviderImpl3, lazyListScrollPosition.lastKnownFirstItemKey);
                                        if (intValue2 != findIndexByKey) {
                                            i15 = i36;
                                            lazyListScrollPosition.index$delegate.setIntValue(findIndexByKey);
                                            lazyListScrollPosition.nearestRangeState.update(intValue2);
                                        } else {
                                            i15 = i36;
                                        }
                                        if (findIndexByKey >= i37 && i37 > 0) {
                                            lineIndexOfItem = lazyGridSpanLayoutProvider4.getLineIndexOfItem(i37 - 1);
                                            intValue = 0;
                                            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, function12);
                                            List calculateLazyLayoutPinnedIndices = LazyLayoutKt.calculateLazyLayoutPinnedIndices(lazyGridItemProviderImpl3, lazyGridState5.pinnedItems, lazyGridState5.beyondBoundsInfo);
                                            float floatValue = (subcomposeMeasureScope2.isLookingAhead() && z10) ? ((Number) ((AnimationState) lazyGridState5._lazyLayoutScrollDeltaBetweenPasses.this$0).value$delegate.getValue()).floatValue() : lazyGridState5.scrollToBeConsumed;
                                            LazyLayoutItemAnimator lazyLayoutItemAnimator = lazyGridState5.itemAnimator;
                                            boolean isLookingAhead = subcomposeMeasureScope2.isLookingAhead();
                                            LazyGridMeasureResult lazyGridMeasureResult2 = lazyGridState5.approachLayoutInfo;
                                            MutableState mutableState = lazyGridState5.placementScopeInvalidator;
                                            if (i15 < 0) {
                                                InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
                                            }
                                            if (i35 < 0) {
                                                InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
                                            }
                                            LazyGridItemProviderImpl lazyGridItemProviderImpl4 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$12.itemProvider;
                                            CoroutineScope coroutineScope2 = this.$coroutineScope;
                                            int i38 = lineIndexOfItem;
                                            GraphicsContext graphicsContext2 = this.$graphicsContext;
                                            float f3 = floatValue;
                                            if (i37 > 0) {
                                                int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j2);
                                                int m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j2);
                                                lazyLayoutItemAnimator.onMeasured(0, m1027getMinWidthimpl, m1026getMinHeightimpl, new ArrayList(), lazyGridItemProviderImpl4.keyIndexMap, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$12, true, isLookingAhead, length, z10, 0, 0, coroutineScope2, graphicsContext2);
                                                if (!isLookingAhead) {
                                                    long m321getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m321getMinSizeToFitDisappearingItemsYbymL2g();
                                                    if (!IntSize.m1055equalsimpl0(m321getMinSizeToFitDisappearingItemsYbymL2g, 0L)) {
                                                        long j3 = j2;
                                                        m1027getMinWidthimpl = ConstraintsKt.m1033constrainWidthK40F9xA((int) (m321getMinSizeToFitDisappearingItemsYbymL2g >> 32), j3);
                                                        m1026getMinHeightimpl = ConstraintsKt.m1032constrainHeightK40F9xA((int) (m321getMinSizeToFitDisappearingItemsYbymL2g & BodyPartID.bodyIdMax), j3);
                                                    }
                                                }
                                                BasicTextKt$$ExternalSyntheticLambda14 basicTextKt$$ExternalSyntheticLambda14 = new BasicTextKt$$ExternalSyntheticLambda14(6);
                                                int m1033constrainWidthK40F9xA = ConstraintsKt.m1033constrainWidthK40F9xA(m1027getMinWidthimpl + i13, j);
                                                int m1032constrainHeightK40F9xA = ConstraintsKt.m1032constrainHeightK40F9xA(m1026getMinHeightimpl + i12, j);
                                                EmptyMap emptyMap = EmptyMap.INSTANCE;
                                                emptyMap.getClass();
                                                lazyGridState4 = lazyGridState5;
                                                subcomposeMeasureScope = subcomposeMeasureScope2;
                                                lazyGridMeasureResult = new LazyGridMeasureResult(null, 0, false, RecyclerView.DECELERATION_RATE, subcomposeMeasureScope2.layout(m1033constrainWidthK40F9xA, m1032constrainHeightK40F9xA, emptyMap, basicTextKt$$ExternalSyntheticLambda14), RecyclerView.DECELERATION_RATE, false, coroutineScope2, lazyLayoutMeasureScopeImpl, length, clickableKt$$ExternalSyntheticLambda0, objectList$$ExternalSyntheticLambda0, EmptyList.INSTANCE, -i15, m1024getMaxHeightimpl + i35, 0, orientation, i35, mo230roundToPx0680j_45);
                                            } else {
                                                subcomposeMeasureScope = subcomposeMeasureScope2;
                                                lazyGridState4 = lazyGridState5;
                                                LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$12;
                                                long j4 = j2;
                                                ObjectList$$ExternalSyntheticLambda0 objectList$$ExternalSyntheticLambda03 = objectList$$ExternalSyntheticLambda0;
                                                int i39 = i15;
                                                int round = Math.round(f3);
                                                int i40 = intValue - round;
                                                if (i38 == 0 && i40 < 0) {
                                                    round += i40;
                                                    i40 = 0;
                                                }
                                                ArrayDeque arrayDeque = new ArrayDeque();
                                                int i41 = -i39;
                                                int i42 = i41 + (mo230roundToPx0680j_45 < 0 ? mo230roundToPx0680j_45 : 0);
                                                int i43 = i40 + i42;
                                                while (i43 < 0 && i38 > 0) {
                                                    int i44 = i41;
                                                    int i45 = i38 - 1;
                                                    LazyGridMeasuredLine andMeasure = lruArrayPool.getAndMeasure(i45);
                                                    i38 = i45;
                                                    arrayDeque.add(0, andMeasure);
                                                    i43 += andMeasure.mainAxisSizeWithSpacings;
                                                    i41 = i44;
                                                }
                                                int i46 = i41;
                                                if (i43 < i42) {
                                                    round -= i42 - i43;
                                                    i43 = i42;
                                                }
                                                int i47 = round;
                                                int i48 = i43 - i42;
                                                int i49 = m1024getMaxHeightimpl + i35;
                                                int i50 = i49 >= 0 ? i49 : 0;
                                                int i51 = -i48;
                                                int i52 = i48;
                                                int i53 = i38;
                                                int i54 = 0;
                                                boolean z11 = false;
                                                while (i54 < arrayDeque.size) {
                                                    if (i51 >= i50) {
                                                        arrayDeque.removeAt(i54);
                                                        z11 = true;
                                                    } else {
                                                        i53++;
                                                        i51 += ((LazyGridMeasuredLine) arrayDeque.get(i54)).mainAxisSizeWithSpacings;
                                                        i54++;
                                                    }
                                                }
                                                boolean z12 = z11;
                                                int i55 = i53;
                                                while (i55 < i37 && (i51 < i50 || i51 <= 0 || arrayDeque.isEmpty())) {
                                                    int i56 = i50;
                                                    LazyGridMeasuredLine andMeasure2 = lruArrayPool.getAndMeasure(i55);
                                                    z8 = z12;
                                                    int i57 = andMeasure2.mainAxisSizeWithSpacings;
                                                    LazyGridMeasuredItem[] lazyGridMeasuredItemArr = andMeasure2.items;
                                                    int i58 = i55;
                                                    if (lazyGridMeasuredItemArr.length == 0) {
                                                        break;
                                                    }
                                                    i51 += i57;
                                                    if (i51 > i42 || ((LazyGridMeasuredItem) ArraysKt___ArraysKt.last(lazyGridMeasuredItemArr)).index == i37 - 1) {
                                                        arrayDeque.addLast(andMeasure2);
                                                        z12 = z8;
                                                    } else {
                                                        i52 -= i57;
                                                        i38 = i58 + 1;
                                                        z12 = true;
                                                    }
                                                    i55 = i58 + 1;
                                                    i50 = i56;
                                                }
                                                z8 = z12;
                                                if (i51 < m1024getMaxHeightimpl) {
                                                    int i59 = m1024getMaxHeightimpl - i51;
                                                    int i60 = i51 + i59;
                                                    i17 = i52 - i59;
                                                    while (i17 < i39 && i38 > 0) {
                                                        int i61 = i38 - 1;
                                                        int i62 = i60;
                                                        LazyGridMeasuredLine andMeasure3 = lruArrayPool.getAndMeasure(i61);
                                                        arrayDeque.add(0, andMeasure3);
                                                        i17 += andMeasure3.mainAxisSizeWithSpacings;
                                                        i60 = i62;
                                                        i59 = i59;
                                                        i38 = i61;
                                                    }
                                                    int i63 = i60;
                                                    i16 = i47 + i59;
                                                    if (i17 < 0) {
                                                        i16 += i17;
                                                        i51 = i63 + i17;
                                                        i17 = 0;
                                                    } else {
                                                        i51 = i63;
                                                    }
                                                } else {
                                                    i16 = i47;
                                                    i17 = i52;
                                                }
                                                float f4 = (Integer.signum(Math.round(f3)) != Integer.signum(i16) || Math.abs(Math.round(f3)) < Math.abs(i16)) ? f3 : i16;
                                                float f5 = f3 - f4;
                                                float f6 = RecyclerView.DECELERATION_RATE;
                                                if (isLookingAhead && i16 > i47 && f5 <= RecyclerView.DECELERATION_RATE) {
                                                    f6 = (i16 - i47) + f5;
                                                }
                                                float f7 = f6;
                                                if (i17 < 0) {
                                                    InlineClassHelperKt.throwIllegalArgumentException("negative initial offset");
                                                }
                                                int i64 = -i17;
                                                LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque.firstOrNull();
                                                int i65 = (lazyGridMeasuredLine2 == null || (lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt___ArraysKt.firstOrNull(lazyGridMeasuredLine2.items)) == null) ? 0 : lazyGridMeasuredItem2.index;
                                                int i66 = i17;
                                                LazyGridMeasuredLine lazyGridMeasuredLine3 = (LazyGridMeasuredLine) arrayDeque.lastOrNull();
                                                if (lazyGridMeasuredLine3 != null) {
                                                    LazyGridMeasuredItem[] lazyGridMeasuredItemArr2 = lazyGridMeasuredLine3.items;
                                                    i18 = i64;
                                                    LazyGridMeasuredItem lazyGridMeasuredItem3 = lazyGridMeasuredItemArr2.length == 0 ? null : lazyGridMeasuredItemArr2[lazyGridMeasuredItemArr2.length - 1];
                                                    if (lazyGridMeasuredItem3 != null) {
                                                        i19 = lazyGridMeasuredItem3.index;
                                                        List list7 = calculateLazyLayoutPinnedIndices;
                                                        size = list7.size();
                                                        list = null;
                                                        i20 = 0;
                                                        while (i20 < size) {
                                                            int i67 = size;
                                                            int intValue3 = ((Number) calculateLazyLayoutPinnedIndices.get(i20)).intValue();
                                                            if (intValue3 < 0 || intValue3 >= i65) {
                                                                i32 = i65;
                                                                lazyGridSpanLayoutProvider2 = lazyGridSpanLayoutProvider6;
                                                                i33 = i20;
                                                            } else {
                                                                i32 = i65;
                                                                lazyGridSpanLayoutProvider2 = lazyGridSpanLayoutProvider6;
                                                                i33 = i20;
                                                                int i68 = lazyGridSpanLayoutProvider2.slotsPerLine;
                                                                int spanOf = lazyGridSpanLayoutProvider2.spanOf(intValue3);
                                                                LazyGridMeasuredItem m316getAndMeasurem8Kt_7k = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13.m316getAndMeasurem8Kt_7k(intValue3, 0, spanOf, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13.defaultMainAxisSpacing, lruArrayPool.m1910childConstraintsJhjzzOo$foundation(0, spanOf));
                                                                List arrayList2 = list == null ? new ArrayList() : list;
                                                                arrayList2.add(m316getAndMeasurem8Kt_7k);
                                                                list = arrayList2;
                                                            }
                                                            i20 = i33 + 1;
                                                            lazyGridSpanLayoutProvider6 = lazyGridSpanLayoutProvider2;
                                                            size = i67;
                                                            i65 = i32;
                                                        }
                                                        int i69 = i65;
                                                        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider7 = lazyGridSpanLayoutProvider6;
                                                        if (list == null) {
                                                            list = EmptyList.INSTANCE;
                                                        }
                                                        List list8 = list;
                                                        if (isLookingAhead && lazyGridMeasureResult2 != null) {
                                                            list5 = lazyGridMeasureResult2.visibleItemsInfo;
                                                            if (!list5.isEmpty()) {
                                                                f = f4;
                                                                for (int size5 = list5.size() - 1; -1 < size5; size5--) {
                                                                    if (((LazyGridMeasuredItem) list5.get(size5)).index > i19 && (size5 == 0 || ((LazyGridMeasuredItem) list5.get(size5 - 1)).index <= i19)) {
                                                                        lazyGridMeasuredItem = (LazyGridMeasuredItem) list5.get(size5);
                                                                        break;
                                                                    }
                                                                }
                                                                lazyGridMeasuredItem = null;
                                                                LazyGridMeasuredItem lazyGridMeasuredItem4 = (LazyGridMeasuredItem) CollectionsKt.last(list5);
                                                                LazyGridMeasuredLine lazyGridMeasuredLine4 = (LazyGridMeasuredLine) CollectionsKt.lastOrNull((List) arrayDeque);
                                                                int i70 = lazyGridMeasuredLine4 != null ? lazyGridMeasuredLine4.index + 1 : 0;
                                                                if (lazyGridMeasuredItem != null) {
                                                                    int i71 = lazyGridMeasuredItem.index;
                                                                    i21 = i19;
                                                                    int min = Math.min(lazyGridMeasuredItem4.index, i37 - 1);
                                                                    if (i71 <= min) {
                                                                        list3 = null;
                                                                        while (true) {
                                                                            list2 = list8;
                                                                            if (list3 != null) {
                                                                                int size6 = list3.size();
                                                                                int i72 = 0;
                                                                                while (i72 < size6) {
                                                                                    int i73 = size6;
                                                                                    LazyGridMeasuredItem[] lazyGridMeasuredItemArr3 = ((LazyGridMeasuredLine) list3.get(i72)).items;
                                                                                    List list9 = list3;
                                                                                    int length2 = lazyGridMeasuredItemArr3.length;
                                                                                    int i74 = 0;
                                                                                    while (i74 < length2) {
                                                                                        int i75 = i74;
                                                                                        if (lazyGridMeasuredItemArr3[i75].index == i71) {
                                                                                            list3 = list9;
                                                                                            break;
                                                                                        }
                                                                                        i74 = i75 + 1;
                                                                                    }
                                                                                    i72++;
                                                                                    list3 = list9;
                                                                                    size6 = i73;
                                                                                }
                                                                            }
                                                                            List list10 = list3;
                                                                            list3 = list10 == null ? new ArrayList() : list10;
                                                                            LazyGridMeasuredLine andMeasure4 = lruArrayPool.getAndMeasure(i70);
                                                                            i70++;
                                                                            list3.add(andMeasure4);
                                                                            if (i71 == min) {
                                                                                break;
                                                                            }
                                                                            i71++;
                                                                            list8 = list2;
                                                                        }
                                                                        if (list3 == null) {
                                                                            list3 = EmptyList.INSTANCE;
                                                                        }
                                                                        size2 = list7.size();
                                                                        i22 = 0;
                                                                        while (i22 < size2) {
                                                                            int intValue4 = ((Number) calculateLazyLayoutPinnedIndices.get(i22)).intValue();
                                                                            if (i21 + 1 > intValue4 || intValue4 >= i37) {
                                                                                list4 = calculateLazyLayoutPinnedIndices;
                                                                                i31 = i37;
                                                                            } else {
                                                                                if (isLookingAhead) {
                                                                                    int size7 = list3.size();
                                                                                    int i76 = 0;
                                                                                    while (i76 < size7) {
                                                                                        list4 = calculateLazyLayoutPinnedIndices;
                                                                                        LazyGridMeasuredItem[] lazyGridMeasuredItemArr4 = ((LazyGridMeasuredLine) list3.get(i76)).items;
                                                                                        i31 = i37;
                                                                                        int length3 = lazyGridMeasuredItemArr4.length;
                                                                                        int i77 = 0;
                                                                                        while (i77 < length3) {
                                                                                            int i78 = i77;
                                                                                            if (lazyGridMeasuredItemArr4[i78].index != intValue4) {
                                                                                                i77 = i78 + 1;
                                                                                            }
                                                                                        }
                                                                                        i76++;
                                                                                        calculateLazyLayoutPinnedIndices = list4;
                                                                                        i37 = i31;
                                                                                    }
                                                                                }
                                                                                list4 = calculateLazyLayoutPinnedIndices;
                                                                                i31 = i37;
                                                                                int i79 = lazyGridSpanLayoutProvider7.slotsPerLine;
                                                                                int spanOf2 = lazyGridSpanLayoutProvider7.spanOf(intValue4);
                                                                                LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$14 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13;
                                                                                LazyGridMeasuredItem m316getAndMeasurem8Kt_7k2 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$14.m316getAndMeasurem8Kt_7k(intValue4, 0, spanOf2, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13.defaultMainAxisSpacing, lruArrayPool.m1910childConstraintsJhjzzOo$foundation(0, spanOf2));
                                                                                lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$14;
                                                                                if (list6 == null) {
                                                                                    list6 = new ArrayList();
                                                                                }
                                                                                List list11 = list6;
                                                                                list11.add(m316getAndMeasurem8Kt_7k2);
                                                                                list6 = list11;
                                                                                i22++;
                                                                                lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;
                                                                                calculateLazyLayoutPinnedIndices = list4;
                                                                                i37 = i31;
                                                                            }
                                                                            lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13;
                                                                            i22++;
                                                                            lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;
                                                                            calculateLazyLayoutPinnedIndices = list4;
                                                                            i37 = i31;
                                                                        }
                                                                        i23 = i37;
                                                                        LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$15 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13;
                                                                        if (list6 == null) {
                                                                            list6 = EmptyList.INSTANCE;
                                                                        }
                                                                        List list12 = list6;
                                                                        if (i39 <= 0 || mo230roundToPx0680j_45 < 0) {
                                                                            size3 = arrayDeque.getSize();
                                                                            int i80 = i66;
                                                                            lazyGridMeasuredLine = lazyGridMeasuredLine2;
                                                                            i24 = 0;
                                                                            while (i24 < size3) {
                                                                                int i81 = ((LazyGridMeasuredLine) arrayDeque.get(i24)).mainAxisSizeWithSpacings;
                                                                                if (i80 == 0 || i81 > i80 || i24 == arrayDeque.getSize() - 1) {
                                                                                    break;
                                                                                }
                                                                                i80 -= i81;
                                                                                i24++;
                                                                                lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayDeque.get(i24);
                                                                            }
                                                                            i25 = i80;
                                                                        } else {
                                                                            i25 = i66;
                                                                            lazyGridMeasuredLine = lazyGridMeasuredLine2;
                                                                        }
                                                                        int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j4);
                                                                        int m1032constrainHeightK40F9xA2 = ConstraintsKt.m1032constrainHeightK40F9xA(i51, j4);
                                                                        List list13 = arrayDeque;
                                                                        if (!list3.isEmpty()) {
                                                                            list13 = CollectionsKt.plus((Iterable) list3, (Collection) arrayDeque);
                                                                        }
                                                                        z9 = i51 >= Math.min(m1032constrainHeightK40F9xA2, m1024getMaxHeightimpl);
                                                                        if (z9 && i18 != 0) {
                                                                            InlineClassHelperKt.throwIllegalStateException("non-zero firstLineScrollOffset");
                                                                        }
                                                                        size4 = list13.size();
                                                                        int i82 = 0;
                                                                        for (i26 = 0; i26 < size4; i26++) {
                                                                            i82 += ((LazyGridMeasuredLine) list13.get(i26)).items.length;
                                                                        }
                                                                        ArrayList arrayList3 = new ArrayList(i82);
                                                                        if (z9) {
                                                                            i27 = i51;
                                                                            int size8 = list2.size() - 1;
                                                                            if (size8 >= 0) {
                                                                                int i83 = i18;
                                                                                while (true) {
                                                                                    int i84 = size8 - 1;
                                                                                    List list14 = list2;
                                                                                    LazyGridMeasuredItem lazyGridMeasuredItem5 = (LazyGridMeasuredItem) list14.get(size8);
                                                                                    i28 = i25;
                                                                                    i83 -= lazyGridMeasuredItem5.mainAxisSizeWithSpacings;
                                                                                    lazyGridMeasuredItem5.position(i83, 0, m1025getMaxWidthimpl, m1032constrainHeightK40F9xA2);
                                                                                    arrayList3.add(lazyGridMeasuredItem5);
                                                                                    if (i84 < 0) {
                                                                                        break;
                                                                                    }
                                                                                    size8 = i84;
                                                                                    list2 = list14;
                                                                                    i25 = i28;
                                                                                }
                                                                            } else {
                                                                                i28 = i25;
                                                                            }
                                                                            int size9 = list13.size();
                                                                            int i85 = i18;
                                                                            int i86 = 0;
                                                                            List list15 = list13;
                                                                            while (i86 < size9) {
                                                                                LazyGridMeasuredLine lazyGridMeasuredLine5 = (LazyGridMeasuredLine) list15.get(i86);
                                                                                LazyGridMeasuredItem[] position = lazyGridMeasuredLine5.position(i85, m1025getMaxWidthimpl, m1032constrainHeightK40F9xA2);
                                                                                int i87 = size9;
                                                                                List list16 = list15;
                                                                                int i88 = 0;
                                                                                for (int length4 = position.length; i88 < length4; length4 = length4) {
                                                                                    arrayList3.add(position[i88]);
                                                                                    i88++;
                                                                                }
                                                                                i85 += lazyGridMeasuredLine5.mainAxisSizeWithSpacings;
                                                                                i86++;
                                                                                size9 = i87;
                                                                                list15 = list16;
                                                                            }
                                                                            int size10 = list12.size();
                                                                            for (int i89 = 0; i89 < size10; i89++) {
                                                                                LazyGridMeasuredItem lazyGridMeasuredItem6 = (LazyGridMeasuredItem) list12.get(i89);
                                                                                lazyGridMeasuredItem6.position(i85, 0, m1025getMaxWidthimpl, m1032constrainHeightK40F9xA2);
                                                                                arrayList3.add(lazyGridMeasuredItem6);
                                                                                i85 += lazyGridMeasuredItem6.mainAxisSizeWithSpacings;
                                                                            }
                                                                            f2 = f;
                                                                        } else {
                                                                            if (!list2.isEmpty() || !list12.isEmpty()) {
                                                                                InlineClassHelperKt.throwIllegalArgumentException("no items");
                                                                            }
                                                                            int size11 = list13.size();
                                                                            int[] iArr = new int[size11];
                                                                            for (int i90 = 0; i90 < size11; i90++) {
                                                                                iArr[i90] = ((LazyGridMeasuredLine) list13.get(i90)).mainAxisSize;
                                                                            }
                                                                            int[] iArr2 = new int[size11];
                                                                            if (arrangement$Vertical2 == null) {
                                                                                throw Recorder$$ExternalSyntheticOutline2.m("null verticalArrangement");
                                                                            }
                                                                            arrangement$Vertical2.arrange(lazyLayoutMeasureScopeImpl, m1032constrainHeightK40F9xA2, iArr, iArr2);
                                                                            IntRange indices = ArraysKt___ArraysKt.getIndices(iArr2);
                                                                            int i91 = indices.last;
                                                                            int i92 = indices.step;
                                                                            if ((i92 > 0 && i91 >= 0) || (i92 < 0 && i91 <= 0)) {
                                                                                i27 = i51;
                                                                                int i93 = 0;
                                                                                while (true) {
                                                                                    int[] iArr3 = iArr2;
                                                                                    LazyGridMeasuredItem[] position2 = ((LazyGridMeasuredLine) list13.get(i93)).position(iArr2[i93], m1025getMaxWidthimpl, m1032constrainHeightK40F9xA2);
                                                                                    int length5 = position2.length;
                                                                                    int i94 = 0;
                                                                                    while (i94 < length5) {
                                                                                        int i95 = i94;
                                                                                        arrayList3.add(position2[i95]);
                                                                                        i94 = i95 + 1;
                                                                                    }
                                                                                    if (i93 == i91) {
                                                                                        break;
                                                                                    }
                                                                                    i93 += i92;
                                                                                    iArr2 = iArr3;
                                                                                }
                                                                            } else {
                                                                                i27 = i51;
                                                                            }
                                                                            i28 = i25;
                                                                            f2 = f;
                                                                        }
                                                                        i29 = i27;
                                                                        lazyLayoutItemAnimator.onMeasured((int) f2, m1025getMaxWidthimpl, m1032constrainHeightK40F9xA2, arrayList3, lazyGridItemProviderImpl4.keyIndexMap, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$15, true, isLookingAhead, length, z10, i28, i29, coroutineScope2, graphicsContext2);
                                                                        if (!isLookingAhead) {
                                                                            long m321getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m321getMinSizeToFitDisappearingItemsYbymL2g();
                                                                            if (!IntSize.m1055equalsimpl0(m321getMinSizeToFitDisappearingItemsYbymL2g2, 0L)) {
                                                                                m1025getMaxWidthimpl = ConstraintsKt.m1033constrainWidthK40F9xA(Math.max(m1025getMaxWidthimpl, (int) (m321getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)), j4);
                                                                                int m1032constrainHeightK40F9xA3 = ConstraintsKt.m1032constrainHeightK40F9xA(Math.max(m1032constrainHeightK40F9xA2, (int) (m321getMinSizeToFitDisappearingItemsYbymL2g2 & BodyPartID.bodyIdMax)), j4);
                                                                                if (m1032constrainHeightK40F9xA3 != m1032constrainHeightK40F9xA2) {
                                                                                    int size12 = arrayList3.size();
                                                                                    for (int i96 = 0; i96 < size12; i96++) {
                                                                                        LazyGridMeasuredItem lazyGridMeasuredItem7 = (LazyGridMeasuredItem) arrayList3.get(i96);
                                                                                        lazyGridMeasuredItem7.mainAxisLayoutSize = m1032constrainHeightK40F9xA3;
                                                                                        lazyGridMeasuredItem7.maxMainAxisOffset = lazyGridMeasuredItem7.afterContentPadding + m1032constrainHeightK40F9xA3;
                                                                                    }
                                                                                }
                                                                                i30 = m1032constrainHeightK40F9xA3;
                                                                                int i97 = m1025getMaxWidthimpl;
                                                                                lazyGridItemProviderImpl4.intervalContent.getClass();
                                                                                int i98 = i21;
                                                                                List applyStickyItems = LazyLayoutKt.applyStickyItems(this.$stickyItemsScrollBehavior, i69, i98, arrayList3, IntListKt.EmptyIntList, i39, i97, i30, new ClickableKt$$ExternalSyntheticLambda0(23, lruArrayPool, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$15));
                                                                                boolean z13 = i98 == i23 + (-1) || i29 > m1024getMaxHeightimpl;
                                                                                LazyListMeasureKt$$ExternalSyntheticLambda2 lazyListMeasureKt$$ExternalSyntheticLambda2 = new LazyListMeasureKt$$ExternalSyntheticLambda2(mutableState, arrayList3, applyStickyItems, isLookingAhead, 1);
                                                                                int m1033constrainWidthK40F9xA2 = ConstraintsKt.m1033constrainWidthK40F9xA(i97 + i13, j);
                                                                                int m1032constrainHeightK40F9xA4 = ConstraintsKt.m1032constrainHeightK40F9xA(i30 + i12, j);
                                                                                EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                                                                                emptyMap2.getClass();
                                                                                lazyGridMeasureResult = new LazyGridMeasureResult(lazyGridMeasuredLine, i28, z13, f2, subcomposeMeasureScope.layout(m1033constrainWidthK40F9xA2, m1032constrainHeightK40F9xA4, emptyMap2, lazyListMeasureKt$$ExternalSyntheticLambda2), f7, z8, coroutineScope2, lazyLayoutMeasureScopeImpl, length, clickableKt$$ExternalSyntheticLambda0, objectList$$ExternalSyntheticLambda03, LazyLayoutKt.updatedVisibleItems(i69, i98, arrayList3, applyStickyItems), i46, i49, i23, Orientation.Vertical, i35, mo230roundToPx0680j_45);
                                                                            }
                                                                        }
                                                                        i30 = m1032constrainHeightK40F9xA2;
                                                                        int i972 = m1025getMaxWidthimpl;
                                                                        lazyGridItemProviderImpl4.intervalContent.getClass();
                                                                        int i982 = i21;
                                                                        List applyStickyItems2 = LazyLayoutKt.applyStickyItems(this.$stickyItemsScrollBehavior, i69, i982, arrayList3, IntListKt.EmptyIntList, i39, i972, i30, new ClickableKt$$ExternalSyntheticLambda0(23, lruArrayPool, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$15));
                                                                        if (i982 == i23 + (-1)) {
                                                                        }
                                                                        LazyListMeasureKt$$ExternalSyntheticLambda2 lazyListMeasureKt$$ExternalSyntheticLambda22 = new LazyListMeasureKt$$ExternalSyntheticLambda2(mutableState, arrayList3, applyStickyItems2, isLookingAhead, 1);
                                                                        int m1033constrainWidthK40F9xA22 = ConstraintsKt.m1033constrainWidthK40F9xA(i972 + i13, j);
                                                                        int m1032constrainHeightK40F9xA42 = ConstraintsKt.m1032constrainHeightK40F9xA(i30 + i12, j);
                                                                        EmptyMap emptyMap22 = EmptyMap.INSTANCE;
                                                                        emptyMap22.getClass();
                                                                        lazyGridMeasureResult = new LazyGridMeasureResult(lazyGridMeasuredLine, i28, z13, f2, subcomposeMeasureScope.layout(m1033constrainWidthK40F9xA22, m1032constrainHeightK40F9xA42, emptyMap22, lazyListMeasureKt$$ExternalSyntheticLambda22), f7, z8, coroutineScope2, lazyLayoutMeasureScopeImpl, length, clickableKt$$ExternalSyntheticLambda0, objectList$$ExternalSyntheticLambda03, LazyLayoutKt.updatedVisibleItems(i69, i982, arrayList3, applyStickyItems2), i46, i49, i23, Orientation.Vertical, i35, mo230roundToPx0680j_45);
                                                                    }
                                                                } else {
                                                                    i21 = i19;
                                                                }
                                                                list2 = list8;
                                                                list3 = null;
                                                                if (list3 == null) {
                                                                }
                                                                size2 = list7.size();
                                                                i22 = 0;
                                                                while (i22 < size2) {
                                                                }
                                                                i23 = i37;
                                                                LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$152 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13;
                                                                if (list6 == null) {
                                                                }
                                                                List list122 = list6;
                                                                if (i39 <= 0) {
                                                                }
                                                                size3 = arrayDeque.getSize();
                                                                int i802 = i66;
                                                                lazyGridMeasuredLine = lazyGridMeasuredLine2;
                                                                i24 = 0;
                                                                while (i24 < size3) {
                                                                }
                                                                i25 = i802;
                                                                int m1025getMaxWidthimpl2 = Constraints.m1025getMaxWidthimpl(j4);
                                                                int m1032constrainHeightK40F9xA22 = ConstraintsKt.m1032constrainHeightK40F9xA(i51, j4);
                                                                List list132 = arrayDeque;
                                                                if (!list3.isEmpty()) {
                                                                }
                                                                if (i51 >= Math.min(m1032constrainHeightK40F9xA22, m1024getMaxHeightimpl)) {
                                                                }
                                                                if (z9) {
                                                                    InlineClassHelperKt.throwIllegalStateException("non-zero firstLineScrollOffset");
                                                                }
                                                                size4 = list132.size();
                                                                int i822 = 0;
                                                                while (i26 < size4) {
                                                                }
                                                                ArrayList arrayList32 = new ArrayList(i822);
                                                                if (z9) {
                                                                }
                                                                i29 = i27;
                                                                lazyLayoutItemAnimator.onMeasured((int) f2, m1025getMaxWidthimpl2, m1032constrainHeightK40F9xA22, arrayList32, lazyGridItemProviderImpl4.keyIndexMap, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$152, true, isLookingAhead, length, z10, i28, i29, coroutineScope2, graphicsContext2);
                                                                if (!isLookingAhead) {
                                                                }
                                                                i30 = m1032constrainHeightK40F9xA22;
                                                                int i9722 = m1025getMaxWidthimpl2;
                                                                lazyGridItemProviderImpl4.intervalContent.getClass();
                                                                int i9822 = i21;
                                                                List applyStickyItems22 = LazyLayoutKt.applyStickyItems(this.$stickyItemsScrollBehavior, i69, i9822, arrayList32, IntListKt.EmptyIntList, i39, i9722, i30, new ClickableKt$$ExternalSyntheticLambda0(23, lruArrayPool, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$152));
                                                                if (i9822 == i23 + (-1)) {
                                                                }
                                                                LazyListMeasureKt$$ExternalSyntheticLambda2 lazyListMeasureKt$$ExternalSyntheticLambda222 = new LazyListMeasureKt$$ExternalSyntheticLambda2(mutableState, arrayList32, applyStickyItems22, isLookingAhead, 1);
                                                                int m1033constrainWidthK40F9xA222 = ConstraintsKt.m1033constrainWidthK40F9xA(i9722 + i13, j);
                                                                int m1032constrainHeightK40F9xA422 = ConstraintsKt.m1032constrainHeightK40F9xA(i30 + i12, j);
                                                                EmptyMap emptyMap222 = EmptyMap.INSTANCE;
                                                                emptyMap222.getClass();
                                                                lazyGridMeasureResult = new LazyGridMeasureResult(lazyGridMeasuredLine, i28, z13, f2, subcomposeMeasureScope.layout(m1033constrainWidthK40F9xA222, m1032constrainHeightK40F9xA422, emptyMap222, lazyListMeasureKt$$ExternalSyntheticLambda222), f7, z8, coroutineScope2, lazyLayoutMeasureScopeImpl, length, clickableKt$$ExternalSyntheticLambda0, objectList$$ExternalSyntheticLambda03, LazyLayoutKt.updatedVisibleItems(i69, i9822, arrayList32, applyStickyItems22), i46, i49, i23, Orientation.Vertical, i35, mo230roundToPx0680j_45);
                                                            }
                                                        }
                                                        i21 = i19;
                                                        f = f4;
                                                        list2 = list8;
                                                        list3 = null;
                                                        if (list3 == null) {
                                                        }
                                                        size2 = list7.size();
                                                        i22 = 0;
                                                        while (i22 < size2) {
                                                        }
                                                        i23 = i37;
                                                        LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1522 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13;
                                                        if (list6 == null) {
                                                        }
                                                        List list1222 = list6;
                                                        if (i39 <= 0) {
                                                        }
                                                        size3 = arrayDeque.getSize();
                                                        int i8022 = i66;
                                                        lazyGridMeasuredLine = lazyGridMeasuredLine2;
                                                        i24 = 0;
                                                        while (i24 < size3) {
                                                        }
                                                        i25 = i8022;
                                                        int m1025getMaxWidthimpl22 = Constraints.m1025getMaxWidthimpl(j4);
                                                        int m1032constrainHeightK40F9xA222 = ConstraintsKt.m1032constrainHeightK40F9xA(i51, j4);
                                                        List list1322 = arrayDeque;
                                                        if (!list3.isEmpty()) {
                                                        }
                                                        if (i51 >= Math.min(m1032constrainHeightK40F9xA222, m1024getMaxHeightimpl)) {
                                                        }
                                                        if (z9) {
                                                        }
                                                        size4 = list1322.size();
                                                        int i8222 = 0;
                                                        while (i26 < size4) {
                                                        }
                                                        ArrayList arrayList322 = new ArrayList(i8222);
                                                        if (z9) {
                                                        }
                                                        i29 = i27;
                                                        lazyLayoutItemAnimator.onMeasured((int) f2, m1025getMaxWidthimpl22, m1032constrainHeightK40F9xA222, arrayList322, lazyGridItemProviderImpl4.keyIndexMap, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1522, true, isLookingAhead, length, z10, i28, i29, coroutineScope2, graphicsContext2);
                                                        if (!isLookingAhead) {
                                                        }
                                                        i30 = m1032constrainHeightK40F9xA222;
                                                        int i97222 = m1025getMaxWidthimpl22;
                                                        lazyGridItemProviderImpl4.intervalContent.getClass();
                                                        int i98222 = i21;
                                                        List applyStickyItems222 = LazyLayoutKt.applyStickyItems(this.$stickyItemsScrollBehavior, i69, i98222, arrayList322, IntListKt.EmptyIntList, i39, i97222, i30, new ClickableKt$$ExternalSyntheticLambda0(23, lruArrayPool, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1522));
                                                        if (i98222 == i23 + (-1)) {
                                                        }
                                                        LazyListMeasureKt$$ExternalSyntheticLambda2 lazyListMeasureKt$$ExternalSyntheticLambda2222 = new LazyListMeasureKt$$ExternalSyntheticLambda2(mutableState, arrayList322, applyStickyItems222, isLookingAhead, 1);
                                                        int m1033constrainWidthK40F9xA2222 = ConstraintsKt.m1033constrainWidthK40F9xA(i97222 + i13, j);
                                                        int m1032constrainHeightK40F9xA4222 = ConstraintsKt.m1032constrainHeightK40F9xA(i30 + i12, j);
                                                        EmptyMap emptyMap2222 = EmptyMap.INSTANCE;
                                                        emptyMap2222.getClass();
                                                        lazyGridMeasureResult = new LazyGridMeasureResult(lazyGridMeasuredLine, i28, z13, f2, subcomposeMeasureScope.layout(m1033constrainWidthK40F9xA2222, m1032constrainHeightK40F9xA4222, emptyMap2222, lazyListMeasureKt$$ExternalSyntheticLambda2222), f7, z8, coroutineScope2, lazyLayoutMeasureScopeImpl, length, clickableKt$$ExternalSyntheticLambda0, objectList$$ExternalSyntheticLambda03, LazyLayoutKt.updatedVisibleItems(i69, i98222, arrayList322, applyStickyItems222), i46, i49, i23, Orientation.Vertical, i35, mo230roundToPx0680j_45);
                                                    }
                                                } else {
                                                    i18 = i64;
                                                }
                                                i19 = 0;
                                                List list72 = calculateLazyLayoutPinnedIndices;
                                                size = list72.size();
                                                list = null;
                                                i20 = 0;
                                                while (i20 < size) {
                                                }
                                                int i692 = i65;
                                                LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider72 = lazyGridSpanLayoutProvider6;
                                                if (list == null) {
                                                }
                                                List list82 = list;
                                                if (isLookingAhead) {
                                                    list5 = lazyGridMeasureResult2.visibleItemsInfo;
                                                    if (!list5.isEmpty()) {
                                                    }
                                                }
                                                i21 = i19;
                                                f = f4;
                                                list2 = list82;
                                                list3 = null;
                                                if (list3 == null) {
                                                }
                                                size2 = list72.size();
                                                i22 = 0;
                                                while (i22 < size2) {
                                                }
                                                i23 = i37;
                                                LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$15222 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13;
                                                if (list6 == null) {
                                                }
                                                List list12222 = list6;
                                                if (i39 <= 0) {
                                                }
                                                size3 = arrayDeque.getSize();
                                                int i80222 = i66;
                                                lazyGridMeasuredLine = lazyGridMeasuredLine2;
                                                i24 = 0;
                                                while (i24 < size3) {
                                                }
                                                i25 = i80222;
                                                int m1025getMaxWidthimpl222 = Constraints.m1025getMaxWidthimpl(j4);
                                                int m1032constrainHeightK40F9xA2222 = ConstraintsKt.m1032constrainHeightK40F9xA(i51, j4);
                                                List list13222 = arrayDeque;
                                                if (!list3.isEmpty()) {
                                                }
                                                if (i51 >= Math.min(m1032constrainHeightK40F9xA2222, m1024getMaxHeightimpl)) {
                                                }
                                                if (z9) {
                                                }
                                                size4 = list13222.size();
                                                int i82222 = 0;
                                                while (i26 < size4) {
                                                }
                                                ArrayList arrayList3222 = new ArrayList(i82222);
                                                if (z9) {
                                                }
                                                i29 = i27;
                                                lazyLayoutItemAnimator.onMeasured((int) f2, m1025getMaxWidthimpl222, m1032constrainHeightK40F9xA2222, arrayList3222, lazyGridItemProviderImpl4.keyIndexMap, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$15222, true, isLookingAhead, length, z10, i28, i29, coroutineScope2, graphicsContext2);
                                                if (!isLookingAhead) {
                                                }
                                                i30 = m1032constrainHeightK40F9xA2222;
                                                int i972222 = m1025getMaxWidthimpl222;
                                                lazyGridItemProviderImpl4.intervalContent.getClass();
                                                int i982222 = i21;
                                                List applyStickyItems2222 = LazyLayoutKt.applyStickyItems(this.$stickyItemsScrollBehavior, i692, i982222, arrayList3222, IntListKt.EmptyIntList, i39, i972222, i30, new ClickableKt$$ExternalSyntheticLambda0(23, lruArrayPool, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$15222));
                                                if (i982222 == i23 + (-1)) {
                                                }
                                                LazyListMeasureKt$$ExternalSyntheticLambda2 lazyListMeasureKt$$ExternalSyntheticLambda22222 = new LazyListMeasureKt$$ExternalSyntheticLambda2(mutableState, arrayList3222, applyStickyItems2222, isLookingAhead, 1);
                                                int m1033constrainWidthK40F9xA22222 = ConstraintsKt.m1033constrainWidthK40F9xA(i972222 + i13, j);
                                                int m1032constrainHeightK40F9xA42222 = ConstraintsKt.m1032constrainHeightK40F9xA(i30 + i12, j);
                                                EmptyMap emptyMap22222 = EmptyMap.INSTANCE;
                                                emptyMap22222.getClass();
                                                lazyGridMeasureResult = new LazyGridMeasureResult(lazyGridMeasuredLine, i28, z13, f2, subcomposeMeasureScope.layout(m1033constrainWidthK40F9xA22222, m1032constrainHeightK40F9xA42222, emptyMap22222, lazyListMeasureKt$$ExternalSyntheticLambda22222), f7, z8, coroutineScope2, lazyLayoutMeasureScopeImpl, length, clickableKt$$ExternalSyntheticLambda0, objectList$$ExternalSyntheticLambda03, LazyLayoutKt.updatedVisibleItems(i692, i982222, arrayList3222, applyStickyItems2222), i46, i49, i23, Orientation.Vertical, i35, mo230roundToPx0680j_45);
                                            }
                                            LazyGridState lazyGridState6 = lazyGridState4;
                                            lazyGridState6.applyMeasureResult$foundation(lazyGridMeasureResult, subcomposeMeasureScope.isLookingAhead(), false);
                                            DefaultLazyListPrefetchStrategy defaultLazyListPrefetchStrategy = lazyGridState6.prefetchStrategy;
                                            return lazyGridMeasureResult;
                                        }
                                        lineIndexOfItem = lazyGridSpanLayoutProvider4.getLineIndexOfItem(findIndexByKey);
                                        intValue = lazyListScrollPosition.scrollOffset$delegate.getIntValue();
                                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, function12);
                                        List calculateLazyLayoutPinnedIndices2 = LazyLayoutKt.calculateLazyLayoutPinnedIndices(lazyGridItemProviderImpl3, lazyGridState5.pinnedItems, lazyGridState5.beyondBoundsInfo);
                                        if (subcomposeMeasureScope2.isLookingAhead()) {
                                        }
                                        LazyLayoutItemAnimator lazyLayoutItemAnimator2 = lazyGridState5.itemAnimator;
                                        boolean isLookingAhead2 = subcomposeMeasureScope2.isLookingAhead();
                                        LazyGridMeasureResult lazyGridMeasureResult22 = lazyGridState5.approachLayoutInfo;
                                        MutableState mutableState2 = lazyGridState5.placementScopeInvalidator;
                                        if (i15 < 0) {
                                        }
                                        if (i35 < 0) {
                                        }
                                        LazyGridItemProviderImpl lazyGridItemProviderImpl42 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$12.itemProvider;
                                        CoroutineScope coroutineScope22 = this.$coroutineScope;
                                        int i382 = lineIndexOfItem;
                                        GraphicsContext graphicsContext22 = this.$graphicsContext;
                                        float f32 = floatValue;
                                        if (i37 > 0) {
                                        }
                                        LazyGridState lazyGridState62 = lazyGridState4;
                                        lazyGridState62.applyMeasureResult$foundation(lazyGridMeasureResult, subcomposeMeasureScope.isLookingAhead(), false);
                                        DefaultLazyListPrefetchStrategy defaultLazyListPrefetchStrategy2 = lazyGridState62.prefetchStrategy;
                                        return lazyGridMeasureResult;
                                    } catch (Throwable th) {
                                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, function12);
                                        throw th;
                                    }
                                }
                            } else {
                                i11 = mo230roundToPx0680j_44;
                            }
                            gridSlotCache2.cachedConstraints = m1034offsetNN6EwU;
                            gridSlotCache2.cachedDensity = subcomposeMeasureScope2.getDensity();
                            TextKt$$ExternalSyntheticLambda0 textKt$$ExternalSyntheticLambda0 = gridSlotCache2.calculation;
                            GridCells gridCells = (GridCells) textKt$$ExternalSyntheticLambda0.f$0;
                            Arrangement$Horizontal arrangement$Horizontal2 = (Arrangement$Horizontal) textKt$$ExternalSyntheticLambda0.f$1;
                            if (Constraints.m1025getMaxWidthimpl(m1034offsetNN6EwU) == Integer.MAX_VALUE) {
                                InlineClassHelperKt.throwIllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
                            }
                            int m1025getMaxWidthimpl3 = Constraints.m1025getMaxWidthimpl(m1034offsetNN6EwU);
                            int[] intArray = CollectionsKt.toIntArray(gridCells.calculateCrossAxisCellSizes(lazyLayoutMeasureScopeImpl, m1025getMaxWidthimpl3, lazyLayoutMeasureScopeImpl.mo230roundToPx0680j_4(arrangement$Horizontal2.mo252getSpacingD9Ej5fM())));
                            int[] iArr4 = new int[intArray.length];
                            i12 = i11;
                            i13 = i34;
                            j2 = m1034offsetNN6EwU;
                            lazyGridItemProviderImpl = lazyGridItemProviderImpl2;
                            lazyGridSpanLayoutProvider = lazyGridSpanLayoutProvider3;
                            i14 = mo230roundToPx0680j_43;
                            arrangement$Horizontal2.arrange(lazyLayoutMeasureScopeImpl, m1025getMaxWidthimpl3, intArray, LayoutDirection.Ltr, iArr4);
                            anonymousClass4 = new Recorder.AnonymousClass4(intArray, iArr4, false, 15);
                            gridSlotCache2.cachedSizes = anonymousClass4;
                            Recorder.AnonymousClass4 anonymousClass422 = anonymousClass4;
                            length = ((int[]) anonymousClass422.val$audioErrorConsumer).length;
                            if (length == lazyGridSpanLayoutProvider.slotsPerLine) {
                            }
                            arrangement$Vertical2 = this.$verticalArrangement;
                            if (arrangement$Vertical2 != null) {
                            }
                        }
                    };
                    kProperty0 = kProperty02;
                    gapComposer2.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue4;
                    lazySemanticsKt$rememberLazyGridSemanticState$1$1 = lazySemanticsKt$rememberLazyGridSemanticState$1$12;
                    kProperty0 = kProperty02;
                    z3 = false;
                    z4 = true;
                    lazyGridState3 = lazyGridState;
                }
                LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy = (LazyLayoutMeasurePolicy) obj;
                Orientation orientation = Orientation.Vertical;
                if (z) {
                    gapComposer2.startReplaceGroup(27577840);
                    gapComposer2.end(z3);
                    modifier2 = Modifier.Companion.$$INSTANCE;
                } else {
                    gapComposer2.startReplaceGroup(27281635);
                    if (((i6 ^ 6) <= 4 || !gapComposer2.changed(lazyGridState3)) && (i5 & 6) != 4) {
                        z4 = z3;
                    }
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (z4 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new LazyGridBeyondBoundsState(lazyGridState3);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    modifier2 = LazyLayoutKt.lazyLayoutBeyondBoundsModifier((LazyGridBeyondBoundsState) rememberedValue5, lazyGridState3.beyondBoundsInfo, orientation);
                    gapComposer2.end(z3);
                }
                lazyGridState2 = lazyGridState3;
                gapComposer = gapComposer2;
                LazyLayoutKt.LazyLayout(kProperty0, ImageKt.scrollableArea(LazyLayoutKt.lazyLayoutSemantics(modifier.then(lazyGridState3.remeasurementModifier).then(lazyGridState3.awaitLayoutModifier), kProperty0, lazySemanticsKt$rememberLazyGridSemanticState$1$1, orientation, z).then(modifier2).then(lazyGridState3.itemAnimator.modifier), lazyGridState3, orientation, androidEdgeEffectOverscrollEffect, z, flingBehavior, lazyGridState3.internalInteractionSource, null), lazyGridState2.prefetchState, lazyLayoutMeasurePolicy, gapComposer, 0);
            }
            z2 = true;
            changed = ((((i10 & 29360128) ^ 12582912) <= 8388608 && gapComposer2.changed(arrangement$Vertical)) || (i10 & 12582912) == 8388608) | z7 | z2 | ((((458752 & i10) ^ 196608) <= 131072 && gapComposer2.changed(true)) || (i10 & 196608) == 131072) | ((((i10 & 3670016) ^ 1572864) <= 1048576 && gapComposer2.changed(arrangement$Horizontal)) || (i10 & 1572864) == 1048576) | gapComposer2.changed(graphicsContext);
            Object rememberedValue42 = gapComposer2.rememberedValue();
            if (changed) {
            }
            lazyGridState3 = lazyGridState;
            lazySemanticsKt$rememberLazyGridSemanticState$1$1 = lazySemanticsKt$rememberLazyGridSemanticState$1$12;
            z3 = false;
            z4 = true;
            obj = new LazyLayoutMeasurePolicy(paddingValues, kProperty02, gridSlotCache, arrangement$Vertical, arrangement$Horizontal, coroutineScope, graphicsContext, noKey) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                public final /* synthetic */ PaddingValues $contentPadding;
                public final /* synthetic */ CoroutineScope $coroutineScope;
                public final /* synthetic */ GraphicsContext $graphicsContext;
                public final /* synthetic */ Function0 $itemProviderLambda;
                public final /* synthetic */ GridSlotCache $slots;
                public final /* synthetic */ CachedItem.NoKey $stickyItemsScrollBehavior;
                public final /* synthetic */ Arrangement$Vertical $verticalArrangement;

                {
                    this.$coroutineScope = coroutineScope;
                    this.$graphicsContext = graphicsContext;
                    this.$stickyItemsScrollBehavior = noKey;
                }

                /* JADX WARN: Removed duplicated region for block: B:129:0x0462  */
                /* JADX WARN: Removed duplicated region for block: B:144:0x04b8  */
                /* JADX WARN: Removed duplicated region for block: B:150:0x04cb  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x00fb  */
                /* JADX WARN: Removed duplicated region for block: B:182:0x0580  */
                /* JADX WARN: Removed duplicated region for block: B:185:0x0589  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x011e  */
                /* JADX WARN: Removed duplicated region for block: B:212:0x0612  */
                /* JADX WARN: Removed duplicated region for block: B:215:0x0618 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:219:0x065a  */
                /* JADX WARN: Removed duplicated region for block: B:222:0x0666  */
                /* JADX WARN: Removed duplicated region for block: B:224:0x066c A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:228:0x067d A[LOOP:12: B:227:0x067b->B:228:0x067d, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:232:0x0691  */
                /* JADX WARN: Removed duplicated region for block: B:256:0x07b8  */
                /* JADX WARN: Removed duplicated region for block: B:268:0x0825 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:279:0x0710  */
                /* JADX WARN: Removed duplicated region for block: B:300:0x0669  */
                /* JADX WARN: Removed duplicated region for block: B:303:0x062b  */
                /* JADX WARN: Removed duplicated region for block: B:365:0x088a  */
                /* JADX WARN: Removed duplicated region for block: B:367:0x0119  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x021e  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0227  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x023f  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x02c9  */
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
                /* renamed from: measure-0kLqBqw */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final MeasureResult mo307measure0kLqBqw(LazyLayoutMeasureScopeImpl lazyLayoutMeasureScopeImpl, long j) {
                    int i11;
                    int i12;
                    int i13;
                    long j2;
                    LazyGridItemProviderImpl lazyGridItemProviderImpl;
                    LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider;
                    int i14;
                    Recorder.AnonymousClass4 anonymousClass4;
                    int length;
                    Arrangement$Vertical arrangement$Vertical2;
                    ObjectList$$ExternalSyntheticLambda0 objectList$$ExternalSyntheticLambda0;
                    Function1 function12;
                    int i15;
                    int lineIndexOfItem;
                    int intValue;
                    SubcomposeMeasureScope subcomposeMeasureScope;
                    LazyGridState lazyGridState4;
                    boolean z8;
                    int i16;
                    int i17;
                    int i18;
                    int i19;
                    int size;
                    List list;
                    int i20;
                    int i21;
                    float f;
                    List list2;
                    List list3;
                    int size2;
                    int i22;
                    int i23;
                    int size3;
                    LazyGridMeasuredLine lazyGridMeasuredLine;
                    int i24;
                    int i25;
                    boolean z9;
                    int size4;
                    int i26;
                    int i27;
                    int i28;
                    float f2;
                    int i29;
                    int i30;
                    LazyGridMeasureResult lazyGridMeasureResult;
                    List list4;
                    int i31;
                    LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;
                    List list5;
                    LazyGridMeasuredItem lazyGridMeasuredItem;
                    int i32;
                    LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider2;
                    int i33;
                    LazyGridMeasuredItem lazyGridMeasuredItem2;
                    SubcomposeMeasureScope subcomposeMeasureScope2 = lazyLayoutMeasureScopeImpl.subcomposeMeasureScope;
                    LazyGridState lazyGridState5 = LazyGridState.this;
                    lazyGridState5.measurementScopeInvalidator.getValue();
                    boolean z10 = lazyGridState5.hasLookaheadOccurred || subcomposeMeasureScope2.isLookingAhead();
                    Orientation orientation2 = Orientation.Vertical;
                    ImageKt.m180checkScrollableContainerConstraintsK40F9xA(j, orientation2);
                    LayoutDirection layoutDirection = subcomposeMeasureScope2.getLayoutDirection();
                    PaddingValues paddingValues2 = this.$contentPadding;
                    int mo230roundToPx0680j_4 = subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo265calculateLeftPaddingu2uoSUM(layoutDirection));
                    int mo230roundToPx0680j_42 = subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo266calculateRightPaddingu2uoSUM(subcomposeMeasureScope2.getLayoutDirection()));
                    int mo230roundToPx0680j_43 = subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo267calculateTopPaddingD9Ej5fM());
                    int mo230roundToPx0680j_44 = subcomposeMeasureScope2.mo230roundToPx0680j_4(paddingValues2.mo264calculateBottomPaddingD9Ej5fM()) + mo230roundToPx0680j_43;
                    int i34 = mo230roundToPx0680j_42 + mo230roundToPx0680j_4;
                    int i35 = mo230roundToPx0680j_44 - mo230roundToPx0680j_43;
                    long m1034offsetNN6EwU = ConstraintsKt.m1034offsetNN6EwU(-i34, -mo230roundToPx0680j_44, j);
                    LazyGridItemProviderImpl lazyGridItemProviderImpl2 = (LazyGridItemProviderImpl) this.$itemProviderLambda.invoke();
                    LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider3 = lazyGridItemProviderImpl2.intervalContent.spanLayoutProvider;
                    GridSlotCache gridSlotCache2 = this.$slots;
                    if (gridSlotCache2.cachedSizes != null) {
                        i11 = mo230roundToPx0680j_44;
                        if (Constraints.m1019equalsimpl0(gridSlotCache2.cachedConstraints, m1034offsetNN6EwU) && gridSlotCache2.cachedDensity == subcomposeMeasureScope2.getDensity()) {
                            anonymousClass4 = gridSlotCache2.cachedSizes;
                            anonymousClass4.getClass();
                            j2 = m1034offsetNN6EwU;
                            i12 = i11;
                            i13 = i34;
                            i14 = mo230roundToPx0680j_43;
                            lazyGridItemProviderImpl = lazyGridItemProviderImpl2;
                            lazyGridSpanLayoutProvider = lazyGridSpanLayoutProvider3;
                            Recorder.AnonymousClass4 anonymousClass422 = anonymousClass4;
                            length = ((int[]) anonymousClass422.val$audioErrorConsumer).length;
                            if (length == lazyGridSpanLayoutProvider.slotsPerLine) {
                                lazyGridSpanLayoutProvider.slotsPerLine = length;
                                ArrayList arrayList = lazyGridSpanLayoutProvider.buckets;
                                arrayList.clear();
                                arrayList.add(new LazyGridSpanLayoutProvider.Bucket(0, 0));
                                lazyGridSpanLayoutProvider.lastLineIndex = 0;
                                lazyGridSpanLayoutProvider.lastLineStartItemIndex = 0;
                                lazyGridSpanLayoutProvider.lastLineStartKnownSpan = 0;
                                lazyGridSpanLayoutProvider.cachedBucketIndex = -1;
                                lazyGridSpanLayoutProvider.cachedBucket.clear();
                            }
                            arrangement$Vertical2 = this.$verticalArrangement;
                            if (arrangement$Vertical2 != null) {
                                throw Recorder$$ExternalSyntheticOutline2.m("null verticalArrangement when isVertical == true");
                            }
                            int mo230roundToPx0680j_45 = subcomposeMeasureScope2.mo230roundToPx0680j_4(arrangement$Vertical2.mo252getSpacingD9Ej5fM());
                            int itemCount = lazyGridItemProviderImpl.getItemCount();
                            int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j) - i12;
                            LazyGridItemProviderImpl lazyGridItemProviderImpl3 = lazyGridItemProviderImpl;
                            int i36 = i14;
                            LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider4 = lazyGridSpanLayoutProvider;
                            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$12 = new LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1(lazyGridItemProviderImpl3, lazyLayoutMeasureScopeImpl, mo230roundToPx0680j_45, LazyGridState.this, i36, i35, (mo230roundToPx0680j_4 << 32) | (i14 & BodyPartID.bodyIdMax));
                            LruArrayPool lruArrayPool = new LruArrayPool(anonymousClass422, itemCount, mo230roundToPx0680j_45, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$12, lazyGridSpanLayoutProvider4);
                            int i37 = itemCount;
                            LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider5 = (LazyGridSpanLayoutProvider) lruArrayPool.sortedSizes;
                            ClickableKt$$ExternalSyntheticLambda0 clickableKt$$ExternalSyntheticLambda0 = new ClickableKt$$ExternalSyntheticLambda0(22, lazyGridSpanLayoutProvider4, lruArrayPool);
                            ObjectList$$ExternalSyntheticLambda0 objectList$$ExternalSyntheticLambda02 = new ObjectList$$ExternalSyntheticLambda0(lazyGridSpanLayoutProvider4, 19);
                            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                            List list6 = null;
                            if (currentThreadSnapshot != null) {
                                objectList$$ExternalSyntheticLambda0 = objectList$$ExternalSyntheticLambda02;
                                function12 = currentThreadSnapshot.getReadObserver();
                            } else {
                                objectList$$ExternalSyntheticLambda0 = objectList$$ExternalSyntheticLambda02;
                                function12 = null;
                            }
                            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                            LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider6 = lazyGridSpanLayoutProvider5;
                            try {
                                LazyListScrollPosition lazyListScrollPosition = lazyGridState5.scrollPosition;
                                int intValue2 = lazyListScrollPosition.index$delegate.getIntValue();
                                int findIndexByKey = LazyLayoutKt.findIndexByKey(intValue2, lazyGridItemProviderImpl3, lazyListScrollPosition.lastKnownFirstItemKey);
                                if (intValue2 != findIndexByKey) {
                                    i15 = i36;
                                    lazyListScrollPosition.index$delegate.setIntValue(findIndexByKey);
                                    lazyListScrollPosition.nearestRangeState.update(intValue2);
                                } else {
                                    i15 = i36;
                                }
                                if (findIndexByKey >= i37 && i37 > 0) {
                                    lineIndexOfItem = lazyGridSpanLayoutProvider4.getLineIndexOfItem(i37 - 1);
                                    intValue = 0;
                                    zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, function12);
                                    List calculateLazyLayoutPinnedIndices2 = LazyLayoutKt.calculateLazyLayoutPinnedIndices(lazyGridItemProviderImpl3, lazyGridState5.pinnedItems, lazyGridState5.beyondBoundsInfo);
                                    float floatValue = (subcomposeMeasureScope2.isLookingAhead() && z10) ? ((Number) ((AnimationState) lazyGridState5._lazyLayoutScrollDeltaBetweenPasses.this$0).value$delegate.getValue()).floatValue() : lazyGridState5.scrollToBeConsumed;
                                    LazyLayoutItemAnimator lazyLayoutItemAnimator2 = lazyGridState5.itemAnimator;
                                    boolean isLookingAhead2 = subcomposeMeasureScope2.isLookingAhead();
                                    LazyGridMeasureResult lazyGridMeasureResult22 = lazyGridState5.approachLayoutInfo;
                                    MutableState mutableState2 = lazyGridState5.placementScopeInvalidator;
                                    if (i15 < 0) {
                                        InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
                                    }
                                    if (i35 < 0) {
                                        InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
                                    }
                                    LazyGridItemProviderImpl lazyGridItemProviderImpl42 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$12.itemProvider;
                                    CoroutineScope coroutineScope22 = this.$coroutineScope;
                                    int i382 = lineIndexOfItem;
                                    GraphicsContext graphicsContext22 = this.$graphicsContext;
                                    float f32 = floatValue;
                                    if (i37 > 0) {
                                        int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j2);
                                        int m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j2);
                                        lazyLayoutItemAnimator2.onMeasured(0, m1027getMinWidthimpl, m1026getMinHeightimpl, new ArrayList(), lazyGridItemProviderImpl42.keyIndexMap, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$12, true, isLookingAhead2, length, z10, 0, 0, coroutineScope22, graphicsContext22);
                                        if (!isLookingAhead2) {
                                            long m321getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator2.m321getMinSizeToFitDisappearingItemsYbymL2g();
                                            if (!IntSize.m1055equalsimpl0(m321getMinSizeToFitDisappearingItemsYbymL2g, 0L)) {
                                                long j3 = j2;
                                                m1027getMinWidthimpl = ConstraintsKt.m1033constrainWidthK40F9xA((int) (m321getMinSizeToFitDisappearingItemsYbymL2g >> 32), j3);
                                                m1026getMinHeightimpl = ConstraintsKt.m1032constrainHeightK40F9xA((int) (m321getMinSizeToFitDisappearingItemsYbymL2g & BodyPartID.bodyIdMax), j3);
                                            }
                                        }
                                        BasicTextKt$$ExternalSyntheticLambda14 basicTextKt$$ExternalSyntheticLambda14 = new BasicTextKt$$ExternalSyntheticLambda14(6);
                                        int m1033constrainWidthK40F9xA = ConstraintsKt.m1033constrainWidthK40F9xA(m1027getMinWidthimpl + i13, j);
                                        int m1032constrainHeightK40F9xA = ConstraintsKt.m1032constrainHeightK40F9xA(m1026getMinHeightimpl + i12, j);
                                        EmptyMap emptyMap = EmptyMap.INSTANCE;
                                        emptyMap.getClass();
                                        lazyGridState4 = lazyGridState5;
                                        subcomposeMeasureScope = subcomposeMeasureScope2;
                                        lazyGridMeasureResult = new LazyGridMeasureResult(null, 0, false, RecyclerView.DECELERATION_RATE, subcomposeMeasureScope2.layout(m1033constrainWidthK40F9xA, m1032constrainHeightK40F9xA, emptyMap, basicTextKt$$ExternalSyntheticLambda14), RecyclerView.DECELERATION_RATE, false, coroutineScope22, lazyLayoutMeasureScopeImpl, length, clickableKt$$ExternalSyntheticLambda0, objectList$$ExternalSyntheticLambda0, EmptyList.INSTANCE, -i15, m1024getMaxHeightimpl + i35, 0, orientation2, i35, mo230roundToPx0680j_45);
                                    } else {
                                        subcomposeMeasureScope = subcomposeMeasureScope2;
                                        lazyGridState4 = lazyGridState5;
                                        LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$12;
                                        long j4 = j2;
                                        ObjectList$$ExternalSyntheticLambda0 objectList$$ExternalSyntheticLambda03 = objectList$$ExternalSyntheticLambda0;
                                        int i39 = i15;
                                        int round = Math.round(f32);
                                        int i40 = intValue - round;
                                        if (i382 == 0 && i40 < 0) {
                                            round += i40;
                                            i40 = 0;
                                        }
                                        ArrayDeque arrayDeque = new ArrayDeque();
                                        int i41 = -i39;
                                        int i42 = i41 + (mo230roundToPx0680j_45 < 0 ? mo230roundToPx0680j_45 : 0);
                                        int i43 = i40 + i42;
                                        while (i43 < 0 && i382 > 0) {
                                            int i44 = i41;
                                            int i45 = i382 - 1;
                                            LazyGridMeasuredLine andMeasure = lruArrayPool.getAndMeasure(i45);
                                            i382 = i45;
                                            arrayDeque.add(0, andMeasure);
                                            i43 += andMeasure.mainAxisSizeWithSpacings;
                                            i41 = i44;
                                        }
                                        int i46 = i41;
                                        if (i43 < i42) {
                                            round -= i42 - i43;
                                            i43 = i42;
                                        }
                                        int i47 = round;
                                        int i48 = i43 - i42;
                                        int i49 = m1024getMaxHeightimpl + i35;
                                        int i50 = i49 >= 0 ? i49 : 0;
                                        int i51 = -i48;
                                        int i52 = i48;
                                        int i53 = i382;
                                        int i54 = 0;
                                        boolean z11 = false;
                                        while (i54 < arrayDeque.size) {
                                            if (i51 >= i50) {
                                                arrayDeque.removeAt(i54);
                                                z11 = true;
                                            } else {
                                                i53++;
                                                i51 += ((LazyGridMeasuredLine) arrayDeque.get(i54)).mainAxisSizeWithSpacings;
                                                i54++;
                                            }
                                        }
                                        boolean z12 = z11;
                                        int i55 = i53;
                                        while (i55 < i37 && (i51 < i50 || i51 <= 0 || arrayDeque.isEmpty())) {
                                            int i56 = i50;
                                            LazyGridMeasuredLine andMeasure2 = lruArrayPool.getAndMeasure(i55);
                                            z8 = z12;
                                            int i57 = andMeasure2.mainAxisSizeWithSpacings;
                                            LazyGridMeasuredItem[] lazyGridMeasuredItemArr = andMeasure2.items;
                                            int i58 = i55;
                                            if (lazyGridMeasuredItemArr.length == 0) {
                                                break;
                                            }
                                            i51 += i57;
                                            if (i51 > i42 || ((LazyGridMeasuredItem) ArraysKt___ArraysKt.last(lazyGridMeasuredItemArr)).index == i37 - 1) {
                                                arrayDeque.addLast(andMeasure2);
                                                z12 = z8;
                                            } else {
                                                i52 -= i57;
                                                i382 = i58 + 1;
                                                z12 = true;
                                            }
                                            i55 = i58 + 1;
                                            i50 = i56;
                                        }
                                        z8 = z12;
                                        if (i51 < m1024getMaxHeightimpl) {
                                            int i59 = m1024getMaxHeightimpl - i51;
                                            int i60 = i51 + i59;
                                            i17 = i52 - i59;
                                            while (i17 < i39 && i382 > 0) {
                                                int i61 = i382 - 1;
                                                int i62 = i60;
                                                LazyGridMeasuredLine andMeasure3 = lruArrayPool.getAndMeasure(i61);
                                                arrayDeque.add(0, andMeasure3);
                                                i17 += andMeasure3.mainAxisSizeWithSpacings;
                                                i60 = i62;
                                                i59 = i59;
                                                i382 = i61;
                                            }
                                            int i63 = i60;
                                            i16 = i47 + i59;
                                            if (i17 < 0) {
                                                i16 += i17;
                                                i51 = i63 + i17;
                                                i17 = 0;
                                            } else {
                                                i51 = i63;
                                            }
                                        } else {
                                            i16 = i47;
                                            i17 = i52;
                                        }
                                        float f4 = (Integer.signum(Math.round(f32)) != Integer.signum(i16) || Math.abs(Math.round(f32)) < Math.abs(i16)) ? f32 : i16;
                                        float f5 = f32 - f4;
                                        float f6 = RecyclerView.DECELERATION_RATE;
                                        if (isLookingAhead2 && i16 > i47 && f5 <= RecyclerView.DECELERATION_RATE) {
                                            f6 = (i16 - i47) + f5;
                                        }
                                        float f7 = f6;
                                        if (i17 < 0) {
                                            InlineClassHelperKt.throwIllegalArgumentException("negative initial offset");
                                        }
                                        int i64 = -i17;
                                        LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque.firstOrNull();
                                        int i65 = (lazyGridMeasuredLine2 == null || (lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt___ArraysKt.firstOrNull(lazyGridMeasuredLine2.items)) == null) ? 0 : lazyGridMeasuredItem2.index;
                                        int i66 = i17;
                                        LazyGridMeasuredLine lazyGridMeasuredLine3 = (LazyGridMeasuredLine) arrayDeque.lastOrNull();
                                        if (lazyGridMeasuredLine3 != null) {
                                            LazyGridMeasuredItem[] lazyGridMeasuredItemArr2 = lazyGridMeasuredLine3.items;
                                            i18 = i64;
                                            LazyGridMeasuredItem lazyGridMeasuredItem3 = lazyGridMeasuredItemArr2.length == 0 ? null : lazyGridMeasuredItemArr2[lazyGridMeasuredItemArr2.length - 1];
                                            if (lazyGridMeasuredItem3 != null) {
                                                i19 = lazyGridMeasuredItem3.index;
                                                List list72 = calculateLazyLayoutPinnedIndices2;
                                                size = list72.size();
                                                list = null;
                                                i20 = 0;
                                                while (i20 < size) {
                                                    int i67 = size;
                                                    int intValue3 = ((Number) calculateLazyLayoutPinnedIndices2.get(i20)).intValue();
                                                    if (intValue3 < 0 || intValue3 >= i65) {
                                                        i32 = i65;
                                                        lazyGridSpanLayoutProvider2 = lazyGridSpanLayoutProvider6;
                                                        i33 = i20;
                                                    } else {
                                                        i32 = i65;
                                                        lazyGridSpanLayoutProvider2 = lazyGridSpanLayoutProvider6;
                                                        i33 = i20;
                                                        int i68 = lazyGridSpanLayoutProvider2.slotsPerLine;
                                                        int spanOf = lazyGridSpanLayoutProvider2.spanOf(intValue3);
                                                        LazyGridMeasuredItem m316getAndMeasurem8Kt_7k = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13.m316getAndMeasurem8Kt_7k(intValue3, 0, spanOf, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13.defaultMainAxisSpacing, lruArrayPool.m1910childConstraintsJhjzzOo$foundation(0, spanOf));
                                                        List arrayList2 = list == null ? new ArrayList() : list;
                                                        arrayList2.add(m316getAndMeasurem8Kt_7k);
                                                        list = arrayList2;
                                                    }
                                                    i20 = i33 + 1;
                                                    lazyGridSpanLayoutProvider6 = lazyGridSpanLayoutProvider2;
                                                    size = i67;
                                                    i65 = i32;
                                                }
                                                int i692 = i65;
                                                LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider72 = lazyGridSpanLayoutProvider6;
                                                if (list == null) {
                                                    list = EmptyList.INSTANCE;
                                                }
                                                List list82 = list;
                                                if (isLookingAhead2 && lazyGridMeasureResult22 != null) {
                                                    list5 = lazyGridMeasureResult22.visibleItemsInfo;
                                                    if (!list5.isEmpty()) {
                                                        f = f4;
                                                        for (int size5 = list5.size() - 1; -1 < size5; size5--) {
                                                            if (((LazyGridMeasuredItem) list5.get(size5)).index > i19 && (size5 == 0 || ((LazyGridMeasuredItem) list5.get(size5 - 1)).index <= i19)) {
                                                                lazyGridMeasuredItem = (LazyGridMeasuredItem) list5.get(size5);
                                                                break;
                                                            }
                                                        }
                                                        lazyGridMeasuredItem = null;
                                                        LazyGridMeasuredItem lazyGridMeasuredItem4 = (LazyGridMeasuredItem) CollectionsKt.last(list5);
                                                        LazyGridMeasuredLine lazyGridMeasuredLine4 = (LazyGridMeasuredLine) CollectionsKt.lastOrNull((List) arrayDeque);
                                                        int i70 = lazyGridMeasuredLine4 != null ? lazyGridMeasuredLine4.index + 1 : 0;
                                                        if (lazyGridMeasuredItem != null) {
                                                            int i71 = lazyGridMeasuredItem.index;
                                                            i21 = i19;
                                                            int min = Math.min(lazyGridMeasuredItem4.index, i37 - 1);
                                                            if (i71 <= min) {
                                                                list3 = null;
                                                                while (true) {
                                                                    list2 = list82;
                                                                    if (list3 != null) {
                                                                        int size6 = list3.size();
                                                                        int i72 = 0;
                                                                        while (i72 < size6) {
                                                                            int i73 = size6;
                                                                            LazyGridMeasuredItem[] lazyGridMeasuredItemArr3 = ((LazyGridMeasuredLine) list3.get(i72)).items;
                                                                            List list9 = list3;
                                                                            int length2 = lazyGridMeasuredItemArr3.length;
                                                                            int i74 = 0;
                                                                            while (i74 < length2) {
                                                                                int i75 = i74;
                                                                                if (lazyGridMeasuredItemArr3[i75].index == i71) {
                                                                                    list3 = list9;
                                                                                    break;
                                                                                }
                                                                                i74 = i75 + 1;
                                                                            }
                                                                            i72++;
                                                                            list3 = list9;
                                                                            size6 = i73;
                                                                        }
                                                                    }
                                                                    List list10 = list3;
                                                                    list3 = list10 == null ? new ArrayList() : list10;
                                                                    LazyGridMeasuredLine andMeasure4 = lruArrayPool.getAndMeasure(i70);
                                                                    i70++;
                                                                    list3.add(andMeasure4);
                                                                    if (i71 == min) {
                                                                        break;
                                                                    }
                                                                    i71++;
                                                                    list82 = list2;
                                                                }
                                                                if (list3 == null) {
                                                                    list3 = EmptyList.INSTANCE;
                                                                }
                                                                size2 = list72.size();
                                                                i22 = 0;
                                                                while (i22 < size2) {
                                                                    int intValue4 = ((Number) calculateLazyLayoutPinnedIndices2.get(i22)).intValue();
                                                                    if (i21 + 1 > intValue4 || intValue4 >= i37) {
                                                                        list4 = calculateLazyLayoutPinnedIndices2;
                                                                        i31 = i37;
                                                                    } else {
                                                                        if (isLookingAhead2) {
                                                                            int size7 = list3.size();
                                                                            int i76 = 0;
                                                                            while (i76 < size7) {
                                                                                list4 = calculateLazyLayoutPinnedIndices2;
                                                                                LazyGridMeasuredItem[] lazyGridMeasuredItemArr4 = ((LazyGridMeasuredLine) list3.get(i76)).items;
                                                                                i31 = i37;
                                                                                int length3 = lazyGridMeasuredItemArr4.length;
                                                                                int i77 = 0;
                                                                                while (i77 < length3) {
                                                                                    int i78 = i77;
                                                                                    if (lazyGridMeasuredItemArr4[i78].index != intValue4) {
                                                                                        i77 = i78 + 1;
                                                                                    }
                                                                                }
                                                                                i76++;
                                                                                calculateLazyLayoutPinnedIndices2 = list4;
                                                                                i37 = i31;
                                                                            }
                                                                        }
                                                                        list4 = calculateLazyLayoutPinnedIndices2;
                                                                        i31 = i37;
                                                                        int i79 = lazyGridSpanLayoutProvider72.slotsPerLine;
                                                                        int spanOf2 = lazyGridSpanLayoutProvider72.spanOf(intValue4);
                                                                        LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$14 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13;
                                                                        LazyGridMeasuredItem m316getAndMeasurem8Kt_7k2 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$14.m316getAndMeasurem8Kt_7k(intValue4, 0, spanOf2, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13.defaultMainAxisSpacing, lruArrayPool.m1910childConstraintsJhjzzOo$foundation(0, spanOf2));
                                                                        lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$14;
                                                                        if (list6 == null) {
                                                                            list6 = new ArrayList();
                                                                        }
                                                                        List list11 = list6;
                                                                        list11.add(m316getAndMeasurem8Kt_7k2);
                                                                        list6 = list11;
                                                                        i22++;
                                                                        lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;
                                                                        calculateLazyLayoutPinnedIndices2 = list4;
                                                                        i37 = i31;
                                                                    }
                                                                    lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13;
                                                                    i22++;
                                                                    lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;
                                                                    calculateLazyLayoutPinnedIndices2 = list4;
                                                                    i37 = i31;
                                                                }
                                                                i23 = i37;
                                                                LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$15222 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13;
                                                                if (list6 == null) {
                                                                    list6 = EmptyList.INSTANCE;
                                                                }
                                                                List list12222 = list6;
                                                                if (i39 <= 0 || mo230roundToPx0680j_45 < 0) {
                                                                    size3 = arrayDeque.getSize();
                                                                    int i80222 = i66;
                                                                    lazyGridMeasuredLine = lazyGridMeasuredLine2;
                                                                    i24 = 0;
                                                                    while (i24 < size3) {
                                                                        int i81 = ((LazyGridMeasuredLine) arrayDeque.get(i24)).mainAxisSizeWithSpacings;
                                                                        if (i80222 == 0 || i81 > i80222 || i24 == arrayDeque.getSize() - 1) {
                                                                            break;
                                                                        }
                                                                        i80222 -= i81;
                                                                        i24++;
                                                                        lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayDeque.get(i24);
                                                                    }
                                                                    i25 = i80222;
                                                                } else {
                                                                    i25 = i66;
                                                                    lazyGridMeasuredLine = lazyGridMeasuredLine2;
                                                                }
                                                                int m1025getMaxWidthimpl222 = Constraints.m1025getMaxWidthimpl(j4);
                                                                int m1032constrainHeightK40F9xA2222 = ConstraintsKt.m1032constrainHeightK40F9xA(i51, j4);
                                                                List list13222 = arrayDeque;
                                                                if (!list3.isEmpty()) {
                                                                    list13222 = CollectionsKt.plus((Iterable) list3, (Collection) arrayDeque);
                                                                }
                                                                z9 = i51 >= Math.min(m1032constrainHeightK40F9xA2222, m1024getMaxHeightimpl);
                                                                if (z9 && i18 != 0) {
                                                                    InlineClassHelperKt.throwIllegalStateException("non-zero firstLineScrollOffset");
                                                                }
                                                                size4 = list13222.size();
                                                                int i82222 = 0;
                                                                for (i26 = 0; i26 < size4; i26++) {
                                                                    i82222 += ((LazyGridMeasuredLine) list13222.get(i26)).items.length;
                                                                }
                                                                ArrayList arrayList3222 = new ArrayList(i82222);
                                                                if (z9) {
                                                                    i27 = i51;
                                                                    int size8 = list2.size() - 1;
                                                                    if (size8 >= 0) {
                                                                        int i83 = i18;
                                                                        while (true) {
                                                                            int i84 = size8 - 1;
                                                                            List list14 = list2;
                                                                            LazyGridMeasuredItem lazyGridMeasuredItem5 = (LazyGridMeasuredItem) list14.get(size8);
                                                                            i28 = i25;
                                                                            i83 -= lazyGridMeasuredItem5.mainAxisSizeWithSpacings;
                                                                            lazyGridMeasuredItem5.position(i83, 0, m1025getMaxWidthimpl222, m1032constrainHeightK40F9xA2222);
                                                                            arrayList3222.add(lazyGridMeasuredItem5);
                                                                            if (i84 < 0) {
                                                                                break;
                                                                            }
                                                                            size8 = i84;
                                                                            list2 = list14;
                                                                            i25 = i28;
                                                                        }
                                                                    } else {
                                                                        i28 = i25;
                                                                    }
                                                                    int size9 = list13222.size();
                                                                    int i85 = i18;
                                                                    int i86 = 0;
                                                                    List list15 = list13222;
                                                                    while (i86 < size9) {
                                                                        LazyGridMeasuredLine lazyGridMeasuredLine5 = (LazyGridMeasuredLine) list15.get(i86);
                                                                        LazyGridMeasuredItem[] position = lazyGridMeasuredLine5.position(i85, m1025getMaxWidthimpl222, m1032constrainHeightK40F9xA2222);
                                                                        int i87 = size9;
                                                                        List list16 = list15;
                                                                        int i88 = 0;
                                                                        for (int length4 = position.length; i88 < length4; length4 = length4) {
                                                                            arrayList3222.add(position[i88]);
                                                                            i88++;
                                                                        }
                                                                        i85 += lazyGridMeasuredLine5.mainAxisSizeWithSpacings;
                                                                        i86++;
                                                                        size9 = i87;
                                                                        list15 = list16;
                                                                    }
                                                                    int size10 = list12222.size();
                                                                    for (int i89 = 0; i89 < size10; i89++) {
                                                                        LazyGridMeasuredItem lazyGridMeasuredItem6 = (LazyGridMeasuredItem) list12222.get(i89);
                                                                        lazyGridMeasuredItem6.position(i85, 0, m1025getMaxWidthimpl222, m1032constrainHeightK40F9xA2222);
                                                                        arrayList3222.add(lazyGridMeasuredItem6);
                                                                        i85 += lazyGridMeasuredItem6.mainAxisSizeWithSpacings;
                                                                    }
                                                                    f2 = f;
                                                                } else {
                                                                    if (!list2.isEmpty() || !list12222.isEmpty()) {
                                                                        InlineClassHelperKt.throwIllegalArgumentException("no items");
                                                                    }
                                                                    int size11 = list13222.size();
                                                                    int[] iArr = new int[size11];
                                                                    for (int i90 = 0; i90 < size11; i90++) {
                                                                        iArr[i90] = ((LazyGridMeasuredLine) list13222.get(i90)).mainAxisSize;
                                                                    }
                                                                    int[] iArr2 = new int[size11];
                                                                    if (arrangement$Vertical2 == null) {
                                                                        throw Recorder$$ExternalSyntheticOutline2.m("null verticalArrangement");
                                                                    }
                                                                    arrangement$Vertical2.arrange(lazyLayoutMeasureScopeImpl, m1032constrainHeightK40F9xA2222, iArr, iArr2);
                                                                    IntRange indices = ArraysKt___ArraysKt.getIndices(iArr2);
                                                                    int i91 = indices.last;
                                                                    int i92 = indices.step;
                                                                    if ((i92 > 0 && i91 >= 0) || (i92 < 0 && i91 <= 0)) {
                                                                        i27 = i51;
                                                                        int i93 = 0;
                                                                        while (true) {
                                                                            int[] iArr3 = iArr2;
                                                                            LazyGridMeasuredItem[] position2 = ((LazyGridMeasuredLine) list13222.get(i93)).position(iArr2[i93], m1025getMaxWidthimpl222, m1032constrainHeightK40F9xA2222);
                                                                            int length5 = position2.length;
                                                                            int i94 = 0;
                                                                            while (i94 < length5) {
                                                                                int i95 = i94;
                                                                                arrayList3222.add(position2[i95]);
                                                                                i94 = i95 + 1;
                                                                            }
                                                                            if (i93 == i91) {
                                                                                break;
                                                                            }
                                                                            i93 += i92;
                                                                            iArr2 = iArr3;
                                                                        }
                                                                    } else {
                                                                        i27 = i51;
                                                                    }
                                                                    i28 = i25;
                                                                    f2 = f;
                                                                }
                                                                i29 = i27;
                                                                lazyLayoutItemAnimator2.onMeasured((int) f2, m1025getMaxWidthimpl222, m1032constrainHeightK40F9xA2222, arrayList3222, lazyGridItemProviderImpl42.keyIndexMap, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$15222, true, isLookingAhead2, length, z10, i28, i29, coroutineScope22, graphicsContext22);
                                                                if (!isLookingAhead2) {
                                                                    long m321getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator2.m321getMinSizeToFitDisappearingItemsYbymL2g();
                                                                    if (!IntSize.m1055equalsimpl0(m321getMinSizeToFitDisappearingItemsYbymL2g2, 0L)) {
                                                                        m1025getMaxWidthimpl222 = ConstraintsKt.m1033constrainWidthK40F9xA(Math.max(m1025getMaxWidthimpl222, (int) (m321getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)), j4);
                                                                        int m1032constrainHeightK40F9xA3 = ConstraintsKt.m1032constrainHeightK40F9xA(Math.max(m1032constrainHeightK40F9xA2222, (int) (m321getMinSizeToFitDisappearingItemsYbymL2g2 & BodyPartID.bodyIdMax)), j4);
                                                                        if (m1032constrainHeightK40F9xA3 != m1032constrainHeightK40F9xA2222) {
                                                                            int size12 = arrayList3222.size();
                                                                            for (int i96 = 0; i96 < size12; i96++) {
                                                                                LazyGridMeasuredItem lazyGridMeasuredItem7 = (LazyGridMeasuredItem) arrayList3222.get(i96);
                                                                                lazyGridMeasuredItem7.mainAxisLayoutSize = m1032constrainHeightK40F9xA3;
                                                                                lazyGridMeasuredItem7.maxMainAxisOffset = lazyGridMeasuredItem7.afterContentPadding + m1032constrainHeightK40F9xA3;
                                                                            }
                                                                        }
                                                                        i30 = m1032constrainHeightK40F9xA3;
                                                                        int i972222 = m1025getMaxWidthimpl222;
                                                                        lazyGridItemProviderImpl42.intervalContent.getClass();
                                                                        int i982222 = i21;
                                                                        List applyStickyItems2222 = LazyLayoutKt.applyStickyItems(this.$stickyItemsScrollBehavior, i692, i982222, arrayList3222, IntListKt.EmptyIntList, i39, i972222, i30, new ClickableKt$$ExternalSyntheticLambda0(23, lruArrayPool, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$15222));
                                                                        boolean z13 = i982222 == i23 + (-1) || i29 > m1024getMaxHeightimpl;
                                                                        LazyListMeasureKt$$ExternalSyntheticLambda2 lazyListMeasureKt$$ExternalSyntheticLambda22222 = new LazyListMeasureKt$$ExternalSyntheticLambda2(mutableState2, arrayList3222, applyStickyItems2222, isLookingAhead2, 1);
                                                                        int m1033constrainWidthK40F9xA22222 = ConstraintsKt.m1033constrainWidthK40F9xA(i972222 + i13, j);
                                                                        int m1032constrainHeightK40F9xA42222 = ConstraintsKt.m1032constrainHeightK40F9xA(i30 + i12, j);
                                                                        EmptyMap emptyMap22222 = EmptyMap.INSTANCE;
                                                                        emptyMap22222.getClass();
                                                                        lazyGridMeasureResult = new LazyGridMeasureResult(lazyGridMeasuredLine, i28, z13, f2, subcomposeMeasureScope.layout(m1033constrainWidthK40F9xA22222, m1032constrainHeightK40F9xA42222, emptyMap22222, lazyListMeasureKt$$ExternalSyntheticLambda22222), f7, z8, coroutineScope22, lazyLayoutMeasureScopeImpl, length, clickableKt$$ExternalSyntheticLambda0, objectList$$ExternalSyntheticLambda03, LazyLayoutKt.updatedVisibleItems(i692, i982222, arrayList3222, applyStickyItems2222), i46, i49, i23, Orientation.Vertical, i35, mo230roundToPx0680j_45);
                                                                    }
                                                                }
                                                                i30 = m1032constrainHeightK40F9xA2222;
                                                                int i9722222 = m1025getMaxWidthimpl222;
                                                                lazyGridItemProviderImpl42.intervalContent.getClass();
                                                                int i9822222 = i21;
                                                                List applyStickyItems22222 = LazyLayoutKt.applyStickyItems(this.$stickyItemsScrollBehavior, i692, i9822222, arrayList3222, IntListKt.EmptyIntList, i39, i9722222, i30, new ClickableKt$$ExternalSyntheticLambda0(23, lruArrayPool, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$15222));
                                                                if (i9822222 == i23 + (-1)) {
                                                                }
                                                                LazyListMeasureKt$$ExternalSyntheticLambda2 lazyListMeasureKt$$ExternalSyntheticLambda222222 = new LazyListMeasureKt$$ExternalSyntheticLambda2(mutableState2, arrayList3222, applyStickyItems22222, isLookingAhead2, 1);
                                                                int m1033constrainWidthK40F9xA222222 = ConstraintsKt.m1033constrainWidthK40F9xA(i9722222 + i13, j);
                                                                int m1032constrainHeightK40F9xA422222 = ConstraintsKt.m1032constrainHeightK40F9xA(i30 + i12, j);
                                                                EmptyMap emptyMap222222 = EmptyMap.INSTANCE;
                                                                emptyMap222222.getClass();
                                                                lazyGridMeasureResult = new LazyGridMeasureResult(lazyGridMeasuredLine, i28, z13, f2, subcomposeMeasureScope.layout(m1033constrainWidthK40F9xA222222, m1032constrainHeightK40F9xA422222, emptyMap222222, lazyListMeasureKt$$ExternalSyntheticLambda222222), f7, z8, coroutineScope22, lazyLayoutMeasureScopeImpl, length, clickableKt$$ExternalSyntheticLambda0, objectList$$ExternalSyntheticLambda03, LazyLayoutKt.updatedVisibleItems(i692, i9822222, arrayList3222, applyStickyItems22222), i46, i49, i23, Orientation.Vertical, i35, mo230roundToPx0680j_45);
                                                            }
                                                        } else {
                                                            i21 = i19;
                                                        }
                                                        list2 = list82;
                                                        list3 = null;
                                                        if (list3 == null) {
                                                        }
                                                        size2 = list72.size();
                                                        i22 = 0;
                                                        while (i22 < size2) {
                                                        }
                                                        i23 = i37;
                                                        LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$152222 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13;
                                                        if (list6 == null) {
                                                        }
                                                        List list122222 = list6;
                                                        if (i39 <= 0) {
                                                        }
                                                        size3 = arrayDeque.getSize();
                                                        int i802222 = i66;
                                                        lazyGridMeasuredLine = lazyGridMeasuredLine2;
                                                        i24 = 0;
                                                        while (i24 < size3) {
                                                        }
                                                        i25 = i802222;
                                                        int m1025getMaxWidthimpl2222 = Constraints.m1025getMaxWidthimpl(j4);
                                                        int m1032constrainHeightK40F9xA22222 = ConstraintsKt.m1032constrainHeightK40F9xA(i51, j4);
                                                        List list132222 = arrayDeque;
                                                        if (!list3.isEmpty()) {
                                                        }
                                                        if (i51 >= Math.min(m1032constrainHeightK40F9xA22222, m1024getMaxHeightimpl)) {
                                                        }
                                                        if (z9) {
                                                            InlineClassHelperKt.throwIllegalStateException("non-zero firstLineScrollOffset");
                                                        }
                                                        size4 = list132222.size();
                                                        int i822222 = 0;
                                                        while (i26 < size4) {
                                                        }
                                                        ArrayList arrayList32222 = new ArrayList(i822222);
                                                        if (z9) {
                                                        }
                                                        i29 = i27;
                                                        lazyLayoutItemAnimator2.onMeasured((int) f2, m1025getMaxWidthimpl2222, m1032constrainHeightK40F9xA22222, arrayList32222, lazyGridItemProviderImpl42.keyIndexMap, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$152222, true, isLookingAhead2, length, z10, i28, i29, coroutineScope22, graphicsContext22);
                                                        if (!isLookingAhead2) {
                                                        }
                                                        i30 = m1032constrainHeightK40F9xA22222;
                                                        int i97222222 = m1025getMaxWidthimpl2222;
                                                        lazyGridItemProviderImpl42.intervalContent.getClass();
                                                        int i98222222 = i21;
                                                        List applyStickyItems222222 = LazyLayoutKt.applyStickyItems(this.$stickyItemsScrollBehavior, i692, i98222222, arrayList32222, IntListKt.EmptyIntList, i39, i97222222, i30, new ClickableKt$$ExternalSyntheticLambda0(23, lruArrayPool, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$152222));
                                                        if (i98222222 == i23 + (-1)) {
                                                        }
                                                        LazyListMeasureKt$$ExternalSyntheticLambda2 lazyListMeasureKt$$ExternalSyntheticLambda2222222 = new LazyListMeasureKt$$ExternalSyntheticLambda2(mutableState2, arrayList32222, applyStickyItems222222, isLookingAhead2, 1);
                                                        int m1033constrainWidthK40F9xA2222222 = ConstraintsKt.m1033constrainWidthK40F9xA(i97222222 + i13, j);
                                                        int m1032constrainHeightK40F9xA4222222 = ConstraintsKt.m1032constrainHeightK40F9xA(i30 + i12, j);
                                                        EmptyMap emptyMap2222222 = EmptyMap.INSTANCE;
                                                        emptyMap2222222.getClass();
                                                        lazyGridMeasureResult = new LazyGridMeasureResult(lazyGridMeasuredLine, i28, z13, f2, subcomposeMeasureScope.layout(m1033constrainWidthK40F9xA2222222, m1032constrainHeightK40F9xA4222222, emptyMap2222222, lazyListMeasureKt$$ExternalSyntheticLambda2222222), f7, z8, coroutineScope22, lazyLayoutMeasureScopeImpl, length, clickableKt$$ExternalSyntheticLambda0, objectList$$ExternalSyntheticLambda03, LazyLayoutKt.updatedVisibleItems(i692, i98222222, arrayList32222, applyStickyItems222222), i46, i49, i23, Orientation.Vertical, i35, mo230roundToPx0680j_45);
                                                    }
                                                }
                                                i21 = i19;
                                                f = f4;
                                                list2 = list82;
                                                list3 = null;
                                                if (list3 == null) {
                                                }
                                                size2 = list72.size();
                                                i22 = 0;
                                                while (i22 < size2) {
                                                }
                                                i23 = i37;
                                                LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1522222 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13;
                                                if (list6 == null) {
                                                }
                                                List list1222222 = list6;
                                                if (i39 <= 0) {
                                                }
                                                size3 = arrayDeque.getSize();
                                                int i8022222 = i66;
                                                lazyGridMeasuredLine = lazyGridMeasuredLine2;
                                                i24 = 0;
                                                while (i24 < size3) {
                                                }
                                                i25 = i8022222;
                                                int m1025getMaxWidthimpl22222 = Constraints.m1025getMaxWidthimpl(j4);
                                                int m1032constrainHeightK40F9xA222222 = ConstraintsKt.m1032constrainHeightK40F9xA(i51, j4);
                                                List list1322222 = arrayDeque;
                                                if (!list3.isEmpty()) {
                                                }
                                                if (i51 >= Math.min(m1032constrainHeightK40F9xA222222, m1024getMaxHeightimpl)) {
                                                }
                                                if (z9) {
                                                }
                                                size4 = list1322222.size();
                                                int i8222222 = 0;
                                                while (i26 < size4) {
                                                }
                                                ArrayList arrayList322222 = new ArrayList(i8222222);
                                                if (z9) {
                                                }
                                                i29 = i27;
                                                lazyLayoutItemAnimator2.onMeasured((int) f2, m1025getMaxWidthimpl22222, m1032constrainHeightK40F9xA222222, arrayList322222, lazyGridItemProviderImpl42.keyIndexMap, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1522222, true, isLookingAhead2, length, z10, i28, i29, coroutineScope22, graphicsContext22);
                                                if (!isLookingAhead2) {
                                                }
                                                i30 = m1032constrainHeightK40F9xA222222;
                                                int i972222222 = m1025getMaxWidthimpl22222;
                                                lazyGridItemProviderImpl42.intervalContent.getClass();
                                                int i982222222 = i21;
                                                List applyStickyItems2222222 = LazyLayoutKt.applyStickyItems(this.$stickyItemsScrollBehavior, i692, i982222222, arrayList322222, IntListKt.EmptyIntList, i39, i972222222, i30, new ClickableKt$$ExternalSyntheticLambda0(23, lruArrayPool, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1522222));
                                                if (i982222222 == i23 + (-1)) {
                                                }
                                                LazyListMeasureKt$$ExternalSyntheticLambda2 lazyListMeasureKt$$ExternalSyntheticLambda22222222 = new LazyListMeasureKt$$ExternalSyntheticLambda2(mutableState2, arrayList322222, applyStickyItems2222222, isLookingAhead2, 1);
                                                int m1033constrainWidthK40F9xA22222222 = ConstraintsKt.m1033constrainWidthK40F9xA(i972222222 + i13, j);
                                                int m1032constrainHeightK40F9xA42222222 = ConstraintsKt.m1032constrainHeightK40F9xA(i30 + i12, j);
                                                EmptyMap emptyMap22222222 = EmptyMap.INSTANCE;
                                                emptyMap22222222.getClass();
                                                lazyGridMeasureResult = new LazyGridMeasureResult(lazyGridMeasuredLine, i28, z13, f2, subcomposeMeasureScope.layout(m1033constrainWidthK40F9xA22222222, m1032constrainHeightK40F9xA42222222, emptyMap22222222, lazyListMeasureKt$$ExternalSyntheticLambda22222222), f7, z8, coroutineScope22, lazyLayoutMeasureScopeImpl, length, clickableKt$$ExternalSyntheticLambda0, objectList$$ExternalSyntheticLambda03, LazyLayoutKt.updatedVisibleItems(i692, i982222222, arrayList322222, applyStickyItems2222222), i46, i49, i23, Orientation.Vertical, i35, mo230roundToPx0680j_45);
                                            }
                                        } else {
                                            i18 = i64;
                                        }
                                        i19 = 0;
                                        List list722 = calculateLazyLayoutPinnedIndices2;
                                        size = list722.size();
                                        list = null;
                                        i20 = 0;
                                        while (i20 < size) {
                                        }
                                        int i6922 = i65;
                                        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider722 = lazyGridSpanLayoutProvider6;
                                        if (list == null) {
                                        }
                                        List list822 = list;
                                        if (isLookingAhead2) {
                                            list5 = lazyGridMeasureResult22.visibleItemsInfo;
                                            if (!list5.isEmpty()) {
                                            }
                                        }
                                        i21 = i19;
                                        f = f4;
                                        list2 = list822;
                                        list3 = null;
                                        if (list3 == null) {
                                        }
                                        size2 = list722.size();
                                        i22 = 0;
                                        while (i22 < size2) {
                                        }
                                        i23 = i37;
                                        LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$15222222 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$13;
                                        if (list6 == null) {
                                        }
                                        List list12222222 = list6;
                                        if (i39 <= 0) {
                                        }
                                        size3 = arrayDeque.getSize();
                                        int i80222222 = i66;
                                        lazyGridMeasuredLine = lazyGridMeasuredLine2;
                                        i24 = 0;
                                        while (i24 < size3) {
                                        }
                                        i25 = i80222222;
                                        int m1025getMaxWidthimpl222222 = Constraints.m1025getMaxWidthimpl(j4);
                                        int m1032constrainHeightK40F9xA2222222 = ConstraintsKt.m1032constrainHeightK40F9xA(i51, j4);
                                        List list13222222 = arrayDeque;
                                        if (!list3.isEmpty()) {
                                        }
                                        if (i51 >= Math.min(m1032constrainHeightK40F9xA2222222, m1024getMaxHeightimpl)) {
                                        }
                                        if (z9) {
                                        }
                                        size4 = list13222222.size();
                                        int i82222222 = 0;
                                        while (i26 < size4) {
                                        }
                                        ArrayList arrayList3222222 = new ArrayList(i82222222);
                                        if (z9) {
                                        }
                                        i29 = i27;
                                        lazyLayoutItemAnimator2.onMeasured((int) f2, m1025getMaxWidthimpl222222, m1032constrainHeightK40F9xA2222222, arrayList3222222, lazyGridItemProviderImpl42.keyIndexMap, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$15222222, true, isLookingAhead2, length, z10, i28, i29, coroutineScope22, graphicsContext22);
                                        if (!isLookingAhead2) {
                                        }
                                        i30 = m1032constrainHeightK40F9xA2222222;
                                        int i9722222222 = m1025getMaxWidthimpl222222;
                                        lazyGridItemProviderImpl42.intervalContent.getClass();
                                        int i9822222222 = i21;
                                        List applyStickyItems22222222 = LazyLayoutKt.applyStickyItems(this.$stickyItemsScrollBehavior, i6922, i9822222222, arrayList3222222, IntListKt.EmptyIntList, i39, i9722222222, i30, new ClickableKt$$ExternalSyntheticLambda0(23, lruArrayPool, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$15222222));
                                        if (i9822222222 == i23 + (-1)) {
                                        }
                                        LazyListMeasureKt$$ExternalSyntheticLambda2 lazyListMeasureKt$$ExternalSyntheticLambda222222222 = new LazyListMeasureKt$$ExternalSyntheticLambda2(mutableState2, arrayList3222222, applyStickyItems22222222, isLookingAhead2, 1);
                                        int m1033constrainWidthK40F9xA222222222 = ConstraintsKt.m1033constrainWidthK40F9xA(i9722222222 + i13, j);
                                        int m1032constrainHeightK40F9xA422222222 = ConstraintsKt.m1032constrainHeightK40F9xA(i30 + i12, j);
                                        EmptyMap emptyMap222222222 = EmptyMap.INSTANCE;
                                        emptyMap222222222.getClass();
                                        lazyGridMeasureResult = new LazyGridMeasureResult(lazyGridMeasuredLine, i28, z13, f2, subcomposeMeasureScope.layout(m1033constrainWidthK40F9xA222222222, m1032constrainHeightK40F9xA422222222, emptyMap222222222, lazyListMeasureKt$$ExternalSyntheticLambda222222222), f7, z8, coroutineScope22, lazyLayoutMeasureScopeImpl, length, clickableKt$$ExternalSyntheticLambda0, objectList$$ExternalSyntheticLambda03, LazyLayoutKt.updatedVisibleItems(i6922, i9822222222, arrayList3222222, applyStickyItems22222222), i46, i49, i23, Orientation.Vertical, i35, mo230roundToPx0680j_45);
                                    }
                                    LazyGridState lazyGridState62 = lazyGridState4;
                                    lazyGridState62.applyMeasureResult$foundation(lazyGridMeasureResult, subcomposeMeasureScope.isLookingAhead(), false);
                                    DefaultLazyListPrefetchStrategy defaultLazyListPrefetchStrategy2 = lazyGridState62.prefetchStrategy;
                                    return lazyGridMeasureResult;
                                }
                                lineIndexOfItem = lazyGridSpanLayoutProvider4.getLineIndexOfItem(findIndexByKey);
                                intValue = lazyListScrollPosition.scrollOffset$delegate.getIntValue();
                                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, function12);
                                List calculateLazyLayoutPinnedIndices22 = LazyLayoutKt.calculateLazyLayoutPinnedIndices(lazyGridItemProviderImpl3, lazyGridState5.pinnedItems, lazyGridState5.beyondBoundsInfo);
                                if (subcomposeMeasureScope2.isLookingAhead()) {
                                }
                                LazyLayoutItemAnimator lazyLayoutItemAnimator22 = lazyGridState5.itemAnimator;
                                boolean isLookingAhead22 = subcomposeMeasureScope2.isLookingAhead();
                                LazyGridMeasureResult lazyGridMeasureResult222 = lazyGridState5.approachLayoutInfo;
                                MutableState mutableState22 = lazyGridState5.placementScopeInvalidator;
                                if (i15 < 0) {
                                }
                                if (i35 < 0) {
                                }
                                LazyGridItemProviderImpl lazyGridItemProviderImpl422 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$12.itemProvider;
                                CoroutineScope coroutineScope222 = this.$coroutineScope;
                                int i3822 = lineIndexOfItem;
                                GraphicsContext graphicsContext222 = this.$graphicsContext;
                                float f322 = floatValue;
                                if (i37 > 0) {
                                }
                                LazyGridState lazyGridState622 = lazyGridState4;
                                lazyGridState622.applyMeasureResult$foundation(lazyGridMeasureResult, subcomposeMeasureScope.isLookingAhead(), false);
                                DefaultLazyListPrefetchStrategy defaultLazyListPrefetchStrategy22 = lazyGridState622.prefetchStrategy;
                                return lazyGridMeasureResult;
                            } catch (Throwable th) {
                                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, function12);
                                throw th;
                            }
                        }
                    } else {
                        i11 = mo230roundToPx0680j_44;
                    }
                    gridSlotCache2.cachedConstraints = m1034offsetNN6EwU;
                    gridSlotCache2.cachedDensity = subcomposeMeasureScope2.getDensity();
                    TextKt$$ExternalSyntheticLambda0 textKt$$ExternalSyntheticLambda0 = gridSlotCache2.calculation;
                    GridCells gridCells = (GridCells) textKt$$ExternalSyntheticLambda0.f$0;
                    Arrangement$Horizontal arrangement$Horizontal2 = (Arrangement$Horizontal) textKt$$ExternalSyntheticLambda0.f$1;
                    if (Constraints.m1025getMaxWidthimpl(m1034offsetNN6EwU) == Integer.MAX_VALUE) {
                        InlineClassHelperKt.throwIllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
                    }
                    int m1025getMaxWidthimpl3 = Constraints.m1025getMaxWidthimpl(m1034offsetNN6EwU);
                    int[] intArray = CollectionsKt.toIntArray(gridCells.calculateCrossAxisCellSizes(lazyLayoutMeasureScopeImpl, m1025getMaxWidthimpl3, lazyLayoutMeasureScopeImpl.mo230roundToPx0680j_4(arrangement$Horizontal2.mo252getSpacingD9Ej5fM())));
                    int[] iArr4 = new int[intArray.length];
                    i12 = i11;
                    i13 = i34;
                    j2 = m1034offsetNN6EwU;
                    lazyGridItemProviderImpl = lazyGridItemProviderImpl2;
                    lazyGridSpanLayoutProvider = lazyGridSpanLayoutProvider3;
                    i14 = mo230roundToPx0680j_43;
                    arrangement$Horizontal2.arrange(lazyLayoutMeasureScopeImpl, m1025getMaxWidthimpl3, intArray, LayoutDirection.Ltr, iArr4);
                    anonymousClass4 = new Recorder.AnonymousClass4(intArray, iArr4, false, 15);
                    gridSlotCache2.cachedSizes = anonymousClass4;
                    Recorder.AnonymousClass4 anonymousClass4222 = anonymousClass4;
                    length = ((int[]) anonymousClass4222.val$audioErrorConsumer).length;
                    if (length == lazyGridSpanLayoutProvider.slotsPerLine) {
                    }
                    arrangement$Vertical2 = this.$verticalArrangement;
                    if (arrangement$Vertical2 != null) {
                    }
                }
            };
            kProperty0 = kProperty02;
            gapComposer2.updateRememberedValue(obj);
            LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy2 = (LazyLayoutMeasurePolicy) obj;
            Orientation orientation2 = Orientation.Vertical;
            if (z) {
            }
            lazyGridState2 = lazyGridState3;
            gapComposer = gapComposer2;
            LazyLayoutKt.LazyLayout(kProperty0, ImageKt.scrollableArea(LazyLayoutKt.lazyLayoutSemantics(modifier.then(lazyGridState3.remeasurementModifier).then(lazyGridState3.awaitLayoutModifier), kProperty0, lazySemanticsKt$rememberLazyGridSemanticState$1$1, orientation2, z).then(modifier2).then(lazyGridState3.itemAnimator.modifier), lazyGridState3, orientation2, androidEdgeEffectOverscrollEffect, z, flingBehavior, lazyGridState3.internalInteractionSource, null), lazyGridState2.prefetchState, lazyLayoutMeasurePolicy2, gapComposer, 0);
        } else {
            lazyGridState2 = lazyGridState;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LazyGridKt$$ExternalSyntheticLambda0(modifier, lazyGridState2, gridSlotCache, paddingValues, flingBehavior, z, androidEdgeEffectOverscrollEffect, arrangement$Vertical, arrangement$Horizontal, function1, i, i2);
        }
    }

    public static final TextStyle getLegacyTabTitle(Typography typography) {
        typography.getClass();
        FontFamily fontFamily = typography.sectionTitle.spanStyle.fontFamily;
        return new TextStyle(0L, Room.getSp(24), new FontWeight(600), fontFamily, Room.getSp(0.0d), 0L, 0, 0, Room.getSp(28), null, 16645977);
    }

    public static final Modifier titleBarIconBackground(Composer composer, Modifier modifier) {
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        long j = colors.semantic.background.standard;
        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier, 2.0f, RecyclerView.DECELERATION_RATE, 2);
        boolean changed = gapComposer.changed(j);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new c7$$ExternalSyntheticLambda6(j, 15);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return ClipKt.drawBehind(m300paddingVpY3zN4$default, (Function1) rememberedValue);
    }
}
