package defpackage;

import ru.yandex.taxi.scooters.presentation.common.ui.ScootersCameraView;

/* loaded from: classes6.dex */
public final /* synthetic */ class x3n0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersCameraView b;
    public final /* synthetic */ tls c;

    public /* synthetic */ x3n0(ScootersCameraView scootersCameraView, tls tlsVar, int i) {
        this.a = i;
        this.b = scootersCameraView;
        this.c = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 flashlightListener$lambda$0;
        zy11 takePhotoListener$lambda$0;
        int i = this.a;
        tls tlsVar = this.c;
        ScootersCameraView scootersCameraView = this.b;
        switch (i) {
            case 0:
                flashlightListener$lambda$0 = ScootersCameraView.setFlashlightListener$lambda$0(scootersCameraView, tlsVar);
                return flashlightListener$lambda$0;
            default:
                takePhotoListener$lambda$0 = ScootersCameraView.setTakePhotoListener$lambda$0(scootersCameraView, tlsVar);
                return takePhotoListener$lambda$0;
        }
    }
}
