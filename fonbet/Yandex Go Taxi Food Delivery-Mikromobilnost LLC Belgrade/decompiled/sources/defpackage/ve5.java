package defpackage;

import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes10.dex */
public abstract class ve5 {
    public static final a7u0 a = new a7u0(new tt4(18));
    public static Boolean b;

    public static final void a(kk2 kk2Var, ety0 ety0Var, dyr dyrVar, List list, fid fidVar) {
        bts btsVar = (bts) fidVar;
        Executor executor = (Executor) btsVar.m(a);
        if (executor == null || !b(kk2Var.b.length())) {
            btsVar.e0(-517090505);
            btsVar.t(false);
        } else {
            btsVar.e0(-518737659);
            try {
                executor.execute(new ue5(ety0Var, (LayoutDirection) btsVar.m(j.n), list, kk2Var, (fwi) btsVar.m(j.h), dyrVar, 0));
            } catch (RejectedExecutionException unused) {
            }
            btsVar.t(false);
        }
    }

    public static final boolean b(int i) {
        if (i >= 8 && i < 1000) {
            if (b == null) {
                b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            if (b.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
