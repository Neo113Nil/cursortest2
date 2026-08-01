package r3;

import com.google.android.gms.internal.ads.AbstractC3376ix;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: r3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4955d extends AbstractC3376ix {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40381c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f40382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4955d(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 2);
        this.f40381c = i;
        switch (i) {
            case 1:
                this.f40382d = carouselLayoutManager;
                super(0, 2);
                break;
            default:
                this.f40382d = carouselLayoutManager;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3376ix
    public final int a() {
        switch (this.f40381c) {
            case 0:
                return this.f40382d.f40553o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f40382d;
                return carouselLayoutManager.f40553o - carouselLayoutManager.D();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3376ix
    public final int b() {
        switch (this.f40381c) {
            case 0:
                return this.f40382d.E();
            default:
                return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3376ix
    public final int c() {
        switch (this.f40381c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f40382d;
                return carouselLayoutManager.f40552n - carouselLayoutManager.F();
            default:
                return this.f40382d.f40552n;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3376ix
    public final int d() {
        switch (this.f40381c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f40382d;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f40552n;
                }
                return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3376ix
    public final int e() {
        switch (this.f40381c) {
            case 0:
                return 0;
            default:
                return this.f40382d.G();
        }
    }
}
