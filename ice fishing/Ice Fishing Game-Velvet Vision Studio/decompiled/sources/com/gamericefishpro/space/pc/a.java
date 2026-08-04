package com.gamericefishpro.space.pc;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface a {
    boolean cancelRunBackgroundServices();

    boolean getNeedsJobReschedule();

    Object runBackgroundServices(com.gamericefishpro.space.th.a aVar);

    void setNeedsJobReschedule(boolean z);
}
