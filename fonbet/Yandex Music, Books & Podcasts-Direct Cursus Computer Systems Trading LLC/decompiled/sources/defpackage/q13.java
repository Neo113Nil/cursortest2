package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q13 implements xjn {
    public Object a;
    public Function1 b;

    public q13(Function1 function1) {
        this.b = function1;
        this.a = mvt.l;
    }

    public Object a(s9f s9fVar) {
        s9fVar.getClass();
        if (this.a == mvt.l) {
            Function1 function1 = this.b;
            function1.getClass();
            this.a = function1.invoke(s9fVar);
            this.b = null;
        }
        return this.a;
    }

    @Override // defpackage.sjn
    public Object getValue(Object obj, s9f s9fVar) {
        return this.a;
    }

    @Override // defpackage.xjn
    public void setValue(Object obj, s9f s9fVar, Object obj2) {
        Object invoke;
        View view = (View) obj;
        Function1 function1 = this.b;
        if (function1 != null && (invoke = function1.invoke(obj2)) != null) {
            obj2 = invoke;
        }
        if (Intrinsics.d(this.a, obj2)) {
            return;
        }
        this.a = obj2;
        view.requestLayout();
    }

    public q13(Object obj, rq1 rq1Var) {
        this.a = obj;
        this.b = rq1Var;
    }
}
