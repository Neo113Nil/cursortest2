package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.gamericefishpro.space.g6.a;
import com.gamericefishpro.space.g6.b;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.z4.e0;
import com.gamericefishpro.space.z4.f0;
import com.gamericefishpro.space.z4.o;
import com.gamericefishpro.space.z4.q;
import com.gamericefishpro.space.z4.r;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
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
public final class ProcessLifecycleInitializer implements b {
    @Override // com.gamericefishpro.space.g6.b
    public final List a() {
        return g0.d;
    }

    @Override // com.gamericefishpro.space.g6.b
    public final Object b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a aVarC = a.c(context);
        Intrinsics.checkNotNullExpressionValue(aVarC, "getInstance(...)");
        if (!aVarC.b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        AtomicBoolean atomicBoolean = r.a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!r.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new q());
        }
        f0 f0Var = f0.B;
        Intrinsics.checkNotNullParameter(context, "context");
        f0 f0Var2 = f0.B;
        f0Var2.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        f0Var2.w = new Handler();
        f0Var2.y.d(o.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new e0(f0Var2));
        return f0Var2;
    }
}
