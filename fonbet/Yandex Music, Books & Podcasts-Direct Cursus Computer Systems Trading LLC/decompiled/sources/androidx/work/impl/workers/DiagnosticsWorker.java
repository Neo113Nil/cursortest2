package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.fn1;
import defpackage.g4w;
import defpackage.jsg;
import defpackage.jwv;
import defpackage.jzr;
import defpackage.l4w;
import defpackage.s18;
import defpackage.scg;
import defpackage.tcg;
import defpackage.ueo;
import defpackage.up6;
import defpackage.x4w;
import defpackage.z4w;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final scg c() {
        g4w d = g4w.d(this.a);
        d.getClass();
        WorkDatabase workDatabase = d.c;
        workDatabase.getClass();
        x4w A = workDatabase.A();
        l4w y = workDatabase.y();
        z4w B = workDatabase.B();
        jzr x = workDatabase.x();
        d.b.d.getClass();
        List list = (List) up6.F(A.a, true, false, new fn1(System.currentTimeMillis() - 86400000, 17));
        ueo ueoVar = A.a;
        List list2 = (List) up6.F(ueoVar, true, false, new jwv(22));
        List list3 = (List) up6.F(ueoVar, true, false, new jwv(26));
        if (!list.isEmpty()) {
            jsg j = jsg.j();
            String str = s18.a;
            j.k(str, "Recently completed work:\n\n");
            jsg.j().k(str, s18.a(y, B, x, list));
        }
        if (!list2.isEmpty()) {
            jsg j2 = jsg.j();
            String str2 = s18.a;
            j2.k(str2, "Running work:\n\n");
            jsg.j().k(str2, s18.a(y, B, x, list2));
        }
        if (!list3.isEmpty()) {
            jsg j3 = jsg.j();
            String str3 = s18.a;
            j3.k(str3, "Enqueued work:\n\n");
            jsg.j().k(str3, s18.a(y, B, x, list3));
        }
        return tcg.a();
    }
}
