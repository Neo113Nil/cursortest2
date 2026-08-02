package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.legacy.view.DivView;

/* loaded from: classes11.dex */
public final class srs extends RecyclerView.g {
    public final LinearLayoutManager a;
    public int b = 0;
    public boolean c = false;
    public final /* synthetic */ trs d;

    public srs(trs trsVar, DivView divView, LinearLayoutManager linearLayoutManager) {
        this.d = trsVar;
        this.a = linearLayoutManager;
        divView.getConfig().getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            this.c = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.a.H / 20;
        int abs = Math.abs(i) + this.b;
        this.b = abs;
        if (abs > i3) {
            this.b = 0;
            if (this.c) {
                return;
            }
            this.c = true;
            this.d.f.getClass();
        }
    }
}
