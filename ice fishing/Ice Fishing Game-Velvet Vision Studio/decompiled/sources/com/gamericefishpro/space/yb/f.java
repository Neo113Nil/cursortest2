package com.gamericefishpro.space.yb;

import com.gamericefishpro.space.i9.a4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final f INSTANCE = new f();
    private static int maxNetworkRequestAttemptCount = 3;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public enum a {
        INVALID,
        RETRYABLE,
        UNAUTHORIZED,
        MISSING,
        CONFLICT;

        private static final /* synthetic */ com.gamericefishpro.space.wh.a $ENTRIES = a4.t(values());

        public static com.gamericefishpro.space.wh.a getEntries() {
            return $ENTRIES;
        }
    }

    private f() {
    }

    public final int getMaxNetworkRequestAttemptCount() {
        return maxNetworkRequestAttemptCount;
    }

    public final a getResponseStatusType(int i) {
        if (i == 409) {
            return a.CONFLICT;
        }
        if (i != 410) {
            if (i == 429) {
                return a.RETRYABLE;
            }
            switch (i) {
                case 400:
                case 402:
                    return a.INVALID;
                case 401:
                case 403:
                    return a.UNAUTHORIZED;
                case 404:
                    break;
                default:
                    return a.RETRYABLE;
            }
        }
        return a.MISSING;
    }

    public final void setMaxNetworkRequestAttemptCount(int i) {
        maxNetworkRequestAttemptCount = i;
    }
}
