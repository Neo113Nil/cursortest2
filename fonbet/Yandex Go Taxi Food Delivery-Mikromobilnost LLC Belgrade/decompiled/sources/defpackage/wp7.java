package defpackage;

import com.yandex.mapkit.map.CameraListener;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.Map;
import com.yandex.mobile.drive.sdk.map.b;
import kotlinx.coroutines.flow.r0;
import ru.yandex.yandexmaps.multiplatform.pin.war.a;

/* loaded from: classes7.dex */
public final /* synthetic */ class wp7 implements CameraListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wp7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.mapkit.map.CameraListener
    public final void onCameraPositionChanged(Map map, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                r0 r0Var = bVar.e;
                r0 r0Var2 = bVar.d;
                fs7 fs7Var = new fs7(cameraPosition, cameraUpdateReason, z);
                r0Var.getClass();
                r0Var.m(null, fs7Var);
                if (z && ((Boolean) r0Var2.getValue()).booleanValue()) {
                    r0Var2.m(null, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                jr7 jr7Var = (jr7) obj;
                jr7Var.c(new ir7(jr7Var, cameraPosition, cameraUpdateReason, z, 0));
                break;
            default:
                ((a) obj).a(z);
                break;
        }
    }
}
