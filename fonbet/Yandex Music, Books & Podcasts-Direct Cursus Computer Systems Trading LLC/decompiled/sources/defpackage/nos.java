package defpackage;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class nos implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ nos(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pos posVar = this.b.v0;
                rxh rxhVar = posVar == null ? null : posVar.b;
                if (rxhVar != null) {
                    rxhVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
