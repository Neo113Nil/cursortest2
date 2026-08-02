package defpackage;

import com.yandex.mapkit.transport.masstransit.VehicleSession;

/* loaded from: classes6.dex */
public final class w110 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VehicleSession b;

    public /* synthetic */ w110(VehicleSession vehicleSession, int i) {
        this.a = i;
        this.b = vehicleSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.cancel();
                break;
            case 1:
                this.b.cancel();
                break;
            default:
                qyy0.b(new w110(this.b, 1));
                break;
        }
    }
}
