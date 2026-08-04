package androidx.work;

import android.content.Context;
import com.appsflyer.a;
import com.gamericefishpro.space.b2.d0;
import com.gamericefishpro.space.b2.e0;
import com.gamericefishpro.space.db.d;
import com.gamericefishpro.space.l6.g;
import com.gamericefishpro.space.l6.i;
import com.gamericefishpro.space.l6.k;
import com.gamericefishpro.space.l6.p;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.f1;
import com.gamericefishpro.space.pi.h;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.l1;
import com.gamericefishpro.space.pi.o;
import com.gamericefishpro.space.pi.t;
import com.gamericefishpro.space.r5.b;
import com.gamericefishpro.space.s5.y;
import com.gamericefishpro.space.uh.f;
import com.gamericefishpro.space.ui.c;
import com.gamericefishpro.space.w6.j;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public abstract class CoroutineWorker extends p {
    private final t coroutineContext;
    private final j future;
    private final o job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.job = a0.c();
        j jVar = new j();
        Intrinsics.checkNotNullExpressionValue(jVar, "create()");
        this.future = jVar;
        jVar.a(new a(9, this), (y) ((b) getTaskExecutor()).e);
        this.coroutineContext = k0.a;
    }

    public static void a(CoroutineWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.future.d instanceof com.gamericefishpro.space.w6.a) {
            ((l1) this$0.job).c(null);
        }
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, com.gamericefishpro.space.th.a aVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(com.gamericefishpro.space.th.a aVar);

    public t getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(com.gamericefishpro.space.th.a aVar) {
        return getForegroundInfo$suspendImpl(this, aVar);
    }

    @Override // com.gamericefishpro.space.l6.p
    public final com.gamericefishpro.space.va.b getForegroundInfoAsync() {
        f1 f1VarC = a0.c();
        t coroutineContext = getCoroutineContext();
        coroutineContext.getClass();
        c cVarB = a0.b(e.c(coroutineContext, f1VarC));
        k kVar = new k(f1VarC);
        a0.u(cVarB, null, new d(kVar, this, null, 6), 3);
        return kVar;
    }

    public final j getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final o getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // com.gamericefishpro.space.l6.p
    public final void onStopped() {
        this.future.cancel(false);
    }

    public final Object setForeground(i iVar, com.gamericefishpro.space.th.a frame) throws Throwable {
        com.gamericefishpro.space.va.b foregroundAsync = setForegroundAsync(iVar);
        Intrinsics.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            h hVar = new h(1, f.b(frame));
            hVar.s();
            foregroundAsync.a(new com.gamericefishpro.space.va.a(2, hVar, foregroundAsync, false), com.gamericefishpro.space.l6.h.d);
            hVar.u(new d0(17, foregroundAsync));
            Object objR = hVar.r();
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (objR == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objR == aVar) {
                return objR;
            }
        }
        return Unit.a;
    }

    public final Object setProgress(g gVar, com.gamericefishpro.space.th.a frame) throws Throwable {
        com.gamericefishpro.space.va.b progressAsync = setProgressAsync(gVar);
        Intrinsics.checkNotNullExpressionValue(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            h hVar = new h(1, f.b(frame));
            hVar.s();
            progressAsync.a(new com.gamericefishpro.space.va.a(2, hVar, progressAsync, false), com.gamericefishpro.space.l6.h.d);
            hVar.u(new d0(17, progressAsync));
            Object objR = hVar.r();
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (objR == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objR == aVar) {
                return objR;
            }
        }
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.l6.p
    public final com.gamericefishpro.space.va.b startWork() {
        t coroutineContext = getCoroutineContext();
        o oVar = this.job;
        coroutineContext.getClass();
        a0.u(a0.b(e.c(coroutineContext, oVar)), null, new e0(this, null, 6), 3);
        return this.future;
    }

    @com.gamericefishpro.space.oh.a
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
