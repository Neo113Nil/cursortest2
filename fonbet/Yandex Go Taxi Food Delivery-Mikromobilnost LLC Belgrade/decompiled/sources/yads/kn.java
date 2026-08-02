package yads;

import android.content.Context;
import defpackage.cs71;
import defpackage.mb71;
import defpackage.nl61;
import defpackage.nw71;
import defpackage.sls;
import defpackage.zn71;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class kn extends Lambda implements sls {
    public final /* synthetic */ zn71 b;
    public final /* synthetic */ nw71 c;
    public final /* synthetic */ nl61 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(zn71 zn71Var, nw71 nw71Var, nl61 nl61Var) {
        super(0);
        this.b = zn71Var;
        this.c = nw71Var;
        this.d = nl61Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zn71 zn71Var = this.b;
        zn71Var.getClass();
        if (!cs71.b(zn71Var)) {
            Context context = zn71Var.a;
            mb71[] mb71VarArr = {zn71Var.U, zn71Var.T};
            for (int i = 0; i < 2; i++) {
                mb71 mb71Var = mb71VarArr[i];
                if (mb71Var != null) {
                    mb71Var.a(context);
                }
            }
            zn71Var.g();
            zn71Var.getClass().toString();
        }
        this.c.c.a(this.d, null);
        return zy11.a;
    }
}
