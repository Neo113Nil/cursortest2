package androidx.versionedparcelable;

import android.util.Base64OutputStream;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class GoldenVectorSingletonControllerG1pfYFnXGCLXxPKali33261345150824 implements Callable {
    public final /* synthetic */ DeltaSignalStorageCacheZfNWuC4B2mICBm059d17280688713312 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public /* synthetic */ GoldenVectorSingletonControllerG1pfYFnXGCLXxPKali33261345150824(DeltaSignalStorageCacheZfNWuC4B2mICBm059d17280688713312 deltaSignalStorageCacheZfNWuC4B2mICBm059d17280688713312, int i) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = deltaSignalStorageCacheZfNWuC4B2mICBm059d17280688713312;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                DeltaSignalStorageCacheZfNWuC4B2mICBm059d17280688713312 deltaSignalStorageCacheZfNWuC4B2mICBm059d17280688713312 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                synchronized (deltaSignalStorageCacheZfNWuC4B2mICBm059d17280688713312) {
                    try {
                        BlueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732 blueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732 = (BlueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732) deltaSignalStorageCacheZfNWuC4B2mICBm059d17280688713312.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.get();
                        ArrayList ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = blueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495();
                        blueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.size(); i++) {
                            YellowLoopInjectionFilterUxC1NfPL4BGQHm5Ksb75999053735154 yellowLoopInjectionFilterUxC1NfPL4BGQHm5Ksb75999053735154 = (YellowLoopInjectionFilterUxC1NfPL4BGQHm5Ksb75999053735154) ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", yellowLoopInjectionFilterUxC1NfPL4BGQHm5Ksb75999053735154.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
                            jSONObject.put("dates", new JSONArray((Collection) yellowLoopInjectionFilterUxC1NfPL4BGQHm5Ksb75999053735154.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.ENCODING));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString(Constants.ENCODING);
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                DeltaSignalStorageCacheZfNWuC4B2mICBm059d17280688713312 deltaSignalStorageCacheZfNWuC4B2mICBm059d172806887133122 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                synchronized (deltaSignalStorageCacheZfNWuC4B2mICBm059d172806887133122) {
                    ((BlueKernelSingletonVirtualizationLuVCCrYXCocPmkjnMq75111247324732) deltaSignalStorageCacheZfNWuC4B2mICBm059d172806887133122.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.get()).BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(((BlazePulseDispatcherOverridingZPXOYT4DoIwjFsMyYl13656943463262) deltaSignalStorageCacheZfNWuC4B2mICBm059d172806887133122.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.get()).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(), System.currentTimeMillis());
                }
                return null;
        }
    }
}
