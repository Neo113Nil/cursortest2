package com.gamericefishpro.space.e4;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.gamericefishpro.space.e8.b {
    public static g e;
    public Object d;

    public /* synthetic */ g(Object obj) {
        this.d = obj;
    }

    @Override // com.gamericefishpro.space.nh.a
    public Object get() {
        return this.d;
    }

    public g() {
        this.d = new Object();
        new Handler(Looper.getMainLooper(), new com.gamericefishpro.space.ma.e(0, this));
    }
}
