package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.SessionConfig$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.Recorder;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;

/* loaded from: classes3.dex */
public abstract class DeviceQuirks {
    public static volatile Quirks sQuirks;

    static {
        QuirkSettingsHolder quirkSettingsHolder = QuirkSettingsHolder.sInstance;
        quirkSettingsHolder.mObservable.addObserver(zzabp.directExecutor(), new Recorder.AnonymousClass7(new SessionConfig$$ExternalSyntheticLambda0(2), 2));
    }
}
