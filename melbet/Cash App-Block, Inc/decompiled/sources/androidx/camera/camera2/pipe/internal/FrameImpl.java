package androidx.camera.camera2.pipe.internal;

import android.util.Log;
import android.view.Choreographer;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.internal.FrameState;
import app.cash.redwood.treehouse.AndroidTreehouseDispatchers;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlinx.atomicfu.AtomicBoolean;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes3.dex */
public final class FrameImpl implements AutoCloseable {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object closed;
    public final Object frameState;
    public final Object imageStreams;

    public FrameImpl(FrameState frameState) {
        ListBuilder listBuilder = frameState.imageOutputs;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listBuilder, 10));
        ListIterator listIterator = listBuilder.listIterator(0);
        while (true) {
            ListBuilder.Itr itr = (ListBuilder.Itr) listIterator;
            if (!itr.hasNext()) {
                break;
            } else {
                arrayList.add(new StreamId(((FrameState.ImageOutput) itr.next()).streamId));
            }
        }
        Set set = CollectionsKt.toSet(arrayList);
        set.getClass();
        this.frameState = frameState;
        this.imageStreams = set;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listBuilder, 10));
        ListIterator listIterator2 = listBuilder.listIterator(0);
        while (true) {
            ListBuilder.Itr itr2 = (ListBuilder.Itr) listIterator2;
            if (!itr2.hasNext()) {
                CollectionsKt.toSet(arrayList2);
                this.closed = AtomicFU.atomic(false);
                return;
            }
            arrayList2.add(new OutputId(((FrameState.ImageOutput) itr2.next()).outputId));
        }
    }

    private final void close$app$cash$redwood$treehouse$AndroidChoreographerFrameClock() {
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.$r8$classId) {
            case 0:
                release();
                break;
        }
    }

    public void finalize() {
        switch (this.$r8$classId) {
            case 0:
                if (release()) {
                    Log.e("CXCP", "Failed to close " + this + "! This indicates a memory leak and could cause the camera to stall, or images to be lost.");
                    break;
                }
                break;
            default:
                super.finalize();
                break;
        }
    }

    public boolean release() {
        FrameState frameState = (FrameState) this.frameState;
        if (!((AtomicBoolean) this.closed).compareAndSet()) {
            return false;
        }
        FrameState.FrameInfoOutput frameInfoOutput = frameState.frameInfoOutput;
        ListBuilder listBuilder = frameState.imageOutputs;
        frameInfoOutput.decrement();
        int size = listBuilder.getSize();
        for (int i = 0; i < size; i++) {
            FrameState.ImageOutput imageOutput = (FrameState.ImageOutput) listBuilder.get(i);
            if (((Set) this.imageStreams).contains(new StreamId(imageOutput.streamId))) {
                imageOutput.decrement();
            }
        }
        return true;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return ((FrameState) this.frameState).toString();
            default:
                return super.toString();
        }
    }

    public FrameImpl(Choreographer choreographer, ContextScope contextScope, AndroidTreehouseDispatchers androidTreehouseDispatchers) {
        this.frameState = choreographer;
        this.imageStreams = contextScope;
        this.closed = androidTreehouseDispatchers;
    }
}
