package com.gamericefishpro.space.bd;

import com.gamericefishpro.space.i9.a4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public enum b {
    SUCCESS,
    SUCCESS_STARTING_ONLY,
    FAIL_RETRY,
    FAIL_NORETRY,
    FAIL_UNAUTHORIZED,
    FAIL_CONFLICT,
    FAIL_PAUSE_OPREPO;

    private static final /* synthetic */ com.gamericefishpro.space.wh.a $ENTRIES = a4.t(values());

    public static com.gamericefishpro.space.wh.a getEntries() {
        return $ENTRIES;
    }
}
