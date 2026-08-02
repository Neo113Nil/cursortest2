package defpackage;

import com.yandex.go.navigator.driving.DrivingModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class rkm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ikm b;

    public /* synthetic */ rkm(ikm ikmVar, int i) {
        this.a = i;
        this.b = ikmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ikm ikmVar = this.b;
        switch (i) {
            case 0:
                DrivingModalView.onAttachedToWindow$onTrafficJamClicked(ikmVar);
                break;
            case 1:
                DrivingModalView.onAttachedToWindow$onFinishButtonClick(ikmVar);
                break;
            case 2:
                DrivingModalView.incidentsButton_delegate$lambda$0$0$onNewIncidentClicked(ikmVar);
                break;
            case 3:
                ikmVar.G.a();
                break;
            default:
                ikmVar.F.b();
                ikmVar.D.a();
                break;
        }
    }
}
