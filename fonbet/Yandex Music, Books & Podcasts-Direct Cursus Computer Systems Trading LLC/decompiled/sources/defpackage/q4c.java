package defpackage;

import android.util.Log;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q4c extends v5g {
    public final Object a;
    public final String b;
    public final int c;
    public final my1 d;

    public q4c(Object obj, String str, ofc ofcVar, int i) {
        obj.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = obj;
        this.b = str;
        this.c = i;
        my1 my1Var = new my1(str + " value: " + obj);
        StackTraceElement[] stackTrace = my1Var.getStackTrace();
        stackTrace.getClass();
        my1Var.setStackTrace((StackTraceElement[]) xz0.v(2, stackTrace).toArray(new StackTraceElement[0]));
        this.d = my1Var;
    }

    @Override // defpackage.v5g
    public final Object w() {
        int D = ouj.D(this.c);
        if (D == 0) {
            throw this.d;
        }
        if (D != 1) {
            if (D == 2) {
                return null;
            }
            b6e.s();
            return null;
        }
        Object obj = this.a;
        obj.getClass();
        Log.d("kfq", this.b + " value: " + obj);
        return null;
    }

    @Override // defpackage.v5g
    public final v5g L(String str, Function1 function1) {
        return this;
    }
}
