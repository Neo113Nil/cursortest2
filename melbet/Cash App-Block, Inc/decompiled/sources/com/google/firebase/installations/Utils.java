package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import com.google.mlkit.common.internal.zzb;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Utils {
    public static final Pattern API_KEY_FORMAT = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static Utils singleton;
    public final zzb clock;

    public Utils(zzb zzbVar) {
        this.clock = zzbVar;
    }

    public final boolean isAuthTokenExpired(AutoValue_PersistedInstallationEntry autoValue_PersistedInstallationEntry) {
        if (TextUtils.isEmpty(autoValue_PersistedInstallationEntry.authToken)) {
            return true;
        }
        long j = autoValue_PersistedInstallationEntry.tokenCreationEpochInSecs + autoValue_PersistedInstallationEntry.expiresInSecs;
        this.clock.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
