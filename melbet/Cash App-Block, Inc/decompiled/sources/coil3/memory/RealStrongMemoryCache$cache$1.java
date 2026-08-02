package coil3.memory;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.foundation.text.modifiers.SelectionController$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.upstream.Allocation;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.ogg.OggSeeker;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import coil3.svg.internal.AndroidSvg;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class RealStrongMemoryCache$cache$1 implements VectorizedAnimationSpec, MouseSelectionObserver, OggSeeker {
    public Object map;
    public long maxSize;
    public long size;
    public Object this$0;

    public RealStrongMemoryCache$cache$1(long j, int i) {
        Trace.checkState(((Allocation) this.map) == null);
        this.maxSize = j;
        this.size = j + i;
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public SeekMap createSeekMap() {
        Trace.checkState(this.maxSize != -1);
        return new SeekMap.Unseekable((FlacStreamMetadata) this.map, this.maxSize, 1);
    }

    public void entryRemoved(Object obj, Object obj2, RealStrongMemoryCache.InternalValue internalValue) {
        RealStrongMemoryCache.InternalValue internalValue2 = (RealStrongMemoryCache.InternalValue) obj2;
        ((RealWeakMemoryCache) ((RealStrongMemoryCache) this.this$0).weakMemoryCache).set((MemoryCache$Key) obj, internalValue2.image, internalValue2.extras, internalValue2.size);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return Long.MAX_VALUE;
    }

    public long getSize() {
        if (this.size == -1) {
            long j = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.map).entrySet()) {
                j += safeSizeOf(entry.getKey(), entry.getValue());
            }
            this.size = j;
        }
        return this.size;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getValueFromNanos(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return ((VectorizedDurationBasedAnimationSpec) this.map).getValueFromNanos(repetitionPlayTimeNanos(j), animationVector, animationVector2, repetitionStartVelocity(j, animationVector, animationVector3, animationVector2));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getVelocityFromNanos(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return ((VectorizedDurationBasedAnimationSpec) this.map).getVelocityFromNanos(repetitionPlayTimeNanos(j), animationVector, animationVector2, repetitionStartVelocity(j, animationVector, animationVector3, animationVector2));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
    /* renamed from: onDrag-3MmeM6k */
    public boolean mo119onDrag3MmeM6k(long j, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ((SelectionController$$ExternalSyntheticLambda0) this.map).invoke();
        if (layoutCoordinates == null) {
            return true;
        }
        SelectionRegistrar selectionRegistrar = (SelectionRegistrar) this.this$0;
        long j2 = this.size;
        if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar, j2)) {
            return false;
        }
        if (!((SelectionRegistrarImpl) selectionRegistrar).m446notifySelectionUpdatenjBpvok(layoutCoordinates, j, this.maxSize, selectionAdjustment$Companion$$ExternalSyntheticLambda0, false)) {
            return true;
        }
        this.maxSize = j;
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
    public void onDragDone() {
        SelectionManager$$ExternalSyntheticLambda0 selectionManager$$ExternalSyntheticLambda0 = ((SelectionRegistrarImpl) ((SelectionRegistrar) this.this$0)).onSelectionUpdateEndCallback;
        if (selectionManager$$ExternalSyntheticLambda0 != null) {
            selectionManager$$ExternalSyntheticLambda0.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
    /* renamed from: onExtend-k-4lQ0M */
    public boolean mo120onExtendk4lQ0M(long j) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ((SelectionController$$ExternalSyntheticLambda0) this.map).invoke();
        if (layoutCoordinates == null) {
            return false;
        }
        SelectionRegistrar selectionRegistrar = (SelectionRegistrar) this.this$0;
        long j2 = this.size;
        if (!layoutCoordinates.isAttached()) {
            return false;
        }
        SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) selectionRegistrar;
        if (selectionRegistrarImpl.m446notifySelectionUpdatenjBpvok(layoutCoordinates, j, this.maxSize, SelectionAdjustment$Companion.None, false)) {
            this.maxSize = j;
        }
        return SelectionRegistrarKt.hasSelection(selectionRegistrarImpl, j2);
    }

    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
    /* renamed from: onExtendDrag-k-4lQ0M */
    public boolean mo121onExtendDragk4lQ0M(long j) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ((SelectionController$$ExternalSyntheticLambda0) this.map).invoke();
        if (layoutCoordinates == null) {
            return true;
        }
        SelectionRegistrar selectionRegistrar = (SelectionRegistrar) this.this$0;
        long j2 = this.size;
        if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar, j2)) {
            return false;
        }
        if (!((SelectionRegistrarImpl) selectionRegistrar).m446notifySelectionUpdatenjBpvok(layoutCoordinates, j, this.maxSize, SelectionAdjustment$Companion.None, false)) {
            return true;
        }
        this.maxSize = j;
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
    /* renamed from: onStart-9KIMszo */
    public boolean mo122onStart9KIMszo(long j, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0, int i) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ((SelectionController$$ExternalSyntheticLambda0) this.map).invoke();
        if (layoutCoordinates == null) {
            return false;
        }
        SelectionRegistrar selectionRegistrar = (SelectionRegistrar) this.this$0;
        long j2 = this.size;
        if (!layoutCoordinates.isAttached()) {
            return false;
        }
        SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) selectionRegistrar;
        ScoreUiFactory$$ExternalSyntheticLambda0 scoreUiFactory$$ExternalSyntheticLambda0 = selectionRegistrarImpl.onSelectionUpdateStartCallback;
        if (scoreUiFactory$$ExternalSyntheticLambda0 != null) {
            scoreUiFactory$$ExternalSyntheticLambda0.invoke(Boolean.FALSE, layoutCoordinates, new Offset(j), selectionAdjustment$Companion$$ExternalSyntheticLambda0);
        }
        this.maxSize = j;
        return SelectionRegistrarKt.hasSelection(selectionRegistrarImpl, j2);
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public long read(ExtractorInput extractorInput) {
        long j = this.size;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.size = -1L;
        return j2;
    }

    public long repetitionPlayTimeNanos(long j) {
        long j2 = this.size;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.maxSize;
        long j5 = j3 / j4;
        return (((RepeatMode) this.this$0) == RepeatMode.Restart || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public AnimationVector repetitionStartVelocity(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j2 = this.size;
        long j3 = j + j2;
        long j4 = this.maxSize;
        return j3 > j4 ? ((VectorizedDurationBasedAnimationSpec) this.map).getVelocityFromNanos(j4 - j2, animationVector, animationVector3, animationVector2) : animationVector2;
    }

    public long safeSizeOf(Object obj, Object obj2) {
        try {
            long j = ((RealStrongMemoryCache.InternalValue) obj2).size;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.size = -1L;
            throw e;
        }
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public void startSeek(long j) {
        long[] jArr = (long[]) ((AndroidSvg) this.this$0).svg;
        this.size = jArr[Util.binarySearchFloor(jArr, j, true)];
    }

    public void trimToSize(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.map;
        while (getSize() > j) {
            if (linkedHashMap.isEmpty()) {
                if (getSize() == 0) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$1("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) CollectionsKt.first(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.size = getSize() - safeSizeOf(key, value);
                entryRemoved(key, value, null);
            }
        }
    }

    public RealStrongMemoryCache$cache$1(String str, byte[] bArr, long j, long j2) {
        this.map = str;
        this.this$0 = bArr;
        this.maxSize = j;
        this.size = j2;
    }
}
