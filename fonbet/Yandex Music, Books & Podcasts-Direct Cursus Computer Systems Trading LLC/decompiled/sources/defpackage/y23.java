package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y23 implements o2o {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public y23(Resources resources, o2o o2oVar) {
        this.a = 0;
        this.c = resources;
        this.b = o2oVar;
    }

    @Override // defpackage.o2o
    public final boolean a(Object obj, pwj pwjVar) {
        switch (this.a) {
            case 0:
                return ((o2o) this.b).a(obj, pwjVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    @Override // defpackage.o2o
    public final k2o b(Object obj, int i, int i2, pwj pwjVar) {
        boolean z;
        non nonVar;
        bob bobVar;
        switch (this.a) {
            case 0:
                k2o b = ((o2o) this.b).b(obj, i, i2, pwjVar);
                Resources resources = (Resources) this.c;
                if (b == null) {
                    return null;
                }
                return new s33(resources, b);
            case 1:
                k2o c = ((q2o) this.b).c((Uri) obj, pwjVar);
                if (c == null) {
                    return null;
                }
                return vwb.L((r33) this.c, (Drawable) ((qcd) c).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof non) {
                    nonVar = (non) inputStream;
                    z = false;
                } else {
                    z = true;
                    nonVar = new non(inputStream, (z98) this.c);
                }
                ArrayDeque arrayDeque = bob.c;
                synchronized (arrayDeque) {
                    bobVar = (bob) arrayDeque.poll();
                }
                if (bobVar == null) {
                    bobVar = new bob();
                }
                bob bobVar2 = bobVar;
                bobVar2.a = nonVar;
                b8 b8Var = new b8(bobVar2);
                iwe iweVar = new iwe(29, nonVar, bobVar2);
                try {
                    zla zlaVar = (zla) this.b;
                    ArrayList arrayList = zlaVar.d;
                    z98 z98Var = zlaVar.c;
                    es6 es6Var = new es6();
                    w1g.s(z98Var, "Argument must not be null");
                    es6Var.b = z98Var;
                    w1g.s(arrayList, "Argument must not be null");
                    es6Var.c = arrayList;
                    es6Var.a = new g8c(b8Var, z98Var);
                    s33 a = zlaVar.a(es6Var, i, i2, pwjVar, iweVar);
                    bobVar2.b = null;
                    bobVar2.a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(bobVar2);
                    }
                    if (z) {
                        nonVar.b();
                    }
                    return a;
                } catch (Throwable th) {
                    bobVar2.b = null;
                    bobVar2.a = null;
                    ArrayDeque arrayDeque2 = bob.c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(bobVar2);
                        if (!z) {
                            throw th;
                        }
                        nonVar.b();
                        throw th;
                    }
                }
        }
    }

    public /* synthetic */ y23(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
