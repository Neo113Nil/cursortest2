package defpackage;

import com.yandex.go.navigator.driving.DrivingModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class qkm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DrivingModalView b;

    public /* synthetic */ qkm(DrivingModalView drivingModalView, int i) {
        this.a = i;
        this.b = drivingModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DrivingModalView drivingModalView = this.b;
        switch (i) {
            case 0:
                drivingModalView.onBackPressed();
                break;
            default:
                DrivingModalView.onBehaviorStateChanged$lambda$0(drivingModalView);
                break;
        }
    }
}
