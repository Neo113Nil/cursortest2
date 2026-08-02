package t3;

import com.google.android.gms.internal.ads.AbstractC3399ix;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: t3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5038c extends AbstractC3399ix {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40883c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f40884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5038c(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 2);
        this.f40883c = i;
        switch (i) {
            case 1:
                this.f40884d = carouselLayoutManager;
                super(0, 2);
                break;
            default:
                this.f40884d = carouselLayoutManager;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3399ix
    public final int a() {
        switch (this.f40883c) {
            case 0:
                return this.f40884d.f40603o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f40884d;
                return carouselLayoutManager.f40603o - carouselLayoutManager.D();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3399ix
    public final int b() {
        switch (this.f40883c) {
            case 0:
                return this.f40884d.E();
            default:
                return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3399ix
    public final int c() {
        switch (this.f40883c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f40884d;
                return carouselLayoutManager.f40602n - carouselLayoutManager.F();
            default:
                return this.f40884d.f40602n;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3399ix
    public final int d() {
        switch (this.f40883c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f40884d;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f40602n;
                }
                return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3399ix
    public final int e() {
        switch (this.f40883c) {
            case 0:
                return 0;
            default:
                return this.f40884d.G();
        }
    }
}
