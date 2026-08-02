package defpackage;

import android.content.Context;
import android.util.Size;
import com.yandex.go.design.view.GoFrameLayout;
import kotlin.Pair;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.a;

/* loaded from: classes6.dex */
public final class xho0 {
    public final Context a;
    public final edh b;
    public final f2b c;
    public final vmn0 d;
    public final kdd0 e;

    public xho0(Context context, edh edhVar, f2b f2bVar, vmn0 vmn0Var, kdd0 kdd0Var) {
        this.a = context;
        this.b = edhVar;
        this.c = f2bVar;
        this.d = vmn0Var;
        this.e = kdd0Var;
    }

    public final void a(a aVar, dfv dfvVar, wls wlsVar) {
        Size size = new Size(512, 512);
        Pair a = edh.a(this.b, true, dfvVar, null, size, size, 4);
        gdh gdhVar = (gdh) a.getFirst();
        Object obj = (ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a) a.getSecond();
        GoFrameLayout goFrameLayout = aVar.a;
        gdhVar.a = goFrameLayout;
        sls slsVar = aVar.c;
        gdhVar.b = slsVar;
        z1w z1wVar = aVar.d;
        gdhVar.c = z1wVar;
        gdhVar.g = aVar.b;
        CameraLayer cameraLayer = aVar.e;
        if (cameraLayer != null) {
            cameraLayer.a(gdhVar);
        } else {
            aVar.e = gdhVar;
        }
        a aVar2 = new a(goFrameLayout, gdhVar, slsVar, z1wVar);
        wlsVar.invoke(aVar2, obj);
        CameraLayer cameraLayer2 = aVar2.e;
        if (cameraLayer2 == null) {
            return;
        }
        gdhVar.f = cameraLayer2;
    }
}
