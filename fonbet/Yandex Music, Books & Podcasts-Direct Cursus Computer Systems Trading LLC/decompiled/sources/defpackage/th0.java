package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class th0 implements mm6 {
    public final View a;
    public final lcs b;
    public final mm6 c;
    public final AtomicReference d = new AtomicReference(null);

    public th0(View view, lcs lcsVar, mm6 mm6Var) {
        this.a = view;
        this.b = lcsVar;
        this.c = mm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(bxf bxfVar, cg6 cg6Var) {
        sh0 sh0Var;
        int i;
        if (cg6Var instanceof sh0) {
            sh0Var = (sh0) cg6Var;
            int i2 = sh0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sh0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = sh0Var.j;
                nm6 nm6Var = nm6.a;
                i = sh0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    al alVar = new al(5, bxfVar, this);
                    l5 l5Var = new l5(this, (Continuation) null, 19);
                    sh0Var.l = 1;
                    if (gld.Q(new lco(alVar, this.d, l5Var, (Continuation) null), sh0Var) == nm6Var) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
            }
        }
        sh0Var = new sh0(this, cg6Var);
        Object obj2 = sh0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = sh0Var.l;
        if (i != 0) {
        }
        rj7.f();
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        return this.c.getCoroutineContext();
    }
}
