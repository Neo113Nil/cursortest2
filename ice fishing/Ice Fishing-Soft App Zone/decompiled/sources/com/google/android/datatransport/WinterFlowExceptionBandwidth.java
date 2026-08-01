package com.google.android.datatransport;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowExceptionBandwidth implements WinterFlowModuleClass, WinterFlowUserManagerSubsystem, WinterFlowDeserializationProcess {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowExceptionBandwidth(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowModuleClass
    public Object WinterFlowArrayNetwork(WinterFlowExceptionParser winterFlowExceptionParser) {
        String str = (String) this.WinterFlowTransactionManagerStrategy;
        if (!winterFlowExceptionParser.WinterFlowRouterRouter()) {
            throw new ExecutionException(winterFlowExceptionParser.WinterFlowVariableVersionControl());
        }
        String str2 = (String) winterFlowExceptionParser.WinterFlowTransactionManagerStrategy();
        if (TextUtils.isEmpty(str2) || !str2.endsWith(str)) {
            throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
        }
        return str;
    }

    public WinterFlowMapperNode WinterFlowCacheManagerAgent(WinterFlowObjectPackage winterFlowObjectPackage) {
        WinterFlowDebugDeployment winterFlowDebugDeployment = (WinterFlowDebugDeployment) this.WinterFlowTransactionManagerStrategy;
        URL url = (URL) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy;
        if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(Constants.CONNECTION_TIMEOUT_VERIFY);
        httpURLConnection.setReadTimeout(130000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) winterFlowObjectPackage.WinterFlowRouterRouter;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    WinterFlowConfigurationModule winterFlowConfigurationModule = winterFlowDebugDeployment.WinterFlowRouterStructure;
                    WinterFlowStrategy winterFlowStrategy = (WinterFlowStrategy) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    WinterFlowIDEConfiguration winterFlowIDEConfiguration = (WinterFlowIDEConfiguration) winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy;
                    WinterFlowVersionControlComponent winterFlowVersionControlComponent = new WinterFlowVersionControlComponent(bufferedWriter, winterFlowIDEConfiguration.WinterFlowRouterStructure, winterFlowIDEConfiguration.WinterFlowHookDataSource, winterFlowIDEConfiguration.WinterFlowCacheManagerAgent, winterFlowIDEConfiguration.WinterFlowArrayNetwork);
                    winterFlowVersionControlComponent.WinterFlowTransactionManagerStrategy(winterFlowStrategy);
                    winterFlowVersionControlComponent.WinterFlowRouterRouter();
                    winterFlowVersionControlComponent.WinterFlowHookDataSource.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", valueOf);
                    }
                    WinterFlowServerManager.WinterFlowBandwidthObject("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    WinterFlowServerManager.WinterFlowBandwidthObject("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new WinterFlowMapperNode(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new WinterFlowMapperNode(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            WinterFlowMapperNode winterFlowMapperNode = new WinterFlowMapperNode(responseCode, null, WinterFlowDatabaseRepository.WinterFlowRouterStructure(new BufferedReader(new InputStreamReader(gZIPInputStream))).WinterFlowRouterStructure);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return winterFlowMapperNode;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (WinterFlowArrayManager | IOException unused) {
            WinterFlowServerManager.WinterFlowMapperProtocol("CctTransportBackend");
            return new WinterFlowMapperNode(Constants.MINIMAL_ERROR_STATUS_CODE, null, 0L);
        } catch (ConnectException | UnknownHostException unused2) {
            WinterFlowServerManager.WinterFlowMapperProtocol("CctTransportBackend");
            return new WinterFlowMapperNode(500, null, 0L);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerSubsystem
    public Object WinterFlowHookDataSource() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowFrameworkManager winterFlowFrameworkManager = (WinterFlowFrameworkManager) ((WinterFlowJSONProxy) obj).WinterFlowSyntax;
                SQLiteDatabase WinterFlowHookDataSource = winterFlowFrameworkManager.WinterFlowHookDataSource();
                WinterFlowHookDataSource.beginTransaction();
                try {
                    WinterFlowHookDataSource.compileStatement("DELETE FROM log_event_dropped").execute();
                    WinterFlowHookDataSource.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + winterFlowFrameworkManager.WinterFlowTransactionManagerStrategy.WinterFlowTransactionManagerStrategy()).execute();
                    WinterFlowHookDataSource.setTransactionSuccessful();
                    return null;
                } finally {
                    WinterFlowHookDataSource.endTransaction();
                }
            default:
                WinterFlowStackProvider winterFlowStackProvider = (WinterFlowStackProvider) obj;
                Iterator it = ((Iterable) ((WinterFlowFrameworkManager) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy(new WinterFlowEventEmitterOrchestration(19))).iterator();
                while (it.hasNext()) {
                    ((WinterFlowObjectPackage) winterFlowStackProvider.WinterFlowUnitTestResponse).WinterFlowRouterAdapter((WinterFlowViewNode) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationProcess
    public void WinterFlowRouterStructure(WinterFlowExceptionParser winterFlowExceptionParser) {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                WinterFlowCacheRuntime.WinterFlowServiceUtility((Intent) obj);
                break;
            case 9:
                ((WinterFlowTransactionTransaction) obj).WinterFlowHookDataSource.WinterFlowCacheManagerAgent(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    public void WinterFlowTransactionManagerStrategy(Object obj) {
        ValueCallback valueCallback;
        WinterFlowVersionControlProcess winterFlowVersionControlProcess;
        PermissionRequest permissionRequest;
        int i = this.WinterFlowVariableVersionControl;
        Object obj2 = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowObjectSession) ((WinterFlowThreadPoolGateway) obj2).getValue()).WinterFlowUnitTestResponse(obj);
                break;
            case 1:
            default:
                WinterFlowObjectPackage winterFlowObjectPackage = (WinterFlowObjectPackage) obj2;
                if (((Boolean) obj).booleanValue() && (winterFlowVersionControlProcess = (WinterFlowVersionControlProcess) winterFlowObjectPackage.WinterFlowUnitTestResponse) != null && (permissionRequest = winterFlowVersionControlProcess.WinterFlowRouterStructure) != null) {
                    permissionRequest.grant(permissionRequest.getResources());
                    break;
                }
                break;
            case 2:
                List list = (List) obj;
                list.getClass();
                Uri[] uriArr = (Uri[]) list.toArray(new Uri[0]);
                WinterFlowAPIGateway winterFlowAPIGateway = (WinterFlowAPIGateway) ((WinterFlowAlgorithmArray) obj2).WinterFlowTransactionManagerStrategy;
                if (winterFlowAPIGateway != null && (valueCallback = winterFlowAPIGateway.WinterFlowRouterStructure) != null) {
                    valueCallback.onReceiveValue(uriArr);
                    break;
                }
                break;
        }
    }

    public void WinterFlowVariableVersionControl() {
        WinterFlowEventEvent winterFlowEventEvent = (WinterFlowEventEvent) this.WinterFlowTransactionManagerStrategy;
        synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
            List list = WinterFlowVersionProtocol.WinterFlowRouterRouter;
            list.getClass();
            ArrayList arrayList = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && WinterFlowManagerRequest.WinterFlowThreadListener(obj, winterFlowEventEvent)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            WinterFlowVersionProtocol.WinterFlowRouterRouter = arrayList;
        }
    }
}
