package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class AndroidOutputConfiguration implements UnsafeWrapper {
    public final OutputConfiguration output;
    public final Surface surface;

    public AndroidOutputConfiguration(OutputConfiguration outputConfiguration) {
        this.output = outputConfiguration;
        this.surface = outputConfiguration.getSurface();
    }

    public final String toString() {
        return this.output.toString();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        if (kClass.equals(Reflection.factory.getOrCreateKotlinClass(OutputConfiguration.class))) {
            return this.output;
        }
        return null;
    }
}
