package androidx.camera.core;

import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.camera.camera2.config.DaggerCameraAppComponent$CameraAppComponentImpl;
import androidx.camera.camera2.config.DaggerCameraAppComponent$CameraComponentImpl;
import androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent$CameraPipeComponentImpl;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.transition.Transition;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;
import kotlinx.coroutines.CompletableDeferredImpl;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class CameraState$Type$EnumUnboxingLocalUtility {
    public static /* synthetic */ void m(Object obj) {
        boolean isTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (!(obj instanceof ExecutorService)) {
            if (obj instanceof TypedArray) {
                ((TypedArray) obj).recycle();
                return;
            } else {
                Path$$ExternalSyntheticBUOutline0.m$3();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) obj;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ String stringValueOf(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN";
    }

    public static int m(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int m(int i, int i2, Integer num) {
        return (num.hashCode() + i) * i2;
    }

    public static int m(int i, Map map, int i2) {
        return (map.hashCode() + i) * i2;
    }

    public static int m(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(creator.createFromParcel(parcel));
        return i + i2;
    }

    public static int m(Class cls, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
        return i + i2;
    }

    public static int m(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    public static long m(long j) {
        Trace.endSection();
        return SystemClock.elapsedRealtimeNanos() - j;
    }

    public static SurfaceCombination m(ArrayList arrayList, SurfaceCombination surfaceCombination) {
        arrayList.add(surfaceCombination);
        return new SurfaceCombination();
    }

    public static Provider m(DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl, DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl, int i) {
        return DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraAppComponent$CameraAppComponentImpl, daggerCameraAppComponent$CameraComponentImpl, i, 0));
    }

    public static Provider m(DaggerCameraPipeComponent$CameraPipeComponentImpl daggerCameraPipeComponent$CameraPipeComponentImpl, int i) {
        return DoubleCheck.provider(new DaggerCameraPipeComponent$CameraPipeComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, i));
    }

    public static String m(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String m(Uri uri, String str) {
        return str + uri;
    }

    public static String m(String str, String str2, String str3, String str4, List list) {
        return str + str2 + str3 + list + str4;
    }

    public static String m(String str, String str2, List list) {
        return str + list + str2;
    }

    public static String m(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static String m(Object[] objArr, int i, Locale locale, String str, StringBuilder sb) {
        sb.append(String.format(locale, str, Arrays.copyOf(objArr, i)));
        return sb.toString();
    }

    public static StringBuilder m(ArrayList arrayList, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(arrayList);
        sb.append(str4);
        return sb;
    }

    public static Iterator m(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static ArrayIterator m(EnumEntriesList enumEntriesList, EnumEntriesList enumEntriesList2) {
        enumEntriesList.getClass();
        return new ArrayIterator(enumEntriesList2);
    }

    public static void m(int i, String str, String str2) {
        Log.d(str2, str + i);
    }

    public static void m(Parcel parcel, int i, Boolean bool) {
        parcel.writeInt(i);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void m(SurfaceCombination surfaceCombination, SurfaceConfig surfaceConfig, SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, StreamUseCase streamUseCase) {
        surfaceCombination.addSurfaceConfig(surfaceConfig);
        surfaceCombination.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize, streamUseCase));
    }

    public static float m(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static void m(String str, CompletableDeferredImpl completableDeferredImpl) {
        completableDeferredImpl.completeExceptionally(new CameraControl$OperationCanceledException(str));
    }

    public static void m(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, SurfaceConfig.ConfigType configType2, SurfaceConfig.ConfigSize configSize2) {
        StreamUseCase streamUseCase = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
        surfaceCombination.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize, streamUseCase));
        surfaceCombination.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize2, streamUseCase));
    }
}
