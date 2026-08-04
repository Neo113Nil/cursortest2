package com.protoclaw.airfishing;

import android.app.Application;
import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AirFishingApp extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Intrinsics.checkNotNullParameter(this, "ctx");
        SharedPreferences sharedPreferences = getSharedPreferences("ac_gs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        a.c.f14c = sharedPreferences;
        Intrinsics.checkNotNullParameter(this, "ctx");
        AppsFlyerLib.getInstance().setLogLevel(AFLogger.LogLevel.NONE);
        AppsFlyerLib.getInstance().init("NNKY5pzzwhMThZnxnTUnCZ", new e(), this);
        AppsFlyerLib.getInstance().start(this);
        InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(this).build();
        installReferrerClientBuild.startConnection(new f(installReferrerClientBuild));
    }
}
