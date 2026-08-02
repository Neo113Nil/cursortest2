package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class w6b1 implements i8b1 {
    public final ArrayList a;

    public w6b1(Context context, q6b1 q6b1Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (q6b1Var.c()) {
            arrayList.add(new k9b1(context, q6b1Var));
        }
    }

    @Override // defpackage.i8b1
    public final void a(o3 o3Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((i8b1) it.next()).a(o3Var);
        }
    }
}
