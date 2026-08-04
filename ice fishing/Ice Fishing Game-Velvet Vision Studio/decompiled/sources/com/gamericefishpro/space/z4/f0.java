package com.gamericefishpro.space.z4;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements u {
    public static final f0 B = new f0();
    public int d;
    public int e;
    public Handler w;
    public boolean i = true;
    public boolean v = true;
    public final w y = new w(this);
    public final com.appsflyer.a z = new com.appsflyer.a(25, this);
    public final w0 A = new w0(this);

    public final void c() {
        int i = this.e + 1;
        this.e = i;
        if (i == 1) {
            if (this.i) {
                this.y.d(o.ON_RESUME);
                this.i = false;
            } else {
                Handler handler = this.w;
                Intrinsics.b(handler);
                handler.removeCallbacks(this.z);
            }
        }
    }

    @Override // com.gamericefishpro.space.z4.u
    public final w g() {
        return this.y;
    }
}
