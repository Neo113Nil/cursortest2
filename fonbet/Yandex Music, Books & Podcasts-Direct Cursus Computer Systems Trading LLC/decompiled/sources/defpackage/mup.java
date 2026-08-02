package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class mup implements tc6 {
    public final String a;
    public final List b;
    public final boolean c;

    public mup(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.tc6
    public final lb6 a(czg czgVar, ayg aygVar, ds2 ds2Var) {
        return new bc6(czgVar, ds2Var, this, aygVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
