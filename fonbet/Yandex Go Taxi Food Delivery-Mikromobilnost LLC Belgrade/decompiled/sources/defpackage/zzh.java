package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.go.delivery.router.DeliveryCommonCameraModalViewKt$provideCameraModalView$1;
import com.yandex.go.delivery.router.DeliveryCommonChildModalView;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.logistics.childrouter.api.ScreenState;

/* loaded from: classes12.dex */
public final class zzh extends m230 {
    public final w030 E;
    public final Context F;
    public final a3v G;
    public final a H;

    public zzh(w030 w030Var, Context context, a3v a3vVar, a aVar) {
        super(null);
        this.E = w030Var;
        this.F = context;
        this.G = a3vVar;
        this.H = aVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        ((izh) obj).j.onDismiss();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ((izh) obj).j.b();
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        izh izhVar = (izh) obj;
        ScreenState screenState = izhVar.e;
        zni zniVar = izhVar.a;
        if (screenState != ScreenState.OVER_CAMERA) {
            return new DeliveryCommonChildModalView(this.F, izhVar, this.G, zniVar.create(), new yzh(this));
        }
        amh amhVar = new amh(10, this);
        xni create = zniVar.create();
        Context context = this.F;
        FrameLayout frameLayout = new FrameLayout(context);
        zni zniVar2 = izhVar.b;
        xni create2 = zniVar2 != null ? zniVar2.create() : null;
        return new DeliveryCommonCameraModalViewKt$provideCameraModalView$1(izhVar, frameLayout, create, create2 != null ? new FrameLayout(context) : null, create2, this.H, amhVar);
    }
}
