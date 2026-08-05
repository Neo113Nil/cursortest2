package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class jp extends m10 {
    public final e1 NCTxEWno;

    public jp(ra raVar) {
        ExecutorService executorService;
        ip ipVar = new ip(this);
        tg0 tg0Var = new tg0(4, this);
        synchronized (le0.qoPGr6Ce) {
            try {
                executorService = le0.NCTxEWno;
                if (executorService == null) {
                    executorService = Executors.newFixedThreadPool(2);
                    le0.NCTxEWno = executorService;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e1 e1Var = new e1(tg0Var, new mcXgUFR8(executorService, raVar, 7, false));
        this.NCTxEWno = e1Var;
        e1Var.wxUZMvaN.add(ipVar);
    }

    public final void VgvYg0wo(List list) {
        e1 e1Var = this.NCTxEWno;
        tg0 tg0Var = e1Var.qoPGr6Ce;
        int i = e1Var.b2ZJblxo + 1;
        e1Var.b2ZJblxo = i;
        List list2 = e1Var.VgvYg0wo;
        if (list == list2) {
            return;
        }
        if (list == null) {
            int size = list2.size();
            e1Var.VgvYg0wo = null;
            e1Var.P7K7Inc8 = Collections.EMPTY_LIST;
            tg0Var.SgZGMMPL(0, size);
            e1Var.qoPGr6Ce();
            return;
        }
        if (list2 != null) {
            ((Executor) e1Var.NCTxEWno.MdtA4re8).execute(new c1(e1Var, list2, list, i));
            return;
        }
        e1Var.VgvYg0wo = list;
        e1Var.P7K7Inc8 = Collections.unmodifiableList(list);
        tg0Var.Mq3SeTnW(0, list.size());
        e1Var.qoPGr6Ce();
    }

    @Override // defpackage.m10
    public final int qoPGr6Ce() {
        return this.NCTxEWno.P7K7Inc8.size();
    }

    public final Object wxUZMvaN(int i) {
        return this.NCTxEWno.P7K7Inc8.get(i);
    }
}
