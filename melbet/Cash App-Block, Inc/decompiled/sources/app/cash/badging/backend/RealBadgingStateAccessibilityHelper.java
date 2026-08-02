package app.cash.badging.backend;

import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.util.cash.Countries;

/* loaded from: classes.dex */
public final class RealBadgingStateAccessibilityHelper {
    public final AndroidStringManager stringManager;

    public RealBadgingStateAccessibilityHelper(AndroidStringManager androidStringManager) {
        this.stringManager = androidStringManager;
    }

    public final String get(long j) {
        if (j < 1) {
            return "";
        }
        return Countries.getString(this.stringManager.resources, FormattedResources.notifications_available(Long.valueOf(j)));
    }
}
