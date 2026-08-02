package defpackage;

import com.yandex.mapkit.directions.driving.DrivingSession;

/* loaded from: classes14.dex */
public final /* synthetic */ class slm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DrivingSession b;

    public /* synthetic */ slm(DrivingSession drivingSession, int i) {
        this.a = i;
        this.b = drivingSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.cancel();
                break;
            default:
                qyy0.b(new slm(this.b, 0));
                break;
        }
    }
}
