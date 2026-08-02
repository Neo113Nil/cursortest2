package ru.yandex.taxi.scooters.presentation.common.ui.camera;

import com.yandex.go.design.view.GoFrameLayout;
import defpackage.rnm;
import defpackage.sls;
import defpackage.z1w;

/* loaded from: classes6.dex */
public final class a {
    public final GoFrameLayout a;
    public final CameraLayer b;
    public final sls c;
    public final z1w d;
    public CameraLayer e;

    public a(GoFrameLayout goFrameLayout, CameraLayer cameraLayer, sls slsVar, z1w z1wVar) {
        this.a = goFrameLayout;
        this.b = cameraLayer;
        this.c = slsVar;
        this.d = z1wVar;
    }

    public final void a(CameraLayer cameraLayer, rnm rnmVar) {
        cameraLayer.a = this.a;
        cameraLayer.b = this.c;
        cameraLayer.c = this.d;
        cameraLayer.g = this.b;
        CameraLayer cameraLayer2 = this.e;
        if (cameraLayer2 != null) {
            cameraLayer2.a(cameraLayer);
        } else {
            this.e = cameraLayer;
        }
    }
}
