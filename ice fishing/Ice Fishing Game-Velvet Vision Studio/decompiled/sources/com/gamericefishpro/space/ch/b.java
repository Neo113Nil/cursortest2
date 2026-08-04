package com.gamericefishpro.space.ch;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements a {
    @Override // com.gamericefishpro.space.ch.a
    public abstract /* synthetic */ boolean isInBadState();

    @Override // com.gamericefishpro.space.ch.a
    public abstract /* synthetic */ void recover();

    @Override // com.gamericefishpro.space.ch.a
    public abstract /* synthetic */ String recoveryMessage();

    @Override // com.gamericefishpro.space.ch.a, com.gamericefishpro.space.jd.b
    public void start() {
        if (isInBadState()) {
            com.gamericefishpro.space.od.b.warn$default(recoveryMessage(), null, 2, null);
            recover();
        }
    }
}
