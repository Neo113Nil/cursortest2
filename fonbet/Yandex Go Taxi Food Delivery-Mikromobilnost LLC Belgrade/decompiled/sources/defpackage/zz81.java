package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.zzw;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class zz81 {
    public int d;
    public final w53 b = new w53();
    public final atx0 c = new atx0();
    public boolean e = false;
    public final w53 a = new w53();

    public zz81(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.put(((ust) ((j7u) it.next())).e, null);
        }
        this.d = ((s53) this.a.keySet()).a.c;
    }

    public final zzw a() {
        return this.c.a;
    }

    public final s53 b() {
        return (s53) this.a.keySet();
    }

    public final void c(wn2 wn2Var, ConnectionResult connectionResult, String str) {
        w53 w53Var = this.a;
        w53Var.put(wn2Var, connectionResult);
        w53 w53Var2 = this.b;
        w53Var2.put(wn2Var, str);
        this.d--;
        if (!connectionResult.isSuccess()) {
            this.e = true;
        }
        if (this.d == 0) {
            boolean z = this.e;
            atx0 atx0Var = this.c;
            if (!z) {
                atx0Var.a(w53Var2);
            } else {
                atx0Var.a.r(new AvailabilityException(w53Var));
            }
        }
    }
}
