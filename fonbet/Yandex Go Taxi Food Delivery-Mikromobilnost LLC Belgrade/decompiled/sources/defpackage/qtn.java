package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes15.dex */
public final class qtn extends GridLayoutManager.b {
    public final /* synthetic */ rtn d;

    public qtn(rtn rtnVar) {
        this.d = rtnVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public final int c(int i) {
        rtn rtnVar = this.d;
        if (rtnVar.d.getItemViewType(i) == 1) {
            return rtnVar.e.c0;
        }
        return 1;
    }
}
