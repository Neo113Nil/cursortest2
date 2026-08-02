package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class td11 {
    public static qnv a(jqd0 jqd0Var, String str) {
        if (jqd0Var instanceof iqd0) {
            pnv pnvVar = qnv.Companion;
            iqd0 iqd0Var = (iqd0) jqd0Var;
            String str2 = iqd0Var.b;
            String str3 = iqd0Var.a;
            pnvVar.getClass();
            return new qnv(str, str2, str3, null);
        }
        if (!(jqd0Var instanceof hqd0)) {
            pnv pnvVar2 = qnv.Companion;
            List singletonList = Collections.singletonList(new id11(null, "Unknown response: " + jqd0Var));
            pnvVar2.getClass();
            return new qnv(str, null, null, singletonList);
        }
        pnv pnvVar3 = qnv.Companion;
        List<gqd0> list = ((hqd0) jqd0Var).a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (gqd0 gqd0Var : list) {
            arrayList.add(new id11(gqd0Var.b, gqd0Var.a.getMessage()));
        }
        pnvVar3.getClass();
        return new qnv(str, null, null, arrayList);
    }

    public static tnv b(jqd0 jqd0Var, String str) {
        if (jqd0Var instanceof iqd0) {
            snv snvVar = tnv.Companion;
            iqd0 iqd0Var = (iqd0) jqd0Var;
            String str2 = iqd0Var.b;
            String str3 = iqd0Var.a;
            snvVar.getClass();
            return new tnv(str, str2, str3, null);
        }
        if (!(jqd0Var instanceof hqd0)) {
            snv snvVar2 = tnv.Companion;
            List singletonList = Collections.singletonList(new id11(null, "Unknown response: " + jqd0Var));
            snvVar2.getClass();
            return new tnv(str, null, null, singletonList);
        }
        snv snvVar3 = tnv.Companion;
        List<gqd0> list = ((hqd0) jqd0Var).a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (gqd0 gqd0Var : list) {
            arrayList.add(new id11(gqd0Var.b, gqd0Var.a.getMessage()));
        }
        snvVar3.getClass();
        return new tnv(str, null, null, arrayList);
    }
}
