package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.a6o0;
import defpackage.ban0;
import defpackage.c06;
import defpackage.cfv;
import defpackage.edh;
import defpackage.f9n0;
import defpackage.fcj0;
import defpackage.fhh;
import defpackage.fva0;
import defpackage.gdh;
import defpackage.gzn0;
import defpackage.j6m0;
import defpackage.j9n0;
import defpackage.jco0;
import defpackage.kan0;
import defpackage.kco0;
import defpackage.kdd0;
import defpackage.n5o0;
import defpackage.nan0;
import defpackage.nqm0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.tso0;
import defpackage.xvf0;
import defpackage.ycm0;
import defpackage.yvf0;
import defpackage.z1w;
import defpackage.z8n0;
import kotlin.Pair;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.scooters.domain.m;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.b;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.c;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.d;

/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final tse b;
    public final edh c;
    public final yvf0 d;
    public final kan0 e;
    public final kdd0 f;
    public final d g;

    public a(Context context, tse tseVar, edh edhVar, yvf0 yvf0Var, kan0 kan0Var, kdd0 kdd0Var, d dVar) {
        this.a = context;
        this.b = tseVar;
        this.c = edhVar;
        this.d = yvf0Var;
        this.e = kan0Var;
        this.f = kdd0Var;
        this.g = dVar;
    }

    public final c06 a(ScootersErrorCode scootersErrorCode, a6o0 a6o0Var, cfv cfvVar, tso0 tso0Var, f9n0 f9n0Var, j9n0 j9n0Var, j6m0 j6m0Var) {
        fhh fhhVar = (fhh) this.d.get();
        tje.N(this.b, null, null, new ScootersCompletionPhotoCameraUiFactory$create$1(this, a6o0Var.a(), null), 3);
        Pair a = edh.a(this.c, false, cfvVar, f9n0Var != null ? f9n0Var.b : null, null, null, 24);
        gdh gdhVar = (gdh) a.getFirst();
        ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar = (ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a) a.getSecond();
        kan0 kan0Var = this.e;
        Context context = kan0Var.a;
        fva0 fva0Var = kan0Var.b;
        ban0 ban0Var = kan0Var.c;
        n5o0 n5o0Var = kan0Var.d;
        fcj0 fcj0Var = kan0Var.e.a;
        nan0 nan0Var = new nan0(context, fva0Var, tso0Var, f9n0Var, ban0Var, new ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.d((m) ((gzn0) fcj0Var.a).get(), (nqm0) ((xvf0) fcj0Var.b).get(), (kco0) ((xvf0) fcj0Var.c).get(), (c) ((z8n0) fcj0Var.d).get(), (jco0) ((xvf0) fcj0Var.e).get(), a6o0Var, aVar, j9n0Var), n5o0Var);
        kdd0 kdd0Var = this.f;
        b bVar = new b(new ycm0(kdd0Var, scootersErrorCode, a6o0Var, j9n0Var, 2), (Context) kdd0Var.a, (fva0) kdd0Var.b, tso0Var, (ban0) kdd0Var.c);
        GoFrameLayout goFrameLayout = new GoFrameLayout(this.a, null, 0, 0, 14, null);
        goFrameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        z1w z1wVar = new z1w();
        ru.yandex.taxi.scooters.presentation.common.ui.camera.a aVar2 = new ru.yandex.taxi.scooters.presentation.common.ui.camera.a(goFrameLayout, null, j6m0Var, z1wVar);
        aVar2.a(fhhVar, null);
        GoFrameLayout goFrameLayout2 = aVar2.a;
        gdhVar.a = goFrameLayout2;
        sls slsVar = aVar2.c;
        gdhVar.b = slsVar;
        z1w z1wVar2 = aVar2.d;
        gdhVar.c = z1wVar2;
        gdhVar.g = aVar2.b;
        CameraLayer cameraLayer = aVar2.e;
        if (cameraLayer != null) {
            cameraLayer.a(gdhVar);
        } else {
            aVar2.e = gdhVar;
        }
        ru.yandex.taxi.scooters.presentation.common.ui.camera.a aVar3 = new ru.yandex.taxi.scooters.presentation.common.ui.camera.a(goFrameLayout2, gdhVar, slsVar, z1wVar2);
        aVar3.a(nan0Var, null);
        CameraLayer cameraLayer2 = aVar3.e;
        if (cameraLayer2 != null) {
            gdhVar.f = cameraLayer2;
        }
        aVar2.a(bVar, null);
        CameraLayer cameraLayer3 = aVar2.e;
        if (cameraLayer3 != null) {
            cameraLayer3.e();
        }
        return new c06(goFrameLayout, z1wVar);
    }
}
