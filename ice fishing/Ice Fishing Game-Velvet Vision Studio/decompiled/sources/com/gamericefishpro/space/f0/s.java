package com.gamericefishpro.space.f0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h0.g0;
import com.gamericefishpro.space.t0.c1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final /* synthetic */ int a;
    public final c1 b;
    public final c1 c;
    public boolean d;
    public Object e;
    public final g0 f;

    public s(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new c1(i);
                this.c = new c1(i2);
                this.f = new g0(i, 90, 200);
                break;
            default:
                this.b = new c1(i);
                this.c = new c1(i2);
                this.f = new g0(i, 30, 100);
                break;
        }
    }

    public final void a(int i, int i2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i < 0.0f) {
                    com.gamericefishpro.space.c0.a.a("Index should be non-negative (" + i + ')');
                }
                this.b.h(i);
                this.f.b(i);
                this.c.h(i2);
                break;
            default:
                if (i < 0.0f) {
                    com.gamericefishpro.space.c0.a.a("Index should be non-negative");
                }
                this.b.h(i);
                this.f.b(i);
                this.c.h(i2);
                break;
        }
    }
}
