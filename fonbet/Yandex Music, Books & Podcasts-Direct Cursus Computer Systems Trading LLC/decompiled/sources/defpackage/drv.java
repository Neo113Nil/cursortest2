package defpackage;

import android.view.View;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class drv implements uyf {
    public final /* synthetic */ tf6 a;
    public final /* synthetic */ lbk b;
    public final /* synthetic */ cnn c;
    public final /* synthetic */ xqn d;
    public final /* synthetic */ View e;

    public drv(tf6 tf6Var, lbk lbkVar, cnn cnnVar, xqn xqnVar, View view) {
        this.a = tf6Var;
        this.b = lbkVar;
        this.c = cnnVar;
        this.d = xqnVar;
        this.e = view;
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        boolean z;
        int i = crv.a[kyfVar.ordinal()];
        yt3 yt3Var = null;
        if (i == 1) {
            x97.y(this.a, null, pm6.d, new xg(this.d, this.c, dzfVar, this, this.e, (Continuation) null, 22), 1);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                this.c.w();
                return;
            } else {
                cnn cnnVar = this.c;
                synchronized (cnnVar.c) {
                    cnnVar.t = true;
                }
                return;
            }
        }
        lbk lbkVar = this.b;
        if (lbkVar != null) {
            z0j z0jVar = lbkVar.b;
            synchronized (z0jVar.c) {
                try {
                    synchronized (z0jVar.c) {
                        z = z0jVar.b;
                    }
                    if (!z) {
                        ArrayList arrayList = (ArrayList) z0jVar.d;
                        z0jVar.d = (ArrayList) z0jVar.e;
                        z0jVar.e = arrayList;
                        z0jVar.b = true;
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            Continuation continuation = (Continuation) arrayList.get(i2);
                            r7o r7oVar = z7o.b;
                            continuation.resumeWith(Unit.a);
                        }
                        arrayList.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        cnn cnnVar2 = this.c;
        synchronized (cnnVar2.c) {
            if (cnnVar2.t) {
                cnnVar2.t = false;
                yt3Var = cnnVar2.y();
            }
        }
        if (yt3Var != null) {
            r7o r7oVar2 = z7o.b;
            ((zt3) yt3Var).resumeWith(Unit.a);
        }
    }
}
