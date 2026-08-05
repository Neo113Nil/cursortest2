package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class k0 implements ye {
    public final Context qoPGr6Ce;

    public k0(Context context) {
        this.qoPGr6Ce = context.getApplicationContext();
    }

    @Override // defpackage.ye
    public void qoPGr6Ce(ra raVar) {
        p7 p7Var = new p7("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), p7Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new nb(this, raVar, threadPoolExecutor, 1));
    }

    public /* synthetic */ k0(Context context, boolean z) {
        this.qoPGr6Ce = context;
    }
}
