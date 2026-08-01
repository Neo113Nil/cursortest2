package E0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f179c;

    public d(int i) {
        this.f177a = i;
    }

    public final int a() {
        switch (this.f178b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f179c;
                if (carouselLayoutManager.F0()) {
                    return carouselLayoutManager.f3394n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f178b = i;
        switch (i) {
            case 1:
                this.f179c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f179c = carouselLayoutManager;
                break;
        }
    }
}
