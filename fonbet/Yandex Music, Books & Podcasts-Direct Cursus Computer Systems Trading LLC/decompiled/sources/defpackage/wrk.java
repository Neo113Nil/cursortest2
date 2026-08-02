package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;

/* loaded from: classes5.dex */
public final class wrk extends aeg {
    public final /* synthetic */ int a;
    public final xdg b;

    public wrk(xdg xdgVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                o2g.O(xdgVar, CameraService.RESULT);
                this.b = xdgVar;
                break;
            default:
                o2g.O(xdgVar, CameraService.RESULT);
                this.b = xdgVar;
                break;
        }
    }

    @Override // defpackage.aeg
    public final xdg a(dsk dskVar) {
        switch (this.a) {
        }
        return this.b;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                z0j z0jVar = new z0j(wrk.class.getSimpleName());
                z0jVar.q(this.b, CameraService.RESULT);
                return z0jVar.toString();
            default:
                return "FixedResultPicker(" + this.b + ")";
        }
    }
}
