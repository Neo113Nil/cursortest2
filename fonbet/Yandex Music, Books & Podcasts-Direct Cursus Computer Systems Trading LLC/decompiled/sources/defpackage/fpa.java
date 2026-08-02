package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class fpa {
    public int a;
    public long b;
    public Object c;
    public Object d;
    public final Object e;

    public fpa(m8s m8sVar, int i) {
        m8sVar.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = i;
        this.b = 300000000000L;
        this.c = m8sVar.e();
        this.d = new h78(this, su4.o(new StringBuilder(), cvt.g, " ConnectionPool"), 2);
        this.e = new ConcurrentLinkedQueue();
    }

    public boolean a(mn mnVar, mkn mknVar, ArrayList arrayList, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.e).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            okn oknVar = (okn) it.next();
            oknVar.getClass();
            synchronized (oknVar) {
                if (z) {
                    try {
                        if (!(oknVar.g != null)) {
                            continue;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (oknVar.h(mnVar, arrayList)) {
                    mknVar.c(oknVar);
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, uif] */
    public s8 b(y7o y7oVar) {
        y7o y7oVar2 = (y7o) ((uif) this.d).invoke(y7oVar);
        if (y7oVar2.b()) {
            r7w r7wVar = y7oVar2.b;
            up6.D(r7wVar);
            return nif.c(r7wVar);
        }
        if (((ggm) y7oVar2.a()) == ggm.done) {
            return ivf.M(y7oVar);
        }
        int i = this.a + 1;
        this.a = i;
        xdh xdhVar = (xdh) this.e;
        Integer num = (Integer) xdhVar.a;
        if (num != null && i > num.intValue()) {
            return nif.c(new yfm("Maximum retries count reached", null));
        }
        int i2 = q7w.b;
        long z = up6.z(Long.valueOf(System.currentTimeMillis())) - this.b;
        Long l = (Long) xdhVar.c;
        if (l != null && z > l.longValue()) {
            return nif.c(new yfm("Timeout reached", null));
        }
        long b = ((bgm) xdhVar.b).b(this.a);
        Unit unit = Unit.a;
        f4s f4sVar = nif.c;
        f4sVar.getClass();
        f4s f4sVar2 = nif.a;
        f4sVar2.getClass();
        ju7 ju7Var = new ju7(f4sVar2);
        new yop(f4sVar, new wk0(5, new ey1(b, ju7Var)));
        xk0 xk0Var = new xk0(2, unit);
        yop yopVar = ju7Var.a;
        yopVar.getClass();
        return mif.a(mif.b(yopVar, xk0Var, null, 5), new agm(this, 2), null, 5);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.functions.Function0, uif] */
    public s8 c() {
        n20 n20Var = (n20) ((xdh) this.e).d;
        if (n20Var != null ? n20Var.a : false) {
            return nif.c(new yfm("Polling cancelled", null));
        }
        mif mifVar = (mif) ((uif) this.c).invoke();
        agm agmVar = new agm(this, 0);
        agm agmVar2 = new agm(this, 1);
        mifVar.getClass();
        return mif.a(mifVar, agmVar, agmVar2, 1);
    }

    public int d(okn oknVar, long j) {
        byte[] bArr = cvt.a;
        ArrayList arrayList = oknVar.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + oknVar.b.a.h + " was leaked. Did you forget to close a response body?";
                otk otkVar = otk.a;
                otk.a.k(((kkn) reference).a, str);
                arrayList.remove(i);
                oknVar.j = true;
                if (arrayList.isEmpty()) {
                    oknVar.q = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public fpa() {
        xof xofVar = xof.a;
        this.b = 0L;
        this.a = 0;
        this.e = new ou3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fpa(Function0 function0, Function1 function1, xdh xdhVar) {
        this.c = (uif) function0;
        this.d = (uif) function1;
        this.e = xdhVar;
        int i = q7w.b;
        this.b = up6.z(Long.valueOf(System.currentTimeMillis()));
    }
}
