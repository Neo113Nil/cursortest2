package v2;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Callable;
import r2.C4906k;

/* loaded from: classes.dex */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final long f41144a;

    public k(long j6) {
        this.f41144a = j6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.f24341S.remove(Long.valueOf(this.f41144a)) == null) {
            return null;
        }
        C4906k.f40186C.f40196h.d("AdOverlayObjectsCleanupTask", new Exception("Key was non-null in AdOverlayObjectsCleanupTask"));
        return null;
    }
}
