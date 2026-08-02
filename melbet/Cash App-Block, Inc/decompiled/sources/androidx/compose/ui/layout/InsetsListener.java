package androidx.compose.ui.layout;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.layout.WindowInsetsRulers;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.internal.measurement.zzabh;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InsetsListener extends zzabh implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {
    public final SnapshotStateList displayCutoutRulers;
    public final MutableObjectList displayCutouts;
    public final ParcelableSnapshotMutableIntState generation;
    public final MutableScatterMap insetsValues;
    public boolean prepared;
    public int runningAnimationMask;
    public WindowInsetsCompat savedInsets;

    public InsetsListener() {
        super(1);
        MutableScatterMap mutableScatterMap = new MutableScatterMap(9);
        WindowInsetsRulers.Companion.getClass();
        mutableScatterMap.set(WindowInsetsRulers.Companion.CaptionBar, new WindowWindowInsetsAnimationValues("caption bar"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.DisplayCutout, new WindowWindowInsetsAnimationValues("display cutout"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.Ime, new WindowWindowInsetsAnimationValues("ime"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.MandatorySystemGestures, new WindowWindowInsetsAnimationValues("mandatory system gestures"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.NavigationBars, new WindowWindowInsetsAnimationValues("navigation bars"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.StatusBars, new WindowWindowInsetsAnimationValues("status bars"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.SystemGestures, new WindowWindowInsetsAnimationValues("system gestures"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.TappableElement, new WindowWindowInsetsAnimationValues("tappable element"));
        mutableScatterMap.set(WindowInsetsRulers.Companion.Waterfall, new WindowWindowInsetsAnimationValues("waterfall"));
        this.insetsValues = mutableScatterMap;
        this.generation = new ParcelableSnapshotMutableIntState(0);
        this.displayCutouts = new MutableObjectList(4);
        this.displayCutoutRulers = new SnapshotStateList();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        if (this.prepared) {
            this.savedInsets = windowInsetsCompat;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return windowInsetsCompat;
            }
        } else if (this.runningAnimationMask == 0) {
            updateInsets(windowInsetsCompat);
        }
        return windowInsetsCompat;
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        boolean z = false;
        this.prepared = false;
        int typeMask = windowInsetsAnimationCompat.mImpl.getTypeMask();
        this.runningAnimationMask &= ~typeMask;
        this.savedInsets = null;
        WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) WindowInsetsRulers_androidKt.WindowInsetsTypeMap.get(typeMask);
        if (windowInsetsRulers != null) {
            Object obj = this.insetsValues.get(windowInsetsRulers);
            obj.getClass();
            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) obj;
            windowWindowInsetsAnimationValues.fraction$delegate.setFloatValue(RecyclerView.DECELERATION_RATE);
            windowWindowInsetsAnimationValues.alpha$delegate.setFloatValue(1.0f);
            windowWindowInsetsAnimationValues.durationMillis$delegate.setLongValue(0L);
            windowWindowInsetsAnimationValues.fraction$delegate.setFloatValue(RecyclerView.DECELERATION_RATE);
            windowWindowInsetsAnimationValues.isAnimating$delegate.setValue(Boolean.FALSE);
            windowWindowInsetsAnimationValues.sourceValueInsets = -1L;
            windowWindowInsetsAnimationValues.targetValueInsets = -1L;
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.generation;
            parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
            synchronized (SnapshotKt.lock) {
                MutableScatterSet mutableScatterSet = SnapshotKt.globalSnapshot.modified;
                if (mutableScatterSet != null) {
                    if (mutableScatterSet.isNotEmpty()) {
                        z = true;
                    }
                }
            }
            if (z) {
                SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.prepared = true;
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) list.get(i);
            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) WindowInsetsRulers_androidKt.WindowInsetsTypeMap.get(windowInsetsAnimationCompat.mImpl.getTypeMask());
            if (windowInsetsRulers != null) {
                Object obj = this.insetsValues.get(windowInsetsRulers);
                obj.getClass();
                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) obj;
                if (((Boolean) windowWindowInsetsAnimationValues.isAnimating$delegate.getValue()).booleanValue()) {
                    WindowInsetsAnimationCompat.Impl impl = windowInsetsAnimationCompat.mImpl;
                    windowWindowInsetsAnimationValues.fraction$delegate.setFloatValue(impl.getInterpolatedFraction());
                    windowWindowInsetsAnimationValues.alpha$delegate.setFloatValue(impl.getAlpha());
                    windowWindowInsetsAnimationValues.durationMillis$delegate.setLongValue(impl.getDurationMillis());
                }
            }
        }
        updateInsets(windowInsetsCompat);
        return windowInsetsCompat;
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final WorkLauncherImpl onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WorkLauncherImpl workLauncherImpl) {
        WindowInsetsCompat windowInsetsCompat = this.savedInsets;
        boolean z = false;
        this.prepared = false;
        this.savedInsets = null;
        if (windowInsetsAnimationCompat.mImpl.getDurationMillis() > 0 && windowInsetsCompat != null) {
            int typeMask = windowInsetsAnimationCompat.mImpl.getTypeMask();
            this.runningAnimationMask |= typeMask;
            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) WindowInsetsRulers_androidKt.WindowInsetsTypeMap.get(typeMask);
            if (windowInsetsRulers != null) {
                Object obj = this.insetsValues.get(windowInsetsRulers);
                obj.getClass();
                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) obj;
                Insets insets = windowInsetsCompat.mImpl.getInsets(typeMask);
                long j = (insets.left << 48) | (insets.top << 32) | (insets.right << 16) | insets.bottom;
                long j2 = windowWindowInsetsAnimationValues.current;
                if (!ValueInsets.m860equalsimpl0(j, j2)) {
                    windowWindowInsetsAnimationValues.sourceValueInsets = j2;
                    windowWindowInsetsAnimationValues.targetValueInsets = j;
                    windowWindowInsetsAnimationValues.isAnimating$delegate.setValue(Boolean.TRUE);
                    WindowInsetsAnimationCompat.Impl impl = windowInsetsAnimationCompat.mImpl;
                    windowWindowInsetsAnimationValues.fraction$delegate.setFloatValue(impl.getInterpolatedFraction());
                    windowWindowInsetsAnimationValues.alpha$delegate.setFloatValue(impl.getAlpha());
                    windowWindowInsetsAnimationValues.durationMillis$delegate.setLongValue(impl.getDurationMillis());
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.generation;
                    parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                    synchronized (SnapshotKt.lock) {
                        MutableScatterSet mutableScatterSet = SnapshotKt.globalSnapshot.modified;
                        if (mutableScatterSet != null) {
                            if (mutableScatterSet.isNotEmpty()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
                        return workLauncherImpl;
                    }
                }
            }
        }
        return workLauncherImpl;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view, this);
        ViewCompat.setWindowInsetsAnimationCallback(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view, null);
        ViewCompat.setWindowInsetsAnimationCallback(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.prepared) {
            this.runningAnimationMask = 0;
            this.prepared = false;
            WindowInsetsCompat windowInsetsCompat = this.savedInsets;
            if (windowInsetsCompat != null) {
                updateInsets(windowInsetsCompat);
                this.savedInsets = null;
            }
        }
    }

    public final void updateInsets(WindowInsetsCompat windowInsetsCompat) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        MutableIntObjectMap mutableIntObjectMap = WindowInsetsRulers_androidKt.WindowInsetsTypeMap;
        int[] iArr3 = mutableIntObjectMap.keys;
        Object[] objArr3 = mutableIntObjectMap.values;
        long[] jArr3 = mutableIntObjectMap.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) objArr3[i6];
                            Insets insets = windowInsetsCompat.mImpl.getInsets(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (insets.left << 48) | (insets.top << 32) | (insets.right << 16) | insets.bottom;
                            Object obj = this.insetsValues.get(windowInsetsRulers);
                            obj.getClass();
                            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) obj;
                            j2 = j3;
                            if (!ValueInsets.m860equalsimpl0(j4, windowWindowInsetsAnimationValues.current)) {
                                windowWindowInsetsAnimationValues.current = j4;
                                z2 = true;
                                if (!ValueInsets.m860equalsimpl0(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                Insets insetsIgnoringVisibility = windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(i7);
                                objArr2 = objArr3;
                                long j5 = (insetsIgnoringVisibility.top << 32) | (insetsIgnoringVisibility.left << 48) | (insetsIgnoringVisibility.right << 16) | insetsIgnoringVisibility.bottom;
                                if (!ValueInsets.m860equalsimpl0(windowWindowInsetsAnimationValues.maximum, j5)) {
                                    windowWindowInsetsAnimationValues.maximum = j5;
                                    z2 = true;
                                    if (!ValueInsets.m860equalsimpl0(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            windowWindowInsetsAnimationValues.isVisible$delegate.setValue(Boolean.valueOf(windowInsetsCompat.mImpl.isVisible(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        DisplayCutoutCompat displayCutout = windowInsetsCompat.mImpl.getDisplayCutout();
        if (displayCutout == null) {
            j = 0;
        } else {
            Insets waterfallInsets = displayCutout.getWaterfallInsets();
            j = (waterfallInsets.left << c3) | (waterfallInsets.top << c2) | (waterfallInsets.right << c) | waterfallInsets.bottom;
        }
        MutableScatterMap mutableScatterMap = this.insetsValues;
        WindowInsetsRulers.Companion.getClass();
        Object obj2 = mutableScatterMap.get(WindowInsetsRulers.Companion.Waterfall);
        obj2.getClass();
        WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = (WindowWindowInsetsAnimationValues) obj2;
        windowWindowInsetsAnimationValues2.isVisible$delegate.setValue(Boolean.valueOf(!ValueInsets.m860equalsimpl0(j, 0L)));
        if (!ValueInsets.m860equalsimpl0(windowWindowInsetsAnimationValues2.current, j)) {
            windowWindowInsetsAnimationValues2.current = j;
            windowWindowInsetsAnimationValues2.maximum = j;
            z2 = z;
            if (!ValueInsets.m860equalsimpl0(j, 0L)) {
                z3 = z2;
            }
        }
        if (displayCutout == null) {
            MutableObjectList mutableObjectList = this.displayCutouts;
            if (mutableObjectList._size > 0) {
                mutableObjectList.clear();
                this.displayCutoutRulers.clear();
                z2 = z;
            }
        } else {
            List boundingRects = DisplayCutoutCompat.Api28Impl.getBoundingRects(displayCutout.mDisplayCutout);
            int size = boundingRects.size();
            MutableObjectList mutableObjectList2 = this.displayCutouts;
            if (size < mutableObjectList2._size) {
                mutableObjectList2.removeRange(boundingRects.size(), this.displayCutouts._size);
                this.displayCutoutRulers.removeRange(boundingRects.size(), this.displayCutoutRulers.size());
                z2 = z;
            } else {
                int size2 = boundingRects.size() - this.displayCutouts._size;
                int i8 = 0;
                while (i8 < size2) {
                    MutableObjectList mutableObjectList3 = this.displayCutouts;
                    mutableObjectList3.add(Updater.mutableStateOf$default(boundingRects.get(mutableObjectList3._size)));
                    this.displayCutoutRulers.add(new RectRulersImpl("display cutout rect " + this.displayCutouts._size));
                    i8++;
                    z2 = z;
                }
            }
            List list = boundingRects;
            int size3 = list.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) boundingRects.get(i9);
                MutableState mutableState = (MutableState) this.displayCutouts.get(i9);
                if (!Intrinsics.areEqual(mutableState.getValue(), rect)) {
                    mutableState.setValue(rect);
                    z2 = z;
                }
            }
            if (!list.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.generation.getIntValue() != 0) && z2) {
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.generation;
            parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
            synchronized (SnapshotKt.lock) {
                MutableScatterSet mutableScatterSet = SnapshotKt.globalSnapshot.modified;
                if (mutableScatterSet != null) {
                    boolean z5 = z;
                    z4 = mutableScatterSet.isNotEmpty() == z5 ? z5 : false;
                }
            }
            if (z4) {
                SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
            }
        }
    }
}
