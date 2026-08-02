package defpackage;

import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.video.g;
import androidx.concurrent.futures.b;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import com.yandex.go.navigator.BaseNavigatorModalView;
import com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoModalView;
import com.yandex.go.safety.center.contacts.SafetyCenterContactsView;
import com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.SuperAppOrderBundleView;
import com.ybsdk.feature.webview.internal.presentation.WebViewFragment;
import ru.yandex.taxi.design.CroppedTextView;
import ru.yandex.taxi.favorites.edit.a;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl;
import yads.gn0;

/* loaded from: classes10.dex */
public final /* synthetic */ class rg3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rg3(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MultiexitModalView multiexitModalView;
        int i = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                xg3 xg3Var = (xg3) ((h0w) obj).c;
                int i2 = tw21.a;
                xg3Var.onSkipSilenceEnabledChanged(z);
                break;
            case 1:
                g gVar = (g) ((o8g0) obj).b;
                if (gVar.a0 == z) {
                    sgb1.g(5, "Recorder");
                    break;
                } else {
                    gVar.a0 = z;
                    gVar.J(true);
                    break;
                }
            case 2:
                ((i00) ((h3y) ((mrj) obj).c).get()).a(new p2o(z));
                break;
            case 3:
                BaseNavigatorModalView baseNavigatorModalView = (BaseNavigatorModalView) obj;
                if (!z) {
                    baseNavigatorModalView.getCompassButton().setVisibility(8);
                    break;
                }
                break;
            case 4:
                dm7 dm7Var = (dm7) obj;
                if (dm7Var.a != z) {
                    dm7Var.a = z;
                    if (!z) {
                        CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("The camera control has became inactive.");
                        b bVar = dm7Var.g;
                        if (bVar != null) {
                            bVar.d(cameraControl$OperationCanceledException);
                            dm7Var.g = null;
                            break;
                        }
                    } else if (dm7Var.b) {
                        androidx.camera.camera2.internal.b bVar2 = dm7Var.c;
                        bVar2.getClass();
                        b bVar3 = new b();
                        bVar3.c = new hsj0();
                        gl7 gl7Var = new gl7(bVar3);
                        bVar3.b = gl7Var;
                        bVar3.a = x4e.class;
                        try {
                            bVar2.c.execute(new fm7(bVar2, bVar3, 0));
                            bVar3.a = "updateSessionConfigAsync";
                        } catch (Exception e) {
                            gl7Var.a(e);
                        }
                        ni91.g(gl7Var).c(new js4(26, dm7Var), dm7Var.d);
                        dm7Var.b = false;
                        break;
                    }
                }
                break;
            case 5:
                CroppedTextView.setModel$lambda$0((CroppedTextView) obj, z);
                break;
            case 6:
                a aVar = (a) obj;
                if (!z) {
                    aVar.i.run();
                    break;
                }
                break;
            case 7:
                uq40 uq40Var = (uq40) obj;
                if (z && (multiexitModalView = uq40Var.I) != null) {
                    multiexitModalView.disable();
                    break;
                }
                break;
            case 8:
                OptimizedYandexPlayerImpl.stop$lambda$44((OptimizedYandexPlayerImpl) obj, z);
                break;
            case 9:
                PickupFromPhotoModalView.onLowLightModeChanged$lambda$0((PickupFromPhotoModalView) obj, z);
                break;
            case 10:
                SafetyCenterContactsView.setShareStatus$lambda$0(z, (SafetyCenterContactsView) obj);
                break;
            case 11:
                ((jcu0) obj).a(z);
                break;
            case 12:
                SuperAppOrderBundleView superAppOrderBundleView = (SuperAppOrderBundleView) obj;
                if (z) {
                    TransitionManager.a(new ChangeBounds(), superAppOrderBundleView);
                    break;
                }
                break;
            case 13:
                ((kcz0) ((i630) obj).d).z(true, z);
                break;
            case 14:
                ((WebViewFragment) obj).setBackButtonVisible(z);
                break;
            case 15:
                ((rr41) ((i630) obj).d).t(true, z);
                break;
            default:
                gn0 gn0Var = (gn0) ((hn71) obj).c;
                int i3 = rf71.a;
                gn0Var.a(z);
                break;
        }
    }

    public /* synthetic */ rg3(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
