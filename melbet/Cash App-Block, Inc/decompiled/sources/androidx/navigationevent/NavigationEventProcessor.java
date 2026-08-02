package androidx.navigationevent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class NavigationEventProcessor {
    public final StateFlowImpl _history;
    public final StateFlowImpl _transitionState = FlowKt.MutableStateFlow(NavigationEventTransitionState$Idle.INSTANCE);
    public final ArrayDeque defaultHandlers;
    public final LinkedHashSet defaultInputs;
    public boolean hasEnabledAnyHandlers;
    public boolean hasEnabledDefaultHandlers;
    public boolean hasEnabledOverlayHandlers;
    public final ReadonlyStateFlow history;
    public int inProgressDirection;
    public NavigationEventHandler inProgressHandler;
    public NavigationEventInput inProgressInput;
    public final ArrayDeque overlayHandlers;
    public final LinkedHashSet overlayInputs;
    public final LinkedHashSet unspecifiedInputs;

    public NavigationEventProcessor() {
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(new NavigationEventHistory());
        this._history = MutableStateFlow;
        this.history = FlowKt.asStateFlow(MutableStateFlow);
        this.overlayHandlers = new ArrayDeque();
        this.defaultHandlers = new ArrayDeque();
        this.unspecifiedInputs = new LinkedHashSet();
        this.defaultInputs = new LinkedHashSet();
        this.overlayInputs = new LinkedHashSet();
    }

    public final void addInput(NavigationEventDispatcher navigationEventDispatcher, NavigationEventInput navigationEventInput, int i) {
        navigationEventDispatcher.getClass();
        if (navigationEventInput.dispatcher == null) {
            (i != 0 ? i != 1 ? this.unspecifiedInputs : this.defaultInputs : this.overlayInputs).add(navigationEventInput);
            navigationEventInput.dispatcher = navigationEventDispatcher;
            ((NavigationEventHistory) this.history.$$delegate_0.getValue()).getClass();
            navigationEventInput.onHasEnabledHandlersChanged(i != 0 ? i != 1 ? this.hasEnabledAnyHandlers : this.hasEnabledDefaultHandlers : this.hasEnabledOverlayHandlers);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(navigationEventInput);
        NavigationEventDispatcher navigationEventDispatcher2 = navigationEventInput.dispatcher;
        sb.append("' is already added to dispatcher ");
        sb.append(navigationEventDispatcher2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void refreshEnabledHandlers() {
        boolean z;
        boolean z2;
        NavigationEventHistory navigationEventHistory;
        ArrayDeque arrayDeque = this.overlayHandlers;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (((NavigationEventHandler) it.next()).isBackEnabled) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        ArrayDeque arrayDeque2 = this.defaultHandlers;
        if (arrayDeque2 == null || !arrayDeque2.isEmpty()) {
            Iterator it2 = arrayDeque2.iterator();
            while (it2.hasNext()) {
                if (((NavigationEventHandler) it2.next()).isBackEnabled) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.hasEnabledOverlayHandlers != z;
        boolean z5 = this.hasEnabledDefaultHandlers != z2;
        boolean z6 = this.hasEnabledAnyHandlers != z3;
        LinkedHashSet linkedHashSet = this.overlayInputs;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((NavigationEventInput) it3.next()).onHasEnabledHandlersChanged(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.defaultInputs;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((NavigationEventInput) it4.next()).onHasEnabledHandlersChanged(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.unspecifiedInputs;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((NavigationEventInput) it5.next()).onHasEnabledHandlersChanged(z3);
            }
        }
        this.hasEnabledOverlayHandlers = z;
        this.hasEnabledDefaultHandlers = z2;
        this.hasEnabledAnyHandlers = z3;
        NavigationEventHandler navigationEventHandler = this.inProgressHandler;
        if (navigationEventHandler == null) {
            navigationEventHandler = resolveEnabledHandler(0);
        }
        NavigationEventHandler navigationEventHandler2 = this.inProgressHandler;
        if (navigationEventHandler2 == null) {
            navigationEventHandler2 = resolveEnabledHandler(0);
        }
        if (Intrinsics.areEqual(navigationEventHandler2, navigationEventHandler)) {
            if (navigationEventHandler2 == null) {
                navigationEventHistory = new NavigationEventHistory();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = arrayDeque.iterator();
                while (it6.hasNext()) {
                    NavigationEventHandler navigationEventHandler3 = (NavigationEventHandler) it6.next();
                    if (navigationEventHandler3.isBackEnabled) {
                        navigationEventHandler3.backInfo.getClass();
                    }
                }
                Iterator<E> it7 = arrayDeque2.iterator();
                while (it7.hasNext()) {
                    NavigationEventHandler navigationEventHandler4 = (NavigationEventHandler) it7.next();
                    if (navigationEventHandler4.isBackEnabled) {
                        navigationEventHandler4.backInfo.getClass();
                    }
                }
                NavigationEventInfo navigationEventInfo = navigationEventHandler2.currentInfo;
                EmptyList emptyList = navigationEventHandler2.forwardInfo;
                navigationEventInfo.getClass();
                emptyList.getClass();
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, createListBuilder);
                createListBuilder.add(navigationEventInfo);
                CollectionsKt__MutableCollectionsKt.addAll(emptyList, createListBuilder);
                navigationEventHistory = new NavigationEventHistory(CollectionsKt__CollectionsJVMKt.build(createListBuilder), arrayList.size());
            }
            StateFlowImpl stateFlowImpl = this._history;
            if (Intrinsics.areEqual((NavigationEventHistory) stateFlowImpl.getValue(), navigationEventHistory)) {
                return;
            }
            stateFlowImpl.updateState(null, navigationEventHistory);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((NavigationEventInput) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((NavigationEventInput) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((NavigationEventInput) it10.next()).getClass();
            }
        }
    }

    public final NavigationEventHandler resolveEnabledHandler(int i) {
        Object obj;
        Object obj2;
        ArrayDeque arrayDeque = this.defaultHandlers;
        ArrayDeque arrayDeque2 = this.overlayHandlers;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = arrayDeque2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((NavigationEventHandler) obj).isBackEnabled) {
                    break;
                }
            }
            NavigationEventHandler navigationEventHandler = (NavigationEventHandler) obj;
            if (navigationEventHandler != null) {
                return navigationEventHandler;
            }
            Iterator it2 = arrayDeque.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((NavigationEventHandler) next).isBackEnabled) {
                    obj3 = next;
                    break;
                }
            }
            return (NavigationEventHandler) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = arrayDeque2.iterator();
            while (it3.hasNext()) {
                ((NavigationEventHandler) it3.next()).getClass();
            }
            Iterator it4 = arrayDeque.iterator();
            while (it4.hasNext()) {
                ((NavigationEventHandler) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = arrayDeque2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((NavigationEventHandler) obj2).isBackEnabled) {
                break;
            }
        }
        NavigationEventHandler navigationEventHandler2 = (NavigationEventHandler) obj2;
        if (navigationEventHandler2 != null) {
            return navigationEventHandler2;
        }
        Iterator it6 = arrayDeque.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((NavigationEventHandler) next2).isBackEnabled) {
                obj3 = next2;
                break;
            }
        }
        return (NavigationEventHandler) obj3;
    }
}
