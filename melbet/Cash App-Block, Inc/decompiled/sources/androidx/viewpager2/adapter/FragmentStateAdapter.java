package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.collection.LongSparseArray;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentLifecycleCallbacksDispatcher;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ClassesInfoCache;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.savedstate.SavedStateRegistry;
import androidx.viewpager2.widget.CompositeOnPageChangeCallback;
import androidx.viewpager2.widget.ViewPager2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Client;
import com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzd;
import com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzl;
import com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzm;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.widget.recycler.CashRecyclerView$observer$1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter implements StatefulAdapter {
    public final FragmentEventDispatcher mFragmentEventDispatcher;
    public final FragmentManager mFragmentManager;
    public FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    public final LongSparseArray mFragments;
    public boolean mHasStaleFragments;
    public boolean mIsInGracePeriod;
    public final LongSparseArray mItemIdToViewHolder;
    public final Lifecycle mLifecycle;
    public final LongSparseArray mSavedStates;

    public final class FragmentEventDispatcher {
        public CopyOnWriteArrayList mCallbacks;

        public static void dispatchPostEvents(List list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw Recorder$$ExternalSyntheticOutline2.m(it);
            }
        }
    }

    public final class FragmentMaxLifecycleEnforcer {
        public CashRecyclerView$observer$1 mDataObserver;
        public CompositeGeneratedAdaptersObserver mLifecycleObserver;
        public CompositeOnPageChangeCallback mPageChangeCallback;
        public long mPrimaryItemId = -1;
        public ViewPager2 mViewPager;

        public FragmentMaxLifecycleEnforcer() {
        }

        public static ViewPager2 inferViewPager(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            OptionalProvider$$ExternalSyntheticLambda0.m$1(parent, "Expected ViewPager2 instance. Got: ");
            return null;
        }

        public final void updateFragmentMaxLifecycle(boolean z) {
            int i;
            Fragment fragment;
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            FragmentEventDispatcher fragmentEventDispatcher = fragmentStateAdapter.mFragmentEventDispatcher;
            LongSparseArray longSparseArray = fragmentStateAdapter.mFragments;
            FragmentManager fragmentManager = fragmentStateAdapter.mFragmentManager;
            if (fragmentManager.isStateSaved() || this.mViewPager.mScrollEventAdapter.mScrollState != 0 || longSparseArray.isEmpty()) {
                return;
            }
            zzm zzmVar = (zzm) fragmentStateAdapter;
            if (zzmVar.zza.size() != 0 && (i = this.mViewPager.mCurrentItem) < zzmVar.zza.size()) {
                long j = i;
                if ((j != this.mPrimaryItemId || z) && (fragment = (Fragment) longSparseArray.get(j)) != null && fragment.isAdded()) {
                    this.mPrimaryItemId = j;
                    fragmentManager.getClass();
                    BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
                    ArrayList arrayList = new ArrayList();
                    Fragment fragment2 = null;
                    for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                        long keyAt = longSparseArray.keyAt(i2);
                        Fragment fragment3 = (Fragment) longSparseArray.valueAt(i2);
                        if (fragment3.isAdded()) {
                            if (keyAt != this.mPrimaryItemId) {
                                backStackRecord.setMaxLifecycle(fragment3, Lifecycle.State.STARTED);
                                fragmentEventDispatcher.getClass();
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = fragmentEventDispatcher.mCallbacks.iterator();
                                if (it.hasNext()) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(it);
                                }
                                arrayList.add(arrayList2);
                            } else {
                                fragment2 = fragment3;
                            }
                            fragment3.setMenuVisibility(keyAt == this.mPrimaryItemId);
                        }
                    }
                    if (fragment2 != null) {
                        backStackRecord.setMaxLifecycle(fragment2, Lifecycle.State.RESUMED);
                        fragmentEventDispatcher.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = fragmentEventDispatcher.mCallbacks.iterator();
                        if (it2.hasNext()) {
                            throw Recorder$$ExternalSyntheticOutline2.m(it2);
                        }
                        arrayList.add(arrayList3);
                    }
                    if (backStackRecord.mOps.isEmpty()) {
                        return;
                    }
                    backStackRecord.commitNow();
                    Collections.reverse(arrayList);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        List list = (List) it3.next();
                        fragmentEventDispatcher.getClass();
                        FragmentEventDispatcher.dispatchPostEvents(list);
                    }
                }
            }
        }
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        Object obj = null;
        this.mFragments = new LongSparseArray(obj);
        this.mSavedStates = new LongSparseArray(obj);
        this.mItemIdToViewHolder = new LongSparseArray(obj);
        FragmentEventDispatcher fragmentEventDispatcher = new FragmentEventDispatcher();
        fragmentEventDispatcher.mCallbacks = new CopyOnWriteArrayList();
        this.mFragmentEventDispatcher = fragmentEventDispatcher;
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = fragmentManager;
        this.mLifecycle = lifecycle;
        setHasStableIds(true);
    }

    public static void addViewToContainer(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            a$$ExternalSyntheticBUOutline0.m$1("Design assumption violated.");
            return;
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public final boolean containsItem(long j) {
        return j >= 0 && j < ((long) ((zzm) this).zza.size());
    }

    public final void gcFragments() {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2;
        Fragment fragment;
        View view;
        if (!this.mHasStaleFragments || this.mFragmentManager.isStateSaved()) {
            return;
        }
        ArraySet arraySet = new ArraySet(0);
        int i = 0;
        while (true) {
            longSparseArray = this.mFragments;
            int size = longSparseArray.size();
            longSparseArray2 = this.mItemIdToViewHolder;
            if (i >= size) {
                break;
            }
            long keyAt = longSparseArray.keyAt(i);
            if (!containsItem(keyAt)) {
                arraySet.add(Long.valueOf(keyAt));
                longSparseArray2.remove(keyAt);
            }
            i++;
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                long keyAt2 = longSparseArray.keyAt(i2);
                if (longSparseArray2.indexOfKey(keyAt2) < 0 && ((fragment = (Fragment) longSparseArray.get(keyAt2)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                    arraySet.add(Long.valueOf(keyAt2));
                }
            }
        }
        ArrayMap.KeyIterator keyIterator = new ArrayMap.KeyIterator(arraySet);
        while (keyIterator.hasNext()) {
            removeFragment(((Long) keyIterator.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public final Long itemForViewHolder(int i) {
        int i2 = 0;
        Long l = null;
        while (true) {
            LongSparseArray longSparseArray = this.mItemIdToViewHolder;
            if (i2 >= longSparseArray.size()) {
                return l;
            }
            if (((Integer) longSparseArray.valueAt(i2)).intValue() == i) {
                if (l != null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    return null;
                }
                l = Long.valueOf(longSparseArray.keyAt(i2));
            }
            i2++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        int i = 1;
        TransactorKt.checkArgument(this.mFragmentMaxLifecycleEnforcer == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.mFragmentMaxLifecycleEnforcer = fragmentMaxLifecycleEnforcer;
        ViewPager2 inferViewPager = FragmentMaxLifecycleEnforcer.inferViewPager(recyclerView);
        fragmentMaxLifecycleEnforcer.mViewPager = inferViewPager;
        CompositeOnPageChangeCallback compositeOnPageChangeCallback = new CompositeOnPageChangeCallback(fragmentMaxLifecycleEnforcer, i);
        fragmentMaxLifecycleEnforcer.mPageChangeCallback = compositeOnPageChangeCallback;
        inferViewPager.registerOnPageChangeCallback(compositeOnPageChangeCallback);
        CashRecyclerView$observer$1 cashRecyclerView$observer$1 = new CashRecyclerView$observer$1(fragmentMaxLifecycleEnforcer, 2);
        fragmentMaxLifecycleEnforcer.mDataObserver = cashRecyclerView$observer$1;
        registerAdapterDataObserver(cashRecyclerView$observer$1);
        CompositeGeneratedAdaptersObserver compositeGeneratedAdaptersObserver = new CompositeGeneratedAdaptersObserver(fragmentMaxLifecycleEnforcer, 3);
        fragmentMaxLifecycleEnforcer.mLifecycleObserver = compositeGeneratedAdaptersObserver;
        this.mLifecycle.addObserver(compositeGeneratedAdaptersObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        FragmentViewHolder fragmentViewHolder = (FragmentViewHolder) viewHolder;
        long itemId = fragmentViewHolder.getItemId();
        int id = ((FrameLayout) fragmentViewHolder.itemView).getId();
        Long itemForViewHolder = itemForViewHolder(id);
        LongSparseArray longSparseArray = this.mItemIdToViewHolder;
        if (itemForViewHolder != null && itemForViewHolder.longValue() != itemId) {
            removeFragment(itemForViewHolder.longValue());
            longSparseArray.remove(itemForViewHolder.longValue());
        }
        longSparseArray.put(Integer.valueOf(id), itemId);
        long j = i;
        LongSparseArray longSparseArray2 = this.mFragments;
        if (longSparseArray2.indexOfKey(j) < 0) {
            zzm zzmVar = (zzm) this;
            zzd zzdVar = (zzd) zzmVar.zza.get(i);
            int size = zzmVar.zza.size() - 1;
            zzdVar.getClass();
            zzl zzlVar = new zzl();
            Bundle bundle = new Bundle();
            bundle.putParcelable("page_data", zzdVar);
            bundle.putBoolean("has_previous", i > 0);
            bundle.putBoolean("has_next", i < size);
            zzlVar.setArguments(bundle);
            zzlVar.setInitialSavedState((Fragment.SavedState) this.mSavedStates.get(j));
            longSparseArray2.put(zzlVar, j);
        }
        if (((FrameLayout) fragmentViewHolder.itemView).isAttachedToWindow()) {
            placeFragmentInViewHolder(fragmentViewHolder);
        }
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = FragmentViewHolder.$r8$clinit;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new FragmentViewHolder(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = this.mFragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.getClass();
        ViewPager2 inferViewPager = FragmentMaxLifecycleEnforcer.inferViewPager(recyclerView);
        ((ArrayList) inferViewPager.mExternalPageChangeCallbacks.mCallbacks).remove(fragmentMaxLifecycleEnforcer.mPageChangeCallback);
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.unregisterAdapterDataObserver(fragmentMaxLifecycleEnforcer.mDataObserver);
        fragmentStateAdapter.mLifecycle.removeObserver(fragmentMaxLifecycleEnforcer.mLifecycleObserver);
        fragmentMaxLifecycleEnforcer.mViewPager = null;
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        placeFragmentInViewHolder((FragmentViewHolder) viewHolder);
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        Long itemForViewHolder = itemForViewHolder(((FrameLayout) ((FragmentViewHolder) viewHolder).itemView).getId());
        if (itemForViewHolder != null) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.remove(itemForViewHolder.longValue());
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.viewpager2.adapter.FragmentStateAdapter$2] */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.viewpager2.adapter.FragmentStateAdapter$2] */
    public final void placeFragmentInViewHolder(FragmentViewHolder fragmentViewHolder) {
        final Fragment fragment = (Fragment) this.mFragments.get(fragmentViewHolder.getItemId());
        if (fragment == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Design assumption violated.");
            return;
        }
        final FrameLayout frameLayout = (FrameLayout) fragmentViewHolder.itemView;
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            a$$ExternalSyntheticBUOutline0.m$1("Design assumption violated.");
            return;
        }
        boolean isAdded = fragment.isAdded();
        FragmentManager fragmentManager = this.mFragmentManager;
        if (isAdded && view == null) {
            ?? r9 = new FragmentManager.FragmentLifecycleCallbacks(this) { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
                
                    r4.lifecycleCallbacks.remove(r1);
                 */
                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onFragmentViewCreated(FragmentManager fragmentManager2, Fragment fragment2, View view2) {
                    if (fragment2 == fragment) {
                        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = fragmentManager2.mLifecycleCallbacksDispatcher;
                        fragmentLifecycleCallbacksDispatcher.getClass();
                        synchronized (fragmentLifecycleCallbacksDispatcher.lifecycleCallbacks) {
                            int size = fragmentLifecycleCallbacksDispatcher.lifecycleCallbacks.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                } else if (((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) fragmentLifecycleCallbacksDispatcher.lifecycleCallbacks.get(i)).callback == this) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        FragmentStateAdapter.addViewToContainer(view2, frameLayout);
                    }
                }
            };
            FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = fragmentManager.mLifecycleCallbacksDispatcher;
            fragmentLifecycleCallbacksDispatcher.getClass();
            fragmentLifecycleCallbacksDispatcher.lifecycleCallbacks.add(new FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder(r9));
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                addViewToContainer(view, frameLayout);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            addViewToContainer(view, frameLayout);
            return;
        }
        if (fragmentManager.isStateSaved()) {
            if (fragmentManager.mDestroyed) {
                return;
            }
            this.mLifecycle.addObserver(new AnonymousClass1(this, fragmentViewHolder));
            return;
        }
        ?? r2 = new FragmentManager.FragmentLifecycleCallbacks(this) { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
            
                r4.lifecycleCallbacks.remove(r1);
             */
            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onFragmentViewCreated(FragmentManager fragmentManager2, Fragment fragment2, View view2) {
                if (fragment2 == fragment) {
                    FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher2 = fragmentManager2.mLifecycleCallbacksDispatcher;
                    fragmentLifecycleCallbacksDispatcher2.getClass();
                    synchronized (fragmentLifecycleCallbacksDispatcher2.lifecycleCallbacks) {
                        int size = fragmentLifecycleCallbacksDispatcher2.lifecycleCallbacks.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            } else if (((FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) fragmentLifecycleCallbacksDispatcher2.lifecycleCallbacks.get(i)).callback == this) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    FragmentStateAdapter.addViewToContainer(view2, frameLayout);
                }
            }
        };
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher2 = fragmentManager.mLifecycleCallbacksDispatcher;
        fragmentLifecycleCallbacksDispatcher2.getClass();
        fragmentLifecycleCallbacksDispatcher2.lifecycleCallbacks.add(new FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder(r2));
        FragmentEventDispatcher fragmentEventDispatcher = this.mFragmentEventDispatcher;
        fragmentEventDispatcher.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = fragmentEventDispatcher.mCallbacks.iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
        try {
            fragment.setMenuVisibility(false);
            BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
            backStackRecord.doAddOp(0, fragment, "f" + fragmentViewHolder.getItemId(), 1);
            backStackRecord.setMaxLifecycle(fragment, Lifecycle.State.STARTED);
            backStackRecord.commitNow();
            this.mFragmentMaxLifecycleEnforcer.updateFragmentMaxLifecycle(false);
        } finally {
            FragmentEventDispatcher.dispatchPostEvents(arrayList);
        }
    }

    public final void removeFragment(long j) {
        ViewParent parent;
        LongSparseArray longSparseArray = this.mFragments;
        Fragment fragment = (Fragment) longSparseArray.get(j);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean containsItem = containsItem(j);
        LongSparseArray longSparseArray2 = this.mSavedStates;
        if (!containsItem) {
            longSparseArray2.remove(j);
        }
        if (!fragment.isAdded()) {
            longSparseArray.remove(j);
            return;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager.isStateSaved()) {
            this.mHasStaleFragments = true;
            return;
        }
        boolean isAdded = fragment.isAdded();
        FragmentEventDispatcher fragmentEventDispatcher = this.mFragmentEventDispatcher;
        if (isAdded && containsItem(j)) {
            fragmentEventDispatcher.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = fragmentEventDispatcher.mCallbacks.iterator();
            if (it.hasNext()) {
                throw Recorder$$ExternalSyntheticOutline2.m(it);
            }
            Fragment.SavedState saveFragmentInstanceState = fragmentManager.saveFragmentInstanceState(fragment);
            FragmentEventDispatcher.dispatchPostEvents(arrayList);
            longSparseArray2.put(saveFragmentInstanceState, j);
        }
        fragmentEventDispatcher.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = fragmentEventDispatcher.mCallbacks.iterator();
        if (it2.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it2);
        }
        try {
            BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
            backStackRecord.remove(fragment);
            backStackRecord.commitNow();
            longSparseArray.remove(j);
        } finally {
            FragmentEventDispatcher.dispatchPostEvents(arrayList2);
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$1, reason: invalid class name */
    public final class AnonymousClass1 implements LifecycleEventObserver {
        public final /* synthetic */ int $r8$classId;
        public final Object this$0;
        public final Object val$holder;

        public AnonymousClass1(LifecycleObserver lifecycleObserver) {
            this.$r8$classId = 2;
            this.val$holder = lifecycleObserver;
            ClassesInfoCache classesInfoCache = ClassesInfoCache.sInstance;
            Class<?> cls = lifecycleObserver.getClass();
            ClassesInfoCache.CallbackInfo callbackInfo = (ClassesInfoCache.CallbackInfo) classesInfoCache.mCallbackMap.get(cls);
            this.this$0 = callbackInfo == null ? classesInfoCache.createInfo(cls, null) : callbackInfo;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            Object obj2 = this.val$holder;
            switch (i) {
                case 0:
                    FragmentViewHolder fragmentViewHolder = (FragmentViewHolder) obj2;
                    FragmentStateAdapter fragmentStateAdapter = (FragmentStateAdapter) obj;
                    if (!fragmentStateAdapter.mFragmentManager.isStateSaved()) {
                        lifecycleOwner.getLifecycle().removeObserver(this);
                        if (((FrameLayout) fragmentViewHolder.itemView).isAttachedToWindow()) {
                            fragmentStateAdapter.placeFragmentInViewHolder(fragmentViewHolder);
                            break;
                        }
                    }
                    break;
                case 1:
                    if (event == Lifecycle.Event.ON_START) {
                        ((Lifecycle) obj2).removeObserver(this);
                        ((SavedStateRegistry) obj).runOnNextRecreation();
                        break;
                    }
                    break;
                case 2:
                    HashMap hashMap = ((ClassesInfoCache.CallbackInfo) obj).mEventToHandlers;
                    ClassesInfoCache.CallbackInfo.invokeMethodsForEvent((List) hashMap.get(event), lifecycleOwner, event, obj2);
                    ClassesInfoCache.CallbackInfo.invokeMethodsForEvent((List) hashMap.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj2);
                    break;
                default:
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ((Handler) obj2).removeCallbacks((Client.AnonymousClass7) obj);
                        lifecycleOwner.getLifecycle().removeObserver(this);
                        break;
                    }
                    break;
            }
        }

        public /* synthetic */ AnonymousClass1(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.val$holder = obj;
            this.this$0 = obj2;
        }

        public AnonymousClass1(FragmentStateAdapter fragmentStateAdapter, FragmentViewHolder fragmentViewHolder) {
            this.$r8$classId = 0;
            this.this$0 = fragmentStateAdapter;
            this.val$holder = fragmentViewHolder;
        }
    }
}
