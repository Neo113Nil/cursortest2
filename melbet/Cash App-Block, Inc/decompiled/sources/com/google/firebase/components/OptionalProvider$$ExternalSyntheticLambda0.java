package com.google.firebase.components;

import androidx.compose.animation.core.Easing;
import coil3.Extras;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.platforminfo.AutoValue_LibraryVersion;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.KotlinNothingValueException;
import kotlin.NotImplementedError;

/* loaded from: classes.dex */
public final /* synthetic */ class OptionalProvider$$ExternalSyntheticLambda0 implements ComponentRegistrarProcessor, ComponentFactory, Easing {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ OptionalProvider$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) "#read(byte[]) returned invalid result: ");
        sb.append(i);
        sb.append((Object) "\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void m$2(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(zzlj zzljVar) {
        TransportFactory lambda$getComponents$0;
        TransportFactory lambda$getComponents$1;
        TransportFactory lambda$getComponents$2;
        FirebaseInstallationsApi lambda$getComponents$02;
        switch (this.$r8$classId) {
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.BG_EXECUTOR.get();
            case 4:
                return (ScheduledExecutorService) ExecutorsRegistrar.BLOCKING_EXECUTOR.get();
            case 5:
                return (ScheduledExecutorService) ExecutorsRegistrar.LITE_EXECUTOR.get();
            case 6:
                Lazy lazy = ExecutorsRegistrar.BG_EXECUTOR;
                return UiExecutor.INSTANCE;
            case 7:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(zzljVar);
                return lambda$getComponents$0;
            case 8:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(zzljVar);
                return lambda$getComponents$1;
            case 9:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(zzljVar);
                return lambda$getComponents$2;
            case 10:
                lambda$getComponents$02 = FirebaseInstallationsRegistrar.lambda$getComponents$0(zzljVar);
                return lambda$getComponents$02;
            default:
                Set of = zzljVar.setOf(Qualified.unqualified(AutoValue_LibraryVersion.class));
                Extras.Key key = Extras.Key.INSTANCE;
                if (key == null) {
                    synchronized (Extras.Key.class) {
                        try {
                            key = Extras.Key.INSTANCE;
                            if (key == null) {
                                key = new Extras.Key(1);
                                Extras.Key.INSTANCE = key;
                            }
                        } finally {
                        }
                    }
                }
                return new DefaultUserAgentPublisher(of, key);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f) {
        return (float) ((Math.cos((f + 1.0f) * 3.141592653589793d) / 2.0d) + 0.5d);
    }

    public static /* synthetic */ void m$1(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void m$2(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void m$1(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void m$1() {
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void m() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void m(long j) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
    }

    public static /* synthetic */ void m(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new NotImplementedError(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void m(String str, double d) {
        throw new IllegalArgumentException(str + d);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new DependencyException(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void m(String str, Object[] objArr) {
        throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static /* synthetic */ void m(Throwable th) {
        throw new IllegalStateException(th);
    }
}
