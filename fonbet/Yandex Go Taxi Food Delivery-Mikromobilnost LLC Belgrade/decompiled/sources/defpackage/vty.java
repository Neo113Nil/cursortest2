package defpackage;

import android.view.ViewTreeObserver;
import com.yandex.go.scooters.offers.v2.ScootersCardV2ModalView;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger;

/* loaded from: classes13.dex */
public final /* synthetic */ class vty implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vty(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ListViewTelemetryLogger._init_$lambda$0((ListViewTelemetryLogger) obj);
                break;
            default:
                ((ScootersCardV2ModalView) obj).onDrawEvent();
                break;
        }
    }
}
