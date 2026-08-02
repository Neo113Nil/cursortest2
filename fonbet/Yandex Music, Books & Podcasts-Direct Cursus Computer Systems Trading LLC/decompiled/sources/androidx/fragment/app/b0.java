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
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import defpackage.eta;
import defpackage.f1d;
import defpackage.jb;
import defpackage.kfu;
import defpackage.kuc;
import defpackage.l5r;
import defpackage.l6w;
import defpackage.ldu;
import defpackage.luc;
import defpackage.lyf;
import defpackage.m6w;
import defpackage.muc;
import defpackage.nnk;
import defpackage.otc;
import defpackage.ouj;
import defpackage.ptc;
import defpackage.su4;
import defpackage.wdu;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class b0 {
    public final nnk a;
    public final c0 b;
    public final o c;
    public boolean d = false;
    public int e = -1;

    public b0(nnk nnkVar, c0 c0Var, ClassLoader classLoader, otc otcVar, Bundle bundle) {
        this.a = nnkVar;
        this.b = c0Var;
        a0 a0Var = (a0) bundle.getParcelable("state");
        o a = otcVar.a(classLoader, a0Var.a);
        a.mWho = a0Var.b;
        a.mFromLayout = a0Var.c;
        a.mInDynamicContainer = a0Var.d;
        a.mRestored = true;
        a.mFragmentId = a0Var.e;
        a.mContainerId = a0Var.f;
        a.mTag = a0Var.g;
        a.mRetainInstance = a0Var.h;
        a.mRemoving = a0Var.i;
        a.mDetached = a0Var.j;
        a.mHidden = a0Var.k;
        a.mMaxState = lyf.values()[a0Var.l];
        a.mTargetWho = a0Var.m;
        a.mTargetRequestCode = a0Var.n;
        a.mUserVisibleHint = a0Var.o;
        this.c = a;
        a.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a.setArguments(bundle2);
        if (y.M(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    public final void a() {
        boolean M = y.M(3);
        o oVar = this.c;
        if (M) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + oVar);
        }
        Bundle bundle = oVar.mSavedFragmentState;
        oVar.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.a.j(oVar, false);
    }

    public final void b() {
        o oVar;
        View view;
        View view2;
        o oVar2 = this.c;
        View view3 = oVar2.mContainer;
        while (true) {
            oVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            o oVar3 = tag instanceof o ? (o) tag : null;
            if (oVar3 != null) {
                oVar = oVar3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        o parentFragment = oVar2.getParentFragment();
        if (oVar != null && !oVar.equals(parentFragment)) {
            int i = oVar2.mContainerId;
            luc lucVar = muc.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(oVar2);
            sb.append(" within the view of parent fragment ");
            sb.append(oVar);
            sb.append(" via container with ID ");
            m6w m6wVar = new m6w(oVar2, f1d.i(sb, i, " without using parent's childFragmentManager"));
            muc.c(m6wVar);
            luc a = muc.a(oVar2);
            if (a.a.contains(kuc.e) && muc.e(a, oVar2.getClass(), m6w.class)) {
                muc.b(a, m6wVar);
            }
        }
        ArrayList arrayList = this.b.a;
        ViewGroup viewGroup = oVar2.mContainer;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(oVar2);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        o oVar4 = (o) arrayList.get(indexOf);
                        if (oVar4.mContainer == viewGroup && (view = oVar4.mView) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    o oVar5 = (o) arrayList.get(i3);
                    if (oVar5.mContainer == viewGroup && (view2 = oVar5.mView) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        oVar2.mContainer.addView(oVar2.mView, i2);
    }

    public final void c() {
        boolean M = y.M(3);
        o oVar = this.c;
        if (M) {
            Log.d("FragmentManager", "moveto ATTACHED: " + oVar);
        }
        o oVar2 = oVar.mTarget;
        b0 b0Var = null;
        c0 c0Var = this.b;
        if (oVar2 != null) {
            b0 b0Var2 = (b0) c0Var.b.get(oVar2.mWho);
            if (b0Var2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(oVar);
                o oVar3 = oVar.mTarget;
                sb.append(" declared target fragment ");
                sb.append(oVar3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            oVar.mTargetWho = oVar.mTarget.mWho;
            oVar.mTarget = null;
            b0Var = b0Var2;
        } else {
            String str = oVar.mTargetWho;
            if (str != null && (b0Var = (b0) c0Var.b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(oVar);
                sb2.append(" declared target fragment ");
                xq0.q(su4.o(sb2, oVar.mTargetWho, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (b0Var != null) {
            b0Var.k();
        }
        y yVar = oVar.mFragmentManager;
        oVar.mHost = yVar.x;
        oVar.mParentFragment = yVar.z;
        nnk nnkVar = this.a;
        nnkVar.p(oVar, false);
        oVar.performAttach();
        nnkVar.k(oVar, false);
    }

    public final int d() {
        o oVar = this.c;
        if (oVar.mFragmentManager == null) {
            return oVar.mState;
        }
        int i = this.e;
        int ordinal = oVar.mMaxState.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (oVar.mFromLayout) {
            boolean z = oVar.mInLayout;
            int i2 = this.e;
            if (z) {
                i = Math.max(i2, 2);
                View view = oVar.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = i2 < 4 ? Math.min(i, oVar.mState) : Math.min(i, 1);
            }
        }
        if (oVar.mInDynamicContainer && oVar.mContainer == null) {
            i = Math.min(i, 4);
        }
        if (!oVar.mAdded) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = oVar.mContainer;
        if (viewGroup != null) {
            h j = h.j(viewGroup, oVar.getParentFragmentManager());
            f0 g = j.g(oVar);
            int i3 = g != null ? g.b : 0;
            f0 h = j.h(oVar);
            r3 = h != null ? h.b : 0;
            int i4 = i3 == 0 ? -1 : l5r.a[ouj.D(i3)];
            if (i4 != -1 && i4 != 1) {
                r3 = i3;
            }
        }
        if (r3 == 2) {
            i = Math.min(i, 6);
        } else if (r3 == 3) {
            i = Math.max(i, 3);
        } else if (oVar.mRemoving) {
            i = oVar.isInBackStack() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (oVar.mDeferStart && oVar.mState < 5) {
            i = Math.min(i, 4);
        }
        if (oVar.mTransitioning) {
            i = Math.max(i, 3);
        }
        if (y.M(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + oVar);
        }
        return i;
    }

    public final void e() {
        boolean M = y.M(3);
        o oVar = this.c;
        if (M) {
            Log.d("FragmentManager", "moveto CREATED: " + oVar);
        }
        Bundle bundle = oVar.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (oVar.mIsCreated) {
            oVar.mState = 1;
            oVar.restoreChildFragmentState();
        } else {
            nnk nnkVar = this.a;
            nnkVar.q(oVar, false);
            oVar.performCreate(bundle2);
            nnkVar.l(oVar, false);
        }
    }

    public final void f() {
        String str;
        o oVar = this.c;
        if (oVar.mFromLayout) {
            return;
        }
        if (y.M(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + oVar);
        }
        Bundle bundle = oVar.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = oVar.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = oVar.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = oVar.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    xq0.x(eta.f("Cannot create fragment ", oVar, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) oVar.mFragmentManager.y.b(i);
                if (viewGroup == null) {
                    if (!oVar.mRestored && !oVar.mInDynamicContainer) {
                        try {
                            str = oVar.getResources().getResourceName(oVar.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(oVar.mContainerId) + " (" + str + ") for fragment " + oVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    luc lucVar = muc.a;
                    l6w l6wVar = new l6w(oVar, "Attempting to add fragment " + oVar + " to container " + viewGroup + " which is not a FragmentContainerView");
                    muc.c(l6wVar);
                    luc a = muc.a(oVar);
                    if (a.a.contains(kuc.i) && muc.e(a, oVar.getClass(), l6w.class)) {
                        muc.b(a, l6wVar);
                    }
                }
            }
        }
        oVar.mContainer = viewGroup;
        oVar.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
        if (oVar.mView != null) {
            if (y.M(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + oVar);
            }
            oVar.mView.setSaveFromParentEnabled(false);
            oVar.mView.setTag(R.id.fragment_container_view_tag, oVar);
            if (viewGroup != null) {
                b();
            }
            if (oVar.mHidden) {
                oVar.mView.setVisibility(8);
            }
            boolean isAttachedToWindow = oVar.mView.isAttachedToWindow();
            View view = oVar.mView;
            if (isAttachedToWindow) {
                WeakHashMap weakHashMap = wdu.a;
                ldu.c(view);
            } else {
                view.addOnAttachStateChangeListener(new jb(6, view));
            }
            oVar.performViewCreated();
            this.a.x(oVar, oVar.mView, false);
            int visibility = oVar.mView.getVisibility();
            oVar.setPostOnViewCreatedAlpha(oVar.mView.getAlpha());
            if (oVar.mContainer != null && visibility == 0) {
                View findFocus = oVar.mView.findFocus();
                if (findFocus != null) {
                    oVar.setFocusedView(findFocus);
                    if (y.M(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + oVar);
                    }
                }
                oVar.mView.setAlpha(0.0f);
            }
        }
        oVar.mState = 2;
    }

    public final void g() {
        o b;
        boolean M = y.M(3);
        o oVar = this.c;
        if (M) {
            Log.d("FragmentManager", "movefrom CREATED: " + oVar);
        }
        boolean z = true;
        boolean z2 = oVar.mRemoving && !oVar.isInBackStack();
        c0 c0Var = this.b;
        if (z2 && !oVar.mBeingSaved) {
            c0Var.i(null, oVar.mWho);
        }
        if (!z2) {
            z zVar = c0Var.d;
            if (!((zVar.k.containsKey(oVar.mWho) && zVar.n) ? zVar.o : true)) {
                String str = oVar.mTargetWho;
                if (str != null && (b = c0Var.b(str)) != null && b.mRetainInstance) {
                    oVar.mTarget = b;
                }
                oVar.mState = 0;
                return;
            }
        }
        ptc ptcVar = oVar.mHost;
        if (ptcVar instanceof kfu) {
            z = c0Var.d.o;
        } else {
            t tVar = ptcVar.b;
            if (tVar != null) {
                z = true ^ tVar.isChangingConfigurations();
            }
        }
        if ((z2 && !oVar.mBeingSaved) || z) {
            c0Var.d.G(oVar, false);
        }
        oVar.performDestroy();
        this.a.m(oVar, false);
        Iterator it = c0Var.d().iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if (b0Var != null) {
                o oVar2 = b0Var.c;
                if (oVar.mWho.equals(oVar2.mTargetWho)) {
                    oVar2.mTarget = oVar;
                    oVar2.mTargetWho = null;
                }
            }
        }
        String str2 = oVar.mTargetWho;
        if (str2 != null) {
            oVar.mTarget = c0Var.b(str2);
        }
        c0Var.h(this);
    }

    public final void h() {
        View view;
        boolean M = y.M(3);
        o oVar = this.c;
        if (M) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + oVar);
        }
        ViewGroup viewGroup = oVar.mContainer;
        if (viewGroup != null && (view = oVar.mView) != null) {
            viewGroup.removeView(view);
        }
        oVar.performDestroyView();
        this.a.y(oVar, false);
        oVar.mContainer = null;
        oVar.mView = null;
        oVar.mViewLifecycleOwner = null;
        oVar.mViewLifecycleOwnerLiveData.l(null);
        oVar.mInLayout = false;
    }

    public final void i() {
        boolean M = y.M(3);
        o oVar = this.c;
        if (M) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + oVar);
        }
        oVar.performDetach();
        this.a.n(oVar, false);
        oVar.mState = -1;
        oVar.mHost = null;
        oVar.mParentFragment = null;
        oVar.mFragmentManager = null;
        if (!oVar.mRemoving || oVar.isInBackStack()) {
            z zVar = this.b.d;
            if (!((zVar.k.containsKey(oVar.mWho) && zVar.n) ? zVar.o : true)) {
                return;
            }
        }
        if (y.M(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + oVar);
        }
        oVar.initState();
    }

    public final void j() {
        o oVar = this.c;
        if (oVar.mFromLayout && oVar.mInLayout && !oVar.mPerformedCreateView) {
            if (y.M(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + oVar);
            }
            Bundle bundle = oVar.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            oVar.performCreateView(oVar.performGetLayoutInflater(bundle2), null, bundle2);
            View view = oVar.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                oVar.mView.setTag(R.id.fragment_container_view_tag, oVar);
                if (oVar.mHidden) {
                    oVar.mView.setVisibility(8);
                }
                oVar.performViewCreated();
                this.a.x(oVar, oVar.mView, false);
                oVar.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a9, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        o oVar = this.c;
        if (z) {
            if (y.M(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + oVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int d = d();
                int i = oVar.mState;
                int i2 = 3;
                c0 c0Var = this.b;
                if (d == i) {
                    if (!z2 && i == -1 && oVar.mRemoving && !oVar.isInBackStack() && !oVar.mBeingSaved) {
                        if (y.M(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + oVar);
                        }
                        c0Var.d.G(oVar, true);
                        c0Var.h(this);
                        if (y.M(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + oVar);
                        }
                        oVar.initState();
                    }
                    if (oVar.mHiddenChanged) {
                        if (oVar.mView != null && (viewGroup = oVar.mContainer) != null) {
                            h j = h.j(viewGroup, oVar.getParentFragmentManager());
                            if (oVar.mHidden) {
                                if (y.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + oVar);
                                }
                                j.d(3, 1, this);
                            } else {
                                if (y.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + oVar);
                                }
                                j.d(2, 1, this);
                            }
                        }
                        y yVar = oVar.mFragmentManager;
                        if (yVar != null && oVar.mAdded && y.N(oVar)) {
                            yVar.I = true;
                        }
                        oVar.mHiddenChanged = false;
                        oVar.onHiddenChanged(oVar.mHidden);
                        oVar.mChildFragmentManager.o();
                    }
                    this.d = false;
                    return;
                }
                nnk nnkVar = this.a;
                if (d <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (oVar.mBeingSaved) {
                                if (((Bundle) c0Var.c.get(oVar.mWho)) == null) {
                                    c0Var.i(n(), oVar.mWho);
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            oVar.mState = 1;
                            break;
                        case 2:
                            oVar.mInLayout = false;
                            oVar.mState = 2;
                            break;
                        case 3:
                            if (y.M(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + oVar);
                            }
                            if (oVar.mBeingSaved) {
                                c0Var.i(n(), oVar.mWho);
                            } else if (oVar.mView != null && oVar.mSavedViewState == null) {
                                o();
                            }
                            if (oVar.mView != null && (viewGroup2 = oVar.mContainer) != null) {
                                h j2 = h.j(viewGroup2, oVar.getParentFragmentManager());
                                if (y.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + oVar);
                                }
                                j2.d(1, 3, this);
                            }
                            oVar.mState = 3;
                            break;
                        case 4:
                            if (y.M(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + oVar);
                            }
                            oVar.performStop();
                            nnkVar.w(oVar, false);
                            break;
                        case 5:
                            oVar.mState = 5;
                            break;
                        case 6:
                            if (y.M(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + oVar);
                            }
                            oVar.performPause();
                            nnkVar.o(oVar, false);
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (oVar.mView != null && (viewGroup3 = oVar.mContainer) != null) {
                                h j3 = h.j(viewGroup3, oVar.getParentFragmentManager());
                                int visibility = oVar.mView.getVisibility();
                                if (visibility == 0) {
                                    i2 = 2;
                                } else if (visibility == 4) {
                                    i2 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                if (y.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + oVar);
                                }
                                j3.d(i2, 2, this);
                            }
                            oVar.mState = 4;
                            break;
                        case 5:
                            if (y.M(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + oVar);
                            }
                            oVar.performStart();
                            nnkVar.v(oVar, false);
                            break;
                        case 6:
                            oVar.mState = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l(ClassLoader classLoader) {
        o oVar = this.c;
        Bundle bundle = oVar.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (oVar.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            oVar.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            oVar.mSavedViewState = oVar.mSavedFragmentState.getSparseParcelableArray("viewState");
            oVar.mSavedViewRegistryState = oVar.mSavedFragmentState.getBundle("viewRegistryState");
            a0 a0Var = (a0) oVar.mSavedFragmentState.getParcelable("state");
            if (a0Var != null) {
                oVar.mTargetWho = a0Var.m;
                oVar.mTargetRequestCode = a0Var.n;
                Boolean bool = oVar.mSavedUserVisibleHint;
                if (bool != null) {
                    oVar.mUserVisibleHint = bool.booleanValue();
                    oVar.mSavedUserVisibleHint = null;
                } else {
                    oVar.mUserVisibleHint = a0Var.o;
                }
            }
            if (oVar.mUserVisibleHint) {
                return;
            }
            oVar.mDeferStart = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + oVar, e);
        }
    }

    public final void m() {
        boolean M = y.M(3);
        o oVar = this.c;
        if (M) {
            Log.d("FragmentManager", "moveto RESUMED: " + oVar);
        }
        View focusedView = oVar.getFocusedView();
        if (focusedView != null) {
            if (focusedView != oVar.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != oVar.mView) {
                    }
                }
            }
            boolean requestFocus = focusedView.requestFocus();
            if (y.M(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(StringUtil.SPACE);
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(oVar);
                sb.append(" resulting in focused view ");
                sb.append(oVar.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        oVar.setFocusedView(null);
        oVar.performResume();
        this.a.t(oVar, false);
        this.b.i(null, oVar.mWho);
        oVar.mSavedFragmentState = null;
        oVar.mSavedViewState = null;
        oVar.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        o oVar = this.c;
        if (oVar.mState == -1 && (bundle = oVar.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new a0(oVar));
        if (oVar.mState > -1) {
            Bundle bundle3 = new Bundle();
            oVar.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.u(oVar, bundle3, false);
            Bundle bundle4 = new Bundle();
            oVar.mSavedStateRegistryController.b(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle b0 = oVar.mChildFragmentManager.b0();
            if (!b0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", b0);
            }
            if (oVar.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = oVar.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = oVar.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = oVar.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        o oVar = this.c;
        if (oVar.mView == null) {
            return;
        }
        if (y.M(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + oVar + " with view " + oVar.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        oVar.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            oVar.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        oVar.mViewLifecycleOwner.f.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        oVar.mSavedViewRegistryState = bundle;
    }

    public b0(nnk nnkVar, c0 c0Var, o oVar) {
        this.a = nnkVar;
        this.b = c0Var;
        this.c = oVar;
    }

    public b0(nnk nnkVar, c0 c0Var, o oVar, Bundle bundle) {
        this.a = nnkVar;
        this.b = c0Var;
        this.c = oVar;
        oVar.mSavedViewState = null;
        oVar.mSavedViewRegistryState = null;
        oVar.mBackStackNesting = 0;
        oVar.mInLayout = false;
        oVar.mAdded = false;
        o oVar2 = oVar.mTarget;
        oVar.mTargetWho = oVar2 != null ? oVar2.mWho : null;
        oVar.mTarget = null;
        oVar.mSavedFragmentState = bundle;
        oVar.mArguments = bundle.getBundle("arguments");
    }
}
