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

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class uh implements ye {
    public final Object MdtA4re8 = new Object();
    public final th NCTxEWno;
    public ThreadPoolExecutor P7K7Inc8;
    public ThreadPoolExecutor VgvYg0wo;
    public ra b2ZJblxo;
    public final Context qoPGr6Ce;
    public Handler wxUZMvaN;

    public uh(Context context, th thVar) {
        fn.MdtA4re8(context, "Context cannot be null");
        this.qoPGr6Ce = context.getApplicationContext();
        this.NCTxEWno = thVar;
    }

    public final ei MdtA4re8() {
        try {
            Context context = this.qoPGr6Ce;
            Object[] objArr = {this.NCTxEWno};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            DPHdAVYO qoPGr6Ce = sh.qoPGr6Ce(context, Collections.unmodifiableList(arrayList));
            int i = qoPGr6Ce.qoPGr6Ce;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            ei[] eiVarArr = (ei[]) ((List) qoPGr6Ce.NCTxEWno).get(0);
            if (eiVarArr == null || eiVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return eiVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    public final void NCTxEWno() {
        synchronized (this.MdtA4re8) {
            try {
                this.b2ZJblxo = null;
                Handler handler = this.wxUZMvaN;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.wxUZMvaN = null;
                ThreadPoolExecutor threadPoolExecutor = this.P7K7Inc8;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.VgvYg0wo = null;
                this.P7K7Inc8 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ye
    public final void qoPGr6Ce(ra raVar) {
        synchronized (this.MdtA4re8) {
            this.b2ZJblxo = raVar;
        }
        synchronized (this.MdtA4re8) {
            try {
                if (this.b2ZJblxo == null) {
                    return;
                }
                ThreadPoolExecutor threadPoolExecutor = this.VgvYg0wo;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new p7("emojiCompat"));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    this.P7K7Inc8 = threadPoolExecutor2;
                    this.VgvYg0wo = threadPoolExecutor2;
                    threadPoolExecutor = threadPoolExecutor2;
                }
                threadPoolExecutor.execute(new d3vfVszL(6, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
