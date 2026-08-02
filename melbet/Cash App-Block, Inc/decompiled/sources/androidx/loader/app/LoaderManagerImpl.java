package androidx.loader.app;

import android.os.Looper;
import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.datastore.core.SimpleActor;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.OneShotDisposable;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.auth.api.signin.internal.zbc;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Set;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class LoaderManagerImpl extends LoaderManager {
    public final LifecycleOwner mLifecycleOwner;
    public final LoaderViewModel mLoaderViewModel;

    public final class LoaderInfo extends MutableLiveData {
        public LifecycleOwner mLifecycleOwner;
        public final zbc mLoader;
        public LoaderObserver mObserver;

        public LoaderInfo(zbc zbcVar) {
            this.mLoader = zbcVar;
            if (zbcVar.mListener == null) {
                zbcVar.mListener = this;
            } else {
                a$$ExternalSyntheticBUOutline0.m$1("There is already a listener registered");
                throw null;
            }
        }

        public final void markForRedelivery() {
            LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            LoaderObserver loaderObserver = this.mObserver;
            if (lifecycleOwner == null || loaderObserver == null) {
                return;
            }
            super.removeObserver(loaderObserver);
            observe(lifecycleOwner, loaderObserver);
        }

        @Override // androidx.lifecycle.LiveData
        public final void onActive() {
            zbc zbcVar = this.mLoader;
            zbcVar.mStarted = true;
            zbcVar.mReset = false;
            zbcVar.mAbandoned = false;
            zbcVar.zba.drainPermits();
            zbcVar.forceLoad();
        }

        @Override // androidx.lifecycle.LiveData
        public final void onInactive() {
            this.mLoader.mStarted = false;
        }

        @Override // androidx.lifecycle.LiveData
        public final void removeObserver(Observer observer) {
            super.removeObserver(observer);
            this.mLifecycleOwner = null;
            this.mObserver = null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            Class<?> cls = this.mLoader.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }
    }

    public final class LoaderObserver implements Observer {
        public final OneShotDisposable mCallback;
        public boolean mDeliveredData = false;

        public LoaderObserver(zbc zbcVar, OneShotDisposable oneShotDisposable) {
            this.mCallback = oneShotDisposable;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            this.mDeliveredData = true;
            SignInHubActivity signInHubActivity = (SignInHubActivity) this.mCallback.job;
            signInHubActivity.setResult(signInHubActivity.zbe, signInHubActivity.zbf);
            signInHubActivity.finish();
        }

        public final String toString() {
            return this.mCallback.toString();
        }
    }

    public class LoaderViewModel extends ViewModel {
        public static final AnonymousClass1 FACTORY = new AnonymousClass1();
        public final SparseArrayCompat mLoaders = new SparseArrayCompat((Object) null);
        public boolean mCreatingLoader = false;

        /* renamed from: androidx.loader.app.LoaderManagerImpl$LoaderViewModel$1, reason: invalid class name */
        public final class AnonymousClass1 implements ViewModelProvider$Factory {
            @Override // androidx.lifecycle.ViewModelProvider$Factory
            public final ViewModel create(Class cls) {
                return new LoaderViewModel();
            }
        }

        @Override // androidx.lifecycle.ViewModel
        public final void onCleared() {
            super.onCleared();
            SparseArrayCompat sparseArrayCompat = this.mLoaders;
            int size = sparseArrayCompat.size();
            for (int i = 0; i < size; i++) {
                LoaderInfo loaderInfo = (LoaderInfo) sparseArrayCompat.valueAt(i);
                zbc zbcVar = loaderInfo.mLoader;
                zbcVar.cancelLoad();
                zbcVar.mAbandoned = true;
                LoaderObserver loaderObserver = loaderInfo.mObserver;
                if (loaderObserver != null) {
                    loaderInfo.removeObserver(loaderObserver);
                }
                LoaderInfo loaderInfo2 = zbcVar.mListener;
                if (loaderInfo2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("No listener register");
                    return;
                }
                if (loaderInfo2 != loaderInfo) {
                    a$$ExternalSyntheticBUOutline0.m$3("Attempting to unregister the wrong listener");
                    return;
                }
                zbcVar.mListener = null;
                if (loaderObserver != null) {
                    boolean z = loaderObserver.mDeliveredData;
                }
                zbcVar.mReset = true;
                zbcVar.mStarted = false;
                zbcVar.mAbandoned = false;
                zbcVar.mContentChanged = false;
            }
            int i2 = sparseArrayCompat.size;
            Object[] objArr = sparseArrayCompat.values;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            sparseArrayCompat.size = 0;
            sparseArrayCompat.garbage = false;
        }
    }

    public LoaderManagerImpl(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.mLifecycleOwner = lifecycleOwner;
        viewModelStore.getClass();
        CreationExtras.Empty empty = CreationExtras.Empty.INSTANCE;
        empty.getClass();
        SimpleActor simpleActor = new SimpleActor(viewModelStore, LoaderViewModel.FACTORY, empty);
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LoaderViewModel.class);
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName != null) {
            this.mLoaderViewModel = (LoaderViewModel) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final void dump(PrintWriter printWriter, String str) {
        LoaderViewModel loaderViewModel = this.mLoaderViewModel;
        if (loaderViewModel.mLoaders.size() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < loaderViewModel.mLoaders.size(); i++) {
                LoaderInfo loaderInfo = (LoaderInfo) loaderViewModel.mLoaders.valueAt(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(loaderViewModel.mLoaders.keyAt(i));
                printWriter.print(": ");
                printWriter.println(loaderInfo.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(loaderInfo.mLoader);
                zbc zbcVar = loaderInfo.mLoader;
                String concat = str2.concat("  ");
                zbcVar.getClass();
                printWriter.print(concat);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(zbcVar.mListener);
                if (zbcVar.mStarted || zbcVar.mContentChanged) {
                    printWriter.print(concat);
                    printWriter.print("mStarted=");
                    printWriter.print(zbcVar.mStarted);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(zbcVar.mContentChanged);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (zbcVar.mAbandoned || zbcVar.mReset) {
                    printWriter.print(concat);
                    printWriter.print("mAbandoned=");
                    printWriter.print(zbcVar.mAbandoned);
                    printWriter.print(" mReset=");
                    printWriter.println(zbcVar.mReset);
                }
                if (zbcVar.mTask != null) {
                    printWriter.print(concat);
                    printWriter.print("mTask=");
                    printWriter.print(zbcVar.mTask);
                    printWriter.print(" waiting=");
                    zbcVar.mTask.getClass();
                    printWriter.println(false);
                }
                if (zbcVar.mCancellingTask != null) {
                    printWriter.print(concat);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(zbcVar.mCancellingTask);
                    printWriter.print(" waiting=");
                    zbcVar.mCancellingTask.getClass();
                    printWriter.println(false);
                }
                if (loaderInfo.mObserver != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(loaderInfo.mObserver);
                    LoaderObserver loaderObserver = loaderInfo.mObserver;
                    String concat2 = str2.concat("  ");
                    loaderObserver.getClass();
                    printWriter.print(concat2);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(loaderObserver.mDeliveredData);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                zbc zbcVar2 = loaderInfo.mLoader;
                Object value = loaderInfo.getValue();
                zbcVar2.getClass();
                StringBuilder sb = new StringBuilder(64);
                if (value == null) {
                    sb.append("null");
                } else {
                    Class<?> cls = value.getClass();
                    sb.append(cls.getSimpleName());
                    sb.append("{");
                    sb.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb.append("}");
                }
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(loaderInfo.hasActiveObservers());
            }
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public final zbc initLoader(OneShotDisposable oneShotDisposable) {
        LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
        LoaderViewModel loaderViewModel = this.mLoaderViewModel;
        if (loaderViewModel.mCreatingLoader) {
            a$$ExternalSyntheticBUOutline0.m$1("Called while creating a loader");
            return null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            a$$ExternalSyntheticBUOutline0.m$1("initLoader must be called on the main thread");
            return null;
        }
        SparseArrayCompat sparseArrayCompat = loaderViewModel.mLoaders;
        sparseArrayCompat.getClass();
        LoaderInfo loaderInfo = (LoaderInfo) SieveCacheKt.commonGet(sparseArrayCompat, 0);
        if (loaderInfo != null) {
            zbc zbcVar = loaderInfo.mLoader;
            LoaderObserver loaderObserver = new LoaderObserver(zbcVar, oneShotDisposable);
            loaderInfo.observe(lifecycleOwner, loaderObserver);
            LoaderObserver loaderObserver2 = loaderInfo.mObserver;
            if (loaderObserver2 != null) {
                loaderInfo.removeObserver(loaderObserver2);
            }
            loaderInfo.mLifecycleOwner = lifecycleOwner;
            loaderInfo.mObserver = loaderObserver;
            return zbcVar;
        }
        try {
            loaderViewModel.mCreatingLoader = true;
            SignInHubActivity signInHubActivity = (SignInHubActivity) oneShotDisposable.job;
            Set set = GoogleApiClient.zaa;
            synchronized (set) {
            }
            zbc zbcVar2 = new zbc(signInHubActivity, set);
            if (zbc.class.isMemberClass() && !Modifier.isStatic(zbc.class.getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + zbcVar2);
            }
            LoaderInfo loaderInfo2 = new LoaderInfo(zbcVar2);
            loaderViewModel.mLoaders.put(0, loaderInfo2);
            loaderViewModel.mCreatingLoader = false;
            zbc zbcVar3 = loaderInfo2.mLoader;
            LoaderObserver loaderObserver3 = new LoaderObserver(zbcVar3, oneShotDisposable);
            loaderInfo2.observe(lifecycleOwner, loaderObserver3);
            LoaderObserver loaderObserver4 = loaderInfo2.mObserver;
            if (loaderObserver4 != null) {
                loaderInfo2.removeObserver(loaderObserver4);
            }
            loaderInfo2.mLifecycleOwner = lifecycleOwner;
            loaderInfo2.mObserver = loaderObserver3;
            return zbcVar3;
        } catch (Throwable th) {
            loaderViewModel.mCreatingLoader = false;
            throw th;
        }
    }

    public final void markForRedelivery() {
        SparseArrayCompat sparseArrayCompat = this.mLoaderViewModel.mLoaders;
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            ((LoaderInfo) sparseArrayCompat.valueAt(i)).markForRedelivery();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.mLifecycleOwner.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
