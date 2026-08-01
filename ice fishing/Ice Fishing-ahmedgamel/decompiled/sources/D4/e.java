package D4;

import f8.y;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface e {
    List<String> enabledFeatureKeys();

    boolean isEnabled(b bVar);

    Map<String, y> remoteFeatureFlagMetadata();
}
