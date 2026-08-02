package androidx.compose.runtime.internal;

import android.os.Trace;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.GapRememberObserverHolder;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.SourceInformationKt;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import dev.zacsweers.metro.Provider;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class RememberEventDispatcher {
    public Object abandoning;
    public Object currentRememberingList;
    public Object ignoreLeavingSet;
    public final Object leaving;
    public Object nestedRemembersLists;
    public Object pausedPlaceholders;
    public Object releasing;
    public Object rememberSet;
    public final Object remembering;
    public final Object sideEffects;
    public Object traceContext;

    public RememberEventDispatcher() {
        MutableVector mutableVector = new MutableVector(0, new RememberObserverHolder[16]);
        this.remembering = mutableVector;
        MutableScatterSet mutableScatterSet = ScatterSetKt.EmptyScatterSet;
        this.rememberSet = new MutableScatterSet();
        this.currentRememberingList = mutableVector;
        this.leaving = new MutableVector(0, new Object[16]);
        this.sideEffects = new MutableVector(0, new Function0[16]);
    }

    public static final boolean forgetting$removeFrom(RememberObserverHolder rememberObserverHolder, MutableVector mutableVector) {
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            RememberObserver rememberObserver = ((GapRememberObserverHolder) ((RememberObserverHolder) objArr[i2])).wrapped;
            if (rememberObserver instanceof PausedCompositionRemembers) {
                MutableVector pausedRemembers = ((PausedCompositionRemembers) rememberObserver).getPausedRemembers();
                if (pausedRemembers.remove(rememberObserverHolder) || forgetting$removeFrom(rememberObserverHolder, pausedRemembers)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void clear() {
        this.abandoning = null;
        this.traceContext = null;
        MutableVector mutableVector = (MutableVector) this.remembering;
        mutableVector.clear();
        ((MutableScatterSet) this.rememberSet).clear();
        this.currentRememberingList = mutableVector;
        ((MutableVector) this.leaving).clear();
        ((MutableVector) this.sideEffects).clear();
        this.releasing = null;
        this.pausedPlaceholders = null;
        this.nestedRemembersLists = null;
    }

    public void dispatchAbandons() {
        Set set = (Set) this.abandoning;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                RememberObserver rememberObserver = (RememberObserver) it.next();
                it.remove();
                rememberObserver.onAbandoned();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void dispatchRememberObservers() {
        MutableVector mutableVector = (MutableVector) this.remembering;
        MutableVector mutableVector2 = (MutableVector) this.leaving;
        Set set = (Set) this.abandoning;
        if (set == null) {
            return;
        }
        this.ignoreLeavingSet = null;
        int i = 24;
        if (mutableVector2.size != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                MutableScatterSet mutableScatterSet = (MutableScatterSet) this.releasing;
                int i2 = mutableVector2.size;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = mutableVector2.content[i2];
                    try {
                        if (obj instanceof RememberObserverHolder) {
                            RememberObserver rememberObserver = ((GapRememberObserverHolder) ((RememberObserverHolder) obj)).wrapped;
                            set.remove(rememberObserver);
                            rememberObserver.onForgotten();
                        }
                        if (obj instanceof ComposeNodeLifecycleCallback) {
                            if (mutableScatterSet == null || !mutableScatterSet.contains(obj)) {
                                ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                            } else {
                                ((ComposeNodeLifecycleCallback) obj).onRelease();
                            }
                        }
                    } catch (Throwable th) {
                        CompositionErrorContext compositionErrorContext = (CompositionErrorContext) this.traceContext;
                        if (compositionErrorContext != null) {
                            SourceInformationKt.tryAttachComposeStackTrace(th, new DialogHostKt$$ExternalSyntheticLambda0(i, (CompositionErrorContextImpl) compositionErrorContext, obj));
                        }
                        throw th;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (mutableVector.size != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.abandoning;
                if (set2 != null) {
                    Object[] objArr = mutableVector.content;
                    int i3 = mutableVector.size;
                    for (int i4 = 0; i4 < i3; i4++) {
                        RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) objArr[i4];
                        RememberObserver rememberObserver2 = ((GapRememberObserverHolder) rememberObserverHolder).wrapped;
                        set2.remove(rememberObserver2);
                        try {
                            rememberObserver2.onRemembered();
                        } catch (Throwable th2) {
                            CompositionErrorContext compositionErrorContext2 = (CompositionErrorContext) this.traceContext;
                            if (compositionErrorContext2 != null) {
                                SourceInformationKt.tryAttachComposeStackTrace(th2, new DialogHostKt$$ExternalSyntheticLambda0(i, (CompositionErrorContextImpl) compositionErrorContext2, rememberObserverHolder));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void dispatchSideEffects() {
        MutableVector mutableVector = (MutableVector) this.sideEffects;
        if (mutableVector.size != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = mutableVector.content;
                int i = mutableVector.size;
                for (int i2 = 0; i2 < i; i2++) {
                    ((Function0) objArr[i2]).invoke();
                }
                mutableVector.clear();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void forgetting(RememberObserverHolder rememberObserverHolder) {
        MutableVector mutableVector = (MutableVector) this.remembering;
        if (!((MutableScatterSet) this.rememberSet).contains(rememberObserverHolder)) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) this.ignoreLeavingSet;
            if (mutableScatterSet == null || !mutableScatterSet.contains(rememberObserverHolder)) {
                ((MutableVector) this.leaving).add(rememberObserverHolder);
                return;
            }
            return;
        }
        ((MutableScatterSet) this.rememberSet).remove(rememberObserverHolder);
        if (!((MutableVector) this.currentRememberingList).remove(rememberObserverHolder) && !mutableVector.remove(rememberObserverHolder)) {
            forgetting$removeFrom(rememberObserverHolder, mutableVector);
        }
        Set set = (Set) this.abandoning;
        if (set == null) {
            return;
        }
        set.add(((GapRememberObserverHolder) rememberObserverHolder).wrapped);
    }

    public void prepare(Set set, CompositionErrorContextImpl compositionErrorContextImpl) {
        clear();
        this.abandoning = set;
        this.traceContext = compositionErrorContextImpl;
    }

    public /* synthetic */ RememberEventDispatcher(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11) {
        this.abandoning = provider;
        this.traceContext = provider2;
        this.remembering = provider3;
        this.currentRememberingList = provider4;
        this.leaving = provider5;
        this.sideEffects = provider6;
        this.rememberSet = provider7;
        this.releasing = provider8;
        this.ignoreLeavingSet = provider9;
        this.pausedPlaceholders = provider10;
        this.nestedRemembersLists = provider11;
    }
}
