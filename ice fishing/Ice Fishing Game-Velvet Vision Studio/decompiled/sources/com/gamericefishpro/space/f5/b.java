package com.gamericefishpro.space.f5;

import android.app.Activity;
import android.content.Context;
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
@o0("activity")
@Metadata
public class b extends p0 {
    public final Activity c;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        for (Object obj : com.gamericefishpro.space.li.j.c(context, new com.gamericefishpro.space.d0.p(26))) {
            if (((Context) obj) instanceof Activity) {
                this.c = (Activity) obj;
            }
        }
        obj = null;
        this.c = (Activity) obj;
    }

    @Override // com.gamericefishpro.space.f5.p0
    public final x a() {
        Intrinsics.checkNotNullParameter(this, "activityNavigator");
        return new a(this);
    }

    @Override // com.gamericefishpro.space.f5.p0
    public final x c(x xVar) {
        a destination = (a) xVar;
        Intrinsics.checkNotNullParameter(destination, "destination");
        throw new IllegalStateException(("Destination " + destination.e.a + " does not have an Intent set.").toString());
    }

    @Override // com.gamericefishpro.space.f5.p0
    public final boolean f() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
