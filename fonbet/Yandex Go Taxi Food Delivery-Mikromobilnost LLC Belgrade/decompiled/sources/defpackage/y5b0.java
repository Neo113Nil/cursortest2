package defpackage;

import com.yandex.go.shortcuts.impl.view.adapter.t;

/* loaded from: classes13.dex */
public final class y5b0 extends t {
    @Override // defpackage.bys, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.bys
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final e6v getItem(int i) {
        return (e6v) super.getItem(i % this.x.f.size());
    }
}
