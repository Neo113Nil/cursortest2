package defpackage;

import android.content.Context;
import android.os.Build;
import com.combinations.level.experts.R;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class v0 implements ny {
    public static boolean EljAMC1QTz = true;
    public final c GWasM1elztuh;
    public final t0 OOA6hdeuvCS;
    public ve1 X1lG3V04pd;
    public final Object Yi7zF1RB1 = new Object();
    public boolean xqGvceK5x;

    public v0(c cVar) {
        this.GWasM1elztuh = cVar;
        t0 t0Var = new t0();
        this.OOA6hdeuvCS = t0Var;
        if (cVar.isAttachedToWindow()) {
            Context context = cVar.getContext();
            if (!this.xqGvceK5x) {
                context.getApplicationContext().registerComponentCallbacks(t0Var);
                this.xqGvceK5x = true;
            }
        }
        cVar.addOnAttachStateChangeListener(new u0(0, this));
    }

    @Override // defpackage.ny
    public final void GWasM1elztuh(oy oyVar) {
        synchronized (this.Yi7zF1RB1) {
            if (!oyVar.mE4lRynR) {
                oyVar.mE4lRynR = true;
                oyVar.Yi7zF1RB1();
            }
        }
    }

    public final eo X1lG3V04pd(c cVar) {
        ve1 ve1Var = this.X1lG3V04pd;
        if (ve1Var != null) {
            return ve1Var;
        }
        ve1 ve1Var2 = new ve1(cVar.getContext());
        ve1Var2.setClipChildren(false);
        ve1Var2.setClipToPadding(false);
        ve1Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        cVar.addView(ve1Var2, -1);
        this.X1lG3V04pd = ve1Var2;
        return ve1Var2;
    }

    @Override // defpackage.ny
    public final oy Yi7zF1RB1() {
        qy xyVar;
        qy qyVar;
        oy oyVar;
        synchronized (this.Yi7zF1RB1) {
            try {
                c cVar = this.GWasM1elztuh;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    cVar.getUniqueDrawingId();
                }
                if (i >= 29) {
                    qyVar = new vy();
                } else {
                    if (EljAMC1QTz) {
                        try {
                            xyVar = new ty(this.GWasM1elztuh, new v9(), new u9());
                        } catch (Throwable unused) {
                            EljAMC1QTz = false;
                            xyVar = new xy(X1lG3V04pd(this.GWasM1elztuh));
                        }
                    } else {
                        xyVar = new xy(X1lG3V04pd(this.GWasM1elztuh));
                    }
                    qyVar = xyVar;
                }
                oyVar = new oy(qyVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return oyVar;
    }
}
