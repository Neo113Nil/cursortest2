package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.core.app.c1;
import defpackage.acd;
import defpackage.b6n;
import defpackage.bnh;
import defpackage.buc;
import defpackage.dtc;
import defpackage.dzf;
import defpackage.eta;
import defpackage.etc;
import defpackage.euc;
import defpackage.ffu;
import defpackage.fi;
import defpackage.fop;
import defpackage.ftc;
import defpackage.gfu;
import defpackage.gtc;
import defpackage.gzf;
import defpackage.hrg;
import defpackage.htc;
import defpackage.is6;
import defpackage.itc;
import defpackage.jfu;
import defpackage.kac;
import defpackage.kfu;
import defpackage.kuc;
import defpackage.kyf;
import defpackage.lop;
import defpackage.ltc;
import defpackage.luc;
import defpackage.lyf;
import defpackage.mop;
import defpackage.muc;
import defpackage.noi;
import defpackage.nyf;
import defpackage.otc;
import defpackage.ouj;
import defpackage.ptc;
import defpackage.q4r;
import defpackage.q6k;
import defpackage.q9;
import defpackage.qdg;
import defpackage.rgg;
import defpackage.rh;
import defpackage.rp7;
import defpackage.sgg;
import defpackage.sh;
import defpackage.sre;
import defpackage.ssd;
import defpackage.swf;
import defpackage.uad;
import defpackage.uh;
import defpackage.uoo;
import defpackage.voi;
import defpackage.voo;
import defpackage.vqr;
import defpackage.woo;
import defpackage.wp3;
import defpackage.wtc;
import defpackage.xoo;
import defpackage.xq0;
import defpackage.yyc;
import defpackage.zbd;
import defpackage.zh;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class o implements ComponentCallbacks, View.OnCreateContextMenuListener, dzf, kfu, ssd, woo, sh {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    gtc mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    y mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    gfu mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    y mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    ptc mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    gzf mLifecycleRegistry;
    lyf mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<htc> mOnPreAttachedListeners;
    o mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final htc mSavedStateAttachListener;
    voo mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    o mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    d0 mViewLifecycleOwner;
    voi mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    public o() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new buc();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new etc(this, 0);
        this.mMaxState = lyf.e;
        this.mViewLifecycleOwnerLiveData = new voi();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new k(this);
        v();
    }

    @NonNull
    @Deprecated
    public static o instantiate(@NonNull Context context, @NonNull String str, Bundle bundle) {
        try {
            o oVar = (o) otc.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return oVar;
            }
            bundle.setClassLoader(oVar.getClass().getClassLoader());
            oVar.setArguments(bundle);
            return oVar;
        } catch (IllegalAccessException e) {
            throw new wp3(hrg.q("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new wp3(hrg.q("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new wp3(hrg.q("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new wp3(hrg.q("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        y yVar;
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar != null) {
            gtcVar.s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (yVar = this.mFragmentManager) == null) {
            return;
        }
        h j = h.j(viewGroup, yVar);
        j.l();
        if (z) {
            this.mHost.c.post(new q9(28, j));
        } else {
            j.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @NonNull
    public ltc createFragmentContainer() {
        return new l(this);
    }

    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        o u = u(false);
        if (u != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(u);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            rgg.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + StringUtils.PROCESS_POSTFIX_DELIMITER);
        this.mChildFragmentManager.v(ouj.n(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public o findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.c.c(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    /* renamed from: getActivity, reason: merged with bridge method [inline-methods] */
    public final t l() {
        ptc ptcVar = this.mHost;
        if (ptcVar == null) {
            return null;
        }
        return ptcVar.a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null || (bool = gtcVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null || (bool = gtcVar.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return null;
        }
        gtcVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final y getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        xq0.q(eta.f("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public Context getContext() {
        ptc ptcVar = this.mHost;
        if (ptcVar == null) {
            return null;
        }
        return ptcVar.b;
    }

    @Override // defpackage.ssd
    @NonNull
    public is6 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && y.M(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        noi noiVar = new noi(0);
        LinkedHashMap linkedHashMap = noiVar.a;
        if (application != null) {
            linkedHashMap.put(ffu.d, application);
        }
        linkedHashMap.put(q6k.h, this);
        linkedHashMap.put(q6k.i, this);
        if (getArguments() != null) {
            linkedHashMap.put(q6k.j, getArguments());
        }
        return noiVar;
    }

    @Override // defpackage.ssd
    @NonNull
    public gfu getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            xq0.q("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && y.M(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new xoo(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return 0;
        }
        return gtcVar.b;
    }

    public Object getEnterTransition() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return null;
        }
        return gtcVar.i;
    }

    public c1 getEnterTransitionCallback() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return null;
        }
        gtcVar.getClass();
        return null;
    }

    public int getExitAnim() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return 0;
        }
        return gtcVar.c;
    }

    public Object getExitTransition() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return null;
        }
        return gtcVar.k;
    }

    public c1 getExitTransitionCallback() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return null;
        }
        gtcVar.getClass();
        return null;
    }

    public View getFocusedView() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return null;
        }
        return gtcVar.r;
    }

    @Deprecated
    public final y getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        ptc ptcVar = this.mHost;
        if (ptcVar == null) {
            return null;
        }
        return ((s) ptcVar).e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        ptc ptcVar = this.mHost;
        if (ptcVar == null) {
            xq0.q("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        t tVar = ((s) ptcVar).e;
        LayoutInflater cloneInContext = tVar.getLayoutInflater().cloneInContext(tVar);
        cloneInContext.setFactory2(this.mChildFragmentManager.f);
        return cloneInContext;
    }

    @Override // defpackage.dzf
    @NonNull
    public nyf getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public rgg getLoaderManager() {
        return rgg.a(this);
    }

    public int getNextTransition() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return 0;
        }
        return gtcVar.f;
    }

    public final o getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final y getParentFragmentManager() {
        y yVar = this.mFragmentManager;
        if (yVar != null) {
            return yVar;
        }
        xq0.q(eta.f("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public boolean getPopDirection() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return false;
        }
        return gtcVar.a;
    }

    public int getPopEnterAnim() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return 0;
        }
        return gtcVar.d;
    }

    public int getPopExitAnim() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return 0;
        }
        return gtcVar.e;
    }

    public float getPostOnViewCreatedAlpha() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return 1.0f;
        }
        return gtcVar.q;
    }

    public Object getReenterTransition() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return null;
        }
        Object obj = gtcVar.l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        luc lucVar = muc.a;
        uad uadVar = new uad(this, "Attempting to get retain instance for fragment " + this);
        muc.c(uadVar);
        luc a = muc.a(this);
        if (a.a.contains(kuc.f) && muc.e(a, getClass(), uad.class)) {
            muc.b(a, uadVar);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return null;
        }
        Object obj = gtcVar.j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // defpackage.woo
    @NonNull
    public final uoo getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    public Object getSharedElementEnterTransition() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return null;
        }
        return gtcVar.m;
    }

    public Object getSharedElementReturnTransition() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return null;
        }
        Object obj = gtcVar.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        gtc gtcVar = this.mAnimationInfo;
        return (gtcVar == null || (arrayList = gtcVar.g) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        gtc gtcVar = this.mAnimationInfo;
        return (gtcVar == null || (arrayList = gtcVar.h) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final o getTargetFragment() {
        return u(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        luc lucVar = muc.a;
        zbd zbdVar = new zbd(this, "Attempting to get target request code from fragment " + this);
        muc.c(zbdVar);
        luc a = muc.a(this);
        if (a.a.contains(kuc.h) && muc.e(a, getClass(), zbd.class)) {
            muc.b(a, zbdVar);
        }
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    @NonNull
    public dzf getViewLifecycleOwner() {
        d0 d0Var = this.mViewLifecycleOwner;
        if (d0Var != null) {
            return d0Var;
        }
        xq0.q(eta.f("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    @NonNull
    public qdg getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // defpackage.kfu
    @NonNull
    public jfu getViewModelStore() {
        if (this.mFragmentManager == null) {
            xq0.q("Can't access ViewModels from detached fragment");
            return null;
        }
        int r = r();
        lyf lyfVar = lyf.a;
        if (r == 1) {
            xq0.q("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap hashMap = this.mFragmentManager.Q.m;
        jfu jfuVar = (jfu) hashMap.get(this.mWho);
        if (jfuVar != null) {
            return jfuVar;
        }
        jfu jfuVar2 = new jfu();
        hashMap.put(this.mWho, jfuVar2);
        return jfuVar2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        v();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new buc();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        y yVar = this.mFragmentManager;
        if (yVar != null) {
            o oVar = this.mParentFragment;
            yVar.getClass();
            if (oVar == null ? false : oVar.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            o oVar = this.mParentFragment;
            if (!(oVar == null ? true : oVar.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        gtc gtcVar = this.mAnimationInfo;
        if (gtcVar == null) {
            return false;
        }
        return gtcVar.s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        y yVar = this.mFragmentManager;
        if (yVar == null) {
            return false;
        }
        return yVar.Q();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.S();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (y.M(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        ptc ptcVar = this.mHost;
        t tVar = ptcVar == null ? null : ptcVar.a;
        if (tVar != null) {
            this.mCalled = false;
            onAttach((Activity) tVar);
        }
    }

    @Deprecated
    public void onAttachFragment(@NonNull o oVar) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        y yVar = this.mChildFragmentManager;
        if (yVar.w >= 1) {
            return;
        }
        yVar.J = false;
        yVar.K = false;
        yVar.Q.p = false;
        yVar.u(1);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        ptc ptcVar = this.mHost;
        t tVar = ptcVar == null ? null : ptcVar.a;
        if (tVar != null) {
            this.mCalled = false;
            onInflate((Activity) tVar, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public final gtc p() {
        if (this.mAnimationInfo == null) {
            gtc gtcVar = new gtc();
            gtcVar.i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            gtcVar.j = obj;
            gtcVar.k = null;
            gtcVar.l = obj;
            gtcVar.m = null;
            gtcVar.n = obj;
            gtcVar.q = 1.0f;
            gtcVar.r = null;
            this.mAnimationInfo = gtcVar;
        }
        return this.mAnimationInfo;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.S();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new vqr(eta.f("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (y.M(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
        y yVar = this.mChildFragmentManager;
        yVar.J = false;
        yVar.K = false;
        yVar.Q.p = false;
        yVar.u(4);
    }

    public void performAttach() {
        Iterator<htc> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.b);
        if (!this.mCalled) {
            throw new vqr(eta.f("Fragment ", this, " did not call through to super.onAttach()"));
        }
        y yVar = this.mFragmentManager;
        Iterator it2 = yVar.q.iterator();
        while (it2.hasNext()) {
            ((euc) it2.next()).a(yVar, this);
        }
        y yVar2 = this.mChildFragmentManager;
        yVar2.J = false;
        yVar2.K = false;
        yVar2.Q.p = false;
        yVar2.u(0);
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.j(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.S();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new m(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new vqr(eta.f("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.g(kyf.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.mChildFragmentManager.k(menu, menuInflater) | z;
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.S();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new d0(this, getViewModelStore(), new j(this));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        d0 d0Var = this.mViewLifecycleOwner;
        if (onCreateView == null) {
            if (d0Var.e == null) {
                this.mViewLifecycleOwner = null;
                return;
            } else {
                xq0.q("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        d0Var.b();
        if (y.M(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        swf.k0(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        d0 d0Var2 = this.mViewLifecycleOwner;
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, d0Var2);
        View view2 = this.mView;
        d0 d0Var3 = this.mViewLifecycleOwner;
        view2.getClass();
        view2.setTag(R.id.view_tree_saved_state_registry_owner, d0Var3);
        this.mViewLifecycleOwnerLiveData.l(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.g(kyf.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new vqr(eta.f("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            d0 d0Var = this.mViewLifecycleOwner;
            d0Var.b();
            if (d0Var.e.d.compareTo(lyf.c) >= 0) {
                this.mViewLifecycleOwner.a(kyf.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new vqr(eta.f("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        q4r q4rVar = rgg.a(this).b.k;
        int i = q4rVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((sgg) q4rVar.f(i2)).n();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new vqr(eta.f("Fragment ", this, " did not call through to super.onDetach()"));
        }
        y yVar = this.mChildFragmentManager;
        if (yVar.L) {
            return;
        }
        yVar.l();
        this.mChildFragmentManager = new buc();
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.p(menuItem);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.q(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(kyf.ON_PAUSE);
        }
        this.mLifecycleRegistry.g(kyf.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new vqr(eta.f("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.mChildFragmentManager.t(menu) | z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean P = y.P(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != P) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(P);
            onPrimaryNavigationFragmentChanged(P);
            y yVar = this.mChildFragmentManager;
            yVar.l0();
            yVar.r(yVar.A);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.S();
        this.mChildFragmentManager.z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new vqr(eta.f("Fragment ", this, " did not call through to super.onResume()"));
        }
        gzf gzfVar = this.mLifecycleRegistry;
        kyf kyfVar = kyf.ON_RESUME;
        gzfVar.g(kyfVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(kyfVar);
        }
        y yVar = this.mChildFragmentManager;
        yVar.J = false;
        yVar.K = false;
        yVar.Q.p = false;
        yVar.u(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.S();
        this.mChildFragmentManager.z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new vqr(eta.f("Fragment ", this, " did not call through to super.onStart()"));
        }
        gzf gzfVar = this.mLifecycleRegistry;
        kyf kyfVar = kyf.ON_START;
        gzfVar.g(kyfVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(kyfVar);
        }
        y yVar = this.mChildFragmentManager;
        yVar.J = false;
        yVar.K = false;
        yVar.Q.p = false;
        yVar.u(5);
    }

    public void performStop() {
        y yVar = this.mChildFragmentManager;
        yVar.K = true;
        yVar.Q.p = true;
        yVar.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(kyf.ON_STOP);
        }
        this.mLifecycleRegistry.g(kyf.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new vqr(eta.f("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.u(2);
    }

    public final void postponeEnterTransition(long j, @NonNull TimeUnit timeUnit) {
        p().s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        y yVar = this.mFragmentManager;
        if (yVar != null) {
            this.mPostponedHandler = yVar.x.c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final int r() {
        lyf lyfVar = this.mMaxState;
        return (lyfVar == lyf.b || this.mParentFragment == null) ? lyfVar.ordinal() : Math.min(lyfVar.ordinal(), this.mParentFragment.r());
    }

    @Override // defpackage.sh
    @NonNull
    public final <I, O> zh registerForActivityResult(@NonNull uh uhVar, @NonNull rh rhVar) {
        return w(uhVar, new n(this), rhVar);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i) {
        if (this.mHost == null) {
            xq0.q(eta.f("Fragment ", this, " not attached to Activity"));
            return;
        }
        y parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.G == null) {
            parentFragmentManager.x.getClass();
            strArr.getClass();
        } else {
            parentFragmentManager.H.addLast(new wtc(this.mWho, i));
            parentFragmentManager.G.a(strArr);
        }
    }

    @NonNull
    public final t requireActivity() {
        t l = l();
        if (l != null) {
            return l;
        }
        xq0.q(eta.f("Fragment ", this, " not attached to an activity."));
        return null;
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        xq0.q(eta.f("Fragment ", this, " does not have any arguments."));
        return null;
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        xq0.q(eta.f("Fragment ", this, " not attached to a context."));
        return null;
    }

    @NonNull
    @Deprecated
    public final y requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        xq0.q(eta.f("Fragment ", this, " not attached to a host."));
        return null;
    }

    @NonNull
    public final o requireParentFragment() {
        o parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            xq0.q(eta.f("Fragment ", this, " is not attached to any Fragment or host"));
            return null;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        Context context = getContext();
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(context);
        throw new IllegalStateException(sb.toString());
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        xq0.q(eta.f("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.a0(bundle);
        y yVar = this.mChildFragmentManager;
        yVar.J = false;
        yVar.K = false;
        yVar.Q.p = false;
        yVar.u(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new vqr(eta.f("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(kyf.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        p().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        p().o = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        p().b = i;
        p().c = i2;
        p().d = i3;
        p().e = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
        } else {
            xq0.q("Fragment already added and state has been saved");
        }
    }

    public void setEnterSharedElementCallback(c1 c1Var) {
        p().getClass();
    }

    public void setEnterTransition(Object obj) {
        p().i = obj;
    }

    public void setExitSharedElementCallback(c1 c1Var) {
        p().getClass();
    }

    public void setExitTransition(Object obj) {
        p().k = obj;
    }

    public void setFocusedView(View view) {
        p().r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((s) this.mHost).e.invalidateMenu();
        }
    }

    public void setInitialSavedState(itc itcVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            xq0.q("Fragment already added");
            return;
        }
        if (itcVar == null || (bundle = itcVar.a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((s) this.mHost).e.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        p();
        this.mAnimationInfo.f = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        p().a = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        p().q = f;
    }

    public void setReenterTransition(Object obj) {
        p().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        luc lucVar = muc.a;
        fop fopVar = new fop(this, "Attempting to set retain instance for fragment " + this);
        muc.c(fopVar);
        luc a = muc.a(this);
        if (a.a.contains(kuc.f) && muc.e(a, getClass(), fop.class)) {
            muc.b(a, fopVar);
        }
        this.mRetainInstance = z;
        y yVar = this.mFragmentManager;
        if (yVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
            return;
        }
        z zVar = yVar.Q;
        if (z) {
            zVar.a(this);
        } else {
            zVar.K(this);
        }
    }

    public void setReturnTransition(Object obj) {
        p().j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        p().m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        p();
        gtc gtcVar = this.mAnimationInfo;
        gtcVar.g = arrayList;
        gtcVar.h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        p().n = obj;
    }

    @Deprecated
    public void setTargetFragment(o oVar, int i) {
        if (oVar != null) {
            luc lucVar = muc.a;
            lop lopVar = new lop(this, "Attempting to set target fragment " + oVar + " with request code " + i + " for fragment " + this);
            muc.c(lopVar);
            luc a = muc.a(this);
            if (a.a.contains(kuc.h) && muc.e(a, getClass(), lop.class)) {
                muc.b(a, lopVar);
            }
        }
        y yVar = this.mFragmentManager;
        y yVar2 = oVar != null ? oVar.mFragmentManager : null;
        if (yVar != null && yVar2 != null && yVar != yVar2) {
            xq0.x(eta.f("Fragment ", oVar, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (o oVar2 = oVar; oVar2 != null; oVar2 = oVar2.u(false)) {
            if (oVar2.equals(this)) {
                kac.g("Setting ", oVar, " as the target of ", this, " would create a target cycle");
                return;
            }
        }
        if (oVar == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || oVar.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = oVar;
        } else {
            this.mTargetWho = oVar.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        luc lucVar = muc.a;
        mop mopVar = new mop(this, "Attempting to set user visible hint to " + z + " for fragment " + this);
        muc.c(mopVar);
        luc a = muc.a(this);
        if (a.a.contains(kuc.g) && muc.e(a, getClass(), mop.class)) {
            muc.b(a, mopVar);
        }
        boolean z2 = false;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            y yVar = this.mFragmentManager;
            b0 g = yVar.g(this);
            o oVar = g.c;
            if (oVar.mDeferStart) {
                if (yVar.b) {
                    yVar.M = true;
                } else {
                    oVar.mDeferStart = false;
                    g.k();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        ptc ptcVar = this.mHost;
        if (ptcVar != null) {
            return androidx.core.app.b.p0(((s) ptcVar).e, str);
        }
        return false;
    }

    public void startActivity(@NonNull Intent intent, Bundle bundle) {
        ptc ptcVar = this.mHost;
        if (ptcVar == null) {
            xq0.q(eta.f("Fragment ", this, " not attached to Activity"));
        } else {
            intent.getClass();
            ptcVar.b.startActivity(intent, bundle);
        }
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i, Bundle bundle) {
        if (this.mHost == null) {
            xq0.q(eta.f("Fragment ", this, " not attached to Activity"));
            return;
        }
        y parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.E != null) {
            parentFragmentManager.H.addLast(new wtc(this.mWho, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.E.a(intent);
            return;
        }
        ptc ptcVar = parentFragmentManager.x;
        ptcVar.getClass();
        intent.getClass();
        if (i == -1) {
            ptcVar.b.startActivity(intent, bundle);
        } else {
            xq0.q("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            xq0.q(eta.f("Fragment ", this, " not attached to Activity"));
            return;
        }
        if (y.M(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        y parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.F == null) {
            ptc ptcVar = parentFragmentManager.x;
            ptcVar.getClass();
            intentSender.getClass();
            if (i != -1) {
                xq0.q("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
            t tVar = ptcVar.a;
            if (tVar != null) {
                tVar.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                return;
            } else {
                xq0.q("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (y.M(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        intentSender.getClass();
        sre sreVar = new sre(intentSender, intent, i2, i3);
        parentFragmentManager.H.addLast(new wtc(this.mWho, i));
        if (y.M(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.F.a(sreVar);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !p().s) {
            return;
        }
        if (this.mHost == null) {
            p().s = false;
        } else if (Looper.myLooper() != this.mHost.c.getLooper()) {
            this.mHost.c.postAtFrontOfQueue(new etc(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public final o u(boolean z) {
        String str;
        if (z) {
            luc lucVar = muc.a;
            acd acdVar = new acd(this, "Attempting to get target fragment from fragment " + this);
            muc.c(acdVar);
            luc a = muc.a(this);
            if (a.a.contains(kuc.h) && muc.e(a, getClass(), acd.class)) {
                muc.b(a, acdVar);
            }
        }
        o oVar = this.mTarget;
        if (oVar != null) {
            return oVar;
        }
        y yVar = this.mFragmentManager;
        if (yVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return yVar.c.b(str);
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final void v() {
        this.mLifecycleRegistry = new gzf(this);
        this.mSavedStateRegistryController = new voo(new bnh(this, new b6n(28, this)));
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        htc htcVar = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            htcVar.a();
        } else {
            this.mOnPreAttachedListeners.add(htcVar);
        }
    }

    public final dtc w(uh uhVar, yyc yycVar, rh rhVar) {
        if (this.mState > 1) {
            xq0.q(eta.f("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        ftc ftcVar = new ftc(this, yycVar, atomicReference, uhVar, rhVar);
        if (this.mState >= 0) {
            ftcVar.a();
        } else {
            this.mOnPreAttachedListeners.add(ftcVar);
        }
        return new dtc(atomicReference);
    }

    @NonNull
    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @NonNull
    public final <I, O> zh registerForActivityResult(@NonNull uh uhVar, @NonNull fi fiVar, @NonNull rh rhVar) {
        return w(uhVar, new rp7(fiVar), rhVar);
    }

    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public void postponeEnterTransition() {
        p().s = true;
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public o(int i) {
        this();
        this.mContentLayoutId = i;
    }

    @NonNull
    @Deprecated
    public static o instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }
}
