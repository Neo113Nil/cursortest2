package defpackage;

import android.hardware.camera2.CaptureRequest;

/* loaded from: classes10.dex */
public class q7j0 {
    public final yy40 a = yy40.b();

    public final v5c0 a() {
        ug70 a = ug70.a(this.a);
        v5c0 v5c0Var = new v5c0(26);
        v5c0Var.b = a;
        return v5c0Var;
    }

    public final void b(CaptureRequest.Key key, Object obj) {
        this.a.w(new x34("camera2.captureRequest.option." + key.getName(), Object.class, key), obj);
    }
}
