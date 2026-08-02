package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class mqh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wqh b;

    public /* synthetic */ mqh(wqh wqhVar, int i) {
        this.a = i;
        this.b = wqhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                wqh wqhVar = this.b;
                if (wqhVar.i.g()) {
                    wqhVar.f.getClass();
                    krh.k(2);
                }
                wqhVar.dismiss();
                break;
        }
    }
}
