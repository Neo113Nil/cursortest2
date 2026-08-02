package androidx.media3.common.util;

import android.view.View;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.paging.PagingConfig;
import coil3.request.OneShotDisposable;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedBytes;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.filament.BaseModelView;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda5;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda6;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class WakeLockManager implements Observer {
    public boolean enabled;
    public Object mainHandler;
    public boolean stayAwake;
    public Object wakeLockHandler;
    public Object wakeLockManagerInternal;

    public boolean checkInternal(Chip chip) {
        int id = chip.getId();
        HashSet hashSet = (HashSet) this.wakeLockHandler;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        Chip chip2 = (Chip) ((HashMap) this.wakeLockManagerInternal).get(Integer.valueOf(getSingleCheckedId()));
        if (chip2 != null) {
            uncheckInternal(chip2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id));
        if (!chip.isChecked()) {
            chip.setChecked(true);
        }
        return add;
    }

    public void destroySwapChain() {
        Sniffer sniffer = (Sniffer) this.wakeLockHandler;
        if (sniffer != null) {
            BaseModelView baseModelView = (BaseModelView) sniffer.scratch;
            int i = sniffer.peekLength;
            if (baseModelView.engine != null && baseModelView.getEngine().isValid()) {
                PagingConfig pagingConfig = baseModelView.renderSessionTracker;
                if (i == 0) {
                    pagingConfig.getClass();
                } else if (pagingConfig.prefetchDistance == i || pagingConfig.initialLoadSize == i) {
                    baseModelView.displayHelper.detach();
                    baseModelView.destroySwapChain(true);
                }
            }
        }
        this.enabled = false;
    }

    public int getSingleCheckedId() {
        HashSet hashSet = (HashSet) this.wakeLockHandler;
        if (!this.enabled || hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public void onCheckedStateChanged() {
        OneShotDisposable oneShotDisposable = (OneShotDisposable) this.mainHandler;
        if (oneShotDisposable != null) {
            new HashSet((HashSet) this.wakeLockHandler);
            ChipGroup chipGroup = (ChipGroup) oneShotDisposable.job;
            ChipGroup.OnCheckedStateChangeListener onCheckedStateChangeListener = chipGroup.onCheckedStateChangeListener;
            if (onCheckedStateChangeListener != null) {
                WakeLockManager wakeLockManager = chipGroup.checkableGroup;
                wakeLockManager.getClass();
                HashSet hashSet = new HashSet((HashSet) wakeLockManager.wakeLockHandler);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < chipGroup.getChildCount(); i++) {
                    View childAt = chipGroup.getChildAt(i);
                    if ((childAt instanceof Chip) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                        arrayList.add(Integer.valueOf(childAt.getId()));
                    }
                }
                WakeLockManager wakeLockManager2 = ((ChipGroup) ((zzb) onCheckedStateChangeListener).zza).checkableGroup;
                if (wakeLockManager2.enabled) {
                    wakeLockManager2.getSingleCheckedId();
                    throw null;
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (this.stayAwake) {
            return;
        }
        this.stayAwake = true;
        this.enabled = true;
        ((Observer) this.wakeLockManagerInternal).onComplete();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th) {
        Observer observer = (Observer) this.wakeLockManagerInternal;
        if (this.enabled) {
            if (this.stayAwake) {
                UnsignedBytes.onError(th);
                return;
            } else {
                observer.onError(th);
                return;
            }
        }
        this.enabled = true;
        try {
            ObservableSource observableSource = (ObservableSource) ((Function) this.wakeLockHandler).mo39apply(th);
            if (observableSource != null) {
                ((Observable) observableSource).subscribe(this);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Observable is null");
            nullPointerException.initCause(th);
            observer.onError(nullPointerException);
        } catch (Throwable th2) {
            Longs.throwIfFatal(th2);
            observer.onError(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(Object obj) {
        if (this.stayAwake) {
            return;
        }
        ((Observer) this.wakeLockManagerInternal).onNext(obj);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
        SequentialDisposable sequentialDisposable = (SequentialDisposable) this.mainHandler;
        sequentialDisposable.getClass();
        DisposableHelper.replace(sequentialDisposable, disposable);
    }

    public void postUpdateWakeLock(boolean z, boolean z2) {
        SystemHandlerWrapper systemHandlerWrapper = (SystemHandlerWrapper) this.wakeLockHandler;
        int i = 1;
        if (z && z2) {
            systemHandlerWrapper.post(new ScannerView$$ExternalSyntheticLambda5(i, this, z, z2));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        SystemHandlerWrapper systemHandlerWrapper2 = (SystemHandlerWrapper) this.mainHandler;
        systemHandlerWrapper2.handler.postDelayed(new DispatchQueue$$ExternalSyntheticLambda0(15, this, atomicBoolean), 1000L);
        systemHandlerWrapper.post(new ScannerView$$ExternalSyntheticLambda6(this, atomicBoolean, z, z2, 1));
    }

    public void setStayAwake(boolean z) {
        if (this.stayAwake == z) {
            return;
        }
        this.stayAwake = z;
        if (this.enabled) {
            postUpdateWakeLock(true, z);
        }
    }

    public boolean uncheckInternal(Chip chip, boolean z) {
        int id = chip.getId();
        HashSet hashSet = (HashSet) this.wakeLockHandler;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            chip.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id));
        if (chip.isChecked()) {
            chip.setChecked(false);
        }
        return remove;
    }
}
