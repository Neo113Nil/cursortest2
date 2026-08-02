package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final /* synthetic */ class dfx implements b8o {
    public final /* synthetic */ int a;
    public final /* synthetic */ wmh b;

    public /* synthetic */ dfx(wmh wmhVar, int i) {
        this.a = i;
        this.b = wmhVar;
    }

    @Override // defpackage.b8o
    public final void a(a8o a8oVar) {
        i3x i3xVar = (i3x) a8oVar;
        switch (this.a) {
            case 0:
                Status status = i3xVar.getStatus();
                int i = status.a;
                wmh wmhVar = this.b;
                if (i != 0) {
                    msg msgVar = (msg) wmhVar.b;
                    Log.w(msgVar.a, msgVar.d(hrg.p("Error fetching queue item ids, statusCode=", i, ", statusMessage=", status.b), new Object[0]));
                }
                wmhVar.l = null;
                if (!((ArrayDeque) wmhVar.h).isEmpty()) {
                    fsn fsnVar = (fsn) wmhVar.i;
                    fbr fbrVar = (fbr) wmhVar.j;
                    fsnVar.removeCallbacks(fbrVar);
                    fsnVar.postDelayed(fbrVar, 500L);
                    break;
                }
                break;
            default:
                Status status2 = i3xVar.getStatus();
                int i2 = status2.a;
                wmh wmhVar2 = this.b;
                if (i2 != 0) {
                    msg msgVar2 = (msg) wmhVar2.b;
                    Log.w(msgVar2.a, msgVar2.d(hrg.p("Error fetching queue items, statusCode=", i2, ", statusMessage=", status2.b), new Object[0]));
                }
                wmhVar2.k = null;
                if (!((ArrayDeque) wmhVar2.h).isEmpty()) {
                    fsn fsnVar2 = (fsn) wmhVar2.i;
                    fbr fbrVar2 = (fbr) wmhVar2.j;
                    fsnVar2.removeCallbacks(fbrVar2);
                    fsnVar2.postDelayed(fbrVar2, 500L);
                    break;
                }
                break;
        }
    }
}
