package defpackage;

import android.view.View;

/* loaded from: classes13.dex */
public final class yji0 extends wys {
    public final /* synthetic */ int R;
    public final /* synthetic */ View S;
    public final /* synthetic */ wls T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yji0(View view, wls wlsVar, int i) {
        super(view);
        this.R = i;
        this.S = view;
        this.T = wlsVar;
    }

    @Override // defpackage.wys
    public final boolean X() {
        switch (this.R) {
        }
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.R;
        View view = this.S;
        wls wlsVar = this.T;
        switch (i) {
            case 0:
                wlsVar.invoke(view, obj);
                break;
            case 1:
                wlsVar.invoke(view, obj);
                break;
            default:
                a0((g18) wlsVar.invoke(view, obj));
                break;
        }
    }
}
