package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistry$register$2;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentState;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.common.util.TimedValueQueue;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzf;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    public FragmentContainer mContainer;
    public ArrayList mCreatedMenus;
    public boolean mDestroyed;
    public boolean mExecutingActions;
    public boolean mHavePendingDeferredStart;
    public FragmentHostCallback mHost;
    public boolean mNeedMenuInvalidate;
    public FragmentManagerViewModel mNonConfig;
    public OnBackPressedDispatcher mOnBackPressedDispatcher;
    public final FragmentManager$$ExternalSyntheticLambda0 mOnConfigurationChangedListener;
    public final FragmentManager$$ExternalSyntheticLambda0 mOnMultiWindowModeChangedListener;
    public final FragmentManager$$ExternalSyntheticLambda0 mOnPictureInPictureModeChangedListener;
    public final FragmentManager$$ExternalSyntheticLambda0 mOnTrimMemoryListener;
    public Fragment mParent;
    public Fragment mPrimaryNav;
    public ActivityResultRegistry$register$2 mRequestPermissions;
    public ActivityResultRegistry$register$2 mStartActivityForResult;
    public ActivityResultRegistry$register$2 mStartIntentSenderForResult;
    public boolean mStateSaved;
    public boolean mStopped;
    public ArrayList mTmpAddedFragments;
    public ArrayList mTmpIsPop;
    public ArrayList mTmpRecords;
    public final ArrayList mPendingActions = new ArrayList();
    public final FragmentStore mFragmentStore = new FragmentStore();
    public ArrayList mBackStack = new ArrayList();
    public final FragmentLayoutInflaterFactory mLayoutInflaterFactory = new FragmentLayoutInflaterFactory(this);
    public BackStackRecord mTransitioningOp = null;
    public boolean mHandlingTransitioningOp = false;
    public final AnonymousClass1 mOnBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.fragment.app.FragmentManager.1
        @Override // androidx.activity.OnBackPressedCallback
        public final void handleOnBackCancelled() {
            boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (isLoggingEnabled) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "cancelBackStackTransition for transition " + fragmentManager.mTransitioningOp);
            }
            BackStackRecord backStackRecord = fragmentManager.mTransitioningOp;
            if (backStackRecord != null) {
                backStackRecord.mCommitted = false;
                backStackRecord.collapseOps();
                BackStackRecord backStackRecord2 = fragmentManager.mTransitioningOp;
                Fragment$$ExternalSyntheticLambda1 fragment$$ExternalSyntheticLambda1 = new Fragment$$ExternalSyntheticLambda1(fragmentManager, 4);
                if (backStackRecord2.mCommitRunnables == null) {
                    backStackRecord2.mCommitRunnables = new ArrayList();
                }
                backStackRecord2.mCommitRunnables.add(fragment$$ExternalSyntheticLambda1);
                fragmentManager.mTransitioningOp.commit();
                fragmentManager.mHandlingTransitioningOp = true;
                fragmentManager.execPendingActions(true);
                Iterator it = fragmentManager.collectAllSpecialEffectsController().iterator();
                while (it.hasNext()) {
                    ((DefaultSpecialEffectsController) it.next()).forcePostponedExecutePendingOperations();
                }
                fragmentManager.mHandlingTransitioningOp = false;
                fragmentManager.mTransitioningOp = null;
            }
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void handleOnBackPressed() {
            boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (isLoggingEnabled) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            AnonymousClass1 anonymousClass1 = fragmentManager.mOnBackPressedCallback;
            ArrayList arrayList = fragmentManager.mBackStackChangeListeners;
            fragmentManager.mHandlingTransitioningOp = true;
            fragmentManager.execPendingActions(true);
            fragmentManager.mHandlingTransitioningOp = false;
            if (fragmentManager.mTransitioningOp == null) {
                if (anonymousClass1.isEnabled()) {
                    if (FragmentManager.isLoggingEnabled(3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    fragmentManager.popBackStackImmediate();
                    return;
                } else {
                    if (FragmentManager.isLoggingEnabled(3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    fragmentManager.mOnBackPressedDispatcher.onBackPressed();
                    return;
                }
            }
            if (!arrayList.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(FragmentManager.fragmentsFromRecord(fragmentManager.mTransitioningOp));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    OnBackStackChangedListener onBackStackChangedListener = (OnBackStackChangedListener) it.next();
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        onBackStackChangedListener.onBackStackChangeCommitted((Fragment) it2.next(), true);
                    }
                }
            }
            Iterator it3 = fragmentManager.mTransitioningOp.mOps.iterator();
            while (it3.hasNext()) {
                Fragment fragment = ((FragmentTransaction.Op) it3.next()).mFragment;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            Iterator it4 = fragmentManager.collectChangedControllers(new ArrayList(Collections.singletonList(fragmentManager.mTransitioningOp)), 0, 1).iterator();
            while (it4.hasNext()) {
                ((DefaultSpecialEffectsController) it4.next()).completeBack();
            }
            Iterator it5 = fragmentManager.mTransitioningOp.mOps.iterator();
            while (it5.hasNext()) {
                Fragment fragment2 = ((FragmentTransaction.Op) it5.next()).mFragment;
                if (fragment2 != null && fragment2.mContainer == null) {
                    fragmentManager.createOrGetFragmentStateManager(fragment2).moveToExpectedState();
                }
            }
            fragmentManager.mTransitioningOp = null;
            fragmentManager.updateOnBackPressedCallbackEnabled();
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + anonymousClass1.isEnabled() + " for  FragmentManager " + fragmentManager);
            }
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void handleOnBackProgressed(BackEventCompat backEventCompat) {
            boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(2);
            FragmentManager fragmentManager = FragmentManager.this;
            if (isLoggingEnabled) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            if (fragmentManager.mTransitioningOp != null) {
                Iterator it = fragmentManager.collectChangedControllers(new ArrayList(Collections.singletonList(fragmentManager.mTransitioningOp)), 0, 1).iterator();
                while (it.hasNext()) {
                    ((DefaultSpecialEffectsController) it.next()).processProgress(backEventCompat);
                }
                Iterator it2 = fragmentManager.mBackStackChangeListeners.iterator();
                while (it2.hasNext()) {
                    ((OnBackStackChangedListener) it2.next()).getClass();
                }
            }
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void handleOnBackStarted(BackEventCompat backEventCompat) {
            boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (isLoggingEnabled) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            fragmentManager.endAnimatingAwayFragments();
            fragmentManager.enqueueAction(fragmentManager.new PrepareBackStackTransitionState(), false);
        }
    };
    public final AtomicInteger mBackStackIndex = new AtomicInteger();
    public final Map mBackStackStates = Collections.synchronizedMap(new HashMap());
    public final Map mResults = Collections.synchronizedMap(new HashMap());
    public final Map mResultListeners = Collections.synchronizedMap(new HashMap());
    public final ArrayList mBackStackChangeListeners = new ArrayList();
    public final FragmentLifecycleCallbacksDispatcher mLifecycleCallbacksDispatcher = new FragmentLifecycleCallbacksDispatcher(this);
    public final CopyOnWriteArrayList mOnAttachListeners = new CopyOnWriteArrayList();
    public final AnonymousClass2 mMenuProvider = new MenuProvider() { // from class: androidx.fragment.app.FragmentManager.2
        @Override // androidx.core.view.MenuProvider
        public final void onCreateMenu(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.dispatchCreateOptionsMenu(menu, menuInflater);
        }

        @Override // androidx.core.view.MenuProvider
        public final void onMenuClosed(Menu menu) {
            FragmentManager.this.dispatchOptionsMenuClosed(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public final boolean onMenuItemSelected(MenuItem menuItem) {
            return FragmentManager.this.dispatchOptionsItemSelected(menuItem);
        }

        @Override // androidx.core.view.MenuProvider
        public final void onPrepareMenu(Menu menu) {
            FragmentManager.this.dispatchPrepareOptionsMenu(menu);
        }
    };
    public int mCurState = -1;
    public FragmentFactory mFragmentFactory = null;
    public final AnonymousClass3 mHostFragmentFactory = new FragmentFactory() { // from class: androidx.fragment.app.FragmentManager.3
        @Override // androidx.fragment.app.FragmentFactory
        public final Fragment instantiate(ClassLoader classLoader, String str) {
            return Fragment.instantiate(FragmentManager.this.mHost.context, str, null);
        }
    };
    public final zzf mDefaultSpecialEffectsControllerFactory = new zzf(5);
    public ArrayDeque mLaunchedFragments = new ArrayDeque();
    public final AnonymousClass5 mExecCommit = new Runnable() { // from class: androidx.fragment.app.FragmentManager.5
        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.execPendingActions(true);
        }
    };

    public interface BackStackEntry {
    }

    public static class FragmentIntentSenderContract extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    TimedValueQueue timedValueQueue = new TimedValueQueue(intentSenderRequest.getIntentSender());
                    timedValueQueue.setFillInIntent(null);
                    timedValueQueue.setFlags(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask());
                    intentSenderRequest = timedValueQueue.build();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class FragmentLifecycleCallbacks {
        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view) {
        }
    }

    /* loaded from: classes3.dex */
    public final class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new FragmentState.AnonymousClass1(18);
        public int mRequestCode;
        public String mWho;

        public LaunchedFragmentInfo(String str, int i) {
            this.mWho = str;
            this.mRequestCode = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mWho);
            parcel.writeInt(this.mRequestCode);
        }
    }

    /* loaded from: classes3.dex */
    public final class LifecycleAwareResultListener implements FragmentResultListener {
        public final Lifecycle mLifecycle;
        public final FragmentResultListener mListener;
        public final AnonymousClass6 mObserver;

        public LifecycleAwareResultListener(Lifecycle lifecycle, FragmentResultListener fragmentResultListener, AnonymousClass6 anonymousClass6) {
            this.mLifecycle = lifecycle;
            this.mListener = fragmentResultListener;
            this.mObserver = anonymousClass6;
        }

        @Override // androidx.fragment.app.FragmentResultListener
        public final void onFragmentResult(Bundle bundle, String str) {
            this.mListener.onFragmentResult(bundle, str);
        }

        public final void removeObserver() {
            this.mLifecycle.removeObserver(this.mObserver);
        }
    }

    /* loaded from: classes3.dex */
    public interface OnBackStackChangedListener {
        default void onBackStackChangeCommitted(Fragment fragment, boolean z) {
        }

        default void onBackStackChangeStarted(Fragment fragment, boolean z) {
        }

        void onBackStackChanged();
    }

    public interface OpGenerator {
        boolean generateOps(ArrayList arrayList, ArrayList arrayList2);
    }

    /* loaded from: classes3.dex */
    public final class PopBackStackState implements OpGenerator {
        public final int mFlags;
        public final int mId;
        public final String mName;

        public PopBackStackState(String str, int i, int i2) {
            this.mName = str;
            this.mId = i;
            this.mFlags = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean generateOps(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManager.this.mPrimaryNav;
            if (fragment != null && this.mId < 0 && this.mName == null && fragment.getChildFragmentManager().popBackStackImmediate(-1, 0)) {
                return false;
            }
            return FragmentManager.this.popBackStackState(arrayList, arrayList2, this.mName, this.mId, this.mFlags);
        }
    }

    /* loaded from: classes3.dex */
    public final class PrepareBackStackTransitionState implements OpGenerator {
        public PrepareBackStackTransitionState() {
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean generateOps(ArrayList arrayList, ArrayList arrayList2) {
            ArrayList arrayList3;
            ArrayList arrayList4;
            boolean popBackStackState;
            FragmentManager fragmentManager = FragmentManager.this;
            ArrayList arrayList5 = fragmentManager.mBackStackChangeListeners;
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + fragmentManager.mPendingActions);
            }
            if (fragmentManager.mBackStack.isEmpty()) {
                Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
                popBackStackState = false;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
            } else {
                BackStackRecord backStackRecord = (BackStackRecord) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, fragmentManager.mBackStack);
                fragmentManager.mTransitioningOp = backStackRecord;
                Iterator it = backStackRecord.mOps.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((FragmentTransaction.Op) it.next()).mFragment;
                    if (fragment != null) {
                        fragment.mTransitioning = true;
                    }
                }
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                popBackStackState = fragmentManager.popBackStackState(arrayList3, arrayList4, null, -1, 0);
            }
            if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
                boolean booleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.fragmentsFromRecord((BackStackRecord) it2.next()));
                }
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    OnBackStackChangedListener onBackStackChangedListener = (OnBackStackChangedListener) it3.next();
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        onBackStackChangedListener.onBackStackChangeStarted((Fragment) it4.next(), booleanValue);
                    }
                }
            }
            return popBackStackState;
        }
    }

    /* loaded from: classes3.dex */
    public final class SaveBackStackState implements OpGenerator {
        public final /* synthetic */ int $r8$classId;
        public final String mName;
        public final /* synthetic */ FragmentManager this$0;

        public /* synthetic */ SaveBackStackState(FragmentManager fragmentManager, String str, int i) {
            this.$r8$classId = i;
            this.this$0 = fragmentManager;
            this.mName = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:103:0x01cb, code lost:
        
            if (r4 != 8) goto L82;
         */
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean generateOps(ArrayList arrayList, ArrayList arrayList2) {
            int i;
            int i2 = this.$r8$classId;
            Throwable th = null;
            String str = this.mName;
            FragmentManager fragmentManager = this.this$0;
            boolean z = false;
            switch (i2) {
                case 0:
                    int findBackStackIndex = fragmentManager.findBackStackIndex(str, -1, true);
                    if (findBackStackIndex < 0) {
                        return false;
                    }
                    for (int i3 = findBackStackIndex; i3 < fragmentManager.mBackStack.size(); i3++) {
                        BackStackRecord backStackRecord = (BackStackRecord) fragmentManager.mBackStack.get(i3);
                        if (!backStackRecord.mReorderingAllowed) {
                            fragmentManager.throwException(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + backStackRecord + " that did not use setReorderingAllowed(true)."));
                            throw null;
                        }
                    }
                    HashSet hashSet = new HashSet();
                    int i4 = findBackStackIndex;
                    while (i4 < fragmentManager.mBackStack.size()) {
                        BackStackRecord backStackRecord2 = (BackStackRecord) fragmentManager.mBackStack.get(i4);
                        HashSet hashSet2 = new HashSet();
                        HashSet hashSet3 = new HashSet();
                        Iterator it = backStackRecord2.mOps.iterator();
                        while (it.hasNext()) {
                            FragmentTransaction.Op op = (FragmentTransaction.Op) it.next();
                            Fragment fragment = op.mFragment;
                            if (fragment != null) {
                                Throwable th2 = th;
                                if (op.mFromExpandedOp) {
                                    int i5 = op.mCmd;
                                    i = i4;
                                    if (i5 != 1) {
                                        if (i5 != 2) {
                                            break;
                                        }
                                    }
                                } else {
                                    i = i4;
                                }
                                hashSet.add(fragment);
                                hashSet2.add(fragment);
                                int i6 = op.mCmd;
                                if (i6 == 1 || i6 == 2) {
                                    hashSet3.add(fragment);
                                }
                                th = th2;
                                i4 = i;
                            }
                        }
                        Throwable th3 = th;
                        int i7 = i4;
                        hashSet2.removeAll(hashSet3);
                        if (!hashSet2.isEmpty()) {
                            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                            m3m.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                            m3m.append(" in ");
                            m3m.append(backStackRecord2);
                            m3m.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                            fragmentManager.throwException(new IllegalArgumentException(m3m.toString()));
                            throw th3;
                        }
                        i4 = i7 + 1;
                        th = th3;
                    }
                    Throwable th4 = th;
                    ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                    while (!arrayDeque.isEmpty()) {
                        Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
                        if (fragment2.mRetainInstance) {
                            StringBuilder m3m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                            m3m2.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                            m3m2.append("fragment ");
                            m3m2.append(fragment2);
                            fragmentManager.throwException(new IllegalArgumentException(m3m2.toString()));
                            throw th4;
                        }
                        Iterator it2 = fragment2.mChildFragmentManager.mFragmentStore.getActiveFragments().iterator();
                        while (it2.hasNext()) {
                            Fragment fragment3 = (Fragment) it2.next();
                            if (fragment3 != null) {
                                arrayDeque.addLast(fragment3);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((Fragment) it3.next()).mWho);
                    }
                    ArrayList arrayList4 = new ArrayList(fragmentManager.mBackStack.size() - findBackStackIndex);
                    for (int i8 = findBackStackIndex; i8 < fragmentManager.mBackStack.size(); i8++) {
                        arrayList4.add(th4);
                    }
                    BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
                    for (int size = fragmentManager.mBackStack.size() - 1; size >= findBackStackIndex; size--) {
                        BackStackRecord backStackRecord3 = (BackStackRecord) fragmentManager.mBackStack.remove(size);
                        BackStackRecord backStackRecord4 = new BackStackRecord(backStackRecord3);
                        backStackRecord4.collapseOps();
                        arrayList4.set(size - findBackStackIndex, new BackStackRecordState(backStackRecord4));
                        backStackRecord3.mBeingSaved = true;
                        arrayList.add(backStackRecord3);
                        arrayList2.add(Boolean.TRUE);
                    }
                    fragmentManager.mBackStackStates.put(str, backStackState);
                    return true;
                default:
                    BackStackState backStackState2 = (BackStackState) fragmentManager.mBackStackStates.remove(str);
                    if (backStackState2 != null) {
                        HashMap hashMap = new HashMap();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            BackStackRecord backStackRecord5 = (BackStackRecord) it4.next();
                            if (backStackRecord5.mBeingSaved) {
                                Iterator it5 = backStackRecord5.mOps.iterator();
                                while (it5.hasNext()) {
                                    Fragment fragment4 = ((FragmentTransaction.Op) it5.next()).mFragment;
                                    if (fragment4 != null) {
                                        hashMap.put(fragment4.mWho, fragment4);
                                    }
                                }
                            }
                        }
                        ArrayList<String> arrayList5 = backStackState2.mFragments;
                        HashMap hashMap2 = new HashMap(arrayList5.size());
                        for (String str2 : arrayList5) {
                            Fragment fragment5 = (Fragment) hashMap.get(str2);
                            if (fragment5 != null) {
                                hashMap2.put(fragment5.mWho, fragment5);
                            } else {
                                Bundle savedState = fragmentManager.mFragmentStore.setSavedState(null, str2);
                                if (savedState != null) {
                                    ClassLoader classLoader = fragmentManager.mHost.context.getClassLoader();
                                    Fragment instantiate = ((FragmentState) savedState.getParcelable("state")).instantiate(fragmentManager.getFragmentFactory(), classLoader);
                                    instantiate.mSavedFragmentState = savedState;
                                    if (savedState.getBundle("savedInstanceState") == null) {
                                        instantiate.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                                    }
                                    Bundle bundle = savedState.getBundle("arguments");
                                    if (bundle != null) {
                                        bundle.setClassLoader(classLoader);
                                    }
                                    instantiate.setArguments(bundle);
                                    hashMap2.put(instantiate.mWho, instantiate);
                                }
                            }
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it6 = backStackState2.mTransactions.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                BackStackRecordState backStackRecordState = (BackStackRecordState) it6.next();
                                ArrayList arrayList7 = backStackRecordState.mFragmentWhos;
                                BackStackRecord backStackRecord6 = new BackStackRecord(fragmentManager);
                                backStackRecordState.fillInBackStackRecord(backStackRecord6);
                                for (int i9 = 0; i9 < arrayList7.size(); i9++) {
                                    String str3 = (String) arrayList7.get(i9);
                                    if (str3 != null) {
                                        Fragment fragment6 = (Fragment) hashMap2.get(str3);
                                        if (fragment6 != null) {
                                            ((FragmentTransaction.Op) backStackRecord6.mOps.get(i9)).mFragment = fragment6;
                                        } else {
                                            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Restoring FragmentTransaction "), backStackRecordState.mName, " failed due to missing saved state for Fragment (", str3, ")"));
                                        }
                                    }
                                }
                                arrayList6.add(backStackRecord6);
                            } else {
                                Iterator it7 = arrayList6.iterator();
                                while (it7.hasNext()) {
                                    ((BackStackRecord) it7.next()).generateOps(arrayList, arrayList2);
                                    z = true;
                                }
                            }
                        }
                    }
                    return z;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.FragmentManager$3] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.fragment.app.FragmentManager$5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.fragment.app.FragmentManager$1] */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda0] */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda0] */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda0] */
    /* JADX WARN: Type inference failed for: r1v16, types: [androidx.fragment.app.FragmentManager$2] */
    public FragmentManager() {
        final int i = 0;
        this.mOnConfigurationChangedListener = new Consumer(this) { // from class: androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda0
            public final /* synthetic */ FragmentManager f$0;

            {
                this.f$0 = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i2 = i;
                FragmentManager fragmentManager = this.f$0;
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.isParentAdded()) {
                            fragmentManager.dispatchConfigurationChanged(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (fragmentManager.isParentAdded() && num.intValue() == 80) {
                            fragmentManager.dispatchLowMemory(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        if (fragmentManager.isParentAdded()) {
                            fragmentManager.dispatchMultiWindowModeChanged(multiWindowModeChangedInfo.isInMultiWindowMode(), false);
                            break;
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        if (fragmentManager.isParentAdded()) {
                            fragmentManager.dispatchPictureInPictureModeChanged(pictureInPictureModeChangedInfo.isInPictureInPictureMode(), false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.mOnTrimMemoryListener = new Consumer(this) { // from class: androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda0
            public final /* synthetic */ FragmentManager f$0;

            {
                this.f$0 = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i22 = i2;
                FragmentManager fragmentManager = this.f$0;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.isParentAdded()) {
                            fragmentManager.dispatchConfigurationChanged(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (fragmentManager.isParentAdded() && num.intValue() == 80) {
                            fragmentManager.dispatchLowMemory(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        if (fragmentManager.isParentAdded()) {
                            fragmentManager.dispatchMultiWindowModeChanged(multiWindowModeChangedInfo.isInMultiWindowMode(), false);
                            break;
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        if (fragmentManager.isParentAdded()) {
                            fragmentManager.dispatchPictureInPictureModeChanged(pictureInPictureModeChangedInfo.isInPictureInPictureMode(), false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.mOnMultiWindowModeChangedListener = new Consumer(this) { // from class: androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda0
            public final /* synthetic */ FragmentManager f$0;

            {
                this.f$0 = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i22 = i3;
                FragmentManager fragmentManager = this.f$0;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.isParentAdded()) {
                            fragmentManager.dispatchConfigurationChanged(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (fragmentManager.isParentAdded() && num.intValue() == 80) {
                            fragmentManager.dispatchLowMemory(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        if (fragmentManager.isParentAdded()) {
                            fragmentManager.dispatchMultiWindowModeChanged(multiWindowModeChangedInfo.isInMultiWindowMode(), false);
                            break;
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        if (fragmentManager.isParentAdded()) {
                            fragmentManager.dispatchPictureInPictureModeChanged(pictureInPictureModeChangedInfo.isInPictureInPictureMode(), false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.mOnPictureInPictureModeChangedListener = new Consumer(this) { // from class: androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda0
            public final /* synthetic */ FragmentManager f$0;

            {
                this.f$0 = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i22 = i4;
                FragmentManager fragmentManager = this.f$0;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.isParentAdded()) {
                            fragmentManager.dispatchConfigurationChanged(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (fragmentManager.isParentAdded() && num.intValue() == 80) {
                            fragmentManager.dispatchLowMemory(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        if (fragmentManager.isParentAdded()) {
                            fragmentManager.dispatchMultiWindowModeChanged(multiWindowModeChangedInfo.isInMultiWindowMode(), false);
                            break;
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        if (fragmentManager.isParentAdded()) {
                            fragmentManager.dispatchPictureInPictureModeChanged(pictureInPictureModeChangedInfo.isInPictureInPictureMode(), false);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public static HashSet fragmentsFromRecord(BackStackRecord backStackRecord) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < backStackRecord.mOps.size(); i++) {
            Fragment fragment = ((FragmentTransaction.Op) backStackRecord.mOps.get(i)).mFragment;
            if (fragment != null && backStackRecord.mAddToBackStack) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean isLoggingEnabled(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean isMenuAvailable(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        Iterator it = fragment.mChildFragmentManager.mFragmentStore.getActiveFragments().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z = isMenuAvailable(fragment2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPrimaryNavigation(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.mPrimaryNav) && isPrimaryNavigation(fragmentManager.mParent);
    }

    public static void showFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final FragmentStateManager addFragment(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.onFragmentReuse(fragment, str);
        }
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        FragmentStateManager createOrGetFragmentStateManager = createOrGetFragmentStateManager(fragment);
        fragment.mFragmentManager = this;
        FragmentStore fragmentStore = this.mFragmentStore;
        fragmentStore.makeActive(createOrGetFragmentStateManager);
        if (!fragment.mDetached) {
            fragmentStore.addFragment(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
        return createOrGetFragmentStateManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachController(FragmentHostCallback fragmentHostCallback, FragmentContainer fragmentContainer, final Fragment fragment) {
        if (this.mHost != null) {
            a$$ExternalSyntheticBUOutline0.m$1("Already attached");
            return;
        }
        this.mHost = fragmentHostCallback;
        this.mContainer = fragmentContainer;
        this.mParent = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.mOnAttachListeners;
        if (fragment != null) {
            copyOnWriteArrayList.add(new FragmentOnAttachListener() { // from class: androidx.fragment.app.FragmentManager.7
                @Override // androidx.fragment.app.FragmentOnAttachListener
                public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment2) {
                    Fragment.this.onAttachFragment(fragment2);
                }
            });
        } else if (fragmentHostCallback instanceof FragmentOnAttachListener) {
            copyOnWriteArrayList.add((FragmentOnAttachListener) fragmentHostCallback);
        }
        if (this.mParent != null) {
            updateOnBackPressedCallbackEnabled();
        }
        if (fragmentHostCallback instanceof OnBackPressedDispatcherOwner) {
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) fragmentHostCallback;
            OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
            this.mOnBackPressedDispatcher = onBackPressedDispatcher;
            LifecycleOwner lifecycleOwner = onBackPressedDispatcherOwner;
            if (fragment != null) {
                lifecycleOwner = fragment;
            }
            onBackPressedDispatcher.addCallback(this.mOnBackPressedCallback, lifecycleOwner);
        }
        final int i = 0;
        if (fragment != null) {
            FragmentManagerViewModel fragmentManagerViewModel = fragment.mFragmentManager.mNonConfig;
            HashMap hashMap = fragmentManagerViewModel.mChildNonConfigs;
            FragmentManagerViewModel fragmentManagerViewModel2 = (FragmentManagerViewModel) hashMap.get(fragment.mWho);
            if (fragmentManagerViewModel2 == null) {
                fragmentManagerViewModel2 = new FragmentManagerViewModel(fragmentManagerViewModel.mStateAutomaticallySaved);
                hashMap.put(fragment.mWho, fragmentManagerViewModel2);
            }
            this.mNonConfig = fragmentManagerViewModel2;
        } else if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) fragmentHostCallback).getViewModelStore();
            viewModelStore.getClass();
            CreationExtras.Empty empty = CreationExtras.Empty.INSTANCE;
            empty.getClass();
            SimpleActor simpleActor = new SimpleActor(viewModelStore, FragmentManagerViewModel.FACTORY, empty);
            KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FragmentManagerViewModel.class);
            String qualifiedName = orCreateKotlinClass.getQualifiedName();
            if (qualifiedName == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.mNonConfig = (FragmentManagerViewModel) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        } else {
            this.mNonConfig = new FragmentManagerViewModel(false);
        }
        this.mNonConfig.mIsStateSaved = isStateSaved();
        this.mFragmentStore.mNonConfig = this.mNonConfig;
        Object obj = this.mHost;
        if ((obj instanceof SavedStateRegistryOwner) && fragment == null) {
            SavedStateRegistry savedStateRegistry = ((SavedStateRegistryOwner) obj).getSavedStateRegistry();
            savedStateRegistry.registerSavedStateProvider("android:support:fragments", new FragmentManager$$ExternalSyntheticLambda4(this, i));
            Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey("android:support:fragments");
            if (consumeRestoredStateForKey != null) {
                restoreSaveStateInternal(consumeRestoredStateForKey);
            }
        }
        Object obj2 = this.mHost;
        if (obj2 instanceof ActivityResultRegistryOwner) {
            ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) obj2).getActivityResultRegistry();
            String concat = "FragmentManager:".concat(fragment != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), fragment.mWho, ":") : "");
            this.mStartActivityForResult = activityResultRegistry.register(concat.concat("StartActivityForResult"), new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback(this) { // from class: androidx.fragment.app.FragmentManager.8
                public final /* synthetic */ FragmentManager this$0;

                {
                    this.this$0 = this;
                }

                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj3) {
                    int i2 = i;
                    FragmentManager fragmentManager = this.this$0;
                    switch (i2) {
                        case 0:
                            ActivityResult activityResult = (ActivityResult) obj3;
                            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.mLaunchedFragments.pollLast();
                            if (launchedFragmentInfo == null) {
                                Log.w("FragmentManager", "No Activities were started for result for " + this);
                                break;
                            } else {
                                String str = launchedFragmentInfo.mWho;
                                int i3 = launchedFragmentInfo.mRequestCode;
                                Fragment findFragmentByWho = fragmentManager.mFragmentStore.findFragmentByWho(str);
                                if (findFragmentByWho == null) {
                                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                                    break;
                                } else {
                                    findFragmentByWho.onActivityResult(i3, activityResult.resultCode, activityResult.data);
                                    break;
                                }
                            }
                        case 1:
                            Map map = (Map) obj3;
                            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                            ArrayList arrayList = new ArrayList(map.values());
                            int[] iArr = new int[arrayList.size()];
                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
                            }
                            LaunchedFragmentInfo launchedFragmentInfo2 = (LaunchedFragmentInfo) fragmentManager.mLaunchedFragments.pollFirst();
                            if (launchedFragmentInfo2 == null) {
                                Log.w("FragmentManager", "No permissions were requested for " + this);
                                break;
                            } else {
                                String str2 = launchedFragmentInfo2.mWho;
                                int i5 = launchedFragmentInfo2.mRequestCode;
                                Fragment findFragmentByWho2 = fragmentManager.mFragmentStore.findFragmentByWho(str2);
                                if (findFragmentByWho2 == null) {
                                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str2);
                                    break;
                                } else {
                                    findFragmentByWho2.onRequestPermissionsResult(i5, strArr, iArr);
                                    break;
                                }
                            }
                        default:
                            ActivityResult activityResult2 = (ActivityResult) obj3;
                            LaunchedFragmentInfo launchedFragmentInfo3 = (LaunchedFragmentInfo) fragmentManager.mLaunchedFragments.pollFirst();
                            if (launchedFragmentInfo3 == null) {
                                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                                break;
                            } else {
                                String str3 = launchedFragmentInfo3.mWho;
                                int i6 = launchedFragmentInfo3.mRequestCode;
                                Fragment findFragmentByWho3 = fragmentManager.mFragmentStore.findFragmentByWho(str3);
                                if (findFragmentByWho3 == null) {
                                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                                    break;
                                } else {
                                    findFragmentByWho3.onActivityResult(i6, activityResult2.resultCode, activityResult2.data);
                                    break;
                                }
                            }
                    }
                }
            });
            final int i2 = 2;
            this.mStartIntentSenderForResult = activityResultRegistry.register(concat.concat("StartIntentSenderForResult"), new FragmentIntentSenderContract(), new ActivityResultCallback(this) { // from class: androidx.fragment.app.FragmentManager.8
                public final /* synthetic */ FragmentManager this$0;

                {
                    this.this$0 = this;
                }

                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj3) {
                    int i22 = i2;
                    FragmentManager fragmentManager = this.this$0;
                    switch (i22) {
                        case 0:
                            ActivityResult activityResult = (ActivityResult) obj3;
                            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.mLaunchedFragments.pollLast();
                            if (launchedFragmentInfo == null) {
                                Log.w("FragmentManager", "No Activities were started for result for " + this);
                                break;
                            } else {
                                String str = launchedFragmentInfo.mWho;
                                int i3 = launchedFragmentInfo.mRequestCode;
                                Fragment findFragmentByWho = fragmentManager.mFragmentStore.findFragmentByWho(str);
                                if (findFragmentByWho == null) {
                                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                                    break;
                                } else {
                                    findFragmentByWho.onActivityResult(i3, activityResult.resultCode, activityResult.data);
                                    break;
                                }
                            }
                        case 1:
                            Map map = (Map) obj3;
                            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                            ArrayList arrayList = new ArrayList(map.values());
                            int[] iArr = new int[arrayList.size()];
                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
                            }
                            LaunchedFragmentInfo launchedFragmentInfo2 = (LaunchedFragmentInfo) fragmentManager.mLaunchedFragments.pollFirst();
                            if (launchedFragmentInfo2 == null) {
                                Log.w("FragmentManager", "No permissions were requested for " + this);
                                break;
                            } else {
                                String str2 = launchedFragmentInfo2.mWho;
                                int i5 = launchedFragmentInfo2.mRequestCode;
                                Fragment findFragmentByWho2 = fragmentManager.mFragmentStore.findFragmentByWho(str2);
                                if (findFragmentByWho2 == null) {
                                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str2);
                                    break;
                                } else {
                                    findFragmentByWho2.onRequestPermissionsResult(i5, strArr, iArr);
                                    break;
                                }
                            }
                        default:
                            ActivityResult activityResult2 = (ActivityResult) obj3;
                            LaunchedFragmentInfo launchedFragmentInfo3 = (LaunchedFragmentInfo) fragmentManager.mLaunchedFragments.pollFirst();
                            if (launchedFragmentInfo3 == null) {
                                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                                break;
                            } else {
                                String str3 = launchedFragmentInfo3.mWho;
                                int i6 = launchedFragmentInfo3.mRequestCode;
                                Fragment findFragmentByWho3 = fragmentManager.mFragmentStore.findFragmentByWho(str3);
                                if (findFragmentByWho3 == null) {
                                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                                    break;
                                } else {
                                    findFragmentByWho3.onActivityResult(i6, activityResult2.resultCode, activityResult2.data);
                                    break;
                                }
                            }
                    }
                }
            });
            final int i3 = 1;
            this.mRequestPermissions = activityResultRegistry.register(concat.concat("RequestPermissions"), new ActivityResultContracts$RequestMultiplePermissions(), new ActivityResultCallback(this) { // from class: androidx.fragment.app.FragmentManager.8
                public final /* synthetic */ FragmentManager this$0;

                {
                    this.this$0 = this;
                }

                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj3) {
                    int i22 = i3;
                    FragmentManager fragmentManager = this.this$0;
                    switch (i22) {
                        case 0:
                            ActivityResult activityResult = (ActivityResult) obj3;
                            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.mLaunchedFragments.pollLast();
                            if (launchedFragmentInfo == null) {
                                Log.w("FragmentManager", "No Activities were started for result for " + this);
                                break;
                            } else {
                                String str = launchedFragmentInfo.mWho;
                                int i32 = launchedFragmentInfo.mRequestCode;
                                Fragment findFragmentByWho = fragmentManager.mFragmentStore.findFragmentByWho(str);
                                if (findFragmentByWho == null) {
                                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                                    break;
                                } else {
                                    findFragmentByWho.onActivityResult(i32, activityResult.resultCode, activityResult.data);
                                    break;
                                }
                            }
                        case 1:
                            Map map = (Map) obj3;
                            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                            ArrayList arrayList = new ArrayList(map.values());
                            int[] iArr = new int[arrayList.size()];
                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
                            }
                            LaunchedFragmentInfo launchedFragmentInfo2 = (LaunchedFragmentInfo) fragmentManager.mLaunchedFragments.pollFirst();
                            if (launchedFragmentInfo2 == null) {
                                Log.w("FragmentManager", "No permissions were requested for " + this);
                                break;
                            } else {
                                String str2 = launchedFragmentInfo2.mWho;
                                int i5 = launchedFragmentInfo2.mRequestCode;
                                Fragment findFragmentByWho2 = fragmentManager.mFragmentStore.findFragmentByWho(str2);
                                if (findFragmentByWho2 == null) {
                                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str2);
                                    break;
                                } else {
                                    findFragmentByWho2.onRequestPermissionsResult(i5, strArr, iArr);
                                    break;
                                }
                            }
                        default:
                            ActivityResult activityResult2 = (ActivityResult) obj3;
                            LaunchedFragmentInfo launchedFragmentInfo3 = (LaunchedFragmentInfo) fragmentManager.mLaunchedFragments.pollFirst();
                            if (launchedFragmentInfo3 == null) {
                                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                                break;
                            } else {
                                String str3 = launchedFragmentInfo3.mWho;
                                int i6 = launchedFragmentInfo3.mRequestCode;
                                Fragment findFragmentByWho3 = fragmentManager.mFragmentStore.findFragmentByWho(str3);
                                if (findFragmentByWho3 == null) {
                                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                                    break;
                                } else {
                                    findFragmentByWho3.onActivityResult(i6, activityResult2.resultCode, activityResult2.data);
                                    break;
                                }
                            }
                    }
                }
            });
        }
        Object obj3 = this.mHost;
        if (obj3 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj3).addOnConfigurationChangedListener(this.mOnConfigurationChangedListener);
        }
        Object obj4 = this.mHost;
        if (obj4 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj4).addOnTrimMemoryListener(this.mOnTrimMemoryListener);
        }
        Object obj5 = this.mHost;
        if (obj5 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj5).addOnMultiWindowModeChangedListener(this.mOnMultiWindowModeChangedListener);
        }
        Object obj6 = this.mHost;
        if (obj6 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj6).addOnPictureInPictureModeChangedListener(this.mOnPictureInPictureModeChangedListener);
        }
        Object obj7 = this.mHost;
        if ((obj7 instanceof MenuHost) && fragment == null) {
            ((MenuHost) obj7).addMenuProvider(this.mMenuProvider);
        }
    }

    public final void attachFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.mFragmentStore.addFragment(fragment);
            if (isLoggingEnabled(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
    }

    public final void cleanupExec() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    public final HashSet collectAllSpecialEffectsController() {
        HashSet hashSet = new HashSet();
        Iterator it = this.mFragmentStore.getActiveFragmentStateManagers().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((FragmentStateManager) it.next()).getFragment().mContainer;
            if (viewGroup != null) {
                hashSet.add(DefaultSpecialEffectsController.getOrCreateController(viewGroup, getSpecialEffectsControllerFactory()));
            }
        }
        return hashSet;
    }

    public final HashSet collectChangedControllers(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((BackStackRecord) arrayList.get(i)).mOps.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((FragmentTransaction.Op) it.next()).mFragment;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(DefaultSpecialEffectsController.getOrCreateController(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final FragmentStateManager createOrGetFragmentStateManager(Fragment fragment) {
        String str = fragment.mWho;
        FragmentStore fragmentStore = this.mFragmentStore;
        FragmentStateManager fragmentStateManager = (FragmentStateManager) fragmentStore.mActive.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager;
        }
        FragmentStateManager fragmentStateManager2 = new FragmentStateManager(this.mLifecycleCallbacksDispatcher, fragmentStore, fragment);
        fragmentStateManager2.restoreState(this.mHost.context.getClassLoader());
        fragmentStateManager2.setFragmentManagerState(this.mCurState);
        return fragmentStateManager2;
    }

    public final void detachFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (isLoggingEnabled(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            FragmentStore fragmentStore = this.mFragmentStore;
            synchronized (fragmentStore.mAdded) {
                fragmentStore.mAdded.remove(fragment);
            }
            fragment.mAdded = false;
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            setVisibleRemovingFragment(fragment);
        }
    }

    public final void dispatchConfigurationChanged(boolean z, Configuration configuration) {
        if (z && (this.mHost instanceof OnConfigurationChangedProvider)) {
            throwException(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.dispatchConfigurationChanged(true, configuration);
                }
            }
        }
    }

    public final boolean dispatchContextItemSelected(MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.mCurState < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i = 0; i < this.mCreatedMenus.size(); i++) {
                Fragment fragment2 = (Fragment) this.mCreatedMenus.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z;
    }

    public final void dispatchDestroy() {
        boolean z = true;
        this.mDestroyed = true;
        execPendingActions(true);
        endAnimatingAwayFragments();
        FragmentHostCallback fragmentHostCallback = this.mHost;
        boolean z2 = fragmentHostCallback instanceof ViewModelStoreOwner;
        FragmentStore fragmentStore = this.mFragmentStore;
        if (z2) {
            z = fragmentStore.mNonConfig.mHasBeenCleared;
        } else {
            FragmentActivity fragmentActivity = fragmentHostCallback.context;
            if (fragmentActivity != null) {
                z = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (z) {
            Iterator it = this.mBackStackStates.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).mFragments.iterator();
                while (it2.hasNext()) {
                    fragmentStore.mNonConfig.clearNonConfigState((String) it2.next(), false);
                }
            }
        }
        dispatchStateChange(-1);
        Object obj = this.mHost;
        if (obj instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj).removeOnTrimMemoryListener(this.mOnTrimMemoryListener);
        }
        Object obj2 = this.mHost;
        if (obj2 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj2).removeOnConfigurationChangedListener(this.mOnConfigurationChangedListener);
        }
        Object obj3 = this.mHost;
        if (obj3 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj3).removeOnMultiWindowModeChangedListener(this.mOnMultiWindowModeChangedListener);
        }
        Object obj4 = this.mHost;
        if (obj4 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj4).removeOnPictureInPictureModeChangedListener(this.mOnPictureInPictureModeChangedListener);
        }
        Object obj5 = this.mHost;
        if ((obj5 instanceof MenuHost) && this.mParent == null) {
            ((MenuHost) obj5).removeMenuProvider(this.mMenuProvider);
        }
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
        if (this.mOnBackPressedDispatcher != null) {
            remove();
            this.mOnBackPressedDispatcher = null;
        }
        ActivityResultRegistry$register$2 activityResultRegistry$register$2 = this.mStartActivityForResult;
        if (activityResultRegistry$register$2 != null) {
            activityResultRegistry$register$2.unregister();
            this.mStartIntentSenderForResult.unregister();
            this.mRequestPermissions.unregister();
        }
    }

    public final void dispatchLowMemory(boolean z) {
        if (z && (this.mHost instanceof OnTrimMemoryProvider)) {
            throwException(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.dispatchLowMemory(true);
                }
            }
        }
    }

    public final void dispatchMultiWindowModeChanged(boolean z, boolean z2) {
        if (z2 && (this.mHost instanceof OnMultiWindowModeChangedProvider)) {
            throwException(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.dispatchMultiWindowModeChanged(z, true);
                }
            }
        }
    }

    public final void dispatchOnHiddenChanged() {
        Iterator it = this.mFragmentStore.getActiveFragments().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.dispatchOnHiddenChanged();
            }
        }
    }

    public final boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void dispatchOptionsMenuClosed(Menu menu) {
        if (this.mCurState < 1) {
            return;
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void dispatchParentPrimaryNavigationFragmentChanged(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.mFragmentStore.findActiveFragment(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void dispatchPictureInPictureModeChanged(boolean z, boolean z2) {
        if (z2 && (this.mHost instanceof OnPictureInPictureModeChangedProvider)) {
            throwException(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.dispatchPictureInPictureModeChanged(z, true);
                }
            }
        }
    }

    public final boolean dispatchPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void dispatchStateChange(int i) {
        try {
            this.mExecutingActions = true;
            for (FragmentStateManager fragmentStateManager : this.mFragmentStore.mActive.values()) {
                if (fragmentStateManager != null) {
                    fragmentStateManager.setFragmentManagerState(i);
                }
            }
            moveToState(i, false);
            Iterator it = collectAllSpecialEffectsController().iterator();
            while (it.hasNext()) {
                ((DefaultSpecialEffectsController) it.next()).forceCompleteAllOperations();
            }
            this.mExecutingActions = false;
            execPendingActions(true);
        } catch (Throwable th) {
            this.mExecutingActions = false;
            throw th;
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(str, "    ");
        FragmentStore fragmentStore = this.mFragmentStore;
        ArrayList arrayList = fragmentStore.mAdded;
        String m$12 = Recorder$$ExternalSyntheticOutline2.m$1(str, "    ");
        HashMap hashMap = fragmentStore.mActive;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (FragmentStateManager fragmentStateManager : hashMap.values()) {
                printWriter.print(str);
                if (fragmentStateManager != null) {
                    Fragment fragment = fragmentStateManager.getFragment();
                    printWriter.println(fragment);
                    fragment.dump(m$12, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                Fragment fragment2 = (Fragment) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.mCreatedMenus;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment3 = (Fragment) this.mCreatedMenus.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.mBackStack.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                BackStackRecord backStackRecord = (BackStackRecord) this.mBackStack.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(backStackRecord.toString());
                backStackRecord.dump(m$1, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.mBackStackIndex.get());
        synchronized (this.mPendingActions) {
            try {
                int size4 = this.mPendingActions.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (OpGenerator) this.mPendingActions.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.mHost);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.mContainer);
        if (this.mParent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.mParent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.mCurState);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.mStateSaved);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.mNeedMenuInvalidate);
        }
    }

    public final void endAnimatingAwayFragments() {
        Iterator it = collectAllSpecialEffectsController().iterator();
        while (it.hasNext()) {
            ((DefaultSpecialEffectsController) it.next()).forceCompleteAllOperations();
        }
    }

    public final void enqueueAction(OpGenerator opGenerator, boolean z) {
        if (!z) {
            if (this.mHost == null) {
                if (this.mDestroyed) {
                    a$$ExternalSyntheticBUOutline0.m$1("FragmentManager has been destroyed");
                    return;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (isStateSaved()) {
                a$$ExternalSyntheticBUOutline0.m$1("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.mPendingActions) {
            try {
                if (this.mHost == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.mPendingActions.add(opGenerator);
                    scheduleCommit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void ensureExecReady(boolean z) {
        if (this.mExecutingActions) {
            a$$ExternalSyntheticBUOutline0.m$1("FragmentManager is already executing transactions");
            return;
        }
        if (this.mHost == null) {
            if (this.mDestroyed) {
                a$$ExternalSyntheticBUOutline0.m$1("FragmentManager has been destroyed");
                return;
            } else {
                a$$ExternalSyntheticBUOutline0.m$1("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.mHost.handler.getLooper()) {
            a$$ExternalSyntheticBUOutline0.m$1("Must be called from main thread of fragment host");
            return;
        }
        if (!z && isStateSaved()) {
            a$$ExternalSyntheticBUOutline0.m$1("Can not perform this action after onSaveInstanceState");
        } else if (this.mTmpRecords == null) {
            this.mTmpRecords = new ArrayList();
            this.mTmpIsPop = new ArrayList();
        }
    }

    public final boolean execPendingActions(boolean z) {
        boolean z2;
        ArrayList arrayList;
        BackStackRecord backStackRecord;
        ensureExecReady(z);
        if (!this.mHandlingTransitioningOp && (backStackRecord = this.mTransitioningOp) != null) {
            backStackRecord.mCommitted = false;
            backStackRecord.collapseOps();
            if (isLoggingEnabled(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.mTransitioningOp + " as part of execPendingActions for actions " + this.mPendingActions);
            }
            this.mTransitioningOp.commitInternal(false, false);
            this.mPendingActions.add(0, this.mTransitioningOp);
            Iterator it = this.mTransitioningOp.mOps.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((FragmentTransaction.Op) it.next()).mFragment;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.mTransitioningOp = null;
        }
        boolean z3 = false;
        while (true) {
            ArrayList arrayList2 = this.mTmpRecords;
            ArrayList arrayList3 = this.mTmpIsPop;
            synchronized (this.mPendingActions) {
                if (this.mPendingActions.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.mPendingActions.size();
                        int i = 0;
                        z2 = false;
                        while (true) {
                            arrayList = this.mPendingActions;
                            if (i >= size) {
                                break;
                            }
                            z2 |= ((OpGenerator) arrayList.get(i)).generateOps(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.mHost.handler.removeCallbacks(this.mExecCommit);
                    } finally {
                    }
                }
            }
            if (!z2) {
                break;
            }
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                cleanupExec();
                z3 = true;
            } catch (Throwable th) {
                cleanupExec();
                throw th;
            }
        }
        updateOnBackPressedCallbackEnabled();
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            Iterator it2 = this.mFragmentStore.getActiveFragmentStateManagers().iterator();
            while (it2.hasNext()) {
                FragmentStateManager fragmentStateManager = (FragmentStateManager) it2.next();
                Fragment fragment2 = fragmentStateManager.getFragment();
                if (fragment2.mDeferStart) {
                    if (this.mExecutingActions) {
                        this.mHavePendingDeferredStart = true;
                    } else {
                        fragment2.mDeferStart = false;
                        fragmentStateManager.moveToExpectedState();
                    }
                }
            }
        }
        this.mFragmentStore.mActive.values().removeAll(Collections.singleton(null));
        return z3;
    }

    public final void execSingleAction(BackStackRecord backStackRecord, boolean z) {
        if (z && (this.mHost == null || this.mDestroyed)) {
            return;
        }
        ensureExecReady(z);
        BackStackRecord backStackRecord2 = this.mTransitioningOp;
        if (backStackRecord2 != null) {
            backStackRecord2.mCommitted = false;
            backStackRecord2.collapseOps();
            if (isLoggingEnabled(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.mTransitioningOp + " as part of execSingleAction for action " + backStackRecord);
            }
            this.mTransitioningOp.commitInternal(false, false);
            this.mTransitioningOp.generateOps(this.mTmpRecords, this.mTmpIsPop);
            Iterator it = this.mTransitioningOp.mOps.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((FragmentTransaction.Op) it.next()).mFragment;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.mTransitioningOp = null;
        }
        backStackRecord.generateOps(this.mTmpRecords, this.mTmpIsPop);
        this.mExecutingActions = true;
        try {
            removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            cleanupExec();
            updateOnBackPressedCallbackEnabled();
            boolean z2 = this.mHavePendingDeferredStart;
            FragmentStore fragmentStore = this.mFragmentStore;
            if (z2) {
                this.mHavePendingDeferredStart = false;
                Iterator it2 = fragmentStore.getActiveFragmentStateManagers().iterator();
                while (it2.hasNext()) {
                    FragmentStateManager fragmentStateManager = (FragmentStateManager) it2.next();
                    Fragment fragment2 = fragmentStateManager.getFragment();
                    if (fragment2.mDeferStart) {
                        if (this.mExecutingActions) {
                            this.mHavePendingDeferredStart = true;
                        } else {
                            fragment2.mDeferStart = false;
                            fragmentStateManager.moveToExpectedState();
                        }
                    }
                }
            }
            fragmentStore.mActive.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            cleanupExec();
            throw th;
        }
    }

    public final void executeOpsTogether(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9 = i;
        boolean z4 = ((BackStackRecord) arrayList.get(i9)).mReorderingAllowed;
        ArrayList arrayList3 = this.mTmpAddedFragments;
        if (arrayList3 == null) {
            this.mTmpAddedFragments = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.mTmpAddedFragments;
        FragmentStore fragmentStore = this.mFragmentStore;
        arrayList4.addAll(fragmentStore.getFragments());
        Fragment fragment = this.mPrimaryNav;
        int i10 = i9;
        boolean z5 = false;
        while (true) {
            int i11 = 1;
            if (i10 >= i2) {
                boolean z6 = z4;
                boolean z7 = z5;
                this.mTmpAddedFragments.clear();
                if (!z6 && this.mCurState >= 1) {
                    for (int i12 = i9; i12 < i2; i12++) {
                        Iterator it = ((BackStackRecord) arrayList.get(i12)).mOps.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = ((FragmentTransaction.Op) it.next()).mFragment;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                fragmentStore.makeActive(createOrGetFragmentStateManager(fragment2));
                            }
                        }
                    }
                }
                int i13 = i9;
                while (i13 < i2) {
                    BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i13);
                    if (!((Boolean) arrayList2.get(i13)).booleanValue()) {
                        backStackRecord.bumpBackStackNesting(1);
                        FragmentManager fragmentManager = backStackRecord.mManager;
                        ArrayList arrayList5 = backStackRecord.mOps;
                        int size = arrayList5.size();
                        int i14 = 0;
                        while (i14 < size) {
                            FragmentTransaction.Op op = (FragmentTransaction.Op) arrayList5.get(i14);
                            Fragment fragment3 = op.mFragment;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = backStackRecord.mBeingSaved;
                                fragment3.setPopDirection(false);
                                fragment3.setNextTransition(backStackRecord.mTransition);
                                fragment3.setSharedElementNames(backStackRecord.mSharedElementSourceNames, backStackRecord.mSharedElementTargetNames);
                            }
                            switch (op.mCmd) {
                                case 1:
                                    i3 = i13;
                                    fragment3.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                                    fragmentManager.setExitAnimationOrder(fragment3, false);
                                    fragmentManager.addFragment(fragment3);
                                    i14++;
                                    i13 = i3;
                                case 2:
                                default:
                                    a$$ExternalSyntheticBUOutline0.m(op.mCmd, "Unknown cmd: ");
                                    break;
                                case 3:
                                    i3 = i13;
                                    fragment3.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                                    fragmentManager.removeFragment(fragment3);
                                    i14++;
                                    i13 = i3;
                                case 4:
                                    i3 = i13;
                                    fragment3.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                                    fragmentManager.hideFragment(fragment3);
                                    i14++;
                                    i13 = i3;
                                case 5:
                                    i3 = i13;
                                    fragment3.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                                    fragmentManager.setExitAnimationOrder(fragment3, false);
                                    showFragment(fragment3);
                                    i14++;
                                    i13 = i3;
                                case 6:
                                    i3 = i13;
                                    fragment3.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                                    fragmentManager.detachFragment(fragment3);
                                    i14++;
                                    i13 = i3;
                                case 7:
                                    i3 = i13;
                                    fragment3.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                                    fragmentManager.setExitAnimationOrder(fragment3, false);
                                    fragmentManager.attachFragment(fragment3);
                                    i14++;
                                    i13 = i3;
                                case 8:
                                    fragmentManager.setPrimaryNavigationFragment(fragment3);
                                    i3 = i13;
                                    i14++;
                                    i13 = i3;
                                case 9:
                                    fragmentManager.setPrimaryNavigationFragment(null);
                                    i3 = i13;
                                    i14++;
                                    i13 = i3;
                                case 10:
                                    op.mOldMaxState = fragment3.mMaxState;
                                    fragmentManager.setMaxLifecycle(fragment3, op.mCurrentMaxState);
                                    i3 = i13;
                                    i14++;
                                    i13 = i3;
                            }
                            return;
                        }
                    }
                    backStackRecord.bumpBackStackNesting(-1);
                    FragmentManager fragmentManager2 = backStackRecord.mManager;
                    ArrayList arrayList6 = backStackRecord.mOps;
                    boolean z8 = true;
                    for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                        FragmentTransaction.Op op2 = (FragmentTransaction.Op) arrayList6.get(size2);
                        Fragment fragment4 = op2.mFragment;
                        if (fragment4 != null) {
                            fragment4.mBeingSaved = backStackRecord.mBeingSaved;
                            fragment4.setPopDirection(z8);
                            int i15 = backStackRecord.mTransition;
                            int i16 = 8194;
                            int i17 = 4097;
                            if (i15 != 4097) {
                                if (i15 != 8194) {
                                    i16 = 4100;
                                    if (i15 != 8197) {
                                        i17 = 4099;
                                        if (i15 != 4099) {
                                            i16 = i15 != 4100 ? 0 : 8197;
                                        }
                                    }
                                }
                                i16 = i17;
                            }
                            fragment4.setNextTransition(i16);
                            fragment4.setSharedElementNames(backStackRecord.mSharedElementTargetNames, backStackRecord.mSharedElementSourceNames);
                        }
                        switch (op2.mCmd) {
                            case 1:
                                fragment4.setAnimations(op2.mEnterAnim, op2.mExitAnim, op2.mPopEnterAnim, op2.mPopExitAnim);
                                z8 = true;
                                fragmentManager2.setExitAnimationOrder(fragment4, true);
                                fragmentManager2.removeFragment(fragment4);
                            case 2:
                            default:
                                a$$ExternalSyntheticBUOutline0.m(op2.mCmd, "Unknown cmd: ");
                                break;
                            case 3:
                                fragment4.setAnimations(op2.mEnterAnim, op2.mExitAnim, op2.mPopEnterAnim, op2.mPopExitAnim);
                                fragmentManager2.addFragment(fragment4);
                                z8 = true;
                            case 4:
                                fragment4.setAnimations(op2.mEnterAnim, op2.mExitAnim, op2.mPopEnterAnim, op2.mPopExitAnim);
                                fragmentManager2.getClass();
                                showFragment(fragment4);
                                z8 = true;
                            case 5:
                                fragment4.setAnimations(op2.mEnterAnim, op2.mExitAnim, op2.mPopEnterAnim, op2.mPopExitAnim);
                                fragmentManager2.setExitAnimationOrder(fragment4, true);
                                fragmentManager2.hideFragment(fragment4);
                                z8 = true;
                            case 6:
                                fragment4.setAnimations(op2.mEnterAnim, op2.mExitAnim, op2.mPopEnterAnim, op2.mPopExitAnim);
                                fragmentManager2.attachFragment(fragment4);
                                z8 = true;
                            case 7:
                                fragment4.setAnimations(op2.mEnterAnim, op2.mExitAnim, op2.mPopEnterAnim, op2.mPopExitAnim);
                                fragmentManager2.setExitAnimationOrder(fragment4, true);
                                fragmentManager2.detachFragment(fragment4);
                                z8 = true;
                            case 8:
                                fragmentManager2.setPrimaryNavigationFragment(null);
                                z8 = true;
                            case 9:
                                fragmentManager2.setPrimaryNavigationFragment(fragment4);
                                z8 = true;
                            case 10:
                                op2.mCurrentMaxState = fragment4.mMaxState;
                                fragmentManager2.setMaxLifecycle(fragment4, op2.mOldMaxState);
                                z8 = true;
                        }
                        return;
                    }
                    i13++;
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                ArrayList arrayList7 = this.mBackStackChangeListeners;
                if (z7 && !arrayList7.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(fragmentsFromRecord((BackStackRecord) it2.next()));
                    }
                    if (this.mTransitioningOp == null) {
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            OnBackStackChangedListener onBackStackChangedListener = (OnBackStackChangedListener) it3.next();
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                onBackStackChangedListener.onBackStackChangeStarted((Fragment) it4.next(), booleanValue);
                            }
                        }
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            OnBackStackChangedListener onBackStackChangedListener2 = (OnBackStackChangedListener) it5.next();
                            Iterator it6 = linkedHashSet.iterator();
                            while (it6.hasNext()) {
                                onBackStackChangedListener2.onBackStackChangeCommitted((Fragment) it6.next(), booleanValue);
                            }
                        }
                    }
                }
                for (int i18 = i9; i18 < i2; i18++) {
                    BackStackRecord backStackRecord2 = (BackStackRecord) arrayList.get(i18);
                    if (booleanValue) {
                        for (int size3 = backStackRecord2.mOps.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment5 = ((FragmentTransaction.Op) backStackRecord2.mOps.get(size3)).mFragment;
                            if (fragment5 != null) {
                                createOrGetFragmentStateManager(fragment5).moveToExpectedState();
                            }
                        }
                    } else {
                        Iterator it7 = backStackRecord2.mOps.iterator();
                        while (it7.hasNext()) {
                            Fragment fragment6 = ((FragmentTransaction.Op) it7.next()).mFragment;
                            if (fragment6 != null) {
                                createOrGetFragmentStateManager(fragment6).moveToExpectedState();
                            }
                        }
                    }
                }
                moveToState(this.mCurState, true);
                Iterator it8 = collectChangedControllers(arrayList, i9, i2).iterator();
                while (it8.hasNext()) {
                    DefaultSpecialEffectsController defaultSpecialEffectsController = (DefaultSpecialEffectsController) it8.next();
                    defaultSpecialEffectsController.updateOperationDirection(booleanValue);
                    defaultSpecialEffectsController.markPostponedState();
                    defaultSpecialEffectsController.executePendingOperations();
                }
                while (i9 < i2) {
                    BackStackRecord backStackRecord3 = (BackStackRecord) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue() && backStackRecord3.mIndex >= 0) {
                        backStackRecord3.mIndex = -1;
                    }
                    if (backStackRecord3.mCommitRunnables != null) {
                        for (int i19 = 0; i19 < backStackRecord3.mCommitRunnables.size(); i19++) {
                            ((Runnable) backStackRecord3.mCommitRunnables.get(i19)).run();
                        }
                        backStackRecord3.mCommitRunnables = null;
                    }
                    i9++;
                }
                if (z7) {
                    for (int i20 = 0; i20 < arrayList7.size(); i20++) {
                        ((OnBackStackChangedListener) arrayList7.get(i20)).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
            BackStackRecord backStackRecord4 = (BackStackRecord) arrayList.get(i10);
            boolean booleanValue2 = ((Boolean) arrayList2.get(i10)).booleanValue();
            ArrayList arrayList8 = this.mTmpAddedFragments;
            if (booleanValue2) {
                z = z4;
                i4 = i10;
                z2 = z5;
                int i21 = 1;
                ArrayList arrayList9 = backStackRecord4.mOps;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    FragmentTransaction.Op op3 = (FragmentTransaction.Op) arrayList9.get(size4);
                    int i22 = op3.mCmd;
                    if (i22 != i21) {
                        if (i22 != 3) {
                            switch (i22) {
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = op3.mFragment;
                                    break;
                                case 10:
                                    op3.mCurrentMaxState = op3.mOldMaxState;
                                    break;
                            }
                            size4--;
                            i21 = 1;
                        }
                        arrayList8.add(op3.mFragment);
                        size4--;
                        i21 = 1;
                    }
                    arrayList8.remove(op3.mFragment);
                    size4--;
                    i21 = 1;
                }
            } else {
                ArrayList arrayList10 = backStackRecord4.mOps;
                int i23 = 0;
                while (i23 < arrayList10.size()) {
                    FragmentTransaction.Op op4 = (FragmentTransaction.Op) arrayList10.get(i23);
                    boolean z9 = z4;
                    int i24 = op4.mCmd;
                    if (i24 != i11) {
                        i5 = i10;
                        if (i24 != 2) {
                            if (i24 == 3 || i24 == 6) {
                                arrayList8.remove(op4.mFragment);
                                Fragment fragment7 = op4.mFragment;
                                if (fragment7 == fragment) {
                                    arrayList10.add(i23, new FragmentTransaction.Op(fragment7, 9));
                                    i23++;
                                    z3 = z5;
                                    fragment = null;
                                    i6 = 1;
                                }
                            } else if (i24 == 7) {
                                i6 = 1;
                            } else if (i24 == 8) {
                                arrayList10.add(i23, new FragmentTransaction.Op(9, fragment, 0));
                                op4.mFromExpandedOp = true;
                                i23++;
                                fragment = op4.mFragment;
                            }
                            z3 = z5;
                            i6 = 1;
                        } else {
                            Fragment fragment8 = op4.mFragment;
                            int i25 = fragment8.mContainerId;
                            int size5 = arrayList8.size() - 1;
                            boolean z10 = false;
                            while (size5 >= 0) {
                                int i26 = size5;
                                Fragment fragment9 = (Fragment) arrayList8.get(size5);
                                boolean z11 = z5;
                                if (fragment9.mContainerId != i25) {
                                    i7 = i25;
                                } else if (fragment9 == fragment8) {
                                    i7 = i25;
                                    z10 = true;
                                } else {
                                    if (fragment9 == fragment) {
                                        i7 = i25;
                                        i8 = 0;
                                        arrayList10.add(i23, new FragmentTransaction.Op(9, fragment9, 0));
                                        i23++;
                                        fragment = null;
                                    } else {
                                        i7 = i25;
                                        i8 = 0;
                                    }
                                    FragmentTransaction.Op op5 = new FragmentTransaction.Op(3, fragment9, i8);
                                    op5.mEnterAnim = op4.mEnterAnim;
                                    op5.mPopEnterAnim = op4.mPopEnterAnim;
                                    op5.mExitAnim = op4.mExitAnim;
                                    op5.mPopExitAnim = op4.mPopExitAnim;
                                    arrayList10.add(i23, op5);
                                    arrayList8.remove(fragment9);
                                    i23++;
                                    fragment = fragment;
                                }
                                size5 = i26 - 1;
                                i25 = i7;
                                z5 = z11;
                            }
                            z3 = z5;
                            i6 = 1;
                            if (z10) {
                                arrayList10.remove(i23);
                                i23--;
                            } else {
                                op4.mCmd = 1;
                                op4.mFromExpandedOp = true;
                                arrayList8.add(fragment8);
                            }
                        }
                        i23 += i6;
                        i11 = i6;
                        z4 = z9;
                        i10 = i5;
                        z5 = z3;
                    } else {
                        i5 = i10;
                        i6 = i11;
                    }
                    z3 = z5;
                    arrayList8.add(op4.mFragment);
                    i23 += i6;
                    i11 = i6;
                    z4 = z9;
                    i10 = i5;
                    z5 = z3;
                }
                z = z4;
                i4 = i10;
                z2 = z5;
            }
            z5 = z2 || backStackRecord4.mAddToBackStack;
            i10 = i4 + 1;
            z4 = z;
        }
    }

    public final int findBackStackIndex(String str, int i, boolean z) {
        if (this.mBackStack.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.mBackStack.size() - 1;
        }
        int size = this.mBackStack.size() - 1;
        while (size >= 0) {
            BackStackRecord backStackRecord = (BackStackRecord) this.mBackStack.get(size);
            if ((str != null && str.equals(backStackRecord.mName)) || (i >= 0 && i == backStackRecord.mIndex)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.mBackStack.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            BackStackRecord backStackRecord2 = (BackStackRecord) this.mBackStack.get(size - 1);
            if ((str == null || !str.equals(backStackRecord2.mName)) && (i < 0 || i != backStackRecord2.mIndex)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final Fragment findFragmentById(int i) {
        FragmentStore fragmentStore = this.mFragmentStore;
        ArrayList arrayList = fragmentStore.mAdded;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (FragmentStateManager fragmentStateManager : fragmentStore.mActive.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment2 = fragmentStateManager.getFragment();
                if (fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment findFragmentByTag(String str) {
        FragmentStore fragmentStore = this.mFragmentStore;
        ArrayList arrayList = fragmentStore.mAdded;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (FragmentStateManager fragmentStateManager : fragmentStore.mActive.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment2 = fragmentStateManager.getFragment();
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final int getBackStackEntryCount() {
        return this.mBackStack.size() + (this.mTransitioningOp != null ? 1 : 0);
    }

    public final ViewGroup getFragmentContainer(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.mContainer.onHasView()) {
            return null;
        }
        View onFindViewById = this.mContainer.onFindViewById(fragment.mContainerId);
        if (onFindViewById instanceof ViewGroup) {
            return (ViewGroup) onFindViewById;
        }
        return null;
    }

    public final FragmentFactory getFragmentFactory() {
        FragmentFactory fragmentFactory = this.mFragmentFactory;
        if (fragmentFactory != null) {
            return fragmentFactory;
        }
        Fragment fragment = this.mParent;
        return fragment != null ? fragment.mFragmentManager.getFragmentFactory() : this.mHostFragmentFactory;
    }

    public final zzf getSpecialEffectsControllerFactory() {
        Fragment fragment = this.mParent;
        return fragment != null ? fragment.mFragmentManager.getSpecialEffectsControllerFactory() : this.mDefaultSpecialEffectsControllerFactory;
    }

    public final void hideFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        setVisibleRemovingFragment(fragment);
    }

    public final boolean isParentAdded() {
        Fragment fragment = this.mParent;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.mParent.getParentFragmentManager().isParentAdded();
    }

    public final boolean isStateSaved() {
        return this.mStateSaved || this.mStopped;
    }

    public final void moveToState(int i, boolean z) {
        FragmentHostCallback fragmentHostCallback;
        if (this.mHost == null && i != -1) {
            a$$ExternalSyntheticBUOutline0.m$1("No activity");
            return;
        }
        if (z || i != this.mCurState) {
            this.mCurState = i;
            FragmentStore fragmentStore = this.mFragmentStore;
            HashMap hashMap = fragmentStore.mActive;
            Iterator it = fragmentStore.mAdded.iterator();
            while (it.hasNext()) {
                FragmentStateManager fragmentStateManager = (FragmentStateManager) hashMap.get(((Fragment) it.next()).mWho);
                if (fragmentStateManager != null) {
                    fragmentStateManager.moveToExpectedState();
                }
            }
            for (FragmentStateManager fragmentStateManager2 : hashMap.values()) {
                if (fragmentStateManager2 != null) {
                    fragmentStateManager2.moveToExpectedState();
                    Fragment fragment = fragmentStateManager2.getFragment();
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !fragmentStore.mSavedState.containsKey(fragment.mWho)) {
                            fragmentStore.setSavedState(fragmentStateManager2.saveState(), fragment.mWho);
                        }
                        fragmentStore.makeInactive(fragmentStateManager2);
                    }
                }
            }
            Iterator it2 = fragmentStore.getActiveFragmentStateManagers().iterator();
            while (it2.hasNext()) {
                FragmentStateManager fragmentStateManager3 = (FragmentStateManager) it2.next();
                Fragment fragment2 = fragmentStateManager3.getFragment();
                if (fragment2.mDeferStart) {
                    if (this.mExecutingActions) {
                        this.mHavePendingDeferredStart = true;
                    } else {
                        fragment2.mDeferStart = false;
                        fragmentStateManager3.moveToExpectedState();
                    }
                }
            }
            if (this.mNeedMenuInvalidate && (fragmentHostCallback = this.mHost) != null && this.mCurState == 7) {
                FragmentActivity.this.invalidateMenu();
                this.mNeedMenuInvalidate = false;
            }
        }
    }

    public final void noteStateNotSaved() {
        if (this.mHost == null) {
            return;
        }
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.mIsStateSaved = false;
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean popBackStackImmediate(int i, int i2) {
        execPendingActions(false);
        ensureExecReady(true);
        Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i < 0 && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean popBackStackState = popBackStackState(this.mTmpRecords, this.mTmpIsPop, null, i, i2);
        if (popBackStackState) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        boolean z = this.mHavePendingDeferredStart;
        FragmentStore fragmentStore = this.mFragmentStore;
        if (z) {
            this.mHavePendingDeferredStart = false;
            Iterator it = fragmentStore.getActiveFragmentStateManagers().iterator();
            while (it.hasNext()) {
                FragmentStateManager fragmentStateManager = (FragmentStateManager) it.next();
                Fragment fragment2 = fragmentStateManager.getFragment();
                if (fragment2.mDeferStart) {
                    if (this.mExecutingActions) {
                        this.mHavePendingDeferredStart = true;
                    } else {
                        fragment2.mDeferStart = false;
                        fragmentStateManager.moveToExpectedState();
                    }
                }
            }
        }
        fragmentStore.mActive.values().removeAll(Collections.singleton(null));
        return popBackStackState;
    }

    public final boolean popBackStackState(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int findBackStackIndex = findBackStackIndex(str, i, (i2 & 1) != 0);
        if (findBackStackIndex < 0) {
            return false;
        }
        for (int size = this.mBackStack.size() - 1; size >= findBackStackIndex; size--) {
            arrayList.add((BackStackRecord) this.mBackStack.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void putFragment(Bundle bundle, Fragment fragment, String str) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            throwException(new IllegalStateException(Fragment$5$$ExternalSyntheticOutline0.m("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void removeFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && isInBackStack) {
            return;
        }
        FragmentStore fragmentStore = this.mFragmentStore;
        synchronized (fragmentStore.mAdded) {
            fragmentStore.mAdded.remove(fragment);
        }
        fragment.mAdded = false;
        if (isMenuAvailable(fragment)) {
            this.mNeedMenuInvalidate = true;
        }
        fragment.mRemoving = true;
        setVisibleRemovingFragment(fragment);
    }

    public final void removeRedundantOperationsAndExecute(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            a$$ExternalSyntheticBUOutline0.m$1("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((BackStackRecord) arrayList.get(i)).mReorderingAllowed) {
                if (i2 != i) {
                    executeOpsTogether(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((BackStackRecord) arrayList.get(i2)).mReorderingAllowed) {
                        i2++;
                    }
                }
                executeOpsTogether(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            executeOpsTogether(arrayList, arrayList2, i2, size);
        }
    }

    public final void restoreSaveStateInternal(Bundle bundle) {
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher;
        FragmentStateManager fragmentStateManager;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.mHost.context.getClassLoader());
                this.mResults.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.mHost.context.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        FragmentStore fragmentStore = this.mFragmentStore;
        HashMap hashMap2 = fragmentStore.mSavedState;
        HashMap hashMap3 = fragmentStore.mActive;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        hashMap3.clear();
        Iterator it = fragmentManagerState.mActive.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fragmentLifecycleCallbacksDispatcher = this.mLifecycleCallbacksDispatcher;
            if (!hasNext) {
                break;
            }
            Bundle savedState = fragmentStore.setSavedState(null, (String) it.next());
            if (savedState != null) {
                Fragment fragment = (Fragment) this.mNonConfig.mRetainedFragments.get(((FragmentState) savedState.getParcelable("state")).mWho);
                if (fragment != null) {
                    if (isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    fragmentStateManager = new FragmentStateManager(fragmentLifecycleCallbacksDispatcher, fragmentStore, fragment, savedState);
                } else {
                    fragmentStateManager = new FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, this.mHost.context.getClassLoader(), getFragmentFactory(), savedState);
                }
                Fragment fragment2 = fragmentStateManager.getFragment();
                fragment2.mSavedFragmentState = savedState;
                fragment2.mFragmentManager = this;
                if (isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                fragmentStateManager.restoreState(this.mHost.context.getClassLoader());
                fragmentStore.makeActive(fragmentStateManager);
                fragmentStateManager.setFragmentManagerState(this.mCurState);
            }
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.mNonConfig;
        fragmentManagerViewModel.getClass();
        Iterator it2 = new ArrayList(fragmentManagerViewModel.mRetainedFragments.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (hashMap3.get(fragment3.mWho) == null) {
                if (isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.mActive);
                }
                this.mNonConfig.removeRetainedFragment(fragment3);
                fragment3.mFragmentManager = this;
                FragmentStateManager fragmentStateManager2 = new FragmentStateManager(fragmentLifecycleCallbacksDispatcher, fragmentStore, fragment3);
                fragmentStateManager2.setFragmentManagerState(1);
                fragmentStateManager2.moveToExpectedState();
                fragment3.mRemoving = true;
                fragmentStateManager2.moveToExpectedState();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.mAdded;
        fragmentStore.mAdded.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment findActiveFragment = fragmentStore.findActiveFragment(str3);
                if (findActiveFragment == null) {
                    a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + findActiveFragment);
                }
                fragmentStore.addFragment(findActiveFragment);
            }
        }
        if (fragmentManagerState.mBackStack != null) {
            this.mBackStack = new ArrayList(fragmentManagerState.mBackStack.length);
            int i = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.mBackStack;
                if (i >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecord instantiate = backStackRecordStateArr[i].instantiate(this);
                if (isLoggingEnabled(2)) {
                    StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "restoreAllState: back stack #", " (index ");
                    m2m.append(instantiate.mIndex);
                    m2m.append("): ");
                    m2m.append(instantiate);
                    Log.v("FragmentManager", m2m.toString());
                    PrintWriter printWriter = new PrintWriter(new LogWriter());
                    instantiate.dump("  ", printWriter, false);
                    printWriter.close();
                }
                this.mBackStack.add(instantiate);
                i++;
            }
        } else {
            this.mBackStack = new ArrayList();
        }
        this.mBackStackIndex.set(fragmentManagerState.mBackStackIndex);
        String str4 = fragmentManagerState.mPrimaryNavActiveWho;
        if (str4 != null) {
            Fragment findActiveFragment2 = fragmentStore.findActiveFragment(str4);
            this.mPrimaryNav = findActiveFragment2;
            dispatchParentPrimaryNavigationFragmentChanged(findActiveFragment2);
        }
        ArrayList arrayList2 = fragmentManagerState.mBackStackStateKeys;
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                this.mBackStackStates.put((String) arrayList2.get(i2), (BackStackState) fragmentManagerState.mBackStackStates.get(i2));
            }
        }
        this.mLaunchedFragments = new ArrayDeque(fragmentManagerState.mLaunchedFragments);
    }

    public final Bundle saveAllStateInternal() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        Iterator it = collectAllSpecialEffectsController().iterator();
        while (it.hasNext()) {
            ((DefaultSpecialEffectsController) it.next()).forcePostponedExecutePendingOperations();
        }
        endAnimatingAwayFragments();
        execPendingActions(true);
        this.mStateSaved = true;
        this.mNonConfig.mIsStateSaved = true;
        FragmentStore fragmentStore = this.mFragmentStore;
        fragmentStore.getClass();
        HashMap hashMap = fragmentStore.mActive;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (FragmentStateManager fragmentStateManager : hashMap.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment = fragmentStateManager.getFragment();
                fragmentStore.setSavedState(fragmentStateManager.saveState(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.mFragmentStore.mSavedState;
        if (!hashMap2.isEmpty()) {
            FragmentStore fragmentStore2 = this.mFragmentStore;
            synchronized (fragmentStore2.mAdded) {
                try {
                    backStackRecordStateArr = null;
                    if (fragmentStore2.mAdded.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(fragmentStore2.mAdded.size());
                        Iterator it2 = fragmentStore2.mAdded.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment2 = (Fragment) it2.next();
                            arrayList.add(fragment2.mWho);
                            if (isLoggingEnabled(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.mBackStack.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((BackStackRecord) this.mBackStack.get(i));
                    if (isLoggingEnabled(2)) {
                        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "saveAllState: adding back stack #", ": ");
                        m2m.append(this.mBackStack.get(i));
                        Log.v("FragmentManager", m2m.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.mActive = arrayList2;
            fragmentManagerState.mAdded = arrayList;
            fragmentManagerState.mBackStack = backStackRecordStateArr;
            fragmentManagerState.mBackStackIndex = this.mBackStackIndex.get();
            Fragment fragment3 = this.mPrimaryNav;
            if (fragment3 != null) {
                fragmentManagerState.mPrimaryNavActiveWho = fragment3.mWho;
            }
            fragmentManagerState.mBackStackStateKeys.addAll(this.mBackStackStates.keySet());
            fragmentManagerState.mBackStackStates.addAll(this.mBackStackStates.values());
            fragmentManagerState.mLaunchedFragments = new ArrayList(this.mLaunchedFragments);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.mResults.keySet()) {
                bundle.putBundle(Recorder$$ExternalSyntheticOutline2.m("result_", str), (Bundle) this.mResults.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(Recorder$$ExternalSyntheticOutline2.m("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        } else if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final Fragment.SavedState saveFragmentInstanceState(Fragment fragment) {
        FragmentStateManager fragmentStateManager = (FragmentStateManager) this.mFragmentStore.mActive.get(fragment.mWho);
        if (fragmentStateManager != null && fragmentStateManager.getFragment().equals(fragment)) {
            return fragmentStateManager.saveInstanceState();
        }
        throwException(new IllegalStateException(Fragment$5$$ExternalSyntheticOutline0.m("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void scheduleCommit() {
        synchronized (this.mPendingActions) {
            try {
                if (this.mPendingActions.size() == 1) {
                    this.mHost.handler.removeCallbacks(this.mExecCommit);
                    this.mHost.handler.post(this.mExecCommit);
                    updateOnBackPressedCallbackEnabled();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setExitAnimationOrder(Fragment fragment, boolean z) {
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer == null || !(fragmentContainer instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) fragmentContainer).setDrawDisappearingViewsLast(!z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.FragmentManager$6, androidx.lifecycle.LifecycleObserver] */
    public final void setFragmentResultListener(final String str, LifecycleOwner lifecycleOwner, final FragmentResultListener fragmentResultListener) {
        final Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        ?? r0 = new LifecycleEventObserver() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Bundle bundle;
                FragmentManager fragmentManager = FragmentManager.this;
                Map map = fragmentManager.mResults;
                Lifecycle.Event event2 = Lifecycle.Event.ON_START;
                String str2 = str;
                if (event == event2 && (bundle = (Bundle) map.get(str2)) != null) {
                    fragmentResultListener.onFragmentResult(bundle, str2);
                    map.remove(str2);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "Clearing fragment result with key ".concat(str2));
                    }
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.removeObserver(this);
                    fragmentManager.mResultListeners.remove(str2);
                }
            }
        };
        LifecycleAwareResultListener lifecycleAwareResultListener = (LifecycleAwareResultListener) this.mResultListeners.put(str, new LifecycleAwareResultListener(lifecycle, fragmentResultListener, r0));
        if (lifecycleAwareResultListener != null) {
            lifecycleAwareResultListener.removeObserver();
        }
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + fragmentResultListener);
        }
        lifecycle.addObserver(r0);
    }

    public final void setMaxLifecycle(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(this.mFragmentStore.findActiveFragment(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
        } else {
            Handlers$$ExternalSyntheticBUOutline0.m$1("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void setPrimaryNavigationFragment(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.mFragmentStore.findActiveFragment(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                Handlers$$ExternalSyntheticBUOutline0.m$1("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        Fragment fragment2 = this.mPrimaryNav;
        this.mPrimaryNav = fragment;
        dispatchParentPrimaryNavigationFragmentChanged(fragment2);
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    public final void setVisibleRemovingFragment(Fragment fragment) {
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (fragmentContainer.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    fragmentContainer.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) fragmentContainer.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void throwException(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter());
        FragmentHostCallback fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            try {
                dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            FragmentActivity.this.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.mParent;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.mParent)));
            sb.append("}");
        } else {
            FragmentHostCallback fragmentHostCallback = this.mHost;
            if (fragmentHostCallback != null) {
                sb.append(fragmentHostCallback.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.mHost)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void updateOnBackPressedCallbackEnabled() {
        synchronized (this.mPendingActions) {
            try {
                if (!this.mPendingActions.isEmpty()) {
                    setEnabled(true);
                    if (isLoggingEnabled(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = getBackStackEntryCount() > 0 && isPrimaryNavigation(this.mParent);
                if (isLoggingEnabled(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                setEnabled(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean popBackStackImmediate() {
        return popBackStackImmediate(-1, 0);
    }
}
