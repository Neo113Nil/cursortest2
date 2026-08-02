package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes3.dex */
public final class b44 extends ceg {
    public final /* synthetic */ int g;
    public final /* synthetic */ CarouselLayoutManager h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b44(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 2);
        this.g = i;
        switch (i) {
            case 1:
                this.h = carouselLayoutManager;
                super(0, 2);
                break;
            default:
                this.h = carouselLayoutManager;
                break;
        }
    }

    @Override // defpackage.ceg
    public final int h() {
        switch (this.g) {
            case 0:
                return this.h.o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.h;
                return carouselLayoutManager.o - carouselLayoutManager.b0();
        }
    }

    @Override // defpackage.ceg
    public final int i() {
        switch (this.g) {
            case 0:
                return this.h.c0();
            default:
                return 0;
        }
    }

    @Override // defpackage.ceg
    public final int k() {
        switch (this.g) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.h;
                return carouselLayoutManager.n - carouselLayoutManager.d0();
            default:
                return this.h.n;
        }
    }

    @Override // defpackage.ceg
    public final int l() {
        switch (this.g) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.h;
                if (carouselLayoutManager.i1()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    @Override // defpackage.ceg
    public final int m() {
        switch (this.g) {
            case 0:
                return 0;
            default:
                return this.h.e0();
        }
    }
}
