package com.squareup.cash.securitysignals.ui;

import android.view.MotionEvent;
import android.view.View;
import com.squareup.cash.securitysignals.models.Pointer;
import com.squareup.cash.securitysignals.models.SignalsContext;
import com.squareup.cash.securitysignals.models.TouchEvent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes.dex */
public final class TouchRecorder implements View.OnTouchListener {
    public ArrayDeque gesture;
    public ArrayDeque lastGesture;
    public final int maxEvents;

    public TouchRecorder(int i) {
        this.maxEvents = i;
        this.gesture = new ArrayDeque(i);
        this.lastGesture = new ArrayDeque(i);
    }

    public final SignalsContext getSignalsContext() {
        return new SignalsContext(CollectionsKt.toList(this.lastGesture));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        ArrayDeque arrayDeque = this.gesture;
        int i = 0;
        if (action == 3) {
            arrayDeque.clear();
            return false;
        }
        if (arrayDeque.size() + 1 > this.maxEvents) {
            this.gesture.pollFirst();
        }
        ArrayDeque arrayDeque2 = this.gesture;
        long eventTime = motionEvent.getEventTime();
        int deviceId = motionEvent.getDeviceId();
        int action2 = motionEvent.getAction();
        int edgeFlags = motionEvent.getEdgeFlags();
        int metaState = motionEvent.getMetaState();
        int flags = motionEvent.getFlags();
        int buttonState = motionEvent.getButtonState();
        IntRange until = RangesKt___RangesKt.until(0, motionEvent.getHistorySize());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
        IntProgressionIterator it = until.iterator();
        while (it.hasNext) {
            int nextInt = it.nextInt();
            IntRange until2 = RangesKt___RangesKt.until(i, motionEvent.getPointerCount());
            IntProgressionIterator intProgressionIterator = it;
            long j = eventTime;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until2, 10));
            IntProgressionIterator it2 = until2.iterator();
            while (it2.hasNext) {
                int nextInt2 = it2.nextInt();
                arrayList2.add(new Pointer(motionEvent.getHistoricalX(nextInt2, nextInt), motionEvent.getHistoricalY(nextInt2, nextInt), motionEvent.getHistoricalPressure(nextInt2, nextInt), motionEvent.getHistoricalSize(nextInt2, nextInt), motionEvent.getToolType(nextInt2), motionEvent.getHistoricalTouchMajor(nextInt2, nextInt), motionEvent.getHistoricalTouchMinor(nextInt2, nextInt), motionEvent.getHistoricalToolMajor(nextInt2, nextInt), motionEvent.getHistoricalToolMinor(nextInt2, nextInt), motionEvent.getHistoricalOrientation(nextInt2, nextInt)));
            }
            arrayList.add(arrayList2);
            it = intProgressionIterator;
            eventTime = j;
            i = 0;
        }
        long j2 = eventTime;
        IntRange until3 = RangesKt___RangesKt.until(0, motionEvent.getPointerCount());
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until3, 10));
        IntProgressionIterator it3 = until3.iterator();
        while (it3.hasNext) {
            int nextInt3 = it3.nextInt();
            arrayList3.add(new Pointer(motionEvent.getX(nextInt3), motionEvent.getY(nextInt3), motionEvent.getPressure(nextInt3), motionEvent.getSize(nextInt3), motionEvent.getToolType(nextInt3), motionEvent.getTouchMajor(nextInt3), motionEvent.getTouchMinor(nextInt3), motionEvent.getToolMajor(nextInt3), motionEvent.getToolMinor(nextInt3), motionEvent.getOrientation(nextInt3)));
        }
        arrayDeque2.add(new TouchEvent(j2, deviceId, action2, edgeFlags, metaState, flags, buttonState, CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(arrayList3), (Collection) arrayList)));
        if (motionEvent.getAction() != 1) {
            return false;
        }
        ArrayDeque arrayDeque3 = this.gesture;
        ArrayDeque arrayDeque4 = this.lastGesture;
        this.gesture = arrayDeque4;
        this.lastGesture = arrayDeque3;
        arrayDeque4.clear();
        return false;
    }

    public /* synthetic */ TouchRecorder() {
        this(10);
    }
}
