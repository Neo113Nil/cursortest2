package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.impl.utils.executor.b;

/* loaded from: classes10.dex */
public final class tf61 {
    public final ep7 a;
    public final b b;
    public final uf61 c;
    public boolean d = false;
    public boolean e = false;
    public final boolean f;
    public final boolean g;
    public mdl0 h;
    public iiv i;
    public sf61 j;

    public tf61(ep7 ep7Var, b bVar) {
        boolean z;
        this.f = false;
        this.g = false;
        this.a = ep7Var;
        this.b = bVar;
        int[] iArr = (int[]) ep7Var.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 4) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.f = z;
        this.g = xbj.a.b(ZslDisablerQuirk.class) != null;
        this.c = new uf61(3, new dy31(13));
    }

    public final void a() {
        mdl0 mdl0Var = this.h;
        if (mdl0Var != null) {
            mdl0Var.x();
            this.h = null;
        }
        sf61 sf61Var = this.j;
        if (sf61Var != null) {
            sf61Var.b.set(false);
            this.j = null;
        }
        while (true) {
            uf61 uf61Var = this.c;
            if (uf61Var.f()) {
                break;
            } else {
                ((jdv) uf61Var.b()).close();
            }
        }
        iiv iivVar = this.i;
        if (iivVar != null) {
            iivVar.a();
            this.i = null;
        }
    }
}
