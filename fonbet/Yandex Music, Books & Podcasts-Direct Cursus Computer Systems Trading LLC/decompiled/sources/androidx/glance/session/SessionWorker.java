package androidx.glance.session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.ajs;
import defpackage.ca8;
import defpackage.cg6;
import defpackage.cxb;
import defpackage.dq7;
import defpackage.e7o;
import defpackage.fnp;
import defpackage.j5h;
import defpackage.kmp;
import defpackage.nm6;
import defpackage.q97;
import defpackage.qgg;
import defpackage.qmp;
import defpackage.scg;
import defpackage.tcg;
import defpackage.v5p;
import defpackage.wyf;
import defpackage.xq0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/glance/session/SessionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Lkmp;", "sessionManager", "Lajs;", "timeouts", "Lkotlinx/coroutines/a;", "coroutineContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lkmp;Lajs;Lkotlinx/coroutines/a;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class SessionWorker extends CoroutineWorker {
    public final WorkerParameters g;
    public final kmp h;
    public final ajs i;
    public final a j;
    public final String k;

    public SessionWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull kmp kmpVar, @NotNull ajs ajsVar, @NotNull a aVar) {
        super(context, workerParameters);
        this.g = workerParameters;
        this.h = kmpVar;
        this.i = ajsVar;
        this.j = aVar;
        q97 q97Var = this.b.b;
        kmpVar.getClass();
        String b = q97Var.b("KEY");
        if (b != null) {
            this.k = b;
        } else {
            xq0.q("SessionWorker must be started with a key");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Continuation continuation) {
        fnp fnpVar;
        int i;
        tcg tcgVar;
        if (continuation instanceof fnp) {
            fnpVar = (fnp) continuation;
            int i2 = fnpVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fnpVar.l = i2 - Integer.MIN_VALUE;
                Object obj = fnpVar.j;
                nm6 nm6Var = nm6.a;
                i = fnpVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    e7o e7oVar = this.i.d;
                    v5p v5pVar = new v5p(this, (Continuation) null, 8);
                    fnpVar.l = 1;
                    obj = wyf.e0(e7oVar, v5pVar, fnpVar);
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
                tcgVar = (tcg) obj;
                if (tcgVar == null) {
                    return tcgVar;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("TIMEOUT_EXIT_REASON", Boolean.TRUE);
                q97 q97Var = new q97(linkedHashMap);
                cxb.l0(q97Var);
                return new scg(q97Var);
            }
        }
        fnpVar = new fnp(this, (cg6) continuation);
        Object obj2 = fnpVar.j;
        nm6 nm6Var2 = nm6.a;
        i = fnpVar.l;
        if (i != 0) {
        }
        tcgVar = (tcg) obj2;
        if (tcgVar == null) {
        }
    }

    @Override // androidx.work.CoroutineWorker
    /* renamed from: d, reason: from getter */
    public final a getJ() {
        return this.j;
    }

    public SessionWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        this(context, workerParameters, qmp.a, null, null, 24, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SessionWorker(Context context, WorkerParameters workerParameters, kmp kmpVar, ajs ajsVar, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, workerParameters, r3, r4, aVar);
        kmp kmpVar2 = (i & 4) != 0 ? qmp.a : kmpVar;
        ajs ajsVar2 = (i & 8) != 0 ? new ajs() : ajsVar;
        if ((i & 16) != 0) {
            dq7 dq7Var = ca8.a;
            aVar = j5h.a;
        }
    }
}
