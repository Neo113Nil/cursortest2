package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class mif {
    public static final efo b = new efo(28);
    public final ig3 a;

    public mif(ig3 ig3Var) {
        ig3Var.getClass();
        this.a = ig3Var;
    }

    public static yop a(mif mifVar, Function1 function1, Function1 function12, int i) {
        ig3 ig3Var = mifVar.a;
        ig3Var.getClass();
        if (ig3Var instanceof e4s) {
            ig3Var = nif.a;
        }
        if ((i & 4) != 0) {
            function12 = null;
        }
        s8 s8Var = (s8) mifVar;
        s8Var.getClass();
        ig3Var.getClass();
        s8Var.e = true;
        ju7 ju7Var = new ju7(ig3Var);
        s8Var.d.a(new r8(s8Var, function1, ju7Var, function12), ig3Var);
        ArrayList arrayList = s8Var.c;
        yop yopVar = ju7Var.a;
        yopVar.getClass();
        arrayList.add(yopVar);
        return yopVar;
    }

    public static yop b(mif mifVar, Function1 function1, Function1 function12, int i) {
        ig3 ig3Var = mifVar.a;
        ig3Var.getClass();
        if (ig3Var instanceof e4s) {
            ig3Var = nif.a;
        }
        if ((i & 4) != 0) {
            function12 = null;
        }
        s8 s8Var = (s8) mifVar;
        s8Var.getClass();
        ig3Var.getClass();
        function1.getClass();
        s8Var.e = true;
        ju7 ju7Var = new ju7(ig3Var);
        s8Var.d.a(new r8(s8Var, ju7Var, function1, function12), ig3Var);
        ArrayList arrayList = s8Var.c;
        yop yopVar = ju7Var.a;
        yopVar.getClass();
        arrayList.add(yopVar);
        return yopVar;
    }

    public final yop c(Function0 function0) {
        return a(this, new kif(0, function0), new kif(1, function0), 1);
    }
}
