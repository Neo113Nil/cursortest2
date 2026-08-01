package com.google.android.datatransport;

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

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowListenerListener implements Callable {
    public final /* synthetic */ WinterFlowDeserializationPlatform WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowListenerListener(WinterFlowDeserializationPlatform winterFlowDeserializationPlatform, int i) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = winterFlowDeserializationPlatform;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowDeserializationPlatform winterFlowDeserializationPlatform = this.WinterFlowHookDataSource;
                synchronized (winterFlowDeserializationPlatform) {
                    try {
                        WinterFlowFrontendMechanism winterFlowFrontendMechanism = (WinterFlowFrontendMechanism) winterFlowDeserializationPlatform.WinterFlowRouterStructure.get();
                        ArrayList WinterFlowRouterStructure = winterFlowFrontendMechanism.WinterFlowRouterStructure();
                        synchronized (winterFlowFrontendMechanism) {
                            winterFlowFrontendMechanism.WinterFlowRouterStructure.WinterFlowRouterStructure(new WinterFlowCompilerCloud(7, winterFlowFrontendMechanism));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < WinterFlowRouterStructure.size(); i++) {
                            WinterFlowJSONMicroservice winterFlowJSONMicroservice = (WinterFlowJSONMicroservice) WinterFlowRouterStructure.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", winterFlowJSONMicroservice.WinterFlowRouterStructure);
                            jSONObject.put("dates", new JSONArray((Collection) winterFlowJSONMicroservice.WinterFlowHookDataSource));
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
                WinterFlowDeserializationPlatform winterFlowDeserializationPlatform2 = this.WinterFlowHookDataSource;
                synchronized (winterFlowDeserializationPlatform2) {
                    WinterFlowFrontendMechanism winterFlowFrontendMechanism2 = (WinterFlowFrontendMechanism) winterFlowDeserializationPlatform2.WinterFlowRouterStructure.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    String WinterFlowRouterStructure2 = ((WinterFlowListenerSystem) winterFlowDeserializationPlatform2.WinterFlowCacheManagerAgent.get()).WinterFlowRouterStructure();
                    synchronized (winterFlowFrontendMechanism2) {
                        winterFlowFrontendMechanism2.WinterFlowRouterStructure.WinterFlowRouterStructure(new WinterFlowRequestPipeline(winterFlowFrontendMechanism2, winterFlowFrontendMechanism2.WinterFlowHookDataSource(currentTimeMillis), WinterFlowRouterStructure2, new WinterFlowNetworkFramework(WinterFlowRouterStructure2), 2));
                    }
                }
                return null;
        }
    }
}
