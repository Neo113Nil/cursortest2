package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cb6 extends nt0 {
    public final String u;
    public final ArrayList v = new ArrayList();

    public cb6(String str) {
        this.u = str;
    }

    public final k79 Y(gc8 gc8Var) {
        rv8 divData = gc8Var.getDivData();
        if (divData == null) {
            return null;
        }
        X(divData, gc8Var.getBindingContext$div_release());
        ArrayList arrayList = this.v;
        boolean isEmpty = arrayList.isEmpty();
        String str = this.u;
        if (isEmpty) {
            gc8Var.I(new RuntimeException(hrg.q("Error resolving container. Elements that respond to id '", str, "' are not found.")));
            return null;
        }
        if (arrayList.size() <= 1) {
            return (k79) CollectionsKt.Q(arrayList);
        }
        gc8Var.I(new RuntimeException(hrg.q("Error resolving container. Found multiple elements that respond to id '", str, "'.")));
        return null;
    }

    @Override // defpackage.nt0
    public final Unit x(jc8 jc8Var, e23 e23Var, pm9 pm9Var) {
        if (Intrinsics.d(jc8Var.d().getId(), this.u)) {
            this.v.add(new k79(jc8Var, e23Var.b));
        }
        return Unit.a;
    }
}
