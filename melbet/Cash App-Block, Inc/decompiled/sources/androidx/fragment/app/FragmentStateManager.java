package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class FragmentStateManager {
    public final FragmentLifecycleCallbacksDispatcher mDispatcher;
    public final Fragment mFragment;
    public final FragmentStore mFragmentStore;
    public boolean mMovingToState = false;
    public int mFragmentManagerState = -1;

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, ClassLoader classLoader, FragmentFactory fragmentFactory, Bundle bundle) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        this.mFragmentStore = fragmentStore;
        Fragment instantiate = ((FragmentState) bundle.getParcelable("state")).instantiate(fragmentFactory, classLoader);
        this.mFragment = instantiate;
        instantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        instantiate.setArguments(bundle2);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + instantiate);
        }
    }

    public final void activityCreated() {
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.mFragment;
        if (isLoggingEnabled) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mDispatcher.dispatchOnFragmentActivityCreated(fragment, false);
    }

    public final void addViewToContainer() {
        Fragment fragment;
        View view;
        View view2;
        Fragment fragment2 = this.mFragment;
        View view3 = fragment2.mContainer;
        while (true) {
            fragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            Fragment fragment3 = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment3 != null) {
                fragment = fragment3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        Fragment parentFragment = fragment2.getParentFragment();
        if (fragment != null && !fragment.equals(parentFragment)) {
            int i = fragment2.mContainerId;
            FragmentStrictMode.Policy policy = FragmentStrictMode.defaultPolicy;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(fragment2);
            sb.append(" within the view of parent fragment ");
            sb.append(fragment);
            sb.append(" via container with ID ");
            WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment2, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, " without using parent's childFragmentManager", sb));
            FragmentStrictMode.logIfDebuggingEnabled(wrongNestedHierarchyViolation);
            FragmentStrictMode.Policy nearestPolicy = FragmentStrictMode.getNearestPolicy(fragment2);
            if (nearestPolicy.flags.contains(FragmentStrictMode.Flag.DETECT_WRONG_NESTED_HIERARCHY) && FragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment2.getClass(), WrongNestedHierarchyViolation.class)) {
                FragmentStrictMode.handlePolicyViolation(nearestPolicy, wrongNestedHierarchyViolation);
            }
        }
        ArrayList arrayList = this.mFragmentStore.mAdded;
        ViewGroup viewGroup = fragment2.mContainer;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(fragment2);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment4 = (Fragment) arrayList.get(indexOf);
                        if (fragment4.mContainer == viewGroup && (view = fragment4.mView) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment5 = (Fragment) arrayList.get(i3);
                    if (fragment5.mContainer == viewGroup && (view2 = fragment5.mView) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        fragment2.mContainer.addView(fragment2.mView, i2);
    }

    public final void attach() {
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.mFragment;
        if (isLoggingEnabled) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        FragmentStateManager fragmentStateManager = null;
        FragmentStore fragmentStore = this.mFragmentStore;
        if (fragment2 != null) {
            FragmentStateManager fragmentStateManager2 = (FragmentStateManager) fragmentStore.mActive.get(fragment2.mWho);
            if (fragmentStateManager2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                Fragment fragment3 = fragment.mTarget;
                sb.append(" declared target fragment ");
                sb.append(fragment3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            fragmentStateManager = fragmentStateManager2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (fragmentStateManager = (FragmentStateManager) fragmentStore.mActive.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (fragmentStateManager != null) {
            fragmentStateManager.moveToExpectedState();
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        fragment.mHost = fragmentManager.mHost;
        fragment.mParentFragment = fragmentManager.mParent;
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
        fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentPreAttached(fragment, false);
        fragment.performAttach();
        fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentAttached(fragment, false);
    }

    public final int computeExpectedState() {
        Fragment fragment = this.mFragment;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.mFragmentManagerState;
        int ordinal = fragment.mMaxState.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (fragment.mFromLayout) {
            boolean z = fragment.mInLayout;
            int i2 = this.mFragmentManagerState;
            if (z) {
                i = Math.max(i2, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = i2 < 4 ? Math.min(i, fragment.mState) : Math.min(i, 1);
            }
        }
        if (fragment.mInDynamicContainer && fragment.mContainer == null) {
            i = Math.min(i, 4);
        }
        if (!fragment.mAdded) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            DefaultSpecialEffectsController orCreateController = DefaultSpecialEffectsController.getOrCreateController(viewGroup, fragment.getParentFragmentManager());
            SpecialEffectsController$FragmentStateManagerOperation findPendingOperation = orCreateController.findPendingOperation(fragment);
            int i3 = findPendingOperation != null ? findPendingOperation.lifecycleImpact : 0;
            SpecialEffectsController$FragmentStateManagerOperation findRunningOperation = orCreateController.findRunningOperation(fragment);
            r3 = findRunningOperation != null ? findRunningOperation.lifecycleImpact : 0;
            int i4 = i3 == 0 ? -1 : SpecialEffectsController$WhenMappings.$EnumSwitchMapping$0[CameraSelector$$ExternalSyntheticOutline0.ordinal(i3)];
            if (i4 != -1 && i4 != 1) {
                r3 = i3;
            }
        }
        if (r3 == 2) {
            i = Math.min(i, 6);
        } else if (r3 == 3) {
            i = Math.max(i, 3);
        } else if (fragment.mRemoving) {
            i = fragment.isInBackStack() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            i = Math.min(i, 4);
        }
        if (fragment.mTransitioning) {
            i = Math.max(i, 3);
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + fragment);
        }
        return i;
    }

    public final void create() {
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.mFragment;
        if (isLoggingEnabled) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
            fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentPreCreated(fragment, false);
            fragment.performCreate(bundle2);
            fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentCreated(fragment, false);
        }
    }

    public final void createView() {
        String str;
        Fragment fragment = this.mFragment;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    a$$ExternalSyntheticBUOutline0.m$3(Fragment$5$$ExternalSyntheticOutline0.m("Cannot create fragment ", fragment, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.mContainer.onFindViewById(i);
                if (viewGroup == null) {
                    if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                        try {
                            str = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.Policy policy = FragmentStrictMode.defaultPolicy;
                    WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
                    FragmentStrictMode.logIfDebuggingEnabled(wrongFragmentContainerViolation);
                    FragmentStrictMode.Policy nearestPolicy = FragmentStrictMode.getNearestPolicy(fragment);
                    if (nearestPolicy.flags.contains(FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && FragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), WrongFragmentContainerViolation.class)) {
                        FragmentStrictMode.handlePolicyViolation(nearestPolicy, wrongFragmentContainerViolation);
                    }
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                addViewToContainer();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            boolean isAttachedToWindow = fragment.mView.isAttachedToWindow();
            final View view = fragment.mView;
            if (isAttachedToWindow) {
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                view.requestApplyInsets();
            } else {
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentStateManager.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view2) {
                        View view3 = view;
                        view3.removeOnAttachStateChangeListener(this);
                        WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                        view3.requestApplyInsets();
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view2) {
                    }
                });
            }
            fragment.performViewCreated();
            this.mDispatcher.dispatchOnFragmentViewCreated(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(RecyclerView.DECELERATION_RATE);
            }
        }
        fragment.mState = 2;
    }

    public final void destroy() {
        Fragment findActiveFragment;
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.mFragment;
        if (isLoggingEnabled) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        FragmentStore fragmentStore = this.mFragmentStore;
        if (z2 && !fragment.mBeingSaved) {
            fragmentStore.setSavedState(null, fragment.mWho);
        }
        if (!z2) {
            FragmentManagerViewModel fragmentManagerViewModel = fragmentStore.mNonConfig;
            if (!((fragmentManagerViewModel.mRetainedFragments.containsKey(fragment.mWho) && fragmentManagerViewModel.mStateAutomaticallySaved) ? fragmentManagerViewModel.mHasBeenCleared : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (findActiveFragment = fragmentStore.findActiveFragment(str)) != null && findActiveFragment.mRetainInstance) {
                    fragment.mTarget = findActiveFragment;
                }
                fragment.mState = 0;
                return;
            }
        }
        FragmentHostCallback fragmentHostCallback = fragment.mHost;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            z = fragmentStore.mNonConfig.mHasBeenCleared;
        } else {
            FragmentActivity fragmentActivity = fragmentHostCallback.context;
            if (fragmentActivity != null) {
                z = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if ((z2 && !fragment.mBeingSaved) || z) {
            fragmentStore.mNonConfig.clearNonConfigState(fragment, false);
        }
        fragment.performDestroy();
        this.mDispatcher.dispatchOnFragmentDestroyed(fragment, false);
        Iterator it = fragmentStore.getActiveFragmentStateManagers().iterator();
        while (it.hasNext()) {
            FragmentStateManager fragmentStateManager = (FragmentStateManager) it.next();
            if (fragmentStateManager != null) {
                Fragment fragment2 = fragmentStateManager.mFragment;
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str2 = fragment.mTargetWho;
        if (str2 != null) {
            fragment.mTarget = fragmentStore.findActiveFragment(str2);
        }
        fragmentStore.makeInactive(this);
    }

    public final void destroyFragmentView() {
        View view;
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.mFragment;
        if (isLoggingEnabled) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.mDispatcher.dispatchOnFragmentViewDestroyed(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    public final void detach() {
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.mFragment;
        if (isLoggingEnabled) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        this.mDispatcher.dispatchOnFragmentDetached(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            FragmentManagerViewModel fragmentManagerViewModel = this.mFragmentStore.mNonConfig;
            if (!((fragmentManagerViewModel.mRetainedFragments.containsKey(fragment.mWho) && fragmentManagerViewModel.mStateAutomaticallySaved) ? fragmentManagerViewModel.mHasBeenCleared : true)) {
                return;
            }
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void ensureInflatedView() {
        Fragment fragment = this.mFragment;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.mDispatcher.dispatchOnFragmentViewCreated(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    public final Fragment getFragment() {
        return this.mFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ad, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void moveToExpectedState() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.mMovingToState;
        Fragment fragment = this.mFragment;
        if (z) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.mMovingToState = true;
            boolean z2 = false;
            while (true) {
                int computeExpectedState = computeExpectedState();
                int i = fragment.mState;
                int i2 = 3;
                FragmentStore fragmentStore = this.mFragmentStore;
                if (computeExpectedState == i) {
                    if (!z2 && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (FragmentManager.isLoggingEnabled(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        fragmentStore.mNonConfig.clearNonConfigState(fragment, true);
                        fragmentStore.makeInactive(this);
                        if (FragmentManager.isLoggingEnabled(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            DefaultSpecialEffectsController orCreateController = DefaultSpecialEffectsController.getOrCreateController(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                orCreateController.enqueue(3, 1, this);
                            } else {
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                orCreateController.enqueue(2, 1, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null && fragment.mAdded && FragmentManager.isMenuAvailable(fragment)) {
                            fragmentManager.mNeedMenuInvalidate = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.dispatchOnHiddenChanged();
                    }
                    this.mMovingToState = false;
                    return;
                }
                FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
                if (computeExpectedState <= i) {
                    switch (i - 1) {
                        case -1:
                            detach();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (((Bundle) fragmentStore.mSavedState.get(fragment.mWho)) == null) {
                                    fragmentStore.setSavedState(saveState(), fragment.mWho);
                                }
                            }
                            destroy();
                            break;
                        case 1:
                            destroyFragmentView();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.mBeingSaved) {
                                fragmentStore.setSavedState(saveState(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                saveViewState();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                DefaultSpecialEffectsController orCreateController2 = DefaultSpecialEffectsController.getOrCreateController(viewGroup2, fragment.getParentFragmentManager());
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                }
                                orCreateController2.enqueue(1, 3, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fragment);
                            }
                            fragment.performStop();
                            fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentStopped(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
                            }
                            fragment.performPause();
                            fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentPaused(fragment, false);
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            attach();
                            break;
                        case 1:
                            create();
                            break;
                        case 2:
                            ensureInflatedView();
                            createView();
                            break;
                        case 3:
                            activityCreated();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                DefaultSpecialEffectsController orCreateController3 = DefaultSpecialEffectsController.getOrCreateController(viewGroup3, fragment.getParentFragmentManager());
                                int visibility = fragment.mView.getVisibility();
                                if (visibility == 0) {
                                    i2 = 2;
                                } else if (visibility == 4) {
                                    i2 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment);
                                }
                                orCreateController3.enqueue(i2, 2, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.performStart();
                            fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentStarted(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            resume();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.mMovingToState = false;
            throw th;
        }
    }

    public final void restoreState(ClassLoader classLoader) {
        Fragment fragment = this.mFragment;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable("state");
            if (fragmentState != null) {
                fragment.mTargetWho = fragmentState.mTargetWho;
                fragment.mTargetRequestCode = fragmentState.mTargetRequestCode;
                Boolean bool = fragment.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment.mUserVisibleHint = bool.booleanValue();
                    fragment.mSavedUserVisibleHint = null;
                } else {
                    fragment.mUserVisibleHint = fragmentState.mUserVisibleHint;
                }
            }
            if (fragment.mUserVisibleHint) {
                return;
            }
            fragment.mDeferStart = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e);
        }
    }

    public final void resume() {
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.mFragment;
        if (isLoggingEnabled) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView != fragment.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != fragment.mView) {
                    }
                }
            }
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(fragment);
                sb.append(" resulting in focused view ");
                sb.append(fragment.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.mDispatcher.dispatchOnFragmentResumed(fragment, false);
        this.mFragmentStore.setSavedState(null, fragment.mWho);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Fragment.SavedState saveInstanceState() {
        if (this.mFragment.mState > -1) {
            return new Fragment.SavedState(saveState());
        }
        return null;
    }

    public final Bundle saveState() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.mFragment;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(fragment));
        if (fragment.mState > 0) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.mDispatcher.dispatchOnFragmentSaveInstanceState(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.performSave(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle saveAllStateInternal = fragment.mChildFragmentManager.saveAllStateInternal();
            if (!saveAllStateInternal.isEmpty()) {
                bundle2.putBundle("childFragmentManager", saveAllStateInternal);
            }
            if (fragment.mView != null) {
                saveViewState();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void saveViewState() {
        Fragment fragment = this.mFragment;
        if (fragment.mView == null) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.mSavedStateRegistryController.performSave(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public final void setFragmentManagerState(int i) {
        this.mFragmentManagerState = i;
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, Fragment fragment) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        this.mFragmentStore = fragmentStore;
        this.mFragment = fragment;
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, Fragment fragment, Bundle bundle) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        this.mFragmentStore = fragmentStore;
        this.mFragment = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
