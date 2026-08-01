package com.google.android.datatransport;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.PermissionRequest;
import androidx.core.graphics.drawable.IconCompat;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.icewinter.flow.winter.icecatch.ColdActivity;
import com.icewinter.flow.winter.icecatch.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Adler32;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectPackage implements WinterFlowCompilerMapper, WinterFlowLoaderHook, WinterFlowSoftwareStrategy {
    public static final Object WinterFlowResponseEngine = new Object();
    public static volatile WinterFlowObjectPackage WinterFlowSyntax;
    public Object WinterFlowRouterRouter;
    public Object WinterFlowTransactionManagerStrategy;
    public Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowObjectPackage(int i) {
        this.WinterFlowVariableVersionControl = i;
        int i2 = 26;
        switch (i) {
            case 2:
                this.WinterFlowTransactionManagerStrategy = new WinterFlowThreadNode(16);
                long[] jArr = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
                this.WinterFlowUnitTestResponse = new WinterFlowDatabaseSchemaStructure();
                this.WinterFlowRouterRouter = new WinterFlowAlgorithmDebug(i2);
                break;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                this.WinterFlowTransactionManagerStrategy = new WinterFlowJSONDecorator(10);
                this.WinterFlowUnitTestResponse = new WinterFlowJSONDecorator(10);
                this.WinterFlowRouterRouter = new WinterFlowJSONDecorator(10);
                break;
            case 11:
                this.WinterFlowTransactionManagerStrategy = new WinterFlowDatabaseSchemaStructure();
                break;
            case 16:
                this.WinterFlowTransactionManagerStrategy = new ArrayList();
                this.WinterFlowUnitTestResponse = new WinterFlowRendererNode(new WinterFlowDeploymentEngine(25));
                this.WinterFlowRouterRouter = new WinterFlowRendererNode(new WinterFlowDeploymentEngine(i2));
                break;
            case 21:
                long[] jArr2 = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
                this.WinterFlowTransactionManagerStrategy = new WinterFlowDatabaseSchemaStructure();
                break;
            case 25:
                this.WinterFlowTransactionManagerStrategy = new AtomicReference(WinterFlowManagerRequest.WinterFlowArrayNetwork);
                this.WinterFlowUnitTestResponse = new Object();
                break;
            default:
                this.WinterFlowRouterRouter = new WinterFlowAlgorithmDebug(i2);
                break;
        }
    }

    public static Object WinterFlowCacheManagerAgent(WinterFlowExceptionParser winterFlowExceptionParser) {
        try {
            return WinterFlowHookProcessor.WinterFlowVariableVersionControl(winterFlowExceptionParser, 30L);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e2);
        }
    }

    public static WinterFlowObjectPackage WinterFlowRouterRouter(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        WinterFlowObjectPackage winterFlowObjectPackage = new WinterFlowObjectPackage(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) winterFlowObjectPackage.WinterFlowUnitTestResponse)) {
            try {
                ((ArrayDeque) winterFlowObjectPackage.WinterFlowUnitTestResponse).clear();
                String string = ((SharedPreferences) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).getString("topic_operation_queue", "");
                if (!TextUtils.isEmpty(string) && string.contains(",")) {
                    String[] split = string.split(",", -1);
                    int length = split.length;
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) winterFlowObjectPackage.WinterFlowUnitTestResponse).add(str);
                        }
                    }
                    return winterFlowObjectPackage;
                }
                return winterFlowObjectPackage;
            } finally {
            }
        }
    }

    public static WinterFlowObjectPackage WinterFlowServerProtocol(Context context) {
        if (WinterFlowSyntax == null) {
            synchronized (WinterFlowResponseEngine) {
                try {
                    if (WinterFlowSyntax == null) {
                        WinterFlowSyntax = new WinterFlowObjectPackage(context);
                    }
                } finally {
                }
            }
        }
        return WinterFlowSyntax;
    }

    public void WinterFlowArrayHelper(long j) {
        ((WinterFlowCacheThread) this.WinterFlowRouterRouter).WinterFlowVariableVersionControl.WinterFlowArrayNetwork = j;
    }

    public WinterFlowViewNode WinterFlowArrayNetwork() {
        String str = ((String) this.WinterFlowTransactionManagerStrategy) == null ? " backendName" : "";
        if (((WinterFlowMicroserviceSubsystem) this.WinterFlowRouterRouter) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new WinterFlowViewNode((String) this.WinterFlowTransactionManagerStrategy, (byte[]) this.WinterFlowUnitTestResponse, (WinterFlowMicroserviceSubsystem) this.WinterFlowRouterRouter);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Missing required properties:".concat(str));
        return null;
    }

    public void WinterFlowBackendCacheManager(WinterFlowConcurrencyParser winterFlowConcurrencyParser) {
        ((WinterFlowCacheThread) this.WinterFlowRouterRouter).WinterFlowVariableVersionControl.WinterFlowRouterStructure = winterFlowConcurrencyParser;
    }

    public boolean WinterFlowBandwidthObject(CharSequence charSequence, int i, int i2, WinterFlowBackend winterFlowBackend) {
        if ((winterFlowBackend.WinterFlowCacheManagerAgent & 3) == 0) {
            WinterFlowFunctionClass winterFlowFunctionClass = (WinterFlowFunctionClass) this.WinterFlowRouterRouter;
            WinterFlowSoftwareVersion WinterFlowHookDataSource = winterFlowBackend.WinterFlowHookDataSource();
            int WinterFlowRouterStructure = WinterFlowHookDataSource.WinterFlowRouterStructure(8);
            if (WinterFlowRouterStructure != 0) {
                ((ByteBuffer) WinterFlowHookDataSource.WinterFlowRouterRouter).getShort(WinterFlowRouterStructure + WinterFlowHookDataSource.WinterFlowVariableVersionControl);
            }
            winterFlowFunctionClass.getClass();
            ThreadLocal threadLocal = WinterFlowFunctionClass.WinterFlowHookDataSource;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = winterFlowFunctionClass.WinterFlowRouterStructure.hasGlyph(sb.toString());
            int i3 = winterFlowBackend.WinterFlowCacheManagerAgent & 4;
            winterFlowBackend.WinterFlowCacheManagerAgent = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (winterFlowBackend.WinterFlowCacheManagerAgent & 3) == 2;
    }

    public void WinterFlowBatchUI(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        List WinterFlowBandwidthObject = WinterFlowFrontendSubsystem.WinterFlowBandwidthObject(WinterFlowFrontendSubsystem.WinterFlowThreadListener(keys));
        Object WinterFlowStrategyHook = WinterFlowSerializerUtility.WinterFlowStrategyHook(WinterFlowBandwidthObject);
        while (true) {
            String str = (String) WinterFlowStrategyHook;
            if (WinterFlowBandwidthObject.indexOf(str) > WinterFlowBandwidthObject.size() - 1) {
                return;
            }
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                jSONObject2.getClass();
                WinterFlowBatchUI(jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
                String optString = jSONObject.optString(str, "0");
                optString.getClass();
                if (!WinterFlowFrameworkStrategy.WinterFlowArrayHelper(optString) && !optString.equals("0") && !optString.equals("null")) {
                    ((JSONObject) ((WinterFlowRendererNode) this.WinterFlowUnitTestResponse).getValue()).put(str, optString);
                }
            }
            WinterFlowStrategyHook = WinterFlowBandwidthObject.get(WinterFlowBandwidthObject.indexOf(str) + 1);
        }
    }

    public void WinterFlowCompilerVariable() {
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = (WinterFlowDatabaseSchemaStructure) this.WinterFlowTransactionManagerStrategy;
        String str = (String) this.WinterFlowUnitTestResponse;
        List list = (List) winterFlowDatabaseSchemaStructure.WinterFlowTransactionAgent(str);
        if (list != null) {
            list.remove((WinterFlowObjectUI) this.WinterFlowRouterRouter);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        winterFlowDatabaseSchemaStructure.WinterFlowThreadListener(str, list);
    }

    public boolean WinterFlowConcurrencyThread() {
        if (((WinterFlowBatchCacheManager) this.WinterFlowTransactionManagerStrategy).getValue() != this.WinterFlowRouterRouter) {
            return true;
        }
        WinterFlowObjectPackage winterFlowObjectPackage = (WinterFlowObjectPackage) this.WinterFlowUnitTestResponse;
        return winterFlowObjectPackage != null && winterFlowObjectPackage.WinterFlowConcurrencyThread();
    }

    public void WinterFlowConsumerUserManager(WinterFlowJavaLayer winterFlowJavaLayer) {
        ((WinterFlowCacheThread) this.WinterFlowRouterRouter).WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent = winterFlowJavaLayer;
    }

    public void WinterFlowEventEmitterController(WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration) {
        ((WinterFlowCacheThread) this.WinterFlowRouterRouter).WinterFlowVariableVersionControl.WinterFlowHookDataSource = winterFlowCacheManagerConfiguration;
    }

    public void WinterFlowHookDataSource(WinterFlowThreadPoolAgent winterFlowThreadPoolAgent) {
        ArrayList arrayList = (ArrayList) this.WinterFlowTransactionManagerStrategy;
        if (arrayList.contains(winterFlowThreadPoolAgent)) {
            return;
        }
        arrayList.add(winterFlowThreadPoolAgent);
    }

    public void WinterFlowMapperProtocol(Object obj) {
        long WinterFlowRouterStructure = WinterFlowConfigurationException.WinterFlowRouterStructure();
        if (WinterFlowRouterStructure == WinterFlowNetworkMechanism.WinterFlowRouterStructure) {
            this.WinterFlowRouterRouter = obj;
            return;
        }
        synchronized (this.WinterFlowUnitTestResponse) {
            WinterFlowBackendConcurrency winterFlowBackendConcurrency = (WinterFlowBackendConcurrency) ((AtomicReference) this.WinterFlowTransactionManagerStrategy).get();
            int WinterFlowRouterStructure2 = winterFlowBackendConcurrency.WinterFlowRouterStructure(WinterFlowRouterStructure);
            if (WinterFlowRouterStructure2 < 0) {
                ((AtomicReference) this.WinterFlowTransactionManagerStrategy).set(winterFlowBackendConcurrency.WinterFlowHookDataSource(WinterFlowRouterStructure, obj));
            } else {
                winterFlowBackendConcurrency.WinterFlowCacheManagerAgent[WinterFlowRouterStructure2] = obj;
            }
        }
    }

    public boolean WinterFlowOrchestrationSubsystem() {
        return !(((WinterFlowNodeDebug) ((WinterFlowJSONDecorator) this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy).isEmpty() && ((WinterFlowNodeDebug) ((WinterFlowJSONDecorator) this.WinterFlowRouterRouter).WinterFlowTransactionManagerStrategy).isEmpty() && ((WinterFlowNodeDebug) ((WinterFlowJSONDecorator) this.WinterFlowUnitTestResponse).WinterFlowTransactionManagerStrategy).isEmpty());
    }

    public void WinterFlowResolverController(String str) {
        if (str != null) {
            this.WinterFlowTransactionManagerStrategy = str;
        } else {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null backendName");
        }
    }

    public Object WinterFlowResponseEngine(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.WinterFlowTransactionManagerStrategy;
        if (WinterFlowHookProcessor.WinterFlowThreadListener()) {
            try {
                WinterFlowHookProcessor.WinterFlowTransactionManagerStrategy(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                WinterFlowCacheManagerController winterFlowCacheManagerController = (WinterFlowCacheManagerController) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> WinterFlowRouterStructure = winterFlowCacheManagerController.WinterFlowRouterStructure();
                if (!WinterFlowRouterStructure.isEmpty()) {
                    for (Class cls2 : WinterFlowRouterStructure) {
                        if (!hashMap.containsKey(cls2)) {
                            WinterFlowResponseEngine(cls2, hashSet);
                        }
                    }
                }
                obj = winterFlowCacheManagerController.WinterFlowHookDataSource((Context) this.WinterFlowRouterRouter);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new WinterFlowServerSystem(th);
            }
        }
        return obj;
    }

    public void WinterFlowRouterAdapter(WinterFlowViewNode winterFlowViewNode, int i, boolean z) {
        WinterFlowLoaderSerializer winterFlowLoaderSerializer = (WinterFlowLoaderSerializer) this.WinterFlowUnitTestResponse;
        Context context = (Context) this.WinterFlowRouterRouter;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(Constants.ENCODING)));
        String str = winterFlowViewNode.WinterFlowRouterStructure;
        adler32.update(str.getBytes(Charset.forName(Constants.ENCODING)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        WinterFlowMicroserviceSubsystem winterFlowMicroserviceSubsystem = winterFlowViewNode.WinterFlowCacheManagerAgent;
        adler32.update(allocate.putInt(WinterFlowProxyCompiler.WinterFlowRouterStructure(winterFlowMicroserviceSubsystem)).array());
        byte[] bArr = winterFlowViewNode.WinterFlowHookDataSource;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        WinterFlowServerManager.WinterFlowBandwidthObject("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", winterFlowViewNode);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((WinterFlowFrameworkManager) this.WinterFlowTransactionManagerStrategy).WinterFlowHookDataSource().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(WinterFlowProxyCompiler.WinterFlowRouterStructure(winterFlowMicroserviceSubsystem))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(winterFlowLoaderSerializer.WinterFlowRouterStructure(winterFlowMicroserviceSubsystem, longValue, i));
            Set set = ((WinterFlowRepositoryServer) winterFlowLoaderSerializer.WinterFlowHookDataSource.get(winterFlowMicroserviceSubsystem)).WinterFlowCacheManagerAgent;
            if (set.contains(WinterFlowCacheFunction.WinterFlowVariableVersionControl)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(WinterFlowCacheFunction.WinterFlowUnitTestResponse)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(WinterFlowCacheFunction.WinterFlowTransactionManagerStrategy)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", WinterFlowProxyCompiler.WinterFlowRouterStructure(winterFlowMicroserviceSubsystem));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {winterFlowViewNode, Integer.valueOf(value), Long.valueOf(winterFlowLoaderSerializer.WinterFlowRouterStructure(winterFlowMicroserviceSubsystem, longValue, i)), valueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void WinterFlowRouterStructure(WinterFlowSchedulerStructure winterFlowSchedulerStructure, WinterFlowCompilerListener winterFlowCompilerListener) {
        WinterFlowJSONDecorator winterFlowJSONDecorator = (WinterFlowJSONDecorator) this.WinterFlowTransactionManagerStrategy;
        WinterFlowJSONDecorator winterFlowJSONDecorator2 = (WinterFlowJSONDecorator) this.WinterFlowUnitTestResponse;
        WinterFlowJSONDecorator winterFlowJSONDecorator3 = (WinterFlowJSONDecorator) this.WinterFlowRouterRouter;
        int ordinal = winterFlowCompilerListener.ordinal();
        if (ordinal == 0) {
            winterFlowJSONDecorator.WinterFlowRouterStructure(winterFlowSchedulerStructure);
            winterFlowJSONDecorator3.WinterFlowRouterStructure(winterFlowSchedulerStructure);
            return;
        }
        if (ordinal == 1) {
            winterFlowJSONDecorator2.WinterFlowRouterStructure(winterFlowSchedulerStructure);
            winterFlowJSONDecorator3.WinterFlowRouterStructure(winterFlowSchedulerStructure);
            return;
        }
        if (ordinal == 2) {
            if (winterFlowSchedulerStructure.WinterFlowServerProtocol != null) {
                winterFlowJSONDecorator3.WinterFlowRouterStructure(winterFlowSchedulerStructure);
                return;
            } else {
                winterFlowJSONDecorator.WinterFlowRouterStructure(winterFlowSchedulerStructure);
                return;
            }
        }
        if (ordinal != 3) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
        } else if (winterFlowSchedulerStructure.WinterFlowServerProtocol != null) {
            winterFlowJSONDecorator3.WinterFlowRouterStructure(winterFlowSchedulerStructure);
        } else {
            winterFlowJSONDecorator2.WinterFlowRouterStructure(winterFlowSchedulerStructure);
        }
    }

    public void WinterFlowSerializerStructure(WinterFlowTransactionProcess winterFlowTransactionProcess) {
        WinterFlowEventEmitterOrchestration winterFlowEventEmitterOrchestration = new WinterFlowEventEmitterOrchestration(22);
        WinterFlowDataSourceWebsocket winterFlowDataSourceWebsocket = (WinterFlowDataSourceWebsocket) this.WinterFlowRouterRouter;
        WinterFlowViewNode winterFlowViewNode = (WinterFlowViewNode) this.WinterFlowTransactionManagerStrategy;
        WinterFlowFrontendCache winterFlowFrontendCache = (WinterFlowFrontendCache) this.WinterFlowUnitTestResponse;
        WinterFlowDatabaseSchemaBatch winterFlowDatabaseSchemaBatch = winterFlowDataSourceWebsocket.WinterFlowCacheManagerAgent;
        WinterFlowObjectPackage WinterFlowRouterStructure = WinterFlowViewNode.WinterFlowRouterStructure();
        WinterFlowRouterStructure.WinterFlowResolverController(winterFlowViewNode.WinterFlowRouterStructure);
        WinterFlowRouterStructure.WinterFlowRouterRouter = WinterFlowMicroserviceSubsystem.WinterFlowVariableVersionControl;
        WinterFlowRouterStructure.WinterFlowUnitTestResponse = winterFlowViewNode.WinterFlowHookDataSource;
        WinterFlowViewNode WinterFlowArrayNetwork = WinterFlowRouterStructure.WinterFlowArrayNetwork();
        WinterFlowSchedulerParser winterFlowSchedulerParser = new WinterFlowSchedulerParser();
        winterFlowSchedulerParser.WinterFlowTransactionManagerStrategy = new HashMap();
        winterFlowSchedulerParser.WinterFlowArrayNetwork = Long.valueOf(winterFlowDataSourceWebsocket.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy());
        winterFlowSchedulerParser.WinterFlowVariableVersionControl = Long.valueOf(winterFlowDataSourceWebsocket.WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy());
        winterFlowSchedulerParser.WinterFlowRouterStructure = "FCM_CLIENT_EVENT_LOGGING";
        WinterFlowControllerCacheManager winterFlowControllerCacheManager = winterFlowTransactionProcess.WinterFlowRouterStructure;
        WinterFlowAlgorithmArray winterFlowAlgorithmArray = WinterFlowTestingStrategy.WinterFlowRouterStructure;
        winterFlowAlgorithmArray.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            winterFlowAlgorithmArray.WinterFlowConcurrencyThread(winterFlowControllerCacheManager, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        winterFlowSchedulerParser.WinterFlowCacheManagerAgent = new WinterFlowBatchSubsystem(winterFlowFrontendCache, byteArrayOutputStream.toByteArray());
        winterFlowSchedulerParser.WinterFlowHookDataSource = null;
        winterFlowDatabaseSchemaBatch.WinterFlowHookDataSource.execute(new WinterFlowVariableVersionControl(winterFlowDatabaseSchemaBatch, WinterFlowArrayNetwork, winterFlowEventEmitterOrchestration, winterFlowSchedulerParser.WinterFlowUnitTestResponse()));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(89:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(86:267|268|(1:24)|25|26|27|(1:29)|264|31|32|33|34|35|(67:246|(2:250|(2:254|(3:256|(1:258)(1:260)|259)))|38|(1:40)|41|(1:43)|44|(3:233|(2:241|242)|(1:240))|50|(1:52)|53|(1:55)(2:223|(1:228)(1:227))|56|(1:58)(1:222)|59|(1:61)(5:212|(1:214)|215|(1:217)(1:221)|(1:219)(1:220))|62|(1:64)(6:194|(4:197|(2:205|206)(1:203)|204|195)|207|208|(1:210)|211)|65|(1:67)(1:193)|(1:69)|70|(40:189|190|(1:76)|77|(1:79)(1:184)|80|(1:82)|83|(1:85)|(1:87)|88|(1:90)|(1:92)|93|(1:95)|(1:97)|98|(23:170|171|(1:102)|103|(3:160|161|(20:163|(1:165)|166|(1:107)|108|(4:145|146|147|(2:149|(14:151|(3:112|(1:117)(1:115)|116)|118|(1:120)|121|(1:123)|124|(1:126)|127|(1:144)|129|(4:133|134|(1:136)(1:139)|137)|131|132)(2:152|153))(2:154|155))|110|(0)|118|(0)|121|(0)|124|(0)|127|(0)|129|(0)|131|132)(2:167|168))|105|(0)|108|(0)|110|(0)|118|(0)|121|(0)|124|(0)|127|(0)|129|(0)|131|132)|100|(0)|103|(0)|105|(0)|108|(0)|110|(0)|118|(0)|121|(0)|124|(0)|127|(0)|129|(0)|131|132)|72|(43:185|186|(0)|77|(0)(0)|80|(0)|83|(1:180)|85|(0)|88|(1:176)|90|(0)|93|(1:174)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|108|(0)|110|(0)|118|(0)|121|(0)|124|(0)|127|(0)|129|(0)|131|132)|74|(0)|77|(0)(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|108|(0)|110|(0)|118|(0)|121|(0)|124|(0)|127|(0)|129|(0)|131|132)|37|38|(0)|41|(0)|44|(2:46|229)|233|(1:235)|241|242|(1:238)|240|50|(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|108|(0)|110|(0)|118|(0)|121|(0)|124|(0)|127|(0)|129|(0)|131|132)|22|(0)|25|26|27|(0)|264|31|32|33|34|35|(0)|37|38|(0)|41|(0)|44|(0)|233|(0)|241|242|(0)|240|50|(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|95|(0)|98|(0)|100|(0)|103|(0)|105|(0)|108|(0)|110|(0)|118|(0)|121|(0)|124|(0)|127|(0)|129|(0)|131|132) */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01a2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01a3, code lost:
    
        r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x00ab, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x00ac, code lost:
    
        r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x032c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x031b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: NameNotFoundException -> 0x00ab, TRY_LEAVE, TryCatch #12 {NameNotFoundException -> 0x00ab, blocks: (B:27:0x009f, B:29:0x00a5), top: B:26:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c1  */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v164 */
    /* JADX WARN: Type inference failed for: r0v165 */
    /* JADX WARN: Type inference failed for: r0v88, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean WinterFlowServiceUtility() {
        WinterFlowControllerXML winterFlowControllerXML;
        FirebaseMessagingService firebaseMessagingService;
        WinterFlowJSONDecorator winterFlowJSONDecorator;
        Bundle bundle;
        String packageName;
        PackageManager packageManager;
        String WinterFlowTransactionAgent;
        String WinterFlowTransactionAgent2;
        String WinterFlowServerProtocol;
        int i;
        String WinterFlowServerProtocol2;
        Uri defaultUri;
        String WinterFlowServerProtocol3;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String WinterFlowServerProtocol4;
        Integer valueOf;
        boolean WinterFlowVariableVersionControl;
        String WinterFlowServerProtocol5;
        Integer WinterFlowSyntax2;
        Integer WinterFlowSyntax3;
        Integer WinterFlowSyntax4;
        String WinterFlowServerProtocol6;
        Long valueOf2;
        JSONArray WinterFlowResponseEngine2;
        long[] jArr;
        JSONArray WinterFlowResponseEngine3;
        int[] iArr;
        ?? r0;
        String WinterFlowServerProtocol7;
        IconCompat iconCompat;
        boolean z;
        int i2;
        ApplicationInfo applicationInfo;
        if (((WinterFlowJSONDecorator) this.WinterFlowRouterRouter).WinterFlowVariableVersionControl("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.WinterFlowUnitTestResponse;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String WinterFlowServerProtocol8 = ((WinterFlowJSONDecorator) this.WinterFlowRouterRouter).WinterFlowServerProtocol("gcm.n.image");
        if (!TextUtils.isEmpty(WinterFlowServerProtocol8)) {
            try {
                winterFlowControllerXML = new WinterFlowControllerXML(new URL(WinterFlowServerProtocol8));
            } catch (MalformedURLException unused) {
            }
            if (winterFlowControllerXML != null) {
                ExecutorService executorService = (ExecutorService) this.WinterFlowTransactionManagerStrategy;
                WinterFlowArrayEngine winterFlowArrayEngine = new WinterFlowArrayEngine();
                winterFlowControllerXML.WinterFlowTransactionManagerStrategy = executorService.submit(new WinterFlowControllerManager(9, winterFlowControllerXML, winterFlowArrayEngine));
                winterFlowControllerXML.WinterFlowUnitTestResponse = winterFlowArrayEngine.WinterFlowRouterStructure;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.WinterFlowUnitTestResponse;
            winterFlowJSONDecorator = (WinterFlowJSONDecorator) this.WinterFlowRouterRouter;
            AtomicInteger atomicInteger = WinterFlowWorkerRouter.WinterFlowRouterStructure;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String WinterFlowServerProtocol9 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.android_channel_id");
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(WinterFlowServerProtocol9) || notificationManager.getNotificationChannel(WinterFlowServerProtocol9) == null) {
                    WinterFlowServerProtocol9 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (TextUtils.isEmpty(WinterFlowServerProtocol9) || notificationManager.getNotificationChannel(WinterFlowServerProtocol9) == null) {
                        WinterFlowServerProtocol9 = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", identifier == 0 ? "Misc" : firebaseMessagingService.getString(identifier), 3));
                        }
                    }
                }
                AtomicInteger atomicInteger2 = WinterFlowWorkerRouter.WinterFlowRouterStructure;
                packageName = firebaseMessagingService.getPackageName();
                Resources resources = firebaseMessagingService.getResources();
                packageManager = firebaseMessagingService.getPackageManager();
                WinterFlowViewProcess winterFlowViewProcess = new WinterFlowViewProcess(firebaseMessagingService, WinterFlowServerProtocol9);
                WinterFlowTransactionAgent = winterFlowJSONDecorator.WinterFlowTransactionAgent(resources, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(WinterFlowTransactionAgent)) {
                    winterFlowViewProcess.WinterFlowVariableVersionControl = WinterFlowViewProcess.WinterFlowHookDataSource(WinterFlowTransactionAgent);
                }
                WinterFlowTransactionAgent2 = winterFlowJSONDecorator.WinterFlowTransactionAgent(resources, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(WinterFlowTransactionAgent2)) {
                    winterFlowViewProcess.WinterFlowTransactionManagerStrategy = WinterFlowViewProcess.WinterFlowHookDataSource(WinterFlowTransactionAgent2);
                    WinterFlowConsumerCache winterFlowConsumerCache = new WinterFlowConsumerCache();
                    winterFlowConsumerCache.WinterFlowHookDataSource = WinterFlowViewProcess.WinterFlowHookDataSource(WinterFlowTransactionAgent2);
                    winterFlowViewProcess.WinterFlowArrayNetwork(winterFlowConsumerCache);
                }
                WinterFlowServerProtocol = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.icon");
                if (!TextUtils.isEmpty(WinterFlowServerProtocol) || (((i = resources.getIdentifier(WinterFlowServerProtocol, "drawable", packageName)) == 0 || !WinterFlowWorkerRouter.WinterFlowRouterStructure(resources, i)) && ((i = resources.getIdentifier(WinterFlowServerProtocol, "mipmap", packageName)) == 0 || !WinterFlowWorkerRouter.WinterFlowRouterStructure(resources, i)))) {
                    i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i != 0 || !WinterFlowWorkerRouter.WinterFlowRouterStructure(resources, i)) {
                        i = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i != 0 || !WinterFlowWorkerRouter.WinterFlowRouterStructure(resources, i)) {
                        i = 17301651;
                    }
                }
                winterFlowViewProcess.WinterFlowVariableBandwidth.icon = i;
                WinterFlowServerProtocol2 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.sound2");
                if (TextUtils.isEmpty(WinterFlowServerProtocol2)) {
                    WinterFlowServerProtocol2 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.sound");
                }
                if (TextUtils.isEmpty(WinterFlowServerProtocol2)) {
                    defaultUri = null;
                } else if ("default".equals(WinterFlowServerProtocol2) || resources.getIdentifier(WinterFlowServerProtocol2, "raw", packageName) == 0) {
                    defaultUri = RingtoneManager.getDefaultUri(2);
                } else {
                    defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + WinterFlowServerProtocol2);
                }
                if (defaultUri != null) {
                    Notification notification = winterFlowViewProcess.WinterFlowVariableBandwidth;
                    notification.sound = defaultUri;
                    notification.audioStreamType = -1;
                    notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
                }
                WinterFlowServerProtocol3 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.click_action");
                if (TextUtils.isEmpty(WinterFlowServerProtocol3)) {
                    String WinterFlowServerProtocol10 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.link_android");
                    if (TextUtils.isEmpty(WinterFlowServerProtocol10)) {
                        WinterFlowServerProtocol10 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.link");
                    }
                    Uri parse = !TextUtils.isEmpty(WinterFlowServerProtocol10) ? Uri.parse(WinterFlowServerProtocol10) : null;
                    if (parse != null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setPackage(packageName);
                        launchIntentForPackage.setData(parse);
                    } else {
                        launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                    }
                } else {
                    launchIntentForPackage = new Intent(WinterFlowServerProtocol3);
                    launchIntentForPackage.setPackage(packageName);
                    launchIntentForPackage.setFlags(268435456);
                }
                if (launchIntentForPackage == null) {
                    activity = null;
                } else {
                    launchIntentForPackage.addFlags(67108864);
                    Bundle bundle3 = (Bundle) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
                    Bundle bundle4 = new Bundle(bundle3);
                    for (String str : bundle3.keySet()) {
                        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                            bundle4.remove(str);
                        }
                    }
                    launchIntentForPackage.putExtras(bundle4);
                    if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("google.c.a.e")) {
                        launchIntentForPackage.putExtra("gcm.n.analytics_data", winterFlowJSONDecorator.WinterFlowBandwidthObject());
                    }
                    activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                }
                winterFlowViewProcess.WinterFlowUnitTestResponse = activity;
                broadcast = !winterFlowJSONDecorator.WinterFlowVariableVersionControl("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(winterFlowJSONDecorator.WinterFlowBandwidthObject())), 1140850688);
                if (broadcast != null) {
                    winterFlowViewProcess.WinterFlowVariableBandwidth.deleteIntent = broadcast;
                }
                WinterFlowServerProtocol4 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.color");
                if (!TextUtils.isEmpty(WinterFlowServerProtocol4)) {
                    try {
                        valueOf = Integer.valueOf(Color.parseColor(WinterFlowServerProtocol4));
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (valueOf != null) {
                        winterFlowViewProcess.WinterFlowBandwidthObject = valueOf.intValue();
                    }
                    WinterFlowVariableVersionControl = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.sticky");
                    Notification notification2 = winterFlowViewProcess.WinterFlowVariableBandwidth;
                    if (WinterFlowVariableVersionControl) {
                        notification2.flags &= -17;
                    } else {
                        notification2.flags |= 16;
                    }
                    winterFlowViewProcess.WinterFlowThreadListener = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.local_only");
                    WinterFlowServerProtocol5 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.ticker");
                    if (WinterFlowServerProtocol5 != null) {
                        winterFlowViewProcess.WinterFlowVariableBandwidth.tickerText = WinterFlowViewProcess.WinterFlowHookDataSource(WinterFlowServerProtocol5);
                    }
                    WinterFlowSyntax2 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.notification_priority");
                    if (WinterFlowSyntax2 != null || WinterFlowSyntax2.intValue() < -2 || WinterFlowSyntax2.intValue() > 2) {
                        WinterFlowSyntax2 = null;
                    }
                    if (WinterFlowSyntax2 != null) {
                        winterFlowViewProcess.WinterFlowResponseEngine = WinterFlowSyntax2.intValue();
                    }
                    WinterFlowSyntax3 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.visibility");
                    if (WinterFlowSyntax3 != null || WinterFlowSyntax3.intValue() < -1 || WinterFlowSyntax3.intValue() > 1) {
                        WinterFlowSyntax3 = null;
                    }
                    if (WinterFlowSyntax3 != null) {
                        winterFlowViewProcess.WinterFlowOrchestrationSubsystem = WinterFlowSyntax3.intValue();
                    }
                    WinterFlowSyntax4 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.notification_count");
                    if (WinterFlowSyntax4 != null || WinterFlowSyntax4.intValue() < 0) {
                        WinterFlowSyntax4 = null;
                    }
                    if (WinterFlowSyntax4 != null) {
                        winterFlowViewProcess.WinterFlowSyntax = WinterFlowSyntax4.intValue();
                    }
                    WinterFlowServerProtocol6 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.event_time");
                    if (!TextUtils.isEmpty(WinterFlowServerProtocol6)) {
                        try {
                            valueOf2 = Long.valueOf(Long.parseLong(WinterFlowServerProtocol6));
                        } catch (NumberFormatException unused3) {
                            WinterFlowJSONDecorator.WinterFlowRouterAdapter("gcm.n.event_time");
                        }
                        if (valueOf2 != null) {
                            winterFlowViewProcess.WinterFlowTransactionAgent = true;
                            winterFlowViewProcess.WinterFlowVariableBandwidth.when = valueOf2.longValue();
                        }
                        WinterFlowResponseEngine2 = winterFlowJSONDecorator.WinterFlowResponseEngine("gcm.n.vibrate_timings");
                        if (WinterFlowResponseEngine2 != null) {
                            try {
                            } catch (NumberFormatException | JSONException unused4) {
                                WinterFlowResponseEngine2.toString();
                            }
                            if (WinterFlowResponseEngine2.length() <= 1) {
                                throw new JSONException("vibrateTimings have invalid length");
                            }
                            int length = WinterFlowResponseEngine2.length();
                            jArr = new long[length];
                            for (int i3 = 0; i3 < length; i3++) {
                                jArr[i3] = WinterFlowResponseEngine2.optLong(i3);
                            }
                            if (jArr != null) {
                                winterFlowViewProcess.WinterFlowVariableBandwidth.vibrate = jArr;
                            }
                            WinterFlowResponseEngine3 = winterFlowJSONDecorator.WinterFlowResponseEngine("gcm.n.light_settings");
                            if (WinterFlowResponseEngine3 != null) {
                                iArr = new int[3];
                                try {
                                } catch (IllegalArgumentException e) {
                                    WinterFlowResponseEngine3.toString();
                                    e.getMessage();
                                } catch (JSONException unused5) {
                                    WinterFlowResponseEngine3.toString();
                                }
                                if (WinterFlowResponseEngine3.length() != 3) {
                                    throw new JSONException("lightSettings don't have all three fields");
                                }
                                int parseColor = Color.parseColor(WinterFlowResponseEngine3.optString(0));
                                if (parseColor == -16777216) {
                                    throw new IllegalArgumentException("Transparent color is invalid");
                                }
                                iArr[0] = parseColor;
                                iArr[1] = WinterFlowResponseEngine3.optInt(1);
                                iArr[2] = WinterFlowResponseEngine3.optInt(2);
                                if (iArr != null) {
                                    int i4 = iArr[0];
                                    int i5 = iArr[1];
                                    int i6 = iArr[2];
                                    Notification notification3 = winterFlowViewProcess.WinterFlowVariableBandwidth;
                                    notification3.ledARGB = i4;
                                    notification3.ledOnMS = i5;
                                    notification3.ledOffMS = i6;
                                    notification3.flags = ((i5 == 0 || i6 == 0) ? 0 : 1) | ((-2) & notification3.flags);
                                }
                                boolean WinterFlowVariableVersionControl2 = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_sound");
                                boolean z2 = WinterFlowVariableVersionControl2;
                                if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_vibrate_timings")) {
                                    z2 = (WinterFlowVariableVersionControl2 ? 1 : 0) | 2;
                                }
                                r0 = z2;
                                if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_light_settings")) {
                                    r0 = (z2 ? 1 : 0) | 4;
                                }
                                Notification notification4 = winterFlowViewProcess.WinterFlowVariableBandwidth;
                                notification4.defaults = r0;
                                if ((r0 & 4) != 0) {
                                    notification4.flags |= 1;
                                }
                                WinterFlowServerProtocol7 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.tag");
                                if (TextUtils.isEmpty(WinterFlowServerProtocol7)) {
                                    WinterFlowServerProtocol7 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                }
                                String str2 = WinterFlowServerProtocol7;
                                if (winterFlowControllerXML != null) {
                                    try {
                                        WinterFlowExceptionParser winterFlowExceptionParser = winterFlowControllerXML.WinterFlowUnitTestResponse;
                                        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(winterFlowExceptionParser);
                                        Bitmap bitmap = (Bitmap) WinterFlowHookProcessor.WinterFlowVariableVersionControl(winterFlowExceptionParser, 5L);
                                        winterFlowViewProcess.WinterFlowCacheManagerAgent(bitmap);
                                        WinterFlowRequestServer winterFlowRequestServer = new WinterFlowRequestServer();
                                        if (bitmap == null) {
                                            iconCompat = null;
                                            z = true;
                                        } else {
                                            z = true;
                                            iconCompat = new IconCompat(1);
                                            iconCompat.WinterFlowHookDataSource = bitmap;
                                        }
                                        winterFlowRequestServer.WinterFlowHookDataSource = iconCompat;
                                        winterFlowRequestServer.WinterFlowCacheManagerAgent = null;
                                        winterFlowRequestServer.WinterFlowArrayNetwork = z;
                                        winterFlowViewProcess.WinterFlowArrayNetwork(winterFlowRequestServer);
                                    } catch (InterruptedException unused6) {
                                        winterFlowControllerXML.close();
                                        Thread.currentThread().interrupt();
                                    } catch (ExecutionException e2) {
                                        Objects.toString(e2.getCause());
                                    } catch (TimeoutException unused7) {
                                        winterFlowControllerXML.close();
                                    }
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.WinterFlowUnitTestResponse).getSystemService("notification")).notify(str2, 0, winterFlowViewProcess.WinterFlowRouterStructure());
                                return true;
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean WinterFlowVariableVersionControl22 = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_sound");
                            boolean z22 = WinterFlowVariableVersionControl22;
                            if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_vibrate_timings")) {
                            }
                            r0 = z22;
                            if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_light_settings")) {
                            }
                            Notification notification42 = winterFlowViewProcess.WinterFlowVariableBandwidth;
                            notification42.defaults = r0;
                            if ((r0 & 4) != 0) {
                            }
                            WinterFlowServerProtocol7 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.tag");
                            if (TextUtils.isEmpty(WinterFlowServerProtocol7)) {
                            }
                            String str22 = WinterFlowServerProtocol7;
                            if (winterFlowControllerXML != null) {
                            }
                            ((NotificationManager) ((FirebaseMessagingService) this.WinterFlowUnitTestResponse).getSystemService("notification")).notify(str22, 0, winterFlowViewProcess.WinterFlowRouterStructure());
                            return true;
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        WinterFlowResponseEngine3 = winterFlowJSONDecorator.WinterFlowResponseEngine("gcm.n.light_settings");
                        if (WinterFlowResponseEngine3 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean WinterFlowVariableVersionControl222 = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_sound");
                        boolean z222 = WinterFlowVariableVersionControl222;
                        if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_vibrate_timings")) {
                        }
                        r0 = z222;
                        if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_light_settings")) {
                        }
                        Notification notification422 = winterFlowViewProcess.WinterFlowVariableBandwidth;
                        notification422.defaults = r0;
                        if ((r0 & 4) != 0) {
                        }
                        WinterFlowServerProtocol7 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.tag");
                        if (TextUtils.isEmpty(WinterFlowServerProtocol7)) {
                        }
                        String str222 = WinterFlowServerProtocol7;
                        if (winterFlowControllerXML != null) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.WinterFlowUnitTestResponse).getSystemService("notification")).notify(str222, 0, winterFlowViewProcess.WinterFlowRouterStructure());
                        return true;
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    WinterFlowResponseEngine2 = winterFlowJSONDecorator.WinterFlowResponseEngine("gcm.n.vibrate_timings");
                    if (WinterFlowResponseEngine2 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    WinterFlowResponseEngine3 = winterFlowJSONDecorator.WinterFlowResponseEngine("gcm.n.light_settings");
                    if (WinterFlowResponseEngine3 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean WinterFlowVariableVersionControl2222 = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_sound");
                    boolean z2222 = WinterFlowVariableVersionControl2222;
                    if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z2222;
                    if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_light_settings")) {
                    }
                    Notification notification4222 = winterFlowViewProcess.WinterFlowVariableBandwidth;
                    notification4222.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    WinterFlowServerProtocol7 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.tag");
                    if (TextUtils.isEmpty(WinterFlowServerProtocol7)) {
                    }
                    String str2222 = WinterFlowServerProtocol7;
                    if (winterFlowControllerXML != null) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.WinterFlowUnitTestResponse).getSystemService("notification")).notify(str2222, 0, winterFlowViewProcess.WinterFlowRouterStructure());
                    return true;
                }
                i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i2 != 0) {
                    try {
                        valueOf = Integer.valueOf(firebaseMessagingService.getColor(i2));
                    } catch (Resources.NotFoundException unused8) {
                    }
                    if (valueOf != null) {
                    }
                    WinterFlowVariableVersionControl = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.sticky");
                    Notification notification22 = winterFlowViewProcess.WinterFlowVariableBandwidth;
                    if (WinterFlowVariableVersionControl) {
                    }
                    winterFlowViewProcess.WinterFlowThreadListener = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.local_only");
                    WinterFlowServerProtocol5 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.ticker");
                    if (WinterFlowServerProtocol5 != null) {
                    }
                    WinterFlowSyntax2 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.notification_priority");
                    if (WinterFlowSyntax2 != null) {
                    }
                    WinterFlowSyntax2 = null;
                    if (WinterFlowSyntax2 != null) {
                    }
                    WinterFlowSyntax3 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.visibility");
                    if (WinterFlowSyntax3 != null) {
                    }
                    WinterFlowSyntax3 = null;
                    if (WinterFlowSyntax3 != null) {
                    }
                    WinterFlowSyntax4 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.notification_count");
                    if (WinterFlowSyntax4 != null) {
                    }
                    WinterFlowSyntax4 = null;
                    if (WinterFlowSyntax4 != null) {
                    }
                    WinterFlowServerProtocol6 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.event_time");
                    if (!TextUtils.isEmpty(WinterFlowServerProtocol6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    WinterFlowResponseEngine2 = winterFlowJSONDecorator.WinterFlowResponseEngine("gcm.n.vibrate_timings");
                    if (WinterFlowResponseEngine2 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    WinterFlowResponseEngine3 = winterFlowJSONDecorator.WinterFlowResponseEngine("gcm.n.light_settings");
                    if (WinterFlowResponseEngine3 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean WinterFlowVariableVersionControl22222 = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_sound");
                    boolean z22222 = WinterFlowVariableVersionControl22222;
                    if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z22222;
                    if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_light_settings")) {
                    }
                    Notification notification42222 = winterFlowViewProcess.WinterFlowVariableBandwidth;
                    notification42222.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    WinterFlowServerProtocol7 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.tag");
                    if (TextUtils.isEmpty(WinterFlowServerProtocol7)) {
                    }
                    String str22222 = WinterFlowServerProtocol7;
                    if (winterFlowControllerXML != null) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.WinterFlowUnitTestResponse).getSystemService("notification")).notify(str22222, 0, winterFlowViewProcess.WinterFlowRouterStructure());
                    return true;
                }
                valueOf = null;
                if (valueOf != null) {
                }
                WinterFlowVariableVersionControl = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.sticky");
                Notification notification222 = winterFlowViewProcess.WinterFlowVariableBandwidth;
                if (WinterFlowVariableVersionControl) {
                }
                winterFlowViewProcess.WinterFlowThreadListener = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.local_only");
                WinterFlowServerProtocol5 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.ticker");
                if (WinterFlowServerProtocol5 != null) {
                }
                WinterFlowSyntax2 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.notification_priority");
                if (WinterFlowSyntax2 != null) {
                }
                WinterFlowSyntax2 = null;
                if (WinterFlowSyntax2 != null) {
                }
                WinterFlowSyntax3 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.visibility");
                if (WinterFlowSyntax3 != null) {
                }
                WinterFlowSyntax3 = null;
                if (WinterFlowSyntax3 != null) {
                }
                WinterFlowSyntax4 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.notification_count");
                if (WinterFlowSyntax4 != null) {
                }
                WinterFlowSyntax4 = null;
                if (WinterFlowSyntax4 != null) {
                }
                WinterFlowServerProtocol6 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.event_time");
                if (!TextUtils.isEmpty(WinterFlowServerProtocol6)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                WinterFlowResponseEngine2 = winterFlowJSONDecorator.WinterFlowResponseEngine("gcm.n.vibrate_timings");
                if (WinterFlowResponseEngine2 != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                WinterFlowResponseEngine3 = winterFlowJSONDecorator.WinterFlowResponseEngine("gcm.n.light_settings");
                if (WinterFlowResponseEngine3 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean WinterFlowVariableVersionControl222222 = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_sound");
                boolean z222222 = WinterFlowVariableVersionControl222222;
                if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_vibrate_timings")) {
                }
                r0 = z222222;
                if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_light_settings")) {
                }
                Notification notification422222 = winterFlowViewProcess.WinterFlowVariableBandwidth;
                notification422222.defaults = r0;
                if ((r0 & 4) != 0) {
                }
                WinterFlowServerProtocol7 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.tag");
                if (TextUtils.isEmpty(WinterFlowServerProtocol7)) {
                }
                String str222222 = WinterFlowServerProtocol7;
                if (winterFlowControllerXML != null) {
                }
                ((NotificationManager) ((FirebaseMessagingService) this.WinterFlowUnitTestResponse).getSystemService("notification")).notify(str222222, 0, winterFlowViewProcess.WinterFlowRouterStructure());
                return true;
            }
            WinterFlowServerProtocol9 = null;
            AtomicInteger atomicInteger22 = WinterFlowWorkerRouter.WinterFlowRouterStructure;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources2 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            WinterFlowViewProcess winterFlowViewProcess2 = new WinterFlowViewProcess(firebaseMessagingService, WinterFlowServerProtocol9);
            WinterFlowTransactionAgent = winterFlowJSONDecorator.WinterFlowTransactionAgent(resources2, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(WinterFlowTransactionAgent)) {
            }
            WinterFlowTransactionAgent2 = winterFlowJSONDecorator.WinterFlowTransactionAgent(resources2, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(WinterFlowTransactionAgent2)) {
            }
            WinterFlowServerProtocol = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.icon");
            if (!TextUtils.isEmpty(WinterFlowServerProtocol)) {
            }
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i != 0) {
            }
            i = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i != 0) {
            }
            i = 17301651;
            winterFlowViewProcess2.WinterFlowVariableBandwidth.icon = i;
            WinterFlowServerProtocol2 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.sound2");
            if (TextUtils.isEmpty(WinterFlowServerProtocol2)) {
            }
            if (TextUtils.isEmpty(WinterFlowServerProtocol2)) {
            }
            if (defaultUri != null) {
            }
            WinterFlowServerProtocol3 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.click_action");
            if (TextUtils.isEmpty(WinterFlowServerProtocol3)) {
            }
            if (launchIntentForPackage == null) {
            }
            winterFlowViewProcess2.WinterFlowUnitTestResponse = activity;
            if (!winterFlowJSONDecorator.WinterFlowVariableVersionControl("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            WinterFlowServerProtocol4 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.color");
            if (!TextUtils.isEmpty(WinterFlowServerProtocol4)) {
            }
            i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i2 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            WinterFlowVariableVersionControl = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.sticky");
            Notification notification2222 = winterFlowViewProcess2.WinterFlowVariableBandwidth;
            if (WinterFlowVariableVersionControl) {
            }
            winterFlowViewProcess2.WinterFlowThreadListener = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.local_only");
            WinterFlowServerProtocol5 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.ticker");
            if (WinterFlowServerProtocol5 != null) {
            }
            WinterFlowSyntax2 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.notification_priority");
            if (WinterFlowSyntax2 != null) {
            }
            WinterFlowSyntax2 = null;
            if (WinterFlowSyntax2 != null) {
            }
            WinterFlowSyntax3 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.visibility");
            if (WinterFlowSyntax3 != null) {
            }
            WinterFlowSyntax3 = null;
            if (WinterFlowSyntax3 != null) {
            }
            WinterFlowSyntax4 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.notification_count");
            if (WinterFlowSyntax4 != null) {
            }
            WinterFlowSyntax4 = null;
            if (WinterFlowSyntax4 != null) {
            }
            WinterFlowServerProtocol6 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.event_time");
            if (!TextUtils.isEmpty(WinterFlowServerProtocol6)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            WinterFlowResponseEngine2 = winterFlowJSONDecorator.WinterFlowResponseEngine("gcm.n.vibrate_timings");
            if (WinterFlowResponseEngine2 != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            WinterFlowResponseEngine3 = winterFlowJSONDecorator.WinterFlowResponseEngine("gcm.n.light_settings");
            if (WinterFlowResponseEngine3 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean WinterFlowVariableVersionControl2222222 = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_sound");
            boolean z2222222 = WinterFlowVariableVersionControl2222222;
            if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_vibrate_timings")) {
            }
            r0 = z2222222;
            if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_light_settings")) {
            }
            Notification notification4222222 = winterFlowViewProcess2.WinterFlowVariableBandwidth;
            notification4222222.defaults = r0;
            if ((r0 & 4) != 0) {
            }
            WinterFlowServerProtocol7 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.tag");
            if (TextUtils.isEmpty(WinterFlowServerProtocol7)) {
            }
            String str2222222 = WinterFlowServerProtocol7;
            if (winterFlowControllerXML != null) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.WinterFlowUnitTestResponse).getSystemService("notification")).notify(str2222222, 0, winterFlowViewProcess2.WinterFlowRouterStructure());
            return true;
        }
        winterFlowControllerXML = null;
        if (winterFlowControllerXML != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.WinterFlowUnitTestResponse;
        winterFlowJSONDecorator = (WinterFlowJSONDecorator) this.WinterFlowRouterRouter;
        AtomicInteger atomicInteger3 = WinterFlowWorkerRouter.WinterFlowRouterStructure;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String WinterFlowServerProtocol92 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.android_channel_id");
        if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
        }
        WinterFlowServerProtocol92 = null;
        AtomicInteger atomicInteger222 = WinterFlowWorkerRouter.WinterFlowRouterStructure;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources22 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        WinterFlowViewProcess winterFlowViewProcess22 = new WinterFlowViewProcess(firebaseMessagingService, WinterFlowServerProtocol92);
        WinterFlowTransactionAgent = winterFlowJSONDecorator.WinterFlowTransactionAgent(resources22, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(WinterFlowTransactionAgent)) {
        }
        WinterFlowTransactionAgent2 = winterFlowJSONDecorator.WinterFlowTransactionAgent(resources22, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(WinterFlowTransactionAgent2)) {
        }
        WinterFlowServerProtocol = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.icon");
        if (!TextUtils.isEmpty(WinterFlowServerProtocol)) {
        }
        i = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i != 0) {
        }
        i = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i != 0) {
        }
        i = 17301651;
        winterFlowViewProcess22.WinterFlowVariableBandwidth.icon = i;
        WinterFlowServerProtocol2 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.sound2");
        if (TextUtils.isEmpty(WinterFlowServerProtocol2)) {
        }
        if (TextUtils.isEmpty(WinterFlowServerProtocol2)) {
        }
        if (defaultUri != null) {
        }
        WinterFlowServerProtocol3 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.click_action");
        if (TextUtils.isEmpty(WinterFlowServerProtocol3)) {
        }
        if (launchIntentForPackage == null) {
        }
        winterFlowViewProcess22.WinterFlowUnitTestResponse = activity;
        if (!winterFlowJSONDecorator.WinterFlowVariableVersionControl("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        WinterFlowServerProtocol4 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.color");
        if (!TextUtils.isEmpty(WinterFlowServerProtocol4)) {
        }
        i2 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i2 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        WinterFlowVariableVersionControl = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.sticky");
        Notification notification22222 = winterFlowViewProcess22.WinterFlowVariableBandwidth;
        if (WinterFlowVariableVersionControl) {
        }
        winterFlowViewProcess22.WinterFlowThreadListener = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.local_only");
        WinterFlowServerProtocol5 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.ticker");
        if (WinterFlowServerProtocol5 != null) {
        }
        WinterFlowSyntax2 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.notification_priority");
        if (WinterFlowSyntax2 != null) {
        }
        WinterFlowSyntax2 = null;
        if (WinterFlowSyntax2 != null) {
        }
        WinterFlowSyntax3 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.visibility");
        if (WinterFlowSyntax3 != null) {
        }
        WinterFlowSyntax3 = null;
        if (WinterFlowSyntax3 != null) {
        }
        WinterFlowSyntax4 = winterFlowJSONDecorator.WinterFlowSyntax("gcm.n.notification_count");
        if (WinterFlowSyntax4 != null) {
        }
        WinterFlowSyntax4 = null;
        if (WinterFlowSyntax4 != null) {
        }
        WinterFlowServerProtocol6 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.event_time");
        if (!TextUtils.isEmpty(WinterFlowServerProtocol6)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        WinterFlowResponseEngine2 = winterFlowJSONDecorator.WinterFlowResponseEngine("gcm.n.vibrate_timings");
        if (WinterFlowResponseEngine2 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        WinterFlowResponseEngine3 = winterFlowJSONDecorator.WinterFlowResponseEngine("gcm.n.light_settings");
        if (WinterFlowResponseEngine3 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean WinterFlowVariableVersionControl22222222 = winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_sound");
        boolean z22222222 = WinterFlowVariableVersionControl22222222;
        if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_vibrate_timings")) {
        }
        r0 = z22222222;
        if (winterFlowJSONDecorator.WinterFlowVariableVersionControl("gcm.n.default_light_settings")) {
        }
        Notification notification42222222 = winterFlowViewProcess22.WinterFlowVariableBandwidth;
        notification42222222.defaults = r0;
        if ((r0 & 4) != 0) {
        }
        WinterFlowServerProtocol7 = winterFlowJSONDecorator.WinterFlowServerProtocol("gcm.n.tag");
        if (TextUtils.isEmpty(WinterFlowServerProtocol7)) {
        }
        String str22222222 = WinterFlowServerProtocol7;
        if (winterFlowControllerXML != null) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.WinterFlowUnitTestResponse).getSystemService("notification")).notify(str22222222, 0, winterFlowViewProcess22.WinterFlowRouterStructure());
        return true;
    }

    public void WinterFlowSingletonPlatform(String str, String str2, String str3, String str4) {
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = (com.google.firebase.WinterFlowSyntaxEvent) this.WinterFlowUnitTestResponse;
        if (str2 == null || str3 == null) {
            throw new IOException("FIS auth token or FIS ID is empty");
        }
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        WinterFlowMapperEngine winterFlowMapperEngine = winterFlowSyntaxEvent.WinterFlowCacheManagerAgent;
        String str5 = winterFlowMapperEngine.WinterFlowUnitTestResponse;
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        String str6 = winterFlowMapperEngine.WinterFlowRouterStructure;
        if (str5 == null) {
            throw new IOException("Project ID or API Key is missing");
        }
        URL url = new URL("https://fcmregistrations.googleapis.com/v1/projects/" + str5 + "/registrations/" + str3 + "/topicSubscriptions/" + str + ":" + str4);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            url.toString();
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("x-goog-api-key", str6);
        httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
        httpURLConnection.setDoOutput(false);
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                if (responseCode < 200 || responseCode >= 300) {
                    if (responseCode != 404 && responseCode != 403) {
                        if (responseCode >= 500) {
                            throw new IOException("INTERNAL_SERVER_ERROR");
                        }
                        throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        httpURLConnection.getResponseMessage();
                    }
                    throw new IOException("Topic " + str4 + " failed: " + httpURLConnection.getResponseMessage());
                }
            } catch (IOException e) {
                throw new IOException("SERVICE_NOT_AVAILABLE", e);
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public void WinterFlowSyntax(Bundle bundle) {
        HashSet hashSet = (HashSet) this.WinterFlowUnitTestResponse;
        String string = ((Context) this.WinterFlowRouterRouter).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (WinterFlowCacheManagerController.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    WinterFlowResponseEngine((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new WinterFlowServerSystem(e);
            }
        }
    }

    public long WinterFlowThreadListener() {
        return ((WinterFlowCacheThread) this.WinterFlowRouterRouter).WinterFlowVariableVersionControl.WinterFlowArrayNetwork;
    }

    public WinterFlowJavaLayer WinterFlowTransactionAgent() {
        return ((WinterFlowCacheThread) this.WinterFlowRouterRouter).WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent;
    }

    public boolean WinterFlowTransactionManagerStrategy(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        return !(winterFlowSchedulerStructure.WinterFlowServerProtocol == null) && (((WinterFlowNodeDebug) ((WinterFlowJSONDecorator) this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy).contains(winterFlowSchedulerStructure) || ((WinterFlowNodeDebug) ((WinterFlowJSONDecorator) this.WinterFlowUnitTestResponse).WinterFlowTransactionManagerStrategy).contains(winterFlowSchedulerStructure));
    }

    @Override // com.google.android.datatransport.WinterFlowCompilerMapper
    public Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowVersionControlProcess winterFlowVersionControlProcess = (WinterFlowVersionControlProcess) obj;
        this.WinterFlowUnitTestResponse = winterFlowVersionControlProcess;
        if (((ColdActivity) this.WinterFlowTransactionManagerStrategy).checkSelfPermission("android.permission.CAMERA") == 0) {
            PermissionRequest permissionRequest = winterFlowVersionControlProcess.WinterFlowRouterStructure;
            if (permissionRequest != null) {
                permissionRequest.grant(permissionRequest.getResources());
            }
        } else {
            ((WinterFlowControllerModule) this.WinterFlowRouterRouter).WinterFlowSessionManagerInterface("android.permission.CAMERA");
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    public Object WinterFlowVariableBandwidth(CharSequence charSequence, int i, int i2, int i3, boolean z, WinterFlowBandwidthClass winterFlowBandwidthClass) {
        int i4;
        char c;
        WinterFlowModuleOrchestration winterFlowModuleOrchestration = new WinterFlowModuleOrchestration((WinterFlowControllerUnitTest) ((WinterFlowStackProvider) this.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                WinterFlowControllerUnitTest winterFlowControllerUnitTest = (WinterFlowControllerUnitTest) winterFlowModuleOrchestration.WinterFlowCacheManagerAgent.WinterFlowRouterStructure.get(codePointAt);
                if (winterFlowModuleOrchestration.WinterFlowRouterStructure == 2) {
                    if (winterFlowControllerUnitTest != null) {
                        winterFlowModuleOrchestration.WinterFlowCacheManagerAgent = winterFlowControllerUnitTest;
                        winterFlowModuleOrchestration.WinterFlowTransactionManagerStrategy++;
                    } else {
                        if (codePointAt == 65038) {
                            winterFlowModuleOrchestration.WinterFlowRouterStructure();
                        } else if (codePointAt != 65039) {
                            WinterFlowControllerUnitTest winterFlowControllerUnitTest2 = winterFlowModuleOrchestration.WinterFlowCacheManagerAgent;
                            if (winterFlowControllerUnitTest2.WinterFlowHookDataSource != null) {
                                if (winterFlowModuleOrchestration.WinterFlowTransactionManagerStrategy != 1) {
                                    winterFlowModuleOrchestration.WinterFlowArrayNetwork = winterFlowControllerUnitTest2;
                                    winterFlowModuleOrchestration.WinterFlowRouterStructure();
                                } else if (winterFlowModuleOrchestration.WinterFlowHookDataSource()) {
                                    winterFlowModuleOrchestration.WinterFlowArrayNetwork = winterFlowModuleOrchestration.WinterFlowCacheManagerAgent;
                                    winterFlowModuleOrchestration.WinterFlowRouterStructure();
                                } else {
                                    winterFlowModuleOrchestration.WinterFlowRouterStructure();
                                }
                                c = 3;
                            } else {
                                winterFlowModuleOrchestration.WinterFlowRouterStructure();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (winterFlowControllerUnitTest == null) {
                    winterFlowModuleOrchestration.WinterFlowRouterStructure();
                    c = 1;
                } else {
                    winterFlowModuleOrchestration.WinterFlowRouterStructure = 2;
                    winterFlowModuleOrchestration.WinterFlowCacheManagerAgent = winterFlowControllerUnitTest;
                    winterFlowModuleOrchestration.WinterFlowTransactionManagerStrategy = 1;
                    c = 2;
                }
                winterFlowModuleOrchestration.WinterFlowVariableVersionControl = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !WinterFlowBandwidthObject(charSequence, i4, i6, winterFlowModuleOrchestration.WinterFlowArrayNetwork.WinterFlowHookDataSource)) {
                        z2 = winterFlowBandwidthClass.WinterFlowArrayNetwork(charSequence, i4, i6, winterFlowModuleOrchestration.WinterFlowArrayNetwork.WinterFlowHookDataSource);
                        i5++;
                    }
                }
            }
        }
        if (winterFlowModuleOrchestration.WinterFlowRouterStructure == 2 && winterFlowModuleOrchestration.WinterFlowCacheManagerAgent.WinterFlowHookDataSource != null && ((winterFlowModuleOrchestration.WinterFlowTransactionManagerStrategy > 1 || winterFlowModuleOrchestration.WinterFlowHookDataSource()) && i5 < i3 && z2 && (z || !WinterFlowBandwidthObject(charSequence, i4, i6, winterFlowModuleOrchestration.WinterFlowCacheManagerAgent.WinterFlowHookDataSource)))) {
            winterFlowBandwidthClass.WinterFlowArrayNetwork(charSequence, i4, i6, winterFlowModuleOrchestration.WinterFlowCacheManagerAgent.WinterFlowHookDataSource);
        }
        return winterFlowBandwidthClass.WinterFlowRouterStructure();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005f -> B:10:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object WinterFlowVariableVersionControl(String str, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowBandwidthQueue winterFlowBandwidthQueue;
        int i;
        Iterator it;
        WinterFlowRendererNode winterFlowRendererNode = (WinterFlowRendererNode) this.WinterFlowUnitTestResponse;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowBandwidthQueue) {
            winterFlowBandwidthQueue = (WinterFlowBandwidthQueue) winterFlowOrchestrationCompiler;
            int i2 = winterFlowBandwidthQueue.WinterFlowThreadListener;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowBandwidthQueue.WinterFlowThreadListener = i2 - Integer.MIN_VALUE;
                Object obj = winterFlowBandwidthQueue.WinterFlowTransactionAgent;
                i = winterFlowBandwidthQueue.WinterFlowThreadListener;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    it = ((ArrayList) this.WinterFlowTransactionManagerStrategy).iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowThreadPoolAgent winterFlowThreadPoolAgent = winterFlowBandwidthQueue.WinterFlowResponseEngine;
                    it = winterFlowBandwidthQueue.WinterFlowSyntax;
                    String str2 = winterFlowBandwidthQueue.WinterFlowRouterRouter;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    String str3 = (String) obj;
                    if (winterFlowThreadPoolAgent.getKey().length() != 0) {
                        ((JSONObject) winterFlowRendererNode.getValue()).put(winterFlowThreadPoolAgent.getKey(), str3);
                    } else if (str3.length() > 0) {
                        WinterFlowBatchUI(new JSONObject(str3));
                    }
                    str = str2;
                    if (it.hasNext()) {
                        WinterFlowThreadPoolAgent winterFlowThreadPoolAgent2 = (WinterFlowThreadPoolAgent) it.next();
                        winterFlowBandwidthQueue.WinterFlowRouterRouter = str;
                        winterFlowBandwidthQueue.WinterFlowSyntax = it;
                        winterFlowBandwidthQueue.WinterFlowResponseEngine = winterFlowThreadPoolAgent2;
                        winterFlowBandwidthQueue.WinterFlowThreadListener = 1;
                        Object WinterFlowRouterStructure = winterFlowThreadPoolAgent2.WinterFlowRouterStructure(winterFlowBandwidthQueue);
                        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                        if (WinterFlowRouterStructure == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        str2 = str;
                        winterFlowThreadPoolAgent = winterFlowThreadPoolAgent2;
                        obj = WinterFlowRouterStructure;
                        String str32 = (String) obj;
                        if (winterFlowThreadPoolAgent.getKey().length() != 0) {
                        }
                        str = str2;
                        if (it.hasNext()) {
                            Objects.toString((JSONObject) winterFlowRendererNode.getValue());
                            JSONObject jSONObject = (JSONObject) winterFlowRendererNode.getValue();
                            WinterFlowBandwidthProtocol winterFlowBandwidthProtocol = (WinterFlowBandwidthProtocol) ((WinterFlowRendererNode) this.WinterFlowRouterRouter).getValue();
                            String jSONObject2 = jSONObject.toString();
                            jSONObject2.getClass();
                            winterFlowBandwidthProtocol.getClass();
                            str.getClass();
                            if (WinterFlowFrameworkStrategy.WinterFlowPackageIDE(jSONObject2).toString().length() == 0 || WinterFlowFrameworkStrategy.WinterFlowPackageIDE(str).toString().length() == 0) {
                                return "";
                            }
                            SecureRandom secureRandom = new SecureRandom();
                            byte[] bArr = new byte[16];
                            secureRandom.nextBytes(bArr);
                            byte[] bArr2 = new byte[12];
                            secureRandom.nextBytes(bArr2);
                            char[] charArray = str.toCharArray();
                            charArray.getClass();
                            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(new PBEKeySpec(charArray, bArr, 10000, 256)).getEncoded(), "AES");
                            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                            cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArr2));
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            byte[] bytes = jSONObject2.getBytes(charset);
                            bytes.getClass();
                            byte[] doFinal = cipher.doFinal(bytes);
                            doFinal.getClass();
                            byte[] bArr3 = new byte[doFinal.length + 28];
                            System.arraycopy(bArr, 0, bArr3, 0, 16);
                            System.arraycopy(bArr2, 0, bArr3, 16, 12);
                            System.arraycopy(doFinal, 0, bArr3, 28, doFinal.length);
                            String encodeToString = Base64.encodeToString(bArr3, 2);
                            encodeToString.getClass();
                            return encodeToString;
                        }
                    }
                }
            }
        }
        winterFlowBandwidthQueue = new WinterFlowBandwidthQueue(this, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowBandwidthQueue.WinterFlowTransactionAgent;
        i = winterFlowBandwidthQueue.WinterFlowThreadListener;
        if (i != 0) {
        }
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareStrategy
    public Object get() {
        switch (this.WinterFlowVariableVersionControl) {
            case 23:
                return new WinterFlowObjectPackage((Context) ((WinterFlowSoftwareStrategy) this.WinterFlowTransactionManagerStrategy).get(), ((WinterFlowSoftwareStrategy) this.WinterFlowUnitTestResponse).get(), ((WinterFlowAlgorithmDebug) this.WinterFlowRouterRouter).get(), 13);
            case 24:
            default:
                return new WinterFlowDataSourceWebsocket(new WinterFlowModuleFunction(1), new WinterFlowThreadPoolProcess(29), (WinterFlowDatabaseSchemaBatch) ((WinterFlowRequestEngine) this.WinterFlowTransactionManagerStrategy).get(), (WinterFlowJSONProxy) ((WinterFlowDeserializationNode) this.WinterFlowUnitTestResponse).get(), (WinterFlowStackProvider) ((WinterFlowStackProvider) this.WinterFlowRouterRouter).get());
            case 25:
                long WinterFlowRouterStructure = WinterFlowConfigurationException.WinterFlowRouterStructure();
                if (WinterFlowRouterStructure == WinterFlowNetworkMechanism.WinterFlowRouterStructure) {
                    return this.WinterFlowRouterRouter;
                }
                WinterFlowBackendConcurrency winterFlowBackendConcurrency = (WinterFlowBackendConcurrency) ((AtomicReference) this.WinterFlowTransactionManagerStrategy).get();
                int WinterFlowRouterStructure2 = winterFlowBackendConcurrency.WinterFlowRouterStructure(WinterFlowRouterStructure);
                if (WinterFlowRouterStructure2 >= 0) {
                    return winterFlowBackendConcurrency.WinterFlowCacheManagerAgent[WinterFlowRouterStructure2];
                }
                return null;
        }
    }

    public String toString() {
        switch (this.WinterFlowVariableVersionControl) {
            case 18:
                String str = (String) this.WinterFlowRouterRouter;
                String str2 = (String) this.WinterFlowUnitTestResponse;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.WinterFlowTransactionManagerStrategy;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ WinterFlowObjectPackage(Context context, Object obj, Object obj2, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowRouterRouter = context;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
    }

    public /* synthetic */ WinterFlowObjectPackage(Object obj, Object obj2, Object obj3, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
        this.WinterFlowRouterRouter = obj3;
    }

    public /* synthetic */ WinterFlowObjectPackage(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj3;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowRouterRouter = obj2;
    }

    public WinterFlowObjectPackage(ColdActivity coldActivity) {
        this.WinterFlowVariableVersionControl = 20;
        this.WinterFlowTransactionManagerStrategy = coldActivity;
        this.WinterFlowRouterRouter = coldActivity.WinterFlowResponseEngine(new WinterFlowExceptionBandwidth(5, this), new WinterFlowMapperProvider(1));
    }

    public WinterFlowObjectPackage(WinterFlowDatabaseIDE winterFlowDatabaseIDE) {
        this.WinterFlowVariableVersionControl = 19;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowFunctionEncryption(0);
        this.WinterFlowUnitTestResponse = new WinterFlowRequestEngine();
        this.WinterFlowRouterRouter = new WinterFlowRepositoryLayer(7, this, winterFlowDatabaseIDE);
    }

    public /* synthetic */ WinterFlowObjectPackage(int i, boolean z) {
        this.WinterFlowVariableVersionControl = i;
    }

    public WinterFlowObjectPackage(WinterFlowViewNode winterFlowViewNode, WinterFlowFrontendCache winterFlowFrontendCache, WinterFlowEventEmitterOrchestration winterFlowEventEmitterOrchestration, WinterFlowDataSourceWebsocket winterFlowDataSourceWebsocket) {
        this.WinterFlowVariableVersionControl = 27;
        this.WinterFlowTransactionManagerStrategy = winterFlowViewNode;
        this.WinterFlowUnitTestResponse = winterFlowFrontendCache;
        this.WinterFlowRouterRouter = winterFlowDataSourceWebsocket;
    }

    public WinterFlowObjectPackage(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.WinterFlowVariableVersionControl = 24;
        this.WinterFlowUnitTestResponse = new ArrayDeque();
        this.WinterFlowTransactionManagerStrategy = sharedPreferences;
        this.WinterFlowRouterRouter = scheduledThreadPoolExecutor;
    }

    public WinterFlowObjectPackage(WinterFlowCacheThread winterFlowCacheThread) {
        this.WinterFlowVariableVersionControl = 4;
        this.WinterFlowRouterRouter = winterFlowCacheThread;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowConfigurationModule(7, this);
    }

    public WinterFlowObjectPackage(Context context) {
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowRouterRouter = context.getApplicationContext();
        this.WinterFlowUnitTestResponse = new HashSet();
        this.WinterFlowTransactionManagerStrategy = new HashMap();
    }

    public WinterFlowObjectPackage(WinterFlowStackProvider winterFlowStackProvider, WinterFlowThreadPoolProcess winterFlowThreadPoolProcess, WinterFlowFunctionClass winterFlowFunctionClass, Set set) {
        this.WinterFlowVariableVersionControl = 10;
        this.WinterFlowTransactionManagerStrategy = winterFlowThreadPoolProcess;
        this.WinterFlowUnitTestResponse = winterFlowStackProvider;
        this.WinterFlowRouterRouter = winterFlowFunctionClass;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            WinterFlowVariableBandwidth(str, 0, str.length(), 1, true, new WinterFlowConfigurationModule(15, str));
        }
    }

    public WinterFlowObjectPackage(WinterFlowControllerInvoker winterFlowControllerInvoker, WinterFlowObjectPackage winterFlowObjectPackage) {
        this.WinterFlowVariableVersionControl = 29;
        this.WinterFlowTransactionManagerStrategy = winterFlowControllerInvoker;
        this.WinterFlowUnitTestResponse = winterFlowObjectPackage;
        this.WinterFlowRouterRouter = winterFlowControllerInvoker.getValue();
    }
}
