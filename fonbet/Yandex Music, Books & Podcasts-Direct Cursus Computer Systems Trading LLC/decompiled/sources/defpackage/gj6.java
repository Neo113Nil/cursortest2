package defpackage;

import java.io.Closeable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public interface gj6 extends Closeable {
    void addListener(tzh tzhVar);

    v68 getDiscoveredDevice();

    List getSupportedFeatures();

    void removeListener(tzh tzhVar);

    String send(mdk mdkVar, t3o t3oVar);

    u3o sendSync(mdk mdkVar, long j, TimeUnit timeUnit);
}
