package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o3b extends men {
    public final /* synthetic */ s70 k;

    public o3b(s70 s70Var) {
        this.k = s70Var;
    }

    @Override // defpackage.men
    public final void C(Throwable th) {
        ((r3b) this.k.b).f(th);
    }

    @Override // defpackage.men
    public final void D(xdh xdhVar) {
        s70 s70Var = this.k;
        s70Var.c = xdhVar;
        xdh xdhVar2 = (xdh) s70Var.c;
        r3b r3bVar = (r3b) s70Var.b;
        s70Var.a = new vx6(xdhVar2, r3bVar.g, r3bVar.i, Build.VERSION.SDK_INT >= 34 ? w3b.a() : etn.F());
        r3b r3bVar2 = (r3b) s70Var.b;
        ArrayList arrayList = new ArrayList();
        r3bVar2.a.writeLock().lock();
        try {
            r3bVar2.c = 1;
            arrayList.addAll(r3bVar2.b);
            r3bVar2.b.clear();
            r3bVar2.a.writeLock().unlock();
            r3bVar2.d.post(new zs3(arrayList, r3bVar2.c, (Throwable) null));
        } catch (Throwable th) {
            r3bVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
