package ru.yandex.taxi.layers.presentation;

import com.yandex.mapkit.map.CameraPosition;
import defpackage.ah00;
import defpackage.ap00;
import defpackage.gh00;
import defpackage.jl40;
import defpackage.k5e0;
import defpackage.r8;
import defpackage.tzy0;
import defpackage.v65;
import defpackage.x4e0;
import defpackage.xm00;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class i extends r8 {
    public final k5e0 c;
    public final xm00 w;
    public final tzy0 x;
    public final v65 y;
    public Float z;

    public i(ah00 ah00Var, k5e0 k5e0Var) {
        super(5, ah00Var);
        this.c = k5e0Var;
        this.w = ((gh00) ah00Var).i.p();
        this.x = new tzy0(600, new PolylinesOverlay$throttle$1(1, this, i.class, "onCameraChange", "onCameraChange(Lcom/yandex/mapkit/map/CameraPosition;)V", 0));
        this.y = new v65(4, this);
    }

    public final void Hg(CameraPosition cameraPosition) {
        if (jl40.g(cameraPosition.getZoom(), this.z)) {
            return;
        }
        float zoom = cameraPosition.getZoom();
        Iterator it = this.w.n().iterator();
        while (it.hasNext()) {
            ap00 ap00Var = (ap00) it.next();
            boolean d = ru.yandex.taxi.layers.source.factory.a.d(((x4e0) ap00Var.d).j(), zoom);
            if (ap00Var.b != d) {
                ap00Var.i(d);
            }
        }
        this.z = Float.valueOf(cameraPosition.getZoom());
    }
}
