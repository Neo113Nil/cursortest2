package com.gamericefishpro.space.ub;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public enum c implements com.gamericefishpro.space.jb.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);

    public final int d;

    c(int i2) {
        this.d = i2;
    }

    @Override // com.gamericefishpro.space.jb.c
    public final int getNumber() {
        return this.d;
    }
}
