package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.camera.video.Recorder;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.CachedItem;
import androidx.compose.foundation.pager.PagerScrollScopeKt$LazyLayoutScrollScope$1;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda2;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.ThumbNode$$ExternalSyntheticLambda0;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.ng$$ExternalSyntheticLambda0;
import com.android.volley.Response;
import com.google.android.gms.dynamite.zzg;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KProperty0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.brotli.dec.HuffmanTreeGroup;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class LazyLayoutKt {
    public static final LazyLayoutItemAnimation[] EmptyArray = new LazyLayoutItemAnimation[0];
    public static final ng$$ExternalSyntheticLambda0 LazyLayoutMeasuredItemIndexComparator = new ng$$ExternalSyntheticLambda0(3);

    public static final void LazyLayout(final Function0 function0, final Modifier modifier, final LazyLayoutPrefetchState lazyLayoutPrefetchState, final LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, Composer composer, final int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1055276397);
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changed(lazyLayoutPrefetchState) ? 256 : 128) | (gapComposer.changed(lazyLayoutMeasurePolicy) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            final MutableState rememberUpdatedState = Updater.rememberUpdatedState(function0, gapComposer);
            LazySaveableStateHolderProvider(Expect_jvmKt.rememberComposableLambda(-933153643, new Function3() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Modifier then;
                    SaveableStateHolder saveableStateHolder = (SaveableStateHolder) obj;
                    ((Integer) obj3).getClass();
                    GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new TooltipKt$$ExternalSyntheticLambda1(5, rememberUpdatedState));
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) rememberedValue;
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new SubcomposeLayoutState(new Recorder.AnonymousClass1(lazyLayoutItemContentFactory));
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    final SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) rememberedValue2;
                    final LazyLayoutPrefetchState lazyLayoutPrefetchState2 = LazyLayoutPrefetchState.this;
                    if (lazyLayoutPrefetchState2 != null) {
                        gapComposer2.startReplaceGroup(1743490539);
                        gapComposer2.startReplaceGroup(887527095);
                        final PrefetchScheduler prefetchScheduler = PrefetchScheduler_androidKt.RobolectricImpl;
                        if (prefetchScheduler != null) {
                            gapComposer2.startReplaceGroup(1345554384);
                        } else {
                            gapComposer2.startReplaceGroup(1345603457);
                            View view = (View) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalView);
                            boolean changed = gapComposer2.changed(view);
                            Object rememberedValue3 = gapComposer2.rememberedValue();
                            if (changed || rememberedValue3 == neverEqualPolicy) {
                                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                rememberedValue3 = tag instanceof PrefetchScheduler ? (PrefetchScheduler) tag : null;
                                if (rememberedValue3 == null) {
                                    rememberedValue3 = new AndroidPrefetchScheduler(view);
                                    view.setTag(R.id.compose_prefetch_scheduler, rememberedValue3);
                                }
                                gapComposer2.updateRememberedValue(rememberedValue3);
                            }
                            prefetchScheduler = (PrefetchScheduler) rememberedValue3;
                        }
                        gapComposer2.end(false);
                        gapComposer2.end(false);
                        Object[] objArr = {lazyLayoutPrefetchState2, lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler};
                        boolean changed2 = gapComposer2.changed(lazyLayoutPrefetchState2) | gapComposer2.changedInstance(lazyLayoutItemContentFactory) | gapComposer2.changedInstance(subcomposeLayoutState) | gapComposer2.changedInstance(prefetchScheduler);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    Response response = new Response(lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler);
                                    LazyLayoutPrefetchState lazyLayoutPrefetchState3 = LazyLayoutPrefetchState.this;
                                    lazyLayoutPrefetchState3.prefetchHandleProvider = response;
                                    return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(lazyLayoutPrefetchState3, 6);
                                }
                            };
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        Updater.DisposableEffect(objArr, (Function1) rememberedValue4, (Composer) gapComposer2);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1744076749);
                        gapComposer2.end(false);
                    }
                    int i3 = LazyLayoutPrefetchStateKt.$r8$clinit;
                    Modifier modifier2 = modifier;
                    if (lazyLayoutPrefetchState2 != null && (then = modifier2.then(new TraversablePrefetchStateModifierElement(lazyLayoutPrefetchState2))) != null) {
                        modifier2 = then;
                    }
                    boolean changed3 = gapComposer2.changed(lazyLayoutItemContentFactory);
                    LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy2 = lazyLayoutMeasurePolicy;
                    boolean changed4 = changed3 | gapComposer2.changed(lazyLayoutMeasurePolicy2);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    int i4 = 8;
                    if (changed4 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new TextKt$$ExternalSyntheticLambda0(i4, lazyLayoutItemContentFactory, lazyLayoutMeasurePolicy2);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    RulerKt.SubcomposeLayout(subcomposeLayoutState, modifier2, (Function2) rememberedValue5, gapComposer2, 8);
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(modifier, lazyLayoutPrefetchState, lazyLayoutMeasurePolicy, i) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda1
                public final /* synthetic */ Modifier f$1;
                public final /* synthetic */ LazyLayoutPrefetchState f$2;
                public final /* synthetic */ LazyLayoutMeasurePolicy f$3;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    LazyLayoutKt.LazyLayout(Function0.this, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void LazyLayoutPinnableItem(Object obj, int i, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2) {
        int i3;
        LazyLayoutPinnableItem lazyLayoutPinnableItem;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(872548579);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changedInstance(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changed(i) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(lazyLayoutPinnedItemList) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            boolean changed = gapComposer.changed(obj) | gapComposer.changed(lazyLayoutPinnedItemList);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new LazyLayoutPinnableItem(obj, lazyLayoutPinnedItemList);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyLayoutPinnableItem lazyLayoutPinnableItem2 = (LazyLayoutPinnableItem) rememberedValue;
            lazyLayoutPinnableItem2.index = i;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = lazyLayoutPinnableItem2._parentPinnableContainer$delegate;
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = PinnableContainerKt.LocalPinnableContainer;
            PinnableContainer pinnableContainer = (PinnableContainer) gapComposer.consume(dynamicProvidableCompositionLocal);
            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                if (pinnableContainer != ((PinnableContainer) parcelableSnapshotMutableState.getValue())) {
                    parcelableSnapshotMutableState.setValue(pinnableContainer);
                    if (lazyLayoutPinnableItem2.pinsCount > 0) {
                        PinnableContainer.PinnedHandle pinnedHandle = lazyLayoutPinnableItem2.parentHandle;
                        if (pinnedHandle != null) {
                            ((LazyLayoutPinnableItem) pinnedHandle).release();
                        }
                        if (pinnableContainer != null) {
                            lazyLayoutPinnableItem = (LazyLayoutPinnableItem) pinnableContainer;
                            lazyLayoutPinnableItem.pin();
                        } else {
                            lazyLayoutPinnableItem = null;
                        }
                        lazyLayoutPinnableItem2.parentHandle = lazyLayoutPinnableItem;
                    }
                }
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                boolean changed2 = gapComposer.changed(lazyLayoutPinnableItem2);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ObjectList$$ExternalSyntheticLambda0(lazyLayoutPinnableItem2, 22);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.DisposableEffect(lazyLayoutPinnableItem2, (Function1) rememberedValue2, gapComposer);
                Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(lazyLayoutPinnableItem2), composableLambdaImpl, gapComposer, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(obj, i, lazyLayoutPinnedItemList, composableLambdaImpl, i2);
        }
    }

    public static final void LazySaveableStateHolderProvider(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-709502251);
        int i2 = 2;
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.LocalSaveableStateRegistry;
            SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) gapComposer.consume(staticProvidableCompositionLocal);
            SaveableStateHolderImpl rememberSaveableStateHolder = SaverKt.rememberSaveableStateHolder(gapComposer);
            Object[] objArr = {saveableStateRegistry};
            WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(8, new SnackbarHostKt$$ExternalSyntheticLambda2(4), new ClickableKt$$ExternalSyntheticLambda0(26, saveableStateRegistry, rememberSaveableStateHolder));
            boolean changedInstance = gapComposer.changedInstance(saveableStateRegistry) | gapComposer.changedInstance(rememberSaveableStateHolder);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new DialogHostKt$$ExternalSyntheticLambda0(11, saveableStateRegistry, rememberSaveableStateHolder);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue, (Composer) gapComposer, 0);
            Updater.CompositionLocalProvider(staticProvidableCompositionLocal.defaultProvidedValue$runtime(lazySaveableStateHolder), Expect_jvmKt.rememberComposableLambda(-412824043, new TextKt$$ExternalSyntheticLambda0(composableLambdaImpl, lazySaveableStateHolder, 9), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AppBarKt$$ExternalSyntheticLambda4(i, i2, composableLambdaImpl);
        }
    }

    /* renamed from: SkippableItem-JVlU9Rs, reason: not valid java name */
    public static final void m322SkippableItemJVlU9Rs(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i, Object obj2, Composer composer, int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1439843069);
        int i3 = (gapComposer.changed(lazyLayoutItemProvider) ? 4 : 2) | i2 | (gapComposer.changed(obj) ? 32 : 16) | (gapComposer.changed(i) ? 256 : 128) | (gapComposer.changed(obj2) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            ((SaveableStateHolder) obj).SaveableStateProvider(obj2, Expect_jvmKt.rememberComposableLambda(980966366, new TextKt$$ExternalSyntheticLambda1(i, lazyLayoutItemProvider, obj2), gapComposer), gapComposer, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(lazyLayoutItemProvider, obj, i, obj2, i2);
        }
    }

    public static final int access$binarySearch(int i, MutableVector mutableVector) {
        int i2 = mutableVector.size - 1;
        int i3 = 0;
        while (i3 < i2) {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, i3, 2, i3);
            Object[] objArr = mutableVector.content;
            int i4 = ((IntervalList$Interval) objArr[m]).startIndex;
            if (i4 != i) {
                if (i4 < i) {
                    i3 = m + 1;
                    if (i < ((IntervalList$Interval) objArr[i3]).startIndex) {
                    }
                } else {
                    i2 = m - 1;
                }
            }
            return m;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec A[Catch: ItemFoundInScroll -> 0x01c5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {ItemFoundInScroll -> 0x01c5, blocks: (B:27:0x00c3, B:34:0x00ec, B:42:0x0116, B:44:0x012c, B:47:0x0141, B:50:0x0149), top: B:26:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0199 -> B:21:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateScrollToItem(PagerScrollScopeKt$LazyLayoutScrollScope$1 pagerScrollScopeKt$LazyLayoutScrollScope$1, int i, int i2, int i3, Density density, ContinuationImpl continuationImpl) {
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$1;
        CoroutineSingletons coroutineSingletons;
        int i4;
        PagerScrollScopeKt$LazyLayoutScrollScope$1 pagerScrollScopeKt$LazyLayoutScrollScope$12;
        int i5;
        int i6;
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$12;
        float mo236toPx0680j_4;
        float mo236toPx0680j_42;
        float mo236toPx0680j_43;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        Ref$IntRef ref$IntRef;
        final int i7;
        final int i8;
        float f;
        final float f2;
        int i9;
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$13;
        PagerScrollScopeKt$LazyLayoutScrollScope$1 pagerScrollScopeKt$LazyLayoutScrollScope$13;
        float f3;
        int i10;
        AnimationState copy$default;
        Float f4;
        boolean z;
        ThumbNode$$ExternalSyntheticLambda0 thumbNode$$ExternalSyntheticLambda0;
        PagerScrollScopeKt$LazyLayoutScrollScope$1 pagerScrollScopeKt$LazyLayoutScrollScope$14;
        int i11;
        int i12;
        final Ref$IntRef ref$IntRef2;
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$14;
        int pageCount;
        float f5;
        final PagerScrollScopeKt$LazyLayoutScrollScope$1 pagerScrollScopeKt$LazyLayoutScrollScope$15;
        final int i13;
        final Ref$BooleanRef ref$BooleanRef2;
        final Ref$ObjectRef ref$ObjectRef2;
        final float f6;
        float f7;
        int i14;
        float f8;
        int i15;
        if (continuationImpl instanceof LazyLayoutScrollScopeKt$animateScrollToItem$1) {
            lazyLayoutScrollScopeKt$animateScrollToItem$1 = (LazyLayoutScrollScopeKt$animateScrollToItem$1) continuationImpl;
            int i16 = lazyLayoutScrollScopeKt$animateScrollToItem$1.label;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                lazyLayoutScrollScopeKt$animateScrollToItem$1.label = i16 - PKIFailureInfo.systemUnavail;
                Object obj = lazyLayoutScrollScopeKt$animateScrollToItem$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = lazyLayoutScrollScopeKt$animateScrollToItem$1.label;
                float f9 = RecyclerView.DECELERATION_RATE;
                boolean z2 = true;
                if (i4 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (i < RecyclerView.DECELERATION_RATE) {
                        InlineClassHelperKt.throwIllegalArgumentException("Index should be non-negative");
                    }
                    try {
                        mo236toPx0680j_4 = density.mo236toPx0680j_4(2500.0f);
                        mo236toPx0680j_42 = density.mo236toPx0680j_4(1500.0f);
                        mo236toPx0680j_43 = density.mo236toPx0680j_4(50.0f);
                        ref$BooleanRef = new Ref$BooleanRef();
                        ref$BooleanRef.element = true;
                        ref$ObjectRef = new Ref$ObjectRef();
                        ref$ObjectRef.element = AnimatableKt.AnimationState$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 30);
                    } catch (ItemFoundInScroll e) {
                        e = e;
                        pagerScrollScopeKt$LazyLayoutScrollScope$12 = pagerScrollScopeKt$LazyLayoutScrollScope$1;
                        i5 = i2;
                        i6 = i;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                    }
                    if (isItemVisible(pagerScrollScopeKt$LazyLayoutScrollScope$1, i)) {
                        throw new ItemFoundInScroll(pagerScrollScopeKt$LazyLayoutScrollScope$1.calculateDistanceTo(i), (AnimationState) ref$ObjectRef.element);
                    }
                    int i17 = i > pagerScrollScopeKt$LazyLayoutScrollScope$1.getFirstVisibleItemIndex() ? 1 : 0;
                    ref$IntRef = new Ref$IntRef();
                    ref$IntRef.element = 1;
                    i7 = i2;
                    i8 = i3;
                    f = mo236toPx0680j_4;
                    f2 = mo236toPx0680j_42;
                    i9 = i;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                    pagerScrollScopeKt$LazyLayoutScrollScope$13 = pagerScrollScopeKt$LazyLayoutScrollScope$1;
                    f3 = mo236toPx0680j_43;
                    i10 = i17;
                    ref$IntRef2 = ref$IntRef;
                    if (ref$BooleanRef.element) {
                    }
                    return Unit.INSTANCE;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i11 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1;
                    i12 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0;
                    pagerScrollScopeKt$LazyLayoutScrollScope$14 = lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    pagerScrollScopeKt$LazyLayoutScrollScope$14.snapToItem(i12, i11);
                    return Unit.INSTANCE;
                }
                i10 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$3;
                float f10 = lazyLayoutScrollScopeKt$animateScrollToItem$1.F$2;
                float f11 = lazyLayoutScrollScopeKt$animateScrollToItem$1.F$1;
                f = lazyLayoutScrollScopeKt$animateScrollToItem$1.F$0;
                int i18 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$2;
                int i19 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1;
                i6 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0;
                ref$IntRef = lazyLayoutScrollScopeKt$animateScrollToItem$1.L$3;
                Ref$ObjectRef ref$ObjectRef3 = lazyLayoutScrollScopeKt$animateScrollToItem$1.L$2;
                Ref$BooleanRef ref$BooleanRef3 = lazyLayoutScrollScopeKt$animateScrollToItem$1.L$1;
                pagerScrollScopeKt$LazyLayoutScrollScope$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0;
                try {
                    SafeTrace.throwOnFailure(obj);
                    f8 = f11;
                    i7 = i19;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                    f3 = f10;
                    i15 = 1;
                    i14 = i18;
                    i9 = i6;
                } catch (ItemFoundInScroll e2) {
                    e = e2;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                    i5 = i19;
                }
                try {
                    try {
                        ref$IntRef.element += i15;
                        pagerScrollScopeKt$LazyLayoutScrollScope$13 = pagerScrollScopeKt$LazyLayoutScrollScope$12;
                        ref$BooleanRef = ref$BooleanRef3;
                        ref$ObjectRef = ref$ObjectRef3;
                        f2 = f8;
                        f9 = RecyclerView.DECELERATION_RATE;
                        i8 = i14;
                        z2 = true;
                    } catch (ItemFoundInScroll e3) {
                        e = e3;
                        pagerScrollScopeKt$LazyLayoutScrollScope$12 = pagerScrollScopeKt$LazyLayoutScrollScope$13;
                        i6 = i9;
                        lazyLayoutScrollScopeKt$animateScrollToItem$14 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                    }
                    ref$IntRef2 = ref$IntRef;
                } catch (ItemFoundInScroll e4) {
                    e = e4;
                    i6 = i9;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                    i5 = i7;
                    copy$default = AnimatableKt.copy$default(e.previousAnimation, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 30);
                    float f12 = e.itemOffset + i5;
                    Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    f4 = new Float(f12);
                    if (((Number) copy$default.getVelocity()).floatValue() != RecyclerView.DECELERATION_RATE) {
                    }
                    thumbNode$$ExternalSyntheticLambda0 = new ThumbNode$$ExternalSyntheticLambda0(f12, ref$FloatRef, pagerScrollScopeKt$LazyLayoutScrollScope$12, 2);
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = pagerScrollScopeKt$LazyLayoutScrollScope$12;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i6;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i5;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
                    if (AnimatableKt.animateTo$default(copy$default, f4, null, !z, thumbNode$$ExternalSyntheticLambda0, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (ref$BooleanRef.element) {
                    try {
                    } catch (ItemFoundInScroll e5) {
                        e = e5;
                        pagerScrollScopeKt$LazyLayoutScrollScope$12 = pagerScrollScopeKt$LazyLayoutScrollScope$13;
                        i6 = i9;
                        lazyLayoutScrollScopeKt$animateScrollToItem$14 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                    }
                    switch (pagerScrollScopeKt$LazyLayoutScrollScope$13.$r8$classId) {
                        case 0:
                            pageCount = ((PagerState) pagerScrollScopeKt$LazyLayoutScrollScope$13.$state).getPageCount();
                            if (pageCount > 0) {
                                try {
                                    try {
                                        try {
                                            int calculateDistanceTo = pagerScrollScopeKt$LazyLayoutScrollScope$13.calculateDistanceTo(i9) + i7;
                                            if (Math.abs(calculateDistanceTo) >= f) {
                                                f5 = i10 != 0 ? f : -f;
                                            } else {
                                                try {
                                                    f5 = Math.max(Math.abs(calculateDistanceTo), f3);
                                                    if (i10 == 0) {
                                                        f5 = -f5;
                                                    }
                                                } catch (ItemFoundInScroll e6) {
                                                    e = e6;
                                                    pagerScrollScopeKt$LazyLayoutScrollScope$12 = pagerScrollScopeKt$LazyLayoutScrollScope$13;
                                                    i6 = i9;
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                                                    i5 = i7;
                                                    copy$default = AnimatableKt.copy$default(e.previousAnimation, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 30);
                                                    float f122 = e.itemOffset + i5;
                                                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                                                    f4 = new Float(f122);
                                                    if (((Number) copy$default.getVelocity()).floatValue() != RecyclerView.DECELERATION_RATE) {
                                                    }
                                                    thumbNode$$ExternalSyntheticLambda0 = new ThumbNode$$ExternalSyntheticLambda0(f122, ref$FloatRef2, pagerScrollScopeKt$LazyLayoutScrollScope$12, 2);
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = pagerScrollScopeKt$LazyLayoutScrollScope$12;
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i6;
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i5;
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
                                                    if (AnimatableKt.animateTo$default(copy$default, f4, null, !z, thumbNode$$ExternalSyntheticLambda0, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
                                                    }
                                                    return coroutineSingletons;
                                                }
                                            }
                                            AnimationState copy$default2 = AnimatableKt.copy$default((AnimationState) ref$ObjectRef.element, f9, f9, 30);
                                            ref$ObjectRef.element = copy$default2;
                                            final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                                            Float f13 = new Float(f5);
                                            boolean z3 = (((Number) ((AnimationState) ref$ObjectRef.element).getVelocity()).floatValue() == f9 ? z2 : false) ^ z2;
                                            final boolean z4 = i10 != 0 ? z2 : false;
                                            Function1 function1 = new Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$$ExternalSyntheticLambda0
                                                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v24 float, still in use, count: 2, list:
                                                      (r2v24 float) from 0x002b: PHI (r2v20 float) = (r2v7 float), (r2v24 float) binds: [B:36:0x003b, B:6:0x0028] A[DONT_GENERATE, DONT_INLINE]
                                                      (r2v24 float) from 0x0026: CMP_L (r2v24 float), (r7v0 float) A[WRAPPED]
                                                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                                                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                                                    	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
                                                    	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
                                                    	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                    	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
                                                    	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
                                                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
                                                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                                                    */
                                                @Override // kotlin.jvm.functions.Function1
                                                public final java.lang.Object invoke(java.lang.Object r11) {
                                                    /*
                                                        Method dump skipped, instructions count: 225
                                                        To view this dump add '--comments-level debug' option
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$$ExternalSyntheticLambda0.invoke(java.lang.Object):java.lang.Object");
                                                }
                                            };
                                            lazyLayoutScrollScopeKt$animateScrollToItem$13.L$0 = pagerScrollScopeKt$LazyLayoutScrollScope$12;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$13.L$1 = ref$BooleanRef3;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$13.L$2 = ref$ObjectRef3;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$13.L$3 = ref$IntRef2;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$13.I$0 = i6;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$13.I$1 = i5;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$13.I$2 = i14;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$13.F$0 = f;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$13.F$1 = f7;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$13.F$2 = f3;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$13.I$3 = i10;
                                            f8 = f7;
                                            i15 = 1;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$13.label = 1;
                                            if (AnimatableKt.animateTo$default(copy$default2, f13, null, z3, function1, lazyLayoutScrollScopeKt$animateScrollToItem$14, 2) != coroutineSingletons) {
                                                ref$IntRef = ref$IntRef2;
                                                i7 = i5;
                                                lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$14;
                                                i9 = i6;
                                                ref$IntRef.element += i15;
                                                pagerScrollScopeKt$LazyLayoutScrollScope$13 = pagerScrollScopeKt$LazyLayoutScrollScope$12;
                                                ref$BooleanRef = ref$BooleanRef3;
                                                ref$ObjectRef = ref$ObjectRef3;
                                                f2 = f8;
                                                f9 = RecyclerView.DECELERATION_RATE;
                                                i8 = i14;
                                                z2 = true;
                                                ref$IntRef2 = ref$IntRef;
                                                if (ref$BooleanRef.element) {
                                                }
                                            }
                                        } catch (ItemFoundInScroll e7) {
                                            e = e7;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$14;
                                            copy$default = AnimatableKt.copy$default(e.previousAnimation, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 30);
                                            float f1222 = e.itemOffset + i5;
                                            Ref$FloatRef ref$FloatRef22 = new Ref$FloatRef();
                                            f4 = new Float(f1222);
                                            if (((Number) copy$default.getVelocity()).floatValue() != RecyclerView.DECELERATION_RATE) {
                                            }
                                            thumbNode$$ExternalSyntheticLambda0 = new ThumbNode$$ExternalSyntheticLambda0(f1222, ref$FloatRef22, pagerScrollScopeKt$LazyLayoutScrollScope$12, 2);
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = pagerScrollScopeKt$LazyLayoutScrollScope$12;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i6;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i5;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
                                            if (AnimatableKt.animateTo$default(copy$default, f4, null, !z, thumbNode$$ExternalSyntheticLambda0, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
                                            }
                                            return coroutineSingletons;
                                        }
                                        lazyLayoutScrollScopeKt$animateScrollToItem$14 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                                    } catch (ItemFoundInScroll e8) {
                                        e = e8;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$14 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                                    }
                                    pagerScrollScopeKt$LazyLayoutScrollScope$12 = pagerScrollScopeKt$LazyLayoutScrollScope$15;
                                    i6 = i13;
                                    ref$BooleanRef3 = ref$BooleanRef2;
                                    f7 = f2;
                                    i14 = i8;
                                    i5 = i7;
                                    ref$ObjectRef3 = ref$ObjectRef2;
                                } catch (ItemFoundInScroll e9) {
                                    e = e9;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$14 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                                    pagerScrollScopeKt$LazyLayoutScrollScope$12 = pagerScrollScopeKt$LazyLayoutScrollScope$15;
                                    i6 = i13;
                                    i5 = i7;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$14;
                                    copy$default = AnimatableKt.copy$default(e.previousAnimation, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 30);
                                    float f12222 = e.itemOffset + i5;
                                    Ref$FloatRef ref$FloatRef222 = new Ref$FloatRef();
                                    f4 = new Float(f12222);
                                    if (((Number) copy$default.getVelocity()).floatValue() != RecyclerView.DECELERATION_RATE) {
                                    }
                                    thumbNode$$ExternalSyntheticLambda0 = new ThumbNode$$ExternalSyntheticLambda0(f12222, ref$FloatRef222, pagerScrollScopeKt$LazyLayoutScrollScope$12, 2);
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = pagerScrollScopeKt$LazyLayoutScrollScope$12;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i6;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i5;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
                                    if (AnimatableKt.animateTo$default(copy$default, f4, null, !z, thumbNode$$ExternalSyntheticLambda0, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
                                    }
                                    return coroutineSingletons;
                                }
                                pagerScrollScopeKt$LazyLayoutScrollScope$15 = pagerScrollScopeKt$LazyLayoutScrollScope$13;
                                i13 = i9;
                                ref$BooleanRef2 = ref$BooleanRef;
                                ref$ObjectRef2 = ref$ObjectRef;
                                f6 = f5;
                                return coroutineSingletons;
                            }
                            break;
                        case 1:
                            pageCount = ((LazyListState) pagerScrollScopeKt$LazyLayoutScrollScope$13.$state).getLayoutInfo().totalItemsCount;
                            if (pageCount > 0) {
                            }
                            break;
                        default:
                            pageCount = ((LazyGridState) pagerScrollScopeKt$LazyLayoutScrollScope$13.$state).getLayoutInfo().totalItemsCount;
                            if (pageCount > 0) {
                            }
                            break;
                    }
                }
                return Unit.INSTANCE;
                copy$default = AnimatableKt.copy$default(e.previousAnimation, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 30);
                float f122222 = e.itemOffset + i5;
                Ref$FloatRef ref$FloatRef2222 = new Ref$FloatRef();
                f4 = new Float(f122222);
                z = ((Number) copy$default.getVelocity()).floatValue() != RecyclerView.DECELERATION_RATE;
                thumbNode$$ExternalSyntheticLambda0 = new ThumbNode$$ExternalSyntheticLambda0(f122222, ref$FloatRef2222, pagerScrollScopeKt$LazyLayoutScrollScope$12, 2);
                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = pagerScrollScopeKt$LazyLayoutScrollScope$12;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i6;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i5;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
                if (AnimatableKt.animateTo$default(copy$default, f4, null, !z, thumbNode$$ExternalSyntheticLambda0, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
                    pagerScrollScopeKt$LazyLayoutScrollScope$14 = pagerScrollScopeKt$LazyLayoutScrollScope$12;
                    i11 = i5;
                    i12 = i6;
                    pagerScrollScopeKt$LazyLayoutScrollScope$14.snapToItem(i12, i11);
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
        }
        lazyLayoutScrollScopeKt$animateScrollToItem$1 = new LazyLayoutScrollScopeKt$animateScrollToItem$1(continuationImpl);
        Object obj2 = lazyLayoutScrollScopeKt$animateScrollToItem$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = lazyLayoutScrollScopeKt$animateScrollToItem$1.label;
        float f92 = RecyclerView.DECELERATION_RATE;
        boolean z22 = true;
        if (i4 != 0) {
        }
        copy$default = AnimatableKt.copy$default(e.previousAnimation, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 30);
        float f1222222 = e.itemOffset + i5;
        Ref$FloatRef ref$FloatRef22222 = new Ref$FloatRef();
        f4 = new Float(f1222222);
        if (((Number) copy$default.getVelocity()).floatValue() != RecyclerView.DECELERATION_RATE) {
        }
        thumbNode$$ExternalSyntheticLambda0 = new ThumbNode$$ExternalSyntheticLambda0(f1222222, ref$FloatRef22222, pagerScrollScopeKt$LazyLayoutScrollScope$12, 2);
        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = pagerScrollScopeKt$LazyLayoutScrollScope$12;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i6;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i5;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
        if (AnimatableKt.animateTo$default(copy$default, f4, null, !z, thumbNode$$ExternalSyntheticLambda0, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static final boolean animateScrollToItem$isOvershot(boolean z, PagerScrollScopeKt$LazyLayoutScrollScope$1 pagerScrollScopeKt$LazyLayoutScrollScope$1, int i, int i2) {
        if (z) {
            if (pagerScrollScopeKt$LazyLayoutScrollScope$1.getFirstVisibleItemIndex() > i) {
                return true;
            }
            return pagerScrollScopeKt$LazyLayoutScrollScope$1.getFirstVisibleItemIndex() == i && pagerScrollScopeKt$LazyLayoutScrollScope$1.getFirstVisibleItemScrollOffset() > i2;
        }
        if (pagerScrollScopeKt$LazyLayoutScrollScope$1.getFirstVisibleItemIndex() < i) {
            return true;
        }
        return pagerScrollScopeKt$LazyLayoutScrollScope$1.getFirstVisibleItemIndex() == i && pagerScrollScopeKt$LazyLayoutScrollScope$1.getFirstVisibleItemScrollOffset() < i2;
    }

    public static final List applyStickyItems(CachedItem.NoKey noKey, int i, int i2, ArrayList arrayList, MutableIntList mutableIntList, int i3, int i4, int i5, Function1 function1) {
        int i6;
        MutableIntList mutableIntList2;
        long j;
        long j2;
        int i7;
        Object obj;
        int i8;
        if (noKey == null || arrayList.isEmpty() || (i6 = mutableIntList._size) == 0) {
            return EmptyList.INSTANCE;
        }
        int i9 = -1;
        if (i2 - i < 0 || i6 == 0) {
            mutableIntList2 = IntListKt.EmptyIntList;
        } else {
            IntRange until = RangesKt___RangesKt.until(0, i6);
            int i10 = until.first;
            int i11 = until.last;
            int i12 = -1;
            if (i10 <= i11) {
                while (mutableIntList.get(i10) <= i) {
                    i12 = mutableIntList.get(i10);
                    if (i10 == i11) {
                        break;
                    }
                    i10++;
                }
            }
            if (i12 == -1) {
                mutableIntList2 = IntListKt.EmptyIntList;
            } else {
                MutableIntList mutableIntList3 = IntListKt.EmptyIntList;
                mutableIntList2 = new MutableIntList(1);
                mutableIntList2.add(i12);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj2 = arrayList.get(i13);
            int index = ((LazyLayoutMeasuredItem) obj2).getIndex();
            int[] iArr = mutableIntList.content;
            int i14 = mutableIntList._size;
            int i15 = 0;
            while (true) {
                if (i15 >= i14) {
                    break;
                }
                if (iArr[i15] == index) {
                    arrayList3.add(obj2);
                    break;
                }
                i15++;
            }
        }
        int[] iArr2 = mutableIntList2.content;
        int i16 = mutableIntList2._size;
        int i17 = 0;
        while (i17 < i16) {
            int i18 = iArr2[i17];
            Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = i9;
                    break;
                }
                if (((LazyLayoutMeasuredItem) it.next()).getIndex() == i18) {
                    break;
                }
                i19++;
            }
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem = i19 == i9 ? (LazyLayoutMeasuredItem) function1.invoke(Integer.valueOf(i18)) : (LazyLayoutMeasuredItem) arrayList.remove(i19);
            int mainAxisSizeWithSpacings = lazyLayoutMeasuredItem.getMainAxisSizeWithSpacings();
            if (i19 == i9) {
                j = BodyPartID.bodyIdMax;
                i7 = PKIFailureInfo.systemUnavail;
            } else {
                long mo313getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo313getOffsetBjo55l4(0);
                if (lazyLayoutMeasuredItem.isVertical()) {
                    j = BodyPartID.bodyIdMax;
                    j2 = mo313getOffsetBjo55l4 & BodyPartID.bodyIdMax;
                } else {
                    j = BodyPartID.bodyIdMax;
                    j2 = mo313getOffsetBjo55l4 >> 32;
                }
                i7 = (int) j2;
            }
            int size2 = arrayList3.size();
            int i20 = 0;
            while (true) {
                if (i20 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i20);
                if (((LazyLayoutMeasuredItem) obj).getIndex() != i18) {
                    break;
                }
                i20++;
            }
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = (LazyLayoutMeasuredItem) obj;
            if (lazyLayoutMeasuredItem2 != null) {
                long mo313getOffsetBjo55l42 = lazyLayoutMeasuredItem2.mo313getOffsetBjo55l4(0);
                i8 = (int) (lazyLayoutMeasuredItem2.isVertical() ? mo313getOffsetBjo55l42 & j : mo313getOffsetBjo55l42 >> 32);
            } else {
                i8 = PKIFailureInfo.systemUnavail;
            }
            int max = i7 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i7);
            if (i8 != Integer.MIN_VALUE) {
                max = Math.min(max, i8 - mainAxisSizeWithSpacings);
            }
            lazyLayoutMeasuredItem.setNonScrollableItem();
            lazyLayoutMeasuredItem.position(max, 0, i4, i5);
            arrayList2.add(lazyLayoutMeasuredItem);
            i17++;
            i9 = -1;
        }
        return arrayList2;
    }

    public static final List calculateLazyLayoutPinnedIndices(LazyLayoutItemProvider lazyLayoutItemProvider, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, Recorder.AnonymousClass6 anonymousClass6) {
        IntRange intRange;
        MutableVector mutableVector = (MutableVector) anonymousClass6.this$0;
        if (!(mutableVector.size != 0) && lazyLayoutPinnedItemList.items.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        if (((MutableVector) anonymousClass6.this$0).size != 0) {
            int i = mutableVector.size;
            if (i == 0) {
                OptionalProvider$$ExternalSyntheticLambda0.m("MutableVector is empty.");
                return null;
            }
            Object[] objArr = mutableVector.content;
            int i2 = ((LazyLayoutBeyondBoundsInfo$Interval) objArr[0]).start;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = ((LazyLayoutBeyondBoundsInfo$Interval) objArr[i3]).start;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                InlineClassHelperKt.throwIllegalArgumentException("negative minIndex");
            }
            int i5 = mutableVector.size;
            if (i5 == 0) {
                OptionalProvider$$ExternalSyntheticLambda0.m("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = mutableVector.content;
            int i6 = ((LazyLayoutBeyondBoundsInfo$Interval) objArr2[0]).end;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((LazyLayoutBeyondBoundsInfo$Interval) objArr2[i7]).end;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            intRange = new IntRange(i2, Math.min(i6, lazyLayoutItemProvider.getItemCount() - 1), 1);
        } else {
            IntRange.INSTANCE.getClass();
            intRange = IntRange.EMPTY;
        }
        int size = lazyLayoutPinnedItemList.items.size();
        for (int i9 = 0; i9 < size; i9++) {
            LazyLayoutPinnableItem lazyLayoutPinnableItem = (LazyLayoutPinnableItem) lazyLayoutPinnedItemList.get(i9);
            int findIndexByKey = findIndexByKey(lazyLayoutPinnableItem.index, lazyLayoutItemProvider, lazyLayoutPinnableItem.key);
            int i10 = intRange.first;
            if ((findIndexByKey > intRange.last || i10 > findIndexByKey) && findIndexByKey >= 0 && findIndexByKey < lazyLayoutItemProvider.getItemCount()) {
                arrayList.add(Integer.valueOf(findIndexByKey));
            }
        }
        int i11 = intRange.first;
        int i12 = intRange.last;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static MutableState m323constructorimpl$default() {
        return new ParcelableSnapshotMutableState(Unit.INSTANCE, NeverEqualPolicy.INSTANCE);
    }

    public static final int findIndexByKey(int i, LazyLayoutItemProvider lazyLayoutItemProvider, Object obj) {
        int index;
        return (obj == null || lazyLayoutItemProvider.getItemCount() == 0 || (i < lazyLayoutItemProvider.getItemCount() && obj.equals(lazyLayoutItemProvider.getKey(i))) || (index = lazyLayoutItemProvider.getIndex(obj)) == -1) ? i : index;
    }

    /* renamed from: invalidateScope-impl, reason: not valid java name */
    public static final void m324invalidateScopeimpl(MutableState mutableState) {
        mutableState.setValue(Unit.INSTANCE);
    }

    public static final boolean isItemVisible(PagerScrollScopeKt$LazyLayoutScrollScope$1 pagerScrollScopeKt$LazyLayoutScrollScope$1, int i) {
        return i <= pagerScrollScopeKt$LazyLayoutScrollScope$1.getLastVisibleItemIndex() && pagerScrollScopeKt$LazyLayoutScrollScope$1.getFirstVisibleItemIndex() <= i;
    }

    public static final Modifier lazyLayoutBeyondBoundsModifier(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, Recorder.AnonymousClass6 anonymousClass6, Orientation orientation) {
        return new LazyLayoutBeyondBoundsModifierElement(lazyLayoutBeyondBoundsState, anonymousClass6, orientation);
    }

    public static final Modifier lazyLayoutSemantics(Modifier modifier, KProperty0 kProperty0, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z) {
        return modifier.then(new LazyLayoutSemanticsModifier(kProperty0, lazyLayoutSemanticState, orientation, z));
    }

    public static final List updatedVisibleItems(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        ArrayList mutableList = CollectionsKt.toMutableList((Collection) list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) arrayList.get(i3);
            int index = lazyLayoutMeasuredItem.getIndex();
            if (i <= index && index <= i2) {
                mutableList.add(lazyLayoutMeasuredItem);
            }
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(mutableList, LazyLayoutMeasuredItemIndexComparator);
        return mutableList;
    }

    public Object getContentType(int i) {
        IntervalList$Interval intervalList$Interval = getIntervals().get(i);
        return intervalList$Interval.value.getType().invoke(Integer.valueOf(i - intervalList$Interval.startIndex));
    }

    public abstract HuffmanTreeGroup getIntervals();

    public Object getKey(int i) {
        Object invoke;
        IntervalList$Interval intervalList$Interval = getIntervals().get(i);
        int i2 = i - intervalList$Interval.startIndex;
        Function1 key = intervalList$Interval.value.getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(i2))) == null) ? new DefaultLazyKey(i) : invoke;
    }
}
