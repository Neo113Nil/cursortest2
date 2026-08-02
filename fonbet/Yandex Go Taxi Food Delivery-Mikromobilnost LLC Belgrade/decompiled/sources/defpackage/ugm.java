package defpackage;

import com.yandex.go.drive.vertical.ui.tariff_card.DriveTariffCardModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class ugm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DriveTariffCardModalView b;

    public /* synthetic */ ugm(DriveTariffCardModalView driveTariffCardModalView, int i) {
        this.a = i;
        this.b = driveTariffCardModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DriveTariffCardModalView driveTariffCardModalView = this.b;
        switch (i) {
            case 0:
                driveTariffCardModalView.onBackPressed();
                break;
            default:
                DriveTariffCardModalView.onAttachedToWindow$lambda$0(driveTariffCardModalView);
                break;
        }
    }
}
