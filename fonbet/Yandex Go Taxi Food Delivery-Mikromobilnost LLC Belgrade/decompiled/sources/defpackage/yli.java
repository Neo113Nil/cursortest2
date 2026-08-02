package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class yli {
    public final bzi0 a;
    public final czi0 b;
    public final wiq0 c;

    public yli(bzi0 bzi0Var, czi0 czi0Var, wiq0 wiq0Var) {
        this.a = bzi0Var;
        this.b = czi0Var;
        this.c = wiq0Var;
    }

    public final boolean a(pex0 pex0Var) {
        fmi fmiVar;
        String str = pex0Var.b;
        bzi0 bzi0Var = this.a;
        if (!bzi0Var.b().b || !a.G(bzi0Var.b().c, str)) {
            return false;
        }
        ati atiVar = pex0Var.Z;
        ArrayList arrayList = (atiVar == null || (fmiVar = atiVar.i) == null) ? null : fmiVar.b;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
