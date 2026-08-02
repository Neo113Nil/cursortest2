package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.w;

/* loaded from: classes11.dex */
public final class v69 extends w {
    @Override // androidx.recyclerview.widget.w
    public final int j(int i, int i2, int i3, int i4, int i5) {
        return ((i3 + i4) / 2) - ((i + i2) / 2);
    }

    @Override // androidx.recyclerview.widget.w
    public final int o(int i) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.c;
        return linearLayoutManager.K1() > linearLayoutManager.d0() * 3 ? 10 : 300;
    }
}
