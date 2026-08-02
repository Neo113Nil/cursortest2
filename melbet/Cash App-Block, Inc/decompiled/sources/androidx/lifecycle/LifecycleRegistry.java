package androidx.lifecycle;

import android.os.Looper;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public class LifecycleRegistry extends Lifecycle {
    public final StateFlowImpl _currentStateFlow;
    public int addingObserverCounter;
    public final boolean enforceMainThread;
    public boolean handlingEvent;
    public final WeakReference lifecycleOwner;
    public boolean newEventOccurred;
    public FastSafeIterableMap observerMap = new FastSafeIterableMap();
    public final ArrayList parentStates;
    public Lifecycle.State state;

    public final class ObserverWithState {
        public LifecycleEventObserver lifecycleObserver;
        public Lifecycle.State state;

        public final void dispatchEvent(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            Lifecycle.State state = this.state;
            state.getClass();
            if (targetState.compareTo(state) < 0) {
                state = targetState;
            }
            this.state = state;
            this.lifecycleObserver.onStateChanged(lifecycleOwner, event);
            this.state = targetState;
        }
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z) {
        this.enforceMainThread = z;
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.state = state;
        this.parentStates = new ArrayList();
        this.lifecycleOwner = new WeakReference(lifecycleOwner);
        this._currentStateFlow = FlowKt.MutableStateFlow(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void addObserver(LifecycleObserver lifecycleObserver) {
        LifecycleEventObserver anonymousClass1;
        LifecycleOwner lifecycleOwner;
        lifecycleObserver.getClass();
        enforceMainThreadIfNeeded("addObserver");
        Lifecycle.State state = this.state;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        ObserverWithState observerWithState = new ObserverWithState();
        HashMap hashMap = Lifecycling.callbackCache;
        boolean z = lifecycleObserver instanceof LifecycleEventObserver;
        boolean z2 = lifecycleObserver instanceof DefaultLifecycleObserver;
        if (z && z2) {
            anonymousClass1 = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) lifecycleObserver, (LifecycleEventObserver) lifecycleObserver);
        } else if (z2) {
            anonymousClass1 = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) lifecycleObserver, null);
        } else if (z) {
            anonymousClass1 = (LifecycleEventObserver) lifecycleObserver;
        } else {
            Class<?> cls = lifecycleObserver.getClass();
            if (Lifecycling.getObserverConstructorType(cls) == 2) {
                Object obj = Lifecycling.classToAdapters.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    Lifecycling.createGeneratedAdapter((Constructor) list.get(0), lifecycleObserver);
                    throw null;
                }
                int size = list.size();
                GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
                if (size > 0) {
                    Lifecycling.createGeneratedAdapter((Constructor) list.get(0), lifecycleObserver);
                    throw null;
                }
                anonymousClass1 = new CompositeGeneratedAdaptersObserver(generatedAdapterArr, r4);
            } else {
                anonymousClass1 = new FragmentStateAdapter.AnonymousClass1(lifecycleObserver);
            }
        }
        observerWithState.lifecycleObserver = anonymousClass1;
        observerWithState.state = state2;
        if (((ObserverWithState) this.observerMap.putIfAbsent(lifecycleObserver, observerWithState)) == null && (lifecycleOwner = (LifecycleOwner) this.lifecycleOwner.get()) != null) {
            r4 = (this.addingObserverCounter != 0 || this.handlingEvent) ? 1 : 0;
            Lifecycle.State calculateTargetState = calculateTargetState(lifecycleObserver);
            this.addingObserverCounter++;
            while (observerWithState.state.compareTo(calculateTargetState) < 0 && this.observerMap.mHashMap.containsKey(lifecycleObserver)) {
                Lifecycle.State state3 = observerWithState.state;
                ArrayList arrayList = this.parentStates;
                arrayList.add(state3);
                Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
                Lifecycle.State state4 = observerWithState.state;
                companion.getClass();
                Lifecycle.Event upFrom = Lifecycle.Event.Companion.upFrom(state4);
                if (upFrom == null) {
                    a$$ExternalSyntheticBUOutline0.m$2(observerWithState.state, "no event up from ");
                    return;
                } else {
                    observerWithState.dispatchEvent(lifecycleOwner, upFrom);
                    arrayList.remove(arrayList.size() - 1);
                    calculateTargetState = calculateTargetState(lifecycleObserver);
                }
            }
            if (r4 == 0) {
                sync();
            }
            this.addingObserverCounter--;
        }
    }

    public final Lifecycle.State calculateTargetState(LifecycleObserver lifecycleObserver) {
        HashMap hashMap = this.observerMap.mHashMap;
        SafeIterableMap.Entry entry = hashMap.containsKey(lifecycleObserver) ? ((SafeIterableMap.Entry) hashMap.get(lifecycleObserver)).mPrevious : null;
        Lifecycle.State state = entry != null ? ((ObserverWithState) entry.mValue).state : null;
        ArrayList arrayList = this.parentStates;
        Lifecycle.State state2 = arrayList.isEmpty() ? null : (Lifecycle.State) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, arrayList);
        Lifecycle.State state3 = this.state;
        state3.getClass();
        if (state == null || state.compareTo(state3) >= 0) {
            state = state3;
        }
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    public final void enforceMainThreadIfNeeded(String str) {
        if (this.enforceMainThread) {
            ArchTaskExecutor.getInstance().mDelegate.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Method ", str, " must be called on the main thread"));
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State getCurrentState() {
        return this.state;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final ReadonlyStateFlow getCurrentStateFlow() {
        return FlowKt.asStateFlow(this._currentStateFlow);
    }

    public final void handleLifecycleEvent(Lifecycle.Event event) {
        event.getClass();
        enforceMainThreadIfNeeded("handleLifecycleEvent");
        moveToState$1(event.getTargetState());
    }

    public final void moveToState$1(Lifecycle.State state) {
        if (this.state == state) {
            return;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.lifecycleOwner.get();
        Lifecycle.State state2 = this.state;
        state2.getClass();
        state.getClass();
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle.State.CREATED + "' to be moved to '" + state + "' in component " + lifecycleOwner).toString());
        }
        Lifecycle.State state3 = Lifecycle.State.DESTROYED;
        if (state2 == state3 && state2 != state) {
            throw new IllegalStateException(("State is '" + state3 + "' and cannot be moved to `" + state + "` in component " + lifecycleOwner).toString());
        }
        this.state = state;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        sync();
        this.handlingEvent = false;
        if (this.state == state3) {
            this.observerMap = new FastSafeIterableMap();
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void removeObserver(LifecycleObserver lifecycleObserver) {
        lifecycleObserver.getClass();
        enforceMainThreadIfNeeded("removeObserver");
        this.observerMap.remove(lifecycleObserver);
    }

    public final void setCurrentState(Lifecycle.State state) {
        state.getClass();
        enforceMainThreadIfNeeded("setCurrentState");
        moveToState$1(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.newEventOccurred = false;
        r7._currentStateFlow.setValue(r7.state);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sync() {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.lifecycleOwner.get();
        if (lifecycleOwner == null) {
            a$$ExternalSyntheticBUOutline0.m$1("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            FastSafeIterableMap fastSafeIterableMap = this.observerMap;
            if (fastSafeIterableMap.mSize != 0) {
                SafeIterableMap.Entry entry = fastSafeIterableMap.mStart;
                entry.getClass();
                Lifecycle.State state = ((ObserverWithState) entry.mValue).state;
                SafeIterableMap.Entry entry2 = this.observerMap.mEnd;
                entry2.getClass();
                Lifecycle.State state2 = ((ObserverWithState) entry2.mValue).state;
                if (state == state2 && this.state == state2) {
                    break;
                }
                this.newEventOccurred = false;
                Lifecycle.State state3 = this.state;
                SafeIterableMap.Entry entry3 = this.observerMap.mStart;
                entry3.getClass();
                int compareTo = state3.compareTo(((ObserverWithState) entry3.mValue).state);
                ArrayList arrayList = this.parentStates;
                if (compareTo < 0) {
                    FastSafeIterableMap fastSafeIterableMap2 = this.observerMap;
                    SafeIterableMap.DescendingIterator descendingIterator = new SafeIterableMap.DescendingIterator(fastSafeIterableMap2.mEnd, fastSafeIterableMap2.mStart);
                    fastSafeIterableMap2.mIterators.put(descendingIterator, Boolean.FALSE);
                    while (descendingIterator.hasNext() && !this.newEventOccurred) {
                        Map.Entry entry4 = (Map.Entry) descendingIterator.next();
                        entry4.getClass();
                        LifecycleObserver lifecycleObserver = (LifecycleObserver) entry4.getKey();
                        ObserverWithState observerWithState = (ObserverWithState) entry4.getValue();
                        while (observerWithState.state.compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.mHashMap.containsKey(lifecycleObserver)) {
                            Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
                            Lifecycle.State state4 = observerWithState.state;
                            companion.getClass();
                            Lifecycle.Event downFrom = Lifecycle.Event.Companion.downFrom(state4);
                            if (downFrom == null) {
                                a$$ExternalSyntheticBUOutline0.m$2(observerWithState.state, "no event down from ");
                                return;
                            } else {
                                arrayList.add(downFrom.getTargetState());
                                observerWithState.dispatchEvent(lifecycleOwner, downFrom);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                SafeIterableMap.Entry entry5 = this.observerMap.mEnd;
                if (!this.newEventOccurred && entry5 != null && this.state.compareTo(((ObserverWithState) entry5.mValue).state) > 0) {
                    FastSafeIterableMap fastSafeIterableMap3 = this.observerMap;
                    fastSafeIterableMap3.getClass();
                    SafeIterableMap.IteratorWithAdditions iteratorWithAdditions = new SafeIterableMap.IteratorWithAdditions();
                    fastSafeIterableMap3.mIterators.put(iteratorWithAdditions, Boolean.FALSE);
                    while (iteratorWithAdditions.hasNext() && !this.newEventOccurred) {
                        Map.Entry entry6 = (Map.Entry) iteratorWithAdditions.next();
                        LifecycleObserver lifecycleObserver2 = (LifecycleObserver) entry6.getKey();
                        ObserverWithState observerWithState2 = (ObserverWithState) entry6.getValue();
                        while (observerWithState2.state.compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.mHashMap.containsKey(lifecycleObserver2)) {
                            arrayList.add(observerWithState2.state);
                            Lifecycle.Event.Companion companion2 = Lifecycle.Event.Companion;
                            Lifecycle.State state5 = observerWithState2.state;
                            companion2.getClass();
                            Lifecycle.Event upFrom = Lifecycle.Event.Companion.upFrom(state5);
                            if (upFrom == null) {
                                a$$ExternalSyntheticBUOutline0.m$2(observerWithState2.state, "no event up from ");
                                return;
                            } else {
                                observerWithState2.dispatchEvent(lifecycleOwner, upFrom);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
