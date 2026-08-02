package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.a;
import kotlin.collections.b;
import yads.g21;

/* loaded from: classes7.dex */
public final class vb71 {
    public final Context a;
    public final Handler b;
    public final i3y c;

    public vb71(Context context) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = context;
        this.b = handler;
        this.c = a.a(new g21(this));
    }

    public final void a(Set set, wb71 wb71Var) {
        if (set.isEmpty()) {
            wb71Var.a(b.f());
            return;
        }
        uio0 uio0Var = new uio0(((mf71) this.c.getValue()).a, set, wb71Var, this.b);
        HashMap hashMap = new HashMap();
        for (cu81 cu81Var : (Set) uio0Var.a) {
            String str = cu81Var.c;
            int i = cu81Var.b;
            int i2 = cu81Var.a;
            ((fg81) uio0Var.f).getClass();
            Runtime runtime = Runtime.getRuntime();
            if (Runtime.getRuntime().maxMemory() - (runtime.totalMemory() - runtime.freeMemory()) >= (i * i2 * 4) + 1048576.0f) {
                ((Handler) uio0Var.d).post(new e1a0(uio0Var, str, i2, i, hashMap, cu81Var));
            } else if (((AtomicInteger) uio0Var.e).decrementAndGet() == 0) {
                ((wb71) uio0Var.b).a(hashMap);
            }
        }
    }
}
