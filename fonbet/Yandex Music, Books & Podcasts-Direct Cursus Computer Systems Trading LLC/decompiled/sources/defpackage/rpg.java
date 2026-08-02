package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class rpg {
    public static final qs5 a = new qs5(new opg(2));

    public static kfu a(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        kfu kfuVar = (kfu) oq5Var.j(a);
        if (kfuVar == null) {
            oq5Var.Z(1260197609);
            kfuVar = zwf.D((View) oq5Var.j(AndroidCompositionLocals_androidKt.f));
        } else {
            oq5Var.Z(1260196493);
        }
        oq5Var.p(false);
        return kfuVar;
    }
}
