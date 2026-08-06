package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hu implements fp {
    public ThreadPoolExecutor AvO7iQsrTN;
    public ThreadPoolExecutor EljAMC1QTz;
    public final Context GWasM1elztuh;
    public Handler OOA6hdeuvCS;
    public final vt X1lG3V04pd;
    public final gu Yi7zF1RB1;
    public vc0 encWxUiV2;
    public final Object xqGvceK5x = new Object();

    public hu(Context context, gu guVar) {
        n4.AvO7iQsrTN(context, "Context cannot be null");
        this.GWasM1elztuh = context.getApplicationContext();
        this.Yi7zF1RB1 = guVar;
        this.X1lG3V04pd = iu.xqGvceK5x;
    }

    @Override // defpackage.fp
    public final void GWasM1elztuh(vc0 vc0Var) {
        synchronized (this.xqGvceK5x) {
            this.encWxUiV2 = vc0Var;
        }
        synchronized (this.xqGvceK5x) {
            try {
                if (this.encWxUiV2 == null) {
                    return;
                }
                if (this.EljAMC1QTz == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new nf("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.AvO7iQsrTN = threadPoolExecutor;
                    this.EljAMC1QTz = threadPoolExecutor;
                }
                this.EljAMC1QTz.execute(new uFEq9NpZ(6, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ru X1lG3V04pd() {
        try {
            vt vtVar = this.X1lG3V04pd;
            Context context = this.GWasM1elztuh;
            gu guVar = this.Yi7zF1RB1;
            vtVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{guVar}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            qu GWasM1elztuh = fu.GWasM1elztuh(context, Collections.unmodifiableList(arrayList));
            int i = GWasM1elztuh.GWasM1elztuh;
            if (i != 0) {
                throw new RuntimeException(mr0.encWxUiV2("fetchFonts failed (", i, ")"));
            }
            ru[] ruVarArr = (ru[]) ((List) GWasM1elztuh.Yi7zF1RB1).get(0);
            if (ruVarArr == null || ruVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return ruVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    public final void Yi7zF1RB1() {
        synchronized (this.xqGvceK5x) {
            try {
                this.encWxUiV2 = null;
                Handler handler = this.OOA6hdeuvCS;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.OOA6hdeuvCS = null;
                ThreadPoolExecutor threadPoolExecutor = this.AvO7iQsrTN;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.EljAMC1QTz = null;
                this.AvO7iQsrTN = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
