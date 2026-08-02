package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import io.grpc.util.b;

/* loaded from: classes5.dex */
public final class ask extends aeg {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public ask(xdg xdgVar) {
        o2g.O(xdgVar, CameraService.RESULT);
        this.b = xdgVar;
    }

    @Override // defpackage.aeg
    public final xdg a(dsk dskVar) {
        switch (this.a) {
            case 0:
                return (xdg) this.b;
            default:
                xdg a = ((aeg) this.b).a(dskVar);
                zdg zdgVar = a.a;
                if (zdgVar == null) {
                    return a;
                }
                xu1 u = zdgVar.u();
                return xdg.b(zdgVar, new wxj((qxj) u.a.get(b.o), a.b));
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                z0j z0jVar = new z0j(ask.class.getSimpleName());
                z0jVar.q((xdg) this.b, CameraService.RESULT);
                return z0jVar.toString();
            default:
                return super.toString();
        }
    }

    public ask(aeg aegVar) {
        this.b = aegVar;
    }
}
