package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class FragmentStore {
    public FragmentManagerViewModel mNonConfig;
    public final ArrayList mAdded = new ArrayList();
    public final HashMap mActive = new HashMap();
    public final HashMap mSavedState = new HashMap();

    public final void addFragment(Fragment fragment) {
        if (this.mAdded.contains(fragment)) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1(fragment, "Fragment already added: ");
            return;
        }
        synchronized (this.mAdded) {
            this.mAdded.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment findActiveFragment(String str) {
        FragmentStateManager fragmentStateManager = (FragmentStateManager) this.mActive.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager.getFragment();
        }
        return null;
    }

    public final Fragment findFragmentByWho(String str) {
        Fragment findFragmentByWho;
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null && (findFragmentByWho = fragmentStateManager.getFragment().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList getActiveFragmentStateManagers() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager);
            }
        }
        return arrayList;
    }

    public final ArrayList getActiveFragments() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager.getFragment());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List getFragments() {
        ArrayList arrayList;
        if (this.mAdded.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.mAdded) {
            arrayList = new ArrayList(this.mAdded);
        }
        return arrayList;
    }

    public final void makeActive(FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.getFragment();
        String str = fragment.mWho;
        HashMap hashMap = this.mActive;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(fragment.mWho, fragmentStateManager);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            boolean z = fragment.mRetainInstance;
            FragmentManagerViewModel fragmentManagerViewModel = this.mNonConfig;
            if (z) {
                fragmentManagerViewModel.addRetainedFragment(fragment);
            } else {
                fragmentManagerViewModel.removeRetainedFragment(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void makeInactive(FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.getFragment();
        if (fragment.mRetainInstance) {
            this.mNonConfig.removeRetainedFragment(fragment);
        }
        String str = fragment.mWho;
        HashMap hashMap = this.mActive;
        if (hashMap.get(str) == fragmentStateManager && ((FragmentStateManager) hashMap.put(fragment.mWho, null)) != null && FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final Bundle setSavedState(Bundle bundle, String str) {
        HashMap hashMap = this.mSavedState;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }
}
