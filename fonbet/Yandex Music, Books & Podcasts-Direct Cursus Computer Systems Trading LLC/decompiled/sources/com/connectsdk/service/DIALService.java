package com.connectsdk.service;

import android.util.Log;
import com.connectsdk.core.AppInfo;
import com.connectsdk.core.Util;
import com.connectsdk.discovery.DiscoveryFilter;
import com.connectsdk.etc.helper.DeviceServiceReachability;
import com.connectsdk.etc.helper.HttpConnection;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.capability.CapabilityMethods;
import com.connectsdk.service.capability.Launcher;
import com.connectsdk.service.capability.listeners.ResponseListener;
import com.connectsdk.service.command.NotSupportedServiceSubscription;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.command.ServiceCommandError;
import com.connectsdk.service.command.ServiceSubscription;
import com.connectsdk.service.config.ServiceConfig;
import com.connectsdk.service.config.ServiceDescription;
import com.connectsdk.service.sessions.LaunchSession;
import defpackage.dfi;
import defpackage.xq0;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DIALService extends DeviceService implements Launcher {
    private static final String APP_NETFLIX = "Netflix";
    public static final String ID = "DIAL";
    private static List<String> registeredApps;

    static {
        ArrayList arrayList = new ArrayList();
        registeredApps = arrayList;
        arrayList.add("YouTube");
        registeredApps.add(APP_NETFLIX);
        registeredApps.add("Amazon");
    }

    public DIALService(ServiceDescription serviceDescription, ServiceConfig serviceConfig) {
        super(serviceDescription, serviceConfig);
    }

    public static DiscoveryFilter discoveryFilter() {
        return new DiscoveryFilter(ID, "urn:dial-multiscreen-org:service:dial:1");
    }

    private void getAppState(String str, final Launcher.AppStateListener appStateListener) {
        ResponseListener<Object> responseListener = new ResponseListener<Object>() { // from class: com.connectsdk.service.DIALService.4
            @Override // com.connectsdk.service.capability.listeners.ErrorListener
            public void onError(ServiceCommandError serviceCommandError) {
                Util.postError(appStateListener, serviceCommandError);
            }

            @Override // com.connectsdk.service.capability.listeners.ResponseListener
            public void onSuccess(Object obj) {
                String str2 = (String) obj;
                String[] strArr = {"<state>", "</state>"};
                int indexOf = str2.indexOf(strArr[0]);
                int indexOf2 = str2.indexOf(strArr[1]);
                if (indexOf == -1 || indexOf2 == -1) {
                    Util.postError(appStateListener, new ServiceCommandError(0, "Malformed response for app state", null));
                    return;
                }
                String substring = str2.substring(strArr[0].length() + indexOf, indexOf2);
                Util.postSuccess(appStateListener, new Launcher.AppState("running".equals(substring), "running".equals(substring)));
            }
        };
        ServiceCommand serviceCommand = new ServiceCommand(getCommandProcessor(), requestURL(str), null, responseListener);
        serviceCommand.setHttpMethod(ServiceCommand.TYPE_GET);
        serviceCommand.send();
    }

    private void hasApplication(String str, ResponseListener<Object> responseListener) {
        ServiceCommand serviceCommand = new ServiceCommand(getCommandProcessor(), requestURL(str), null, responseListener);
        serviceCommand.setHttpMethod(ServiceCommand.TYPE_GET);
        serviceCommand.send();
    }

    private void launchApp(String str, JSONObject jSONObject, Launcher.AppLaunchListener appLaunchListener) {
        if (str == null || str.length() == 0) {
            Util.postError(appLaunchListener, new ServiceCommandError(0, "Must pass a valid appId", null));
            return;
        }
        AppInfo appInfo = new AppInfo();
        appInfo.setName(str);
        appInfo.setId(str);
        launchAppWithInfo(appInfo, appLaunchListener);
    }

    private void probeForAppSupport() {
        if (this.serviceDescription.getApplicationURL() == null) {
            Log.d(Util.T, "unable to check for installed app; no service application url");
            return;
        }
        for (final String str : registeredApps) {
            hasApplication(str, new ResponseListener<Object>() { // from class: com.connectsdk.service.DIALService.7
                @Override // com.connectsdk.service.capability.listeners.ErrorListener
                public void onError(ServiceCommandError serviceCommandError) {
                }

                @Override // com.connectsdk.service.capability.listeners.ResponseListener
                public void onSuccess(Object obj) {
                    DIALService.this.addCapability("Launcher." + str);
                    DIALService.this.addCapability("Launcher." + str + ".Params");
                }
            });
        }
    }

    public static void registerApp(String str) {
        if (registeredApps.contains(str)) {
            return;
        }
        registeredApps.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String requestURL(String str) {
        ServiceDescription serviceDescription = this.serviceDescription;
        String applicationURL = serviceDescription != null ? serviceDescription.getApplicationURL() : null;
        if (applicationURL == null) {
            xq0.q("DIAL service application URL not available");
            return null;
        }
        StringBuilder k = dfi.k(applicationURL);
        if (!applicationURL.endsWith("/")) {
            k.append("/");
        }
        k.append(str);
        return k.toString();
    }

    @Override // com.connectsdk.service.capability.Launcher
    public void closeApp(final LaunchSession launchSession, final ResponseListener<Object> responseListener) {
        getAppState(launchSession.getAppName(), new Launcher.AppStateListener() { // from class: com.connectsdk.service.DIALService.2
            @Override // com.connectsdk.service.capability.listeners.ErrorListener
            public void onError(ServiceCommandError serviceCommandError) {
                Util.postError(responseListener, serviceCommandError);
            }

            @Override // com.connectsdk.service.capability.listeners.ResponseListener
            public void onSuccess(Launcher.AppState appState) {
                String sessionId;
                DIALService.this.requestURL(launchSession.getAppName());
                if (launchSession.getSessionId().contains("http://") || launchSession.getSessionId().contains("https://")) {
                    sessionId = launchSession.getSessionId();
                } else if (launchSession.getSessionId().endsWith("run") || launchSession.getSessionId().endsWith("run/")) {
                    sessionId = DIALService.this.requestURL(launchSession.getAppId() + "/run");
                } else {
                    sessionId = DIALService.this.requestURL(launchSession.getSessionId());
                }
                ServiceCommand serviceCommand = new ServiceCommand(launchSession.getService(), sessionId, null, responseListener);
                serviceCommand.setHttpMethod(ServiceCommand.TYPE_DEL);
                serviceCommand.send();
            }
        });
    }

    @Override // com.connectsdk.service.DeviceService
    public void closeLaunchSession(LaunchSession launchSession, ResponseListener<Object> responseListener) {
        if (launchSession.getSessionType() == LaunchSession.LaunchSessionType.App) {
            getLauncher().closeApp(launchSession, responseListener);
        } else {
            Util.postError(responseListener, new ServiceCommandError(-1, "Could not find a launcher associated with this LaunchSession", launchSession));
        }
    }

    @Override // com.connectsdk.service.DeviceService
    public void connect() {
        this.connected = true;
        reportConnected(true);
    }

    public HttpConnection createHttpConnection(String str) throws IOException {
        return HttpConnection.newInstance(URI.create(str));
    }

    @Override // com.connectsdk.service.DeviceService
    public void disconnect() {
        this.connected = false;
        DeviceServiceReachability deviceServiceReachability = this.mServiceReachability;
        if (deviceServiceReachability != null) {
            deviceServiceReachability.stop();
        }
        Util.runOnUI(new Runnable() { // from class: com.connectsdk.service.DIALService.5
            @Override // java.lang.Runnable
            public void run() {
                DIALService dIALService = DIALService.this;
                DeviceService.DeviceServiceListener deviceServiceListener = dIALService.listener;
                if (deviceServiceListener != null) {
                    deviceServiceListener.onDisconnect(dIALService, null);
                }
            }
        });
    }

    @Override // com.connectsdk.service.capability.Launcher
    public void getAppList(Launcher.AppListListener appListListener) {
        Util.postError(appListListener, ServiceCommandError.notSupported());
    }

    @Override // com.connectsdk.service.capability.Launcher
    public Launcher getLauncher() {
        return this;
    }

    @Override // com.connectsdk.service.capability.Launcher
    public CapabilityMethods.CapabilityPriorityLevel getLauncherCapabilityLevel() {
        return CapabilityMethods.CapabilityPriorityLevel.NORMAL;
    }

    @Override // com.connectsdk.service.DeviceService
    public CapabilityMethods.CapabilityPriorityLevel getPriorityLevel(Class<? extends CapabilityMethods> cls) {
        return cls.equals(Launcher.class) ? getLauncherCapabilityLevel() : CapabilityMethods.CapabilityPriorityLevel.NOT_SUPPORTED;
    }

    @Override // com.connectsdk.service.capability.Launcher
    public void getRunningApp(Launcher.AppInfoListener appInfoListener) {
        Util.postError(appInfoListener, ServiceCommandError.notSupported());
    }

    @Override // com.connectsdk.service.DeviceService
    public boolean isConnectable() {
        return true;
    }

    @Override // com.connectsdk.service.DeviceService
    public boolean isConnected() {
        return this.connected;
    }

    @Override // com.connectsdk.service.capability.Launcher
    public void launchAppStore(String str, Launcher.AppLaunchListener appLaunchListener) {
        Util.postError(appLaunchListener, ServiceCommandError.notSupported());
    }

    @Override // com.connectsdk.service.capability.Launcher
    public void launchAppWithInfo(final AppInfo appInfo, Object obj, final Launcher.AppLaunchListener appLaunchListener) {
        new ServiceCommand(getCommandProcessor(), requestURL(appInfo.getName()), obj, new ResponseListener<Object>() { // from class: com.connectsdk.service.DIALService.1
            @Override // com.connectsdk.service.capability.listeners.ErrorListener
            public void onError(ServiceCommandError serviceCommandError) {
                Util.postError(appLaunchListener, new ServiceCommandError(0, "Problem Launching app", null));
            }

            @Override // com.connectsdk.service.capability.listeners.ResponseListener
            public void onSuccess(Object obj2) {
                LaunchSession launchSessionForAppId = LaunchSession.launchSessionForAppId(appInfo.getId());
                launchSessionForAppId.setAppName(appInfo.getName());
                launchSessionForAppId.setSessionId((String) obj2);
                launchSessionForAppId.setService(DIALService.this);
                launchSessionForAppId.setSessionType(LaunchSession.LaunchSessionType.App);
                Util.postSuccess(appLaunchListener, launchSessionForAppId);
            }
        }).send();
    }

    @Override // com.connectsdk.service.capability.Launcher
    public void launchBrowser(String str, Launcher.AppLaunchListener appLaunchListener) {
        Util.postError(appLaunchListener, ServiceCommandError.notSupported());
    }

    @Override // com.connectsdk.service.capability.Launcher
    public void launchHulu(String str, Launcher.AppLaunchListener appLaunchListener) {
        Util.postError(appLaunchListener, ServiceCommandError.notSupported());
    }

    @Override // com.connectsdk.service.capability.Launcher
    public void launchNetflix(String str, Launcher.AppLaunchListener appLaunchListener) {
        JSONObject jSONObject;
        if (str != null && str.length() > 0) {
            try {
                jSONObject = new JSONObject(str) { // from class: com.connectsdk.service.DIALService.3
                    final /* synthetic */ String val$contentId;

                    {
                        this.val$contentId = str;
                        put("v", str);
                    }
                };
            } catch (JSONException e) {
                Log.e(Util.T, "Launch Netflix error", e);
            }
            AppInfo appInfo = new AppInfo(APP_NETFLIX);
            appInfo.setName(appInfo.getId());
            launchAppWithInfo(appInfo, jSONObject, appLaunchListener);
        }
        jSONObject = null;
        AppInfo appInfo2 = new AppInfo(APP_NETFLIX);
        appInfo2.setName(appInfo2.getId());
        launchAppWithInfo(appInfo2, jSONObject, appLaunchListener);
    }

    @Override // com.connectsdk.service.capability.Launcher
    public void launchYouTube(String str, float f, Launcher.AppLaunchListener appLaunchListener) {
        AppInfo appInfo = new AppInfo("YouTube");
        appInfo.setName(appInfo.getId());
        String str2 = null;
        if (str != null && str.length() > 0) {
            if (f < 0.0d) {
                if (appLaunchListener != null) {
                    appLaunchListener.onError(new ServiceCommandError(0, "Start time may not be negative", null));
                    return;
                }
                return;
            }
            str2 = String.format(Locale.US, "pairingCode=%s&v=%s&t=%.1f", UUID.randomUUID().toString(), str, Float.valueOf(f));
        }
        launchAppWithInfo(appInfo, str2, appLaunchListener);
    }

    @Override // com.connectsdk.service.DeviceService, com.connectsdk.etc.helper.DeviceServiceReachability.DeviceServiceReachabilityListener
    public void onLoseReachability(DeviceServiceReachability deviceServiceReachability) {
        if (this.connected) {
            disconnect();
        } else {
            this.mServiceReachability.stop();
        }
    }

    @Override // com.connectsdk.service.DeviceService, com.connectsdk.service.command.ServiceCommand.ServiceCommandProcessor
    public void sendCommand(final ServiceCommand<?> serviceCommand) {
        Util.runInBackground(new Runnable() { // from class: com.connectsdk.service.DIALService.6
            /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x0021, B:10:0x002d, B:11:0x004a, B:13:0x0055, B:18:0x0065, B:20:0x0073, B:22:0x0035, B:24:0x003c), top: B:2:0x0006 }] */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                int responseCode;
                ServiceCommand serviceCommand2 = serviceCommand;
                Object payload = serviceCommand2.getPayload();
                try {
                    HttpConnection createHttpConnection = DIALService.this.createHttpConnection(serviceCommand.getTarget());
                    if (payload == null && !serviceCommand2.getHttpMethod().equalsIgnoreCase(ServiceCommand.TYPE_POST)) {
                        if (serviceCommand2.getHttpMethod().equalsIgnoreCase(ServiceCommand.TYPE_DEL)) {
                            createHttpConnection.setMethod(HttpConnection.Method.DELETE);
                        }
                        createHttpConnection.execute();
                        responseCode = createHttpConnection.getResponseCode();
                        if (responseCode != 200) {
                            Util.postSuccess(serviceCommand2.getResponseListener(), createHttpConnection.getResponseString());
                            return;
                        } else if (responseCode == 201) {
                            Util.postSuccess(serviceCommand2.getResponseListener(), createHttpConnection.getResponseHeader("Location"));
                            return;
                        } else {
                            Util.postError(serviceCommand2.getResponseListener(), ServiceCommandError.getError(responseCode));
                            return;
                        }
                    }
                    createHttpConnection.setMethod(HttpConnection.Method.POST);
                    if (payload != null) {
                        createHttpConnection.setHeader(HttpMessage.CONTENT_TYPE_HEADER, "text/plain; charset=\"utf-8\"");
                        createHttpConnection.setPayload(payload.toString());
                    }
                    createHttpConnection.execute();
                    responseCode = createHttpConnection.getResponseCode();
                    if (responseCode != 200) {
                    }
                } catch (Exception e) {
                    Util.postError(serviceCommand2.getResponseListener(), new ServiceCommandError(0, e.getMessage(), null));
                }
            }
        });
    }

    @Override // com.connectsdk.service.DeviceService
    public void setServiceDescription(ServiceDescription serviceDescription) {
        List<String> list;
        super.setServiceDescription(serviceDescription);
        Map<String, List<String>> responseHeaders = getServiceDescription().getResponseHeaders();
        if (responseHeaders != null && (list = responseHeaders.get("Application-URL")) != null && list.size() > 0) {
            getServiceDescription().setApplicationURL(list.get(0));
        }
        probeForAppSupport();
    }

    @Override // com.connectsdk.service.capability.Launcher
    public ServiceSubscription<Launcher.AppStateListener> subscribeAppState(LaunchSession launchSession, Launcher.AppStateListener appStateListener) {
        return null;
    }

    @Override // com.connectsdk.service.capability.Launcher
    public ServiceSubscription<Launcher.AppInfoListener> subscribeRunningApp(Launcher.AppInfoListener appInfoListener) {
        Util.postError(appInfoListener, ServiceCommandError.notSupported());
        return new NotSupportedServiceSubscription();
    }

    @Override // com.connectsdk.service.DeviceService
    public void updateCapabilities() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Launcher.Application);
        arrayList.add(Launcher.Application_Params);
        arrayList.add(Launcher.Application_Close);
        arrayList.add(Launcher.AppState);
        setCapabilities(arrayList);
    }

    @Override // com.connectsdk.service.capability.Launcher
    public void launchAppWithInfo(AppInfo appInfo, Launcher.AppLaunchListener appLaunchListener) {
        launchAppWithInfo(appInfo, null, appLaunchListener);
    }

    @Override // com.connectsdk.service.capability.Launcher
    public void getAppState(LaunchSession launchSession, Launcher.AppStateListener appStateListener) {
    }

    @Override // com.connectsdk.service.capability.Launcher
    public void launchApp(String str, Launcher.AppLaunchListener appLaunchListener) {
        launchApp(str, null, appLaunchListener);
    }

    @Override // com.connectsdk.service.capability.Launcher
    public void launchYouTube(String str, Launcher.AppLaunchListener appLaunchListener) {
        launchYouTube(str, 0.0f, appLaunchListener);
    }
}
