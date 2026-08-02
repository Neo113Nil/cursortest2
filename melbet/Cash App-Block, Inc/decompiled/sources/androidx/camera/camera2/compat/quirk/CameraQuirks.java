package androidx.camera.camera2.compat.quirk;

import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.core.impl.Quirks;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes3.dex */
public final class CameraQuirks {
    public final CameraMetadata cameraMetadata;
    public final Lazy quirks$delegate;
    public final StreamConfigurationMapCompat streamConfigurationMapCompat;

    public CameraQuirks(CameraMetadata cameraMetadata, StreamConfigurationMapCompat streamConfigurationMapCompat) {
        streamConfigurationMapCompat.getClass();
        this.cameraMetadata = cameraMetadata;
        this.streamConfigurationMapCompat = streamConfigurationMapCompat;
        this.quirks$delegate = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(this, 5));
    }

    public final Quirks getQuirks() {
        return (Quirks) this.quirks$delegate.getValue();
    }
}
