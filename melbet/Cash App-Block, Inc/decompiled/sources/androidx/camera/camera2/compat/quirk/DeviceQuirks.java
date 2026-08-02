package androidx.camera.camera2.compat.quirk;

import androidx.camera.core.SessionConfig$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.Recorder;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class DeviceQuirks {
    public static volatile Quirks all;

    static {
        QuirkSettingsHolder quirkSettingsHolder = QuirkSettingsHolder.sInstance;
        quirkSettingsHolder.mObservable.addObserver(zzabp.directExecutor(), new Recorder.AnonymousClass7(new SessionConfig$$ExternalSyntheticLambda0(1), 2));
    }

    public static final Quirks getAll() {
        Quirks quirks = all;
        if (quirks != null) {
            return quirks;
        }
        Intrinsics.throwUninitializedPropertyAccessException("all");
        throw null;
    }
}
