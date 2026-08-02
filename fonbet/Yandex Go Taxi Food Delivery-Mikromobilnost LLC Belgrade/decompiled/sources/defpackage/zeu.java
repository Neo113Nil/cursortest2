package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class zeu {
    public final ml21 c;
    public final Handler d;
    public boolean f;
    public boolean g;
    public boolean h;
    public final ejp a = new ejp(22, this);
    public final ArrayList b = new ArrayList();
    public u6i0 e = new u6i0(5000, 120000);

    public zeu(ml21 ml21Var, Handler handler) {
        this.c = ml21Var;
        this.d = handler;
    }

    public final void a() {
        this.g = false;
        if (this.f || !this.h) {
            this.f = false;
            this.e = new u6i0(5000L, 120000L);
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            afu afuVar = (afu) it.next();
            z83.g(null, afuVar.a, Looper.myLooper());
            afuVar.w.b.b(7, "MIRROR_HEARTBEAT_ERROR", null);
            if (afuVar.b.g()) {
                afuVar.c.c();
            }
        }
    }
}
