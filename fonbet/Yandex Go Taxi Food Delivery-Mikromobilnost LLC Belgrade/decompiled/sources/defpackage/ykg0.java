package defpackage;

import com.yandex.go.taxi.order.queue.presentation.QueueView;

/* loaded from: classes14.dex */
public final class ykg0 implements ekg0 {
    public final /* synthetic */ QueueView a;

    public ykg0(QueueView queueView) {
        this.a = queueView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        this.a.updateState((kkg0) obj);
    }
}
