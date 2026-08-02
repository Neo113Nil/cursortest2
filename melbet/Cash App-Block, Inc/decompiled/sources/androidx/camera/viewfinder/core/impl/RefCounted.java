package androidx.camera.viewfinder.core.impl;

import android.view.Surface;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicRef;

/* loaded from: classes3.dex */
public final class RefCounted {
    public static final Pair RELEASED;
    public static final Pair UNINITIALIZED;
    public final Function1 onRelease;
    public final AtomicRef refCounted = AtomicFU.atomic(UNINITIALIZED);

    static {
        Unit unit = Unit.INSTANCE;
        UNINITIALIZED = new Pair(unit, -1);
        RELEASED = new Pair(unit, 0);
    }

    public RefCounted(Function1 function1) {
        this.onRelease = function1;
    }

    public final Object acquire() {
        Pair pair;
        Object obj;
        if (Intrinsics.areEqual(this.refCounted.value, UNINITIALIZED)) {
            a$$ExternalSyntheticBUOutline0.m$1("Ref-count managed object has not yet been initialized. Unable to acquire.");
            return null;
        }
        AtomicRef atomicRef = this.refCounted;
        do {
            pair = (Pair) atomicRef.value;
            if (Intrinsics.areEqual(pair, RELEASED)) {
                return null;
            }
            obj = pair.first;
        } while (!this.refCounted.compareAndSet(pair, new Pair(obj, Integer.valueOf(((Number) pair.second).intValue() + 1))));
        return obj;
    }

    public final void initialize(Surface surface) {
        if (this.refCounted.compareAndSet(UNINITIALIZED, new Pair(surface, 1))) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Ref-count managed object has already been initialized.");
    }

    public final void release() {
        Pair pair;
        Pair pair2;
        Object obj;
        Pair pair3;
        if (Intrinsics.areEqual(this.refCounted.value, UNINITIALIZED)) {
            a$$ExternalSyntheticBUOutline0.m$1("Ref-count managed object has not yet been initialized. Unable to release.");
            return;
        }
        AtomicRef atomicRef = this.refCounted;
        do {
            pair = (Pair) atomicRef.value;
            pair2 = RELEASED;
            if (Intrinsics.areEqual(pair, pair2)) {
                a$$ExternalSyntheticBUOutline0.m$1("Release called more times than initialize + acquire.");
                return;
            } else {
                obj = pair.first;
                int intValue = ((Number) pair.second).intValue();
                pair3 = intValue == 1 ? pair2 : new Pair(obj, Integer.valueOf(intValue - 1));
            }
        } while (!this.refCounted.compareAndSet(pair, pair3));
        if (pair3.equals(pair2)) {
            this.onRelease.invoke(obj);
        }
    }
}
