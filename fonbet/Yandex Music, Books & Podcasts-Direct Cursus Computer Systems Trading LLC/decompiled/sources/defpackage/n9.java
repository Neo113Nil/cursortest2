package defpackage;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public abstract class n9 {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public n9(k79 k79Var, int i) {
        this.c = k79Var;
        this.a = i;
        this.b = k79Var.a.c();
        this.d = k79Var.a;
    }

    public o9 d() {
        o9 o9Var;
        wor worVar;
        synchronized (this) {
            try {
                o9[] o9VarArr = (o9[]) this.c;
                if (o9VarArr == null) {
                    o9VarArr = f();
                    this.c = o9VarArr;
                } else if (this.a >= o9VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(o9VarArr, o9VarArr.length * 2);
                    this.c = (o9[]) copyOf;
                    o9VarArr = (o9[]) copyOf;
                }
                int i = this.b;
                do {
                    o9Var = o9VarArr[i];
                    if (o9Var == null) {
                        o9Var = e();
                        o9VarArr[i] = o9Var;
                    }
                    i++;
                    if (i >= o9VarArr.length) {
                        i = 0;
                    }
                } while (!o9Var.a(this));
                this.b = i;
                this.a++;
                worVar = (wor) this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (worVar != null) {
            worVar.x(1);
        }
        return o9Var;
    }

    public abstract o9 e();

    public abstract o9[] f();

    public void h(o9 o9Var) {
        wor worVar;
        int i;
        Continuation[] b;
        synchronized (this) {
            try {
                int i2 = this.a - 1;
                this.a = i2;
                worVar = (wor) this.d;
                if (i2 == 0) {
                    this.b = 0;
                }
                o9Var.getClass();
                b = o9Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : b) {
            if (continuation != null) {
                r7o r7oVar = z7o.b;
                continuation.resumeWith(Unit.a);
            }
        }
        if (worVar != null) {
            worVar.x(-1);
        }
    }

    public wor i() {
        wor worVar;
        synchronized (this) {
            worVar = (wor) this.d;
            if (worVar == null) {
                int i = this.a;
                worVar = new wor(1, Integer.MAX_VALUE, oi3.b);
                worVar.a(Integer.valueOf(i));
                this.d = worVar;
            }
        }
        return worVar;
    }

    public boolean j(n9 n9Var) {
        return this.b == n9Var.b && vq1.X((jc8) this.d).equals(vq1.X((jc8) n9Var.d));
    }
}
