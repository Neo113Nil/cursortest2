package ru.yandex.taxi.layers.presentation.optimalview;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.bqh0;
import defpackage.jxi;
import defpackage.qq00;
import defpackage.wdh0;
import kotlin.Metadata;

@jxi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/layers/presentation/optimalview/MapObservationView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/yandex/taxi/layers/presentation/optimalview/c;", "mapObservationPresenter", "Lzy11;", "attach", "(Lru/yandex/taxi/layers/presentation/optimalview/c;)V", "detach", "()V", "", "displayMessageEnabled", "Z", "getDisplayMessageEnabled", "()Z", "setDisplayMessageEnabled", "(Z)V", "Lru/yandex/taxi/layers/presentation/optimalview/c;", "Landroid/widget/TextView;", "messageText", "Landroid/widget/TextView;", "qq00", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MapObservationView extends FrameLayout {
    private boolean displayMessageEnabled;
    private c mapObservationPresenter;
    private final TextView messageText;

    public MapObservationView(Context context) {
        super(context);
        ru.yandex.taxi.design.utils.c.q(this, bqh0.map_observation_layout, true);
        this.messageText = (TextView) findViewById(wdh0.message);
    }

    public final void attach(c mapObservationPresenter) {
        this.mapObservationPresenter = mapObservationPresenter;
        mapObservationPresenter.Lg(new qq00(this));
    }

    public final void detach() {
        c cVar = this.mapObservationPresenter;
        if (cVar != null) {
            cVar.Cg();
        }
        this.messageText.setText((CharSequence) null);
    }

    public final boolean getDisplayMessageEnabled() {
        return this.displayMessageEnabled;
    }

    public final void setDisplayMessageEnabled(boolean z) {
        this.displayMessageEnabled = z;
    }
}
