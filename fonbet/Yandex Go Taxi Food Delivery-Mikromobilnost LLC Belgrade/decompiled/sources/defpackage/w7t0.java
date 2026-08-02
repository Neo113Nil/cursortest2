package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.preorder.summary.tariffpage.TariffPagerView;

/* loaded from: classes6.dex */
public final class w7t0 implements zo31 {
    public final TariffPagerView a;

    public w7t0(TariffPagerView tariffPagerView, RecyclerView recyclerView) {
        this.a = tariffPagerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
