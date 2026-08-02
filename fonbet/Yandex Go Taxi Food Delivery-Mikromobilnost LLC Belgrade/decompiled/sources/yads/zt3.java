package yads;

import android.os.AsyncTask;
import defpackage.y771;
import defpackage.yv81;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes7.dex */
public abstract class zt3 extends AsyncTask {
    public y771 a;
    public final yv81 b;

    public zt3(yv81 yv81Var) {
        this.b = yv81Var;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        y771 y771Var = this.a;
        if (y771Var != null) {
            y771Var.c = null;
            zt3 zt3Var = (zt3) y771Var.b.poll();
            y771Var.c = zt3Var;
            if (zt3Var != null) {
                zt3Var.a(y771Var.a);
            }
        }
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
