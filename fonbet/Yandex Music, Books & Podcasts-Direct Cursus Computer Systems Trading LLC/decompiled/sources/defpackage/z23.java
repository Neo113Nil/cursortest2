package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class z23 implements z2o {
    public final Resources a;

    public z23(Resources resources, int i) {
        switch (i) {
            case 2:
                resources.getClass();
                this.a = resources;
                break;
            default:
                this.a = resources;
                break;
        }
    }

    @Override // defpackage.z2o
    public k2o w(k2o k2oVar, pwj pwjVar) {
        if (k2oVar == null) {
            return null;
        }
        return new s33(this.a, k2oVar);
    }

    public z23(Context context) {
        context.getClass();
        this.a = context.getResources();
    }
}
