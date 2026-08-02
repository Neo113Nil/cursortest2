package defpackage;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;

/* loaded from: classes10.dex */
public class wwf0 extends vwf0 {
    public ProxyControllerBoundaryInterface a;

    @Override // defpackage.vwf0
    public final void a(Runnable runnable, Executor executor) {
        if (!qp41.E.a()) {
            throw qp41.a();
        }
        if (this.a == null) {
            this.a = nq41.a.getProxyController();
        }
        this.a.clearProxyOverride(runnable, executor);
    }

    @Override // defpackage.vwf0
    public final void b(twf0 twf0Var, Executor executor, Runnable runnable) {
        un2 un2Var = qp41.E;
        un2 un2Var2 = qp41.K;
        List unmodifiableList = Collections.unmodifiableList(twf0Var.a);
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, unmodifiableList.size(), 2);
        for (int i = 0; i < unmodifiableList.size(); i++) {
            strArr[i][0] = ((swf0) unmodifiableList.get(i)).a;
            strArr[i][1] = ((swf0) unmodifiableList.get(i)).b;
        }
        String[] strArr2 = (String[]) Collections.unmodifiableList(twf0Var.b).toArray(new String[0]);
        if (un2Var.a() && !twf0Var.c) {
            if (this.a == null) {
                this.a = nq41.a.getProxyController();
            }
            this.a.setProxyOverride(strArr, strArr2, runnable, executor);
        } else {
            if (!un2Var.a() || !un2Var2.a()) {
                throw qp41.a();
            }
            if (this.a == null) {
                this.a = nq41.a.getProxyController();
            }
            this.a.setProxyOverride(strArr, strArr2, runnable, executor, twf0Var.c);
        }
    }
}
