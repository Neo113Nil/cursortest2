package app.cash.zipline.internal;

import app.cash.zipline.ZiplineService;
import app.cash.zipline.internal.bridge.SerializableZiplineServiceType;
import java.util.Set;

/* loaded from: classes3.dex */
public interface EndpointService extends ZiplineService {
    Set getServiceNames();

    SerializableZiplineServiceType serviceType(String str);
}
