package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes3.dex */
public final class RecordingApplier implements Applier {
    public final Object current;

    /* renamed from: operations, reason: collision with root package name */
    public final MutableIntList f853operations = new MutableIntList();
    public final MutableObjectList instances = new MutableObjectList();

    public RecordingApplier(Object obj) {
        this.current = obj;
    }

    @Override // androidx.compose.runtime.Applier
    public final void apply(Object obj, Function2 function2) {
        this.f853operations.add(7);
        MutableObjectList mutableObjectList = this.instances;
        mutableObjectList.add(function2);
        mutableObjectList.add(obj);
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        this.f853operations.add(4);
    }

    @Override // androidx.compose.runtime.Applier
    public final void down(Object obj) {
        this.f853operations.add(1);
        this.instances.add(obj);
    }

    @Override // androidx.compose.runtime.Applier
    public final Object getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertBottomUp(int i, Object obj) {
        MutableIntList mutableIntList = this.f853operations;
        mutableIntList.add(5);
        mutableIntList.add(i);
        this.instances.add(obj);
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertTopDown(int i, Object obj) {
        MutableIntList mutableIntList = this.f853operations;
        mutableIntList.add(6);
        mutableIntList.add(i);
        this.instances.add(obj);
    }

    public final void markRecomposePending() {
        this.f853operations.add(9);
    }

    @Override // androidx.compose.runtime.Applier
    public final void move(int i, int i2, int i3) {
        MutableIntList mutableIntList = this.f853operations;
        mutableIntList.add(3);
        mutableIntList.add(i);
        mutableIntList.add(i2);
        mutableIntList.add(i3);
    }

    public final void playTo(Applier applier, RememberEventDispatcher rememberEventDispatcher) {
        Exception exc;
        int i;
        MutableIntList mutableIntList = this.f853operations;
        int i2 = mutableIntList._size;
        MutableObjectList mutableObjectList = new MutableObjectList();
        applier.getClass();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            MutableObjectList mutableObjectList2 = this.instances;
            if (i3 >= i2) {
                if (i4 != mutableObjectList2._size) {
                    ComposerKt.composeImmediateRuntimeError("Applier operation size mismatch");
                }
                mutableObjectList2.clear();
                mutableIntList._size = 0;
                applier.onEndChanges();
                return;
            }
            int i5 = i3 + 1;
            try {
                try {
                    switch (mutableIntList.get(i3)) {
                        case 0:
                            applier.up();
                            i3 = i5;
                        case 1:
                            int i6 = i4 + 1;
                            applier.down(mutableObjectList2.get(i4));
                            i4 = i6;
                            i3 = i5;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            applier.remove(mutableIntList.get(i5), mutableIntList.get(i7));
                        case 3:
                            int i8 = i3 + 2;
                            try {
                                int i9 = i3 + 3;
                                try {
                                    i3 += 4;
                                    applier.move(mutableIntList.get(i5), mutableIntList.get(i8), mutableIntList.get(i9));
                                } catch (Exception e) {
                                    exc = e;
                                    i3 = i9;
                                    break;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i3 = i8;
                                break;
                            }
                        case 4:
                            applier.clear();
                            i3 = i5;
                        case 5:
                            i3 += 2;
                            i = i4 + 1;
                            applier.insertBottomUp(mutableIntList.get(i5), mutableObjectList2.get(i4));
                            i4 = i;
                        case 6:
                            i3 += 2;
                            try {
                                i = i4 + 1;
                                applier.insertTopDown(mutableIntList.get(i5), mutableObjectList2.get(i4));
                                i4 = i;
                            } catch (Exception e3) {
                                exc = e3;
                                break;
                            }
                        case 7:
                            int i10 = i4 + 1;
                            Object obj = mutableObjectList2.get(i4);
                            obj.getClass();
                            TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, obj);
                            i4 += 2;
                            applier.apply(mutableObjectList2.get(i10), (Function2) obj);
                            i3 = i5;
                        case 8:
                            Object current = applier.getCurrent();
                            if (current instanceof ComposeNodeLifecycleCallback) {
                                ComposeNodeLifecycleCallback composeNodeLifecycleCallback = (ComposeNodeLifecycleCallback) current;
                                if (((MutableVector) rememberEventDispatcher.leaving).remove(composeNodeLifecycleCallback)) {
                                    composeNodeLifecycleCallback.onDeactivate();
                                }
                            }
                            mutableObjectList.add(current);
                            applier.reuse();
                            i3 = i5;
                        default:
                            i3 = i5;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i3 = i5;
                }
            } catch (Throwable th) {
                applier.onEndChanges();
                throw th;
            }
            exc = e3;
            throw new ComposePausableCompositionException(mutableObjectList2, mutableObjectList, mutableIntList, i3 - 1, exc);
        }
    }

    @Override // androidx.compose.runtime.Applier
    public final void remove(int i, int i2) {
        MutableIntList mutableIntList = this.f853operations;
        mutableIntList.add(2);
        mutableIntList.add(i);
        mutableIntList.add(i2);
    }

    @Override // androidx.compose.runtime.Applier
    public final void reuse() {
        this.f853operations.add(8);
    }

    @Override // androidx.compose.runtime.Applier
    public final void up() {
        this.f853operations.add(0);
    }
}
