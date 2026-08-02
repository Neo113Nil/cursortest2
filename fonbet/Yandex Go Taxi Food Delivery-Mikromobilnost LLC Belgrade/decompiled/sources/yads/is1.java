package yads;

import android.content.Context;
import defpackage.gb71;
import defpackage.sls;
import defpackage.tr81;
import defpackage.u771;
import defpackage.xga1;
import defpackage.xh61;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class is1 extends Lambda implements sls {
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is1(Context context) {
        super(0);
        this.b = context;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        u771 u771Var;
        Context context = this.b;
        u771 u771Var2 = gb71.b;
        if (u771Var2 != null) {
            return u771Var2;
        }
        synchronized (gb71.a) {
            try {
                u771Var = gb71.b;
                if (u771Var == null) {
                    String str = xga1.c(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
                    xh61 xh61Var = new xh61(context);
                    try {
                        tr81 tr81Var = (tr81) xh61Var.a.getValue(xh61Var, xh61.b[0]);
                        if (tr81Var != null) {
                            tr81Var.c(str);
                        }
                    } catch (Throwable unused) {
                    }
                    u771Var = new u771(context, xh61Var);
                    gb71.b = u771Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u771Var;
    }
}
