package defpackage;

import android.widget.TextView;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.layers.presentation.optimalview.MapObservationView;

/* loaded from: classes5.dex */
public final class qq00 implements mq00 {
    public final /* synthetic */ MapObservationView a;

    public qq00(MapObservationView mapObservationView) {
        this.a = mapObservationView;
    }

    @Override // defpackage.mq00
    public final void hideFirstUsageHint() {
    }

    @Override // defpackage.mq00
    public final void hideMessage() {
        MapObservationView mapObservationView = this.a;
        cma1.b(0.0f, mapObservationView).setListener(new AnimUtils$AnimationEndListener(new fbz(15, mapObservationView)));
    }

    @Override // defpackage.mq00
    public final void showFirstUsageHint() {
    }

    @Override // defpackage.mq00
    public final void showMessage(String str, String str2) {
        TextView textView;
        MapObservationView mapObservationView = this.a;
        if (mapObservationView.getDisplayMessageEnabled()) {
            mapObservationView.setAlpha(1.0f);
            textView = mapObservationView.messageText;
            textView.setText(str);
        }
    }
}
