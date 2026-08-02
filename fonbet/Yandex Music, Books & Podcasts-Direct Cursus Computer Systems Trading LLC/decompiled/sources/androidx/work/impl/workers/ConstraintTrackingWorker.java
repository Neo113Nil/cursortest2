package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.a5w;
import defpackage.cg6;
import defpackage.g4w;
import defpackage.gld;
import defpackage.ja4;
import defpackage.jsg;
import defpackage.jwv;
import defpackage.kpm;
import defpackage.l2t;
import defpackage.lno;
import defpackage.nm6;
import defpackage.q86;
import defpackage.qcg;
import defpackage.qgg;
import defpackage.r3w;
import defpackage.rcg;
import defpackage.t4w;
import defpackage.t96;
import defpackage.tcg;
import defpackage.u2x;
import defpackage.u96;
import defpackage.ucg;
import defpackage.v3;
import defpackage.v96;
import defpackage.x4w;
import defpackage.x97;
import defpackage.xg;
import defpackage.xq0;
import defpackage.y96;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "t96", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(ConstraintTrackingWorker constraintTrackingWorker, ucg ucgVar, kpm kpmVar, t4w t4wVar, cg6 cg6Var) {
        u96 u96Var;
        int i;
        if (cg6Var instanceof u96) {
            u96Var = (u96) cg6Var;
            int i2 = u96Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u96Var.l = i2 - Integer.MIN_VALUE;
                Object obj = u96Var.j;
                nm6 nm6Var = nm6.a;
                i = u96Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    xg xgVar = new xg(ucgVar, kpmVar, t4wVar, (Continuation) null);
                    u96Var.l = 1;
                    obj = gld.Q(xgVar, u96Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                obj.getClass();
                return obj;
            }
        }
        u96Var = new u96(constraintTrackingWorker, cg6Var);
        Object obj2 = u96Var.j;
        nm6 nm6Var2 = nm6.a;
        i = u96Var.l;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(ConstraintTrackingWorker constraintTrackingWorker, cg6 cg6Var) {
        v96 v96Var;
        int i;
        AtomicInteger atomicInteger;
        ucg b;
        int i2;
        AtomicInteger atomicInteger2 = constraintTrackingWorker.c;
        WorkerParameters workerParameters = constraintTrackingWorker.g;
        Context context = constraintTrackingWorker.a;
        WorkerParameters workerParameters2 = constraintTrackingWorker.b;
        try {
            if (cg6Var instanceof v96) {
                v96Var = (v96) cg6Var;
                int i3 = v96Var.m;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    v96Var.m = i3 - Integer.MIN_VALUE;
                    v96 v96Var2 = v96Var;
                    Object obj = v96Var2.k;
                    nm6 nm6Var = nm6.a;
                    i = v96Var2.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        String b2 = workerParameters2.b.b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                        if (b2 == null || b2.length() == 0) {
                            jsg.j().g(y96.a, "No worker to delegate to.");
                            return new qcg();
                        }
                        g4w d = g4w.d(context);
                        d.getClass();
                        x4w A = d.c.A();
                        String uuid = workerParameters2.a.toString();
                        uuid.getClass();
                        t4w e = A.e(uuid);
                        if (e == null) {
                            return new qcg();
                        }
                        l2t l2tVar = d.j;
                        l2tVar.getClass();
                        kpm kpmVar = new kpm(l2tVar);
                        List list = (List) kpmVar.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (((q86) obj2).a(e)) {
                                arrayList.add(obj2);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            atomicInteger = atomicInteger2;
                        } else {
                            jsg j = jsg.j();
                            String str = r3w.a;
                            StringBuilder sb = new StringBuilder("Work ");
                            sb.append(e.a);
                            sb.append(" constrained by ");
                            atomicInteger = atomicInteger2;
                            sb.append(CollectionsKt.X(arrayList, null, null, null, new jwv(19), 31));
                            j.e(str, sb.toString());
                        }
                        if (!arrayList.isEmpty()) {
                            String str2 = y96.a;
                            jsg.j().e(str2, "Constraints not met for delegate " + b2 + ". Requesting retry.");
                            return new rcg();
                        }
                        jsg.j().e(y96.a, "Constraints met for delegate ".concat(b2));
                        try {
                            a5w a5wVar = workerParameters2.g;
                            context.getClass();
                            b = a5wVar.b(context, b2, workerParameters);
                            lno lnoVar = workerParameters.f.d;
                            lnoVar.getClass();
                            try {
                                a E = u2x.E(lnoVar);
                                try {
                                    v3 v3Var = new v3(constraintTrackingWorker, b, kpmVar, e, (Continuation) null, 25);
                                    v96Var2.j = b;
                                    v96Var2.m = 1;
                                    obj = x97.V(E, v3Var, v96Var2);
                                    if (obj == nm6Var) {
                                        return nm6Var;
                                    }
                                    b = b;
                                } catch (CancellationException e2) {
                                    e = e2;
                                    b = b;
                                    if (atomicInteger.get() == -256 || (e instanceof t96)) {
                                        if (Build.VERSION.SDK_INT < 31) {
                                            i2 = -512;
                                        } else if (atomicInteger.get() != -256) {
                                            i2 = atomicInteger.get();
                                        } else {
                                            if (!(e instanceof t96)) {
                                                xq0.q("Unreachable");
                                                return null;
                                            }
                                            i2 = ((t96) e).a;
                                        }
                                        b.c.compareAndSet(-256, i2);
                                    }
                                    if (e instanceof t96) {
                                        return new rcg();
                                    }
                                    throw e;
                                }
                            } catch (CancellationException e3) {
                                e = e3;
                            }
                        } catch (Throwable unused) {
                            jsg.j().e(y96.a, "No worker to delegate to.");
                            d.b.getClass();
                            return new qcg();
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b = v96Var2.j;
                        try {
                            qgg.h0(obj);
                            atomicInteger = atomicInteger2;
                        } catch (CancellationException e4) {
                            e = e4;
                            atomicInteger = atomicInteger2;
                            if (atomicInteger.get() == -256) {
                            }
                            if (Build.VERSION.SDK_INT < 31) {
                            }
                            b.c.compareAndSet(-256, i2);
                            if (e instanceof t96) {
                            }
                        }
                    }
                    return (tcg) obj;
                }
            }
            return (tcg) obj;
        } catch (CancellationException e5) {
            e = e5;
            if (atomicInteger.get() == -256) {
            }
            if (Build.VERSION.SDK_INT < 31) {
            }
            b.c.compareAndSet(-256, i2);
            if (e instanceof t96) {
            }
        }
        v96Var = new v96(constraintTrackingWorker, cg6Var);
        v96 v96Var22 = v96Var;
        Object obj3 = v96Var22.k;
        nm6 nm6Var2 = nm6.a;
        i = v96Var22.m;
        if (i != 0) {
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(Continuation continuation) {
        ExecutorService executorService = this.b.d;
        executorService.getClass();
        return x97.V(u2x.E(executorService), new ja4(this, null, 18), continuation);
    }
}
