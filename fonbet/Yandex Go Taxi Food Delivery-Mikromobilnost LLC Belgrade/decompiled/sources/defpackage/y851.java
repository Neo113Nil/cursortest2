package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.impl.constraints.b;
import androidx.work.impl.constraints.d;
import java.util.List;

/* loaded from: classes.dex */
public final class y851 {
    public final List a;

    public y851(v201 v201Var) {
        uf5 uf5Var = new uf5(v201Var.b, 0);
        uf5 uf5Var2 = new uf5(v201Var.c, 1);
        uf5 uf5Var3 = new uf5(v201Var.e, 4);
        e8e e8eVar = v201Var.d;
        uf5 uf5Var4 = new uf5(e8eVar, 2);
        uf5 uf5Var5 = new uf5(e8eVar, 3);
        qx50 qx50Var = new qx50(e8eVar);
        zw50 zw50Var = new zw50(e8eVar);
        Context context = v201Var.a;
        int i = d.a;
        this.a = j73.A(new d7e[]{uf5Var, uf5Var2, uf5Var3, uf5Var4, uf5Var5, qx50Var, zw50Var, new b((ConnectivityManager) context.getSystemService("connectivity"))});
    }
}
