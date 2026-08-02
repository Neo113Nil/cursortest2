package androidx.work;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.ocg;
import defpackage.qm6;
import defpackage.rm6;
import defpackage.saf;
import defpackage.ucg;
import defpackage.ys3;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lucg;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "qm6", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ucg {
    public final WorkerParameters e;
    public final qm6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = qm6.d;
    }

    @Override // defpackage.ucg
    public final ys3 a() {
        return ocg.x(getJ().plus(saf.p()), new rm6(this, null, 0));
    }

    @Override // defpackage.ucg
    public final ys3 b() {
        CoroutineContext j = !Intrinsics.d(getJ(), qm6.d) ? getJ() : this.e.e;
        j.getClass();
        return ocg.x(j.plus(saf.p()), new rm6(this, null, 1));
    }

    public abstract Object c(Continuation continuation);

    /* renamed from: d */
    public a getJ() {
        return this.f;
    }
}
