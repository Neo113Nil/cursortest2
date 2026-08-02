package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.view.View;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.media3.exoplayer.j;
import com.yandex.div.core.c;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.logistics.cargo_flow.a;
import com.yandex.go.taxi.order.cancel.similar.interactor.h;
import com.yandex.go.taxi.order.cancel.similar.model.CancelSimilarButton$State;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersNotification;
import com.yandex.messaging.input.b;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes11.dex */
public class sr4 implements nr4, g05, tx11, nb10, l99, ryj0, ol41, us20, qw01, hqs, wu7, yf8, ko41 {
    public final /* synthetic */ int a;
    public Object b;

    public sr4(Context context) {
        this.a = 20;
        this.b = (CameraManager) context.getSystemService("camera");
    }

    @Override // defpackage.ko41
    public gci0 a() {
        return (gci0) this.b;
    }

    @Override // defpackage.us20
    public void b(String str) {
        n891.n(new l95(21, this));
    }

    @Override // defpackage.ol41
    public void c(nl41 nl41Var) {
        ((qu5) this.b).n.l(nl41Var);
    }

    @Override // defpackage.wu7
    public void d() {
        ((h) this.b).n.l(CancelSimilarButton$State.IDLE);
    }

    @Override // defpackage.us20
    public void e(ct20 ct20Var) {
        n891.n(new lu5(5, this, ct20Var));
    }

    @Override // defpackage.tx11
    public void f() {
        b bVar = (b) this.b;
        bVar.n.getClass();
        View view = bVar.e;
        if (view != null) {
            view.setActivated(true);
        }
    }

    @Override // defpackage.tx11
    public void g() {
        View view = ((b) this.b).e;
        if (view != null) {
            view.setActivated(false);
        }
    }

    @Override // defpackage.nr4
    public void h(String str) {
        ((a) ((tr4) this.b).b.a.b).l0.a(Uri.parse(str), DeeplinkSource.UNSPECIFIED);
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        ((com.yandex.payment.sdk.datasource.bind.a) this.b).c((PaymentKitError) obj);
    }

    public Set j() {
        return Collections.EMPTY_SET;
    }

    @Override // defpackage.wu7
    public void k(TaxiOrder taxiOrder) {
        h hVar = (h) this.b;
        m2v m2vVar = hVar.b;
        String str = taxiOrder.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) m2vVar.w;
        linkedHashSet.add(str);
        r0 r0Var = (r0) m2vVar.b;
        CancelSimilarOrdersNotification cancelSimilarOrdersNotification = (CancelSimilarOrdersNotification) m2vVar.a;
        qv10.B(cancelSimilarOrdersNotification.c.containsAll(linkedHashSet) && linkedHashSet.containsAll(cancelSimilarOrdersNotification.c), r0Var, null);
        hVar.n.l(CancelSimilarButton$State.IDLE);
    }

    @Override // defpackage.nb10
    public void l() {
        j jVar = ((peh) this.b).a0;
        if (jVar != null) {
            jVar.b();
        }
    }

    public void m(v3k v3kVar, int i) {
        udl udlVar = ((com.yandex.div.core.view2.divs.tabs.a) this.b).j;
        if (v3kVar.e != null) {
            udlVar.getClass();
            int i2 = wfx.a;
        }
        c cVar = udlVar.b;
        aw5 aw5Var = udlVar.a;
        Div2View div2View = aw5Var.a;
        rvo rvoVar = aw5Var.b;
        cVar.getClass();
        y6k actionHandler = div2View.getActionHandler();
        if (((Boolean) v3kVar.b.a(rvoVar)).booleanValue()) {
            cVar.a(div2View, rvoVar, v3kVar, "click", null, actionHandler);
        }
    }

    public void n() {
        ((org.altbeacon.beacon.b) this.b).c();
    }

    public void o(int i) {
        ((com.yandex.div.core.view2.divs.tabs.a) this.b).d.setCurrentItem(i);
    }

    @Override // defpackage.hqs
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 15:
                czj0.a((wrb0) this.b, th);
                break;
            case 16:
            default:
                boolean z = th instanceof CameraControl$OperationCanceledException;
                wrb0 wrb0Var = (wrb0) this.b;
                if (!z) {
                    czj0.a(wrb0Var, th);
                    break;
                } else {
                    czj0.b(null, wrb0Var);
                    break;
                }
            case 17:
                boolean z2 = th instanceof CameraControl$OperationCanceledException;
                wrb0 wrb0Var2 = (wrb0) this.b;
                if (!z2) {
                    czj0.a(wrb0Var2, th);
                    break;
                } else {
                    czj0.b(null, wrb0Var2);
                    break;
                }
        }
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 7:
                BoundCard boundCard = (BoundCard) obj;
                com.yandex.payment.sdk.datasource.bind.a aVar = (com.yandex.payment.sdk.datasource.bind.a) this.b;
                ol41 ol41Var = aVar.e;
                if (ol41Var != null) {
                    ol41Var.c(kl41.a);
                }
                on8 on8Var = aVar.f;
                if (on8Var != null) {
                    on8Var.b(new ln8(boundCard));
                    break;
                }
                break;
            case 15:
                czj0.b(null, (wrb0) this.b);
                break;
            case 17:
                czj0.b(null, (wrb0) this.b);
                break;
            default:
                czj0.b(Long.valueOf(((Integer) obj).longValue()), (wrb0) this.b);
                break;
        }
    }

    @Override // defpackage.nb10
    public void s() {
        j jVar = ((peh) this.b).a0;
        if (jVar != null) {
            jVar.b();
        }
    }

    public /* synthetic */ sr4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public sr4(CameraDevice cameraDevice) {
        this.a = 19;
        cameraDevice.getClass();
        this.b = new pm5(cameraDevice);
    }

    public sr4(gt8 gt8Var) {
        this.a = 28;
        this.b = gt8Var.b.a.a;
    }
}
