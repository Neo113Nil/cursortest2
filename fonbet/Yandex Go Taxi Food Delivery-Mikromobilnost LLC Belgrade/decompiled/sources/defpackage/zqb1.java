package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class zqb1 implements qqb1 {
    public final ArrayList a;

    public zqb1(Context context, wqb1 wqb1Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (wqb1Var.c()) {
            arrayList.add(new dsb1(context, wqb1Var));
        }
    }

    @Override // defpackage.qqb1
    public final void a(o3 o3Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qqb1) it.next()).a(o3Var);
        }
    }
}
