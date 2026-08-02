package androidx.work;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dxv;
import defpackage.nxv;
import defpackage.scg;
import defpackage.suh;
import defpackage.ucg;
import defpackage.wct;
import defpackage.ys3;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "Lucg;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public abstract class Worker extends ucg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.ucg
    public final ys3 a() {
        ExecutorService executorService = this.b.d;
        executorService.getClass();
        return wct.z(new suh(27, executorService, new nxv(10, this)));
    }

    @Override // defpackage.ucg
    public final ys3 b() {
        ExecutorService executorService = this.b.d;
        executorService.getClass();
        return wct.z(new suh(27, executorService, new dxv(10, this)));
    }

    public abstract scg c();
}
