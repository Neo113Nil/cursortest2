package com.gamericefishpro.space.f8;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public enum c implements com.gamericefishpro.space.jb.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int d;

    c(int i) {
        this.d = i;
    }

    @Override // com.gamericefishpro.space.jb.c
    public final int getNumber() {
        return this.d;
    }
}
