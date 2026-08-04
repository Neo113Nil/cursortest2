package com.gamericefishpro.space.ub;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public enum b implements com.gamericefishpro.space.jb.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    public final int d;

    b(int i) {
        this.d = i;
    }

    @Override // com.gamericefishpro.space.jb.c
    public final int getNumber() {
        return this.d;
    }
}
