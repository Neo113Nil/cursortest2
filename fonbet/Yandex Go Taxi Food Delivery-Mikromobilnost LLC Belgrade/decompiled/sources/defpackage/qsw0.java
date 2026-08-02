package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.surge.dialog.SurgeInfoModalView;

/* loaded from: classes6.dex */
public final class qsw0 extends RecyclerView.g {
    public final /* synthetic */ SurgeInfoModalView a;

    public qsw0(SurgeInfoModalView surgeInfoModalView) {
        this.a = surgeInfoModalView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.a.hideTooltip();
    }
}
