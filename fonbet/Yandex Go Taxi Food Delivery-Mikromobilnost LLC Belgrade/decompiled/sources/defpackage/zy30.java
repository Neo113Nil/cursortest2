package defpackage;

import com.yandex.mapkit.GeoObjectSession;

/* loaded from: classes6.dex */
public final class zy30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ GeoObjectSession b;

    public /* synthetic */ zy30(GeoObjectSession geoObjectSession, int i) {
        this.a = i;
        this.b = geoObjectSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.cancel();
                break;
            case 1:
                qyy0.b(new zy30(this.b, 0));
                break;
            case 2:
                this.b.cancel();
                break;
            default:
                qyy0.b(new zy30(this.b, 2));
                break;
        }
    }
}
