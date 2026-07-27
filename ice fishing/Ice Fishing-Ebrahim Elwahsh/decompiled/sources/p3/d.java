package p3;

import com.google.android.gms.internal.ads.AbstractC3551lx;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes2.dex */
public final class d extends AbstractC3551lx {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39831c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f39832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 2);
        this.f39831c = i;
        switch (i) {
            case 1:
                this.f39832d = carouselLayoutManager;
                super(0, 2);
                break;
            default:
                this.f39832d = carouselLayoutManager;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3551lx
    public final int a() {
        switch (this.f39831c) {
            case 0:
                return this.f39832d.f40575o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f39832d;
                return carouselLayoutManager.f40575o - carouselLayoutManager.D();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3551lx
    public final int b() {
        switch (this.f39831c) {
            case 0:
                return this.f39832d.E();
            default:
                return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3551lx
    public final int c() {
        switch (this.f39831c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f39832d;
                return carouselLayoutManager.f40574n - carouselLayoutManager.F();
            default:
                return this.f39832d.f40574n;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3551lx
    public final int d() {
        switch (this.f39831c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f39832d;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f40574n;
                }
                return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3551lx
    public final int e() {
        switch (this.f39831c) {
            case 0:
                return 0;
            default:
                return this.f39832d.G();
        }
    }
}
