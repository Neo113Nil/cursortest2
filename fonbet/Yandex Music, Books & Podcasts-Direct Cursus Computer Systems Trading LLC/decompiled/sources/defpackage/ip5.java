package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class ip5 extends ClickableSpan {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public ip5(p7g p7gVar) {
        this.b = p7gVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((p7g) this.b).getClass();
                break;
            default:
                ((rs6) ((jp0) this.b).e).invoke();
                break;
        }
    }

    public ip5(jp0 jp0Var) {
        this.b = jp0Var;
    }
}
