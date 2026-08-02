package defpackage;

import ru.yandex.taxi.scooters.presentation.common.ui.ScootersCameraSlideableModalView;

/* loaded from: classes6.dex */
public final class w3n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersCameraSlideableModalView b;

    public /* synthetic */ w3n0(ScootersCameraSlideableModalView scootersCameraSlideableModalView, int i) {
        this.a = i;
        this.b = scootersCameraSlideableModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ScootersCameraSlideableModalView scootersCameraSlideableModalView = this.b;
        switch (i) {
            case 0:
                scootersCameraSlideableModalView.updateCameraPreviewHeight();
                break;
            default:
                scootersCameraSlideableModalView.updateCameraPreviewHeight();
                break;
        }
    }
}
