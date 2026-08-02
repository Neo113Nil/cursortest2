package coil3.request;

import kotlinx.coroutines.Deferred;

/* loaded from: classes3.dex */
public interface Disposable {
    void dispose();

    Deferred getJob();
}
