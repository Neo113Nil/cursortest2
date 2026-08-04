package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.w.m0;
import com.gamericefishpro.space.xb.c;
import com.gamericefishpro.space.xf.b;
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
public final class NotificationOpenedActivityHMS extends Activity {
    public final void a() throws Throwable {
        Intent intent = getIntent();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (c.b(applicationContext)) {
            a0 a0Var = new a0();
            a0Var.d = c.a().getService(b.class);
            com.gamericefishpro.space.ic.b.suspendifyBlocking(new m0(a0Var, this, intent, null, 2));
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        a();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) throws Throwable {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        a();
    }
}
