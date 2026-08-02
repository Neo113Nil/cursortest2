package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import com.yandex.messaging.internal.view.stickers.panel.a;

/* loaded from: classes15.dex */
public final class wcu0 extends GridLayoutManager.b {
    public final /* synthetic */ a d;

    public wcu0(a aVar) {
        this.d = aVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public final int c(int i) {
        a aVar = this.d;
        if (aVar.y.getItemViewType(i) == 0) {
            return aVar.A.c0;
        }
        return 1;
    }
}
