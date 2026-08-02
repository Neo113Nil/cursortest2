package coil3.util;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.camera.video.Recorder;
import androidx.collection.LongSparseArray;
import androidx.compose.ui.graphics.AndroidGraphicsContext;
import androidx.compose.ui.input.pointer.HitPathTracker;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.NestedScrollingParentHelper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.ImageLoaders_androidKt;
import coil3.RealImageLoader;
import coil3.memory.MemoryCacheService;
import coil3.memory.RealMemoryCache;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.measurement.zzmi;
import com.google.android.gms.internal.measurement.zzmq;
import com.google.android.gms.internal.measurement.zzmw;
import com.google.android.gms.internal.measurement.zznd;
import com.google.android.gms.internal.measurement.zzqv;
import com.google.android.gms.internal.measurement.zzqx;
import com.google.android.gms.tasks.zzr;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes.dex */
public final class AndroidSystemCallbacks {
    public Object activityCallbacks;
    public Object application;
    public Object componentCallbacks;
    public Object imageLoader;
    public boolean shutdown = true;

    public final class ActivityCallbacks implements Application.ActivityLifecycleCallbacks {
        public final double backgroundMaxSizePercent;

        public ActivityCallbacks(RealImageLoader realImageLoader) {
            RealImageLoader.Options options = realImageLoader.options;
            Extras.Key key = ImageLoaders_androidKt.bitmapFactoryMaxParallelismKey;
            Object obj = options.defaults.extras.data.get(ImageLoaders_androidKt.memoryCacheMaxSizePercentWhileInBackgroundKey);
            this.backgroundMaxSizePercent = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            unregister(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        public final void unregister(Context context) {
            if (this.backgroundMaxSizePercent == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            AndroidSystemCallbacks androidSystemCallbacks = AndroidSystemCallbacks.this;
            RealImageLoader realImageLoader = (RealImageLoader) ((WeakReference) androidSystemCallbacks.imageLoader).get();
            if (realImageLoader == null) {
                androidSystemCallbacks.shutdown();
                return;
            }
            RealMemoryCache memoryCache = realImageLoader.getMemoryCache();
            if (memoryCache != null) {
                memoryCache.setMaxSize(memoryCache.getInitialMaxSize());
            }
        }
    }

    public final class ComponentCallbacks implements ComponentCallbacks2 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ ComponentCallbacks(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        private final void onConfigurationChanged$androidx$compose$ui$graphics$AndroidGraphicsContext$1(Configuration configuration) {
        }

        private final void onLowMemory$androidx$compose$ui$graphics$AndroidGraphicsContext$1() {
        }

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
            switch (this.$r8$classId) {
                case 0:
                    AndroidSystemCallbacks androidSystemCallbacks = (AndroidSystemCallbacks) this.this$0;
                    synchronized (androidSystemCallbacks) {
                        if (((RealImageLoader) ((WeakReference) androidSystemCallbacks.imageLoader).get()) == null) {
                            androidSystemCallbacks.shutdown();
                        }
                    }
                    return;
                default:
                    return;
            }
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
            switch (this.$r8$classId) {
                case 0:
                    onTrimMemory(80);
                    break;
            }
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i) {
            RealMemoryCache memoryCache;
            switch (this.$r8$classId) {
                case 0:
                    AndroidSystemCallbacks androidSystemCallbacks = (AndroidSystemCallbacks) this.this$0;
                    synchronized (androidSystemCallbacks) {
                        try {
                            RealImageLoader realImageLoader = (RealImageLoader) ((WeakReference) androidSystemCallbacks.imageLoader).get();
                            if (realImageLoader != null) {
                                RealImageLoader.Options options = realImageLoader.options;
                                if (i >= 40) {
                                    RealMemoryCache memoryCache2 = realImageLoader.getMemoryCache();
                                    if (memoryCache2 != null) {
                                        memoryCache2.clear();
                                    }
                                } else if (i >= 20) {
                                    ActivityCallbacks activityCallbacks = (ActivityCallbacks) androidSystemCallbacks.activityCallbacks;
                                    Context context = options.application;
                                    double d = activityCallbacks.backgroundMaxSizePercent;
                                    if (d != 1.0d) {
                                        Context applicationContext = context.getApplicationContext();
                                        applicationContext.getClass();
                                        ((Application) applicationContext).registerActivityLifecycleCallbacks(activityCallbacks);
                                        AndroidSystemCallbacks androidSystemCallbacks2 = AndroidSystemCallbacks.this;
                                        RealImageLoader realImageLoader2 = (RealImageLoader) ((WeakReference) androidSystemCallbacks2.imageLoader).get();
                                        if (realImageLoader2 != null) {
                                            RealMemoryCache memoryCache3 = realImageLoader2.getMemoryCache();
                                            if (memoryCache3 != null) {
                                                memoryCache3.setMaxSize((long) (d * memoryCache3.getInitialMaxSize()));
                                            }
                                        } else {
                                            androidSystemCallbacks2.shutdown();
                                        }
                                    }
                                } else if (i >= 10 && (memoryCache = realImageLoader.getMemoryCache()) != null) {
                                    memoryCache.trimToSize(memoryCache.getSize() / 2);
                                }
                            } else {
                                androidSystemCallbacks.shutdown();
                            }
                        } finally {
                        }
                    }
                    return;
                default:
                    if (i >= 40) {
                        AndroidGraphicsContext androidGraphicsContext = (AndroidGraphicsContext) this.this$0;
                        Recorder.AnonymousClass4 anonymousClass4 = androidGraphicsContext.shadowCache;
                        if (anonymousClass4 != null) {
                            anonymousClass4.clearCache();
                        }
                        androidGraphicsContext.shadowCache = null;
                        return;
                    }
                    return;
            }
        }
    }

    public AndroidSystemCallbacks(zznd zzndVar, NestedScrollingParentHelper nestedScrollingParentHelper) {
        RegularImmutableMap build;
        zzmw zzmwVar = zzndVar.zzb;
        zzmq zzmqVar = zzndVar.zzc;
        if (zzmwVar.zze().isEmpty()) {
            zzmq.zzi().equals(zzmqVar);
        }
        this.imageLoader = zzmqVar.zza();
        this.activityCallbacks = zzmqVar.zzb();
        zzmqVar.getClass();
        zzmqVar.getClass();
        Map zzf = zzmqVar.zze() == 0 ? null : zzmqVar.zzf();
        if (zzf != null) {
            ImmutableSet.copyOf((Collection) zzf.keySet());
        } else {
            Object[] objArr = RegularImmutableSet.EMPTY_ARRAY;
        }
        int zze = zzmqVar.zze();
        zzmw zzmwVar2 = zzndVar.zzb;
        if (zze > 0) {
            Collection<zzmi> values = zzmqVar.zzf().values();
            if (values == null) {
                build = RegularImmutableMap.EMPTY;
            } else {
                StatusLine builder = RegularImmutableMap.builder();
                for (zzmi zzmiVar : values) {
                    int zzq = zzmiVar.zzq();
                    int i = zzq - 1;
                    if (zzq == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        builder.put(zzmiVar.zza(), Long.valueOf(zzmiVar.zzb()));
                    } else if (i == 1) {
                        builder.put(zzmiVar.zza(), Boolean.valueOf(zzmiVar.zzc()));
                    } else if (i == 2) {
                        builder.put(zzmiVar.zza(), Double.valueOf(zzmiVar.zzd()));
                    } else if (i == 3) {
                        builder.put(zzmiVar.zza(), zzmiVar.zze());
                    } else {
                        if (i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("Could not serialize Flag for override: ".concat(String.valueOf(zzmiVar.zza())));
                            throw null;
                        }
                        builder.put(zzmiVar.zza(), zzmiVar.zzf().zzm());
                    }
                }
                build = builder.build(false);
            }
            zzmwVar2 = zzmw.zza(zzmwVar2, build);
        }
        int zzf2 = zzmwVar2.zzf() + 3;
        DimensionKt.checkNonnegative(zzf2, "expectedSize");
        StatusLine statusLine = new StatusLine(zzf2);
        zzmwVar2.zzc(statusLine);
        statusLine.put("__phenotype_server_token", zzmqVar.zzc());
        statusLine.put("__phenotype_snapshot_token", zzmqVar.zza());
        statusLine.put("__phenotype_configuration_version", Long.valueOf(zzmqVar.zzd()));
        this.componentCallbacks = statusLine.build(false);
        this.application = nestedScrollingParentHelper;
    }

    /* renamed from: process-BIzXfog, reason: not valid java name */
    public int m1473processBIzXfog(Recorder.AnonymousClass1 anonymousClass1, AndroidComposeView androidComposeView, boolean z) {
        boolean z2;
        boolean z3;
        HitPathTracker hitPathTracker = (HitPathTracker) this.activityCallbacks;
        HitTestResult hitTestResult = (HitTestResult) this.application;
        if (this.shutdown) {
            return PointerEventKt.ProcessResult(false, false, false);
        }
        boolean z4 = true;
        try {
            this.shutdown = true;
            zzr produce = ((MemoryCacheService) this.componentCallbacks).produce(anonymousClass1, androidComposeView);
            LongSparseArray longSparseArray = (LongSparseArray) produce.zza;
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                PointerInputChange pointerInputChange = (PointerInputChange) longSparseArray.valueAt(i);
                if (!pointerInputChange.getPressed() && !pointerInputChange.getPreviousPressed()) {
                }
                z2 = false;
                break;
            }
            z2 = true;
            int size2 = longSparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                PointerInputChange pointerInputChange2 = (PointerInputChange) longSparseArray.valueAt(i2);
                if (z2 || PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2)) {
                    ((LayoutNode) this.imageLoader).m872hitTest6fMxITs$ui(pointerInputChange2.m816getPositionF1C5BW0(), (HitTestResult) this.application, pointerInputChange2.m818getTypeT8wyACA(), true);
                    if (!hitTestResult.values.isEmpty()) {
                        hitPathTracker.m797addHitPathQJqDSyo(pointerInputChange2.m815getIdJ3iCeTQ(), hitTestResult, PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2));
                        hitTestResult.clear();
                    }
                }
            }
            boolean dispatchChanges = hitPathTracker.dispatchChanges(produce, z);
            if (!produce.zzc) {
                int size3 = longSparseArray.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    PointerInputChange pointerInputChange3 = (PointerInputChange) longSparseArray.valueAt(i3);
                    if (PointerEventKt.positionChangedIgnoreConsumed(pointerInputChange3) && pointerInputChange3.isConsumed()) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            int size4 = longSparseArray.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size4) {
                    z4 = false;
                    break;
                }
                if (((PointerInputChange) longSparseArray.valueAt(i4)).isConsumed()) {
                    break;
                }
                i4++;
            }
            int ProcessResult = PointerEventKt.ProcessResult(dispatchChanges, z3, z4);
            this.shutdown = false;
            return ProcessResult;
        } catch (Throwable th) {
            this.shutdown = false;
            throw th;
        }
    }

    public synchronized void shutdown() {
        try {
            if (this.shutdown) {
                return;
            }
            this.shutdown = true;
            Context context = (Context) this.application;
            if (context != null) {
                ((ActivityCallbacks) this.activityCallbacks).unregister(context);
                context.unregisterComponentCallbacks((ComponentCallbacks) this.componentCallbacks);
            }
            ((WeakReference) this.imageLoader).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public AndroidSystemCallbacks(zzqv zzqvVar, NestedScrollingParentHelper nestedScrollingParentHelper) {
        zzqv.zzi().equals(zzqvVar);
        this.imageLoader = zzqvVar.zza();
        this.activityCallbacks = zzqvVar.zzb();
        int i = ImmutableSet.$r8$clinit;
        Object[] objArr = RegularImmutableSet.EMPTY_ARRAY;
        int zzf = zzqvVar.zzf() + 3;
        DimensionKt.checkNonnegative(zzf, "expectedSize");
        StatusLine statusLine = new StatusLine(zzf);
        for (zzqx zzqxVar : zzqvVar.zze()) {
            int zzp = zzqxVar.zzp();
            int i2 = zzp - 1;
            if (zzp == 0) {
                throw null;
            }
            if (i2 == 0) {
                statusLine.put(zzqxVar.zza(), Long.valueOf(zzqxVar.zzb()));
            } else if (i2 == 1) {
                statusLine.put(zzqxVar.zza(), Boolean.valueOf(zzqxVar.zzc()));
            } else if (i2 == 2) {
                statusLine.put(zzqxVar.zza(), Double.valueOf(zzqxVar.zzd()));
            } else if (i2 == 3) {
                statusLine.put(zzqxVar.zza(), zzqxVar.zze());
            } else if (i2 == 4) {
                statusLine.put(zzqxVar.zza(), zzqxVar.zzf().zzm());
            }
        }
        statusLine.put("__phenotype_server_token", zzqvVar.zzc());
        statusLine.put("__phenotype_snapshot_token", zzqvVar.zza());
        statusLine.put("__phenotype_configuration_version", Long.valueOf(zzqvVar.zzd()));
        this.componentCallbacks = statusLine.build(false);
        this.application = nestedScrollingParentHelper;
    }
}
