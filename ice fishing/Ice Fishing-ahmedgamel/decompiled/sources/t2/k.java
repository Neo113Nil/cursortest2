package t2;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Callable;
import p2.C4835j;

/* loaded from: classes.dex */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final long f40856a;

    public k(long j6) {
        this.f40856a = j6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.f23561S.remove(Long.valueOf(this.f40856a)) == null) {
            return null;
        }
        C4835j.f39733C.f39743h.d("AdOverlayObjectsCleanupTask", new Exception("Key was non-null in AdOverlayObjectsCleanupTask"));
        return null;
    }
}
