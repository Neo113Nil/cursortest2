package com.datadog.android.core.internal;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.data.upload.RotatingDnsResolver;
import com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes4.dex */
public final class CoreFeature$lastViewEvent$2 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoreFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoreFeature$lastViewEvent$2(CoreFeature coreFeature, int i) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = coreFeature;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        File file;
        int i = this.$r8$classId;
        JsonObject jsonObject = null;
        CoreFeature coreFeature = this.this$0;
        switch (i) {
            case 0:
                Lazy lazy = coreFeature.lastViewEventFile$delegate;
                File file2 = (File) lazy.getValue();
                InternalLogger internalLogger = coreFeature.internalLogger;
                if (zzhk.existsSafe(file2, internalLogger)) {
                    file = (File) lazy.getValue();
                } else {
                    File file3 = new File(new File(coreFeature.getStorageDir$dd_sdk_android_core_release(), "ndk_crash_reports_v2"), "last_view_event");
                    file = zzhk.existsSafe(file3, internalLogger) ? file3 : null;
                }
                if (file != null) {
                    List readData = new PlainBatchFileReaderWriter(internalLogger).readData(file);
                    if (!readData.isEmpty()) {
                        String str = new String(((RawBatchEvent) CollectionsKt.last(readData)).data, Charsets.UTF_8);
                        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
                        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
                        try {
                            jsonObject = JsonParser.parseString(str).getAsJsonObject();
                        } catch (JsonParseException e) {
                            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new DatadogInterceptor$intercept$1(str, 5), e, 48);
                        } catch (IllegalStateException e2) {
                            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new DatadogInterceptor$intercept$1(str, 6), e2, 48);
                        }
                    }
                }
                if (jsonObject != null) {
                    if (zzhk.existsSafe((File) lazy.getValue(), internalLogger)) {
                        zzhk.deleteSafe((File) lazy.getValue(), internalLogger);
                    } else {
                        File file4 = new File(new File(coreFeature.getStorageDir$dd_sdk_android_core_release(), "ndk_crash_reports_v2"), "last_view_event");
                        if (zzhk.existsSafe(file4, internalLogger)) {
                            zzhk.deleteSafe(file4, internalLogger);
                        }
                    }
                }
                return jsonObject;
            case 1:
                return new File(coreFeature.getStorageDir$dd_sdk_android_core_release(), "last_view_event");
            case 2:
                InternalLogger internalLogger2 = coreFeature.internalLogger;
                internalLogger2.getClass();
                return new PlainBatchFileReaderWriter(internalLogger2);
            case 3:
                ConnectionSpec.Builder builder = new ConnectionSpec.Builder(ConnectionSpec.RESTRICTED_TLS);
                builder.tlsVersions(TlsVersion.TLS_1_2, TlsVersion.TLS_1_3);
                CipherSuite[] cipherSuiteArr = CoreFeature.RESTRICTED_CIPHER_SUITES;
                builder.cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
                ConnectionSpec build = builder.build();
                OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                timeUnit.getClass();
                builder2.callTimeout = _UtilJvmKt.checkDuration("timeout", 45000L, timeUnit);
                builder2.writeTimeout = _UtilJvmKt.checkDuration("timeout", 45000L, timeUnit);
                builder2.protocols(CollectionsKt__CollectionsKt.listOf((Object[]) new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1}));
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(build);
                listOf.getClass();
                if (!listOf.equals(builder2.connectionSpecs)) {
                    builder2.routeDatabase = null;
                }
                builder2.connectionSpecs = _UtilJvmKt.toImmutableList(listOf);
                RotatingDnsResolver rotatingDnsResolver = new RotatingDnsResolver(coreFeature.timeProvider);
                if (rotatingDnsResolver != builder2.dns) {
                    builder2.routeDatabase = null;
                }
                builder2.dns = rotatingDnsResolver;
                return new OkHttpClient(builder2);
            default:
                return (JsonObject) coreFeature.lastViewEvent$delegate.getValue();
        }
    }
}
