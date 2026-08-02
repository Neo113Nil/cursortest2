package androidx.camera.core;

import androidx.camera.core.impl.AutoValue_Identifier;
import java.util.List;

/* loaded from: classes3.dex */
public interface CameraFilter {
    public static final AutoValue_Identifier DEFAULT_ID = new AutoValue_Identifier(new Object());

    List filter(List list);
}
