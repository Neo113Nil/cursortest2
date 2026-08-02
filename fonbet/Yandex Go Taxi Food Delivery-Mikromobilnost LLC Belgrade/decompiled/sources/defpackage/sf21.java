package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes2.dex */
public final class sf21 implements r3l0 {
    public final sls a;
    public final mum b;
    public final xf21 c;
    public final Context d;

    public sf21(sls slsVar, mum mumVar, xf21 xf21Var, Context context) {
        this.a = slsVar;
        this.b = mumVar;
        this.c = xf21Var;
        this.d = context;
    }

    @Override // defpackage.r3l0
    public final o3l0 get() {
        mum mumVar = this.b;
        if (mumVar == null) {
            return if21.a;
        }
        FragmentManager fragmentManager = (FragmentManager) mumVar.a;
        tbl tblVar = new tbl(3, this);
        return new gjh(fragmentManager, 0, new rf21(), new oyl(tblVar), new xe21(tblVar, this.c, this.d), null, null);
    }
}
