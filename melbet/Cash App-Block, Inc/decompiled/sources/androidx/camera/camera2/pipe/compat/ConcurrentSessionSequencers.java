package androidx.camera.camera2.pipe.compat;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class ConcurrentSessionSequencers {
    public final Object lock = new Object();

    public ConcurrentSessionSequencers() {
        new LinkedHashMap();
        new LinkedHashSet();
    }
}
