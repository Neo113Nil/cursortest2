package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class xek {
    public final ugk a;
    public final g86 b;
    public final x3i c;
    public final Context d;

    public xek(Context context, ugk ugkVar, g86 g86Var, x3i x3iVar) {
        context.getClass();
        this.a = ugkVar;
        this.b = g86Var;
        this.c = x3iVar;
        this.d = context.getApplicationContext();
        if (x3iVar != x3i.a) {
            c4i[] c4iVarArr = c4i.a;
            new pxf(ugkVar);
            boolean z = ugkVar.a;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            z3i.c = new z3i(applicationContext, z, g86Var.a(ugkVar));
            LinkedHashMap linkedHashMap = sqg.a;
            w1g.B(sqg.a, "default", f7w.a);
        }
    }
}
