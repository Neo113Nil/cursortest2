package app.cash.local.backend.real;

import com.squareup.cash.util.clock.AndroidClock;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class RealLocalBrandProfileBannerDismissalTracker {
    public final AndroidClock clock;
    public final AtomicReference dismissedAt = new AtomicReference(null);

    public RealLocalBrandProfileBannerDismissalTracker(AndroidClock androidClock) {
        this.clock = androidClock;
    }
}
