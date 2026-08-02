package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import coil3.size.SizeKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt__SequencesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "<init>", "()V", "CallbackAndContract", "LifecycleContainer", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {
    public final LinkedHashMap rcToKey = new LinkedHashMap();
    public final LinkedHashMap keyToRc = new LinkedHashMap();
    public final LinkedHashMap keyToLifecycleContainers = new LinkedHashMap();
    public final ArrayList launchedKeys = new ArrayList();
    public final transient LinkedHashMap keyToCallback = new LinkedHashMap();
    public final LinkedHashMap parsedPendingResults = new LinkedHashMap();
    public final Bundle pendingResults = new Bundle();

    public final class CallbackAndContract {
        public final ActivityResultCallback callback;
        public final ActivityResultContract contract;

        public CallbackAndContract(ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
            activityResultCallback.getClass();
            activityResultContract.getClass();
            this.callback = activityResultCallback;
            this.contract = activityResultContract;
        }
    }

    public final class LifecycleContainer {
        public final Lifecycle lifecycle;
        public final ArrayList observers = new ArrayList();

        public LifecycleContainer(Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
        }
    }

    public final boolean dispatchResult(int i, int i2, Intent intent) {
        String str = (String) this.rcToKey.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        CallbackAndContract callbackAndContract = (CallbackAndContract) this.keyToCallback.get(str);
        if ((callbackAndContract != null ? callbackAndContract.callback : null) != null) {
            ArrayList arrayList = this.launchedKeys;
            if (arrayList.contains(str)) {
                callbackAndContract.callback.onActivityResult(callbackAndContract.contract.parseResult(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.parsedPendingResults.remove(str);
        this.pendingResults.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }

    public abstract void onLaunch(int i, ActivityResultContract activityResultContract, Object obj);

    public final ActivityResultRegistry$register$2 register(final String str, LifecycleOwner lifecycleOwner, final ActivityResultContract activityResultContract, final ActivityResultCallback activityResultCallback) {
        str.getClass();
        activityResultContract.getClass();
        activityResultCallback.getClass();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(lifecycleOwner);
            Lifecycle.State currentState = lifecycle.getCurrentState();
            sb.append(" is attempting to register while current state is ");
            sb.append(currentState);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        registerKey(str);
        LinkedHashMap linkedHashMap = this.keyToLifecycleContainers;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) linkedHashMap.get(str);
        if (lifecycleContainer == null) {
            lifecycleContainer = new LifecycleContainer(lifecycle);
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Lifecycle.Event event2 = Lifecycle.Event.ON_START;
                ActivityResultRegistry activityResultRegistry = ActivityResultRegistry.this;
                String str2 = str;
                if (event2 != event) {
                    if (Lifecycle.Event.ON_STOP == event) {
                        activityResultRegistry.keyToCallback.remove(str2);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY == event) {
                            activityResultRegistry.unregister$activity(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = activityResultRegistry.keyToCallback;
                Bundle bundle = activityResultRegistry.pendingResults;
                LinkedHashMap linkedHashMap3 = activityResultRegistry.parsedPendingResults;
                ActivityResultContract activityResultContract2 = activityResultContract;
                ActivityResultCallback activityResultCallback2 = activityResultCallback;
                linkedHashMap2.put(str2, new ActivityResultRegistry.CallbackAndContract(activityResultContract2, activityResultCallback2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    activityResultCallback2.onActivityResult(obj);
                }
                ActivityResult activityResult = (ActivityResult) SizeKt.getParcelable(bundle, str2, ActivityResult.class);
                if (activityResult != null) {
                    bundle.remove(str2);
                    activityResultCallback2.onActivityResult(activityResultContract2.parseResult(activityResult.resultCode, activityResult.data));
                }
            }
        };
        lifecycleContainer.lifecycle.addObserver(lifecycleEventObserver);
        lifecycleContainer.observers.add(lifecycleEventObserver);
        linkedHashMap.put(str, lifecycleContainer);
        return new ActivityResultRegistry$register$2(this, str, activityResultContract, 0);
    }

    public final void registerKey(String str) {
        LinkedHashMap linkedHashMap = this.keyToRc;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = SequencesKt__SequencesKt.generateSequence(new InvalidationTracker$$ExternalSyntheticLambda0(4)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.rcToKey;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Sequence contains no element matching the predicate.");
    }

    public final void unregister$activity(String str) {
        Integer num;
        str.getClass();
        if (!this.launchedKeys.contains(str) && (num = (Integer) this.keyToRc.remove(str)) != null) {
            this.rcToKey.remove(num);
        }
        this.keyToCallback.remove(str);
        LinkedHashMap linkedHashMap = this.parsedPendingResults;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Dropping pending result for request ", str, ": ");
            m3m.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", m3m.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.pendingResults;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) SizeKt.getParcelable(bundle, str, ActivityResult.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.keyToLifecycleContainers;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) linkedHashMap2.get(str);
        if (lifecycleContainer != null) {
            ArrayList arrayList = lifecycleContainer.observers;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                lifecycleContainer.lifecycle.removeObserver((LifecycleEventObserver) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }

    public final ActivityResultRegistry$register$2 register(String str, ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        str.getClass();
        activityResultContract.getClass();
        registerKey(str);
        this.keyToCallback.put(str, new CallbackAndContract(activityResultContract, activityResultCallback));
        LinkedHashMap linkedHashMap = this.parsedPendingResults;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        Bundle bundle = this.pendingResults;
        ActivityResult activityResult = (ActivityResult) SizeKt.getParcelable(bundle, str, ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.resultCode, activityResult.data));
        }
        return new ActivityResultRegistry$register$2(this, str, activityResultContract, 1);
    }
}
