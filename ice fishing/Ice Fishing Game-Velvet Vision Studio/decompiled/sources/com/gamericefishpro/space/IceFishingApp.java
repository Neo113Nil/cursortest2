package com.gamericefishpro.space;

import android.app.Application;
import com.gamericefishpro.space.a7.c;
import com.gamericefishpro.space.ej.a;
import com.gamericefishpro.space.f1.h;
import com.gamericefishpro.space.oh.s;
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
public class IceFishingApp extends Application {
    public static final /* synthetic */ int d = 0;

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        c appDeclaration = new c(0, this);
        Intrinsics.checkNotNullParameter(appDeclaration, "appDeclaration");
        a aVar = a.a;
        Intrinsics.checkNotNullParameter(appDeclaration, "appDeclaration");
        synchronized (aVar) {
            com.gamericefishpro.space.dj.a aVar2 = new com.gamericefishpro.space.dj.a();
            if (a.b != null) {
                Intrinsics.checkNotNullParameter("A Koin Application has already been started", "msg");
                throw new h("A Koin Application has already been started");
            }
            a.b = aVar2.a;
            appDeclaration.invoke(aVar2);
            aVar2.a.k();
        }
        s sVar = com.gamericefishpro.space.xb.c.a;
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter("9fe1abaf-2409-4644-a3f8-f1524d43f2c6", "appId");
        ((com.gamericefishpro.space.xb.a) com.gamericefishpro.space.xb.c.a.getValue()).initWithContext(this, "9fe1abaf-2409-4644-a3f8-f1524d43f2c6");
    }
}
