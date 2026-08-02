package defpackage;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.selection.j;

/* loaded from: classes10.dex */
public final /* synthetic */ class ygd implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ygd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((pzt0) obj).a(null);
                break;
            default:
                j jVar = (j) obj;
                if (jVar != null) {
                    oay oayVar = jVar.d;
                    if (oayVar != null) {
                        oayVar.B.setValue(new asy0(asy0.b));
                    }
                    oay oayVar2 = jVar.d;
                    if (oayVar2 != null) {
                        oayVar2.A.setValue(new asy0(asy0.b));
                        break;
                    }
                }
                break;
        }
    }
}
