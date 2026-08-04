package com.gamericefishpro.space.z9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.gamericefishpro.space.d6.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ CarouselLayoutManager c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1);
        this.b = i;
        switch (i) {
            case 1:
                this.c = carouselLayoutManager;
                super(0);
                break;
            default:
                this.c = carouselLayoutManager;
                break;
        }
    }

    @Override // com.gamericefishpro.space.d6.c
    public final int b() {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.c.j;
            default:
                CarouselLayoutManager carouselLayoutManager = this.c;
                return carouselLayoutManager.j - carouselLayoutManager.w();
        }
    }

    @Override // com.gamericefishpro.space.d6.c
    public final int c() {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.c.x();
            default:
                return 0;
        }
    }

    @Override // com.gamericefishpro.space.d6.c
    public final int d() {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CarouselLayoutManager carouselLayoutManager = this.c;
                return carouselLayoutManager.i - carouselLayoutManager.y();
            default:
                return this.c.i;
        }
    }

    @Override // com.gamericefishpro.space.d6.c
    public final int e() {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 0;
            default:
                return this.c.z();
        }
    }
}
