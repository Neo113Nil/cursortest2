package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.gamericefishpro.space.l6.p;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.q6.b;
import com.gamericefishpro.space.w6.j;
import com.gamericefishpro.space.y6.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
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
public final class ConstraintTrackingWorker extends p implements b {
    public final WorkerParameters d;
    public final Object e;
    public volatile boolean i;
    public final j v;
    public p w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.d = workerParameters;
        this.e = new Object();
        this.v = new j();
    }

    @Override // com.gamericefishpro.space.q6.b
    public final void c(ArrayList workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        q qVarC = q.c();
        String str = a.a;
        Objects.toString(workSpecs);
        qVarC.getClass();
        synchronized (this.e) {
            this.i = true;
            Unit unit = Unit.a;
        }
    }

    @Override // com.gamericefishpro.space.q6.b
    public final void d(List workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
    }

    @Override // com.gamericefishpro.space.l6.p
    public final void onStopped() {
        p pVar = this.w;
        if (pVar == null || pVar.isStopped()) {
            return;
        }
        pVar.stop();
    }

    @Override // com.gamericefishpro.space.l6.p
    public final com.gamericefishpro.space.va.b startWork() {
        getBackgroundExecutor().execute(new com.appsflyer.a(23, this));
        j future = this.v;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }
}
