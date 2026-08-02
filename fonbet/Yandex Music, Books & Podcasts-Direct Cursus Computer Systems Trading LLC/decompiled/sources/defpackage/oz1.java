package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class oz1 implements ps3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oz1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ps3
    public final void a(es3 es3Var, l3o l3oVar) {
        switch (this.a) {
            case 0:
                es3Var.getClass();
                l3oVar.getClass();
                List list = (List) ((gs4) this.b).d;
                list.getClass();
                gs4 gs4Var = (gs4) this.b;
                synchronized (list) {
                    try {
                        List list2 = (List) gs4Var.d;
                        list2.getClass();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            ((ps3) it.next()).a(es3Var, l3oVar);
                        }
                        ((List) gs4Var.d).clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                zt3 zt3Var = (zt3) this.b;
                es3Var.getClass();
                l3oVar.getClass();
                try {
                    o3o o3oVar = l3oVar.g;
                    byte[] a = o3oVar != null ? o3oVar.a() : null;
                    if (!l3oVar.b()) {
                        r7o r7oVar = z7o.b;
                        zt3Var.resumeWith(new t7o(new IOException("Invalid response " + l3oVar.d)));
                        return;
                    }
                    if (a == null) {
                        r7o r7oVar2 = z7o.b;
                        zt3Var.resumeWith(new t7o(new IOException("No data")));
                        return;
                    } else {
                        r7o r7oVar3 = z7o.b;
                        zt3Var.resumeWith(a);
                        return;
                    }
                } catch (Exception e) {
                    r7o r7oVar4 = z7o.b;
                    zt3Var.resumeWith(new t7o(e));
                    return;
                }
            default:
                ((xop) this.b).l(l3oVar);
                return;
        }
    }

    @Override // defpackage.ps3
    public final void d(es3 es3Var, IOException iOException) {
        switch (this.a) {
            case 0:
                es3Var.getClass();
                List list = (List) ((gs4) this.b).d;
                list.getClass();
                gs4 gs4Var = (gs4) this.b;
                synchronized (list) {
                    try {
                        List list2 = (List) gs4Var.d;
                        list2.getClass();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            ((ps3) it.next()).d(es3Var, iOException);
                        }
                        ((List) gs4Var.d).clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                es3Var.getClass();
                zt3 zt3Var = (zt3) this.b;
                if (zt3Var.x()) {
                    return;
                }
                r7o r7oVar = z7o.b;
                zt3Var.resumeWith(new t7o(iOException));
                return;
            default:
                ((xop) this.b).m(iOException);
                return;
        }
    }
}
