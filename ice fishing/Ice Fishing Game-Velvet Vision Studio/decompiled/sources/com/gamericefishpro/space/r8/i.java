package com.gamericefishpro.space.r8;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements OnCompleteListener, com.gamericefishpro.space.r9.e, com.gamericefishpro.space.r9.d, com.gamericefishpro.space.r9.c {
    public final CountDownLatch d;

    @Override // com.gamericefishpro.space.r9.c
    public void a() {
        this.d.countDown();
    }

    @Override // com.gamericefishpro.space.r9.e
    public void c(Object obj) {
        this.d.countDown();
    }

    @Override // com.gamericefishpro.space.r9.d
    public void d(Exception exc) {
        this.d.countDown();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        this.d.countDown();
    }

    public /* synthetic */ i() {
        this.d = new CountDownLatch(1);
    }
}
